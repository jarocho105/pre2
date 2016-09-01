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

import com.bydan.erp.facturacion.util.LibroContableConstantesFunciones;
import com.bydan.erp.facturacion.util.LibroContableParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.LibroContableParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.LibroContableBean;
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
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class LibroContableBeanSwingJInternalFrame extends LibroContableJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(LibroContableBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<LibroContable> librocontableValidator = new ClassValidator<LibroContable>(LibroContable.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public LibroContable librocontable;	
	public LibroContable librocontableAux;
	public LibroContable librocontableAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public LibroContable librocontableTotales;
	public Long idLibroContableActual;
	public Long iIdNuevoLibroContable=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosParametroFactuPrincipal=false;

	public Boolean getIsTienePermisosParametroFactuPrincipal() {
		return isTienePermisosParametroFactuPrincipal;
	}

	public void setIsTienePermisosParametroFactuPrincipal(Boolean isTienePermisosParametroFactuPrincipal) {
		this.isTienePermisosParametroFactuPrincipal= isTienePermisosParametroFactuPrincipal;
	}


	public Boolean isTienePermisosDefinicion=false;

	public Boolean getIsTienePermisosDefinicion() {
		return isTienePermisosDefinicion;
	}

	public void setIsTienePermisosDefinicion(Boolean isTienePermisosDefinicion) {
		this.isTienePermisosDefinicion= isTienePermisosDefinicion;
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
	
	public Boolean isPermisoTodoLibroContable;
	public Boolean isPermisoNuevoLibroContable;
	public Boolean isPermisoActualizarLibroContable;
	public Boolean isPermisoActualizarOriginalLibroContable;
	public Boolean isPermisoEliminarLibroContable;
	public Boolean isPermisoGuardarCambiosLibroContable;
	public Boolean isPermisoConsultaLibroContable;
	public Boolean isPermisoBusquedaLibroContable;
	public Boolean isPermisoReporteLibroContable;
	public Boolean isPermisoPaginacionMedioLibroContable;
	public Boolean isPermisoPaginacionAltoLibroContable;
	public Boolean isPermisoPaginacionTodoLibroContable;
	public Boolean isPermisoCopiarLibroContable;
	public Boolean isPermisoVerFormLibroContable;
	public Boolean isPermisoDuplicarLibroContable;
	public Boolean isPermisoOrdenLibroContable;
	
	
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
	
	public LibroContableParameterReturnGeneral librocontableReturnGeneral;
	public LibroContableParameterReturnGeneral librocontableParameterGeneral;
	
	

	public ParametroFactuPrincipalLogic parametrofactuprincipalLogic=null;

	public ParametroFactuPrincipalLogic getParametroFactuPrincipalLogic() {
		return parametrofactuprincipalLogic;
	}

	public void setParametroFactuPrincipalLogic(ParametroFactuPrincipalLogic parametrofactuprincipalLogic) {
		this.parametrofactuprincipalLogic = parametrofactuprincipalLogic;
	}


	public DefinicionLogic definicionLogic=null;

	public DefinicionLogic getDefinicionLogic() {
		return definicionLogic;
	}

	public void setDefinicionLogic(DefinicionLogic definicionLogic) {
		this.definicionLogic = definicionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoLibroContable=false;
	public Boolean esParaAccionDesdeFormularioLibroContable=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected LibroContableSessionBeanAdditional librocontableSessionBeanAdditional=null;
	
	public LibroContableSessionBeanAdditional getLibroContableSessionBeanAdditional() {
		return this.librocontableSessionBeanAdditional;
	}
	
	public void setLibroContableSessionBeanAdditional(LibroContableSessionBeanAdditional librocontableSessionBeanAdditional) {
		try {
			this.librocontableSessionBeanAdditional=librocontableSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected LibroContableBeanSwingJInternalFrameAdditional librocontableBeanSwingJInternalFrameAdditional=null;
	//public class LibroContableBeanSwingJInternalFrame
	
	public LibroContableBeanSwingJInternalFrameAdditional getLibroContableBeanSwingJInternalFrameAdditional() {
		return this.librocontableBeanSwingJInternalFrameAdditional;
	}
	
	public void setLibroContableBeanSwingJInternalFrameAdditional(LibroContableBeanSwingJInternalFrameAdditional librocontableBeanSwingJInternalFrameAdditional) {
		try {
			this.librocontableBeanSwingJInternalFrameAdditional=librocontableBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public LibroContableLogic librocontableLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public LibroContable librocontableBean;
	public LibroContableConstantesFunciones librocontableConstantesFunciones;
	//public LibroContableParameterReturnGeneral librocontableReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<LibroContable> librocontables;	
	//public List<LibroContable> librocontablesEliminados;
	//public List<LibroContable> librocontablesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoLibroContable=false;
	public Boolean isVisibilidadCeldaDuplicarLibroContable=true;
	public Boolean isVisibilidadCeldaCopiarLibroContable=true;
	public Boolean isVisibilidadCeldaVerFormLibroContable=true;
	public Boolean isVisibilidadCeldaOrdenLibroContable=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesLibroContable=false;
	public Boolean isVisibilidadCeldaModificarLibroContable=false;
	public Boolean isVisibilidadCeldaActualizarLibroContable=false;
	public Boolean isVisibilidadCeldaEliminarLibroContable=false;
	public Boolean isVisibilidadCeldaCancelarLibroContable=false;
	public Boolean isVisibilidadCeldaGuardarLibroContable=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosLibroContable=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoLibroContable() {
		return this.iIdNuevoLibroContable;
	}

	public void setiIdNuevoLibroContable(Long iIdNuevoLibroContable) {
		this.iIdNuevoLibroContable = iIdNuevoLibroContable;
	}
	
	public Long getidLibroContableActual() {
		return this.idLibroContableActual;
	}

	public void setidLibroContableActual(Long idLibroContableActual) {
		this.idLibroContableActual = idLibroContableActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public LibroContable getlibrocontable() {
		return this.librocontable;
	}

	public void setlibrocontable(LibroContable librocontable) {
		this.librocontable = librocontable;
	}
	
	public LibroContable getlibrocontableAux() {
		return this.librocontableAux;
	}

	public void setlibrocontableAux(LibroContable librocontableAux) {
		this.librocontableAux = librocontableAux;
	}				
	
	public LibroContable getlibrocontableAnterior() {
		return this.librocontableAnterior;
	}

	public void setlibrocontableAnterior(LibroContable librocontableAnterior) {
		this.librocontableAnterior = librocontableAnterior;
	}	
	
	public LibroContable getlibrocontableTotales() {
		return this.librocontableTotales;
	}

	public void setlibrocontableTotales(LibroContable librocontableTotales) {
		this.librocontableTotales = librocontableTotales;
	}	
	
	public LibroContable getlibrocontableBean() {
		return this.librocontableBean;
	}

	public void setlibrocontableBean(LibroContable librocontableBean) {
		this.librocontableBean = librocontableBean;
	}	
	
	public LibroContableParameterReturnGeneral getlibrocontableReturnGeneral() {
		return this.librocontableReturnGeneral;
	}

	public void setlibrocontableReturnGeneral(LibroContableParameterReturnGeneral librocontableReturnGeneral) {
		this.librocontableReturnGeneral = librocontableReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
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
	
	
	public LibroContableLogic getLibroContableLogic()	{		
		return librocontableLogic;
	}

	public void setLibroContableLogic(LibroContableLogic librocontableLogic) {
		this.librocontableLogic = librocontableLogic;
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
	
	public Boolean getIsEsNuevoLibroContable() {
		return isEsNuevoLibroContable;
	}

	public void setIsEsNuevoLibroContable(Boolean isEsNuevoLibroContable) {
		this.isEsNuevoLibroContable = isEsNuevoLibroContable;
	}

	public Boolean getEsParaAccionDesdeFormularioLibroContable() {
		return esParaAccionDesdeFormularioLibroContable;
	}
	
	public void setEsParaAccionDesdeFormularioLibroContable(Boolean esParaAccionDesdeFormularioLibroContable) {
		this.esParaAccionDesdeFormularioLibroContable = esParaAccionDesdeFormularioLibroContable;
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

			if(this.librocontableSessionBean==null) {
				this.librocontableSessionBean=new LibroContableSessionBean();
			}

			if(!this.librocontableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(librocontableSessionBean.getlidEmpresaActual());
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

					if(this.librocontable!=null) {
						this.librocontable.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormLibroContable!=null) {
						this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaLibroContable.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormLibroContable!=null) {
						if(this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable.getItemCount()>0) {
							this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaLibroContableGenerico)throws Exception
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
				jComboBoxid_empresaLibroContableGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaLibroContableGenerico!=null && jComboBoxid_empresaLibroContableGenerico.getItemCount()>0) {
					jComboBoxid_empresaLibroContableGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(LibroContable librocontable,JComboBox jComboBoxid_empresaLibroContableGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaLibroContableGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaLibroContableGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				librocontable.setid_empresa(empresaAux.getId());
				librocontable.setempresa_descripcion(LibroContableConstantesFunciones.getEmpresaDescripcion(empresaAux));
				librocontable.setEmpresa(empresaAux);			}
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

					if(!LibroContableJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLibroContable!=null) { 
							this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLibroContable!=null) { 
					}

					if(!LibroContableJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormLibroContable!=null) {
							this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormLibroContable!=null) {
							this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesLibroContable() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			LibroContableConstantesFunciones.refrescarForeignKeysDescripcionesLibroContable(this.librocontableLogic.getLibroContables());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			LibroContableConstantesFunciones.refrescarForeignKeysDescripcionesLibroContable(this.librocontables);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//librocontableLogic.setLibroContables(this.librocontables);
			librocontableLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public LibroContableParameterReturnGeneral getLibroContableParameterGeneral() {
		return this.librocontableParameterGeneral;
	}
	
	public void setLibroContableParameterGeneral(LibroContableParameterReturnGeneral librocontableParameterGeneral) {
		this.librocontableParameterGeneral = librocontableParameterGeneral;
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
	
	public Boolean getIsPermisoTodoLibroContable() {
		return isPermisoTodoLibroContable;
	}

	public void setIsPermisoTodoLibroContable(Boolean isPermisoTodoLibroContable) {
		this.isPermisoTodoLibroContable = isPermisoTodoLibroContable;
	}

	public Boolean getIsPermisoNuevoLibroContable() {
		return isPermisoNuevoLibroContable;
	}

	public void setIsPermisoNuevoLibroContable(Boolean isPermisoNuevoLibroContable) {
		this.isPermisoNuevoLibroContable = isPermisoNuevoLibroContable;
	}

	public Boolean getIsPermisoActualizarLibroContable() {
		return isPermisoActualizarLibroContable;
	}

	public void setIsPermisoActualizarLibroContable(Boolean isPermisoActualizarLibroContable) {
		this.isPermisoActualizarLibroContable = isPermisoActualizarLibroContable;
	}

	public Boolean getIsPermisoEliminarLibroContable() {
		return isPermisoEliminarLibroContable;
	}

	public void setIsPermisoEliminarLibroContable(Boolean isPermisoEliminarLibroContable) {
		this.isPermisoEliminarLibroContable = isPermisoEliminarLibroContable;
	}

	public Boolean getIsPermisoGuardarCambiosLibroContable() {
		return isPermisoGuardarCambiosLibroContable;
	}

	public void setIsPermisoGuardarCambiosLibroContable(Boolean isPermisoGuardarCambiosLibroContable) {
		this.isPermisoGuardarCambiosLibroContable = isPermisoGuardarCambiosLibroContable;
	}
	
	public Boolean getIsPermisoConsultaLibroContable() {
		return isPermisoConsultaLibroContable;
	}

	public void setIsPermisoConsultaLibroContable(Boolean isPermisoConsultaLibroContable) {
		this.isPermisoConsultaLibroContable = isPermisoConsultaLibroContable;
	}

	public Boolean getIsPermisoBusquedaLibroContable() {
		return isPermisoBusquedaLibroContable;
	}

	public void setIsPermisoBusquedaLibroContable(Boolean isPermisoBusquedaLibroContable) {
		this.isPermisoBusquedaLibroContable = isPermisoBusquedaLibroContable;
	}

	public Boolean getIsPermisoReporteLibroContable() {
		return isPermisoReporteLibroContable;
	}

	public void setIsPermisoReporteLibroContable(Boolean isPermisoReporteLibroContable) {
		this.isPermisoReporteLibroContable = isPermisoReporteLibroContable;
	}
	
	public Boolean getIsPermisoPaginacionMedioLibroContable() {
		return isPermisoPaginacionMedioLibroContable;
	}

	public void setIsPermisoPaginacionMedioLibroContable(Boolean isPermisoPaginacionMedioLibroContable) {
		this.isPermisoPaginacionMedioLibroContable = isPermisoPaginacionMedioLibroContable;
	}
	
	public Boolean getIsPermisoPaginacionTodoLibroContable() {
		return isPermisoPaginacionTodoLibroContable;
	}

	public void setIsPermisoPaginacionTodoLibroContable(Boolean isPermisoPaginacionTodoLibroContable) {
		this.isPermisoPaginacionTodoLibroContable = isPermisoPaginacionTodoLibroContable;
	}
	
	public Boolean getIsPermisoPaginacionAltoLibroContable() {
		return isPermisoPaginacionAltoLibroContable;
	}

	public void setIsPermisoPaginacionAltoLibroContable(Boolean isPermisoPaginacionAltoLibroContable) {
		this.isPermisoPaginacionAltoLibroContable = isPermisoPaginacionAltoLibroContable;
	}
	
	public Boolean getIsPermisoCopiarLibroContable() {
		return isPermisoCopiarLibroContable;
	}

	public void setIsPermisoCopiarLibroContable(Boolean isPermisoCopiarLibroContable) {
		this.isPermisoCopiarLibroContable = isPermisoCopiarLibroContable;
	}
	
	public Boolean getIsPermisoVerFormLibroContable() {
		return isPermisoVerFormLibroContable;
	}

	public void setIsPermisoVerFormLibroContable(Boolean isPermisoVerFormLibroContable) {
		this.isPermisoVerFormLibroContable = isPermisoVerFormLibroContable;
	}
	
	public Boolean getIsPermisoDuplicarLibroContable() {
		return isPermisoDuplicarLibroContable;
	}

	public void setIsPermisoDuplicarLibroContable(Boolean isPermisoDuplicarLibroContable) {
		this.isPermisoDuplicarLibroContable = isPermisoDuplicarLibroContable;
	}
	
	public Boolean getIsPermisoOrdenLibroContable() {
		return isPermisoOrdenLibroContable;
	}

	public void setIsPermisoOrdenLibroContable(Boolean isPermisoOrdenLibroContable) {
		this.isPermisoOrdenLibroContable = isPermisoOrdenLibroContable;
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
	
	public Boolean getIsVisibilidadCeldaNuevoLibroContable() {
		return isVisibilidadCeldaNuevoLibroContable;
	}

	public void setIsVisibilidadCeldaNuevoLibroContable(Boolean isVisibilidadCeldaNuevoLibroContable) {
		this.isVisibilidadCeldaNuevoLibroContable = isVisibilidadCeldaNuevoLibroContable;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarLibroContable() {
		return isVisibilidadCeldaDuplicarLibroContable;
	}

	public void setIsVisibilidadCeldaDuplicarLibroContable(Boolean isVisibilidadCeldaDuplicarLibroContable) {
		this.isVisibilidadCeldaDuplicarLibroContable = isVisibilidadCeldaDuplicarLibroContable;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarLibroContable() {
		return isVisibilidadCeldaCopiarLibroContable;
	}

	public void setIsVisibilidadCeldaCopiarLibroContable(Boolean isVisibilidadCeldaCopiarLibroContable) {
		this.isVisibilidadCeldaCopiarLibroContable = isVisibilidadCeldaCopiarLibroContable;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormLibroContable() {
		return isVisibilidadCeldaVerFormLibroContable;
	}

	public void setIsVisibilidadCeldaVerFormLibroContable(Boolean isVisibilidadCeldaVerFormLibroContable) {
		this.isVisibilidadCeldaVerFormLibroContable = isVisibilidadCeldaVerFormLibroContable;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenLibroContable() {
		return isVisibilidadCeldaOrdenLibroContable;
	}

	public void setIsVisibilidadCeldaOrdenLibroContable(Boolean isVisibilidadCeldaOrdenLibroContable) {
		this.isVisibilidadCeldaOrdenLibroContable = isVisibilidadCeldaOrdenLibroContable;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesLibroContable() {
		return isVisibilidadCeldaNuevoRelacionesLibroContable;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesLibroContable(Boolean isVisibilidadCeldaNuevoRelacionesLibroContable) {
		this.isVisibilidadCeldaNuevoRelacionesLibroContable = isVisibilidadCeldaNuevoRelacionesLibroContable;
	}
	
	public Boolean getIsVisibilidadCeldaModificarLibroContable() {
		return isVisibilidadCeldaModificarLibroContable;
	}

	public void setIsVisibilidadCeldaModificarLibroContable(Boolean isVisibilidadCeldaModificarLibroContable) {
		this.isVisibilidadCeldaModificarLibroContable = isVisibilidadCeldaModificarLibroContable;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarLibroContable() {
		return isVisibilidadCeldaActualizarLibroContable;
	}

	public void setIsVisibilidadCeldaActualizarLibroContable(Boolean isVisibilidadCeldaActualizarLibroContable) {
		this.isVisibilidadCeldaActualizarLibroContable = isVisibilidadCeldaActualizarLibroContable;
	}

	public Boolean getIsVisibilidadCeldaEliminarLibroContable() {
		return isVisibilidadCeldaEliminarLibroContable;
	}

	public void setIsVisibilidadCeldaEliminarLibroContable(Boolean isVisibilidadCeldaEliminarLibroContable) {
		this.isVisibilidadCeldaEliminarLibroContable = isVisibilidadCeldaEliminarLibroContable;
	}

	public Boolean getIsVisibilidadCeldaCancelarLibroContable() {
		return isVisibilidadCeldaCancelarLibroContable;
	}

	public void setIsVisibilidadCeldaCancelarLibroContable(Boolean isVisibilidadCeldaCancelarLibroContable) {
		this.isVisibilidadCeldaCancelarLibroContable = isVisibilidadCeldaCancelarLibroContable;
	}

	public Boolean getIsVisibilidadCeldaGuardarLibroContable() {
		return isVisibilidadCeldaGuardarLibroContable;
	}

	public void setIsVisibilidadCeldaGuardarLibroContable(Boolean isVisibilidadCeldaGuardarLibroContable) {
		this.isVisibilidadCeldaGuardarLibroContable = isVisibilidadCeldaGuardarLibroContable;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosLibroContable() {
		return isVisibilidadCeldaGuardarCambiosLibroContable;
	}

	public void setIsVisibilidadCeldaGuardarCambiosLibroContable(Boolean isVisibilidadCeldaGuardarCambiosLibroContable) {
		this.isVisibilidadCeldaGuardarCambiosLibroContable = isVisibilidadCeldaGuardarCambiosLibroContable;
	}
		
	public LibroContableSessionBean getlibrocontableSessionBean() {
		return this.librocontableSessionBean;
	}
	
	public void setlibrocontableSessionBean(LibroContableSessionBean librocontableSessionBean) {
		this.librocontableSessionBean=librocontableSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysLibroContable(LibroContable librocontable)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(librocontable,null);
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
	
	public void bugActualizarReferenciaActual(LibroContable librocontable,LibroContable librocontableAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalLibroContable(librocontable);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		librocontableAux.setId(librocontable.getId());
		librocontableAux.setVersionRow(librocontable.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessLibroContable();
		
			int intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(LibroContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualLibroContable(this.librocontable,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = librocontableValidator.getInvalidValues(this.librocontable);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			librocontableLogic.setDatosCliente(datosCliente);
			librocontableLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				librocontableAux=new  LibroContable();
				
				librocontableAux.setIsNew(true);
				librocontableAux.setIsChanged(true);
				
				librocontableAux.setLibroContableOriginal(this.librocontable);
				
				librocontableAux.setId(this.librocontable.getId());	
				librocontableAux.setVersionRow(this.librocontable.getVersionRow());	
				librocontableAux.setid_empresa(this.librocontable.getid_empresa());	
				librocontableAux.setcodigo(this.librocontable.getcodigo());	
				librocontableAux.setnombre(this.librocontable.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.librocontableSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.librocontableSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(librocontableAux,librocontableLogic.getLibroContables());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(librocontableAux,librocontables);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.librocontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.librocontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						librocontableLogic.saveLibroContables();//WithConnection
						//librocontableLogic.getSetVersionRowLibroContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.librocontable,librocontableAux);
					
					this.refrescarForeignKeysDescripcionesLibroContable();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.librocontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.getParametroFactuPrincipals().addAll(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalsEliminados);
							this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions().addAll(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipals.addAll(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalsEliminados);
							this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicions.addAll(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								librocontableLogic.saveLibroContableRelaciones(librocontableAux,this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.getParametroFactuPrincipals(),this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());//WithConnection
								//librocontableLogic.getSetVersionRowLibroContables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.librocontable,librocontableAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.setParametroFactuPrincipals(new ArrayList<ParametroFactuPrincipal>());
							this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(new ArrayList<Definicion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipals= new ArrayList<ParametroFactuPrincipal>();
							this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicions= new ArrayList<Definicion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.quitarFilaTotales();}
							librocontableAux.setParametroFactuPrincipals(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.getParametroFactuPrincipals());

							if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.quitarFilaTotales();}
							librocontableAux.setDefinicions(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.librocontableSessionBean.getEstaModoGuardarRelaciones() 
									|| this.librocontableSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(librocontableAux,librocontableLogic.getLibroContables());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(librocontableAux,librocontables);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.librocontable,librocontableAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				librocontableAux=new  LibroContable();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.librocontableSessionBean.getEsGuardarRelacionado() 
					|| (this.librocontableSessionBean.getEsGuardarRelacionado() && this.librocontable.getId()>=0)) {
						
					librocontableAux.setIsNew(false);
				}
				
				librocontableAux.setIsDeleted(false);
			
				librocontableAux.setId(this.librocontable.getId());	
				librocontableAux.setVersionRow(this.librocontable.getVersionRow());	
				librocontableAux.setid_empresa(this.librocontable.getid_empresa());	
				librocontableAux.setcodigo(this.librocontable.getcodigo());	
				librocontableAux.setnombre(this.librocontable.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(librocontableAux,librocontableLogic.getLibroContables());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(librocontableAux,librocontables);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.librocontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.librocontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						librocontableLogic.saveLibroContables();//WithConnection
						//librocontableLogic.getSetVersionRowLibroContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.librocontable,librocontableAux);
					
					this.refrescarForeignKeysDescripcionesLibroContable();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.librocontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.getParametroFactuPrincipals().addAll(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalsEliminados);
							this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions().addAll(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipals.addAll(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalsEliminados);
							this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicions.addAll(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								librocontableLogic.saveLibroContableRelaciones(librocontableAux,this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.getParametroFactuPrincipals(),this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());//WithConnection
								//librocontableLogic.getSetVersionRowLibroContables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.librocontable,librocontableAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.setParametroFactuPrincipals(new ArrayList<ParametroFactuPrincipal>());
							this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(new ArrayList<Definicion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipals= new ArrayList<ParametroFactuPrincipal>();
							this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicions= new ArrayList<Definicion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.quitarFilaTotales();}
							librocontableAux.setParametroFactuPrincipals(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.getParametroFactuPrincipals());

							if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.quitarFilaTotales();}
							librocontableAux.setDefinicions(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.librocontableSessionBean.getEstaModoGuardarRelaciones() 
									|| this.librocontableSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(librocontableAux,librocontableLogic.getLibroContables());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(librocontableAux,librocontables);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.librocontable,librocontableAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				librocontableAux=new  LibroContable();
				
				librocontableAux.setIsNew(false);
				librocontableAux.setIsChanged(false);
				
				librocontableAux.setIsDeleted(true);
				
				librocontableAux.setId(this.librocontable.getId());	
				librocontableAux.setVersionRow(this.librocontable.getVersionRow());	
				librocontableAux.setid_empresa(this.librocontable.getid_empresa());	
				librocontableAux.setcodigo(this.librocontable.getcodigo());	
				librocontableAux.setnombre(this.librocontable.getnombre());	
				
				if(this.librocontableSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.librocontableAux.getId()>=0) {	
						this.librocontablesEliminados.add(librocontableAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(librocontableAux,librocontableLogic.getLibroContables());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(librocontableAux,librocontables);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.librocontableSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.librocontableSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						librocontableLogic.saveLibroContables();//WithConnection
						//librocontableLogic.getSetVersionRowLibroContables();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.librocontableSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.getParametroFactuPrincipals().addAll(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalsEliminados);
							this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions().addAll(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipals.addAll(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalsEliminados);
							this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicions.addAll(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								librocontableLogic.saveLibroContableRelaciones(librocontableAux,this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.getParametroFactuPrincipals(),this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());//WithConnection
								//librocontableLogic.getSetVersionRowLibroContables();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.setParametroFactuPrincipals(new ArrayList<ParametroFactuPrincipal>());
							this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(new ArrayList<Definicion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipals= new ArrayList<ParametroFactuPrincipal>();
							this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicions= new ArrayList<Definicion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.quitarFilaTotales();}
							librocontableAux.setParametroFactuPrincipals(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.getParametroFactuPrincipals());

							if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.quitarFilaTotales();}
							librocontableAux.setDefinicions(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.librocontableSessionBean.getEstaModoGuardarRelaciones() 
								|| this.librocontableSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(librocontableAux,librocontableLogic.getLibroContables());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(librocontableAux,librocontables);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.getLibroContables().addAll(this.librocontablesEliminados);
					
					librocontableLogic.saveLibroContables();//WithConnection
					//librocontableLogic.getSetVersionRowLibroContables();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesLibroContable();
				
				this.librocontablesEliminados= new ArrayList<LibroContable>();		
			}
			
			if(this.librocontableSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.librocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Libro Contable GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Libro Contable",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.librocontable=librocontableAux;
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
      		//this.finishProcessLibroContable();
      	}
		
	}	
	
	public void actualizarRelaciones(LibroContable librocontableLocal) throws Exception {
		
		if(this.librocontableSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				librocontableLocal.setParametroFactuPrincipals(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.getParametroFactuPrincipals());
				librocontableLocal.setDefinicions(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
			
			} else {
			
				librocontableLocal.setParametroFactuPrincipals(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipals);
				librocontableLocal.setDefinicions(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(LibroContable librocontableLocal) throws Exception {	
		if(this.librocontableSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				librocontableLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarLibroContableActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = librocontableValidator.getInvalidValues(this.librocontable);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(LibroContable librocontable,List<LibroContable> librocontables) throws Exception {
		try	{		
			LibroContableConstantesFunciones.actualizarLista(librocontable,librocontables,this.librocontableSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(LibroContable librocontable,List<LibroContable> librocontables) throws Exception {
		try	{			
			LibroContableConstantesFunciones.actualizarSelectedLista(librocontable,librocontables);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<LibroContable> librocontablesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				librocontablesLocal=this.librocontableLogic.getLibroContables();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				librocontablesLocal=this.librocontables;
			}
			//ARCHITECTURE
		
			for(LibroContable librocontableLocal:librocontablesLocal) {
				if(this.permiteMantenimiento(librocontableLocal) && librocontableLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+LibroContableConstantesFunciones.getLibroContableLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(LibroContableConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLibroContable.jLabelid_empresaLibroContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LibroContableConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLibroContable.jLabelcodigoLibroContable,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LibroContableConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLibroContable.jLabelnombreLibroContable,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLibroContable.jLabelid_empresaLibroContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLibroContable.jLabelcodigoLibroContable,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLibroContable.jLabelnombreLibroContable,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ParametroFactuPrincipal")) {
			if(this.librocontable==null) {
				this.librocontable= new LibroContable();
			}

			if(this.librocontableSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLibroContable
				this.setVariablesFormularioToObjetoActualLibroContable(this.librocontable,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);

				this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.getparametrofactuprincipal().setLibroContable(this.librocontable);
			}

			return;
		}
		 else  if(sTipo.equals("Definicion")) {
			if(this.librocontable==null) {
				this.librocontable= new LibroContable();
			}

			if(this.librocontableSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoLibroContable
				this.setVariablesFormularioToObjetoActualLibroContable(this.librocontable,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);

				this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.getdefinicion().setLibroContable(this.librocontable);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoLibroContable--;	
		
		
		this.librocontableAux=new LibroContable();
		
		this.librocontableAux.setId(this.iIdNuevoLibroContable);
		this.librocontableAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.librocontableLogic.getLibroContables().add(this.librocontableAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.librocontables.add(this.librocontableAux);
		}
		//ARCHITECTURE
		
		this.librocontable=this.librocontableAux;
		
		if(LibroContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioLibroContable(this.librocontable);
			this.setVariablesObjetoActualToFormularioForeignKeyLibroContable(this.librocontable);
		}
				
		//this.setDefaultControlesLibroContable();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyLibroContable();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyLibroContable();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyLibroContable();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLibroContable(this.librocontableBean,this.librocontable,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(LibroContableConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.librocontableSessionBean.getConGuardarRelaciones()) {
			classes=LibroContableConstantesFunciones.getClassesRelationshipsOfLibroContable(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.librocontableReturnGeneral=librocontableLogic.procesarEventosLibroContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.librocontableLogic.getLibroContables(),this.librocontable,this.librocontableParameterGeneral,this.isEsNuevoLibroContable,classes);//this.librocontableLogic.getLibroContable()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanLibroContable(this.librocontableReturnGeneral,this.librocontableBean,false);
		
		if(this.librocontableReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyLibroContable(this.librocontableReturnGeneral.getLibroContable());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioLibroContable(this.librocontableReturnGeneral.getLibroContable());
		}
		
		if(this.librocontableReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioLibroContable(this.librocontableReturnGeneral.getLibroContable(),classes);//this.librocontableBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualLibroContable(this.librocontable,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyLibroContable();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyLibroContable();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LibroContableBeanSwingJInternalFrameAdditional.RecargarFormLibroContable(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingLibroContable(false);
						
			if(librocontableSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() && ParametroFactuPrincipalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroFactuPrincipalActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado() && DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDefinicionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(LibroContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLibroContable();
			}
			
			this.actualizarVisualTableDatosLibroContable();
			
			this.jTableDatosLibroContable.setRowSelectionInterval(this.getIndiceNuevoLibroContable(), this.getIndiceNuevoLibroContable());
			
			this.seleccionarFilaTablaLibroContableActual();
						
			this.actualizarEstadoCeldasBotonesLibroContable("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesLibroContable(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormLibroContable.jTextFieldcodigoLibroContable.setEnabled(isHabilitar && this.librocontableConstantesFunciones.activarcodigoLibroContable);
		this.jInternalFrameDetalleFormLibroContable.jTextAreanombreLibroContable.setEnabled(isHabilitar && this.librocontableConstantesFunciones.activarnombreLibroContable);	
		//
		this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable.setEnabled(isHabilitar && this.librocontableConstantesFunciones.activarid_empresaLibroContable);
	};
	
	public void setDefaultControlesLibroContable() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoLibroContable(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.librocontableSessionBean.setConGuardarRelaciones(true);			
			this.librocontableSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormLibroContable.jTabbedPaneRelacionesLibroContable.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.librocontableSessionBean.setConGuardarRelaciones(false);			
			this.librocontableSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormLibroContable.jTabbedPaneRelacionesLibroContable.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoLibroContable() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LibroContable librocontableAux:this.librocontableLogic.getLibroContables()) {
				if(librocontableAux.getId().equals(this.iIdNuevoLibroContable)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LibroContable librocontableAux:this.librocontables) {
				if(librocontableAux.getId().equals(this.iIdNuevoLibroContable)) {
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
	
	public int getIndiceActualLibroContable(LibroContable librocontable,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LibroContable librocontableAux:this.librocontableLogic.getLibroContables()) {
				if(librocontableAux.getId().equals(librocontable.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LibroContable librocontableAux:this.librocontables) {
				if(librocontableAux.getId().equals(librocontable.getId())) {
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
	
	public void setCamposBaseDesdeOriginalLibroContable(LibroContable librocontableOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LibroContable librocontableAux:this.librocontableLogic.getLibroContables()) {
				if(librocontableAux.getLibroContableOriginal().getId().equals(librocontableOriginal.getId())) {
					existe=true;
					librocontableOriginal.setId(librocontableAux.getId());
					librocontableOriginal.setVersionRow(librocontableAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LibroContable librocontableAux:this.librocontables) {
				if(librocontableAux.getLibroContableOriginal().getId().equals(librocontableOriginal.getId())) {
					existe=true;
					librocontableOriginal.setId(librocontableAux.getId());
					librocontableOriginal.setVersionRow(librocontableAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosLibroContable(Boolean esParaCancelar) throws Exception {
		librocontablesAux=new ArrayList<LibroContable>();
		librocontableAux=new LibroContable();
		
		if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(LibroContable librocontableAux:this.librocontableLogic.getLibroContables()) {
					if(librocontableAux.getId()<0) {
						librocontablesAux.add(librocontableAux);
					}		
				}
				this.iIdNuevoLibroContable=0L;
				this.librocontableLogic.getLibroContables().removeAll(librocontablesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LibroContable librocontableAux:this.librocontables) {
					if(librocontableAux.getId()<0) {
						librocontablesAux.add(librocontableAux);
					}		
				}
				this.iIdNuevoLibroContable=0L;
				this.librocontables.removeAll(librocontablesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoLibroContable 
					&& this.librocontableLogic.getLibroContables().size()>0
					) {
					librocontableAux=this.librocontableLogic.getLibroContables().get(this.librocontableLogic.getLibroContables().size() - 1);
				
					if(librocontableAux.getId()<0) {
						this.librocontableLogic.getLibroContables().remove(librocontableAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoLibroContable && this.librocontables.size()>0) {
					librocontableAux=this.librocontables.get(this.librocontables.size() - 1);
				
					if(librocontableAux.getId()<0) {
						this.librocontables.remove(librocontableAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoLibroContable(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(librocontable.getId()<0) {
				this.librocontableLogic.getLibroContables().remove(this.librocontable);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(librocontable.getId()<0) {
				this.librocontables.remove(this.librocontable);
			}
		}			
	}
	
	public void setEstadosInicialesLibroContable(List<LibroContable> librocontablesAux) throws Exception {
		LibroContableConstantesFunciones.setEstadosInicialesLibroContable(librocontablesAux);
	}
	
	public void setEstadosInicialesLibroContable(LibroContable librocontableAux) throws Exception {
		LibroContableConstantesFunciones.setEstadosInicialesLibroContable(librocontableAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarLibroContableActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesLibroContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarLibroContableActual()) {
				if(!this.isEsNuevoLibroContable) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesLibroContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoLibroContable=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarLibroContableActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Libro Contable ?", "MANTENIMIENTO DE Libro Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesLibroContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(LibroContable librocontable) throws Exception {
		LibroContableConstantesFunciones.seleccionarAsignar(this.librocontable,librocontable);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarLibroContable=this.isPermisoActualizarOriginalLibroContable;
			
			
			this.seleccionarAsignar(librocontable);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LibroContableConstantesFunciones.quitarEspaciosLibroContable(this.librocontable,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesLibroContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.librocontableSessionBean.setsFuncionBusquedaRapida(this.librocontableSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoLibroContable) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosLibroContable(esParaCancelar);				
				this.cancelarNuevoLibroContable(esParaCancelar);								
			}
			
			this.librocontable=new LibroContable();
			
			this.inicializarLibroContable();
			
			this.actualizarEstadoCeldasBotonesLibroContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarLibroContable() throws Exception {
		try {
			LibroContableConstantesFunciones.inicializarLibroContable(this.librocontable);
			
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
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.librocontableLogic.getLibroContables().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteLibroContables(String sAccionBusqueda,List<LibroContable> librocontablesParaReportes) throws Exception {
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
					sPathReporteFinal="LibroContable"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="LibroContableMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("LibroContableMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="LibroContable"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Libro Contables");		
		parameters.put("busquedapor", LibroContableConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ParametroFactuPrincipal.class));
			classes.add(new Classe(Definicion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					LibroContableLogic librocontableLogicAuxiliar=new LibroContableLogic();
					librocontableLogicAuxiliar.setDatosCliente(librocontableLogic.getDatosCliente());				
					librocontableLogicAuxiliar.setLibroContables(librocontablesParaReportes);
					
					librocontableLogicAuxiliar.cargarRelacionesLoteForeignKeyLibroContableWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					librocontablesParaReportes=librocontableLogicAuxiliar.getLibroContables();
					
					//librocontableLogic.getNewConnexionToDeep();
					
					//for (LibroContable librocontable:librocontablesParaReportes) {
					//	librocontableLogic.deepLoad(librocontable, false, DeepLoadType.INCLUDE, classes);
					//}						
					//librocontableLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//librocontableLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileParametroFactuPrincipal = AuxiliarReportes.class.getResourceAsStream("ParametroFactuPrincipalDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrofactuprincipal", reportFileParametroFactuPrincipal);

			InputStream reportFileDefinicion = AuxiliarReportes.class.getResourceAsStream("DefinicionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_definicion", reportFileDefinicion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceLibroContable=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			LibroContableConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			LibroContableConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceLibroContable=new JRBeanArrayDataSource(LibroContableJInternalFrame.TraerLibroContableBeans(librocontablesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceLibroContable);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+LibroContableConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+LibroContableConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(LibroContableBean.TraerLibroContableBeans(librocontablesParaReportes).toArray()));
							
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
				this.generarExcelReporteLibroContables(sAccionBusqueda,sTipoArchivoReporte,librocontablesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalLibroContables(sAccionBusqueda,sTipoArchivoReporte,librocontablesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoLibroContableActionPerformed(null);
					//this.generarExcelReporteLibroContables(sAccionBusqueda,sTipoArchivoReporte,librocontablesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalLibroContables(sAccionBusqueda,sTipoArchivoReporte,librocontablesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesLibroContables(sAccionBusqueda,sTipoArchivoReporte,librocontablesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesLibroContables(sAccionBusqueda,sTipoArchivoReporte,librocontablesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteLibroContables(String sAccionBusqueda,String sTipoArchivoReporte,List<LibroContable> librocontablesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"librocontable";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LibroContables");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLibroContable("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(LibroContable librocontable : librocontablesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			LibroContableConstantesFunciones.generarExcelReporteDataLibroContable("NORMAL",row,workbook,librocontable,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.librocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Libro Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderLibroContable(String sTipo,Row row,Workbook workbook) {
		
		LibroContableConstantesFunciones.generarExcelReporteHeaderLibroContable(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalLibroContables(String sAccionBusqueda,String sTipoArchivoReporte,List<LibroContable> librocontablesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"librocontable_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LibroContables");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(LibroContable librocontable : librocontablesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(LibroContableConstantesFunciones.getLibroContableDescripcion(librocontable));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LibroContableConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LibroContableConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(librocontable.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LibroContableConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LibroContableConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(librocontable.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LibroContableConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LibroContableConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(librocontable.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.librocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Libro Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesLibroContables(String sAccionBusqueda,String sTipoArchivoReporte,List<LibroContable> librocontablesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<LibroContable> librocontablesRespaldo=null;
		
		classes=LibroContableConstantesFunciones.getClassesRelationshipsOfLibroContable(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.librocontableLogic.setDatosCliente(this.datosCliente);
		this.librocontableLogic.setDatosDeep(this.datosDeep);
		this.librocontableLogic.setIsConDeep(true);
		
		librocontablesRespaldo=this.librocontableLogic.getLibroContables();
		
		this.librocontableLogic.setLibroContables(librocontablesParaReportes);	
		this.librocontableLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		librocontablesParaReportes=this.librocontableLogic.getLibroContables();
		this.librocontableLogic.setLibroContables(librocontablesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"librocontable_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LibroContables");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLibroContable("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(LibroContable librocontable : librocontablesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderLibroContable("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			LibroContableConstantesFunciones.generarExcelReporteDataLibroContable("NORMAL",row,workbook,librocontable,cellStyleDataAux);
		
			
			


				//ParametroFactuPrincipal
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO))) {

				if(librocontable.getParametroFactuPrincipals()!=null && librocontable.getParametroFactuPrincipals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroFactuPrincipalConstantesFunciones.generarExcelReporteHeaderParametroFactuPrincipal("RELACIONADO",row,workbook);
				}

				if(librocontable.getParametroFactuPrincipals()!=null) {
					i2=0;
					for(ParametroFactuPrincipal parametrofactuprincipal : librocontable.getParametroFactuPrincipals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroFactuPrincipalConstantesFunciones.generarExcelReporteDataParametroFactuPrincipal("RELACIONADO",row,workbook,parametrofactuprincipal,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Definicion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DefinicionConstantesFunciones.SCLASSWEBTITULO))) {

				if(librocontable.getDefinicions()!=null && librocontable.getDefinicions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DefinicionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DefinicionConstantesFunciones.generarExcelReporteHeaderDefinicion("RELACIONADO",row,workbook);
				}

				if(librocontable.getDefinicions()!=null) {
					i2=0;
					for(Definicion definicion : librocontable.getDefinicions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DefinicionConstantesFunciones.generarExcelReporteDataDefinicion("RELACIONADO",row,workbook,definicion,cellStyleDataAuxHijo);
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
		cell.setCellValue(LibroContableConstantesFunciones.getLibroContableDescripcion(librocontable));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.librocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Libro Contable",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoLibroContable.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLibroContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoLibroContable.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLibroContable.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessLibroContable() throws Exception {		
		this.startProcessLibroContable(true);
	}
	
	public void startProcessLibroContable(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasLibroContable ,this.jPanelParametrosReportesLibroContable, this.jScrollPanelDatosLibroContable,this.jPanelPaginacionLibroContable, this.jScrollPanelDatosEdicionLibroContable, this.jPanelAccionesLibroContable,this.jPanelAccionesFormularioLibroContable,this.jmenuBarLibroContable,this.jmenuBarDetalleLibroContable,this.jTtoolBarLibroContable,this.jTtoolBarDetalleLibroContable);		
		
		final JTabbedPane jTabbedPaneBusquedasLibroContable=this.jTabbedPaneBusquedasLibroContable; 
		
		final JPanel jPanelParametrosReportesLibroContable=this.jPanelParametrosReportesLibroContable;
		//final JScrollPane jScrollPanelDatosLibroContable=this.jScrollPanelDatosLibroContable;
		final JTable jTableDatosLibroContable=this.jTableDatosLibroContable;		
		final JPanel jPanelPaginacionLibroContable=this.jPanelPaginacionLibroContable;
		//final JScrollPane jScrollPanelDatosEdicionLibroContable=this.jScrollPanelDatosEdicionLibroContable;
		final JPanel jPanelAccionesLibroContable=this.jPanelAccionesLibroContable;
		
		JPanel jPanelCamposAuxiliarLibroContable=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarLibroContable=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) {
			jPanelCamposAuxiliarLibroContable=this.jInternalFrameDetalleFormLibroContable.jPanelCamposLibroContable;
			jPanelAccionesFormularioAuxiliarLibroContable=this.jInternalFrameDetalleFormLibroContable.jPanelAccionesFormularioLibroContable;
		}
		
		final JPanel jPanelCamposLibroContable=jPanelCamposAuxiliarLibroContable;
		final JPanel jPanelAccionesFormularioLibroContable=jPanelAccionesFormularioAuxiliarLibroContable;
		
		
		final JMenuBar jmenuBarLibroContable=this.jmenuBarLibroContable;
		final JToolBar jTtoolBarLibroContable=this.jTtoolBarLibroContable;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarLibroContable=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLibroContable=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) {
			jmenuBarDetalleAuxiliarLibroContable=this.jInternalFrameDetalleFormLibroContable.jmenuBarDetalleLibroContable;
			jTtoolBarDetalleAuxiliarLibroContable=this.jInternalFrameDetalleFormLibroContable.jTtoolBarDetalleLibroContable;
		}
		
		final JMenuBar jmenuBarDetalleLibroContable=jmenuBarDetalleAuxiliarLibroContable;
		final JToolBar jTtoolBarDetalleLibroContable=jTtoolBarDetalleAuxiliarLibroContable;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLibroContable;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLibroContable;
			processRunnable.jTableDatos=jTableDatosLibroContable;
			processRunnable.jPanelCampos=jPanelCamposLibroContable;
			processRunnable.jPanelPaginacion=jPanelPaginacionLibroContable;
			processRunnable.jPanelAcciones=jPanelAccionesLibroContable;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLibroContable;
			
			
			processRunnable.jmenuBar=jmenuBarLibroContable;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLibroContable;
			processRunnable.jTtoolBar=jTtoolBarLibroContable;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLibroContable;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLibroContable ,jPanelParametrosReportesLibroContable,jTableDatosLibroContable, /*jScrollPanelDatosLibroContable,*/jPanelCamposLibroContable,jPanelPaginacionLibroContable, /*jScrollPanelDatosEdicionLibroContable,*/ jPanelAccionesLibroContable,jPanelAccionesFormularioLibroContable,jmenuBarLibroContable,jmenuBarDetalleLibroContable,jTtoolBarLibroContable,jTtoolBarDetalleLibroContable);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLibroContable ,jPanelParametrosReportesLibroContable, jScrollPanelDatosLibroContable,jPanelPaginacionLibroContable, jScrollPanelDatosEdicionLibroContable, jPanelAccionesLibroContable,jPanelAccionesFormularioLibroContable,jmenuBarLibroContable,jmenuBarDetalleLibroContable,jTtoolBarLibroContable,jTtoolBarDetalleLibroContable);
						
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
	
	public void finishProcessLibroContable() {// throws Exception 
		this.finishProcessLibroContable(true);
	}
	
	public void finishProcessLibroContable(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasLibroContable ,this.jPanelParametrosReportesLibroContable, this.jScrollPanelDatosLibroContable,this.jPanelPaginacionLibroContable, this.jScrollPanelDatosEdicionLibroContable, this.jPanelAccionesLibroContable,this.jPanelAccionesFormularioLibroContable,this.jmenuBarLibroContable,this.jmenuBarDetalleLibroContable,this.jTtoolBarLibroContable,this.jTtoolBarDetalleLibroContable);		
		
		final JTabbedPane jTabbedPaneBusquedasLibroContable=this.jTabbedPaneBusquedasLibroContable; 
		
		final JPanel jPanelParametrosReportesLibroContable=this.jPanelParametrosReportesLibroContable;
		//final JScrollPane jScrollPanelDatosLibroContable=this.jScrollPanelDatosLibroContable;
		final JTable jTableDatosLibroContable=this.jTableDatosLibroContable;		
		final JPanel jPanelPaginacionLibroContable=this.jPanelPaginacionLibroContable;
		//final JScrollPane jScrollPanelDatosEdicionLibroContable=this.jScrollPanelDatosEdicionLibroContable;
		final JPanel jPanelAccionesLibroContable=this.jPanelAccionesLibroContable;
		
		JPanel jPanelCamposAuxiliarLibroContable=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarLibroContable=new JPanel();
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) {
			jPanelCamposAuxiliarLibroContable=this.jInternalFrameDetalleFormLibroContable.jPanelCamposLibroContable;
			jPanelAccionesFormularioAuxiliarLibroContable=this.jInternalFrameDetalleFormLibroContable.jPanelAccionesFormularioLibroContable;
		}
		
		final JPanel jPanelCamposLibroContable=jPanelCamposAuxiliarLibroContable;
		final JPanel jPanelAccionesFormularioLibroContable=jPanelAccionesFormularioAuxiliarLibroContable;
		
		
		final JMenuBar jmenuBarLibroContable=this.jmenuBarLibroContable;		
		final JToolBar jTtoolBarLibroContable=this.jTtoolBarLibroContable;
				
		JMenuBar jmenuBarDetalleAuxiliarLibroContable=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLibroContable=new JToolBar();
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) {
			jmenuBarDetalleAuxiliarLibroContable=this.jInternalFrameDetalleFormLibroContable.jmenuBarDetalleLibroContable;
			jTtoolBarDetalleAuxiliarLibroContable=this.jInternalFrameDetalleFormLibroContable.jTtoolBarDetalleLibroContable;		
		}
		
		final JMenuBar jmenuBarDetalleLibroContable=jmenuBarDetalleAuxiliarLibroContable;
		final JToolBar jTtoolBarDetalleLibroContable=jTtoolBarDetalleAuxiliarLibroContable;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLibroContable;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLibroContable;
			processRunnable.jTableDatos=jTableDatosLibroContable;
			processRunnable.jPanelCampos=jPanelCamposLibroContable;
			processRunnable.jPanelPaginacion=jPanelPaginacionLibroContable;
			processRunnable.jPanelAcciones=jPanelAccionesLibroContable;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLibroContable;
			
			
			processRunnable.jmenuBar=jmenuBarLibroContable;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLibroContable;
			processRunnable.jTtoolBar=jTtoolBarLibroContable;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLibroContable;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasLibroContable ,jPanelParametrosReportesLibroContable, jTableDatosLibroContable,/*jScrollPanelDatosLibroContable,*/jPanelCamposLibroContable,jPanelPaginacionLibroContable, /*jScrollPanelDatosEdicionLibroContable,*/ jPanelAccionesLibroContable,jPanelAccionesFormularioLibroContable,jmenuBarLibroContable,jmenuBarDetalleLibroContable,jTtoolBarLibroContable,jTtoolBarDetalleLibroContable));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesLibroContable(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarLibroContable(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuLibroContable(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarLibroContable(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarLibroContable,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleLibroContable,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuLibroContable(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarLibroContable,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleLibroContable,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.librocontableConstantesFunciones.getsFinalQueryLibroContable();
		String  finalQueryPaginacionTodos=this.librocontableConstantesFunciones.getsFinalQueryLibroContable();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=LibroContableConstantesFunciones.getArrayColumnasGlobalesNoLibroContable(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=LibroContableConstantesFunciones.getArrayColumnasGlobalesLibroContable(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,LibroContableConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.librocontablesEliminados= new ArrayList<LibroContable>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessLibroContable();
		
				///*LibroContableSessionBean*/this.librocontableSessionBean=new LibroContableSessionBean();
			
			if(this.librocontableSessionBean==null) {
				this.librocontableSessionBean=new LibroContableSessionBean();
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
					this.iNumeroPaginacion=LibroContableConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=LibroContableConstantesFunciones.getClassesForeignKeysOfLibroContable(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/librocontable."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			librocontablesAux= new ArrayList<LibroContable>();
			
				
			librocontableLogic.setDatosCliente(this.datosCliente);
			librocontableLogic.setDatosDeep(this.datosDeep);
			librocontableLogic.setIsConDeep(true);
			
			
			librocontableLogic.getLibroContableDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					librocontableLogic.getTodosLibroContables(finalQueryGlobal,pagination);
					
					//librocontableLogic.getTodosLibroContablesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(librocontableLogic.getLibroContables()==null|| librocontableLogic.getLibroContables().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							librocontablesAux= new ArrayList<LibroContable>();
							librocontablesAux.addAll(librocontableLogic.getLibroContables());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							librocontablesAux= new ArrayList<LibroContable>();
							librocontablesAux.addAll(librocontables);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							librocontableLogic.getTodosLibroContables(finalQueryGlobal+"",this.pagination);												
							
							//librocontableLogic.getTodosLibroContablesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteLibroContables("Todos",librocontableLogic.getLibroContables() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							librocontableLogic.setLibroContables(new ArrayList<LibroContable>());					
							librocontableLogic.getLibroContables().addAll(librocontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							librocontables=new ArrayList<LibroContable>();
							librocontables.addAll(librocontablesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idLibroContable=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idLibroContable=this.idActual;
				
				} else if(this.idLibroContableActual!=null && this.idLibroContableActual!=0L) {
					idLibroContable=idLibroContableActual;
				}
				
					
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndicePorId(idLibroContable);
				
				this.librocontables=new ArrayList<LibroContable>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					librocontableLogic.getEntity(idLibroContable);
					
					//librocontableLogic.getEntityWithConnection(idLibroContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					librocontableLogic.setLibroContables(new ArrayList<LibroContable>());
					librocontableLogic.getLibroContables().add(librocontableLogic.getLibroContable());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.librocontables=new ArrayList<LibroContable>();
					this.librocontables.add(librocontable);
				}
				
				if(librocontableLogic.getLibroContable()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					librocontableLogic.getLibroContablesBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=librocontableLogic.getLibroContables()==null||librocontableLogic.getLibroContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=librocontables==null|| librocontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						librocontablesAux=new ArrayList<LibroContable>();
						librocontablesAux.addAll(librocontableLogic.getLibroContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							librocontablesAux=new ArrayList<LibroContable>();
							librocontablesAux.addAll(librocontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							librocontableLogic.getLibroContablesBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLibroContables("BusquedaPorCodigo",librocontableLogic.getLibroContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLibroContables("BusquedaPorCodigo",librocontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						librocontableLogic.setLibroContables(new ArrayList<LibroContable>());
						librocontableLogic.getLibroContables().addAll(librocontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							librocontables=new ArrayList<LibroContable>();
							librocontables.addAll(librocontablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					librocontableLogic.getLibroContablesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=librocontableLogic.getLibroContables()==null||librocontableLogic.getLibroContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=librocontables==null|| librocontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						librocontablesAux=new ArrayList<LibroContable>();
						librocontablesAux.addAll(librocontableLogic.getLibroContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							librocontablesAux=new ArrayList<LibroContable>();
							librocontablesAux.addAll(librocontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							librocontableLogic.getLibroContablesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLibroContables("BusquedaPorNombre",librocontableLogic.getLibroContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLibroContables("BusquedaPorNombre",librocontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						librocontableLogic.setLibroContables(new ArrayList<LibroContable>());
						librocontableLogic.getLibroContables().addAll(librocontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							librocontables=new ArrayList<LibroContable>();
							librocontables.addAll(librocontablesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					librocontableLogic.getLibroContablesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=librocontableLogic.getLibroContables()==null||librocontableLogic.getLibroContables().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=librocontables==null|| librocontables.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						librocontablesAux=new ArrayList<LibroContable>();
						librocontablesAux.addAll(librocontableLogic.getLibroContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							librocontablesAux=new ArrayList<LibroContable>();
							librocontablesAux.addAll(librocontables);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							librocontableLogic.getLibroContablesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LibroContableConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLibroContables("FK_IdEmpresa",librocontableLogic.getLibroContables());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLibroContables("FK_IdEmpresa",librocontables);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						librocontableLogic.setLibroContables(new ArrayList<LibroContable>());
						librocontableLogic.getLibroContables().addAll(librocontablesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							librocontables=new ArrayList<LibroContable>();
							librocontables.addAll(librocontablesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesLibroContable();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessLibroContable();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=librocontableLogic.getLibroContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=librocontables.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=librocontableLogic.getLibroContables().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=librocontables.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(LibroContable librocontable) {
		Boolean permite=true;
		
		if(this.librocontable.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=LibroContableConstantesFunciones.getOrderByListaLibroContable();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=LibroContableConstantesFunciones.getOrderByListaLibroContable();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LibroContable librocontable:librocontableLogic.getLibroContables()) {
				if(librocontable.getsType().equals(Constantes2.S_TOTALES)) {
					librocontableTotales=librocontable;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LibroContable librocontable:this.librocontables) {
				if(librocontable.getsType().equals(Constantes2.S_TOTALES)) {
					librocontableTotales=librocontable;
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
			this.librocontableAux=new LibroContable();
			this.librocontableAux.setsType(Constantes2.S_TOTALES);
			this.librocontableAux.setIsNew(false);
			this.librocontableAux.setIsChanged(false);
			this.librocontableAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				LibroContableConstantesFunciones.TotalizarValoresFilaLibroContable(this.librocontableLogic.getLibroContables(),this.librocontableAux);
				
				this.librocontableLogic.getLibroContables().add(this.librocontableAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				LibroContableConstantesFunciones.TotalizarValoresFilaLibroContable(this.librocontables,this.librocontableAux);
				
				this.librocontables.add(this.librocontableAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		librocontableTotales=new LibroContable();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.librocontableLogic.getLibroContables().remove(librocontableTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.librocontables.remove(librocontableTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		librocontableTotales=new LibroContable();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LibroContable librocontable:librocontableLogic.getLibroContables()) {
				if(librocontable.getsType().equals(Constantes2.S_TOTALES)) {
					librocontableTotales=librocontable;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LibroContableConstantesFunciones.TotalizarValoresFilaLibroContable(this.librocontableLogic.getLibroContables(),librocontableTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LibroContable librocontable:this.librocontables) {
				if(librocontable.getsType().equals(Constantes2.S_TOTALES)) {
					librocontableTotales=librocontable;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LibroContableConstantesFunciones.TotalizarValoresFilaLibroContable(this.librocontables,librocontableTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getLibroContablesBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLibroContablesBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLibroContablesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getLibroContablesBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					librocontableLogic.getLibroContablesBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLibroContablesBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					librocontableLogic.getLibroContablesBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLibroContablesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					librocontableLogic.getLibroContablesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosLibroContable() {
		this.isPermisoTodoLibroContable=false;
		this.isPermisoNuevoLibroContable=false;
		this.isPermisoActualizarLibroContable=false;
		this.isPermisoActualizarOriginalLibroContable=false;
		this.isPermisoEliminarLibroContable=false;
		this.isPermisoGuardarCambiosLibroContable=false;
		this.isPermisoConsultaLibroContable=false;
		this.isPermisoBusquedaLibroContable=false;
		this.isPermisoReporteLibroContable=false;		
		this.isPermisoOrdenLibroContable=false;		
		this.isPermisoPaginacionMedioLibroContable=false;		
		this.isPermisoPaginacionAltoLibroContable=false;
		this.isPermisoPaginacionTodoLibroContable=false;
		this.isPermisoCopiarLibroContable=false;		
		this.isPermisoVerFormLibroContable=false;		
		this.isPermisoDuplicarLibroContable=false;		
		this.isPermisoOrdenLibroContable=false;		
	}
	
	public void setPermisosUsuarioLibroContable(Boolean isPermiso) {
		this.isPermisoTodoLibroContable=isPermiso;
		this.isPermisoNuevoLibroContable=isPermiso;
		this.isPermisoActualizarLibroContable=isPermiso;
		this.isPermisoActualizarOriginalLibroContable=isPermiso;
		this.isPermisoEliminarLibroContable=isPermiso;
		this.isPermisoGuardarCambiosLibroContable=isPermiso;
		this.isPermisoConsultaLibroContable=isPermiso;
		this.isPermisoBusquedaLibroContable=isPermiso;
		this.isPermisoReporteLibroContable=isPermiso;
		this.isPermisoOrdenLibroContable=isPermiso;		
		this.isPermisoPaginacionMedioLibroContable=isPermiso;		
		this.isPermisoPaginacionAltoLibroContable=isPermiso;		
		this.isPermisoPaginacionTodoLibroContable=isPermiso;		
		this.isPermisoCopiarLibroContable=isPermiso;		
		this.isPermisoVerFormLibroContable=isPermiso;		
		this.isPermisoDuplicarLibroContable=isPermiso;
		this.isPermisoOrdenLibroContable=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioLibroContable(Boolean isPermiso) {
		//this.isPermisoTodoLibroContable=isPermiso;
		this.isPermisoNuevoLibroContable=isPermiso;
		this.isPermisoActualizarLibroContable=isPermiso;
		this.isPermisoActualizarOriginalLibroContable=isPermiso;
		this.isPermisoEliminarLibroContable=isPermiso;
		this.isPermisoGuardarCambiosLibroContable=isPermiso;
		//this.isPermisoConsultaLibroContable=isPermiso;
		//this.isPermisoBusquedaLibroContable=isPermiso;
		//this.isPermisoReporteLibroContable=isPermiso;
		//this.isPermisoOrdenLibroContable=isPermiso;		
		//this.isPermisoPaginacionMedioLibroContable=isPermiso;		
		//this.isPermisoPaginacionAltoLibroContable=isPermiso;		
		//this.isPermisoPaginacionTodoLibroContable=isPermiso;		
		//this.isPermisoCopiarLibroContable=isPermiso;		
		//this.isPermisoDuplicarLibroContable=isPermiso;
		//this.isPermisoOrdenLibroContable=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioLibroContableClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ParametroFactuPrincipalConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DefinicionConstantesFunciones.SNOMBREOPCION);
		
		if(LibroContableJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosParametroFactuPrincipal=false;
		this.isTienePermisosParametroFactuPrincipal=this.verificarGetPermisosUsuarioOpcionLibroContableClaseRelacionada(this.opcionsRelacionadas,ParametroFactuPrincipalConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDefinicion=false;
		this.isTienePermisosDefinicion=this.verificarGetPermisosUsuarioOpcionLibroContableClaseRelacionada(this.opcionsRelacionadas,DefinicionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebLibroContable(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioLibroContableClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosParametroFactuPrincipal=conPermiso;
		this.isTienePermisosDefinicion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioLibroContableClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionLibroContableClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioLibroContableClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosParametroFactuPrincipal && this.jInternalFrameDetalleFormLibroContable!=null && this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLibroContable.jTabbedPaneRelacionesLibroContable.remove(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDefinicion && this.jInternalFrameDetalleFormLibroContable!=null && this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLibroContable.jTabbedPaneRelacionesLibroContable.remove(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioLibroContable() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(LibroContableJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.librocontableSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, LibroContableConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoLibroContable=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarLibroContable=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalLibroContable=this.isPermisoActualizarLibroContable;
			this.isPermisoEliminarLibroContable=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosLibroContable=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaLibroContable=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaLibroContable=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoLibroContable=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteLibroContable=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLibroContable=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioLibroContable=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoLibroContable=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoLibroContable=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarLibroContable=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormLibroContable=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarLibroContable=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLibroContable=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.librocontableSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosLibroContable.setToolTipText(this.jTableDatosLibroContable.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioLibroContable(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioLibroContable(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(LibroContableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(LibroContableJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioLibroContable() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosParametroFactuPrincipal && this.librocontableConstantesFunciones.mostrarParametroFactuPrincipalLibroContable && !LibroContableConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Principal ");
			reporte.setsDescripcion("Parametro Principal ");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDefinicion && this.librocontableConstantesFunciones.mostrarDefinicionLibroContable && !LibroContableConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Definicion");
			reporte.setsDescripcion("Definicion");
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
	public void inicializarCombosForeignKeyLibroContableListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyLibroContableListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(LibroContableJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyLibroContableListas(false);
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
	
	public void cargarCombosLoteForeignKeyLibroContableListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			LibroContableParameterReturnGeneral librocontableReturnGeneral=new LibroContableParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.librocontableConstantesFunciones.cargarid_empresaLibroContable)
					 || (this.esRecargarFks && this.librocontableConstantesFunciones.cargarid_empresaLibroContable)) {

					if(!this.librocontableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+librocontableSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				librocontableReturnGeneral=librocontableLogic.cargarCombosLoteForeignKeyLibroContable(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=librocontableReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyLibroContable()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.librocontableSessionBean==null) {
				this.librocontableSessionBean=new LibroContableSessionBean();
			}

			if(!this.librocontableSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyLibroContable()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyLibroContable(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyLibroContable()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyLibroContable();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyLibroContable(LibroContable librocontable)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyLibroContable(LibroContable librocontable,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyLibroContable()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyLibroContable()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyLibroContable()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyLibroContable()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroLibroContable()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyLibroContable()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyLibroContable(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyLibroContable()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable!=null && this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable.getItemCount()>0) {
				this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public LibroContableBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public LibroContableBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public LibroContableBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.librocontableSessionBean=new LibroContableSessionBean(); 
		this.librocontableConstantesFunciones=new LibroContableConstantesFunciones(); 
		this.librocontableBean=new LibroContable();//(this.librocontableConstantesFunciones); 		
		this.librocontableReturnGeneral=new LibroContableParameterReturnGeneral(); 
		
		this.librocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.librocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public LibroContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public LibroContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public LibroContableBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessLibroContable(true);
			
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
			
			this.librocontableConstantesFunciones=new LibroContableConstantesFunciones(); 
			this.librocontableBean=new LibroContable();//this.librocontableConstantesFunciones); 			
			this.librocontableReturnGeneral=new LibroContableParameterReturnGeneral(); 
		
			LibroContableBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Libro Contable Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.librocontable=new LibroContable();
			this.librocontables = new ArrayList<LibroContable>();
			this.librocontablesAux = new ArrayList<LibroContable>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic=new LibroContableLogic();
				this.librocontableLogic.getNewConnexionToDeep("");
			}
			
			//this.librocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.librocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormLibroContable);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoLibroContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLibroContable);	
					}
					
					if(this.jInternalFrameImportacionLibroContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLibroContable);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByLibroContable!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByLibroContable);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormLibroContable!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormLibroContable);
				this.jInternalFrameDetalleFormLibroContable.setVisible(false);
				this.jInternalFrameDetalleFormLibroContable.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoLibroContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLibroContable);
					this.jInternalFrameReporteDinamicoLibroContable.setVisible(false);
					this.jInternalFrameReporteDinamicoLibroContable.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionLibroContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionLibroContable);
					this.jInternalFrameImportacionLibroContable.setVisible(false);
					this.jInternalFrameImportacionLibroContable.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByLibroContable!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByLibroContable);
					this.jInternalFrameOrderByLibroContable.setVisible(false);
					this.jInternalFrameOrderByLibroContable.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idLibroContableActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=LibroContableConstantesFunciones.INUMEROPAGINACION;
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
			
			this.librocontableReturnGeneral=new LibroContableParameterReturnGeneral();
			
			this.librocontableParameterGeneral=new LibroContableParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.librocontableLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
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
			
			if(LibroContableJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.librocontableSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ParametroFactuPrincipalConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DefinicionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LibroContableConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.librocontableSessionBean.getEsGuardarRelacionado(),this.librocontableSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LibroContableConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.librocontableSessionBean.getEsGuardarRelacionado(),this.librocontableSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoLibroContable=false;
			this.isVisibilidadCeldaDuplicarLibroContable=true;
			this.isVisibilidadCeldaCopiarLibroContable=true;
			this.isVisibilidadCeldaVerFormLibroContable=true;
			this.isVisibilidadCeldaOrdenLibroContable=true;
			this.isVisibilidadCeldaNuevoRelacionesLibroContable=false;
			this.isVisibilidadCeldaModificarLibroContable=false;
			this.isVisibilidadCeldaActualizarLibroContable=false;
			this.isVisibilidadCeldaEliminarLibroContable=false;
			this.isVisibilidadCeldaCancelarLibroContable=false;
			this.isVisibilidadCeldaGuardarLibroContable=false;
			this.isVisibilidadCeldaGuardarCambiosLibroContable=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesLibroContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosLibroContable();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioLibroContable(false);
			
			this.setPermisosUsuarioLibroContable();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.librocontableSessionBean.getEsGuardarRelacionado() 
				|| (this.librocontableSessionBean.getEsGuardarRelacionado() && this.librocontableSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioLibroContableClasesRelacionadas();
			}
			
			if(this.librocontableSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioLibroContableClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!LibroContableJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosLibroContable();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualLibroContable();
			}
			
			if(!this.isPermisoBusquedaLibroContable) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasLibroContable.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioLibroContable,this.isPermisoPaginacionMedioLibroContable,this.isPermisoPaginacionTodoLibroContable);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(LibroContableConstantesFunciones.getTiposSeleccionarLibroContable());
				
				this.tiposColumnasSelect=LibroContableConstantesFunciones.getTiposSeleccionarLibroContable(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectLibroContable();				
				//this.tiposRelacionesSelect=LibroContableConstantesFunciones.getTiposRelacionesLibroContable(true);
				
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
			//if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioLibroContable();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioLibroContable(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioLibroContable(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesLibroContable() ;
			
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
			
			
			this.parametrofactuprincipalLogic=new ParametroFactuPrincipalLogic();
			this.definicionLogic=new DefinicionLogic(); 
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
				librocontableImplementable= (LibroContableImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LibroContableConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				librocontableImplementableHome= (LibroContableImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LibroContableConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.librocontables= new ArrayList<LibroContable>();
			this.librocontablesEliminados= new ArrayList<LibroContable>();
						
			this.isEsNuevoLibroContable=false;
			this.esParaAccionDesdeFormularioLibroContable=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyLibroContable(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroLibroContable();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			LibroContableBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=LibroContableConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesLibroContable("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingLibroContable(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormLibroContable!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioLibroContable();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioLibroContable();
			}
			
			LibroContableBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasLibroContable.getTabCount(); i++) {
					this.jTabbedPaneBusquedasLibroContable.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasLibroContable.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessLibroContable(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga LibroContable: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectLibroContable() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DefinicionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DefinicionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesLibroContable")) {
				iIndex=this.jInternalFrameDetalleFormLibroContable.jTabbedPaneRelacionesLibroContable.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormLibroContable.jTabbedPaneRelacionesLibroContable.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();	
				
				

				if(sTitle.equals("Definiciones")) {
					if(!DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLibroContable();

						this.cargarParteTabPanelRelacionadaDefinicion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Principal s")) {
					if(!ParametroFactuPrincipalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessLibroContable();

						this.cargarParteTabPanelRelacionadaParametroFactuPrincipal(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessLibroContable();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDefinicion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLibroContable.cargarSessionConBeanSwingJInternalFrameDefinicion(false,true,iIndex);
		this.jButtonDefinicionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDefinicion();

		//this.jTabbedPaneRelacionesLibroContable.updateUI();
		//this.jTabbedPaneRelacionesLibroContable.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLibroContable.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroFactuPrincipal(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormLibroContable.cargarSessionConBeanSwingJInternalFrameParametroFactuPrincipal(false,true,iIndex);
		this.jButtonParametroFactuPrincipalActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroFactuPrincipal();

		//this.jTabbedPaneRelacionesLibroContable.updateUI();
		//this.jTabbedPaneRelacionesLibroContable.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesLibroContable.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ParametroFactuPrincipal")) {
				int row=this.jTableDatosLibroContable.getSelectedRow();
				jButtonParametroFactuPrincipalActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Definicion")) {
				int row=this.jTableDatosLibroContable.getSelectedRow();
				jButtonDefinicionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Parametro Principal ")) {

					if(this.isTienePermisosParametroFactuPrincipal && this.librocontableConstantesFunciones.mostrarParametroFactuPrincipalLibroContable && !LibroContableConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Principal s"+"("+ParametroFactuPrincipalConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Principal s");

						if(librocontableConstantesFunciones.resaltarParametroFactuPrincipalLibroContable!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(librocontableConstantesFunciones.resaltarParametroFactuPrincipalLibroContable);
						}

						jmenuItem.setEnabled(this.librocontableConstantesFunciones.activarParametroFactuPrincipalLibroContable);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroFactuPrincipal"));

						

						this.jInternalFrameDetalleFormLibroContable.jmenuDetalleLibroContable.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Definicion")) {

					if(this.isTienePermisosDefinicion && this.librocontableConstantesFunciones.mostrarDefinicionLibroContable && !LibroContableConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Definiciones"+"("+DefinicionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Definiciones");

						if(librocontableConstantesFunciones.resaltarDefinicionLibroContable!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(librocontableConstantesFunciones.resaltarDefinicionLibroContable);
						}

						jmenuItem.setEnabled(this.librocontableConstantesFunciones.activarDefinicionLibroContable);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Definicion"));

						

						this.jInternalFrameDetalleFormLibroContable.jmenuDetalleLibroContable.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyLibroContable(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyLibroContable(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyLibroContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyLibroContableListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyLibroContable();
		
		this.cargarCombosFrameForeignKeyLibroContable();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyLibroContable();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyLibroContable();
		}
	}
	
	
	
	public void jButtonNuevoLibroContableActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.librocontableSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormLibroContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			
			
			if(jTableDatosLibroContable.getRowCount()>=1) {
				jTableDatosLibroContable.removeRowSelectionInterval(0, jTableDatosLibroContable.getRowCount()-1);						
			}
			
			this.isEsNuevoLibroContable=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoLibroContable(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesLibroContable(true);			
			//this.librocontable=new LibroContable();
			//this.librocontable.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLibroContable(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLibroContable() ;
			
			if(LibroContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLibroContable(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.librocontable);	
			this.actualizarInformacion("INFO_PADRE",false,this.librocontable);				
			
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			
			if(this.librocontableSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar LibroContable: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarLibroContableActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<LibroContable> librocontablesSeleccionados=new ArrayList<LibroContable>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosLibroContable.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosLibroContable.getSelectedRows().length;			
			}
			
			librocontablesSeleccionados=this.getLibroContablesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoLibroContable--;			
				//LibroContable librocontableAux= new LibroContable();			
				//librocontableAux.setId(this.iIdNuevoLibroContable);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//LibroContable librocontableOrigen=new LibroContable();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(LibroContable librocontableOrigen : librocontablesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							librocontableOrigen =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							librocontableOrigen =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaLibroContable();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.librocontable.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosLibroContable(librocontableOrigen,this.librocontable,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.librocontableLogic.getLibroContables().add(this.librocontableAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.librocontables.add(this.librocontableAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaLibroContable(false);
				
				this.jTableDatosLibroContable.setRowSelectionInterval(this.getIndiceNuevoLibroContable(), this.getIndiceNuevoLibroContable());
				
				int iLastRow =  this.jTableDatosLibroContable.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLibroContable.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLibroContable.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLibroContable(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarLibroContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<LibroContable> librocontablesSeleccionados=new ArrayList<LibroContable>();									
		
			LibroContable librocontableOrigen=new LibroContable();
			LibroContable librocontableDestino=new LibroContable();
				
			librocontablesSeleccionados=this.getLibroContablesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosLibroContable.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || librocontablesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosLibroContable.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						librocontableOrigen =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						librocontableOrigen =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						librocontableDestino =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						librocontableDestino =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				librocontableOrigen =librocontablesSeleccionados.get(0);
				librocontableDestino =librocontablesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosLibroContable(librocontableOrigen,librocontableDestino,true,false);
				
				librocontableDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(librocontableDestino,librocontableLogic.getLibroContables());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(librocontableDestino,librocontables);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaLibroContable(false);
				
				//this.jTableDatosLibroContable.setRowSelectionInterval(this.getIndiceNuevoLibroContable(), this.getIndiceNuevoLibroContable());
				
				int iLastRow =  this.jTableDatosLibroContable.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLibroContable.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLibroContable.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLibroContable(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormLibroContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLibroContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormLibroContable.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarLibroContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesLibroContable.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasLibroContable.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesLibroContable.setVisible(!isVisible);
			this.jPanelPaginacionLibroContable.setVisible(!isVisible);
			this.jPanelAccionesLibroContable.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarLibroContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameLibroContable();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoLibroContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoLibroContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionLibroContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionLibroContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByLibroContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByLibroContable();
			
			this.abrirFrameOrderByLibroContable();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByLibroContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByLibroContable();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleLibroContable(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormLibroContable);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormLibroContable.isMaximum()) {
					this.jInternalFrameDetalleFormLibroContable.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormLibroContable.setSize(this.jInternalFrameDetalleFormLibroContable.iWidthFormulario,this.jInternalFrameDetalleFormLibroContable.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormLibroContable.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormLibroContable.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormLibroContable.isMaximum()) {
						this.jInternalFrameDetalleFormLibroContable.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormLibroContable.jContentPaneDetalleLibroContable.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormLibroContable.jTabbedPaneRelacionesLibroContable.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormLibroContable.jContentPaneDetalleLibroContable.getWidth(),LibroContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLibroContable.jTabbedPaneRelacionesLibroContable.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormLibroContable.jContentPaneDetalleLibroContable.getWidth(),LibroContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLibroContable.jTabbedPaneRelacionesLibroContable.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormLibroContable.jContentPaneDetalleLibroContable.getWidth(),LibroContableConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDefinicion();
					}

					if(ParametroFactuPrincipalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroFactuPrincipal();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormLibroContable.setVisible(true);
	        this.jInternalFrameDetalleFormLibroContable.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByLibroContable() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByLibroContable==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByLibroContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLibroContable,false,this);
				} else {
					this.jInternalFrameOrderByLibroContable=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLibroContable,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByLibroContable);
				this.jInternalFrameOrderByLibroContable.setVisible(false);
				this.jInternalFrameOrderByLibroContable.setSelected(false);
				
				this.jInternalFrameOrderByLibroContable.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLibroContable"));
				
				this.inicializarActualizarBindingTablaOrderByLibroContable();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionLibroContable() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionLibroContable==null) {
				
				this.jInternalFrameImportacionLibroContable=new ImportacionJInternalFrame(LibroContableConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLibroContable);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionLibroContable);
				this.jInternalFrameImportacionLibroContable.setVisible(false);
				this.jInternalFrameImportacionLibroContable.setSelected(false);


				this.jInternalFrameImportacionLibroContable.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLibroContable"));
				this.jInternalFrameImportacionLibroContable.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLibroContable"));
				this.jInternalFrameImportacionLibroContable.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLibroContable"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoLibroContable() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoLibroContable==null) {
				this.jInternalFrameReporteDinamicoLibroContable=new ReporteDinamicoJInternalFrame(LibroContableConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLibroContable);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLibroContable);
				this.jInternalFrameReporteDinamicoLibroContable.setVisible(false);
				this.jInternalFrameReporteDinamicoLibroContable.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoLibroContable.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLibroContable"));
				this.jInternalFrameReporteDinamicoLibroContable.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLibroContable"));
				this.jInternalFrameReporteDinamicoLibroContable.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLibroContable"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLibroContable();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDefinicion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLibroContable.jContentPaneDetalleLibroContable.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroFactuPrincipal() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.jScrollPanelDatosParametroFactuPrincipal.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormLibroContable.jContentPaneDetalleLibroContable.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.jScrollPanelDatosParametroFactuPrincipal.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.jScrollPanelDatosParametroFactuPrincipal.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.jScrollPanelDatosParametroFactuPrincipal.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleLibroContable() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormLibroContable);
			
	       	this.jInternalFrameDetalleFormLibroContable.setVisible(false);
	        this.jInternalFrameDetalleFormLibroContable.setSelected(false);
			
			//this.jInternalFrameDetalleFormLibroContable.dispose();
			//this.jInternalFrameDetalleFormLibroContable=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoLibroContable() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoLibroContable.setVisible(true);
	        this.jInternalFrameReporteDinamicoLibroContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionLibroContable() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionLibroContable.setVisible(true);
	        this.jInternalFrameImportacionLibroContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByLibroContable() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByLibroContable.setVisible(true);
	        this.jInternalFrameOrderByLibroContable.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByLibroContable() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByLibroContable.setVisible(false);
	        this.jInternalFrameOrderByLibroContable.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoLibroContable() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoLibroContable.setVisible(false);
	        this.jInternalFrameReporteDinamicoLibroContable.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionLibroContable() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionLibroContable.setVisible(false);
	        this.jInternalFrameImportacionLibroContable.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarLibroContableActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarLibroContable(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarLibroContable(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesLibroContable(true);
			//this.isEsNuevoLibroContable=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesLibroContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLibroContable(false) ;
			
			if(librocontableSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() && ParametroFactuPrincipalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroFactuPrincipalActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado() && DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDefinicionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(LibroContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLibroContable(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLibroContable(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaLibroContableActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarLibroContable(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLibroContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesLibroContable(true);
			//this.isEsNuevoLibroContable=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.librocontable.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesLibroContable("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesLibroContable(false) ;
			
			if(LibroContableJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLibroContable(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLibroContable(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarLibroContableActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesLibroContable(false);
			
			//if(!this.isEsNuevoLibroContable) {								
				int intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(LibroContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualLibroContable(this.librocontable,true);
				this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);
				
			}
			
			if(this.permiteMantenimiento(this.librocontable)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.librocontableSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoLibroContable=true;
					this.inicializarActualizarBindingTablaLibroContable(false);
					this.isEsNuevoLibroContable=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoLibroContable=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoLibroContable=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLibroContable(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLibroContable(false);
				
				this.habilitarDeshabilitarControlesLibroContable(false);
			
												
				
				if(LibroContableJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleLibroContable();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoLibroContableActionPerformed(evt,librocontableSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualLibroContable(this.librocontable,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosLibroContable.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,librocontableSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.librocontable.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(LibroContable.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LibroContable.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarLibroContableActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				this.librocontable.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				this.librocontable.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.librocontable)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.librocontableSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((LibroContableModel) this.jTableDatosLibroContable.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoLibroContable=true;
				this.inicializarActualizarBindingTablaLibroContable(false);
				this.isEsNuevoLibroContable=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLibroContable(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLibroContable(false);
				
				this.habilitarDeshabilitarControlesLibroContable(false);
				
				
				
				if(LibroContableJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleLibroContable();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarLibroContableActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosLibroContable.getRowCount()>=1) {
				jTableDatosLibroContable.removeRowSelectionInterval(0, jTableDatosLibroContable.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesLibroContable(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaLibroContable(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLibroContable(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLibroContable(false) ;
			
			this.isEsNuevoLibroContable=false;
			
			if(LibroContableJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleLibroContable();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosLibroContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingLibroContable(false);
				
				//SI ES MANUAL
				if(LibroContableJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualLibroContable();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosLibroContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoLibroContable--;			
			//LibroContable librocontableAux= new LibroContable();			
			//librocontableAux.setId(this.iIdNuevoLibroContable);
			
			if(this.jInternalFrameDetalleFormLibroContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaLibroContable();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);
			
			this.librocontable.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.librocontableLogic.getLibroContables().add(this.librocontableAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.librocontables.add(this.librocontableAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaLibroContable(false);
			
			this.jTableDatosLibroContable.setRowSelectionInterval(this.getIndiceNuevoLibroContable(), this.getIndiceNuevoLibroContable());
			
			int iLastRow =  this.jTableDatosLibroContable.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosLibroContable.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosLibroContable.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaLibroContable(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionLibroContableActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingLibroContable(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLibroContable(false);
			
			//SI ES MANUAL
			if(LibroContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLibroContable();
			}
			
			//this.abrirFrameTreeLibroContable();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionLibroContableActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Libro ContableS ?", "MANTENIMIENTO DE Libro Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionLibroContable.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralLibroContable();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.librocontableReturnGeneral=librocontableLogic.procesarImportacionLibroContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.librocontableParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarLibroContableReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionLibroContableActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionLibroContable.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionLibroContable.setFileImportacion(this.jInternalFrameImportacionLibroContable.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionLibroContable.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionLibroContable.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionLibroContable.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionLibroContable.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoLibroContableActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<LibroContable> librocontablesSeleccionados=new ArrayList<LibroContable>();		

		librocontablesSeleccionados=this.getLibroContablesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLibroContable.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLibroContable.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("LibroContableBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"LibroContableBaseDesign.jrxml";
			
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
			
			this.generarReporteLibroContables("Todos",librocontablesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.librocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Libro Contable",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoLibroContable.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLibroContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LibroContableConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LibroContableConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LibroContableConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoLibroContable.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoLibroContable.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoLibroContable.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case LibroContableConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case LibroContableConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case LibroContableConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoLibroContable.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case LibroContableConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case LibroContableConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case LibroContableConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoLibroContable.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLibroContable.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LibroContableConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case LibroContableConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case LibroContableConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoLibroContableActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<LibroContable> librocontablesSeleccionados=new ArrayList<LibroContable>();		
		
		librocontablesSeleccionados=this.getLibroContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"librocontable";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("LibroContables");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoLibroContable.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoLibroContable.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case LibroContableConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LibroContableConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(LibroContable librocontable:librocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(librocontable.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LibroContableConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LibroContableConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(LibroContable librocontable:librocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(librocontable.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LibroContableConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LibroContableConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(LibroContable librocontable:librocontablesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(librocontable.getnombre());
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
			//	this.getFilaCabeceraExportarExcelLibroContable(row);				
			//	iRow++;
			//}				
			
			//for(LibroContable librocontableAux:librocontablesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelLibroContable(librocontableAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.librocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Libro Contable",JOptionPane.INFORMATION_MESSAGE);
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
				this.librocontableLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLibroContable(false);
			
			//SI ES MANUAL
			if(LibroContableJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLibroContable();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresLibroContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLibroContable(false);
			
			//SI ES MANUAL
			if(LibroContableJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLibroContable();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesLibroContableActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLibroContable(false);
			
			//SI ES MANUAL
			if(LibroContableJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLibroContable();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaLibroContable() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosLibroContable.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosLibroContable.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosLibroContable.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosLibroContable.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosLibroContable.setMinimumSize(dimensionMinimum);
		this.jTableDatosLibroContable.setMaximumSize(dimensionMaximum);
		this.jTableDatosLibroContable.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingLibroContable(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingLibroContable(esInicializar,true);
	}
	
	public void inicializarActualizarBindingLibroContable(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaLibroContable(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesLibroContable(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasLibroContable(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLibroContable(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesLibroContable(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !LibroContableJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!LibroContableJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualLibroContable() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaLibroContable();
		
		this.inicializarActualizarBindingBotonesManualLibroContable(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualLibroContable();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLibroContable() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualLibroContable(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualLibroContable(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosLibroContable.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosLibroContable.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteLibroContable.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormLibroContable!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormLibroContable.jCheckBoxPostAccionNuevoLibroContable.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormLibroContable.jCheckBoxPostAccionSinCerrarLibroContable.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormLibroContable.jCheckBoxPostAccionSinMensajeLibroContable.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosLibroContable.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosLibroContable.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteLibroContable.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormLibroContable!=null) {
				this.jInternalFrameDetalleFormLibroContable.jCheckBoxPostAccionNuevoLibroContable.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormLibroContable.jCheckBoxPostAccionSinCerrarLibroContable.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormLibroContable.jCheckBoxPostAccionSinMensajeLibroContable.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionLibroContable.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionLibroContable.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormLibroContable!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesLibroContable.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoLibroContable!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLibroContable.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesLibroContable.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesLibroContable.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarLibroContable.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesLibroContable.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoLibroContable!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLibroContable.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesLibroContable.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralLibroContable.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesLibroContable(Boolean esInicializar) throws Exception {
		try	{	
			if(LibroContableJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualLibroContable(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesLibroContable() throws Exception {
		try	{
			if(LibroContableJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualLibroContable();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLibroContable() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualLibroContable() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesLibroContable.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesLibroContable.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesLibroContable.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesLibroContable.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesLibroContable.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesLibroContable.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionLibroContable.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionLibroContable.addItem(reporte);
			}
			
			
			if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionLibroContable.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionLibroContable.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesLibroContable.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesLibroContable.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesLibroContable.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesLibroContable.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarLibroContable.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarLibroContable.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarLibroContable.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLibroContable();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLibroContable() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLibroContable!=null) {
				this.jInternalFrameReporteDinamicoLibroContable.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoLibroContable.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLibroContable!=null) {
				this.jInternalFrameReporteDinamicoLibroContable.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoLibroContable.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoLibroContable!=null) {
				
				if(this.jInternalFrameReporteDinamicoLibroContable.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLibroContable.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLibroContable.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoLibroContable.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLibroContable.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLibroContable.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualLibroContable()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoLibroContable.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreLibroContable.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasLibroContable(Boolean esInicializar) throws Exception {				
		if(LibroContableJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualLibroContable();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaLibroContable() throws Exception {
		this.inicializarActualizarBindingTablaLibroContable(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByLibroContable() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByLibroContable.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByLibroContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLibroContable.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new LibroContablePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByLibroContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLibroContable.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new LibroContablePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosLibroContableOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLibroContableOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new LibroContablePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByLibroContable.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLibroContable.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new LibroContablePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByLibroContable.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaLibroContable(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=librocontableLogic.getLibroContables().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=librocontables.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(LibroContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosLibroContable.setModel(new LibroContableModel(this.librocontableLogic.getLibroContables(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosLibroContable.setModel(new LibroContableModel(this.librocontables,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByLibroContable!=null && this.jInternalFrameOrderByLibroContable.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByLibroContable();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosLibroContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLibroContable,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new LibroContablePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+LibroContableConstantesFunciones.SCLASSWEBTITULO,librocontableConstantesFunciones.resaltarSeleccionarLibroContable,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+LibroContableConstantesFunciones.SCLASSWEBTITULO,librocontableConstantesFunciones.resaltarSeleccionarLibroContable,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosLibroContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLibroContable,LibroContableConstantesFunciones.LABEL_ID));

		if(this.librocontableConstantesFunciones.mostraridLibroContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LibroContableConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.librocontableConstantesFunciones.resaltaridLibroContable,this.librocontableConstantesFunciones.activaridLibroContable,this,true,"idLibroContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.librocontableConstantesFunciones.resaltaridLibroContable,this.librocontableConstantesFunciones.activaridLibroContable,this,true,"idLibroContable","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLibroContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLibroContable,LibroContableConstantesFunciones.LABEL_IDEMPRESA));

		if(this.librocontableConstantesFunciones.mostrarid_empresaLibroContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LibroContableConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.librocontableConstantesFunciones.resaltarid_empresaLibroContable,this,this.librocontableConstantesFunciones.activarid_empresaLibroContable));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.librocontableConstantesFunciones.resaltarid_empresaLibroContable,this,this.librocontableConstantesFunciones.activarid_empresaLibroContable,false,"id_empresaLibroContable","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LibroContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLibroContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLibroContable,LibroContableConstantesFunciones.LABEL_CODIGO));

		if(this.librocontableConstantesFunciones.mostrarcodigoLibroContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LibroContableConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.librocontableConstantesFunciones.resaltarcodigoLibroContable,this.librocontableConstantesFunciones.activarcodigoLibroContable,this,true,"codigoLibroContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.librocontableConstantesFunciones.resaltarcodigoLibroContable,this.librocontableConstantesFunciones.activarcodigoLibroContable,this,true,"codigoLibroContable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LibroContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLibroContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLibroContable,LibroContableConstantesFunciones.LABEL_NOMBRE));

		if(this.librocontableConstantesFunciones.mostrarnombreLibroContable && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LibroContableConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.librocontableConstantesFunciones.resaltarnombreLibroContable,this.librocontableConstantesFunciones.activarnombreLibroContable,this,true,"nombreLibroContable","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.librocontableConstantesFunciones.resaltarnombreLibroContable,this.librocontableConstantesFunciones.activarnombreLibroContable,this,true,"nombreLibroContable","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LibroContablePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.librocontableSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosParametroFactuPrincipal && this.librocontableConstantesFunciones.mostrarParametroFactuPrincipalLibroContable && !LibroContableConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Principal s");
				tableColumn.setHeaderValue("Parametro Principal s");
				tableColumn.setCellRenderer(new ParametroFactuPrincipalTableCell(librocontableConstantesFunciones.resaltarParametroFactuPrincipalLibroContable,this,this.librocontableConstantesFunciones.activarParametroFactuPrincipalLibroContable));
				tableColumn.setCellEditor(new ParametroFactuPrincipalTableCell(librocontableConstantesFunciones.resaltarParametroFactuPrincipalLibroContable,this,this.librocontableConstantesFunciones.activarParametroFactuPrincipalLibroContable));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLibroContable.addColumn(tableColumn);
			}

			if(this.isTienePermisosDefinicion && this.librocontableConstantesFunciones.mostrarDefinicionLibroContable && !LibroContableConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Definiciones");
				tableColumn.setHeaderValue("Definiciones");
				tableColumn.setCellRenderer(new DefinicionTableCell(librocontableConstantesFunciones.resaltarDefinicionLibroContable,this,this.librocontableConstantesFunciones.activarDefinicionLibroContable));
				tableColumn.setCellEditor(new DefinicionTableCell(librocontableConstantesFunciones.resaltarDefinicionLibroContable,this,this.librocontableConstantesFunciones.activarDefinicionLibroContable));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosLibroContable.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.librocontableSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.librocontableSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLibroContable.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.librocontableSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.librocontableSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLibroContable.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarLibroContable && this.isPermisoGuardarCambiosLibroContable) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.librocontableSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.librocontableSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosLibroContable.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.librocontableSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosLibroContable.addColumn(tableColumn);
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
			
			this.jTableDatosLibroContable.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLibroContable && this.isPermisoGuardarCambiosLibroContable) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.librocontableSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLibroContable && this.isPermisoGuardarCambiosLibroContable) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosLibroContable.moveColumn(this.jTableDatosLibroContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosLibroContable.moveColumn(this.jTableDatosLibroContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.librocontableSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosLibroContable.moveColumn(this.jTableDatosLibroContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosLibroContable.moveColumn(this.jTableDatosLibroContable.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosLibroContable.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosLibroContable.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosLibroContable,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!LibroContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosLibroContable.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosLibroContable.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!LibroContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!LibroContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosLibroContable.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosLibroContable.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosLibroContable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=librocontableLogic.getLibroContables().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=librocontables.size()-1;
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
		//this.jTableDatosLibroContable.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosLibroContable.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosLibroContable();
			
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
				
				//this.isEsNuevoLibroContable=false;
					
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			
				if(this.librocontableSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormLibroContable==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLibroContable.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLibroContable.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.librocontable.getsType().equals("DUPLICADO")
				   || this.librocontable.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoLibroContable=true;
				
				} else {
					this.isEsNuevoLibroContable=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
					if(this.librocontable.getId()>=0 && !this.librocontable.getIsNew()) {						
						this.isEsNuevoLibroContable=false;
						
					} else {
						this.isEsNuevoLibroContable=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoLibroContable(esRelaciones);						
				
				this.seleccionarLibroContable(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.librocontable.getId()<0) {
					this.isEsNuevoLibroContable=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarLibroContable(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarLibroContable(evt,rowIndex);
				}	
				
				if(this.librocontableSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion LibroContable: " + this.dDif); 
					}
				}								
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarLibroContable(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.librocontable)) {
					if(this.librocontable.getId()>0) {
						this.librocontable.setIsDeleted(true);
						
						this.librocontablesEliminados.add(this.librocontable);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.librocontableLogic.getLibroContables().remove(this.librocontable);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.librocontables.remove(this.librocontable);				
					}
					
					
					((LibroContableModel) this.jTableDatosLibroContable.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaLibroContable(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarLibroContable(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoLibroContable) {
			
			if(this.jInternalFrameDetalleFormLibroContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLibroContable.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLibroContable.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(LibroContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioLibroContable(this.librocontable);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.librocontableConstantesFunciones.cargarid_empresaLibroContable || this.librocontableConstantesFunciones.event_dependid_empresaLibroContable) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.librocontable.getid_empresa());
									//this.inicializarActualizarBindingLibroContable(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(librocontable.getEmpresa()!=null) {
							this.empresasForeignKey.add(librocontable.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.librocontable.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesLibroContable("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesLibroContable(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLibroContable() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoLibroContable(LibroContable librocontable) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoLibroContable(librocontable,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoLibroContable(LibroContable librocontable,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioLibroContable(librocontable);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyLibroContable(librocontable,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyLibroContable(librocontable);
	}
	
	public void setVariablesObjetoActualToFormularioLibroContable(LibroContable librocontable) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormLibroContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormLibroContable.jLabelidLibroContable.setText(librocontable.getId().toString());
			this.jInternalFrameDetalleFormLibroContable.jTextFieldcodigoLibroContable.setText(librocontable.getcodigo());
			this.jInternalFrameDetalleFormLibroContable.jTextAreanombreLibroContable.setText(librocontable.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,LibroContable librocontableLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,librocontableLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,LibroContable librocontableLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				librocontableLocal=this.librocontable;
			} else {
				librocontableLocal=this.librocontableAnterior;
			}
		}
		
		if(this.permiteMantenimiento(librocontableLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoLibroContable(librocontableLocal,true);
					
					if(librocontableSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(librocontableLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.librocontableSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(librocontableLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoLibroContable(LibroContable librocontable,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLibroContable(librocontable,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(librocontable);
	}
	
	public void setVariablesFormularioToObjetoActualLibroContable(LibroContable librocontable,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLibroContable(librocontable,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualLibroContable(LibroContable librocontable,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormLibroContable==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormLibroContable.jLabelidLibroContable.getText()==null || this.jInternalFrameDetalleFormLibroContable.jLabelidLibroContable.getText()=="" || this.jInternalFrameDetalleFormLibroContable.jLabelidLibroContable.getText()=="Id") {
				this.jInternalFrameDetalleFormLibroContable.jLabelidLibroContable.setText("0");
			}

			if(conColumnasBase) {librocontable.setId(Long.parseLong(this.jInternalFrameDetalleFormLibroContable.jLabelidLibroContable.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LibroContableConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLibroContable.jLabelIdLibroContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			librocontable.setcodigo(this.jInternalFrameDetalleFormLibroContable.jTextFieldcodigoLibroContable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LibroContableConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLibroContable.jLabelcodigoLibroContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			librocontable.setnombre(this.jInternalFrameDetalleFormLibroContable.jTextAreanombreLibroContable.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LibroContableConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLibroContable.jLabelnombreLibroContable,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLibroContable(LibroContable librocontableBean,LibroContable librocontable,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosLibroContable(LibroContable librocontableOrigen,LibroContable librocontable,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && librocontableOrigen.getId()!=null && !librocontableOrigen.getId().equals(0L))) {librocontable.setId(librocontableOrigen.getId());}}
			if(conDefault || (!conDefault && librocontableOrigen.getcodigo()!=null && !librocontableOrigen.getcodigo().equals(""))) {librocontable.setcodigo(librocontableOrigen.getcodigo());}
			if(conDefault || (!conDefault && librocontableOrigen.getnombre()!=null && !librocontableOrigen.getnombre().equals(""))) {librocontable.setnombre(librocontableOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLibroContable(LibroContable librocontable) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLibroContable.jLabelidLibroContable.setText(librocontable.getId().toString());
			this.jInternalFrameDetalleFormLibroContable.jTextFieldcodigoLibroContable.setText(librocontable.getcodigo());
			this.jInternalFrameDetalleFormLibroContable.jTextAreanombreLibroContable.setText(librocontable.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLibroContable(LibroContableBean librocontableBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLibroContable.jLabelidLibroContable.setText(librocontableBean.getId().toString());
			this.jInternalFrameDetalleFormLibroContable.jTextFieldcodigoLibroContable.setText(librocontableBean.getcodigo());
			this.jInternalFrameDetalleFormLibroContable.jTextAreanombreLibroContable.setText(librocontableBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanLibroContable(LibroContableParameterReturnGeneral librocontableReturnGeneral,LibroContableBean librocontableBean,Boolean conDefault) throws Exception { 
		try {
			LibroContable librocontableLocal=new LibroContable();
			
			librocontableLocal=librocontableReturnGeneral.getLibroContable();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && librocontableLocal.getId()!=null && !librocontableLocal.getId().equals(0L))) {librocontableBean.setId(librocontableLocal.getId());}}
			if(conDefault || (!conDefault && librocontableLocal.getcodigo()!=null && !librocontableLocal.getcodigo().equals(""))) {librocontableBean.setcodigo(librocontableLocal.getcodigo());}
			if(conDefault || (!conDefault && librocontableLocal.getnombre()!=null && !librocontableLocal.getnombre().equals(""))) {librocontableBean.setnombre(librocontableLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxLibroContableGenerico(Long idLibroContableSeleccionado,JComboBox jComboBoxLibroContable,List<LibroContable> librocontablesLocal)throws Exception {
		try {
			LibroContable  librocontableTemp=null;

			for(LibroContable librocontableAux:librocontablesLocal) {
				if(librocontableAux.getId()!=null && librocontableAux.getId().equals(idLibroContableSeleccionado)) {
					librocontableTemp=librocontableAux;
					break;
				}
			}

			jComboBoxLibroContable.setSelectedItem(librocontableTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxLibroContableGenerico(JComboBox jComboBoxLibroContable,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxLibroContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLibroContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxLibroContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLibroContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLibroContable.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxLibroContable.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLibroContable.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxLibroContable.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxLibroContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxLibroContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ParametroFactuPrincipal")) {
			jButtonParametroFactuPrincipalActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Definicion")) {
			jButtonDefinicionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			librocontable=(LibroContable) librocontableLogic.getLibroContables().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			librocontable =(LibroContable) librocontables.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!librocontable.getIsNew() && !librocontable.getIsChanged() && !librocontable.getIsDeleted()) {
				sDescripcion=librocontable.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=librocontable.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		LibroContable librocontableRow=new LibroContable();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			librocontableRow=(LibroContable) librocontableLogic.getLibroContables().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			librocontableRow=(LibroContable) librocontables.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonParametroFactuPrincipalActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,LibroContable librocontable) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLibroContable==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.librocontable = (LibroContable)this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.librocontable = (LibroContable)this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(librocontable!=null) {
						this.librocontable = librocontable;
					} else {
						this.librocontable = new LibroContable();
					}
				}

				if(this.isTienePermisosParametroFactuPrincipal && this.permiteMantenimiento(this.librocontable)) {
					ParametroFactuPrincipalBeanSwingJInternalFrame parametrofactuprincipalBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFramePopup=new ParametroFactuPrincipalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrofactuprincipalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFramePopup;
					} else {
						parametrofactuprincipalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame;
					}

					List<LibroContable> librocontables=new ArrayList<LibroContable>();
					librocontables.add(this.librocontable);
					if(!esRelacionado) {
						//parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalSessionBean.setConGuardarRelaciones(false);
						//parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrofactuprincipalBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLibroContable.cargarParametroFactuPrincipalBeanSwingJInternalFrame(librocontables,this.librocontable,parametrofactuprincipalBeanSwingJInternalFrame,/*conInicializar,*/parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalSessionBean.getConGuardarRelaciones(),parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
					parametrofactuprincipalBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrofactuprincipalBeanSwingJInternalFrame.actualizarEstadoPanelsParametroFactuPrincipal("no_relacionado");

						parametrofactuprincipalBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroFactuPrincipalConstantesFunciones.ITAMANIOFILATABLA + (ParametroFactuPrincipalConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrofactuprincipalBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLibroContable=(TitledBorder)this.jScrollPanelDatosLibroContable.getBorder();
						TitledBorder titledBorderParametroFactuPrincipal=(TitledBorder)parametrofactuprincipalBeanSwingJInternalFrame.jScrollPanelDatosParametroFactuPrincipal.getBorder();

						titledBorderParametroFactuPrincipal.setTitle(titledBorderLibroContable.getTitle() + " -> Parametro Principal ");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrofactuprincipalBeanSwingJInternalFrame);
						}

						parametrofactuprincipalBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrofactuprincipalBeanSwingJInternalFrame);

						parametrofactuprincipalBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.librocontableSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Principal ",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDefinicionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,LibroContable librocontable) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormLibroContable==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.librocontable = (LibroContable)this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.librocontable = (LibroContable)this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(librocontable!=null) {
						this.librocontable = librocontable;
					} else {
						this.librocontable = new LibroContable();
					}
				}

				if(this.isTienePermisosDefinicion && this.permiteMantenimiento(this.librocontable)) {
					DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFramePopup=new DefinicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						definicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFramePopup;
					} else {
						definicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame;
					}

					List<LibroContable> librocontables=new ArrayList<LibroContable>();
					librocontables.add(this.librocontable);
					if(!esRelacionado) {
						//definicionBeanSwingJInternalFrame.definicionSessionBean.setConGuardarRelaciones(false);
						//definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					definicionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormLibroContable.cargarDefinicionBeanSwingJInternalFrame(librocontables,this.librocontable,definicionBeanSwingJInternalFrame,/*conInicializar,*/definicionBeanSwingJInternalFrame.definicionSessionBean.getConGuardarRelaciones(),definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado());
					definicionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("no_relacionado");

						definicionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DefinicionConstantesFunciones.ITAMANIOFILATABLA + (DefinicionConstantesFunciones.ITAMANIOFILATABLA/2));

						definicionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderLibroContable=(TitledBorder)this.jScrollPanelDatosLibroContable.getBorder();
						TitledBorder titledBorderDefinicion=(TitledBorder)definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.getBorder();

						titledBorderDefinicion.setTitle(titledBorderLibroContable.getTitle() + " -> Definicion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,definicionBeanSwingJInternalFrame);
						}

						definicionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(definicionBeanSwingJInternalFrame);

						definicionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.librocontableSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Definicion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualLibroContable(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoLibroContable.setVisible((this.isVisibilidadCeldaNuevoLibroContable && this.isPermisoNuevoLibroContable));			
			this.jButtonDuplicarLibroContable.setVisible((this.isVisibilidadCeldaDuplicarLibroContable && this.isPermisoDuplicarLibroContable));			
			this.jButtonCopiarLibroContable.setVisible((this.isVisibilidadCeldaCopiarLibroContable && this.isPermisoCopiarLibroContable));
			this.jButtonVerFormLibroContable.setVisible((this.isVisibilidadCeldaVerFormLibroContable && this.isPermisoVerFormLibroContable));
			
			this.jButtonAbrirOrderByLibroContable.setVisible((this.isVisibilidadCeldaOrdenLibroContable && this.isPermisoOrdenLibroContable));			
			
			this.jButtonNuevoRelacionesLibroContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesLibroContable && this.isPermisoNuevoLibroContable));			
			this.jButtonNuevoGuardarCambiosLibroContable.setVisible((this.isVisibilidadCeldaNuevoLibroContable && this.isPermisoNuevoLibroContable && this.isPermisoGuardarCambiosLibroContable));
			
			if(this.jInternalFrameDetalleFormLibroContable!=null) {
			this.jInternalFrameDetalleFormLibroContable.jButtonModificarLibroContable.setVisible((this.isVisibilidadCeldaModificarLibroContable && this.isPermisoActualizarLibroContable));	
			this.jInternalFrameDetalleFormLibroContable.jButtonActualizarLibroContable.setVisible((this.isVisibilidadCeldaActualizarLibroContable && this.isPermisoActualizarLibroContable));	
			this.jInternalFrameDetalleFormLibroContable.jButtonEliminarLibroContable.setVisible((this.isVisibilidadCeldaEliminarLibroContable && this.isPermisoEliminarLibroContable));
			this.jInternalFrameDetalleFormLibroContable.jButtonCancelarLibroContable.setVisible(this.isVisibilidadCeldaCancelarLibroContable);							
			this.jInternalFrameDetalleFormLibroContable.jButtonGuardarCambiosLibroContable.setVisible((this.isVisibilidadCeldaGuardarLibroContable && this.isPermisoGuardarCambiosLibroContable));			
			
			}
						
			this.jButtonGuardarCambiosTablaLibroContable.setVisible((this.isVisibilidadCeldaGuardarCambiosLibroContable && this.isPermisoGuardarCambiosLibroContable));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarLibroContable.setVisible((this.isVisibilidadCeldaNuevoLibroContable && this.isPermisoNuevoLibroContable));						
			this.jButtonDuplicarToolBarLibroContable.setVisible((this.isVisibilidadCeldaDuplicarLibroContable && this.isPermisoDuplicarLibroContable));						
			this.jButtonCopiarToolBarLibroContable.setVisible((this.isVisibilidadCeldaCopiarLibroContable && this.isPermisoCopiarLibroContable));			
			this.jButtonVerFormToolBarLibroContable.setVisible((this.isVisibilidadCeldaVerFormLibroContable && this.isPermisoVerFormLibroContable));			
			this.jButtonAbrirOrderByToolBarLibroContable.setVisible((this.isVisibilidadCeldaOrdenLibroContable && this.isPermisoOrdenLibroContable));
			this.jButtonNuevoRelacionesToolBarLibroContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesLibroContable && this.isPermisoNuevoLibroContable));			
			this.jButtonNuevoGuardarCambiosToolBarLibroContable.setVisible((this.isVisibilidadCeldaNuevoLibroContable && this.isPermisoNuevoLibroContable && this.isPermisoGuardarCambiosLibroContable));			
			
			if(this.jInternalFrameDetalleFormLibroContable!=null) {
			this.jInternalFrameDetalleFormLibroContable.jButtonModificarToolBarLibroContable.setVisible((this.isVisibilidadCeldaModificarLibroContable && this.isPermisoActualizarLibroContable));	
			this.jInternalFrameDetalleFormLibroContable.jButtonActualizarToolBarLibroContable.setVisible((this.isVisibilidadCeldaActualizarLibroContable  && this.isPermisoActualizarLibroContable));	
			this.jInternalFrameDetalleFormLibroContable.jButtonEliminarToolBarLibroContable.setVisible((this.isVisibilidadCeldaEliminarLibroContable && this.isPermisoEliminarLibroContable));
			this.jInternalFrameDetalleFormLibroContable.jButtonCancelarToolBarLibroContable.setVisible(this.isVisibilidadCeldaCancelarLibroContable);				
			this.jInternalFrameDetalleFormLibroContable.jButtonGuardarCambiosToolBarLibroContable.setVisible((this.isVisibilidadCeldaGuardarLibroContable && this.isPermisoGuardarCambiosLibroContable));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarLibroContable.setVisible((this.isVisibilidadCeldaGuardarCambiosLibroContable && this.isPermisoGuardarCambiosLibroContable));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoLibroContable.setVisible((this.isVisibilidadCeldaNuevoLibroContable && this.isPermisoNuevoLibroContable));			
			this.jMenuItemDuplicarLibroContable.setVisible((this.isVisibilidadCeldaDuplicarLibroContable && this.isPermisoDuplicarLibroContable));			
			this.jMenuItemCopiarLibroContable.setVisible((this.isVisibilidadCeldaCopiarLibroContable && this.isPermisoCopiarLibroContable));			
			this.jMenuItemVerFormLibroContable.setVisible((this.isVisibilidadCeldaVerFormLibroContable && this.isPermisoVerFormLibroContable));			
			this.jMenuItemAbrirOrderByLibroContable.setVisible((this.isVisibilidadCeldaOrdenLibroContable && this.isPermisoOrdenLibroContable));			
			//this.jMenuItemMostrarOcultarLibroContable.setVisible((this.isVisibilidadCeldaOrdenLibroContable && this.isPermisoOrdenLibroContable));
			this.jMenuItemDetalleAbrirOrderByLibroContable.setVisible((this.isVisibilidadCeldaOrdenLibroContable && this.isPermisoOrdenLibroContable));			
			//this.jMenuItemDetalleMostrarOcultarLibroContable.setVisible((this.isVisibilidadCeldaOrdenLibroContable && this.isPermisoOrdenLibroContable));			
			this.jMenuItemNuevoRelacionesLibroContable.setVisible((this.isVisibilidadCeldaNuevoRelacionesLibroContable && this.isPermisoNuevoLibroContable));			
			this.jMenuItemNuevoGuardarCambiosLibroContable.setVisible((this.isVisibilidadCeldaNuevoLibroContable && this.isPermisoNuevoLibroContable && this.isPermisoGuardarCambiosLibroContable));									
			
			if(this.jInternalFrameDetalleFormLibroContable!=null) {
			this.jInternalFrameDetalleFormLibroContable.jMenuItemModificarLibroContable.setVisible((this.isVisibilidadCeldaModificarLibroContable && this.isPermisoActualizarLibroContable));	
			this.jInternalFrameDetalleFormLibroContable.jMenuItemActualizarLibroContable.setVisible((this.isVisibilidadCeldaActualizarLibroContable && this.isPermisoActualizarLibroContable));	
			this.jInternalFrameDetalleFormLibroContable.jMenuItemEliminarLibroContable.setVisible((this.isVisibilidadCeldaEliminarLibroContable && this.isPermisoEliminarLibroContable));
			this.jInternalFrameDetalleFormLibroContable.jMenuItemCancelarLibroContable.setVisible(this.isVisibilidadCeldaCancelarLibroContable);				
			}
			
			this.jMenuItemGuardarCambiosLibroContable.setVisible((this.isVisibilidadCeldaGuardarLibroContable && this.isPermisoGuardarCambiosLibroContable));						
			this.jMenuItemGuardarCambiosTablaLibroContable.setVisible((this.isVisibilidadCeldaGuardarCambiosLibroContable && this.isPermisoGuardarCambiosLibroContable));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoLibroContable=this.jButtonNuevoLibroContable.isVisible();
			this.isVisibilidadCeldaDuplicarLibroContable=this.jButtonDuplicarLibroContable.isVisible();
			this.isVisibilidadCeldaCopiarLibroContable=this.jButtonCopiarLibroContable.isVisible();
			this.isVisibilidadCeldaVerFormLibroContable=this.jButtonVerFormLibroContable.isVisible();
			
			this.isVisibilidadCeldaOrdenLibroContable=this.jButtonAbrirOrderByLibroContable.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesLibroContable=this.jButtonNuevoRelacionesLibroContable.isVisible();
			this.isVisibilidadCeldaModificarLibroContable=this.jButtonModificarLibroContable.isVisible();
			
			if(this.jInternalFrameDetalleFormLibroContable!=null) {
			this.isVisibilidadCeldaActualizarLibroContable=this.jInternalFrameDetalleFormLibroContable.jButtonActualizarLibroContable.isVisible();
			this.isVisibilidadCeldaEliminarLibroContable=this.jInternalFrameDetalleFormLibroContable.jButtonEliminarLibroContable.isVisible();
			this.isVisibilidadCeldaCancelarLibroContable=this.jInternalFrameDetalleFormLibroContable.jButtonCancelarLibroContable.isVisible();
			this.isVisibilidadCeldaGuardarLibroContable=this.jInternalFrameDetalleFormLibroContable.jButtonGuardarCambiosLibroContable.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosLibroContable=this.jButtonGuardarCambiosTablaLibroContable.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoLibroContable=this.jButtonNuevoToolBarLibroContable.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLibroContable=this.jButtonNuevoRelacionesToolBarLibroContable.isVisible();
			
			if(this.jInternalFrameDetalleFormLibroContable!=null) {
			this.isVisibilidadCeldaModificarLibroContable=this.jInternalFrameDetalleFormLibroContable.jButtonModificarToolBarLibroContable.isVisible();
			this.isVisibilidadCeldaActualizarLibroContable=this.jInternalFrameDetalleFormLibroContable.jButtonActualizarToolBarLibroContable.isVisible();
			this.isVisibilidadCeldaEliminarLibroContable=this.jInternalFrameDetalleFormLibroContable.jButtonEliminarToolBarLibroContable.isVisible();
			this.isVisibilidadCeldaCancelarLibroContable=this.jInternalFrameDetalleFormLibroContable.jButtonCancelarToolBarLibroContable.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLibroContable=this.jButtonGuardarCambiosToolBarLibroContable.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLibroContable=this.jButtonGuardarCambiosTablaToolBarLibroContable.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoLibroContable=this.jMenuItemNuevoLibroContable.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLibroContable=this.jMenuItemNuevoRelacionesLibroContable.isVisible();
			
			if(this.jInternalFrameDetalleFormLibroContable!=null) {
			this.isVisibilidadCeldaModificarLibroContable=this.jInternalFrameDetalleFormLibroContable.jMenuItemModificarLibroContable.isVisible();
			this.isVisibilidadCeldaActualizarLibroContable=this.jInternalFrameDetalleFormLibroContable.jMenuItemActualizarLibroContable.isVisible();
			this.isVisibilidadCeldaEliminarLibroContable=this.jInternalFrameDetalleFormLibroContable.jMenuItemEliminarLibroContable.isVisible();
			this.isVisibilidadCeldaCancelarLibroContable=this.jInternalFrameDetalleFormLibroContable.jMenuItemCancelarLibroContable.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLibroContable=this.jMenuItemGuardarCambiosLibroContable.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLibroContable=this.jMenuItemGuardarCambiosTablaLibroContable.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesLibroContable(Boolean esInicializar) {
		if(LibroContableJInternalFrame.ISBINDING_MANUAL) {			
			if(this.librocontableSessionBean.getConGuardarRelaciones()) {
				//if(this.librocontableSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesLibroContable();
			}
			
			this.inicializarActualizarBindingBotonesManualLibroContable(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualLibroContable() {
		this.jButtonNuevoLibroContable.setVisible(this.isPermisoNuevoLibroContable);			
		this.jButtonDuplicarLibroContable.setVisible(this.isPermisoDuplicarLibroContable);			
		this.jButtonCopiarLibroContable.setVisible(this.isPermisoCopiarLibroContable);			
		this.jButtonVerFormLibroContable.setVisible(this.isPermisoVerFormLibroContable);			
		
		this.jButtonAbrirOrderByLibroContable.setVisible(this.isPermisoOrdenLibroContable);					
		
		this.jButtonNuevoRelacionesLibroContable.setVisible(this.isPermisoNuevoLibroContable);			
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLibroContable.jButtonModificarLibroContable.setVisible(this.isPermisoActualizarLibroContable);	
			this.jInternalFrameDetalleFormLibroContable.jButtonActualizarLibroContable.setVisible(this.isPermisoActualizarLibroContable);	
			this.jInternalFrameDetalleFormLibroContable.jButtonEliminarLibroContable.setVisible(this.isPermisoEliminarLibroContable);
			this.jInternalFrameDetalleFormLibroContable.jButtonCancelarLibroContable.setVisible(this.isVisibilidadCeldaCancelarLibroContable);						
			this.jInternalFrameDetalleFormLibroContable.jButtonGuardarCambiosLibroContable.setVisible(this.isPermisoGuardarCambiosLibroContable);							
		}
		
		this.jButtonGuardarCambiosTablaLibroContable.setVisible(this.isPermisoActualizarLibroContable);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleLibroContable() {
		this.jInternalFrameDetalleFormLibroContable.jButtonModificarLibroContable.setVisible(this.isPermisoActualizarLibroContable);	
		this.jInternalFrameDetalleFormLibroContable.jButtonActualizarLibroContable.setVisible(this.isPermisoActualizarLibroContable);	
		this.jInternalFrameDetalleFormLibroContable.jButtonEliminarLibroContable.setVisible(this.isPermisoEliminarLibroContable);
		this.jInternalFrameDetalleFormLibroContable.jButtonCancelarLibroContable.setVisible(this.isVisibilidadCeldaCancelarLibroContable);							
		this.jInternalFrameDetalleFormLibroContable.jButtonGuardarCambiosLibroContable.setVisible((this.isVisibilidadCeldaGuardarLibroContable && this.isPermisoGuardarCambiosLibroContable));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosLibroContable() {
		if(LibroContableJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualLibroContable();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesLibroContable() {
	}
	
	public void jTableDatosLibroContableListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarLibroContable(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidLibroContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLibroContable(this.getlibrocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.librocontable==null) {
						this.librocontable = new LibroContable();
					}

					this.setVariablesFormularioToObjetoActualLibroContable(this.librocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);
				}

				if(this.librocontable.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.librocontable.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLibroContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaLibroContableUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebLibroContable(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLibroContable.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLibroContable.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLibroContable(this.getlibrocontable(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.librocontableLogic.getConnexion());

				if(this.librocontable.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.librocontable.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLibroContable=(TitledBorder)this.jScrollPanelDatosLibroContable.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderLibroContable.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaLibroContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLibroContable(this.getlibrocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.librocontable==null) {
						this.librocontable = new LibroContable();
					}

					this.setVariablesFormularioToObjetoActualLibroContable(this.librocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);
				}

				if(this.librocontable.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.librocontable.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLibroContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoLibroContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLibroContable(this.getlibrocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.librocontable==null) {
						this.librocontable = new LibroContable();
					}

					this.setVariablesFormularioToObjetoActualLibroContable(this.librocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);
				}

				if(this.librocontable.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.librocontable.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLibroContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreLibroContableBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLibroContable(this.getlibrocontable(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.librocontable==null) {
						this.librocontable = new LibroContable();
					}

					this.setVariablesFormularioToObjetoActualLibroContable(this.librocontable,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);
				}

				if(this.librocontable.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.librocontable.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLibroContable(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoLibroContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLibroContable(false,false);

			this.getLibroContablesBusquedaPorCodigo();

			this.inicializarActualizarBindingLibroContable(false);

			//if(LibroContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLibroContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreLibroContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLibroContable(false,false);

			this.getLibroContablesBusquedaPorNombre();

			this.inicializarActualizarBindingLibroContable(false);

			//if(LibroContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLibroContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaLibroContableActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLibroContable(false,false);

			this.getLibroContablesFK_IdEmpresa();

			this.inicializarActualizarBindingLibroContable(false);

			//if(LibroContableBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLibroContable(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.librocontableLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameLibroContable() {
		if(this.jInternalFrameDetalleFormLibroContable!=null) {
		

		if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) {
			this.jInternalFrameDetalleFormLibroContable.setVisible(false);	    			
			this.jInternalFrameDetalleFormLibroContable.dispose();
			this.jInternalFrameDetalleFormLibroContable=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoLibroContable!=null) {
			this.jInternalFrameReporteDinamicoLibroContable.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoLibroContable.dispose();
			this.jInternalFrameReporteDinamicoLibroContable=null;
		}
		
		if(this.jInternalFrameImportacionLibroContable!=null) {
			this.jInternalFrameImportacionLibroContable.setVisible(false);	    			
			this.jInternalFrameImportacionLibroContable.dispose();
			this.jInternalFrameImportacionLibroContable=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessLibroContable();
			
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			
			
			if(sTipo.equals("NuevoLibroContable")) {
				jButtonNuevoLibroContableActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarLibroContable")) {
				jButtonDuplicarLibroContableActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarLibroContable")) {
				jButtonCopiarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("VerFormLibroContable")) {
				jButtonVerFormLibroContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarLibroContable")) {
				jButtonNuevoLibroContableActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarLibroContable")) {
				jButtonDuplicarLibroContableActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoLibroContable")) {
				jButtonNuevoLibroContableActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarLibroContable")) {
				jButtonDuplicarLibroContableActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesLibroContable")) {
				jButtonNuevoLibroContableActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarLibroContable")) {
				jButtonNuevoLibroContableActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesLibroContable")) {
				jButtonNuevoLibroContableActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarLibroContable")) {
				jButtonModificarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarLibroContable")) {
				jButtonModificarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarLibroContable")) {
				jButtonModificarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("ActualizarLibroContable")) {
				jButtonActualizarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarLibroContable")) {
				jButtonActualizarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarLibroContable")) {
				jButtonActualizarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("EliminarLibroContable")) {
				jButtonEliminarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarLibroContable")) {
				jButtonEliminarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarLibroContable")) {
				jButtonEliminarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("CancelarLibroContable")) {
				jButtonCancelarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarLibroContable")) {
				jButtonCancelarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarLibroContable")) {
				jButtonCancelarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("CerrarLibroContable")) {
				jButtonCerrarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarLibroContable")) {
				jButtonCerrarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarLibroContable")) {
				jButtonCerrarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarLibroContable")) {
				jButtonMostrarOcultarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarLibroContable")) {
				jButtonCancelarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosLibroContable")) {
				jButtonGuardarCambiosLibroContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarLibroContable")) {
				jButtonGuardarCambiosLibroContableActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarLibroContable")) {
				jButtonCopiarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarLibroContable")) {
				jButtonVerFormLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosLibroContable")) {
				jButtonGuardarCambiosLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarLibroContable")) {
				jButtonCopiarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormLibroContable")) {
				jButtonVerFormLibroContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaLibroContable")) {
				jButtonGuardarCambiosLibroContableActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarLibroContable")) {
				jButtonGuardarCambiosLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaLibroContable")) {
				jButtonGuardarCambiosLibroContableActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionLibroContable")) {
				jButtonRecargarInformacionLibroContableActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarLibroContable")) {
				jButtonRecargarInformacionLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionLibroContable")) {
				jButtonRecargarInformacionLibroContableActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresLibroContable")) {
				jButtonAnterioresLibroContableActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarLibroContable")) {
				jButtonAnterioresLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreLibroContable")) {
				jButtonAnterioresLibroContableActionPerformed(evt);
			} else if(sTipo.equals("SiguientesLibroContable")) {
				jButtonSiguientesLibroContableActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarLibroContable")) {
				jButtonSiguientesLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesLibroContable")) {
				jButtonSiguientesLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByLibroContable") || sTipo.equals("MenuItemDetalleAbrirOrderByLibroContable")) {
				jButtonAbrirOrderByLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarLibroContable") || sTipo.equals("MenuItemDetalleMostrarOcultarLibroContable")) {
				jButtonMostrarOcultarLibroContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosLibroContable")) {
				jButtonNuevoGuardarCambiosLibroContableActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarLibroContable")) {
				jButtonNuevoGuardarCambiosLibroContableActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosLibroContable")) {
				jButtonNuevoGuardarCambiosLibroContableActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoLibroContable")) {
				jButtonCerrarReporteDinamicoLibroContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoLibroContable")) {
				jButtonGenerarReporteDinamicoLibroContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoLibroContable")) {
				
				jButtonGenerarExcelReporteDinamicoLibroContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionLibroContable")) {
				jButtonCerrarImportacionLibroContableActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionLibroContable")) {
				
				jButtonGenerarImportacionLibroContableActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionLibroContable")) {
				
				jButtonAbrirImportacionLibroContableActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesLibroContable")) {
				jComboBoxTiposAccionesLibroContableActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesLibroContable")) {
				jComboBoxTiposRelacionesLibroContableActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioLibroContable")) {
				jComboBoxTiposAccionesLibroContableActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarLibroContable")) {
				
				jComboBoxTiposSeleccionarLibroContableActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralLibroContable")) {
				jTextFieldValorCampoGeneralLibroContableActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByLibroContable")) {
				jButtonAbrirOrderByLibroContableActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarLibroContable")) {
				jButtonAbrirOrderByLibroContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByLibroContable")) {
				jButtonCerrarOrderByLibroContableActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLibroContableBusqueda")) {
				this.jButtonidLibroContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaLibroContableUpdate")) {
				this.jButtonid_empresaLibroContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaLibroContableBusqueda")) {
				this.jButtonid_empresaLibroContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoLibroContableBusqueda")) {
				this.jButtoncodigoLibroContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreLibroContableBusqueda")) {
				this.jButtonnombreLibroContableBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoLibroContable")) {
				this.jButtonBusquedaPorCodigoLibroContableActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreLibroContable")) {
				this.jButtonBusquedaPorNombreLibroContableActionPerformed(evt);
			}
			
			;
			
			
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessLibroContable();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLibroContableActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
				


				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LibroContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LibroContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			LibroContable librocontableLocal=null;
			
			if(!this.getEsControlTabla()) {
				librocontableLocal=this.librocontable;
			} else {
				librocontableLocal=this.librocontableAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
							
				
				


				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LibroContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LibroContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLibroContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableAnterior =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.librocontableAnterior =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
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
			
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			
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
			
			


			
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLibroContableActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
								
						
				


				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LibroContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LibroContable.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
								
				
				


				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LibroContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LibroContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLibroContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableAnterior =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.librocontableAnterior =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLibroContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableAnterior =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.librocontableAnterior =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLibroContableActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
							
				
				


				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LibroContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LibroContable.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLibroContableActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.librocontableAnterior =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.librocontableAnterior =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
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
			
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			
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
			
			


			
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLibroContableActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
								
				
				


				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LibroContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LibroContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLibroContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableAnterior =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.librocontableAnterior =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLibroContableActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
			
			this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLibroContableActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosLibroContable")) {
					jCheckBoxSeleccionarTodosLibroContableItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosLibroContable")) {
					jCheckBoxSeleccionadosLibroContableItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarLibroContable")) {
					
				}
				
				


				
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LibroContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LibroContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
												
				
				


				
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LibroContable.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LibroContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLibroContableActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.librocontableAnterior =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.librocontableAnterior =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLibroContableActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
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
			
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
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
			
			


			
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLibroContableActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LibroContable.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LibroContable.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.librocontable);
				
				this.actualizarInformacion("INFO_PADRE",false,this.librocontable);
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
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
				
				


				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LibroContable.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LibroContable.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLibroContableActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.librocontableAnterior =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.librocontableAnterior =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarLibroContable")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosLibroContableListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosLibroContable.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.librocontable =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.librocontable =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.librocontable);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarLibroContable")) {
				
				}
				
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarLibroContable")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosLibroContable.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarLibroContable")) {
			
			}
			
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessLibroContable();
			
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			
			if(sTipo.equals("NuevoLibroContable")) {
				jButtonNuevoLibroContableActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarLibroContable")) {
				jButtonDuplicarLibroContableActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarLibroContable")) {
				jButtonCopiarLibroContableActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormLibroContable")) {
				jButtonVerFormLibroContableActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesLibroContable")) {
				jButtonNuevoLibroContableActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarLibroContable")) {
				jButtonModificarLibroContableActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarLibroContable")) {
				jButtonActualizarLibroContableActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarLibroContable")) {
				jButtonEliminarLibroContableActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaLibroContable")) {
				jButtonGuardarCambiosLibroContableActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarLibroContable")) {
				jButtonCancelarLibroContableActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarLibroContable")) {
				jButtonCerrarLibroContableActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosLibroContable")) {
				jButtonGuardarCambiosLibroContableActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosLibroContable")) {
				jButtonNuevoGuardarCambiosLibroContableActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByLibroContable")) {
				jButtonAbrirOrderByLibroContableActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionLibroContable")) {
				jButtonRecargarInformacionLibroContableActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresLibroContable")) {
				jButtonAnterioresLibroContableActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesLibroContable")) {
				jButtonSiguientesLibroContableActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLibroContableBusqueda")) {
				this.jButtonidLibroContableBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaLibroContableUpdate")) {
				this.jButtonid_empresaLibroContableUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaLibroContableBusqueda")) {
				this.jButtonid_empresaLibroContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoLibroContableBusqueda")) {
				this.jButtoncodigoLibroContableBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreLibroContableBusqueda")) {
				this.jButtonnombreLibroContableBusquedaActionPerformed(evt);
			}
			
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessLibroContable();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameLibroContable")) {
				closingInternalFrameLibroContable();
				
			} else if(sTipo.equals("jButtonCancelarLibroContable")) {
				JInternalFrameBase jInternalFrameDetalleFormLibroContable = (JInternalFrameBase)evt.getSource();
	            	
	            LibroContableBeanSwingJInternalFrame jInternalFrameParent=(LibroContableBeanSwingJInternalFrame)jInternalFrameDetalleFormLibroContable.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarLibroContableActionPerformed(null);
			}
			
			LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.librocontable,new Object(),this.librocontableParameterGeneral,this.librocontableReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormLibroContable(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormLibroContable(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormLibroContable(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.librocontable)) {
			if(!esControlTabla) {
				if(LibroContableJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualLibroContable(this.librocontable,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);			
				}
				
				if(this.librocontableSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualLibroContable(this.librocontable,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.librocontableReturnGeneral=librocontableLogic.procesarEventosLibroContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.librocontableLogic.getLibroContables(),this.librocontable,this.librocontableParameterGeneral,this.isEsNuevoLibroContable,classes);//this.librocontableLogic.getLibroContable()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanLibroContable(this.librocontableReturnGeneral,this.librocontableBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.librocontableSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanLibroContable(classes,this.librocontableReturnGeneral,this.librocontableBean,false);
					}
						
					if(this.librocontableReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyLibroContable(this.librocontableReturnGeneral.getLibroContable());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioLibroContable(this.librocontableReturnGeneral.getLibroContable());	
					}
						
					if(this.librocontableReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioLibroContable(this.librocontableReturnGeneral.getLibroContable(),classes);//this.librocontableBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioLibroContable(this.librocontable,classes);//this.librocontableBean);									
				}
			
				if(LibroContableJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualLibroContable(this.librocontable,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLibroContable(this.librocontable);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.librocontableAnterior!=null) {
						this.librocontable=this.librocontableAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.librocontableReturnGeneral=librocontableLogic.procesarEventosLibroContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.librocontableLogic.getLibroContables(),this.librocontable,this.librocontableParameterGeneral,this.isEsNuevoLibroContable,classes);//this.librocontableLogic.getLibroContable()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.librocontableSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.librocontableSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.librocontableReturnGeneral.getLibroContable(),librocontableLogic.getLibroContables());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.librocontableReturnGeneral.getLibroContable(),this.librocontables);
				}
				//ARCHITECTURE
				
				//this.jTableDatosLibroContable.repaint();
				
				//((AbstractTableModel) this.jTableDatosLibroContable.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosLibroContable();
			}
		}
	}
	
	public void actualizarVisualTableDatosLibroContable() throws Exception {
		
		LibroContableModel librocontableModel=(LibroContableModel)this.jTableDatosLibroContable.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			librocontableModel.librocontables=this.librocontableLogic.getLibroContables();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			librocontableModel.librocontables=this.librocontables;
		}
		
		
		((LibroContableModel) this.jTableDatosLibroContable.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaLibroContable() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getlibrocontableAnterior(),this.librocontableLogic.getLibroContables());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getlibrocontableAnterior(),this.librocontables);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosLibroContable();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioLibroContable(LibroContable librocontable,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroFactuPrincipal.class)) {
					this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.setParametroFactuPrincipals(librocontable.getParametroFactuPrincipals());
					this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroFactuPrincipal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(librocontable.getDefinicions());
					this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
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
										
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.librocontable,new Object(),generalEntityParameterGeneral,this.librocontableReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.librocontableSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=LibroContableConstantesFunciones.getClassesRelationshipsOfLibroContable(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=LibroContableConstantesFunciones.getClassesRelationshipsFromStringsOfLibroContable(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormLibroContable(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				LibroContableBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.librocontable,new Object(),generalEntityParameterGeneral,this.librocontableReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioLibroContable(LibroContableBean librocontableBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroFactuPrincipal.class)) {
					this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.setParametroFactuPrincipals(librocontable.getParametroFactuPrincipals());
					this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroFactuPrincipal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(librocontable.getDefinicions());
					this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanLibroContable(ArrayList<Classe> classes,LibroContableReturnGeneral librocontableReturnGeneral,LibroContableBean librocontableBean,Boolean conDefault) throws Exception {
		
			this.librocontableBean.setParametroFactuPrincipals(librocontableReturnGeneral.getLibroContable().getParametroFactuPrincipals());
			this.librocontableBean.setDefinicions(librocontableReturnGeneral.getLibroContable().getDefinicions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualLibroContable(LibroContable librocontable,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroFactuPrincipal.class)) {
					librocontable.setParametroFactuPrincipals(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalLogic.getParametroFactuPrincipals());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					librocontable.setDefinicions(this.jInternalFrameDetalleFormLibroContable.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.librocontable)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormLibroContable = new LibroContableDetalleFormJInternalFrame(jDesktopPane,this.librocontableSessionBean.getConGuardarRelaciones(),this.librocontableSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormLibroContable);
		this.jInternalFrameDetalleFormLibroContable.setVisible(false);
		this.jInternalFrameDetalleFormLibroContable.setSelected(false);						
		
		this.jInternalFrameDetalleFormLibroContable.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormLibroContable.librocontableLogic=this.librocontableLogic;
		
		this.cargarCombosFrameForeignKeyLibroContable("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleLibroContable();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLibroContable();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyLibroContable("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyLibroContable();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormLibroContable.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLibroContable"));
		
		this.jInternalFrameDetalleFormLibroContable.jButtonModificarLibroContable.addActionListener(new ButtonActionListener(this,"ModificarLibroContable"));

		
		this.jInternalFrameDetalleFormLibroContable.jButtonModificarToolBarLibroContable.addActionListener(new ButtonActionListener(this,"ModificarToolBarLibroContable"));
					
		this.jInternalFrameDetalleFormLibroContable.jMenuItemModificarLibroContable.addActionListener(new ButtonActionListener(this,"MenuItemModificarLibroContable"));		
		
		
		
		this.jInternalFrameDetalleFormLibroContable.jButtonActualizarLibroContable.addActionListener (new ButtonActionListener(this,"ActualizarLibroContable"));
		
		
		this.jInternalFrameDetalleFormLibroContable.jButtonActualizarToolBarLibroContable.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLibroContable"));
						
		this.jInternalFrameDetalleFormLibroContable.jMenuItemActualizarLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLibroContable"));		
		
		
		
		this.jInternalFrameDetalleFormLibroContable.jButtonEliminarLibroContable.addActionListener (new ButtonActionListener(this,"EliminarLibroContable"));
		
		
		this.jInternalFrameDetalleFormLibroContable.jButtonEliminarToolBarLibroContable.addActionListener (new ButtonActionListener(this,"EliminarToolBarLibroContable"));
								
		this.jInternalFrameDetalleFormLibroContable.jMenuItemEliminarLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLibroContable"));		
		
		
		
		this.jInternalFrameDetalleFormLibroContable.jButtonCancelarLibroContable.addActionListener (new ButtonActionListener(this,"CancelarLibroContable"));
		
		
		this.jInternalFrameDetalleFormLibroContable.jButtonCancelarToolBarLibroContable.addActionListener (new ButtonActionListener(this,"CancelarToolBarLibroContable"));
					
		this.jInternalFrameDetalleFormLibroContable.jMenuItemCancelarLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLibroContable"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormLibroContable.jMenuItemDetalleCerrarLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLibroContable"));		
		
		
		
		this.jInternalFrameDetalleFormLibroContable.jButtonGuardarCambiosToolBarLibroContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLibroContable"));
		
		
		
		this.jInternalFrameDetalleFormLibroContable.jButtonGuardarCambiosToolBarLibroContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLibroContable"));
		
		
		
		this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLibroContable"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLibroContable.jButtonidLibroContableBusqueda.addActionListener(new ButtonActionListener(this,"idLibroContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLibroContable.jButtonid_empresaLibroContableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLibroContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLibroContable.jButtonid_empresaLibroContableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLibroContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLibroContable.jButtoncodigoLibroContableBusqueda.addActionListener(new ButtonActionListener(this,"codigoLibroContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLibroContable.jButtonnombreLibroContableBusqueda.addActionListener(new ButtonActionListener(this,"nombreLibroContableBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormLibroContable.jTabbedPaneRelacionesLibroContable.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLibroContable"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameLibroContable"));
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLibroContable.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLibroContable"));
		}
		
		this.jTableDatosLibroContable.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarLibroContable"));
		
		this.jTableDatosLibroContable.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarLibroContable"));
		
		this.jButtonNuevoLibroContable.addActionListener(new ButtonActionListener(this,"NuevoLibroContable"));
		
		this.jButtonDuplicarLibroContable.addActionListener(new ButtonActionListener(this,"DuplicarLibroContable"));
		
		this.jButtonCopiarLibroContable.addActionListener(new ButtonActionListener(this,"CopiarLibroContable"));
		
		this.jButtonVerFormLibroContable.addActionListener(new ButtonActionListener(this,"VerFormLibroContable"));
		
		
		this.jButtonNuevoToolBarLibroContable.addActionListener(new ButtonActionListener(this,"NuevoToolBarLibroContable"));
			
		this.jButtonDuplicarToolBarLibroContable.addActionListener(new ButtonActionListener(this,"DuplicarToolBarLibroContable"));
			
		this.jMenuItemNuevoLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemNuevoLibroContable"));
			
		this.jMenuItemDuplicarLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarLibroContable"));		
		
		
		this.jButtonNuevoRelacionesLibroContable.addActionListener (new ButtonActionListener(this,"NuevoRelacionesLibroContable"));
		
		
		this.jButtonNuevoRelacionesToolBarLibroContable.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarLibroContable"));
			
		this.jMenuItemNuevoRelacionesLibroContable.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesLibroContable"));		
		
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLibroContable.jButtonModificarLibroContable.addActionListener(new ButtonActionListener(this,"ModificarLibroContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLibroContable.jButtonModificarToolBarLibroContable.addActionListener(new ButtonActionListener(this,"ModificarToolBarLibroContable"));
			
			this.jInternalFrameDetalleFormLibroContable.jMenuItemModificarLibroContable.addActionListener(new ButtonActionListener(this,"MenuItemModificarLibroContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormLibroContable.jButtonActualizarLibroContable.addActionListener (new ButtonActionListener(this,"ActualizarLibroContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLibroContable.jButtonActualizarToolBarLibroContable.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLibroContable"));
				
			this.jInternalFrameDetalleFormLibroContable.jMenuItemActualizarLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLibroContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLibroContable.jButtonEliminarLibroContable.addActionListener (new ButtonActionListener(this,"EliminarLibroContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLibroContable.jButtonEliminarToolBarLibroContable.addActionListener (new ButtonActionListener(this,"EliminarToolBarLibroContable"));
						
			this.jInternalFrameDetalleFormLibroContable.jMenuItemEliminarLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLibroContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLibroContable.jButtonCancelarLibroContable.addActionListener (new ButtonActionListener(this,"CancelarLibroContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLibroContable.jButtonCancelarToolBarLibroContable.addActionListener (new ButtonActionListener(this,"CancelarToolBarLibroContable"));
			
			this.jInternalFrameDetalleFormLibroContable.jMenuItemCancelarLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLibroContable"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarLibroContable.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarLibroContable"));		
		
		
		this.jButtonCerrarLibroContable.addActionListener (new ButtonActionListener(this,"CerrarLibroContable"));
		
		
		this.jButtonCerrarToolBarLibroContable.addActionListener (new ButtonActionListener(this,"CerrarToolBarLibroContable"));
			
		this.jMenuItemCerrarLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemCerrarLibroContable"));
			
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLibroContable.jMenuItemDetalleCerrarLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLibroContable"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLibroContable.jButtonGuardarCambiosLibroContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosLibroContable"));
		}
		
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLibroContable.jButtonGuardarCambiosToolBarLibroContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLibroContable"));
		}
		
		this.jButtonCopiarToolBarLibroContable.addActionListener (new ButtonActionListener(this,"CopiarToolBarLibroContable"));
			
		this.jButtonVerFormToolBarLibroContable.addActionListener (new ButtonActionListener(this,"VerFormToolBarLibroContable"));
		
		this.jMenuItemGuardarCambiosLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosLibroContable"));
			
		this.jMenuItemCopiarLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemCopiarLibroContable"));		
		
		this.jMenuItemVerFormLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemVerFormLibroContable"));		
		
		
		this.jButtonGuardarCambiosTablaLibroContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLibroContable"));
		
		
		this.jButtonGuardarCambiosTablaToolBarLibroContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarLibroContable"));
			
		this.jMenuItemGuardarCambiosTablaLibroContable.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLibroContable"));		
		
		
		
		this.jButtonRecargarInformacionLibroContable.addActionListener (new ButtonActionListener(this,"RecargarInformacionLibroContable"));
					
		this.jButtonRecargarInformacionToolBarLibroContable.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarLibroContable"));
		
		this.jMenuItemRecargarInformacionLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionLibroContable"));		
		
		
		
		this.jButtonAnterioresLibroContable.addActionListener (new ButtonActionListener(this,"AnterioresLibroContable"));
		
		
		this.jButtonAnterioresToolBarLibroContable.addActionListener (new ButtonActionListener(this,"AnterioresToolBarLibroContable"));
		
		this.jMenuItemAnterioresLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresLibroContable"));		
		
		
		this.jButtonSiguientesLibroContable.addActionListener (new ButtonActionListener(this,"SiguientesLibroContable"));
		
		
		this.jButtonSiguientesToolBarLibroContable.addActionListener (new ButtonActionListener(this,"SiguientesToolBarLibroContable"));
			
		this.jMenuItemSiguientesLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesLibroContable"));
			
		this.jMenuItemAbrirOrderByLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByLibroContable"));
			
		this.jMenuItemMostrarOcultarLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarLibroContable"));
			
		this.jMenuItemDetalleAbrirOrderByLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByLibroContable"));
			
		this.jMenuItemDetalleMostarOcultarLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarLibroContable"));		
		
		
		this.jButtonNuevoGuardarCambiosLibroContable.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosLibroContable"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarLibroContable.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarLibroContable"));
			
		this.jMenuItemNuevoGuardarCambiosLibroContable.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosLibroContable"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosLibroContable.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosLibroContable"));

		this.jCheckBoxSeleccionadosLibroContable.addItemListener(new CheckBoxItemListener(this,"SeleccionadosLibroContable"));
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLibroContable"));
		}
		
		
		this.jComboBoxTiposRelacionesLibroContable.addActionListener (new ButtonActionListener(this,"TiposRelacionesLibroContable"));
			
		this.jComboBoxTiposAccionesLibroContable.addActionListener (new ButtonActionListener(this,"TiposAccionesLibroContable"));
					
		this.jComboBoxTiposSeleccionarLibroContable.addActionListener (new ButtonActionListener(this,"TiposSeleccionarLibroContable"));
			
		this.jTextFieldValorCampoGeneralLibroContable.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralLibroContable"));		
		
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLibroContable.jButtonidLibroContableBusqueda.addActionListener(new ButtonActionListener(this,"idLibroContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLibroContable.jButtonid_empresaLibroContableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLibroContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLibroContable.jButtonid_empresaLibroContableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLibroContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLibroContable.jButtoncodigoLibroContableBusqueda.addActionListener(new ButtonActionListener(this,"codigoLibroContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLibroContable.jButtonnombreLibroContableBusqueda.addActionListener(new ButtonActionListener(this,"nombreLibroContableBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoLibroContable.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoLibroContable"));

			this.jButtonBusquedaPorNombreLibroContable.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreLibroContable"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoLibroContable!=null) {
				this.jInternalFrameReporteDinamicoLibroContable.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLibroContable"));
				this.jInternalFrameReporteDinamicoLibroContable.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLibroContable"));
				this.jInternalFrameReporteDinamicoLibroContable.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLibroContable"));
			}
			
			//this.jButtonCerrarReporteDinamicoLibroContable.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLibroContable"));				
			//this.jButtonGenerarReporteDinamicoLibroContable.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLibroContable"));
			//this.jButtonGenerarExcelReporteDinamicoLibroContable.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLibroContable"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionLibroContable!=null) {
				this.jInternalFrameImportacionLibroContable.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLibroContable"));
				this.jInternalFrameImportacionLibroContable.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLibroContable"));
				this.jInternalFrameImportacionLibroContable.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLibroContable"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByLibroContable.addActionListener (new ButtonActionListener(this,"AbrirOrderByLibroContable"));
			
			this.jButtonAbrirOrderByToolBarLibroContable.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarLibroContable"));			
			
			if(this.jInternalFrameOrderByLibroContable!=null) {
				this.jInternalFrameOrderByLibroContable.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLibroContable"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormLibroContable!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLibroContable.jTabbedPaneRelacionesLibroContable.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLibroContable"));
		
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
            		closingInternalFrameLibroContable();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormLibroContable.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormLibroContable = (JInternalFrameBase)event.getSource();
	            	
	            LibroContableBeanSwingJInternalFrame jInternalFrameParent=(LibroContableBeanSwingJInternalFrame)jInternalFrameDetalleFormLibroContable.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarLibroContableActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosLibroContable.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosLibroContableListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosLibroContable.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosLibroContable.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLibroContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLibroContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLibroContableActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoLibroContable";
		inputMap = this.jButtonNuevoLibroContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoLibroContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLibroContableActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLibroContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLibroContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLibroContableActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesLibroContable";
		inputMap = this.jButtonNuevoRelacionesLibroContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesLibroContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLibroContableActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarLibroContable";
		inputMap = this.jButtonModificarLibroContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarLibroContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarLibroContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarLibroContable";
		inputMap = this.jButtonActualizarLibroContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarLibroContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarLibroContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarLibroContable";
		inputMap = this.jButtonEliminarLibroContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarLibroContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarLibroContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarLibroContable";
		inputMap = this.jButtonCancelarLibroContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarLibroContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarLibroContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarLibroContable";
		inputMap = this.jButtonCerrarLibroContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarLibroContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarLibroContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormLibroContable.jButtonGuardarCambiosLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosLibroContable";
		inputMap = this.jInternalFrameDetalleFormLibroContable.jButtonGuardarCambiosLibroContable.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormLibroContable.jButtonGuardarCambiosLibroContable.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosLibroContableActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosLibroContable.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosLibroContableItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesLibroContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesLibroContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarLibroContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarLibroContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralLibroContable.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralLibroContableActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLibroContable.jButtonidLibroContableBusqueda.addActionListener(new ButtonActionListener(this,"idLibroContableBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLibroContable.jButtonid_empresaLibroContableUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLibroContableUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLibroContable.jButtonid_empresaLibroContableBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLibroContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLibroContable.jButtoncodigoLibroContableBusqueda.addActionListener(new ButtonActionListener(this,"codigoLibroContableBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLibroContable.jButtonnombreLibroContableBusqueda.addActionListener(new ButtonActionListener(this,"nombreLibroContableBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoLibroContable.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoLibroContable"));

		this.jButtonBusquedaPorNombreLibroContable.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreLibroContable"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionLibroContable.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionLibroContableActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarLibroContableActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarLibroContable.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosLibroContable(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(LibroContable librocontableAux:this.librocontableLogic.getLibroContables()) {
					librocontableAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LibroContable librocontableAux:librocontables) {
					librocontableAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosLibroContableItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLibroContable(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(LibroContable librocontableAux:this.librocontableLogic.getLibroContables()) {
						librocontableAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LibroContable librocontableAux:librocontables) {
						librocontableAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(LibroContable librocontableAux:this.librocontableLogic.getLibroContables()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LibroContable librocontableAux:librocontables) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaLibroContable(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLibroContable.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLibroContable.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLibroContable,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosLibroContableItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLibroContable(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosLibroContable.getSelectedRows();
			
			LibroContable librocontableLocal=new LibroContable();
			
			//this.seleccionarTodosLibroContable(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					librocontableLocal =(LibroContable) this.librocontableLogic.getLibroContables().toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					librocontableLocal =(LibroContable) this.librocontables.toArray()[this.jTableDatosLibroContable.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				librocontableLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(LibroContable librocontableAux:this.librocontableLogic.getLibroContables()) {
						librocontableAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LibroContable librocontableAux:librocontables) {
						librocontableAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaLibroContable(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLibroContable.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLibroContable.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLibroContable,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualLibroContableItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarLibroContableParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralLibroContableActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingLibroContable(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralLibroContable.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(LibroContable librocontableAux:this.librocontableLogic.getLibroContables()) {
				
						if(sTipoSeleccionar.equals(LibroContableConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							librocontableAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LibroContableConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							librocontableAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LibroContable librocontableAux:librocontables) {
					
						if(sTipoSeleccionar.equals(LibroContableConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							librocontableAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LibroContableConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							librocontableAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaLibroContable(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesLibroContableActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingLibroContable(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioLibroContable=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesLibroContable.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteLibroContable) {				
					conSplash=true;//false;										
					
					//this.startProcessLibroContable(conSplash);
				
					this.generarReporteLibroContablesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLibroContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoLibroContablesSeleccionados();
				//this.jComboBoxTiposAccionesLibroContable.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLibroContablesSeleccionados(false);
				//this.jComboBoxTiposAccionesLibroContable.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLibroContablesSeleccionados(true);
				//this.jComboBoxTiposAccionesLibroContable.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLibroContable();
				
				this.exportarLibroContablesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLibroContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionLibroContables();
				//this.importarLibroContables();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLibroContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLibroContable();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelLibroContablesSeleccionados();
				//this.jComboBoxTiposAccionesLibroContable.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Libro Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessLibroContable();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoLibroContable)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyLibroContable(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Libro Contable",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLibroContable.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.setSelectedIndex(0);					
				}	
			} 			
			else if(LibroContableBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteLibroContable) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessLibroContable(conSplash);
					
						//this.actualizarParametrosGeneralLibroContable();
						
						this.generarReporteProcesoAccionLibroContablesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesLibroContable.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(LibroContableBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Libro ContableS SELECCIONADOS?", "MANTENIMIENTO DE Libro Contable", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessLibroContable();
				
						this.actualizarParametrosGeneralLibroContable();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.librocontableReturnGeneral=librocontableLogic.procesarAccionLibroContablesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.librocontableLogic.getLibroContables(),this.librocontableParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarLibroContableReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesLibroContable.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralLibroContable();
					
					LibroContableBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarLibroContableReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesLibroContable.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormLibroContable.jComboBoxTiposAccionesFormularioLibroContable.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessLibroContable(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesLibroContableActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessLibroContable();
			
			if(this.jInternalFrameDetalleFormLibroContable==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<LibroContable> librocontablesSeleccionados=new ArrayList<LibroContable>();		
			LibroContable librocontable=new LibroContable();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingLibroContable(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesLibroContable.getSelectedItem();
			
			
			
			
			librocontablesSeleccionados=this.getLibroContablesSeleccionados(true);
			//this.sTipoAccion;
			
			if(librocontablesSeleccionados.size()==1) {
				for(LibroContable librocontableAux:librocontablesSeleccionados) {
					librocontable=librocontableAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Parametro Principal ")) {
					jButtonParametroFactuPrincipalActionPerformed(null,rowIndex,true,false,librocontable);
				}
				else if(this.sTipoRelacion.equals("Definicion")) {
					jButtonDefinicionActionPerformed(null,rowIndex,true,false,librocontable);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessLibroContable();
			
      		//this.finishProcessLibroContable(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarLibroContableReturnGeneral() throws Exception {
		if(this.librocontableReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.librocontableReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.librocontableReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.librocontableReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.librocontableReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.librocontableReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingLibroContable(false);
		}
		
		if(this.librocontableReturnGeneral.getConRetornoLista() || this.librocontableReturnGeneral.getConRetornoObjeto()) {
			if(this.librocontableReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.librocontableLogic.setLibroContables(this.librocontableReturnGeneral.getLibroContables());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.librocontableReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.librocontableLogic.setLibroContable(this.librocontableReturnGeneral.getLibroContable());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingLibroContable(false);
		}
	}
	
	public void actualizarParametrosGeneralLibroContable() throws Exception {
		
		
	}
	
	public ArrayList<LibroContable> getLibroContablesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<LibroContable> librocontablesSeleccionados=new ArrayList<LibroContable>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioLibroContable) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(LibroContable librocontableAux:librocontableLogic.getLibroContables()) {
					if(librocontableAux.getIsSelected()) {
						librocontablesSeleccionados.add(librocontableAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LibroContable librocontableAux:this.librocontables) {
					if(librocontableAux.getIsSelected()) {
						librocontablesSeleccionados.add(librocontableAux);				
					}
				}
			}
			
			if(librocontablesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						librocontablesSeleccionados.addAll(this.librocontableLogic.getLibroContables());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						librocontablesSeleccionados.addAll(this.librocontables);				
					}
				}
			}
		} else {
			librocontablesSeleccionados.add(this.librocontable);
		}
		
		return librocontablesSeleccionados;
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
	
	public void generarReporteLibroContablesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalLibroContablesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoLibroContablesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLibroContablesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLibroContablesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesLibroContablesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Libro Contable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesLibroContablesSeleccionados() throws Exception {
		ArrayList<LibroContable> librocontablesSeleccionados=new ArrayList<LibroContable>();		
		
		librocontablesSeleccionados=this.getLibroContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteLibroContables("Todos",librocontablesSeleccionados);
		
	}	
	
	public void generarReporteNormalLibroContablesSeleccionados() throws Exception {
		ArrayList<LibroContable> librocontablesSeleccionados=new ArrayList<LibroContable>();		
		
		librocontablesSeleccionados=this.getLibroContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteLibroContables("Todos",librocontablesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionLibroContablesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<LibroContable> librocontablesSeleccionados=new ArrayList<LibroContable>();
		
		librocontablesSeleccionados=this.getLibroContablesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteLibroContables("Todos",librocontablesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoLibroContablesSeleccionados() throws Exception {
		ArrayList<LibroContable> librocontablesSeleccionados=new ArrayList<LibroContable>();		
		
		
		this.abrirInicializarFrameReporteDinamicoLibroContable();
		
		
		librocontablesSeleccionados=this.getLibroContablesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoLibroContable();
		
		
		//this.generarReporteLibroContables("Todos",librocontablesSeleccionados ,librocontableImplementable,librocontableImplementableHome);
	}
	
	public void mostrarImportacionLibroContables() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionLibroContable();
		
		this.abrirFrameImportacionLibroContable();		
		
			
		//this.generarReporteLibroContables("Todos",librocontablesSeleccionados ,librocontableImplementable,librocontableImplementableHome);
	}
	
	public void importarLibroContables() throws Exception {		
	
	}
	
	public void exportarLibroContablesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelLibroContablesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoLibroContablesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlLibroContablesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Libro Contable",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoLibroContablesSeleccionados() throws Exception {
		ArrayList<LibroContable> librocontablesSeleccionados=new ArrayList<LibroContable>();		
		
		librocontablesSeleccionados=this.getLibroContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"librocontable."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarLibroContable(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(LibroContable librocontableAux:librocontablesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarLibroContable(librocontableAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//librocontableAux.setsDetalleGeneralEntityReporte(librocontableAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.librocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Libro Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarLibroContable(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=LibroContableConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LibroContableConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LibroContableConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LibroContableConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LibroContableConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarLibroContable(LibroContable librocontable,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=librocontable.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=librocontable.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=librocontable.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=librocontable.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=librocontable.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelLibroContablesSeleccionados() throws Exception {
		ArrayList<LibroContable> librocontablesSeleccionados=new ArrayList<LibroContable>();		
		
		librocontablesSeleccionados=this.getLibroContablesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"librocontable.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("LibroContables");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelLibroContable(row);				
				iRow++;
			}				
			
			for(LibroContable librocontableAux:librocontablesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelLibroContable(librocontableAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.librocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Libro Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlLibroContablesSeleccionados() throws Exception {
		ArrayList<LibroContable> librocontablesSeleccionados=new ArrayList<LibroContable>();		
		
		librocontablesSeleccionados=this.getLibroContablesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"librocontable.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("librocontables");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("librocontable");
			//elementRoot.appendChild(element);
		
			for(LibroContable librocontableAux:librocontablesSeleccionados) {
				element = document.createElement("librocontable");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlLibroContable(librocontableAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.librocontableSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Libro Contable",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelLibroContable(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(LibroContableConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(LibroContableConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(LibroContableConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(LibroContableConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(LibroContableConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelLibroContable(LibroContable librocontable,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(librocontable.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(librocontable.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(librocontable.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(librocontable.getnombre());				
	}
	
	public void setFilaDatosExportarXmlLibroContable(LibroContable librocontable,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(LibroContableConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(librocontable.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(LibroContableConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(librocontable.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(LibroContableConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(librocontable.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(LibroContableConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(librocontable.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(LibroContableConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(librocontable.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoLibroContablesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<LibroContable> librocontablesSeleccionados=new ArrayList<LibroContable>();
		
		librocontablesSeleccionados=this.getLibroContablesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoLibroContable(librocontablesSeleccionados);
		
		this.generarReporteLibroContables("Todos",librocontablesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoLibroContable(ArrayList<LibroContable> librocontablesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(LibroContable librocontableAux:librocontablesSeleccionados) {
				librocontableAux.setsDetalleGeneralEntityReporte(librocontableAux.toString());
			
				if(sTipoSeleccionar.equals(LibroContableConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					librocontableAux.setsDescripcionGeneralEntityReporte1(librocontableAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LibroContableConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					librocontableAux.setsDescripcionGeneralEntityReporte1(librocontableAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(LibroContableConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					librocontableAux.setsDescripcionGeneralEntityReporte1(librocontableAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LibroContableConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesLibroContable(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoLibroContable=true;
				this.isVisibilidadCeldaNuevoRelacionesLibroContable=true;
				this.isVisibilidadCeldaGuardarCambiosLibroContable=true;
			}
			
			this.isVisibilidadCeldaModificarLibroContable=false;
			this.isVisibilidadCeldaActualizarLibroContable=false;
			this.isVisibilidadCeldaEliminarLibroContable=false;
			this.isVisibilidadCeldaCancelarLibroContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLibroContable=true;
				} else {
					this.isVisibilidadCeldaGuardarLibroContable=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoLibroContable=false;
			this.isVisibilidadCeldaNuevoRelacionesLibroContable=false;
			this.isVisibilidadCeldaGuardarCambiosLibroContable=false;
			this.isVisibilidadCeldaModificarLibroContable=false;
			this.isVisibilidadCeldaActualizarLibroContable=true;
			this.isVisibilidadCeldaEliminarLibroContable=false;
			this.isVisibilidadCeldaCancelarLibroContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLibroContable=true;
				} else {
					this.isVisibilidadCeldaGuardarLibroContable=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoLibroContable=false;
			this.isVisibilidadCeldaNuevoRelacionesLibroContable=false;
			this.isVisibilidadCeldaGuardarCambiosLibroContable=false;
			this.isVisibilidadCeldaModificarLibroContable=false;
			this.isVisibilidadCeldaActualizarLibroContable=true;
			this.isVisibilidadCeldaEliminarLibroContable=true;
			this.isVisibilidadCeldaCancelarLibroContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLibroContable=true;
				} else {
					this.isVisibilidadCeldaGuardarLibroContable=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoLibroContable=false;
			this.isVisibilidadCeldaNuevoRelacionesLibroContable=false;
			this.isVisibilidadCeldaGuardarCambiosLibroContable=false;
			this.isVisibilidadCeldaModificarLibroContable=false;
			this.isVisibilidadCeldaActualizarLibroContable=true;
			this.isVisibilidadCeldaEliminarLibroContable=false;
			this.isVisibilidadCeldaCancelarLibroContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLibroContable=false;
				} else {
					this.isVisibilidadCeldaGuardarLibroContable=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoLibroContable=true;
			this.isVisibilidadCeldaNuevoRelacionesLibroContable=true;
			this.isVisibilidadCeldaGuardarCambiosLibroContable=true;
			this.isVisibilidadCeldaModificarLibroContable=false;
			this.isVisibilidadCeldaActualizarLibroContable=false;
			this.isVisibilidadCeldaEliminarLibroContable=false;
			this.isVisibilidadCeldaCancelarLibroContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLibroContable=true;
				} else {
					this.isVisibilidadCeldaGuardarLibroContable=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoLibroContable=false;
			this.isVisibilidadCeldaNuevoRelacionesLibroContable=false;
			this.isVisibilidadCeldaGuardarCambiosLibroContable=false;
			this.isVisibilidadCeldaActualizarLibroContable=false;
			this.isVisibilidadCeldaEliminarLibroContable=false;
			this.isVisibilidadCeldaCancelarLibroContable=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLibroContable=false;
				} else {
					this.isVisibilidadCeldaGuardarLibroContable=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoLibroContable=false;
			this.isVisibilidadCeldaNuevoRelacionesLibroContable=false;
			this.isVisibilidadCeldaGuardarCambiosLibroContable=false;
			this.isVisibilidadCeldaModificarLibroContable=true;
			this.isVisibilidadCeldaActualizarLibroContable=false;
			this.isVisibilidadCeldaEliminarLibroContable=false;
			this.isVisibilidadCeldaCancelarLibroContable=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLibroContable=false;
				} else {
					this.isVisibilidadCeldaGuardarLibroContable=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(LibroContableJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoLibroContable=true;
			this.isVisibilidadCeldaNuevoRelacionesLibroContable=true;
			this.isVisibilidadCeldaGuardarCambiosLibroContable=true;
		} else {
			this.actualizarEstadoPanelsLibroContable(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarLibroContable=false;
			//this.isVisibilidadCeldaVerFormLibroContable=false;
			this.isVisibilidadCeldaDuplicarLibroContable=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!librocontableSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesLibroContable=false;
		} else {
			this.isVisibilidadCeldaNuevoLibroContable=false;
			this.isVisibilidadCeldaGuardarCambiosLibroContable=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(librocontableSessionBean.getEsGuardarRelacionado()) {
			if(!librocontableSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesLibroContable=false;												
			}
			
			this.jButtonCerrarLibroContable.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesLibroContable=false;
		}
		
		if(!this.permiteMantenimiento(this.librocontable)) {
			this.isVisibilidadCeldaActualizarLibroContable=false;
			this.isVisibilidadCeldaEliminarLibroContable=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesLibroContable() {
		this.isVisibilidadCeldaNuevoLibroContable=false;
		this.isVisibilidadCeldaGuardarCambiosLibroContable=false;
	}
	
	public void actualizarEstadoPanelsLibroContable(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionLibroContable!=null) {
				this.jScrollPanelDatosEdicionLibroContable.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLibroContable!=null) {
				this.jTabbedPaneBusquedasLibroContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLibroContable!=null) {
				this.jScrollPanelDatosLibroContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionLibroContable!=null) {
				this.jPanelPaginacionLibroContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLibroContable!=null) {
				this.jPanelParametrosReportesLibroContable.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionLibroContable!=null) {
				this.jScrollPanelDatosEdicionLibroContable.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLibroContable!=null) {
				this.jTabbedPaneBusquedasLibroContable.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosLibroContable!=null) {
				this.jScrollPanelDatosLibroContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionLibroContable!=null) {
				this.jPanelPaginacionLibroContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLibroContable!=null) {
				this.jPanelParametrosReportesLibroContable.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionLibroContable!=null) {
				this.jScrollPanelDatosEdicionLibroContable.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLibroContable!=null) {
				this.jTabbedPaneBusquedasLibroContable.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLibroContable!=null) {
				this.jScrollPanelDatosLibroContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionLibroContable!=null) {
				this.jPanelPaginacionLibroContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLibroContable!=null) {
				this.jPanelParametrosReportesLibroContable.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionLibroContable!=null) {
				this.jScrollPanelDatosEdicionLibroContable.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLibroContable!=null) {
				this.jTabbedPaneBusquedasLibroContable.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLibroContable!=null) {
				this.jScrollPanelDatosLibroContable.setVisible(false);
			}
			
			if(this.jPanelPaginacionLibroContable!=null) {
				this.jPanelPaginacionLibroContable.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLibroContable!=null) {
				this.jPanelParametrosReportesLibroContable.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionLibroContable!=null) {
				this.jScrollPanelDatosEdicionLibroContable.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLibroContable!=null) {
				this.jTabbedPaneBusquedasLibroContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLibroContable!=null) {
				this.jScrollPanelDatosLibroContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionLibroContable!=null) {
				this.jPanelPaginacionLibroContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLibroContable!=null) {
				this.jPanelParametrosReportesLibroContable.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionLibroContable!=null) {
				this.jScrollPanelDatosEdicionLibroContable.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLibroContable!=null) {
				this.jTabbedPaneBusquedasLibroContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLibroContable!=null) {
				this.jScrollPanelDatosLibroContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionLibroContable!=null) {
				this.jPanelPaginacionLibroContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLibroContable!=null) {
				this.jPanelParametrosReportesLibroContable.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionLibroContable!=null) {
				this.jScrollPanelDatosEdicionLibroContable.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLibroContable!=null) {
				this.jTabbedPaneBusquedasLibroContable.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLibroContable!=null) {
				this.jScrollPanelDatosLibroContable.setVisible(true);
			}
			
			if(this.jPanelPaginacionLibroContable!=null) {
				this.jPanelPaginacionLibroContable.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLibroContable!=null) {
				this.jPanelParametrosReportesLibroContable.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.librocontableSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasLibroContable!=null) {
					this.jTabbedPaneBusquedasLibroContable.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesLibroContable!=null) {
				this.jPanelParametrosReportesLibroContable.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.librocontableSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLibroContable!=null) {
				this.jTabbedPaneBusquedasLibroContable.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesLibroContable!=null) {
				this.jPanelParametrosReportesLibroContable.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasLibroContable.remove(jPanelBusquedaPorCodigoLibroContable);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasLibroContable.remove(jPanelBusquedaPorNombreLibroContable);}
		}
		
	}
	
	

	public String registrarSesionLibroContableParaParametroFactuPrincipals() throws Exception {
		Boolean isPaginaPopupParametroFactuPrincipal=false;

		try {

			if(this.librocontableSessionBean==null) {
				this.librocontableSessionBean=new LibroContableSessionBean();
			}

			if(this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalSessionBean==null) {
				this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalSessionBean=new ParametroFactuPrincipalSessionBean();
			}

			this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalSessionBean.setsPathNavegacionActual(librocontableSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroFactuPrincipal=this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal(true);
			this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroFactuPrincipal(LibroContableConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalSessionBean.setisBusquedaDesdeForeignKeySesionLibroContable(true);
			this.jInternalFrameDetalleFormLibroContable.parametrofactuprincipalSessionBean.setlidLibroContableActual(this.idLibroContableActual);

			librocontableSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLibroContable(true);
			librocontableSessionBean.setlIdLibroContableActualForeignKey(this.idLibroContableActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionLibroContableParaDefiniciones() throws Exception {
		Boolean isPaginaPopupDefinicion=false;

		try {

			if(this.librocontableSessionBean==null) {
				this.librocontableSessionBean=new LibroContableSessionBean();
			}

			if(this.jInternalFrameDetalleFormLibroContable.definicionSessionBean==null) {
				this.jInternalFrameDetalleFormLibroContable.definicionSessionBean=new DefinicionSessionBean();
			}

			this.jInternalFrameDetalleFormLibroContable.definicionSessionBean.setsPathNavegacionActual(librocontableSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DefinicionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormLibroContable.definicionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDefinicion=this.jInternalFrameDetalleFormLibroContable.definicionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormLibroContable.definicionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDefinicion(true);
			this.jInternalFrameDetalleFormLibroContable.definicionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion(LibroContableConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormLibroContable.definicionSessionBean.setisBusquedaDesdeForeignKeySesionLibroContable(true);
			this.jInternalFrameDetalleFormLibroContable.definicionSessionBean.setlidLibroContableActual(this.idLibroContableActual);

			librocontableSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyLibroContable(true);
			librocontableSessionBean.setlIdLibroContableActualForeignKey(this.idLibroContableActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//LibroContableSessionBean librocontableSessionBean=new LibroContableSessionBean();
		
		if(this.librocontableSessionBean==null) {
			this.librocontableSessionBean=new LibroContableSessionBean();
		}
		
		this.librocontableSessionBean.setsUltimaBusquedaLibroContable(this.getsAccionBusqueda());
		this.librocontableSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.librocontableSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			librocontableSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			librocontableSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			librocontableSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//LibroContableSessionBean librocontableSessionBean=new LibroContableSessionBean();
		
		if(this.librocontableSessionBean==null) {
			this.librocontableSessionBean=new LibroContableSessionBean();
		}
		
		if(this.librocontableSessionBean.getsUltimaBusquedaLibroContable()!=null&&!this.librocontableSessionBean.getsUltimaBusquedaLibroContable().equals("")) {
			this.setsAccionBusqueda(librocontableSessionBean.getsUltimaBusquedaLibroContable());
			this.setiNumeroPaginacion(librocontableSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(librocontableSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(librocontableSessionBean.getcodigo());
				librocontableSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(librocontableSessionBean.getnombre());
				librocontableSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(librocontableSessionBean.getid_empresa());
				librocontableSessionBean.setid_empresa(-1L);
			}
		}
		
		this.librocontableSessionBean.setsUltimaBusquedaLibroContable("");
		this.librocontableSessionBean.setiNumeroPaginacion(LibroContableConstantesFunciones.INUMEROPAGINACION);
		this.librocontableSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaLibroContable(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioLibroContable() {
		this.updateBorderResaltarBusquedasFormularioLibroContable();
		this.updateVisibilidadBusquedasFormularioLibroContable();
		this.updateHabilitarBusquedasFormularioLibroContable();
	}
	
	public void updateBorderResaltarBusquedasFormularioLibroContable() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasLibroContable.getComponents().length>0) {
	

		if(this.librocontableConstantesFunciones.resaltarBusquedaPorCodigoLibroContable!=null) {
			index= this.jTabbedPaneBusquedasLibroContable.indexOfComponent(this.jPanelBusquedaPorCodigoLibroContable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLibroContable.getComponent(index);
				jPanel.setBorder(this.librocontableConstantesFunciones.resaltarBusquedaPorCodigoLibroContable);
			}
		}

		if(this.librocontableConstantesFunciones.resaltarBusquedaPorNombreLibroContable!=null) {
			index= this.jTabbedPaneBusquedasLibroContable.indexOfComponent(this.jPanelBusquedaPorNombreLibroContable);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLibroContable.getComponent(index);
				jPanel.setBorder(this.librocontableConstantesFunciones.resaltarBusquedaPorNombreLibroContable);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioLibroContable() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasLibroContable.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLibroContable.indexOfComponent(this.jPanelBusquedaPorCodigoLibroContable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLibroContable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.librocontableConstantesFunciones.mostrarBusquedaPorCodigoLibroContable);
			if(!this.librocontableConstantesFunciones.mostrarBusquedaPorCodigoLibroContable && index>-1) {
				this.jTabbedPaneBusquedasLibroContable.remove(index);
			}

			index= this.jTabbedPaneBusquedasLibroContable.indexOfComponent(this.jPanelBusquedaPorNombreLibroContable);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLibroContable.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.librocontableConstantesFunciones.mostrarBusquedaPorNombreLibroContable);
			if(!this.librocontableConstantesFunciones.mostrarBusquedaPorNombreLibroContable && index>-1) {
				this.jTabbedPaneBusquedasLibroContable.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioLibroContable() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasLibroContable.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLibroContable.indexOfComponent(this.jPanelBusquedaPorCodigoLibroContable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLibroContable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.librocontableConstantesFunciones.activarBusquedaPorCodigoLibroContable);
				this.jTabbedPaneBusquedasLibroContable.setEnabledAt(index,this.librocontableConstantesFunciones.activarBusquedaPorCodigoLibroContable);
			}

			index= this.jTabbedPaneBusquedasLibroContable.indexOfComponent(this.jPanelBusquedaPorNombreLibroContable);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLibroContable.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.librocontableConstantesFunciones.activarBusquedaPorNombreLibroContable);
				this.jTabbedPaneBusquedasLibroContable.setEnabledAt(index,this.librocontableConstantesFunciones.activarBusquedaPorNombreLibroContable);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaLibroContable(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasLibroContable.indexOfComponent(this.jPanelBusquedaPorCodigoLibroContable);

			this.jTabbedPaneBusquedasLibroContable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLibroContable.getComponent(index);

			this.librocontableConstantesFunciones.setResaltarBusquedaPorCodigoLibroContable(resaltar);

			jPanel.setBorder(this.librocontableConstantesFunciones.resaltarBusquedaPorCodigoLibroContable);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasLibroContable.indexOfComponent(this.jPanelBusquedaPorNombreLibroContable);

			this.jTabbedPaneBusquedasLibroContable.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLibroContable.getComponent(index);

			this.librocontableConstantesFunciones.setResaltarBusquedaPorNombreLibroContable(resaltar);

			jPanel.setBorder(this.librocontableConstantesFunciones.resaltarBusquedaPorNombreLibroContable);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarLibroContable.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioLibroContable() throws Exception {

		if(this.jInternalFrameDetalleFormLibroContable==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioLibroContable();
		this.updateVisibilidadResaltarControlesFormularioLibroContable();
		this.updateHabilitarResaltarControlesFormularioLibroContable();
		
	}
	
	public void updateBorderResaltarControlesFormularioLibroContable() throws Exception {
		if(this.jInternalFrameDetalleFormLibroContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.librocontableConstantesFunciones.resaltaridLibroContable!=null && this.jInternalFrameDetalleFormLibroContable!=null) {this.jInternalFrameDetalleFormLibroContable.jLabelidLibroContable.setBorder(this.librocontableConstantesFunciones.resaltaridLibroContable);}
		if(this.librocontableConstantesFunciones.resaltarid_empresaLibroContable!=null && this.jInternalFrameDetalleFormLibroContable!=null) {this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable.setBorder(this.librocontableConstantesFunciones.resaltarid_empresaLibroContable);}
		if(this.librocontableConstantesFunciones.resaltarcodigoLibroContable!=null && this.jInternalFrameDetalleFormLibroContable!=null) {this.jInternalFrameDetalleFormLibroContable.jTextFieldcodigoLibroContable.setBorder(this.librocontableConstantesFunciones.resaltarcodigoLibroContable);}
		if(this.librocontableConstantesFunciones.resaltarnombreLibroContable!=null && this.jInternalFrameDetalleFormLibroContable!=null) {this.jInternalFrameDetalleFormLibroContable.jTextAreanombreLibroContable.setBorder(this.librocontableConstantesFunciones.resaltarnombreLibroContable);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioLibroContable() throws Exception {		
		if(this.jInternalFrameDetalleFormLibroContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) {
	
		//this.jInternalFrameDetalleFormLibroContable.jLabelidLibroContable.setVisible(this.librocontableConstantesFunciones.mostraridLibroContable);
		this.jInternalFrameDetalleFormLibroContable.jPanelidLibroContable.setVisible(this.librocontableConstantesFunciones.mostraridLibroContable);
		//this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable.setVisible(this.librocontableConstantesFunciones.mostrarid_empresaLibroContable);
		this.jInternalFrameDetalleFormLibroContable.jPanelid_empresaLibroContable.setVisible(this.librocontableConstantesFunciones.mostrarid_empresaLibroContable);
		//this.jInternalFrameDetalleFormLibroContable.jTextFieldcodigoLibroContable.setVisible(this.librocontableConstantesFunciones.mostrarcodigoLibroContable);
		this.jInternalFrameDetalleFormLibroContable.jPanelcodigoLibroContable.setVisible(this.librocontableConstantesFunciones.mostrarcodigoLibroContable);
		//this.jInternalFrameDetalleFormLibroContable.jTextAreanombreLibroContable.setVisible(this.librocontableConstantesFunciones.mostrarnombreLibroContable);
		this.jInternalFrameDetalleFormLibroContable.jPanelnombreLibroContable.setVisible(this.librocontableConstantesFunciones.mostrarnombreLibroContable);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioLibroContable() throws Exception {
		if(this.jInternalFrameDetalleFormLibroContable==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLibroContable!=null) {
	
		this.jInternalFrameDetalleFormLibroContable.jLabelidLibroContable.setEnabled(this.librocontableConstantesFunciones.activaridLibroContable);
		this.jInternalFrameDetalleFormLibroContable.jComboBoxid_empresaLibroContable.setEnabled(this.librocontableConstantesFunciones.activarid_empresaLibroContable);
		this.jInternalFrameDetalleFormLibroContable.jTextFieldcodigoLibroContable.setEnabled(this.librocontableConstantesFunciones.activarcodigoLibroContable);
		this.jInternalFrameDetalleFormLibroContable.jTextAreanombreLibroContable.setEnabled(this.librocontableConstantesFunciones.activarnombreLibroContable);
		}
	}
	
		
}