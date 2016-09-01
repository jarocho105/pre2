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


import java.sql.Time;


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

import com.bydan.erp.puntoventa.util.CajaCierreConstantesFunciones;
import com.bydan.erp.puntoventa.util.CajaCierreParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.CajaCierreParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.CajaCierreBean;
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
public class CajaCierreBeanSwingJInternalFrame extends CajaCierreJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CajaCierreBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CajaCierre> cajacierreValidator = new ClassValidator<CajaCierre>(CajaCierre.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CajaCierre cajacierre;	
	public CajaCierre cajacierreAux;
	public CajaCierre cajacierreAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CajaCierre cajacierreTotales;
	public Long idCajaCierreActual;
	public Long iIdNuevoCajaCierre=0L;
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

	public String sFinalQueryComboCaja="";

	public List<Caja> cajasForeignKey;

	public List<Caja> getcajasForeignKey() {
		return cajasForeignKey;
	}

	public void setcajasForeignKey(List<Caja> cajasForeignKey) {
		this.cajasForeignKey = cajasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Caja cajaForeignKey;

	public Caja getcajaForeignKey() {
		return cajaForeignKey;
	}

	public void setcajaForeignKey(Caja cajaForeignKey) {
		this.cajaForeignKey = cajaForeignKey;
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
	
	public Boolean isPermisoTodoCajaCierre;
	public Boolean isPermisoNuevoCajaCierre;
	public Boolean isPermisoActualizarCajaCierre;
	public Boolean isPermisoActualizarOriginalCajaCierre;
	public Boolean isPermisoEliminarCajaCierre;
	public Boolean isPermisoGuardarCambiosCajaCierre;
	public Boolean isPermisoConsultaCajaCierre;
	public Boolean isPermisoBusquedaCajaCierre;
	public Boolean isPermisoReporteCajaCierre;
	public Boolean isPermisoPaginacionMedioCajaCierre;
	public Boolean isPermisoPaginacionAltoCajaCierre;
	public Boolean isPermisoPaginacionTodoCajaCierre;
	public Boolean isPermisoCopiarCajaCierre;
	public Boolean isPermisoVerFormCajaCierre;
	public Boolean isPermisoDuplicarCajaCierre;
	public Boolean isPermisoOrdenCajaCierre;
	
	
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
	
	public CajaCierreParameterReturnGeneral cajacierreReturnGeneral;
	public CajaCierreParameterReturnGeneral cajacierreParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCajaCierre=false;
	public Boolean esParaAccionDesdeFormularioCajaCierre=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CajaCierreSessionBeanAdditional cajacierreSessionBeanAdditional=null;
	
	public CajaCierreSessionBeanAdditional getCajaCierreSessionBeanAdditional() {
		return this.cajacierreSessionBeanAdditional;
	}
	
	public void setCajaCierreSessionBeanAdditional(CajaCierreSessionBeanAdditional cajacierreSessionBeanAdditional) {
		try {
			this.cajacierreSessionBeanAdditional=cajacierreSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CajaCierreBeanSwingJInternalFrameAdditional cajacierreBeanSwingJInternalFrameAdditional=null;
	//public class CajaCierreBeanSwingJInternalFrame
	
	public CajaCierreBeanSwingJInternalFrameAdditional getCajaCierreBeanSwingJInternalFrameAdditional() {
		return this.cajacierreBeanSwingJInternalFrameAdditional;
	}
	
	public void setCajaCierreBeanSwingJInternalFrameAdditional(CajaCierreBeanSwingJInternalFrameAdditional cajacierreBeanSwingJInternalFrameAdditional) {
		try {
			this.cajacierreBeanSwingJInternalFrameAdditional=cajacierreBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CajaCierreLogic cajacierreLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CajaCierre cajacierreBean;
	public CajaCierreConstantesFunciones cajacierreConstantesFunciones;
	//public CajaCierreParameterReturnGeneral cajacierreReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public CajaLogic cajaLogic;
	
	//PARAMETROS
	
	
	//public List<CajaCierre> cajacierres;	
	//public List<CajaCierre> cajacierresEliminados;
	//public List<CajaCierre> cajacierresAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCajaCierre=false;
	public Boolean isVisibilidadCeldaDuplicarCajaCierre=true;
	public Boolean isVisibilidadCeldaCopiarCajaCierre=true;
	public Boolean isVisibilidadCeldaVerFormCajaCierre=true;
	public Boolean isVisibilidadCeldaOrdenCajaCierre=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCajaCierre=false;
	public Boolean isVisibilidadCeldaModificarCajaCierre=false;
	public Boolean isVisibilidadCeldaActualizarCajaCierre=false;
	public Boolean isVisibilidadCeldaEliminarCajaCierre=false;
	public Boolean isVisibilidadCeldaCancelarCajaCierre=false;
	public Boolean isVisibilidadCeldaGuardarCajaCierre=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCajaCierre=false;	
	
	
	public Boolean isVisibilidadFK_IdCaja=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoCajaCierre() {
		return this.iIdNuevoCajaCierre;
	}

	public void setiIdNuevoCajaCierre(Long iIdNuevoCajaCierre) {
		this.iIdNuevoCajaCierre = iIdNuevoCajaCierre;
	}
	
	public Long getidCajaCierreActual() {
		return this.idCajaCierreActual;
	}

	public void setidCajaCierreActual(Long idCajaCierreActual) {
		this.idCajaCierreActual = idCajaCierreActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CajaCierre getcajacierre() {
		return this.cajacierre;
	}

	public void setcajacierre(CajaCierre cajacierre) {
		this.cajacierre = cajacierre;
	}
	
	public CajaCierre getcajacierreAux() {
		return this.cajacierreAux;
	}

	public void setcajacierreAux(CajaCierre cajacierreAux) {
		this.cajacierreAux = cajacierreAux;
	}				
	
	public CajaCierre getcajacierreAnterior() {
		return this.cajacierreAnterior;
	}

	public void setcajacierreAnterior(CajaCierre cajacierreAnterior) {
		this.cajacierreAnterior = cajacierreAnterior;
	}	
	
	public CajaCierre getcajacierreTotales() {
		return this.cajacierreTotales;
	}

	public void setcajacierreTotales(CajaCierre cajacierreTotales) {
		this.cajacierreTotales = cajacierreTotales;
	}	
	
	public CajaCierre getcajacierreBean() {
		return this.cajacierreBean;
	}

	public void setcajacierreBean(CajaCierre cajacierreBean) {
		this.cajacierreBean = cajacierreBean;
	}	
	
	public CajaCierreParameterReturnGeneral getcajacierreReturnGeneral() {
		return this.cajacierreReturnGeneral;
	}

	public void setcajacierreReturnGeneral(CajaCierreParameterReturnGeneral cajacierreReturnGeneral) {
		this.cajacierreReturnGeneral = cajacierreReturnGeneral;
	}	
	
	
	public Long id_cajaFK_IdCaja=-1L;

	public Long getid_cajaFK_IdCaja() {
		return this.id_cajaFK_IdCaja;
	}

	public void setid_cajaFK_IdCaja(Long id_cajaFK_IdCaja) {
		this.id_cajaFK_IdCaja = id_cajaFK_IdCaja;
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
	
	
	public CajaCierreLogic getCajaCierreLogic()	{		
		return cajacierreLogic;
	}

	public void setCajaCierreLogic(CajaCierreLogic cajacierreLogic) {
		this.cajacierreLogic = cajacierreLogic;
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
	
	public Boolean getIsEsNuevoCajaCierre() {
		return isEsNuevoCajaCierre;
	}

	public void setIsEsNuevoCajaCierre(Boolean isEsNuevoCajaCierre) {
		this.isEsNuevoCajaCierre = isEsNuevoCajaCierre;
	}

	public Boolean getEsParaAccionDesdeFormularioCajaCierre() {
		return esParaAccionDesdeFormularioCajaCierre;
	}
	
	public void setEsParaAccionDesdeFormularioCajaCierre(Boolean esParaAccionDesdeFormularioCajaCierre) {
		this.esParaAccionDesdeFormularioCajaCierre = esParaAccionDesdeFormularioCajaCierre;
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

			if(this.cajacierreSessionBean==null) {
				this.cajacierreSessionBean=new CajaCierreSessionBean();
			}

			if(!this.cajacierreSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cajacierreSessionBean.getlidEmpresaActual());
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

			if(this.cajacierreSessionBean==null) {
				this.cajacierreSessionBean=new CajaCierreSessionBean();
			}

			if(!this.cajacierreSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(cajacierreSessionBean.getlidSucursalActual());
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

	public void cargarCombosCajasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cajasForeignKey=new ArrayList<Caja>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CajaLogic cajaLogic=new CajaLogic();

			//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

			if(this.cajacierreSessionBean==null) {
				this.cajacierreSessionBean=new CajaCierreSessionBean();
			}

			if(!this.cajacierreSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

					cajaLogic.getTodosCajasWithConnection(sFinalQuery,new Pagination());

					this.cajasForeignKey=cajaLogic.getCajas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCaja(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaLogic.getEntityWithConnection(cajacierreSessionBean.getlidCajaActual());
					this.cajasForeignKey.add(cajaLogic.getCaja());
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

					if(this.cajacierre!=null) {
						this.cajacierre.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCajaCierre!=null) {
						this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCajaCierre.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCajaCierre!=null) {
						if(this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCajaCierreGenerico)throws Exception
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
				jComboBoxid_empresaCajaCierreGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCajaCierreGenerico!=null && jComboBoxid_empresaCajaCierreGenerico.getItemCount()>0) {
					jComboBoxid_empresaCajaCierreGenerico.setSelectedIndex(0);
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

					if(this.cajacierre!=null) {
						this.cajacierre.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCajaCierre!=null) {
						this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCajaCierre.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCajaCierre!=null) {
						if(this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCajaCierreGenerico)throws Exception
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
				jComboBoxid_sucursalCajaCierreGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCajaCierreGenerico!=null && jComboBoxid_sucursalCajaCierreGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCajaCierreGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCajaForeignKey(Long idCajaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cajaTemp!=null) {

					if(this.cajacierre!=null) {
						this.cajacierre.setCaja(cajaTemp);
					}

					if(this.jInternalFrameDetalleFormCajaCierre!=null) {
						this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre.setSelectedItem(cajaTemp);
					}
				} else {
					//jComboBoxid_cajaCajaCierre.setSelectedItem(cajaTemp);
					if(this.jInternalFrameDetalleFormCajaCierre!=null) {
						if(this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(cajaTemp!=null && jComboBoxid_cajaFK_IdCajaCajaCierre!=null) {
						jComboBoxid_cajaFK_IdCajaCajaCierre.setSelectedItem(cajaTemp);
					} else {
						if(jComboBoxid_cajaFK_IdCajaCajaCierre!=null) {
							//jComboBoxid_cajaFK_IdCajaCajaCierre.setSelectedItem(cajaTemp);
							if(jComboBoxid_cajaFK_IdCajaCajaCierre.getItemCount()>0) {
								jComboBoxid_cajaFK_IdCajaCajaCierre.setSelectedIndex(0);
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

	public String getActualCajaForeignKeyDescripcion(Long idCajaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}


			sDescripcion=CajaConstantesFunciones.getCajaDescripcion(cajaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCajaForeignKeyGenerico(Long idCajaSeleccionado,JComboBox jComboBoxid_cajaCajaCierreGenerico)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(cajaTemp!=null) {
				jComboBoxid_cajaCajaCierreGenerico.setSelectedItem(cajaTemp);
			} else {
				if(jComboBoxid_cajaCajaCierreGenerico!=null && jComboBoxid_cajaCajaCierreGenerico.getItemCount()>0) {
					jComboBoxid_cajaCajaCierreGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CajaCierre cajacierre,JComboBox jComboBoxid_empresaCajaCierreGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCajaCierreGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCajaCierreGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cajacierre.setid_empresa(empresaAux.getId());
				cajacierre.setempresa_descripcion(CajaCierreConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cajacierre.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CajaCierre cajacierre,JComboBox jComboBoxid_sucursalCajaCierreGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCajaCierreGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCajaCierreGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cajacierre.setid_sucursal(sucursalAux.getId());
				cajacierre.setsucursal_descripcion(CajaCierreConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cajacierre.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaForeignKey(CajaCierre cajacierre,JComboBox jComboBoxid_cajaCajaCierreGenerico)throws Exception
	{
		try
		{
			Caja  cajaAux=new Caja();

			if(jComboBoxid_cajaCajaCierreGenerico==null) {
				cajaAux=(Caja)this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre.getSelectedItem();
			} else {
				cajaAux=(Caja)jComboBoxid_cajaCajaCierreGenerico.getSelectedItem();
			}

			if(cajaAux!=null && cajaAux.getId()!=null) {
				cajacierre.setid_caja(cajaAux.getId());
				cajacierre.setcaja_descripcion(CajaCierreConstantesFunciones.getCajaDescripcion(cajaAux));
				cajacierre.setCaja(cajaAux);			}
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

					if(!CajaCierreJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaCierre!=null) { 
							this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaCierre!=null) { 
					}

					if(!CajaCierreJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CajaCierreJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaCierre!=null) { 
							this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaCierre!=null) { 
					}

					if(!CajaCierreJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCajasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCaja=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajaCierreJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaCierre!=null) { 
							this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre.addItem(caja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaCierre!=null) { 
					}

					if(!CajaCierreJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajaCierreJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cajaFK_IdCajaCajaCierre.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jComboBoxid_cajaFK_IdCajaCajaCierre.addItem(caja);
							}
						}

						if(!CajaCierreJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCajaCierre!=null) {
							this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaCierre!=null) {
							this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCajaCierre!=null) {
							this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaCierre!=null) {
							this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCajaForeignKey(Caja caja,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajaCierre!=null) {
							this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre.setSelectedItem(caja);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaCierre!=null) {
							this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cajaFK_IdCajaCajaCierre.setSelectedItem(caja);
						} else {
							this.jComboBoxid_cajaFK_IdCajaCajaCierre.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCajaCierre() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CajaCierreConstantesFunciones.refrescarForeignKeysDescripcionesCajaCierre(this.cajacierreLogic.getCajaCierres());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CajaCierreConstantesFunciones.refrescarForeignKeysDescripcionesCajaCierre(this.cajacierres);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Caja.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cajacierreLogic.setCajaCierres(this.cajacierres);
			cajacierreLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CajaCierreParameterReturnGeneral getCajaCierreParameterGeneral() {
		return this.cajacierreParameterGeneral;
	}
	
	public void setCajaCierreParameterGeneral(CajaCierreParameterReturnGeneral cajacierreParameterGeneral) {
		this.cajacierreParameterGeneral = cajacierreParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCajaCierre() {
		return isPermisoTodoCajaCierre;
	}

	public void setIsPermisoTodoCajaCierre(Boolean isPermisoTodoCajaCierre) {
		this.isPermisoTodoCajaCierre = isPermisoTodoCajaCierre;
	}

	public Boolean getIsPermisoNuevoCajaCierre() {
		return isPermisoNuevoCajaCierre;
	}

	public void setIsPermisoNuevoCajaCierre(Boolean isPermisoNuevoCajaCierre) {
		this.isPermisoNuevoCajaCierre = isPermisoNuevoCajaCierre;
	}

	public Boolean getIsPermisoActualizarCajaCierre() {
		return isPermisoActualizarCajaCierre;
	}

	public void setIsPermisoActualizarCajaCierre(Boolean isPermisoActualizarCajaCierre) {
		this.isPermisoActualizarCajaCierre = isPermisoActualizarCajaCierre;
	}

	public Boolean getIsPermisoEliminarCajaCierre() {
		return isPermisoEliminarCajaCierre;
	}

	public void setIsPermisoEliminarCajaCierre(Boolean isPermisoEliminarCajaCierre) {
		this.isPermisoEliminarCajaCierre = isPermisoEliminarCajaCierre;
	}

	public Boolean getIsPermisoGuardarCambiosCajaCierre() {
		return isPermisoGuardarCambiosCajaCierre;
	}

	public void setIsPermisoGuardarCambiosCajaCierre(Boolean isPermisoGuardarCambiosCajaCierre) {
		this.isPermisoGuardarCambiosCajaCierre = isPermisoGuardarCambiosCajaCierre;
	}
	
	public Boolean getIsPermisoConsultaCajaCierre() {
		return isPermisoConsultaCajaCierre;
	}

	public void setIsPermisoConsultaCajaCierre(Boolean isPermisoConsultaCajaCierre) {
		this.isPermisoConsultaCajaCierre = isPermisoConsultaCajaCierre;
	}

	public Boolean getIsPermisoBusquedaCajaCierre() {
		return isPermisoBusquedaCajaCierre;
	}

	public void setIsPermisoBusquedaCajaCierre(Boolean isPermisoBusquedaCajaCierre) {
		this.isPermisoBusquedaCajaCierre = isPermisoBusquedaCajaCierre;
	}

	public Boolean getIsPermisoReporteCajaCierre() {
		return isPermisoReporteCajaCierre;
	}

	public void setIsPermisoReporteCajaCierre(Boolean isPermisoReporteCajaCierre) {
		this.isPermisoReporteCajaCierre = isPermisoReporteCajaCierre;
	}
	
	public Boolean getIsPermisoPaginacionMedioCajaCierre() {
		return isPermisoPaginacionMedioCajaCierre;
	}

	public void setIsPermisoPaginacionMedioCajaCierre(Boolean isPermisoPaginacionMedioCajaCierre) {
		this.isPermisoPaginacionMedioCajaCierre = isPermisoPaginacionMedioCajaCierre;
	}
	
	public Boolean getIsPermisoPaginacionTodoCajaCierre() {
		return isPermisoPaginacionTodoCajaCierre;
	}

	public void setIsPermisoPaginacionTodoCajaCierre(Boolean isPermisoPaginacionTodoCajaCierre) {
		this.isPermisoPaginacionTodoCajaCierre = isPermisoPaginacionTodoCajaCierre;
	}
	
	public Boolean getIsPermisoPaginacionAltoCajaCierre() {
		return isPermisoPaginacionAltoCajaCierre;
	}

	public void setIsPermisoPaginacionAltoCajaCierre(Boolean isPermisoPaginacionAltoCajaCierre) {
		this.isPermisoPaginacionAltoCajaCierre = isPermisoPaginacionAltoCajaCierre;
	}
	
	public Boolean getIsPermisoCopiarCajaCierre() {
		return isPermisoCopiarCajaCierre;
	}

	public void setIsPermisoCopiarCajaCierre(Boolean isPermisoCopiarCajaCierre) {
		this.isPermisoCopiarCajaCierre = isPermisoCopiarCajaCierre;
	}
	
	public Boolean getIsPermisoVerFormCajaCierre() {
		return isPermisoVerFormCajaCierre;
	}

	public void setIsPermisoVerFormCajaCierre(Boolean isPermisoVerFormCajaCierre) {
		this.isPermisoVerFormCajaCierre = isPermisoVerFormCajaCierre;
	}
	
	public Boolean getIsPermisoDuplicarCajaCierre() {
		return isPermisoDuplicarCajaCierre;
	}

	public void setIsPermisoDuplicarCajaCierre(Boolean isPermisoDuplicarCajaCierre) {
		this.isPermisoDuplicarCajaCierre = isPermisoDuplicarCajaCierre;
	}
	
	public Boolean getIsPermisoOrdenCajaCierre() {
		return isPermisoOrdenCajaCierre;
	}

	public void setIsPermisoOrdenCajaCierre(Boolean isPermisoOrdenCajaCierre) {
		this.isPermisoOrdenCajaCierre = isPermisoOrdenCajaCierre;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCajaCierre() {
		return isVisibilidadCeldaNuevoCajaCierre;
	}

	public void setIsVisibilidadCeldaNuevoCajaCierre(Boolean isVisibilidadCeldaNuevoCajaCierre) {
		this.isVisibilidadCeldaNuevoCajaCierre = isVisibilidadCeldaNuevoCajaCierre;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCajaCierre() {
		return isVisibilidadCeldaDuplicarCajaCierre;
	}

	public void setIsVisibilidadCeldaDuplicarCajaCierre(Boolean isVisibilidadCeldaDuplicarCajaCierre) {
		this.isVisibilidadCeldaDuplicarCajaCierre = isVisibilidadCeldaDuplicarCajaCierre;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCajaCierre() {
		return isVisibilidadCeldaCopiarCajaCierre;
	}

	public void setIsVisibilidadCeldaCopiarCajaCierre(Boolean isVisibilidadCeldaCopiarCajaCierre) {
		this.isVisibilidadCeldaCopiarCajaCierre = isVisibilidadCeldaCopiarCajaCierre;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCajaCierre() {
		return isVisibilidadCeldaVerFormCajaCierre;
	}

	public void setIsVisibilidadCeldaVerFormCajaCierre(Boolean isVisibilidadCeldaVerFormCajaCierre) {
		this.isVisibilidadCeldaVerFormCajaCierre = isVisibilidadCeldaVerFormCajaCierre;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCajaCierre() {
		return isVisibilidadCeldaOrdenCajaCierre;
	}

	public void setIsVisibilidadCeldaOrdenCajaCierre(Boolean isVisibilidadCeldaOrdenCajaCierre) {
		this.isVisibilidadCeldaOrdenCajaCierre = isVisibilidadCeldaOrdenCajaCierre;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCajaCierre() {
		return isVisibilidadCeldaNuevoRelacionesCajaCierre;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCajaCierre(Boolean isVisibilidadCeldaNuevoRelacionesCajaCierre) {
		this.isVisibilidadCeldaNuevoRelacionesCajaCierre = isVisibilidadCeldaNuevoRelacionesCajaCierre;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCajaCierre() {
		return isVisibilidadCeldaModificarCajaCierre;
	}

	public void setIsVisibilidadCeldaModificarCajaCierre(Boolean isVisibilidadCeldaModificarCajaCierre) {
		this.isVisibilidadCeldaModificarCajaCierre = isVisibilidadCeldaModificarCajaCierre;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCajaCierre() {
		return isVisibilidadCeldaActualizarCajaCierre;
	}

	public void setIsVisibilidadCeldaActualizarCajaCierre(Boolean isVisibilidadCeldaActualizarCajaCierre) {
		this.isVisibilidadCeldaActualizarCajaCierre = isVisibilidadCeldaActualizarCajaCierre;
	}

	public Boolean getIsVisibilidadCeldaEliminarCajaCierre() {
		return isVisibilidadCeldaEliminarCajaCierre;
	}

	public void setIsVisibilidadCeldaEliminarCajaCierre(Boolean isVisibilidadCeldaEliminarCajaCierre) {
		this.isVisibilidadCeldaEliminarCajaCierre = isVisibilidadCeldaEliminarCajaCierre;
	}

	public Boolean getIsVisibilidadCeldaCancelarCajaCierre() {
		return isVisibilidadCeldaCancelarCajaCierre;
	}

	public void setIsVisibilidadCeldaCancelarCajaCierre(Boolean isVisibilidadCeldaCancelarCajaCierre) {
		this.isVisibilidadCeldaCancelarCajaCierre = isVisibilidadCeldaCancelarCajaCierre;
	}

	public Boolean getIsVisibilidadCeldaGuardarCajaCierre() {
		return isVisibilidadCeldaGuardarCajaCierre;
	}

	public void setIsVisibilidadCeldaGuardarCajaCierre(Boolean isVisibilidadCeldaGuardarCajaCierre) {
		this.isVisibilidadCeldaGuardarCajaCierre = isVisibilidadCeldaGuardarCajaCierre;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCajaCierre() {
		return isVisibilidadCeldaGuardarCambiosCajaCierre;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCajaCierre(Boolean isVisibilidadCeldaGuardarCambiosCajaCierre) {
		this.isVisibilidadCeldaGuardarCambiosCajaCierre = isVisibilidadCeldaGuardarCambiosCajaCierre;
	}
		
	public CajaCierreSessionBean getcajacierreSessionBean() {
		return this.cajacierreSessionBean;
	}
	
	public void setcajacierreSessionBean(CajaCierreSessionBean cajacierreSessionBean) {
		this.cajacierreSessionBean=cajacierreSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCaja() {
		return this.isVisibilidadFK_IdCaja;
	}

	public void setisVisibilidadFK_IdCaja(Boolean isVisibilidadFK_IdCaja) {
		this.isVisibilidadFK_IdCaja=isVisibilidadFK_IdCaja;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCajaCierre(CajaCierre cajacierre)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cajacierre,null);
				this.setActualParaGuardarSucursalForeignKey(cajacierre,null);
				this.setActualParaGuardarCajaForeignKey(cajacierre,null);
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
	
	public void bugActualizarReferenciaActual(CajaCierre cajacierre,CajaCierre cajacierreAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCajaCierre(cajacierre);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cajacierreAux.setId(cajacierre.getId());
		cajacierreAux.setVersionRow(cajacierre.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCajaCierre();
		
			int intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CajaCierreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCajaCierre(this.cajacierre,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cajacierreValidator.getInvalidValues(this.cajacierre);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cajacierreLogic.setDatosCliente(datosCliente);
			cajacierreLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cajacierreAux=new  CajaCierre();
				
				cajacierreAux.setIsNew(true);
				cajacierreAux.setIsChanged(true);
				
				cajacierreAux.setCajaCierreOriginal(this.cajacierre);
				
				cajacierreAux.setId(this.cajacierre.getId());	
				cajacierreAux.setVersionRow(this.cajacierre.getVersionRow());	
				cajacierreAux.setid_empresa(this.cajacierre.getid_empresa());	
				cajacierreAux.setid_sucursal(this.cajacierre.getid_sucursal());	
				cajacierreAux.setid_caja(this.cajacierre.getid_caja());	
				cajacierreAux.setfecha_cierre(this.cajacierre.getfecha_cierre());	
				cajacierreAux.sethora_cierre(this.cajacierre.gethora_cierre());	
				cajacierreAux.setesta_activo(this.cajacierre.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajacierreSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajacierreSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cajacierreAux,cajacierreLogic.getCajaCierres());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajacierreAux,cajacierres);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cajacierreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajacierreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajacierreLogic.saveCajaCierres();//WithConnection
						//cajacierreLogic.getSetVersionRowCajaCierres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cajacierre,cajacierreAux);
					
					this.refrescarForeignKeysDescripcionesCajaCierre();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajacierreSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajacierreLogic.saveCajaCierreRelaciones(cajacierreAux);//WithConnection
								//cajacierreLogic.getSetVersionRowCajaCierres();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cajacierre,cajacierreAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cajacierreSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cajacierreSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cajacierreAux,cajacierreLogic.getCajaCierres());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cajacierreAux,cajacierres);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cajacierre,cajacierreAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cajacierreAux=new  CajaCierre();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cajacierreSessionBean.getEsGuardarRelacionado() 
					|| (this.cajacierreSessionBean.getEsGuardarRelacionado() && this.cajacierre.getId()>=0)) {
						
					cajacierreAux.setIsNew(false);
				}
				
				cajacierreAux.setIsDeleted(false);
			
				cajacierreAux.setId(this.cajacierre.getId());	
				cajacierreAux.setVersionRow(this.cajacierre.getVersionRow());	
				cajacierreAux.setid_empresa(this.cajacierre.getid_empresa());	
				cajacierreAux.setid_sucursal(this.cajacierre.getid_sucursal());	
				cajacierreAux.setid_caja(this.cajacierre.getid_caja());	
				cajacierreAux.setfecha_cierre(this.cajacierre.getfecha_cierre());	
				cajacierreAux.sethora_cierre(this.cajacierre.gethora_cierre());	
				cajacierreAux.setesta_activo(this.cajacierre.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajacierreAux,cajacierreLogic.getCajaCierres());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajacierreAux,cajacierres);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cajacierreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajacierreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajacierreLogic.saveCajaCierres();//WithConnection
						//cajacierreLogic.getSetVersionRowCajaCierres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cajacierre,cajacierreAux);
					
					this.refrescarForeignKeysDescripcionesCajaCierre();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajacierreSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajacierreLogic.saveCajaCierreRelaciones(cajacierreAux);//WithConnection
								//cajacierreLogic.getSetVersionRowCajaCierres();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cajacierre,cajacierreAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cajacierreSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cajacierreSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cajacierreAux,cajacierreLogic.getCajaCierres());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cajacierreAux,cajacierres);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cajacierre,cajacierreAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cajacierreAux=new  CajaCierre();
				
				cajacierreAux.setIsNew(false);
				cajacierreAux.setIsChanged(false);
				
				cajacierreAux.setIsDeleted(true);
				
				cajacierreAux.setId(this.cajacierre.getId());	
				cajacierreAux.setVersionRow(this.cajacierre.getVersionRow());	
				cajacierreAux.setid_empresa(this.cajacierre.getid_empresa());	
				cajacierreAux.setid_sucursal(this.cajacierre.getid_sucursal());	
				cajacierreAux.setid_caja(this.cajacierre.getid_caja());	
				cajacierreAux.setfecha_cierre(this.cajacierre.getfecha_cierre());	
				cajacierreAux.sethora_cierre(this.cajacierre.gethora_cierre());	
				cajacierreAux.setesta_activo(this.cajacierre.getesta_activo());	
				
				if(this.cajacierreSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cajacierreAux.getId()>=0) {	
						this.cajacierresEliminados.add(cajacierreAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cajacierreAux,cajacierreLogic.getCajaCierres());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajacierreAux,cajacierres);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cajacierreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajacierreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajacierreLogic.saveCajaCierres();//WithConnection
						//cajacierreLogic.getSetVersionRowCajaCierres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajacierreSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajacierreLogic.saveCajaCierreRelaciones(cajacierreAux);//WithConnection
								//cajacierreLogic.getSetVersionRowCajaCierres();//WithConnection
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
							if(this.cajacierreSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cajacierreSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cajacierreAux,cajacierreLogic.getCajaCierres());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cajacierreAux,cajacierres);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.getCajaCierres().addAll(this.cajacierresEliminados);
					
					cajacierreLogic.saveCajaCierres();//WithConnection
					//cajacierreLogic.getSetVersionRowCajaCierres();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCajaCierre();
				
				this.cajacierresEliminados= new ArrayList<CajaCierre>();		
			}
			
			if(this.cajacierreSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajacierreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Caja Cierre GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Caja Cierre",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cajacierre=cajacierreAux;
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
      		//this.finishProcessCajaCierre();
      	}
		
	}	
	
	public void actualizarRelaciones(CajaCierre cajacierreLocal) throws Exception {
		
		if(this.cajacierreSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CajaCierre cajacierreLocal) throws Exception {	
		if(this.cajacierreSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cajacierreLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cajacierreLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CajaDetalleFormJInternalFrame.class)) {
				CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrameLocal=(CajaBeanSwingJInternalFrame) ((CajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCaja(cajaBeanSwingJInternalFrameLocal.getcaja(),true);
				cajaBeanSwingJInternalFrameLocal.actualizarLista(cajaBeanSwingJInternalFrameLocal.caja,this.cajasForeignKey);

				cajaBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaBeanSwingJInternalFrameLocal.caja);

				cajacierreLocal.setCaja(cajaBeanSwingJInternalFrameLocal.caja);

				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey("Formulario");
				this.setActualCajaForeignKey(cajaBeanSwingJInternalFrameLocal.caja.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCajaCierreActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cajacierreValidator.getInvalidValues(this.cajacierre);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CajaCierre cajacierre,List<CajaCierre> cajacierres) throws Exception {
		try	{		
			CajaCierreConstantesFunciones.actualizarLista(cajacierre,cajacierres,this.cajacierreSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CajaCierre cajacierre,List<CajaCierre> cajacierres) throws Exception {
		try	{			
			CajaCierreConstantesFunciones.actualizarSelectedLista(cajacierre,cajacierres);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CajaCierre> cajacierresLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cajacierresLocal=this.cajacierreLogic.getCajaCierres();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cajacierresLocal=this.cajacierres;
			}
			//ARCHITECTURE
		
			for(CajaCierre cajacierreLocal:cajacierresLocal) {
				if(this.permiteMantenimiento(cajacierreLocal) && cajacierreLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CajaCierreConstantesFunciones.getCajaCierreLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CajaCierreConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaCierre.jLabelid_empresaCajaCierre,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaCierreConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaCierre.jLabelid_sucursalCajaCierre,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaCierreConstantesFunciones.IDCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaCierre.jLabelid_cajaCajaCierre,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaCierreConstantesFunciones.FECHACIERRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaCierre.jLabelfecha_cierreCajaCierre,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaCierreConstantesFunciones.HORACIERRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaCierre.jLabelhora_cierreCajaCierre,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaCierreConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaCierre.jLabelesta_activoCajaCierre,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaCierre.jLabelid_empresaCajaCierre,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaCierre.jLabelid_sucursalCajaCierre,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaCierre.jLabelid_cajaCajaCierre,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaCierre.jLabelfecha_cierreCajaCierre,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaCierre.jLabelhora_cierreCajaCierre,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaCierre.jLabelesta_activoCajaCierre,"");
		
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
		this.iIdNuevoCajaCierre--;	
		
		
		this.cajacierreAux=new CajaCierre();
		
		this.cajacierreAux.setId(this.iIdNuevoCajaCierre);
		this.cajacierreAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajacierreLogic.getCajaCierres().add(this.cajacierreAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cajacierres.add(this.cajacierreAux);
		}
		//ARCHITECTURE
		
		this.cajacierre=this.cajacierreAux;
		
		if(CajaCierreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCajaCierre(this.cajacierre);
			this.setVariablesObjetoActualToFormularioForeignKeyCajaCierre(this.cajacierre);
		}
				
		//this.setDefaultControlesCajaCierre();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCajaCierre();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCajaCierre();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajaCierre();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajaCierre(this.cajacierreBean,this.cajacierre,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CajaCierreConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cajacierreSessionBean.getConGuardarRelaciones()) {
			classes=CajaCierreConstantesFunciones.getClassesRelationshipsOfCajaCierre(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cajacierreReturnGeneral=cajacierreLogic.procesarEventosCajaCierresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajacierreLogic.getCajaCierres(),this.cajacierre,this.cajacierreParameterGeneral,this.isEsNuevoCajaCierre,classes);//this.cajacierreLogic.getCajaCierre()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCajaCierre(this.cajacierreReturnGeneral,this.cajacierreBean,false);
		
		if(this.cajacierreReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCajaCierre(this.cajacierreReturnGeneral.getCajaCierre());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCajaCierre(this.cajacierreReturnGeneral.getCajaCierre());
		}
		
		if(this.cajacierreReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCajaCierre(this.cajacierreReturnGeneral.getCajaCierre(),classes);//this.cajacierreBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCajaCierre(this.cajacierre,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCajaCierre();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCajaCierre();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajaCierreBeanSwingJInternalFrameAdditional.RecargarFormCajaCierre(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCajaCierre(false);
						
			if(cajacierreSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CajaCierreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaCierre();
			}
			
			this.actualizarVisualTableDatosCajaCierre();
			
			this.jTableDatosCajaCierre.setRowSelectionInterval(this.getIndiceNuevoCajaCierre(), this.getIndiceNuevoCajaCierre());
			
			this.seleccionarFilaTablaCajaCierreActual();
						
			this.actualizarEstadoCeldasBotonesCajaCierre("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCajaCierre(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCajaCierre.jDateChooserfecha_cierreCajaCierre.setEnabled(isHabilitar && this.cajacierreConstantesFunciones.activarfecha_cierreCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jSpinnerhora_cierreCajaCierre.setEnabled(isHabilitar && this.cajacierreConstantesFunciones.activarhora_cierreCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jCheckBoxesta_activoCajaCierre.setEnabled(isHabilitar && this.cajacierreConstantesFunciones.activaresta_activoCajaCierre);	
		//
		this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre.setEnabled(isHabilitar && this.cajacierreConstantesFunciones.activarid_empresaCajaCierre);//
		this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre.setEnabled(isHabilitar && this.cajacierreConstantesFunciones.activarid_sucursalCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre.setEnabled(isHabilitar && this.cajacierreConstantesFunciones.activarid_cajaCajaCierre);
	};
	
	public void setDefaultControlesCajaCierre() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCajaCierre(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cajacierreSessionBean.setConGuardarRelaciones(true);			
			this.cajacierreSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCajaCierre.jTabbedPaneRelacionesCajaCierre.setVisible(true);
			
					
		} else {
			//this.cajacierreSessionBean.setConGuardarRelaciones(false);			
			this.cajacierreSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCajaCierre.jTabbedPaneRelacionesCajaCierre.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCajaCierre() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaCierre cajacierreAux:this.cajacierreLogic.getCajaCierres()) {
				if(cajacierreAux.getId().equals(this.iIdNuevoCajaCierre)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaCierre cajacierreAux:this.cajacierres) {
				if(cajacierreAux.getId().equals(this.iIdNuevoCajaCierre)) {
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
	
	public int getIndiceActualCajaCierre(CajaCierre cajacierre,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaCierre cajacierreAux:this.cajacierreLogic.getCajaCierres()) {
				if(cajacierreAux.getId().equals(cajacierre.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaCierre cajacierreAux:this.cajacierres) {
				if(cajacierreAux.getId().equals(cajacierre.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCajaCierre(CajaCierre cajacierreOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaCierre cajacierreAux:this.cajacierreLogic.getCajaCierres()) {
				if(cajacierreAux.getCajaCierreOriginal().getId().equals(cajacierreOriginal.getId())) {
					existe=true;
					cajacierreOriginal.setId(cajacierreAux.getId());
					cajacierreOriginal.setVersionRow(cajacierreAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaCierre cajacierreAux:this.cajacierres) {
				if(cajacierreAux.getCajaCierreOriginal().getId().equals(cajacierreOriginal.getId())) {
					existe=true;
					cajacierreOriginal.setId(cajacierreAux.getId());
					cajacierreOriginal.setVersionRow(cajacierreAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCajaCierre(Boolean esParaCancelar) throws Exception {
		cajacierresAux=new ArrayList<CajaCierre>();
		cajacierreAux=new CajaCierre();
		
		if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajaCierre cajacierreAux:this.cajacierreLogic.getCajaCierres()) {
					if(cajacierreAux.getId()<0) {
						cajacierresAux.add(cajacierreAux);
					}		
				}
				this.iIdNuevoCajaCierre=0L;
				this.cajacierreLogic.getCajaCierres().removeAll(cajacierresAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaCierre cajacierreAux:this.cajacierres) {
					if(cajacierreAux.getId()<0) {
						cajacierresAux.add(cajacierreAux);
					}		
				}
				this.iIdNuevoCajaCierre=0L;
				this.cajacierres.removeAll(cajacierresAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCajaCierre 
					&& this.cajacierreLogic.getCajaCierres().size()>0
					) {
					cajacierreAux=this.cajacierreLogic.getCajaCierres().get(this.cajacierreLogic.getCajaCierres().size() - 1);
				
					if(cajacierreAux.getId()<0) {
						this.cajacierreLogic.getCajaCierres().remove(cajacierreAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCajaCierre && this.cajacierres.size()>0) {
					cajacierreAux=this.cajacierres.get(this.cajacierres.size() - 1);
				
					if(cajacierreAux.getId()<0) {
						this.cajacierres.remove(cajacierreAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCajaCierre(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cajacierre.getId()<0) {
				this.cajacierreLogic.getCajaCierres().remove(this.cajacierre);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cajacierre.getId()<0) {
				this.cajacierres.remove(this.cajacierre);
			}
		}			
	}
	
	public void setEstadosInicialesCajaCierre(List<CajaCierre> cajacierresAux) throws Exception {
		CajaCierreConstantesFunciones.setEstadosInicialesCajaCierre(cajacierresAux);
	}
	
	public void setEstadosInicialesCajaCierre(CajaCierre cajacierreAux) throws Exception {
		CajaCierreConstantesFunciones.setEstadosInicialesCajaCierre(cajacierreAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCajaCierreActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCajaCierre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCajaCierreActual()) {
				if(!this.isEsNuevoCajaCierre) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCajaCierre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCajaCierre=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCajaCierreActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Caja Cierre ?", "MANTENIMIENTO DE Caja Cierre", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCajaCierre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CajaCierre cajacierre) throws Exception {
		CajaCierreConstantesFunciones.seleccionarAsignar(this.cajacierre,cajacierre);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCajaCierre=this.isPermisoActualizarOriginalCajaCierre;
			
			
			this.seleccionarAsignar(cajacierre);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajaCierreConstantesFunciones.quitarEspaciosCajaCierre(this.cajacierre,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCajaCierre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cajacierreSessionBean.setsFuncionBusquedaRapida(this.cajacierreSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCajaCierre) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCajaCierre(esParaCancelar);				
				this.cancelarNuevoCajaCierre(esParaCancelar);								
			}
			
			this.cajacierre=new CajaCierre();
			
			this.inicializarCajaCierre();
			
			this.actualizarEstadoCeldasBotonesCajaCierre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCajaCierre() throws Exception {
		try {
			CajaCierreConstantesFunciones.inicializarCajaCierre(this.cajacierre);
			
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
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cajacierreLogic.getCajaCierres().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCajaCierres(String sAccionBusqueda,List<CajaCierre> cajacierresParaReportes) throws Exception {
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
					sPathReporteFinal="CajaCierre"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CajaCierreMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CajaCierreMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CajaCierre"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Caja Cierres");		
		parameters.put("busquedapor", CajaCierreConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCajaCierre=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CajaCierreConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CajaCierreConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCajaCierre=new JRBeanArrayDataSource(CajaCierreJInternalFrame.TraerCajaCierreBeans(cajacierresParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCajaCierre);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CajaCierreConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CajaCierreConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CajaCierreBean.TraerCajaCierreBeans(cajacierresParaReportes).toArray()));
							
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
				this.generarExcelReporteCajaCierres(sAccionBusqueda,sTipoArchivoReporte,cajacierresParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCajaCierres(sAccionBusqueda,sTipoArchivoReporte,cajacierresParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCajaCierreActionPerformed(null);
					//this.generarExcelReporteCajaCierres(sAccionBusqueda,sTipoArchivoReporte,cajacierresParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCajaCierres(sAccionBusqueda,sTipoArchivoReporte,cajacierresParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCajaCierres(sAccionBusqueda,sTipoArchivoReporte,cajacierresParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCajaCierres(sAccionBusqueda,sTipoArchivoReporte,cajacierresParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCajaCierres(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaCierre> cajacierresParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajacierre";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaCierres");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajaCierre("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CajaCierre cajacierre : cajacierresParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CajaCierreConstantesFunciones.generarExcelReporteDataCajaCierre("NORMAL",row,workbook,cajacierre,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajacierreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Cierre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCajaCierre(String sTipo,Row row,Workbook workbook) {
		
		CajaCierreConstantesFunciones.generarExcelReporteHeaderCajaCierre(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCajaCierres(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaCierre> cajacierresParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajacierre_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaCierres");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CajaCierre cajacierre : cajacierresParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CajaCierreConstantesFunciones.getCajaCierreDescripcion(cajacierre));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaCierreConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaCierreConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajacierre.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaCierreConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaCierreConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajacierre.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaCierreConstantesFunciones.LABEL_IDCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaCierreConstantesFunciones.LABEL_IDCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajacierre.getcaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaCierreConstantesFunciones.LABEL_FECHACIERRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaCierreConstantesFunciones.LABEL_FECHACIERRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajacierre.getfecha_cierre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaCierreConstantesFunciones.LABEL_HORACIERRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaCierreConstantesFunciones.LABEL_HORACIERRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajacierre.gethora_cierre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaCierreConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaCierreConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(cajacierre.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajacierreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Cierre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCajaCierres(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaCierre> cajacierresParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CajaCierre> cajacierresRespaldo=null;
		
		classes=CajaCierreConstantesFunciones.getClassesRelationshipsOfCajaCierre(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cajacierreLogic.setDatosCliente(this.datosCliente);
		this.cajacierreLogic.setDatosDeep(this.datosDeep);
		this.cajacierreLogic.setIsConDeep(true);
		
		cajacierresRespaldo=this.cajacierreLogic.getCajaCierres();
		
		this.cajacierreLogic.setCajaCierres(cajacierresParaReportes);	
		this.cajacierreLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cajacierresParaReportes=this.cajacierreLogic.getCajaCierres();
		this.cajacierreLogic.setCajaCierres(cajacierresRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajacierre_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaCierres");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajaCierre("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CajaCierre cajacierre : cajacierresParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCajaCierre("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CajaCierreConstantesFunciones.generarExcelReporteDataCajaCierre("NORMAL",row,workbook,cajacierre,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CajaCierreConstantesFunciones.getCajaCierreDescripcion(cajacierre));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajacierreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Cierre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajaCierre.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaCierre.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajaCierre.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaCierre.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCajaCierre() throws Exception {		
		this.startProcessCajaCierre(true);
	}
	
	public void startProcessCajaCierre(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCajaCierre ,this.jPanelParametrosReportesCajaCierre, this.jScrollPanelDatosCajaCierre,this.jPanelPaginacionCajaCierre, this.jScrollPanelDatosEdicionCajaCierre, this.jPanelAccionesCajaCierre,this.jPanelAccionesFormularioCajaCierre,this.jmenuBarCajaCierre,this.jmenuBarDetalleCajaCierre,this.jTtoolBarCajaCierre,this.jTtoolBarDetalleCajaCierre);		
		
		final JTabbedPane jTabbedPaneBusquedasCajaCierre=this.jTabbedPaneBusquedasCajaCierre; 
		
		final JPanel jPanelParametrosReportesCajaCierre=this.jPanelParametrosReportesCajaCierre;
		//final JScrollPane jScrollPanelDatosCajaCierre=this.jScrollPanelDatosCajaCierre;
		final JTable jTableDatosCajaCierre=this.jTableDatosCajaCierre;		
		final JPanel jPanelPaginacionCajaCierre=this.jPanelPaginacionCajaCierre;
		//final JScrollPane jScrollPanelDatosEdicionCajaCierre=this.jScrollPanelDatosEdicionCajaCierre;
		final JPanel jPanelAccionesCajaCierre=this.jPanelAccionesCajaCierre;
		
		JPanel jPanelCamposAuxiliarCajaCierre=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCajaCierre=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) {
			jPanelCamposAuxiliarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jPanelCamposCajaCierre;
			jPanelAccionesFormularioAuxiliarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jPanelAccionesFormularioCajaCierre;
		}
		
		final JPanel jPanelCamposCajaCierre=jPanelCamposAuxiliarCajaCierre;
		final JPanel jPanelAccionesFormularioCajaCierre=jPanelAccionesFormularioAuxiliarCajaCierre;
		
		
		final JMenuBar jmenuBarCajaCierre=this.jmenuBarCajaCierre;
		final JToolBar jTtoolBarCajaCierre=this.jTtoolBarCajaCierre;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCajaCierre=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajaCierre=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) {
			jmenuBarDetalleAuxiliarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jmenuBarDetalleCajaCierre;
			jTtoolBarDetalleAuxiliarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jTtoolBarDetalleCajaCierre;
		}
		
		final JMenuBar jmenuBarDetalleCajaCierre=jmenuBarDetalleAuxiliarCajaCierre;
		final JToolBar jTtoolBarDetalleCajaCierre=jTtoolBarDetalleAuxiliarCajaCierre;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajaCierre;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajaCierre;
			processRunnable.jTableDatos=jTableDatosCajaCierre;
			processRunnable.jPanelCampos=jPanelCamposCajaCierre;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajaCierre;
			processRunnable.jPanelAcciones=jPanelAccionesCajaCierre;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajaCierre;
			
			
			processRunnable.jmenuBar=jmenuBarCajaCierre;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajaCierre;
			processRunnable.jTtoolBar=jTtoolBarCajaCierre;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajaCierre;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajaCierre ,jPanelParametrosReportesCajaCierre,jTableDatosCajaCierre, /*jScrollPanelDatosCajaCierre,*/jPanelCamposCajaCierre,jPanelPaginacionCajaCierre, /*jScrollPanelDatosEdicionCajaCierre,*/ jPanelAccionesCajaCierre,jPanelAccionesFormularioCajaCierre,jmenuBarCajaCierre,jmenuBarDetalleCajaCierre,jTtoolBarCajaCierre,jTtoolBarDetalleCajaCierre);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajaCierre ,jPanelParametrosReportesCajaCierre, jScrollPanelDatosCajaCierre,jPanelPaginacionCajaCierre, jScrollPanelDatosEdicionCajaCierre, jPanelAccionesCajaCierre,jPanelAccionesFormularioCajaCierre,jmenuBarCajaCierre,jmenuBarDetalleCajaCierre,jTtoolBarCajaCierre,jTtoolBarDetalleCajaCierre);
						
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
	
	public void finishProcessCajaCierre() {// throws Exception 
		this.finishProcessCajaCierre(true);
	}
	
	public void finishProcessCajaCierre(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCajaCierre ,this.jPanelParametrosReportesCajaCierre, this.jScrollPanelDatosCajaCierre,this.jPanelPaginacionCajaCierre, this.jScrollPanelDatosEdicionCajaCierre, this.jPanelAccionesCajaCierre,this.jPanelAccionesFormularioCajaCierre,this.jmenuBarCajaCierre,this.jmenuBarDetalleCajaCierre,this.jTtoolBarCajaCierre,this.jTtoolBarDetalleCajaCierre);		
		
		final JTabbedPane jTabbedPaneBusquedasCajaCierre=this.jTabbedPaneBusquedasCajaCierre; 
		
		final JPanel jPanelParametrosReportesCajaCierre=this.jPanelParametrosReportesCajaCierre;
		//final JScrollPane jScrollPanelDatosCajaCierre=this.jScrollPanelDatosCajaCierre;
		final JTable jTableDatosCajaCierre=this.jTableDatosCajaCierre;		
		final JPanel jPanelPaginacionCajaCierre=this.jPanelPaginacionCajaCierre;
		//final JScrollPane jScrollPanelDatosEdicionCajaCierre=this.jScrollPanelDatosEdicionCajaCierre;
		final JPanel jPanelAccionesCajaCierre=this.jPanelAccionesCajaCierre;
		
		JPanel jPanelCamposAuxiliarCajaCierre=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCajaCierre=new JPanel();
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) {
			jPanelCamposAuxiliarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jPanelCamposCajaCierre;
			jPanelAccionesFormularioAuxiliarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jPanelAccionesFormularioCajaCierre;
		}
		
		final JPanel jPanelCamposCajaCierre=jPanelCamposAuxiliarCajaCierre;
		final JPanel jPanelAccionesFormularioCajaCierre=jPanelAccionesFormularioAuxiliarCajaCierre;
		
		
		final JMenuBar jmenuBarCajaCierre=this.jmenuBarCajaCierre;		
		final JToolBar jTtoolBarCajaCierre=this.jTtoolBarCajaCierre;
				
		JMenuBar jmenuBarDetalleAuxiliarCajaCierre=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajaCierre=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) {
			jmenuBarDetalleAuxiliarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jmenuBarDetalleCajaCierre;
			jTtoolBarDetalleAuxiliarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jTtoolBarDetalleCajaCierre;		
		}
		
		final JMenuBar jmenuBarDetalleCajaCierre=jmenuBarDetalleAuxiliarCajaCierre;
		final JToolBar jTtoolBarDetalleCajaCierre=jTtoolBarDetalleAuxiliarCajaCierre;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajaCierre;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajaCierre;
			processRunnable.jTableDatos=jTableDatosCajaCierre;
			processRunnable.jPanelCampos=jPanelCamposCajaCierre;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajaCierre;
			processRunnable.jPanelAcciones=jPanelAccionesCajaCierre;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajaCierre;
			
			
			processRunnable.jmenuBar=jmenuBarCajaCierre;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajaCierre;
			processRunnable.jTtoolBar=jTtoolBarCajaCierre;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajaCierre;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCajaCierre ,jPanelParametrosReportesCajaCierre, jTableDatosCajaCierre,/*jScrollPanelDatosCajaCierre,*/jPanelCamposCajaCierre,jPanelPaginacionCajaCierre, /*jScrollPanelDatosEdicionCajaCierre,*/ jPanelAccionesCajaCierre,jPanelAccionesFormularioCajaCierre,jmenuBarCajaCierre,jmenuBarDetalleCajaCierre,jTtoolBarCajaCierre,jTtoolBarDetalleCajaCierre));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCajaCierre(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCajaCierre(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCajaCierre(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCajaCierre(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCajaCierre,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCajaCierre,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCajaCierre(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCajaCierre,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCajaCierre,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cajacierreConstantesFunciones.getsFinalQueryCajaCierre();
		String  finalQueryPaginacionTodos=this.cajacierreConstantesFunciones.getsFinalQueryCajaCierre();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CajaCierreConstantesFunciones.getArrayColumnasGlobalesNoCajaCierre(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CajaCierreConstantesFunciones.getArrayColumnasGlobalesCajaCierre(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CajaCierreConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cajacierresEliminados= new ArrayList<CajaCierre>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCajaCierre();
		
				///*CajaCierreSessionBean*/this.cajacierreSessionBean=new CajaCierreSessionBean();
			
			if(this.cajacierreSessionBean==null) {
				this.cajacierreSessionBean=new CajaCierreSessionBean();
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
					this.iNumeroPaginacion=CajaCierreConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CajaCierreConstantesFunciones.getClassesForeignKeysOfCajaCierre(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cajacierre."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cajacierresAux= new ArrayList<CajaCierre>();
			
				
			cajacierreLogic.setDatosCliente(this.datosCliente);
			cajacierreLogic.setDatosDeep(this.datosDeep);
			cajacierreLogic.setIsConDeep(true);
			
			
			cajacierreLogic.getCajaCierreDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cajacierreLogic.getTodosCajaCierres(finalQueryGlobal,pagination);
					
					//cajacierreLogic.getTodosCajaCierresWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cajacierreLogic.getCajaCierres()==null|| cajacierreLogic.getCajaCierres().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajacierresAux= new ArrayList<CajaCierre>();
							cajacierresAux.addAll(cajacierreLogic.getCajaCierres());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajacierresAux= new ArrayList<CajaCierre>();
							cajacierresAux.addAll(cajacierres);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajacierreLogic.getTodosCajaCierres(finalQueryGlobal+"",this.pagination);												
							
							//cajacierreLogic.getTodosCajaCierresWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCajaCierres("Todos",cajacierreLogic.getCajaCierres() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajacierreLogic.setCajaCierres(new ArrayList<CajaCierre>());					
							cajacierreLogic.getCajaCierres().addAll(cajacierresAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajacierres=new ArrayList<CajaCierre>();
							cajacierres.addAll(cajacierresAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCajaCierre=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCajaCierre=this.idActual;
				
				} else if(this.idCajaCierreActual!=null && this.idCajaCierreActual!=0L) {
					idCajaCierre=idCajaCierreActual;
				}
				
					
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndicePorId(idCajaCierre);
				
				this.cajacierres=new ArrayList<CajaCierre>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cajacierreLogic.getEntity(idCajaCierre);
					
					//cajacierreLogic.getEntityWithConnection(idCajaCierre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajacierreLogic.setCajaCierres(new ArrayList<CajaCierre>());
					cajacierreLogic.getCajaCierres().add(cajacierreLogic.getCajaCierre());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajacierres=new ArrayList<CajaCierre>();
					this.cajacierres.add(cajacierre);
				}
				
				if(cajacierreLogic.getCajaCierre()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCaja")) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajacierreLogic.getCajaCierresFK_IdCaja(finalQueryGlobal,pagination,id_cajaFK_IdCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajacierreLogic.getCajaCierres()==null||cajacierreLogic.getCajaCierres().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajacierres==null|| cajacierres.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajacierresAux=new ArrayList<CajaCierre>();
						cajacierresAux.addAll(cajacierreLogic.getCajaCierres());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajacierresAux=new ArrayList<CajaCierre>();
							cajacierresAux.addAll(cajacierres);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajacierreLogic.getCajaCierresFK_IdCaja(finalQueryGlobal,pagination,id_cajaFK_IdCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdCaja(id_cajaFK_IdCaja);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaCierres("FK_IdCaja",cajacierreLogic.getCajaCierres());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaCierres("FK_IdCaja",cajacierres);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajacierreLogic.setCajaCierres(new ArrayList<CajaCierre>());
						cajacierreLogic.getCajaCierres().addAll(cajacierresAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajacierres=new ArrayList<CajaCierre>();
							cajacierres.addAll(cajacierresAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajacierreLogic.getCajaCierresFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajacierreLogic.getCajaCierres()==null||cajacierreLogic.getCajaCierres().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajacierres==null|| cajacierres.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajacierresAux=new ArrayList<CajaCierre>();
						cajacierresAux.addAll(cajacierreLogic.getCajaCierres());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajacierresAux=new ArrayList<CajaCierre>();
							cajacierresAux.addAll(cajacierres);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajacierreLogic.getCajaCierresFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaCierres("FK_IdEmpresa",cajacierreLogic.getCajaCierres());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaCierres("FK_IdEmpresa",cajacierres);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajacierreLogic.setCajaCierres(new ArrayList<CajaCierre>());
						cajacierreLogic.getCajaCierres().addAll(cajacierresAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajacierres=new ArrayList<CajaCierre>();
							cajacierres.addAll(cajacierresAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajacierreLogic.getCajaCierresFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajacierreLogic.getCajaCierres()==null||cajacierreLogic.getCajaCierres().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajacierres==null|| cajacierres.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajacierresAux=new ArrayList<CajaCierre>();
						cajacierresAux.addAll(cajacierreLogic.getCajaCierres());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajacierresAux=new ArrayList<CajaCierre>();
							cajacierresAux.addAll(cajacierres);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajacierreLogic.getCajaCierresFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaCierreConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaCierres("FK_IdSucursal",cajacierreLogic.getCajaCierres());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaCierres("FK_IdSucursal",cajacierres);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajacierreLogic.setCajaCierres(new ArrayList<CajaCierre>());
						cajacierreLogic.getCajaCierres().addAll(cajacierresAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajacierres=new ArrayList<CajaCierre>();
							cajacierres.addAll(cajacierresAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCajaCierre();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCajaCierre();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajacierreLogic.getCajaCierres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajacierres.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajacierreLogic.getCajaCierres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajacierres.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CajaCierre cajacierre) {
		Boolean permite=true;
		
		if(this.cajacierre.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CajaCierreConstantesFunciones.getOrderByListaCajaCierre();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CajaCierreConstantesFunciones.getOrderByListaCajaCierre();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaCierre cajacierre:cajacierreLogic.getCajaCierres()) {
				if(cajacierre.getsType().equals(Constantes2.S_TOTALES)) {
					cajacierreTotales=cajacierre;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaCierre cajacierre:this.cajacierres) {
				if(cajacierre.getsType().equals(Constantes2.S_TOTALES)) {
					cajacierreTotales=cajacierre;
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
			this.cajacierreAux=new CajaCierre();
			this.cajacierreAux.setsType(Constantes2.S_TOTALES);
			this.cajacierreAux.setIsNew(false);
			this.cajacierreAux.setIsChanged(false);
			this.cajacierreAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CajaCierreConstantesFunciones.TotalizarValoresFilaCajaCierre(this.cajacierreLogic.getCajaCierres(),this.cajacierreAux);
				
				this.cajacierreLogic.getCajaCierres().add(this.cajacierreAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CajaCierreConstantesFunciones.TotalizarValoresFilaCajaCierre(this.cajacierres,this.cajacierreAux);
				
				this.cajacierres.add(this.cajacierreAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cajacierreTotales=new CajaCierre();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajacierreLogic.getCajaCierres().remove(cajacierreTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajacierres.remove(cajacierreTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cajacierreTotales=new CajaCierre();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaCierre cajacierre:cajacierreLogic.getCajaCierres()) {
				if(cajacierre.getsType().equals(Constantes2.S_TOTALES)) {
					cajacierreTotales=cajacierre;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajaCierreConstantesFunciones.TotalizarValoresFilaCajaCierre(this.cajacierreLogic.getCajaCierres(),cajacierreTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaCierre cajacierre:this.cajacierres) {
				if(cajacierre.getsType().equals(Constantes2.S_TOTALES)) {
					cajacierreTotales=cajacierre;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajaCierreConstantesFunciones.TotalizarValoresFilaCajaCierre(this.cajacierres,cajacierreTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCajaCierresFK_IdCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaCierresFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaCierresFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCajaCierresFK_IdCaja(String sFinalQuery,Long id_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajacierreLogic.getCajaCierresFK_IdCaja(sFinalQuery,this.pagination,id_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaCierresFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajacierreLogic.getCajaCierresFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaCierresFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajacierreLogic.getCajaCierresFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosCajaCierre() {
		this.isPermisoTodoCajaCierre=false;
		this.isPermisoNuevoCajaCierre=false;
		this.isPermisoActualizarCajaCierre=false;
		this.isPermisoActualizarOriginalCajaCierre=false;
		this.isPermisoEliminarCajaCierre=false;
		this.isPermisoGuardarCambiosCajaCierre=false;
		this.isPermisoConsultaCajaCierre=false;
		this.isPermisoBusquedaCajaCierre=false;
		this.isPermisoReporteCajaCierre=false;		
		this.isPermisoOrdenCajaCierre=false;		
		this.isPermisoPaginacionMedioCajaCierre=false;		
		this.isPermisoPaginacionAltoCajaCierre=false;
		this.isPermisoPaginacionTodoCajaCierre=false;
		this.isPermisoCopiarCajaCierre=false;		
		this.isPermisoVerFormCajaCierre=false;		
		this.isPermisoDuplicarCajaCierre=false;		
		this.isPermisoOrdenCajaCierre=false;		
	}
	
	public void setPermisosUsuarioCajaCierre(Boolean isPermiso) {
		this.isPermisoTodoCajaCierre=isPermiso;
		this.isPermisoNuevoCajaCierre=isPermiso;
		this.isPermisoActualizarCajaCierre=isPermiso;
		this.isPermisoActualizarOriginalCajaCierre=isPermiso;
		this.isPermisoEliminarCajaCierre=isPermiso;
		this.isPermisoGuardarCambiosCajaCierre=isPermiso;
		this.isPermisoConsultaCajaCierre=isPermiso;
		this.isPermisoBusquedaCajaCierre=isPermiso;
		this.isPermisoReporteCajaCierre=isPermiso;
		this.isPermisoOrdenCajaCierre=isPermiso;		
		this.isPermisoPaginacionMedioCajaCierre=isPermiso;		
		this.isPermisoPaginacionAltoCajaCierre=isPermiso;		
		this.isPermisoPaginacionTodoCajaCierre=isPermiso;		
		this.isPermisoCopiarCajaCierre=isPermiso;		
		this.isPermisoVerFormCajaCierre=isPermiso;		
		this.isPermisoDuplicarCajaCierre=isPermiso;
		this.isPermisoOrdenCajaCierre=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCajaCierre(Boolean isPermiso) {
		//this.isPermisoTodoCajaCierre=isPermiso;
		this.isPermisoNuevoCajaCierre=isPermiso;
		this.isPermisoActualizarCajaCierre=isPermiso;
		this.isPermisoActualizarOriginalCajaCierre=isPermiso;
		this.isPermisoEliminarCajaCierre=isPermiso;
		this.isPermisoGuardarCambiosCajaCierre=isPermiso;
		//this.isPermisoConsultaCajaCierre=isPermiso;
		//this.isPermisoBusquedaCajaCierre=isPermiso;
		//this.isPermisoReporteCajaCierre=isPermiso;
		//this.isPermisoOrdenCajaCierre=isPermiso;		
		//this.isPermisoPaginacionMedioCajaCierre=isPermiso;		
		//this.isPermisoPaginacionAltoCajaCierre=isPermiso;		
		//this.isPermisoPaginacionTodoCajaCierre=isPermiso;		
		//this.isPermisoCopiarCajaCierre=isPermiso;		
		//this.isPermisoDuplicarCajaCierre=isPermiso;
		//this.isPermisoOrdenCajaCierre=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCajaCierreClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CajaCierreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCajaCierre(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCajaCierreClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCajaCierreClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCajaCierreClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCajaCierreClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCajaCierre() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CajaCierreJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cajacierreSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CajaCierreConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCajaCierre=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCajaCierre=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCajaCierre=this.isPermisoActualizarCajaCierre;
			this.isPermisoEliminarCajaCierre=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCajaCierre=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCajaCierre=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCajaCierre=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCajaCierre=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCajaCierre=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajaCierre=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCajaCierre=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCajaCierre=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCajaCierre=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCajaCierre=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCajaCierre=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCajaCierre=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajaCierre=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cajacierreSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCajaCierre.setToolTipText(this.jTableDatosCajaCierre.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCajaCierre(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCajaCierre(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CajaCierreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CajaCierreJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCajaCierre() throws Exception {
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
	public void inicializarCombosForeignKeyCajaCierreListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.cajasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCajaCierreListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CajaCierreJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCajaCierreListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCajaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cajasForeignKey==null||this.cajasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CajaConstantesFunciones.getArrayColumnasGlobalesCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CajaConstantesFunciones.SFINALQUERY;

				this.cargarCombosCajasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCajaCierreListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CajaCierreParameterReturnGeneral cajacierreReturnGeneral=new CajaCierreParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cajacierreConstantesFunciones.cargarid_empresaCajaCierre)
					 || (this.esRecargarFks && this.cajacierreConstantesFunciones.cargarid_empresaCajaCierre)) {

					if(!this.cajacierreSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cajacierreSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.cajacierreConstantesFunciones.cargarid_sucursalCajaCierre)
					 || (this.esRecargarFks && this.cajacierreConstantesFunciones.cargarid_sucursalCajaCierre)) {

					if(!this.cajacierreSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+cajacierreSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCaja="";

				if(((this.cajasForeignKey==null||this.cajasForeignKey.size()<=0) && this.cajacierreConstantesFunciones.cargarid_cajaCajaCierre)
					 || (this.esRecargarFks && this.cajacierreConstantesFunciones.cargarid_cajaCajaCierre)) {

					if(!this.cajacierreSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CajaConstantesFunciones.getArrayColumnasGlobalesCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCaja=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaConstantesFunciones.TABLENAME);

						finalQueryGlobalCaja=Funciones.GetFinalQueryAppend(finalQueryGlobalCaja, "");
						finalQueryGlobalCaja+=CajaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCajasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCaja=" WHERE " + ConstantesSql.ID + "="+cajacierreSessionBean.getlidCajaActual();
					}
				} else {
					finalQueryGlobalCaja="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cajacierreReturnGeneral=cajacierreLogic.cargarCombosLoteForeignKeyCajaCierre(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCaja);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cajacierreReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=cajacierreReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCaja.equals("NONE")) {
				this.cajasForeignKey=cajacierreReturnGeneral.getcajasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCajaCierre()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCaja();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cajacierreSessionBean==null) {
				this.cajacierreSessionBean=new CajaCierreSessionBean();
			}

			if(!this.cajacierreSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cajacierreSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyCaja()throws Exception {
		try {

			if(!this.cajacierreSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				Caja caja=new Caja();
				CajaConstantesFunciones.setCajaDescripcion(caja,Constantes.SMENSAJE_ESCOJA_OPCION);
				caja.setId(null);

				if(!CajaConstantesFunciones.ExisteEnLista(this.cajasForeignKey,caja,true)) {

					this.cajasForeignKey.add(0,caja);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCajaCierre()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCajaCierre(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCajaCierre()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.cajacierre.setfecha_cierre(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajaCierre();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCajaCierre(CajaCierre cajacierre)throws Exception {	
		try {
			
			this.setActualCajaForeignKey(cajacierre.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCajaCierre(CajaCierre cajacierre,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCajaCierre()throws Exception {	
		try {
			
			this.setActualCajaForeignKey(this.cajacierreConstantesFunciones.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCajaCierre()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCajaCierre()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCajaCierre()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCajaCierre()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCajaCierre()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameCajasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCajaCierre(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCajaCierre()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre!=null && this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre!=null && this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre!=null && this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public CajaCierreBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CajaCierreBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CajaCierreBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cajacierreSessionBean=new CajaCierreSessionBean(); 
		this.cajacierreConstantesFunciones=new CajaCierreConstantesFunciones(); 
		this.cajacierreBean=new CajaCierre();//(this.cajacierreConstantesFunciones); 		
		this.cajacierreReturnGeneral=new CajaCierreParameterReturnGeneral(); 
		
		this.cajacierreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajacierreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CajaCierreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CajaCierreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CajaCierreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCajaCierre(true);
			
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
			
			this.cajacierreConstantesFunciones=new CajaCierreConstantesFunciones(); 
			this.cajacierreBean=new CajaCierre();//this.cajacierreConstantesFunciones); 			
			this.cajacierreReturnGeneral=new CajaCierreParameterReturnGeneral(); 
		
			CajaCierreBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Cierre Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cajacierre=new CajaCierre();
			this.cajacierres = new ArrayList<CajaCierre>();
			this.cajacierresAux = new ArrayList<CajaCierre>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic=new CajaCierreLogic();
				this.cajacierreLogic.getNewConnexionToDeep("");
			}
			
			//this.cajacierreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cajacierreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCajaCierre);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCajaCierre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajaCierre);	
					}
					
					if(this.jInternalFrameImportacionCajaCierre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajaCierre);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCajaCierre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCajaCierre);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCajaCierre!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCajaCierre);
				this.jInternalFrameDetalleFormCajaCierre.setVisible(false);
				this.jInternalFrameDetalleFormCajaCierre.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaCierre!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajaCierre);
					this.jInternalFrameReporteDinamicoCajaCierre.setVisible(false);
					this.jInternalFrameReporteDinamicoCajaCierre.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCajaCierre!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCajaCierre);
					this.jInternalFrameImportacionCajaCierre.setVisible(false);
					this.jInternalFrameImportacionCajaCierre.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCajaCierre!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCajaCierre);
					this.jInternalFrameOrderByCajaCierre.setVisible(false);
					this.jInternalFrameOrderByCajaCierre.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCajaCierreActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CajaCierreConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cajacierreReturnGeneral=new CajaCierreParameterReturnGeneral();
			
			this.cajacierreParameterGeneral=new CajaCierreParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cajacierreLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CajaCierreJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cajacierreSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajaCierreConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajacierreSessionBean.getEsGuardarRelacionado(),this.cajacierreSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajaCierreConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajacierreSessionBean.getEsGuardarRelacionado(),this.cajacierreSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCajaCierre=false;
			this.isVisibilidadCeldaDuplicarCajaCierre=true;
			this.isVisibilidadCeldaCopiarCajaCierre=true;
			this.isVisibilidadCeldaVerFormCajaCierre=true;
			this.isVisibilidadCeldaOrdenCajaCierre=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaCierre=false;
			this.isVisibilidadCeldaModificarCajaCierre=false;
			this.isVisibilidadCeldaActualizarCajaCierre=false;
			this.isVisibilidadCeldaEliminarCajaCierre=false;
			this.isVisibilidadCeldaCancelarCajaCierre=false;
			this.isVisibilidadCeldaGuardarCajaCierre=false;
			this.isVisibilidadCeldaGuardarCambiosCajaCierre=false;
			
			
			this.isVisibilidadFK_IdCaja=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCajaCierre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCajaCierre();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCajaCierre(false);
			
			this.setPermisosUsuarioCajaCierre();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajacierreSessionBean.getEsGuardarRelacionado() 
				|| (this.cajacierreSessionBean.getEsGuardarRelacionado() && this.cajacierreSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCajaCierreClasesRelacionadas();
			}
			
			if(this.cajacierreSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCajaCierreClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CajaCierreJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCajaCierre();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCajaCierre();
			}
			
			if(!this.isPermisoBusquedaCajaCierre) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCajaCierre.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCajaCierre,this.isPermisoPaginacionMedioCajaCierre,this.isPermisoPaginacionTodoCajaCierre);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CajaCierreConstantesFunciones.getTiposSeleccionarCajaCierre());
				
				this.tiposColumnasSelect=CajaCierreConstantesFunciones.getTiposSeleccionarCajaCierre(true);
				
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
			//if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCajaCierre();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCajaCierre(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCajaCierre(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaCierre() ;
			
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
			this.cajaLogic=new CajaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cajacierreImplementable= (CajaCierreImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajaCierreConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cajacierreImplementableHome= (CajaCierreImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajaCierreConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cajacierres= new ArrayList<CajaCierre>();
			this.cajacierresEliminados= new ArrayList<CajaCierre>();
						
			this.isEsNuevoCajaCierre=false;
			this.esParaAccionDesdeFormularioCajaCierre=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.cajasForeignKey=new ArrayList<Caja>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCajaCierre(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCajaCierre();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CajaCierreBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CajaCierreConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCajaCierre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCajaCierre(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCajaCierre!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCajaCierre();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCajaCierre();
			}
			
			CajaCierreBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCajaCierre.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCajaCierre.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCajaCierre.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCajaCierre(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CajaCierre: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCajaCierre() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCajaCierre")) {
				iIndex=this.jInternalFrameDetalleFormCajaCierre.jTabbedPaneRelacionesCajaCierre.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCajaCierre.jTabbedPaneRelacionesCajaCierre.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCajaCierre();	
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
	
	public void cargarCombosForeignKeyCajaCierre(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCajaCierre(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCajaCierre(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCajaCierreListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCajaCierre();
		
		this.cargarCombosFrameForeignKeyCajaCierre();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCajaCierre();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCajaCierre();
		}
	}
	
	

	public void cargarCombosForeignKeyCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCaja(this.cajasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCajaCierreActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cajacierreSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCajaCierre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			
			
			if(jTableDatosCajaCierre.getRowCount()>=1) {
				jTableDatosCajaCierre.removeRowSelectionInterval(0, jTableDatosCajaCierre.getRowCount()-1);						
			}
			
			this.isEsNuevoCajaCierre=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCajaCierre(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCajaCierre(true);			
			//this.cajacierre=new CajaCierre();
			//this.cajacierre.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaCierre(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaCierre() ;
			
			if(CajaCierreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaCierre(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cajacierre);	
			this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);				
			
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			
			if(this.cajacierreSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CajaCierre: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCajaCierreActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CajaCierre> cajacierresSeleccionados=new ArrayList<CajaCierre>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCajaCierre.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCajaCierre.getSelectedRows().length;			
			}
			
			cajacierresSeleccionados=this.getCajaCierresSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCajaCierre--;			
				//CajaCierre cajacierreAux= new CajaCierre();			
				//cajacierreAux.setId(this.iIdNuevoCajaCierre);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CajaCierre cajacierreOrigen=new CajaCierre();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CajaCierre cajacierreOrigen : cajacierresSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cajacierreOrigen =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajacierreOrigen =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCajaCierre();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cajacierre.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCajaCierre(cajacierreOrigen,this.cajacierre,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajacierreLogic.getCajaCierres().add(this.cajacierreAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajacierres.add(this.cajacierreAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCajaCierre(false);
				
				this.jTableDatosCajaCierre.setRowSelectionInterval(this.getIndiceNuevoCajaCierre(), this.getIndiceNuevoCajaCierre());
				
				int iLastRow =  this.jTableDatosCajaCierre.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajaCierre.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajaCierre.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaCierre(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCajaCierreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CajaCierre> cajacierresSeleccionados=new ArrayList<CajaCierre>();									
		
			CajaCierre cajacierreOrigen=new CajaCierre();
			CajaCierre cajacierreDestino=new CajaCierre();
				
			cajacierresSeleccionados=this.getCajaCierresSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCajaCierre.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cajacierresSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCajaCierre.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajacierreOrigen =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajacierreOrigen =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajacierreDestino =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajacierreDestino =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cajacierreOrigen =cajacierresSeleccionados.get(0);
				cajacierreDestino =cajacierresSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCajaCierre(cajacierreOrigen,cajacierreDestino,true,false);
				
				cajacierreDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajacierreDestino,cajacierreLogic.getCajaCierres());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajacierreDestino,cajacierres);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCajaCierre(false);
				
				//this.jTableDatosCajaCierre.setRowSelectionInterval(this.getIndiceNuevoCajaCierre(), this.getIndiceNuevoCajaCierre());
				
				int iLastRow =  this.jTableDatosCajaCierre.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajaCierre.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajaCierre.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaCierre(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCajaCierreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajaCierre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCajaCierre.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCajaCierreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCajaCierre.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCajaCierre.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCajaCierre.setVisible(!isVisible);
			this.jPanelPaginacionCajaCierre.setVisible(!isVisible);
			this.jPanelAccionesCajaCierre.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCajaCierreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCajaCierre();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCajaCierreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCajaCierre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCajaCierreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCajaCierre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCajaCierreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCajaCierre();
			
			this.abrirFrameOrderByCajaCierre();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCajaCierreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCajaCierre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCajaCierre(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajaCierre);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCajaCierre.isMaximum()) {
					this.jInternalFrameDetalleFormCajaCierre.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCajaCierre.setSize(this.jInternalFrameDetalleFormCajaCierre.iWidthFormulario,this.jInternalFrameDetalleFormCajaCierre.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCajaCierre.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCajaCierre.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCajaCierre.isMaximum()) {
						this.jInternalFrameDetalleFormCajaCierre.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCajaCierre.jContentPaneDetalleCajaCierre.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCajaCierre.jTabbedPaneRelacionesCajaCierre.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCajaCierre.jContentPaneDetalleCajaCierre.getWidth(),CajaCierreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajaCierre.jTabbedPaneRelacionesCajaCierre.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCajaCierre.jContentPaneDetalleCajaCierre.getWidth(),CajaCierreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajaCierre.jTabbedPaneRelacionesCajaCierre.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCajaCierre.jContentPaneDetalleCajaCierre.getWidth(),CajaCierreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCajaCierre.setVisible(true);
	        this.jInternalFrameDetalleFormCajaCierre.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCajaCierre() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCajaCierre==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCajaCierre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaCierre,false,this);
				} else {
					this.jInternalFrameOrderByCajaCierre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaCierre,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCajaCierre);
				this.jInternalFrameOrderByCajaCierre.setVisible(false);
				this.jInternalFrameOrderByCajaCierre.setSelected(false);
				
				this.jInternalFrameOrderByCajaCierre.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajaCierre"));
				
				this.inicializarActualizarBindingTablaOrderByCajaCierre();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCajaCierre() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCajaCierre==null) {
				
				this.jInternalFrameImportacionCajaCierre=new ImportacionJInternalFrame(CajaCierreConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajaCierre);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCajaCierre);
				this.jInternalFrameImportacionCajaCierre.setVisible(false);
				this.jInternalFrameImportacionCajaCierre.setSelected(false);


				this.jInternalFrameImportacionCajaCierre.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajaCierre"));
				this.jInternalFrameImportacionCajaCierre.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajaCierre"));
				this.jInternalFrameImportacionCajaCierre.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajaCierre"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCajaCierre() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCajaCierre==null) {
				this.jInternalFrameReporteDinamicoCajaCierre=new ReporteDinamicoJInternalFrame(CajaCierreConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajaCierre);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajaCierre);
				this.jInternalFrameReporteDinamicoCajaCierre.setVisible(false);
				this.jInternalFrameReporteDinamicoCajaCierre.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCajaCierre.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaCierre"));
				this.jInternalFrameReporteDinamicoCajaCierre.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaCierre"));
				this.jInternalFrameReporteDinamicoCajaCierre.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaCierre"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaCierre();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCajaCierre() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajaCierre);
			
	       	this.jInternalFrameDetalleFormCajaCierre.setVisible(false);
	        this.jInternalFrameDetalleFormCajaCierre.setSelected(false);
			
			//this.jInternalFrameDetalleFormCajaCierre.dispose();
			//this.jInternalFrameDetalleFormCajaCierre=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCajaCierre() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCajaCierre.setVisible(true);
	        this.jInternalFrameReporteDinamicoCajaCierre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCajaCierre() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCajaCierre.setVisible(true);
	        this.jInternalFrameImportacionCajaCierre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCajaCierre() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCajaCierre.setVisible(true);
	        this.jInternalFrameOrderByCajaCierre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCajaCierre() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCajaCierre.setVisible(false);
	        this.jInternalFrameOrderByCajaCierre.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCajaCierre() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCajaCierre.setVisible(false);
	        this.jInternalFrameReporteDinamicoCajaCierre.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCajaCierre() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCajaCierre.setVisible(false);
	        this.jInternalFrameImportacionCajaCierre.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCajaCierreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCajaCierre(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCajaCierre(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCajaCierre(true);
			//this.isEsNuevoCajaCierre=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCajaCierre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaCierre(false) ;
			
			if(cajacierreSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CajaCierreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaCierre(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaCierre(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCajaCierreActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCajaCierre(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajaCierre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCajaCierre(true);
			//this.isEsNuevoCajaCierre=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cajacierre.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCajaCierre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCajaCierre(false) ;
			
			if(CajaCierreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaCierre(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaCierre(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCaja(List<Caja> cajasForeignKey)throws Exception{
		TableColumn tableColumnCaja=this.jTableDatosCajaCierre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaCierre,CajaCierreConstantesFunciones.LABEL_IDCAJA));
		TableCellEditor tableCellEditorCaja =tableColumnCaja.getCellEditor();

		CajaTableCell cajaTableCellFk=(CajaTableCell)tableCellEditorCaja;

		if(cajaTableCellFk!=null) {
			cajaTableCellFk.setcajasForeignKey(cajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaCierre.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cajaTableCellFk.setRowActual(intSelectedRow);
			//cajaTableCellFk.setcajasForeignKeyActual(cajasForeignKey);
		//}


		if(cajaTableCellFk!=null) {
			cajaTableCellFk.RecargarCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCajaCierreActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCajaCierre(false);
			
			//if(!this.isEsNuevoCajaCierre) {								
				int intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CajaCierreJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCajaCierre(this.cajacierre,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
				
			}
			
			if(this.permiteMantenimiento(this.cajacierre)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajacierreSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCajaCierre=true;
					this.inicializarActualizarBindingTablaCajaCierre(false);
					this.isEsNuevoCajaCierre=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCajaCierre=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCajaCierre=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajaCierre(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaCierre(false);
				
				this.habilitarDeshabilitarControlesCajaCierre(false);
			
												
				
				if(CajaCierreJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCajaCierre();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCajaCierreActionPerformed(evt,cajacierreSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCajaCierre(this.cajacierre,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCajaCierre.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cajacierreSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cajacierre.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CajaCierre.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaCierre.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCajaCierreActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				this.cajacierre.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				this.cajacierre.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cajacierre)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajacierreSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CajaCierreModel) this.jTableDatosCajaCierre.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCajaCierre=true;
				this.inicializarActualizarBindingTablaCajaCierre(false);
				this.isEsNuevoCajaCierre=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajaCierre(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaCierre(false);
				
				this.habilitarDeshabilitarControlesCajaCierre(false);
				
				
				
				if(CajaCierreJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCajaCierre();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCajaCierreActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCajaCierre.getRowCount()>=1) {
				jTableDatosCajaCierre.removeRowSelectionInterval(0, jTableDatosCajaCierre.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCajaCierre(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCajaCierre(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaCierre(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaCierre(false) ;
			
			this.isEsNuevoCajaCierre=false;
			
			if(CajaCierreJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCajaCierre();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCajaCierreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCajaCierre(false);
				
				//SI ES MANUAL
				if(CajaCierreJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCajaCierre();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCajaCierreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCajaCierre--;			
			//CajaCierre cajacierreAux= new CajaCierre();			
			//cajacierreAux.setId(this.iIdNuevoCajaCierre);
			
			if(this.jInternalFrameDetalleFormCajaCierre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCajaCierre();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
			
			this.cajacierre.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cajacierreLogic.getCajaCierres().add(this.cajacierreAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cajacierres.add(this.cajacierreAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCajaCierre(false);
			
			this.jTableDatosCajaCierre.setRowSelectionInterval(this.getIndiceNuevoCajaCierre(), this.getIndiceNuevoCajaCierre());
			
			int iLastRow =  this.jTableDatosCajaCierre.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCajaCierre.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCajaCierre.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCajaCierre(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCajaCierreActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCajaCierre(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaCierre(false);
			
			//SI ES MANUAL
			if(CajaCierreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaCierre();
			}
			
			//this.abrirFrameTreeCajaCierre();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCajaCierreActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Caja CierreS ?", "MANTENIMIENTO DE Caja Cierre", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCajaCierre.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCajaCierre();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cajacierreReturnGeneral=cajacierreLogic.procesarImportacionCajaCierresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cajacierreParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCajaCierreReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCajaCierreActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCajaCierre.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCajaCierre.setFileImportacion(this.jInternalFrameImportacionCajaCierre.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCajaCierre.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCajaCierre.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCajaCierre.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCajaCierre.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCajaCierreActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CajaCierre> cajacierresSeleccionados=new ArrayList<CajaCierre>();		

		cajacierresSeleccionados=this.getCajaCierresSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaCierre.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaCierre.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CajaCierreBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CajaCierreBaseDesign.jrxml";
			
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
			
			this.generarReporteCajaCierres("Todos",cajacierresSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajacierreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Cierre",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCajaCierre.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaCierre.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajaCierreConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaCierreConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaCierreConstantesFunciones.LABEL_IDCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Caja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Caja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Caja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Caja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaCierreConstantesFunciones.LABEL_FECHACIERRE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCierre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCierre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCierre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCierre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaCierreConstantesFunciones.LABEL_HORACIERRE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raCierre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raCierre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raCierre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raCierre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaCierreConstantesFunciones.LABEL_ESTAACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoCajaCierre.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCajaCierre.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCajaCierre.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CajaCierreConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CajaCierreConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CajaCierreConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoria="id_caja";
					break;

				case CajaCierreConstantesFunciones.LABEL_FECHACIERRE:
					sNombreCampoCategoria="fecha_cierre";
					break;

				case CajaCierreConstantesFunciones.LABEL_HORACIERRE:
					sNombreCampoCategoria="hora_cierre";
					break;

				case CajaCierreConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCajaCierre.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CajaCierreConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CajaCierreConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CajaCierreConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoriaValor="id_caja";
					break;

				case CajaCierreConstantesFunciones.LABEL_FECHACIERRE:
					sNombreCampoCategoriaValor="fecha_cierre";
					break;

				case CajaCierreConstantesFunciones.LABEL_HORACIERRE:
					sNombreCampoCategoriaValor="hora_cierre";
					break;

				case CajaCierreConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCajaCierre.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaCierre.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajaCierreConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CajaCierreConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CajaCierreConstantesFunciones.LABEL_IDCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja");
					break;

				case CajaCierreConstantesFunciones.LABEL_FECHACIERRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Cierre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_cierre");
					break;

				case CajaCierreConstantesFunciones.LABEL_HORACIERRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Cierre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_cierre");
					break;

				case CajaCierreConstantesFunciones.LABEL_ESTAACTIVO:
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
	
	public void jButtonGenerarExcelReporteDinamicoCajaCierreActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CajaCierre> cajacierresSeleccionados=new ArrayList<CajaCierre>();		
		
		cajacierresSeleccionados=this.getCajaCierresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajacierre";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CajaCierres");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCajaCierre.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaCierre.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CajaCierreConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaCierreConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CajaCierre cajacierre:cajacierresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajacierre.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaCierreConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaCierreConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CajaCierre cajacierre:cajacierresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajacierre.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaCierreConstantesFunciones.LABEL_IDCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaCierreConstantesFunciones.LABEL_IDCAJA);
					iRow++;

					for(CajaCierre cajacierre:cajacierresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajacierre.getcaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaCierreConstantesFunciones.LABEL_FECHACIERRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaCierreConstantesFunciones.LABEL_FECHACIERRE);
					iRow++;

					for(CajaCierre cajacierre:cajacierresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajacierre.getfecha_cierre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaCierreConstantesFunciones.LABEL_HORACIERRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaCierreConstantesFunciones.LABEL_HORACIERRE);
					iRow++;

					for(CajaCierre cajacierre:cajacierresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajacierre.gethora_cierre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaCierreConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaCierreConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(CajaCierre cajacierre:cajacierresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajacierre.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelCajaCierre(row);				
			//	iRow++;
			//}				
			
			//for(CajaCierre cajacierreAux:cajacierresSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCajaCierre(cajacierreAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajacierreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Cierre",JOptionPane.INFORMATION_MESSAGE);
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
				this.cajacierreLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaCierre(false);
			
			//SI ES MANUAL
			if(CajaCierreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaCierre();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCajaCierreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaCierre(false);
			
			//SI ES MANUAL
			if(CajaCierreJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajaCierre();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCajaCierreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaCierre(false);
			
			//SI ES MANUAL
			if(CajaCierreJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajaCierre();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCajaCierre() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCajaCierre.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCajaCierre.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCajaCierre.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCajaCierre.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCajaCierre.setMinimumSize(dimensionMinimum);
		this.jTableDatosCajaCierre.setMaximumSize(dimensionMaximum);
		this.jTableDatosCajaCierre.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCajaCierre(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCajaCierre(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCajaCierre(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCajaCierre(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCajaCierre(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCajaCierre(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaCierre(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCajaCierre(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CajaCierreJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CajaCierreJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCajaCierre() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCajaCierre();
		
		this.inicializarActualizarBindingBotonesManualCajaCierre(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCajaCierre();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaCierre() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCajaCierre(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCajaCierre(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCajaCierre.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCajaCierre.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCajaCierre.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCajaCierre!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCajaCierre.jCheckBoxPostAccionNuevoCajaCierre.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCajaCierre.jCheckBoxPostAccionSinCerrarCajaCierre.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCajaCierre.jCheckBoxPostAccionSinMensajeCajaCierre.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCajaCierre.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCajaCierre.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCajaCierre.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCajaCierre!=null) {
				this.jInternalFrameDetalleFormCajaCierre.jCheckBoxPostAccionNuevoCajaCierre.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCajaCierre.jCheckBoxPostAccionSinCerrarCajaCierre.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCajaCierre.jCheckBoxPostAccionSinMensajeCajaCierre.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCajaCierre.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCajaCierre.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCajaCierre!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCajaCierre.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCajaCierre!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaCierre.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCajaCierre.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCajaCierre.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCajaCierre.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCajaCierre.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCajaCierre!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaCierre.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCajaCierre.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCajaCierre.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCajaCierre(Boolean esInicializar) throws Exception {
		try	{	
			if(CajaCierreJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCajaCierre(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCajaCierre() throws Exception {
		try	{
			if(CajaCierreJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCajaCierre();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajaCierre() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCajaCierre() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCajaCierre.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCajaCierre.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCajaCierre.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCajaCierre.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCajaCierre.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCajaCierre.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCajaCierre.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCajaCierre.addItem(reporte);
			}
			
			
			if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCajaCierre.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCajaCierre.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCajaCierre.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCajaCierre.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCajaCierre.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCajaCierre.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCajaCierre.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCajaCierre.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCajaCierre.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaCierre();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaCierre() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajaCierre!=null) {
				this.jInternalFrameReporteDinamicoCajaCierre.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajaCierre.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajaCierre!=null) {
				this.jInternalFrameReporteDinamicoCajaCierre.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajaCierre.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCajaCierre!=null) {
				
				if(this.jInternalFrameReporteDinamicoCajaCierre.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajaCierre.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaCierre.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCajaCierre.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajaCierre.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaCierre.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCajaCierre()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cajaFK_IdCajaCajaCierre.getSelectedItem()!=null){this.id_cajaFK_IdCaja=((Caja)this.jComboBoxid_cajaFK_IdCajaCajaCierre.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCajaCierre(Boolean esInicializar) throws Exception {				
		if(CajaCierreJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCajaCierre();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCajaCierre() throws Exception {
		this.inicializarActualizarBindingTablaCajaCierre(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCajaCierre() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCajaCierre.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCajaCierre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaCierre.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CajaCierrePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCajaCierre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaCierre.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CajaCierrePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCajaCierreOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaCierreOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CajaCierrePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCajaCierre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaCierre.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CajaCierrePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCajaCierre.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCajaCierre(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cajacierreLogic.getCajaCierres().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cajacierres.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CajaCierreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCajaCierre.setModel(new CajaCierreModel(this.cajacierreLogic.getCajaCierres(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCajaCierre.setModel(new CajaCierreModel(this.cajacierres,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCajaCierre!=null && this.jInternalFrameOrderByCajaCierre.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCajaCierre();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCajaCierre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaCierre,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CajaCierrePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CajaCierreConstantesFunciones.SCLASSWEBTITULO,cajacierreConstantesFunciones.resaltarSeleccionarCajaCierre,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CajaCierreConstantesFunciones.SCLASSWEBTITULO,cajacierreConstantesFunciones.resaltarSeleccionarCajaCierre,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCajaCierre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaCierre,CajaCierreConstantesFunciones.LABEL_ID));

		if(this.cajacierreConstantesFunciones.mostraridCajaCierre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaCierreConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajacierreConstantesFunciones.resaltaridCajaCierre,this.cajacierreConstantesFunciones.activaridCajaCierre,this,true,"idCajaCierre","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajacierreConstantesFunciones.resaltaridCajaCierre,this.cajacierreConstantesFunciones.activaridCajaCierre,this,true,"idCajaCierre","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaCierre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaCierre,CajaCierreConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cajacierreConstantesFunciones.mostrarid_empresaCajaCierre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaCierreConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cajacierreConstantesFunciones.resaltarid_empresaCajaCierre,this,this.cajacierreConstantesFunciones.activarid_empresaCajaCierre));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cajacierreConstantesFunciones.resaltarid_empresaCajaCierre,this,this.cajacierreConstantesFunciones.activarid_empresaCajaCierre,false,"id_empresaCajaCierre","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaCierrePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaCierre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaCierre,CajaCierreConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.cajacierreConstantesFunciones.mostrarid_sucursalCajaCierre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaCierreConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.cajacierreConstantesFunciones.resaltarid_sucursalCajaCierre,this,this.cajacierreConstantesFunciones.activarid_sucursalCajaCierre));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.cajacierreConstantesFunciones.resaltarid_sucursalCajaCierre,this,this.cajacierreConstantesFunciones.activarid_sucursalCajaCierre,false,"id_sucursalCajaCierre","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaCierrePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaCierre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaCierre,CajaCierreConstantesFunciones.LABEL_IDCAJA));

		if(this.cajacierreConstantesFunciones.mostrarid_cajaCajaCierre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaCierreConstantesFunciones.LABEL_IDCAJA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CajaTableCell(this.cajasForeignKey,this.cajacierreConstantesFunciones.resaltarid_cajaCajaCierre,this,this.cajacierreConstantesFunciones.activarid_cajaCajaCierre));
			tableColumn.setCellEditor(new CajaTableCell(this.cajasForeignKey,this.cajacierreConstantesFunciones.resaltarid_cajaCajaCierre,this,this.cajacierreConstantesFunciones.activarid_cajaCajaCierre,true,"id_cajaCajaCierre","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaCierrePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaCierre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaCierre,CajaCierreConstantesFunciones.LABEL_FECHACIERRE));

		if(this.cajacierreConstantesFunciones.mostrarfecha_cierreCajaCierre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaCierreConstantesFunciones.LABEL_FECHACIERRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cajacierreConstantesFunciones.resaltarfecha_cierreCajaCierre,this.cajacierreConstantesFunciones.activarfecha_cierreCajaCierre,this,true,"fecha_cierreCajaCierre","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cajacierreConstantesFunciones.resaltarfecha_cierreCajaCierre,this.cajacierreConstantesFunciones.activarfecha_cierreCajaCierre,this,true,"fecha_cierreCajaCierre","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CajaCierrePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaCierre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaCierre,CajaCierreConstantesFunciones.LABEL_HORACIERRE));

		if(this.cajacierreConstantesFunciones.mostrarhora_cierreCajaCierre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaCierreConstantesFunciones.LABEL_HORACIERRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.cajacierreConstantesFunciones.resaltarhora_cierreCajaCierre,this.cajacierreConstantesFunciones.activarhora_cierreCajaCierre,this,true,"hora_cierreCajaCierre","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.cajacierreConstantesFunciones.resaltarhora_cierreCajaCierre,this.cajacierreConstantesFunciones.activarhora_cierreCajaCierre,this,true,"hora_cierreCajaCierre","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CajaCierrePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaCierre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaCierre,CajaCierreConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.cajacierreConstantesFunciones.mostraresta_activoCajaCierre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaCierreConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.cajacierreConstantesFunciones.resaltaresta_activoCajaCierre,this.cajacierreConstantesFunciones.activaresta_activoCajaCierre));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.cajacierreConstantesFunciones.resaltaresta_activoCajaCierre,this.cajacierreConstantesFunciones.activaresta_activoCajaCierre,this,true,"esta_activoCajaCierre","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaCierrePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cajacierreSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajacierreSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajacierreSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajaCierre.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajacierreSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajacierreSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajaCierre.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCajaCierre && this.isPermisoGuardarCambiosCajaCierre) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cajacierreSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cajacierreSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCajaCierre.addColumn(tableColumn);
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
			
			this.jTableDatosCajaCierre.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajaCierre && this.isPermisoGuardarCambiosCajaCierre) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajaCierre && this.isPermisoGuardarCambiosCajaCierre) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCajaCierre.moveColumn(this.jTableDatosCajaCierre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCajaCierre.moveColumn(this.jTableDatosCajaCierre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCajaCierre.moveColumn(this.jTableDatosCajaCierre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCajaCierre.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCajaCierre.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCajaCierre,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CajaCierreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCajaCierre.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCajaCierre.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CajaCierreJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CajaCierreJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCajaCierre.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCajaCierre.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCajaCierre.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cajacierreLogic.getCajaCierres().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cajacierres.size()-1;
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
		//this.jTableDatosCajaCierre.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCajaCierre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCajaCierre();
			
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
				
				//this.isEsNuevoCajaCierre=false;
					
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			
				if(this.cajacierreSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCajaCierre==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajaCierre.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajaCierre.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cajacierre.getsType().equals("DUPLICADO")
				   || this.cajacierre.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCajaCierre=true;
				
				} else {
					this.isEsNuevoCajaCierre=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
					if(this.cajacierre.getId()>=0 && !this.cajacierre.getIsNew()) {						
						this.isEsNuevoCajaCierre=false;
						
					} else {
						this.isEsNuevoCajaCierre=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCajaCierre(esRelaciones);						
				
				this.seleccionarCajaCierre(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cajacierre.getId()<0) {
					this.isEsNuevoCajaCierre=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCajaCierre(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCajaCierre(evt,rowIndex);
				}	
				
				if(this.cajacierreSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CajaCierre: " + this.dDif); 
					}
				}								
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCajaCierre(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cajacierre)) {
					if(this.cajacierre.getId()>0) {
						this.cajacierre.setIsDeleted(true);
						
						this.cajacierresEliminados.add(this.cajacierre);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajacierreLogic.getCajaCierres().remove(this.cajacierre);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajacierres.remove(this.cajacierre);				
					}
					
					
					((CajaCierreModel) this.jTableDatosCajaCierre.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaCierre(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCajaCierre(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCajaCierre) {
			
			if(this.jInternalFrameDetalleFormCajaCierre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajaCierre.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajaCierre.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CajaCierreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCajaCierre(this.cajacierre);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cajacierreConstantesFunciones.cargarid_empresaCajaCierre || this.cajacierreConstantesFunciones.event_dependid_empresaCajaCierre) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cajacierre.getid_empresa());
									//this.inicializarActualizarBindingCajaCierre(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cajacierre.getEmpresa()!=null) {
							this.empresasForeignKey.add(cajacierre.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cajacierre.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.cajacierreConstantesFunciones.cargarid_sucursalCajaCierre || this.cajacierreConstantesFunciones.event_dependid_sucursalCajaCierre) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.cajacierre.getid_sucursal());
									//this.inicializarActualizarBindingCajaCierre(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(cajacierre.getSucursal()!=null) {
							this.sucursalsForeignKey.add(cajacierre.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.cajacierre.getid_sucursal(),false,"Formulario");

					//Caja
					if(!this.cajacierreConstantesFunciones.cargarid_cajaCajaCierre || this.cajacierreConstantesFunciones.event_dependid_cajaCajaCierre) {
						//this.cargarCombosCajasForeignKeyLista(" where id="+this.cajacierre.getid_caja());
									//this.inicializarActualizarBindingCajaCierre(false,false);
						this.cajasForeignKey=new ArrayList<Caja>();

						if(cajacierre.getCaja()!=null) {
							this.cajasForeignKey.add(cajacierre.getCaja());
						}

						this.addItemDefectoCombosForeignKeyCaja();
						this.cargarCombosFrameCajasForeignKey("Todos");
					}
					this.setActualCajaForeignKey(this.cajacierre.getid_caja(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCajaCierre("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCajaCierre(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaCierre() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajaCierre(CajaCierre cajacierre) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCajaCierre(cajacierre,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajaCierre(CajaCierre cajacierre,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCajaCierre(cajacierre);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCajaCierre(cajacierre,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCajaCierre(cajacierre);
	}
	
	public void setVariablesObjetoActualToFormularioCajaCierre(CajaCierre cajacierre) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCajaCierre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCajaCierre.jLabelidCajaCierre.setText(cajacierre.getId().toString());
			this.jInternalFrameDetalleFormCajaCierre.jDateChooserfecha_cierreCajaCierre.setDate(cajacierre.getfecha_cierre());
			this.jInternalFrameDetalleFormCajaCierre.jSpinnerhora_cierreCajaCierre.setValue(cajacierre.gethora_cierre());
			this.jInternalFrameDetalleFormCajaCierre.jCheckBoxesta_activoCajaCierre.setSelected(cajacierre.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CajaCierre cajacierreLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cajacierreLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CajaCierre cajacierreLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cajacierreLocal=this.cajacierre;
			} else {
				cajacierreLocal=this.cajacierreAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cajacierreLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCajaCierre(cajacierreLocal,true);
					
					if(cajacierreSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cajacierreLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cajacierreSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cajacierreLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCajaCierre(CajaCierre cajacierre,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajaCierre(cajacierre,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(cajacierre);
	}
	
	public void setVariablesFormularioToObjetoActualCajaCierre(CajaCierre cajacierre,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajaCierre(cajacierre,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCajaCierre(CajaCierre cajacierre,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCajaCierre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCajaCierre.jLabelidCajaCierre.getText()==null || this.jInternalFrameDetalleFormCajaCierre.jLabelidCajaCierre.getText()=="" || this.jInternalFrameDetalleFormCajaCierre.jLabelidCajaCierre.getText()=="Id") {
				this.jInternalFrameDetalleFormCajaCierre.jLabelidCajaCierre.setText("0");
			}

			if(conColumnasBase) {cajacierre.setId(Long.parseLong(this.jInternalFrameDetalleFormCajaCierre.jLabelidCajaCierre.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaCierreConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaCierre.jLabelIdCajaCierre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajacierre.setfecha_cierre(this.jInternalFrameDetalleFormCajaCierre.jDateChooserfecha_cierreCajaCierre.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaCierreConstantesFunciones.LABEL_FECHACIERRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaCierre.jLabelfecha_cierreCajaCierre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajacierre.sethora_cierre(new Time(((Date)this.jInternalFrameDetalleFormCajaCierre.jSpinnerhora_cierreCajaCierre.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaCierreConstantesFunciones.LABEL_HORACIERRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaCierre.jLabelhora_cierreCajaCierre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajacierre.setesta_activo(this.jInternalFrameDetalleFormCajaCierre.jCheckBoxesta_activoCajaCierre.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaCierreConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaCierre.jLabelesta_activoCajaCierre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajaCierre(CajaCierre cajacierreBean,CajaCierre cajacierre,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cajacierreBean.getid_caja()!=null && !cajacierreBean.getid_caja().equals(-1L))) {cajacierre.setid_caja(cajacierreBean.getid_caja());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCajaCierre(CajaCierre cajacierreOrigen,CajaCierre cajacierre,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajacierreOrigen.getId()!=null && !cajacierreOrigen.getId().equals(0L))) {cajacierre.setId(cajacierreOrigen.getId());}}
			if(conDefault || (!conDefault && cajacierreOrigen.getid_caja()!=null && !cajacierreOrigen.getid_caja().equals(-1L))) {cajacierre.setid_caja(cajacierreOrigen.getid_caja());}
			if(conDefault || (!conDefault && cajacierreOrigen.getfecha_cierre()!=null && !cajacierreOrigen.getfecha_cierre().equals(new Date()))) {cajacierre.setfecha_cierre(cajacierreOrigen.getfecha_cierre());}
			if(conDefault || (!conDefault && cajacierreOrigen.gethora_cierre()!=null && !cajacierreOrigen.gethora_cierre().equals(new Time((new Date()).getTime())))) {cajacierre.sethora_cierre(cajacierreOrigen.gethora_cierre());}
			if(conDefault || (!conDefault && cajacierreOrigen.getesta_activo()!=null && !cajacierreOrigen.getesta_activo().equals(false))) {cajacierre.setesta_activo(cajacierreOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajaCierre(CajaCierre cajacierre) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajaCierre.jLabelidCajaCierre.setText(cajacierre.getId().toString());
			this.jInternalFrameDetalleFormCajaCierre.jDateChooserfecha_cierreCajaCierre.setDate(cajacierre.getfecha_cierre());
			this.jInternalFrameDetalleFormCajaCierre.jSpinnerhora_cierreCajaCierre.setValue(cajacierre.gethora_cierre());
			this.jInternalFrameDetalleFormCajaCierre.jCheckBoxesta_activoCajaCierre.setSelected(cajacierre.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajaCierre(CajaCierreBean cajacierreBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajaCierre.jLabelidCajaCierre.setText(cajacierreBean.getId().toString());
			this.jInternalFrameDetalleFormCajaCierre.jDateChooserfecha_cierreCajaCierre.setDate(cajacierreBean.getfecha_cierre());
			this.jInternalFrameDetalleFormCajaCierre.jSpinnerhora_cierreCajaCierre.setValue(cajacierreBean.gethora_cierre());
			this.jInternalFrameDetalleFormCajaCierre.jCheckBoxesta_activoCajaCierre.setSelected(cajacierreBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCajaCierre(CajaCierreParameterReturnGeneral cajacierreReturnGeneral,CajaCierreBean cajacierreBean,Boolean conDefault) throws Exception { 
		try {
			CajaCierre cajacierreLocal=new CajaCierre();
			
			cajacierreLocal=cajacierreReturnGeneral.getCajaCierre();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajacierreLocal.getId()!=null && !cajacierreLocal.getId().equals(0L))) {cajacierreBean.setId(cajacierreLocal.getId());}}
			if(conDefault || (!conDefault && cajacierreLocal.getid_caja()!=null && !cajacierreLocal.getid_caja().equals(-1L))) {cajacierreBean.setid_caja(cajacierreLocal.getid_caja());}
			if(conDefault || (!conDefault && cajacierreLocal.getfecha_cierre()!=null && !cajacierreLocal.getfecha_cierre().equals(new Date()))) {cajacierreBean.setfecha_cierre(cajacierreLocal.getfecha_cierre());}
			if(conDefault || (!conDefault && cajacierreLocal.gethora_cierre()!=null && !cajacierreLocal.gethora_cierre().equals(new Time((new Date()).getTime())))) {cajacierreBean.sethora_cierre(cajacierreLocal.gethora_cierre());}
			if(conDefault || (!conDefault && cajacierreLocal.getesta_activo()!=null && !cajacierreLocal.getesta_activo().equals(false))) {cajacierreBean.setesta_activo(cajacierreLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCajaCierreGenerico(Long idCajaCierreSeleccionado,JComboBox jComboBoxCajaCierre,List<CajaCierre> cajacierresLocal)throws Exception {
		try {
			CajaCierre  cajacierreTemp=null;

			for(CajaCierre cajacierreAux:cajacierresLocal) {
				if(cajacierreAux.getId()!=null && cajacierreAux.getId().equals(idCajaCierreSeleccionado)) {
					cajacierreTemp=cajacierreAux;
					break;
				}
			}

			jComboBoxCajaCierre.setSelectedItem(cajacierreTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCajaCierreGenerico(JComboBox jComboBoxCajaCierre,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajaCierre.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCajaCierre.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajaCierre.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCajaCierre.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajacierre=(CajaCierre) cajacierreLogic.getCajaCierres().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajacierre =(CajaCierre) cajacierres.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cajacierre.getIsNew() && !cajacierre.getIsChanged() && !cajacierre.getIsDeleted()) {
				sDescripcion=cajacierre.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cajacierre.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cajacierre.getIsNew() && !cajacierre.getIsChanged() && !cajacierre.getIsDeleted()) {
				sDescripcion=cajacierre.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cajacierre.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Caja")) {
			//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
			if(!cajacierre.getIsNew() && !cajacierre.getIsChanged() && !cajacierre.getIsDeleted()) {
				sDescripcion=cajacierre.getcaja_descripcion();
			} else {
				//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
				sDescripcion=cajacierre.getcaja_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CajaCierre cajacierreRow=new CajaCierre();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajacierreRow=(CajaCierre) cajacierreLogic.getCajaCierres().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajacierreRow=(CajaCierre) cajacierres.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCajaCierre(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCajaCierre.setVisible((this.isVisibilidadCeldaNuevoCajaCierre && this.isPermisoNuevoCajaCierre));			
			this.jButtonDuplicarCajaCierre.setVisible((this.isVisibilidadCeldaDuplicarCajaCierre && this.isPermisoDuplicarCajaCierre));			
			this.jButtonCopiarCajaCierre.setVisible((this.isVisibilidadCeldaCopiarCajaCierre && this.isPermisoCopiarCajaCierre));
			this.jButtonVerFormCajaCierre.setVisible((this.isVisibilidadCeldaVerFormCajaCierre && this.isPermisoVerFormCajaCierre));
			
			this.jButtonAbrirOrderByCajaCierre.setVisible((this.isVisibilidadCeldaOrdenCajaCierre && this.isPermisoOrdenCajaCierre));			
			
			this.jButtonNuevoRelacionesCajaCierre.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaCierre && this.isPermisoNuevoCajaCierre));			
			this.jButtonNuevoGuardarCambiosCajaCierre.setVisible((this.isVisibilidadCeldaNuevoCajaCierre && this.isPermisoNuevoCajaCierre && this.isPermisoGuardarCambiosCajaCierre));
			
			if(this.jInternalFrameDetalleFormCajaCierre!=null) {
			this.jInternalFrameDetalleFormCajaCierre.jButtonModificarCajaCierre.setVisible((this.isVisibilidadCeldaModificarCajaCierre && this.isPermisoActualizarCajaCierre));	
			this.jInternalFrameDetalleFormCajaCierre.jButtonActualizarCajaCierre.setVisible((this.isVisibilidadCeldaActualizarCajaCierre && this.isPermisoActualizarCajaCierre));	
			this.jInternalFrameDetalleFormCajaCierre.jButtonEliminarCajaCierre.setVisible((this.isVisibilidadCeldaEliminarCajaCierre && this.isPermisoEliminarCajaCierre));
			this.jInternalFrameDetalleFormCajaCierre.jButtonCancelarCajaCierre.setVisible(this.isVisibilidadCeldaCancelarCajaCierre);							
			this.jInternalFrameDetalleFormCajaCierre.jButtonGuardarCambiosCajaCierre.setVisible((this.isVisibilidadCeldaGuardarCajaCierre && this.isPermisoGuardarCambiosCajaCierre));			
			
			}
						
			this.jButtonGuardarCambiosTablaCajaCierre.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaCierre && this.isPermisoGuardarCambiosCajaCierre));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCajaCierre.setVisible((this.isVisibilidadCeldaNuevoCajaCierre && this.isPermisoNuevoCajaCierre));						
			this.jButtonDuplicarToolBarCajaCierre.setVisible((this.isVisibilidadCeldaDuplicarCajaCierre && this.isPermisoDuplicarCajaCierre));						
			this.jButtonCopiarToolBarCajaCierre.setVisible((this.isVisibilidadCeldaCopiarCajaCierre && this.isPermisoCopiarCajaCierre));			
			this.jButtonVerFormToolBarCajaCierre.setVisible((this.isVisibilidadCeldaVerFormCajaCierre && this.isPermisoVerFormCajaCierre));			
			this.jButtonAbrirOrderByToolBarCajaCierre.setVisible((this.isVisibilidadCeldaOrdenCajaCierre && this.isPermisoOrdenCajaCierre));
			this.jButtonNuevoRelacionesToolBarCajaCierre.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaCierre && this.isPermisoNuevoCajaCierre));			
			this.jButtonNuevoGuardarCambiosToolBarCajaCierre.setVisible((this.isVisibilidadCeldaNuevoCajaCierre && this.isPermisoNuevoCajaCierre && this.isPermisoGuardarCambiosCajaCierre));			
			
			if(this.jInternalFrameDetalleFormCajaCierre!=null) {
			this.jInternalFrameDetalleFormCajaCierre.jButtonModificarToolBarCajaCierre.setVisible((this.isVisibilidadCeldaModificarCajaCierre && this.isPermisoActualizarCajaCierre));	
			this.jInternalFrameDetalleFormCajaCierre.jButtonActualizarToolBarCajaCierre.setVisible((this.isVisibilidadCeldaActualizarCajaCierre  && this.isPermisoActualizarCajaCierre));	
			this.jInternalFrameDetalleFormCajaCierre.jButtonEliminarToolBarCajaCierre.setVisible((this.isVisibilidadCeldaEliminarCajaCierre && this.isPermisoEliminarCajaCierre));
			this.jInternalFrameDetalleFormCajaCierre.jButtonCancelarToolBarCajaCierre.setVisible(this.isVisibilidadCeldaCancelarCajaCierre);				
			this.jInternalFrameDetalleFormCajaCierre.jButtonGuardarCambiosToolBarCajaCierre.setVisible((this.isVisibilidadCeldaGuardarCajaCierre && this.isPermisoGuardarCambiosCajaCierre));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCajaCierre.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaCierre && this.isPermisoGuardarCambiosCajaCierre));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCajaCierre.setVisible((this.isVisibilidadCeldaNuevoCajaCierre && this.isPermisoNuevoCajaCierre));			
			this.jMenuItemDuplicarCajaCierre.setVisible((this.isVisibilidadCeldaDuplicarCajaCierre && this.isPermisoDuplicarCajaCierre));			
			this.jMenuItemCopiarCajaCierre.setVisible((this.isVisibilidadCeldaCopiarCajaCierre && this.isPermisoCopiarCajaCierre));			
			this.jMenuItemVerFormCajaCierre.setVisible((this.isVisibilidadCeldaVerFormCajaCierre && this.isPermisoVerFormCajaCierre));			
			this.jMenuItemAbrirOrderByCajaCierre.setVisible((this.isVisibilidadCeldaOrdenCajaCierre && this.isPermisoOrdenCajaCierre));			
			//this.jMenuItemMostrarOcultarCajaCierre.setVisible((this.isVisibilidadCeldaOrdenCajaCierre && this.isPermisoOrdenCajaCierre));
			this.jMenuItemDetalleAbrirOrderByCajaCierre.setVisible((this.isVisibilidadCeldaOrdenCajaCierre && this.isPermisoOrdenCajaCierre));			
			//this.jMenuItemDetalleMostrarOcultarCajaCierre.setVisible((this.isVisibilidadCeldaOrdenCajaCierre && this.isPermisoOrdenCajaCierre));			
			this.jMenuItemNuevoRelacionesCajaCierre.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaCierre && this.isPermisoNuevoCajaCierre));			
			this.jMenuItemNuevoGuardarCambiosCajaCierre.setVisible((this.isVisibilidadCeldaNuevoCajaCierre && this.isPermisoNuevoCajaCierre && this.isPermisoGuardarCambiosCajaCierre));									
			
			if(this.jInternalFrameDetalleFormCajaCierre!=null) {
			this.jInternalFrameDetalleFormCajaCierre.jMenuItemModificarCajaCierre.setVisible((this.isVisibilidadCeldaModificarCajaCierre && this.isPermisoActualizarCajaCierre));	
			this.jInternalFrameDetalleFormCajaCierre.jMenuItemActualizarCajaCierre.setVisible((this.isVisibilidadCeldaActualizarCajaCierre && this.isPermisoActualizarCajaCierre));	
			this.jInternalFrameDetalleFormCajaCierre.jMenuItemEliminarCajaCierre.setVisible((this.isVisibilidadCeldaEliminarCajaCierre && this.isPermisoEliminarCajaCierre));
			this.jInternalFrameDetalleFormCajaCierre.jMenuItemCancelarCajaCierre.setVisible(this.isVisibilidadCeldaCancelarCajaCierre);				
			}
			
			this.jMenuItemGuardarCambiosCajaCierre.setVisible((this.isVisibilidadCeldaGuardarCajaCierre && this.isPermisoGuardarCambiosCajaCierre));						
			this.jMenuItemGuardarCambiosTablaCajaCierre.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaCierre && this.isPermisoGuardarCambiosCajaCierre));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCajaCierre=this.jButtonNuevoCajaCierre.isVisible();
			this.isVisibilidadCeldaDuplicarCajaCierre=this.jButtonDuplicarCajaCierre.isVisible();
			this.isVisibilidadCeldaCopiarCajaCierre=this.jButtonCopiarCajaCierre.isVisible();
			this.isVisibilidadCeldaVerFormCajaCierre=this.jButtonVerFormCajaCierre.isVisible();
			
			this.isVisibilidadCeldaOrdenCajaCierre=this.jButtonAbrirOrderByCajaCierre.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCajaCierre=this.jButtonNuevoRelacionesCajaCierre.isVisible();
			this.isVisibilidadCeldaModificarCajaCierre=this.jButtonModificarCajaCierre.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaCierre!=null) {
			this.isVisibilidadCeldaActualizarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jButtonActualizarCajaCierre.isVisible();
			this.isVisibilidadCeldaEliminarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jButtonEliminarCajaCierre.isVisible();
			this.isVisibilidadCeldaCancelarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jButtonCancelarCajaCierre.isVisible();
			this.isVisibilidadCeldaGuardarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jButtonGuardarCambiosCajaCierre.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCajaCierre=this.jButtonGuardarCambiosTablaCajaCierre.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCajaCierre=this.jButtonNuevoToolBarCajaCierre.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajaCierre=this.jButtonNuevoRelacionesToolBarCajaCierre.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaCierre!=null) {
			this.isVisibilidadCeldaModificarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jButtonModificarToolBarCajaCierre.isVisible();
			this.isVisibilidadCeldaActualizarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jButtonActualizarToolBarCajaCierre.isVisible();
			this.isVisibilidadCeldaEliminarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jButtonEliminarToolBarCajaCierre.isVisible();
			this.isVisibilidadCeldaCancelarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jButtonCancelarToolBarCajaCierre.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajaCierre=this.jButtonGuardarCambiosToolBarCajaCierre.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajaCierre=this.jButtonGuardarCambiosTablaToolBarCajaCierre.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCajaCierre=this.jMenuItemNuevoCajaCierre.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajaCierre=this.jMenuItemNuevoRelacionesCajaCierre.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaCierre!=null) {
			this.isVisibilidadCeldaModificarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jMenuItemModificarCajaCierre.isVisible();
			this.isVisibilidadCeldaActualizarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jMenuItemActualizarCajaCierre.isVisible();
			this.isVisibilidadCeldaEliminarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jMenuItemEliminarCajaCierre.isVisible();
			this.isVisibilidadCeldaCancelarCajaCierre=this.jInternalFrameDetalleFormCajaCierre.jMenuItemCancelarCajaCierre.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajaCierre=this.jMenuItemGuardarCambiosCajaCierre.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajaCierre=this.jMenuItemGuardarCambiosTablaCajaCierre.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCajaCierre(Boolean esInicializar) {
		if(CajaCierreJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cajacierreSessionBean.getConGuardarRelaciones()) {
				//if(this.cajacierreSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCajaCierre();
			}
			
			this.inicializarActualizarBindingBotonesManualCajaCierre(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCajaCierre() {
		this.jButtonNuevoCajaCierre.setVisible(this.isPermisoNuevoCajaCierre);			
		this.jButtonDuplicarCajaCierre.setVisible(this.isPermisoDuplicarCajaCierre);			
		this.jButtonCopiarCajaCierre.setVisible(this.isPermisoCopiarCajaCierre);			
		this.jButtonVerFormCajaCierre.setVisible(this.isPermisoVerFormCajaCierre);			
		
		this.jButtonAbrirOrderByCajaCierre.setVisible(this.isPermisoOrdenCajaCierre);					
		
		this.jButtonNuevoRelacionesCajaCierre.setVisible(this.isPermisoNuevoCajaCierre);			
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaCierre.jButtonModificarCajaCierre.setVisible(this.isPermisoActualizarCajaCierre);	
			this.jInternalFrameDetalleFormCajaCierre.jButtonActualizarCajaCierre.setVisible(this.isPermisoActualizarCajaCierre);	
			this.jInternalFrameDetalleFormCajaCierre.jButtonEliminarCajaCierre.setVisible(this.isPermisoEliminarCajaCierre);
			this.jInternalFrameDetalleFormCajaCierre.jButtonCancelarCajaCierre.setVisible(this.isVisibilidadCeldaCancelarCajaCierre);						
			this.jInternalFrameDetalleFormCajaCierre.jButtonGuardarCambiosCajaCierre.setVisible(this.isPermisoGuardarCambiosCajaCierre);							
		}
		
		this.jButtonGuardarCambiosTablaCajaCierre.setVisible(this.isPermisoActualizarCajaCierre);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCajaCierre() {
		this.jInternalFrameDetalleFormCajaCierre.jButtonModificarCajaCierre.setVisible(this.isPermisoActualizarCajaCierre);	
		this.jInternalFrameDetalleFormCajaCierre.jButtonActualizarCajaCierre.setVisible(this.isPermisoActualizarCajaCierre);	
		this.jInternalFrameDetalleFormCajaCierre.jButtonEliminarCajaCierre.setVisible(this.isPermisoEliminarCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jButtonCancelarCajaCierre.setVisible(this.isVisibilidadCeldaCancelarCajaCierre);							
		this.jInternalFrameDetalleFormCajaCierre.jButtonGuardarCambiosCajaCierre.setVisible((this.isVisibilidadCeldaGuardarCajaCierre && this.isPermisoGuardarCambiosCajaCierre));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCajaCierre() {
		if(CajaCierreJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCajaCierre();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCajaCierre() {
	}
	
	public void jTableDatosCajaCierreListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCajaCierre(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCajaCierreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaCierre(this.getcajacierre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajacierre==null) {
						this.cajacierre = new CajaCierre();
					}

					this.setVariablesFormularioToObjetoActualCajaCierre(this.cajacierre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
				}

				if(this.cajacierre.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cajacierre.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaCierre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCajaCierreUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCajaCierre(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaCierre.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaCierre.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaCierre(this.getcajacierre(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cajacierreLogic.getConnexion());

				if(this.cajacierre.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cajacierre.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaCierre=(TitledBorder)this.jScrollPanelDatosCajaCierre.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCajaCierre.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCajaCierreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaCierre(this.getcajacierre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajacierre==null) {
						this.cajacierre = new CajaCierre();
					}

					this.setVariablesFormularioToObjetoActualCajaCierre(this.cajacierre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
				}

				if(this.cajacierre.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cajacierre.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaCierre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCajaCierreUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCajaCierre(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaCierre.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaCierre.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaCierre(this.getcajacierre(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cajacierreLogic.getConnexion());

				if(this.cajacierre.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cajacierre.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaCierre=(TitledBorder)this.jScrollPanelDatosCajaCierre.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCajaCierre.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCajaCierreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaCierre(this.getcajacierre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajacierre==null) {
						this.cajacierre = new CajaCierre();
					}

					this.setVariablesFormularioToObjetoActualCajaCierre(this.cajacierre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
				}

				if(this.cajacierre.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cajacierre.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaCierre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cajaCajaCierreUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocaja=true;

			idTienePermisocaja=this.tienePermisosUsuarioEnPaginaWebCajaCierre(CajaConstantesFunciones.CLASSNAME);

			if(idTienePermisocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaCierre.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaCierre.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaCierre(this.getcajacierre(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);

				this.cajaBeanSwingJInternalFrame=new CajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaBeanSwingJInternalFrame.getCajaLogic().setConnexion(this.cajacierreLogic.getConnexion());

				if(this.cajacierre.getid_caja()!=null) {
					this.cajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaBeanSwingJInternalFrame.setIdActual(this.cajacierre.getid_caja());
					this.cajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCaja();
				}

				JInternalFrameBase jinternalFrame =this.cajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaCierre=(TitledBorder)this.jScrollPanelDatosCajaCierre.getBorder();
				TitledBorder titledBordercaja=(TitledBorder)this.cajaBeanSwingJInternalFrame.jScrollPanelDatosCaja.getBorder();

				titledBordercaja.setTitle(titledBorderCajaCierre.getTitle() + " -> Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cajaCajaCierreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaCierre(this.getcajacierre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajacierre==null) {
						this.cajacierre = new CajaCierre();
					}

					this.setVariablesFormularioToObjetoActualCajaCierre(this.cajacierre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
				}

				if(this.cajacierre.getid_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja = "+this.cajacierre.getid_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaCierre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_cierreCajaCierreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaCierre(this.getcajacierre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajacierre==null) {
						this.cajacierre = new CajaCierre();
					}

					this.setVariablesFormularioToObjetoActualCajaCierre(this.cajacierre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
				}

				if(this.cajacierre.getfecha_cierre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_cierre = '"+Funciones2.getStringPostgresDate(this.cajacierre.getfecha_cierre())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaCierre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_cierreCajaCierreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaCierre(this.getcajacierre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajacierre==null) {
						this.cajacierre = new CajaCierre();
					}

					this.setVariablesFormularioToObjetoActualCajaCierre(this.cajacierre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
				}

				if(this.cajacierre.gethora_cierre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_cierre = "+this.cajacierre.gethora_cierre().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaCierre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoCajaCierreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaCierre(this.getcajacierre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajacierre==null) {
						this.cajacierre = new CajaCierre();
					}

					this.setVariablesFormularioToObjetoActualCajaCierre(this.cajacierre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);
				}

				if(this.cajacierre.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.cajacierre.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaCierre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCajaCajaCierreActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaCierre(false,false);

			this.getCajaCierresFK_IdCaja();

			this.inicializarActualizarBindingCajaCierre(false);

			//if(CajaCierreBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaCierre(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCajaCierreActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaCierre(false,false);

			this.getCajaCierresFK_IdEmpresa();

			this.inicializarActualizarBindingCajaCierre(false);

			//if(CajaCierreBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaCierre(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCajaCierreActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaCierre(false,false);

			this.getCajaCierresFK_IdSucursal();

			this.inicializarActualizarBindingCajaCierre(false);

			//if(CajaCierreBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaCierre(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajacierreLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCajaCierre() {
		if(this.jInternalFrameDetalleFormCajaCierre!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) {
			this.jInternalFrameDetalleFormCajaCierre.setVisible(false);	    			
			this.jInternalFrameDetalleFormCajaCierre.dispose();
			this.jInternalFrameDetalleFormCajaCierre=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCajaCierre!=null) {
			this.jInternalFrameReporteDinamicoCajaCierre.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCajaCierre.dispose();
			this.jInternalFrameReporteDinamicoCajaCierre=null;
		}
		
		if(this.jInternalFrameImportacionCajaCierre!=null) {
			this.jInternalFrameImportacionCajaCierre.setVisible(false);	    			
			this.jInternalFrameImportacionCajaCierre.dispose();
			this.jInternalFrameImportacionCajaCierre=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCajaCierre();
			
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			
			
			if(sTipo.equals("NuevoCajaCierre")) {
				jButtonNuevoCajaCierreActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCajaCierre")) {
				jButtonDuplicarCajaCierreActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCajaCierre")) {
				jButtonCopiarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("VerFormCajaCierre")) {
				jButtonVerFormCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCajaCierre")) {
				jButtonNuevoCajaCierreActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCajaCierre")) {
				jButtonDuplicarCajaCierreActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCajaCierre")) {
				jButtonNuevoCajaCierreActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCajaCierre")) {
				jButtonDuplicarCajaCierreActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCajaCierre")) {
				jButtonNuevoCajaCierreActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCajaCierre")) {
				jButtonNuevoCajaCierreActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCajaCierre")) {
				jButtonNuevoCajaCierreActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCajaCierre")) {
				jButtonModificarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCajaCierre")) {
				jButtonModificarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCajaCierre")) {
				jButtonModificarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCajaCierre")) {
				jButtonActualizarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCajaCierre")) {
				jButtonActualizarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCajaCierre")) {
				jButtonActualizarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("EliminarCajaCierre")) {
				jButtonEliminarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCajaCierre")) {
				jButtonEliminarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCajaCierre")) {
				jButtonEliminarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("CancelarCajaCierre")) {
				jButtonCancelarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCajaCierre")) {
				jButtonCancelarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCajaCierre")) {
				jButtonCancelarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("CerrarCajaCierre")) {
				jButtonCerrarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCajaCierre")) {
				jButtonCerrarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCajaCierre")) {
				jButtonCerrarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCajaCierre")) {
				jButtonMostrarOcultarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCajaCierre")) {
				jButtonCancelarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCajaCierre")) {
				jButtonGuardarCambiosCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCajaCierre")) {
				jButtonGuardarCambiosCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCajaCierre")) {
				jButtonCopiarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCajaCierre")) {
				jButtonVerFormCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCajaCierre")) {
				jButtonGuardarCambiosCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCajaCierre")) {
				jButtonCopiarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCajaCierre")) {
				jButtonVerFormCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCajaCierre")) {
				jButtonGuardarCambiosCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCajaCierre")) {
				jButtonGuardarCambiosCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCajaCierre")) {
				jButtonGuardarCambiosCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCajaCierre")) {
				jButtonRecargarInformacionCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCajaCierre")) {
				jButtonRecargarInformacionCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCajaCierre")) {
				jButtonRecargarInformacionCajaCierreActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCajaCierre")) {
				jButtonAnterioresCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCajaCierre")) {
				jButtonAnterioresCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCajaCierre")) {
				jButtonAnterioresCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCajaCierre")) {
				jButtonSiguientesCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCajaCierre")) {
				jButtonSiguientesCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCajaCierre")) {
				jButtonSiguientesCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCajaCierre") || sTipo.equals("MenuItemDetalleAbrirOrderByCajaCierre")) {
				jButtonAbrirOrderByCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCajaCierre") || sTipo.equals("MenuItemDetalleMostrarOcultarCajaCierre")) {
				jButtonMostrarOcultarCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCajaCierre")) {
				jButtonNuevoGuardarCambiosCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCajaCierre")) {
				jButtonNuevoGuardarCambiosCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCajaCierre")) {
				jButtonNuevoGuardarCambiosCajaCierreActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCajaCierre")) {
				jButtonCerrarReporteDinamicoCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCajaCierre")) {
				jButtonGenerarReporteDinamicoCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCajaCierre")) {
				
				jButtonGenerarExcelReporteDinamicoCajaCierreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCajaCierre")) {
				jButtonCerrarImportacionCajaCierreActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCajaCierre")) {
				
				jButtonGenerarImportacionCajaCierreActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCajaCierre")) {
				
				jButtonAbrirImportacionCajaCierreActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCajaCierre")) {
				jComboBoxTiposAccionesCajaCierreActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCajaCierre")) {
				jComboBoxTiposRelacionesCajaCierreActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCajaCierre")) {
				jComboBoxTiposAccionesCajaCierreActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCajaCierre")) {
				
				jComboBoxTiposSeleccionarCajaCierreActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCajaCierre")) {
				jTextFieldValorCampoGeneralCajaCierreActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCajaCierre")) {
				jButtonAbrirOrderByCajaCierreActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCajaCierre")) {
				jButtonAbrirOrderByCajaCierreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCajaCierre")) {
				jButtonCerrarOrderByCajaCierreActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajaCierreBusqueda")) {
				this.jButtonidCajaCierreBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajaCierreUpdate")) {
				this.jButtonid_empresaCajaCierreUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajaCierreBusqueda")) {
				this.jButtonid_empresaCajaCierreBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCajaCierreUpdate")) {
				this.jButtonid_sucursalCajaCierreUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCajaCierreBusqueda")) {
				this.jButtonid_sucursalCajaCierreBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaCajaCierreUpdate")) {
				this.jButtonid_cajaCajaCierreUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaCajaCierreBusqueda")) {
				this.jButtonid_cajaCajaCierreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_cierreCajaCierreBusqueda")) {
				this.jButtonfecha_cierreCajaCierreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_cierreCajaCierreBusqueda")) {
				this.jButtonhora_cierreCajaCierreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoCajaCierreBusqueda")) {
				this.jButtonesta_activoCajaCierreBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCajaCajaCierre")) {
				this.jButtonFK_IdCajaCajaCierreActionPerformed(evt);
			}
			
			;
			
			
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCajaCierre();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaCierreActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
				


				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaCierre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaCierre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CajaCierre cajacierreLocal=null;
			
			if(!this.getEsControlTabla()) {
				cajacierreLocal=this.cajacierre;
			} else {
				cajacierreLocal=this.cajacierreAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
							
				
				


				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaCierre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaCierre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaCierreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreAnterior =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajacierreAnterior =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
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
			
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			
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
			
			


			
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaCierreActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
								
						
				


				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaCierre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaCierre.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
								
				
				


				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaCierre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaCierre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaCierreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreAnterior =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajacierreAnterior =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaCierreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreAnterior =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajacierreAnterior =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaCierreActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
							
				
				


				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaCierre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaCierre.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaCierreActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajacierreAnterior =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajacierreAnterior =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
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
			
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			
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
			
			


			
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaCierreActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
								
				
				


				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaCierre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaCierre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaCierreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreAnterior =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajacierreAnterior =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaCierreActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaCierreActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCajaCierre")) {
					jCheckBoxSeleccionarTodosCajaCierreItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCajaCierre")) {
					jCheckBoxSeleccionadosCajaCierreItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCajaCierre")) {
					
				}
				
				


				
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaCierre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaCierre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
												
				
				


				
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaCierre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaCierre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaCierreActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajacierreAnterior =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajacierreAnterior =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaCierreActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
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
			
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
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
			
			


			
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaCierreActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaCierre.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaCierre.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajacierre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajacierre);
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
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
				
				


				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaCierre.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaCierre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaCierreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajacierreAnterior =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajacierreAnterior =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCajaCierre")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCajaCierreListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCajaCierre.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cajacierre =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cajacierre =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cajacierre);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCajaCierre")) {
				
				}
				
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCajaCierre")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCajaCierre.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCajaCierre")) {
			
			}
			
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCajaCierre();
			
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			
			if(sTipo.equals("NuevoCajaCierre")) {
				jButtonNuevoCajaCierreActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCajaCierre")) {
				jButtonDuplicarCajaCierreActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCajaCierre")) {
				jButtonCopiarCajaCierreActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCajaCierre")) {
				jButtonVerFormCajaCierreActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCajaCierre")) {
				jButtonNuevoCajaCierreActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCajaCierre")) {
				jButtonModificarCajaCierreActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCajaCierre")) {
				jButtonActualizarCajaCierreActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCajaCierre")) {
				jButtonEliminarCajaCierreActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCajaCierre")) {
				jButtonGuardarCambiosCajaCierreActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCajaCierre")) {
				jButtonCancelarCajaCierreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCajaCierre")) {
				jButtonCerrarCajaCierreActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCajaCierre")) {
				jButtonGuardarCambiosCajaCierreActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCajaCierre")) {
				jButtonNuevoGuardarCambiosCajaCierreActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCajaCierre")) {
				jButtonAbrirOrderByCajaCierreActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCajaCierre")) {
				jButtonRecargarInformacionCajaCierreActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCajaCierre")) {
				jButtonAnterioresCajaCierreActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCajaCierre")) {
				jButtonSiguientesCajaCierreActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajaCierreBusqueda")) {
				this.jButtonidCajaCierreBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajaCierreUpdate")) {
				this.jButtonid_empresaCajaCierreUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajaCierreBusqueda")) {
				this.jButtonid_empresaCajaCierreBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCajaCierreUpdate")) {
				this.jButtonid_sucursalCajaCierreUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCajaCierreBusqueda")) {
				this.jButtonid_sucursalCajaCierreBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaCajaCierreUpdate")) {
				this.jButtonid_cajaCajaCierreUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaCajaCierreBusqueda")) {
				this.jButtonid_cajaCajaCierreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_cierreCajaCierreBusqueda")) {
				this.jButtonfecha_cierreCajaCierreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_cierreCajaCierreBusqueda")) {
				this.jButtonhora_cierreCajaCierreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoCajaCierreBusqueda")) {
				this.jButtonesta_activoCajaCierreBusquedaActionPerformed(evt);
			}
			
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCajaCierre();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCajaCierre")) {
				closingInternalFrameCajaCierre();
				
			} else if(sTipo.equals("jButtonCancelarCajaCierre")) {
				JInternalFrameBase jInternalFrameDetalleFormCajaCierre = (JInternalFrameBase)evt.getSource();
	            	
	            CajaCierreBeanSwingJInternalFrame jInternalFrameParent=(CajaCierreBeanSwingJInternalFrame)jInternalFrameDetalleFormCajaCierre.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCajaCierreActionPerformed(null);
			}
			
			CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajacierre,new Object(),this.cajacierreParameterGeneral,this.cajacierreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCajaCierre(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCajaCierre(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCajaCierre(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cajacierre)) {
			if(!esControlTabla) {
				if(CajaCierreJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCajaCierre(this.cajacierre,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);			
				}
				
				if(this.cajacierreSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCajaCierre(this.cajacierre,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cajacierreReturnGeneral=cajacierreLogic.procesarEventosCajaCierresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajacierreLogic.getCajaCierres(),this.cajacierre,this.cajacierreParameterGeneral,this.isEsNuevoCajaCierre,classes);//this.cajacierreLogic.getCajaCierre()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCajaCierre(this.cajacierreReturnGeneral,this.cajacierreBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cajacierreSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCajaCierre(classes,this.cajacierreReturnGeneral,this.cajacierreBean,false);
					}
						
					if(this.cajacierreReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCajaCierre(this.cajacierreReturnGeneral.getCajaCierre());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCajaCierre(this.cajacierreReturnGeneral.getCajaCierre());	
					}
						
					if(this.cajacierreReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCajaCierre(this.cajacierreReturnGeneral.getCajaCierre(),classes);//this.cajacierreBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCajaCierre(this.cajacierre,classes);//this.cajacierreBean);									
				}
			
				if(CajaCierreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCajaCierre(this.cajacierre,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaCierre(this.cajacierre);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cajacierreAnterior!=null) {
						this.cajacierre=this.cajacierreAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cajacierreReturnGeneral=cajacierreLogic.procesarEventosCajaCierresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajacierreLogic.getCajaCierres(),this.cajacierre,this.cajacierreParameterGeneral,this.isEsNuevoCajaCierre,classes);//this.cajacierreLogic.getCajaCierre()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajacierreSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajacierreSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cajacierreReturnGeneral.getCajaCierre(),cajacierreLogic.getCajaCierres());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cajacierreReturnGeneral.getCajaCierre(),this.cajacierres);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCajaCierre.repaint();
				
				//((AbstractTableModel) this.jTableDatosCajaCierre.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCajaCierre();
			}
		}
	}
	
	public void actualizarVisualTableDatosCajaCierre() throws Exception {
		
		CajaCierreModel cajacierreModel=(CajaCierreModel)this.jTableDatosCajaCierre.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajacierreModel.cajacierres=this.cajacierreLogic.getCajaCierres();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cajacierreModel.cajacierres=this.cajacierres;
		}
		
		
		((CajaCierreModel) this.jTableDatosCajaCierre.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCajaCierre() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcajacierreAnterior(),this.cajacierreLogic.getCajaCierres());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcajacierreAnterior(),this.cajacierres);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCajaCierre();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCajaCierre(CajaCierre cajacierre,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
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
										
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajacierre,new Object(),generalEntityParameterGeneral,this.cajacierreReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cajacierreSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CajaCierreConstantesFunciones.getClassesRelationshipsOfCajaCierre(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CajaCierreConstantesFunciones.getClassesRelationshipsFromStringsOfCajaCierre(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCajaCierre(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CajaCierreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajacierre,new Object(),generalEntityParameterGeneral,this.cajacierreReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCajaCierre(CajaCierreBean cajacierreBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCajaCierre(ArrayList<Classe> classes,CajaCierreReturnGeneral cajacierreReturnGeneral,CajaCierreBean cajacierreBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCajaCierre(CajaCierre cajacierre,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cajacierre)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCajaCierre = new CajaCierreDetalleFormJInternalFrame(jDesktopPane,this.cajacierreSessionBean.getConGuardarRelaciones(),this.cajacierreSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.setVisible(false);
		this.jInternalFrameDetalleFormCajaCierre.setSelected(false);						
		
		this.jInternalFrameDetalleFormCajaCierre.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCajaCierre.cajacierreLogic=this.cajacierreLogic;
		
		this.cargarCombosFrameForeignKeyCajaCierre("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCajaCierre();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajaCierre();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCajaCierre("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCajaCierre();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCajaCierre.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajaCierre"));
		
		this.jInternalFrameDetalleFormCajaCierre.jButtonModificarCajaCierre.addActionListener(new ButtonActionListener(this,"ModificarCajaCierre"));

		
		this.jInternalFrameDetalleFormCajaCierre.jButtonModificarToolBarCajaCierre.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajaCierre"));
					
		this.jInternalFrameDetalleFormCajaCierre.jMenuItemModificarCajaCierre.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajaCierre"));		
		
		
		
		this.jInternalFrameDetalleFormCajaCierre.jButtonActualizarCajaCierre.addActionListener (new ButtonActionListener(this,"ActualizarCajaCierre"));
		
		
		this.jInternalFrameDetalleFormCajaCierre.jButtonActualizarToolBarCajaCierre.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajaCierre"));
						
		this.jInternalFrameDetalleFormCajaCierre.jMenuItemActualizarCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajaCierre"));		
		
		
		
		this.jInternalFrameDetalleFormCajaCierre.jButtonEliminarCajaCierre.addActionListener (new ButtonActionListener(this,"EliminarCajaCierre"));
		
		
		this.jInternalFrameDetalleFormCajaCierre.jButtonEliminarToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajaCierre"));
								
		this.jInternalFrameDetalleFormCajaCierre.jMenuItemEliminarCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajaCierre"));		
		
		
		
		this.jInternalFrameDetalleFormCajaCierre.jButtonCancelarCajaCierre.addActionListener (new ButtonActionListener(this,"CancelarCajaCierre"));
		
		
		this.jInternalFrameDetalleFormCajaCierre.jButtonCancelarToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajaCierre"));
					
		this.jInternalFrameDetalleFormCajaCierre.jMenuItemCancelarCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajaCierre"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCajaCierre.jMenuItemDetalleCerrarCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajaCierre"));		
		
		
		
		this.jInternalFrameDetalleFormCajaCierre.jButtonGuardarCambiosToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaCierre"));
		
		
		
		this.jInternalFrameDetalleFormCajaCierre.jButtonGuardarCambiosToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaCierre"));
		
		
		
		this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajaCierre"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonidCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"idCajaCierreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_empresaCajaCierreUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaCierreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_empresaCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaCierreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_sucursalCajaCierreUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaCierreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_sucursalCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaCierreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_cajaCajaCierreUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaCierreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_cajaCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaCierreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonfecha_cierreCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"fecha_cierreCajaCierreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonhora_cierreCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"hora_cierreCajaCierreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonesta_activoCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoCajaCierreBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCajaCierre.jTabbedPaneRelacionesCajaCierre.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajaCierre"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCajaCierre"));
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaCierre.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajaCierre"));
		}
		
		this.jTableDatosCajaCierre.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCajaCierre"));
		
		this.jTableDatosCajaCierre.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCajaCierre"));
		
		this.jButtonNuevoCajaCierre.addActionListener(new ButtonActionListener(this,"NuevoCajaCierre"));
		
		this.jButtonDuplicarCajaCierre.addActionListener(new ButtonActionListener(this,"DuplicarCajaCierre"));
		
		this.jButtonCopiarCajaCierre.addActionListener(new ButtonActionListener(this,"CopiarCajaCierre"));
		
		this.jButtonVerFormCajaCierre.addActionListener(new ButtonActionListener(this,"VerFormCajaCierre"));
		
		
		this.jButtonNuevoToolBarCajaCierre.addActionListener(new ButtonActionListener(this,"NuevoToolBarCajaCierre"));
			
		this.jButtonDuplicarToolBarCajaCierre.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCajaCierre"));
			
		this.jMenuItemNuevoCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCajaCierre"));
			
		this.jMenuItemDuplicarCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCajaCierre"));		
		
		
		this.jButtonNuevoRelacionesCajaCierre.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCajaCierre"));
		
		
		this.jButtonNuevoRelacionesToolBarCajaCierre.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCajaCierre"));
			
		this.jMenuItemNuevoRelacionesCajaCierre.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCajaCierre"));		
		
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaCierre.jButtonModificarCajaCierre.addActionListener(new ButtonActionListener(this,"ModificarCajaCierre"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaCierre.jButtonModificarToolBarCajaCierre.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajaCierre"));
			
			this.jInternalFrameDetalleFormCajaCierre.jMenuItemModificarCajaCierre.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajaCierre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCajaCierre.jButtonActualizarCajaCierre.addActionListener (new ButtonActionListener(this,"ActualizarCajaCierre"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaCierre.jButtonActualizarToolBarCajaCierre.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajaCierre"));
				
			this.jInternalFrameDetalleFormCajaCierre.jMenuItemActualizarCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajaCierre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaCierre.jButtonEliminarCajaCierre.addActionListener (new ButtonActionListener(this,"EliminarCajaCierre"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaCierre.jButtonEliminarToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajaCierre"));
						
			this.jInternalFrameDetalleFormCajaCierre.jMenuItemEliminarCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajaCierre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaCierre.jButtonCancelarCajaCierre.addActionListener (new ButtonActionListener(this,"CancelarCajaCierre"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaCierre.jButtonCancelarToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajaCierre"));
			
			this.jInternalFrameDetalleFormCajaCierre.jMenuItemCancelarCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajaCierre"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCajaCierre"));		
		
		
		this.jButtonCerrarCajaCierre.addActionListener (new ButtonActionListener(this,"CerrarCajaCierre"));
		
		
		this.jButtonCerrarToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"CerrarToolBarCajaCierre"));
			
		this.jMenuItemCerrarCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCajaCierre"));
			
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaCierre.jMenuItemDetalleCerrarCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajaCierre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaCierre.jButtonGuardarCambiosCajaCierre.addActionListener (new ButtonActionListener(this,"GuardarCambiosCajaCierre"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaCierre.jButtonGuardarCambiosToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaCierre"));
		}
		
		this.jButtonCopiarToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"CopiarToolBarCajaCierre"));
			
		this.jButtonVerFormToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"VerFormToolBarCajaCierre"));
		
		this.jMenuItemGuardarCambiosCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCajaCierre"));
			
		this.jMenuItemCopiarCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCajaCierre"));		
		
		this.jMenuItemVerFormCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCajaCierre"));		
		
		
		this.jButtonGuardarCambiosTablaCajaCierre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajaCierre"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCajaCierre"));
			
		this.jMenuItemGuardarCambiosTablaCajaCierre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajaCierre"));		
		
		
		
		this.jButtonRecargarInformacionCajaCierre.addActionListener (new ButtonActionListener(this,"RecargarInformacionCajaCierre"));
					
		this.jButtonRecargarInformacionToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCajaCierre"));
		
		this.jMenuItemRecargarInformacionCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCajaCierre"));		
		
		
		
		this.jButtonAnterioresCajaCierre.addActionListener (new ButtonActionListener(this,"AnterioresCajaCierre"));
		
		
		this.jButtonAnterioresToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCajaCierre"));
		
		this.jMenuItemAnterioresCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCajaCierre"));		
		
		
		this.jButtonSiguientesCajaCierre.addActionListener (new ButtonActionListener(this,"SiguientesCajaCierre"));
		
		
		this.jButtonSiguientesToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCajaCierre"));
			
		this.jMenuItemSiguientesCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCajaCierre"));
			
		this.jMenuItemAbrirOrderByCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCajaCierre"));
			
		this.jMenuItemMostrarOcultarCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCajaCierre"));
			
		this.jMenuItemDetalleAbrirOrderByCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCajaCierre"));
			
		this.jMenuItemDetalleMostarOcultarCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCajaCierre"));		
		
		
		this.jButtonNuevoGuardarCambiosCajaCierre.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCajaCierre"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCajaCierre"));
			
		this.jMenuItemNuevoGuardarCambiosCajaCierre.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCajaCierre"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCajaCierre.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCajaCierre"));

		this.jCheckBoxSeleccionadosCajaCierre.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCajaCierre"));
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajaCierre"));
		}
		
		
		this.jComboBoxTiposRelacionesCajaCierre.addActionListener (new ButtonActionListener(this,"TiposRelacionesCajaCierre"));
			
		this.jComboBoxTiposAccionesCajaCierre.addActionListener (new ButtonActionListener(this,"TiposAccionesCajaCierre"));
					
		this.jComboBoxTiposSeleccionarCajaCierre.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCajaCierre"));
			
		this.jTextFieldValorCampoGeneralCajaCierre.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCajaCierre"));		
		
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonidCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"idCajaCierreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_empresaCajaCierreUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaCierreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_empresaCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaCierreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_sucursalCajaCierreUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaCierreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_sucursalCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaCierreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_cajaCajaCierreUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaCierreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_cajaCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaCierreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonfecha_cierreCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"fecha_cierreCajaCierreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonhora_cierreCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"hora_cierreCajaCierreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonesta_activoCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoCajaCierreBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCajaCajaCierre.addActionListener(new ButtonActionListener(this,"FK_IdCajaCajaCierre"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCajaCierre!=null) {
				this.jInternalFrameReporteDinamicoCajaCierre.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaCierre"));
				this.jInternalFrameReporteDinamicoCajaCierre.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaCierre"));
				this.jInternalFrameReporteDinamicoCajaCierre.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaCierre"));
			}
			
			//this.jButtonCerrarReporteDinamicoCajaCierre.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaCierre"));				
			//this.jButtonGenerarReporteDinamicoCajaCierre.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaCierre"));
			//this.jButtonGenerarExcelReporteDinamicoCajaCierre.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaCierre"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCajaCierre!=null) {
				this.jInternalFrameImportacionCajaCierre.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajaCierre"));
				this.jInternalFrameImportacionCajaCierre.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajaCierre"));
				this.jInternalFrameImportacionCajaCierre.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajaCierre"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCajaCierre.addActionListener (new ButtonActionListener(this,"AbrirOrderByCajaCierre"));
			
			this.jButtonAbrirOrderByToolBarCajaCierre.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCajaCierre"));			
			
			if(this.jInternalFrameOrderByCajaCierre!=null) {
				this.jInternalFrameOrderByCajaCierre.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajaCierre"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCajaCierre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaCierre.jTabbedPaneRelacionesCajaCierre.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajaCierre"));
		
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
            		closingInternalFrameCajaCierre();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCajaCierre.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCajaCierre = (JInternalFrameBase)event.getSource();
	            	
	            CajaCierreBeanSwingJInternalFrame jInternalFrameParent=(CajaCierreBeanSwingJInternalFrame)jInternalFrameDetalleFormCajaCierre.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCajaCierreActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCajaCierre.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCajaCierreListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCajaCierre.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCajaCierre.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaCierreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaCierreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaCierreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCajaCierre";
		inputMap = this.jButtonNuevoCajaCierre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCajaCierre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajaCierreActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaCierreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaCierreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaCierreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCajaCierre";
		inputMap = this.jButtonNuevoRelacionesCajaCierre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCajaCierre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajaCierreActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCajaCierre";
		inputMap = this.jButtonModificarCajaCierre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCajaCierre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCajaCierreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCajaCierre";
		inputMap = this.jButtonActualizarCajaCierre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCajaCierre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCajaCierreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCajaCierre";
		inputMap = this.jButtonEliminarCajaCierre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCajaCierre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCajaCierreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCajaCierre";
		inputMap = this.jButtonCancelarCajaCierre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCajaCierre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCajaCierreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCajaCierre";
		inputMap = this.jButtonCerrarCajaCierre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCajaCierre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCajaCierreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCajaCierre.jButtonGuardarCambiosCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCajaCierre";
		inputMap = this.jInternalFrameDetalleFormCajaCierre.jButtonGuardarCambiosCajaCierre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCajaCierre.jButtonGuardarCambiosCajaCierre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCajaCierreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCajaCierre.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCajaCierreItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCajaCierre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCajaCierreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCajaCierre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCajaCierreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCajaCierre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCajaCierreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonidCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"idCajaCierreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_empresaCajaCierreUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaCierreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_empresaCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaCierreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_sucursalCajaCierreUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaCierreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_sucursalCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaCierreBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_cajaCajaCierreUpdate.addActionListener(new ButtonActionListener(this,"id_cajaCajaCierreUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonid_cajaCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaCajaCierreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonfecha_cierreCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"fecha_cierreCajaCierreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonhora_cierreCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"hora_cierreCajaCierreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaCierre.jButtonesta_activoCajaCierreBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoCajaCierreBusqueda"));
		
		
		this.jButtonFK_IdCajaCajaCierre.addActionListener(new ButtonActionListener(this,"FK_IdCajaCajaCierre"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCajaCierre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCajaCierreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCajaCierreActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCajaCierre.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCajaCierre(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CajaCierre cajacierreAux:this.cajacierreLogic.getCajaCierres()) {
					cajacierreAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaCierre cajacierreAux:cajacierres) {
					cajacierreAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCajaCierreItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajaCierre(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajaCierre cajacierreAux:this.cajacierreLogic.getCajaCierres()) {
						cajacierreAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaCierre cajacierreAux:cajacierres) {
						cajacierreAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CajaCierre cajacierreAux:this.cajacierreLogic.getCajaCierres()) {
					
						if(sTipoSeleccionar.equals(CajaCierreConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							cajacierreAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaCierre cajacierreAux:cajacierres) {
						
						if(sTipoSeleccionar.equals(CajaCierreConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							cajacierreAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCajaCierre(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajaCierre.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajaCierre.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajaCierre,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCajaCierreItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajaCierre(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCajaCierre.getSelectedRows();
			
			CajaCierre cajacierreLocal=new CajaCierre();
			
			//this.seleccionarTodosCajaCierre(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajacierreLocal =(CajaCierre) this.cajacierreLogic.getCajaCierres().toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cajacierreLocal =(CajaCierre) this.cajacierres.toArray()[this.jTableDatosCajaCierre.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cajacierreLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajaCierre cajacierreAux:this.cajacierreLogic.getCajaCierres()) {
						cajacierreAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaCierre cajacierreAux:cajacierres) {
						cajacierreAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCajaCierre(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajaCierre.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajaCierre.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajaCierre,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCajaCierreItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCajaCierreParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCajaCierreActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCajaCierre(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCajaCierre.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajaCierre cajacierreAux:this.cajacierreLogic.getCajaCierres()) {
				
						if(sTipoSeleccionar.equals(CajaCierreConstantesFunciones.LABEL_FECHACIERRE)) {
							existe=true;
							cajacierreAux.setfecha_cierre(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaCierreConstantesFunciones.LABEL_HORACIERRE)) {
							existe=true;
							cajacierreAux.sethora_cierre(Time.valueOf(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaCierre cajacierreAux:cajacierres) {
					
						if(sTipoSeleccionar.equals(CajaCierreConstantesFunciones.LABEL_FECHACIERRE)) {
							existe=true;
							cajacierreAux.setfecha_cierre(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CajaCierreConstantesFunciones.LABEL_HORACIERRE)) {
							existe=true;
							cajacierreAux.sethora_cierre(Time.valueOf(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCajaCierre(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCajaCierreActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCajaCierre(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCajaCierre=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCajaCierre.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCajaCierre) {				
					conSplash=true;//false;										
					
					//this.startProcessCajaCierre(conSplash);
				
					this.generarReporteCajaCierresSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaCierre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCajaCierresSeleccionados();
				//this.jComboBoxTiposAccionesCajaCierre.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajaCierresSeleccionados(false);
				//this.jComboBoxTiposAccionesCajaCierre.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajaCierresSeleccionados(true);
				//this.jComboBoxTiposAccionesCajaCierre.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajaCierre();
				
				this.exportarCajaCierresSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaCierre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCajaCierres();
				//this.importarCajaCierres();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaCierre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajaCierre();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCajaCierresSeleccionados();
				//this.jComboBoxTiposAccionesCajaCierre.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Caja Cierre", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCajaCierre();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCajaCierre)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCajaCierre(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Caja Cierre",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaCierre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.setSelectedIndex(0);					
				}	
			} 			
			else if(CajaCierreBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCajaCierre) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCajaCierre(conSplash);
					
						//this.actualizarParametrosGeneralCajaCierre();
						
						this.generarReporteProcesoAccionCajaCierresSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCajaCierre.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CajaCierreBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Caja CierreS SELECCIONADOS?", "MANTENIMIENTO DE Caja Cierre", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCajaCierre();
				
						this.actualizarParametrosGeneralCajaCierre();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cajacierreReturnGeneral=cajacierreLogic.procesarAccionCajaCierresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cajacierreLogic.getCajaCierres(),this.cajacierreParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCajaCierreReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajaCierre.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCajaCierre();
					
					CajaCierreBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCajaCierreReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajaCierre.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajaCierre.jComboBoxTiposAccionesFormularioCajaCierre.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCajaCierre(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCajaCierreActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCajaCierre();
			
			if(this.jInternalFrameDetalleFormCajaCierre==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CajaCierre> cajacierresSeleccionados=new ArrayList<CajaCierre>();		
			CajaCierre cajacierre=new CajaCierre();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCajaCierre(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCajaCierre.getSelectedItem();
			
			
			
			
			cajacierresSeleccionados=this.getCajaCierresSeleccionados(true);
			//this.sTipoAccion;
			
			if(cajacierresSeleccionados.size()==1) {
				for(CajaCierre cajacierreAux:cajacierresSeleccionados) {
					cajacierre=cajacierreAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCajaCierre();
			
      		//this.finishProcessCajaCierre(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCajaCierreReturnGeneral() throws Exception {
		if(this.cajacierreReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cajacierreReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cajacierreReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cajacierreReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cajacierreReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cajacierreReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCajaCierre(false);
		}
		
		if(this.cajacierreReturnGeneral.getConRetornoLista() || this.cajacierreReturnGeneral.getConRetornoObjeto()) {
			if(this.cajacierreReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajacierreLogic.setCajaCierres(this.cajacierreReturnGeneral.getCajaCierres());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cajacierreReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajacierreLogic.setCajaCierre(this.cajacierreReturnGeneral.getCajaCierre());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCajaCierre(false);
		}
	}
	
	public void actualizarParametrosGeneralCajaCierre() throws Exception {
		
		
	}
	
	public ArrayList<CajaCierre> getCajaCierresSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CajaCierre> cajacierresSeleccionados=new ArrayList<CajaCierre>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCajaCierre) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CajaCierre cajacierreAux:cajacierreLogic.getCajaCierres()) {
					if(cajacierreAux.getIsSelected()) {
						cajacierresSeleccionados.add(cajacierreAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaCierre cajacierreAux:this.cajacierres) {
					if(cajacierreAux.getIsSelected()) {
						cajacierresSeleccionados.add(cajacierreAux);				
					}
				}
			}
			
			if(cajacierresSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cajacierresSeleccionados.addAll(this.cajacierreLogic.getCajaCierres());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cajacierresSeleccionados.addAll(this.cajacierres);				
					}
				}
			}
		} else {
			cajacierresSeleccionados.add(this.cajacierre);
		}
		
		return cajacierresSeleccionados;
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
	
	public void generarReporteCajaCierresSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCajaCierresSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCajaCierresSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajaCierresSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajaCierresSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Caja Cierre",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCajaCierresSeleccionados() throws Exception {
		ArrayList<CajaCierre> cajacierresSeleccionados=new ArrayList<CajaCierre>();		
		
		cajacierresSeleccionados=this.getCajaCierresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCajaCierres("Todos",cajacierresSeleccionados);
		
	}	
	
	public void generarReporteNormalCajaCierresSeleccionados() throws Exception {
		ArrayList<CajaCierre> cajacierresSeleccionados=new ArrayList<CajaCierre>();		
		
		cajacierresSeleccionados=this.getCajaCierresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCajaCierres("Todos",cajacierresSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCajaCierresSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CajaCierre> cajacierresSeleccionados=new ArrayList<CajaCierre>();
		
		cajacierresSeleccionados=this.getCajaCierresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCajaCierres("Todos",cajacierresSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCajaCierresSeleccionados() throws Exception {
		ArrayList<CajaCierre> cajacierresSeleccionados=new ArrayList<CajaCierre>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCajaCierre();
		
		
		cajacierresSeleccionados=this.getCajaCierresSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCajaCierre();
		
		
		//this.generarReporteCajaCierres("Todos",cajacierresSeleccionados ,cajacierreImplementable,cajacierreImplementableHome);
	}
	
	public void mostrarImportacionCajaCierres() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCajaCierre();
		
		this.abrirFrameImportacionCajaCierre();		
		
			
		//this.generarReporteCajaCierres("Todos",cajacierresSeleccionados ,cajacierreImplementable,cajacierreImplementableHome);
	}
	
	public void importarCajaCierres() throws Exception {		
	
	}
	
	public void exportarCajaCierresSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCajaCierresSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCajaCierresSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCajaCierresSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Caja Cierre",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCajaCierresSeleccionados() throws Exception {
		ArrayList<CajaCierre> cajacierresSeleccionados=new ArrayList<CajaCierre>();		
		
		cajacierresSeleccionados=this.getCajaCierresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajacierre."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCajaCierre(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CajaCierre cajacierreAux:cajacierresSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCajaCierre(cajacierreAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cajacierreAux.setsDetalleGeneralEntityReporte(cajacierreAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajacierreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Cierre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCajaCierre(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CajaCierreConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaCierreConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaCierreConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaCierreConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaCierreConstantesFunciones.LABEL_IDCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaCierreConstantesFunciones.LABEL_FECHACIERRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaCierreConstantesFunciones.LABEL_HORACIERRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaCierreConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCajaCierre(CajaCierre cajacierre,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cajacierre.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cajacierre.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajacierre.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajacierre.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajacierre.getcaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajacierre.getfecha_cierre().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajacierre.gethora_cierre().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajacierre.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCajaCierresSeleccionados() throws Exception {
		ArrayList<CajaCierre> cajacierresSeleccionados=new ArrayList<CajaCierre>();		
		
		cajacierresSeleccionados=this.getCajaCierresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajacierre.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CajaCierres");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCajaCierre(row);				
				iRow++;
			}				
			
			for(CajaCierre cajacierreAux:cajacierresSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCajaCierre(cajacierreAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajacierreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Cierre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCajaCierresSeleccionados() throws Exception {
		ArrayList<CajaCierre> cajacierresSeleccionados=new ArrayList<CajaCierre>();		
		
		cajacierresSeleccionados=this.getCajaCierresSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajacierre.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cajacierres");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cajacierre");
			//elementRoot.appendChild(element);
		
			for(CajaCierre cajacierreAux:cajacierresSeleccionados) {
				element = document.createElement("cajacierre");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCajaCierre(cajacierreAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajacierreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Cierre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCajaCierre(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CajaCierreConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CajaCierreConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CajaCierreConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaCierreConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaCierreConstantesFunciones.LABEL_IDCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaCierreConstantesFunciones.LABEL_FECHACIERRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaCierreConstantesFunciones.LABEL_HORACIERRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaCierreConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCajaCierre(CajaCierre cajacierre,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cajacierre.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cajacierre.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajacierre.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajacierre.getcaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajacierre.getfecha_cierre());
		cell = row.createCell(iColumn++);cell.setCellValue(cajacierre.gethora_cierre());
		cell = row.createCell(iColumn++);cell.setCellValue(cajacierre.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlCajaCierre(CajaCierre cajacierre,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CajaCierreConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cajacierre.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CajaCierreConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cajacierre.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CajaCierreConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cajacierre.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CajaCierreConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cajacierre.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcaja_descripcion = document.createElement(CajaCierreConstantesFunciones.IDCAJA);
		elementcaja_descripcion.appendChild(document.createTextNode(cajacierre.getcaja_descripcion()));
		element.appendChild(elementcaja_descripcion);

		Element elementfecha_cierre = document.createElement(CajaCierreConstantesFunciones.FECHACIERRE);
		elementfecha_cierre.appendChild(document.createTextNode(cajacierre.getfecha_cierre().toString().trim()));
		element.appendChild(elementfecha_cierre);

		Element elementhora_cierre = document.createElement(CajaCierreConstantesFunciones.HORACIERRE);
		elementhora_cierre.appendChild(document.createTextNode(cajacierre.gethora_cierre().toString().trim()));
		element.appendChild(elementhora_cierre);

		Element elementesta_activo = document.createElement(CajaCierreConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(cajacierre.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoCajaCierresSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CajaCierre> cajacierresSeleccionados=new ArrayList<CajaCierre>();
		
		cajacierresSeleccionados=this.getCajaCierresSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCajaCierre(cajacierresSeleccionados);
		
		this.generarReporteCajaCierres("Todos",cajacierresSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCajaCierre(ArrayList<CajaCierre> cajacierresSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CajaCierre cajacierreAux:cajacierresSeleccionados) {
				cajacierreAux.setsDetalleGeneralEntityReporte(cajacierreAux.toString());
			
				if(sTipoSeleccionar.equals(CajaCierreConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cajacierreAux.setsDescripcionGeneralEntityReporte1(cajacierreAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaCierreConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cajacierreAux.setsDescripcionGeneralEntityReporte1(cajacierreAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaCierreConstantesFunciones.LABEL_IDCAJA)) {
					existe=true;
					cajacierreAux.setsDescripcionGeneralEntityReporte1(cajacierreAux.getcaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaCierreConstantesFunciones.LABEL_FECHACIERRE)) {
					existe=true;
					cajacierreAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cajacierreAux.getfecha_cierre()));
				}
				 else if(sTipoSeleccionar.equals(CajaCierreConstantesFunciones.LABEL_HORACIERRE)) {
					existe=true;
					cajacierreAux.setsDescripcionGeneralEntityReporte1(cajacierreAux.gethora_cierre().toString());
				}
				 else if(sTipoSeleccionar.equals(CajaCierreConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					cajacierreAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(cajacierreAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaCierreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCajaCierre(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCajaCierre=true;
				this.isVisibilidadCeldaNuevoRelacionesCajaCierre=true;
				this.isVisibilidadCeldaGuardarCambiosCajaCierre=true;
			}
			
			this.isVisibilidadCeldaModificarCajaCierre=false;
			this.isVisibilidadCeldaActualizarCajaCierre=false;
			this.isVisibilidadCeldaEliminarCajaCierre=false;
			this.isVisibilidadCeldaCancelarCajaCierre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaCierre=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaCierre=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCajaCierre=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaCierre=false;
			this.isVisibilidadCeldaGuardarCambiosCajaCierre=false;
			this.isVisibilidadCeldaModificarCajaCierre=false;
			this.isVisibilidadCeldaActualizarCajaCierre=true;
			this.isVisibilidadCeldaEliminarCajaCierre=false;
			this.isVisibilidadCeldaCancelarCajaCierre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaCierre=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaCierre=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCajaCierre=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaCierre=false;
			this.isVisibilidadCeldaGuardarCambiosCajaCierre=false;
			this.isVisibilidadCeldaModificarCajaCierre=false;
			this.isVisibilidadCeldaActualizarCajaCierre=true;
			this.isVisibilidadCeldaEliminarCajaCierre=true;
			this.isVisibilidadCeldaCancelarCajaCierre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaCierre=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaCierre=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCajaCierre=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaCierre=false;
			this.isVisibilidadCeldaGuardarCambiosCajaCierre=false;
			this.isVisibilidadCeldaModificarCajaCierre=false;
			this.isVisibilidadCeldaActualizarCajaCierre=true;
			this.isVisibilidadCeldaEliminarCajaCierre=false;
			this.isVisibilidadCeldaCancelarCajaCierre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaCierre=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaCierre=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCajaCierre=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaCierre=true;
			this.isVisibilidadCeldaGuardarCambiosCajaCierre=true;
			this.isVisibilidadCeldaModificarCajaCierre=false;
			this.isVisibilidadCeldaActualizarCajaCierre=false;
			this.isVisibilidadCeldaEliminarCajaCierre=false;
			this.isVisibilidadCeldaCancelarCajaCierre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaCierre=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaCierre=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCajaCierre=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaCierre=false;
			this.isVisibilidadCeldaGuardarCambiosCajaCierre=false;
			this.isVisibilidadCeldaActualizarCajaCierre=false;
			this.isVisibilidadCeldaEliminarCajaCierre=false;
			this.isVisibilidadCeldaCancelarCajaCierre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaCierre=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaCierre=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCajaCierre=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaCierre=false;
			this.isVisibilidadCeldaGuardarCambiosCajaCierre=false;
			this.isVisibilidadCeldaModificarCajaCierre=true;
			this.isVisibilidadCeldaActualizarCajaCierre=false;
			this.isVisibilidadCeldaEliminarCajaCierre=false;
			this.isVisibilidadCeldaCancelarCajaCierre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaCierre=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaCierre=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CajaCierreJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCajaCierre=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaCierre=true;
			this.isVisibilidadCeldaGuardarCambiosCajaCierre=true;
		} else {
			this.actualizarEstadoPanelsCajaCierre(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCajaCierre=false;
			//this.isVisibilidadCeldaVerFormCajaCierre=false;
			this.isVisibilidadCeldaDuplicarCajaCierre=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cajacierreSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCajaCierre=false;
		} else {
			this.isVisibilidadCeldaNuevoCajaCierre=false;
			this.isVisibilidadCeldaGuardarCambiosCajaCierre=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cajacierreSessionBean.getEsGuardarRelacionado()) {
			if(!cajacierreSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCajaCierre=false;												
			}
			
			this.jButtonCerrarCajaCierre.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCajaCierre=false;
		}
		
		if(!this.permiteMantenimiento(this.cajacierre)) {
			this.isVisibilidadCeldaActualizarCajaCierre=false;
			this.isVisibilidadCeldaEliminarCajaCierre=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCajaCierre() {
	}
	
	public void actualizarEstadoPanelsCajaCierre(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCajaCierre!=null) {
				this.jScrollPanelDatosEdicionCajaCierre.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaCierre!=null) {
				this.jTabbedPaneBusquedasCajaCierre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaCierre!=null) {
				this.jScrollPanelDatosCajaCierre.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaCierre!=null) {
				this.jPanelPaginacionCajaCierre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaCierre!=null) {
				this.jPanelParametrosReportesCajaCierre.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCajaCierre!=null) {
				this.jScrollPanelDatosEdicionCajaCierre.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaCierre!=null) {
				this.jTabbedPaneBusquedasCajaCierre.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCajaCierre!=null) {
				this.jScrollPanelDatosCajaCierre.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaCierre!=null) {
				this.jPanelPaginacionCajaCierre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaCierre!=null) {
				this.jPanelParametrosReportesCajaCierre.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCajaCierre!=null) {
				this.jScrollPanelDatosEdicionCajaCierre.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaCierre!=null) {
				this.jTabbedPaneBusquedasCajaCierre.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajaCierre!=null) {
				this.jScrollPanelDatosCajaCierre.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaCierre!=null) {
				this.jPanelPaginacionCajaCierre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaCierre!=null) {
				this.jPanelParametrosReportesCajaCierre.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCajaCierre!=null) {
				this.jScrollPanelDatosEdicionCajaCierre.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaCierre!=null) {
				this.jTabbedPaneBusquedasCajaCierre.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajaCierre!=null) {
				this.jScrollPanelDatosCajaCierre.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaCierre!=null) {
				this.jPanelPaginacionCajaCierre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaCierre!=null) {
				this.jPanelParametrosReportesCajaCierre.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCajaCierre!=null) {
				this.jScrollPanelDatosEdicionCajaCierre.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaCierre!=null) {
				this.jTabbedPaneBusquedasCajaCierre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaCierre!=null) {
				this.jScrollPanelDatosCajaCierre.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaCierre!=null) {
				this.jPanelPaginacionCajaCierre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaCierre!=null) {
				this.jPanelParametrosReportesCajaCierre.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCajaCierre!=null) {
				this.jScrollPanelDatosEdicionCajaCierre.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaCierre!=null) {
				this.jTabbedPaneBusquedasCajaCierre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaCierre!=null) {
				this.jScrollPanelDatosCajaCierre.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaCierre!=null) {
				this.jPanelPaginacionCajaCierre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaCierre!=null) {
				this.jPanelParametrosReportesCajaCierre.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCajaCierre!=null) {
				this.jScrollPanelDatosEdicionCajaCierre.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaCierre!=null) {
				this.jTabbedPaneBusquedasCajaCierre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaCierre!=null) {
				this.jScrollPanelDatosCajaCierre.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaCierre!=null) {
				this.jPanelPaginacionCajaCierre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaCierre!=null) {
				this.jPanelParametrosReportesCajaCierre.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cajacierreSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCajaCierre!=null) {
					this.jTabbedPaneBusquedasCajaCierre.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCajaCierre!=null) {
				this.jPanelParametrosReportesCajaCierre.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cajacierreSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaCierre!=null) {
				this.jTabbedPaneBusquedasCajaCierre.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCajaCierre!=null) {
				this.jPanelParametrosReportesCajaCierre.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCaja=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajaCierre.remove(jPanelFK_IdCajaCajaCierre);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCaja=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajaCierre.remove(jPanelFK_IdCajaCajaCierre);}
		}
		
	}

	public void setVisibilidadBusquedasParaCaja(Boolean isParaCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaNegation=!isParaCaja;

			this.isVisibilidadFK_IdCaja=isParaCaja;
			if(!this.isVisibilidadFK_IdCaja) {this.jTabbedPaneBusquedasCajaCierre.remove(jPanelFK_IdCajaCajaCierre);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CajaCierreSessionBean cajacierreSessionBean=new CajaCierreSessionBean();
		
		if(this.cajacierreSessionBean==null) {
			this.cajacierreSessionBean=new CajaCierreSessionBean();
		}
		
		this.cajacierreSessionBean.setsUltimaBusquedaCajaCierre(this.getsAccionBusqueda());
		this.cajacierreSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cajacierreSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCaja")) {
			cajacierreSessionBean.setid_caja(this.getid_cajaFK_IdCaja());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cajacierreSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			cajacierreSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CajaCierreSessionBean cajacierreSessionBean=new CajaCierreSessionBean();
		
		if(this.cajacierreSessionBean==null) {
			this.cajacierreSessionBean=new CajaCierreSessionBean();
		}
		
		if(this.cajacierreSessionBean.getsUltimaBusquedaCajaCierre()!=null&&!this.cajacierreSessionBean.getsUltimaBusquedaCajaCierre().equals("")) {
			this.setsAccionBusqueda(cajacierreSessionBean.getsUltimaBusquedaCajaCierre());
			this.setiNumeroPaginacion(cajacierreSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cajacierreSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCaja")) {
				this.setid_cajaFK_IdCaja(cajacierreSessionBean.getid_caja());
				cajacierreSessionBean.setid_caja(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cajacierreSessionBean.getid_empresa());
				cajacierreSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(cajacierreSessionBean.getid_sucursal());
				cajacierreSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.cajacierreSessionBean.setsUltimaBusquedaCajaCierre("");
		this.cajacierreSessionBean.setiNumeroPaginacion(CajaCierreConstantesFunciones.INUMEROPAGINACION);
		this.cajacierreSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCajaCierre(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCajaCierre() {
		this.updateBorderResaltarBusquedasFormularioCajaCierre();
		this.updateVisibilidadBusquedasFormularioCajaCierre();
		this.updateHabilitarBusquedasFormularioCajaCierre();
	}
	
	public void updateBorderResaltarBusquedasFormularioCajaCierre() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCajaCierre.getComponents().length>0) {
	

		if(this.cajacierreConstantesFunciones.resaltarFK_IdCajaCajaCierre!=null) {
			index= this.jTabbedPaneBusquedasCajaCierre.indexOfComponent(this.jPanelFK_IdCajaCajaCierre);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaCierre.getComponent(index);
				jPanel.setBorder(this.cajacierreConstantesFunciones.resaltarFK_IdCajaCajaCierre);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCajaCierre() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCajaCierre.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajaCierre.indexOfComponent(this.jPanelFK_IdCajaCajaCierre);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajaCierre.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajacierreConstantesFunciones.mostrarFK_IdCajaCajaCierre);
			if(!this.cajacierreConstantesFunciones.mostrarFK_IdCajaCajaCierre && index>-1) {
				this.jTabbedPaneBusquedasCajaCierre.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCajaCierre() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCajaCierre.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajaCierre.indexOfComponent(this.jPanelFK_IdCajaCajaCierre);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajaCierre.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajacierreConstantesFunciones.activarFK_IdCajaCajaCierre);
				this.jTabbedPaneBusquedasCajaCierre.setEnabledAt(index,this.cajacierreConstantesFunciones.activarFK_IdCajaCajaCierre);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCajaCierre(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCaja")) {
			index= this.jTabbedPaneBusquedasCajaCierre.indexOfComponent(this.jPanelFK_IdCajaCajaCierre);

			this.jTabbedPaneBusquedasCajaCierre.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaCierre.getComponent(index);

			this.cajacierreConstantesFunciones.setResaltarFK_IdCajaCajaCierre(resaltar);

			jPanel.setBorder(this.cajacierreConstantesFunciones.resaltarFK_IdCajaCajaCierre);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCajaCierre.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCajaCierre() throws Exception {

		if(this.jInternalFrameDetalleFormCajaCierre==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCajaCierre();
		this.updateVisibilidadResaltarControlesFormularioCajaCierre();
		this.updateHabilitarResaltarControlesFormularioCajaCierre();
		
	}
	
	public void updateBorderResaltarControlesFormularioCajaCierre() throws Exception {
		if(this.jInternalFrameDetalleFormCajaCierre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cajacierreConstantesFunciones.resaltaridCajaCierre!=null && this.jInternalFrameDetalleFormCajaCierre!=null) {this.jInternalFrameDetalleFormCajaCierre.jLabelidCajaCierre.setBorder(this.cajacierreConstantesFunciones.resaltaridCajaCierre);}
		if(this.cajacierreConstantesFunciones.resaltarid_empresaCajaCierre!=null && this.jInternalFrameDetalleFormCajaCierre!=null) {this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre.setBorder(this.cajacierreConstantesFunciones.resaltarid_empresaCajaCierre);}
		if(this.cajacierreConstantesFunciones.resaltarid_sucursalCajaCierre!=null && this.jInternalFrameDetalleFormCajaCierre!=null) {this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre.setBorder(this.cajacierreConstantesFunciones.resaltarid_sucursalCajaCierre);}
		if(this.cajacierreConstantesFunciones.resaltarid_cajaCajaCierre!=null && this.jInternalFrameDetalleFormCajaCierre!=null) {this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre.setBorder(this.cajacierreConstantesFunciones.resaltarid_cajaCajaCierre);}
		if(this.cajacierreConstantesFunciones.resaltarfecha_cierreCajaCierre!=null && this.jInternalFrameDetalleFormCajaCierre!=null) {this.jInternalFrameDetalleFormCajaCierre.jDateChooserfecha_cierreCajaCierre.setBorder(this.cajacierreConstantesFunciones.resaltarfecha_cierreCajaCierre);}
		if(this.cajacierreConstantesFunciones.resaltarhora_cierreCajaCierre!=null && this.jInternalFrameDetalleFormCajaCierre!=null) {this.jInternalFrameDetalleFormCajaCierre.jSpinnerhora_cierreCajaCierre.setBorder(this.cajacierreConstantesFunciones.resaltarhora_cierreCajaCierre);}
		if(this.cajacierreConstantesFunciones.resaltaresta_activoCajaCierre!=null && this.jInternalFrameDetalleFormCajaCierre!=null) {this.jInternalFrameDetalleFormCajaCierre.jCheckBoxesta_activoCajaCierre.setBorderPainted(true);this.jInternalFrameDetalleFormCajaCierre.jCheckBoxesta_activoCajaCierre.setBorder(this.cajacierreConstantesFunciones.resaltaresta_activoCajaCierre);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCajaCierre() throws Exception {		
		if(this.jInternalFrameDetalleFormCajaCierre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) {
	
		//this.jInternalFrameDetalleFormCajaCierre.jLabelidCajaCierre.setVisible(this.cajacierreConstantesFunciones.mostraridCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jPanelidCajaCierre.setVisible(this.cajacierreConstantesFunciones.mostraridCajaCierre);
		//this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre.setVisible(this.cajacierreConstantesFunciones.mostrarid_empresaCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jPanelid_empresaCajaCierre.setVisible(this.cajacierreConstantesFunciones.mostrarid_empresaCajaCierre);
		//this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre.setVisible(this.cajacierreConstantesFunciones.mostrarid_sucursalCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jPanelid_sucursalCajaCierre.setVisible(this.cajacierreConstantesFunciones.mostrarid_sucursalCajaCierre);
		//this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre.setVisible(this.cajacierreConstantesFunciones.mostrarid_cajaCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jPanelid_cajaCajaCierre.setVisible(this.cajacierreConstantesFunciones.mostrarid_cajaCajaCierre);
		//this.jInternalFrameDetalleFormCajaCierre.jDateChooserfecha_cierreCajaCierre.setVisible(this.cajacierreConstantesFunciones.mostrarfecha_cierreCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jPanelfecha_cierreCajaCierre.setVisible(this.cajacierreConstantesFunciones.mostrarfecha_cierreCajaCierre);
		//this.jInternalFrameDetalleFormCajaCierre.jSpinnerhora_cierreCajaCierre.setVisible(this.cajacierreConstantesFunciones.mostrarhora_cierreCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jPanelhora_cierreCajaCierre.setVisible(this.cajacierreConstantesFunciones.mostrarhora_cierreCajaCierre);
		//this.jInternalFrameDetalleFormCajaCierre.jCheckBoxesta_activoCajaCierre.setVisible(this.cajacierreConstantesFunciones.mostraresta_activoCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jPanelesta_activoCajaCierre.setVisible(this.cajacierreConstantesFunciones.mostraresta_activoCajaCierre);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCajaCierre() throws Exception {
		if(this.jInternalFrameDetalleFormCajaCierre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajaCierre!=null) {
	
		this.jInternalFrameDetalleFormCajaCierre.jLabelidCajaCierre.setEnabled(this.cajacierreConstantesFunciones.activaridCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_empresaCajaCierre.setEnabled(this.cajacierreConstantesFunciones.activarid_empresaCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_sucursalCajaCierre.setEnabled(this.cajacierreConstantesFunciones.activarid_sucursalCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jComboBoxid_cajaCajaCierre.setEnabled(this.cajacierreConstantesFunciones.activarid_cajaCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jDateChooserfecha_cierreCajaCierre.setEnabled(this.cajacierreConstantesFunciones.activarfecha_cierreCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jSpinnerhora_cierreCajaCierre.setEnabled(this.cajacierreConstantesFunciones.activarhora_cierreCajaCierre);
		this.jInternalFrameDetalleFormCajaCierre.jCheckBoxesta_activoCajaCierre.setEnabled(this.cajacierreConstantesFunciones.activaresta_activoCajaCierre);
		}
	}
	
		
}