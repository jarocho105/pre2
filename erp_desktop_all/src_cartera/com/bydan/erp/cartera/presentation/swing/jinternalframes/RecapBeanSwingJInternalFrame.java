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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.RecapConstantesFunciones;
import com.bydan.erp.cartera.util.RecapParameterReturnGeneral;
//import com.bydan.erp.cartera.util.RecapParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.RecapBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class RecapBeanSwingJInternalFrame extends RecapJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RecapBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Recap> recapValidator = new ClassValidator<Recap>(Recap.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Recap recap;	
	public Recap recapAux;
	public Recap recapAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Recap recapTotales;
	public Long idRecapActual;
	public Long iIdNuevoRecap=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleRecap=false;

	public Boolean getIsTienePermisosDetalleRecap() {
		return isTienePermisosDetalleRecap;
	}

	public void setIsTienePermisosDetalleRecap(Boolean isTienePermisosDetalleRecap) {
		this.isTienePermisosDetalleRecap= isTienePermisosDetalleRecap;
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
	
	public Boolean isPermisoTodoRecap;
	public Boolean isPermisoNuevoRecap;
	public Boolean isPermisoActualizarRecap;
	public Boolean isPermisoActualizarOriginalRecap;
	public Boolean isPermisoEliminarRecap;
	public Boolean isPermisoGuardarCambiosRecap;
	public Boolean isPermisoConsultaRecap;
	public Boolean isPermisoBusquedaRecap;
	public Boolean isPermisoReporteRecap;
	public Boolean isPermisoPaginacionMedioRecap;
	public Boolean isPermisoPaginacionAltoRecap;
	public Boolean isPermisoPaginacionTodoRecap;
	public Boolean isPermisoCopiarRecap;
	public Boolean isPermisoVerFormRecap;
	public Boolean isPermisoDuplicarRecap;
	public Boolean isPermisoOrdenRecap;
	
	
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
	
	public RecapParameterReturnGeneral recapReturnGeneral;
	public RecapParameterReturnGeneral recapParameterGeneral;
	
	

	public DetalleRecapLogic detallerecapLogic=null;

	public DetalleRecapLogic getDetalleRecapLogic() {
		return detallerecapLogic;
	}

	public void setDetalleRecapLogic(DetalleRecapLogic detallerecapLogic) {
		this.detallerecapLogic = detallerecapLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRecap=false;
	public Boolean esParaAccionDesdeFormularioRecap=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RecapSessionBeanAdditional recapSessionBeanAdditional=null;
	
	public RecapSessionBeanAdditional getRecapSessionBeanAdditional() {
		return this.recapSessionBeanAdditional;
	}
	
	public void setRecapSessionBeanAdditional(RecapSessionBeanAdditional recapSessionBeanAdditional) {
		try {
			this.recapSessionBeanAdditional=recapSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RecapBeanSwingJInternalFrameAdditional recapBeanSwingJInternalFrameAdditional=null;
	//public class RecapBeanSwingJInternalFrame
	
	public RecapBeanSwingJInternalFrameAdditional getRecapBeanSwingJInternalFrameAdditional() {
		return this.recapBeanSwingJInternalFrameAdditional;
	}
	
	public void setRecapBeanSwingJInternalFrameAdditional(RecapBeanSwingJInternalFrameAdditional recapBeanSwingJInternalFrameAdditional) {
		try {
			this.recapBeanSwingJInternalFrameAdditional=recapBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RecapLogic recapLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Recap recapBean;
	public RecapConstantesFunciones recapConstantesFunciones;
	//public RecapParameterReturnGeneral recapReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	
	//PARAMETROS
	
	
	//public List<Recap> recaps;	
	//public List<Recap> recapsEliminados;
	//public List<Recap> recapsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRecap=false;
	public Boolean isVisibilidadCeldaDuplicarRecap=true;
	public Boolean isVisibilidadCeldaCopiarRecap=true;
	public Boolean isVisibilidadCeldaVerFormRecap=true;
	public Boolean isVisibilidadCeldaOrdenRecap=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRecap=false;
	public Boolean isVisibilidadCeldaModificarRecap=false;
	public Boolean isVisibilidadCeldaActualizarRecap=false;
	public Boolean isVisibilidadCeldaEliminarRecap=false;
	public Boolean isVisibilidadCeldaCancelarRecap=false;
	public Boolean isVisibilidadCeldaGuardarRecap=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRecap=false;	
	
	
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoRecap() {
		return this.iIdNuevoRecap;
	}

	public void setiIdNuevoRecap(Long iIdNuevoRecap) {
		this.iIdNuevoRecap = iIdNuevoRecap;
	}
	
	public Long getidRecapActual() {
		return this.idRecapActual;
	}

	public void setidRecapActual(Long idRecapActual) {
		this.idRecapActual = idRecapActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Recap getrecap() {
		return this.recap;
	}

	public void setrecap(Recap recap) {
		this.recap = recap;
	}
	
	public Recap getrecapAux() {
		return this.recapAux;
	}

	public void setrecapAux(Recap recapAux) {
		this.recapAux = recapAux;
	}				
	
	public Recap getrecapAnterior() {
		return this.recapAnterior;
	}

	public void setrecapAnterior(Recap recapAnterior) {
		this.recapAnterior = recapAnterior;
	}	
	
	public Recap getrecapTotales() {
		return this.recapTotales;
	}

	public void setrecapTotales(Recap recapTotales) {
		this.recapTotales = recapTotales;
	}	
	
	public Recap getrecapBean() {
		return this.recapBean;
	}

	public void setrecapBean(Recap recapBean) {
		this.recapBean = recapBean;
	}	
	
	public RecapParameterReturnGeneral getrecapReturnGeneral() {
		return this.recapReturnGeneral;
	}

	public void setrecapReturnGeneral(RecapParameterReturnGeneral recapReturnGeneral) {
		this.recapReturnGeneral = recapReturnGeneral;
	}	
	
	
	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
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
	
	
	public RecapLogic getRecapLogic()	{		
		return recapLogic;
	}

	public void setRecapLogic(RecapLogic recapLogic) {
		this.recapLogic = recapLogic;
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
	
	public Boolean getIsEsNuevoRecap() {
		return isEsNuevoRecap;
	}

	public void setIsEsNuevoRecap(Boolean isEsNuevoRecap) {
		this.isEsNuevoRecap = isEsNuevoRecap;
	}

	public Boolean getEsParaAccionDesdeFormularioRecap() {
		return esParaAccionDesdeFormularioRecap;
	}
	
	public void setEsParaAccionDesdeFormularioRecap(Boolean esParaAccionDesdeFormularioRecap) {
		this.esParaAccionDesdeFormularioRecap = esParaAccionDesdeFormularioRecap;
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

			if(this.recapSessionBean==null) {
				this.recapSessionBean=new RecapSessionBean();
			}

			if(!this.recapSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(recapSessionBean.getlidEmpresaActual());
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

			if(this.recapSessionBean==null) {
				this.recapSessionBean=new RecapSessionBean();
			}

			if(!this.recapSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(recapSessionBean.getlidSucursalActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.recapSessionBean==null) {
				this.recapSessionBean=new RecapSessionBean();
			}

			if(!this.recapSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(recapSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

					if(this.recap!=null) {
						this.recap.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRecap!=null) {
						this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRecap.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRecap!=null) {
						if(this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRecapGenerico)throws Exception
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
				jComboBoxid_empresaRecapGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRecapGenerico!=null && jComboBoxid_empresaRecapGenerico.getItemCount()>0) {
					jComboBoxid_empresaRecapGenerico.setSelectedIndex(0);
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

					if(this.recap!=null) {
						this.recap.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormRecap!=null) {
						this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalRecap.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormRecap!=null) {
						if(this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalRecapGenerico)throws Exception
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
				jComboBoxid_sucursalRecapGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalRecapGenerico!=null && jComboBoxid_sucursalRecapGenerico.getItemCount()>0) {
					jComboBoxid_sucursalRecapGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.recap!=null) {
						this.recap.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormRecap!=null) {
						this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioRecap.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormRecap!=null) {
						if(this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioRecapGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioRecapGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioRecapGenerico!=null && jComboBoxid_ejercicioRecapGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioRecapGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Recap recap,JComboBox jComboBoxid_empresaRecapGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRecapGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRecapGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				recap.setid_empresa(empresaAux.getId());
				recap.setempresa_descripcion(RecapConstantesFunciones.getEmpresaDescripcion(empresaAux));
				recap.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Recap recap,JComboBox jComboBoxid_sucursalRecapGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalRecapGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalRecapGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				recap.setid_sucursal(sucursalAux.getId());
				recap.setsucursal_descripcion(RecapConstantesFunciones.getSucursalDescripcion(sucursalAux));
				recap.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(Recap recap,JComboBox jComboBoxid_ejercicioRecapGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioRecapGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioRecapGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				recap.setid_ejercicio(ejercicioAux.getId());
				recap.setejercicio_descripcion(RecapConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				recap.setEjercicio(ejercicioAux);			}
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

					if(!RecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRecap!=null) { 
							this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRecap!=null) { 
					}

					if(!RecapJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRecap!=null) { 
							this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRecap!=null) { 
					}

					if(!RecapJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRecap!=null) { 
							this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRecap!=null) { 
					}

					if(!RecapJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRecap!=null) {
							this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRecap!=null) {
							this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRecap!=null) {
							this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormRecap!=null) {
							this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRecap!=null) {
							this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormRecap!=null) {
							this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesRecap() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RecapConstantesFunciones.refrescarForeignKeysDescripcionesRecap(this.recapLogic.getRecaps());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RecapConstantesFunciones.refrescarForeignKeysDescripcionesRecap(this.recaps);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//recapLogic.setRecaps(this.recaps);
			recapLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RecapParameterReturnGeneral getRecapParameterGeneral() {
		return this.recapParameterGeneral;
	}
	
	public void setRecapParameterGeneral(RecapParameterReturnGeneral recapParameterGeneral) {
		this.recapParameterGeneral = recapParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRecap() {
		return isPermisoTodoRecap;
	}

	public void setIsPermisoTodoRecap(Boolean isPermisoTodoRecap) {
		this.isPermisoTodoRecap = isPermisoTodoRecap;
	}

	public Boolean getIsPermisoNuevoRecap() {
		return isPermisoNuevoRecap;
	}

	public void setIsPermisoNuevoRecap(Boolean isPermisoNuevoRecap) {
		this.isPermisoNuevoRecap = isPermisoNuevoRecap;
	}

	public Boolean getIsPermisoActualizarRecap() {
		return isPermisoActualizarRecap;
	}

	public void setIsPermisoActualizarRecap(Boolean isPermisoActualizarRecap) {
		this.isPermisoActualizarRecap = isPermisoActualizarRecap;
	}

	public Boolean getIsPermisoEliminarRecap() {
		return isPermisoEliminarRecap;
	}

	public void setIsPermisoEliminarRecap(Boolean isPermisoEliminarRecap) {
		this.isPermisoEliminarRecap = isPermisoEliminarRecap;
	}

	public Boolean getIsPermisoGuardarCambiosRecap() {
		return isPermisoGuardarCambiosRecap;
	}

	public void setIsPermisoGuardarCambiosRecap(Boolean isPermisoGuardarCambiosRecap) {
		this.isPermisoGuardarCambiosRecap = isPermisoGuardarCambiosRecap;
	}
	
	public Boolean getIsPermisoConsultaRecap() {
		return isPermisoConsultaRecap;
	}

	public void setIsPermisoConsultaRecap(Boolean isPermisoConsultaRecap) {
		this.isPermisoConsultaRecap = isPermisoConsultaRecap;
	}

	public Boolean getIsPermisoBusquedaRecap() {
		return isPermisoBusquedaRecap;
	}

	public void setIsPermisoBusquedaRecap(Boolean isPermisoBusquedaRecap) {
		this.isPermisoBusquedaRecap = isPermisoBusquedaRecap;
	}

	public Boolean getIsPermisoReporteRecap() {
		return isPermisoReporteRecap;
	}

	public void setIsPermisoReporteRecap(Boolean isPermisoReporteRecap) {
		this.isPermisoReporteRecap = isPermisoReporteRecap;
	}
	
	public Boolean getIsPermisoPaginacionMedioRecap() {
		return isPermisoPaginacionMedioRecap;
	}

	public void setIsPermisoPaginacionMedioRecap(Boolean isPermisoPaginacionMedioRecap) {
		this.isPermisoPaginacionMedioRecap = isPermisoPaginacionMedioRecap;
	}
	
	public Boolean getIsPermisoPaginacionTodoRecap() {
		return isPermisoPaginacionTodoRecap;
	}

	public void setIsPermisoPaginacionTodoRecap(Boolean isPermisoPaginacionTodoRecap) {
		this.isPermisoPaginacionTodoRecap = isPermisoPaginacionTodoRecap;
	}
	
	public Boolean getIsPermisoPaginacionAltoRecap() {
		return isPermisoPaginacionAltoRecap;
	}

	public void setIsPermisoPaginacionAltoRecap(Boolean isPermisoPaginacionAltoRecap) {
		this.isPermisoPaginacionAltoRecap = isPermisoPaginacionAltoRecap;
	}
	
	public Boolean getIsPermisoCopiarRecap() {
		return isPermisoCopiarRecap;
	}

	public void setIsPermisoCopiarRecap(Boolean isPermisoCopiarRecap) {
		this.isPermisoCopiarRecap = isPermisoCopiarRecap;
	}
	
	public Boolean getIsPermisoVerFormRecap() {
		return isPermisoVerFormRecap;
	}

	public void setIsPermisoVerFormRecap(Boolean isPermisoVerFormRecap) {
		this.isPermisoVerFormRecap = isPermisoVerFormRecap;
	}
	
	public Boolean getIsPermisoDuplicarRecap() {
		return isPermisoDuplicarRecap;
	}

	public void setIsPermisoDuplicarRecap(Boolean isPermisoDuplicarRecap) {
		this.isPermisoDuplicarRecap = isPermisoDuplicarRecap;
	}
	
	public Boolean getIsPermisoOrdenRecap() {
		return isPermisoOrdenRecap;
	}

	public void setIsPermisoOrdenRecap(Boolean isPermisoOrdenRecap) {
		this.isPermisoOrdenRecap = isPermisoOrdenRecap;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRecap() {
		return isVisibilidadCeldaNuevoRecap;
	}

	public void setIsVisibilidadCeldaNuevoRecap(Boolean isVisibilidadCeldaNuevoRecap) {
		this.isVisibilidadCeldaNuevoRecap = isVisibilidadCeldaNuevoRecap;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRecap() {
		return isVisibilidadCeldaDuplicarRecap;
	}

	public void setIsVisibilidadCeldaDuplicarRecap(Boolean isVisibilidadCeldaDuplicarRecap) {
		this.isVisibilidadCeldaDuplicarRecap = isVisibilidadCeldaDuplicarRecap;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRecap() {
		return isVisibilidadCeldaCopiarRecap;
	}

	public void setIsVisibilidadCeldaCopiarRecap(Boolean isVisibilidadCeldaCopiarRecap) {
		this.isVisibilidadCeldaCopiarRecap = isVisibilidadCeldaCopiarRecap;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRecap() {
		return isVisibilidadCeldaVerFormRecap;
	}

	public void setIsVisibilidadCeldaVerFormRecap(Boolean isVisibilidadCeldaVerFormRecap) {
		this.isVisibilidadCeldaVerFormRecap = isVisibilidadCeldaVerFormRecap;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRecap() {
		return isVisibilidadCeldaOrdenRecap;
	}

	public void setIsVisibilidadCeldaOrdenRecap(Boolean isVisibilidadCeldaOrdenRecap) {
		this.isVisibilidadCeldaOrdenRecap = isVisibilidadCeldaOrdenRecap;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRecap() {
		return isVisibilidadCeldaNuevoRelacionesRecap;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRecap(Boolean isVisibilidadCeldaNuevoRelacionesRecap) {
		this.isVisibilidadCeldaNuevoRelacionesRecap = isVisibilidadCeldaNuevoRelacionesRecap;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRecap() {
		return isVisibilidadCeldaModificarRecap;
	}

	public void setIsVisibilidadCeldaModificarRecap(Boolean isVisibilidadCeldaModificarRecap) {
		this.isVisibilidadCeldaModificarRecap = isVisibilidadCeldaModificarRecap;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRecap() {
		return isVisibilidadCeldaActualizarRecap;
	}

	public void setIsVisibilidadCeldaActualizarRecap(Boolean isVisibilidadCeldaActualizarRecap) {
		this.isVisibilidadCeldaActualizarRecap = isVisibilidadCeldaActualizarRecap;
	}

	public Boolean getIsVisibilidadCeldaEliminarRecap() {
		return isVisibilidadCeldaEliminarRecap;
	}

	public void setIsVisibilidadCeldaEliminarRecap(Boolean isVisibilidadCeldaEliminarRecap) {
		this.isVisibilidadCeldaEliminarRecap = isVisibilidadCeldaEliminarRecap;
	}

	public Boolean getIsVisibilidadCeldaCancelarRecap() {
		return isVisibilidadCeldaCancelarRecap;
	}

	public void setIsVisibilidadCeldaCancelarRecap(Boolean isVisibilidadCeldaCancelarRecap) {
		this.isVisibilidadCeldaCancelarRecap = isVisibilidadCeldaCancelarRecap;
	}

	public Boolean getIsVisibilidadCeldaGuardarRecap() {
		return isVisibilidadCeldaGuardarRecap;
	}

	public void setIsVisibilidadCeldaGuardarRecap(Boolean isVisibilidadCeldaGuardarRecap) {
		this.isVisibilidadCeldaGuardarRecap = isVisibilidadCeldaGuardarRecap;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRecap() {
		return isVisibilidadCeldaGuardarCambiosRecap;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRecap(Boolean isVisibilidadCeldaGuardarCambiosRecap) {
		this.isVisibilidadCeldaGuardarCambiosRecap = isVisibilidadCeldaGuardarCambiosRecap;
	}
		
	public RecapSessionBean getrecapSessionBean() {
		return this.recapSessionBean;
	}
	
	public void setrecapSessionBean(RecapSessionBean recapSessionBean) {
		this.recapSessionBean=recapSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRecap(Recap recap)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(recap,null);
				this.setActualParaGuardarSucursalForeignKey(recap,null);
				this.setActualParaGuardarEjercicioForeignKey(recap,null);
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
	
	public void bugActualizarReferenciaActual(Recap recap,Recap recapAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRecap(recap);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		recapAux.setId(recap.getId());
		recapAux.setVersionRow(recap.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRecap();
		
			int intSelectedRow = this.jTableDatosRecap.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = recapValidator.getInvalidValues(this.recap);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			recapLogic.setDatosCliente(datosCliente);
			recapLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				recapAux=new  Recap();
				
				recapAux.setIsNew(true);
				recapAux.setIsChanged(true);
				
				recapAux.setRecapOriginal(this.recap);
				
				recapAux.setId(this.recap.getId());	
				recapAux.setVersionRow(this.recap.getVersionRow());	
				recapAux.setid_empresa(this.recap.getid_empresa());	
				recapAux.setid_sucursal(this.recap.getid_sucursal());	
				recapAux.setid_ejercicio(this.recap.getid_ejercicio());	
				recapAux.setnumero(this.recap.getnumero());	
				recapAux.setnumero_autorizacion(this.recap.getnumero_autorizacion());	
				recapAux.setfecha_inicio(this.recap.getfecha_inicio());	
				recapAux.setfecha_final(this.recap.getfecha_final());	
				recapAux.setfecha_elaboracion(this.recap.getfecha_elaboracion());	
				recapAux.setfecha_caducidad(this.recap.getfecha_caducidad());	
				recapAux.setmonto_iva(this.recap.getmonto_iva());	
				recapAux.setsin_monto_iva(this.recap.getsin_monto_iva());	
				recapAux.setiva(this.recap.getiva());	
				recapAux.setotro_impuesto(this.recap.getotro_impuesto());	
				recapAux.setvalor_propuesto(this.recap.getvalor_propuesto());	
				recapAux.setsubtotal(this.recap.getsubtotal());	
				recapAux.setfinanciero(this.recap.getfinanciero());	
				recapAux.settotal(this.recap.gettotal());	
				recapAux.setvalor_cambio(this.recap.getvalor_cambio());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.recapSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.recapSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(recapAux,recapLogic.getRecaps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(recapAux,recaps);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.recapSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.recapSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recapLogic.saveRecaps();//WithConnection
						//recapLogic.getSetVersionRowRecaps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.recap,recapAux);
					
					this.refrescarForeignKeysDescripcionesRecap();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.recapSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.getDetalleRecaps().addAll(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecaps.addAll(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.recapSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								recapLogic.saveRecapRelaciones(recapAux,this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.getDetalleRecaps());//WithConnection
								//recapLogic.getSetVersionRowRecaps();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.recap,recapAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.setDetalleRecaps(new ArrayList<DetalleRecap>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecaps= new ArrayList<DetalleRecap>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();}
							recapAux.setDetalleRecaps(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.getDetalleRecaps());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.recapSessionBean.getEstaModoGuardarRelaciones() 
									|| this.recapSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(recapAux,recapLogic.getRecaps());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(recapAux,recaps);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.recap,recapAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				recapAux=new  Recap();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.recapSessionBean.getEsGuardarRelacionado() 
					|| (this.recapSessionBean.getEsGuardarRelacionado() && this.recap.getId()>=0)) {
						
					recapAux.setIsNew(false);
				}
				
				recapAux.setIsDeleted(false);
			
				recapAux.setId(this.recap.getId());	
				recapAux.setVersionRow(this.recap.getVersionRow());	
				recapAux.setid_empresa(this.recap.getid_empresa());	
				recapAux.setid_sucursal(this.recap.getid_sucursal());	
				recapAux.setid_ejercicio(this.recap.getid_ejercicio());	
				recapAux.setnumero(this.recap.getnumero());	
				recapAux.setnumero_autorizacion(this.recap.getnumero_autorizacion());	
				recapAux.setfecha_inicio(this.recap.getfecha_inicio());	
				recapAux.setfecha_final(this.recap.getfecha_final());	
				recapAux.setfecha_elaboracion(this.recap.getfecha_elaboracion());	
				recapAux.setfecha_caducidad(this.recap.getfecha_caducidad());	
				recapAux.setmonto_iva(this.recap.getmonto_iva());	
				recapAux.setsin_monto_iva(this.recap.getsin_monto_iva());	
				recapAux.setiva(this.recap.getiva());	
				recapAux.setotro_impuesto(this.recap.getotro_impuesto());	
				recapAux.setvalor_propuesto(this.recap.getvalor_propuesto());	
				recapAux.setsubtotal(this.recap.getsubtotal());	
				recapAux.setfinanciero(this.recap.getfinanciero());	
				recapAux.settotal(this.recap.gettotal());	
				recapAux.setvalor_cambio(this.recap.getvalor_cambio());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(recapAux,recapLogic.getRecaps());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(recapAux,recaps);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.recapSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.recapSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recapLogic.saveRecaps();//WithConnection
						//recapLogic.getSetVersionRowRecaps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.recap,recapAux);
					
					this.refrescarForeignKeysDescripcionesRecap();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.recapSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.getDetalleRecaps().addAll(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecaps.addAll(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.recapSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								recapLogic.saveRecapRelaciones(recapAux,this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.getDetalleRecaps());//WithConnection
								//recapLogic.getSetVersionRowRecaps();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.recap,recapAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.setDetalleRecaps(new ArrayList<DetalleRecap>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecaps= new ArrayList<DetalleRecap>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();}
							recapAux.setDetalleRecaps(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.getDetalleRecaps());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.recapSessionBean.getEstaModoGuardarRelaciones() 
									|| this.recapSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(recapAux,recapLogic.getRecaps());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(recapAux,recaps);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.recap,recapAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				recapAux=new  Recap();
				
				recapAux.setIsNew(false);
				recapAux.setIsChanged(false);
				
				recapAux.setIsDeleted(true);
				
				recapAux.setId(this.recap.getId());	
				recapAux.setVersionRow(this.recap.getVersionRow());	
				recapAux.setid_empresa(this.recap.getid_empresa());	
				recapAux.setid_sucursal(this.recap.getid_sucursal());	
				recapAux.setid_ejercicio(this.recap.getid_ejercicio());	
				recapAux.setnumero(this.recap.getnumero());	
				recapAux.setnumero_autorizacion(this.recap.getnumero_autorizacion());	
				recapAux.setfecha_inicio(this.recap.getfecha_inicio());	
				recapAux.setfecha_final(this.recap.getfecha_final());	
				recapAux.setfecha_elaboracion(this.recap.getfecha_elaboracion());	
				recapAux.setfecha_caducidad(this.recap.getfecha_caducidad());	
				recapAux.setmonto_iva(this.recap.getmonto_iva());	
				recapAux.setsin_monto_iva(this.recap.getsin_monto_iva());	
				recapAux.setiva(this.recap.getiva());	
				recapAux.setotro_impuesto(this.recap.getotro_impuesto());	
				recapAux.setvalor_propuesto(this.recap.getvalor_propuesto());	
				recapAux.setsubtotal(this.recap.getsubtotal());	
				recapAux.setfinanciero(this.recap.getfinanciero());	
				recapAux.settotal(this.recap.gettotal());	
				recapAux.setvalor_cambio(this.recap.getvalor_cambio());	
				
				if(this.recapSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.recapAux.getId()>=0) {	
						this.recapsEliminados.add(recapAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(recapAux,recapLogic.getRecaps());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(recapAux,recaps);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.recapSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.recapSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recapLogic.saveRecaps();//WithConnection
						//recapLogic.getSetVersionRowRecaps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.recapSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.getDetalleRecaps().addAll(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecaps.addAll(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.recapSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								recapLogic.saveRecapRelaciones(recapAux,this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.getDetalleRecaps());//WithConnection
								//recapLogic.getSetVersionRowRecaps();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.setDetalleRecaps(new ArrayList<DetalleRecap>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecaps= new ArrayList<DetalleRecap>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.quitarFilaTotales();}
							recapAux.setDetalleRecaps(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.getDetalleRecaps());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.recapSessionBean.getEstaModoGuardarRelaciones() 
								|| this.recapSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(recapAux,recapLogic.getRecaps());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(recapAux,recaps);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getRecaps().addAll(this.recapsEliminados);
					
					recapLogic.saveRecaps();//WithConnection
					//recapLogic.getSetVersionRowRecaps();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRecap();
				
				this.recapsEliminados= new ArrayList<Recap>();		
			}
			
			if(this.recapSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Recap GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Recap",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.recap=recapAux;
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
      		//this.finishProcessRecap();
      	}
		
	}	
	
	public void actualizarRelaciones(Recap recapLocal) throws Exception {
		
		if(this.recapSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				recapLocal.setDetalleRecaps(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.getDetalleRecaps());
			
			} else {
			
				recapLocal.setDetalleRecaps(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecaps);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Recap recapLocal) throws Exception {	
		if(this.recapSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				recapLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				recapLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				recapLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRecapActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRecap.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = recapValidator.getInvalidValues(this.recap);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Recap recap,List<Recap> recaps) throws Exception {
		try	{		
			RecapConstantesFunciones.actualizarLista(recap,recaps,this.recapSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Recap recap,List<Recap> recaps) throws Exception {
		try	{			
			RecapConstantesFunciones.actualizarSelectedLista(recap,recaps);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Recap> recapsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				recapsLocal=this.recapLogic.getRecaps();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				recapsLocal=this.recaps;
			}
			//ARCHITECTURE
		
			for(Recap recapLocal:recapsLocal) {
				if(this.permiteMantenimiento(recapLocal) && recapLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RecapConstantesFunciones.getRecapLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelid_empresaRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelid_sucursalRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelid_ejercicioRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelnumeroRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.NUMEROAUTORIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelnumero_autorizacionRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelfecha_inicioRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.FECHAFINAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelfecha_finalRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.FECHAELABORACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelfecha_elaboracionRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.FECHACADUCIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelfecha_caducidadRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.MONTOIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelmonto_ivaRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.SINMONTOIVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelsin_monto_ivaRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelivaRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.OTROIMPUESTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelotro_impuestoRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.VALORPROPUESTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelvalor_propuestoRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.SUBTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelsubtotalRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.FINANCIERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelfinancieroRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabeltotalRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RecapConstantesFunciones.VALORCAMBIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelvalor_cambioRecap,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRecap!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelid_empresaRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelid_sucursalRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelid_ejercicioRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelnumeroRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelnumero_autorizacionRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelfecha_inicioRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelfecha_finalRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelfecha_elaboracionRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelfecha_caducidadRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelmonto_ivaRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelsin_monto_ivaRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelivaRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelotro_impuestoRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelvalor_propuestoRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelsubtotalRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelfinancieroRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabeltotalRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRecap.jLabelvalor_cambioRecap,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleRecap")) {
			if(this.recap==null) {
				this.recap= new Recap();
			}

			if(this.recapSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoRecap
				this.setVariablesFormularioToObjetoActualRecap(this.recap,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);

				this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.getdetallerecap().setRecap(this.recap);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoRecap--;	
		
		
		this.recapAux=new Recap();
		
		this.recapAux.setId(this.iIdNuevoRecap);
		this.recapAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.recapLogic.getRecaps().add(this.recapAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.recaps.add(this.recapAux);
		}
		//ARCHITECTURE
		
		this.recap=this.recapAux;
		
		if(RecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRecap(this.recap);
			this.setVariablesObjetoActualToFormularioForeignKeyRecap(this.recap);
		}
				
		//this.setDefaultControlesRecap();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRecap();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRecap();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRecap();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRecap(this.recapBean,this.recap,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RecapConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.recapSessionBean.getConGuardarRelaciones()) {
			classes=RecapConstantesFunciones.getClassesRelationshipsOfRecap(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.recapReturnGeneral=recapLogic.procesarEventosRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.recapLogic.getRecaps(),this.recap,this.recapParameterGeneral,this.isEsNuevoRecap,classes);//this.recapLogic.getRecap()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRecap(this.recapReturnGeneral,this.recapBean,false);
		
		if(this.recapReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRecap(this.recapReturnGeneral.getRecap());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRecap(this.recapReturnGeneral.getRecap());
		}
		
		if(this.recapReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRecap(this.recapReturnGeneral.getRecap(),classes);//this.recapBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRecap(this.recap,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRecap();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRecap();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RecapBeanSwingJInternalFrameAdditional.RecargarFormRecap(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRecap(false);
						
			if(recapSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapSessionBean.getEsGuardarRelacionado() && DetalleRecapJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleRecapActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(RecapJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRecap();
			}
			
			this.actualizarVisualTableDatosRecap();
			
			this.jTableDatosRecap.setRowSelectionInterval(this.getIndiceNuevoRecap(), this.getIndiceNuevoRecap());
			
			this.seleccionarFilaTablaRecapActual();
						
			this.actualizarEstadoCeldasBotonesRecap("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRecap(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRecap.jTextFieldnumeroRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarnumeroRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldnumero_autorizacionRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarnumero_autorizacionRecap);
		this.jInternalFrameDetalleFormRecap.jDateChooserfecha_inicioRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarfecha_inicioRecap);
		this.jInternalFrameDetalleFormRecap.jDateChooserfecha_finalRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarfecha_finalRecap);
		this.jInternalFrameDetalleFormRecap.jDateChooserfecha_elaboracionRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarfecha_elaboracionRecap);
		this.jInternalFrameDetalleFormRecap.jDateChooserfecha_caducidadRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarfecha_caducidadRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldmonto_ivaRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarmonto_ivaRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldsin_monto_ivaRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarsin_monto_ivaRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldivaRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarivaRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldotro_impuestoRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarotro_impuestoRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldvalor_propuestoRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarvalor_propuestoRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldsubtotalRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarsubtotalRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldfinancieroRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarfinancieroRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldtotalRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activartotalRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldvalor_cambioRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarvalor_cambioRecap);	
		//
		this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarid_empresaRecap);//
		this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarid_sucursalRecap);//
		this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.setEnabled(isHabilitar && this.recapConstantesFunciones.activarid_ejercicioRecap);
	};
	
	public void setDefaultControlesRecap() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRecap(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.recapSessionBean.setConGuardarRelaciones(true);			
			this.recapSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRecap.jTabbedPaneRelacionesRecap.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.recapSessionBean.setConGuardarRelaciones(false);			
			this.recapSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRecap.jTabbedPaneRelacionesRecap.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoRecap() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Recap recapAux:this.recapLogic.getRecaps()) {
				if(recapAux.getId().equals(this.iIdNuevoRecap)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Recap recapAux:this.recaps) {
				if(recapAux.getId().equals(this.iIdNuevoRecap)) {
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
	
	public int getIndiceActualRecap(Recap recap,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Recap recapAux:this.recapLogic.getRecaps()) {
				if(recapAux.getId().equals(recap.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Recap recapAux:this.recaps) {
				if(recapAux.getId().equals(recap.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRecap(Recap recapOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Recap recapAux:this.recapLogic.getRecaps()) {
				if(recapAux.getRecapOriginal().getId().equals(recapOriginal.getId())) {
					existe=true;
					recapOriginal.setId(recapAux.getId());
					recapOriginal.setVersionRow(recapAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Recap recapAux:this.recaps) {
				if(recapAux.getRecapOriginal().getId().equals(recapOriginal.getId())) {
					existe=true;
					recapOriginal.setId(recapAux.getId());
					recapOriginal.setVersionRow(recapAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRecap(Boolean esParaCancelar) throws Exception {
		recapsAux=new ArrayList<Recap>();
		recapAux=new Recap();
		
		if(!this.recapSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Recap recapAux:this.recapLogic.getRecaps()) {
					if(recapAux.getId()<0) {
						recapsAux.add(recapAux);
					}		
				}
				this.iIdNuevoRecap=0L;
				this.recapLogic.getRecaps().removeAll(recapsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Recap recapAux:this.recaps) {
					if(recapAux.getId()<0) {
						recapsAux.add(recapAux);
					}		
				}
				this.iIdNuevoRecap=0L;
				this.recaps.removeAll(recapsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRecap 
					&& this.recapLogic.getRecaps().size()>0
					) {
					recapAux=this.recapLogic.getRecaps().get(this.recapLogic.getRecaps().size() - 1);
				
					if(recapAux.getId()<0) {
						this.recapLogic.getRecaps().remove(recapAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRecap && this.recaps.size()>0) {
					recapAux=this.recaps.get(this.recaps.size() - 1);
				
					if(recapAux.getId()<0) {
						this.recaps.remove(recapAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRecap(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(recap.getId()<0) {
				this.recapLogic.getRecaps().remove(this.recap);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(recap.getId()<0) {
				this.recaps.remove(this.recap);
			}
		}			
	}
	
	public void setEstadosInicialesRecap(List<Recap> recapsAux) throws Exception {
		RecapConstantesFunciones.setEstadosInicialesRecap(recapsAux);
	}
	
	public void setEstadosInicialesRecap(Recap recapAux) throws Exception {
		RecapConstantesFunciones.setEstadosInicialesRecap(recapAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRecapActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRecapActual()) {
				if(!this.isEsNuevoRecap) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRecap=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRecapActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Recap ?", "MANTENIMIENTO DE Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Recap recap) throws Exception {
		RecapConstantesFunciones.seleccionarAsignar(this.recap,recap);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRecap=this.isPermisoActualizarOriginalRecap;
			
			
			this.seleccionarAsignar(recap);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RecapConstantesFunciones.quitarEspaciosRecap(this.recap,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRecap("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.recapSessionBean.setsFuncionBusquedaRapida(this.recapSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRecap) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRecap(esParaCancelar);				
				this.cancelarNuevoRecap(esParaCancelar);								
			}
			
			this.recap=new Recap();
			
			this.inicializarRecap();
			
			this.actualizarEstadoCeldasBotonesRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRecap() throws Exception {
		try {
			RecapConstantesFunciones.inicializarRecap(this.recap);
			
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
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.recapLogic.getRecaps().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRecaps(String sAccionBusqueda,List<Recap> recapsParaReportes) throws Exception {
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
					sPathReporteFinal="Recap"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RecapMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RecapMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Recap"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Recapes");		
		parameters.put("busquedapor", RecapConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleRecap.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					RecapLogic recapLogicAuxiliar=new RecapLogic();
					recapLogicAuxiliar.setDatosCliente(recapLogic.getDatosCliente());				
					recapLogicAuxiliar.setRecaps(recapsParaReportes);
					
					recapLogicAuxiliar.cargarRelacionesLoteForeignKeyRecapWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					recapsParaReportes=recapLogicAuxiliar.getRecaps();
					
					//recapLogic.getNewConnexionToDeep();
					
					//for (Recap recap:recapsParaReportes) {
					//	recapLogic.deepLoad(recap, false, DeepLoadType.INCLUDE, classes);
					//}						
					//recapLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//recapLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleRecap = AuxiliarReportes.class.getResourceAsStream("DetalleRecapDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detallerecap", reportFileDetalleRecap);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRecap=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RecapConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RecapConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRecap=new JRBeanArrayDataSource(RecapJInternalFrame.TraerRecapBeans(recapsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRecap);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RecapConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RecapConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RecapBean.TraerRecapBeans(recapsParaReportes).toArray()));
							
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
				this.generarExcelReporteRecaps(sAccionBusqueda,sTipoArchivoReporte,recapsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRecaps(sAccionBusqueda,sTipoArchivoReporte,recapsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRecapActionPerformed(null);
					//this.generarExcelReporteRecaps(sAccionBusqueda,sTipoArchivoReporte,recapsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRecaps(sAccionBusqueda,sTipoArchivoReporte,recapsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRecaps(sAccionBusqueda,sTipoArchivoReporte,recapsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRecaps(sAccionBusqueda,sTipoArchivoReporte,recapsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRecaps(String sAccionBusqueda,String sTipoArchivoReporte,List<Recap> recapsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recap";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Recaps");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRecap("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Recap recap : recapsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RecapConstantesFunciones.generarExcelReporteDataRecap("NORMAL",row,workbook,recap,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recap",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRecap(String sTipo,Row row,Workbook workbook) {
		
		RecapConstantesFunciones.generarExcelReporteHeaderRecap(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRecaps(String sAccionBusqueda,String sTipoArchivoReporte,List<Recap> recapsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recap_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Recaps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Recap recap : recapsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RecapConstantesFunciones.getRecapDescripcion(recap));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getnumero_autorizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_FECHAFINAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_FECHAFINAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getfecha_final());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_FECHAELABORACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_FECHAELABORACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getfecha_elaboracion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_FECHACADUCIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_FECHACADUCIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getfecha_caducidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_MONTOIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_MONTOIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getmonto_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_SINMONTOIVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_SINMONTOIVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getsin_monto_iva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_OTROIMPUESTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_OTROIMPUESTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getotro_impuesto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_VALORPROPUESTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_VALORPROPUESTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getvalor_propuesto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_SUBTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_SUBTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getsubtotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_FINANCIERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_FINANCIERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getfinanciero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RecapConstantesFunciones.LABEL_VALORCAMBIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RecapConstantesFunciones.LABEL_VALORCAMBIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(recap.getvalor_cambio());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recap",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRecaps(String sAccionBusqueda,String sTipoArchivoReporte,List<Recap> recapsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Recap> recapsRespaldo=null;
		
		classes=RecapConstantesFunciones.getClassesRelationshipsOfRecap(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.recapLogic.setDatosCliente(this.datosCliente);
		this.recapLogic.setDatosDeep(this.datosDeep);
		this.recapLogic.setIsConDeep(true);
		
		recapsRespaldo=this.recapLogic.getRecaps();
		
		this.recapLogic.setRecaps(recapsParaReportes);	
		this.recapLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		recapsParaReportes=this.recapLogic.getRecaps();
		this.recapLogic.setRecaps(recapsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recap_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Recaps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRecap("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Recap recap : recapsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRecap("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RecapConstantesFunciones.generarExcelReporteDataRecap("NORMAL",row,workbook,recap,cellStyleDataAux);
		
			
			


				//DetalleRecap
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleRecapConstantesFunciones.SCLASSWEBTITULO))) {

				if(recap.getDetalleRecaps()!=null && recap.getDetalleRecaps().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleRecapConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleRecapConstantesFunciones.generarExcelReporteHeaderDetalleRecap("RELACIONADO",row,workbook);
				}

				if(recap.getDetalleRecaps()!=null) {
					i2=0;
					for(DetalleRecap detallerecap : recap.getDetalleRecaps()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleRecapConstantesFunciones.generarExcelReporteDataDetalleRecap("RELACIONADO",row,workbook,detallerecap,cellStyleDataAuxHijo);
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
		cell.setCellValue(RecapConstantesFunciones.getRecapDescripcion(recap));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recap",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRecap.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRecap.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRecap.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRecap.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRecap() throws Exception {		
		this.startProcessRecap(true);
	}
	
	public void startProcessRecap(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRecap ,this.jPanelParametrosReportesRecap, this.jScrollPanelDatosRecap,this.jPanelPaginacionRecap, this.jScrollPanelDatosEdicionRecap, this.jPanelAccionesRecap,this.jPanelAccionesFormularioRecap,this.jmenuBarRecap,this.jmenuBarDetalleRecap,this.jTtoolBarRecap,this.jTtoolBarDetalleRecap);		
		
		final JTabbedPane jTabbedPaneBusquedasRecap=this.jTabbedPaneBusquedasRecap; 
		
		final JPanel jPanelParametrosReportesRecap=this.jPanelParametrosReportesRecap;
		//final JScrollPane jScrollPanelDatosRecap=this.jScrollPanelDatosRecap;
		final JTable jTableDatosRecap=this.jTableDatosRecap;		
		final JPanel jPanelPaginacionRecap=this.jPanelPaginacionRecap;
		//final JScrollPane jScrollPanelDatosEdicionRecap=this.jScrollPanelDatosEdicionRecap;
		final JPanel jPanelAccionesRecap=this.jPanelAccionesRecap;
		
		JPanel jPanelCamposAuxiliarRecap=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRecap=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRecap!=null) {
			jPanelCamposAuxiliarRecap=this.jInternalFrameDetalleFormRecap.jPanelCamposRecap;
			jPanelAccionesFormularioAuxiliarRecap=this.jInternalFrameDetalleFormRecap.jPanelAccionesFormularioRecap;
		}
		
		final JPanel jPanelCamposRecap=jPanelCamposAuxiliarRecap;
		final JPanel jPanelAccionesFormularioRecap=jPanelAccionesFormularioAuxiliarRecap;
		
		
		final JMenuBar jmenuBarRecap=this.jmenuBarRecap;
		final JToolBar jTtoolBarRecap=this.jTtoolBarRecap;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRecap=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRecap=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRecap!=null) {
			jmenuBarDetalleAuxiliarRecap=this.jInternalFrameDetalleFormRecap.jmenuBarDetalleRecap;
			jTtoolBarDetalleAuxiliarRecap=this.jInternalFrameDetalleFormRecap.jTtoolBarDetalleRecap;
		}
		
		final JMenuBar jmenuBarDetalleRecap=jmenuBarDetalleAuxiliarRecap;
		final JToolBar jTtoolBarDetalleRecap=jTtoolBarDetalleAuxiliarRecap;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRecap;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRecap;
			processRunnable.jTableDatos=jTableDatosRecap;
			processRunnable.jPanelCampos=jPanelCamposRecap;
			processRunnable.jPanelPaginacion=jPanelPaginacionRecap;
			processRunnable.jPanelAcciones=jPanelAccionesRecap;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRecap;
			
			
			processRunnable.jmenuBar=jmenuBarRecap;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRecap;
			processRunnable.jTtoolBar=jTtoolBarRecap;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRecap;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRecap ,jPanelParametrosReportesRecap,jTableDatosRecap, /*jScrollPanelDatosRecap,*/jPanelCamposRecap,jPanelPaginacionRecap, /*jScrollPanelDatosEdicionRecap,*/ jPanelAccionesRecap,jPanelAccionesFormularioRecap,jmenuBarRecap,jmenuBarDetalleRecap,jTtoolBarRecap,jTtoolBarDetalleRecap);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRecap ,jPanelParametrosReportesRecap, jScrollPanelDatosRecap,jPanelPaginacionRecap, jScrollPanelDatosEdicionRecap, jPanelAccionesRecap,jPanelAccionesFormularioRecap,jmenuBarRecap,jmenuBarDetalleRecap,jTtoolBarRecap,jTtoolBarDetalleRecap);
						
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
	
	public void finishProcessRecap() {// throws Exception 
		this.finishProcessRecap(true);
	}
	
	public void finishProcessRecap(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRecap ,this.jPanelParametrosReportesRecap, this.jScrollPanelDatosRecap,this.jPanelPaginacionRecap, this.jScrollPanelDatosEdicionRecap, this.jPanelAccionesRecap,this.jPanelAccionesFormularioRecap,this.jmenuBarRecap,this.jmenuBarDetalleRecap,this.jTtoolBarRecap,this.jTtoolBarDetalleRecap);		
		
		final JTabbedPane jTabbedPaneBusquedasRecap=this.jTabbedPaneBusquedasRecap; 
		
		final JPanel jPanelParametrosReportesRecap=this.jPanelParametrosReportesRecap;
		//final JScrollPane jScrollPanelDatosRecap=this.jScrollPanelDatosRecap;
		final JTable jTableDatosRecap=this.jTableDatosRecap;		
		final JPanel jPanelPaginacionRecap=this.jPanelPaginacionRecap;
		//final JScrollPane jScrollPanelDatosEdicionRecap=this.jScrollPanelDatosEdicionRecap;
		final JPanel jPanelAccionesRecap=this.jPanelAccionesRecap;
		
		JPanel jPanelCamposAuxiliarRecap=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRecap=new JPanel();
		
		if(this.jInternalFrameDetalleFormRecap!=null) {
			jPanelCamposAuxiliarRecap=this.jInternalFrameDetalleFormRecap.jPanelCamposRecap;
			jPanelAccionesFormularioAuxiliarRecap=this.jInternalFrameDetalleFormRecap.jPanelAccionesFormularioRecap;
		}
		
		final JPanel jPanelCamposRecap=jPanelCamposAuxiliarRecap;
		final JPanel jPanelAccionesFormularioRecap=jPanelAccionesFormularioAuxiliarRecap;
		
		
		final JMenuBar jmenuBarRecap=this.jmenuBarRecap;		
		final JToolBar jTtoolBarRecap=this.jTtoolBarRecap;
				
		JMenuBar jmenuBarDetalleAuxiliarRecap=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRecap=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRecap!=null) {
			jmenuBarDetalleAuxiliarRecap=this.jInternalFrameDetalleFormRecap.jmenuBarDetalleRecap;
			jTtoolBarDetalleAuxiliarRecap=this.jInternalFrameDetalleFormRecap.jTtoolBarDetalleRecap;		
		}
		
		final JMenuBar jmenuBarDetalleRecap=jmenuBarDetalleAuxiliarRecap;
		final JToolBar jTtoolBarDetalleRecap=jTtoolBarDetalleAuxiliarRecap;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRecap;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRecap;
			processRunnable.jTableDatos=jTableDatosRecap;
			processRunnable.jPanelCampos=jPanelCamposRecap;
			processRunnable.jPanelPaginacion=jPanelPaginacionRecap;
			processRunnable.jPanelAcciones=jPanelAccionesRecap;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRecap;
			
			
			processRunnable.jmenuBar=jmenuBarRecap;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRecap;
			processRunnable.jTtoolBar=jTtoolBarRecap;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRecap;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRecap ,jPanelParametrosReportesRecap, jTableDatosRecap,/*jScrollPanelDatosRecap,*/jPanelCamposRecap,jPanelPaginacionRecap, /*jScrollPanelDatosEdicionRecap,*/ jPanelAccionesRecap,jPanelAccionesFormularioRecap,jmenuBarRecap,jmenuBarDetalleRecap,jTtoolBarRecap,jTtoolBarDetalleRecap));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRecap(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRecap(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRecap(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRecap(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRecap,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRecap,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRecap(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRecap,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRecap,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.recapConstantesFunciones.getsFinalQueryRecap();
		String  finalQueryPaginacionTodos=this.recapConstantesFunciones.getsFinalQueryRecap();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RecapConstantesFunciones.getArrayColumnasGlobalesNoRecap(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RecapConstantesFunciones.getArrayColumnasGlobalesRecap(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RecapConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.recapsEliminados= new ArrayList<Recap>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRecap();
		
				///*RecapSessionBean*/this.recapSessionBean=new RecapSessionBean();
			
			if(this.recapSessionBean==null) {
				this.recapSessionBean=new RecapSessionBean();
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
					this.iNumeroPaginacion=RecapConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RecapConstantesFunciones.getClassesForeignKeysOfRecap(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/recap."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			recapsAux= new ArrayList<Recap>();
			
				
			recapLogic.setDatosCliente(this.datosCliente);
			recapLogic.setDatosDeep(this.datosDeep);
			recapLogic.setIsConDeep(true);
			
			
			recapLogic.getRecapDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					recapLogic.getTodosRecaps(finalQueryGlobal,pagination);
					
					//recapLogic.getTodosRecapsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(recapLogic.getRecaps()==null|| recapLogic.getRecaps().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							recapsAux= new ArrayList<Recap>();
							recapsAux.addAll(recapLogic.getRecaps());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recapsAux= new ArrayList<Recap>();
							recapsAux.addAll(recaps);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							recapLogic.getTodosRecaps(finalQueryGlobal+"",this.pagination);												
							
							//recapLogic.getTodosRecapsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRecaps("Todos",recapLogic.getRecaps() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							recapLogic.setRecaps(new ArrayList<Recap>());					
							recapLogic.getRecaps().addAll(recapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recaps=new ArrayList<Recap>();
							recaps.addAll(recapsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRecap=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRecap=this.idActual;
				
				} else if(this.idRecapActual!=null && this.idRecapActual!=0L) {
					idRecap=idRecapActual;
				}
				
					
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndicePorId(idRecap);
				
				this.recaps=new ArrayList<Recap>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					recapLogic.getEntity(idRecap);
					
					//recapLogic.getEntityWithConnection(idRecap);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recapLogic.setRecaps(new ArrayList<Recap>());
					recapLogic.getRecaps().add(recapLogic.getRecap());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.recaps=new ArrayList<Recap>();
					this.recaps.add(recap);
				}
				
				if(recapLogic.getRecap()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					recapLogic.getRecapsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=recapLogic.getRecaps()==null||recapLogic.getRecaps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=recaps==null|| recaps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						recapsAux=new ArrayList<Recap>();
						recapsAux.addAll(recapLogic.getRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recapsAux=new ArrayList<Recap>();
							recapsAux.addAll(recaps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							recapLogic.getRecapsFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRecaps("FK_IdEjercicio",recapLogic.getRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRecaps("FK_IdEjercicio",recaps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						recapLogic.setRecaps(new ArrayList<Recap>());
						recapLogic.getRecaps().addAll(recapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recaps=new ArrayList<Recap>();
							recaps.addAll(recapsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					recapLogic.getRecapsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=recapLogic.getRecaps()==null||recapLogic.getRecaps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=recaps==null|| recaps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						recapsAux=new ArrayList<Recap>();
						recapsAux.addAll(recapLogic.getRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recapsAux=new ArrayList<Recap>();
							recapsAux.addAll(recaps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							recapLogic.getRecapsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRecaps("FK_IdEmpresa",recapLogic.getRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRecaps("FK_IdEmpresa",recaps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						recapLogic.setRecaps(new ArrayList<Recap>());
						recapLogic.getRecaps().addAll(recapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recaps=new ArrayList<Recap>();
							recaps.addAll(recapsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					recapLogic.getRecapsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=recapLogic.getRecaps()==null||recapLogic.getRecaps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=recaps==null|| recaps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						recapsAux=new ArrayList<Recap>();
						recapsAux.addAll(recapLogic.getRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recapsAux=new ArrayList<Recap>();
							recapsAux.addAll(recaps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							recapLogic.getRecapsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RecapConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRecaps("FK_IdSucursal",recapLogic.getRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRecaps("FK_IdSucursal",recaps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						recapLogic.setRecaps(new ArrayList<Recap>());
						recapLogic.getRecaps().addAll(recapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recaps=new ArrayList<Recap>();
							recaps.addAll(recapsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRecap();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRecap();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=recapLogic.getRecaps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=recaps.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=recapLogic.getRecaps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=recaps.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Recap recap) {
		Boolean permite=true;
		
		if(this.recap.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RecapConstantesFunciones.getOrderByListaRecap();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RecapConstantesFunciones.getOrderByListaRecap();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Recap recap:recapLogic.getRecaps()) {
				if(recap.getsType().equals(Constantes2.S_TOTALES)) {
					recapTotales=recap;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Recap recap:this.recaps) {
				if(recap.getsType().equals(Constantes2.S_TOTALES)) {
					recapTotales=recap;
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
			this.recapAux=new Recap();
			this.recapAux.setsType(Constantes2.S_TOTALES);
			this.recapAux.setIsNew(false);
			this.recapAux.setIsChanged(false);
			this.recapAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RecapConstantesFunciones.TotalizarValoresFilaRecap(this.recapLogic.getRecaps(),this.recapAux);
				
				this.recapLogic.getRecaps().add(this.recapAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RecapConstantesFunciones.TotalizarValoresFilaRecap(this.recaps,this.recapAux);
				
				this.recaps.add(this.recapAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		recapTotales=new Recap();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.recapLogic.getRecaps().remove(recapTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.recaps.remove(recapTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		recapTotales=new Recap();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Recap recap:recapLogic.getRecaps()) {
				if(recap.getsType().equals(Constantes2.S_TOTALES)) {
					recapTotales=recap;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RecapConstantesFunciones.TotalizarValoresFilaRecap(this.recapLogic.getRecaps(),recapTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Recap recap:this.recaps) {
				if(recap.getsType().equals(Constantes2.S_TOTALES)) {
					recapTotales=recap;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RecapConstantesFunciones.TotalizarValoresFilaRecap(this.recaps,recapTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRecapsFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRecapsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRecapsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRecapsFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recapLogic.getRecapsFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRecapsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recapLogic.getRecapsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRecapsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recapLogic.getRecapsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosRecap() {
		this.isPermisoTodoRecap=false;
		this.isPermisoNuevoRecap=false;
		this.isPermisoActualizarRecap=false;
		this.isPermisoActualizarOriginalRecap=false;
		this.isPermisoEliminarRecap=false;
		this.isPermisoGuardarCambiosRecap=false;
		this.isPermisoConsultaRecap=false;
		this.isPermisoBusquedaRecap=false;
		this.isPermisoReporteRecap=false;		
		this.isPermisoOrdenRecap=false;		
		this.isPermisoPaginacionMedioRecap=false;		
		this.isPermisoPaginacionAltoRecap=false;
		this.isPermisoPaginacionTodoRecap=false;
		this.isPermisoCopiarRecap=false;		
		this.isPermisoVerFormRecap=false;		
		this.isPermisoDuplicarRecap=false;		
		this.isPermisoOrdenRecap=false;		
	}
	
	public void setPermisosUsuarioRecap(Boolean isPermiso) {
		this.isPermisoTodoRecap=isPermiso;
		this.isPermisoNuevoRecap=isPermiso;
		this.isPermisoActualizarRecap=isPermiso;
		this.isPermisoActualizarOriginalRecap=isPermiso;
		this.isPermisoEliminarRecap=isPermiso;
		this.isPermisoGuardarCambiosRecap=isPermiso;
		this.isPermisoConsultaRecap=isPermiso;
		this.isPermisoBusquedaRecap=isPermiso;
		this.isPermisoReporteRecap=isPermiso;
		this.isPermisoOrdenRecap=isPermiso;		
		this.isPermisoPaginacionMedioRecap=isPermiso;		
		this.isPermisoPaginacionAltoRecap=isPermiso;		
		this.isPermisoPaginacionTodoRecap=isPermiso;		
		this.isPermisoCopiarRecap=isPermiso;		
		this.isPermisoVerFormRecap=isPermiso;		
		this.isPermisoDuplicarRecap=isPermiso;
		this.isPermisoOrdenRecap=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRecap(Boolean isPermiso) {
		//this.isPermisoTodoRecap=isPermiso;
		this.isPermisoNuevoRecap=isPermiso;
		this.isPermisoActualizarRecap=isPermiso;
		this.isPermisoActualizarOriginalRecap=isPermiso;
		this.isPermisoEliminarRecap=isPermiso;
		this.isPermisoGuardarCambiosRecap=isPermiso;
		//this.isPermisoConsultaRecap=isPermiso;
		//this.isPermisoBusquedaRecap=isPermiso;
		//this.isPermisoReporteRecap=isPermiso;
		//this.isPermisoOrdenRecap=isPermiso;		
		//this.isPermisoPaginacionMedioRecap=isPermiso;		
		//this.isPermisoPaginacionAltoRecap=isPermiso;		
		//this.isPermisoPaginacionTodoRecap=isPermiso;		
		//this.isPermisoCopiarRecap=isPermiso;		
		//this.isPermisoDuplicarRecap=isPermiso;
		//this.isPermisoOrdenRecap=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRecapClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleRecapConstantesFunciones.SNOMBREOPCION);
		
		if(RecapJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleRecap=false;
		this.isTienePermisosDetalleRecap=this.verificarGetPermisosUsuarioOpcionRecapClaseRelacionada(this.opcionsRelacionadas,DetalleRecapConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebRecap(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRecapClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleRecap=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioRecapClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRecapClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRecapClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleRecap && this.jInternalFrameDetalleFormRecap!=null && this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRecap.jTabbedPaneRelacionesRecap.remove(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioRecap() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RecapJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.recapSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RecapConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRecap=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRecap=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRecap=this.isPermisoActualizarRecap;
			this.isPermisoEliminarRecap=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRecap=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRecap=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRecap=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRecap=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRecap=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRecap=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRecap=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRecap=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRecap=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRecap=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRecap=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRecap=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRecap=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.recapSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRecap.setToolTipText(this.jTableDatosRecap.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRecap(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRecap(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RecapJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RecapJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRecap() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleRecap && this.recapConstantesFunciones.mostrarDetalleRecapRecap && !RecapConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Recap");
			reporte.setsDescripcion("Detalle Recap");
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
	public void inicializarCombosForeignKeyRecapListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRecapListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RecapJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRecapListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyRecapListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RecapParameterReturnGeneral recapReturnGeneral=new RecapParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.recapConstantesFunciones.cargarid_empresaRecap)
					 || (this.esRecargarFks && this.recapConstantesFunciones.cargarid_empresaRecap)) {

					if(!this.recapSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+recapSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.recapConstantesFunciones.cargarid_sucursalRecap)
					 || (this.esRecargarFks && this.recapConstantesFunciones.cargarid_sucursalRecap)) {

					if(!this.recapSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+recapSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.recapConstantesFunciones.cargarid_ejercicioRecap)
					 || (this.esRecargarFks && this.recapConstantesFunciones.cargarid_ejercicioRecap)) {

					if(!this.recapSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+recapSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				recapReturnGeneral=recapLogic.cargarCombosLoteForeignKeyRecap(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=recapReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=recapReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=recapReturnGeneral.getejerciciosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRecap()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.recapSessionBean==null) {
				this.recapSessionBean=new RecapSessionBean();
			}

			if(!this.recapSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.recapSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.recapSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyRecap()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRecap(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRecap()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
			
			
				this.recap.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.recap.setfecha_final(this.parametroGeneralUsuario.getfecha_sistema());
				this.recap.setfecha_elaboracion(this.parametroGeneralUsuario.getfecha_sistema());
				this.recap.setfecha_caducidad(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRecap();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRecap(Recap recap)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRecap(Recap recap,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRecap()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRecap()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormRecap!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRecap()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRecap()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRecap()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRecap()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRecap(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRecap()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap!=null && this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap!=null && this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap!=null && this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public RecapBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RecapBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RecapBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.recapSessionBean=new RecapSessionBean(); 
		this.recapConstantesFunciones=new RecapConstantesFunciones(); 
		this.recapBean=new Recap();//(this.recapConstantesFunciones); 		
		this.recapReturnGeneral=new RecapParameterReturnGeneral(); 
		
		this.recapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.recapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RecapBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RecapBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RecapBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRecap(true);
			
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
			
			this.recapConstantesFunciones=new RecapConstantesFunciones(); 
			this.recapBean=new Recap();//this.recapConstantesFunciones); 			
			this.recapReturnGeneral=new RecapParameterReturnGeneral(); 
		
			RecapBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Recap Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.recap=new Recap();
			this.recaps = new ArrayList<Recap>();
			this.recapsAux = new ArrayList<Recap>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic=new RecapLogic();
				this.recapLogic.getNewConnexionToDeep("");
			}
			
			//this.recapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.recapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRecap);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRecap!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRecap);	
					}
					
					if(this.jInternalFrameImportacionRecap!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRecap);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRecap!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRecap);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRecap!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRecap);
				this.jInternalFrameDetalleFormRecap.setVisible(false);
				this.jInternalFrameDetalleFormRecap.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRecap!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRecap);
					this.jInternalFrameReporteDinamicoRecap.setVisible(false);
					this.jInternalFrameReporteDinamicoRecap.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRecap!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRecap);
					this.jInternalFrameImportacionRecap.setVisible(false);
					this.jInternalFrameImportacionRecap.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRecap!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRecap);
					this.jInternalFrameOrderByRecap.setVisible(false);
					this.jInternalFrameOrderByRecap.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRecapActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RecapConstantesFunciones.INUMEROPAGINACION;
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
			
			this.recapReturnGeneral=new RecapParameterReturnGeneral();
			
			this.recapParameterGeneral=new RecapParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.recapLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.recapSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RecapJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.recapSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleRecapConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RecapConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.recapSessionBean.getEsGuardarRelacionado(),this.recapSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RecapConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.recapSessionBean.getEsGuardarRelacionado(),this.recapSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRecap=false;
			this.isVisibilidadCeldaDuplicarRecap=true;
			this.isVisibilidadCeldaCopiarRecap=true;
			this.isVisibilidadCeldaVerFormRecap=true;
			this.isVisibilidadCeldaOrdenRecap=true;
			this.isVisibilidadCeldaNuevoRelacionesRecap=false;
			this.isVisibilidadCeldaModificarRecap=false;
			this.isVisibilidadCeldaActualizarRecap=false;
			this.isVisibilidadCeldaEliminarRecap=false;
			this.isVisibilidadCeldaCancelarRecap=false;
			this.isVisibilidadCeldaGuardarRecap=false;
			this.isVisibilidadCeldaGuardarCambiosRecap=false;
			
			
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRecap();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRecap(false);
			
			this.setPermisosUsuarioRecap();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.recapSessionBean.getEsGuardarRelacionado() 
				|| (this.recapSessionBean.getEsGuardarRelacionado() && this.recapSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRecapClasesRelacionadas();
			}
			
			if(this.recapSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRecapClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RecapJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRecap();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRecap();
			}
			
			if(!this.isPermisoBusquedaRecap) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRecap.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.recapSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRecap,this.isPermisoPaginacionMedioRecap,this.isPermisoPaginacionTodoRecap);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RecapConstantesFunciones.getTiposSeleccionarRecap());
				
				this.tiposColumnasSelect=RecapConstantesFunciones.getTiposSeleccionarRecap(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectRecap();				
				//this.tiposRelacionesSelect=RecapConstantesFunciones.getTiposRelacionesRecap(true);
				
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
			//if(!this.recapSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRecap();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioRecap(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioRecap(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRecap() ;
			
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
			
			
			this.detallerecapLogic=new DetalleRecapLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				recapImplementable= (RecapImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RecapConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				recapImplementableHome= (RecapImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RecapConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.recaps= new ArrayList<Recap>();
			this.recapsEliminados= new ArrayList<Recap>();
						
			this.isEsNuevoRecap=false;
			this.esParaAccionDesdeFormularioRecap=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRecap(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRecap();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.recapSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RecapBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RecapConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRecap(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRecap!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRecap();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRecap();
			}
			
			RecapBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRecap.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRecap.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRecap.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRecap(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Recap: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRecap() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleRecapConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleRecapConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRecap")) {
				iIndex=this.jInternalFrameDetalleFormRecap.jTabbedPaneRelacionesRecap.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRecap.jTabbedPaneRelacionesRecap.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRecap.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Recapes")) {
					if(!DetalleRecapJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessRecap();

						this.cargarParteTabPanelRelacionadaDetalleRecap(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRecap();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleRecap(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormRecap.cargarSessionConBeanSwingJInternalFrameDetalleRecap(false,true,iIndex);
		this.jButtonDetalleRecapActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleRecap();

		//this.jTabbedPaneRelacionesRecap.updateUI();
		//this.jTabbedPaneRelacionesRecap.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesRecap.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleRecap")) {
				int row=this.jTableDatosRecap.getSelectedRow();
				jButtonDetalleRecapActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.recapSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Recap")) {

					if(this.isTienePermisosDetalleRecap && this.recapConstantesFunciones.mostrarDetalleRecapRecap && !RecapConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Recapes"+"("+DetalleRecapConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Recapes");

						if(recapConstantesFunciones.resaltarDetalleRecapRecap!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(recapConstantesFunciones.resaltarDetalleRecapRecap);
						}

						jmenuItem.setEnabled(this.recapConstantesFunciones.activarDetalleRecapRecap);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleRecap"));

						

						this.jInternalFrameDetalleFormRecap.jmenuDetalleRecap.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyRecap(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRecap(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRecap(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRecapListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRecap();
		
		this.cargarCombosFrameForeignKeyRecap();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRecap();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRecap();
		}
	}
	
	
	
	public void jButtonNuevoRecapActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.recapSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			
			
			if(jTableDatosRecap.getRowCount()>=1) {
				jTableDatosRecap.removeRowSelectionInterval(0, jTableDatosRecap.getRowCount()-1);						
			}
			
			this.isEsNuevoRecap=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRecap(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRecap(true);			
			//this.recap=new Recap();
			//this.recap.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRecap(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRecap() ;
			
			if(RecapJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRecap(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.recap);	
			this.actualizarInformacion("INFO_PADRE",false,this.recap);				
			
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			
			if(this.recapSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Recap: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRecapActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Recap> recapsSeleccionados=new ArrayList<Recap>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRecap.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRecap.getSelectedRows().length;			
			}
			
			recapsSeleccionados=this.getRecapsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRecap--;			
				//Recap recapAux= new Recap();			
				//recapAux.setId(this.iIdNuevoRecap);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Recap recapOrigen=new Recap();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Recap recapOrigen : recapsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRecap.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							recapOrigen =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							recapOrigen =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRecap();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.recap.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRecap(recapOrigen,this.recap,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.recapLogic.getRecaps().add(this.recapAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.recaps.add(this.recapAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRecap(false);
				
				this.jTableDatosRecap.setRowSelectionInterval(this.getIndiceNuevoRecap(), this.getIndiceNuevoRecap());
				
				int iLastRow =  this.jTableDatosRecap.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRecap.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRecap.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRecap(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Recap> recapsSeleccionados=new ArrayList<Recap>();									
		
			Recap recapOrigen=new Recap();
			Recap recapDestino=new Recap();
				
			recapsSeleccionados=this.getRecapsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRecap.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || recapsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRecap.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recapOrigen =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						recapOrigen =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						recapDestino =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						recapDestino =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				recapOrigen =recapsSeleccionados.get(0);
				recapDestino =recapsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRecap(recapOrigen,recapDestino,true,false);
				
				recapDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(recapDestino,recapLogic.getRecaps());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(recapDestino,recaps);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRecap(false);
				
				//this.jTableDatosRecap.setRowSelectionInterval(this.getIndiceNuevoRecap(), this.getIndiceNuevoRecap());
				
				int iLastRow =  this.jTableDatosRecap.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRecap.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRecap.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRecap(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRecap.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRecap.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRecap.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRecap.setVisible(!isVisible);
			this.jPanelPaginacionRecap.setVisible(!isVisible);
			this.jPanelAccionesRecap.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRecap();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRecap();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRecap();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRecap();
			
			this.abrirFrameOrderByRecap();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRecap();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRecap(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRecap);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRecap.isMaximum()) {
					this.jInternalFrameDetalleFormRecap.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRecap.setSize(this.jInternalFrameDetalleFormRecap.iWidthFormulario,this.jInternalFrameDetalleFormRecap.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRecap.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRecap.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRecap.isMaximum()) {
						this.jInternalFrameDetalleFormRecap.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRecap.jContentPaneDetalleRecap.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRecap.jTabbedPaneRelacionesRecap.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRecap.jContentPaneDetalleRecap.getWidth(),RecapConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRecap.jTabbedPaneRelacionesRecap.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRecap.jContentPaneDetalleRecap.getWidth(),RecapConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRecap.jTabbedPaneRelacionesRecap.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRecap.jContentPaneDetalleRecap.getWidth(),RecapConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleRecapJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleRecap();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRecap.setVisible(true);
	        this.jInternalFrameDetalleFormRecap.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRecap() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRecap==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRecap,false,this);
				} else {
					this.jInternalFrameOrderByRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRecap,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRecap);
				this.jInternalFrameOrderByRecap.setVisible(false);
				this.jInternalFrameOrderByRecap.setSelected(false);
				
				this.jInternalFrameOrderByRecap.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRecap"));
				
				this.inicializarActualizarBindingTablaOrderByRecap();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRecap() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRecap==null) {
				
				this.jInternalFrameImportacionRecap=new ImportacionJInternalFrame(RecapConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRecap);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRecap);
				this.jInternalFrameImportacionRecap.setVisible(false);
				this.jInternalFrameImportacionRecap.setSelected(false);


				this.jInternalFrameImportacionRecap.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRecap"));
				this.jInternalFrameImportacionRecap.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRecap"));
				this.jInternalFrameImportacionRecap.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRecap"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRecap() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRecap==null) {
				this.jInternalFrameReporteDinamicoRecap=new ReporteDinamicoJInternalFrame(RecapConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRecap);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRecap);
				this.jInternalFrameReporteDinamicoRecap.setVisible(false);
				this.jInternalFrameReporteDinamicoRecap.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRecap.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRecap"));
				this.jInternalFrameReporteDinamicoRecap.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRecap"));
				this.jInternalFrameReporteDinamicoRecap.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRecap"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRecap();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleRecap() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.jScrollPanelDatosDetalleRecap.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormRecap.jContentPaneDetalleRecap.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.jScrollPanelDatosDetalleRecap.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.jScrollPanelDatosDetalleRecap.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.jScrollPanelDatosDetalleRecap.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleRecap() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRecap);
			
	       	this.jInternalFrameDetalleFormRecap.setVisible(false);
	        this.jInternalFrameDetalleFormRecap.setSelected(false);
			
			//this.jInternalFrameDetalleFormRecap.dispose();
			//this.jInternalFrameDetalleFormRecap=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRecap() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRecap.setVisible(true);
	        this.jInternalFrameReporteDinamicoRecap.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRecap() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRecap.setVisible(true);
	        this.jInternalFrameImportacionRecap.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRecap() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRecap.setVisible(true);
	        this.jInternalFrameOrderByRecap.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRecap() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRecap.setVisible(false);
	        this.jInternalFrameOrderByRecap.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRecap() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRecap.setVisible(false);
	        this.jInternalFrameReporteDinamicoRecap.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRecap() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRecap.setVisible(false);
	        this.jInternalFrameImportacionRecap.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRecap(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRecap(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRecap.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRecap(true);
			//this.isEsNuevoRecap=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRecap("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRecap(false) ;
			
			if(recapSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapSessionBean.getEsGuardarRelacionado() && DetalleRecapJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleRecapActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(RecapJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRecap(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRecap(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRecapActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRecap(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRecap.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRecap(true);
			//this.isEsNuevoRecap=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.recap.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRecap("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRecap(false) ;
			
			if(RecapJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRecap(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRecap(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	
	public void jButtonActualizarRecapActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRecap(false);
			
			//if(!this.isEsNuevoRecap) {								
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				
			}
			
			if(this.permiteMantenimiento(this.recap)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.recapSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRecap=true;
					this.inicializarActualizarBindingTablaRecap(false);
					this.isEsNuevoRecap=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRecap=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRecap=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRecap(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRecap(false);
				
				this.habilitarDeshabilitarControlesRecap(false);
			
												
				
				if(RecapJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRecap();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRecapActionPerformed(evt,recapSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRecap(this.recap,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRecap.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,recapSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.recap.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Recap.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Recap.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRecapActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRecap.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				this.recap.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				this.recap.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.recap)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.recapSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RecapModel) this.jTableDatosRecap.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRecap=true;
				this.inicializarActualizarBindingTablaRecap(false);
				this.isEsNuevoRecap=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRecap(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRecap(false);
				
				this.habilitarDeshabilitarControlesRecap(false);
				
				
				
				if(RecapJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRecap();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRecapActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRecap.getRowCount()>=1) {
				jTableDatosRecap.removeRowSelectionInterval(0, jTableDatosRecap.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRecap(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRecap(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRecap(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRecap(false) ;
			
			this.isEsNuevoRecap=false;
			
			if(RecapJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRecap();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRecap(false);
				
				//SI ES MANUAL
				if(RecapJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRecap();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRecap--;			
			//Recap recapAux= new Recap();			
			//recapAux.setId(this.iIdNuevoRecap);
			
			if(this.jInternalFrameDetalleFormRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRecap();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
			
			this.recap.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.recapLogic.getRecaps().add(this.recapAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.recaps.add(this.recapAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRecap(false);
			
			this.jTableDatosRecap.setRowSelectionInterval(this.getIndiceNuevoRecap(), this.getIndiceNuevoRecap());
			
			int iLastRow =  this.jTableDatosRecap.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRecap.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRecap.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRecap(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRecap(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRecap(false);
			
			//SI ES MANUAL
			if(RecapJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRecap();
			}
			
			//this.abrirFrameTreeRecap();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRecapActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE RecapES ?", "MANTENIMIENTO DE Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRecap.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRecap();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.recapReturnGeneral=recapLogic.procesarImportacionRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.recapParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRecapReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRecapActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRecap.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRecap.setFileImportacion(this.jInternalFrameImportacionRecap.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRecap.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRecap.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRecap.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRecap.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRecapActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Recap> recapsSeleccionados=new ArrayList<Recap>();		

		recapsSeleccionados=this.getRecapsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRecap.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRecap.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RecapBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RecapBaseDesign.jrxml";
			
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
			
			this.generarReporteRecaps("Todos",recapsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recap",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRecap.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRecap.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RecapConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroAutorizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroAutorizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroAutorizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroAutorizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_FECHAFINAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFinal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFinal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFinal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFinal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_FECHAELABORACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaElaboracion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaElaboracion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaElaboracion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaElaboracion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_FECHACADUCIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCaducidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCaducidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCaducidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCaducidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_MONTOIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_SINMONTOIVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nMontoIva_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nMontoIva_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nMontoIva_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nMontoIva_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_OTROIMPUESTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_roImpuesto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_roImpuesto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_roImpuesto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_roImpuesto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_VALORPROPUESTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorPropuesto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorPropuesto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorPropuesto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorPropuesto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_SUBTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_btotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_btotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_btotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_btotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_FINANCIERO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nanciero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nanciero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nanciero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nanciero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RecapConstantesFunciones.LABEL_VALORCAMBIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorCambio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorCambio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorCambio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorCambio_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRecap.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRecap.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRecap.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RecapConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RecapConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case RecapConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case RecapConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					sNombreCampoCategoria="numero_autorizacion";
					break;

				case RecapConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case RecapConstantesFunciones.LABEL_FECHAFINAL:
					sNombreCampoCategoria="fecha_final";
					break;

				case RecapConstantesFunciones.LABEL_FECHAELABORACION:
					sNombreCampoCategoria="fecha_elaboracion";
					break;

				case RecapConstantesFunciones.LABEL_FECHACADUCIDAD:
					sNombreCampoCategoria="fecha_caducidad";
					break;

				case RecapConstantesFunciones.LABEL_MONTOIVA:
					sNombreCampoCategoria="monto_iva";
					break;

				case RecapConstantesFunciones.LABEL_SINMONTOIVA:
					sNombreCampoCategoria="sin_monto_iva";
					break;

				case RecapConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case RecapConstantesFunciones.LABEL_OTROIMPUESTO:
					sNombreCampoCategoria="otro_impuesto";
					break;

				case RecapConstantesFunciones.LABEL_VALORPROPUESTO:
					sNombreCampoCategoria="valor_propuesto";
					break;

				case RecapConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoria="subtotal";
					break;

				case RecapConstantesFunciones.LABEL_FINANCIERO:
					sNombreCampoCategoria="financiero";
					break;

				case RecapConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case RecapConstantesFunciones.LABEL_VALORCAMBIO:
					sNombreCampoCategoria="valor_cambio";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRecap.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RecapConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RecapConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case RecapConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case RecapConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					sNombreCampoCategoriaValor="numero_autorizacion";
					break;

				case RecapConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case RecapConstantesFunciones.LABEL_FECHAFINAL:
					sNombreCampoCategoriaValor="fecha_final";
					break;

				case RecapConstantesFunciones.LABEL_FECHAELABORACION:
					sNombreCampoCategoriaValor="fecha_elaboracion";
					break;

				case RecapConstantesFunciones.LABEL_FECHACADUCIDAD:
					sNombreCampoCategoriaValor="fecha_caducidad";
					break;

				case RecapConstantesFunciones.LABEL_MONTOIVA:
					sNombreCampoCategoriaValor="monto_iva";
					break;

				case RecapConstantesFunciones.LABEL_SINMONTOIVA:
					sNombreCampoCategoriaValor="sin_monto_iva";
					break;

				case RecapConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case RecapConstantesFunciones.LABEL_OTROIMPUESTO:
					sNombreCampoCategoriaValor="otro_impuesto";
					break;

				case RecapConstantesFunciones.LABEL_VALORPROPUESTO:
					sNombreCampoCategoriaValor="valor_propuesto";
					break;

				case RecapConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoriaValor="subtotal";
					break;

				case RecapConstantesFunciones.LABEL_FINANCIERO:
					sNombreCampoCategoriaValor="financiero";
					break;

				case RecapConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case RecapConstantesFunciones.LABEL_VALORCAMBIO:
					sNombreCampoCategoriaValor="valor_cambio";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRecap.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRecap.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RecapConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RecapConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case RecapConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case RecapConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Autorizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_autorizacion");
					break;

				case RecapConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case RecapConstantesFunciones.LABEL_FECHAFINAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Final",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_final");
					break;

				case RecapConstantesFunciones.LABEL_FECHAELABORACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Elaboracion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_elaboracion");
					break;

				case RecapConstantesFunciones.LABEL_FECHACADUCIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Caducad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_caducidad");
					break;

				case RecapConstantesFunciones.LABEL_MONTOIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_iva");
					break;

				case RecapConstantesFunciones.LABEL_SINMONTOIVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sin Monto Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sin_monto_iva");
					break;

				case RecapConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case RecapConstantesFunciones.LABEL_OTROIMPUESTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Otro Impuesto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"otro_impuesto");
					break;

				case RecapConstantesFunciones.LABEL_VALORPROPUESTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Propuesto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_propuesto");
					break;

				case RecapConstantesFunciones.LABEL_SUBTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Subtotal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"subtotal");
					break;

				case RecapConstantesFunciones.LABEL_FINANCIERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Financiero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"financiero");
					break;

				case RecapConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case RecapConstantesFunciones.LABEL_VALORCAMBIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Cambio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_cambio");
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
	
	public void jButtonGenerarExcelReporteDinamicoRecapActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Recap> recapsSeleccionados=new ArrayList<Recap>();		
		
		recapsSeleccionados=this.getRecapsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recap";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Recaps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRecap.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRecap.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RecapConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getnumero_autorizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_FECHAFINAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_FECHAFINAL);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getfecha_final());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_FECHAELABORACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_FECHAELABORACION);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getfecha_elaboracion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_FECHACADUCIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_FECHACADUCIDAD);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getfecha_caducidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_MONTOIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_MONTOIVA);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getmonto_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_SINMONTOIVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_SINMONTOIVA);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getsin_monto_iva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_IVA);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_OTROIMPUESTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_OTROIMPUESTO);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getotro_impuesto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_VALORPROPUESTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_VALORPROPUESTO);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getvalor_propuesto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_SUBTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_SUBTOTAL);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getsubtotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_FINANCIERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_FINANCIERO);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getfinanciero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RecapConstantesFunciones.LABEL_VALORCAMBIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RecapConstantesFunciones.LABEL_VALORCAMBIO);
					iRow++;

					for(Recap recap:recapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(recap.getvalor_cambio());
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
			//	this.getFilaCabeceraExportarExcelRecap(row);				
			//	iRow++;
			//}				
			
			//for(Recap recapAux:recapsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRecap(recapAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recap",JOptionPane.INFORMATION_MESSAGE);
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
				this.recapLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRecap(false);
			
			//SI ES MANUAL
			if(RecapJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRecap();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRecap(false);
			
			//SI ES MANUAL
			if(RecapJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRecap();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRecap(false);
			
			//SI ES MANUAL
			if(RecapJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRecap();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRecap() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRecap.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRecap.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRecap.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRecap.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRecap.setMinimumSize(dimensionMinimum);
		this.jTableDatosRecap.setMaximumSize(dimensionMaximum);
		this.jTableDatosRecap.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRecap(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRecap(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRecap(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRecap(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRecap(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.recapSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRecap(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRecap(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRecap(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RecapJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RecapJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRecap() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRecap();
		
		this.inicializarActualizarBindingBotonesManualRecap(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.recapSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRecap();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRecap() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRecap(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRecap(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRecap.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRecap.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRecap.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRecap!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRecap.jCheckBoxPostAccionNuevoRecap.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRecap.jCheckBoxPostAccionSinCerrarRecap.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRecap.jCheckBoxPostAccionSinMensajeRecap.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRecap.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRecap.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRecap.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRecap!=null) {
				this.jInternalFrameDetalleFormRecap.jCheckBoxPostAccionNuevoRecap.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRecap.jCheckBoxPostAccionSinCerrarRecap.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRecap.jCheckBoxPostAccionSinMensajeRecap.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRecap.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRecap.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRecap!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRecap.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRecap!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRecap.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRecap.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRecap.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRecap.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRecap.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRecap!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRecap.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRecap.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRecap.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRecap(Boolean esInicializar) throws Exception {
		try	{	
			if(RecapJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRecap(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRecap() throws Exception {
		try	{
			if(RecapJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRecap();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRecap() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRecap() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRecap.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRecap.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRecap.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRecap.addItem(reporte);
			}
			
			
			if(!this.recapSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRecap.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRecap.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRecap.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRecap.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRecap.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRecap.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRecap();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRecap() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRecap!=null) {
				this.jInternalFrameReporteDinamicoRecap.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRecap.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRecap!=null) {
				this.jInternalFrameReporteDinamicoRecap.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRecap.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRecap!=null) {
				
				if(this.jInternalFrameReporteDinamicoRecap.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRecap.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRecap.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRecap.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRecap.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRecap.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoRecap.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRecap.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=RecapConstantesFunciones.getTiposSeleccionarRecap(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRecap.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoRecap.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoRecap.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=RecapConstantesFunciones.getTiposSeleccionarRecap(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRecap.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoRecap.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRecap.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=RecapConstantesFunciones.getTiposSeleccionarRecap(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRecap.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoRecap.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoRecap.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoRecap.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRecap()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRecap(Boolean esInicializar) throws Exception {				
		if(RecapJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRecap();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRecap() throws Exception {
		this.inicializarActualizarBindingTablaRecap(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRecap() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRecap.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRecap.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRecap.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRecap.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRecap.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRecapOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecapOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRecap.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRecap.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRecap.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRecap(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=recapLogic.getRecaps().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=recaps.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRecap.setModel(new RecapModel(this.recapLogic.getRecaps(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRecap.setModel(new RecapModel(this.recaps,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRecap!=null && this.jInternalFrameOrderByRecap.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRecap();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RecapConstantesFunciones.SCLASSWEBTITULO,recapConstantesFunciones.resaltarSeleccionarRecap,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RecapConstantesFunciones.SCLASSWEBTITULO,recapConstantesFunciones.resaltarSeleccionarRecap,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_ID));

		if(this.recapConstantesFunciones.mostraridRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.recapConstantesFunciones.resaltaridRecap,this.recapConstantesFunciones.activaridRecap,iSizeTabla,this,true,"idRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recapConstantesFunciones.resaltaridRecap,this.recapConstantesFunciones.activaridRecap,this,true,"idRecap","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_IDEMPRESA));

		if(this.recapConstantesFunciones.mostrarid_empresaRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.recapConstantesFunciones.resaltarid_empresaRecap,this,this.recapConstantesFunciones.activarid_empresaRecap,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.recapConstantesFunciones.resaltarid_empresaRecap,this,this.recapConstantesFunciones.activarid_empresaRecap,false,"id_empresaRecap","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.recapConstantesFunciones.mostrarid_sucursalRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.recapConstantesFunciones.resaltarid_sucursalRecap,this,this.recapConstantesFunciones.activarid_sucursalRecap,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.recapConstantesFunciones.resaltarid_sucursalRecap,this,this.recapConstantesFunciones.activarid_sucursalRecap,false,"id_sucursalRecap","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.recapConstantesFunciones.mostrarid_ejercicioRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.recapConstantesFunciones.resaltarid_ejercicioRecap,this,this.recapConstantesFunciones.activarid_ejercicioRecap,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.recapConstantesFunciones.resaltarid_ejercicioRecap,this,this.recapConstantesFunciones.activarid_ejercicioRecap,false,"id_ejercicioRecap","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_NUMERO));

		if(this.recapConstantesFunciones.mostrarnumeroRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.recapConstantesFunciones.resaltarnumeroRecap,this.recapConstantesFunciones.activarnumeroRecap,iSizeTabla,this,true,"numeroRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recapConstantesFunciones.resaltarnumeroRecap,this.recapConstantesFunciones.activarnumeroRecap,this,true,"numeroRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION));

		if(this.recapConstantesFunciones.mostrarnumero_autorizacionRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.recapConstantesFunciones.resaltarnumero_autorizacionRecap,this.recapConstantesFunciones.activarnumero_autorizacionRecap,iSizeTabla,this,true,"numero_autorizacionRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recapConstantesFunciones.resaltarnumero_autorizacionRecap,this.recapConstantesFunciones.activarnumero_autorizacionRecap,this,true,"numero_autorizacionRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_FECHAINICIO));

		if(this.recapConstantesFunciones.mostrarfecha_inicioRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.recapConstantesFunciones.resaltarfecha_inicioRecap,this.recapConstantesFunciones.activarfecha_inicioRecap,iSizeTabla,this,true,"fecha_inicioRecap","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.recapConstantesFunciones.resaltarfecha_inicioRecap,this.recapConstantesFunciones.activarfecha_inicioRecap,this,true,"fecha_inicioRecap","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_FECHAFINAL));

		if(this.recapConstantesFunciones.mostrarfecha_finalRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_FECHAFINAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.recapConstantesFunciones.resaltarfecha_finalRecap,this.recapConstantesFunciones.activarfecha_finalRecap,iSizeTabla,this,true,"fecha_finalRecap","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.recapConstantesFunciones.resaltarfecha_finalRecap,this.recapConstantesFunciones.activarfecha_finalRecap,this,true,"fecha_finalRecap","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_FECHAELABORACION));

		if(this.recapConstantesFunciones.mostrarfecha_elaboracionRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_FECHAELABORACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.recapConstantesFunciones.resaltarfecha_elaboracionRecap,this.recapConstantesFunciones.activarfecha_elaboracionRecap,iSizeTabla,this,true,"fecha_elaboracionRecap","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.recapConstantesFunciones.resaltarfecha_elaboracionRecap,this.recapConstantesFunciones.activarfecha_elaboracionRecap,this,true,"fecha_elaboracionRecap","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_FECHACADUCIDAD));

		if(this.recapConstantesFunciones.mostrarfecha_caducidadRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_FECHACADUCIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.recapConstantesFunciones.resaltarfecha_caducidadRecap,this.recapConstantesFunciones.activarfecha_caducidadRecap,iSizeTabla,this,true,"fecha_caducidadRecap","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.recapConstantesFunciones.resaltarfecha_caducidadRecap,this.recapConstantesFunciones.activarfecha_caducidadRecap,this,true,"fecha_caducidadRecap","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_MONTOIVA));

		if(this.recapConstantesFunciones.mostrarmonto_ivaRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_MONTOIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.recapConstantesFunciones.resaltarmonto_ivaRecap,this.recapConstantesFunciones.activarmonto_ivaRecap,iSizeTabla,this,true,"monto_ivaRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recapConstantesFunciones.resaltarmonto_ivaRecap,this.recapConstantesFunciones.activarmonto_ivaRecap,this,true,"monto_ivaRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_SINMONTOIVA));

		if(this.recapConstantesFunciones.mostrarsin_monto_ivaRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_SINMONTOIVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.recapConstantesFunciones.resaltarsin_monto_ivaRecap,this.recapConstantesFunciones.activarsin_monto_ivaRecap,iSizeTabla,this,true,"sin_monto_ivaRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recapConstantesFunciones.resaltarsin_monto_ivaRecap,this.recapConstantesFunciones.activarsin_monto_ivaRecap,this,true,"sin_monto_ivaRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_IVA));

		if(this.recapConstantesFunciones.mostrarivaRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.recapConstantesFunciones.resaltarivaRecap,this.recapConstantesFunciones.activarivaRecap,iSizeTabla,this,true,"ivaRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recapConstantesFunciones.resaltarivaRecap,this.recapConstantesFunciones.activarivaRecap,this,true,"ivaRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_OTROIMPUESTO));

		if(this.recapConstantesFunciones.mostrarotro_impuestoRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_OTROIMPUESTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.recapConstantesFunciones.resaltarotro_impuestoRecap,this.recapConstantesFunciones.activarotro_impuestoRecap,iSizeTabla,this,true,"otro_impuestoRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recapConstantesFunciones.resaltarotro_impuestoRecap,this.recapConstantesFunciones.activarotro_impuestoRecap,this,true,"otro_impuestoRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_VALORPROPUESTO));

		if(this.recapConstantesFunciones.mostrarvalor_propuestoRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_VALORPROPUESTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.recapConstantesFunciones.resaltarvalor_propuestoRecap,this.recapConstantesFunciones.activarvalor_propuestoRecap,iSizeTabla,this,true,"valor_propuestoRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recapConstantesFunciones.resaltarvalor_propuestoRecap,this.recapConstantesFunciones.activarvalor_propuestoRecap,this,true,"valor_propuestoRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_SUBTOTAL));

		if(this.recapConstantesFunciones.mostrarsubtotalRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_SUBTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.recapConstantesFunciones.resaltarsubtotalRecap,this.recapConstantesFunciones.activarsubtotalRecap,iSizeTabla,this,true,"subtotalRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recapConstantesFunciones.resaltarsubtotalRecap,this.recapConstantesFunciones.activarsubtotalRecap,this,true,"subtotalRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_FINANCIERO));

		if(this.recapConstantesFunciones.mostrarfinancieroRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_FINANCIERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.recapConstantesFunciones.resaltarfinancieroRecap,this.recapConstantesFunciones.activarfinancieroRecap,iSizeTabla,this,true,"financieroRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recapConstantesFunciones.resaltarfinancieroRecap,this.recapConstantesFunciones.activarfinancieroRecap,this,true,"financieroRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_TOTAL));

		if(this.recapConstantesFunciones.mostrartotalRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.recapConstantesFunciones.resaltartotalRecap,this.recapConstantesFunciones.activartotalRecap,iSizeTabla,this,true,"totalRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recapConstantesFunciones.resaltartotalRecap,this.recapConstantesFunciones.activartotalRecap,this,true,"totalRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRecap,RecapConstantesFunciones.LABEL_VALORCAMBIO));

		if(this.recapConstantesFunciones.mostrarvalor_cambioRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RecapConstantesFunciones.LABEL_VALORCAMBIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.recapConstantesFunciones.resaltarvalor_cambioRecap,this.recapConstantesFunciones.activarvalor_cambioRecap,iSizeTabla,this,true,"valor_cambioRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.recapConstantesFunciones.resaltarvalor_cambioRecap,this.recapConstantesFunciones.activarvalor_cambioRecap,this,true,"valor_cambioRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.recapSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleRecap && this.recapConstantesFunciones.mostrarDetalleRecapRecap && !RecapConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Recapes");
				tableColumn.setHeaderValue("Detalle Recapes");
				tableColumn.setCellRenderer(new DetalleRecapTableCell(recapConstantesFunciones.resaltarDetalleRecapRecap,this,this.recapConstantesFunciones.activarDetalleRecapRecap));
				tableColumn.setCellEditor(new DetalleRecapTableCell(recapConstantesFunciones.resaltarDetalleRecapRecap,this,this.recapConstantesFunciones.activarDetalleRecapRecap));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosRecap.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.recapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.recapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRecap.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.recapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.recapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRecap.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRecap && this.isPermisoGuardarCambiosRecap) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.recapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.recapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRecap.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.recapSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosRecap.addColumn(tableColumn);
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
			
			this.jTableDatosRecap.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRecap && this.isPermisoGuardarCambiosRecap) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.recapSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRecap && this.isPermisoGuardarCambiosRecap) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRecap.moveColumn(this.jTableDatosRecap.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRecap.moveColumn(this.jTableDatosRecap.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.recapSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosRecap.moveColumn(this.jTableDatosRecap.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRecap.moveColumn(this.jTableDatosRecap.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRecap.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRecap.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRecap,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRecap.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRecap.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRecap.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRecap.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRecap.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=recapLogic.getRecaps().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=recaps.size()-1;
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
		//this.jTableDatosRecap.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRecap();
			
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
				
				//this.isEsNuevoRecap=false;
					
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			
				if(this.recapSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRecap==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRecap.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRecap.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.recap.getsType().equals("DUPLICADO")
				   || this.recap.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRecap=true;
				
				} else {
					this.isEsNuevoRecap=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.recapSessionBean.getEsGuardarRelacionado()) {
					if(this.recap.getId()>=0 && !this.recap.getIsNew()) {						
						this.isEsNuevoRecap=false;
						
					} else {
						this.isEsNuevoRecap=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRecap(esRelaciones);						
				
				this.seleccionarRecap(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.recap.getId()<0) {
					this.isEsNuevoRecap=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRecap(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRecap(evt,rowIndex);
				}	
				
				if(this.recapSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Recap: " + this.dDif); 
					}
				}								
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRecap(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.recap)) {
					if(this.recap.getId()>0) {
						this.recap.setIsDeleted(true);
						
						this.recapsEliminados.add(this.recap);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.recapLogic.getRecaps().remove(this.recap);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.recaps.remove(this.recap);				
					}
					
					
					((RecapModel) this.jTableDatosRecap.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRecap(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRecap(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRecap) {
			
			if(this.jInternalFrameDetalleFormRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRecap.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRecap.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRecap(this.recap);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.recapConstantesFunciones.cargarid_empresaRecap || this.recapConstantesFunciones.event_dependid_empresaRecap) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.recap.getid_empresa());
									//this.inicializarActualizarBindingRecap(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(recap.getEmpresa()!=null) {
							this.empresasForeignKey.add(recap.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.recap.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.recapConstantesFunciones.cargarid_sucursalRecap || this.recapConstantesFunciones.event_dependid_sucursalRecap) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.recap.getid_sucursal());
									//this.inicializarActualizarBindingRecap(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(recap.getSucursal()!=null) {
							this.sucursalsForeignKey.add(recap.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.recap.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.recapConstantesFunciones.cargarid_ejercicioRecap || this.recapConstantesFunciones.event_dependid_ejercicioRecap) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.recap.getid_ejercicio());
									//this.inicializarActualizarBindingRecap(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(recap.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(recap.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.recap.getid_ejercicio(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRecap("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRecap(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRecap() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRecap(Recap recap) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRecap(recap,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRecap(Recap recap,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRecap(recap);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRecap(recap,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRecap(recap);
	}
	
	public void setVariablesObjetoActualToFormularioRecap(Recap recap) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRecap.jLabelidRecap.setText(recap.getId().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldnumeroRecap.setText(recap.getnumero());
			this.jInternalFrameDetalleFormRecap.jTextFieldnumero_autorizacionRecap.setText(recap.getnumero_autorizacion());
			this.jInternalFrameDetalleFormRecap.jDateChooserfecha_inicioRecap.setDate(recap.getfecha_inicio());
			this.jInternalFrameDetalleFormRecap.jDateChooserfecha_finalRecap.setDate(recap.getfecha_final());
			this.jInternalFrameDetalleFormRecap.jDateChooserfecha_elaboracionRecap.setDate(recap.getfecha_elaboracion());
			this.jInternalFrameDetalleFormRecap.jDateChooserfecha_caducidadRecap.setDate(recap.getfecha_caducidad());
			this.jInternalFrameDetalleFormRecap.jTextFieldmonto_ivaRecap.setText(recap.getmonto_iva().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldsin_monto_ivaRecap.setText(recap.getsin_monto_iva().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldivaRecap.setText(recap.getiva().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldotro_impuestoRecap.setText(recap.getotro_impuesto().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldvalor_propuestoRecap.setText(recap.getvalor_propuesto().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldsubtotalRecap.setText(recap.getsubtotal().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldfinancieroRecap.setText(recap.getfinanciero().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldtotalRecap.setText(recap.gettotal().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldvalor_cambioRecap.setText(recap.getvalor_cambio().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Recap recapLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,recapLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Recap recapLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				recapLocal=this.recap;
			} else {
				recapLocal=this.recapAnterior;
			}
		}
		
		if(this.permiteMantenimiento(recapLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRecap(recapLocal,true);
					
					if(recapSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(recapLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.recapSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(recapLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRecap(Recap recap,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRecap(recap,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRecap(recap);
	}
	
	public void setVariablesFormularioToObjetoActualRecap(Recap recap,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRecap(recap,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRecap(Recap recap,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRecap.jLabelidRecap.getText()==null || this.jInternalFrameDetalleFormRecap.jLabelidRecap.getText()=="" || this.jInternalFrameDetalleFormRecap.jLabelidRecap.getText()=="Id") {
				this.jInternalFrameDetalleFormRecap.jLabelidRecap.setText("0");
			}

			if(conColumnasBase) {recap.setId(Long.parseLong(this.jInternalFrameDetalleFormRecap.jLabelidRecap.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelIdRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.setnumero(this.jInternalFrameDetalleFormRecap.jTextFieldnumeroRecap.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelnumeroRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.setnumero_autorizacion(this.jInternalFrameDetalleFormRecap.jTextFieldnumero_autorizacionRecap.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelnumero_autorizacionRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.setfecha_inicio(this.jInternalFrameDetalleFormRecap.jDateChooserfecha_inicioRecap.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelfecha_inicioRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.setfecha_final(this.jInternalFrameDetalleFormRecap.jDateChooserfecha_finalRecap.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_FECHAFINAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelfecha_finalRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.setfecha_elaboracion(this.jInternalFrameDetalleFormRecap.jDateChooserfecha_elaboracionRecap.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_FECHAELABORACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelfecha_elaboracionRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.setfecha_caducidad(this.jInternalFrameDetalleFormRecap.jDateChooserfecha_caducidadRecap.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_FECHACADUCIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelfecha_caducidadRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.setmonto_iva(Double.parseDouble(this.jInternalFrameDetalleFormRecap.jTextFieldmonto_ivaRecap.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_MONTOIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelmonto_ivaRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.setsin_monto_iva(Double.parseDouble(this.jInternalFrameDetalleFormRecap.jTextFieldsin_monto_ivaRecap.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_SINMONTOIVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelsin_monto_ivaRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.setiva(Double.parseDouble(this.jInternalFrameDetalleFormRecap.jTextFieldivaRecap.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelivaRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.setotro_impuesto(Double.parseDouble(this.jInternalFrameDetalleFormRecap.jTextFieldotro_impuestoRecap.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_OTROIMPUESTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelotro_impuestoRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.setvalor_propuesto(Double.parseDouble(this.jInternalFrameDetalleFormRecap.jTextFieldvalor_propuestoRecap.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_VALORPROPUESTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelvalor_propuestoRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.setsubtotal(Double.parseDouble(this.jInternalFrameDetalleFormRecap.jTextFieldsubtotalRecap.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_SUBTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelsubtotalRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.setfinanciero(Double.parseDouble(this.jInternalFrameDetalleFormRecap.jTextFieldfinancieroRecap.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_FINANCIERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelfinancieroRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.settotal(Double.parseDouble(this.jInternalFrameDetalleFormRecap.jTextFieldtotalRecap.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabeltotalRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			recap.setvalor_cambio(Double.parseDouble(this.jInternalFrameDetalleFormRecap.jTextFieldvalor_cambioRecap.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RecapConstantesFunciones.LABEL_VALORCAMBIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRecap.jLabelvalor_cambioRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRecap(Recap recapBean,Recap recap,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRecap(Recap recapOrigen,Recap recap,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && recapOrigen.getId()!=null && !recapOrigen.getId().equals(0L))) {recap.setId(recapOrigen.getId());}}
			if(conDefault || (!conDefault && recapOrigen.getnumero()!=null && !recapOrigen.getnumero().equals(""))) {recap.setnumero(recapOrigen.getnumero());}
			if(conDefault || (!conDefault && recapOrigen.getnumero_autorizacion()!=null && !recapOrigen.getnumero_autorizacion().equals(""))) {recap.setnumero_autorizacion(recapOrigen.getnumero_autorizacion());}
			if(conDefault || (!conDefault && recapOrigen.getfecha_inicio()!=null && !recapOrigen.getfecha_inicio().equals(new Date()))) {recap.setfecha_inicio(recapOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && recapOrigen.getfecha_final()!=null && !recapOrigen.getfecha_final().equals(new Date()))) {recap.setfecha_final(recapOrigen.getfecha_final());}
			if(conDefault || (!conDefault && recapOrigen.getfecha_elaboracion()!=null && !recapOrigen.getfecha_elaboracion().equals(new Date()))) {recap.setfecha_elaboracion(recapOrigen.getfecha_elaboracion());}
			if(conDefault || (!conDefault && recapOrigen.getfecha_caducidad()!=null && !recapOrigen.getfecha_caducidad().equals(new Date()))) {recap.setfecha_caducidad(recapOrigen.getfecha_caducidad());}
			if(conDefault || (!conDefault && recapOrigen.getmonto_iva()!=null && !recapOrigen.getmonto_iva().equals(0.0))) {recap.setmonto_iva(recapOrigen.getmonto_iva());}
			if(conDefault || (!conDefault && recapOrigen.getsin_monto_iva()!=null && !recapOrigen.getsin_monto_iva().equals(0.0))) {recap.setsin_monto_iva(recapOrigen.getsin_monto_iva());}
			if(conDefault || (!conDefault && recapOrigen.getiva()!=null && !recapOrigen.getiva().equals(0.0))) {recap.setiva(recapOrigen.getiva());}
			if(conDefault || (!conDefault && recapOrigen.getotro_impuesto()!=null && !recapOrigen.getotro_impuesto().equals(0.0))) {recap.setotro_impuesto(recapOrigen.getotro_impuesto());}
			if(conDefault || (!conDefault && recapOrigen.getvalor_propuesto()!=null && !recapOrigen.getvalor_propuesto().equals(0.0))) {recap.setvalor_propuesto(recapOrigen.getvalor_propuesto());}
			if(conDefault || (!conDefault && recapOrigen.getsubtotal()!=null && !recapOrigen.getsubtotal().equals(0.0))) {recap.setsubtotal(recapOrigen.getsubtotal());}
			if(conDefault || (!conDefault && recapOrigen.getfinanciero()!=null && !recapOrigen.getfinanciero().equals(0.0))) {recap.setfinanciero(recapOrigen.getfinanciero());}
			if(conDefault || (!conDefault && recapOrigen.gettotal()!=null && !recapOrigen.gettotal().equals(0.0))) {recap.settotal(recapOrigen.gettotal());}
			if(conDefault || (!conDefault && recapOrigen.getvalor_cambio()!=null && !recapOrigen.getvalor_cambio().equals(0.0))) {recap.setvalor_cambio(recapOrigen.getvalor_cambio());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRecap(Recap recap) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRecap.jLabelidRecap.setText(recap.getId().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldnumeroRecap.setText(recap.getnumero());
			this.jInternalFrameDetalleFormRecap.jTextFieldnumero_autorizacionRecap.setText(recap.getnumero_autorizacion());
			this.jInternalFrameDetalleFormRecap.jDateChooserfecha_inicioRecap.setDate(recap.getfecha_inicio());
			this.jInternalFrameDetalleFormRecap.jDateChooserfecha_finalRecap.setDate(recap.getfecha_final());
			this.jInternalFrameDetalleFormRecap.jDateChooserfecha_elaboracionRecap.setDate(recap.getfecha_elaboracion());
			this.jInternalFrameDetalleFormRecap.jDateChooserfecha_caducidadRecap.setDate(recap.getfecha_caducidad());
			this.jInternalFrameDetalleFormRecap.jTextFieldmonto_ivaRecap.setText(recap.getmonto_iva().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldsin_monto_ivaRecap.setText(recap.getsin_monto_iva().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldivaRecap.setText(recap.getiva().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldotro_impuestoRecap.setText(recap.getotro_impuesto().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldvalor_propuestoRecap.setText(recap.getvalor_propuesto().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldsubtotalRecap.setText(recap.getsubtotal().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldfinancieroRecap.setText(recap.getfinanciero().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldtotalRecap.setText(recap.gettotal().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldvalor_cambioRecap.setText(recap.getvalor_cambio().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRecap(RecapBean recapBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRecap.jLabelidRecap.setText(recapBean.getId().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldnumeroRecap.setText(recapBean.getnumero());
			this.jInternalFrameDetalleFormRecap.jTextFieldnumero_autorizacionRecap.setText(recapBean.getnumero_autorizacion());
			this.jInternalFrameDetalleFormRecap.jDateChooserfecha_inicioRecap.setDate(recapBean.getfecha_inicio());
			this.jInternalFrameDetalleFormRecap.jDateChooserfecha_finalRecap.setDate(recapBean.getfecha_final());
			this.jInternalFrameDetalleFormRecap.jDateChooserfecha_elaboracionRecap.setDate(recapBean.getfecha_elaboracion());
			this.jInternalFrameDetalleFormRecap.jDateChooserfecha_caducidadRecap.setDate(recapBean.getfecha_caducidad());
			this.jInternalFrameDetalleFormRecap.jTextFieldmonto_ivaRecap.setText(recapBean.getmonto_iva().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldsin_monto_ivaRecap.setText(recapBean.getsin_monto_iva().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldivaRecap.setText(recapBean.getiva().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldotro_impuestoRecap.setText(recapBean.getotro_impuesto().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldvalor_propuestoRecap.setText(recapBean.getvalor_propuesto().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldsubtotalRecap.setText(recapBean.getsubtotal().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldfinancieroRecap.setText(recapBean.getfinanciero().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldtotalRecap.setText(recapBean.gettotal().toString());
			this.jInternalFrameDetalleFormRecap.jTextFieldvalor_cambioRecap.setText(recapBean.getvalor_cambio().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRecap(RecapParameterReturnGeneral recapReturnGeneral,RecapBean recapBean,Boolean conDefault) throws Exception { 
		try {
			Recap recapLocal=new Recap();
			
			recapLocal=recapReturnGeneral.getRecap();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && recapLocal.getId()!=null && !recapLocal.getId().equals(0L))) {recapBean.setId(recapLocal.getId());}}
			if(conDefault || (!conDefault && recapLocal.getnumero()!=null && !recapLocal.getnumero().equals(""))) {recapBean.setnumero(recapLocal.getnumero());}
			if(conDefault || (!conDefault && recapLocal.getnumero_autorizacion()!=null && !recapLocal.getnumero_autorizacion().equals(""))) {recapBean.setnumero_autorizacion(recapLocal.getnumero_autorizacion());}
			if(conDefault || (!conDefault && recapLocal.getfecha_inicio()!=null && !recapLocal.getfecha_inicio().equals(new Date()))) {recapBean.setfecha_inicio(recapLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && recapLocal.getfecha_final()!=null && !recapLocal.getfecha_final().equals(new Date()))) {recapBean.setfecha_final(recapLocal.getfecha_final());}
			if(conDefault || (!conDefault && recapLocal.getfecha_elaboracion()!=null && !recapLocal.getfecha_elaboracion().equals(new Date()))) {recapBean.setfecha_elaboracion(recapLocal.getfecha_elaboracion());}
			if(conDefault || (!conDefault && recapLocal.getfecha_caducidad()!=null && !recapLocal.getfecha_caducidad().equals(new Date()))) {recapBean.setfecha_caducidad(recapLocal.getfecha_caducidad());}
			if(conDefault || (!conDefault && recapLocal.getmonto_iva()!=null && !recapLocal.getmonto_iva().equals(0.0))) {recapBean.setmonto_iva(recapLocal.getmonto_iva());}
			if(conDefault || (!conDefault && recapLocal.getsin_monto_iva()!=null && !recapLocal.getsin_monto_iva().equals(0.0))) {recapBean.setsin_monto_iva(recapLocal.getsin_monto_iva());}
			if(conDefault || (!conDefault && recapLocal.getiva()!=null && !recapLocal.getiva().equals(0.0))) {recapBean.setiva(recapLocal.getiva());}
			if(conDefault || (!conDefault && recapLocal.getotro_impuesto()!=null && !recapLocal.getotro_impuesto().equals(0.0))) {recapBean.setotro_impuesto(recapLocal.getotro_impuesto());}
			if(conDefault || (!conDefault && recapLocal.getvalor_propuesto()!=null && !recapLocal.getvalor_propuesto().equals(0.0))) {recapBean.setvalor_propuesto(recapLocal.getvalor_propuesto());}
			if(conDefault || (!conDefault && recapLocal.getsubtotal()!=null && !recapLocal.getsubtotal().equals(0.0))) {recapBean.setsubtotal(recapLocal.getsubtotal());}
			if(conDefault || (!conDefault && recapLocal.getfinanciero()!=null && !recapLocal.getfinanciero().equals(0.0))) {recapBean.setfinanciero(recapLocal.getfinanciero());}
			if(conDefault || (!conDefault && recapLocal.gettotal()!=null && !recapLocal.gettotal().equals(0.0))) {recapBean.settotal(recapLocal.gettotal());}
			if(conDefault || (!conDefault && recapLocal.getvalor_cambio()!=null && !recapLocal.getvalor_cambio().equals(0.0))) {recapBean.setvalor_cambio(recapLocal.getvalor_cambio());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRecapGenerico(Long idRecapSeleccionado,JComboBox jComboBoxRecap,List<Recap> recapsLocal)throws Exception {
		try {
			Recap  recapTemp=null;

			for(Recap recapAux:recapsLocal) {
				if(recapAux.getId()!=null && recapAux.getId().equals(idRecapSeleccionado)) {
					recapTemp=recapAux;
					break;
				}
			}

			jComboBoxRecap.setSelectedItem(recapTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRecapGenerico(JComboBox jComboBoxRecap,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRecap.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRecap.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRecap.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRecap.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleRecap")) {
			jButtonDetalleRecapActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			recap=(Recap) recapLogic.getRecaps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			recap =(Recap) recaps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!recap.getIsNew() && !recap.getIsChanged() && !recap.getIsDeleted()) {
				sDescripcion=recap.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=recap.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!recap.getIsNew() && !recap.getIsChanged() && !recap.getIsDeleted()) {
				sDescripcion=recap.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=recap.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!recap.getIsNew() && !recap.getIsChanged() && !recap.getIsDeleted()) {
				sDescripcion=recap.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=recap.getejercicio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Recap recapRow=new Recap();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			recapRow=(Recap) recapLogic.getRecaps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			recapRow=(Recap) recaps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleRecapActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Recap recap) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormRecap==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap = (Recap)this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.recap = (Recap)this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(recap!=null) {
						this.recap = recap;
					} else {
						this.recap = new Recap();
					}
				}

				if(this.isTienePermisosDetalleRecap && this.permiteMantenimiento(this.recap)) {
					DetalleRecapBeanSwingJInternalFrame detallerecapBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFramePopup=new DetalleRecapBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detallerecapBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFramePopup;
					} else {
						detallerecapBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame;
					}

					List<Recap> recaps=new ArrayList<Recap>();
					recaps.add(this.recap);
					if(!esRelacionado) {
						//detallerecapBeanSwingJInternalFrame.detallerecapSessionBean.setConGuardarRelaciones(false);
						//detallerecapBeanSwingJInternalFrame.detallerecapSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detallerecapBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormRecap.cargarDetalleRecapBeanSwingJInternalFrame(recaps,this.recap,detallerecapBeanSwingJInternalFrame,/*conInicializar,*/detallerecapBeanSwingJInternalFrame.detallerecapSessionBean.getConGuardarRelaciones(),detallerecapBeanSwingJInternalFrame.detallerecapSessionBean.getEsGuardarRelacionado());
					detallerecapBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detallerecapBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleRecap("no_relacionado");

						detallerecapBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleRecapConstantesFunciones.ITAMANIOFILATABLA + (DetalleRecapConstantesFunciones.ITAMANIOFILATABLA/2));

						detallerecapBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderRecap=(TitledBorder)this.jScrollPanelDatosRecap.getBorder();
						TitledBorder titledBorderDetalleRecap=(TitledBorder)detallerecapBeanSwingJInternalFrame.jScrollPanelDatosDetalleRecap.getBorder();

						titledBorderDetalleRecap.setTitle(titledBorderRecap.getTitle() + " -> Detalle Recap");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detallerecapBeanSwingJInternalFrame);
						}

						detallerecapBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detallerecapBeanSwingJInternalFrame);

						detallerecapBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.recapSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Recap",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRecap(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRecap.setVisible((this.isVisibilidadCeldaNuevoRecap && this.isPermisoNuevoRecap));			
			this.jButtonDuplicarRecap.setVisible((this.isVisibilidadCeldaDuplicarRecap && this.isPermisoDuplicarRecap));			
			this.jButtonCopiarRecap.setVisible((this.isVisibilidadCeldaCopiarRecap && this.isPermisoCopiarRecap));
			this.jButtonVerFormRecap.setVisible((this.isVisibilidadCeldaVerFormRecap && this.isPermisoVerFormRecap));
			
			this.jButtonAbrirOrderByRecap.setVisible((this.isVisibilidadCeldaOrdenRecap && this.isPermisoOrdenRecap));			
			
			this.jButtonNuevoRelacionesRecap.setVisible((this.isVisibilidadCeldaNuevoRelacionesRecap && this.isPermisoNuevoRecap));			
			this.jButtonNuevoGuardarCambiosRecap.setVisible((this.isVisibilidadCeldaNuevoRecap && this.isPermisoNuevoRecap && this.isPermisoGuardarCambiosRecap));
			
			if(this.jInternalFrameDetalleFormRecap!=null) {
			this.jInternalFrameDetalleFormRecap.jButtonModificarRecap.setVisible((this.isVisibilidadCeldaModificarRecap && this.isPermisoActualizarRecap));	
			this.jInternalFrameDetalleFormRecap.jButtonActualizarRecap.setVisible((this.isVisibilidadCeldaActualizarRecap && this.isPermisoActualizarRecap));	
			this.jInternalFrameDetalleFormRecap.jButtonEliminarRecap.setVisible((this.isVisibilidadCeldaEliminarRecap && this.isPermisoEliminarRecap));
			this.jInternalFrameDetalleFormRecap.jButtonCancelarRecap.setVisible(this.isVisibilidadCeldaCancelarRecap);							
			this.jInternalFrameDetalleFormRecap.jButtonGuardarCambiosRecap.setVisible((this.isVisibilidadCeldaGuardarRecap && this.isPermisoGuardarCambiosRecap));			
			
			}
						
			this.jButtonGuardarCambiosTablaRecap.setVisible((this.isVisibilidadCeldaGuardarCambiosRecap && this.isPermisoGuardarCambiosRecap));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRecap.setVisible((this.isVisibilidadCeldaNuevoRecap && this.isPermisoNuevoRecap));						
			this.jButtonDuplicarToolBarRecap.setVisible((this.isVisibilidadCeldaDuplicarRecap && this.isPermisoDuplicarRecap));						
			this.jButtonCopiarToolBarRecap.setVisible((this.isVisibilidadCeldaCopiarRecap && this.isPermisoCopiarRecap));			
			this.jButtonVerFormToolBarRecap.setVisible((this.isVisibilidadCeldaVerFormRecap && this.isPermisoVerFormRecap));			
			this.jButtonAbrirOrderByToolBarRecap.setVisible((this.isVisibilidadCeldaOrdenRecap && this.isPermisoOrdenRecap));
			this.jButtonNuevoRelacionesToolBarRecap.setVisible((this.isVisibilidadCeldaNuevoRelacionesRecap && this.isPermisoNuevoRecap));			
			this.jButtonNuevoGuardarCambiosToolBarRecap.setVisible((this.isVisibilidadCeldaNuevoRecap && this.isPermisoNuevoRecap && this.isPermisoGuardarCambiosRecap));			
			
			if(this.jInternalFrameDetalleFormRecap!=null) {
			this.jInternalFrameDetalleFormRecap.jButtonModificarToolBarRecap.setVisible((this.isVisibilidadCeldaModificarRecap && this.isPermisoActualizarRecap));	
			this.jInternalFrameDetalleFormRecap.jButtonActualizarToolBarRecap.setVisible((this.isVisibilidadCeldaActualizarRecap  && this.isPermisoActualizarRecap));	
			this.jInternalFrameDetalleFormRecap.jButtonEliminarToolBarRecap.setVisible((this.isVisibilidadCeldaEliminarRecap && this.isPermisoEliminarRecap));
			this.jInternalFrameDetalleFormRecap.jButtonCancelarToolBarRecap.setVisible(this.isVisibilidadCeldaCancelarRecap);				
			this.jInternalFrameDetalleFormRecap.jButtonGuardarCambiosToolBarRecap.setVisible((this.isVisibilidadCeldaGuardarRecap && this.isPermisoGuardarCambiosRecap));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRecap.setVisible((this.isVisibilidadCeldaGuardarCambiosRecap && this.isPermisoGuardarCambiosRecap));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRecap.setVisible((this.isVisibilidadCeldaNuevoRecap && this.isPermisoNuevoRecap));			
			this.jMenuItemDuplicarRecap.setVisible((this.isVisibilidadCeldaDuplicarRecap && this.isPermisoDuplicarRecap));			
			this.jMenuItemCopiarRecap.setVisible((this.isVisibilidadCeldaCopiarRecap && this.isPermisoCopiarRecap));			
			this.jMenuItemVerFormRecap.setVisible((this.isVisibilidadCeldaVerFormRecap && this.isPermisoVerFormRecap));			
			this.jMenuItemAbrirOrderByRecap.setVisible((this.isVisibilidadCeldaOrdenRecap && this.isPermisoOrdenRecap));			
			//this.jMenuItemMostrarOcultarRecap.setVisible((this.isVisibilidadCeldaOrdenRecap && this.isPermisoOrdenRecap));
			this.jMenuItemDetalleAbrirOrderByRecap.setVisible((this.isVisibilidadCeldaOrdenRecap && this.isPermisoOrdenRecap));			
			//this.jMenuItemDetalleMostrarOcultarRecap.setVisible((this.isVisibilidadCeldaOrdenRecap && this.isPermisoOrdenRecap));			
			this.jMenuItemNuevoRelacionesRecap.setVisible((this.isVisibilidadCeldaNuevoRelacionesRecap && this.isPermisoNuevoRecap));			
			this.jMenuItemNuevoGuardarCambiosRecap.setVisible((this.isVisibilidadCeldaNuevoRecap && this.isPermisoNuevoRecap && this.isPermisoGuardarCambiosRecap));									
			
			if(this.jInternalFrameDetalleFormRecap!=null) {
			this.jInternalFrameDetalleFormRecap.jMenuItemModificarRecap.setVisible((this.isVisibilidadCeldaModificarRecap && this.isPermisoActualizarRecap));	
			this.jInternalFrameDetalleFormRecap.jMenuItemActualizarRecap.setVisible((this.isVisibilidadCeldaActualizarRecap && this.isPermisoActualizarRecap));	
			this.jInternalFrameDetalleFormRecap.jMenuItemEliminarRecap.setVisible((this.isVisibilidadCeldaEliminarRecap && this.isPermisoEliminarRecap));
			this.jInternalFrameDetalleFormRecap.jMenuItemCancelarRecap.setVisible(this.isVisibilidadCeldaCancelarRecap);				
			}
			
			this.jMenuItemGuardarCambiosRecap.setVisible((this.isVisibilidadCeldaGuardarRecap && this.isPermisoGuardarCambiosRecap));						
			this.jMenuItemGuardarCambiosTablaRecap.setVisible((this.isVisibilidadCeldaGuardarCambiosRecap && this.isPermisoGuardarCambiosRecap));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRecap=this.jButtonNuevoRecap.isVisible();
			this.isVisibilidadCeldaDuplicarRecap=this.jButtonDuplicarRecap.isVisible();
			this.isVisibilidadCeldaCopiarRecap=this.jButtonCopiarRecap.isVisible();
			this.isVisibilidadCeldaVerFormRecap=this.jButtonVerFormRecap.isVisible();
			
			this.isVisibilidadCeldaOrdenRecap=this.jButtonAbrirOrderByRecap.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRecap=this.jButtonNuevoRelacionesRecap.isVisible();
			this.isVisibilidadCeldaModificarRecap=this.jButtonModificarRecap.isVisible();
			
			if(this.jInternalFrameDetalleFormRecap!=null) {
			this.isVisibilidadCeldaActualizarRecap=this.jInternalFrameDetalleFormRecap.jButtonActualizarRecap.isVisible();
			this.isVisibilidadCeldaEliminarRecap=this.jInternalFrameDetalleFormRecap.jButtonEliminarRecap.isVisible();
			this.isVisibilidadCeldaCancelarRecap=this.jInternalFrameDetalleFormRecap.jButtonCancelarRecap.isVisible();
			this.isVisibilidadCeldaGuardarRecap=this.jInternalFrameDetalleFormRecap.jButtonGuardarCambiosRecap.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRecap=this.jButtonGuardarCambiosTablaRecap.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRecap=this.jButtonNuevoToolBarRecap.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRecap=this.jButtonNuevoRelacionesToolBarRecap.isVisible();
			
			if(this.jInternalFrameDetalleFormRecap!=null) {
			this.isVisibilidadCeldaModificarRecap=this.jInternalFrameDetalleFormRecap.jButtonModificarToolBarRecap.isVisible();
			this.isVisibilidadCeldaActualizarRecap=this.jInternalFrameDetalleFormRecap.jButtonActualizarToolBarRecap.isVisible();
			this.isVisibilidadCeldaEliminarRecap=this.jInternalFrameDetalleFormRecap.jButtonEliminarToolBarRecap.isVisible();
			this.isVisibilidadCeldaCancelarRecap=this.jInternalFrameDetalleFormRecap.jButtonCancelarToolBarRecap.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRecap=this.jButtonGuardarCambiosToolBarRecap.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRecap=this.jButtonGuardarCambiosTablaToolBarRecap.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRecap=this.jMenuItemNuevoRecap.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRecap=this.jMenuItemNuevoRelacionesRecap.isVisible();
			
			if(this.jInternalFrameDetalleFormRecap!=null) {
			this.isVisibilidadCeldaModificarRecap=this.jInternalFrameDetalleFormRecap.jMenuItemModificarRecap.isVisible();
			this.isVisibilidadCeldaActualizarRecap=this.jInternalFrameDetalleFormRecap.jMenuItemActualizarRecap.isVisible();
			this.isVisibilidadCeldaEliminarRecap=this.jInternalFrameDetalleFormRecap.jMenuItemEliminarRecap.isVisible();
			this.isVisibilidadCeldaCancelarRecap=this.jInternalFrameDetalleFormRecap.jMenuItemCancelarRecap.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRecap=this.jMenuItemGuardarCambiosRecap.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRecap=this.jMenuItemGuardarCambiosTablaRecap.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRecap(Boolean esInicializar) {
		if(RecapJInternalFrame.ISBINDING_MANUAL) {			
			if(this.recapSessionBean.getConGuardarRelaciones()) {
				//if(this.recapSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRecap();
			}
			
			this.inicializarActualizarBindingBotonesManualRecap(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRecap() {
		this.jButtonNuevoRecap.setVisible(this.isPermisoNuevoRecap);			
		this.jButtonDuplicarRecap.setVisible(this.isPermisoDuplicarRecap);			
		this.jButtonCopiarRecap.setVisible(this.isPermisoCopiarRecap);			
		this.jButtonVerFormRecap.setVisible(this.isPermisoVerFormRecap);			
		
		this.jButtonAbrirOrderByRecap.setVisible(this.isPermisoOrdenRecap);					
		
		this.jButtonNuevoRelacionesRecap.setVisible(this.isPermisoNuevoRecap);			
		
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecap.jButtonModificarRecap.setVisible(this.isPermisoActualizarRecap);	
			this.jInternalFrameDetalleFormRecap.jButtonActualizarRecap.setVisible(this.isPermisoActualizarRecap);	
			this.jInternalFrameDetalleFormRecap.jButtonEliminarRecap.setVisible(this.isPermisoEliminarRecap);
			this.jInternalFrameDetalleFormRecap.jButtonCancelarRecap.setVisible(this.isVisibilidadCeldaCancelarRecap);						
			this.jInternalFrameDetalleFormRecap.jButtonGuardarCambiosRecap.setVisible(this.isPermisoGuardarCambiosRecap);							
		}
		
		this.jButtonGuardarCambiosTablaRecap.setVisible(this.isPermisoActualizarRecap);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRecap() {
		this.jInternalFrameDetalleFormRecap.jButtonModificarRecap.setVisible(this.isPermisoActualizarRecap);	
		this.jInternalFrameDetalleFormRecap.jButtonActualizarRecap.setVisible(this.isPermisoActualizarRecap);	
		this.jInternalFrameDetalleFormRecap.jButtonEliminarRecap.setVisible(this.isPermisoEliminarRecap);
		this.jInternalFrameDetalleFormRecap.jButtonCancelarRecap.setVisible(this.isVisibilidadCeldaCancelarRecap);							
		this.jInternalFrameDetalleFormRecap.jButtonGuardarCambiosRecap.setVisible((this.isVisibilidadCeldaGuardarRecap && this.isPermisoGuardarCambiosRecap));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRecap() {
		if(RecapJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRecap();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRecap() {
	}
	
	public void jTableDatosRecapListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRecap(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.recap.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRecap(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.recapLogic.getConnexion());

				if(this.recap.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.recap.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRecap=(TitledBorder)this.jScrollPanelDatosRecap.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRecap.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.recap.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebRecap(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.recapLogic.getConnexion());

				if(this.recap.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.recap.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRecap=(TitledBorder)this.jScrollPanelDatosRecap.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderRecap.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.recap.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebRecap(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.recapLogic.getConnexion());

				if(this.recap.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.recap.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRecap=(TitledBorder)this.jScrollPanelDatosRecap.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderRecap.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.recap.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.recap.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_autorizacionRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getnumero_autorizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_autorizacion like '%"+this.recap.getnumero_autorizacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.recap.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finalRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getfecha_final()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_final = '"+Funciones2.getStringPostgresDate(this.recap.getfecha_final())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_elaboracionRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getfecha_elaboracion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_elaboracion = '"+Funciones2.getStringPostgresDate(this.recap.getfecha_elaboracion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_caducidadRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getfecha_caducidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_caducidad = '"+Funciones2.getStringPostgresDate(this.recap.getfecha_caducidad())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_ivaRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getmonto_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_iva = "+this.recap.getmonto_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsin_monto_ivaRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getsin_monto_iva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sin_monto_iva = "+this.recap.getsin_monto_iva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.recap.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonotro_impuestoRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getotro_impuesto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where otro_impuesto = "+this.recap.getotro_impuesto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_propuestoRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getvalor_propuesto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_propuesto = "+this.recap.getvalor_propuesto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsubtotalRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getsubtotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where subtotal = "+this.recap.getsubtotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfinancieroRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getfinanciero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where financiero = "+this.recap.getfinanciero().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.recap.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_cambioRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRecap(this.getrecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.recap==null) {
						this.recap = new Recap();
					}

					this.setVariablesFormularioToObjetoActualRecap(this.recap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);
				}

				if(this.recap.getvalor_cambio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_cambio = "+this.recap.getvalor_cambio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEjercicioRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRecap(false,false);

			this.getRecapsFK_IdEjercicio();

			this.inicializarActualizarBindingRecap(false);

			//if(RecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRecap(false,false);

			this.getRecapsFK_IdEmpresa();

			this.inicializarActualizarBindingRecap(false);

			//if(RecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRecap(false,false);

			this.getRecapsFK_IdSucursal();

			this.inicializarActualizarBindingRecap(false);

			//if(RecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.recapLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRecap() {
		if(this.jInternalFrameDetalleFormRecap!=null) {
		

		if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormRecap!=null) {
			this.jInternalFrameDetalleFormRecap.setVisible(false);	    			
			this.jInternalFrameDetalleFormRecap.dispose();
			this.jInternalFrameDetalleFormRecap=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRecap!=null) {
			this.jInternalFrameReporteDinamicoRecap.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRecap.dispose();
			this.jInternalFrameReporteDinamicoRecap=null;
		}
		
		if(this.jInternalFrameImportacionRecap!=null) {
			this.jInternalFrameImportacionRecap.setVisible(false);	    			
			this.jInternalFrameImportacionRecap.dispose();
			this.jInternalFrameImportacionRecap=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRecap();
			
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			
			
			if(sTipo.equals("NuevoRecap")) {
				jButtonNuevoRecapActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRecap")) {
				jButtonDuplicarRecapActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRecap")) {
				jButtonCopiarRecapActionPerformed(evt);
			} else if(sTipo.equals("VerFormRecap")) {
				jButtonVerFormRecapActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRecap")) {
				jButtonNuevoRecapActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRecap")) {
				jButtonDuplicarRecapActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRecap")) {
				jButtonNuevoRecapActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRecap")) {
				jButtonDuplicarRecapActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRecap")) {
				jButtonNuevoRecapActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRecap")) {
				jButtonNuevoRecapActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRecap")) {
				jButtonNuevoRecapActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRecap")) {
				jButtonModificarRecapActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRecap")) {
				jButtonModificarRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRecap")) {
				jButtonModificarRecapActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRecap")) {
				jButtonActualizarRecapActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRecap")) {
				jButtonActualizarRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRecap")) {
				jButtonActualizarRecapActionPerformed(evt);
			} else if(sTipo.equals("EliminarRecap")) {
				jButtonEliminarRecapActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRecap")) {
				jButtonEliminarRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRecap")) {
				jButtonEliminarRecapActionPerformed(evt);
			} else if(sTipo.equals("CancelarRecap")) {
				jButtonCancelarRecapActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRecap")) {
				jButtonCancelarRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRecap")) {
				jButtonCancelarRecapActionPerformed(evt);
			} else if(sTipo.equals("CerrarRecap")) {
				jButtonCerrarRecapActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRecap")) {
				jButtonCerrarRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRecap")) {
				jButtonCerrarRecapActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRecap")) {
				jButtonMostrarOcultarRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRecap")) {
				jButtonCancelarRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRecap")) {
				jButtonGuardarCambiosRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRecap")) {
				jButtonGuardarCambiosRecapActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRecap")) {
				jButtonCopiarRecapActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRecap")) {
				jButtonVerFormRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRecap")) {
				jButtonGuardarCambiosRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRecap")) {
				jButtonCopiarRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRecap")) {
				jButtonVerFormRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRecap")) {
				jButtonGuardarCambiosRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRecap")) {
				jButtonGuardarCambiosRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRecap")) {
				jButtonGuardarCambiosRecapActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRecap")) {
				jButtonRecargarInformacionRecapActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRecap")) {
				jButtonRecargarInformacionRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRecap")) {
				jButtonRecargarInformacionRecapActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRecap")) {
				jButtonAnterioresRecapActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRecap")) {
				jButtonAnterioresRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRecap")) {
				jButtonAnterioresRecapActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRecap")) {
				jButtonSiguientesRecapActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRecap")) {
				jButtonSiguientesRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRecap")) {
				jButtonSiguientesRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRecap") || sTipo.equals("MenuItemDetalleAbrirOrderByRecap")) {
				jButtonAbrirOrderByRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRecap") || sTipo.equals("MenuItemDetalleMostrarOcultarRecap")) {
				jButtonMostrarOcultarRecapActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRecap")) {
				jButtonNuevoGuardarCambiosRecapActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRecap")) {
				jButtonNuevoGuardarCambiosRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRecap")) {
				jButtonNuevoGuardarCambiosRecapActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRecap")) {
				jButtonCerrarReporteDinamicoRecapActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRecap")) {
				jButtonGenerarReporteDinamicoRecapActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRecap")) {
				
				jButtonGenerarExcelReporteDinamicoRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRecap")) {
				jButtonCerrarImportacionRecapActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRecap")) {
				
				jButtonGenerarImportacionRecapActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRecap")) {
				
				jButtonAbrirImportacionRecapActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRecap")) {
				jComboBoxTiposAccionesRecapActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRecap")) {
				jComboBoxTiposRelacionesRecapActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRecap")) {
				jComboBoxTiposAccionesRecapActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRecap")) {
				
				jComboBoxTiposSeleccionarRecapActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRecap")) {
				jTextFieldValorCampoGeneralRecapActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRecap")) {
				jButtonAbrirOrderByRecapActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRecap")) {
				jButtonAbrirOrderByRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRecap")) {
				jButtonCerrarOrderByRecapActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRecapBusqueda")) {
				this.jButtonidRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRecapUpdate")) {
				this.jButtonid_empresaRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRecapBusqueda")) {
				this.jButtonid_empresaRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalRecapUpdate")) {
				this.jButtonid_sucursalRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalRecapBusqueda")) {
				this.jButtonid_sucursalRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioRecapUpdate")) {
				this.jButtonid_ejercicioRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioRecapBusqueda")) {
				this.jButtonid_ejercicioRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroRecapBusqueda")) {
				this.jButtonnumeroRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorizacionRecapBusqueda")) {
				this.jButtonnumero_autorizacionRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioRecapBusqueda")) {
				this.jButtonfecha_inicioRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finalRecapBusqueda")) {
				this.jButtonfecha_finalRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_elaboracionRecapBusqueda")) {
				this.jButtonfecha_elaboracionRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_caducidadRecapBusqueda")) {
				this.jButtonfecha_caducidadRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_ivaRecapBusqueda")) {
				this.jButtonmonto_ivaRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sin_monto_ivaRecapBusqueda")) {
				this.jButtonsin_monto_ivaRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaRecapBusqueda")) {
				this.jButtonivaRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("otro_impuestoRecapBusqueda")) {
				this.jButtonotro_impuestoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_propuestoRecapBusqueda")) {
				this.jButtonvalor_propuestoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalRecapBusqueda")) {
				this.jButtonsubtotalRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("financieroRecapBusqueda")) {
				this.jButtonfinancieroRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalRecapBusqueda")) {
				this.jButtontotalRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_cambioRecapBusqueda")) {
				this.jButtonvalor_cambioRecapBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRecap();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRecapActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recap);
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
				


				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Recap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Recap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Recap recapLocal=null;
			
			if(!this.getEsControlTabla()) {
				recapLocal=this.recap;
			} else {
				recapLocal=this.recapAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recap);
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
							
				
				


				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Recap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Recap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapAnterior =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recapAnterior =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
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
			
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			
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
			
			


			
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRecapActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recap);
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
								
						
				


				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Recap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Recap.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recap);
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
								
				
				


				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Recap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Recap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapAnterior =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recapAnterior =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recap);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapAnterior =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recapAnterior =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecapActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
			
			this.actualizarInformacion("INFO_PADRE",false,this.recap);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recap);
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
							
				
				


				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Recap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Recap.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRecapActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRecap.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recapAnterior =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.recapAnterior =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
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
			
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			
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
			
			


			
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecapActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
			
			this.actualizarInformacion("INFO_PADRE",false,this.recap);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recap);
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
								
				
				


				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Recap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Recap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapAnterior =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recapAnterior =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecapActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
			
			this.actualizarInformacion("INFO_PADRE",false,this.recap);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRecapActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recap);
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRecap")) {
					jCheckBoxSeleccionarTodosRecapItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRecap")) {
					jCheckBoxSeleccionadosRecapItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRecap")) {
					
				}
				
				


				
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Recap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Recap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.recap);
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
												
				
				


				
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Recap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Recap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRecapActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRecap.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.recapAnterior =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.recapAnterior =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRecapActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recap);
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
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
			
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
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
			
			


			
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRecapActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recap);
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Recap.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Recap.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.recap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.recap);
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
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
				
				


				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Recap.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Recap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.recapAnterior =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.recapAnterior =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRecap")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRecapListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRecap.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.recap =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.recap =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.recap);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRecap")) {
				
				}
				
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRecap")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRecap.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRecap")) {
			
			}
			
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRecap();
			
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			
			if(sTipo.equals("NuevoRecap")) {
				jButtonNuevoRecapActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRecap")) {
				jButtonDuplicarRecapActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRecap")) {
				jButtonCopiarRecapActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRecap")) {
				jButtonVerFormRecapActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRecap")) {
				jButtonNuevoRecapActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRecap")) {
				jButtonModificarRecapActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRecap")) {
				jButtonActualizarRecapActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRecap")) {
				jButtonEliminarRecapActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRecap")) {
				jButtonGuardarCambiosRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRecap")) {
				jButtonCancelarRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRecap")) {
				jButtonCerrarRecapActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRecap")) {
				jButtonGuardarCambiosRecapActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRecap")) {
				jButtonNuevoGuardarCambiosRecapActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRecap")) {
				jButtonAbrirOrderByRecapActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRecap")) {
				jButtonRecargarInformacionRecapActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRecap")) {
				jButtonAnterioresRecapActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRecap")) {
				jButtonSiguientesRecapActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRecapBusqueda")) {
				this.jButtonidRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRecapUpdate")) {
				this.jButtonid_empresaRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRecapBusqueda")) {
				this.jButtonid_empresaRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalRecapUpdate")) {
				this.jButtonid_sucursalRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalRecapBusqueda")) {
				this.jButtonid_sucursalRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioRecapUpdate")) {
				this.jButtonid_ejercicioRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioRecapBusqueda")) {
				this.jButtonid_ejercicioRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroRecapBusqueda")) {
				this.jButtonnumeroRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorizacionRecapBusqueda")) {
				this.jButtonnumero_autorizacionRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioRecapBusqueda")) {
				this.jButtonfecha_inicioRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finalRecapBusqueda")) {
				this.jButtonfecha_finalRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_elaboracionRecapBusqueda")) {
				this.jButtonfecha_elaboracionRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_caducidadRecapBusqueda")) {
				this.jButtonfecha_caducidadRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_ivaRecapBusqueda")) {
				this.jButtonmonto_ivaRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sin_monto_ivaRecapBusqueda")) {
				this.jButtonsin_monto_ivaRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaRecapBusqueda")) {
				this.jButtonivaRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("otro_impuestoRecapBusqueda")) {
				this.jButtonotro_impuestoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_propuestoRecapBusqueda")) {
				this.jButtonvalor_propuestoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalRecapBusqueda")) {
				this.jButtonsubtotalRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("financieroRecapBusqueda")) {
				this.jButtonfinancieroRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalRecapBusqueda")) {
				this.jButtontotalRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_cambioRecapBusqueda")) {
				this.jButtonvalor_cambioRecapBusquedaActionPerformed(evt);
			}
			
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRecap();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRecap")) {
				closingInternalFrameRecap();
				
			} else if(sTipo.equals("jButtonCancelarRecap")) {
				JInternalFrameBase jInternalFrameDetalleFormRecap = (JInternalFrameBase)evt.getSource();
	            	
	            RecapBeanSwingJInternalFrame jInternalFrameParent=(RecapBeanSwingJInternalFrame)jInternalFrameDetalleFormRecap.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRecapActionPerformed(null);
			}
			
			RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.recap,new Object(),this.recapParameterGeneral,this.recapReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRecap(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRecap(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRecap(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.recap)) {
			if(!esControlTabla) {
				if(RecapJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRecap(this.recap,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);			
				}
				
				if(this.recapSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRecap(this.recap,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.recapReturnGeneral=recapLogic.procesarEventosRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.recapLogic.getRecaps(),this.recap,this.recapParameterGeneral,this.isEsNuevoRecap,classes);//this.recapLogic.getRecap()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRecap(this.recapReturnGeneral,this.recapBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.recapSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRecap(classes,this.recapReturnGeneral,this.recapBean,false);
					}
						
					if(this.recapReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRecap(this.recapReturnGeneral.getRecap());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRecap(this.recapReturnGeneral.getRecap());	
					}
						
					if(this.recapReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRecap(this.recapReturnGeneral.getRecap(),classes);//this.recapBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRecap(this.recap,classes);//this.recapBean);									
				}
			
				if(RecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRecap(this.recap,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRecap(this.recap);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.recapAnterior!=null) {
						this.recap=this.recapAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.recapReturnGeneral=recapLogic.procesarEventosRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.recapLogic.getRecaps(),this.recap,this.recapParameterGeneral,this.isEsNuevoRecap,classes);//this.recapLogic.getRecap()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.recapSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.recapSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.recapReturnGeneral.getRecap(),recapLogic.getRecaps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.recapReturnGeneral.getRecap(),this.recaps);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRecap.repaint();
				
				//((AbstractTableModel) this.jTableDatosRecap.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRecap();
			}
		}
	}
	
	public void actualizarVisualTableDatosRecap() throws Exception {
		
		RecapModel recapModel=(RecapModel)this.jTableDatosRecap.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			recapModel.recaps=this.recapLogic.getRecaps();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			recapModel.recaps=this.recaps;
		}
		
		
		((RecapModel) this.jTableDatosRecap.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRecap() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getrecapAnterior(),this.recapLogic.getRecaps());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getrecapAnterior(),this.recaps);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRecap();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRecap(Recap recap,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleRecap.class)) {
					this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.setDetalleRecaps(recap.getDetalleRecaps());
					this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleRecap(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
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
										
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.recap,new Object(),generalEntityParameterGeneral,this.recapReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.recapSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RecapConstantesFunciones.getClassesRelationshipsOfRecap(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RecapConstantesFunciones.getClassesRelationshipsFromStringsOfRecap(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRecap(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.recap,new Object(),generalEntityParameterGeneral,this.recapReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRecap(RecapBean recapBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleRecap.class)) {
					this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.setDetalleRecaps(recap.getDetalleRecaps());
					this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleRecap(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRecap(ArrayList<Classe> classes,RecapReturnGeneral recapReturnGeneral,RecapBean recapBean,Boolean conDefault) throws Exception {
		
			this.recapBean.setDetalleRecaps(recapReturnGeneral.getRecap().getDetalleRecaps());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRecap(Recap recap,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleRecap.class)) {
					recap.setDetalleRecaps(this.jInternalFrameDetalleFormRecap.detallerecapBeanSwingJInternalFrame.detallerecapLogic.getDetalleRecaps());
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
		if(!paraTabla && !this.permiteMantenimiento(this.recap)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRecap = new RecapDetalleFormJInternalFrame(jDesktopPane,this.recapSessionBean.getConGuardarRelaciones(),this.recapSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRecap);
		this.jInternalFrameDetalleFormRecap.setVisible(false);
		this.jInternalFrameDetalleFormRecap.setSelected(false);						
		
		this.jInternalFrameDetalleFormRecap.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRecap.recapLogic=this.recapLogic;
		
		this.cargarCombosFrameForeignKeyRecap("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRecap();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRecap();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRecap("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRecap();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRecap.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRecap"));
		
		this.jInternalFrameDetalleFormRecap.jButtonModificarRecap.addActionListener(new ButtonActionListener(this,"ModificarRecap"));

		
		this.jInternalFrameDetalleFormRecap.jButtonModificarToolBarRecap.addActionListener(new ButtonActionListener(this,"ModificarToolBarRecap"));
					
		this.jInternalFrameDetalleFormRecap.jMenuItemModificarRecap.addActionListener(new ButtonActionListener(this,"MenuItemModificarRecap"));		
		
		
		
		this.jInternalFrameDetalleFormRecap.jButtonActualizarRecap.addActionListener (new ButtonActionListener(this,"ActualizarRecap"));
		
		
		this.jInternalFrameDetalleFormRecap.jButtonActualizarToolBarRecap.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRecap"));
						
		this.jInternalFrameDetalleFormRecap.jMenuItemActualizarRecap.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRecap"));		
		
		
		
		this.jInternalFrameDetalleFormRecap.jButtonEliminarRecap.addActionListener (new ButtonActionListener(this,"EliminarRecap"));
		
		
		this.jInternalFrameDetalleFormRecap.jButtonEliminarToolBarRecap.addActionListener (new ButtonActionListener(this,"EliminarToolBarRecap"));
								
		this.jInternalFrameDetalleFormRecap.jMenuItemEliminarRecap.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRecap"));		
		
		
		
		this.jInternalFrameDetalleFormRecap.jButtonCancelarRecap.addActionListener (new ButtonActionListener(this,"CancelarRecap"));
		
		
		this.jInternalFrameDetalleFormRecap.jButtonCancelarToolBarRecap.addActionListener (new ButtonActionListener(this,"CancelarToolBarRecap"));
					
		this.jInternalFrameDetalleFormRecap.jMenuItemCancelarRecap.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRecap"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRecap.jMenuItemDetalleCerrarRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRecap"));		
		
		
		
		this.jInternalFrameDetalleFormRecap.jButtonGuardarCambiosToolBarRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRecap"));
		
		
		
		this.jInternalFrameDetalleFormRecap.jButtonGuardarCambiosToolBarRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRecap"));
		
		
		
		this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRecap"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonidRecapBusqueda.addActionListener(new ButtonActionListener(this,"idRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecap.jButtonid_empresaRecapUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonid_empresaRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecap.jButtonid_sucursalRecapUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonid_sucursalRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecap.jButtonid_ejercicioRecapUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonid_ejercicioRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonnumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"numeroRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonnumero_autorizacionRecapBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfecha_inicioRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfecha_finalRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finalRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfecha_elaboracionRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_elaboracionRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfecha_caducidadRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_caducidadRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonmonto_ivaRecapBusqueda.addActionListener(new ButtonActionListener(this,"monto_ivaRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonsin_monto_ivaRecapBusqueda.addActionListener(new ButtonActionListener(this,"sin_monto_ivaRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonivaRecapBusqueda.addActionListener(new ButtonActionListener(this,"ivaRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonotro_impuestoRecapBusqueda.addActionListener(new ButtonActionListener(this,"otro_impuestoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonvalor_propuestoRecapBusqueda.addActionListener(new ButtonActionListener(this,"valor_propuestoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonsubtotalRecapBusqueda.addActionListener(new ButtonActionListener(this,"subtotalRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfinancieroRecapBusqueda.addActionListener(new ButtonActionListener(this,"financieroRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtontotalRecapBusqueda.addActionListener(new ButtonActionListener(this,"totalRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonvalor_cambioRecapBusqueda.addActionListener(new ButtonActionListener(this,"valor_cambioRecapBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRecap.jTabbedPaneRelacionesRecap.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRecap"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRecap"));
		
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecap.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRecap"));
		}
		
		this.jTableDatosRecap.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRecap"));
		
		this.jTableDatosRecap.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRecap"));
		
		this.jButtonNuevoRecap.addActionListener(new ButtonActionListener(this,"NuevoRecap"));
		
		this.jButtonDuplicarRecap.addActionListener(new ButtonActionListener(this,"DuplicarRecap"));
		
		this.jButtonCopiarRecap.addActionListener(new ButtonActionListener(this,"CopiarRecap"));
		
		this.jButtonVerFormRecap.addActionListener(new ButtonActionListener(this,"VerFormRecap"));
		
		
		this.jButtonNuevoToolBarRecap.addActionListener(new ButtonActionListener(this,"NuevoToolBarRecap"));
			
		this.jButtonDuplicarToolBarRecap.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRecap"));
			
		this.jMenuItemNuevoRecap.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRecap"));
			
		this.jMenuItemDuplicarRecap.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRecap"));		
		
		
		this.jButtonNuevoRelacionesRecap.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRecap"));
		
		
		this.jButtonNuevoRelacionesToolBarRecap.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRecap"));
			
		this.jMenuItemNuevoRelacionesRecap.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRecap"));		
		
		
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecap.jButtonModificarRecap.addActionListener(new ButtonActionListener(this,"ModificarRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecap.jButtonModificarToolBarRecap.addActionListener(new ButtonActionListener(this,"ModificarToolBarRecap"));
			
			this.jInternalFrameDetalleFormRecap.jMenuItemModificarRecap.addActionListener(new ButtonActionListener(this,"MenuItemModificarRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRecap.jButtonActualizarRecap.addActionListener (new ButtonActionListener(this,"ActualizarRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecap.jButtonActualizarToolBarRecap.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRecap"));
				
			this.jInternalFrameDetalleFormRecap.jMenuItemActualizarRecap.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecap.jButtonEliminarRecap.addActionListener (new ButtonActionListener(this,"EliminarRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecap.jButtonEliminarToolBarRecap.addActionListener (new ButtonActionListener(this,"EliminarToolBarRecap"));
						
			this.jInternalFrameDetalleFormRecap.jMenuItemEliminarRecap.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecap.jButtonCancelarRecap.addActionListener (new ButtonActionListener(this,"CancelarRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecap.jButtonCancelarToolBarRecap.addActionListener (new ButtonActionListener(this,"CancelarToolBarRecap"));
			
			this.jInternalFrameDetalleFormRecap.jMenuItemCancelarRecap.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRecap"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRecap.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRecap"));		
		
		
		this.jButtonCerrarRecap.addActionListener (new ButtonActionListener(this,"CerrarRecap"));
		
		
		this.jButtonCerrarToolBarRecap.addActionListener (new ButtonActionListener(this,"CerrarToolBarRecap"));
			
		this.jMenuItemCerrarRecap.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRecap"));
			
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecap.jMenuItemDetalleCerrarRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecap.jButtonGuardarCambiosRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecap.jButtonGuardarCambiosToolBarRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRecap"));
		}
		
		this.jButtonCopiarToolBarRecap.addActionListener (new ButtonActionListener(this,"CopiarToolBarRecap"));
			
		this.jButtonVerFormToolBarRecap.addActionListener (new ButtonActionListener(this,"VerFormToolBarRecap"));
		
		this.jMenuItemGuardarCambiosRecap.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRecap"));
			
		this.jMenuItemCopiarRecap.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRecap"));		
		
		this.jMenuItemVerFormRecap.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRecap"));		
		
		
		this.jButtonGuardarCambiosTablaRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRecap"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRecap"));
			
		this.jMenuItemGuardarCambiosTablaRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRecap"));		
		
		
		
		this.jButtonRecargarInformacionRecap.addActionListener (new ButtonActionListener(this,"RecargarInformacionRecap"));
					
		this.jButtonRecargarInformacionToolBarRecap.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRecap"));
		
		this.jMenuItemRecargarInformacionRecap.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRecap"));		
		
		
		
		this.jButtonAnterioresRecap.addActionListener (new ButtonActionListener(this,"AnterioresRecap"));
		
		
		this.jButtonAnterioresToolBarRecap.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRecap"));
		
		this.jMenuItemAnterioresRecap.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRecap"));		
		
		
		this.jButtonSiguientesRecap.addActionListener (new ButtonActionListener(this,"SiguientesRecap"));
		
		
		this.jButtonSiguientesToolBarRecap.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRecap"));
			
		this.jMenuItemSiguientesRecap.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRecap"));
			
		this.jMenuItemAbrirOrderByRecap.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRecap"));
			
		this.jMenuItemMostrarOcultarRecap.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRecap"));
			
		this.jMenuItemDetalleAbrirOrderByRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRecap"));
			
		this.jMenuItemDetalleMostarOcultarRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRecap"));		
		
		
		this.jButtonNuevoGuardarCambiosRecap.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRecap"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRecap.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRecap"));
			
		this.jMenuItemNuevoGuardarCambiosRecap.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRecap"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRecap.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRecap"));

		this.jCheckBoxSeleccionadosRecap.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRecap"));
		
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRecap"));
		}
		
		
		this.jComboBoxTiposRelacionesRecap.addActionListener (new ButtonActionListener(this,"TiposRelacionesRecap"));
			
		this.jComboBoxTiposAccionesRecap.addActionListener (new ButtonActionListener(this,"TiposAccionesRecap"));
					
		this.jComboBoxTiposSeleccionarRecap.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRecap"));
			
		this.jTextFieldValorCampoGeneralRecap.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRecap"));		
		
		
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonidRecapBusqueda.addActionListener(new ButtonActionListener(this,"idRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecap.jButtonid_empresaRecapUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonid_empresaRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecap.jButtonid_sucursalRecapUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonid_sucursalRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecap.jButtonid_ejercicioRecapUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonid_ejercicioRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonnumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"numeroRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonnumero_autorizacionRecapBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfecha_inicioRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfecha_finalRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finalRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfecha_elaboracionRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_elaboracionRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfecha_caducidadRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_caducidadRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonmonto_ivaRecapBusqueda.addActionListener(new ButtonActionListener(this,"monto_ivaRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonsin_monto_ivaRecapBusqueda.addActionListener(new ButtonActionListener(this,"sin_monto_ivaRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonivaRecapBusqueda.addActionListener(new ButtonActionListener(this,"ivaRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonotro_impuestoRecapBusqueda.addActionListener(new ButtonActionListener(this,"otro_impuestoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonvalor_propuestoRecapBusqueda.addActionListener(new ButtonActionListener(this,"valor_propuestoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonsubtotalRecapBusqueda.addActionListener(new ButtonActionListener(this,"subtotalRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfinancieroRecapBusqueda.addActionListener(new ButtonActionListener(this,"financieroRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtontotalRecapBusqueda.addActionListener(new ButtonActionListener(this,"totalRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonvalor_cambioRecapBusqueda.addActionListener(new ButtonActionListener(this,"valor_cambioRecapBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRecap!=null) {
				this.jInternalFrameReporteDinamicoRecap.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRecap"));
				this.jInternalFrameReporteDinamicoRecap.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRecap"));
				this.jInternalFrameReporteDinamicoRecap.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRecap"));
			}
			
			//this.jButtonCerrarReporteDinamicoRecap.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRecap"));				
			//this.jButtonGenerarReporteDinamicoRecap.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRecap"));
			//this.jButtonGenerarExcelReporteDinamicoRecap.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRecap"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRecap!=null) {
				this.jInternalFrameImportacionRecap.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRecap"));
				this.jInternalFrameImportacionRecap.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRecap"));
				this.jInternalFrameImportacionRecap.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRecap"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRecap.addActionListener (new ButtonActionListener(this,"AbrirOrderByRecap"));
			
			this.jButtonAbrirOrderByToolBarRecap.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRecap"));			
			
			if(this.jInternalFrameOrderByRecap!=null) {
				this.jInternalFrameOrderByRecap.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRecap"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRecap.jTabbedPaneRelacionesRecap.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRecap"));
		
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
            		closingInternalFrameRecap();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRecap.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRecap = (JInternalFrameBase)event.getSource();
	            	
	            RecapBeanSwingJInternalFrame jInternalFrameParent=(RecapBeanSwingJInternalFrame)jInternalFrameDetalleFormRecap.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRecapActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRecap.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRecapListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRecap.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRecap.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRecapActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRecapActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRecapActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRecap";
		inputMap = this.jButtonNuevoRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRecapActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRecapActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRecapActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRecapActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRecap";
		inputMap = this.jButtonNuevoRelacionesRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRecapActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRecap";
		inputMap = this.jButtonModificarRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRecap";
		inputMap = this.jButtonActualizarRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRecap";
		inputMap = this.jButtonEliminarRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRecap";
		inputMap = this.jButtonCancelarRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRecap";
		inputMap = this.jButtonCerrarRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRecap.jButtonGuardarCambiosRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRecap";
		inputMap = this.jInternalFrameDetalleFormRecap.jButtonGuardarCambiosRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRecap.jButtonGuardarCambiosRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRecap.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRecapItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRecap.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRecapActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRecap.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRecapActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRecap.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRecapActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonidRecapBusqueda.addActionListener(new ButtonActionListener(this,"idRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecap.jButtonid_empresaRecapUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonid_empresaRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecap.jButtonid_sucursalRecapUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonid_sucursalRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRecap.jButtonid_ejercicioRecapUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonid_ejercicioRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonnumeroRecapBusqueda.addActionListener(new ButtonActionListener(this,"numeroRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonnumero_autorizacionRecapBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorizacionRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfecha_inicioRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfecha_finalRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finalRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfecha_elaboracionRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_elaboracionRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfecha_caducidadRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_caducidadRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonmonto_ivaRecapBusqueda.addActionListener(new ButtonActionListener(this,"monto_ivaRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonsin_monto_ivaRecapBusqueda.addActionListener(new ButtonActionListener(this,"sin_monto_ivaRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonivaRecapBusqueda.addActionListener(new ButtonActionListener(this,"ivaRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonotro_impuestoRecapBusqueda.addActionListener(new ButtonActionListener(this,"otro_impuestoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonvalor_propuestoRecapBusqueda.addActionListener(new ButtonActionListener(this,"valor_propuestoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonsubtotalRecapBusqueda.addActionListener(new ButtonActionListener(this,"subtotalRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonfinancieroRecapBusqueda.addActionListener(new ButtonActionListener(this,"financieroRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtontotalRecapBusqueda.addActionListener(new ButtonActionListener(this,"totalRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRecap.jButtonvalor_cambioRecapBusqueda.addActionListener(new ButtonActionListener(this,"valor_cambioRecapBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRecapActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRecap.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRecap(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Recap recapAux:this.recapLogic.getRecaps()) {
					recapAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Recap recapAux:recaps) {
					recapAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRecapItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRecap(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Recap recapAux:this.recapLogic.getRecaps()) {
						recapAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Recap recapAux:recaps) {
						recapAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Recap recapAux:this.recapLogic.getRecaps()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Recap recapAux:recaps) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRecap(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRecap.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRecap.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRecap,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRecapItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRecap(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRecap.getSelectedRows();
			
			Recap recapLocal=new Recap();
			
			//this.seleccionarTodosRecap(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					recapLocal =(Recap) this.recapLogic.getRecaps().toArray()[this.jTableDatosRecap.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					recapLocal =(Recap) this.recaps.toArray()[this.jTableDatosRecap.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				recapLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Recap recapAux:this.recapLogic.getRecaps()) {
						recapAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Recap recapAux:recaps) {
						recapAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRecap(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRecap.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRecap.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRecap,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRecapItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRecapParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRecapActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRecap(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRecap.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Recap recapAux:this.recapLogic.getRecaps()) {
				
						if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							recapAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
							existe=true;
							recapAux.setnumero_autorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							recapAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_FECHAFINAL)) {
							existe=true;
							recapAux.setfecha_final(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_FECHAELABORACION)) {
							existe=true;
							recapAux.setfecha_elaboracion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_FECHACADUCIDAD)) {
							existe=true;
							recapAux.setfecha_caducidad(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_MONTOIVA)) {
							existe=true;
							recapAux.setmonto_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_SINMONTOIVA)) {
							existe=true;
							recapAux.setsin_monto_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_IVA)) {
							existe=true;
							recapAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_OTROIMPUESTO)) {
							existe=true;
							recapAux.setotro_impuesto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_VALORPROPUESTO)) {
							existe=true;
							recapAux.setvalor_propuesto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							recapAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_FINANCIERO)) {
							existe=true;
							recapAux.setfinanciero(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							recapAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_VALORCAMBIO)) {
							existe=true;
							recapAux.setvalor_cambio(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Recap recapAux:recaps) {
					
						if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							recapAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
							existe=true;
							recapAux.setnumero_autorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							recapAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_FECHAFINAL)) {
							existe=true;
							recapAux.setfecha_final(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_FECHAELABORACION)) {
							existe=true;
							recapAux.setfecha_elaboracion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_FECHACADUCIDAD)) {
							existe=true;
							recapAux.setfecha_caducidad(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_MONTOIVA)) {
							existe=true;
							recapAux.setmonto_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_SINMONTOIVA)) {
							existe=true;
							recapAux.setsin_monto_iva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_IVA)) {
							existe=true;
							recapAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_OTROIMPUESTO)) {
							existe=true;
							recapAux.setotro_impuesto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_VALORPROPUESTO)) {
							existe=true;
							recapAux.setvalor_propuesto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							recapAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_FINANCIERO)) {
							existe=true;
							recapAux.setfinanciero(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							recapAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_VALORCAMBIO)) {
							existe=true;
							recapAux.setvalor_cambio(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRecap(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRecapActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRecap(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRecap=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRecap.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRecap) {				
					conSplash=true;//false;										
					
					//this.startProcessRecap(conSplash);
				
					this.generarReporteRecapsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRecapsSeleccionados();
				//this.jComboBoxTiposAccionesRecap.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRecapsSeleccionados(false);
				//this.jComboBoxTiposAccionesRecap.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRecapsSeleccionados(true);
				//this.jComboBoxTiposAccionesRecap.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRecap();
				
				this.exportarRecapsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRecaps();
				//this.importarRecaps();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRecap();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRecapsSeleccionados();
				//this.jComboBoxTiposAccionesRecap.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRecap();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRecap)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRecap(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Recap",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.setSelectedIndex(0);					
				}	
			} 			
			else if(RecapBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRecap) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRecap(conSplash);
					
						//this.actualizarParametrosGeneralRecap();
						
						this.generarReporteProcesoAccionRecapsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRecap.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RecapBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO RecapES SELECCIONADOS?", "MANTENIMIENTO DE Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRecap();
				
						this.actualizarParametrosGeneralRecap();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.recapReturnGeneral=recapLogic.procesarAccionRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.recapLogic.getRecaps(),this.recapParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRecapReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRecap.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRecap();
					
					RecapBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRecapReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRecap.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRecap.jComboBoxTiposAccionesFormularioRecap.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRecap(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRecapActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRecap();
			
			if(this.jInternalFrameDetalleFormRecap==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Recap> recapsSeleccionados=new ArrayList<Recap>();		
			Recap recap=new Recap();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRecap(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRecap.getSelectedItem();
			
			
			
			
			recapsSeleccionados=this.getRecapsSeleccionados(true);
			//this.sTipoAccion;
			
			if(recapsSeleccionados.size()==1) {
				for(Recap recapAux:recapsSeleccionados) {
					recap=recapAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Recap")) {
					jButtonDetalleRecapActionPerformed(null,rowIndex,true,false,recap);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRecap();
			
      		//this.finishProcessRecap(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRecapReturnGeneral() throws Exception {
		if(this.recapReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.recapReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.recapReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.recapReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.recapReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.recapReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRecap(false);
		}
		
		if(this.recapReturnGeneral.getConRetornoLista() || this.recapReturnGeneral.getConRetornoObjeto()) {
			if(this.recapReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.recapLogic.setRecaps(this.recapReturnGeneral.getRecaps());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.recapReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.recapLogic.setRecap(this.recapReturnGeneral.getRecap());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRecap(false);
		}
	}
	
	public void actualizarParametrosGeneralRecap() throws Exception {
		
		
	}
	
	public ArrayList<Recap> getRecapsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Recap> recapsSeleccionados=new ArrayList<Recap>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRecap) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Recap recapAux:recapLogic.getRecaps()) {
					if(recapAux.getIsSelected()) {
						recapsSeleccionados.add(recapAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Recap recapAux:this.recaps) {
					if(recapAux.getIsSelected()) {
						recapsSeleccionados.add(recapAux);				
					}
				}
			}
			
			if(recapsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						recapsSeleccionados.addAll(this.recapLogic.getRecaps());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						recapsSeleccionados.addAll(this.recaps);				
					}
				}
			}
		} else {
			recapsSeleccionados.add(this.recap);
		}
		
		return recapsSeleccionados;
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
	
	public void generarReporteRecapsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRecapsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRecapsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRecapsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRecapsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesRecapsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Recap",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRecapsSeleccionados() throws Exception {
		ArrayList<Recap> recapsSeleccionados=new ArrayList<Recap>();		
		
		recapsSeleccionados=this.getRecapsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRecaps("Todos",recapsSeleccionados);
		
	}	
	
	public void generarReporteNormalRecapsSeleccionados() throws Exception {
		ArrayList<Recap> recapsSeleccionados=new ArrayList<Recap>();		
		
		recapsSeleccionados=this.getRecapsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRecaps("Todos",recapsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRecapsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Recap> recapsSeleccionados=new ArrayList<Recap>();
		
		recapsSeleccionados=this.getRecapsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRecaps("Todos",recapsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRecapsSeleccionados() throws Exception {
		ArrayList<Recap> recapsSeleccionados=new ArrayList<Recap>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRecap();
		
		
		recapsSeleccionados=this.getRecapsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRecap();
		
		
		//this.generarReporteRecaps("Todos",recapsSeleccionados ,recapImplementable,recapImplementableHome);
	}
	
	public void mostrarImportacionRecaps() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRecap();
		
		this.abrirFrameImportacionRecap();		
		
			
		//this.generarReporteRecaps("Todos",recapsSeleccionados ,recapImplementable,recapImplementableHome);
	}
	
	public void importarRecaps() throws Exception {		
	
	}
	
	public void exportarRecapsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRecapsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRecapsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRecapsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Recap",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRecapsSeleccionados() throws Exception {
		ArrayList<Recap> recapsSeleccionados=new ArrayList<Recap>();		
		
		recapsSeleccionados=this.getRecapsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recap."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRecap(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Recap recapAux:recapsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRecap(recapAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//recapAux.setsDetalleGeneralEntityReporte(recapAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recap",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRecap(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RecapConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_FECHAFINAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_FECHAELABORACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_FECHACADUCIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_MONTOIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_SINMONTOIVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_OTROIMPUESTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_VALORPROPUESTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_SUBTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_FINANCIERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RecapConstantesFunciones.LABEL_VALORCAMBIO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRecap(Recap recap,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=recap.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getnumero_autorizacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getfecha_final().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getfecha_elaboracion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getfecha_caducidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getmonto_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getsin_monto_iva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getotro_impuesto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getvalor_propuesto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getsubtotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getfinanciero().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=recap.getvalor_cambio().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRecapsSeleccionados() throws Exception {
		ArrayList<Recap> recapsSeleccionados=new ArrayList<Recap>();		
		
		recapsSeleccionados=this.getRecapsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recap.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Recaps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRecap(row);				
				iRow++;
			}				
			
			for(Recap recapAux:recapsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRecap(recapAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recap",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRecapsSeleccionados() throws Exception {
		ArrayList<Recap> recapsSeleccionados=new ArrayList<Recap>();		
		
		recapsSeleccionados=this.getRecapsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"recap.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("recaps");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("recap");
			//elementRoot.appendChild(element);
		
			for(Recap recapAux:recapsSeleccionados) {
				element = document.createElement("recap");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRecap(recapAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.recapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Recap",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRecap(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_FECHAFINAL);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_FECHAELABORACION);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_FECHACADUCIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_MONTOIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_SINMONTOIVA);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_OTROIMPUESTO);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_VALORPROPUESTO);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_SUBTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_FINANCIERO);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(RecapConstantesFunciones.LABEL_VALORCAMBIO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRecap(Recap recap,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getnumero_autorizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getfecha_final());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getfecha_elaboracion());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getfecha_caducidad());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getmonto_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getsin_monto_iva());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getotro_impuesto());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getvalor_propuesto());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getsubtotal());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getfinanciero());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(recap.getvalor_cambio());				
	}
	
	public void setFilaDatosExportarXmlRecap(Recap recap,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RecapConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(recap.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RecapConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(recap.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RecapConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(recap.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(RecapConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(recap.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(RecapConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(recap.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementnumero = document.createElement(RecapConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(recap.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementnumero_autorizacion = document.createElement(RecapConstantesFunciones.NUMEROAUTORIZACION);
		elementnumero_autorizacion.appendChild(document.createTextNode(recap.getnumero_autorizacion().trim()));
		element.appendChild(elementnumero_autorizacion);

		Element elementfecha_inicio = document.createElement(RecapConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(recap.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_final = document.createElement(RecapConstantesFunciones.FECHAFINAL);
		elementfecha_final.appendChild(document.createTextNode(recap.getfecha_final().toString().trim()));
		element.appendChild(elementfecha_final);

		Element elementfecha_elaboracion = document.createElement(RecapConstantesFunciones.FECHAELABORACION);
		elementfecha_elaboracion.appendChild(document.createTextNode(recap.getfecha_elaboracion().toString().trim()));
		element.appendChild(elementfecha_elaboracion);

		Element elementfecha_caducidad = document.createElement(RecapConstantesFunciones.FECHACADUCIDAD);
		elementfecha_caducidad.appendChild(document.createTextNode(recap.getfecha_caducidad().toString().trim()));
		element.appendChild(elementfecha_caducidad);

		Element elementmonto_iva = document.createElement(RecapConstantesFunciones.MONTOIVA);
		elementmonto_iva.appendChild(document.createTextNode(recap.getmonto_iva().toString().trim()));
		element.appendChild(elementmonto_iva);

		Element elementsin_monto_iva = document.createElement(RecapConstantesFunciones.SINMONTOIVA);
		elementsin_monto_iva.appendChild(document.createTextNode(recap.getsin_monto_iva().toString().trim()));
		element.appendChild(elementsin_monto_iva);

		Element elementiva = document.createElement(RecapConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(recap.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementotro_impuesto = document.createElement(RecapConstantesFunciones.OTROIMPUESTO);
		elementotro_impuesto.appendChild(document.createTextNode(recap.getotro_impuesto().toString().trim()));
		element.appendChild(elementotro_impuesto);

		Element elementvalor_propuesto = document.createElement(RecapConstantesFunciones.VALORPROPUESTO);
		elementvalor_propuesto.appendChild(document.createTextNode(recap.getvalor_propuesto().toString().trim()));
		element.appendChild(elementvalor_propuesto);

		Element elementsubtotal = document.createElement(RecapConstantesFunciones.SUBTOTAL);
		elementsubtotal.appendChild(document.createTextNode(recap.getsubtotal().toString().trim()));
		element.appendChild(elementsubtotal);

		Element elementfinanciero = document.createElement(RecapConstantesFunciones.FINANCIERO);
		elementfinanciero.appendChild(document.createTextNode(recap.getfinanciero().toString().trim()));
		element.appendChild(elementfinanciero);

		Element elementtotal = document.createElement(RecapConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(recap.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementvalor_cambio = document.createElement(RecapConstantesFunciones.VALORCAMBIO);
		elementvalor_cambio.appendChild(document.createTextNode(recap.getvalor_cambio().toString().trim()));
		element.appendChild(elementvalor_cambio);
	}
	
	public void generarReporteGroupGenericoRecapsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Recap> recapsSeleccionados=new ArrayList<Recap>();
		
		recapsSeleccionados=this.getRecapsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRecap(recapsSeleccionados);
		
		this.generarReporteRecaps("Todos",recapsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRecap(ArrayList<Recap> recapsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Recap recapAux:recapsSeleccionados) {
				recapAux.setsDetalleGeneralEntityReporte(recapAux.toString());
			
				if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					recapAux.setsDescripcionGeneralEntityReporte1(recapAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					recapAux.setsDescripcionGeneralEntityReporte1(recapAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					recapAux.setsDescripcionGeneralEntityReporte1(recapAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					recapAux.setsDescripcionGeneralEntityReporte1(recapAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION)) {
					existe=true;
					recapAux.setsDescripcionGeneralEntityReporte1(recapAux.getnumero_autorizacion());
				}
				 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					recapAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(recapAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_FECHAFINAL)) {
					existe=true;
					recapAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(recapAux.getfecha_final()));
				}
				 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_FECHAELABORACION)) {
					existe=true;
					recapAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(recapAux.getfecha_elaboracion()));
				}
				 else if(sTipoSeleccionar.equals(RecapConstantesFunciones.LABEL_FECHACADUCIDAD)) {
					existe=true;
					recapAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(recapAux.getfecha_caducidad()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRecap(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRecap=true;
				this.isVisibilidadCeldaNuevoRelacionesRecap=true;
				this.isVisibilidadCeldaGuardarCambiosRecap=true;
			}
			
			this.isVisibilidadCeldaModificarRecap=false;
			this.isVisibilidadCeldaActualizarRecap=false;
			this.isVisibilidadCeldaEliminarRecap=false;
			this.isVisibilidadCeldaCancelarRecap=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarRecap=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesRecap=false;
			this.isVisibilidadCeldaGuardarCambiosRecap=false;
			this.isVisibilidadCeldaModificarRecap=false;
			this.isVisibilidadCeldaActualizarRecap=true;
			this.isVisibilidadCeldaEliminarRecap=false;
			this.isVisibilidadCeldaCancelarRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarRecap=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesRecap=false;
			this.isVisibilidadCeldaGuardarCambiosRecap=false;
			this.isVisibilidadCeldaModificarRecap=false;
			this.isVisibilidadCeldaActualizarRecap=true;
			this.isVisibilidadCeldaEliminarRecap=true;
			this.isVisibilidadCeldaCancelarRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarRecap=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesRecap=false;
			this.isVisibilidadCeldaGuardarCambiosRecap=false;
			this.isVisibilidadCeldaModificarRecap=false;
			this.isVisibilidadCeldaActualizarRecap=true;
			this.isVisibilidadCeldaEliminarRecap=false;
			this.isVisibilidadCeldaCancelarRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRecap=false;
				} else {
					this.isVisibilidadCeldaGuardarRecap=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRecap=true;
			this.isVisibilidadCeldaNuevoRelacionesRecap=true;
			this.isVisibilidadCeldaGuardarCambiosRecap=true;
			this.isVisibilidadCeldaModificarRecap=false;
			this.isVisibilidadCeldaActualizarRecap=false;
			this.isVisibilidadCeldaEliminarRecap=false;
			this.isVisibilidadCeldaCancelarRecap=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarRecap=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesRecap=false;
			this.isVisibilidadCeldaGuardarCambiosRecap=false;
			this.isVisibilidadCeldaActualizarRecap=false;
			this.isVisibilidadCeldaEliminarRecap=false;
			this.isVisibilidadCeldaCancelarRecap=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRecap=false;
				} else {
					this.isVisibilidadCeldaGuardarRecap=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesRecap=false;
			this.isVisibilidadCeldaGuardarCambiosRecap=false;
			this.isVisibilidadCeldaModificarRecap=true;
			this.isVisibilidadCeldaActualizarRecap=false;
			this.isVisibilidadCeldaEliminarRecap=false;
			this.isVisibilidadCeldaCancelarRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRecap=false;
				} else {
					this.isVisibilidadCeldaGuardarRecap=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RecapJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRecap=true;
			this.isVisibilidadCeldaNuevoRelacionesRecap=true;
			this.isVisibilidadCeldaGuardarCambiosRecap=true;
		} else {
			this.actualizarEstadoPanelsRecap(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRecap=false;
			//this.isVisibilidadCeldaVerFormRecap=false;
			this.isVisibilidadCeldaDuplicarRecap=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!recapSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRecap=false;
		} else {
			this.isVisibilidadCeldaNuevoRecap=false;
			this.isVisibilidadCeldaGuardarCambiosRecap=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(recapSessionBean.getEsGuardarRelacionado()) {
			if(!recapSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRecap=false;												
			}
			
			this.jButtonCerrarRecap.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRecap=false;
		}
		
		if(!this.permiteMantenimiento(this.recap)) {
			this.isVisibilidadCeldaActualizarRecap=false;
			this.isVisibilidadCeldaEliminarRecap=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRecap() {
		this.isVisibilidadCeldaNuevoRecap=false;
		this.isVisibilidadCeldaGuardarCambiosRecap=false;
	}
	
	public void actualizarEstadoPanelsRecap(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRecap!=null) {
				this.jScrollPanelDatosEdicionRecap.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecap!=null) {
				this.jTabbedPaneBusquedasRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRecap!=null) {
				this.jScrollPanelDatosRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionRecap!=null) {
				this.jPanelPaginacionRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRecap!=null) {
				this.jPanelParametrosReportesRecap.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRecap!=null) {
				this.jScrollPanelDatosEdicionRecap.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecap!=null) {
				this.jTabbedPaneBusquedasRecap.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRecap!=null) {
				this.jScrollPanelDatosRecap.setVisible(false);
			}
			
			if(this.jPanelPaginacionRecap!=null) {
				this.jPanelPaginacionRecap.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRecap!=null) {
				this.jPanelParametrosReportesRecap.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRecap!=null) {
				this.jScrollPanelDatosEdicionRecap.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecap!=null) {
				this.jTabbedPaneBusquedasRecap.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRecap!=null) {
				this.jScrollPanelDatosRecap.setVisible(false);
			}
			
			if(this.jPanelPaginacionRecap!=null) {
				this.jPanelPaginacionRecap.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRecap!=null) {
				this.jPanelParametrosReportesRecap.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRecap!=null) {
				this.jScrollPanelDatosEdicionRecap.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecap!=null) {
				this.jTabbedPaneBusquedasRecap.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRecap!=null) {
				this.jScrollPanelDatosRecap.setVisible(false);
			}
			
			if(this.jPanelPaginacionRecap!=null) {
				this.jPanelPaginacionRecap.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRecap!=null) {
				this.jPanelParametrosReportesRecap.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRecap!=null) {
				this.jScrollPanelDatosEdicionRecap.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecap!=null) {
				this.jTabbedPaneBusquedasRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRecap!=null) {
				this.jScrollPanelDatosRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionRecap!=null) {
				this.jPanelPaginacionRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRecap!=null) {
				this.jPanelParametrosReportesRecap.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRecap!=null) {
				this.jScrollPanelDatosEdicionRecap.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecap!=null) {
				this.jTabbedPaneBusquedasRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRecap!=null) {
				this.jScrollPanelDatosRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionRecap!=null) {
				this.jPanelPaginacionRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRecap!=null) {
				this.jPanelParametrosReportesRecap.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRecap!=null) {
				this.jScrollPanelDatosEdicionRecap.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecap!=null) {
				this.jTabbedPaneBusquedasRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRecap!=null) {
				this.jScrollPanelDatosRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionRecap!=null) {
				this.jPanelPaginacionRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRecap!=null) {
				this.jPanelParametrosReportesRecap.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.recapSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRecap!=null) {
					this.jTabbedPaneBusquedasRecap.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRecap!=null) {
				this.jPanelParametrosReportesRecap.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.recapSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRecap!=null) {
				this.jTabbedPaneBusquedasRecap.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRecap!=null) {
				this.jPanelParametrosReportesRecap.setVisible(true);
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

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;
		}
		
	}
	
	

	public String registrarSesionRecapParaDetalleRecapes() throws Exception {
		Boolean isPaginaPopupDetalleRecap=false;

		try {

			if(this.recapSessionBean==null) {
				this.recapSessionBean=new RecapSessionBean();
			}

			if(this.jInternalFrameDetalleFormRecap.detallerecapSessionBean==null) {
				this.jInternalFrameDetalleFormRecap.detallerecapSessionBean=new DetalleRecapSessionBean();
			}

			this.jInternalFrameDetalleFormRecap.detallerecapSessionBean.setsPathNavegacionActual(recapSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleRecapConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormRecap.detallerecapSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleRecap=this.jInternalFrameDetalleFormRecap.detallerecapSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormRecap.detallerecapSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleRecap(true);
			this.jInternalFrameDetalleFormRecap.detallerecapSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleRecap(RecapConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormRecap.detallerecapSessionBean.setisBusquedaDesdeForeignKeySesionRecap(true);
			this.jInternalFrameDetalleFormRecap.detallerecapSessionBean.setlidRecapActual(this.idRecapActual);

			recapSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRecap(true);
			recapSessionBean.setlIdRecapActualForeignKey(this.idRecapActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RecapSessionBean recapSessionBean=new RecapSessionBean();
		
		if(this.recapSessionBean==null) {
			this.recapSessionBean=new RecapSessionBean();
		}
		
		this.recapSessionBean.setsUltimaBusquedaRecap(this.getsAccionBusqueda());
		this.recapSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.recapSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			recapSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			recapSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			recapSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RecapSessionBean recapSessionBean=new RecapSessionBean();
		
		if(this.recapSessionBean==null) {
			this.recapSessionBean=new RecapSessionBean();
		}
		
		if(this.recapSessionBean.getsUltimaBusquedaRecap()!=null&&!this.recapSessionBean.getsUltimaBusquedaRecap().equals("")) {
			this.setsAccionBusqueda(recapSessionBean.getsUltimaBusquedaRecap());
			this.setiNumeroPaginacion(recapSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(recapSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(recapSessionBean.getid_ejercicio());
				recapSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(recapSessionBean.getid_empresa());
				recapSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(recapSessionBean.getid_sucursal());
				recapSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.recapSessionBean.setsUltimaBusquedaRecap("");
		this.recapSessionBean.setiNumeroPaginacion(RecapConstantesFunciones.INUMEROPAGINACION);
		this.recapSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRecap(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRecap() {
		this.updateBorderResaltarBusquedasFormularioRecap();
		this.updateVisibilidadBusquedasFormularioRecap();
		this.updateHabilitarBusquedasFormularioRecap();
	}
	
	public void updateBorderResaltarBusquedasFormularioRecap() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRecap.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRecap() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRecap.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRecap() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRecap.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRecap(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarRecap.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRecap() throws Exception {

		if(this.jInternalFrameDetalleFormRecap==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRecap();
		this.updateVisibilidadResaltarControlesFormularioRecap();
		this.updateHabilitarResaltarControlesFormularioRecap();
		
	}
	
	public void updateBorderResaltarControlesFormularioRecap() throws Exception {
		if(this.jInternalFrameDetalleFormRecap==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.recapConstantesFunciones.resaltaridRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jLabelidRecap.setBorder(this.recapConstantesFunciones.resaltaridRecap);}
		if(this.recapConstantesFunciones.resaltarid_empresaRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap.setBorder(this.recapConstantesFunciones.resaltarid_empresaRecap);}
		if(this.recapConstantesFunciones.resaltarid_sucursalRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap.setBorder(this.recapConstantesFunciones.resaltarid_sucursalRecap);}
		if(this.recapConstantesFunciones.resaltarid_ejercicioRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.setBorder(this.recapConstantesFunciones.resaltarid_ejercicioRecap);}
		if(this.recapConstantesFunciones.resaltarnumeroRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jTextFieldnumeroRecap.setBorder(this.recapConstantesFunciones.resaltarnumeroRecap);}
		if(this.recapConstantesFunciones.resaltarnumero_autorizacionRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jTextFieldnumero_autorizacionRecap.setBorder(this.recapConstantesFunciones.resaltarnumero_autorizacionRecap);}
		if(this.recapConstantesFunciones.resaltarfecha_inicioRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jDateChooserfecha_inicioRecap.setBorder(this.recapConstantesFunciones.resaltarfecha_inicioRecap);}
		if(this.recapConstantesFunciones.resaltarfecha_finalRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jDateChooserfecha_finalRecap.setBorder(this.recapConstantesFunciones.resaltarfecha_finalRecap);}
		if(this.recapConstantesFunciones.resaltarfecha_elaboracionRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jDateChooserfecha_elaboracionRecap.setBorder(this.recapConstantesFunciones.resaltarfecha_elaboracionRecap);}
		if(this.recapConstantesFunciones.resaltarfecha_caducidadRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jDateChooserfecha_caducidadRecap.setBorder(this.recapConstantesFunciones.resaltarfecha_caducidadRecap);}
		if(this.recapConstantesFunciones.resaltarmonto_ivaRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jTextFieldmonto_ivaRecap.setBorder(this.recapConstantesFunciones.resaltarmonto_ivaRecap);}
		if(this.recapConstantesFunciones.resaltarsin_monto_ivaRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jTextFieldsin_monto_ivaRecap.setBorder(this.recapConstantesFunciones.resaltarsin_monto_ivaRecap);}
		if(this.recapConstantesFunciones.resaltarivaRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jTextFieldivaRecap.setBorder(this.recapConstantesFunciones.resaltarivaRecap);}
		if(this.recapConstantesFunciones.resaltarotro_impuestoRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jTextFieldotro_impuestoRecap.setBorder(this.recapConstantesFunciones.resaltarotro_impuestoRecap);}
		if(this.recapConstantesFunciones.resaltarvalor_propuestoRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jTextFieldvalor_propuestoRecap.setBorder(this.recapConstantesFunciones.resaltarvalor_propuestoRecap);}
		if(this.recapConstantesFunciones.resaltarsubtotalRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jTextFieldsubtotalRecap.setBorder(this.recapConstantesFunciones.resaltarsubtotalRecap);}
		if(this.recapConstantesFunciones.resaltarfinancieroRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jTextFieldfinancieroRecap.setBorder(this.recapConstantesFunciones.resaltarfinancieroRecap);}
		if(this.recapConstantesFunciones.resaltartotalRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jTextFieldtotalRecap.setBorder(this.recapConstantesFunciones.resaltartotalRecap);}
		if(this.recapConstantesFunciones.resaltarvalor_cambioRecap!=null && this.jInternalFrameDetalleFormRecap!=null) {this.jInternalFrameDetalleFormRecap.jTextFieldvalor_cambioRecap.setBorder(this.recapConstantesFunciones.resaltarvalor_cambioRecap);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRecap() throws Exception {		
		if(this.jInternalFrameDetalleFormRecap==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRecap!=null) {
	
		//this.jInternalFrameDetalleFormRecap.jLabelidRecap.setVisible(this.recapConstantesFunciones.mostraridRecap);
		this.jInternalFrameDetalleFormRecap.jPanelidRecap.setVisible(this.recapConstantesFunciones.mostraridRecap);
		//this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap.setVisible(this.recapConstantesFunciones.mostrarid_empresaRecap);
		this.jInternalFrameDetalleFormRecap.jPanelid_empresaRecap.setVisible(this.recapConstantesFunciones.mostrarid_empresaRecap);
		//this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap.setVisible(this.recapConstantesFunciones.mostrarid_sucursalRecap);
		this.jInternalFrameDetalleFormRecap.jPanelid_sucursalRecap.setVisible(this.recapConstantesFunciones.mostrarid_sucursalRecap);
		//this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.setVisible(this.recapConstantesFunciones.mostrarid_ejercicioRecap);
		this.jInternalFrameDetalleFormRecap.jPanelid_ejercicioRecap.setVisible(this.recapConstantesFunciones.mostrarid_ejercicioRecap);
		//this.jInternalFrameDetalleFormRecap.jTextFieldnumeroRecap.setVisible(this.recapConstantesFunciones.mostrarnumeroRecap);
		this.jInternalFrameDetalleFormRecap.jPanelnumeroRecap.setVisible(this.recapConstantesFunciones.mostrarnumeroRecap);
		//this.jInternalFrameDetalleFormRecap.jTextFieldnumero_autorizacionRecap.setVisible(this.recapConstantesFunciones.mostrarnumero_autorizacionRecap);
		this.jInternalFrameDetalleFormRecap.jPanelnumero_autorizacionRecap.setVisible(this.recapConstantesFunciones.mostrarnumero_autorizacionRecap);
		//this.jInternalFrameDetalleFormRecap.jDateChooserfecha_inicioRecap.setVisible(this.recapConstantesFunciones.mostrarfecha_inicioRecap);
		this.jInternalFrameDetalleFormRecap.jPanelfecha_inicioRecap.setVisible(this.recapConstantesFunciones.mostrarfecha_inicioRecap);
		//this.jInternalFrameDetalleFormRecap.jDateChooserfecha_finalRecap.setVisible(this.recapConstantesFunciones.mostrarfecha_finalRecap);
		this.jInternalFrameDetalleFormRecap.jPanelfecha_finalRecap.setVisible(this.recapConstantesFunciones.mostrarfecha_finalRecap);
		//this.jInternalFrameDetalleFormRecap.jDateChooserfecha_elaboracionRecap.setVisible(this.recapConstantesFunciones.mostrarfecha_elaboracionRecap);
		this.jInternalFrameDetalleFormRecap.jPanelfecha_elaboracionRecap.setVisible(this.recapConstantesFunciones.mostrarfecha_elaboracionRecap);
		//this.jInternalFrameDetalleFormRecap.jDateChooserfecha_caducidadRecap.setVisible(this.recapConstantesFunciones.mostrarfecha_caducidadRecap);
		this.jInternalFrameDetalleFormRecap.jPanelfecha_caducidadRecap.setVisible(this.recapConstantesFunciones.mostrarfecha_caducidadRecap);
		//this.jInternalFrameDetalleFormRecap.jTextFieldmonto_ivaRecap.setVisible(this.recapConstantesFunciones.mostrarmonto_ivaRecap);
		this.jInternalFrameDetalleFormRecap.jPanelmonto_ivaRecap.setVisible(this.recapConstantesFunciones.mostrarmonto_ivaRecap);
		//this.jInternalFrameDetalleFormRecap.jTextFieldsin_monto_ivaRecap.setVisible(this.recapConstantesFunciones.mostrarsin_monto_ivaRecap);
		this.jInternalFrameDetalleFormRecap.jPanelsin_monto_ivaRecap.setVisible(this.recapConstantesFunciones.mostrarsin_monto_ivaRecap);
		//this.jInternalFrameDetalleFormRecap.jTextFieldivaRecap.setVisible(this.recapConstantesFunciones.mostrarivaRecap);
		this.jInternalFrameDetalleFormRecap.jPanelivaRecap.setVisible(this.recapConstantesFunciones.mostrarivaRecap);
		//this.jInternalFrameDetalleFormRecap.jTextFieldotro_impuestoRecap.setVisible(this.recapConstantesFunciones.mostrarotro_impuestoRecap);
		this.jInternalFrameDetalleFormRecap.jPanelotro_impuestoRecap.setVisible(this.recapConstantesFunciones.mostrarotro_impuestoRecap);
		//this.jInternalFrameDetalleFormRecap.jTextFieldvalor_propuestoRecap.setVisible(this.recapConstantesFunciones.mostrarvalor_propuestoRecap);
		this.jInternalFrameDetalleFormRecap.jPanelvalor_propuestoRecap.setVisible(this.recapConstantesFunciones.mostrarvalor_propuestoRecap);
		//this.jInternalFrameDetalleFormRecap.jTextFieldsubtotalRecap.setVisible(this.recapConstantesFunciones.mostrarsubtotalRecap);
		this.jInternalFrameDetalleFormRecap.jPanelsubtotalRecap.setVisible(this.recapConstantesFunciones.mostrarsubtotalRecap);
		//this.jInternalFrameDetalleFormRecap.jTextFieldfinancieroRecap.setVisible(this.recapConstantesFunciones.mostrarfinancieroRecap);
		this.jInternalFrameDetalleFormRecap.jPanelfinancieroRecap.setVisible(this.recapConstantesFunciones.mostrarfinancieroRecap);
		//this.jInternalFrameDetalleFormRecap.jTextFieldtotalRecap.setVisible(this.recapConstantesFunciones.mostrartotalRecap);
		this.jInternalFrameDetalleFormRecap.jPaneltotalRecap.setVisible(this.recapConstantesFunciones.mostrartotalRecap);
		//this.jInternalFrameDetalleFormRecap.jTextFieldvalor_cambioRecap.setVisible(this.recapConstantesFunciones.mostrarvalor_cambioRecap);
		this.jInternalFrameDetalleFormRecap.jPanelvalor_cambioRecap.setVisible(this.recapConstantesFunciones.mostrarvalor_cambioRecap);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRecap() throws Exception {
		if(this.jInternalFrameDetalleFormRecap==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRecap!=null) {
	
		this.jInternalFrameDetalleFormRecap.jLabelidRecap.setEnabled(this.recapConstantesFunciones.activaridRecap);
		this.jInternalFrameDetalleFormRecap.jComboBoxid_empresaRecap.setEnabled(this.recapConstantesFunciones.activarid_empresaRecap);
		this.jInternalFrameDetalleFormRecap.jComboBoxid_sucursalRecap.setEnabled(this.recapConstantesFunciones.activarid_sucursalRecap);
		this.jInternalFrameDetalleFormRecap.jComboBoxid_ejercicioRecap.setEnabled(this.recapConstantesFunciones.activarid_ejercicioRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldnumeroRecap.setEnabled(this.recapConstantesFunciones.activarnumeroRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldnumero_autorizacionRecap.setEnabled(this.recapConstantesFunciones.activarnumero_autorizacionRecap);
		this.jInternalFrameDetalleFormRecap.jDateChooserfecha_inicioRecap.setEnabled(this.recapConstantesFunciones.activarfecha_inicioRecap);
		this.jInternalFrameDetalleFormRecap.jDateChooserfecha_finalRecap.setEnabled(this.recapConstantesFunciones.activarfecha_finalRecap);
		this.jInternalFrameDetalleFormRecap.jDateChooserfecha_elaboracionRecap.setEnabled(this.recapConstantesFunciones.activarfecha_elaboracionRecap);
		this.jInternalFrameDetalleFormRecap.jDateChooserfecha_caducidadRecap.setEnabled(this.recapConstantesFunciones.activarfecha_caducidadRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldmonto_ivaRecap.setEnabled(this.recapConstantesFunciones.activarmonto_ivaRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldsin_monto_ivaRecap.setEnabled(this.recapConstantesFunciones.activarsin_monto_ivaRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldivaRecap.setEnabled(this.recapConstantesFunciones.activarivaRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldotro_impuestoRecap.setEnabled(this.recapConstantesFunciones.activarotro_impuestoRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldvalor_propuestoRecap.setEnabled(this.recapConstantesFunciones.activarvalor_propuestoRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldsubtotalRecap.setEnabled(this.recapConstantesFunciones.activarsubtotalRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldfinancieroRecap.setEnabled(this.recapConstantesFunciones.activarfinancieroRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldtotalRecap.setEnabled(this.recapConstantesFunciones.activartotalRecap);
		this.jInternalFrameDetalleFormRecap.jTextFieldvalor_cambioRecap.setEnabled(this.recapConstantesFunciones.activarvalor_cambioRecap);
		}
	}
	
		
}