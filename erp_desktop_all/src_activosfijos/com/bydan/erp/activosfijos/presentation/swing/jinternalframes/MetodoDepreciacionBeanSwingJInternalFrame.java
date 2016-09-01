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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.MetodoDepreciacionConstantesFunciones;
import com.bydan.erp.activosfijos.util.MetodoDepreciacionParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.MetodoDepreciacionParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.MetodoDepreciacionBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
public class MetodoDepreciacionBeanSwingJInternalFrame extends MetodoDepreciacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MetodoDepreciacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<MetodoDepreciacion> metododepreciacionValidator = new ClassValidator<MetodoDepreciacion>(MetodoDepreciacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public MetodoDepreciacion metododepreciacion;	
	public MetodoDepreciacion metododepreciacionAux;
	public MetodoDepreciacion metododepreciacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public MetodoDepreciacion metododepreciacionTotales;
	public Long idMetodoDepreciacionActual;
	public Long iIdNuevoMetodoDepreciacion=0L;
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

	public String sFinalQueryComboDetalleActivoFijo="";

	public List<DetalleActivoFijo> detalleactivofijosForeignKey;

	public List<DetalleActivoFijo> getdetalleactivofijosForeignKey() {
		return detalleactivofijosForeignKey;
	}

	public void setdetalleactivofijosForeignKey(List<DetalleActivoFijo> detalleactivofijosForeignKey) {
		this.detalleactivofijosForeignKey = detalleactivofijosForeignKey;
	}

	//OBJETO FK ACTUAL
	public DetalleActivoFijo detalleactivofijoForeignKey;

	public DetalleActivoFijo getdetalleactivofijoForeignKey() {
		return detalleactivofijoForeignKey;
	}

	public void setdetalleactivofijoForeignKey(DetalleActivoFijo detalleactivofijoForeignKey) {
		this.detalleactivofijoForeignKey = detalleactivofijoForeignKey;
	}

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
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
	
	public Boolean isPermisoTodoMetodoDepreciacion;
	public Boolean isPermisoNuevoMetodoDepreciacion;
	public Boolean isPermisoActualizarMetodoDepreciacion;
	public Boolean isPermisoActualizarOriginalMetodoDepreciacion;
	public Boolean isPermisoEliminarMetodoDepreciacion;
	public Boolean isPermisoGuardarCambiosMetodoDepreciacion;
	public Boolean isPermisoConsultaMetodoDepreciacion;
	public Boolean isPermisoBusquedaMetodoDepreciacion;
	public Boolean isPermisoReporteMetodoDepreciacion;
	public Boolean isPermisoPaginacionMedioMetodoDepreciacion;
	public Boolean isPermisoPaginacionAltoMetodoDepreciacion;
	public Boolean isPermisoPaginacionTodoMetodoDepreciacion;
	public Boolean isPermisoCopiarMetodoDepreciacion;
	public Boolean isPermisoVerFormMetodoDepreciacion;
	public Boolean isPermisoDuplicarMetodoDepreciacion;
	public Boolean isPermisoOrdenMetodoDepreciacion;
	
	
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
	
	public MetodoDepreciacionParameterReturnGeneral metododepreciacionReturnGeneral;
	public MetodoDepreciacionParameterReturnGeneral metododepreciacionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoMetodoDepreciacion=false;
	public Boolean esParaAccionDesdeFormularioMetodoDepreciacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected MetodoDepreciacionSessionBeanAdditional metododepreciacionSessionBeanAdditional=null;
	
	public MetodoDepreciacionSessionBeanAdditional getMetodoDepreciacionSessionBeanAdditional() {
		return this.metododepreciacionSessionBeanAdditional;
	}
	
	public void setMetodoDepreciacionSessionBeanAdditional(MetodoDepreciacionSessionBeanAdditional metododepreciacionSessionBeanAdditional) {
		try {
			this.metododepreciacionSessionBeanAdditional=metododepreciacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected MetodoDepreciacionBeanSwingJInternalFrameAdditional metododepreciacionBeanSwingJInternalFrameAdditional=null;
	//public class MetodoDepreciacionBeanSwingJInternalFrame
	
	public MetodoDepreciacionBeanSwingJInternalFrameAdditional getMetodoDepreciacionBeanSwingJInternalFrameAdditional() {
		return this.metododepreciacionBeanSwingJInternalFrameAdditional;
	}
	
	public void setMetodoDepreciacionBeanSwingJInternalFrameAdditional(MetodoDepreciacionBeanSwingJInternalFrameAdditional metododepreciacionBeanSwingJInternalFrameAdditional) {
		try {
			this.metododepreciacionBeanSwingJInternalFrameAdditional=metododepreciacionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public MetodoDepreciacionLogic metododepreciacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public MetodoDepreciacion metododepreciacionBean;
	public MetodoDepreciacionConstantesFunciones metododepreciacionConstantesFunciones;
	//public MetodoDepreciacionParameterReturnGeneral metododepreciacionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public DetalleActivoFijoLogic detalleactivofijoLogic;
	public AnioLogic anioLogic;
	
	//PARAMETROS
	
	
	//public List<MetodoDepreciacion> metododepreciacions;	
	//public List<MetodoDepreciacion> metododepreciacionsEliminados;
	//public List<MetodoDepreciacion> metododepreciacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMetodoDepreciacion=false;
	public Boolean isVisibilidadCeldaDuplicarMetodoDepreciacion=true;
	public Boolean isVisibilidadCeldaCopiarMetodoDepreciacion=true;
	public Boolean isVisibilidadCeldaVerFormMetodoDepreciacion=true;
	public Boolean isVisibilidadCeldaOrdenMetodoDepreciacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=false;
	public Boolean isVisibilidadCeldaModificarMetodoDepreciacion=false;
	public Boolean isVisibilidadCeldaActualizarMetodoDepreciacion=false;
	public Boolean isVisibilidadCeldaEliminarMetodoDepreciacion=false;
	public Boolean isVisibilidadCeldaCancelarMetodoDepreciacion=false;
	public Boolean isVisibilidadCeldaGuardarMetodoDepreciacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMetodoDepreciacion=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdDetalleActivoFijo=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoMetodoDepreciacion() {
		return this.iIdNuevoMetodoDepreciacion;
	}

	public void setiIdNuevoMetodoDepreciacion(Long iIdNuevoMetodoDepreciacion) {
		this.iIdNuevoMetodoDepreciacion = iIdNuevoMetodoDepreciacion;
	}
	
	public Long getidMetodoDepreciacionActual() {
		return this.idMetodoDepreciacionActual;
	}

	public void setidMetodoDepreciacionActual(Long idMetodoDepreciacionActual) {
		this.idMetodoDepreciacionActual = idMetodoDepreciacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public MetodoDepreciacion getmetododepreciacion() {
		return this.metododepreciacion;
	}

	public void setmetododepreciacion(MetodoDepreciacion metododepreciacion) {
		this.metododepreciacion = metododepreciacion;
	}
	
	public MetodoDepreciacion getmetododepreciacionAux() {
		return this.metododepreciacionAux;
	}

	public void setmetododepreciacionAux(MetodoDepreciacion metododepreciacionAux) {
		this.metododepreciacionAux = metododepreciacionAux;
	}				
	
	public MetodoDepreciacion getmetododepreciacionAnterior() {
		return this.metododepreciacionAnterior;
	}

	public void setmetododepreciacionAnterior(MetodoDepreciacion metododepreciacionAnterior) {
		this.metododepreciacionAnterior = metododepreciacionAnterior;
	}	
	
	public MetodoDepreciacion getmetododepreciacionTotales() {
		return this.metododepreciacionTotales;
	}

	public void setmetododepreciacionTotales(MetodoDepreciacion metododepreciacionTotales) {
		this.metododepreciacionTotales = metododepreciacionTotales;
	}	
	
	public MetodoDepreciacion getmetododepreciacionBean() {
		return this.metododepreciacionBean;
	}

	public void setmetododepreciacionBean(MetodoDepreciacion metododepreciacionBean) {
		this.metododepreciacionBean = metododepreciacionBean;
	}	
	
	public MetodoDepreciacionParameterReturnGeneral getmetododepreciacionReturnGeneral() {
		return this.metododepreciacionReturnGeneral;
	}

	public void setmetododepreciacionReturnGeneral(MetodoDepreciacionParameterReturnGeneral metododepreciacionReturnGeneral) {
		this.metododepreciacionReturnGeneral = metododepreciacionReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_detalle_activo_fijoFK_IdDetalleActivoFijo=-1L;

	public Long getid_detalle_activo_fijoFK_IdDetalleActivoFijo() {
		return this.id_detalle_activo_fijoFK_IdDetalleActivoFijo;
	}

	public void setid_detalle_activo_fijoFK_IdDetalleActivoFijo(Long id_detalle_activo_fijoFK_IdDetalleActivoFijo) {
		this.id_detalle_activo_fijoFK_IdDetalleActivoFijo = id_detalle_activo_fijoFK_IdDetalleActivoFijo;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public MetodoDepreciacionLogic getMetodoDepreciacionLogic()	{		
		return metododepreciacionLogic;
	}

	public void setMetodoDepreciacionLogic(MetodoDepreciacionLogic metododepreciacionLogic) {
		this.metododepreciacionLogic = metododepreciacionLogic;
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
	
	public Boolean getIsEsNuevoMetodoDepreciacion() {
		return isEsNuevoMetodoDepreciacion;
	}

	public void setIsEsNuevoMetodoDepreciacion(Boolean isEsNuevoMetodoDepreciacion) {
		this.isEsNuevoMetodoDepreciacion = isEsNuevoMetodoDepreciacion;
	}

	public Boolean getEsParaAccionDesdeFormularioMetodoDepreciacion() {
		return esParaAccionDesdeFormularioMetodoDepreciacion;
	}
	
	public void setEsParaAccionDesdeFormularioMetodoDepreciacion(Boolean esParaAccionDesdeFormularioMetodoDepreciacion) {
		this.esParaAccionDesdeFormularioMetodoDepreciacion = esParaAccionDesdeFormularioMetodoDepreciacion;
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

			if(this.metododepreciacionSessionBean==null) {
				this.metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
			}

			if(!this.metododepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(metododepreciacionSessionBean.getlidEmpresaActual());
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

			if(this.metododepreciacionSessionBean==null) {
				this.metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
			}

			if(!this.metododepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(metododepreciacionSessionBean.getlidSucursalActual());
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

	public void cargarCombosDetalleActivoFijosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DetalleActivoFijoLogic detalleactivofijoLogic=new DetalleActivoFijoLogic();

			//detalleactivofijoLogic.getDetalleActivoFijoDataAccess().setIsForForeingKeyData(true);

			if(this.metododepreciacionSessionBean==null) {
				this.metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
			}

			if(!this.metododepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detalleactivofijoLogic.getDetalleActivoFijoDataAccess().setIsForForeingKeyData(true);

					detalleactivofijoLogic.getTodosDetalleActivoFijosWithConnection(sFinalQuery,new Pagination());

					this.detalleactivofijosForeignKey=detalleactivofijoLogic.getDetalleActivoFijos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDetalleActivoFijo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleactivofijoLogic.getEntityWithConnection(metododepreciacionSessionBean.getlidDetalleActivoFijoActual());
					this.detalleactivofijosForeignKey.add(detalleactivofijoLogic.getDetalleActivoFijo());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.metododepreciacionSessionBean==null) {
				this.metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
			}

			if(!this.metododepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(metododepreciacionSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

					if(this.metododepreciacion!=null) {
						this.metododepreciacion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
						this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaMetodoDepreciacion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
						if(this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaMetodoDepreciacionGenerico)throws Exception
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
				jComboBoxid_empresaMetodoDepreciacionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaMetodoDepreciacionGenerico!=null && jComboBoxid_empresaMetodoDepreciacionGenerico.getItemCount()>0) {
					jComboBoxid_empresaMetodoDepreciacionGenerico.setSelectedIndex(0);
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

					if(this.metododepreciacion!=null) {
						this.metododepreciacion.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
						this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalMetodoDepreciacion.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
						if(this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalMetodoDepreciacionGenerico)throws Exception
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
				jComboBoxid_sucursalMetodoDepreciacionGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalMetodoDepreciacionGenerico!=null && jComboBoxid_sucursalMetodoDepreciacionGenerico.getItemCount()>0) {
					jComboBoxid_sucursalMetodoDepreciacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDetalleActivoFijoForeignKey(Long idDetalleActivoFijoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(detalleactivofijoTemp!=null) {

					if(this.metododepreciacion!=null) {
						this.metododepreciacion.setDetalleActivoFijo(detalleactivofijoTemp);
					}

					if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
						this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion.setSelectedItem(detalleactivofijoTemp);
					}
				} else {
					//jComboBoxid_detalle_activo_fijoMetodoDepreciacion.setSelectedItem(detalleactivofijoTemp);
					if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
						if(this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetalleActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){
					if(detalleactivofijoTemp!=null && jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion!=null) {
						jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.setSelectedItem(detalleactivofijoTemp);
					} else {
						if(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion!=null) {
							//jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.setSelectedItem(detalleactivofijoTemp);
							if(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.getItemCount()>0) {
								jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.setSelectedIndex(0);
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

	public String getActualDetalleActivoFijoForeignKeyDescripcion(Long idDetalleActivoFijoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}


			sDescripcion=DetalleActivoFijoConstantesFunciones.getDetalleActivoFijoDescripcion(detalleactivofijoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDetalleActivoFijoForeignKeyGenerico(Long idDetalleActivoFijoSeleccionado,JComboBox jComboBoxid_detalle_activo_fijoMetodoDepreciacionGenerico)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}

			if(detalleactivofijoTemp!=null) {
				jComboBoxid_detalle_activo_fijoMetodoDepreciacionGenerico.setSelectedItem(detalleactivofijoTemp);
			} else {
				if(jComboBoxid_detalle_activo_fijoMetodoDepreciacionGenerico!=null && jComboBoxid_detalle_activo_fijoMetodoDepreciacionGenerico.getItemCount()>0) {
					jComboBoxid_detalle_activo_fijoMetodoDepreciacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.metododepreciacion!=null) {
						this.metododepreciacion.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
						this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioMetodoDepreciacion.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
						if(this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioMetodoDepreciacion!=null) {
						jComboBoxid_anioFK_IdAnioMetodoDepreciacion.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioMetodoDepreciacion!=null) {
							//jComboBoxid_anioFK_IdAnioMetodoDepreciacion.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioMetodoDepreciacion.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioMetodoDepreciacion.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioMetodoDepreciacionGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioMetodoDepreciacionGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioMetodoDepreciacionGenerico!=null && jComboBoxid_anioMetodoDepreciacionGenerico.getItemCount()>0) {
					jComboBoxid_anioMetodoDepreciacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(MetodoDepreciacion metododepreciacion,JComboBox jComboBoxid_empresaMetodoDepreciacionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaMetodoDepreciacionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaMetodoDepreciacionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				metododepreciacion.setid_empresa(empresaAux.getId());
				metododepreciacion.setempresa_descripcion(MetodoDepreciacionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				metododepreciacion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(MetodoDepreciacion metododepreciacion,JComboBox jComboBoxid_sucursalMetodoDepreciacionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalMetodoDepreciacionGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalMetodoDepreciacionGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				metododepreciacion.setid_sucursal(sucursalAux.getId());
				metododepreciacion.setsucursal_descripcion(MetodoDepreciacionConstantesFunciones.getSucursalDescripcion(sucursalAux));
				metododepreciacion.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetalleActivoFijoForeignKey(MetodoDepreciacion metododepreciacion,JComboBox jComboBoxid_detalle_activo_fijoMetodoDepreciacionGenerico)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoAux=new DetalleActivoFijo();

			if(jComboBoxid_detalle_activo_fijoMetodoDepreciacionGenerico==null) {
				detalleactivofijoAux=(DetalleActivoFijo)this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion.getSelectedItem();
			} else {
				detalleactivofijoAux=(DetalleActivoFijo)jComboBoxid_detalle_activo_fijoMetodoDepreciacionGenerico.getSelectedItem();
			}

			if(detalleactivofijoAux!=null && detalleactivofijoAux.getId()!=null) {
				metododepreciacion.setid_detalle_activo_fijo(detalleactivofijoAux.getId());
				metododepreciacion.setdetalleactivofijo_descripcion(MetodoDepreciacionConstantesFunciones.getDetalleActivoFijoDescripcion(detalleactivofijoAux));
				metododepreciacion.setDetalleActivoFijo(detalleactivofijoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(MetodoDepreciacion metododepreciacion,JComboBox jComboBoxid_anioMetodoDepreciacionGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioMetodoDepreciacionGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioMetodoDepreciacionGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				metododepreciacion.setid_anio(anioAux.getId());
				metododepreciacion.setanio_descripcion(MetodoDepreciacionConstantesFunciones.getAnioDescripcion(anioAux));
				metododepreciacion.setAnio(anioAux);			}
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

					if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { 
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { 
					}

					if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { 
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { 
					}

					if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDetalleActivoFijosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDetalleActivoFijo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { 
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion.removeAllItems();

							for(DetalleActivoFijo detalleactivofijo:this.detalleactivofijosForeignKey) {
								this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion.addItem(detalleactivofijo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { 
					}

					if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetalleActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.removeAllItems();

							for(DetalleActivoFijo detalleactivofijo:this.detalleactivofijosForeignKey) {
								this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.addItem(detalleactivofijo);
							}
						}

						if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { 
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { 
					}

					if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioMetodoDepreciacion.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioMetodoDepreciacion.addItem(anio);
							}
						}

						if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameDetalleActivoFijoForeignKey(DetalleActivoFijo detalleactivofijo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion.setSelectedItem(detalleactivofijo);
						}
					} else {
						if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.setSelectedItem(detalleactivofijo);
						} else {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioMetodoDepreciacion.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioMetodoDepreciacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesMetodoDepreciacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			MetodoDepreciacionConstantesFunciones.refrescarForeignKeysDescripcionesMetodoDepreciacion(this.metododepreciacionLogic.getMetodoDepreciacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			MetodoDepreciacionConstantesFunciones.refrescarForeignKeysDescripcionesMetodoDepreciacion(this.metododepreciacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(DetalleActivoFijo.class));
		classes.add(new Classe(Anio.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//metododepreciacionLogic.setMetodoDepreciacions(this.metododepreciacions);
			metododepreciacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public MetodoDepreciacionParameterReturnGeneral getMetodoDepreciacionParameterGeneral() {
		return this.metododepreciacionParameterGeneral;
	}
	
	public void setMetodoDepreciacionParameterGeneral(MetodoDepreciacionParameterReturnGeneral metododepreciacionParameterGeneral) {
		this.metododepreciacionParameterGeneral = metododepreciacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoMetodoDepreciacion() {
		return isPermisoTodoMetodoDepreciacion;
	}

	public void setIsPermisoTodoMetodoDepreciacion(Boolean isPermisoTodoMetodoDepreciacion) {
		this.isPermisoTodoMetodoDepreciacion = isPermisoTodoMetodoDepreciacion;
	}

	public Boolean getIsPermisoNuevoMetodoDepreciacion() {
		return isPermisoNuevoMetodoDepreciacion;
	}

	public void setIsPermisoNuevoMetodoDepreciacion(Boolean isPermisoNuevoMetodoDepreciacion) {
		this.isPermisoNuevoMetodoDepreciacion = isPermisoNuevoMetodoDepreciacion;
	}

	public Boolean getIsPermisoActualizarMetodoDepreciacion() {
		return isPermisoActualizarMetodoDepreciacion;
	}

	public void setIsPermisoActualizarMetodoDepreciacion(Boolean isPermisoActualizarMetodoDepreciacion) {
		this.isPermisoActualizarMetodoDepreciacion = isPermisoActualizarMetodoDepreciacion;
	}

	public Boolean getIsPermisoEliminarMetodoDepreciacion() {
		return isPermisoEliminarMetodoDepreciacion;
	}

	public void setIsPermisoEliminarMetodoDepreciacion(Boolean isPermisoEliminarMetodoDepreciacion) {
		this.isPermisoEliminarMetodoDepreciacion = isPermisoEliminarMetodoDepreciacion;
	}

	public Boolean getIsPermisoGuardarCambiosMetodoDepreciacion() {
		return isPermisoGuardarCambiosMetodoDepreciacion;
	}

	public void setIsPermisoGuardarCambiosMetodoDepreciacion(Boolean isPermisoGuardarCambiosMetodoDepreciacion) {
		this.isPermisoGuardarCambiosMetodoDepreciacion = isPermisoGuardarCambiosMetodoDepreciacion;
	}
	
	public Boolean getIsPermisoConsultaMetodoDepreciacion() {
		return isPermisoConsultaMetodoDepreciacion;
	}

	public void setIsPermisoConsultaMetodoDepreciacion(Boolean isPermisoConsultaMetodoDepreciacion) {
		this.isPermisoConsultaMetodoDepreciacion = isPermisoConsultaMetodoDepreciacion;
	}

	public Boolean getIsPermisoBusquedaMetodoDepreciacion() {
		return isPermisoBusquedaMetodoDepreciacion;
	}

	public void setIsPermisoBusquedaMetodoDepreciacion(Boolean isPermisoBusquedaMetodoDepreciacion) {
		this.isPermisoBusquedaMetodoDepreciacion = isPermisoBusquedaMetodoDepreciacion;
	}

	public Boolean getIsPermisoReporteMetodoDepreciacion() {
		return isPermisoReporteMetodoDepreciacion;
	}

	public void setIsPermisoReporteMetodoDepreciacion(Boolean isPermisoReporteMetodoDepreciacion) {
		this.isPermisoReporteMetodoDepreciacion = isPermisoReporteMetodoDepreciacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioMetodoDepreciacion() {
		return isPermisoPaginacionMedioMetodoDepreciacion;
	}

	public void setIsPermisoPaginacionMedioMetodoDepreciacion(Boolean isPermisoPaginacionMedioMetodoDepreciacion) {
		this.isPermisoPaginacionMedioMetodoDepreciacion = isPermisoPaginacionMedioMetodoDepreciacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoMetodoDepreciacion() {
		return isPermisoPaginacionTodoMetodoDepreciacion;
	}

	public void setIsPermisoPaginacionTodoMetodoDepreciacion(Boolean isPermisoPaginacionTodoMetodoDepreciacion) {
		this.isPermisoPaginacionTodoMetodoDepreciacion = isPermisoPaginacionTodoMetodoDepreciacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoMetodoDepreciacion() {
		return isPermisoPaginacionAltoMetodoDepreciacion;
	}

	public void setIsPermisoPaginacionAltoMetodoDepreciacion(Boolean isPermisoPaginacionAltoMetodoDepreciacion) {
		this.isPermisoPaginacionAltoMetodoDepreciacion = isPermisoPaginacionAltoMetodoDepreciacion;
	}
	
	public Boolean getIsPermisoCopiarMetodoDepreciacion() {
		return isPermisoCopiarMetodoDepreciacion;
	}

	public void setIsPermisoCopiarMetodoDepreciacion(Boolean isPermisoCopiarMetodoDepreciacion) {
		this.isPermisoCopiarMetodoDepreciacion = isPermisoCopiarMetodoDepreciacion;
	}
	
	public Boolean getIsPermisoVerFormMetodoDepreciacion() {
		return isPermisoVerFormMetodoDepreciacion;
	}

	public void setIsPermisoVerFormMetodoDepreciacion(Boolean isPermisoVerFormMetodoDepreciacion) {
		this.isPermisoVerFormMetodoDepreciacion = isPermisoVerFormMetodoDepreciacion;
	}
	
	public Boolean getIsPermisoDuplicarMetodoDepreciacion() {
		return isPermisoDuplicarMetodoDepreciacion;
	}

	public void setIsPermisoDuplicarMetodoDepreciacion(Boolean isPermisoDuplicarMetodoDepreciacion) {
		this.isPermisoDuplicarMetodoDepreciacion = isPermisoDuplicarMetodoDepreciacion;
	}
	
	public Boolean getIsPermisoOrdenMetodoDepreciacion() {
		return isPermisoOrdenMetodoDepreciacion;
	}

	public void setIsPermisoOrdenMetodoDepreciacion(Boolean isPermisoOrdenMetodoDepreciacion) {
		this.isPermisoOrdenMetodoDepreciacion = isPermisoOrdenMetodoDepreciacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoMetodoDepreciacion() {
		return isVisibilidadCeldaNuevoMetodoDepreciacion;
	}

	public void setIsVisibilidadCeldaNuevoMetodoDepreciacion(Boolean isVisibilidadCeldaNuevoMetodoDepreciacion) {
		this.isVisibilidadCeldaNuevoMetodoDepreciacion = isVisibilidadCeldaNuevoMetodoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMetodoDepreciacion() {
		return isVisibilidadCeldaDuplicarMetodoDepreciacion;
	}

	public void setIsVisibilidadCeldaDuplicarMetodoDepreciacion(Boolean isVisibilidadCeldaDuplicarMetodoDepreciacion) {
		this.isVisibilidadCeldaDuplicarMetodoDepreciacion = isVisibilidadCeldaDuplicarMetodoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMetodoDepreciacion() {
		return isVisibilidadCeldaCopiarMetodoDepreciacion;
	}

	public void setIsVisibilidadCeldaCopiarMetodoDepreciacion(Boolean isVisibilidadCeldaCopiarMetodoDepreciacion) {
		this.isVisibilidadCeldaCopiarMetodoDepreciacion = isVisibilidadCeldaCopiarMetodoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMetodoDepreciacion() {
		return isVisibilidadCeldaVerFormMetodoDepreciacion;
	}

	public void setIsVisibilidadCeldaVerFormMetodoDepreciacion(Boolean isVisibilidadCeldaVerFormMetodoDepreciacion) {
		this.isVisibilidadCeldaVerFormMetodoDepreciacion = isVisibilidadCeldaVerFormMetodoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMetodoDepreciacion() {
		return isVisibilidadCeldaOrdenMetodoDepreciacion;
	}

	public void setIsVisibilidadCeldaOrdenMetodoDepreciacion(Boolean isVisibilidadCeldaOrdenMetodoDepreciacion) {
		this.isVisibilidadCeldaOrdenMetodoDepreciacion = isVisibilidadCeldaOrdenMetodoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMetodoDepreciacion() {
		return isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMetodoDepreciacion(Boolean isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion) {
		this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion = isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMetodoDepreciacion() {
		return isVisibilidadCeldaModificarMetodoDepreciacion;
	}

	public void setIsVisibilidadCeldaModificarMetodoDepreciacion(Boolean isVisibilidadCeldaModificarMetodoDepreciacion) {
		this.isVisibilidadCeldaModificarMetodoDepreciacion = isVisibilidadCeldaModificarMetodoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMetodoDepreciacion() {
		return isVisibilidadCeldaActualizarMetodoDepreciacion;
	}

	public void setIsVisibilidadCeldaActualizarMetodoDepreciacion(Boolean isVisibilidadCeldaActualizarMetodoDepreciacion) {
		this.isVisibilidadCeldaActualizarMetodoDepreciacion = isVisibilidadCeldaActualizarMetodoDepreciacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarMetodoDepreciacion() {
		return isVisibilidadCeldaEliminarMetodoDepreciacion;
	}

	public void setIsVisibilidadCeldaEliminarMetodoDepreciacion(Boolean isVisibilidadCeldaEliminarMetodoDepreciacion) {
		this.isVisibilidadCeldaEliminarMetodoDepreciacion = isVisibilidadCeldaEliminarMetodoDepreciacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarMetodoDepreciacion() {
		return isVisibilidadCeldaCancelarMetodoDepreciacion;
	}

	public void setIsVisibilidadCeldaCancelarMetodoDepreciacion(Boolean isVisibilidadCeldaCancelarMetodoDepreciacion) {
		this.isVisibilidadCeldaCancelarMetodoDepreciacion = isVisibilidadCeldaCancelarMetodoDepreciacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarMetodoDepreciacion() {
		return isVisibilidadCeldaGuardarMetodoDepreciacion;
	}

	public void setIsVisibilidadCeldaGuardarMetodoDepreciacion(Boolean isVisibilidadCeldaGuardarMetodoDepreciacion) {
		this.isVisibilidadCeldaGuardarMetodoDepreciacion = isVisibilidadCeldaGuardarMetodoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMetodoDepreciacion() {
		return isVisibilidadCeldaGuardarCambiosMetodoDepreciacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMetodoDepreciacion(Boolean isVisibilidadCeldaGuardarCambiosMetodoDepreciacion) {
		this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion = isVisibilidadCeldaGuardarCambiosMetodoDepreciacion;
	}
		
	public MetodoDepreciacionSessionBean getmetododepreciacionSessionBean() {
		return this.metododepreciacionSessionBean;
	}
	
	public void setmetododepreciacionSessionBean(MetodoDepreciacionSessionBean metododepreciacionSessionBean) {
		this.metododepreciacionSessionBean=metododepreciacionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdDetalleActivoFijo() {
		return this.isVisibilidadFK_IdDetalleActivoFijo;
	}

	public void setisVisibilidadFK_IdDetalleActivoFijo(Boolean isVisibilidadFK_IdDetalleActivoFijo) {
		this.isVisibilidadFK_IdDetalleActivoFijo=isVisibilidadFK_IdDetalleActivoFijo;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(MetodoDepreciacion metododepreciacion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(metododepreciacion,null);
				this.setActualParaGuardarSucursalForeignKey(metododepreciacion,null);
				this.setActualParaGuardarDetalleActivoFijoForeignKey(metododepreciacion,null);
				this.setActualParaGuardarAnioForeignKey(metododepreciacion,null);
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
	
	public void bugActualizarReferenciaActual(MetodoDepreciacion metododepreciacion,MetodoDepreciacion metododepreciacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMetodoDepreciacion(metododepreciacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		metododepreciacionAux.setId(metododepreciacion.getId());
		metododepreciacionAux.setVersionRow(metododepreciacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessMetodoDepreciacion();
		
			int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = metododepreciacionValidator.getInvalidValues(this.metododepreciacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			metododepreciacionLogic.setDatosCliente(datosCliente);
			metododepreciacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				metododepreciacionAux=new  MetodoDepreciacion();
				
				metododepreciacionAux.setIsNew(true);
				metododepreciacionAux.setIsChanged(true);
				
				metododepreciacionAux.setMetodoDepreciacionOriginal(this.metododepreciacion);
				
				metododepreciacionAux.setId(this.metododepreciacion.getId());	
				metododepreciacionAux.setVersionRow(this.metododepreciacion.getVersionRow());	
				metododepreciacionAux.setid_empresa(this.metododepreciacion.getid_empresa());	
				metododepreciacionAux.setid_sucursal(this.metododepreciacion.getid_sucursal());	
				metododepreciacionAux.setid_detalle_activo_fijo(this.metododepreciacion.getid_detalle_activo_fijo());	
				metododepreciacionAux.setid_anio(this.metododepreciacion.getid_anio());	
				metododepreciacionAux.setfecha_desde(this.metododepreciacion.getfecha_desde());	
				metododepreciacionAux.setfecha_hasta(this.metododepreciacion.getfecha_hasta());	
				metododepreciacionAux.setporcentaje(this.metododepreciacion.getporcentaje());	
				metododepreciacionAux.setvalor(this.metododepreciacion.getvalor());	
				metododepreciacionAux.setnumero_dias(this.metododepreciacion.getnumero_dias());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.metododepreciacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(metododepreciacionAux,metododepreciacionLogic.getMetodoDepreciacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(metododepreciacionAux,metododepreciacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.metododepreciacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						metododepreciacionLogic.saveMetodoDepreciacions();//WithConnection
						//metododepreciacionLogic.getSetVersionRowMetodoDepreciacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.metododepreciacion,metododepreciacionAux);
					
					this.refrescarForeignKeysDescripcionesMetodoDepreciacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								metododepreciacionLogic.saveMetodoDepreciacionRelaciones(metododepreciacionAux);//WithConnection
								//metododepreciacionLogic.getSetVersionRowMetodoDepreciacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.metododepreciacion,metododepreciacionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.metododepreciacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(metododepreciacionAux,metododepreciacionLogic.getMetodoDepreciacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(metododepreciacionAux,metododepreciacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.metododepreciacion,metododepreciacionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				metododepreciacionAux=new  MetodoDepreciacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado() 
					|| (this.metododepreciacionSessionBean.getEsGuardarRelacionado() && this.metododepreciacion.getId()>=0)) {
						
					metododepreciacionAux.setIsNew(false);
				}
				
				metododepreciacionAux.setIsDeleted(false);
			
				metododepreciacionAux.setId(this.metododepreciacion.getId());	
				metododepreciacionAux.setVersionRow(this.metododepreciacion.getVersionRow());	
				metododepreciacionAux.setid_empresa(this.metododepreciacion.getid_empresa());	
				metododepreciacionAux.setid_sucursal(this.metododepreciacion.getid_sucursal());	
				metododepreciacionAux.setid_detalle_activo_fijo(this.metododepreciacion.getid_detalle_activo_fijo());	
				metododepreciacionAux.setid_anio(this.metododepreciacion.getid_anio());	
				metododepreciacionAux.setfecha_desde(this.metododepreciacion.getfecha_desde());	
				metododepreciacionAux.setfecha_hasta(this.metododepreciacion.getfecha_hasta());	
				metododepreciacionAux.setporcentaje(this.metododepreciacion.getporcentaje());	
				metododepreciacionAux.setvalor(this.metododepreciacion.getvalor());	
				metododepreciacionAux.setnumero_dias(this.metododepreciacion.getnumero_dias());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(metododepreciacionAux,metododepreciacionLogic.getMetodoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(metododepreciacionAux,metododepreciacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.metododepreciacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						metododepreciacionLogic.saveMetodoDepreciacions();//WithConnection
						//metododepreciacionLogic.getSetVersionRowMetodoDepreciacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.metododepreciacion,metododepreciacionAux);
					
					this.refrescarForeignKeysDescripcionesMetodoDepreciacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								metododepreciacionLogic.saveMetodoDepreciacionRelaciones(metododepreciacionAux);//WithConnection
								//metododepreciacionLogic.getSetVersionRowMetodoDepreciacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.metododepreciacion,metododepreciacionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.metododepreciacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(metododepreciacionAux,metododepreciacionLogic.getMetodoDepreciacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(metododepreciacionAux,metododepreciacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.metododepreciacion,metododepreciacionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				metododepreciacionAux=new  MetodoDepreciacion();
				
				metododepreciacionAux.setIsNew(false);
				metododepreciacionAux.setIsChanged(false);
				
				metododepreciacionAux.setIsDeleted(true);
				
				metododepreciacionAux.setId(this.metododepreciacion.getId());	
				metododepreciacionAux.setVersionRow(this.metododepreciacion.getVersionRow());	
				metododepreciacionAux.setid_empresa(this.metododepreciacion.getid_empresa());	
				metododepreciacionAux.setid_sucursal(this.metododepreciacion.getid_sucursal());	
				metododepreciacionAux.setid_detalle_activo_fijo(this.metododepreciacion.getid_detalle_activo_fijo());	
				metododepreciacionAux.setid_anio(this.metododepreciacion.getid_anio());	
				metododepreciacionAux.setfecha_desde(this.metododepreciacion.getfecha_desde());	
				metododepreciacionAux.setfecha_hasta(this.metododepreciacion.getfecha_hasta());	
				metododepreciacionAux.setporcentaje(this.metododepreciacion.getporcentaje());	
				metododepreciacionAux.setvalor(this.metododepreciacion.getvalor());	
				metododepreciacionAux.setnumero_dias(this.metododepreciacion.getnumero_dias());	
				
				if(this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.metododepreciacionAux.getId()>=0) {	
						this.metododepreciacionsEliminados.add(metododepreciacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(metododepreciacionAux,metododepreciacionLogic.getMetodoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(metododepreciacionAux,metododepreciacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.metododepreciacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						metododepreciacionLogic.saveMetodoDepreciacions();//WithConnection
						//metododepreciacionLogic.getSetVersionRowMetodoDepreciacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								metododepreciacionLogic.saveMetodoDepreciacionRelaciones(metododepreciacionAux);//WithConnection
								//metododepreciacionLogic.getSetVersionRowMetodoDepreciacions();//WithConnection
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
							if(this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.metododepreciacionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(metododepreciacionAux,metododepreciacionLogic.getMetodoDepreciacions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(metododepreciacionAux,metododepreciacions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.getMetodoDepreciacions().addAll(this.metododepreciacionsEliminados);
					
					metododepreciacionLogic.saveMetodoDepreciacions();//WithConnection
					//metododepreciacionLogic.getSetVersionRowMetodoDepreciacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesMetodoDepreciacion();
				
				this.metododepreciacionsEliminados= new ArrayList<MetodoDepreciacion>();		
			}
			
			if(this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Metodo Depreciacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Metodo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.metododepreciacion=metododepreciacionAux;
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
      		//this.finishProcessMetodoDepreciacion();
      	}
		
	}	
	
	public void actualizarRelaciones(MetodoDepreciacion metododepreciacionLocal) throws Exception {
		
		if(this.metododepreciacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(MetodoDepreciacion metododepreciacionLocal) throws Exception {	
		if(this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				metododepreciacionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				metododepreciacionLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetalleActivoFijoDetalleFormJInternalFrame.class)) {
				DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrameLocal=(DetalleActivoFijoBeanSwingJInternalFrame) ((DetalleActivoFijoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detalleactivofijoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrameLocal.getdetalleactivofijo(),true);
				detalleactivofijoBeanSwingJInternalFrameLocal.actualizarLista(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo,this.detalleactivofijosForeignKey);

				detalleactivofijoBeanSwingJInternalFrameLocal.actualizarRelaciones(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo);

				metododepreciacionLocal.setDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo);

				this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
				this.cargarCombosFrameDetalleActivoFijosForeignKey("Formulario");
				this.setActualDetalleActivoFijoForeignKey(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				metododepreciacionLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarMetodoDepreciacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = metododepreciacionValidator.getInvalidValues(this.metododepreciacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(MetodoDepreciacion metododepreciacion,List<MetodoDepreciacion> metododepreciacions) throws Exception {
		try	{		
			MetodoDepreciacionConstantesFunciones.actualizarLista(metododepreciacion,metododepreciacions,this.metododepreciacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(MetodoDepreciacion metododepreciacion,List<MetodoDepreciacion> metododepreciacions) throws Exception {
		try	{			
			MetodoDepreciacionConstantesFunciones.actualizarSelectedLista(metododepreciacion,metododepreciacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<MetodoDepreciacion> metododepreciacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				metododepreciacionsLocal=this.metododepreciacionLogic.getMetodoDepreciacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				metododepreciacionsLocal=this.metododepreciacions;
			}
			//ARCHITECTURE
		
			for(MetodoDepreciacion metododepreciacionLocal:metododepreciacionsLocal) {
				if(this.permiteMantenimiento(metododepreciacionLocal) && metododepreciacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+MetodoDepreciacionConstantesFunciones.getMetodoDepreciacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MetodoDepreciacionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelid_empresaMetodoDepreciacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MetodoDepreciacionConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelid_sucursalMetodoDepreciacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MetodoDepreciacionConstantesFunciones.IDDETALLEACTIVOFIJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelid_detalle_activo_fijoMetodoDepreciacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MetodoDepreciacionConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelid_anioMetodoDepreciacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MetodoDepreciacionConstantesFunciones.FECHADESDE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelfecha_desdeMetodoDepreciacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MetodoDepreciacionConstantesFunciones.FECHAHASTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelfecha_hastaMetodoDepreciacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MetodoDepreciacionConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelporcentajeMetodoDepreciacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MetodoDepreciacionConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelvalorMetodoDepreciacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MetodoDepreciacionConstantesFunciones.NUMERODIAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelnumero_diasMetodoDepreciacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelid_empresaMetodoDepreciacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelid_sucursalMetodoDepreciacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelid_detalle_activo_fijoMetodoDepreciacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelid_anioMetodoDepreciacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelfecha_desdeMetodoDepreciacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelfecha_hastaMetodoDepreciacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelporcentajeMetodoDepreciacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelvalorMetodoDepreciacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelnumero_diasMetodoDepreciacion,"");
		
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
		this.iIdNuevoMetodoDepreciacion--;	
		
		
		this.metododepreciacionAux=new MetodoDepreciacion();
		
		this.metododepreciacionAux.setId(this.iIdNuevoMetodoDepreciacion);
		this.metododepreciacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.metododepreciacionLogic.getMetodoDepreciacions().add(this.metododepreciacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.metododepreciacions.add(this.metododepreciacionAux);
		}
		//ARCHITECTURE
		
		this.metododepreciacion=this.metododepreciacionAux;
		
		if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMetodoDepreciacion(this.metododepreciacion);
			this.setVariablesObjetoActualToFormularioForeignKeyMetodoDepreciacion(this.metododepreciacion);
		}
				
		//this.setDefaultControlesMetodoDepreciacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMetodoDepreciacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMetodoDepreciacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMetodoDepreciacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMetodoDepreciacion(this.metododepreciacionBean,this.metododepreciacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.metododepreciacionSessionBean.getConGuardarRelaciones()) {
			classes=MetodoDepreciacionConstantesFunciones.getClassesRelationshipsOfMetodoDepreciacion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.metododepreciacionReturnGeneral=metododepreciacionLogic.procesarEventosMetodoDepreciacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.metododepreciacionLogic.getMetodoDepreciacions(),this.metododepreciacion,this.metododepreciacionParameterGeneral,this.isEsNuevoMetodoDepreciacion,classes);//this.metododepreciacionLogic.getMetodoDepreciacion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMetodoDepreciacion(this.metododepreciacionReturnGeneral,this.metododepreciacionBean,false);
		
		if(this.metododepreciacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMetodoDepreciacion(this.metododepreciacionReturnGeneral.getMetodoDepreciacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMetodoDepreciacion(this.metododepreciacionReturnGeneral.getMetodoDepreciacion());
		}
		
		if(this.metododepreciacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMetodoDepreciacion(this.metododepreciacionReturnGeneral.getMetodoDepreciacion(),classes);//this.metododepreciacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMetodoDepreciacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMetodoDepreciacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.RecargarFormMetodoDepreciacion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMetodoDepreciacion(false);
						
			if(metododepreciacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMetodoDepreciacion();
			}
			
			this.actualizarVisualTableDatosMetodoDepreciacion();
			
			this.jTableDatosMetodoDepreciacion.setRowSelectionInterval(this.getIndiceNuevoMetodoDepreciacion(), this.getIndiceNuevoMetodoDepreciacion());
			
			this.seleccionarFilaTablaMetodoDepreciacionActual();
						
			this.actualizarEstadoCeldasBotonesMetodoDepreciacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMetodoDepreciacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_desdeMetodoDepreciacion.setEnabled(isHabilitar && this.metododepreciacionConstantesFunciones.activarfecha_desdeMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_hastaMetodoDepreciacion.setEnabled(isHabilitar && this.metododepreciacionConstantesFunciones.activarfecha_hastaMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldporcentajeMetodoDepreciacion.setEnabled(isHabilitar && this.metododepreciacionConstantesFunciones.activarporcentajeMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldvalorMetodoDepreciacion.setEnabled(isHabilitar && this.metododepreciacionConstantesFunciones.activarvalorMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldnumero_diasMetodoDepreciacion.setEnabled(isHabilitar && this.metododepreciacionConstantesFunciones.activarnumero_diasMetodoDepreciacion);	
		//
		this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion.setEnabled(isHabilitar && this.metododepreciacionConstantesFunciones.activarid_empresaMetodoDepreciacion);//
		this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion.setEnabled(isHabilitar && this.metododepreciacionConstantesFunciones.activarid_sucursalMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion.setEnabled(isHabilitar && this.metododepreciacionConstantesFunciones.activarid_detalle_activo_fijoMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion.setEnabled(isHabilitar && this.metododepreciacionConstantesFunciones.activarid_anioMetodoDepreciacion);
	};
	
	public void setDefaultControlesMetodoDepreciacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMetodoDepreciacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.metododepreciacionSessionBean.setConGuardarRelaciones(true);			
			this.metododepreciacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMetodoDepreciacion.jTabbedPaneRelacionesMetodoDepreciacion.setVisible(true);
			
					
		} else {
			//this.metododepreciacionSessionBean.setConGuardarRelaciones(false);			
			this.metododepreciacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMetodoDepreciacion.jTabbedPaneRelacionesMetodoDepreciacion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoMetodoDepreciacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MetodoDepreciacion metododepreciacionAux:this.metododepreciacionLogic.getMetodoDepreciacions()) {
				if(metododepreciacionAux.getId().equals(this.iIdNuevoMetodoDepreciacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MetodoDepreciacion metododepreciacionAux:this.metododepreciacions) {
				if(metododepreciacionAux.getId().equals(this.iIdNuevoMetodoDepreciacion)) {
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
	
	public int getIndiceActualMetodoDepreciacion(MetodoDepreciacion metododepreciacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MetodoDepreciacion metododepreciacionAux:this.metododepreciacionLogic.getMetodoDepreciacions()) {
				if(metododepreciacionAux.getId().equals(metododepreciacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MetodoDepreciacion metododepreciacionAux:this.metododepreciacions) {
				if(metododepreciacionAux.getId().equals(metododepreciacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalMetodoDepreciacion(MetodoDepreciacion metododepreciacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MetodoDepreciacion metododepreciacionAux:this.metododepreciacionLogic.getMetodoDepreciacions()) {
				if(metododepreciacionAux.getMetodoDepreciacionOriginal().getId().equals(metododepreciacionOriginal.getId())) {
					existe=true;
					metododepreciacionOriginal.setId(metododepreciacionAux.getId());
					metododepreciacionOriginal.setVersionRow(metododepreciacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MetodoDepreciacion metododepreciacionAux:this.metododepreciacions) {
				if(metododepreciacionAux.getMetodoDepreciacionOriginal().getId().equals(metododepreciacionOriginal.getId())) {
					existe=true;
					metododepreciacionOriginal.setId(metododepreciacionAux.getId());
					metododepreciacionOriginal.setVersionRow(metododepreciacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMetodoDepreciacion(Boolean esParaCancelar) throws Exception {
		metododepreciacionsAux=new ArrayList<MetodoDepreciacion>();
		metododepreciacionAux=new MetodoDepreciacion();
		
		if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MetodoDepreciacion metododepreciacionAux:this.metododepreciacionLogic.getMetodoDepreciacions()) {
					if(metododepreciacionAux.getId()<0) {
						metododepreciacionsAux.add(metododepreciacionAux);
					}		
				}
				this.iIdNuevoMetodoDepreciacion=0L;
				this.metododepreciacionLogic.getMetodoDepreciacions().removeAll(metododepreciacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MetodoDepreciacion metododepreciacionAux:this.metododepreciacions) {
					if(metododepreciacionAux.getId()<0) {
						metododepreciacionsAux.add(metododepreciacionAux);
					}		
				}
				this.iIdNuevoMetodoDepreciacion=0L;
				this.metododepreciacions.removeAll(metododepreciacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMetodoDepreciacion 
					&& this.metododepreciacionLogic.getMetodoDepreciacions().size()>0
					) {
					metododepreciacionAux=this.metododepreciacionLogic.getMetodoDepreciacions().get(this.metododepreciacionLogic.getMetodoDepreciacions().size() - 1);
				
					if(metododepreciacionAux.getId()<0) {
						this.metododepreciacionLogic.getMetodoDepreciacions().remove(metododepreciacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMetodoDepreciacion && this.metododepreciacions.size()>0) {
					metododepreciacionAux=this.metododepreciacions.get(this.metododepreciacions.size() - 1);
				
					if(metododepreciacionAux.getId()<0) {
						this.metododepreciacions.remove(metododepreciacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMetodoDepreciacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(metododepreciacion.getId()<0) {
				this.metododepreciacionLogic.getMetodoDepreciacions().remove(this.metododepreciacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(metododepreciacion.getId()<0) {
				this.metododepreciacions.remove(this.metododepreciacion);
			}
		}			
	}
	
	public void setEstadosInicialesMetodoDepreciacion(List<MetodoDepreciacion> metododepreciacionsAux) throws Exception {
		MetodoDepreciacionConstantesFunciones.setEstadosInicialesMetodoDepreciacion(metododepreciacionsAux);
	}
	
	public void setEstadosInicialesMetodoDepreciacion(MetodoDepreciacion metododepreciacionAux) throws Exception {
		MetodoDepreciacionConstantesFunciones.setEstadosInicialesMetodoDepreciacion(metododepreciacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMetodoDepreciacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMetodoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMetodoDepreciacionActual()) {
				if(!this.isEsNuevoMetodoDepreciacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMetodoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMetodoDepreciacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMetodoDepreciacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Metodo Depreciacion ?", "MANTENIMIENTO DE Metodo Depreciacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMetodoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(MetodoDepreciacion metododepreciacion) throws Exception {
		MetodoDepreciacionConstantesFunciones.seleccionarAsignar(this.metododepreciacion,metododepreciacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMetodoDepreciacion=this.isPermisoActualizarOriginalMetodoDepreciacion;
			
			
			this.seleccionarAsignar(metododepreciacion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MetodoDepreciacionConstantesFunciones.quitarEspaciosMetodoDepreciacion(this.metododepreciacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesMetodoDepreciacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.metododepreciacionSessionBean.setsFuncionBusquedaRapida(this.metododepreciacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoMetodoDepreciacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMetodoDepreciacion(esParaCancelar);				
				this.cancelarNuevoMetodoDepreciacion(esParaCancelar);								
			}
			
			this.metododepreciacion=new MetodoDepreciacion();
			
			this.inicializarMetodoDepreciacion();
			
			this.actualizarEstadoCeldasBotonesMetodoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMetodoDepreciacion() throws Exception {
		try {
			MetodoDepreciacionConstantesFunciones.inicializarMetodoDepreciacion(this.metododepreciacion);
			
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
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.metododepreciacionLogic.getMetodoDepreciacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMetodoDepreciacions(String sAccionBusqueda,List<MetodoDepreciacion> metododepreciacionsParaReportes) throws Exception {
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
					sPathReporteFinal="MetodoDepreciacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MetodoDepreciacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MetodoDepreciacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="MetodoDepreciacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Metodo Depreciaciones");		
		parameters.put("busquedapor", MetodoDepreciacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMetodoDepreciacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MetodoDepreciacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MetodoDepreciacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMetodoDepreciacion=new JRBeanArrayDataSource(MetodoDepreciacionJInternalFrame.TraerMetodoDepreciacionBeans(metododepreciacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMetodoDepreciacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MetodoDepreciacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MetodoDepreciacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MetodoDepreciacionBean.TraerMetodoDepreciacionBeans(metododepreciacionsParaReportes).toArray()));
							
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
				this.generarExcelReporteMetodoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,metododepreciacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMetodoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,metododepreciacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMetodoDepreciacionActionPerformed(null);
					//this.generarExcelReporteMetodoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,metododepreciacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMetodoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,metododepreciacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMetodoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,metododepreciacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMetodoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,metododepreciacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMetodoDepreciacions(String sAccionBusqueda,String sTipoArchivoReporte,List<MetodoDepreciacion> metododepreciacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"metododepreciacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MetodoDepreciacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMetodoDepreciacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(MetodoDepreciacion metododepreciacion : metododepreciacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MetodoDepreciacionConstantesFunciones.generarExcelReporteDataMetodoDepreciacion("NORMAL",row,workbook,metododepreciacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Metodo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMetodoDepreciacion(String sTipo,Row row,Workbook workbook) {
		
		MetodoDepreciacionConstantesFunciones.generarExcelReporteHeaderMetodoDepreciacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMetodoDepreciacions(String sAccionBusqueda,String sTipoArchivoReporte,List<MetodoDepreciacion> metododepreciacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"metododepreciacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MetodoDepreciacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(MetodoDepreciacion metododepreciacion : metododepreciacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MetodoDepreciacionConstantesFunciones.getMetodoDepreciacionDescripcion(metododepreciacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(metododepreciacion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(metododepreciacion.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(metododepreciacion.getdetalleactivofijo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MetodoDepreciacionConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(metododepreciacion.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(metododepreciacion.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(metododepreciacion.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(metododepreciacion.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MetodoDepreciacionConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(metododepreciacion.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(metododepreciacion.getnumero_dias());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Metodo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMetodoDepreciacions(String sAccionBusqueda,String sTipoArchivoReporte,List<MetodoDepreciacion> metododepreciacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<MetodoDepreciacion> metododepreciacionsRespaldo=null;
		
		classes=MetodoDepreciacionConstantesFunciones.getClassesRelationshipsOfMetodoDepreciacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.metododepreciacionLogic.setDatosCliente(this.datosCliente);
		this.metododepreciacionLogic.setDatosDeep(this.datosDeep);
		this.metododepreciacionLogic.setIsConDeep(true);
		
		metododepreciacionsRespaldo=this.metododepreciacionLogic.getMetodoDepreciacions();
		
		this.metododepreciacionLogic.setMetodoDepreciacions(metododepreciacionsParaReportes);	
		this.metododepreciacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		metododepreciacionsParaReportes=this.metododepreciacionLogic.getMetodoDepreciacions();
		this.metododepreciacionLogic.setMetodoDepreciacions(metododepreciacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"metododepreciacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MetodoDepreciacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMetodoDepreciacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(MetodoDepreciacion metododepreciacion : metododepreciacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMetodoDepreciacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MetodoDepreciacionConstantesFunciones.generarExcelReporteDataMetodoDepreciacion("NORMAL",row,workbook,metododepreciacion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(MetodoDepreciacionConstantesFunciones.getMetodoDepreciacionDescripcion(metododepreciacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Metodo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMetodoDepreciacion() throws Exception {		
		this.startProcessMetodoDepreciacion(true);
	}
	
	public void startProcessMetodoDepreciacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasMetodoDepreciacion ,this.jPanelParametrosReportesMetodoDepreciacion, this.jScrollPanelDatosMetodoDepreciacion,this.jPanelPaginacionMetodoDepreciacion, this.jScrollPanelDatosEdicionMetodoDepreciacion, this.jPanelAccionesMetodoDepreciacion,this.jPanelAccionesFormularioMetodoDepreciacion,this.jmenuBarMetodoDepreciacion,this.jmenuBarDetalleMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,this.jTtoolBarDetalleMetodoDepreciacion);		
		
		final JTabbedPane jTabbedPaneBusquedasMetodoDepreciacion=this.jTabbedPaneBusquedasMetodoDepreciacion; 
		
		final JPanel jPanelParametrosReportesMetodoDepreciacion=this.jPanelParametrosReportesMetodoDepreciacion;
		//final JScrollPane jScrollPanelDatosMetodoDepreciacion=this.jScrollPanelDatosMetodoDepreciacion;
		final JTable jTableDatosMetodoDepreciacion=this.jTableDatosMetodoDepreciacion;		
		final JPanel jPanelPaginacionMetodoDepreciacion=this.jPanelPaginacionMetodoDepreciacion;
		//final JScrollPane jScrollPanelDatosEdicionMetodoDepreciacion=this.jScrollPanelDatosEdicionMetodoDepreciacion;
		final JPanel jPanelAccionesMetodoDepreciacion=this.jPanelAccionesMetodoDepreciacion;
		
		JPanel jPanelCamposAuxiliarMetodoDepreciacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMetodoDepreciacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
			jPanelCamposAuxiliarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jPanelCamposMetodoDepreciacion;
			jPanelAccionesFormularioAuxiliarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jPanelAccionesFormularioMetodoDepreciacion;
		}
		
		final JPanel jPanelCamposMetodoDepreciacion=jPanelCamposAuxiliarMetodoDepreciacion;
		final JPanel jPanelAccionesFormularioMetodoDepreciacion=jPanelAccionesFormularioAuxiliarMetodoDepreciacion;
		
		
		final JMenuBar jmenuBarMetodoDepreciacion=this.jmenuBarMetodoDepreciacion;
		final JToolBar jTtoolBarMetodoDepreciacion=this.jTtoolBarMetodoDepreciacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMetodoDepreciacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMetodoDepreciacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
			jmenuBarDetalleAuxiliarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jmenuBarDetalleMetodoDepreciacion;
			jTtoolBarDetalleAuxiliarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jTtoolBarDetalleMetodoDepreciacion;
		}
		
		final JMenuBar jmenuBarDetalleMetodoDepreciacion=jmenuBarDetalleAuxiliarMetodoDepreciacion;
		final JToolBar jTtoolBarDetalleMetodoDepreciacion=jTtoolBarDetalleAuxiliarMetodoDepreciacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMetodoDepreciacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMetodoDepreciacion;
			processRunnable.jTableDatos=jTableDatosMetodoDepreciacion;
			processRunnable.jPanelCampos=jPanelCamposMetodoDepreciacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionMetodoDepreciacion;
			processRunnable.jPanelAcciones=jPanelAccionesMetodoDepreciacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMetodoDepreciacion;
			
			
			processRunnable.jmenuBar=jmenuBarMetodoDepreciacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMetodoDepreciacion;
			processRunnable.jTtoolBar=jTtoolBarMetodoDepreciacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMetodoDepreciacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMetodoDepreciacion ,jPanelParametrosReportesMetodoDepreciacion,jTableDatosMetodoDepreciacion, /*jScrollPanelDatosMetodoDepreciacion,*/jPanelCamposMetodoDepreciacion,jPanelPaginacionMetodoDepreciacion, /*jScrollPanelDatosEdicionMetodoDepreciacion,*/ jPanelAccionesMetodoDepreciacion,jPanelAccionesFormularioMetodoDepreciacion,jmenuBarMetodoDepreciacion,jmenuBarDetalleMetodoDepreciacion,jTtoolBarMetodoDepreciacion,jTtoolBarDetalleMetodoDepreciacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMetodoDepreciacion ,jPanelParametrosReportesMetodoDepreciacion, jScrollPanelDatosMetodoDepreciacion,jPanelPaginacionMetodoDepreciacion, jScrollPanelDatosEdicionMetodoDepreciacion, jPanelAccionesMetodoDepreciacion,jPanelAccionesFormularioMetodoDepreciacion,jmenuBarMetodoDepreciacion,jmenuBarDetalleMetodoDepreciacion,jTtoolBarMetodoDepreciacion,jTtoolBarDetalleMetodoDepreciacion);
						
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
	
	public void finishProcessMetodoDepreciacion() {// throws Exception 
		this.finishProcessMetodoDepreciacion(true);
	}
	
	public void finishProcessMetodoDepreciacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasMetodoDepreciacion ,this.jPanelParametrosReportesMetodoDepreciacion, this.jScrollPanelDatosMetodoDepreciacion,this.jPanelPaginacionMetodoDepreciacion, this.jScrollPanelDatosEdicionMetodoDepreciacion, this.jPanelAccionesMetodoDepreciacion,this.jPanelAccionesFormularioMetodoDepreciacion,this.jmenuBarMetodoDepreciacion,this.jmenuBarDetalleMetodoDepreciacion,this.jTtoolBarMetodoDepreciacion,this.jTtoolBarDetalleMetodoDepreciacion);		
		
		final JTabbedPane jTabbedPaneBusquedasMetodoDepreciacion=this.jTabbedPaneBusquedasMetodoDepreciacion; 
		
		final JPanel jPanelParametrosReportesMetodoDepreciacion=this.jPanelParametrosReportesMetodoDepreciacion;
		//final JScrollPane jScrollPanelDatosMetodoDepreciacion=this.jScrollPanelDatosMetodoDepreciacion;
		final JTable jTableDatosMetodoDepreciacion=this.jTableDatosMetodoDepreciacion;		
		final JPanel jPanelPaginacionMetodoDepreciacion=this.jPanelPaginacionMetodoDepreciacion;
		//final JScrollPane jScrollPanelDatosEdicionMetodoDepreciacion=this.jScrollPanelDatosEdicionMetodoDepreciacion;
		final JPanel jPanelAccionesMetodoDepreciacion=this.jPanelAccionesMetodoDepreciacion;
		
		JPanel jPanelCamposAuxiliarMetodoDepreciacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMetodoDepreciacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
			jPanelCamposAuxiliarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jPanelCamposMetodoDepreciacion;
			jPanelAccionesFormularioAuxiliarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jPanelAccionesFormularioMetodoDepreciacion;
		}
		
		final JPanel jPanelCamposMetodoDepreciacion=jPanelCamposAuxiliarMetodoDepreciacion;
		final JPanel jPanelAccionesFormularioMetodoDepreciacion=jPanelAccionesFormularioAuxiliarMetodoDepreciacion;
		
		
		final JMenuBar jmenuBarMetodoDepreciacion=this.jmenuBarMetodoDepreciacion;		
		final JToolBar jTtoolBarMetodoDepreciacion=this.jTtoolBarMetodoDepreciacion;
				
		JMenuBar jmenuBarDetalleAuxiliarMetodoDepreciacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMetodoDepreciacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
			jmenuBarDetalleAuxiliarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jmenuBarDetalleMetodoDepreciacion;
			jTtoolBarDetalleAuxiliarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jTtoolBarDetalleMetodoDepreciacion;		
		}
		
		final JMenuBar jmenuBarDetalleMetodoDepreciacion=jmenuBarDetalleAuxiliarMetodoDepreciacion;
		final JToolBar jTtoolBarDetalleMetodoDepreciacion=jTtoolBarDetalleAuxiliarMetodoDepreciacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMetodoDepreciacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMetodoDepreciacion;
			processRunnable.jTableDatos=jTableDatosMetodoDepreciacion;
			processRunnable.jPanelCampos=jPanelCamposMetodoDepreciacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionMetodoDepreciacion;
			processRunnable.jPanelAcciones=jPanelAccionesMetodoDepreciacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMetodoDepreciacion;
			
			
			processRunnable.jmenuBar=jmenuBarMetodoDepreciacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMetodoDepreciacion;
			processRunnable.jTtoolBar=jTtoolBarMetodoDepreciacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMetodoDepreciacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMetodoDepreciacion ,jPanelParametrosReportesMetodoDepreciacion, jTableDatosMetodoDepreciacion,/*jScrollPanelDatosMetodoDepreciacion,*/jPanelCamposMetodoDepreciacion,jPanelPaginacionMetodoDepreciacion, /*jScrollPanelDatosEdicionMetodoDepreciacion,*/ jPanelAccionesMetodoDepreciacion,jPanelAccionesFormularioMetodoDepreciacion,jmenuBarMetodoDepreciacion,jmenuBarDetalleMetodoDepreciacion,jTtoolBarMetodoDepreciacion,jTtoolBarDetalleMetodoDepreciacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMetodoDepreciacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMetodoDepreciacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMetodoDepreciacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMetodoDepreciacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMetodoDepreciacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMetodoDepreciacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMetodoDepreciacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMetodoDepreciacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMetodoDepreciacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.metododepreciacionConstantesFunciones.getsFinalQueryMetodoDepreciacion();
		String  finalQueryPaginacionTodos=this.metododepreciacionConstantesFunciones.getsFinalQueryMetodoDepreciacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=MetodoDepreciacionConstantesFunciones.getArrayColumnasGlobalesNoMetodoDepreciacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MetodoDepreciacionConstantesFunciones.getArrayColumnasGlobalesMetodoDepreciacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MetodoDepreciacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.metododepreciacionsEliminados= new ArrayList<MetodoDepreciacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMetodoDepreciacion();
		
				///*MetodoDepreciacionSessionBean*/this.metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
			
			if(this.metododepreciacionSessionBean==null) {
				this.metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
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
					this.iNumeroPaginacion=MetodoDepreciacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MetodoDepreciacionConstantesFunciones.getClassesForeignKeysOfMetodoDepreciacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/metododepreciacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			metododepreciacionsAux= new ArrayList<MetodoDepreciacion>();
			
				
			metododepreciacionLogic.setDatosCliente(this.datosCliente);
			metododepreciacionLogic.setDatosDeep(this.datosDeep);
			metododepreciacionLogic.setIsConDeep(true);
			
			
			metododepreciacionLogic.getMetodoDepreciacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					metododepreciacionLogic.getTodosMetodoDepreciacions(finalQueryGlobal,pagination);
					
					//metododepreciacionLogic.getTodosMetodoDepreciacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(metododepreciacionLogic.getMetodoDepreciacions()==null|| metododepreciacionLogic.getMetodoDepreciacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							metododepreciacionsAux= new ArrayList<MetodoDepreciacion>();
							metododepreciacionsAux.addAll(metododepreciacionLogic.getMetodoDepreciacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							metododepreciacionsAux= new ArrayList<MetodoDepreciacion>();
							metododepreciacionsAux.addAll(metododepreciacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							metododepreciacionLogic.getTodosMetodoDepreciacions(finalQueryGlobal+"",this.pagination);												
							
							//metododepreciacionLogic.getTodosMetodoDepreciacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteMetodoDepreciacions("Todos",metododepreciacionLogic.getMetodoDepreciacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							metododepreciacionLogic.setMetodoDepreciacions(new ArrayList<MetodoDepreciacion>());					
							metododepreciacionLogic.getMetodoDepreciacions().addAll(metododepreciacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							metododepreciacions=new ArrayList<MetodoDepreciacion>();
							metododepreciacions.addAll(metododepreciacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idMetodoDepreciacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idMetodoDepreciacion=this.idActual;
				
				} else if(this.idMetodoDepreciacionActual!=null && this.idMetodoDepreciacionActual!=0L) {
					idMetodoDepreciacion=idMetodoDepreciacionActual;
				}
				
					
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndicePorId(idMetodoDepreciacion);
				
				this.metododepreciacions=new ArrayList<MetodoDepreciacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					metododepreciacionLogic.getEntity(idMetodoDepreciacion);
					
					//metododepreciacionLogic.getEntityWithConnection(idMetodoDepreciacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					metododepreciacionLogic.setMetodoDepreciacions(new ArrayList<MetodoDepreciacion>());
					metododepreciacionLogic.getMetodoDepreciacions().add(metododepreciacionLogic.getMetodoDepreciacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.metododepreciacions=new ArrayList<MetodoDepreciacion>();
					this.metododepreciacions.add(metododepreciacion);
				}
				
				if(metododepreciacionLogic.getMetodoDepreciacion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					metododepreciacionLogic.getMetodoDepreciacionsFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=metododepreciacionLogic.getMetodoDepreciacions()==null||metododepreciacionLogic.getMetodoDepreciacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=metododepreciacions==null|| metododepreciacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						metododepreciacionsAux=new ArrayList<MetodoDepreciacion>();
						metododepreciacionsAux.addAll(metododepreciacionLogic.getMetodoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							metododepreciacionsAux=new ArrayList<MetodoDepreciacion>();
							metododepreciacionsAux.addAll(metododepreciacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							metododepreciacionLogic.getMetodoDepreciacionsFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMetodoDepreciacions("FK_IdAnio",metododepreciacionLogic.getMetodoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMetodoDepreciacions("FK_IdAnio",metododepreciacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						metododepreciacionLogic.setMetodoDepreciacions(new ArrayList<MetodoDepreciacion>());
						metododepreciacionLogic.getMetodoDepreciacions().addAll(metododepreciacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							metododepreciacions=new ArrayList<MetodoDepreciacion>();
							metododepreciacions.addAll(metododepreciacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDetalleActivoFijo")) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					metododepreciacionLogic.getMetodoDepreciacionsFK_IdDetalleActivoFijo(finalQueryGlobal,pagination,id_detalle_activo_fijoFK_IdDetalleActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=metododepreciacionLogic.getMetodoDepreciacions()==null||metododepreciacionLogic.getMetodoDepreciacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=metododepreciacions==null|| metododepreciacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						metododepreciacionsAux=new ArrayList<MetodoDepreciacion>();
						metododepreciacionsAux.addAll(metododepreciacionLogic.getMetodoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							metododepreciacionsAux=new ArrayList<MetodoDepreciacion>();
							metododepreciacionsAux.addAll(metododepreciacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							metododepreciacionLogic.getMetodoDepreciacionsFK_IdDetalleActivoFijo(finalQueryGlobal,pagination,id_detalle_activo_fijoFK_IdDetalleActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMetodoDepreciacions("FK_IdDetalleActivoFijo",metododepreciacionLogic.getMetodoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMetodoDepreciacions("FK_IdDetalleActivoFijo",metododepreciacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						metododepreciacionLogic.setMetodoDepreciacions(new ArrayList<MetodoDepreciacion>());
						metododepreciacionLogic.getMetodoDepreciacions().addAll(metododepreciacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							metododepreciacions=new ArrayList<MetodoDepreciacion>();
							metododepreciacions.addAll(metododepreciacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					metododepreciacionLogic.getMetodoDepreciacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=metododepreciacionLogic.getMetodoDepreciacions()==null||metododepreciacionLogic.getMetodoDepreciacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=metododepreciacions==null|| metododepreciacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						metododepreciacionsAux=new ArrayList<MetodoDepreciacion>();
						metododepreciacionsAux.addAll(metododepreciacionLogic.getMetodoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							metododepreciacionsAux=new ArrayList<MetodoDepreciacion>();
							metododepreciacionsAux.addAll(metododepreciacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							metododepreciacionLogic.getMetodoDepreciacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMetodoDepreciacions("FK_IdEmpresa",metododepreciacionLogic.getMetodoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMetodoDepreciacions("FK_IdEmpresa",metododepreciacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						metododepreciacionLogic.setMetodoDepreciacions(new ArrayList<MetodoDepreciacion>());
						metododepreciacionLogic.getMetodoDepreciacions().addAll(metododepreciacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							metododepreciacions=new ArrayList<MetodoDepreciacion>();
							metododepreciacions.addAll(metododepreciacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					metododepreciacionLogic.getMetodoDepreciacionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=metododepreciacionLogic.getMetodoDepreciacions()==null||metododepreciacionLogic.getMetodoDepreciacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=metododepreciacions==null|| metododepreciacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						metododepreciacionsAux=new ArrayList<MetodoDepreciacion>();
						metododepreciacionsAux.addAll(metododepreciacionLogic.getMetodoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							metododepreciacionsAux=new ArrayList<MetodoDepreciacion>();
							metododepreciacionsAux.addAll(metododepreciacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							metododepreciacionLogic.getMetodoDepreciacionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MetodoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMetodoDepreciacions("FK_IdSucursal",metododepreciacionLogic.getMetodoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMetodoDepreciacions("FK_IdSucursal",metododepreciacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						metododepreciacionLogic.setMetodoDepreciacions(new ArrayList<MetodoDepreciacion>());
						metododepreciacionLogic.getMetodoDepreciacions().addAll(metododepreciacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							metododepreciacions=new ArrayList<MetodoDepreciacion>();
							metododepreciacions.addAll(metododepreciacionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMetodoDepreciacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMetodoDepreciacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=metododepreciacionLogic.getMetodoDepreciacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=metododepreciacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=metododepreciacionLogic.getMetodoDepreciacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=metododepreciacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(MetodoDepreciacion metododepreciacion) {
		Boolean permite=true;
		
		if(this.metododepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MetodoDepreciacionConstantesFunciones.getOrderByListaMetodoDepreciacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MetodoDepreciacionConstantesFunciones.getOrderByListaMetodoDepreciacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MetodoDepreciacion metododepreciacion:metododepreciacionLogic.getMetodoDepreciacions()) {
				if(metododepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
					metododepreciacionTotales=metododepreciacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MetodoDepreciacion metododepreciacion:this.metododepreciacions) {
				if(metododepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
					metododepreciacionTotales=metododepreciacion;
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
			this.metododepreciacionAux=new MetodoDepreciacion();
			this.metododepreciacionAux.setsType(Constantes2.S_TOTALES);
			this.metododepreciacionAux.setIsNew(false);
			this.metododepreciacionAux.setIsChanged(false);
			this.metododepreciacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				MetodoDepreciacionConstantesFunciones.TotalizarValoresFilaMetodoDepreciacion(this.metododepreciacionLogic.getMetodoDepreciacions(),this.metododepreciacionAux);
				
				this.metododepreciacionLogic.getMetodoDepreciacions().add(this.metododepreciacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MetodoDepreciacionConstantesFunciones.TotalizarValoresFilaMetodoDepreciacion(this.metododepreciacions,this.metododepreciacionAux);
				
				this.metododepreciacions.add(this.metododepreciacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		metododepreciacionTotales=new MetodoDepreciacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.metododepreciacionLogic.getMetodoDepreciacions().remove(metododepreciacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.metododepreciacions.remove(metododepreciacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		metododepreciacionTotales=new MetodoDepreciacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MetodoDepreciacion metododepreciacion:metododepreciacionLogic.getMetodoDepreciacions()) {
				if(metododepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
					metododepreciacionTotales=metododepreciacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MetodoDepreciacionConstantesFunciones.TotalizarValoresFilaMetodoDepreciacion(this.metododepreciacionLogic.getMetodoDepreciacions(),metododepreciacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MetodoDepreciacion metododepreciacion:this.metododepreciacions) {
				if(metododepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
					metododepreciacionTotales=metododepreciacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MetodoDepreciacionConstantesFunciones.TotalizarValoresFilaMetodoDepreciacion(this.metododepreciacions,metododepreciacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMetodoDepreciacionsFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMetodoDepreciacionsFK_IdDetalleActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMetodoDepreciacionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMetodoDepreciacionsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getMetodoDepreciacionsFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					metododepreciacionLogic.getMetodoDepreciacionsFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMetodoDepreciacionsFK_IdDetalleActivoFijo(String sFinalQuery,Long id_detalle_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					metododepreciacionLogic.getMetodoDepreciacionsFK_IdDetalleActivoFijo(sFinalQuery,this.pagination,id_detalle_activo_fijo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMetodoDepreciacionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					metododepreciacionLogic.getMetodoDepreciacionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMetodoDepreciacionsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					metododepreciacionLogic.getMetodoDepreciacionsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosMetodoDepreciacion() {
		this.isPermisoTodoMetodoDepreciacion=false;
		this.isPermisoNuevoMetodoDepreciacion=false;
		this.isPermisoActualizarMetodoDepreciacion=false;
		this.isPermisoActualizarOriginalMetodoDepreciacion=false;
		this.isPermisoEliminarMetodoDepreciacion=false;
		this.isPermisoGuardarCambiosMetodoDepreciacion=false;
		this.isPermisoConsultaMetodoDepreciacion=false;
		this.isPermisoBusquedaMetodoDepreciacion=false;
		this.isPermisoReporteMetodoDepreciacion=false;		
		this.isPermisoOrdenMetodoDepreciacion=false;		
		this.isPermisoPaginacionMedioMetodoDepreciacion=false;		
		this.isPermisoPaginacionAltoMetodoDepreciacion=false;
		this.isPermisoPaginacionTodoMetodoDepreciacion=false;
		this.isPermisoCopiarMetodoDepreciacion=false;		
		this.isPermisoVerFormMetodoDepreciacion=false;		
		this.isPermisoDuplicarMetodoDepreciacion=false;		
		this.isPermisoOrdenMetodoDepreciacion=false;		
	}
	
	public void setPermisosUsuarioMetodoDepreciacion(Boolean isPermiso) {
		this.isPermisoTodoMetodoDepreciacion=isPermiso;
		this.isPermisoNuevoMetodoDepreciacion=isPermiso;
		this.isPermisoActualizarMetodoDepreciacion=isPermiso;
		this.isPermisoActualizarOriginalMetodoDepreciacion=isPermiso;
		this.isPermisoEliminarMetodoDepreciacion=isPermiso;
		this.isPermisoGuardarCambiosMetodoDepreciacion=isPermiso;
		this.isPermisoConsultaMetodoDepreciacion=isPermiso;
		this.isPermisoBusquedaMetodoDepreciacion=isPermiso;
		this.isPermisoReporteMetodoDepreciacion=isPermiso;
		this.isPermisoOrdenMetodoDepreciacion=isPermiso;		
		this.isPermisoPaginacionMedioMetodoDepreciacion=isPermiso;		
		this.isPermisoPaginacionAltoMetodoDepreciacion=isPermiso;		
		this.isPermisoPaginacionTodoMetodoDepreciacion=isPermiso;		
		this.isPermisoCopiarMetodoDepreciacion=isPermiso;		
		this.isPermisoVerFormMetodoDepreciacion=isPermiso;		
		this.isPermisoDuplicarMetodoDepreciacion=isPermiso;
		this.isPermisoOrdenMetodoDepreciacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMetodoDepreciacion(Boolean isPermiso) {
		//this.isPermisoTodoMetodoDepreciacion=isPermiso;
		this.isPermisoNuevoMetodoDepreciacion=isPermiso;
		this.isPermisoActualizarMetodoDepreciacion=isPermiso;
		this.isPermisoActualizarOriginalMetodoDepreciacion=isPermiso;
		this.isPermisoEliminarMetodoDepreciacion=isPermiso;
		this.isPermisoGuardarCambiosMetodoDepreciacion=isPermiso;
		//this.isPermisoConsultaMetodoDepreciacion=isPermiso;
		//this.isPermisoBusquedaMetodoDepreciacion=isPermiso;
		//this.isPermisoReporteMetodoDepreciacion=isPermiso;
		//this.isPermisoOrdenMetodoDepreciacion=isPermiso;		
		//this.isPermisoPaginacionMedioMetodoDepreciacion=isPermiso;		
		//this.isPermisoPaginacionAltoMetodoDepreciacion=isPermiso;		
		//this.isPermisoPaginacionTodoMetodoDepreciacion=isPermiso;		
		//this.isPermisoCopiarMetodoDepreciacion=isPermiso;		
		//this.isPermisoDuplicarMetodoDepreciacion=isPermiso;
		//this.isPermisoOrdenMetodoDepreciacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMetodoDepreciacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(MetodoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebMetodoDepreciacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMetodoDepreciacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioMetodoDepreciacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMetodoDepreciacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMetodoDepreciacionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioMetodoDepreciacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MetodoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MetodoDepreciacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMetodoDepreciacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMetodoDepreciacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMetodoDepreciacion=this.isPermisoActualizarMetodoDepreciacion;
			this.isPermisoEliminarMetodoDepreciacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMetodoDepreciacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMetodoDepreciacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMetodoDepreciacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMetodoDepreciacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMetodoDepreciacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMetodoDepreciacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMetodoDepreciacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMetodoDepreciacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMetodoDepreciacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMetodoDepreciacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMetodoDepreciacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMetodoDepreciacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMetodoDepreciacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMetodoDepreciacion.setToolTipText(this.jTableDatosMetodoDepreciacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMetodoDepreciacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMetodoDepreciacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MetodoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(MetodoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioMetodoDepreciacion() throws Exception {
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
	public void inicializarCombosForeignKeyMetodoDepreciacionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.detalleactivofijosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMetodoDepreciacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MetodoDepreciacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyMetodoDepreciacionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetalleActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyDetalleActivoFijoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.detalleactivofijosForeignKey==null||this.detalleactivofijosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DetalleActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleActivoFijoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DetalleActivoFijoConstantesFunciones.SFINALQUERY;

				this.cargarCombosDetalleActivoFijosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyMetodoDepreciacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			MetodoDepreciacionParameterReturnGeneral metododepreciacionReturnGeneral=new MetodoDepreciacionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.metododepreciacionConstantesFunciones.cargarid_empresaMetodoDepreciacion)
					 || (this.esRecargarFks && this.metododepreciacionConstantesFunciones.cargarid_empresaMetodoDepreciacion)) {

					if(!this.metododepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+metododepreciacionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.metododepreciacionConstantesFunciones.cargarid_sucursalMetodoDepreciacion)
					 || (this.esRecargarFks && this.metododepreciacionConstantesFunciones.cargarid_sucursalMetodoDepreciacion)) {

					if(!this.metododepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+metododepreciacionSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalDetalleActivoFijo="";

				if(((this.detalleactivofijosForeignKey==null||this.detalleactivofijosForeignKey.size()<=0) && this.metododepreciacionConstantesFunciones.cargarid_detalle_activo_fijoMetodoDepreciacion)
					 || (this.esRecargarFks && this.metododepreciacionConstantesFunciones.cargarid_detalle_activo_fijoMetodoDepreciacion)) {

					if(!this.metododepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DetalleActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDetalleActivoFijo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleActivoFijoConstantesFunciones.TABLENAME);

						finalQueryGlobalDetalleActivoFijo=Funciones.GetFinalQueryAppend(finalQueryGlobalDetalleActivoFijo, "");
						finalQueryGlobalDetalleActivoFijo+=DetalleActivoFijoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDetalleActivoFijosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDetalleActivoFijo=" WHERE " + ConstantesSql.ID + "="+metododepreciacionSessionBean.getlidDetalleActivoFijoActual();
					}
				} else {
					finalQueryGlobalDetalleActivoFijo="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.metododepreciacionConstantesFunciones.cargarid_anioMetodoDepreciacion)
					 || (this.esRecargarFks && this.metododepreciacionConstantesFunciones.cargarid_anioMetodoDepreciacion)) {

					if(!this.metododepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+metododepreciacionSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				metododepreciacionReturnGeneral=metododepreciacionLogic.cargarCombosLoteForeignKeyMetodoDepreciacion(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalDetalleActivoFijo,finalQueryGlobalAnio);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=metododepreciacionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=metododepreciacionReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalDetalleActivoFijo.equals("NONE")) {
				this.detalleactivofijosForeignKey=metododepreciacionReturnGeneral.getdetalleactivofijosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=metododepreciacionReturnGeneral.getaniosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyMetodoDepreciacion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
			this.addItemDefectoCombosForeignKeyAnio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.metododepreciacionSessionBean==null) {
				this.metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
			}

			if(!this.metododepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.metododepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyDetalleActivoFijo()throws Exception {
		try {

			if(!this.metododepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {
				DetalleActivoFijo detalleactivofijo=new DetalleActivoFijo();
				DetalleActivoFijoConstantesFunciones.setDetalleActivoFijoDescripcion(detalleactivofijo,Constantes.SMENSAJE_ESCOJA_OPCION);
				detalleactivofijo.setId(null);

				if(!DetalleActivoFijoConstantesFunciones.ExisteEnLista(this.detalleactivofijosForeignKey,detalleactivofijo,true)) {

					this.detalleactivofijosForeignKey.add(0,detalleactivofijo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.metododepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyMetodoDepreciacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMetodoDepreciacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMetodoDepreciacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.metododepreciacion.setfecha_desde(this.parametroGeneralUsuario.getfecha_sistema());
				this.metododepreciacion.setfecha_hasta(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMetodoDepreciacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMetodoDepreciacion(MetodoDepreciacion metododepreciacion)throws Exception {	
		try {
			
			this.setActualDetalleActivoFijoForeignKey(metododepreciacion.getid_detalle_activo_fijo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMetodoDepreciacion(MetodoDepreciacion metododepreciacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMetodoDepreciacion()throws Exception {	
		try {
			
			this.setActualDetalleActivoFijoForeignKey(this.metododepreciacionConstantesFunciones.getid_detalle_activo_fijo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMetodoDepreciacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMetodoDepreciacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMetodoDepreciacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMetodoDepreciacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMetodoDepreciacion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameDetalleActivoFijosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMetodoDepreciacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetalleActivoFijosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMetodoDepreciacion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion!=null && this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion!=null && this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion!=null && this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion!=null && this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public MetodoDepreciacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MetodoDepreciacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MetodoDepreciacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.metododepreciacionSessionBean=new MetodoDepreciacionSessionBean(); 
		this.metododepreciacionConstantesFunciones=new MetodoDepreciacionConstantesFunciones(); 
		this.metododepreciacionBean=new MetodoDepreciacion();//(this.metododepreciacionConstantesFunciones); 		
		this.metododepreciacionReturnGeneral=new MetodoDepreciacionParameterReturnGeneral(); 
		
		this.metododepreciacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.metododepreciacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MetodoDepreciacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MetodoDepreciacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MetodoDepreciacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMetodoDepreciacion(true);
			
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
			
			this.metododepreciacionConstantesFunciones=new MetodoDepreciacionConstantesFunciones(); 
			this.metododepreciacionBean=new MetodoDepreciacion();//this.metododepreciacionConstantesFunciones); 			
			this.metododepreciacionReturnGeneral=new MetodoDepreciacionParameterReturnGeneral(); 
		
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Metodo Depreciacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.metododepreciacion=new MetodoDepreciacion();
			this.metododepreciacions = new ArrayList<MetodoDepreciacion>();
			this.metododepreciacionsAux = new ArrayList<MetodoDepreciacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic=new MetodoDepreciacionLogic();
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}
			
			//this.metododepreciacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.metododepreciacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMetodoDepreciacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMetodoDepreciacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMetodoDepreciacion);	
					}
					
					if(this.jInternalFrameImportacionMetodoDepreciacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMetodoDepreciacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMetodoDepreciacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMetodoDepreciacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMetodoDepreciacion);
				this.jInternalFrameDetalleFormMetodoDepreciacion.setVisible(false);
				this.jInternalFrameDetalleFormMetodoDepreciacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMetodoDepreciacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMetodoDepreciacion);
					this.jInternalFrameReporteDinamicoMetodoDepreciacion.setVisible(false);
					this.jInternalFrameReporteDinamicoMetodoDepreciacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMetodoDepreciacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMetodoDepreciacion);
					this.jInternalFrameImportacionMetodoDepreciacion.setVisible(false);
					this.jInternalFrameImportacionMetodoDepreciacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMetodoDepreciacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMetodoDepreciacion);
					this.jInternalFrameOrderByMetodoDepreciacion.setVisible(false);
					this.jInternalFrameOrderByMetodoDepreciacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMetodoDepreciacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MetodoDepreciacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.metododepreciacionReturnGeneral=new MetodoDepreciacionParameterReturnGeneral();
			
			this.metododepreciacionParameterGeneral=new MetodoDepreciacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.metododepreciacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(MetodoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MetodoDepreciacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.metododepreciacionSessionBean.getEsGuardarRelacionado(),this.metododepreciacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MetodoDepreciacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.metododepreciacionSessionBean.getEsGuardarRelacionado(),this.metododepreciacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoMetodoDepreciacion=false;
			this.isVisibilidadCeldaDuplicarMetodoDepreciacion=true;
			this.isVisibilidadCeldaCopiarMetodoDepreciacion=true;
			this.isVisibilidadCeldaVerFormMetodoDepreciacion=true;
			this.isVisibilidadCeldaOrdenMetodoDepreciacion=true;
			this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=false;
			this.isVisibilidadCeldaModificarMetodoDepreciacion=false;
			this.isVisibilidadCeldaActualizarMetodoDepreciacion=false;
			this.isVisibilidadCeldaEliminarMetodoDepreciacion=false;
			this.isVisibilidadCeldaCancelarMetodoDepreciacion=false;
			this.isVisibilidadCeldaGuardarMetodoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdDetalleActivoFijo=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMetodoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMetodoDepreciacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMetodoDepreciacion(false);
			
			this.setPermisosUsuarioMetodoDepreciacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado() 
				|| (this.metododepreciacionSessionBean.getEsGuardarRelacionado() && this.metododepreciacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMetodoDepreciacionClasesRelacionadas();
			}
			
			if(this.metododepreciacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMetodoDepreciacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMetodoDepreciacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMetodoDepreciacion();
			}
			
			if(!this.isPermisoBusquedaMetodoDepreciacion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasMetodoDepreciacion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioMetodoDepreciacion,this.isPermisoPaginacionMedioMetodoDepreciacion,this.isPermisoPaginacionTodoMetodoDepreciacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MetodoDepreciacionConstantesFunciones.getTiposSeleccionarMetodoDepreciacion());
				
				this.tiposColumnasSelect=MetodoDepreciacionConstantesFunciones.getTiposSeleccionarMetodoDepreciacion(true);
				
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
			//if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMetodoDepreciacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioMetodoDepreciacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioMetodoDepreciacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMetodoDepreciacion() ;
			
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
			this.detalleactivofijoLogic=new DetalleActivoFijoLogic();
			this.anioLogic=new AnioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				metododepreciacionImplementable= (MetodoDepreciacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MetodoDepreciacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				metododepreciacionImplementableHome= (MetodoDepreciacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MetodoDepreciacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.metododepreciacions= new ArrayList<MetodoDepreciacion>();
			this.metododepreciacionsEliminados= new ArrayList<MetodoDepreciacion>();
						
			this.isEsNuevoMetodoDepreciacion=false;
			this.esParaAccionDesdeFormularioMetodoDepreciacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMetodoDepreciacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMetodoDepreciacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MetodoDepreciacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMetodoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMetodoDepreciacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMetodoDepreciacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMetodoDepreciacion();
			}
			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasMetodoDepreciacion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasMetodoDepreciacion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasMetodoDepreciacion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMetodoDepreciacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga MetodoDepreciacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMetodoDepreciacion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesMetodoDepreciacion")) {
				iIndex=this.jInternalFrameDetalleFormMetodoDepreciacion.jTabbedPaneRelacionesMetodoDepreciacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMetodoDepreciacion.jTabbedPaneRelacionesMetodoDepreciacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessMetodoDepreciacion();	
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
	
	public void cargarCombosForeignKeyMetodoDepreciacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMetodoDepreciacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMetodoDepreciacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMetodoDepreciacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMetodoDepreciacion();
		
		this.cargarCombosFrameForeignKeyMetodoDepreciacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMetodoDepreciacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMetodoDepreciacion();
		}
	}
	
	

	public void cargarCombosForeignKeyDetalleActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDetalleActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
				this.cargarCombosFrameDetalleActivoFijosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDetalleActivoFijo(this.detalleactivofijosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoMetodoDepreciacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.metododepreciacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMetodoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			
			
			if(jTableDatosMetodoDepreciacion.getRowCount()>=1) {
				jTableDatosMetodoDepreciacion.removeRowSelectionInterval(0, jTableDatosMetodoDepreciacion.getRowCount()-1);						
			}
			
			this.isEsNuevoMetodoDepreciacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMetodoDepreciacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMetodoDepreciacion(true);			
			//this.metododepreciacion=new MetodoDepreciacion();
			//this.metododepreciacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMetodoDepreciacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMetodoDepreciacion() ;
			
			if(MetodoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMetodoDepreciacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.metododepreciacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);				
			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			
			if(this.metododepreciacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar MetodoDepreciacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMetodoDepreciacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados=new ArrayList<MetodoDepreciacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMetodoDepreciacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMetodoDepreciacion.getSelectedRows().length;			
			}
			
			metododepreciacionsSeleccionados=this.getMetodoDepreciacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMetodoDepreciacion--;			
				//MetodoDepreciacion metododepreciacionAux= new MetodoDepreciacion();			
				//metododepreciacionAux.setId(this.iIdNuevoMetodoDepreciacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//MetodoDepreciacion metododepreciacionOrigen=new MetodoDepreciacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(MetodoDepreciacion metododepreciacionOrigen : metododepreciacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							metododepreciacionOrigen =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							metododepreciacionOrigen =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMetodoDepreciacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.metododepreciacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMetodoDepreciacion(metododepreciacionOrigen,this.metododepreciacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.metododepreciacionLogic.getMetodoDepreciacions().add(this.metododepreciacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.metododepreciacions.add(this.metododepreciacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMetodoDepreciacion(false);
				
				this.jTableDatosMetodoDepreciacion.setRowSelectionInterval(this.getIndiceNuevoMetodoDepreciacion(), this.getIndiceNuevoMetodoDepreciacion());
				
				int iLastRow =  this.jTableDatosMetodoDepreciacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMetodoDepreciacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMetodoDepreciacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMetodoDepreciacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados=new ArrayList<MetodoDepreciacion>();									
		
			MetodoDepreciacion metododepreciacionOrigen=new MetodoDepreciacion();
			MetodoDepreciacion metododepreciacionDestino=new MetodoDepreciacion();
				
			metododepreciacionsSeleccionados=this.getMetodoDepreciacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMetodoDepreciacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || metododepreciacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMetodoDepreciacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						metododepreciacionOrigen =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						metododepreciacionOrigen =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						metododepreciacionDestino =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						metododepreciacionDestino =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				metododepreciacionOrigen =metododepreciacionsSeleccionados.get(0);
				metododepreciacionDestino =metododepreciacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMetodoDepreciacion(metododepreciacionOrigen,metododepreciacionDestino,true,false);
				
				metododepreciacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(metododepreciacionDestino,metododepreciacionLogic.getMetodoDepreciacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(metododepreciacionDestino,metododepreciacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMetodoDepreciacion(false);
				
				//this.jTableDatosMetodoDepreciacion.setRowSelectionInterval(this.getIndiceNuevoMetodoDepreciacion(), this.getIndiceNuevoMetodoDepreciacion());
				
				int iLastRow =  this.jTableDatosMetodoDepreciacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMetodoDepreciacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMetodoDepreciacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMetodoDepreciacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMetodoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMetodoDepreciacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMetodoDepreciacion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasMetodoDepreciacion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesMetodoDepreciacion.setVisible(!isVisible);
			this.jPanelPaginacionMetodoDepreciacion.setVisible(!isVisible);
			this.jPanelAccionesMetodoDepreciacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMetodoDepreciacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMetodoDepreciacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMetodoDepreciacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMetodoDepreciacion();
			
			this.abrirFrameOrderByMetodoDepreciacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMetodoDepreciacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMetodoDepreciacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMetodoDepreciacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMetodoDepreciacion.isMaximum()) {
					this.jInternalFrameDetalleFormMetodoDepreciacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMetodoDepreciacion.setSize(this.jInternalFrameDetalleFormMetodoDepreciacion.iWidthFormulario,this.jInternalFrameDetalleFormMetodoDepreciacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMetodoDepreciacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMetodoDepreciacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMetodoDepreciacion.isMaximum()) {
						this.jInternalFrameDetalleFormMetodoDepreciacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMetodoDepreciacion.jContentPaneDetalleMetodoDepreciacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMetodoDepreciacion.jTabbedPaneRelacionesMetodoDepreciacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMetodoDepreciacion.jContentPaneDetalleMetodoDepreciacion.getWidth(),MetodoDepreciacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMetodoDepreciacion.jTabbedPaneRelacionesMetodoDepreciacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMetodoDepreciacion.jContentPaneDetalleMetodoDepreciacion.getWidth(),MetodoDepreciacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMetodoDepreciacion.jTabbedPaneRelacionesMetodoDepreciacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMetodoDepreciacion.jContentPaneDetalleMetodoDepreciacion.getWidth(),MetodoDepreciacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMetodoDepreciacion.setVisible(true);
	        this.jInternalFrameDetalleFormMetodoDepreciacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMetodoDepreciacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMetodoDepreciacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMetodoDepreciacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMetodoDepreciacion,false,this);
				} else {
					this.jInternalFrameOrderByMetodoDepreciacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMetodoDepreciacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMetodoDepreciacion);
				this.jInternalFrameOrderByMetodoDepreciacion.setVisible(false);
				this.jInternalFrameOrderByMetodoDepreciacion.setSelected(false);
				
				this.jInternalFrameOrderByMetodoDepreciacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMetodoDepreciacion"));
				
				this.inicializarActualizarBindingTablaOrderByMetodoDepreciacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMetodoDepreciacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMetodoDepreciacion==null) {
				
				this.jInternalFrameImportacionMetodoDepreciacion=new ImportacionJInternalFrame(MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMetodoDepreciacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMetodoDepreciacion);
				this.jInternalFrameImportacionMetodoDepreciacion.setVisible(false);
				this.jInternalFrameImportacionMetodoDepreciacion.setSelected(false);


				this.jInternalFrameImportacionMetodoDepreciacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMetodoDepreciacion"));
				this.jInternalFrameImportacionMetodoDepreciacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMetodoDepreciacion"));
				this.jInternalFrameImportacionMetodoDepreciacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMetodoDepreciacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMetodoDepreciacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMetodoDepreciacion==null) {
				this.jInternalFrameReporteDinamicoMetodoDepreciacion=new ReporteDinamicoJInternalFrame(MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMetodoDepreciacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMetodoDepreciacion);
				this.jInternalFrameReporteDinamicoMetodoDepreciacion.setVisible(false);
				this.jInternalFrameReporteDinamicoMetodoDepreciacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMetodoDepreciacion"));
				this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMetodoDepreciacion"));
				this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMetodoDepreciacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMetodoDepreciacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleMetodoDepreciacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMetodoDepreciacion);
			
	       	this.jInternalFrameDetalleFormMetodoDepreciacion.setVisible(false);
	        this.jInternalFrameDetalleFormMetodoDepreciacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormMetodoDepreciacion.dispose();
			//this.jInternalFrameDetalleFormMetodoDepreciacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMetodoDepreciacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMetodoDepreciacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoMetodoDepreciacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMetodoDepreciacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMetodoDepreciacion.setVisible(true);
	        this.jInternalFrameImportacionMetodoDepreciacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMetodoDepreciacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMetodoDepreciacion.setVisible(true);
	        this.jInternalFrameOrderByMetodoDepreciacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMetodoDepreciacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMetodoDepreciacion.setVisible(false);
	        this.jInternalFrameOrderByMetodoDepreciacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMetodoDepreciacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMetodoDepreciacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoMetodoDepreciacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMetodoDepreciacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMetodoDepreciacion.setVisible(false);
	        this.jInternalFrameImportacionMetodoDepreciacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMetodoDepreciacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMetodoDepreciacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMetodoDepreciacion(true);
			//this.isEsNuevoMetodoDepreciacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMetodoDepreciacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMetodoDepreciacion(false) ;
			
			if(metododepreciacionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(MetodoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMetodoDepreciacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMetodoDepreciacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMetodoDepreciacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMetodoDepreciacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMetodoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMetodoDepreciacion(true);
			//this.isEsNuevoMetodoDepreciacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.metododepreciacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMetodoDepreciacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMetodoDepreciacion(false) ;
			
			if(MetodoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMetodoDepreciacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMetodoDepreciacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaDetalleActivoFijo(List<DetalleActivoFijo> detalleactivofijosForeignKey)throws Exception{
		TableColumn tableColumnDetalleActivoFijo=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO));
		TableCellEditor tableCellEditorDetalleActivoFijo =tableColumnDetalleActivoFijo.getCellEditor();

		DetalleActivoFijoTableCell detalleactivofijoTableCellFk=(DetalleActivoFijoTableCell)tableCellEditorDetalleActivoFijo;

		if(detalleactivofijoTableCellFk!=null) {
			detalleactivofijoTableCellFk.setdetalleactivofijosForeignKey(detalleactivofijosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMetodoDepreciacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detalleactivofijoTableCellFk.setRowActual(intSelectedRow);
			//detalleactivofijoTableCellFk.setdetalleactivofijosForeignKeyActual(detalleactivofijosForeignKey);
		//}


		if(detalleactivofijoTableCellFk!=null) {
			detalleactivofijoTableCellFk.RecargarDetalleActivoFijosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,MetodoDepreciacionConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMetodoDepreciacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMetodoDepreciacion(false);
			
			//if(!this.isEsNuevoMetodoDepreciacion) {								
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
				
			}
			
			if(this.permiteMantenimiento(this.metododepreciacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMetodoDepreciacion=true;
					this.inicializarActualizarBindingTablaMetodoDepreciacion(false);
					this.isEsNuevoMetodoDepreciacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMetodoDepreciacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMetodoDepreciacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMetodoDepreciacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMetodoDepreciacion(false);
				
				this.habilitarDeshabilitarControlesMetodoDepreciacion(false);
			
												
				
				if(MetodoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMetodoDepreciacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMetodoDepreciacionActionPerformed(evt,metododepreciacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMetodoDepreciacion(this.metododepreciacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMetodoDepreciacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,metododepreciacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.metododepreciacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(MetodoDepreciacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MetodoDepreciacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				this.metododepreciacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				this.metododepreciacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.metododepreciacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MetodoDepreciacionModel) this.jTableDatosMetodoDepreciacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMetodoDepreciacion=true;
				this.inicializarActualizarBindingTablaMetodoDepreciacion(false);
				this.isEsNuevoMetodoDepreciacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMetodoDepreciacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMetodoDepreciacion(false);
				
				this.habilitarDeshabilitarControlesMetodoDepreciacion(false);
				
				
				
				if(MetodoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMetodoDepreciacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMetodoDepreciacion.getRowCount()>=1) {
				jTableDatosMetodoDepreciacion.removeRowSelectionInterval(0, jTableDatosMetodoDepreciacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMetodoDepreciacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMetodoDepreciacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMetodoDepreciacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMetodoDepreciacion(false) ;
			
			this.isEsNuevoMetodoDepreciacion=false;
			
			if(MetodoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMetodoDepreciacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMetodoDepreciacion(false);
				
				//SI ES MANUAL
				if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMetodoDepreciacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMetodoDepreciacion--;			
			//MetodoDepreciacion metododepreciacionAux= new MetodoDepreciacion();			
			//metododepreciacionAux.setId(this.iIdNuevoMetodoDepreciacion);
			
			if(this.jInternalFrameDetalleFormMetodoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMetodoDepreciacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
			
			this.metododepreciacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.metododepreciacionLogic.getMetodoDepreciacions().add(this.metododepreciacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.metododepreciacions.add(this.metododepreciacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMetodoDepreciacion(false);
			
			this.jTableDatosMetodoDepreciacion.setRowSelectionInterval(this.getIndiceNuevoMetodoDepreciacion(), this.getIndiceNuevoMetodoDepreciacion());
			
			int iLastRow =  this.jTableDatosMetodoDepreciacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMetodoDepreciacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMetodoDepreciacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMetodoDepreciacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMetodoDepreciacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMetodoDepreciacion(false);
			
			//SI ES MANUAL
			if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMetodoDepreciacion();
			}
			
			//this.abrirFrameTreeMetodoDepreciacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Metodo DepreciacionES ?", "MANTENIMIENTO DE Metodo Depreciacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionMetodoDepreciacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralMetodoDepreciacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.metododepreciacionReturnGeneral=metododepreciacionLogic.procesarImportacionMetodoDepreciacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.metododepreciacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarMetodoDepreciacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMetodoDepreciacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMetodoDepreciacion.setFileImportacion(this.jInternalFrameImportacionMetodoDepreciacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMetodoDepreciacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMetodoDepreciacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMetodoDepreciacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMetodoDepreciacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados=new ArrayList<MetodoDepreciacion>();		

		metododepreciacionsSeleccionados=this.getMetodoDepreciacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MetodoDepreciacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MetodoDepreciacionBaseDesign.jrxml";
			
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
			
			this.generarReporteMetodoDepreciacions("Todos",metododepreciacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Metodo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetalleActivoFijo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetalleActivoFijo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetalleActivoFijo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetalleActivoFijo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaDesde_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaDesde_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaDesde_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaDesde_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaHasta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaHasta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaHasta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaHasta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDias_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDias_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDias_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDias_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					sNombreCampoCategoria="id_detalle_activo_fijo";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE:
					sNombreCampoCategoria="fecha_desde";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA:
					sNombreCampoCategoria="fecha_hasta";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoria="numero_dias";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					sNombreCampoCategoriaValor="id_detalle_activo_fijo";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE:
					sNombreCampoCategoriaValor="fecha_desde";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA:
					sNombreCampoCategoriaValor="fecha_hasta";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoriaValor="numero_dias";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Activo Fijo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_detalle_activo_fijo");
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Desde",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_desde");
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Hasta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_hasta");
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Dias",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_dias");
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
	
	public void jButtonGenerarExcelReporteDinamicoMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados=new ArrayList<MetodoDepreciacion>();		
		
		metododepreciacionsSeleccionados=this.getMetodoDepreciacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"metododepreciacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("MetodoDepreciacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(MetodoDepreciacion metododepreciacion:metododepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(metododepreciacion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(MetodoDepreciacion metododepreciacion:metododepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(metododepreciacion.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
					iRow++;

					for(MetodoDepreciacion metododepreciacion:metododepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(metododepreciacion.getdetalleactivofijo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(MetodoDepreciacion metododepreciacion:metododepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(metododepreciacion.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(MetodoDepreciacion metododepreciacion:metododepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(metododepreciacion.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(MetodoDepreciacion metododepreciacion:metododepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(metododepreciacion.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(MetodoDepreciacion metododepreciacion:metododepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(metododepreciacion.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(MetodoDepreciacion metododepreciacion:metododepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(metododepreciacion.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS);
					iRow++;

					for(MetodoDepreciacion metododepreciacion:metododepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(metododepreciacion.getnumero_dias());
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
			//	this.getFilaCabeceraExportarExcelMetodoDepreciacion(row);				
			//	iRow++;
			//}				
			
			//for(MetodoDepreciacion metododepreciacionAux:metododepreciacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMetodoDepreciacion(metododepreciacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Metodo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMetodoDepreciacion(false);
			
			//SI ES MANUAL
			if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMetodoDepreciacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMetodoDepreciacion(false);
			
			//SI ES MANUAL
			if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMetodoDepreciacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMetodoDepreciacion(false);
			
			//SI ES MANUAL
			if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMetodoDepreciacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMetodoDepreciacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMetodoDepreciacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMetodoDepreciacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMetodoDepreciacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMetodoDepreciacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMetodoDepreciacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosMetodoDepreciacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosMetodoDepreciacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMetodoDepreciacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMetodoDepreciacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMetodoDepreciacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMetodoDepreciacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMetodoDepreciacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMetodoDepreciacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMetodoDepreciacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMetodoDepreciacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMetodoDepreciacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMetodoDepreciacion();
		
		this.inicializarActualizarBindingBotonesManualMetodoDepreciacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMetodoDepreciacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMetodoDepreciacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMetodoDepreciacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMetodoDepreciacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMetodoDepreciacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMetodoDepreciacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMetodoDepreciacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMetodoDepreciacion.jCheckBoxPostAccionNuevoMetodoDepreciacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMetodoDepreciacion.jCheckBoxPostAccionSinCerrarMetodoDepreciacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMetodoDepreciacion.jCheckBoxPostAccionSinMensajeMetodoDepreciacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMetodoDepreciacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMetodoDepreciacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMetodoDepreciacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
				this.jInternalFrameDetalleFormMetodoDepreciacion.jCheckBoxPostAccionNuevoMetodoDepreciacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMetodoDepreciacion.jCheckBoxPostAccionSinCerrarMetodoDepreciacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMetodoDepreciacion.jCheckBoxPostAccionSinMensajeMetodoDepreciacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMetodoDepreciacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMetodoDepreciacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMetodoDepreciacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMetodoDepreciacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMetodoDepreciacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMetodoDepreciacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMetodoDepreciacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMetodoDepreciacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMetodoDepreciacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMetodoDepreciacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMetodoDepreciacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMetodoDepreciacion(Boolean esInicializar) throws Exception {
		try	{	
			if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMetodoDepreciacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMetodoDepreciacion() throws Exception {
		try	{
			if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMetodoDepreciacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMetodoDepreciacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMetodoDepreciacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMetodoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMetodoDepreciacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMetodoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMetodoDepreciacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMetodoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMetodoDepreciacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMetodoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMetodoDepreciacion.addItem(reporte);
			}
			
			
			if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMetodoDepreciacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMetodoDepreciacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMetodoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMetodoDepreciacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMetodoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMetodoDepreciacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMetodoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMetodoDepreciacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMetodoDepreciacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMetodoDepreciacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMetodoDepreciacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMetodoDepreciacion!=null) {
				this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMetodoDepreciacion!=null) {
				this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMetodoDepreciacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=MetodoDepreciacionConstantesFunciones.getTiposSeleccionarMetodoDepreciacion(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=MetodoDepreciacionConstantesFunciones.getTiposSeleccionarMetodoDepreciacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=MetodoDepreciacionConstantesFunciones.getTiposSeleccionarMetodoDepreciacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMetodoDepreciacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioFK_IdAnioMetodoDepreciacion.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioMetodoDepreciacion.getSelectedItem()).getId();}
		if(this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.getSelectedItem()!=null){this.id_detalle_activo_fijoFK_IdDetalleActivoFijo=((DetalleActivoFijo)this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoMetodoDepreciacion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMetodoDepreciacion(Boolean esInicializar) throws Exception {				
		if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMetodoDepreciacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMetodoDepreciacion() throws Exception {
		this.inicializarActualizarBindingTablaMetodoDepreciacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMetodoDepreciacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMetodoDepreciacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMetodoDepreciacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMetodoDepreciacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MetodoDepreciacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMetodoDepreciacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMetodoDepreciacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MetodoDepreciacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMetodoDepreciacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MetodoDepreciacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMetodoDepreciacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMetodoDepreciacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MetodoDepreciacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMetodoDepreciacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMetodoDepreciacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=metododepreciacionLogic.getMetodoDepreciacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=metododepreciacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMetodoDepreciacion.setModel(new MetodoDepreciacionModel(this.metododepreciacionLogic.getMetodoDepreciacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMetodoDepreciacion.setModel(new MetodoDepreciacionModel(this.metododepreciacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMetodoDepreciacion!=null && this.jInternalFrameOrderByMetodoDepreciacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMetodoDepreciacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MetodoDepreciacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO,metododepreciacionConstantesFunciones.resaltarSeleccionarMetodoDepreciacion,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MetodoDepreciacionConstantesFunciones.SCLASSWEBTITULO,metododepreciacionConstantesFunciones.resaltarSeleccionarMetodoDepreciacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,MetodoDepreciacionConstantesFunciones.LABEL_ID));

		if(this.metododepreciacionConstantesFunciones.mostraridMetodoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MetodoDepreciacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.metododepreciacionConstantesFunciones.resaltaridMetodoDepreciacion,this.metododepreciacionConstantesFunciones.activaridMetodoDepreciacion,iSizeTabla,this,true,"idMetodoDepreciacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.metododepreciacionConstantesFunciones.resaltaridMetodoDepreciacion,this.metododepreciacionConstantesFunciones.activaridMetodoDepreciacion,this,true,"idMetodoDepreciacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.metododepreciacionConstantesFunciones.mostrarid_empresaMetodoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.metododepreciacionConstantesFunciones.resaltarid_empresaMetodoDepreciacion,this,this.metododepreciacionConstantesFunciones.activarid_empresaMetodoDepreciacion,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.metododepreciacionConstantesFunciones.resaltarid_empresaMetodoDepreciacion,this,this.metododepreciacionConstantesFunciones.activarid_empresaMetodoDepreciacion,false,"id_empresaMetodoDepreciacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MetodoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.metododepreciacionConstantesFunciones.mostrarid_sucursalMetodoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.metododepreciacionConstantesFunciones.resaltarid_sucursalMetodoDepreciacion,this,this.metododepreciacionConstantesFunciones.activarid_sucursalMetodoDepreciacion,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.metododepreciacionConstantesFunciones.resaltarid_sucursalMetodoDepreciacion,this,this.metododepreciacionConstantesFunciones.activarid_sucursalMetodoDepreciacion,false,"id_sucursalMetodoDepreciacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MetodoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO));

		if(this.metododepreciacionConstantesFunciones.mostrarid_detalle_activo_fijoMetodoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetalleActivoFijoTableCell(this.detalleactivofijosForeignKey,this.metododepreciacionConstantesFunciones.resaltarid_detalle_activo_fijoMetodoDepreciacion,this,this.metododepreciacionConstantesFunciones.activarid_detalle_activo_fijoMetodoDepreciacion,iSizeTabla));
			tableColumn.setCellEditor(new DetalleActivoFijoTableCell(this.detalleactivofijosForeignKey,this.metododepreciacionConstantesFunciones.resaltarid_detalle_activo_fijoMetodoDepreciacion,this,this.metododepreciacionConstantesFunciones.activarid_detalle_activo_fijoMetodoDepreciacion,true,"id_detalle_activo_fijoMetodoDepreciacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MetodoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,MetodoDepreciacionConstantesFunciones.LABEL_IDANIO));

		if(this.metododepreciacionConstantesFunciones.mostrarid_anioMetodoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MetodoDepreciacionConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.metododepreciacionConstantesFunciones.resaltarid_anioMetodoDepreciacion,this,this.metododepreciacionConstantesFunciones.activarid_anioMetodoDepreciacion,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.metododepreciacionConstantesFunciones.resaltarid_anioMetodoDepreciacion,this,this.metododepreciacionConstantesFunciones.activarid_anioMetodoDepreciacion,true,"id_anioMetodoDepreciacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MetodoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE));

		if(this.metododepreciacionConstantesFunciones.mostrarfecha_desdeMetodoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.metododepreciacionConstantesFunciones.resaltarfecha_desdeMetodoDepreciacion,this.metododepreciacionConstantesFunciones.activarfecha_desdeMetodoDepreciacion,iSizeTabla,this,true,"fecha_desdeMetodoDepreciacion","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.metododepreciacionConstantesFunciones.resaltarfecha_desdeMetodoDepreciacion,this.metododepreciacionConstantesFunciones.activarfecha_desdeMetodoDepreciacion,this,true,"fecha_desdeMetodoDepreciacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new MetodoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA));

		if(this.metododepreciacionConstantesFunciones.mostrarfecha_hastaMetodoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.metododepreciacionConstantesFunciones.resaltarfecha_hastaMetodoDepreciacion,this.metododepreciacionConstantesFunciones.activarfecha_hastaMetodoDepreciacion,iSizeTabla,this,true,"fecha_hastaMetodoDepreciacion","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.metododepreciacionConstantesFunciones.resaltarfecha_hastaMetodoDepreciacion,this.metododepreciacionConstantesFunciones.activarfecha_hastaMetodoDepreciacion,this,true,"fecha_hastaMetodoDepreciacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new MetodoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE));

		if(this.metododepreciacionConstantesFunciones.mostrarporcentajeMetodoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.metododepreciacionConstantesFunciones.resaltarporcentajeMetodoDepreciacion,this.metododepreciacionConstantesFunciones.activarporcentajeMetodoDepreciacion,iSizeTabla,this,true,"porcentajeMetodoDepreciacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.metododepreciacionConstantesFunciones.resaltarporcentajeMetodoDepreciacion,this.metododepreciacionConstantesFunciones.activarporcentajeMetodoDepreciacion,this,true,"porcentajeMetodoDepreciacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MetodoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,MetodoDepreciacionConstantesFunciones.LABEL_VALOR));

		if(this.metododepreciacionConstantesFunciones.mostrarvalorMetodoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MetodoDepreciacionConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.metododepreciacionConstantesFunciones.resaltarvalorMetodoDepreciacion,this.metododepreciacionConstantesFunciones.activarvalorMetodoDepreciacion,iSizeTabla,this,true,"valorMetodoDepreciacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.metododepreciacionConstantesFunciones.resaltarvalorMetodoDepreciacion,this.metododepreciacionConstantesFunciones.activarvalorMetodoDepreciacion,this,true,"valorMetodoDepreciacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MetodoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS));

		if(this.metododepreciacionConstantesFunciones.mostrarnumero_diasMetodoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.metododepreciacionConstantesFunciones.resaltarnumero_diasMetodoDepreciacion,this.metododepreciacionConstantesFunciones.activarnumero_diasMetodoDepreciacion,iSizeTabla,this,true,"numero_diasMetodoDepreciacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.metododepreciacionConstantesFunciones.resaltarnumero_diasMetodoDepreciacion,this.metododepreciacionConstantesFunciones.activarnumero_diasMetodoDepreciacion,this,true,"numero_diasMetodoDepreciacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MetodoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.metododepreciacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.metododepreciacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMetodoDepreciacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.metododepreciacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.metododepreciacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMetodoDepreciacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMetodoDepreciacion && this.isPermisoGuardarCambiosMetodoDepreciacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.metododepreciacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.metododepreciacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMetodoDepreciacion.addColumn(tableColumn);
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
			
			this.jTableDatosMetodoDepreciacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMetodoDepreciacion && this.isPermisoGuardarCambiosMetodoDepreciacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMetodoDepreciacion && this.isPermisoGuardarCambiosMetodoDepreciacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMetodoDepreciacion.moveColumn(this.jTableDatosMetodoDepreciacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMetodoDepreciacion.moveColumn(this.jTableDatosMetodoDepreciacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMetodoDepreciacion.moveColumn(this.jTableDatosMetodoDepreciacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMetodoDepreciacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMetodoDepreciacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMetodoDepreciacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMetodoDepreciacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMetodoDepreciacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMetodoDepreciacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMetodoDepreciacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=metododepreciacionLogic.getMetodoDepreciacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=metododepreciacions.size()-1;
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
		//this.jTableDatosMetodoDepreciacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMetodoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMetodoDepreciacion();
			
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
				
				//this.isEsNuevoMetodoDepreciacion=false;
					
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			
				if(this.metododepreciacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMetodoDepreciacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMetodoDepreciacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMetodoDepreciacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.metododepreciacion.getsType().equals("DUPLICADO")
				   || this.metododepreciacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMetodoDepreciacion=true;
				
				} else {
					this.isEsNuevoMetodoDepreciacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
					if(this.metododepreciacion.getId()>=0 && !this.metododepreciacion.getIsNew()) {						
						this.isEsNuevoMetodoDepreciacion=false;
						
					} else {
						this.isEsNuevoMetodoDepreciacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMetodoDepreciacion(esRelaciones);						
				
				this.seleccionarMetodoDepreciacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.metododepreciacion.getId()<0) {
					this.isEsNuevoMetodoDepreciacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMetodoDepreciacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMetodoDepreciacion(evt,rowIndex);
				}	
				
				if(this.metododepreciacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion MetodoDepreciacion: " + this.dDif); 
					}
				}								
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMetodoDepreciacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.metododepreciacion)) {
					if(this.metododepreciacion.getId()>0) {
						this.metododepreciacion.setIsDeleted(true);
						
						this.metododepreciacionsEliminados.add(this.metododepreciacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.metododepreciacionLogic.getMetodoDepreciacions().remove(this.metododepreciacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.metododepreciacions.remove(this.metododepreciacion);				
					}
					
					
					((MetodoDepreciacionModel) this.jTableDatosMetodoDepreciacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMetodoDepreciacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMetodoDepreciacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMetodoDepreciacion) {
			
			if(this.jInternalFrameDetalleFormMetodoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMetodoDepreciacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMetodoDepreciacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMetodoDepreciacion(this.metododepreciacion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.metododepreciacionConstantesFunciones.cargarid_empresaMetodoDepreciacion || this.metododepreciacionConstantesFunciones.event_dependid_empresaMetodoDepreciacion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.metododepreciacion.getid_empresa());
									//this.inicializarActualizarBindingMetodoDepreciacion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(metododepreciacion.getEmpresa()!=null) {
							this.empresasForeignKey.add(metododepreciacion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.metododepreciacion.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.metododepreciacionConstantesFunciones.cargarid_sucursalMetodoDepreciacion || this.metododepreciacionConstantesFunciones.event_dependid_sucursalMetodoDepreciacion) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.metododepreciacion.getid_sucursal());
									//this.inicializarActualizarBindingMetodoDepreciacion(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(metododepreciacion.getSucursal()!=null) {
							this.sucursalsForeignKey.add(metododepreciacion.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.metododepreciacion.getid_sucursal(),false,"Formulario");

					//DetalleActivoFijo
					if(!this.metododepreciacionConstantesFunciones.cargarid_detalle_activo_fijoMetodoDepreciacion || this.metododepreciacionConstantesFunciones.event_dependid_detalle_activo_fijoMetodoDepreciacion) {
						//this.cargarCombosDetalleActivoFijosForeignKeyLista(" where id="+this.metododepreciacion.getid_detalle_activo_fijo());
									//this.inicializarActualizarBindingMetodoDepreciacion(false,false);
						this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>();

						if(metododepreciacion.getDetalleActivoFijo()!=null) {
							this.detalleactivofijosForeignKey.add(metododepreciacion.getDetalleActivoFijo());
						}

						this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
						this.cargarCombosFrameDetalleActivoFijosForeignKey("Todos");
					}
					this.setActualDetalleActivoFijoForeignKey(this.metododepreciacion.getid_detalle_activo_fijo(),false,"Formulario");

					//Anio
					if(!this.metododepreciacionConstantesFunciones.cargarid_anioMetodoDepreciacion || this.metododepreciacionConstantesFunciones.event_dependid_anioMetodoDepreciacion) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.metododepreciacion.getid_anio());
									//this.inicializarActualizarBindingMetodoDepreciacion(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(metododepreciacion.getAnio()!=null) {
							this.aniosForeignKey.add(metododepreciacion.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.metododepreciacion.getid_anio(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMetodoDepreciacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMetodoDepreciacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMetodoDepreciacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMetodoDepreciacion(MetodoDepreciacion metododepreciacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMetodoDepreciacion(metododepreciacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMetodoDepreciacion(MetodoDepreciacion metododepreciacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMetodoDepreciacion(metododepreciacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMetodoDepreciacion(metododepreciacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMetodoDepreciacion(metododepreciacion);
	}
	
	public void setVariablesObjetoActualToFormularioMetodoDepreciacion(MetodoDepreciacion metododepreciacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMetodoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelidMetodoDepreciacion.setText(metododepreciacion.getId().toString());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_desdeMetodoDepreciacion.setDate(metododepreciacion.getfecha_desde());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_hastaMetodoDepreciacion.setDate(metododepreciacion.getfecha_hasta());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldporcentajeMetodoDepreciacion.setText(metododepreciacion.getporcentaje().toString());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldvalorMetodoDepreciacion.setText(metododepreciacion.getvalor().toString());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldnumero_diasMetodoDepreciacion.setText(metododepreciacion.getnumero_dias().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,MetodoDepreciacion metododepreciacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,metododepreciacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,MetodoDepreciacion metododepreciacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				metododepreciacionLocal=this.metododepreciacion;
			} else {
				metododepreciacionLocal=this.metododepreciacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(metododepreciacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMetodoDepreciacion(metododepreciacionLocal,true);
					
					if(metododepreciacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(metododepreciacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(metododepreciacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMetodoDepreciacion(MetodoDepreciacion metododepreciacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMetodoDepreciacion(metododepreciacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(metododepreciacion);
	}
	
	public void setVariablesFormularioToObjetoActualMetodoDepreciacion(MetodoDepreciacion metododepreciacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMetodoDepreciacion(metododepreciacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMetodoDepreciacion(MetodoDepreciacion metododepreciacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMetodoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelidMetodoDepreciacion.getText()==null || this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelidMetodoDepreciacion.getText()=="" || this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelidMetodoDepreciacion.getText()=="Id") {
				this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelidMetodoDepreciacion.setText("0");
			}

			if(conColumnasBase) {metododepreciacion.setId(Long.parseLong(this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelidMetodoDepreciacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MetodoDepreciacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelIdMetodoDepreciacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			metododepreciacion.setfecha_desde(this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_desdeMetodoDepreciacion.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelfecha_desdeMetodoDepreciacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			metododepreciacion.setfecha_hasta(this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_hastaMetodoDepreciacion.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelfecha_hastaMetodoDepreciacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			metododepreciacion.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldporcentajeMetodoDepreciacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelporcentajeMetodoDepreciacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			metododepreciacion.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldvalorMetodoDepreciacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MetodoDepreciacionConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelvalorMetodoDepreciacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			metododepreciacion.setnumero_dias(Integer.parseInt(this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldnumero_diasMetodoDepreciacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelnumero_diasMetodoDepreciacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMetodoDepreciacion(MetodoDepreciacion metododepreciacionBean,MetodoDepreciacion metododepreciacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMetodoDepreciacion(MetodoDepreciacion metododepreciacionOrigen,MetodoDepreciacion metododepreciacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && metododepreciacionOrigen.getId()!=null && !metododepreciacionOrigen.getId().equals(0L))) {metododepreciacion.setId(metododepreciacionOrigen.getId());}}
			if(conDefault || (!conDefault && metododepreciacionOrigen.getfecha_desde()!=null && !metododepreciacionOrigen.getfecha_desde().equals(new Date()))) {metododepreciacion.setfecha_desde(metododepreciacionOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && metododepreciacionOrigen.getfecha_hasta()!=null && !metododepreciacionOrigen.getfecha_hasta().equals(new Date()))) {metododepreciacion.setfecha_hasta(metododepreciacionOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && metododepreciacionOrigen.getporcentaje()!=null && !metododepreciacionOrigen.getporcentaje().equals(0.0))) {metododepreciacion.setporcentaje(metododepreciacionOrigen.getporcentaje());}
			if(conDefault || (!conDefault && metododepreciacionOrigen.getvalor()!=null && !metododepreciacionOrigen.getvalor().equals(0.0))) {metododepreciacion.setvalor(metododepreciacionOrigen.getvalor());}
			if(conDefault || (!conDefault && metododepreciacionOrigen.getnumero_dias()!=null && !metododepreciacionOrigen.getnumero_dias().equals(0))) {metododepreciacion.setnumero_dias(metododepreciacionOrigen.getnumero_dias());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMetodoDepreciacion(MetodoDepreciacion metododepreciacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelidMetodoDepreciacion.setText(metododepreciacion.getId().toString());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_desdeMetodoDepreciacion.setDate(metododepreciacion.getfecha_desde());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_hastaMetodoDepreciacion.setDate(metododepreciacion.getfecha_hasta());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldporcentajeMetodoDepreciacion.setText(metododepreciacion.getporcentaje().toString());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldvalorMetodoDepreciacion.setText(metododepreciacion.getvalor().toString());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldnumero_diasMetodoDepreciacion.setText(metododepreciacion.getnumero_dias().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMetodoDepreciacion(MetodoDepreciacionBean metododepreciacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelidMetodoDepreciacion.setText(metododepreciacionBean.getId().toString());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_desdeMetodoDepreciacion.setDate(metododepreciacionBean.getfecha_desde());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_hastaMetodoDepreciacion.setDate(metododepreciacionBean.getfecha_hasta());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldporcentajeMetodoDepreciacion.setText(metododepreciacionBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldvalorMetodoDepreciacion.setText(metododepreciacionBean.getvalor().toString());
			this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldnumero_diasMetodoDepreciacion.setText(metododepreciacionBean.getnumero_dias().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMetodoDepreciacion(MetodoDepreciacionParameterReturnGeneral metododepreciacionReturnGeneral,MetodoDepreciacionBean metododepreciacionBean,Boolean conDefault) throws Exception { 
		try {
			MetodoDepreciacion metododepreciacionLocal=new MetodoDepreciacion();
			
			metododepreciacionLocal=metododepreciacionReturnGeneral.getMetodoDepreciacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && metododepreciacionLocal.getId()!=null && !metododepreciacionLocal.getId().equals(0L))) {metododepreciacionBean.setId(metododepreciacionLocal.getId());}}
			if(conDefault || (!conDefault && metododepreciacionLocal.getfecha_desde()!=null && !metododepreciacionLocal.getfecha_desde().equals(new Date()))) {metododepreciacionBean.setfecha_desde(metododepreciacionLocal.getfecha_desde());}
			if(conDefault || (!conDefault && metododepreciacionLocal.getfecha_hasta()!=null && !metododepreciacionLocal.getfecha_hasta().equals(new Date()))) {metododepreciacionBean.setfecha_hasta(metododepreciacionLocal.getfecha_hasta());}
			if(conDefault || (!conDefault && metododepreciacionLocal.getporcentaje()!=null && !metododepreciacionLocal.getporcentaje().equals(0.0))) {metododepreciacionBean.setporcentaje(metododepreciacionLocal.getporcentaje());}
			if(conDefault || (!conDefault && metododepreciacionLocal.getvalor()!=null && !metododepreciacionLocal.getvalor().equals(0.0))) {metododepreciacionBean.setvalor(metododepreciacionLocal.getvalor());}
			if(conDefault || (!conDefault && metododepreciacionLocal.getnumero_dias()!=null && !metododepreciacionLocal.getnumero_dias().equals(0))) {metododepreciacionBean.setnumero_dias(metododepreciacionLocal.getnumero_dias());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMetodoDepreciacionGenerico(Long idMetodoDepreciacionSeleccionado,JComboBox jComboBoxMetodoDepreciacion,List<MetodoDepreciacion> metododepreciacionsLocal)throws Exception {
		try {
			MetodoDepreciacion  metododepreciacionTemp=null;

			for(MetodoDepreciacion metododepreciacionAux:metododepreciacionsLocal) {
				if(metododepreciacionAux.getId()!=null && metododepreciacionAux.getId().equals(idMetodoDepreciacionSeleccionado)) {
					metododepreciacionTemp=metododepreciacionAux;
					break;
				}
			}

			jComboBoxMetodoDepreciacion.setSelectedItem(metododepreciacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMetodoDepreciacionGenerico(JComboBox jComboBoxMetodoDepreciacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMetodoDepreciacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMetodoDepreciacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMetodoDepreciacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMetodoDepreciacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMetodoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMetodoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			metododepreciacion=(MetodoDepreciacion) metododepreciacionLogic.getMetodoDepreciacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			metododepreciacion =(MetodoDepreciacion) metododepreciacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!metododepreciacion.getIsNew() && !metododepreciacion.getIsChanged() && !metododepreciacion.getIsDeleted()) {
				sDescripcion=metododepreciacion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=metododepreciacion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!metododepreciacion.getIsNew() && !metododepreciacion.getIsChanged() && !metododepreciacion.getIsDeleted()) {
				sDescripcion=metododepreciacion.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=metododepreciacion.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("DetalleActivoFijo")) {
			//sDescripcion=this.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value);
			if(!metododepreciacion.getIsNew() && !metododepreciacion.getIsChanged() && !metododepreciacion.getIsDeleted()) {
				sDescripcion=metododepreciacion.getdetalleactivofijo_descripcion();
			} else {
				//sDescripcion=this.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value);
				sDescripcion=metododepreciacion.getdetalleactivofijo_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!metododepreciacion.getIsNew() && !metododepreciacion.getIsChanged() && !metododepreciacion.getIsDeleted()) {
				sDescripcion=metododepreciacion.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=metododepreciacion.getanio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		MetodoDepreciacion metododepreciacionRow=new MetodoDepreciacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			metododepreciacionRow=(MetodoDepreciacion) metododepreciacionLogic.getMetodoDepreciacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			metododepreciacionRow=(MetodoDepreciacion) metododepreciacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMetodoDepreciacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMetodoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoMetodoDepreciacion && this.isPermisoNuevoMetodoDepreciacion));			
			this.jButtonDuplicarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaDuplicarMetodoDepreciacion && this.isPermisoDuplicarMetodoDepreciacion));			
			this.jButtonCopiarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaCopiarMetodoDepreciacion && this.isPermisoCopiarMetodoDepreciacion));
			this.jButtonVerFormMetodoDepreciacion.setVisible((this.isVisibilidadCeldaVerFormMetodoDepreciacion && this.isPermisoVerFormMetodoDepreciacion));
			
			this.jButtonAbrirOrderByMetodoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenMetodoDepreciacion && this.isPermisoOrdenMetodoDepreciacion));			
			
			this.jButtonNuevoRelacionesMetodoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion && this.isPermisoNuevoMetodoDepreciacion));			
			this.jButtonNuevoGuardarCambiosMetodoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoMetodoDepreciacion && this.isPermisoNuevoMetodoDepreciacion && this.isPermisoGuardarCambiosMetodoDepreciacion));
			
			if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonModificarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaModificarMetodoDepreciacion && this.isPermisoActualizarMetodoDepreciacion));	
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonActualizarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaActualizarMetodoDepreciacion && this.isPermisoActualizarMetodoDepreciacion));	
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonEliminarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaEliminarMetodoDepreciacion && this.isPermisoEliminarMetodoDepreciacion));
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonCancelarMetodoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarMetodoDepreciacion);							
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonGuardarCambiosMetodoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarMetodoDepreciacion && this.isPermisoGuardarCambiosMetodoDepreciacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaMetodoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion && this.isPermisoGuardarCambiosMetodoDepreciacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoMetodoDepreciacion && this.isPermisoNuevoMetodoDepreciacion));						
			this.jButtonDuplicarToolBarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaDuplicarMetodoDepreciacion && this.isPermisoDuplicarMetodoDepreciacion));						
			this.jButtonCopiarToolBarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaCopiarMetodoDepreciacion && this.isPermisoCopiarMetodoDepreciacion));			
			this.jButtonVerFormToolBarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaVerFormMetodoDepreciacion && this.isPermisoVerFormMetodoDepreciacion));			
			this.jButtonAbrirOrderByToolBarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenMetodoDepreciacion && this.isPermisoOrdenMetodoDepreciacion));
			this.jButtonNuevoRelacionesToolBarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion && this.isPermisoNuevoMetodoDepreciacion));			
			this.jButtonNuevoGuardarCambiosToolBarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoMetodoDepreciacion && this.isPermisoNuevoMetodoDepreciacion && this.isPermisoGuardarCambiosMetodoDepreciacion));			
			
			if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonModificarToolBarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaModificarMetodoDepreciacion && this.isPermisoActualizarMetodoDepreciacion));	
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonActualizarToolBarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaActualizarMetodoDepreciacion  && this.isPermisoActualizarMetodoDepreciacion));	
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonEliminarToolBarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaEliminarMetodoDepreciacion && this.isPermisoEliminarMetodoDepreciacion));
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonCancelarToolBarMetodoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarMetodoDepreciacion);				
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonGuardarCambiosToolBarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarMetodoDepreciacion && this.isPermisoGuardarCambiosMetodoDepreciacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion && this.isPermisoGuardarCambiosMetodoDepreciacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMetodoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoMetodoDepreciacion && this.isPermisoNuevoMetodoDepreciacion));			
			this.jMenuItemDuplicarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaDuplicarMetodoDepreciacion && this.isPermisoDuplicarMetodoDepreciacion));			
			this.jMenuItemCopiarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaCopiarMetodoDepreciacion && this.isPermisoCopiarMetodoDepreciacion));			
			this.jMenuItemVerFormMetodoDepreciacion.setVisible((this.isVisibilidadCeldaVerFormMetodoDepreciacion && this.isPermisoVerFormMetodoDepreciacion));			
			this.jMenuItemAbrirOrderByMetodoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenMetodoDepreciacion && this.isPermisoOrdenMetodoDepreciacion));			
			//this.jMenuItemMostrarOcultarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenMetodoDepreciacion && this.isPermisoOrdenMetodoDepreciacion));
			this.jMenuItemDetalleAbrirOrderByMetodoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenMetodoDepreciacion && this.isPermisoOrdenMetodoDepreciacion));			
			//this.jMenuItemDetalleMostrarOcultarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenMetodoDepreciacion && this.isPermisoOrdenMetodoDepreciacion));			
			this.jMenuItemNuevoRelacionesMetodoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion && this.isPermisoNuevoMetodoDepreciacion));			
			this.jMenuItemNuevoGuardarCambiosMetodoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoMetodoDepreciacion && this.isPermisoNuevoMetodoDepreciacion && this.isPermisoGuardarCambiosMetodoDepreciacion));									
			
			if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemModificarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaModificarMetodoDepreciacion && this.isPermisoActualizarMetodoDepreciacion));	
			this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemActualizarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaActualizarMetodoDepreciacion && this.isPermisoActualizarMetodoDepreciacion));	
			this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemEliminarMetodoDepreciacion.setVisible((this.isVisibilidadCeldaEliminarMetodoDepreciacion && this.isPermisoEliminarMetodoDepreciacion));
			this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemCancelarMetodoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarMetodoDepreciacion);				
			}
			
			this.jMenuItemGuardarCambiosMetodoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarMetodoDepreciacion && this.isPermisoGuardarCambiosMetodoDepreciacion));						
			this.jMenuItemGuardarCambiosTablaMetodoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion && this.isPermisoGuardarCambiosMetodoDepreciacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMetodoDepreciacion=this.jButtonNuevoMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaDuplicarMetodoDepreciacion=this.jButtonDuplicarMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaCopiarMetodoDepreciacion=this.jButtonCopiarMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaVerFormMetodoDepreciacion=this.jButtonVerFormMetodoDepreciacion.isVisible();
			
			this.isVisibilidadCeldaOrdenMetodoDepreciacion=this.jButtonAbrirOrderByMetodoDepreciacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=this.jButtonNuevoRelacionesMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaModificarMetodoDepreciacion=this.jButtonModificarMetodoDepreciacion.isVisible();
			
			if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
			this.isVisibilidadCeldaActualizarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonActualizarMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaEliminarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonEliminarMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaCancelarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonCancelarMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaGuardarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonGuardarCambiosMetodoDepreciacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion=this.jButtonGuardarCambiosTablaMetodoDepreciacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMetodoDepreciacion=this.jButtonNuevoToolBarMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=this.jButtonNuevoRelacionesToolBarMetodoDepreciacion.isVisible();
			
			if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
			this.isVisibilidadCeldaModificarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonModificarToolBarMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaActualizarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonActualizarToolBarMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaEliminarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonEliminarToolBarMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaCancelarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonCancelarToolBarMetodoDepreciacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMetodoDepreciacion=this.jButtonGuardarCambiosToolBarMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion=this.jButtonGuardarCambiosTablaToolBarMetodoDepreciacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMetodoDepreciacion=this.jMenuItemNuevoMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=this.jMenuItemNuevoRelacionesMetodoDepreciacion.isVisible();
			
			if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
			this.isVisibilidadCeldaModificarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemModificarMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaActualizarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemActualizarMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaEliminarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemEliminarMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaCancelarMetodoDepreciacion=this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemCancelarMetodoDepreciacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMetodoDepreciacion=this.jMenuItemGuardarCambiosMetodoDepreciacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion=this.jMenuItemGuardarCambiosTablaMetodoDepreciacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMetodoDepreciacion(Boolean esInicializar) {
		if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.metododepreciacionSessionBean.getConGuardarRelaciones()) {
				//if(this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMetodoDepreciacion();
			}
			
			this.inicializarActualizarBindingBotonesManualMetodoDepreciacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMetodoDepreciacion() {
		this.jButtonNuevoMetodoDepreciacion.setVisible(this.isPermisoNuevoMetodoDepreciacion);			
		this.jButtonDuplicarMetodoDepreciacion.setVisible(this.isPermisoDuplicarMetodoDepreciacion);			
		this.jButtonCopiarMetodoDepreciacion.setVisible(this.isPermisoCopiarMetodoDepreciacion);			
		this.jButtonVerFormMetodoDepreciacion.setVisible(this.isPermisoVerFormMetodoDepreciacion);			
		
		this.jButtonAbrirOrderByMetodoDepreciacion.setVisible(this.isPermisoOrdenMetodoDepreciacion);					
		
		this.jButtonNuevoRelacionesMetodoDepreciacion.setVisible(this.isPermisoNuevoMetodoDepreciacion);			
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonModificarMetodoDepreciacion.setVisible(this.isPermisoActualizarMetodoDepreciacion);	
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonActualizarMetodoDepreciacion.setVisible(this.isPermisoActualizarMetodoDepreciacion);	
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonEliminarMetodoDepreciacion.setVisible(this.isPermisoEliminarMetodoDepreciacion);
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonCancelarMetodoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarMetodoDepreciacion);						
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonGuardarCambiosMetodoDepreciacion.setVisible(this.isPermisoGuardarCambiosMetodoDepreciacion);							
		}
		
		this.jButtonGuardarCambiosTablaMetodoDepreciacion.setVisible(this.isPermisoActualizarMetodoDepreciacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMetodoDepreciacion() {
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonModificarMetodoDepreciacion.setVisible(this.isPermisoActualizarMetodoDepreciacion);	
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonActualizarMetodoDepreciacion.setVisible(this.isPermisoActualizarMetodoDepreciacion);	
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonEliminarMetodoDepreciacion.setVisible(this.isPermisoEliminarMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonCancelarMetodoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarMetodoDepreciacion);							
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonGuardarCambiosMetodoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarMetodoDepreciacion && this.isPermisoGuardarCambiosMetodoDepreciacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMetodoDepreciacion() {
		if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMetodoDepreciacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMetodoDepreciacion() {
	}
	
	public void jTableDatosMetodoDepreciacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMetodoDepreciacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMetodoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.getmetododepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.metododepreciacion==null) {
						this.metododepreciacion = new MetodoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
				}

				if(this.metododepreciacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.metododepreciacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMetodoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaMetodoDepreciacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebMetodoDepreciacion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMetodoDepreciacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMetodoDepreciacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.getmetododepreciacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.metododepreciacionLogic.getConnexion());

				if(this.metododepreciacion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.metododepreciacion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMetodoDepreciacion=(TitledBorder)this.jScrollPanelDatosMetodoDepreciacion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderMetodoDepreciacion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaMetodoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.getmetododepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.metododepreciacion==null) {
						this.metododepreciacion = new MetodoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
				}

				if(this.metododepreciacion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.metododepreciacion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMetodoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalMetodoDepreciacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebMetodoDepreciacion(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMetodoDepreciacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMetodoDepreciacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.getmetododepreciacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.metododepreciacionLogic.getConnexion());

				if(this.metododepreciacion.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.metododepreciacion.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMetodoDepreciacion=(TitledBorder)this.jScrollPanelDatosMetodoDepreciacion.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderMetodoDepreciacion.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalMetodoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.getmetododepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.metododepreciacion==null) {
						this.metododepreciacion = new MetodoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
				}

				if(this.metododepreciacion.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.metododepreciacion.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMetodoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_detalle_activo_fijoMetodoDepreciacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetalleactivofijo=true;

			idTienePermisodetalleactivofijo=this.tienePermisosUsuarioEnPaginaWebMetodoDepreciacion(DetalleActivoFijoConstantesFunciones.CLASSNAME);

			if(idTienePermisodetalleactivofijo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMetodoDepreciacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMetodoDepreciacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.getmetododepreciacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);

				this.detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detalleactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detalleactivofijoBeanSwingJInternalFrame.getDetalleActivoFijoLogic().setConnexion(this.metododepreciacionLogic.getConnexion());

				if(this.metododepreciacion.getid_detalle_activo_fijo()!=null) {
					this.detalleactivofijoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detalleactivofijoBeanSwingJInternalFrame.setIdActual(this.metododepreciacion.getid_detalle_activo_fijo());
					this.detalleactivofijoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detalleactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo();
				}

				JInternalFrameBase jinternalFrame =this.detalleactivofijoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMetodoDepreciacion=(TitledBorder)this.jScrollPanelDatosMetodoDepreciacion.getBorder();
				TitledBorder titledBorderdetalleactivofijo=(TitledBorder)this.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getBorder();

				titledBorderdetalleactivofijo.setTitle(titledBorderMetodoDepreciacion.getTitle() + " -> Detalle Activo Fijo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_detalle_activo_fijoMetodoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.getmetododepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.metododepreciacion==null) {
						this.metododepreciacion = new MetodoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
				}

				if(this.metododepreciacion.getid_detalle_activo_fijo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_detalle_activo_fijo = "+this.metododepreciacion.getid_detalle_activo_fijo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMetodoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioMetodoDepreciacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebMetodoDepreciacion(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMetodoDepreciacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMetodoDepreciacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.getmetododepreciacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.metododepreciacionLogic.getConnexion());

				if(this.metododepreciacion.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.metododepreciacion.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMetodoDepreciacion=(TitledBorder)this.jScrollPanelDatosMetodoDepreciacion.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderMetodoDepreciacion.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioMetodoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.getmetododepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.metododepreciacion==null) {
						this.metododepreciacion = new MetodoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
				}

				if(this.metododepreciacion.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.metododepreciacion.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMetodoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeMetodoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.getmetododepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.metododepreciacion==null) {
						this.metododepreciacion = new MetodoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
				}

				if(this.metododepreciacion.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.metododepreciacion.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMetodoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaMetodoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.getmetododepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.metododepreciacion==null) {
						this.metododepreciacion = new MetodoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
				}

				if(this.metododepreciacion.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.metododepreciacion.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMetodoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeMetodoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.getmetododepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.metododepreciacion==null) {
						this.metododepreciacion = new MetodoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
				}

				if(this.metododepreciacion.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.metododepreciacion.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMetodoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorMetodoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.getmetododepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.metododepreciacion==null) {
						this.metododepreciacion = new MetodoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
				}

				if(this.metododepreciacion.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.metododepreciacion.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMetodoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_diasMetodoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.getmetododepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.metododepreciacion==null) {
						this.metododepreciacion = new MetodoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);
				}

				if(this.metododepreciacion.getnumero_dias()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_dias = "+this.metododepreciacion.getnumero_dias().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMetodoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMetodoDepreciacion(false,false);

			this.getMetodoDepreciacionsFK_IdAnio();

			this.inicializarActualizarBindingMetodoDepreciacion(false);

			//if(MetodoDepreciacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMetodoDepreciacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDetalleActivoFijoMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMetodoDepreciacion(false,false);

			this.getMetodoDepreciacionsFK_IdDetalleActivoFijo();

			this.inicializarActualizarBindingMetodoDepreciacion(false);

			//if(MetodoDepreciacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMetodoDepreciacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMetodoDepreciacion(false,false);

			this.getMetodoDepreciacionsFK_IdEmpresa();

			this.inicializarActualizarBindingMetodoDepreciacion(false);

			//if(MetodoDepreciacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMetodoDepreciacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalMetodoDepreciacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMetodoDepreciacion(false,false);

			this.getMetodoDepreciacionsFK_IdSucursal();

			this.inicializarActualizarBindingMetodoDepreciacion(false);

			//if(MetodoDepreciacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMetodoDepreciacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.metododepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameMetodoDepreciacion() {
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormMetodoDepreciacion.dispose();
			this.jInternalFrameDetalleFormMetodoDepreciacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMetodoDepreciacion!=null) {
			this.jInternalFrameReporteDinamicoMetodoDepreciacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMetodoDepreciacion.dispose();
			this.jInternalFrameReporteDinamicoMetodoDepreciacion=null;
		}
		
		if(this.jInternalFrameImportacionMetodoDepreciacion!=null) {
			this.jInternalFrameImportacionMetodoDepreciacion.setVisible(false);	    			
			this.jInternalFrameImportacionMetodoDepreciacion.dispose();
			this.jInternalFrameImportacionMetodoDepreciacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMetodoDepreciacion();
			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoMetodoDepreciacion")) {
				jButtonNuevoMetodoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMetodoDepreciacion")) {
				jButtonDuplicarMetodoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMetodoDepreciacion")) {
				jButtonCopiarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormMetodoDepreciacion")) {
				jButtonVerFormMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMetodoDepreciacion")) {
				jButtonNuevoMetodoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMetodoDepreciacion")) {
				jButtonDuplicarMetodoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMetodoDepreciacion")) {
				jButtonNuevoMetodoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMetodoDepreciacion")) {
				jButtonDuplicarMetodoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMetodoDepreciacion")) {
				jButtonNuevoMetodoDepreciacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMetodoDepreciacion")) {
				jButtonNuevoMetodoDepreciacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMetodoDepreciacion")) {
				jButtonNuevoMetodoDepreciacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMetodoDepreciacion")) {
				jButtonModificarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMetodoDepreciacion")) {
				jButtonModificarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMetodoDepreciacion")) {
				jButtonModificarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMetodoDepreciacion")) {
				jButtonActualizarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMetodoDepreciacion")) {
				jButtonActualizarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMetodoDepreciacion")) {
				jButtonActualizarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarMetodoDepreciacion")) {
				jButtonEliminarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMetodoDepreciacion")) {
				jButtonEliminarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMetodoDepreciacion")) {
				jButtonEliminarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarMetodoDepreciacion")) {
				jButtonCancelarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMetodoDepreciacion")) {
				jButtonCancelarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMetodoDepreciacion")) {
				jButtonCancelarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarMetodoDepreciacion")) {
				jButtonCerrarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMetodoDepreciacion")) {
				jButtonCerrarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMetodoDepreciacion")) {
				jButtonCerrarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMetodoDepreciacion")) {
				jButtonMostrarOcultarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMetodoDepreciacion")) {
				jButtonCancelarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMetodoDepreciacion")) {
				jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMetodoDepreciacion")) {
				jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMetodoDepreciacion")) {
				jButtonCopiarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMetodoDepreciacion")) {
				jButtonVerFormMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMetodoDepreciacion")) {
				jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMetodoDepreciacion")) {
				jButtonCopiarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMetodoDepreciacion")) {
				jButtonVerFormMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMetodoDepreciacion")) {
				jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMetodoDepreciacion")) {
				jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMetodoDepreciacion")) {
				jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMetodoDepreciacion")) {
				jButtonRecargarInformacionMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMetodoDepreciacion")) {
				jButtonRecargarInformacionMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMetodoDepreciacion")) {
				jButtonRecargarInformacionMetodoDepreciacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMetodoDepreciacion")) {
				jButtonAnterioresMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMetodoDepreciacion")) {
				jButtonAnterioresMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMetodoDepreciacion")) {
				jButtonAnterioresMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMetodoDepreciacion")) {
				jButtonSiguientesMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMetodoDepreciacion")) {
				jButtonSiguientesMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMetodoDepreciacion")) {
				jButtonSiguientesMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMetodoDepreciacion") || sTipo.equals("MenuItemDetalleAbrirOrderByMetodoDepreciacion")) {
				jButtonAbrirOrderByMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMetodoDepreciacion") || sTipo.equals("MenuItemDetalleMostrarOcultarMetodoDepreciacion")) {
				jButtonMostrarOcultarMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMetodoDepreciacion")) {
				jButtonNuevoGuardarCambiosMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMetodoDepreciacion")) {
				jButtonNuevoGuardarCambiosMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMetodoDepreciacion")) {
				jButtonNuevoGuardarCambiosMetodoDepreciacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMetodoDepreciacion")) {
				jButtonCerrarReporteDinamicoMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMetodoDepreciacion")) {
				jButtonGenerarReporteDinamicoMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMetodoDepreciacion")) {
				
				jButtonGenerarExcelReporteDinamicoMetodoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMetodoDepreciacion")) {
				jButtonCerrarImportacionMetodoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMetodoDepreciacion")) {
				
				jButtonGenerarImportacionMetodoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMetodoDepreciacion")) {
				
				jButtonAbrirImportacionMetodoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMetodoDepreciacion")) {
				jComboBoxTiposAccionesMetodoDepreciacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMetodoDepreciacion")) {
				jComboBoxTiposRelacionesMetodoDepreciacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMetodoDepreciacion")) {
				jComboBoxTiposAccionesMetodoDepreciacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMetodoDepreciacion")) {
				
				jComboBoxTiposSeleccionarMetodoDepreciacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMetodoDepreciacion")) {
				jTextFieldValorCampoGeneralMetodoDepreciacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMetodoDepreciacion")) {
				jButtonAbrirOrderByMetodoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMetodoDepreciacion")) {
				jButtonAbrirOrderByMetodoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMetodoDepreciacion")) {
				jButtonCerrarOrderByMetodoDepreciacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMetodoDepreciacionBusqueda")) {
				this.jButtonidMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMetodoDepreciacionUpdate")) {
				this.jButtonid_empresaMetodoDepreciacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMetodoDepreciacionBusqueda")) {
				this.jButtonid_empresaMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMetodoDepreciacionUpdate")) {
				this.jButtonid_sucursalMetodoDepreciacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMetodoDepreciacionBusqueda")) {
				this.jButtonid_sucursalMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoMetodoDepreciacionUpdate")) {
				this.jButtonid_detalle_activo_fijoMetodoDepreciacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoMetodoDepreciacionBusqueda")) {
				this.jButtonid_detalle_activo_fijoMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioMetodoDepreciacionUpdate")) {
				this.jButtonid_anioMetodoDepreciacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioMetodoDepreciacionBusqueda")) {
				this.jButtonid_anioMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeMetodoDepreciacionBusqueda")) {
				this.jButtonfecha_desdeMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaMetodoDepreciacionBusqueda")) {
				this.jButtonfecha_hastaMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeMetodoDepreciacionBusqueda")) {
				this.jButtonporcentajeMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorMetodoDepreciacionBusqueda")) {
				this.jButtonvalorMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasMetodoDepreciacionBusqueda")) {
				this.jButtonnumero_diasMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdAnioMetodoDepreciacion")) {
				this.jButtonFK_IdAnioMetodoDepreciacionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDetalleActivoFijoMetodoDepreciacion")) {
				this.jButtonFK_IdDetalleActivoFijoMetodoDepreciacionActionPerformed(evt);
			}
			
			;
			
			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMetodoDepreciacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMetodoDepreciacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
				


				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MetodoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MetodoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			MetodoDepreciacion metododepreciacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				metododepreciacionLocal=this.metododepreciacion;
			} else {
				metododepreciacionLocal=this.metododepreciacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
							
				
				


				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MetodoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MetodoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMetodoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionAnterior =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.metododepreciacionAnterior =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
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
			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			
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
			
			


			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMetodoDepreciacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
								
						
				


				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MetodoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MetodoDepreciacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
								
				
				


				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MetodoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MetodoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMetodoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionAnterior =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.metododepreciacionAnterior =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMetodoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionAnterior =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.metododepreciacionAnterior =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMetodoDepreciacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
							
				
				


				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MetodoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MetodoDepreciacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMetodoDepreciacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.metododepreciacionAnterior =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.metododepreciacionAnterior =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
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
			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			
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
			
			


			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMetodoDepreciacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
								
				
				


				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MetodoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MetodoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMetodoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionAnterior =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.metododepreciacionAnterior =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMetodoDepreciacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMetodoDepreciacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMetodoDepreciacion")) {
					jCheckBoxSeleccionarTodosMetodoDepreciacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMetodoDepreciacion")) {
					jCheckBoxSeleccionadosMetodoDepreciacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMetodoDepreciacion")) {
					
				}
				
				


				
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MetodoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MetodoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
												
				
				


				
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MetodoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MetodoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMetodoDepreciacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.metododepreciacionAnterior =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.metododepreciacionAnterior =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMetodoDepreciacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
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
			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
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
			
			


			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMetodoDepreciacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MetodoDepreciacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MetodoDepreciacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.metododepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.metododepreciacion);
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
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
				
				


				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MetodoDepreciacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MetodoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMetodoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.metododepreciacionAnterior =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.metododepreciacionAnterior =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMetodoDepreciacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMetodoDepreciacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMetodoDepreciacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.metododepreciacion =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.metododepreciacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMetodoDepreciacion")) {
				
				}
				
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMetodoDepreciacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMetodoDepreciacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMetodoDepreciacion")) {
			
			}
			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMetodoDepreciacion();
			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			
			if(sTipo.equals("NuevoMetodoDepreciacion")) {
				jButtonNuevoMetodoDepreciacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMetodoDepreciacion")) {
				jButtonDuplicarMetodoDepreciacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMetodoDepreciacion")) {
				jButtonCopiarMetodoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMetodoDepreciacion")) {
				jButtonVerFormMetodoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMetodoDepreciacion")) {
				jButtonNuevoMetodoDepreciacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMetodoDepreciacion")) {
				jButtonModificarMetodoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMetodoDepreciacion")) {
				jButtonActualizarMetodoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMetodoDepreciacion")) {
				jButtonEliminarMetodoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMetodoDepreciacion")) {
				jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMetodoDepreciacion")) {
				jButtonCancelarMetodoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMetodoDepreciacion")) {
				jButtonCerrarMetodoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMetodoDepreciacion")) {
				jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMetodoDepreciacion")) {
				jButtonNuevoGuardarCambiosMetodoDepreciacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMetodoDepreciacion")) {
				jButtonAbrirOrderByMetodoDepreciacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMetodoDepreciacion")) {
				jButtonRecargarInformacionMetodoDepreciacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMetodoDepreciacion")) {
				jButtonAnterioresMetodoDepreciacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMetodoDepreciacion")) {
				jButtonSiguientesMetodoDepreciacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMetodoDepreciacionBusqueda")) {
				this.jButtonidMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMetodoDepreciacionUpdate")) {
				this.jButtonid_empresaMetodoDepreciacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMetodoDepreciacionBusqueda")) {
				this.jButtonid_empresaMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMetodoDepreciacionUpdate")) {
				this.jButtonid_sucursalMetodoDepreciacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMetodoDepreciacionBusqueda")) {
				this.jButtonid_sucursalMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoMetodoDepreciacionUpdate")) {
				this.jButtonid_detalle_activo_fijoMetodoDepreciacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoMetodoDepreciacionBusqueda")) {
				this.jButtonid_detalle_activo_fijoMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioMetodoDepreciacionUpdate")) {
				this.jButtonid_anioMetodoDepreciacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioMetodoDepreciacionBusqueda")) {
				this.jButtonid_anioMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeMetodoDepreciacionBusqueda")) {
				this.jButtonfecha_desdeMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaMetodoDepreciacionBusqueda")) {
				this.jButtonfecha_hastaMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeMetodoDepreciacionBusqueda")) {
				this.jButtonporcentajeMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorMetodoDepreciacionBusqueda")) {
				this.jButtonvalorMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasMetodoDepreciacionBusqueda")) {
				this.jButtonnumero_diasMetodoDepreciacionBusquedaActionPerformed(evt);
			}
			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMetodoDepreciacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMetodoDepreciacion")) {
				closingInternalFrameMetodoDepreciacion();
				
			} else if(sTipo.equals("jButtonCancelarMetodoDepreciacion")) {
				JInternalFrameBase jInternalFrameDetalleFormMetodoDepreciacion = (JInternalFrameBase)evt.getSource();
	            	
	            MetodoDepreciacionBeanSwingJInternalFrame jInternalFrameParent=(MetodoDepreciacionBeanSwingJInternalFrame)jInternalFrameDetalleFormMetodoDepreciacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMetodoDepreciacionActionPerformed(null);
			}
			
			MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.metododepreciacion,new Object(),this.metododepreciacionParameterGeneral,this.metododepreciacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMetodoDepreciacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMetodoDepreciacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMetodoDepreciacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.metododepreciacion)) {
			if(!esControlTabla) {
				if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);			
				}
				
				if(this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMetodoDepreciacion(this.metododepreciacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.metododepreciacionReturnGeneral=metododepreciacionLogic.procesarEventosMetodoDepreciacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.metododepreciacionLogic.getMetodoDepreciacions(),this.metododepreciacion,this.metododepreciacionParameterGeneral,this.isEsNuevoMetodoDepreciacion,classes);//this.metododepreciacionLogic.getMetodoDepreciacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMetodoDepreciacion(this.metododepreciacionReturnGeneral,this.metododepreciacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMetodoDepreciacion(classes,this.metododepreciacionReturnGeneral,this.metododepreciacionBean,false);
					}
						
					if(this.metododepreciacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMetodoDepreciacion(this.metododepreciacionReturnGeneral.getMetodoDepreciacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMetodoDepreciacion(this.metododepreciacionReturnGeneral.getMetodoDepreciacion());	
					}
						
					if(this.metododepreciacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMetodoDepreciacion(this.metododepreciacionReturnGeneral.getMetodoDepreciacion(),classes);//this.metododepreciacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMetodoDepreciacion(this.metododepreciacion,classes);//this.metododepreciacionBean);									
				}
			
				if(MetodoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMetodoDepreciacion(this.metododepreciacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMetodoDepreciacion(this.metododepreciacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.metododepreciacionAnterior!=null) {
						this.metododepreciacion=this.metododepreciacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.metododepreciacionReturnGeneral=metododepreciacionLogic.procesarEventosMetodoDepreciacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.metododepreciacionLogic.getMetodoDepreciacions(),this.metododepreciacion,this.metododepreciacionParameterGeneral,this.isEsNuevoMetodoDepreciacion,classes);//this.metododepreciacionLogic.getMetodoDepreciacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.metododepreciacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.metododepreciacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.metododepreciacionReturnGeneral.getMetodoDepreciacion(),metododepreciacionLogic.getMetodoDepreciacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.metododepreciacionReturnGeneral.getMetodoDepreciacion(),this.metododepreciacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMetodoDepreciacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosMetodoDepreciacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMetodoDepreciacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosMetodoDepreciacion() throws Exception {
		
		MetodoDepreciacionModel metododepreciacionModel=(MetodoDepreciacionModel)this.jTableDatosMetodoDepreciacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			metododepreciacionModel.metododepreciacions=this.metododepreciacionLogic.getMetodoDepreciacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			metododepreciacionModel.metododepreciacions=this.metododepreciacions;
		}
		
		
		((MetodoDepreciacionModel) this.jTableDatosMetodoDepreciacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMetodoDepreciacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmetododepreciacionAnterior(),this.metododepreciacionLogic.getMetodoDepreciacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmetododepreciacionAnterior(),this.metododepreciacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMetodoDepreciacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMetodoDepreciacion(MetodoDepreciacion metododepreciacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
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
										
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.metododepreciacion,new Object(),generalEntityParameterGeneral,this.metododepreciacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.metododepreciacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MetodoDepreciacionConstantesFunciones.getClassesRelationshipsOfMetodoDepreciacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MetodoDepreciacionConstantesFunciones.getClassesRelationshipsFromStringsOfMetodoDepreciacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMetodoDepreciacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MetodoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.metododepreciacion,new Object(),generalEntityParameterGeneral,this.metododepreciacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMetodoDepreciacion(MetodoDepreciacionBean metododepreciacionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMetodoDepreciacion(ArrayList<Classe> classes,MetodoDepreciacionReturnGeneral metododepreciacionReturnGeneral,MetodoDepreciacionBean metododepreciacionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMetodoDepreciacion(MetodoDepreciacion metododepreciacion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.metododepreciacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMetodoDepreciacion = new MetodoDepreciacionDetalleFormJInternalFrame(jDesktopPane,this.metododepreciacionSessionBean.getConGuardarRelaciones(),this.metododepreciacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.setVisible(false);
		this.jInternalFrameDetalleFormMetodoDepreciacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.metododepreciacionLogic=this.metododepreciacionLogic;
		
		this.cargarCombosFrameForeignKeyMetodoDepreciacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMetodoDepreciacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMetodoDepreciacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMetodoDepreciacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMetodoDepreciacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMetodoDepreciacion"));
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonModificarMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"ModificarMetodoDepreciacion"));

		
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonModificarToolBarMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarMetodoDepreciacion"));
					
		this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemModificarMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarMetodoDepreciacion"));		
		
		
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonActualizarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"ActualizarMetodoDepreciacion"));
		
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonActualizarToolBarMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMetodoDepreciacion"));
						
		this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemActualizarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMetodoDepreciacion"));		
		
		
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonEliminarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"EliminarMetodoDepreciacion"));
		
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonEliminarToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarMetodoDepreciacion"));
								
		this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemEliminarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMetodoDepreciacion"));		
		
		
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonCancelarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"CancelarMetodoDepreciacion"));
		
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonCancelarToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarMetodoDepreciacion"));
					
		this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemCancelarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMetodoDepreciacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemDetalleCerrarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMetodoDepreciacion"));		
		
		
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonGuardarCambiosToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMetodoDepreciacion"));
		
		
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonGuardarCambiosToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMetodoDepreciacion"));
		
		
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMetodoDepreciacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonidMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"idMetodoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_empresaMetodoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMetodoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_empresaMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMetodoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_sucursalMetodoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMetodoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_sucursalMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMetodoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_detalle_activo_fijoMetodoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoMetodoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_detalle_activo_fijoMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoMetodoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_anioMetodoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_anioMetodoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_anioMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_anioMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonfecha_desdeMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonfecha_hastaMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonporcentajeMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonvalorMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"valorMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonnumero_diasMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasMetodoDepreciacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMetodoDepreciacion.jTabbedPaneRelacionesMetodoDepreciacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMetodoDepreciacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMetodoDepreciacion"));
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMetodoDepreciacion"));
		}
		
		this.jTableDatosMetodoDepreciacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMetodoDepreciacion"));
		
		this.jTableDatosMetodoDepreciacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMetodoDepreciacion"));
		
		this.jButtonNuevoMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"NuevoMetodoDepreciacion"));
		
		this.jButtonDuplicarMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"DuplicarMetodoDepreciacion"));
		
		this.jButtonCopiarMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"CopiarMetodoDepreciacion"));
		
		this.jButtonVerFormMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"VerFormMetodoDepreciacion"));
		
		
		this.jButtonNuevoToolBarMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarMetodoDepreciacion"));
			
		this.jButtonDuplicarToolBarMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMetodoDepreciacion"));
			
		this.jMenuItemNuevoMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMetodoDepreciacion"));
			
		this.jMenuItemDuplicarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMetodoDepreciacion"));		
		
		
		this.jButtonNuevoRelacionesMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMetodoDepreciacion"));
		
		
		this.jButtonNuevoRelacionesToolBarMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMetodoDepreciacion"));
			
		this.jMenuItemNuevoRelacionesMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMetodoDepreciacion"));		
		
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonModificarMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"ModificarMetodoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonModificarToolBarMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarMetodoDepreciacion"));
			
			this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemModificarMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarMetodoDepreciacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonActualizarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"ActualizarMetodoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonActualizarToolBarMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMetodoDepreciacion"));
				
			this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemActualizarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMetodoDepreciacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonEliminarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"EliminarMetodoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonEliminarToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarMetodoDepreciacion"));
						
			this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemEliminarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMetodoDepreciacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonCancelarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"CancelarMetodoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonCancelarToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarMetodoDepreciacion"));
			
			this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemCancelarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMetodoDepreciacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMetodoDepreciacion"));		
		
		
		this.jButtonCerrarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"CerrarMetodoDepreciacion"));
		
		
		this.jButtonCerrarToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarMetodoDepreciacion"));
			
		this.jMenuItemCerrarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMetodoDepreciacion"));
			
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jMenuItemDetalleCerrarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMetodoDepreciacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonGuardarCambiosMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosMetodoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonGuardarCambiosToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMetodoDepreciacion"));
		}
		
		this.jButtonCopiarToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarMetodoDepreciacion"));
			
		this.jButtonVerFormToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarMetodoDepreciacion"));
		
		this.jMenuItemGuardarCambiosMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMetodoDepreciacion"));
			
		this.jMenuItemCopiarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMetodoDepreciacion"));		
		
		this.jMenuItemVerFormMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMetodoDepreciacion"));		
		
		
		this.jButtonGuardarCambiosTablaMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMetodoDepreciacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMetodoDepreciacion"));
			
		this.jMenuItemGuardarCambiosTablaMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMetodoDepreciacion"));		
		
		
		
		this.jButtonRecargarInformacionMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionMetodoDepreciacion"));
					
		this.jButtonRecargarInformacionToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMetodoDepreciacion"));
		
		this.jMenuItemRecargarInformacionMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMetodoDepreciacion"));		
		
		
		
		this.jButtonAnterioresMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"AnterioresMetodoDepreciacion"));
		
		
		this.jButtonAnterioresToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMetodoDepreciacion"));
		
		this.jMenuItemAnterioresMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMetodoDepreciacion"));		
		
		
		this.jButtonSiguientesMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"SiguientesMetodoDepreciacion"));
		
		
		this.jButtonSiguientesToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMetodoDepreciacion"));
			
		this.jMenuItemSiguientesMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMetodoDepreciacion"));
			
		this.jMenuItemAbrirOrderByMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMetodoDepreciacion"));
			
		this.jMenuItemMostrarOcultarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMetodoDepreciacion"));
			
		this.jMenuItemDetalleAbrirOrderByMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMetodoDepreciacion"));
			
		this.jMenuItemDetalleMostarOcultarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMetodoDepreciacion"));		
		
		
		this.jButtonNuevoGuardarCambiosMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMetodoDepreciacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMetodoDepreciacion"));
			
		this.jMenuItemNuevoGuardarCambiosMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMetodoDepreciacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMetodoDepreciacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMetodoDepreciacion"));

		this.jCheckBoxSeleccionadosMetodoDepreciacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMetodoDepreciacion"));
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMetodoDepreciacion"));
		}
		
		
		this.jComboBoxTiposRelacionesMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesMetodoDepreciacion"));
			
		this.jComboBoxTiposAccionesMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposAccionesMetodoDepreciacion"));
					
		this.jComboBoxTiposSeleccionarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMetodoDepreciacion"));
			
		this.jTextFieldValorCampoGeneralMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMetodoDepreciacion"));		
		
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonidMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"idMetodoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_empresaMetodoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMetodoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_empresaMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMetodoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_sucursalMetodoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMetodoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_sucursalMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMetodoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_detalle_activo_fijoMetodoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoMetodoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_detalle_activo_fijoMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoMetodoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_anioMetodoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_anioMetodoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_anioMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_anioMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonfecha_desdeMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonfecha_hastaMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonporcentajeMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonvalorMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"valorMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonnumero_diasMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasMetodoDepreciacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"FK_IdAnioMetodoDepreciacion"));

			this.jButtonFK_IdDetalleActivoFijoMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"FK_IdDetalleActivoFijoMetodoDepreciacion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMetodoDepreciacion!=null) {
				this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMetodoDepreciacion"));
				this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMetodoDepreciacion"));
				this.jInternalFrameReporteDinamicoMetodoDepreciacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMetodoDepreciacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMetodoDepreciacion"));				
			//this.jButtonGenerarReporteDinamicoMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMetodoDepreciacion"));
			//this.jButtonGenerarExcelReporteDinamicoMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMetodoDepreciacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMetodoDepreciacion!=null) {
				this.jInternalFrameImportacionMetodoDepreciacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMetodoDepreciacion"));
				this.jInternalFrameImportacionMetodoDepreciacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMetodoDepreciacion"));
				this.jInternalFrameImportacionMetodoDepreciacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMetodoDepreciacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByMetodoDepreciacion"));
			
			this.jButtonAbrirOrderByToolBarMetodoDepreciacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMetodoDepreciacion"));			
			
			if(this.jInternalFrameOrderByMetodoDepreciacion!=null) {
				this.jInternalFrameOrderByMetodoDepreciacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMetodoDepreciacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMetodoDepreciacion.jTabbedPaneRelacionesMetodoDepreciacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMetodoDepreciacion"));
		
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
            		closingInternalFrameMetodoDepreciacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMetodoDepreciacion = (JInternalFrameBase)event.getSource();
	            	
	            MetodoDepreciacionBeanSwingJInternalFrame jInternalFrameParent=(MetodoDepreciacionBeanSwingJInternalFrame)jInternalFrameDetalleFormMetodoDepreciacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMetodoDepreciacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMetodoDepreciacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMetodoDepreciacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMetodoDepreciacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMetodoDepreciacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMetodoDepreciacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMetodoDepreciacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMetodoDepreciacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMetodoDepreciacion";
		inputMap = this.jButtonNuevoMetodoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMetodoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMetodoDepreciacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMetodoDepreciacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMetodoDepreciacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMetodoDepreciacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMetodoDepreciacion";
		inputMap = this.jButtonNuevoRelacionesMetodoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMetodoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMetodoDepreciacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMetodoDepreciacion";
		inputMap = this.jButtonModificarMetodoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMetodoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMetodoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMetodoDepreciacion";
		inputMap = this.jButtonActualizarMetodoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMetodoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMetodoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMetodoDepreciacion";
		inputMap = this.jButtonEliminarMetodoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMetodoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMetodoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMetodoDepreciacion";
		inputMap = this.jButtonCancelarMetodoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMetodoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMetodoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMetodoDepreciacion";
		inputMap = this.jButtonCerrarMetodoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMetodoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMetodoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonGuardarCambiosMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMetodoDepreciacion";
		inputMap = this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonGuardarCambiosMetodoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonGuardarCambiosMetodoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMetodoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMetodoDepreciacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMetodoDepreciacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMetodoDepreciacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMetodoDepreciacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMetodoDepreciacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMetodoDepreciacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMetodoDepreciacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMetodoDepreciacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonidMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"idMetodoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_empresaMetodoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMetodoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_empresaMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMetodoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_sucursalMetodoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMetodoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_sucursalMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMetodoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_detalle_activo_fijoMetodoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoMetodoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_detalle_activo_fijoMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoMetodoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_anioMetodoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_anioMetodoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonid_anioMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_anioMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonfecha_desdeMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonfecha_hastaMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonporcentajeMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonvalorMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"valorMetodoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMetodoDepreciacion.jButtonnumero_diasMetodoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasMetodoDepreciacionBusqueda"));
		
		
		this.jButtonFK_IdAnioMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"FK_IdAnioMetodoDepreciacion"));

		this.jButtonFK_IdDetalleActivoFijoMetodoDepreciacion.addActionListener(new ButtonActionListener(this,"FK_IdDetalleActivoFijoMetodoDepreciacion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMetodoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMetodoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMetodoDepreciacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMetodoDepreciacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMetodoDepreciacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(MetodoDepreciacion metododepreciacionAux:this.metododepreciacionLogic.getMetodoDepreciacions()) {
					metododepreciacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MetodoDepreciacion metododepreciacionAux:metododepreciacions) {
					metododepreciacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMetodoDepreciacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMetodoDepreciacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MetodoDepreciacion metododepreciacionAux:this.metododepreciacionLogic.getMetodoDepreciacions()) {
						metododepreciacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MetodoDepreciacion metododepreciacionAux:metododepreciacions) {
						metododepreciacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(MetodoDepreciacion metododepreciacionAux:this.metododepreciacionLogic.getMetodoDepreciacions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MetodoDepreciacion metododepreciacionAux:metododepreciacions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMetodoDepreciacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMetodoDepreciacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMetodoDepreciacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMetodoDepreciacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMetodoDepreciacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMetodoDepreciacion.getSelectedRows();
			
			MetodoDepreciacion metododepreciacionLocal=new MetodoDepreciacion();
			
			//this.seleccionarTodosMetodoDepreciacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					metododepreciacionLocal =(MetodoDepreciacion) this.metododepreciacionLogic.getMetodoDepreciacions().toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					metododepreciacionLocal =(MetodoDepreciacion) this.metododepreciacions.toArray()[this.jTableDatosMetodoDepreciacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				metododepreciacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MetodoDepreciacion metododepreciacionAux:this.metododepreciacionLogic.getMetodoDepreciacions()) {
						metododepreciacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MetodoDepreciacion metododepreciacionAux:metododepreciacions) {
						metododepreciacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMetodoDepreciacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMetodoDepreciacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMetodoDepreciacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMetodoDepreciacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMetodoDepreciacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMetodoDepreciacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMetodoDepreciacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMetodoDepreciacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMetodoDepreciacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MetodoDepreciacion metododepreciacionAux:this.metododepreciacionLogic.getMetodoDepreciacions()) {
				
						if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							metododepreciacionAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							metododepreciacionAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							metododepreciacionAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							metododepreciacionAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							metododepreciacionAux.setnumero_dias(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MetodoDepreciacion metododepreciacionAux:metododepreciacions) {
					
						if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							metododepreciacionAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							metododepreciacionAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							metododepreciacionAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							metododepreciacionAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							metododepreciacionAux.setnumero_dias(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMetodoDepreciacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMetodoDepreciacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMetodoDepreciacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMetodoDepreciacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMetodoDepreciacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMetodoDepreciacion) {				
					conSplash=true;//false;										
					
					//this.startProcessMetodoDepreciacion(conSplash);
				
					this.generarReporteMetodoDepreciacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMetodoDepreciacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMetodoDepreciacionsSeleccionados();
				//this.jComboBoxTiposAccionesMetodoDepreciacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMetodoDepreciacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesMetodoDepreciacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMetodoDepreciacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesMetodoDepreciacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMetodoDepreciacion();
				
				this.exportarMetodoDepreciacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMetodoDepreciacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMetodoDepreciacions();
				//this.importarMetodoDepreciacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMetodoDepreciacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMetodoDepreciacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMetodoDepreciacionsSeleccionados();
				//this.jComboBoxTiposAccionesMetodoDepreciacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Metodo Depreciacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMetodoDepreciacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMetodoDepreciacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMetodoDepreciacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Metodo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMetodoDepreciacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.setSelectedIndex(0);					
				}	
			} 			
			else if(MetodoDepreciacionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteMetodoDepreciacion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessMetodoDepreciacion(conSplash);
					
						//this.actualizarParametrosGeneralMetodoDepreciacion();
						
						this.generarReporteProcesoAccionMetodoDepreciacionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesMetodoDepreciacion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(MetodoDepreciacionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Metodo DepreciacionES SELECCIONADOS?", "MANTENIMIENTO DE Metodo Depreciacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessMetodoDepreciacion();
				
						this.actualizarParametrosGeneralMetodoDepreciacion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.metododepreciacionReturnGeneral=metododepreciacionLogic.procesarAccionMetodoDepreciacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.metododepreciacionLogic.getMetodoDepreciacions(),this.metododepreciacionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarMetodoDepreciacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMetodoDepreciacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMetodoDepreciacion();
					
					MetodoDepreciacionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarMetodoDepreciacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMetodoDepreciacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxTiposAccionesFormularioMetodoDepreciacion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMetodoDepreciacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMetodoDepreciacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMetodoDepreciacion();
			
			if(this.jInternalFrameDetalleFormMetodoDepreciacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados=new ArrayList<MetodoDepreciacion>();		
			MetodoDepreciacion metododepreciacion=new MetodoDepreciacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMetodoDepreciacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMetodoDepreciacion.getSelectedItem();
			
			
			
			
			metododepreciacionsSeleccionados=this.getMetodoDepreciacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(metododepreciacionsSeleccionados.size()==1) {
				for(MetodoDepreciacion metododepreciacionAux:metododepreciacionsSeleccionados) {
					metododepreciacion=metododepreciacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMetodoDepreciacion();
			
      		//this.finishProcessMetodoDepreciacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMetodoDepreciacionReturnGeneral() throws Exception {
		if(this.metododepreciacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.metododepreciacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.metododepreciacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.metododepreciacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.metododepreciacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.metododepreciacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMetodoDepreciacion(false);
		}
		
		if(this.metododepreciacionReturnGeneral.getConRetornoLista() || this.metododepreciacionReturnGeneral.getConRetornoObjeto()) {
			if(this.metododepreciacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.metododepreciacionLogic.setMetodoDepreciacions(this.metododepreciacionReturnGeneral.getMetodoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.metododepreciacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.metododepreciacionLogic.setMetodoDepreciacion(this.metododepreciacionReturnGeneral.getMetodoDepreciacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingMetodoDepreciacion(false);
		}
	}
	
	public void actualizarParametrosGeneralMetodoDepreciacion() throws Exception {
		
		
	}
	
	public ArrayList<MetodoDepreciacion> getMetodoDepreciacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados=new ArrayList<MetodoDepreciacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMetodoDepreciacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(MetodoDepreciacion metododepreciacionAux:metododepreciacionLogic.getMetodoDepreciacions()) {
					if(metododepreciacionAux.getIsSelected()) {
						metododepreciacionsSeleccionados.add(metododepreciacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MetodoDepreciacion metododepreciacionAux:this.metododepreciacions) {
					if(metododepreciacionAux.getIsSelected()) {
						metododepreciacionsSeleccionados.add(metododepreciacionAux);				
					}
				}
			}
			
			if(metododepreciacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						metododepreciacionsSeleccionados.addAll(this.metododepreciacionLogic.getMetodoDepreciacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						metododepreciacionsSeleccionados.addAll(this.metododepreciacions);				
					}
				}
			}
		} else {
			metododepreciacionsSeleccionados.add(this.metododepreciacion);
		}
		
		return metododepreciacionsSeleccionados;
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
	
	public void generarReporteMetodoDepreciacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMetodoDepreciacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMetodoDepreciacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMetodoDepreciacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMetodoDepreciacionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Metodo Depreciacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMetodoDepreciacionsSeleccionados() throws Exception {
		ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados=new ArrayList<MetodoDepreciacion>();		
		
		metododepreciacionsSeleccionados=this.getMetodoDepreciacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMetodoDepreciacions("Todos",metododepreciacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalMetodoDepreciacionsSeleccionados() throws Exception {
		ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados=new ArrayList<MetodoDepreciacion>();		
		
		metododepreciacionsSeleccionados=this.getMetodoDepreciacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMetodoDepreciacions("Todos",metododepreciacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMetodoDepreciacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados=new ArrayList<MetodoDepreciacion>();
		
		metododepreciacionsSeleccionados=this.getMetodoDepreciacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMetodoDepreciacions("Todos",metododepreciacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMetodoDepreciacionsSeleccionados() throws Exception {
		ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados=new ArrayList<MetodoDepreciacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMetodoDepreciacion();
		
		
		metododepreciacionsSeleccionados=this.getMetodoDepreciacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMetodoDepreciacion();
		
		
		//this.generarReporteMetodoDepreciacions("Todos",metododepreciacionsSeleccionados ,metododepreciacionImplementable,metododepreciacionImplementableHome);
	}
	
	public void mostrarImportacionMetodoDepreciacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMetodoDepreciacion();
		
		this.abrirFrameImportacionMetodoDepreciacion();		
		
			
		//this.generarReporteMetodoDepreciacions("Todos",metododepreciacionsSeleccionados ,metododepreciacionImplementable,metododepreciacionImplementableHome);
	}
	
	public void importarMetodoDepreciacions() throws Exception {		
	
	}
	
	public void exportarMetodoDepreciacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMetodoDepreciacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMetodoDepreciacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMetodoDepreciacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Metodo Depreciacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMetodoDepreciacionsSeleccionados() throws Exception {
		ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados=new ArrayList<MetodoDepreciacion>();		
		
		metododepreciacionsSeleccionados=this.getMetodoDepreciacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"metododepreciacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMetodoDepreciacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(MetodoDepreciacion metododepreciacionAux:metododepreciacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMetodoDepreciacion(metododepreciacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//metododepreciacionAux.setsDetalleGeneralEntityReporte(metododepreciacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Metodo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMetodoDepreciacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MetodoDepreciacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MetodoDepreciacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MetodoDepreciacionConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MetodoDepreciacionConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMetodoDepreciacion(MetodoDepreciacion metododepreciacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=metododepreciacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=metododepreciacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=metododepreciacion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=metododepreciacion.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=metododepreciacion.getdetalleactivofijo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=metododepreciacion.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=metododepreciacion.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=metododepreciacion.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=metododepreciacion.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=metododepreciacion.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=metododepreciacion.getnumero_dias().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMetodoDepreciacionsSeleccionados() throws Exception {
		ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados=new ArrayList<MetodoDepreciacion>();		
		
		metododepreciacionsSeleccionados=this.getMetodoDepreciacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"metododepreciacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("MetodoDepreciacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMetodoDepreciacion(row);				
				iRow++;
			}				
			
			for(MetodoDepreciacion metododepreciacionAux:metododepreciacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMetodoDepreciacion(metododepreciacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Metodo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMetodoDepreciacionsSeleccionados() throws Exception {
		ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados=new ArrayList<MetodoDepreciacion>();		
		
		metododepreciacionsSeleccionados=this.getMetodoDepreciacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"metododepreciacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("metododepreciacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("metododepreciacion");
			//elementRoot.appendChild(element);
		
			for(MetodoDepreciacion metododepreciacionAux:metododepreciacionsSeleccionados) {
				element = document.createElement("metododepreciacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMetodoDepreciacion(metododepreciacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Metodo Depreciacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMetodoDepreciacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		cell = row.createCell(iColumn++);cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMetodoDepreciacion(MetodoDepreciacion metododepreciacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(metododepreciacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(metododepreciacion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(metododepreciacion.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(metododepreciacion.getdetalleactivofijo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(metododepreciacion.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(metododepreciacion.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(metododepreciacion.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(metododepreciacion.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(metododepreciacion.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(metododepreciacion.getnumero_dias());				
	}
	
	public void setFilaDatosExportarXmlMetodoDepreciacion(MetodoDepreciacion metododepreciacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MetodoDepreciacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(metododepreciacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MetodoDepreciacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(metododepreciacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(MetodoDepreciacionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(metododepreciacion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(MetodoDepreciacionConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(metododepreciacion.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementdetalleactivofijo_descripcion = document.createElement(MetodoDepreciacionConstantesFunciones.IDDETALLEACTIVOFIJO);
		elementdetalleactivofijo_descripcion.appendChild(document.createTextNode(metododepreciacion.getdetalleactivofijo_descripcion()));
		element.appendChild(elementdetalleactivofijo_descripcion);

		Element elementanio_descripcion = document.createElement(MetodoDepreciacionConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(metododepreciacion.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementfecha_desde = document.createElement(MetodoDepreciacionConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(metododepreciacion.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(MetodoDepreciacionConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(metododepreciacion.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementporcentaje = document.createElement(MetodoDepreciacionConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(metododepreciacion.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementvalor = document.createElement(MetodoDepreciacionConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(metododepreciacion.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementnumero_dias = document.createElement(MetodoDepreciacionConstantesFunciones.NUMERODIAS);
		elementnumero_dias.appendChild(document.createTextNode(metododepreciacion.getnumero_dias().toString().trim()));
		element.appendChild(elementnumero_dias);
	}
	
	public void generarReporteGroupGenericoMetodoDepreciacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados=new ArrayList<MetodoDepreciacion>();
		
		metododepreciacionsSeleccionados=this.getMetodoDepreciacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoMetodoDepreciacion(metododepreciacionsSeleccionados);
		
		this.generarReporteMetodoDepreciacions("Todos",metododepreciacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMetodoDepreciacion(ArrayList<MetodoDepreciacion> metododepreciacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(MetodoDepreciacion metododepreciacionAux:metododepreciacionsSeleccionados) {
				metododepreciacionAux.setsDetalleGeneralEntityReporte(metododepreciacionAux.toString());
			
				if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					metododepreciacionAux.setsDescripcionGeneralEntityReporte1(metododepreciacionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					metododepreciacionAux.setsDescripcionGeneralEntityReporte1(metododepreciacionAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO)) {
					existe=true;
					metododepreciacionAux.setsDescripcionGeneralEntityReporte1(metododepreciacionAux.getdetalleactivofijo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					metododepreciacionAux.setsDescripcionGeneralEntityReporte1(metododepreciacionAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					metododepreciacionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(metododepreciacionAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					metododepreciacionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(metododepreciacionAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(MetodoDepreciacionConstantesFunciones.LABEL_NUMERODIAS)) {
					existe=true;
					metododepreciacionAux.setsDescripcionGeneralEntityReporte1(metododepreciacionAux.getnumero_dias().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MetodoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMetodoDepreciacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMetodoDepreciacion=true;
				this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=true;
				this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion=true;
			}
			
			this.isVisibilidadCeldaModificarMetodoDepreciacion=false;
			this.isVisibilidadCeldaActualizarMetodoDepreciacion=false;
			this.isVisibilidadCeldaEliminarMetodoDepreciacion=false;
			this.isVisibilidadCeldaCancelarMetodoDepreciacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMetodoDepreciacion=true;
				} else {
					this.isVisibilidadCeldaGuardarMetodoDepreciacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMetodoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion=false;
			this.isVisibilidadCeldaModificarMetodoDepreciacion=false;
			this.isVisibilidadCeldaActualizarMetodoDepreciacion=true;
			this.isVisibilidadCeldaEliminarMetodoDepreciacion=false;
			this.isVisibilidadCeldaCancelarMetodoDepreciacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMetodoDepreciacion=true;
				} else {
					this.isVisibilidadCeldaGuardarMetodoDepreciacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMetodoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion=false;
			this.isVisibilidadCeldaModificarMetodoDepreciacion=false;
			this.isVisibilidadCeldaActualizarMetodoDepreciacion=true;
			this.isVisibilidadCeldaEliminarMetodoDepreciacion=true;
			this.isVisibilidadCeldaCancelarMetodoDepreciacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMetodoDepreciacion=true;
				} else {
					this.isVisibilidadCeldaGuardarMetodoDepreciacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMetodoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion=false;
			this.isVisibilidadCeldaModificarMetodoDepreciacion=false;
			this.isVisibilidadCeldaActualizarMetodoDepreciacion=true;
			this.isVisibilidadCeldaEliminarMetodoDepreciacion=false;
			this.isVisibilidadCeldaCancelarMetodoDepreciacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMetodoDepreciacion=false;
				} else {
					this.isVisibilidadCeldaGuardarMetodoDepreciacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMetodoDepreciacion=true;
			this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=true;
			this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion=true;
			this.isVisibilidadCeldaModificarMetodoDepreciacion=false;
			this.isVisibilidadCeldaActualizarMetodoDepreciacion=false;
			this.isVisibilidadCeldaEliminarMetodoDepreciacion=false;
			this.isVisibilidadCeldaCancelarMetodoDepreciacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMetodoDepreciacion=true;
				} else {
					this.isVisibilidadCeldaGuardarMetodoDepreciacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMetodoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion=false;
			this.isVisibilidadCeldaActualizarMetodoDepreciacion=false;
			this.isVisibilidadCeldaEliminarMetodoDepreciacion=false;
			this.isVisibilidadCeldaCancelarMetodoDepreciacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMetodoDepreciacion=false;
				} else {
					this.isVisibilidadCeldaGuardarMetodoDepreciacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMetodoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion=false;
			this.isVisibilidadCeldaModificarMetodoDepreciacion=true;
			this.isVisibilidadCeldaActualizarMetodoDepreciacion=false;
			this.isVisibilidadCeldaEliminarMetodoDepreciacion=false;
			this.isVisibilidadCeldaCancelarMetodoDepreciacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMetodoDepreciacion=false;
				} else {
					this.isVisibilidadCeldaGuardarMetodoDepreciacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MetodoDepreciacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMetodoDepreciacion=true;
			this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=true;
			this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion=true;
		} else {
			this.actualizarEstadoPanelsMetodoDepreciacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMetodoDepreciacion=false;
			//this.isVisibilidadCeldaVerFormMetodoDepreciacion=false;
			this.isVisibilidadCeldaDuplicarMetodoDepreciacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!metododepreciacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=false;
		} else {
			this.isVisibilidadCeldaNuevoMetodoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosMetodoDepreciacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(metododepreciacionSessionBean.getEsGuardarRelacionado()) {
			if(!metododepreciacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=false;												
			}
			
			this.jButtonCerrarMetodoDepreciacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMetodoDepreciacion=false;
		}
		
		if(!this.permiteMantenimiento(this.metododepreciacion)) {
			this.isVisibilidadCeldaActualizarMetodoDepreciacion=false;
			this.isVisibilidadCeldaEliminarMetodoDepreciacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMetodoDepreciacion() {
	}
	
	public void actualizarEstadoPanelsMetodoDepreciacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMetodoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionMetodoDepreciacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMetodoDepreciacion!=null) {
				this.jTabbedPaneBusquedasMetodoDepreciacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMetodoDepreciacion!=null) {
				this.jScrollPanelDatosMetodoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionMetodoDepreciacion!=null) {
				this.jPanelPaginacionMetodoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMetodoDepreciacion!=null) {
				this.jPanelParametrosReportesMetodoDepreciacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMetodoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionMetodoDepreciacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMetodoDepreciacion!=null) {
				this.jTabbedPaneBusquedasMetodoDepreciacion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosMetodoDepreciacion!=null) {
				this.jScrollPanelDatosMetodoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionMetodoDepreciacion!=null) {
				this.jPanelPaginacionMetodoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMetodoDepreciacion!=null) {
				this.jPanelParametrosReportesMetodoDepreciacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMetodoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionMetodoDepreciacion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMetodoDepreciacion!=null) {
				this.jTabbedPaneBusquedasMetodoDepreciacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMetodoDepreciacion!=null) {
				this.jScrollPanelDatosMetodoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionMetodoDepreciacion!=null) {
				this.jPanelPaginacionMetodoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMetodoDepreciacion!=null) {
				this.jPanelParametrosReportesMetodoDepreciacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMetodoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionMetodoDepreciacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMetodoDepreciacion!=null) {
				this.jTabbedPaneBusquedasMetodoDepreciacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMetodoDepreciacion!=null) {
				this.jScrollPanelDatosMetodoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionMetodoDepreciacion!=null) {
				this.jPanelPaginacionMetodoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMetodoDepreciacion!=null) {
				this.jPanelParametrosReportesMetodoDepreciacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMetodoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionMetodoDepreciacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMetodoDepreciacion!=null) {
				this.jTabbedPaneBusquedasMetodoDepreciacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMetodoDepreciacion!=null) {
				this.jScrollPanelDatosMetodoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionMetodoDepreciacion!=null) {
				this.jPanelPaginacionMetodoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMetodoDepreciacion!=null) {
				this.jPanelParametrosReportesMetodoDepreciacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMetodoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionMetodoDepreciacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMetodoDepreciacion!=null) {
				this.jTabbedPaneBusquedasMetodoDepreciacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMetodoDepreciacion!=null) {
				this.jScrollPanelDatosMetodoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionMetodoDepreciacion!=null) {
				this.jPanelPaginacionMetodoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMetodoDepreciacion!=null) {
				this.jPanelParametrosReportesMetodoDepreciacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMetodoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionMetodoDepreciacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMetodoDepreciacion!=null) {
				this.jTabbedPaneBusquedasMetodoDepreciacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMetodoDepreciacion!=null) {
				this.jScrollPanelDatosMetodoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionMetodoDepreciacion!=null) {
				this.jPanelPaginacionMetodoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMetodoDepreciacion!=null) {
				this.jPanelParametrosReportesMetodoDepreciacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasMetodoDepreciacion!=null) {
					this.jTabbedPaneBusquedasMetodoDepreciacion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesMetodoDepreciacion!=null) {
				this.jPanelParametrosReportesMetodoDepreciacion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.metododepreciacionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMetodoDepreciacion!=null) {
				this.jTabbedPaneBusquedasMetodoDepreciacion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesMetodoDepreciacion!=null) {
				this.jPanelParametrosReportesMetodoDepreciacion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAnio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasMetodoDepreciacion.remove(jPanelFK_IdAnioMetodoDepreciacion);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasMetodoDepreciacion.remove(jPanelFK_IdDetalleActivoFijoMetodoDepreciacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdAnio=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasMetodoDepreciacion.remove(jPanelFK_IdAnioMetodoDepreciacion);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasMetodoDepreciacion.remove(jPanelFK_IdDetalleActivoFijoMetodoDepreciacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaDetalleActivoFijo(Boolean isParaDetalleActivoFijo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetalleActivoFijoNegation=!isParaDetalleActivoFijo;

			this.isVisibilidadFK_IdAnio=isParaDetalleActivoFijoNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasMetodoDepreciacion.remove(jPanelFK_IdAnioMetodoDepreciacion);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaDetalleActivoFijo;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasMetodoDepreciacion.remove(jPanelFK_IdDetalleActivoFijoMetodoDepreciacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasMetodoDepreciacion.remove(jPanelFK_IdAnioMetodoDepreciacion);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasMetodoDepreciacion.remove(jPanelFK_IdDetalleActivoFijoMetodoDepreciacion);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//MetodoDepreciacionSessionBean metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
		
		if(this.metododepreciacionSessionBean==null) {
			this.metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
		}
		
		this.metododepreciacionSessionBean.setsUltimaBusquedaMetodoDepreciacion(this.getsAccionBusqueda());
		this.metododepreciacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.metododepreciacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			metododepreciacionSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDetalleActivoFijo")) {
			metododepreciacionSessionBean.setid_detalle_activo_fijo(this.getid_detalle_activo_fijoFK_IdDetalleActivoFijo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			metododepreciacionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			metododepreciacionSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//MetodoDepreciacionSessionBean metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
		
		if(this.metododepreciacionSessionBean==null) {
			this.metododepreciacionSessionBean=new MetodoDepreciacionSessionBean();
		}
		
		if(this.metododepreciacionSessionBean.getsUltimaBusquedaMetodoDepreciacion()!=null&&!this.metododepreciacionSessionBean.getsUltimaBusquedaMetodoDepreciacion().equals("")) {
			this.setsAccionBusqueda(metododepreciacionSessionBean.getsUltimaBusquedaMetodoDepreciacion());
			this.setiNumeroPaginacion(metododepreciacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(metododepreciacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(metododepreciacionSessionBean.getid_anio());
				metododepreciacionSessionBean.setid_anio(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDetalleActivoFijo")) {
				this.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(metododepreciacionSessionBean.getid_detalle_activo_fijo());
				metododepreciacionSessionBean.setid_detalle_activo_fijo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(metododepreciacionSessionBean.getid_empresa());
				metododepreciacionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(metododepreciacionSessionBean.getid_sucursal());
				metododepreciacionSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.metododepreciacionSessionBean.setsUltimaBusquedaMetodoDepreciacion("");
		this.metododepreciacionSessionBean.setiNumeroPaginacion(MetodoDepreciacionConstantesFunciones.INUMEROPAGINACION);
		this.metododepreciacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaMetodoDepreciacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMetodoDepreciacion() {
		this.updateBorderResaltarBusquedasFormularioMetodoDepreciacion();
		this.updateVisibilidadBusquedasFormularioMetodoDepreciacion();
		this.updateHabilitarBusquedasFormularioMetodoDepreciacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioMetodoDepreciacion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasMetodoDepreciacion.getComponents().length>0) {
	

		if(this.metododepreciacionConstantesFunciones.resaltarFK_IdAnioMetodoDepreciacion!=null) {
			index= this.jTabbedPaneBusquedasMetodoDepreciacion.indexOfComponent(this.jPanelFK_IdAnioMetodoDepreciacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMetodoDepreciacion.getComponent(index);
				jPanel.setBorder(this.metododepreciacionConstantesFunciones.resaltarFK_IdAnioMetodoDepreciacion);
			}
		}

		if(this.metododepreciacionConstantesFunciones.resaltarFK_IdDetalleActivoFijoMetodoDepreciacion!=null) {
			index= this.jTabbedPaneBusquedasMetodoDepreciacion.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoMetodoDepreciacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMetodoDepreciacion.getComponent(index);
				jPanel.setBorder(this.metododepreciacionConstantesFunciones.resaltarFK_IdDetalleActivoFijoMetodoDepreciacion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioMetodoDepreciacion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasMetodoDepreciacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMetodoDepreciacion.indexOfComponent(this.jPanelFK_IdAnioMetodoDepreciacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMetodoDepreciacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.metododepreciacionConstantesFunciones.mostrarFK_IdAnioMetodoDepreciacion);
			if(!this.metododepreciacionConstantesFunciones.mostrarFK_IdAnioMetodoDepreciacion && index>-1) {
				this.jTabbedPaneBusquedasMetodoDepreciacion.remove(index);
			}

			index= this.jTabbedPaneBusquedasMetodoDepreciacion.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoMetodoDepreciacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMetodoDepreciacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.metododepreciacionConstantesFunciones.mostrarFK_IdDetalleActivoFijoMetodoDepreciacion);
			if(!this.metododepreciacionConstantesFunciones.mostrarFK_IdDetalleActivoFijoMetodoDepreciacion && index>-1) {
				this.jTabbedPaneBusquedasMetodoDepreciacion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioMetodoDepreciacion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasMetodoDepreciacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMetodoDepreciacion.indexOfComponent(this.jPanelFK_IdAnioMetodoDepreciacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMetodoDepreciacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.metododepreciacionConstantesFunciones.activarFK_IdAnioMetodoDepreciacion);
				this.jTabbedPaneBusquedasMetodoDepreciacion.setEnabledAt(index,this.metododepreciacionConstantesFunciones.activarFK_IdAnioMetodoDepreciacion);
			}

			index= this.jTabbedPaneBusquedasMetodoDepreciacion.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoMetodoDepreciacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMetodoDepreciacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.metododepreciacionConstantesFunciones.activarFK_IdDetalleActivoFijoMetodoDepreciacion);
				this.jTabbedPaneBusquedasMetodoDepreciacion.setEnabledAt(index,this.metododepreciacionConstantesFunciones.activarFK_IdDetalleActivoFijoMetodoDepreciacion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaMetodoDepreciacion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasMetodoDepreciacion.indexOfComponent(this.jPanelFK_IdAnioMetodoDepreciacion);

			this.jTabbedPaneBusquedasMetodoDepreciacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMetodoDepreciacion.getComponent(index);

			this.metododepreciacionConstantesFunciones.setResaltarFK_IdAnioMetodoDepreciacion(resaltar);

			jPanel.setBorder(this.metododepreciacionConstantesFunciones.resaltarFK_IdAnioMetodoDepreciacion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDetalleActivoFijo")) {
			index= this.jTabbedPaneBusquedasMetodoDepreciacion.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoMetodoDepreciacion);

			this.jTabbedPaneBusquedasMetodoDepreciacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMetodoDepreciacion.getComponent(index);

			this.metododepreciacionConstantesFunciones.setResaltarFK_IdDetalleActivoFijoMetodoDepreciacion(resaltar);

			jPanel.setBorder(this.metododepreciacionConstantesFunciones.resaltarFK_IdDetalleActivoFijoMetodoDepreciacion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarMetodoDepreciacion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioMetodoDepreciacion() throws Exception {

		if(this.jInternalFrameDetalleFormMetodoDepreciacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMetodoDepreciacion();
		this.updateVisibilidadResaltarControlesFormularioMetodoDepreciacion();
		this.updateHabilitarResaltarControlesFormularioMetodoDepreciacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioMetodoDepreciacion() throws Exception {
		if(this.jInternalFrameDetalleFormMetodoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.metododepreciacionConstantesFunciones.resaltaridMetodoDepreciacion!=null && this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelidMetodoDepreciacion.setBorder(this.metododepreciacionConstantesFunciones.resaltaridMetodoDepreciacion);}
		if(this.metododepreciacionConstantesFunciones.resaltarid_empresaMetodoDepreciacion!=null && this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion.setBorder(this.metododepreciacionConstantesFunciones.resaltarid_empresaMetodoDepreciacion);}
		if(this.metododepreciacionConstantesFunciones.resaltarid_sucursalMetodoDepreciacion!=null && this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion.setBorder(this.metododepreciacionConstantesFunciones.resaltarid_sucursalMetodoDepreciacion);}
		if(this.metododepreciacionConstantesFunciones.resaltarid_detalle_activo_fijoMetodoDepreciacion!=null && this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion.setBorder(this.metododepreciacionConstantesFunciones.resaltarid_detalle_activo_fijoMetodoDepreciacion);}
		if(this.metododepreciacionConstantesFunciones.resaltarid_anioMetodoDepreciacion!=null && this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion.setBorder(this.metododepreciacionConstantesFunciones.resaltarid_anioMetodoDepreciacion);}
		if(this.metododepreciacionConstantesFunciones.resaltarfecha_desdeMetodoDepreciacion!=null && this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_desdeMetodoDepreciacion.setBorder(this.metododepreciacionConstantesFunciones.resaltarfecha_desdeMetodoDepreciacion);}
		if(this.metododepreciacionConstantesFunciones.resaltarfecha_hastaMetodoDepreciacion!=null && this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_hastaMetodoDepreciacion.setBorder(this.metododepreciacionConstantesFunciones.resaltarfecha_hastaMetodoDepreciacion);}
		if(this.metododepreciacionConstantesFunciones.resaltarporcentajeMetodoDepreciacion!=null && this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldporcentajeMetodoDepreciacion.setBorder(this.metododepreciacionConstantesFunciones.resaltarporcentajeMetodoDepreciacion);}
		if(this.metododepreciacionConstantesFunciones.resaltarvalorMetodoDepreciacion!=null && this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldvalorMetodoDepreciacion.setBorder(this.metododepreciacionConstantesFunciones.resaltarvalorMetodoDepreciacion);}
		if(this.metododepreciacionConstantesFunciones.resaltarnumero_diasMetodoDepreciacion!=null && this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldnumero_diasMetodoDepreciacion.setBorder(this.metododepreciacionConstantesFunciones.resaltarnumero_diasMetodoDepreciacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMetodoDepreciacion() throws Exception {		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
	
		//this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelidMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostraridMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jPanelidMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostraridMetodoDepreciacion);
		//this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarid_empresaMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jPanelid_empresaMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarid_empresaMetodoDepreciacion);
		//this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarid_sucursalMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jPanelid_sucursalMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarid_sucursalMetodoDepreciacion);
		//this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarid_detalle_activo_fijoMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jPanelid_detalle_activo_fijoMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarid_detalle_activo_fijoMetodoDepreciacion);
		//this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarid_anioMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jPanelid_anioMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarid_anioMetodoDepreciacion);
		//this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_desdeMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarfecha_desdeMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jPanelfecha_desdeMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarfecha_desdeMetodoDepreciacion);
		//this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_hastaMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarfecha_hastaMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jPanelfecha_hastaMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarfecha_hastaMetodoDepreciacion);
		//this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldporcentajeMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarporcentajeMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jPanelporcentajeMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarporcentajeMetodoDepreciacion);
		//this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldvalorMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarvalorMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jPanelvalorMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarvalorMetodoDepreciacion);
		//this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldnumero_diasMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarnumero_diasMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jPanelnumero_diasMetodoDepreciacion.setVisible(this.metododepreciacionConstantesFunciones.mostrarnumero_diasMetodoDepreciacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMetodoDepreciacion() throws Exception {
		if(this.jInternalFrameDetalleFormMetodoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMetodoDepreciacion!=null) {
	
		this.jInternalFrameDetalleFormMetodoDepreciacion.jLabelidMetodoDepreciacion.setEnabled(this.metododepreciacionConstantesFunciones.activaridMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_empresaMetodoDepreciacion.setEnabled(this.metododepreciacionConstantesFunciones.activarid_empresaMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_sucursalMetodoDepreciacion.setEnabled(this.metododepreciacionConstantesFunciones.activarid_sucursalMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_detalle_activo_fijoMetodoDepreciacion.setEnabled(this.metododepreciacionConstantesFunciones.activarid_detalle_activo_fijoMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jComboBoxid_anioMetodoDepreciacion.setEnabled(this.metododepreciacionConstantesFunciones.activarid_anioMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_desdeMetodoDepreciacion.setEnabled(this.metododepreciacionConstantesFunciones.activarfecha_desdeMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jDateChooserfecha_hastaMetodoDepreciacion.setEnabled(this.metododepreciacionConstantesFunciones.activarfecha_hastaMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldporcentajeMetodoDepreciacion.setEnabled(this.metododepreciacionConstantesFunciones.activarporcentajeMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldvalorMetodoDepreciacion.setEnabled(this.metododepreciacionConstantesFunciones.activarvalorMetodoDepreciacion);
		this.jInternalFrameDetalleFormMetodoDepreciacion.jTextFieldnumero_diasMetodoDepreciacion.setEnabled(this.metododepreciacionConstantesFunciones.activarnumero_diasMetodoDepreciacion);
		}
	}
	
		
}