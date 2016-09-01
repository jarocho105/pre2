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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.KitConstantesFunciones;
import com.bydan.erp.inventario.util.KitParameterReturnGeneral;
//import com.bydan.erp.inventario.util.KitParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.KitBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
public class KitBeanSwingJInternalFrame extends KitJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(KitBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Kit> kitValidator = new ClassValidator<Kit>(Kit.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Kit kit;	
	public Kit kitAux;
	public Kit kitAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Kit kitTotales;
	public Long idKitActual;
	public Long iIdNuevoKit=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosCompoKit=false;

	public Boolean getIsTienePermisosCompoKit() {
		return isTienePermisosCompoKit;
	}

	public void setIsTienePermisosCompoKit(Boolean isTienePermisosCompoKit) {
		this.isTienePermisosCompoKit= isTienePermisosCompoKit;
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
	
	public Boolean isPermisoTodoKit;
	public Boolean isPermisoNuevoKit;
	public Boolean isPermisoActualizarKit;
	public Boolean isPermisoActualizarOriginalKit;
	public Boolean isPermisoEliminarKit;
	public Boolean isPermisoGuardarCambiosKit;
	public Boolean isPermisoConsultaKit;
	public Boolean isPermisoBusquedaKit;
	public Boolean isPermisoReporteKit;
	public Boolean isPermisoPaginacionMedioKit;
	public Boolean isPermisoPaginacionAltoKit;
	public Boolean isPermisoPaginacionTodoKit;
	public Boolean isPermisoCopiarKit;
	public Boolean isPermisoVerFormKit;
	public Boolean isPermisoDuplicarKit;
	public Boolean isPermisoOrdenKit;
	
	
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
	
	public KitParameterReturnGeneral kitReturnGeneral;
	public KitParameterReturnGeneral kitParameterGeneral;
	
	

	public CompoKitLogic compokitLogic=null;

	public CompoKitLogic getCompoKitLogic() {
		return compokitLogic;
	}

	public void setCompoKitLogic(CompoKitLogic compokitLogic) {
		this.compokitLogic = compokitLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoKit=false;
	public Boolean esParaAccionDesdeFormularioKit=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected KitSessionBeanAdditional kitSessionBeanAdditional=null;
	
	public KitSessionBeanAdditional getKitSessionBeanAdditional() {
		return this.kitSessionBeanAdditional;
	}
	
	public void setKitSessionBeanAdditional(KitSessionBeanAdditional kitSessionBeanAdditional) {
		try {
			this.kitSessionBeanAdditional=kitSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected KitBeanSwingJInternalFrameAdditional kitBeanSwingJInternalFrameAdditional=null;
	//public class KitBeanSwingJInternalFrame
	
	public KitBeanSwingJInternalFrameAdditional getKitBeanSwingJInternalFrameAdditional() {
		return this.kitBeanSwingJInternalFrameAdditional;
	}
	
	public void setKitBeanSwingJInternalFrameAdditional(KitBeanSwingJInternalFrameAdditional kitBeanSwingJInternalFrameAdditional) {
		try {
			this.kitBeanSwingJInternalFrameAdditional=kitBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public KitLogic kitLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Kit kitBean;
	public KitConstantesFunciones kitConstantesFunciones;
	//public KitParameterReturnGeneral kitReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<Kit> kits;	
	//public List<Kit> kitsEliminados;
	//public List<Kit> kitsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoKit=false;
	public Boolean isVisibilidadCeldaDuplicarKit=true;
	public Boolean isVisibilidadCeldaCopiarKit=true;
	public Boolean isVisibilidadCeldaVerFormKit=true;
	public Boolean isVisibilidadCeldaOrdenKit=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesKit=false;
	public Boolean isVisibilidadCeldaModificarKit=false;
	public Boolean isVisibilidadCeldaActualizarKit=false;
	public Boolean isVisibilidadCeldaEliminarKit=false;
	public Boolean isVisibilidadCeldaCancelarKit=false;
	public Boolean isVisibilidadCeldaGuardarKit=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosKit=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoKit() {
		return this.iIdNuevoKit;
	}

	public void setiIdNuevoKit(Long iIdNuevoKit) {
		this.iIdNuevoKit = iIdNuevoKit;
	}
	
	public Long getidKitActual() {
		return this.idKitActual;
	}

	public void setidKitActual(Long idKitActual) {
		this.idKitActual = idKitActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Kit getkit() {
		return this.kit;
	}

	public void setkit(Kit kit) {
		this.kit = kit;
	}
	
	public Kit getkitAux() {
		return this.kitAux;
	}

	public void setkitAux(Kit kitAux) {
		this.kitAux = kitAux;
	}				
	
	public Kit getkitAnterior() {
		return this.kitAnterior;
	}

	public void setkitAnterior(Kit kitAnterior) {
		this.kitAnterior = kitAnterior;
	}	
	
	public Kit getkitTotales() {
		return this.kitTotales;
	}

	public void setkitTotales(Kit kitTotales) {
		this.kitTotales = kitTotales;
	}	
	
	public Kit getkitBean() {
		return this.kitBean;
	}

	public void setkitBean(Kit kitBean) {
		this.kitBean = kitBean;
	}	
	
	public KitParameterReturnGeneral getkitReturnGeneral() {
		return this.kitReturnGeneral;
	}

	public void setkitReturnGeneral(KitParameterReturnGeneral kitReturnGeneral) {
		this.kitReturnGeneral = kitReturnGeneral;
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
	
	
	public KitLogic getKitLogic()	{		
		return kitLogic;
	}

	public void setKitLogic(KitLogic kitLogic) {
		this.kitLogic = kitLogic;
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
	
	public Boolean getIsEsNuevoKit() {
		return isEsNuevoKit;
	}

	public void setIsEsNuevoKit(Boolean isEsNuevoKit) {
		this.isEsNuevoKit = isEsNuevoKit;
	}

	public Boolean getEsParaAccionDesdeFormularioKit() {
		return esParaAccionDesdeFormularioKit;
	}
	
	public void setEsParaAccionDesdeFormularioKit(Boolean esParaAccionDesdeFormularioKit) {
		this.esParaAccionDesdeFormularioKit = esParaAccionDesdeFormularioKit;
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

			if(this.kitSessionBean==null) {
				this.kitSessionBean=new KitSessionBean();
			}

			if(!this.kitSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(kitSessionBean.getlidEmpresaActual());
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

			if(this.kitSessionBean==null) {
				this.kitSessionBean=new KitSessionBean();
			}

			if(!this.kitSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(kitSessionBean.getlidSucursalActual());
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

					if(this.kit!=null) {
						this.kit.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormKit!=null) {
						this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaKit.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormKit!=null) {
						if(this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit.getItemCount()>0) {
							this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaKitGenerico)throws Exception
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
				jComboBoxid_empresaKitGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaKitGenerico!=null && jComboBoxid_empresaKitGenerico.getItemCount()>0) {
					jComboBoxid_empresaKitGenerico.setSelectedIndex(0);
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

					if(this.kit!=null) {
						this.kit.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormKit!=null) {
						this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalKit.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormKit!=null) {
						if(this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit.getItemCount()>0) {
							this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalKitGenerico)throws Exception
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
				jComboBoxid_sucursalKitGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalKitGenerico!=null && jComboBoxid_sucursalKitGenerico.getItemCount()>0) {
					jComboBoxid_sucursalKitGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Kit kit,JComboBox jComboBoxid_empresaKitGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaKitGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaKitGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				kit.setid_empresa(empresaAux.getId());
				kit.setempresa_descripcion(KitConstantesFunciones.getEmpresaDescripcion(empresaAux));
				kit.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Kit kit,JComboBox jComboBoxid_sucursalKitGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalKitGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalKitGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				kit.setid_sucursal(sucursalAux.getId());
				kit.setsucursal_descripcion(KitConstantesFunciones.getSucursalDescripcion(sucursalAux));
				kit.setSucursal(sucursalAux);			}
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

					if(!KitJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormKit!=null) { 
							this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormKit!=null) { 
					}

					if(!KitJInternalFrame.ISBINDING_MANUAL) {
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

					if(!KitJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormKit!=null) { 
							this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormKit!=null) { 
					}

					if(!KitJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormKit!=null) {
							this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormKit!=null) {
							this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormKit!=null) {
							this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormKit!=null) {
							this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesKit() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			KitConstantesFunciones.refrescarForeignKeysDescripcionesKit(this.kitLogic.getKits());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			KitConstantesFunciones.refrescarForeignKeysDescripcionesKit(this.kits);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//kitLogic.setKits(this.kits);
			kitLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public KitParameterReturnGeneral getKitParameterGeneral() {
		return this.kitParameterGeneral;
	}
	
	public void setKitParameterGeneral(KitParameterReturnGeneral kitParameterGeneral) {
		this.kitParameterGeneral = kitParameterGeneral;
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
	
	public Boolean getIsPermisoTodoKit() {
		return isPermisoTodoKit;
	}

	public void setIsPermisoTodoKit(Boolean isPermisoTodoKit) {
		this.isPermisoTodoKit = isPermisoTodoKit;
	}

	public Boolean getIsPermisoNuevoKit() {
		return isPermisoNuevoKit;
	}

	public void setIsPermisoNuevoKit(Boolean isPermisoNuevoKit) {
		this.isPermisoNuevoKit = isPermisoNuevoKit;
	}

	public Boolean getIsPermisoActualizarKit() {
		return isPermisoActualizarKit;
	}

	public void setIsPermisoActualizarKit(Boolean isPermisoActualizarKit) {
		this.isPermisoActualizarKit = isPermisoActualizarKit;
	}

	public Boolean getIsPermisoEliminarKit() {
		return isPermisoEliminarKit;
	}

	public void setIsPermisoEliminarKit(Boolean isPermisoEliminarKit) {
		this.isPermisoEliminarKit = isPermisoEliminarKit;
	}

	public Boolean getIsPermisoGuardarCambiosKit() {
		return isPermisoGuardarCambiosKit;
	}

	public void setIsPermisoGuardarCambiosKit(Boolean isPermisoGuardarCambiosKit) {
		this.isPermisoGuardarCambiosKit = isPermisoGuardarCambiosKit;
	}
	
	public Boolean getIsPermisoConsultaKit() {
		return isPermisoConsultaKit;
	}

	public void setIsPermisoConsultaKit(Boolean isPermisoConsultaKit) {
		this.isPermisoConsultaKit = isPermisoConsultaKit;
	}

	public Boolean getIsPermisoBusquedaKit() {
		return isPermisoBusquedaKit;
	}

	public void setIsPermisoBusquedaKit(Boolean isPermisoBusquedaKit) {
		this.isPermisoBusquedaKit = isPermisoBusquedaKit;
	}

	public Boolean getIsPermisoReporteKit() {
		return isPermisoReporteKit;
	}

	public void setIsPermisoReporteKit(Boolean isPermisoReporteKit) {
		this.isPermisoReporteKit = isPermisoReporteKit;
	}
	
	public Boolean getIsPermisoPaginacionMedioKit() {
		return isPermisoPaginacionMedioKit;
	}

	public void setIsPermisoPaginacionMedioKit(Boolean isPermisoPaginacionMedioKit) {
		this.isPermisoPaginacionMedioKit = isPermisoPaginacionMedioKit;
	}
	
	public Boolean getIsPermisoPaginacionTodoKit() {
		return isPermisoPaginacionTodoKit;
	}

	public void setIsPermisoPaginacionTodoKit(Boolean isPermisoPaginacionTodoKit) {
		this.isPermisoPaginacionTodoKit = isPermisoPaginacionTodoKit;
	}
	
	public Boolean getIsPermisoPaginacionAltoKit() {
		return isPermisoPaginacionAltoKit;
	}

	public void setIsPermisoPaginacionAltoKit(Boolean isPermisoPaginacionAltoKit) {
		this.isPermisoPaginacionAltoKit = isPermisoPaginacionAltoKit;
	}
	
	public Boolean getIsPermisoCopiarKit() {
		return isPermisoCopiarKit;
	}

	public void setIsPermisoCopiarKit(Boolean isPermisoCopiarKit) {
		this.isPermisoCopiarKit = isPermisoCopiarKit;
	}
	
	public Boolean getIsPermisoVerFormKit() {
		return isPermisoVerFormKit;
	}

	public void setIsPermisoVerFormKit(Boolean isPermisoVerFormKit) {
		this.isPermisoVerFormKit = isPermisoVerFormKit;
	}
	
	public Boolean getIsPermisoDuplicarKit() {
		return isPermisoDuplicarKit;
	}

	public void setIsPermisoDuplicarKit(Boolean isPermisoDuplicarKit) {
		this.isPermisoDuplicarKit = isPermisoDuplicarKit;
	}
	
	public Boolean getIsPermisoOrdenKit() {
		return isPermisoOrdenKit;
	}

	public void setIsPermisoOrdenKit(Boolean isPermisoOrdenKit) {
		this.isPermisoOrdenKit = isPermisoOrdenKit;
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
	
	public Boolean getIsVisibilidadCeldaNuevoKit() {
		return isVisibilidadCeldaNuevoKit;
	}

	public void setIsVisibilidadCeldaNuevoKit(Boolean isVisibilidadCeldaNuevoKit) {
		this.isVisibilidadCeldaNuevoKit = isVisibilidadCeldaNuevoKit;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarKit() {
		return isVisibilidadCeldaDuplicarKit;
	}

	public void setIsVisibilidadCeldaDuplicarKit(Boolean isVisibilidadCeldaDuplicarKit) {
		this.isVisibilidadCeldaDuplicarKit = isVisibilidadCeldaDuplicarKit;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarKit() {
		return isVisibilidadCeldaCopiarKit;
	}

	public void setIsVisibilidadCeldaCopiarKit(Boolean isVisibilidadCeldaCopiarKit) {
		this.isVisibilidadCeldaCopiarKit = isVisibilidadCeldaCopiarKit;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormKit() {
		return isVisibilidadCeldaVerFormKit;
	}

	public void setIsVisibilidadCeldaVerFormKit(Boolean isVisibilidadCeldaVerFormKit) {
		this.isVisibilidadCeldaVerFormKit = isVisibilidadCeldaVerFormKit;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenKit() {
		return isVisibilidadCeldaOrdenKit;
	}

	public void setIsVisibilidadCeldaOrdenKit(Boolean isVisibilidadCeldaOrdenKit) {
		this.isVisibilidadCeldaOrdenKit = isVisibilidadCeldaOrdenKit;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesKit() {
		return isVisibilidadCeldaNuevoRelacionesKit;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesKit(Boolean isVisibilidadCeldaNuevoRelacionesKit) {
		this.isVisibilidadCeldaNuevoRelacionesKit = isVisibilidadCeldaNuevoRelacionesKit;
	}
	
	public Boolean getIsVisibilidadCeldaModificarKit() {
		return isVisibilidadCeldaModificarKit;
	}

	public void setIsVisibilidadCeldaModificarKit(Boolean isVisibilidadCeldaModificarKit) {
		this.isVisibilidadCeldaModificarKit = isVisibilidadCeldaModificarKit;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarKit() {
		return isVisibilidadCeldaActualizarKit;
	}

	public void setIsVisibilidadCeldaActualizarKit(Boolean isVisibilidadCeldaActualizarKit) {
		this.isVisibilidadCeldaActualizarKit = isVisibilidadCeldaActualizarKit;
	}

	public Boolean getIsVisibilidadCeldaEliminarKit() {
		return isVisibilidadCeldaEliminarKit;
	}

	public void setIsVisibilidadCeldaEliminarKit(Boolean isVisibilidadCeldaEliminarKit) {
		this.isVisibilidadCeldaEliminarKit = isVisibilidadCeldaEliminarKit;
	}

	public Boolean getIsVisibilidadCeldaCancelarKit() {
		return isVisibilidadCeldaCancelarKit;
	}

	public void setIsVisibilidadCeldaCancelarKit(Boolean isVisibilidadCeldaCancelarKit) {
		this.isVisibilidadCeldaCancelarKit = isVisibilidadCeldaCancelarKit;
	}

	public Boolean getIsVisibilidadCeldaGuardarKit() {
		return isVisibilidadCeldaGuardarKit;
	}

	public void setIsVisibilidadCeldaGuardarKit(Boolean isVisibilidadCeldaGuardarKit) {
		this.isVisibilidadCeldaGuardarKit = isVisibilidadCeldaGuardarKit;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosKit() {
		return isVisibilidadCeldaGuardarCambiosKit;
	}

	public void setIsVisibilidadCeldaGuardarCambiosKit(Boolean isVisibilidadCeldaGuardarCambiosKit) {
		this.isVisibilidadCeldaGuardarCambiosKit = isVisibilidadCeldaGuardarCambiosKit;
	}
		
	public KitSessionBean getkitSessionBean() {
		return this.kitSessionBean;
	}
	
	public void setkitSessionBean(KitSessionBean kitSessionBean) {
		this.kitSessionBean=kitSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysKit(Kit kit)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(kit,null);
				this.setActualParaGuardarSucursalForeignKey(kit,null);
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
	
	public void bugActualizarReferenciaActual(Kit kit,Kit kitAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalKit(kit);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		kitAux.setId(kit.getId());
		kitAux.setVersionRow(kit.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessKit();
		
			int intSelectedRow = this.jTableDatosKit.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(KitJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualKit(this.kit,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = kitValidator.getInvalidValues(this.kit);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			kitLogic.setDatosCliente(datosCliente);
			kitLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				kitAux=new  Kit();
				
				kitAux.setIsNew(true);
				kitAux.setIsChanged(true);
				
				kitAux.setKitOriginal(this.kit);
				
				kitAux.setId(this.kit.getId());	
				kitAux.setVersionRow(this.kit.getVersionRow());	
				kitAux.setid_empresa(this.kit.getid_empresa());	
				kitAux.setid_sucursal(this.kit.getid_sucursal());	
				kitAux.setdescripcion(this.kit.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.kitSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.kitSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(kitAux,kitLogic.getKits());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(kitAux,kits);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.kitSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.kitSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						kitLogic.saveKits();//WithConnection
						//kitLogic.getSetVersionRowKits();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.kit,kitAux);
					
					this.refrescarForeignKeysDescripcionesKit();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.kitSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.getCompoKits().addAll(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokits.addAll(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.kitSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								kitLogic.saveKitRelaciones(kitAux,this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.getCompoKits());//WithConnection
								//kitLogic.getSetVersionRowKits();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.kit,kitAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.setCompoKits(new ArrayList<CompoKit>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokits= new ArrayList<CompoKit>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.quitarFilaTotales();}
							kitAux.setCompoKits(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.getCompoKits());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.kitSessionBean.getEstaModoGuardarRelaciones() 
									|| this.kitSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(kitAux,kitLogic.getKits());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(kitAux,kits);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.kit,kitAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				kitAux=new  Kit();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.kitSessionBean.getEsGuardarRelacionado() 
					|| (this.kitSessionBean.getEsGuardarRelacionado() && this.kit.getId()>=0)) {
						
					kitAux.setIsNew(false);
				}
				
				kitAux.setIsDeleted(false);
			
				kitAux.setId(this.kit.getId());	
				kitAux.setVersionRow(this.kit.getVersionRow());	
				kitAux.setid_empresa(this.kit.getid_empresa());	
				kitAux.setid_sucursal(this.kit.getid_sucursal());	
				kitAux.setdescripcion(this.kit.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(kitAux,kitLogic.getKits());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(kitAux,kits);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.kitSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.kitSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						kitLogic.saveKits();//WithConnection
						//kitLogic.getSetVersionRowKits();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.kit,kitAux);
					
					this.refrescarForeignKeysDescripcionesKit();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.kitSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.getCompoKits().addAll(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokits.addAll(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.kitSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								kitLogic.saveKitRelaciones(kitAux,this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.getCompoKits());//WithConnection
								//kitLogic.getSetVersionRowKits();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.kit,kitAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.setCompoKits(new ArrayList<CompoKit>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokits= new ArrayList<CompoKit>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.quitarFilaTotales();}
							kitAux.setCompoKits(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.getCompoKits());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.kitSessionBean.getEstaModoGuardarRelaciones() 
									|| this.kitSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(kitAux,kitLogic.getKits());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(kitAux,kits);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.kit,kitAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				kitAux=new  Kit();
				
				kitAux.setIsNew(false);
				kitAux.setIsChanged(false);
				
				kitAux.setIsDeleted(true);
				
				kitAux.setId(this.kit.getId());	
				kitAux.setVersionRow(this.kit.getVersionRow());	
				kitAux.setid_empresa(this.kit.getid_empresa());	
				kitAux.setid_sucursal(this.kit.getid_sucursal());	
				kitAux.setdescripcion(this.kit.getdescripcion());	
				
				if(this.kitSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.kitAux.getId()>=0) {	
						this.kitsEliminados.add(kitAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(kitAux,kitLogic.getKits());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(kitAux,kits);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.kitSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.kitSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						kitLogic.saveKits();//WithConnection
						//kitLogic.getSetVersionRowKits();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.kitSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.getCompoKits().addAll(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokits.addAll(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.kitSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								kitLogic.saveKitRelaciones(kitAux,this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.getCompoKits());//WithConnection
								//kitLogic.getSetVersionRowKits();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.setCompoKits(new ArrayList<CompoKit>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokits= new ArrayList<CompoKit>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.quitarFilaTotales();}
							kitAux.setCompoKits(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.getCompoKits());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.kitSessionBean.getEstaModoGuardarRelaciones() 
								|| this.kitSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(kitAux,kitLogic.getKits());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(kitAux,kits);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.getKits().addAll(this.kitsEliminados);
					
					kitLogic.saveKits();//WithConnection
					//kitLogic.getSetVersionRowKits();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesKit();
				
				this.kitsEliminados= new ArrayList<Kit>();		
			}
			
			if(this.kitSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.kitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Kit GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Kit",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.kit=kitAux;
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
      		//this.finishProcessKit();
      	}
		
	}	
	
	public void actualizarRelaciones(Kit kitLocal) throws Exception {
		
		if(this.kitSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				kitLocal.setCompoKits(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.getCompoKits());
			
			} else {
			
				kitLocal.setCompoKits(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokits);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Kit kitLocal) throws Exception {	
		if(this.kitSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				kitLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				kitLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarKitActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosKit.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = kitValidator.getInvalidValues(this.kit);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Kit kit,List<Kit> kits) throws Exception {
		try	{		
			KitConstantesFunciones.actualizarLista(kit,kits,this.kitSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Kit kit,List<Kit> kits) throws Exception {
		try	{			
			KitConstantesFunciones.actualizarSelectedLista(kit,kits);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Kit> kitsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				kitsLocal=this.kitLogic.getKits();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				kitsLocal=this.kits;
			}
			//ARCHITECTURE
		
			for(Kit kitLocal:kitsLocal) {
				if(this.permiteMantenimiento(kitLocal) && kitLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+KitConstantesFunciones.getKitLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(KitConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormKit.jLabelid_empresaKit,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(KitConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormKit.jLabelid_sucursalKit,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(KitConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormKit.jLabeldescripcionKit,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormKit!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormKit.jLabelid_empresaKit,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormKit.jLabelid_sucursalKit,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormKit.jLabeldescripcionKit,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("CompoKit")) {
			if(this.kit==null) {
				this.kit= new Kit();
			}

			if(this.kitSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoKit
				this.setVariablesFormularioToObjetoActualKit(this.kit,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);

				this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.getcompokit().setKit(this.kit);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoKit--;	
		
		
		this.kitAux=new Kit();
		
		this.kitAux.setId(this.iIdNuevoKit);
		this.kitAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.kitLogic.getKits().add(this.kitAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.kits.add(this.kitAux);
		}
		//ARCHITECTURE
		
		this.kit=this.kitAux;
		
		if(KitJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioKit(this.kit);
			this.setVariablesObjetoActualToFormularioForeignKeyKit(this.kit);
		}
				
		//this.setDefaultControlesKit();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyKit();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyKit();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyKit();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualKit(this.kitBean,this.kit,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(KitConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.kitSessionBean.getConGuardarRelaciones()) {
			classes=KitConstantesFunciones.getClassesRelationshipsOfKit(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.kitReturnGeneral=kitLogic.procesarEventosKitsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.kitLogic.getKits(),this.kit,this.kitParameterGeneral,this.isEsNuevoKit,classes);//this.kitLogic.getKit()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanKit(this.kitReturnGeneral,this.kitBean,false);
		
		if(this.kitReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyKit(this.kitReturnGeneral.getKit());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioKit(this.kitReturnGeneral.getKit());
		}
		
		if(this.kitReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioKit(this.kitReturnGeneral.getKit(),classes);//this.kitBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualKit(this.kit,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyKit();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyKit();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			KitBeanSwingJInternalFrameAdditional.RecargarFormKit(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingKit(false);
						
			if(kitSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitSessionBean.getEsGuardarRelacionado() && CompoKitJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCompoKitActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(KitJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualKit();
			}
			
			this.actualizarVisualTableDatosKit();
			
			this.jTableDatosKit.setRowSelectionInterval(this.getIndiceNuevoKit(), this.getIndiceNuevoKit());
			
			this.seleccionarFilaTablaKitActual();
						
			this.actualizarEstadoCeldasBotonesKit("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesKit(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormKit.jTextAreadescripcionKit.setEnabled(isHabilitar && this.kitConstantesFunciones.activardescripcionKit);	
		//
		this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit.setEnabled(isHabilitar && this.kitConstantesFunciones.activarid_empresaKit);//
		this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit.setEnabled(isHabilitar && this.kitConstantesFunciones.activarid_sucursalKit);
	};
	
	public void setDefaultControlesKit() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoKit(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.kitSessionBean.setConGuardarRelaciones(true);			
			this.kitSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormKit.jTabbedPaneRelacionesKit.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.kitSessionBean.setConGuardarRelaciones(false);			
			this.kitSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormKit.jTabbedPaneRelacionesKit.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoKit() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Kit kitAux:this.kitLogic.getKits()) {
				if(kitAux.getId().equals(this.iIdNuevoKit)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Kit kitAux:this.kits) {
				if(kitAux.getId().equals(this.iIdNuevoKit)) {
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
	
	public int getIndiceActualKit(Kit kit,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Kit kitAux:this.kitLogic.getKits()) {
				if(kitAux.getId().equals(kit.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Kit kitAux:this.kits) {
				if(kitAux.getId().equals(kit.getId())) {
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
	
	public void setCamposBaseDesdeOriginalKit(Kit kitOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Kit kitAux:this.kitLogic.getKits()) {
				if(kitAux.getKitOriginal().getId().equals(kitOriginal.getId())) {
					existe=true;
					kitOriginal.setId(kitAux.getId());
					kitOriginal.setVersionRow(kitAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Kit kitAux:this.kits) {
				if(kitAux.getKitOriginal().getId().equals(kitOriginal.getId())) {
					existe=true;
					kitOriginal.setId(kitAux.getId());
					kitOriginal.setVersionRow(kitAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosKit(Boolean esParaCancelar) throws Exception {
		kitsAux=new ArrayList<Kit>();
		kitAux=new Kit();
		
		if(!this.kitSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Kit kitAux:this.kitLogic.getKits()) {
					if(kitAux.getId()<0) {
						kitsAux.add(kitAux);
					}		
				}
				this.iIdNuevoKit=0L;
				this.kitLogic.getKits().removeAll(kitsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Kit kitAux:this.kits) {
					if(kitAux.getId()<0) {
						kitsAux.add(kitAux);
					}		
				}
				this.iIdNuevoKit=0L;
				this.kits.removeAll(kitsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoKit 
					&& this.kitLogic.getKits().size()>0
					) {
					kitAux=this.kitLogic.getKits().get(this.kitLogic.getKits().size() - 1);
				
					if(kitAux.getId()<0) {
						this.kitLogic.getKits().remove(kitAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoKit && this.kits.size()>0) {
					kitAux=this.kits.get(this.kits.size() - 1);
				
					if(kitAux.getId()<0) {
						this.kits.remove(kitAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoKit(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(kit.getId()<0) {
				this.kitLogic.getKits().remove(this.kit);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(kit.getId()<0) {
				this.kits.remove(this.kit);
			}
		}			
	}
	
	public void setEstadosInicialesKit(List<Kit> kitsAux) throws Exception {
		KitConstantesFunciones.setEstadosInicialesKit(kitsAux);
	}
	
	public void setEstadosInicialesKit(Kit kitAux) throws Exception {
		KitConstantesFunciones.setEstadosInicialesKit(kitAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarKitActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesKit("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarKitActual()) {
				if(!this.isEsNuevoKit) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesKit("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoKit=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarKitActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Kit ?", "MANTENIMIENTO DE Kit", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesKit("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Kit kit) throws Exception {
		KitConstantesFunciones.seleccionarAsignar(this.kit,kit);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarKit=this.isPermisoActualizarOriginalKit;
			
			
			this.seleccionarAsignar(kit);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			KitConstantesFunciones.quitarEspaciosKit(this.kit,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesKit("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.kitSessionBean.setsFuncionBusquedaRapida(this.kitSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoKit) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosKit(esParaCancelar);				
				this.cancelarNuevoKit(esParaCancelar);								
			}
			
			this.kit=new Kit();
			
			this.inicializarKit();
			
			this.actualizarEstadoCeldasBotonesKit("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarKit() throws Exception {
		try {
			KitConstantesFunciones.inicializarKit(this.kit);
			
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
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.kitLogic.getKits().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteKits(String sAccionBusqueda,List<Kit> kitsParaReportes) throws Exception {
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
					sPathReporteFinal="Kit"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="KitMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("KitMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Kit"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Kites");		
		parameters.put("busquedapor", KitConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(CompoKit.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					KitLogic kitLogicAuxiliar=new KitLogic();
					kitLogicAuxiliar.setDatosCliente(kitLogic.getDatosCliente());				
					kitLogicAuxiliar.setKits(kitsParaReportes);
					
					kitLogicAuxiliar.cargarRelacionesLoteForeignKeyKitWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					kitsParaReportes=kitLogicAuxiliar.getKits();
					
					//kitLogic.getNewConnexionToDeep();
					
					//for (Kit kit:kitsParaReportes) {
					//	kitLogic.deepLoad(kit, false, DeepLoadType.INCLUDE, classes);
					//}						
					//kitLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//kitLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCompoKit = AuxiliarReportes.class.getResourceAsStream("CompoKitDetalleRelacionesDesign.jasper");
			parameters.put("subreport_compokit", reportFileCompoKit);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceKit=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			KitConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			KitConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceKit=new JRBeanArrayDataSource(KitJInternalFrame.TraerKitBeans(kitsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceKit);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+KitConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+KitConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(KitBean.TraerKitBeans(kitsParaReportes).toArray()));
							
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
				this.generarExcelReporteKits(sAccionBusqueda,sTipoArchivoReporte,kitsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalKits(sAccionBusqueda,sTipoArchivoReporte,kitsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoKitActionPerformed(null);
					//this.generarExcelReporteKits(sAccionBusqueda,sTipoArchivoReporte,kitsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalKits(sAccionBusqueda,sTipoArchivoReporte,kitsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesKits(sAccionBusqueda,sTipoArchivoReporte,kitsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesKits(sAccionBusqueda,sTipoArchivoReporte,kitsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteKits(String sAccionBusqueda,String sTipoArchivoReporte,List<Kit> kitsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"kit";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Kits");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderKit("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Kit kit : kitsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			KitConstantesFunciones.generarExcelReporteDataKit("NORMAL",row,workbook,kit,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.kitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Kit",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderKit(String sTipo,Row row,Workbook workbook) {
		
		KitConstantesFunciones.generarExcelReporteHeaderKit(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalKits(String sAccionBusqueda,String sTipoArchivoReporte,List<Kit> kitsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"kit_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Kits");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Kit kit : kitsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(KitConstantesFunciones.getKitDescripcion(kit));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(KitConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(KitConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(kit.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(KitConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(KitConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(kit.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(KitConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(KitConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(kit.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.kitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Kit",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesKits(String sAccionBusqueda,String sTipoArchivoReporte,List<Kit> kitsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Kit> kitsRespaldo=null;
		
		classes=KitConstantesFunciones.getClassesRelationshipsOfKit(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.kitLogic.setDatosCliente(this.datosCliente);
		this.kitLogic.setDatosDeep(this.datosDeep);
		this.kitLogic.setIsConDeep(true);
		
		kitsRespaldo=this.kitLogic.getKits();
		
		this.kitLogic.setKits(kitsParaReportes);	
		this.kitLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		kitsParaReportes=this.kitLogic.getKits();
		this.kitLogic.setKits(kitsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"kit_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Kits");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderKit("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Kit kit : kitsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderKit("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			KitConstantesFunciones.generarExcelReporteDataKit("NORMAL",row,workbook,kit,cellStyleDataAux);
		
			
			


				//CompoKit
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CompoKitConstantesFunciones.SCLASSWEBTITULO))) {

				if(kit.getCompoKits()!=null && kit.getCompoKits().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CompoKitConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CompoKitConstantesFunciones.generarExcelReporteHeaderCompoKit("RELACIONADO",row,workbook);
				}

				if(kit.getCompoKits()!=null) {
					i2=0;
					for(CompoKit compokit : kit.getCompoKits()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CompoKitConstantesFunciones.generarExcelReporteDataCompoKit("RELACIONADO",row,workbook,compokit,cellStyleDataAuxHijo);
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
		cell.setCellValue(KitConstantesFunciones.getKitDescripcion(kit));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.kitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Kit",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoKit.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoKit.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoKit.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoKit.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessKit() throws Exception {		
		this.startProcessKit(true);
	}
	
	public void startProcessKit(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasKit ,this.jPanelParametrosReportesKit, this.jScrollPanelDatosKit,this.jPanelPaginacionKit, this.jScrollPanelDatosEdicionKit, this.jPanelAccionesKit,this.jPanelAccionesFormularioKit,this.jmenuBarKit,this.jmenuBarDetalleKit,this.jTtoolBarKit,this.jTtoolBarDetalleKit);		
		
		final JTabbedPane jTabbedPaneBusquedasKit=this.jTabbedPaneBusquedasKit; 
		
		final JPanel jPanelParametrosReportesKit=this.jPanelParametrosReportesKit;
		//final JScrollPane jScrollPanelDatosKit=this.jScrollPanelDatosKit;
		final JTable jTableDatosKit=this.jTableDatosKit;		
		final JPanel jPanelPaginacionKit=this.jPanelPaginacionKit;
		//final JScrollPane jScrollPanelDatosEdicionKit=this.jScrollPanelDatosEdicionKit;
		final JPanel jPanelAccionesKit=this.jPanelAccionesKit;
		
		JPanel jPanelCamposAuxiliarKit=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarKit=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormKit!=null) {
			jPanelCamposAuxiliarKit=this.jInternalFrameDetalleFormKit.jPanelCamposKit;
			jPanelAccionesFormularioAuxiliarKit=this.jInternalFrameDetalleFormKit.jPanelAccionesFormularioKit;
		}
		
		final JPanel jPanelCamposKit=jPanelCamposAuxiliarKit;
		final JPanel jPanelAccionesFormularioKit=jPanelAccionesFormularioAuxiliarKit;
		
		
		final JMenuBar jmenuBarKit=this.jmenuBarKit;
		final JToolBar jTtoolBarKit=this.jTtoolBarKit;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarKit=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarKit=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormKit!=null) {
			jmenuBarDetalleAuxiliarKit=this.jInternalFrameDetalleFormKit.jmenuBarDetalleKit;
			jTtoolBarDetalleAuxiliarKit=this.jInternalFrameDetalleFormKit.jTtoolBarDetalleKit;
		}
		
		final JMenuBar jmenuBarDetalleKit=jmenuBarDetalleAuxiliarKit;
		final JToolBar jTtoolBarDetalleKit=jTtoolBarDetalleAuxiliarKit;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasKit;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesKit;
			processRunnable.jTableDatos=jTableDatosKit;
			processRunnable.jPanelCampos=jPanelCamposKit;
			processRunnable.jPanelPaginacion=jPanelPaginacionKit;
			processRunnable.jPanelAcciones=jPanelAccionesKit;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioKit;
			
			
			processRunnable.jmenuBar=jmenuBarKit;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleKit;
			processRunnable.jTtoolBar=jTtoolBarKit;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleKit;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasKit ,jPanelParametrosReportesKit,jTableDatosKit, /*jScrollPanelDatosKit,*/jPanelCamposKit,jPanelPaginacionKit, /*jScrollPanelDatosEdicionKit,*/ jPanelAccionesKit,jPanelAccionesFormularioKit,jmenuBarKit,jmenuBarDetalleKit,jTtoolBarKit,jTtoolBarDetalleKit);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasKit ,jPanelParametrosReportesKit, jScrollPanelDatosKit,jPanelPaginacionKit, jScrollPanelDatosEdicionKit, jPanelAccionesKit,jPanelAccionesFormularioKit,jmenuBarKit,jmenuBarDetalleKit,jTtoolBarKit,jTtoolBarDetalleKit);
						
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
	
	public void finishProcessKit() {// throws Exception 
		this.finishProcessKit(true);
	}
	
	public void finishProcessKit(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasKit ,this.jPanelParametrosReportesKit, this.jScrollPanelDatosKit,this.jPanelPaginacionKit, this.jScrollPanelDatosEdicionKit, this.jPanelAccionesKit,this.jPanelAccionesFormularioKit,this.jmenuBarKit,this.jmenuBarDetalleKit,this.jTtoolBarKit,this.jTtoolBarDetalleKit);		
		
		final JTabbedPane jTabbedPaneBusquedasKit=this.jTabbedPaneBusquedasKit; 
		
		final JPanel jPanelParametrosReportesKit=this.jPanelParametrosReportesKit;
		//final JScrollPane jScrollPanelDatosKit=this.jScrollPanelDatosKit;
		final JTable jTableDatosKit=this.jTableDatosKit;		
		final JPanel jPanelPaginacionKit=this.jPanelPaginacionKit;
		//final JScrollPane jScrollPanelDatosEdicionKit=this.jScrollPanelDatosEdicionKit;
		final JPanel jPanelAccionesKit=this.jPanelAccionesKit;
		
		JPanel jPanelCamposAuxiliarKit=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarKit=new JPanel();
		
		if(this.jInternalFrameDetalleFormKit!=null) {
			jPanelCamposAuxiliarKit=this.jInternalFrameDetalleFormKit.jPanelCamposKit;
			jPanelAccionesFormularioAuxiliarKit=this.jInternalFrameDetalleFormKit.jPanelAccionesFormularioKit;
		}
		
		final JPanel jPanelCamposKit=jPanelCamposAuxiliarKit;
		final JPanel jPanelAccionesFormularioKit=jPanelAccionesFormularioAuxiliarKit;
		
		
		final JMenuBar jmenuBarKit=this.jmenuBarKit;		
		final JToolBar jTtoolBarKit=this.jTtoolBarKit;
				
		JMenuBar jmenuBarDetalleAuxiliarKit=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarKit=new JToolBar();
		
		if(this.jInternalFrameDetalleFormKit!=null) {
			jmenuBarDetalleAuxiliarKit=this.jInternalFrameDetalleFormKit.jmenuBarDetalleKit;
			jTtoolBarDetalleAuxiliarKit=this.jInternalFrameDetalleFormKit.jTtoolBarDetalleKit;		
		}
		
		final JMenuBar jmenuBarDetalleKit=jmenuBarDetalleAuxiliarKit;
		final JToolBar jTtoolBarDetalleKit=jTtoolBarDetalleAuxiliarKit;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasKit;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesKit;
			processRunnable.jTableDatos=jTableDatosKit;
			processRunnable.jPanelCampos=jPanelCamposKit;
			processRunnable.jPanelPaginacion=jPanelPaginacionKit;
			processRunnable.jPanelAcciones=jPanelAccionesKit;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioKit;
			
			
			processRunnable.jmenuBar=jmenuBarKit;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleKit;
			processRunnable.jTtoolBar=jTtoolBarKit;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleKit;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasKit ,jPanelParametrosReportesKit, jTableDatosKit,/*jScrollPanelDatosKit,*/jPanelCamposKit,jPanelPaginacionKit, /*jScrollPanelDatosEdicionKit,*/ jPanelAccionesKit,jPanelAccionesFormularioKit,jmenuBarKit,jmenuBarDetalleKit,jTtoolBarKit,jTtoolBarDetalleKit));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesKit(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarKit(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuKit(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarKit(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarKit,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleKit,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuKit(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarKit,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleKit,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.kitConstantesFunciones.getsFinalQueryKit();
		String  finalQueryPaginacionTodos=this.kitConstantesFunciones.getsFinalQueryKit();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=KitConstantesFunciones.getArrayColumnasGlobalesNoKit(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=KitConstantesFunciones.getArrayColumnasGlobalesKit(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,KitConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.kitsEliminados= new ArrayList<Kit>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessKit();
		
				///*KitSessionBean*/this.kitSessionBean=new KitSessionBean();
			
			if(this.kitSessionBean==null) {
				this.kitSessionBean=new KitSessionBean();
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
					this.iNumeroPaginacion=KitConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=KitConstantesFunciones.getClassesForeignKeysOfKit(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/kit."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			kitsAux= new ArrayList<Kit>();
			
				
			kitLogic.setDatosCliente(this.datosCliente);
			kitLogic.setDatosDeep(this.datosDeep);
			kitLogic.setIsConDeep(true);
			
			
			kitLogic.getKitDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					kitLogic.getTodosKits(finalQueryGlobal,pagination);
					
					//kitLogic.getTodosKitsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(kitLogic.getKits()==null|| kitLogic.getKits().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							kitsAux= new ArrayList<Kit>();
							kitsAux.addAll(kitLogic.getKits());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							kitsAux= new ArrayList<Kit>();
							kitsAux.addAll(kits);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							kitLogic.getTodosKits(finalQueryGlobal+"",this.pagination);												
							
							//kitLogic.getTodosKitsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteKits("Todos",kitLogic.getKits() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							kitLogic.setKits(new ArrayList<Kit>());					
							kitLogic.getKits().addAll(kitsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							kits=new ArrayList<Kit>();
							kits.addAll(kitsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idKit=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idKit=this.idActual;
				
				} else if(this.idKitActual!=null && this.idKitActual!=0L) {
					idKit=idKitActual;
				}
				
					
				this.sDetalleReporte=KitConstantesFunciones.getDetalleIndicePorId(idKit);
				
				this.kits=new ArrayList<Kit>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					kitLogic.getEntity(idKit);
					
					//kitLogic.getEntityWithConnection(idKit);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					kitLogic.setKits(new ArrayList<Kit>());
					kitLogic.getKits().add(kitLogic.getKit());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.kits=new ArrayList<Kit>();
					this.kits.add(kit);
				}
				
				if(kitLogic.getKit()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=KitConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					kitLogic.getKitsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=KitConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=KitConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=kitLogic.getKits()==null||kitLogic.getKits().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=kits==null|| kits.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						kitsAux=new ArrayList<Kit>();
						kitsAux.addAll(kitLogic.getKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							kitsAux=new ArrayList<Kit>();
							kitsAux.addAll(kits);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							kitLogic.getKitsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=KitConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=KitConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteKits("FK_IdEmpresa",kitLogic.getKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteKits("FK_IdEmpresa",kits);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						kitLogic.setKits(new ArrayList<Kit>());
						kitLogic.getKits().addAll(kitsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							kits=new ArrayList<Kit>();
							kits.addAll(kitsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=KitConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					kitLogic.getKitsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=KitConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=KitConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=kitLogic.getKits()==null||kitLogic.getKits().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=kits==null|| kits.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						kitsAux=new ArrayList<Kit>();
						kitsAux.addAll(kitLogic.getKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							kitsAux=new ArrayList<Kit>();
							kitsAux.addAll(kits);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							kitLogic.getKitsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=KitConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=KitConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteKits("FK_IdSucursal",kitLogic.getKits());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteKits("FK_IdSucursal",kits);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						kitLogic.setKits(new ArrayList<Kit>());
						kitLogic.getKits().addAll(kitsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							kits=new ArrayList<Kit>();
							kits.addAll(kitsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesKit();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessKit();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=kitLogic.getKits().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=kits.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=kitLogic.getKits().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=kits.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Kit kit) {
		Boolean permite=true;
		
		if(this.kit.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=KitConstantesFunciones.getOrderByListaKit();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=KitConstantesFunciones.getOrderByListaKit();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Kit kit:kitLogic.getKits()) {
				if(kit.getsType().equals(Constantes2.S_TOTALES)) {
					kitTotales=kit;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Kit kit:this.kits) {
				if(kit.getsType().equals(Constantes2.S_TOTALES)) {
					kitTotales=kit;
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
			this.kitAux=new Kit();
			this.kitAux.setsType(Constantes2.S_TOTALES);
			this.kitAux.setIsNew(false);
			this.kitAux.setIsChanged(false);
			this.kitAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				KitConstantesFunciones.TotalizarValoresFilaKit(this.kitLogic.getKits(),this.kitAux);
				
				this.kitLogic.getKits().add(this.kitAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				KitConstantesFunciones.TotalizarValoresFilaKit(this.kits,this.kitAux);
				
				this.kits.add(this.kitAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		kitTotales=new Kit();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.kitLogic.getKits().remove(kitTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.kits.remove(kitTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		kitTotales=new Kit();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Kit kit:kitLogic.getKits()) {
				if(kit.getsType().equals(Constantes2.S_TOTALES)) {
					kitTotales=kit;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				KitConstantesFunciones.TotalizarValoresFilaKit(this.kitLogic.getKits(),kitTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Kit kit:this.kits) {
				if(kit.getsType().equals(Constantes2.S_TOTALES)) {
					kitTotales=kit;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				KitConstantesFunciones.TotalizarValoresFilaKit(this.kits,kitTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getKitsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getKitsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getKitsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					kitLogic.getKitsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getKitsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					kitLogic.getKitsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosKit() {
		this.isPermisoTodoKit=false;
		this.isPermisoNuevoKit=false;
		this.isPermisoActualizarKit=false;
		this.isPermisoActualizarOriginalKit=false;
		this.isPermisoEliminarKit=false;
		this.isPermisoGuardarCambiosKit=false;
		this.isPermisoConsultaKit=false;
		this.isPermisoBusquedaKit=false;
		this.isPermisoReporteKit=false;		
		this.isPermisoOrdenKit=false;		
		this.isPermisoPaginacionMedioKit=false;		
		this.isPermisoPaginacionAltoKit=false;
		this.isPermisoPaginacionTodoKit=false;
		this.isPermisoCopiarKit=false;		
		this.isPermisoVerFormKit=false;		
		this.isPermisoDuplicarKit=false;		
		this.isPermisoOrdenKit=false;		
	}
	
	public void setPermisosUsuarioKit(Boolean isPermiso) {
		this.isPermisoTodoKit=isPermiso;
		this.isPermisoNuevoKit=isPermiso;
		this.isPermisoActualizarKit=isPermiso;
		this.isPermisoActualizarOriginalKit=isPermiso;
		this.isPermisoEliminarKit=isPermiso;
		this.isPermisoGuardarCambiosKit=isPermiso;
		this.isPermisoConsultaKit=isPermiso;
		this.isPermisoBusquedaKit=isPermiso;
		this.isPermisoReporteKit=isPermiso;
		this.isPermisoOrdenKit=isPermiso;		
		this.isPermisoPaginacionMedioKit=isPermiso;		
		this.isPermisoPaginacionAltoKit=isPermiso;		
		this.isPermisoPaginacionTodoKit=isPermiso;		
		this.isPermisoCopiarKit=isPermiso;		
		this.isPermisoVerFormKit=isPermiso;		
		this.isPermisoDuplicarKit=isPermiso;
		this.isPermisoOrdenKit=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioKit(Boolean isPermiso) {
		//this.isPermisoTodoKit=isPermiso;
		this.isPermisoNuevoKit=isPermiso;
		this.isPermisoActualizarKit=isPermiso;
		this.isPermisoActualizarOriginalKit=isPermiso;
		this.isPermisoEliminarKit=isPermiso;
		this.isPermisoGuardarCambiosKit=isPermiso;
		//this.isPermisoConsultaKit=isPermiso;
		//this.isPermisoBusquedaKit=isPermiso;
		//this.isPermisoReporteKit=isPermiso;
		//this.isPermisoOrdenKit=isPermiso;		
		//this.isPermisoPaginacionMedioKit=isPermiso;		
		//this.isPermisoPaginacionAltoKit=isPermiso;		
		//this.isPermisoPaginacionTodoKit=isPermiso;		
		//this.isPermisoCopiarKit=isPermiso;		
		//this.isPermisoDuplicarKit=isPermiso;
		//this.isPermisoOrdenKit=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioKitClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CompoKitConstantesFunciones.SNOMBREOPCION);
		
		if(KitJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCompoKit=false;
		this.isTienePermisosCompoKit=this.verificarGetPermisosUsuarioOpcionKitClaseRelacionada(this.opcionsRelacionadas,CompoKitConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebKit(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioKitClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCompoKit=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioKitClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionKitClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioKitClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCompoKit && this.jInternalFrameDetalleFormKit!=null && this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormKit.jTabbedPaneRelacionesKit.remove(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioKit() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(KitJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.kitSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, KitConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoKit=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarKit=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalKit=this.isPermisoActualizarKit;
			this.isPermisoEliminarKit=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosKit=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaKit=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaKit=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoKit=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteKit=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenKit=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioKit=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoKit=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoKit=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarKit=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormKit=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarKit=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenKit=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.kitSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosKit.setToolTipText(this.jTableDatosKit.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioKit(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioKit(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(KitJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(KitJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioKit() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCompoKit && this.kitConstantesFunciones.mostrarCompoKitKit && !KitConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Compo Kit");
			reporte.setsDescripcion("Compo Kit");
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
	public void inicializarCombosForeignKeyKitListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyKitListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(KitJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyKitListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyKitListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			KitParameterReturnGeneral kitReturnGeneral=new KitParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.kitConstantesFunciones.cargarid_empresaKit)
					 || (this.esRecargarFks && this.kitConstantesFunciones.cargarid_empresaKit)) {

					if(!this.kitSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+kitSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.kitConstantesFunciones.cargarid_sucursalKit)
					 || (this.esRecargarFks && this.kitConstantesFunciones.cargarid_sucursalKit)) {

					if(!this.kitSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+kitSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				kitReturnGeneral=kitLogic.cargarCombosLoteForeignKeyKit(finalQueryGlobalEmpresa,finalQueryGlobalSucursal);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=kitReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=kitReturnGeneral.getsucursalsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyKit()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.kitSessionBean==null) {
				this.kitSessionBean=new KitSessionBean();
			}

			if(!this.kitSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.kitSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyKit()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyKit(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyKit()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyKit();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyKit(Kit kit)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyKit(Kit kit,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyKit()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyKit()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyKit()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyKit()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroKit()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyKit()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyKit(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyKit()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit!=null && this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit.getItemCount()>0) {
				this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit!=null && this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit.getItemCount()>0) {
				this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public KitBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public KitBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public KitBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.kitSessionBean=new KitSessionBean(); 
		this.kitConstantesFunciones=new KitConstantesFunciones(); 
		this.kitBean=new Kit();//(this.kitConstantesFunciones); 		
		this.kitReturnGeneral=new KitParameterReturnGeneral(); 
		
		this.kitSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.kitSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public KitBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public KitBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public KitBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessKit(true);
			
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
			
			this.kitConstantesFunciones=new KitConstantesFunciones(); 
			this.kitBean=new Kit();//this.kitConstantesFunciones); 			
			this.kitReturnGeneral=new KitParameterReturnGeneral(); 
		
			KitBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Kit Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.kit=new Kit();
			this.kits = new ArrayList<Kit>();
			this.kitsAux = new ArrayList<Kit>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic=new KitLogic();
				this.kitLogic.getNewConnexionToDeep("");
			}
			
			//this.kitSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.kitSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormKit);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoKit!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoKit);	
					}
					
					if(this.jInternalFrameImportacionKit!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionKit);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByKit!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByKit);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormKit!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormKit);
				this.jInternalFrameDetalleFormKit.setVisible(false);
				this.jInternalFrameDetalleFormKit.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoKit!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoKit);
					this.jInternalFrameReporteDinamicoKit.setVisible(false);
					this.jInternalFrameReporteDinamicoKit.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionKit!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionKit);
					this.jInternalFrameImportacionKit.setVisible(false);
					this.jInternalFrameImportacionKit.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByKit!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByKit);
					this.jInternalFrameOrderByKit.setVisible(false);
					this.jInternalFrameOrderByKit.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idKitActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=KitConstantesFunciones.INUMEROPAGINACION;
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
			
			this.kitReturnGeneral=new KitParameterReturnGeneral();
			
			this.kitParameterGeneral=new KitParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.kitLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.kitSessionBean.getEsGuardarRelacionado()) {
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
			
			if(KitJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.kitSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CompoKitConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,KitConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.kitSessionBean.getEsGuardarRelacionado(),this.kitSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,KitConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.kitSessionBean.getEsGuardarRelacionado(),this.kitSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoKit=false;
			this.isVisibilidadCeldaDuplicarKit=true;
			this.isVisibilidadCeldaCopiarKit=true;
			this.isVisibilidadCeldaVerFormKit=true;
			this.isVisibilidadCeldaOrdenKit=true;
			this.isVisibilidadCeldaNuevoRelacionesKit=false;
			this.isVisibilidadCeldaModificarKit=false;
			this.isVisibilidadCeldaActualizarKit=false;
			this.isVisibilidadCeldaEliminarKit=false;
			this.isVisibilidadCeldaCancelarKit=false;
			this.isVisibilidadCeldaGuardarKit=false;
			this.isVisibilidadCeldaGuardarCambiosKit=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesKit("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosKit();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioKit(false);
			
			this.setPermisosUsuarioKit();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.kitSessionBean.getEsGuardarRelacionado() 
				|| (this.kitSessionBean.getEsGuardarRelacionado() && this.kitSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioKitClasesRelacionadas();
			}
			
			if(this.kitSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioKitClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!KitJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosKit();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualKit();
			}
			
			if(!this.isPermisoBusquedaKit) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasKit.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.kitSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioKit,this.isPermisoPaginacionMedioKit,this.isPermisoPaginacionTodoKit);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(KitConstantesFunciones.getTiposSeleccionarKit());
				
				this.tiposColumnasSelect=KitConstantesFunciones.getTiposSeleccionarKit(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectKit();				
				//this.tiposRelacionesSelect=KitConstantesFunciones.getTiposRelacionesKit(true);
				
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
			//if(!this.kitSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioKit();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioKit(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioKit(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesKit() ;
			
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
			
			
			this.compokitLogic=new CompoKitLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				kitImplementable= (KitImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+KitConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				kitImplementableHome= (KitImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+KitConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.kits= new ArrayList<Kit>();
			this.kitsEliminados= new ArrayList<Kit>();
						
			this.isEsNuevoKit=false;
			this.esParaAccionDesdeFormularioKit=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyKit(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroKit();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.kitSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			KitBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=KitConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesKit("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingKit(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormKit!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioKit();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioKit();
			}
			
			KitBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasKit.getTabCount(); i++) {
					this.jTabbedPaneBusquedasKit.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasKit.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessKit(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Kit: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectKit() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CompoKitConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CompoKitConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesKit")) {
				iIndex=this.jInternalFrameDetalleFormKit.jTabbedPaneRelacionesKit.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormKit.jTabbedPaneRelacionesKit.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosKit.getSelectedRow();	
				
				

				if(sTitle.equals("Compo Kites")) {
					if(!CompoKitJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessKit();

						this.cargarParteTabPanelRelacionadaCompoKit(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessKit();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCompoKit(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormKit.cargarSessionConBeanSwingJInternalFrameCompoKit(false,true,iIndex);
		this.jButtonCompoKitActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCompoKit();

		//this.jTabbedPaneRelacionesKit.updateUI();
		//this.jTabbedPaneRelacionesKit.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesKit.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("CompoKit")) {
				int row=this.jTableDatosKit.getSelectedRow();
				jButtonCompoKitActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.kitSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Compo Kit")) {

					if(this.isTienePermisosCompoKit && this.kitConstantesFunciones.mostrarCompoKitKit && !KitConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Compo Kites"+"("+CompoKitConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Compo Kites");

						if(kitConstantesFunciones.resaltarCompoKitKit!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(kitConstantesFunciones.resaltarCompoKitKit);
						}

						jmenuItem.setEnabled(this.kitConstantesFunciones.activarCompoKitKit);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CompoKit"));

						

						this.jInternalFrameDetalleFormKit.jmenuDetalleKit.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyKit(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyKit(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyKit(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyKitListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyKit();
		
		this.cargarCombosFrameForeignKeyKit();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyKit();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyKit();
		}
	}
	
	
	
	public void jButtonNuevoKitActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.kitSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormKit==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			
			
			if(jTableDatosKit.getRowCount()>=1) {
				jTableDatosKit.removeRowSelectionInterval(0, jTableDatosKit.getRowCount()-1);						
			}
			
			this.isEsNuevoKit=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoKit(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesKit(true);			
			//this.kit=new Kit();
			//this.kit.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesKit(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualKit() ;
			
			if(KitJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleKit(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.kit);	
			this.actualizarInformacion("INFO_PADRE",false,this.kit);				
			
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			
			if(this.kitSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Kit: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarKitActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Kit> kitsSeleccionados=new ArrayList<Kit>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosKit.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosKit.getSelectedRows().length;			
			}
			
			kitsSeleccionados=this.getKitsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoKit--;			
				//Kit kitAux= new Kit();			
				//kitAux.setId(this.iIdNuevoKit);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Kit kitOrigen=new Kit();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Kit kitOrigen : kitsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosKit.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							kitOrigen =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							kitOrigen =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaKit();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.kit.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosKit(kitOrigen,this.kit,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.kitLogic.getKits().add(this.kitAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.kits.add(this.kitAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaKit(false);
				
				this.jTableDatosKit.setRowSelectionInterval(this.getIndiceNuevoKit(), this.getIndiceNuevoKit());
				
				int iLastRow =  this.jTableDatosKit.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosKit.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosKit.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaKit(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Kit> kitsSeleccionados=new ArrayList<Kit>();									
		
			Kit kitOrigen=new Kit();
			Kit kitDestino=new Kit();
				
			kitsSeleccionados=this.getKitsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosKit.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || kitsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosKit.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						kitOrigen =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						kitOrigen =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						kitDestino =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						kitDestino =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				kitOrigen =kitsSeleccionados.get(0);
				kitDestino =kitsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosKit(kitOrigen,kitDestino,true,false);
				
				kitDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(kitDestino,kitLogic.getKits());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(kitDestino,kits);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaKit(false);
				
				//this.jTableDatosKit.setRowSelectionInterval(this.getIndiceNuevoKit(), this.getIndiceNuevoKit());
				
				int iLastRow =  this.jTableDatosKit.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosKit.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosKit.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaKit(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormKit==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormKit.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesKit.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasKit.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesKit.setVisible(!isVisible);
			this.jPanelPaginacionKit.setVisible(!isVisible);
			this.jPanelAccionesKit.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameKit();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoKit();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionKit();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByKit();
			
			this.abrirFrameOrderByKit();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByKit();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleKit(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormKit);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormKit.isMaximum()) {
					this.jInternalFrameDetalleFormKit.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormKit.setSize(this.jInternalFrameDetalleFormKit.iWidthFormulario,this.jInternalFrameDetalleFormKit.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormKit.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormKit.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormKit.isMaximum()) {
						this.jInternalFrameDetalleFormKit.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormKit.jContentPaneDetalleKit.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormKit.jTabbedPaneRelacionesKit.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormKit.jContentPaneDetalleKit.getWidth(),KitConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormKit.jTabbedPaneRelacionesKit.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormKit.jContentPaneDetalleKit.getWidth(),KitConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormKit.jTabbedPaneRelacionesKit.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormKit.jContentPaneDetalleKit.getWidth(),KitConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CompoKitJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCompoKit();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormKit.setVisible(true);
	        this.jInternalFrameDetalleFormKit.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByKit() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByKit==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByKit=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByKit,false,this);
				} else {
					this.jInternalFrameOrderByKit=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByKit,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByKit);
				this.jInternalFrameOrderByKit.setVisible(false);
				this.jInternalFrameOrderByKit.setSelected(false);
				
				this.jInternalFrameOrderByKit.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByKit"));
				
				this.inicializarActualizarBindingTablaOrderByKit();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionKit() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionKit==null) {
				
				this.jInternalFrameImportacionKit=new ImportacionJInternalFrame(KitConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionKit);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionKit);
				this.jInternalFrameImportacionKit.setVisible(false);
				this.jInternalFrameImportacionKit.setSelected(false);


				this.jInternalFrameImportacionKit.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionKit"));
				this.jInternalFrameImportacionKit.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionKit"));
				this.jInternalFrameImportacionKit.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionKit"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoKit() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoKit==null) {
				this.jInternalFrameReporteDinamicoKit=new ReporteDinamicoJInternalFrame(KitConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoKit);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoKit);
				this.jInternalFrameReporteDinamicoKit.setVisible(false);
				this.jInternalFrameReporteDinamicoKit.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoKit.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoKit"));
				this.jInternalFrameReporteDinamicoKit.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoKit"));
				this.jInternalFrameReporteDinamicoKit.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoKit"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualKit();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCompoKit() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.jScrollPanelDatosCompoKit.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormKit.jContentPaneDetalleKit.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.jScrollPanelDatosCompoKit.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.jScrollPanelDatosCompoKit.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.jScrollPanelDatosCompoKit.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleKit() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormKit);
			
	       	this.jInternalFrameDetalleFormKit.setVisible(false);
	        this.jInternalFrameDetalleFormKit.setSelected(false);
			
			//this.jInternalFrameDetalleFormKit.dispose();
			//this.jInternalFrameDetalleFormKit=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoKit() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoKit.setVisible(true);
	        this.jInternalFrameReporteDinamicoKit.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionKit() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionKit.setVisible(true);
	        this.jInternalFrameImportacionKit.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByKit() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByKit.setVisible(true);
	        this.jInternalFrameOrderByKit.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByKit() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByKit.setVisible(false);
	        this.jInternalFrameOrderByKit.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoKit() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoKit.setVisible(false);
	        this.jInternalFrameReporteDinamicoKit.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionKit() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionKit.setVisible(false);
	        this.jInternalFrameImportacionKit.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarKitActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarKit(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarKit(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosKit.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesKit(true);
			//this.isEsNuevoKit=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesKit("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesKit(false) ;
			
			if(kitSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitSessionBean.getEsGuardarRelacionado() && CompoKitJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCompoKitActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(KitJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleKit(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualKit(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaKitActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosKit.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarKit(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormKit==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosKit.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesKit(true);
			//this.isEsNuevoKit=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.kit.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesKit("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesKit(false) ;
			
			if(KitJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleKit(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualKit(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarKitActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesKit(false);
			
			//if(!this.isEsNuevoKit) {								
				int intSelectedRow = this.jTableDatosKit.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(KitJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualKit(this.kit,true);
				this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);
				
			}
			
			if(this.permiteMantenimiento(this.kit)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.kitSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoKit=true;
					this.inicializarActualizarBindingTablaKit(false);
					this.isEsNuevoKit=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoKit=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoKit=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesKit(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualKit(false);
				
				this.habilitarDeshabilitarControlesKit(false);
			
												
				
				if(KitJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleKit();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoKitActionPerformed(evt,kitSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualKit(this.kit,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosKit.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,kitSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.kit.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Kit.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Kit.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarKitActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosKit.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				this.kit.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				this.kit.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.kit)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.kitSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((KitModel) this.jTableDatosKit.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoKit=true;
				this.inicializarActualizarBindingTablaKit(false);
				this.isEsNuevoKit=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesKit(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualKit(false);
				
				this.habilitarDeshabilitarControlesKit(false);
				
				
				
				if(KitJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleKit();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarKitActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosKit.getRowCount()>=1) {
				jTableDatosKit.removeRowSelectionInterval(0, jTableDatosKit.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesKit(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaKit(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesKit(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualKit(false) ;
			
			this.isEsNuevoKit=false;
			
			if(KitJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleKit();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosKitActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingKit(false);
				
				//SI ES MANUAL
				if(KitJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualKit();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosKitActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoKit--;			
			//Kit kitAux= new Kit();			
			//kitAux.setId(this.iIdNuevoKit);
			
			if(this.jInternalFrameDetalleFormKit==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaKit();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);
			
			this.kit.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.kitLogic.getKits().add(this.kitAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.kits.add(this.kitAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaKit(false);
			
			this.jTableDatosKit.setRowSelectionInterval(this.getIndiceNuevoKit(), this.getIndiceNuevoKit());
			
			int iLastRow =  this.jTableDatosKit.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosKit.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosKit.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaKit(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionKitActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingKit(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingKit(false);
			
			//SI ES MANUAL
			if(KitJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualKit();
			}
			
			//this.abrirFrameTreeKit();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionKitActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE KitES ?", "MANTENIMIENTO DE Kit", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionKit.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralKit();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.kitReturnGeneral=kitLogic.procesarImportacionKitsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.kitParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarKitReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionKitActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionKit.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionKit.setFileImportacion(this.jInternalFrameImportacionKit.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionKit.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionKit.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionKit.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionKit.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoKitActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Kit> kitsSeleccionados=new ArrayList<Kit>();		

		kitsSeleccionados=this.getKitsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoKit.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoKit.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("KitBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"KitBaseDesign.jrxml";
			
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
			
			this.generarReporteKits("Todos",kitsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.kitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Kit",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoKit.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoKit.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case KitConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case KitConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case KitConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoKit.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoKit.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoKit.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case KitConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case KitConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case KitConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoKit.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case KitConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case KitConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case KitConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoKit.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoKit.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case KitConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case KitConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case KitConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoKitActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Kit> kitsSeleccionados=new ArrayList<Kit>();		
		
		kitsSeleccionados=this.getKitsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"kit";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Kits");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoKit.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoKit.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case KitConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(KitConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Kit kit:kitsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(kit.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case KitConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(KitConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Kit kit:kitsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(kit.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case KitConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(KitConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Kit kit:kitsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(kit.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelKit(row);				
			//	iRow++;
			//}				
			
			//for(Kit kitAux:kitsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelKit(kitAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.kitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Kit",JOptionPane.INFORMATION_MESSAGE);
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
				this.kitLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingKit(false);
			
			//SI ES MANUAL
			if(KitJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualKit();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresKitActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingKit(false);
			
			//SI ES MANUAL
			if(KitJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualKit();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesKitActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingKit(false);
			
			//SI ES MANUAL
			if(KitJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualKit();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaKit() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosKit.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosKit.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosKit.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosKit.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosKit.setMinimumSize(dimensionMinimum);
		this.jTableDatosKit.setMaximumSize(dimensionMaximum);
		this.jTableDatosKit.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingKit(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingKit(esInicializar,true);
	}
	
	public void inicializarActualizarBindingKit(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaKit(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesKit(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.kitSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasKit(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesKit(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesKit(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !KitJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!KitJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualKit() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaKit();
		
		this.inicializarActualizarBindingBotonesManualKit(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.kitSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualKit();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesKit() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualKit(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualKit(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosKit.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosKit.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteKit.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormKit!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormKit.jCheckBoxPostAccionNuevoKit.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormKit.jCheckBoxPostAccionSinCerrarKit.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormKit.jCheckBoxPostAccionSinMensajeKit.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosKit.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosKit.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteKit.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormKit!=null) {
				this.jInternalFrameDetalleFormKit.jCheckBoxPostAccionNuevoKit.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormKit.jCheckBoxPostAccionSinCerrarKit.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormKit.jCheckBoxPostAccionSinMensajeKit.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionKit.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionKit.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormKit!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesKit.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoKit!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoKit.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesKit.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesKit.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarKit.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesKit.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoKit!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoKit.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesKit.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralKit.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesKit(Boolean esInicializar) throws Exception {
		try	{	
			if(KitJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualKit(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesKit() throws Exception {
		try	{
			if(KitJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualKit();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleKit() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualKit() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesKit.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesKit.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesKit.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesKit.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesKit.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesKit.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionKit.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionKit.addItem(reporte);
			}
			
			
			if(!this.kitSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionKit.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionKit.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesKit.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesKit.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesKit.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesKit.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarKit.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarKit.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarKit.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualKit();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualKit() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoKit!=null) {
				this.jInternalFrameReporteDinamicoKit.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoKit.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoKit!=null) {
				this.jInternalFrameReporteDinamicoKit.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoKit.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoKit!=null) {
				
				if(this.jInternalFrameReporteDinamicoKit.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoKit.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoKit.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoKit.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoKit.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoKit.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualKit()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasKit(Boolean esInicializar) throws Exception {				
		if(KitJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualKit();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaKit() throws Exception {
		this.inicializarActualizarBindingTablaKit(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByKit() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByKit.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByKit.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByKit.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new KitPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByKit.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByKit.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new KitPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosKitOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosKitOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new KitPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByKit.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByKit.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new KitPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByKit.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaKit(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=kitLogic.getKits().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=kits.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(KitJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosKit.setModel(new KitModel(this.kitLogic.getKits(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosKit.setModel(new KitModel(this.kits,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByKit!=null && this.jInternalFrameOrderByKit.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByKit();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosKit,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new KitPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+KitConstantesFunciones.SCLASSWEBTITULO,kitConstantesFunciones.resaltarSeleccionarKit,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+KitConstantesFunciones.SCLASSWEBTITULO,kitConstantesFunciones.resaltarSeleccionarKit,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosKit,KitConstantesFunciones.LABEL_ID));

		if(this.kitConstantesFunciones.mostraridKit && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,KitConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.kitConstantesFunciones.resaltaridKit,this.kitConstantesFunciones.activaridKit,this,true,"idKit","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.kitConstantesFunciones.resaltaridKit,this.kitConstantesFunciones.activaridKit,this,true,"idKit","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosKit,KitConstantesFunciones.LABEL_IDEMPRESA));

		if(this.kitConstantesFunciones.mostrarid_empresaKit && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,KitConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.kitConstantesFunciones.resaltarid_empresaKit,this,this.kitConstantesFunciones.activarid_empresaKit));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.kitConstantesFunciones.resaltarid_empresaKit,this,this.kitConstantesFunciones.activarid_empresaKit,false,"id_empresaKit","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new KitPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosKit,KitConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.kitConstantesFunciones.mostrarid_sucursalKit && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,KitConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.kitConstantesFunciones.resaltarid_sucursalKit,this,this.kitConstantesFunciones.activarid_sucursalKit));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.kitConstantesFunciones.resaltarid_sucursalKit,this,this.kitConstantesFunciones.activarid_sucursalKit,false,"id_sucursalKit","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new KitPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosKit,KitConstantesFunciones.LABEL_DESCRIPCION));

		if(this.kitConstantesFunciones.mostrardescripcionKit && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,KitConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.kitConstantesFunciones.resaltardescripcionKit,this.kitConstantesFunciones.activardescripcionKit,this,true,"descripcionKit","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.kitConstantesFunciones.resaltardescripcionKit,this.kitConstantesFunciones.activardescripcionKit,this,true,"descripcionKit","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new KitPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.kitSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCompoKit && this.kitConstantesFunciones.mostrarCompoKitKit && !KitConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Compo Kites");
				tableColumn.setHeaderValue("Compo Kites");
				tableColumn.setCellRenderer(new CompoKitTableCell(kitConstantesFunciones.resaltarCompoKitKit,this,this.kitConstantesFunciones.activarCompoKitKit));
				tableColumn.setCellEditor(new CompoKitTableCell(kitConstantesFunciones.resaltarCompoKitKit,this,this.kitConstantesFunciones.activarCompoKitKit));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosKit.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.kitSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.kitSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosKit.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.kitSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.kitSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosKit.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarKit && this.isPermisoGuardarCambiosKit) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.kitSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.kitSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosKit.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.kitSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosKit.addColumn(tableColumn);
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
			
			this.jTableDatosKit.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarKit && this.isPermisoGuardarCambiosKit) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.kitSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarKit && this.isPermisoGuardarCambiosKit) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosKit.moveColumn(this.jTableDatosKit.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosKit.moveColumn(this.jTableDatosKit.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.kitSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosKit.moveColumn(this.jTableDatosKit.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosKit.moveColumn(this.jTableDatosKit.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosKit.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosKit.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosKit,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!KitJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosKit.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosKit.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!KitJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!KitJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosKit.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosKit.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosKit.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=kitLogic.getKits().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=kits.size()-1;
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
		//this.jTableDatosKit.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosKit.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosKit();
			
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
				
				//this.isEsNuevoKit=false;
					
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			
				if(this.kitSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormKit==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosKit.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosKit.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.kit.getsType().equals("DUPLICADO")
				   || this.kit.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoKit=true;
				
				} else {
					this.isEsNuevoKit=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.kitSessionBean.getEsGuardarRelacionado()) {
					if(this.kit.getId()>=0 && !this.kit.getIsNew()) {						
						this.isEsNuevoKit=false;
						
					} else {
						this.isEsNuevoKit=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoKit(esRelaciones);						
				
				this.seleccionarKit(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.kit.getId()<0) {
					this.isEsNuevoKit=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarKit(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarKit(evt,rowIndex);
				}	
				
				if(this.kitSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Kit: " + this.dDif); 
					}
				}								
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarKit(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.kit)) {
					if(this.kit.getId()>0) {
						this.kit.setIsDeleted(true);
						
						this.kitsEliminados.add(this.kit);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.kitLogic.getKits().remove(this.kit);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.kits.remove(this.kit);				
					}
					
					
					((KitModel) this.jTableDatosKit.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaKit(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarKit(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoKit) {
			
			if(this.jInternalFrameDetalleFormKit==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosKit.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosKit.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(KitJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioKit(this.kit);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.kitConstantesFunciones.cargarid_empresaKit || this.kitConstantesFunciones.event_dependid_empresaKit) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.kit.getid_empresa());
									//this.inicializarActualizarBindingKit(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(kit.getEmpresa()!=null) {
							this.empresasForeignKey.add(kit.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.kit.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.kitConstantesFunciones.cargarid_sucursalKit || this.kitConstantesFunciones.event_dependid_sucursalKit) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.kit.getid_sucursal());
									//this.inicializarActualizarBindingKit(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(kit.getSucursal()!=null) {
							this.sucursalsForeignKey.add(kit.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.kit.getid_sucursal(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesKit("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesKit(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualKit() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoKit(Kit kit) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoKit(kit,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoKit(Kit kit,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioKit(kit);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyKit(kit,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyKit(kit);
	}
	
	public void setVariablesObjetoActualToFormularioKit(Kit kit) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormKit==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormKit.jLabelidKit.setText(kit.getId().toString());
			this.jInternalFrameDetalleFormKit.jTextAreadescripcionKit.setText(kit.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Kit kitLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,kitLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Kit kitLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				kitLocal=this.kit;
			} else {
				kitLocal=this.kitAnterior;
			}
		}
		
		if(this.permiteMantenimiento(kitLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoKit(kitLocal,true);
					
					if(kitSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(kitLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.kitSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(kitLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoKit(Kit kit,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualKit(kit,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysKit(kit);
	}
	
	public void setVariablesFormularioToObjetoActualKit(Kit kit,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualKit(kit,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualKit(Kit kit,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormKit==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormKit.jLabelidKit.getText()==null || this.jInternalFrameDetalleFormKit.jLabelidKit.getText()=="" || this.jInternalFrameDetalleFormKit.jLabelidKit.getText()=="Id") {
				this.jInternalFrameDetalleFormKit.jLabelidKit.setText("0");
			}

			if(conColumnasBase) {kit.setId(Long.parseLong(this.jInternalFrameDetalleFormKit.jLabelidKit.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+KitConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormKit.jLabelIdKit,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			kit.setdescripcion(this.jInternalFrameDetalleFormKit.jTextAreadescripcionKit.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+KitConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormKit.jLabeldescripcionKit,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualKit(Kit kitBean,Kit kit,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosKit(Kit kitOrigen,Kit kit,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && kitOrigen.getId()!=null && !kitOrigen.getId().equals(0L))) {kit.setId(kitOrigen.getId());}}
			if(conDefault || (!conDefault && kitOrigen.getdescripcion()!=null && !kitOrigen.getdescripcion().equals(""))) {kit.setdescripcion(kitOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioKit(Kit kit) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormKit.jLabelidKit.setText(kit.getId().toString());
			this.jInternalFrameDetalleFormKit.jTextAreadescripcionKit.setText(kit.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioKit(KitBean kitBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormKit.jLabelidKit.setText(kitBean.getId().toString());
			this.jInternalFrameDetalleFormKit.jTextAreadescripcionKit.setText(kitBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanKit(KitParameterReturnGeneral kitReturnGeneral,KitBean kitBean,Boolean conDefault) throws Exception { 
		try {
			Kit kitLocal=new Kit();
			
			kitLocal=kitReturnGeneral.getKit();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && kitLocal.getId()!=null && !kitLocal.getId().equals(0L))) {kitBean.setId(kitLocal.getId());}}
			if(conDefault || (!conDefault && kitLocal.getdescripcion()!=null && !kitLocal.getdescripcion().equals(""))) {kitBean.setdescripcion(kitLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxKitGenerico(Long idKitSeleccionado,JComboBox jComboBoxKit,List<Kit> kitsLocal)throws Exception {
		try {
			Kit  kitTemp=null;

			for(Kit kitAux:kitsLocal) {
				if(kitAux.getId()!=null && kitAux.getId().equals(idKitSeleccionado)) {
					kitTemp=kitAux;
					break;
				}
			}

			jComboBoxKit.setSelectedItem(kitTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxKitGenerico(JComboBox jComboBoxKit,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxKit.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxKit.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxKit.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxKit.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxKit.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxKit.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("CompoKit")) {
			jButtonCompoKitActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			kit=(Kit) kitLogic.getKits().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			kit =(Kit) kits.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!kit.getIsNew() && !kit.getIsChanged() && !kit.getIsDeleted()) {
				sDescripcion=kit.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=kit.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!kit.getIsNew() && !kit.getIsChanged() && !kit.getIsDeleted()) {
				sDescripcion=kit.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=kit.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Kit kitRow=new Kit();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			kitRow=(Kit) kitLogic.getKits().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			kitRow=(Kit) kits.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCompoKitActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Kit kit) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormKit==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.kit = (Kit)this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.kit = (Kit)this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(kit!=null) {
						this.kit = kit;
					} else {
						this.kit = new Kit();
					}
				}

				if(this.isTienePermisosCompoKit && this.permiteMantenimiento(this.kit)) {
					CompoKitBeanSwingJInternalFrame compokitBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFramePopup=new CompoKitBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						compokitBeanSwingJInternalFrame=this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFramePopup;
					} else {
						compokitBeanSwingJInternalFrame=this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame;
					}

					List<Kit> kits=new ArrayList<Kit>();
					kits.add(this.kit);
					if(!esRelacionado) {
						//compokitBeanSwingJInternalFrame.compokitSessionBean.setConGuardarRelaciones(false);
						//compokitBeanSwingJInternalFrame.compokitSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					compokitBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormKit.cargarCompoKitBeanSwingJInternalFrame(kits,this.kit,compokitBeanSwingJInternalFrame,/*conInicializar,*/compokitBeanSwingJInternalFrame.compokitSessionBean.getConGuardarRelaciones(),compokitBeanSwingJInternalFrame.compokitSessionBean.getEsGuardarRelacionado());
					compokitBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						compokitBeanSwingJInternalFrame.actualizarEstadoPanelsCompoKit("no_relacionado");

						compokitBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CompoKitConstantesFunciones.ITAMANIOFILATABLA + (CompoKitConstantesFunciones.ITAMANIOFILATABLA/2));

						compokitBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderKit=(TitledBorder)this.jScrollPanelDatosKit.getBorder();
						TitledBorder titledBorderCompoKit=(TitledBorder)compokitBeanSwingJInternalFrame.jScrollPanelDatosCompoKit.getBorder();

						titledBorderCompoKit.setTitle(titledBorderKit.getTitle() + " -> Compo Kit");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,compokitBeanSwingJInternalFrame);
						}

						compokitBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(compokitBeanSwingJInternalFrame);

						compokitBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.kitSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Compo Kit",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualKit(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoKit.setVisible((this.isVisibilidadCeldaNuevoKit && this.isPermisoNuevoKit));			
			this.jButtonDuplicarKit.setVisible((this.isVisibilidadCeldaDuplicarKit && this.isPermisoDuplicarKit));			
			this.jButtonCopiarKit.setVisible((this.isVisibilidadCeldaCopiarKit && this.isPermisoCopiarKit));
			this.jButtonVerFormKit.setVisible((this.isVisibilidadCeldaVerFormKit && this.isPermisoVerFormKit));
			
			this.jButtonAbrirOrderByKit.setVisible((this.isVisibilidadCeldaOrdenKit && this.isPermisoOrdenKit));			
			
			this.jButtonNuevoRelacionesKit.setVisible((this.isVisibilidadCeldaNuevoRelacionesKit && this.isPermisoNuevoKit));			
			this.jButtonNuevoGuardarCambiosKit.setVisible((this.isVisibilidadCeldaNuevoKit && this.isPermisoNuevoKit && this.isPermisoGuardarCambiosKit));
			
			if(this.jInternalFrameDetalleFormKit!=null) {
			this.jInternalFrameDetalleFormKit.jButtonModificarKit.setVisible((this.isVisibilidadCeldaModificarKit && this.isPermisoActualizarKit));	
			this.jInternalFrameDetalleFormKit.jButtonActualizarKit.setVisible((this.isVisibilidadCeldaActualizarKit && this.isPermisoActualizarKit));	
			this.jInternalFrameDetalleFormKit.jButtonEliminarKit.setVisible((this.isVisibilidadCeldaEliminarKit && this.isPermisoEliminarKit));
			this.jInternalFrameDetalleFormKit.jButtonCancelarKit.setVisible(this.isVisibilidadCeldaCancelarKit);							
			this.jInternalFrameDetalleFormKit.jButtonGuardarCambiosKit.setVisible((this.isVisibilidadCeldaGuardarKit && this.isPermisoGuardarCambiosKit));			
			
			}
						
			this.jButtonGuardarCambiosTablaKit.setVisible((this.isVisibilidadCeldaGuardarCambiosKit && this.isPermisoGuardarCambiosKit));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarKit.setVisible((this.isVisibilidadCeldaNuevoKit && this.isPermisoNuevoKit));						
			this.jButtonDuplicarToolBarKit.setVisible((this.isVisibilidadCeldaDuplicarKit && this.isPermisoDuplicarKit));						
			this.jButtonCopiarToolBarKit.setVisible((this.isVisibilidadCeldaCopiarKit && this.isPermisoCopiarKit));			
			this.jButtonVerFormToolBarKit.setVisible((this.isVisibilidadCeldaVerFormKit && this.isPermisoVerFormKit));			
			this.jButtonAbrirOrderByToolBarKit.setVisible((this.isVisibilidadCeldaOrdenKit && this.isPermisoOrdenKit));
			this.jButtonNuevoRelacionesToolBarKit.setVisible((this.isVisibilidadCeldaNuevoRelacionesKit && this.isPermisoNuevoKit));			
			this.jButtonNuevoGuardarCambiosToolBarKit.setVisible((this.isVisibilidadCeldaNuevoKit && this.isPermisoNuevoKit && this.isPermisoGuardarCambiosKit));			
			
			if(this.jInternalFrameDetalleFormKit!=null) {
			this.jInternalFrameDetalleFormKit.jButtonModificarToolBarKit.setVisible((this.isVisibilidadCeldaModificarKit && this.isPermisoActualizarKit));	
			this.jInternalFrameDetalleFormKit.jButtonActualizarToolBarKit.setVisible((this.isVisibilidadCeldaActualizarKit  && this.isPermisoActualizarKit));	
			this.jInternalFrameDetalleFormKit.jButtonEliminarToolBarKit.setVisible((this.isVisibilidadCeldaEliminarKit && this.isPermisoEliminarKit));
			this.jInternalFrameDetalleFormKit.jButtonCancelarToolBarKit.setVisible(this.isVisibilidadCeldaCancelarKit);				
			this.jInternalFrameDetalleFormKit.jButtonGuardarCambiosToolBarKit.setVisible((this.isVisibilidadCeldaGuardarKit && this.isPermisoGuardarCambiosKit));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarKit.setVisible((this.isVisibilidadCeldaGuardarCambiosKit && this.isPermisoGuardarCambiosKit));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoKit.setVisible((this.isVisibilidadCeldaNuevoKit && this.isPermisoNuevoKit));			
			this.jMenuItemDuplicarKit.setVisible((this.isVisibilidadCeldaDuplicarKit && this.isPermisoDuplicarKit));			
			this.jMenuItemCopiarKit.setVisible((this.isVisibilidadCeldaCopiarKit && this.isPermisoCopiarKit));			
			this.jMenuItemVerFormKit.setVisible((this.isVisibilidadCeldaVerFormKit && this.isPermisoVerFormKit));			
			this.jMenuItemAbrirOrderByKit.setVisible((this.isVisibilidadCeldaOrdenKit && this.isPermisoOrdenKit));			
			//this.jMenuItemMostrarOcultarKit.setVisible((this.isVisibilidadCeldaOrdenKit && this.isPermisoOrdenKit));
			this.jMenuItemDetalleAbrirOrderByKit.setVisible((this.isVisibilidadCeldaOrdenKit && this.isPermisoOrdenKit));			
			//this.jMenuItemDetalleMostrarOcultarKit.setVisible((this.isVisibilidadCeldaOrdenKit && this.isPermisoOrdenKit));			
			this.jMenuItemNuevoRelacionesKit.setVisible((this.isVisibilidadCeldaNuevoRelacionesKit && this.isPermisoNuevoKit));			
			this.jMenuItemNuevoGuardarCambiosKit.setVisible((this.isVisibilidadCeldaNuevoKit && this.isPermisoNuevoKit && this.isPermisoGuardarCambiosKit));									
			
			if(this.jInternalFrameDetalleFormKit!=null) {
			this.jInternalFrameDetalleFormKit.jMenuItemModificarKit.setVisible((this.isVisibilidadCeldaModificarKit && this.isPermisoActualizarKit));	
			this.jInternalFrameDetalleFormKit.jMenuItemActualizarKit.setVisible((this.isVisibilidadCeldaActualizarKit && this.isPermisoActualizarKit));	
			this.jInternalFrameDetalleFormKit.jMenuItemEliminarKit.setVisible((this.isVisibilidadCeldaEliminarKit && this.isPermisoEliminarKit));
			this.jInternalFrameDetalleFormKit.jMenuItemCancelarKit.setVisible(this.isVisibilidadCeldaCancelarKit);				
			}
			
			this.jMenuItemGuardarCambiosKit.setVisible((this.isVisibilidadCeldaGuardarKit && this.isPermisoGuardarCambiosKit));						
			this.jMenuItemGuardarCambiosTablaKit.setVisible((this.isVisibilidadCeldaGuardarCambiosKit && this.isPermisoGuardarCambiosKit));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoKit=this.jButtonNuevoKit.isVisible();
			this.isVisibilidadCeldaDuplicarKit=this.jButtonDuplicarKit.isVisible();
			this.isVisibilidadCeldaCopiarKit=this.jButtonCopiarKit.isVisible();
			this.isVisibilidadCeldaVerFormKit=this.jButtonVerFormKit.isVisible();
			
			this.isVisibilidadCeldaOrdenKit=this.jButtonAbrirOrderByKit.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesKit=this.jButtonNuevoRelacionesKit.isVisible();
			this.isVisibilidadCeldaModificarKit=this.jButtonModificarKit.isVisible();
			
			if(this.jInternalFrameDetalleFormKit!=null) {
			this.isVisibilidadCeldaActualizarKit=this.jInternalFrameDetalleFormKit.jButtonActualizarKit.isVisible();
			this.isVisibilidadCeldaEliminarKit=this.jInternalFrameDetalleFormKit.jButtonEliminarKit.isVisible();
			this.isVisibilidadCeldaCancelarKit=this.jInternalFrameDetalleFormKit.jButtonCancelarKit.isVisible();
			this.isVisibilidadCeldaGuardarKit=this.jInternalFrameDetalleFormKit.jButtonGuardarCambiosKit.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosKit=this.jButtonGuardarCambiosTablaKit.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoKit=this.jButtonNuevoToolBarKit.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesKit=this.jButtonNuevoRelacionesToolBarKit.isVisible();
			
			if(this.jInternalFrameDetalleFormKit!=null) {
			this.isVisibilidadCeldaModificarKit=this.jInternalFrameDetalleFormKit.jButtonModificarToolBarKit.isVisible();
			this.isVisibilidadCeldaActualizarKit=this.jInternalFrameDetalleFormKit.jButtonActualizarToolBarKit.isVisible();
			this.isVisibilidadCeldaEliminarKit=this.jInternalFrameDetalleFormKit.jButtonEliminarToolBarKit.isVisible();
			this.isVisibilidadCeldaCancelarKit=this.jInternalFrameDetalleFormKit.jButtonCancelarToolBarKit.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarKit=this.jButtonGuardarCambiosToolBarKit.isVisible();
			this.isVisibilidadCeldaGuardarCambiosKit=this.jButtonGuardarCambiosTablaToolBarKit.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoKit=this.jMenuItemNuevoKit.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesKit=this.jMenuItemNuevoRelacionesKit.isVisible();
			
			if(this.jInternalFrameDetalleFormKit!=null) {
			this.isVisibilidadCeldaModificarKit=this.jInternalFrameDetalleFormKit.jMenuItemModificarKit.isVisible();
			this.isVisibilidadCeldaActualizarKit=this.jInternalFrameDetalleFormKit.jMenuItemActualizarKit.isVisible();
			this.isVisibilidadCeldaEliminarKit=this.jInternalFrameDetalleFormKit.jMenuItemEliminarKit.isVisible();
			this.isVisibilidadCeldaCancelarKit=this.jInternalFrameDetalleFormKit.jMenuItemCancelarKit.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarKit=this.jMenuItemGuardarCambiosKit.isVisible();
			this.isVisibilidadCeldaGuardarCambiosKit=this.jMenuItemGuardarCambiosTablaKit.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesKit(Boolean esInicializar) {
		if(KitJInternalFrame.ISBINDING_MANUAL) {			
			if(this.kitSessionBean.getConGuardarRelaciones()) {
				//if(this.kitSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesKit();
			}
			
			this.inicializarActualizarBindingBotonesManualKit(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualKit() {
		this.jButtonNuevoKit.setVisible(this.isPermisoNuevoKit);			
		this.jButtonDuplicarKit.setVisible(this.isPermisoDuplicarKit);			
		this.jButtonCopiarKit.setVisible(this.isPermisoCopiarKit);			
		this.jButtonVerFormKit.setVisible(this.isPermisoVerFormKit);			
		
		this.jButtonAbrirOrderByKit.setVisible(this.isPermisoOrdenKit);					
		
		this.jButtonNuevoRelacionesKit.setVisible(this.isPermisoNuevoKit);			
		
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormKit.jButtonModificarKit.setVisible(this.isPermisoActualizarKit);	
			this.jInternalFrameDetalleFormKit.jButtonActualizarKit.setVisible(this.isPermisoActualizarKit);	
			this.jInternalFrameDetalleFormKit.jButtonEliminarKit.setVisible(this.isPermisoEliminarKit);
			this.jInternalFrameDetalleFormKit.jButtonCancelarKit.setVisible(this.isVisibilidadCeldaCancelarKit);						
			this.jInternalFrameDetalleFormKit.jButtonGuardarCambiosKit.setVisible(this.isPermisoGuardarCambiosKit);							
		}
		
		this.jButtonGuardarCambiosTablaKit.setVisible(this.isPermisoActualizarKit);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleKit() {
		this.jInternalFrameDetalleFormKit.jButtonModificarKit.setVisible(this.isPermisoActualizarKit);	
		this.jInternalFrameDetalleFormKit.jButtonActualizarKit.setVisible(this.isPermisoActualizarKit);	
		this.jInternalFrameDetalleFormKit.jButtonEliminarKit.setVisible(this.isPermisoEliminarKit);
		this.jInternalFrameDetalleFormKit.jButtonCancelarKit.setVisible(this.isVisibilidadCeldaCancelarKit);							
		this.jInternalFrameDetalleFormKit.jButtonGuardarCambiosKit.setVisible((this.isVisibilidadCeldaGuardarKit && this.isPermisoGuardarCambiosKit));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosKit() {
		if(KitJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualKit();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesKit() {
	}
	
	public void jTableDatosKitListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarKit(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidKitBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosKit.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualKit(this.getkit(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.kit==null) {
						this.kit = new Kit();
					}

					this.setVariablesFormularioToObjetoActualKit(this.kit,true);
					this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);
				}

				if(this.kit.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.kit.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingKit(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaKitUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebKit(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosKit.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosKit.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosKit.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualKit(this.getkit(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.kitLogic.getConnexion());

				if(this.kit.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.kit.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderKit=(TitledBorder)this.jScrollPanelDatosKit.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderKit.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaKitBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosKit.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualKit(this.getkit(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.kit==null) {
						this.kit = new Kit();
					}

					this.setVariablesFormularioToObjetoActualKit(this.kit,true);
					this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);
				}

				if(this.kit.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.kit.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingKit(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalKitUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebKit(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosKit.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosKit.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosKit.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualKit(this.getkit(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.kitLogic.getConnexion());

				if(this.kit.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.kit.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderKit=(TitledBorder)this.jScrollPanelDatosKit.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderKit.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalKitBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosKit.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualKit(this.getkit(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.kit==null) {
						this.kit = new Kit();
					}

					this.setVariablesFormularioToObjetoActualKit(this.kit,true);
					this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);
				}

				if(this.kit.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.kit.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingKit(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionKitBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosKit.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualKit(this.getkit(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.kit==null) {
						this.kit = new Kit();
					}

					this.setVariablesFormularioToObjetoActualKit(this.kit,true);
					this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);
				}

				if(this.kit.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.kit.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingKit(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaKitActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingKit(false,false);

			this.getKitsFK_IdEmpresa();

			this.inicializarActualizarBindingKit(false);

			//if(KitBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingKit(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalKitActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingKit(false,false);

			this.getKitsFK_IdSucursal();

			this.inicializarActualizarBindingKit(false);

			//if(KitBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingKit(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.kitLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameKit() {
		if(this.jInternalFrameDetalleFormKit!=null) {
		

		if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormKit!=null) {
			this.jInternalFrameDetalleFormKit.setVisible(false);	    			
			this.jInternalFrameDetalleFormKit.dispose();
			this.jInternalFrameDetalleFormKit=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoKit!=null) {
			this.jInternalFrameReporteDinamicoKit.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoKit.dispose();
			this.jInternalFrameReporteDinamicoKit=null;
		}
		
		if(this.jInternalFrameImportacionKit!=null) {
			this.jInternalFrameImportacionKit.setVisible(false);	    			
			this.jInternalFrameImportacionKit.dispose();
			this.jInternalFrameImportacionKit=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessKit();
			
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			
			
			if(sTipo.equals("NuevoKit")) {
				jButtonNuevoKitActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarKit")) {
				jButtonDuplicarKitActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarKit")) {
				jButtonCopiarKitActionPerformed(evt);
			} else if(sTipo.equals("VerFormKit")) {
				jButtonVerFormKitActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarKit")) {
				jButtonNuevoKitActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarKit")) {
				jButtonDuplicarKitActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoKit")) {
				jButtonNuevoKitActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarKit")) {
				jButtonDuplicarKitActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesKit")) {
				jButtonNuevoKitActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarKit")) {
				jButtonNuevoKitActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesKit")) {
				jButtonNuevoKitActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarKit")) {
				jButtonModificarKitActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarKit")) {
				jButtonModificarKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarKit")) {
				jButtonModificarKitActionPerformed(evt);
			} else if(sTipo.equals("ActualizarKit")) {
				jButtonActualizarKitActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarKit")) {
				jButtonActualizarKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarKit")) {
				jButtonActualizarKitActionPerformed(evt);
			} else if(sTipo.equals("EliminarKit")) {
				jButtonEliminarKitActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarKit")) {
				jButtonEliminarKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarKit")) {
				jButtonEliminarKitActionPerformed(evt);
			} else if(sTipo.equals("CancelarKit")) {
				jButtonCancelarKitActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarKit")) {
				jButtonCancelarKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarKit")) {
				jButtonCancelarKitActionPerformed(evt);
			} else if(sTipo.equals("CerrarKit")) {
				jButtonCerrarKitActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarKit")) {
				jButtonCerrarKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarKit")) {
				jButtonCerrarKitActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarKit")) {
				jButtonMostrarOcultarKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarKit")) {
				jButtonCancelarKitActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosKit")) {
				jButtonGuardarCambiosKitActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarKit")) {
				jButtonGuardarCambiosKitActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarKit")) {
				jButtonCopiarKitActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarKit")) {
				jButtonVerFormKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosKit")) {
				jButtonGuardarCambiosKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarKit")) {
				jButtonCopiarKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormKit")) {
				jButtonVerFormKitActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaKit")) {
				jButtonGuardarCambiosKitActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarKit")) {
				jButtonGuardarCambiosKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaKit")) {
				jButtonGuardarCambiosKitActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionKit")) {
				jButtonRecargarInformacionKitActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarKit")) {
				jButtonRecargarInformacionKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionKit")) {
				jButtonRecargarInformacionKitActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresKit")) {
				jButtonAnterioresKitActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarKit")) {
				jButtonAnterioresKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreKit")) {
				jButtonAnterioresKitActionPerformed(evt);
			} else if(sTipo.equals("SiguientesKit")) {
				jButtonSiguientesKitActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarKit")) {
				jButtonSiguientesKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesKit")) {
				jButtonSiguientesKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByKit") || sTipo.equals("MenuItemDetalleAbrirOrderByKit")) {
				jButtonAbrirOrderByKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarKit") || sTipo.equals("MenuItemDetalleMostrarOcultarKit")) {
				jButtonMostrarOcultarKitActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosKit")) {
				jButtonNuevoGuardarCambiosKitActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarKit")) {
				jButtonNuevoGuardarCambiosKitActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosKit")) {
				jButtonNuevoGuardarCambiosKitActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoKit")) {
				jButtonCerrarReporteDinamicoKitActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoKit")) {
				jButtonGenerarReporteDinamicoKitActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoKit")) {
				
				jButtonGenerarExcelReporteDinamicoKitActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionKit")) {
				jButtonCerrarImportacionKitActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionKit")) {
				
				jButtonGenerarImportacionKitActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionKit")) {
				
				jButtonAbrirImportacionKitActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesKit")) {
				jComboBoxTiposAccionesKitActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesKit")) {
				jComboBoxTiposRelacionesKitActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioKit")) {
				jComboBoxTiposAccionesKitActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarKit")) {
				
				jComboBoxTiposSeleccionarKitActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralKit")) {
				jTextFieldValorCampoGeneralKitActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByKit")) {
				jButtonAbrirOrderByKitActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarKit")) {
				jButtonAbrirOrderByKitActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByKit")) {
				jButtonCerrarOrderByKitActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idKitBusqueda")) {
				this.jButtonidKitBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaKitUpdate")) {
				this.jButtonid_empresaKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaKitBusqueda")) {
				this.jButtonid_empresaKitBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalKitUpdate")) {
				this.jButtonid_sucursalKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalKitBusqueda")) {
				this.jButtonid_sucursalKitBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionKitBusqueda")) {
				this.jButtondescripcionKitBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessKit();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaKitActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.kit);
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
				


				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Kit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Kit.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Kit kitLocal=null;
			
			if(!this.getEsControlTabla()) {
				kitLocal=this.kit;
			} else {
				kitLocal=this.kitAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.kit);
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
							
				
				


				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Kit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Kit.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaKitActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosKit.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitAnterior =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.kitAnterior =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
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
			
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			
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
			
			


			
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaKitActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.kit);
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
								
						
				


				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Kit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Kit.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.kit);
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
								
				
				


				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Kit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Kit.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaKitActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosKit.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitAnterior =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.kitAnterior =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.kit);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaKitActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosKit.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitAnterior =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.kitAnterior =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaKitActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
			
			this.actualizarInformacion("INFO_PADRE",false,this.kit);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.kit);
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
							
				
				


				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Kit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Kit.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaKitActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosKit.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.kitAnterior =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.kitAnterior =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
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
			
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			
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
			
			


			
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaKitActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
			
			this.actualizarInformacion("INFO_PADRE",false,this.kit);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.kit);
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
								
				
				


				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Kit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Kit.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaKitActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosKit.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitAnterior =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.kitAnterior =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaKitActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
			
			this.actualizarInformacion("INFO_PADRE",false,this.kit);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaKitActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.kit);
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosKit")) {
					jCheckBoxSeleccionarTodosKitItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosKit")) {
					jCheckBoxSeleccionadosKitItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarKit")) {
					
				}
				
				


				
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Kit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Kit.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.kit);
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
												
				
				


				
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Kit.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Kit.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaKitActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosKit.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.kitAnterior =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.kitAnterior =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaKitActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.kit);
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
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
			
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
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
			
			


			
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaKitActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.kit);
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Kit.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Kit.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.kit);
				
				this.actualizarInformacion("INFO_PADRE",false,this.kit);
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
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
				
				


				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Kit.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Kit.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaKitActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosKit.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.kitAnterior =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.kitAnterior =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarKit")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosKitListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosKit.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.kit =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.kit =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.kit);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarKit")) {
				
				}
				
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarKit")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosKit.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarKit")) {
			
			}
			
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessKit();
			
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			
			if(sTipo.equals("NuevoKit")) {
				jButtonNuevoKitActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarKit")) {
				jButtonDuplicarKitActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarKit")) {
				jButtonCopiarKitActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormKit")) {
				jButtonVerFormKitActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesKit")) {
				jButtonNuevoKitActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarKit")) {
				jButtonModificarKitActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarKit")) {
				jButtonActualizarKitActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarKit")) {
				jButtonEliminarKitActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaKit")) {
				jButtonGuardarCambiosKitActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarKit")) {
				jButtonCancelarKitActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarKit")) {
				jButtonCerrarKitActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosKit")) {
				jButtonGuardarCambiosKitActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosKit")) {
				jButtonNuevoGuardarCambiosKitActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByKit")) {
				jButtonAbrirOrderByKitActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionKit")) {
				jButtonRecargarInformacionKitActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresKit")) {
				jButtonAnterioresKitActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesKit")) {
				jButtonSiguientesKitActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idKitBusqueda")) {
				this.jButtonidKitBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaKitUpdate")) {
				this.jButtonid_empresaKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaKitBusqueda")) {
				this.jButtonid_empresaKitBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalKitUpdate")) {
				this.jButtonid_sucursalKitUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalKitBusqueda")) {
				this.jButtonid_sucursalKitBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionKitBusqueda")) {
				this.jButtondescripcionKitBusquedaActionPerformed(evt);
			}
			
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessKit();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameKit")) {
				closingInternalFrameKit();
				
			} else if(sTipo.equals("jButtonCancelarKit")) {
				JInternalFrameBase jInternalFrameDetalleFormKit = (JInternalFrameBase)evt.getSource();
	            	
	            KitBeanSwingJInternalFrame jInternalFrameParent=(KitBeanSwingJInternalFrame)jInternalFrameDetalleFormKit.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarKitActionPerformed(null);
			}
			
			KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.kit,new Object(),this.kitParameterGeneral,this.kitReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormKit(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormKit(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormKit(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.kit)) {
			if(!esControlTabla) {
				if(KitJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualKit(this.kit,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);			
				}
				
				if(this.kitSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualKit(this.kit,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.kitReturnGeneral=kitLogic.procesarEventosKitsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.kitLogic.getKits(),this.kit,this.kitParameterGeneral,this.isEsNuevoKit,classes);//this.kitLogic.getKit()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanKit(this.kitReturnGeneral,this.kitBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.kitSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanKit(classes,this.kitReturnGeneral,this.kitBean,false);
					}
						
					if(this.kitReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyKit(this.kitReturnGeneral.getKit());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioKit(this.kitReturnGeneral.getKit());	
					}
						
					if(this.kitReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioKit(this.kitReturnGeneral.getKit(),classes);//this.kitBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioKit(this.kit,classes);//this.kitBean);									
				}
			
				if(KitJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualKit(this.kit,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysKit(this.kit);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.kitAnterior!=null) {
						this.kit=this.kitAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.kitReturnGeneral=kitLogic.procesarEventosKitsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.kitLogic.getKits(),this.kit,this.kitParameterGeneral,this.isEsNuevoKit,classes);//this.kitLogic.getKit()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.kitSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.kitSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.kitReturnGeneral.getKit(),kitLogic.getKits());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.kitReturnGeneral.getKit(),this.kits);
				}
				//ARCHITECTURE
				
				//this.jTableDatosKit.repaint();
				
				//((AbstractTableModel) this.jTableDatosKit.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosKit();
			}
		}
	}
	
	public void actualizarVisualTableDatosKit() throws Exception {
		
		KitModel kitModel=(KitModel)this.jTableDatosKit.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			kitModel.kits=this.kitLogic.getKits();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			kitModel.kits=this.kits;
		}
		
		
		((KitModel) this.jTableDatosKit.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaKit() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getkitAnterior(),this.kitLogic.getKits());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getkitAnterior(),this.kits);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosKit();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioKit(Kit kit,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CompoKit.class)) {
					this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.setCompoKits(kit.getCompoKits());
					this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.inicializarActualizarBindingTablaCompoKit(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
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
										
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.kit,new Object(),generalEntityParameterGeneral,this.kitReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.kitSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=KitConstantesFunciones.getClassesRelationshipsOfKit(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=KitConstantesFunciones.getClassesRelationshipsFromStringsOfKit(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormKit(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				KitBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.kit,new Object(),generalEntityParameterGeneral,this.kitReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,KitConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioKit(KitBean kitBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CompoKit.class)) {
					this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.setCompoKits(kit.getCompoKits());
					this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.inicializarActualizarBindingTablaCompoKit(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanKit(ArrayList<Classe> classes,KitReturnGeneral kitReturnGeneral,KitBean kitBean,Boolean conDefault) throws Exception {
		
			this.kitBean.setCompoKits(kitReturnGeneral.getKit().getCompoKits());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualKit(Kit kit,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(CompoKit.class)) {
					kit.setCompoKits(this.jInternalFrameDetalleFormKit.compokitBeanSwingJInternalFrame.compokitLogic.getCompoKits());
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
		if(!paraTabla && !this.permiteMantenimiento(this.kit)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormKit = new KitDetalleFormJInternalFrame(jDesktopPane,this.kitSessionBean.getConGuardarRelaciones(),this.kitSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormKit);
		this.jInternalFrameDetalleFormKit.setVisible(false);
		this.jInternalFrameDetalleFormKit.setSelected(false);						
		
		this.jInternalFrameDetalleFormKit.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormKit.kitLogic=this.kitLogic;
		
		this.cargarCombosFrameForeignKeyKit("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleKit();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleKit();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyKit("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyKit();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormKit.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarKit"));
		
		this.jInternalFrameDetalleFormKit.jButtonModificarKit.addActionListener(new ButtonActionListener(this,"ModificarKit"));

		
		this.jInternalFrameDetalleFormKit.jButtonModificarToolBarKit.addActionListener(new ButtonActionListener(this,"ModificarToolBarKit"));
					
		this.jInternalFrameDetalleFormKit.jMenuItemModificarKit.addActionListener(new ButtonActionListener(this,"MenuItemModificarKit"));		
		
		
		
		this.jInternalFrameDetalleFormKit.jButtonActualizarKit.addActionListener (new ButtonActionListener(this,"ActualizarKit"));
		
		
		this.jInternalFrameDetalleFormKit.jButtonActualizarToolBarKit.addActionListener(new ButtonActionListener(this,"ActualizarToolBarKit"));
						
		this.jInternalFrameDetalleFormKit.jMenuItemActualizarKit.addActionListener (new ButtonActionListener(this,"MenuItemActualizarKit"));		
		
		
		
		this.jInternalFrameDetalleFormKit.jButtonEliminarKit.addActionListener (new ButtonActionListener(this,"EliminarKit"));
		
		
		this.jInternalFrameDetalleFormKit.jButtonEliminarToolBarKit.addActionListener (new ButtonActionListener(this,"EliminarToolBarKit"));
								
		this.jInternalFrameDetalleFormKit.jMenuItemEliminarKit.addActionListener (new ButtonActionListener(this,"MenuItemEliminarKit"));		
		
		
		
		this.jInternalFrameDetalleFormKit.jButtonCancelarKit.addActionListener (new ButtonActionListener(this,"CancelarKit"));
		
		
		this.jInternalFrameDetalleFormKit.jButtonCancelarToolBarKit.addActionListener (new ButtonActionListener(this,"CancelarToolBarKit"));
					
		this.jInternalFrameDetalleFormKit.jMenuItemCancelarKit.addActionListener (new ButtonActionListener(this,"MenuItemCancelarKit"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormKit.jMenuItemDetalleCerrarKit.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarKit"));		
		
		
		
		this.jInternalFrameDetalleFormKit.jButtonGuardarCambiosToolBarKit.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarKit"));
		
		
		
		this.jInternalFrameDetalleFormKit.jButtonGuardarCambiosToolBarKit.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarKit"));
		
		
		
		this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioKit"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormKit.jButtonidKitBusqueda.addActionListener(new ButtonActionListener(this,"idKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormKit.jButtonid_empresaKitUpdate.addActionListener(new ButtonActionListener(this,"id_empresaKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormKit.jButtonid_empresaKitBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormKit.jButtonid_sucursalKitUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormKit.jButtonid_sucursalKitBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalKitBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormKit.jButtondescripcionKitBusqueda.addActionListener(new ButtonActionListener(this,"descripcionKitBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormKit.jTabbedPaneRelacionesKit.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesKit"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameKit"));
		
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormKit.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarKit"));
		}
		
		this.jTableDatosKit.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarKit"));
		
		this.jTableDatosKit.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarKit"));
		
		this.jButtonNuevoKit.addActionListener(new ButtonActionListener(this,"NuevoKit"));
		
		this.jButtonDuplicarKit.addActionListener(new ButtonActionListener(this,"DuplicarKit"));
		
		this.jButtonCopiarKit.addActionListener(new ButtonActionListener(this,"CopiarKit"));
		
		this.jButtonVerFormKit.addActionListener(new ButtonActionListener(this,"VerFormKit"));
		
		
		this.jButtonNuevoToolBarKit.addActionListener(new ButtonActionListener(this,"NuevoToolBarKit"));
			
		this.jButtonDuplicarToolBarKit.addActionListener(new ButtonActionListener(this,"DuplicarToolBarKit"));
			
		this.jMenuItemNuevoKit.addActionListener (new ButtonActionListener(this,"MenuItemNuevoKit"));
			
		this.jMenuItemDuplicarKit.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarKit"));		
		
		
		this.jButtonNuevoRelacionesKit.addActionListener (new ButtonActionListener(this,"NuevoRelacionesKit"));
		
		
		this.jButtonNuevoRelacionesToolBarKit.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarKit"));
			
		this.jMenuItemNuevoRelacionesKit.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesKit"));		
		
		
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormKit.jButtonModificarKit.addActionListener(new ButtonActionListener(this,"ModificarKit"));
		}
		
		
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormKit.jButtonModificarToolBarKit.addActionListener(new ButtonActionListener(this,"ModificarToolBarKit"));
			
			this.jInternalFrameDetalleFormKit.jMenuItemModificarKit.addActionListener(new ButtonActionListener(this,"MenuItemModificarKit"));		
		}
		
		
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormKit.jButtonActualizarKit.addActionListener (new ButtonActionListener(this,"ActualizarKit"));
		}
		
		
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormKit.jButtonActualizarToolBarKit.addActionListener(new ButtonActionListener(this,"ActualizarToolBarKit"));
				
			this.jInternalFrameDetalleFormKit.jMenuItemActualizarKit.addActionListener (new ButtonActionListener(this,"MenuItemActualizarKit"));		
		}
		
		
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormKit.jButtonEliminarKit.addActionListener (new ButtonActionListener(this,"EliminarKit"));
		}
		
		
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormKit.jButtonEliminarToolBarKit.addActionListener (new ButtonActionListener(this,"EliminarToolBarKit"));
						
			this.jInternalFrameDetalleFormKit.jMenuItemEliminarKit.addActionListener (new ButtonActionListener(this,"MenuItemEliminarKit"));		
		}
		
		
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormKit.jButtonCancelarKit.addActionListener (new ButtonActionListener(this,"CancelarKit"));
		}
		
		
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormKit.jButtonCancelarToolBarKit.addActionListener (new ButtonActionListener(this,"CancelarToolBarKit"));
			
			this.jInternalFrameDetalleFormKit.jMenuItemCancelarKit.addActionListener (new ButtonActionListener(this,"MenuItemCancelarKit"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarKit.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarKit"));		
		
		
		this.jButtonCerrarKit.addActionListener (new ButtonActionListener(this,"CerrarKit"));
		
		
		this.jButtonCerrarToolBarKit.addActionListener (new ButtonActionListener(this,"CerrarToolBarKit"));
			
		this.jMenuItemCerrarKit.addActionListener (new ButtonActionListener(this,"MenuItemCerrarKit"));
			
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormKit.jMenuItemDetalleCerrarKit.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarKit"));		
		}
		
		
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormKit.jButtonGuardarCambiosKit.addActionListener (new ButtonActionListener(this,"GuardarCambiosKit"));
		}
		
		
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormKit.jButtonGuardarCambiosToolBarKit.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarKit"));
		}
		
		this.jButtonCopiarToolBarKit.addActionListener (new ButtonActionListener(this,"CopiarToolBarKit"));
			
		this.jButtonVerFormToolBarKit.addActionListener (new ButtonActionListener(this,"VerFormToolBarKit"));
		
		this.jMenuItemGuardarCambiosKit.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosKit"));
			
		this.jMenuItemCopiarKit.addActionListener (new ButtonActionListener(this,"MenuItemCopiarKit"));		
		
		this.jMenuItemVerFormKit.addActionListener (new ButtonActionListener(this,"MenuItemVerFormKit"));		
		
		
		this.jButtonGuardarCambiosTablaKit.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaKit"));
		
		
		this.jButtonGuardarCambiosTablaToolBarKit.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarKit"));
			
		this.jMenuItemGuardarCambiosTablaKit.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaKit"));		
		
		
		
		this.jButtonRecargarInformacionKit.addActionListener (new ButtonActionListener(this,"RecargarInformacionKit"));
					
		this.jButtonRecargarInformacionToolBarKit.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarKit"));
		
		this.jMenuItemRecargarInformacionKit.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionKit"));		
		
		
		
		this.jButtonAnterioresKit.addActionListener (new ButtonActionListener(this,"AnterioresKit"));
		
		
		this.jButtonAnterioresToolBarKit.addActionListener (new ButtonActionListener(this,"AnterioresToolBarKit"));
		
		this.jMenuItemAnterioresKit.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresKit"));		
		
		
		this.jButtonSiguientesKit.addActionListener (new ButtonActionListener(this,"SiguientesKit"));
		
		
		this.jButtonSiguientesToolBarKit.addActionListener (new ButtonActionListener(this,"SiguientesToolBarKit"));
			
		this.jMenuItemSiguientesKit.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesKit"));
			
		this.jMenuItemAbrirOrderByKit.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByKit"));
			
		this.jMenuItemMostrarOcultarKit.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarKit"));
			
		this.jMenuItemDetalleAbrirOrderByKit.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByKit"));
			
		this.jMenuItemDetalleMostarOcultarKit.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarKit"));		
		
		
		this.jButtonNuevoGuardarCambiosKit.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosKit"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarKit.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarKit"));
			
		this.jMenuItemNuevoGuardarCambiosKit.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosKit"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosKit.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosKit"));

		this.jCheckBoxSeleccionadosKit.addItemListener(new CheckBoxItemListener(this,"SeleccionadosKit"));
		
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioKit"));
		}
		
		
		this.jComboBoxTiposRelacionesKit.addActionListener (new ButtonActionListener(this,"TiposRelacionesKit"));
			
		this.jComboBoxTiposAccionesKit.addActionListener (new ButtonActionListener(this,"TiposAccionesKit"));
					
		this.jComboBoxTiposSeleccionarKit.addActionListener (new ButtonActionListener(this,"TiposSeleccionarKit"));
			
		this.jTextFieldValorCampoGeneralKit.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralKit"));		
		
		
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormKit.jButtonidKitBusqueda.addActionListener(new ButtonActionListener(this,"idKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormKit.jButtonid_empresaKitUpdate.addActionListener(new ButtonActionListener(this,"id_empresaKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormKit.jButtonid_empresaKitBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormKit.jButtonid_sucursalKitUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormKit.jButtonid_sucursalKitBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalKitBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormKit.jButtondescripcionKitBusqueda.addActionListener(new ButtonActionListener(this,"descripcionKitBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoKit!=null) {
				this.jInternalFrameReporteDinamicoKit.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoKit"));
				this.jInternalFrameReporteDinamicoKit.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoKit"));
				this.jInternalFrameReporteDinamicoKit.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoKit"));
			}
			
			//this.jButtonCerrarReporteDinamicoKit.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoKit"));				
			//this.jButtonGenerarReporteDinamicoKit.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoKit"));
			//this.jButtonGenerarExcelReporteDinamicoKit.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoKit"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionKit!=null) {
				this.jInternalFrameImportacionKit.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionKit"));
				this.jInternalFrameImportacionKit.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionKit"));
				this.jInternalFrameImportacionKit.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionKit"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByKit.addActionListener (new ButtonActionListener(this,"AbrirOrderByKit"));
			
			this.jButtonAbrirOrderByToolBarKit.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarKit"));			
			
			if(this.jInternalFrameOrderByKit!=null) {
				this.jInternalFrameOrderByKit.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByKit"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormKit!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormKit.jTabbedPaneRelacionesKit.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesKit"));
		
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
            		closingInternalFrameKit();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormKit.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormKit = (JInternalFrameBase)event.getSource();
	            	
	            KitBeanSwingJInternalFrame jInternalFrameParent=(KitBeanSwingJInternalFrame)jInternalFrameDetalleFormKit.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarKitActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosKit.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosKitListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosKit.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosKit.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoKitActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoKitActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoKitActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoKit";
		inputMap = this.jButtonNuevoKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoKitActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoKitActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoKitActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoKitActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesKit";
		inputMap = this.jButtonNuevoRelacionesKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoKitActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarKit";
		inputMap = this.jButtonModificarKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarKitActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarKit";
		inputMap = this.jButtonActualizarKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarKitActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarKit";
		inputMap = this.jButtonEliminarKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarKitActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarKit";
		inputMap = this.jButtonCancelarKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarKitActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarKit";
		inputMap = this.jButtonCerrarKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarKitActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormKit.jButtonGuardarCambiosKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosKit";
		inputMap = this.jInternalFrameDetalleFormKit.jButtonGuardarCambiosKit.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormKit.jButtonGuardarCambiosKit.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosKitActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosKit.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosKitItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesKit.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesKitActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarKit.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarKitActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralKit.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralKitActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormKit.jButtonidKitBusqueda.addActionListener(new ButtonActionListener(this,"idKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormKit.jButtonid_empresaKitUpdate.addActionListener(new ButtonActionListener(this,"id_empresaKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormKit.jButtonid_empresaKitBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaKitBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormKit.jButtonid_sucursalKitUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalKitUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormKit.jButtonid_sucursalKitBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalKitBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormKit.jButtondescripcionKitBusqueda.addActionListener(new ButtonActionListener(this,"descripcionKitBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionKit.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionKitActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarKitActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarKit.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosKit(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Kit kitAux:this.kitLogic.getKits()) {
					kitAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Kit kitAux:kits) {
					kitAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosKitItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingKit(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Kit kitAux:this.kitLogic.getKits()) {
						kitAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Kit kitAux:kits) {
						kitAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Kit kitAux:this.kitLogic.getKits()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Kit kitAux:kits) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaKit(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosKit.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosKit.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosKit,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosKitItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingKit(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosKit.getSelectedRows();
			
			Kit kitLocal=new Kit();
			
			//this.seleccionarTodosKit(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					kitLocal =(Kit) this.kitLogic.getKits().toArray()[this.jTableDatosKit.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					kitLocal =(Kit) this.kits.toArray()[this.jTableDatosKit.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				kitLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Kit kitAux:this.kitLogic.getKits()) {
						kitAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Kit kitAux:kits) {
						kitAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaKit(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosKit.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosKit.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosKit,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualKitItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarKitParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralKitActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingKit(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralKit.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Kit kitAux:this.kitLogic.getKits()) {
				
						if(sTipoSeleccionar.equals(KitConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							kitAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Kit kitAux:kits) {
					
						if(sTipoSeleccionar.equals(KitConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							kitAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaKit(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesKitActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingKit(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioKit=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesKit.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteKit) {				
					conSplash=true;//false;										
					
					//this.startProcessKit(conSplash);
				
					this.generarReporteKitsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesKit.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoKitsSeleccionados();
				//this.jComboBoxTiposAccionesKit.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoKitsSeleccionados(false);
				//this.jComboBoxTiposAccionesKit.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoKitsSeleccionados(true);
				//this.jComboBoxTiposAccionesKit.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessKit();
				
				this.exportarKitsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesKit.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionKits();
				//this.importarKits();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesKit.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessKit();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelKitsSeleccionados();
				//this.jComboBoxTiposAccionesKit.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Kit", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessKit();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoKit)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyKit(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Kit",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesKit.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.setSelectedIndex(0);					
				}	
			} 			
			else if(KitBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteKit) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessKit(conSplash);
					
						//this.actualizarParametrosGeneralKit();
						
						this.generarReporteProcesoAccionKitsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesKit.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(KitBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO KitES SELECCIONADOS?", "MANTENIMIENTO DE Kit", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessKit();
				
						this.actualizarParametrosGeneralKit();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.kitReturnGeneral=kitLogic.procesarAccionKitsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.kitLogic.getKits(),this.kitParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarKitReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesKit.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralKit();
					
					KitBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarKitReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesKit.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormKit.jComboBoxTiposAccionesFormularioKit.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessKit(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesKitActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessKit();
			
			if(this.jInternalFrameDetalleFormKit==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Kit> kitsSeleccionados=new ArrayList<Kit>();		
			Kit kit=new Kit();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingKit(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesKit.getSelectedItem();
			
			
			
			
			kitsSeleccionados=this.getKitsSeleccionados(true);
			//this.sTipoAccion;
			
			if(kitsSeleccionados.size()==1) {
				for(Kit kitAux:kitsSeleccionados) {
					kit=kitAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Compo Kit")) {
					jButtonCompoKitActionPerformed(null,rowIndex,true,false,kit);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessKit();
			
      		//this.finishProcessKit(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarKitReturnGeneral() throws Exception {
		if(this.kitReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.kitReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.kitReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.kitReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.kitReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.kitReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingKit(false);
		}
		
		if(this.kitReturnGeneral.getConRetornoLista() || this.kitReturnGeneral.getConRetornoObjeto()) {
			if(this.kitReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.kitLogic.setKits(this.kitReturnGeneral.getKits());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.kitReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.kitLogic.setKit(this.kitReturnGeneral.getKit());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingKit(false);
		}
	}
	
	public void actualizarParametrosGeneralKit() throws Exception {
		
		
	}
	
	public ArrayList<Kit> getKitsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Kit> kitsSeleccionados=new ArrayList<Kit>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioKit) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Kit kitAux:kitLogic.getKits()) {
					if(kitAux.getIsSelected()) {
						kitsSeleccionados.add(kitAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Kit kitAux:this.kits) {
					if(kitAux.getIsSelected()) {
						kitsSeleccionados.add(kitAux);				
					}
				}
			}
			
			if(kitsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						kitsSeleccionados.addAll(this.kitLogic.getKits());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						kitsSeleccionados.addAll(this.kits);				
					}
				}
			}
		} else {
			kitsSeleccionados.add(this.kit);
		}
		
		return kitsSeleccionados;
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
	
	public void generarReporteKitsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalKitsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoKitsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoKitsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoKitsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesKitsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Kit",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesKitsSeleccionados() throws Exception {
		ArrayList<Kit> kitsSeleccionados=new ArrayList<Kit>();		
		
		kitsSeleccionados=this.getKitsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteKits("Todos",kitsSeleccionados);
		
	}	
	
	public void generarReporteNormalKitsSeleccionados() throws Exception {
		ArrayList<Kit> kitsSeleccionados=new ArrayList<Kit>();		
		
		kitsSeleccionados=this.getKitsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteKits("Todos",kitsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionKitsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Kit> kitsSeleccionados=new ArrayList<Kit>();
		
		kitsSeleccionados=this.getKitsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteKits("Todos",kitsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoKitsSeleccionados() throws Exception {
		ArrayList<Kit> kitsSeleccionados=new ArrayList<Kit>();		
		
		
		this.abrirInicializarFrameReporteDinamicoKit();
		
		
		kitsSeleccionados=this.getKitsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoKit();
		
		
		//this.generarReporteKits("Todos",kitsSeleccionados ,kitImplementable,kitImplementableHome);
	}
	
	public void mostrarImportacionKits() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionKit();
		
		this.abrirFrameImportacionKit();		
		
			
		//this.generarReporteKits("Todos",kitsSeleccionados ,kitImplementable,kitImplementableHome);
	}
	
	public void importarKits() throws Exception {		
	
	}
	
	public void exportarKitsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelKitsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoKitsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlKitsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Kit",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoKitsSeleccionados() throws Exception {
		ArrayList<Kit> kitsSeleccionados=new ArrayList<Kit>();		
		
		kitsSeleccionados=this.getKitsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"kit."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarKit(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Kit kitAux:kitsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarKit(kitAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//kitAux.setsDetalleGeneralEntityReporte(kitAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.kitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Kit",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarKit(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=KitConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=KitConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=KitConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=KitConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=KitConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarKit(Kit kit,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=kit.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=kit.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=kit.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=kit.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=kit.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelKitsSeleccionados() throws Exception {
		ArrayList<Kit> kitsSeleccionados=new ArrayList<Kit>();		
		
		kitsSeleccionados=this.getKitsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"kit.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Kits");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelKit(row);				
				iRow++;
			}				
			
			for(Kit kitAux:kitsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelKit(kitAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.kitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Kit",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlKitsSeleccionados() throws Exception {
		ArrayList<Kit> kitsSeleccionados=new ArrayList<Kit>();		
		
		kitsSeleccionados=this.getKitsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"kit.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("kits");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("kit");
			//elementRoot.appendChild(element);
		
			for(Kit kitAux:kitsSeleccionados) {
				element = document.createElement("kit");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlKit(kitAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.kitSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Kit",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelKit(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(KitConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(KitConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(KitConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(KitConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(KitConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelKit(Kit kit,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(kit.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(kit.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(kit.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(kit.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlKit(Kit kit,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(KitConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(kit.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(KitConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(kit.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(KitConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(kit.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(KitConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(kit.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementdescripcion = document.createElement(KitConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(kit.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoKitsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Kit> kitsSeleccionados=new ArrayList<Kit>();
		
		kitsSeleccionados=this.getKitsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoKit(kitsSeleccionados);
		
		this.generarReporteKits("Todos",kitsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoKit(ArrayList<Kit> kitsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Kit kitAux:kitsSeleccionados) {
				kitAux.setsDetalleGeneralEntityReporte(kitAux.toString());
			
				if(sTipoSeleccionar.equals(KitConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					kitAux.setsDescripcionGeneralEntityReporte1(kitAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(KitConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					kitAux.setsDescripcionGeneralEntityReporte1(kitAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(KitConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					kitAux.setsDescripcionGeneralEntityReporte1(kitAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,KitConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesKit(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoKit=true;
				this.isVisibilidadCeldaNuevoRelacionesKit=true;
				this.isVisibilidadCeldaGuardarCambiosKit=true;
			}
			
			this.isVisibilidadCeldaModificarKit=false;
			this.isVisibilidadCeldaActualizarKit=false;
			this.isVisibilidadCeldaEliminarKit=false;
			this.isVisibilidadCeldaCancelarKit=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarKit=true;
				} else {
					this.isVisibilidadCeldaGuardarKit=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoKit=false;
			this.isVisibilidadCeldaNuevoRelacionesKit=false;
			this.isVisibilidadCeldaGuardarCambiosKit=false;
			this.isVisibilidadCeldaModificarKit=false;
			this.isVisibilidadCeldaActualizarKit=true;
			this.isVisibilidadCeldaEliminarKit=false;
			this.isVisibilidadCeldaCancelarKit=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarKit=true;
				} else {
					this.isVisibilidadCeldaGuardarKit=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoKit=false;
			this.isVisibilidadCeldaNuevoRelacionesKit=false;
			this.isVisibilidadCeldaGuardarCambiosKit=false;
			this.isVisibilidadCeldaModificarKit=false;
			this.isVisibilidadCeldaActualizarKit=true;
			this.isVisibilidadCeldaEliminarKit=true;
			this.isVisibilidadCeldaCancelarKit=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarKit=true;
				} else {
					this.isVisibilidadCeldaGuardarKit=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoKit=false;
			this.isVisibilidadCeldaNuevoRelacionesKit=false;
			this.isVisibilidadCeldaGuardarCambiosKit=false;
			this.isVisibilidadCeldaModificarKit=false;
			this.isVisibilidadCeldaActualizarKit=true;
			this.isVisibilidadCeldaEliminarKit=false;
			this.isVisibilidadCeldaCancelarKit=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarKit=false;
				} else {
					this.isVisibilidadCeldaGuardarKit=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoKit=true;
			this.isVisibilidadCeldaNuevoRelacionesKit=true;
			this.isVisibilidadCeldaGuardarCambiosKit=true;
			this.isVisibilidadCeldaModificarKit=false;
			this.isVisibilidadCeldaActualizarKit=false;
			this.isVisibilidadCeldaEliminarKit=false;
			this.isVisibilidadCeldaCancelarKit=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarKit=true;
				} else {
					this.isVisibilidadCeldaGuardarKit=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoKit=false;
			this.isVisibilidadCeldaNuevoRelacionesKit=false;
			this.isVisibilidadCeldaGuardarCambiosKit=false;
			this.isVisibilidadCeldaActualizarKit=false;
			this.isVisibilidadCeldaEliminarKit=false;
			this.isVisibilidadCeldaCancelarKit=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarKit=false;
				} else {
					this.isVisibilidadCeldaGuardarKit=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoKit=false;
			this.isVisibilidadCeldaNuevoRelacionesKit=false;
			this.isVisibilidadCeldaGuardarCambiosKit=false;
			this.isVisibilidadCeldaModificarKit=true;
			this.isVisibilidadCeldaActualizarKit=false;
			this.isVisibilidadCeldaEliminarKit=false;
			this.isVisibilidadCeldaCancelarKit=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarKit=false;
				} else {
					this.isVisibilidadCeldaGuardarKit=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(KitJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoKit=true;
			this.isVisibilidadCeldaNuevoRelacionesKit=true;
			this.isVisibilidadCeldaGuardarCambiosKit=true;
		} else {
			this.actualizarEstadoPanelsKit(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarKit=false;
			//this.isVisibilidadCeldaVerFormKit=false;
			this.isVisibilidadCeldaDuplicarKit=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!kitSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesKit=false;
		} else {
			this.isVisibilidadCeldaNuevoKit=false;
			this.isVisibilidadCeldaGuardarCambiosKit=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(kitSessionBean.getEsGuardarRelacionado()) {
			if(!kitSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesKit=false;												
			}
			
			this.jButtonCerrarKit.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesKit=false;
		}
		
		if(!this.permiteMantenimiento(this.kit)) {
			this.isVisibilidadCeldaActualizarKit=false;
			this.isVisibilidadCeldaEliminarKit=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesKit() {
		this.isVisibilidadCeldaNuevoKit=false;
		this.isVisibilidadCeldaGuardarCambiosKit=false;
	}
	
	public void actualizarEstadoPanelsKit(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionKit!=null) {
				this.jScrollPanelDatosEdicionKit.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasKit!=null) {
				this.jTabbedPaneBusquedasKit.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosKit!=null) {
				this.jScrollPanelDatosKit.setVisible(true);
			}
			
			if(this.jPanelPaginacionKit!=null) {
				this.jPanelPaginacionKit.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesKit!=null) {
				this.jPanelParametrosReportesKit.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionKit!=null) {
				this.jScrollPanelDatosEdicionKit.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasKit!=null) {
				this.jTabbedPaneBusquedasKit.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosKit!=null) {
				this.jScrollPanelDatosKit.setVisible(false);
			}
			
			if(this.jPanelPaginacionKit!=null) {
				this.jPanelPaginacionKit.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesKit!=null) {
				this.jPanelParametrosReportesKit.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionKit!=null) {
				this.jScrollPanelDatosEdicionKit.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasKit!=null) {
				this.jTabbedPaneBusquedasKit.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosKit!=null) {
				this.jScrollPanelDatosKit.setVisible(false);
			}
			
			if(this.jPanelPaginacionKit!=null) {
				this.jPanelPaginacionKit.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesKit!=null) {
				this.jPanelParametrosReportesKit.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionKit!=null) {
				this.jScrollPanelDatosEdicionKit.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasKit!=null) {
				this.jTabbedPaneBusquedasKit.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosKit!=null) {
				this.jScrollPanelDatosKit.setVisible(false);
			}
			
			if(this.jPanelPaginacionKit!=null) {
				this.jPanelPaginacionKit.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesKit!=null) {
				this.jPanelParametrosReportesKit.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionKit!=null) {
				this.jScrollPanelDatosEdicionKit.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasKit!=null) {
				this.jTabbedPaneBusquedasKit.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosKit!=null) {
				this.jScrollPanelDatosKit.setVisible(true);
			}
			
			if(this.jPanelPaginacionKit!=null) {
				this.jPanelPaginacionKit.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesKit!=null) {
				this.jPanelParametrosReportesKit.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionKit!=null) {
				this.jScrollPanelDatosEdicionKit.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasKit!=null) {
				this.jTabbedPaneBusquedasKit.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosKit!=null) {
				this.jScrollPanelDatosKit.setVisible(true);
			}
			
			if(this.jPanelPaginacionKit!=null) {
				this.jPanelPaginacionKit.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesKit!=null) {
				this.jPanelParametrosReportesKit.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionKit!=null) {
				this.jScrollPanelDatosEdicionKit.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasKit!=null) {
				this.jTabbedPaneBusquedasKit.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosKit!=null) {
				this.jScrollPanelDatosKit.setVisible(true);
			}
			
			if(this.jPanelPaginacionKit!=null) {
				this.jPanelPaginacionKit.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesKit!=null) {
				this.jPanelParametrosReportesKit.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.kitSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasKit!=null) {
					this.jTabbedPaneBusquedasKit.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesKit!=null) {
				this.jPanelParametrosReportesKit.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.kitSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasKit!=null) {
				this.jTabbedPaneBusquedasKit.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesKit!=null) {
				this.jPanelParametrosReportesKit.setVisible(true);
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
	
	

	public String registrarSesionKitParaCompoKites() throws Exception {
		Boolean isPaginaPopupCompoKit=false;

		try {

			if(this.kitSessionBean==null) {
				this.kitSessionBean=new KitSessionBean();
			}

			if(this.jInternalFrameDetalleFormKit.compokitSessionBean==null) {
				this.jInternalFrameDetalleFormKit.compokitSessionBean=new CompoKitSessionBean();
			}

			this.jInternalFrameDetalleFormKit.compokitSessionBean.setsPathNavegacionActual(kitSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CompoKitConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormKit.compokitSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCompoKit=this.jInternalFrameDetalleFormKit.compokitSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormKit.compokitSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCompoKit(true);
			this.jInternalFrameDetalleFormKit.compokitSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCompoKit(KitConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormKit.compokitSessionBean.setisBusquedaDesdeForeignKeySesionKit(true);
			this.jInternalFrameDetalleFormKit.compokitSessionBean.setlidKitActual(this.idKitActual);

			kitSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyKit(true);
			kitSessionBean.setlIdKitActualForeignKey(this.idKitActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//KitSessionBean kitSessionBean=new KitSessionBean();
		
		if(this.kitSessionBean==null) {
			this.kitSessionBean=new KitSessionBean();
		}
		
		this.kitSessionBean.setsUltimaBusquedaKit(this.getsAccionBusqueda());
		this.kitSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.kitSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			kitSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			kitSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//KitSessionBean kitSessionBean=new KitSessionBean();
		
		if(this.kitSessionBean==null) {
			this.kitSessionBean=new KitSessionBean();
		}
		
		if(this.kitSessionBean.getsUltimaBusquedaKit()!=null&&!this.kitSessionBean.getsUltimaBusquedaKit().equals("")) {
			this.setsAccionBusqueda(kitSessionBean.getsUltimaBusquedaKit());
			this.setiNumeroPaginacion(kitSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(kitSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(kitSessionBean.getid_empresa());
				kitSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(kitSessionBean.getid_sucursal());
				kitSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.kitSessionBean.setsUltimaBusquedaKit("");
		this.kitSessionBean.setiNumeroPaginacion(KitConstantesFunciones.INUMEROPAGINACION);
		this.kitSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaKit(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioKit() {
		this.updateBorderResaltarBusquedasFormularioKit();
		this.updateVisibilidadBusquedasFormularioKit();
		this.updateHabilitarBusquedasFormularioKit();
	}
	
	public void updateBorderResaltarBusquedasFormularioKit() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasKit.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioKit() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasKit.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioKit() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasKit.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaKit(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarKit.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioKit() throws Exception {

		if(this.jInternalFrameDetalleFormKit==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioKit();
		this.updateVisibilidadResaltarControlesFormularioKit();
		this.updateHabilitarResaltarControlesFormularioKit();
		
	}
	
	public void updateBorderResaltarControlesFormularioKit() throws Exception {
		if(this.jInternalFrameDetalleFormKit==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.kitConstantesFunciones.resaltaridKit!=null && this.jInternalFrameDetalleFormKit!=null) {this.jInternalFrameDetalleFormKit.jLabelidKit.setBorder(this.kitConstantesFunciones.resaltaridKit);}
		if(this.kitConstantesFunciones.resaltarid_empresaKit!=null && this.jInternalFrameDetalleFormKit!=null) {this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit.setBorder(this.kitConstantesFunciones.resaltarid_empresaKit);}
		if(this.kitConstantesFunciones.resaltarid_sucursalKit!=null && this.jInternalFrameDetalleFormKit!=null) {this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit.setBorder(this.kitConstantesFunciones.resaltarid_sucursalKit);}
		if(this.kitConstantesFunciones.resaltardescripcionKit!=null && this.jInternalFrameDetalleFormKit!=null) {this.jInternalFrameDetalleFormKit.jTextAreadescripcionKit.setBorder(this.kitConstantesFunciones.resaltardescripcionKit);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioKit() throws Exception {		
		if(this.jInternalFrameDetalleFormKit==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormKit!=null) {
	
		//this.jInternalFrameDetalleFormKit.jLabelidKit.setVisible(this.kitConstantesFunciones.mostraridKit);
		this.jInternalFrameDetalleFormKit.jPanelidKit.setVisible(this.kitConstantesFunciones.mostraridKit);
		//this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit.setVisible(this.kitConstantesFunciones.mostrarid_empresaKit);
		this.jInternalFrameDetalleFormKit.jPanelid_empresaKit.setVisible(this.kitConstantesFunciones.mostrarid_empresaKit);
		//this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit.setVisible(this.kitConstantesFunciones.mostrarid_sucursalKit);
		this.jInternalFrameDetalleFormKit.jPanelid_sucursalKit.setVisible(this.kitConstantesFunciones.mostrarid_sucursalKit);
		//this.jInternalFrameDetalleFormKit.jTextAreadescripcionKit.setVisible(this.kitConstantesFunciones.mostrardescripcionKit);
		this.jInternalFrameDetalleFormKit.jPaneldescripcionKit.setVisible(this.kitConstantesFunciones.mostrardescripcionKit);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioKit() throws Exception {
		if(this.jInternalFrameDetalleFormKit==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormKit!=null) {
	
		this.jInternalFrameDetalleFormKit.jLabelidKit.setEnabled(this.kitConstantesFunciones.activaridKit);
		this.jInternalFrameDetalleFormKit.jComboBoxid_empresaKit.setEnabled(this.kitConstantesFunciones.activarid_empresaKit);
		this.jInternalFrameDetalleFormKit.jComboBoxid_sucursalKit.setEnabled(this.kitConstantesFunciones.activarid_sucursalKit);
		this.jInternalFrameDetalleFormKit.jTextAreadescripcionKit.setEnabled(this.kitConstantesFunciones.activardescripcionKit);
		}
	}
	
		
}