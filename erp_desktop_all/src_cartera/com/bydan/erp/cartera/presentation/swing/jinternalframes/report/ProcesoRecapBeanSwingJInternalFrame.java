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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.cartera.util.ProcesoRecapConstantesFunciones;
import com.bydan.erp.cartera.util.report.ProcesoRecapParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.ProcesoRecapParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.ProcesoRecapBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

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
public class ProcesoRecapBeanSwingJInternalFrame extends ProcesoRecapJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoRecapBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoRecap> procesorecapValidator = new ClassValidator<ProcesoRecap>(ProcesoRecap.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoRecap procesorecap;	
	public ProcesoRecap procesorecapAux;
	public ProcesoRecap procesorecapAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoRecap procesorecapTotales;
	public Long idProcesoRecapActual;
	public Long iIdNuevoProcesoRecap=0L;
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
	
	public Boolean isPermisoTodoProcesoRecap;
	public Boolean isPermisoNuevoProcesoRecap;
	public Boolean isPermisoActualizarProcesoRecap;
	public Boolean isPermisoActualizarOriginalProcesoRecap;
	public Boolean isPermisoEliminarProcesoRecap;
	public Boolean isPermisoGuardarCambiosProcesoRecap;
	public Boolean isPermisoConsultaProcesoRecap;
	public Boolean isPermisoBusquedaProcesoRecap;
	public Boolean isPermisoReporteProcesoRecap;
	public Boolean isPermisoPaginacionMedioProcesoRecap;
	public Boolean isPermisoPaginacionAltoProcesoRecap;
	public Boolean isPermisoPaginacionTodoProcesoRecap;
	public Boolean isPermisoCopiarProcesoRecap;
	public Boolean isPermisoVerFormProcesoRecap;
	public Boolean isPermisoDuplicarProcesoRecap;
	public Boolean isPermisoOrdenProcesoRecap;
	
	
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
	
	public ProcesoRecapParameterReturnGeneral procesorecapReturnGeneral;
	public ProcesoRecapParameterReturnGeneral procesorecapParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoRecap=false;
	public Boolean esParaAccionDesdeFormularioProcesoRecap=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoRecapSessionBeanAdditional procesorecapSessionBeanAdditional=null;
	
	public ProcesoRecapSessionBeanAdditional getProcesoRecapSessionBeanAdditional() {
		return this.procesorecapSessionBeanAdditional;
	}
	
	public void setProcesoRecapSessionBeanAdditional(ProcesoRecapSessionBeanAdditional procesorecapSessionBeanAdditional) {
		try {
			this.procesorecapSessionBeanAdditional=procesorecapSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoRecapBeanSwingJInternalFrameAdditional procesorecapBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoRecapBeanSwingJInternalFrame
	
	public ProcesoRecapBeanSwingJInternalFrameAdditional getProcesoRecapBeanSwingJInternalFrameAdditional() {
		return this.procesorecapBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoRecapBeanSwingJInternalFrameAdditional(ProcesoRecapBeanSwingJInternalFrameAdditional procesorecapBeanSwingJInternalFrameAdditional) {
		try {
			this.procesorecapBeanSwingJInternalFrameAdditional=procesorecapBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoRecapLogic procesorecapLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoRecap procesorecapBean;
	public ProcesoRecapConstantesFunciones procesorecapConstantesFunciones;
	//public ProcesoRecapParameterReturnGeneral procesorecapReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoRecap> procesorecaps;	
	//public List<ProcesoRecap> procesorecapsEliminados;
	//public List<ProcesoRecap> procesorecapsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoRecap=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoRecap=true;
	public Boolean isVisibilidadCeldaCopiarProcesoRecap=true;
	public Boolean isVisibilidadCeldaVerFormProcesoRecap=true;
	public Boolean isVisibilidadCeldaOrdenProcesoRecap=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoRecap=false;
	public Boolean isVisibilidadCeldaModificarProcesoRecap=false;
	public Boolean isVisibilidadCeldaActualizarProcesoRecap=false;
	public Boolean isVisibilidadCeldaEliminarProcesoRecap=false;
	public Boolean isVisibilidadCeldaCancelarProcesoRecap=false;
	public Boolean isVisibilidadCeldaGuardarProcesoRecap=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoRecap=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoRecap=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProcesoRecap() {
		return this.iIdNuevoProcesoRecap;
	}

	public void setiIdNuevoProcesoRecap(Long iIdNuevoProcesoRecap) {
		this.iIdNuevoProcesoRecap = iIdNuevoProcesoRecap;
	}
	
	public Long getidProcesoRecapActual() {
		return this.idProcesoRecapActual;
	}

	public void setidProcesoRecapActual(Long idProcesoRecapActual) {
		this.idProcesoRecapActual = idProcesoRecapActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoRecap getprocesorecap() {
		return this.procesorecap;
	}

	public void setprocesorecap(ProcesoRecap procesorecap) {
		this.procesorecap = procesorecap;
	}
	
	public ProcesoRecap getprocesorecapAux() {
		return this.procesorecapAux;
	}

	public void setprocesorecapAux(ProcesoRecap procesorecapAux) {
		this.procesorecapAux = procesorecapAux;
	}				
	
	public ProcesoRecap getprocesorecapAnterior() {
		return this.procesorecapAnterior;
	}

	public void setprocesorecapAnterior(ProcesoRecap procesorecapAnterior) {
		this.procesorecapAnterior = procesorecapAnterior;
	}	
	
	public ProcesoRecap getprocesorecapTotales() {
		return this.procesorecapTotales;
	}

	public void setprocesorecapTotales(ProcesoRecap procesorecapTotales) {
		this.procesorecapTotales = procesorecapTotales;
	}	
	
	public ProcesoRecap getprocesorecapBean() {
		return this.procesorecapBean;
	}

	public void setprocesorecapBean(ProcesoRecap procesorecapBean) {
		this.procesorecapBean = procesorecapBean;
	}	
	
	public ProcesoRecapParameterReturnGeneral getprocesorecapReturnGeneral() {
		return this.procesorecapReturnGeneral;
	}

	public void setprocesorecapReturnGeneral(ProcesoRecapParameterReturnGeneral procesorecapReturnGeneral) {
		this.procesorecapReturnGeneral = procesorecapReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaProcesoRecap=-1L;

	public Long getid_ejercicioBusquedaProcesoRecap() {
		return this.id_ejercicioBusquedaProcesoRecap;
	}

	public void setid_ejercicioBusquedaProcesoRecap(Long id_ejercicioBusquedaProcesoRecap) {
		this.id_ejercicioBusquedaProcesoRecap = id_ejercicioBusquedaProcesoRecap;
	}

;
	public Date fecha_emision_desdeBusquedaProcesoRecap=new Date();

	public Date getfecha_emision_desdeBusquedaProcesoRecap() {
		return this.fecha_emision_desdeBusquedaProcesoRecap;
	}

	public void setfecha_emision_desdeBusquedaProcesoRecap(Date fecha_emision_desdeBusquedaProcesoRecap) {
		this.fecha_emision_desdeBusquedaProcesoRecap = fecha_emision_desdeBusquedaProcesoRecap;
	}

;
	public Date fecha_emision_hastaBusquedaProcesoRecap=new Date();

	public Date getfecha_emision_hastaBusquedaProcesoRecap() {
		return this.fecha_emision_hastaBusquedaProcesoRecap;
	}

	public void setfecha_emision_hastaBusquedaProcesoRecap(Date fecha_emision_hastaBusquedaProcesoRecap) {
		this.fecha_emision_hastaBusquedaProcesoRecap = fecha_emision_hastaBusquedaProcesoRecap;
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
	
	private Long id_proceso_recapProcesoRecapParam;
	private String numero_recapProcesoRecapParam;
	private String autorizacion_recapProcesoRecapParam;
	private Date fecha_recapProcesoRecapParam;
	
	
			
	
	public String getnumero_recapProcesoRecapParam() {
		return this.numero_recapProcesoRecapParam;
	}
			
	
	public String getautorizacion_recapProcesoRecapParam() {
		return this.autorizacion_recapProcesoRecapParam;
	}
			
	
	public Date getfecha_recapProcesoRecapParam() {
		return this.fecha_recapProcesoRecapParam;
	}
	
	
			
	public void setnumero_recapProcesoRecapParam(String newnumero_recap)throws Exception
	{
		try {
			if(this.numero_recapProcesoRecapParam!=newnumero_recap) {
				if(newnumero_recap==null) {
					//newnumero_recap="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoRecapParam:Valor nulo no permitido en columna numero_recap");
					}
				}

				if(newnumero_recap!=null&&newnumero_recap.length()>50) {
					newnumero_recap=newnumero_recap.substring(0,48);
					System.out.println("ProcesoRecapParam:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna numero_recap");
				}

				this.numero_recapProcesoRecapParam=newnumero_recap;
			}
		} catch(Exception e) {
			throw e;
		}
	}
			
	public void setautorizacion_recapProcesoRecapParam(String newautorizacion_recap)throws Exception
	{
		try {
			if(this.autorizacion_recapProcesoRecapParam!=newautorizacion_recap) {
				if(newautorizacion_recap==null) {
					//newautorizacion_recap="";
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoRecapParam:Valor nulo no permitido en columna autorizacion_recap");
					}
				}

				if(newautorizacion_recap!=null&&newautorizacion_recap.length()>50) {
					newautorizacion_recap=newautorizacion_recap.substring(0,48);
					System.out.println("ProcesoRecapParam:Ha sobrepasado el numero maximo de caracteres permitidos,Maximo=50 en columna autorizacion_recap");
				}

				this.autorizacion_recapProcesoRecapParam=newautorizacion_recap;
			}
		} catch(Exception e) {
			throw e;
		}
	}
			
	public void setfecha_recapProcesoRecapParam(Date newfecha_recap)throws Exception
	{
		try {
			if(this.fecha_recapProcesoRecapParam!=newfecha_recap) {
				if(newfecha_recap==null) {
					//newfecha_recap=new Date();
					if(Constantes.ISDEVELOPING) {
						System.out.println("ProcesoRecapParam:Valor nulo no permitido en columna fecha_recap");
					}
				}

				this.fecha_recapProcesoRecapParam=newfecha_recap;
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProcesoRecapLogic getProcesoRecapLogic()	{		
		return procesorecapLogic;
	}

	public void setProcesoRecapLogic(ProcesoRecapLogic procesorecapLogic) {
		this.procesorecapLogic = procesorecapLogic;
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
	
	public Boolean getIsEsNuevoProcesoRecap() {
		return isEsNuevoProcesoRecap;
	}

	public void setIsEsNuevoProcesoRecap(Boolean isEsNuevoProcesoRecap) {
		this.isEsNuevoProcesoRecap = isEsNuevoProcesoRecap;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoRecap() {
		return esParaAccionDesdeFormularioProcesoRecap;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoRecap(Boolean esParaAccionDesdeFormularioProcesoRecap) {
		this.esParaAccionDesdeFormularioProcesoRecap = esParaAccionDesdeFormularioProcesoRecap;
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

			if(this.procesorecapSessionBean==null) {
				this.procesorecapSessionBean=new ProcesoRecapSessionBean();
			}

			if(!this.procesorecapSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(procesorecapSessionBean.getlidEmpresaActual());
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

			if(this.procesorecapSessionBean==null) {
				this.procesorecapSessionBean=new ProcesoRecapSessionBean();
			}

			if(!this.procesorecapSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(procesorecapSessionBean.getlidSucursalActual());
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

			if(this.procesorecapSessionBean==null) {
				this.procesorecapSessionBean=new ProcesoRecapSessionBean();
			}

			if(!this.procesorecapSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(procesorecapSessionBean.getlidEjercicioActual());
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

					if(this.procesorecap!=null) {
						this.procesorecap.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
						this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProcesoRecap.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
						if(this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProcesoRecapGenerico)throws Exception
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
				jComboBoxid_empresaProcesoRecapGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProcesoRecapGenerico!=null && jComboBoxid_empresaProcesoRecapGenerico.getItemCount()>0) {
					jComboBoxid_empresaProcesoRecapGenerico.setSelectedIndex(0);
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

					if(this.procesorecap!=null) {
						this.procesorecap.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
						this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProcesoRecap.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
						if(this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProcesoRecapGenerico)throws Exception
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
				jComboBoxid_sucursalProcesoRecapGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProcesoRecapGenerico!=null && jComboBoxid_sucursalProcesoRecapGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProcesoRecapGenerico.setSelectedIndex(0);
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

					if(this.procesorecap!=null) {
						this.procesorecap.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
						this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioProcesoRecap.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
						if(this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoRecap") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap!=null) {
						jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap!=null) {
							//jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioProcesoRecapGenerico)throws Exception
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
				jComboBoxid_ejercicioProcesoRecapGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioProcesoRecapGenerico!=null && jComboBoxid_ejercicioProcesoRecapGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioProcesoRecapGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProcesoRecap procesorecap,JComboBox jComboBoxid_empresaProcesoRecapGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProcesoRecapGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProcesoRecapGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				procesorecap.setid_empresa(empresaAux.getId());
				procesorecap.setempresa_descripcion(ProcesoRecapConstantesFunciones.getEmpresaDescripcion(empresaAux));
				procesorecap.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProcesoRecap procesorecap,JComboBox jComboBoxid_sucursalProcesoRecapGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProcesoRecapGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProcesoRecapGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				procesorecap.setid_sucursal(sucursalAux.getId());
				procesorecap.setsucursal_descripcion(ProcesoRecapConstantesFunciones.getSucursalDescripcion(sucursalAux));
				procesorecap.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(ProcesoRecap procesorecap,JComboBox jComboBoxid_ejercicioProcesoRecapGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioProcesoRecapGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioProcesoRecapGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				procesorecap.setid_ejercicio(ejercicioAux.getId());
				procesorecap.setejercicio_descripcion(ProcesoRecapConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				procesorecap.setEjercicio(ejercicioAux);			}
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

					if(!ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecap!=null) { 
							this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoRecap!=null) { 
					}

					if(!ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecap!=null) { 
							this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoRecap!=null) { 
					}

					if(!ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecap!=null) { 
							this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoRecap!=null) { 
					}

					if(!ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoRecap") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap.addItem(ejercicio);
							}
						}

						if(!ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
							this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
							this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
							this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
							this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
							this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
							this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoRecap() throws Exception {
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
		
	public ProcesoRecapParameterReturnGeneral getProcesoRecapParameterGeneral() {
		return this.procesorecapParameterGeneral;
	}
	
	public void setProcesoRecapParameterGeneral(ProcesoRecapParameterReturnGeneral procesorecapParameterGeneral) {
		this.procesorecapParameterGeneral = procesorecapParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoRecap() {
		return isPermisoTodoProcesoRecap;
	}

	public void setIsPermisoTodoProcesoRecap(Boolean isPermisoTodoProcesoRecap) {
		this.isPermisoTodoProcesoRecap = isPermisoTodoProcesoRecap;
	}

	public Boolean getIsPermisoNuevoProcesoRecap() {
		return isPermisoNuevoProcesoRecap;
	}

	public void setIsPermisoNuevoProcesoRecap(Boolean isPermisoNuevoProcesoRecap) {
		this.isPermisoNuevoProcesoRecap = isPermisoNuevoProcesoRecap;
	}

	public Boolean getIsPermisoActualizarProcesoRecap() {
		return isPermisoActualizarProcesoRecap;
	}

	public void setIsPermisoActualizarProcesoRecap(Boolean isPermisoActualizarProcesoRecap) {
		this.isPermisoActualizarProcesoRecap = isPermisoActualizarProcesoRecap;
	}

	public Boolean getIsPermisoEliminarProcesoRecap() {
		return isPermisoEliminarProcesoRecap;
	}

	public void setIsPermisoEliminarProcesoRecap(Boolean isPermisoEliminarProcesoRecap) {
		this.isPermisoEliminarProcesoRecap = isPermisoEliminarProcesoRecap;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoRecap() {
		return isPermisoGuardarCambiosProcesoRecap;
	}

	public void setIsPermisoGuardarCambiosProcesoRecap(Boolean isPermisoGuardarCambiosProcesoRecap) {
		this.isPermisoGuardarCambiosProcesoRecap = isPermisoGuardarCambiosProcesoRecap;
	}
	
	public Boolean getIsPermisoConsultaProcesoRecap() {
		return isPermisoConsultaProcesoRecap;
	}

	public void setIsPermisoConsultaProcesoRecap(Boolean isPermisoConsultaProcesoRecap) {
		this.isPermisoConsultaProcesoRecap = isPermisoConsultaProcesoRecap;
	}

	public Boolean getIsPermisoBusquedaProcesoRecap() {
		return isPermisoBusquedaProcesoRecap;
	}

	public void setIsPermisoBusquedaProcesoRecap(Boolean isPermisoBusquedaProcesoRecap) {
		this.isPermisoBusquedaProcesoRecap = isPermisoBusquedaProcesoRecap;
	}

	public Boolean getIsPermisoReporteProcesoRecap() {
		return isPermisoReporteProcesoRecap;
	}

	public void setIsPermisoReporteProcesoRecap(Boolean isPermisoReporteProcesoRecap) {
		this.isPermisoReporteProcesoRecap = isPermisoReporteProcesoRecap;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoRecap() {
		return isPermisoPaginacionMedioProcesoRecap;
	}

	public void setIsPermisoPaginacionMedioProcesoRecap(Boolean isPermisoPaginacionMedioProcesoRecap) {
		this.isPermisoPaginacionMedioProcesoRecap = isPermisoPaginacionMedioProcesoRecap;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoRecap() {
		return isPermisoPaginacionTodoProcesoRecap;
	}

	public void setIsPermisoPaginacionTodoProcesoRecap(Boolean isPermisoPaginacionTodoProcesoRecap) {
		this.isPermisoPaginacionTodoProcesoRecap = isPermisoPaginacionTodoProcesoRecap;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoRecap() {
		return isPermisoPaginacionAltoProcesoRecap;
	}

	public void setIsPermisoPaginacionAltoProcesoRecap(Boolean isPermisoPaginacionAltoProcesoRecap) {
		this.isPermisoPaginacionAltoProcesoRecap = isPermisoPaginacionAltoProcesoRecap;
	}
	
	public Boolean getIsPermisoCopiarProcesoRecap() {
		return isPermisoCopiarProcesoRecap;
	}

	public void setIsPermisoCopiarProcesoRecap(Boolean isPermisoCopiarProcesoRecap) {
		this.isPermisoCopiarProcesoRecap = isPermisoCopiarProcesoRecap;
	}
	
	public Boolean getIsPermisoVerFormProcesoRecap() {
		return isPermisoVerFormProcesoRecap;
	}

	public void setIsPermisoVerFormProcesoRecap(Boolean isPermisoVerFormProcesoRecap) {
		this.isPermisoVerFormProcesoRecap = isPermisoVerFormProcesoRecap;
	}
	
	public Boolean getIsPermisoDuplicarProcesoRecap() {
		return isPermisoDuplicarProcesoRecap;
	}

	public void setIsPermisoDuplicarProcesoRecap(Boolean isPermisoDuplicarProcesoRecap) {
		this.isPermisoDuplicarProcesoRecap = isPermisoDuplicarProcesoRecap;
	}
	
	public Boolean getIsPermisoOrdenProcesoRecap() {
		return isPermisoOrdenProcesoRecap;
	}

	public void setIsPermisoOrdenProcesoRecap(Boolean isPermisoOrdenProcesoRecap) {
		this.isPermisoOrdenProcesoRecap = isPermisoOrdenProcesoRecap;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoRecap() {
		return isVisibilidadCeldaNuevoProcesoRecap;
	}

	public void setIsVisibilidadCeldaNuevoProcesoRecap(Boolean isVisibilidadCeldaNuevoProcesoRecap) {
		this.isVisibilidadCeldaNuevoProcesoRecap = isVisibilidadCeldaNuevoProcesoRecap;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoRecap() {
		return isVisibilidadCeldaDuplicarProcesoRecap;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoRecap(Boolean isVisibilidadCeldaDuplicarProcesoRecap) {
		this.isVisibilidadCeldaDuplicarProcesoRecap = isVisibilidadCeldaDuplicarProcesoRecap;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoRecap() {
		return isVisibilidadCeldaCopiarProcesoRecap;
	}

	public void setIsVisibilidadCeldaCopiarProcesoRecap(Boolean isVisibilidadCeldaCopiarProcesoRecap) {
		this.isVisibilidadCeldaCopiarProcesoRecap = isVisibilidadCeldaCopiarProcesoRecap;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoRecap() {
		return isVisibilidadCeldaVerFormProcesoRecap;
	}

	public void setIsVisibilidadCeldaVerFormProcesoRecap(Boolean isVisibilidadCeldaVerFormProcesoRecap) {
		this.isVisibilidadCeldaVerFormProcesoRecap = isVisibilidadCeldaVerFormProcesoRecap;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoRecap() {
		return isVisibilidadCeldaOrdenProcesoRecap;
	}

	public void setIsVisibilidadCeldaOrdenProcesoRecap(Boolean isVisibilidadCeldaOrdenProcesoRecap) {
		this.isVisibilidadCeldaOrdenProcesoRecap = isVisibilidadCeldaOrdenProcesoRecap;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoRecap() {
		return isVisibilidadCeldaNuevoRelacionesProcesoRecap;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoRecap(Boolean isVisibilidadCeldaNuevoRelacionesProcesoRecap) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoRecap = isVisibilidadCeldaNuevoRelacionesProcesoRecap;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoRecap() {
		return isVisibilidadCeldaModificarProcesoRecap;
	}

	public void setIsVisibilidadCeldaModificarProcesoRecap(Boolean isVisibilidadCeldaModificarProcesoRecap) {
		this.isVisibilidadCeldaModificarProcesoRecap = isVisibilidadCeldaModificarProcesoRecap;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoRecap() {
		return isVisibilidadCeldaActualizarProcesoRecap;
	}

	public void setIsVisibilidadCeldaActualizarProcesoRecap(Boolean isVisibilidadCeldaActualizarProcesoRecap) {
		this.isVisibilidadCeldaActualizarProcesoRecap = isVisibilidadCeldaActualizarProcesoRecap;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoRecap() {
		return isVisibilidadCeldaEliminarProcesoRecap;
	}

	public void setIsVisibilidadCeldaEliminarProcesoRecap(Boolean isVisibilidadCeldaEliminarProcesoRecap) {
		this.isVisibilidadCeldaEliminarProcesoRecap = isVisibilidadCeldaEliminarProcesoRecap;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoRecap() {
		return isVisibilidadCeldaCancelarProcesoRecap;
	}

	public void setIsVisibilidadCeldaCancelarProcesoRecap(Boolean isVisibilidadCeldaCancelarProcesoRecap) {
		this.isVisibilidadCeldaCancelarProcesoRecap = isVisibilidadCeldaCancelarProcesoRecap;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoRecap() {
		return isVisibilidadCeldaGuardarProcesoRecap;
	}

	public void setIsVisibilidadCeldaGuardarProcesoRecap(Boolean isVisibilidadCeldaGuardarProcesoRecap) {
		this.isVisibilidadCeldaGuardarProcesoRecap = isVisibilidadCeldaGuardarProcesoRecap;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoRecap() {
		return isVisibilidadCeldaGuardarCambiosProcesoRecap;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoRecap(Boolean isVisibilidadCeldaGuardarCambiosProcesoRecap) {
		this.isVisibilidadCeldaGuardarCambiosProcesoRecap = isVisibilidadCeldaGuardarCambiosProcesoRecap;
	}
		
	public ProcesoRecapSessionBean getprocesorecapSessionBean() {
		return this.procesorecapSessionBean;
	}
	
	public void setprocesorecapSessionBean(ProcesoRecapSessionBean procesorecapSessionBean) {
		this.procesorecapSessionBean=procesorecapSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoRecap() {
		return this.isVisibilidadBusquedaProcesoRecap;
	}

	public void setisVisibilidadBusquedaProcesoRecap(Boolean isVisibilidadBusquedaProcesoRecap) {
		this.isVisibilidadBusquedaProcesoRecap=isVisibilidadBusquedaProcesoRecap;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(ProcesoRecap procesorecap)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(procesorecap,null);
				this.setActualParaGuardarSucursalForeignKey(procesorecap,null);
				this.setActualParaGuardarEjercicioForeignKey(procesorecap,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoRecap procesorecap,ProcesoRecap procesorecapAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoRecap(procesorecap);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesorecapAux.setId(procesorecap.getId());
		procesorecapAux.setVersionRow(procesorecap.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoRecap procesorecapLocal) throws Exception {
		
		if(this.procesorecapSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoRecap procesorecapLocal) throws Exception {	
		if(this.procesorecapSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				procesorecapLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				procesorecapLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				procesorecapLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoRecapActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesorecapValidator.getInvalidValues(this.procesorecap);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoRecap procesorecap,List<ProcesoRecap> procesorecaps) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoRecap procesorecap,List<ProcesoRecap> procesorecaps) throws Exception {
		try	{			
			ProcesoRecapConstantesFunciones.actualizarSelectedLista(procesorecap,procesorecaps);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoRecap> procesorecapsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesorecapsLocal=this.procesorecapLogic.getProcesoRecaps();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesorecapsLocal=this.procesorecaps;
			}
			//ARCHITECTURE
		
			for(ProcesoRecap procesorecapLocal:procesorecapsLocal) {
				if(this.permiteMantenimiento(procesorecapLocal) && procesorecapLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoRecapConstantesFunciones.getProcesoRecapLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoRecapConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecap.jLabelnombre_completo_clienteProcesoRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoRecapConstantesFunciones.NUMEROPREIMPRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecap.jLabelnumero_pre_impresoProcesoRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoRecapConstantesFunciones.NOMBRETRANSACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecap.jLabelnombre_transaccionProcesoRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoRecapConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecap.jLabelfecha_emisionProcesoRecap,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoRecapConstantesFunciones.MONTOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecap.jLabelmonto_mone_localProcesoRecap,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoRecap.jLabelnombre_completo_clienteProcesoRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoRecap.jLabelnumero_pre_impresoProcesoRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoRecap.jLabelnombre_transaccionProcesoRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoRecap.jLabelfecha_emisionProcesoRecap,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoRecap.jLabelmonto_mone_localProcesoRecap,"");
		
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
		this.iIdNuevoProcesoRecap--;	
		
		
		this.procesorecapAux=new ProcesoRecap();
		
		this.procesorecapAux.setId(this.iIdNuevoProcesoRecap);
		this.procesorecapAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesorecapLogic.getProcesoRecaps().add(this.procesorecapAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesorecaps.add(this.procesorecapAux);
		}
		//ARCHITECTURE
		
		this.procesorecap=this.procesorecapAux;
		
		if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoRecap(this.procesorecap);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoRecap(this.procesorecap);
		}
				
		//this.setDefaultControlesProcesoRecap();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoRecap();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoRecap();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoRecap();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoRecap(this.procesorecapBean,this.procesorecap,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoRecap(this.procesorecapReturnGeneral,this.procesorecapBean,false);
		
		if(this.procesorecapReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoRecap(this.procesorecapReturnGeneral.getProcesoRecap());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoRecap(this.procesorecapReturnGeneral.getProcesoRecap());
		}
		
		if(this.procesorecapReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoRecap(this.procesorecapReturnGeneral.getProcesoRecap(),classes);//this.procesorecapBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoRecap();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoRecap();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoRecapBeanSwingJInternalFrameAdditional.RecargarFormProcesoRecap(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoRecap(false);
						
			if(procesorecapSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoRecap();
			}
			
			this.actualizarVisualTableDatosProcesoRecap();
			
			this.jTableDatosProcesoRecap.setRowSelectionInterval(this.getIndiceNuevoProcesoRecap(), this.getIndiceNuevoProcesoRecap());
			
			this.seleccionarFilaTablaProcesoRecapActual();
						
			this.actualizarEstadoCeldasBotonesProcesoRecap("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoRecap(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emision_desdeProcesoRecap.setEnabled(isHabilitar && this.procesorecapConstantesFunciones.activarfecha_emision_desdeProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emision_hastaProcesoRecap.setEnabled(isHabilitar && this.procesorecapConstantesFunciones.activarfecha_emision_hastaProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_completo_clienteProcesoRecap.setEnabled(isHabilitar && this.procesorecapConstantesFunciones.activarnombre_completo_clienteProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jTextFieldnumero_pre_impresoProcesoRecap.setEnabled(isHabilitar && this.procesorecapConstantesFunciones.activarnumero_pre_impresoProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_transaccionProcesoRecap.setEnabled(isHabilitar && this.procesorecapConstantesFunciones.activarnombre_transaccionProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emisionProcesoRecap.setEnabled(isHabilitar && this.procesorecapConstantesFunciones.activarfecha_emisionProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jTextFieldmonto_mone_localProcesoRecap.setEnabled(isHabilitar && this.procesorecapConstantesFunciones.activarmonto_mone_localProcesoRecap);	
		//
		this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap.setEnabled(isHabilitar && this.procesorecapConstantesFunciones.activarid_empresaProcesoRecap);//
		this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap.setEnabled(isHabilitar && this.procesorecapConstantesFunciones.activarid_sucursalProcesoRecap);//
		this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.setEnabled(isHabilitar && this.procesorecapConstantesFunciones.activarid_ejercicioProcesoRecap);
	};
	
	public void setDefaultControlesProcesoRecap() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoRecap(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesorecapSessionBean.setConGuardarRelaciones(true);			
			this.procesorecapSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoRecap.jTabbedPaneRelacionesProcesoRecap.setVisible(true);
			
					
		} else {
			//this.procesorecapSessionBean.setConGuardarRelaciones(false);			
			this.procesorecapSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoRecap.jTabbedPaneRelacionesProcesoRecap.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoRecap() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoRecap procesorecapAux:this.procesorecapLogic.getProcesoRecaps()) {
				if(procesorecapAux.getId().equals(this.iIdNuevoProcesoRecap)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoRecap procesorecapAux:this.procesorecaps) {
				if(procesorecapAux.getId().equals(this.iIdNuevoProcesoRecap)) {
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
	
	public int getIndiceActualProcesoRecap(ProcesoRecap procesorecap,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoRecap procesorecapAux:this.procesorecapLogic.getProcesoRecaps()) {
				if(procesorecapAux.getId().equals(procesorecap.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoRecap procesorecapAux:this.procesorecaps) {
				if(procesorecapAux.getId().equals(procesorecap.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoRecap(ProcesoRecap procesorecapOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoRecap procesorecapAux:this.procesorecapLogic.getProcesoRecaps()) {
				if(procesorecapAux.getProcesoRecapOriginal().getId().equals(procesorecapOriginal.getId())) {
					existe=true;
					procesorecapOriginal.setId(procesorecapAux.getId());
					procesorecapOriginal.setVersionRow(procesorecapAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoRecap procesorecapAux:this.procesorecaps) {
				if(procesorecapAux.getProcesoRecapOriginal().getId().equals(procesorecapOriginal.getId())) {
					existe=true;
					procesorecapOriginal.setId(procesorecapAux.getId());
					procesorecapOriginal.setVersionRow(procesorecapAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoRecap(Boolean esParaCancelar) throws Exception {
		procesorecapsAux=new ArrayList<ProcesoRecap>();
		procesorecapAux=new ProcesoRecap();
		
		if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoRecap procesorecapAux:this.procesorecapLogic.getProcesoRecaps()) {
					if(procesorecapAux.getId()<0) {
						procesorecapsAux.add(procesorecapAux);
					}		
				}
				this.iIdNuevoProcesoRecap=0L;
				this.procesorecapLogic.getProcesoRecaps().removeAll(procesorecapsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoRecap procesorecapAux:this.procesorecaps) {
					if(procesorecapAux.getId()<0) {
						procesorecapsAux.add(procesorecapAux);
					}		
				}
				this.iIdNuevoProcesoRecap=0L;
				this.procesorecaps.removeAll(procesorecapsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoRecap 
					&& this.procesorecapLogic.getProcesoRecaps().size()>0
					) {
					procesorecapAux=this.procesorecapLogic.getProcesoRecaps().get(this.procesorecapLogic.getProcesoRecaps().size() - 1);
				
					if(procesorecapAux.getId()<0) {
						this.procesorecapLogic.getProcesoRecaps().remove(procesorecapAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoRecap && this.procesorecaps.size()>0) {
					procesorecapAux=this.procesorecaps.get(this.procesorecaps.size() - 1);
				
					if(procesorecapAux.getId()<0) {
						this.procesorecaps.remove(procesorecapAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoRecap(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesorecap.getId()<0) {
				this.procesorecapLogic.getProcesoRecaps().remove(this.procesorecap);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesorecap.getId()<0) {
				this.procesorecaps.remove(this.procesorecap);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoRecap(List<ProcesoRecap> procesorecapsAux) throws Exception {
		ProcesoRecapConstantesFunciones.setEstadosInicialesProcesoRecap(procesorecapsAux);
	}
	
	public void setEstadosInicialesProcesoRecap(ProcesoRecap procesorecapAux) throws Exception {
		ProcesoRecapConstantesFunciones.setEstadosInicialesProcesoRecap(procesorecapAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoRecapActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoRecapActual()) {
				if(!this.isEsNuevoProcesoRecap) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoRecap=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoRecapActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Recap ?", "MANTENIMIENTO DE Proceso Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoRecap procesorecap) throws Exception {
		ProcesoRecapConstantesFunciones.seleccionarAsignar(this.procesorecap,procesorecap);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoRecap=this.isPermisoActualizarOriginalProcesoRecap;
			
			
			this.seleccionarAsignar(procesorecap);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoRecap("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesorecapSessionBean.setsFuncionBusquedaRapida(this.procesorecapSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoRecap) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoRecap(esParaCancelar);				
				this.cancelarNuevoProcesoRecap(esParaCancelar);								
			}
			
			this.procesorecap=new ProcesoRecap();
			
			this.inicializarProcesoRecap();
			
			this.actualizarEstadoCeldasBotonesProcesoRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoRecap() throws Exception {
		try {
			ProcesoRecapConstantesFunciones.inicializarProcesoRecap(this.procesorecap);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesorecapLogic.getProcesoRecaps().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoRecaps(String sAccionBusqueda,List<ProcesoRecap> procesorecapsParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoRecap"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoRecapMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoRecapMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoRecap"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Recapes");		
		parameters.put("busquedapor", ProcesoRecapConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoRecap=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProcesoRecapConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProcesoRecapConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProcesoRecap=new JRBeanArrayDataSource(ProcesoRecapJInternalFrame.TraerProcesoRecapBeans(procesorecapsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoRecap);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoRecapConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoRecapConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoRecapBean.TraerProcesoRecapBeans(procesorecapsParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoRecaps(sAccionBusqueda,sTipoArchivoReporte,procesorecapsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoRecaps(sAccionBusqueda,sTipoArchivoReporte,procesorecapsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoRecapActionPerformed(null);
					//this.generarExcelReporteProcesoRecaps(sAccionBusqueda,sTipoArchivoReporte,procesorecapsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoRecaps(sAccionBusqueda,sTipoArchivoReporte,procesorecapsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoRecaps(sAccionBusqueda,sTipoArchivoReporte,procesorecapsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoRecaps(sAccionBusqueda,sTipoArchivoReporte,procesorecapsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoRecaps(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoRecap> procesorecapsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesorecap";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoRecaps");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoRecap("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoRecap procesorecap : procesorecapsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoRecapConstantesFunciones.generarExcelReporteDataProcesoRecap("NORMAL",row,workbook,procesorecap,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recap",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoRecap(String sTipo,Row row,Workbook workbook) {
		
		ProcesoRecapConstantesFunciones.generarExcelReporteHeaderProcesoRecap(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoRecaps(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoRecap> procesorecapsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesorecap_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoRecaps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoRecap procesorecap : procesorecapsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoRecapConstantesFunciones.getProcesoRecapDescripcion(procesorecap));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecapConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecap.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecapConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecap.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecapConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecap.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecap.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecap.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecap.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecap.getnumero_pre_impreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecap.getnombre_transaccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecap.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesorecap.getmonto_mone_local());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recap",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoRecaps(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoRecap> procesorecapsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoRecap> procesorecapsRespaldo=null;
		
		classes=ProcesoRecapConstantesFunciones.getClassesRelationshipsOfProcesoRecap(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesorecapLogic.setDatosCliente(this.datosCliente);
		this.procesorecapLogic.setDatosDeep(this.datosDeep);
		this.procesorecapLogic.setIsConDeep(true);
		
		procesorecapsRespaldo=this.procesorecapLogic.getProcesoRecaps();
		
		this.procesorecapLogic.setProcesoRecaps(procesorecapsParaReportes);	
		this.procesorecapLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesorecapsParaReportes=this.procesorecapLogic.getProcesoRecaps();
		this.procesorecapLogic.setProcesoRecaps(procesorecapsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesorecap_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoRecaps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoRecap("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoRecap procesorecap : procesorecapsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoRecap("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoRecapConstantesFunciones.generarExcelReporteDataProcesoRecap("NORMAL",row,workbook,procesorecap,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoRecapConstantesFunciones.getProcesoRecapDescripcion(procesorecap));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recap",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoRecap.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoRecap.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoRecap.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoRecap.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoRecap() throws Exception {		
		this.startProcessProcesoRecap(true);
	}
	
	public void startProcessProcesoRecap(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoRecap ,this.jPanelParametrosReportesProcesoRecap, this.jScrollPanelDatosProcesoRecap,this.jPanelPaginacionProcesoRecap, this.jScrollPanelDatosEdicionProcesoRecap, this.jPanelAccionesProcesoRecap,this.jPanelAccionesFormularioProcesoRecap,this.jmenuBarProcesoRecap,this.jmenuBarDetalleProcesoRecap,this.jTtoolBarProcesoRecap,this.jTtoolBarDetalleProcesoRecap);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoRecap=this.jTabbedPaneBusquedasProcesoRecap; 
		
		final JPanel jPanelParametrosReportesProcesoRecap=this.jPanelParametrosReportesProcesoRecap;
		//final JScrollPane jScrollPanelDatosProcesoRecap=this.jScrollPanelDatosProcesoRecap;
		final JTable jTableDatosProcesoRecap=this.jTableDatosProcesoRecap;		
		final JPanel jPanelPaginacionProcesoRecap=this.jPanelPaginacionProcesoRecap;
		//final JScrollPane jScrollPanelDatosEdicionProcesoRecap=this.jScrollPanelDatosEdicionProcesoRecap;
		final JPanel jPanelAccionesProcesoRecap=this.jPanelAccionesProcesoRecap;
		
		JPanel jPanelCamposAuxiliarProcesoRecap=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoRecap=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
			jPanelCamposAuxiliarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jPanelCamposProcesoRecap;
			jPanelAccionesFormularioAuxiliarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jPanelAccionesFormularioProcesoRecap;
		}
		
		final JPanel jPanelCamposProcesoRecap=jPanelCamposAuxiliarProcesoRecap;
		final JPanel jPanelAccionesFormularioProcesoRecap=jPanelAccionesFormularioAuxiliarProcesoRecap;
		
		
		final JMenuBar jmenuBarProcesoRecap=this.jmenuBarProcesoRecap;
		final JToolBar jTtoolBarProcesoRecap=this.jTtoolBarProcesoRecap;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoRecap=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoRecap=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
			jmenuBarDetalleAuxiliarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jmenuBarDetalleProcesoRecap;
			jTtoolBarDetalleAuxiliarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jTtoolBarDetalleProcesoRecap;
		}
		
		final JMenuBar jmenuBarDetalleProcesoRecap=jmenuBarDetalleAuxiliarProcesoRecap;
		final JToolBar jTtoolBarDetalleProcesoRecap=jTtoolBarDetalleAuxiliarProcesoRecap;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoRecap;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoRecap;
			processRunnable.jTableDatos=jTableDatosProcesoRecap;
			processRunnable.jPanelCampos=jPanelCamposProcesoRecap;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoRecap;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoRecap;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoRecap;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoRecap;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoRecap;
			processRunnable.jTtoolBar=jTtoolBarProcesoRecap;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoRecap;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoRecap ,jPanelParametrosReportesProcesoRecap,jTableDatosProcesoRecap, /*jScrollPanelDatosProcesoRecap,*/jPanelCamposProcesoRecap,jPanelPaginacionProcesoRecap, /*jScrollPanelDatosEdicionProcesoRecap,*/ jPanelAccionesProcesoRecap,jPanelAccionesFormularioProcesoRecap,jmenuBarProcesoRecap,jmenuBarDetalleProcesoRecap,jTtoolBarProcesoRecap,jTtoolBarDetalleProcesoRecap);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoRecap ,jPanelParametrosReportesProcesoRecap, jScrollPanelDatosProcesoRecap,jPanelPaginacionProcesoRecap, jScrollPanelDatosEdicionProcesoRecap, jPanelAccionesProcesoRecap,jPanelAccionesFormularioProcesoRecap,jmenuBarProcesoRecap,jmenuBarDetalleProcesoRecap,jTtoolBarProcesoRecap,jTtoolBarDetalleProcesoRecap);
						
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
	
	public void finishProcessProcesoRecap() {// throws Exception 
		this.finishProcessProcesoRecap(true);
	}
	
	public void finishProcessProcesoRecap(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoRecap ,this.jPanelParametrosReportesProcesoRecap, this.jScrollPanelDatosProcesoRecap,this.jPanelPaginacionProcesoRecap, this.jScrollPanelDatosEdicionProcesoRecap, this.jPanelAccionesProcesoRecap,this.jPanelAccionesFormularioProcesoRecap,this.jmenuBarProcesoRecap,this.jmenuBarDetalleProcesoRecap,this.jTtoolBarProcesoRecap,this.jTtoolBarDetalleProcesoRecap);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoRecap=this.jTabbedPaneBusquedasProcesoRecap; 
		
		final JPanel jPanelParametrosReportesProcesoRecap=this.jPanelParametrosReportesProcesoRecap;
		//final JScrollPane jScrollPanelDatosProcesoRecap=this.jScrollPanelDatosProcesoRecap;
		final JTable jTableDatosProcesoRecap=this.jTableDatosProcesoRecap;		
		final JPanel jPanelPaginacionProcesoRecap=this.jPanelPaginacionProcesoRecap;
		//final JScrollPane jScrollPanelDatosEdicionProcesoRecap=this.jScrollPanelDatosEdicionProcesoRecap;
		final JPanel jPanelAccionesProcesoRecap=this.jPanelAccionesProcesoRecap;
		
		JPanel jPanelCamposAuxiliarProcesoRecap=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoRecap=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
			jPanelCamposAuxiliarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jPanelCamposProcesoRecap;
			jPanelAccionesFormularioAuxiliarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jPanelAccionesFormularioProcesoRecap;
		}
		
		final JPanel jPanelCamposProcesoRecap=jPanelCamposAuxiliarProcesoRecap;
		final JPanel jPanelAccionesFormularioProcesoRecap=jPanelAccionesFormularioAuxiliarProcesoRecap;
		
		
		final JMenuBar jmenuBarProcesoRecap=this.jmenuBarProcesoRecap;		
		final JToolBar jTtoolBarProcesoRecap=this.jTtoolBarProcesoRecap;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoRecap=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoRecap=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
			jmenuBarDetalleAuxiliarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jmenuBarDetalleProcesoRecap;
			jTtoolBarDetalleAuxiliarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jTtoolBarDetalleProcesoRecap;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoRecap=jmenuBarDetalleAuxiliarProcesoRecap;
		final JToolBar jTtoolBarDetalleProcesoRecap=jTtoolBarDetalleAuxiliarProcesoRecap;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoRecap;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoRecap;
			processRunnable.jTableDatos=jTableDatosProcesoRecap;
			processRunnable.jPanelCampos=jPanelCamposProcesoRecap;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoRecap;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoRecap;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoRecap;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoRecap;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoRecap;
			processRunnable.jTtoolBar=jTtoolBarProcesoRecap;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoRecap;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoRecap ,jPanelParametrosReportesProcesoRecap, jTableDatosProcesoRecap,/*jScrollPanelDatosProcesoRecap,*/jPanelCamposProcesoRecap,jPanelPaginacionProcesoRecap, /*jScrollPanelDatosEdicionProcesoRecap,*/ jPanelAccionesProcesoRecap,jPanelAccionesFormularioProcesoRecap,jmenuBarProcesoRecap,jmenuBarDetalleProcesoRecap,jTtoolBarProcesoRecap,jTtoolBarDetalleProcesoRecap));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoRecap(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoRecap(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoRecap(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoRecap(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoRecap,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoRecap,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoRecap(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoRecap,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoRecap,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesorecapConstantesFunciones.getsFinalQueryProcesoRecap();
		String  finalQueryPaginacionTodos=this.procesorecapConstantesFunciones.getsFinalQueryProcesoRecap();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoRecapConstantesFunciones.getArrayColumnasGlobalesNoProcesoRecap(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoRecapConstantesFunciones.getArrayColumnasGlobalesProcesoRecap(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoRecapConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesorecapsEliminados= new ArrayList<ProcesoRecap>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoRecap();
		
				///*ProcesoRecapSessionBean*/this.procesorecapSessionBean=new ProcesoRecapSessionBean();
			
			if(this.procesorecapSessionBean==null) {
				this.procesorecapSessionBean=new ProcesoRecapSessionBean();
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
					this.iNumeroPaginacion=ProcesoRecapConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoRecapConstantesFunciones.getClassesForeignKeysOfProcesoRecap(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesorecap."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesorecapsAux= new ArrayList<ProcesoRecap>();
			
				
			procesorecapLogic.setDatosCliente(this.datosCliente);
			procesorecapLogic.setDatosDeep(this.datosDeep);
			procesorecapLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoRecap")) {
				this.sDetalleReporte=ProcesoRecapConstantesFunciones.getDetalleIndiceBusquedaProcesoRecap(id_ejercicioBusquedaProcesoRecap,fecha_emision_desdeBusquedaProcesoRecap,fecha_emision_hastaBusquedaProcesoRecap);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesorecapLogic.getProcesoRecapsBusquedaProcesoRecap(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaProcesoRecap,fecha_emision_desdeBusquedaProcesoRecap,fecha_emision_hastaBusquedaProcesoRecap);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoRecapConstantesFunciones.getDetalleIndiceBusquedaProcesoRecap(id_ejercicioBusquedaProcesoRecap,fecha_emision_desdeBusquedaProcesoRecap,fecha_emision_hastaBusquedaProcesoRecap);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoRecapConstantesFunciones.getDetalleIndiceBusquedaProcesoRecap(id_ejercicioBusquedaProcesoRecap,fecha_emision_desdeBusquedaProcesoRecap,fecha_emision_hastaBusquedaProcesoRecap);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesorecapLogic.getProcesoRecaps()==null||procesorecapLogic.getProcesoRecaps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesorecaps==null|| procesorecaps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesorecapsAux=new ArrayList<ProcesoRecap>();
						procesorecapsAux.addAll(procesorecapLogic.getProcesoRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesorecapsAux=new ArrayList<ProcesoRecap>();
							procesorecapsAux.addAll(procesorecaps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesorecapLogic.getProcesoRecapsBusquedaProcesoRecap(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaProcesoRecap,fecha_emision_desdeBusquedaProcesoRecap,fecha_emision_hastaBusquedaProcesoRecap);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoRecapConstantesFunciones.getDetalleIndiceBusquedaProcesoRecap(id_ejercicioBusquedaProcesoRecap,fecha_emision_desdeBusquedaProcesoRecap,fecha_emision_hastaBusquedaProcesoRecap);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoRecapConstantesFunciones.getDetalleIndiceBusquedaProcesoRecap(id_ejercicioBusquedaProcesoRecap,fecha_emision_desdeBusquedaProcesoRecap,fecha_emision_hastaBusquedaProcesoRecap);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoRecaps("BusquedaProcesoRecap",procesorecapLogic.getProcesoRecaps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoRecaps("BusquedaProcesoRecap",procesorecaps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesorecapLogic.setProcesoRecaps(new ArrayList<ProcesoRecap>());
						procesorecapLogic.getProcesoRecaps().addAll(procesorecapsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesorecaps=new ArrayList<ProcesoRecap>();
							procesorecaps.addAll(procesorecapsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoRecap();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoRecap();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesorecapLogic.getProcesoRecaps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesorecaps.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesorecapLogic.getProcesoRecaps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesorecaps.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoRecap procesorecap) {
		Boolean permite=true;
		
		if(this.procesorecap.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoRecapConstantesFunciones.getOrderByListaProcesoRecap();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoRecapConstantesFunciones.getOrderByListaProcesoRecap();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoRecap procesorecap:procesorecapLogic.getProcesoRecaps()) {
				if(procesorecap.getsType().equals(Constantes2.S_TOTALES)) {
					procesorecapTotales=procesorecap;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoRecap procesorecap:this.procesorecaps) {
				if(procesorecap.getsType().equals(Constantes2.S_TOTALES)) {
					procesorecapTotales=procesorecap;
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
			this.procesorecapAux=new ProcesoRecap();
			this.procesorecapAux.setsType(Constantes2.S_TOTALES);
			this.procesorecapAux.setIsNew(false);
			this.procesorecapAux.setIsChanged(false);
			this.procesorecapAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoRecapConstantesFunciones.TotalizarValoresFilaProcesoRecap(this.procesorecapLogic.getProcesoRecaps(),this.procesorecapAux);
				
				//this.procesorecapLogic.getProcesoRecaps().add(this.procesorecapAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoRecapConstantesFunciones.TotalizarValoresFilaProcesoRecap(this.procesorecaps,this.procesorecapAux);
				
				this.procesorecaps.add(this.procesorecapAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesorecapTotales=new ProcesoRecap();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesorecapLogic.getProcesoRecaps().remove(procesorecapTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesorecaps.remove(procesorecapTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesorecapTotales=new ProcesoRecap();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoRecap procesorecap:procesorecapLogic.getProcesoRecaps()) {
				if(procesorecap.getsType().equals(Constantes2.S_TOTALES)) {
					procesorecapTotales=procesorecap;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoRecapConstantesFunciones.TotalizarValoresFilaProcesoRecap(this.procesorecapLogic.getProcesoRecaps(),procesorecapTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoRecap procesorecap:this.procesorecaps) {
				if(procesorecap.getsType().equals(Constantes2.S_TOTALES)) {
					procesorecapTotales=procesorecap;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoRecapConstantesFunciones.TotalizarValoresFilaProcesoRecap(this.procesorecaps,procesorecapTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoRecapsBusquedaProcesoRecap()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoRecap";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoRecapsFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoRecapsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoRecapsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoRecapsBusquedaProcesoRecap(String sFinalQuery,Long id_ejercicio,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesorecapLogic.getProcesoRecapsBusquedaProcesoRecap(sFinalQuery,this.pagination,id_ejercicio,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoRecapsFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesorecapLogic.getProcesoRecapsFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoRecapsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesorecapLogic.getProcesoRecapsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoRecapsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesorecapLogic.getProcesoRecapsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosProcesoRecap() {
		this.isPermisoTodoProcesoRecap=false;
		this.isPermisoNuevoProcesoRecap=false;
		this.isPermisoActualizarProcesoRecap=false;
		this.isPermisoActualizarOriginalProcesoRecap=false;
		this.isPermisoEliminarProcesoRecap=false;
		this.isPermisoGuardarCambiosProcesoRecap=false;
		this.isPermisoConsultaProcesoRecap=true;
		this.isPermisoBusquedaProcesoRecap=true;
		this.isPermisoReporteProcesoRecap=true;
		this.isPermisoOrdenProcesoRecap=false;		
		this.isPermisoPaginacionMedioProcesoRecap=false;		
		this.isPermisoPaginacionAltoProcesoRecap=false;		
		this.isPermisoPaginacionTodoProcesoRecap=false;		
		this.isPermisoCopiarProcesoRecap=false;		
		this.isPermisoVerFormProcesoRecap=false;		
		this.isPermisoDuplicarProcesoRecap=false;
		this.isPermisoOrdenProcesoRecap=false;
	}
	
	public void setPermisosUsuarioProcesoRecap(Boolean isPermiso) {
		this.isPermisoTodoProcesoRecap=isPermiso;
		this.isPermisoNuevoProcesoRecap=isPermiso;
		this.isPermisoActualizarProcesoRecap=isPermiso;
		this.isPermisoActualizarOriginalProcesoRecap=isPermiso;
		this.isPermisoEliminarProcesoRecap=isPermiso;
		this.isPermisoGuardarCambiosProcesoRecap=isPermiso;
		this.isPermisoConsultaProcesoRecap=isPermiso;
		this.isPermisoBusquedaProcesoRecap=isPermiso;
		this.isPermisoReporteProcesoRecap=isPermiso;
		this.isPermisoOrdenProcesoRecap=isPermiso;		
		this.isPermisoPaginacionMedioProcesoRecap=isPermiso;		
		this.isPermisoPaginacionAltoProcesoRecap=isPermiso;		
		this.isPermisoPaginacionTodoProcesoRecap=isPermiso;		
		this.isPermisoCopiarProcesoRecap=isPermiso;		
		this.isPermisoVerFormProcesoRecap=isPermiso;		
		this.isPermisoDuplicarProcesoRecap=isPermiso;
		this.isPermisoOrdenProcesoRecap=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoRecap(Boolean isPermiso) {
		//this.isPermisoTodoProcesoRecap=isPermiso;
		this.isPermisoNuevoProcesoRecap=isPermiso;
		this.isPermisoActualizarProcesoRecap=isPermiso;
		this.isPermisoActualizarOriginalProcesoRecap=isPermiso;
		this.isPermisoEliminarProcesoRecap=isPermiso;
		this.isPermisoGuardarCambiosProcesoRecap=isPermiso;
		//this.isPermisoConsultaProcesoRecap=isPermiso;
		//this.isPermisoBusquedaProcesoRecap=isPermiso;
		//this.isPermisoReporteProcesoRecap=isPermiso;
		//this.isPermisoOrdenProcesoRecap=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoRecap=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoRecap=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoRecap=isPermiso;		
		//this.isPermisoCopiarProcesoRecap=isPermiso;		
		//this.isPermisoDuplicarProcesoRecap=isPermiso;
		//this.isPermisoOrdenProcesoRecap=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoRecapClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoRecap(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoRecapClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoRecapClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoRecapClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoRecapClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoRecap() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesorecapSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoRecapConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoRecap=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoRecap=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoRecap=this.isPermisoActualizarProcesoRecap;
			this.isPermisoEliminarProcesoRecap=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoRecap=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoRecap=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoRecap=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoRecap=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoRecap=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoRecap=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoRecap=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoRecap=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoRecap=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoRecap=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoRecap=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoRecap=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoRecap=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesorecapSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoRecap.setToolTipText(this.jTableDatosProcesoRecap.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoRecap(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoRecap(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoRecap() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoRecapListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoRecapListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoRecapJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoRecap()throws Exception {
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
			if(this.procesorecapSessionBean==null) {
				this.procesorecapSessionBean=new ProcesoRecapSessionBean();
			}

			if(!this.procesorecapSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.procesorecapSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.procesorecapSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
	
	public void initActionsCombosTodosForeignKeyProcesoRecap()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoRecap(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoRecap()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoRecap();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoRecap(ProcesoRecap procesorecap)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoRecap(ProcesoRecap procesorecap,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoRecap()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoRecap()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoRecap()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoRecap()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoRecap()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoRecap()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoRecap(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoRecap()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap!=null && this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap!=null && this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap!=null && this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ProcesoRecapBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoRecapBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoRecapBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesorecapSessionBean=new ProcesoRecapSessionBean(); 
		this.procesorecapConstantesFunciones=new ProcesoRecapConstantesFunciones(); 
		this.procesorecapBean=new ProcesoRecap();//(this.procesorecapConstantesFunciones); 		
		this.procesorecapReturnGeneral=new ProcesoRecapParameterReturnGeneral(); 
		
		this.procesorecapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesorecapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoRecapBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoRecapBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoRecapBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoRecap(true);
			
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
			
			this.procesorecapConstantesFunciones=new ProcesoRecapConstantesFunciones(); 
			this.procesorecapBean=new ProcesoRecap();//this.procesorecapConstantesFunciones); 			
			this.procesorecapReturnGeneral=new ProcesoRecapParameterReturnGeneral(); 
		
			ProcesoRecapBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Recap Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.procesorecap=new ProcesoRecap();
			this.procesorecaps = new ArrayList<ProcesoRecap>();
			this.procesorecapsAux = new ArrayList<ProcesoRecap>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic=new ProcesoRecapLogic();
				this.procesorecapLogic.getNewConnexionToDeep("");
			}
			
			//this.procesorecapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesorecapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoRecap);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoRecap!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoRecap);	
					}
					
					if(this.jInternalFrameImportacionProcesoRecap!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoRecap);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoRecap!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoRecap);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoRecap);
				this.jInternalFrameDetalleFormProcesoRecap.setVisible(false);
				this.jInternalFrameDetalleFormProcesoRecap.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoRecap!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoRecap);
					this.jInternalFrameReporteDinamicoProcesoRecap.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoRecap.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoRecap!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoRecap);
					this.jInternalFrameImportacionProcesoRecap.setVisible(false);
					this.jInternalFrameImportacionProcesoRecap.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoRecap!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoRecap);
					this.jInternalFrameOrderByProcesoRecap.setVisible(false);
					this.jInternalFrameOrderByProcesoRecap.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoRecapActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoRecapConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesorecapReturnGeneral=new ProcesoRecapParameterReturnGeneral();
			
			this.procesorecapParameterGeneral=new ProcesoRecapParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesorecapLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoRecapJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesorecapSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoRecapConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesorecapSessionBean.getEsGuardarRelacionado(),this.procesorecapSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoRecapConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesorecapSessionBean.getEsGuardarRelacionado(),this.procesorecapSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoRecap=false;
			this.isVisibilidadCeldaDuplicarProcesoRecap=true;
			this.isVisibilidadCeldaCopiarProcesoRecap=true;
			this.isVisibilidadCeldaVerFormProcesoRecap=true;
			this.isVisibilidadCeldaOrdenProcesoRecap=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=false;
			this.isVisibilidadCeldaModificarProcesoRecap=false;
			this.isVisibilidadCeldaActualizarProcesoRecap=false;
			this.isVisibilidadCeldaEliminarProcesoRecap=false;
			this.isVisibilidadCeldaCancelarProcesoRecap=false;
			this.isVisibilidadCeldaGuardarProcesoRecap=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecap=false;
			
			
			this.isVisibilidadBusquedaProcesoRecap=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			this.numero_recapProcesoRecapParam="";
			this.autorizacion_recapProcesoRecapParam="";
			this.fecha_recapProcesoRecapParam=new Date();
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoRecap();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoRecap(false);
			
			this.setPermisosUsuarioProcesoRecap();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesorecapSessionBean.getEsGuardarRelacionado() 
				|| (this.procesorecapSessionBean.getEsGuardarRelacionado() && this.procesorecapSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoRecapClasesRelacionadas();
			}
			
			if(this.procesorecapSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoRecapClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoRecap();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoRecap();
			}
			
			if(!this.isPermisoBusquedaProcesoRecap) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoRecap.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoRecapConstantesFunciones.getTiposSeleccionarProcesoRecap());
				
				this.tiposColumnasSelect=ProcesoRecapConstantesFunciones.getTiposSeleccionarProcesoRecap(true);
				
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
			//if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoRecap();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProcesoRecap(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProcesoRecap(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoRecap() ;
			
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
				procesorecapImplementable= (ProcesoRecapImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoRecapConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesorecapImplementableHome= (ProcesoRecapImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoRecapConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesorecaps= new ArrayList<ProcesoRecap>();
			this.procesorecapsEliminados= new ArrayList<ProcesoRecap>();
						
			this.isEsNuevoProcesoRecap=false;
			this.esParaAccionDesdeFormularioProcesoRecap=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoRecap(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoRecap();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoRecapBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoRecapConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoRecap("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoRecap(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoRecap!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoRecap();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoRecap();
			}
			
			ProcesoRecapBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoRecap.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoRecap.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoRecap.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoRecap(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoRecap: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoRecap() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoRecap")) {
				iIndex=this.jInternalFrameDetalleFormProcesoRecap.jTabbedPaneRelacionesProcesoRecap.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoRecap.jTabbedPaneRelacionesProcesoRecap.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoRecap();	
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
	
	public void cargarCombosForeignKeyProcesoRecap(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoRecap(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoRecap(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoRecapListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoRecap();
		
		this.cargarCombosFrameForeignKeyProcesoRecap();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoRecap();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoRecap();
		}
	}
	
	
	
	public void jButtonNuevoProcesoRecapActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesorecapSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			
			
			if(jTableDatosProcesoRecap.getRowCount()>=1) {
				jTableDatosProcesoRecap.removeRowSelectionInterval(0, jTableDatosProcesoRecap.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoRecap=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoRecap(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoRecap(true);			
			//this.procesorecap=new ProcesoRecap();
			//this.procesorecap.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoRecap(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoRecap() ;
			
			if(ProcesoRecapJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoRecap(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesorecap);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);				
			
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			
			if(this.procesorecapSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoRecap: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoRecapActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoRecap> procesorecapsSeleccionados=new ArrayList<ProcesoRecap>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoRecap.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoRecap.getSelectedRows().length;			
			}
			
			procesorecapsSeleccionados=this.getProcesoRecapsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoRecap--;			
				//ProcesoRecap procesorecapAux= new ProcesoRecap();			
				//procesorecapAux.setId(this.iIdNuevoProcesoRecap);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoRecap procesorecapOrigen=new ProcesoRecap();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoRecap procesorecapOrigen : procesorecapsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesorecapOrigen =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesorecapOrigen =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoRecap();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesorecap.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoRecap(procesorecapOrigen,this.procesorecap,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesorecapLogic.getProcesoRecaps().add(this.procesorecapAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesorecaps.add(this.procesorecapAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoRecap(false);
				
				this.jTableDatosProcesoRecap.setRowSelectionInterval(this.getIndiceNuevoProcesoRecap(), this.getIndiceNuevoProcesoRecap());
				
				int iLastRow =  this.jTableDatosProcesoRecap.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoRecap.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoRecap.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoRecap(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoRecap> procesorecapsSeleccionados=new ArrayList<ProcesoRecap>();									
		
			ProcesoRecap procesorecapOrigen=new ProcesoRecap();
			ProcesoRecap procesorecapDestino=new ProcesoRecap();
				
			procesorecapsSeleccionados=this.getProcesoRecapsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoRecap.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesorecapsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoRecap.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesorecapOrigen =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesorecapOrigen =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesorecapDestino =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesorecapDestino =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesorecapOrigen =procesorecapsSeleccionados.get(0);
				procesorecapDestino =procesorecapsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoRecap(procesorecapOrigen,procesorecapDestino,true,false);
				
				procesorecapDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesorecapDestino,procesorecapLogic.getProcesoRecaps());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesorecapDestino,procesorecaps);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoRecap(false);
				
				//this.jTableDatosProcesoRecap.setRowSelectionInterval(this.getIndiceNuevoProcesoRecap(), this.getIndiceNuevoProcesoRecap());
				
				int iLastRow =  this.jTableDatosProcesoRecap.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoRecap.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoRecap.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoRecap(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoRecap.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoRecap.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoRecap.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoRecap.setVisible(!isVisible);
			this.jPanelPaginacionProcesoRecap.setVisible(!isVisible);
			this.jPanelAccionesProcesoRecap.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoRecap();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoRecap();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoRecap();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoRecap();
			
			this.abrirFrameOrderByProcesoRecap();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoRecap();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoRecap(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoRecap);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoRecap.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoRecap.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoRecap.setSize(this.jInternalFrameDetalleFormProcesoRecap.iWidthFormulario,this.jInternalFrameDetalleFormProcesoRecap.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoRecap.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoRecap.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoRecap.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoRecap.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoRecap.jContentPaneDetalleProcesoRecap.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoRecap.jTabbedPaneRelacionesProcesoRecap.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoRecap.jContentPaneDetalleProcesoRecap.getWidth(),ProcesoRecapConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoRecap.jTabbedPaneRelacionesProcesoRecap.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoRecap.jContentPaneDetalleProcesoRecap.getWidth(),ProcesoRecapConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoRecap.jTabbedPaneRelacionesProcesoRecap.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoRecap.jContentPaneDetalleProcesoRecap.getWidth(),ProcesoRecapConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoRecap.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoRecap.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoRecap() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoRecap==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoRecap,false,this);
				} else {
					this.jInternalFrameOrderByProcesoRecap=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoRecap,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoRecap);
				this.jInternalFrameOrderByProcesoRecap.setVisible(false);
				this.jInternalFrameOrderByProcesoRecap.setSelected(false);
				
				this.jInternalFrameOrderByProcesoRecap.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoRecap"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoRecap();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoRecap() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoRecap==null) {
				
				this.jInternalFrameImportacionProcesoRecap=new ImportacionJInternalFrame(ProcesoRecapConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoRecap);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoRecap);
				this.jInternalFrameImportacionProcesoRecap.setVisible(false);
				this.jInternalFrameImportacionProcesoRecap.setSelected(false);


				this.jInternalFrameImportacionProcesoRecap.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoRecap"));
				this.jInternalFrameImportacionProcesoRecap.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoRecap"));
				this.jInternalFrameImportacionProcesoRecap.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoRecap"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoRecap() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoRecap==null) {
				this.jInternalFrameReporteDinamicoProcesoRecap=new ReporteDinamicoJInternalFrame(ProcesoRecapConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoRecap);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoRecap);
				this.jInternalFrameReporteDinamicoProcesoRecap.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoRecap.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoRecap.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoRecap"));
				this.jInternalFrameReporteDinamicoProcesoRecap.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoRecap"));
				this.jInternalFrameReporteDinamicoProcesoRecap.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoRecap"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoRecap();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoRecap() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoRecap);
			
	       	this.jInternalFrameDetalleFormProcesoRecap.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoRecap.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoRecap.dispose();
			//this.jInternalFrameDetalleFormProcesoRecap=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoRecap() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoRecap.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoRecap.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoRecap() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoRecap.setVisible(true);
	        this.jInternalFrameImportacionProcesoRecap.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoRecap() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoRecap.setVisible(true);
	        this.jInternalFrameOrderByProcesoRecap.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoRecap() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoRecap.setVisible(false);
	        this.jInternalFrameOrderByProcesoRecap.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoRecap() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoRecap.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoRecap.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoRecap() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoRecap.setVisible(false);
	        this.jInternalFrameImportacionProcesoRecap.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoRecapActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoRecap(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoRecap(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoRecap(true);
			//this.isEsNuevoProcesoRecap=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoRecap("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoRecap(false) ;
			
			if(procesorecapSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoRecapJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoRecap(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoRecap(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoRecapActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoRecap(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoRecap(true);
			//this.isEsNuevoProcesoRecap=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesorecap.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoRecap("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoRecap(false) ;
			
			if(ProcesoRecapJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoRecap(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoRecap(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	
	public void jButtonActualizarProcesoRecapActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoRecap(false);
			
			//if(!this.isEsNuevoProcesoRecap) {								
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
				
			}
			
			if(this.permiteMantenimiento(this.procesorecap)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesorecapSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoRecap=true;
					this.inicializarActualizarBindingTablaProcesoRecap(false);
					this.isEsNuevoProcesoRecap=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoRecap=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoRecap=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoRecap(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoRecap(false);
				
				this.habilitarDeshabilitarControlesProcesoRecap(false);
			
												
				
				if(ProcesoRecapJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoRecap();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoRecapActionPerformed(evt,procesorecapSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoRecap(this.procesorecap,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoRecap.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesorecapSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesorecap.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoRecap.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecap.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoRecapActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				this.procesorecap.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				this.procesorecap.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesorecap)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesorecapSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoRecapModel) this.jTableDatosProcesoRecap.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoRecap=true;
				this.inicializarActualizarBindingTablaProcesoRecap(false);
				this.isEsNuevoProcesoRecap=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoRecap(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoRecap(false);
				
				this.habilitarDeshabilitarControlesProcesoRecap(false);
				
				
				
				if(ProcesoRecapJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoRecap();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoRecapActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoRecap.getRowCount()>=1) {
				jTableDatosProcesoRecap.removeRowSelectionInterval(0, jTableDatosProcesoRecap.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoRecap(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoRecap(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoRecap(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoRecap(false) ;
			
			this.isEsNuevoProcesoRecap=false;
			
			if(ProcesoRecapJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoRecap();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoRecap(false);
				
				//SI ES MANUAL
				if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoRecap();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoRecap--;			
			//ProcesoRecap procesorecapAux= new ProcesoRecap();			
			//procesorecapAux.setId(this.iIdNuevoProcesoRecap);
			
			if(this.jInternalFrameDetalleFormProcesoRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoRecap();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
			
			this.procesorecap.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesorecapLogic.getProcesoRecaps().add(this.procesorecapAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesorecaps.add(this.procesorecapAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoRecap(false);
			
			this.jTableDatosProcesoRecap.setRowSelectionInterval(this.getIndiceNuevoProcesoRecap(), this.getIndiceNuevoProcesoRecap());
			
			int iLastRow =  this.jTableDatosProcesoRecap.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoRecap.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoRecap.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoRecap(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoRecap(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoRecap(false);
			
			//SI ES MANUAL
			if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoRecap();
			}
			
			//this.abrirFrameTreeProcesoRecap();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoRecapActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoRecapActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoRecap.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoRecap.setFileImportacion(this.jInternalFrameImportacionProcesoRecap.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoRecap.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoRecap.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoRecap.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoRecap.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoRecapActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoRecap> procesorecapsSeleccionados=new ArrayList<ProcesoRecap>();		

		procesorecapsSeleccionados=this.getProcesoRecapsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoRecapBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoRecapBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoRecaps("Todos",procesorecapsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recap",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoRecap.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoRecap.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTransaccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTransaccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTransaccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTransaccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoMoneLocal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoRecap.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoria="numero_pre_impreso";
					break;

				case ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoria="nombre_transaccion";
					break;

				case ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL:
					sNombreCampoCategoria="monto_mone_local";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoriaValor="numero_pre_impreso";
					break;

				case ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoriaValor="nombre_transaccion";
					break;

				case ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL:
					sNombreCampoCategoriaValor="monto_mone_local";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoRecap.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoRecap.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso");
					break;

				case ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Transaccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_transaccion");
					break;

				case ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_mone_local");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoRecapActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoRecap> procesorecapsSeleccionados=new ArrayList<ProcesoRecap>();		
		
		procesorecapsSeleccionados=this.getProcesoRecapsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesorecap";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoRecaps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoRecap.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoRecap.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoRecapConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProcesoRecap procesorecap:procesorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecap.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecapConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProcesoRecap procesorecap:procesorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecap.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecapConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(ProcesoRecap procesorecap:procesorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecap.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(ProcesoRecap procesorecap:procesorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecap.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(ProcesoRecap procesorecap:procesorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecap.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(ProcesoRecap procesorecap:procesorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecap.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO);
					iRow++;

					for(ProcesoRecap procesorecap:procesorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecap.getnumero_pre_impreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION);
					iRow++;

					for(ProcesoRecap procesorecap:procesorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecap.getnombre_transaccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(ProcesoRecap procesorecap:procesorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecap.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL);
					iRow++;

					for(ProcesoRecap procesorecap:procesorecapsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesorecap.getmonto_mone_local());
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
			//	this.getFilaCabeceraExportarExcelProcesoRecap(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoRecap procesorecapAux:procesorecapsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoRecap(procesorecapAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recap",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionProcesoRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ProcesoRecapBeanSwingJInternalFrameAdditional.ProcesarInformacionProcesoRecap(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoRecap(false);
			
			//SI ES MANUAL
			if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoRecap();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoRecap(false);
			
			//SI ES MANUAL
			if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoRecap();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoRecapActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoRecap(false);
			
			//SI ES MANUAL
			if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoRecap();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoRecap() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoRecap.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoRecap.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoRecap.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoRecap.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoRecap.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoRecap.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoRecap.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoRecap(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoRecap(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoRecap(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoRecap(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoRecap(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoRecap(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoRecap(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoRecap(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoRecapJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoRecap() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoRecap();
		
		this.inicializarActualizarBindingBotonesManualProcesoRecap(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoRecap();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoRecap() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoRecap(false) ;			
			
			this.inicializarActualizarBindingTablasParametrosManualProcesoRecap();
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoRecap(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoRecap.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoRecap.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoRecap.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoRecap.jCheckBoxPostAccionNuevoProcesoRecap.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoRecap.jCheckBoxPostAccionSinCerrarProcesoRecap.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoRecap.jCheckBoxPostAccionSinMensajeProcesoRecap.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoRecap.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoRecap.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoRecap.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
				this.jInternalFrameDetalleFormProcesoRecap.jCheckBoxPostAccionNuevoProcesoRecap.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoRecap.jCheckBoxPostAccionSinCerrarProcesoRecap.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoRecap.jCheckBoxPostAccionSinMensajeProcesoRecap.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoRecap.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoRecap.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoRecap.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoRecap!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoRecap.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoRecap.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoRecap.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoRecap.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoRecap!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoRecap.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoRecap.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoRecap(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoRecap(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoRecap() throws Exception {
		try	{
			if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoRecap();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoRecap() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoRecap() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoRecap.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoRecap.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoRecap.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoRecap.addItem(reporte);
			}
			
			
			if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoRecap.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoRecap.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoRecap.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoRecap.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoRecap.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoRecap.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoRecap.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoRecap();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoRecap() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoRecap!=null) {
				this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoRecap!=null) {
				this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoRecap!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoRecap.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoRecap.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoRecap.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoRecap.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoRecap.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoRecap.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProcesoRecapConstantesFunciones.getTiposSeleccionarProcesoRecap(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProcesoRecapConstantesFunciones.getTiposSeleccionarProcesoRecap(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProcesoRecap.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoRecap.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProcesoRecapConstantesFunciones.getTiposSeleccionarProcesoRecap(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoRecap.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProcesoRecap.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoRecap()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap.getSelectedItem()!=null){this.id_ejercicioBusquedaProcesoRecap=((Ejercicio)this.jComboBoxid_ejercicioBusquedaProcesoRecapProcesoRecap.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaProcesoRecap=new Date(this.jDateChooserfecha_emision_desdeBusquedaProcesoRecapProcesoRecap.getDate().getTime());
		this.fecha_emision_hastaBusquedaProcesoRecap=new Date(this.jDateChooserfecha_emision_hastaBusquedaProcesoRecapProcesoRecap.getDate().getTime());
		
	}
	
	
	
	public void inicializarActualizarBindingTablasParametrosManualProcesoRecap()  throws Exception {
		this.numero_recapProcesoRecapParam=this.jTextFieldnumero_recapProcesoRecapParam.getText();
		this.autorizacion_recapProcesoRecapParam=this.jTextFieldautorizacion_recapProcesoRecapParam.getText();
		this.fecha_recapProcesoRecapParam=new Date(this.jDateChooserfecha_recapProcesoRecapParam.getDate().getTime());

	}
	
	public void inicializarActualizarBindingBusquedasProcesoRecap(Boolean esInicializar) throws Exception {				
		if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoRecap();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoRecap() throws Exception {
		this.inicializarActualizarBindingTablaProcesoRecap(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoRecap() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoRecap.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoRecap.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoRecap.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoRecapPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoRecap.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoRecap.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoRecapPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoRecapOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecapOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoRecapPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoRecap.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoRecap.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoRecapPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoRecap.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoRecap(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesorecapLogic.getProcesoRecaps().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesorecaps.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoRecap.setModel(new ProcesoRecapModel(this.procesorecapLogic.getProcesoRecaps(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoRecap.setModel(new ProcesoRecapModel(this.procesorecaps,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoRecap!=null && this.jInternalFrameOrderByProcesoRecap.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoRecap();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecap,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoRecapPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO,procesorecapConstantesFunciones.resaltarSeleccionarProcesoRecap,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoRecapConstantesFunciones.SCLASSWEBTITULO,procesorecapConstantesFunciones.resaltarSeleccionarProcesoRecap,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecap,ProcesoRecapConstantesFunciones.LABEL_ID));

		if(this.procesorecapConstantesFunciones.mostraridProcesoRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecapConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesorecapConstantesFunciones.resaltaridProcesoRecap,this.procesorecapConstantesFunciones.activaridProcesoRecap,iSizeTabla,this,true,"idProcesoRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecapConstantesFunciones.resaltaridProcesoRecap,this.procesorecapConstantesFunciones.activaridProcesoRecap,this,true,"idProcesoRecap","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecap,ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.procesorecapConstantesFunciones.mostrarnombre_completo_clienteProcesoRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesorecapConstantesFunciones.resaltarnombre_completo_clienteProcesoRecap,this.procesorecapConstantesFunciones.activarnombre_completo_clienteProcesoRecap,iSizeTabla,this,true,"nombre_completo_clienteProcesoRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecapConstantesFunciones.resaltarnombre_completo_clienteProcesoRecap,this.procesorecapConstantesFunciones.activarnombre_completo_clienteProcesoRecap,this,true,"nombre_completo_clienteProcesoRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecap,ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO));

		if(this.procesorecapConstantesFunciones.mostrarnumero_pre_impresoProcesoRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesorecapConstantesFunciones.resaltarnumero_pre_impresoProcesoRecap,this.procesorecapConstantesFunciones.activarnumero_pre_impresoProcesoRecap,iSizeTabla,this,true,"numero_pre_impresoProcesoRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecapConstantesFunciones.resaltarnumero_pre_impresoProcesoRecap,this.procesorecapConstantesFunciones.activarnumero_pre_impresoProcesoRecap,this,true,"numero_pre_impresoProcesoRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecap,ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION));

		if(this.procesorecapConstantesFunciones.mostrarnombre_transaccionProcesoRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesorecapConstantesFunciones.resaltarnombre_transaccionProcesoRecap,this.procesorecapConstantesFunciones.activarnombre_transaccionProcesoRecap,iSizeTabla,this,true,"nombre_transaccionProcesoRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecapConstantesFunciones.resaltarnombre_transaccionProcesoRecap,this.procesorecapConstantesFunciones.activarnombre_transaccionProcesoRecap,this,true,"nombre_transaccionProcesoRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecap,ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION));

		if(this.procesorecapConstantesFunciones.mostrarfecha_emisionProcesoRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.procesorecapConstantesFunciones.resaltarfecha_emisionProcesoRecap,this.procesorecapConstantesFunciones.activarfecha_emisionProcesoRecap,iSizeTabla,this,true,"fecha_emisionProcesoRecap","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.procesorecapConstantesFunciones.resaltarfecha_emisionProcesoRecap,this.procesorecapConstantesFunciones.activarfecha_emisionProcesoRecap,this,true,"fecha_emisionProcesoRecap","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProcesoRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecap,ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL));

		if(this.procesorecapConstantesFunciones.mostrarmonto_mone_localProcesoRecap && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesorecapConstantesFunciones.resaltarmonto_mone_localProcesoRecap,this.procesorecapConstantesFunciones.activarmonto_mone_localProcesoRecap,iSizeTabla,this,true,"monto_mone_localProcesoRecap","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesorecapConstantesFunciones.resaltarmonto_mone_localProcesoRecap,this.procesorecapConstantesFunciones.activarmonto_mone_localProcesoRecap,this,true,"monto_mone_localProcesoRecap","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoRecapPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesorecapSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesorecapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesorecapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoRecap.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesorecapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesorecapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoRecap.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoRecap && this.isPermisoGuardarCambiosProcesoRecap) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesorecapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesorecapSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoRecap.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoRecap.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoRecap && this.isPermisoGuardarCambiosProcesoRecap) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoRecap && this.isPermisoGuardarCambiosProcesoRecap) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoRecap.moveColumn(this.jTableDatosProcesoRecap.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoRecap.moveColumn(this.jTableDatosProcesoRecap.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoRecap.moveColumn(this.jTableDatosProcesoRecap.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoRecap.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoRecap.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoRecap,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoRecap.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoRecap.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoRecap.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoRecap.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoRecap.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesorecapLogic.getProcesoRecaps().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesorecaps.size()-1;
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
		//this.jTableDatosProcesoRecap.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoRecap.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoRecap();
			
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
				
				//this.isEsNuevoProcesoRecap=false;
					
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			
				if(this.procesorecapSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoRecap==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoRecap.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoRecap.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesorecap.getsType().equals("DUPLICADO")
				   || this.procesorecap.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoRecap=true;
				
				} else {
					this.isEsNuevoProcesoRecap=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesorecapSessionBean.getEsGuardarRelacionado()) {
					if(this.procesorecap.getId()>=0 && !this.procesorecap.getIsNew()) {						
						this.isEsNuevoProcesoRecap=false;
						
					} else {
						this.isEsNuevoProcesoRecap=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoRecap(esRelaciones);						
				
				this.seleccionarProcesoRecap(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesorecap.getId()<0) {
					this.isEsNuevoProcesoRecap=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoRecap(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoRecap(evt,rowIndex);
				}	
				
				if(this.procesorecapSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoRecap: " + this.dDif); 
					}
				}								
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoRecap(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesorecap)) {
					if(this.procesorecap.getId()>0) {
						this.procesorecap.setIsDeleted(true);
						
						this.procesorecapsEliminados.add(this.procesorecap);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesorecapLogic.getProcesoRecaps().remove(this.procesorecap);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesorecaps.remove(this.procesorecap);				
					}
					
					
					((ProcesoRecapModel) this.jTableDatosProcesoRecap.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoRecap(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoRecap(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoRecap) {
			
			if(this.jInternalFrameDetalleFormProcesoRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoRecap.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoRecap.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoRecap(this.procesorecap);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoRecap("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoRecap(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoRecap() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoRecap(ProcesoRecap procesorecap) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoRecap(procesorecap,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoRecap(ProcesoRecap procesorecap,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoRecap(procesorecap);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoRecap(procesorecap,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoRecap(procesorecap);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoRecap(ProcesoRecap procesorecap) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoRecap.jLabelidProcesoRecap.setText(procesorecap.getId().toString());
			this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_completo_clienteProcesoRecap.setText(procesorecap.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormProcesoRecap.jTextFieldnumero_pre_impresoProcesoRecap.setText(procesorecap.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_transaccionProcesoRecap.setText(procesorecap.getnombre_transaccion());
			this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emisionProcesoRecap.setDate(procesorecap.getfecha_emision());
			this.jInternalFrameDetalleFormProcesoRecap.jTextFieldmonto_mone_localProcesoRecap.setText(procesorecap.getmonto_mone_local().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoRecap procesorecapLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesorecapLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoRecap procesorecapLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesorecapLocal=this.procesorecap;
			} else {
				procesorecapLocal=this.procesorecapAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesorecapLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoRecap(procesorecapLocal,true);
					
					if(procesorecapSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesorecapLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesorecapSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesorecapLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoRecap(ProcesoRecap procesorecap,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoRecap(procesorecap,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(procesorecap);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoRecap(ProcesoRecap procesorecap,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoRecap(procesorecap,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoRecap(ProcesoRecap procesorecap,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoRecap==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoRecap.jLabelidProcesoRecap.getText()==null || this.jInternalFrameDetalleFormProcesoRecap.jLabelidProcesoRecap.getText()=="" || this.jInternalFrameDetalleFormProcesoRecap.jLabelidProcesoRecap.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoRecap.jLabelidProcesoRecap.setText("0");
			}

			if(conColumnasBase) {procesorecap.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoRecap.jLabelidProcesoRecap.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecapConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecap.jLabelIdProcesoRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesorecap.setnombre_completo_cliente(this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_completo_clienteProcesoRecap.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecap.jLabelnombre_completo_clienteProcesoRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesorecap.setnumero_pre_impreso(this.jInternalFrameDetalleFormProcesoRecap.jTextFieldnumero_pre_impresoProcesoRecap.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecap.jLabelnumero_pre_impresoProcesoRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesorecap.setnombre_transaccion(this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_transaccionProcesoRecap.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecap.jLabelnombre_transaccionProcesoRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesorecap.setfecha_emision(this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emisionProcesoRecap.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecap.jLabelfecha_emisionProcesoRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesorecap.setmonto_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormProcesoRecap.jTextFieldmonto_mone_localProcesoRecap.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoRecap.jLabelmonto_mone_localProcesoRecap,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoRecap(ProcesoRecap procesorecapBean,ProcesoRecap procesorecap,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoRecap(ProcesoRecap procesorecapOrigen,ProcesoRecap procesorecap,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesorecapOrigen.getId()!=null && !procesorecapOrigen.getId().equals(0L))) {procesorecap.setId(procesorecapOrigen.getId());}}
			if(conDefault || (!conDefault && procesorecapOrigen.getfecha_emision_desde()!=null && !procesorecapOrigen.getfecha_emision_desde().equals(new Date()))) {procesorecap.setfecha_emision_desde(procesorecapOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && procesorecapOrigen.getfecha_emision_hasta()!=null && !procesorecapOrigen.getfecha_emision_hasta().equals(new Date()))) {procesorecap.setfecha_emision_hasta(procesorecapOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && procesorecapOrigen.getnombre_completo_cliente()!=null && !procesorecapOrigen.getnombre_completo_cliente().equals(""))) {procesorecap.setnombre_completo_cliente(procesorecapOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && procesorecapOrigen.getnumero_pre_impreso()!=null && !procesorecapOrigen.getnumero_pre_impreso().equals(""))) {procesorecap.setnumero_pre_impreso(procesorecapOrigen.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && procesorecapOrigen.getnombre_transaccion()!=null && !procesorecapOrigen.getnombre_transaccion().equals(""))) {procesorecap.setnombre_transaccion(procesorecapOrigen.getnombre_transaccion());}
			if(conDefault || (!conDefault && procesorecapOrigen.getfecha_emision()!=null && !procesorecapOrigen.getfecha_emision().equals(new Date()))) {procesorecap.setfecha_emision(procesorecapOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && procesorecapOrigen.getmonto_mone_local()!=null && !procesorecapOrigen.getmonto_mone_local().equals(0.0))) {procesorecap.setmonto_mone_local(procesorecapOrigen.getmonto_mone_local());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoRecap(ProcesoRecap procesorecap) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoRecap.jLabelidProcesoRecap.setText(procesorecap.getId().toString());
			this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_completo_clienteProcesoRecap.setText(procesorecap.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormProcesoRecap.jTextFieldnumero_pre_impresoProcesoRecap.setText(procesorecap.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_transaccionProcesoRecap.setText(procesorecap.getnombre_transaccion());
			this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emisionProcesoRecap.setDate(procesorecap.getfecha_emision());
			this.jInternalFrameDetalleFormProcesoRecap.jTextFieldmonto_mone_localProcesoRecap.setText(procesorecap.getmonto_mone_local().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoRecap(ProcesoRecapBean procesorecapBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoRecap.jLabelidProcesoRecap.setText(procesorecapBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_completo_clienteProcesoRecap.setText(procesorecapBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormProcesoRecap.jTextFieldnumero_pre_impresoProcesoRecap.setText(procesorecapBean.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_transaccionProcesoRecap.setText(procesorecapBean.getnombre_transaccion());
			this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emisionProcesoRecap.setDate(procesorecapBean.getfecha_emision());
			this.jInternalFrameDetalleFormProcesoRecap.jTextFieldmonto_mone_localProcesoRecap.setText(procesorecapBean.getmonto_mone_local().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoRecap(ProcesoRecapParameterReturnGeneral procesorecapReturnGeneral,ProcesoRecapBean procesorecapBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoRecap procesorecapLocal=new ProcesoRecap();
			
			procesorecapLocal=procesorecapReturnGeneral.getProcesoRecap();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesorecapLocal.getId()!=null && !procesorecapLocal.getId().equals(0L))) {procesorecapBean.setId(procesorecapLocal.getId());}}
			if(conDefault || (!conDefault && procesorecapLocal.getnombre_completo_cliente()!=null && !procesorecapLocal.getnombre_completo_cliente().equals(""))) {procesorecapBean.setnombre_completo_cliente(procesorecapLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && procesorecapLocal.getnumero_pre_impreso()!=null && !procesorecapLocal.getnumero_pre_impreso().equals(""))) {procesorecapBean.setnumero_pre_impreso(procesorecapLocal.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && procesorecapLocal.getnombre_transaccion()!=null && !procesorecapLocal.getnombre_transaccion().equals(""))) {procesorecapBean.setnombre_transaccion(procesorecapLocal.getnombre_transaccion());}
			if(conDefault || (!conDefault && procesorecapLocal.getfecha_emision()!=null && !procesorecapLocal.getfecha_emision().equals(new Date()))) {procesorecapBean.setfecha_emision(procesorecapLocal.getfecha_emision());}
			if(conDefault || (!conDefault && procesorecapLocal.getmonto_mone_local()!=null && !procesorecapLocal.getmonto_mone_local().equals(0.0))) {procesorecapBean.setmonto_mone_local(procesorecapLocal.getmonto_mone_local());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoRecapGenerico(Long idProcesoRecapSeleccionado,JComboBox jComboBoxProcesoRecap,List<ProcesoRecap> procesorecapsLocal)throws Exception {
		try {
			ProcesoRecap  procesorecapTemp=null;

			for(ProcesoRecap procesorecapAux:procesorecapsLocal) {
				if(procesorecapAux.getId()!=null && procesorecapAux.getId().equals(idProcesoRecapSeleccionado)) {
					procesorecapTemp=procesorecapAux;
					break;
				}
			}

			jComboBoxProcesoRecap.setSelectedItem(procesorecapTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoRecapGenerico(JComboBox jComboBoxProcesoRecap,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoRecap.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoRecap.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoRecap.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoRecap.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesorecap=(ProcesoRecap) procesorecapLogic.getProcesoRecaps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesorecap =(ProcesoRecap) procesorecaps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!procesorecap.getIsNew() && !procesorecap.getIsChanged() && !procesorecap.getIsDeleted()) {
				sDescripcion=procesorecap.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=procesorecap.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!procesorecap.getIsNew() && !procesorecap.getIsChanged() && !procesorecap.getIsDeleted()) {
				sDescripcion=procesorecap.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=procesorecap.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!procesorecap.getIsNew() && !procesorecap.getIsChanged() && !procesorecap.getIsDeleted()) {
				sDescripcion=procesorecap.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=procesorecap.getejercicio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoRecap procesorecapRow=new ProcesoRecap();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesorecapRow=(ProcesoRecap) procesorecapLogic.getProcesoRecaps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesorecapRow=(ProcesoRecap) procesorecaps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoRecap(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoRecap.setVisible((this.isVisibilidadCeldaNuevoProcesoRecap && this.isPermisoNuevoProcesoRecap));			
			this.jButtonDuplicarProcesoRecap.setVisible((this.isVisibilidadCeldaDuplicarProcesoRecap && this.isPermisoDuplicarProcesoRecap));			
			this.jButtonCopiarProcesoRecap.setVisible((this.isVisibilidadCeldaCopiarProcesoRecap && this.isPermisoCopiarProcesoRecap));
			this.jButtonVerFormProcesoRecap.setVisible((this.isVisibilidadCeldaVerFormProcesoRecap && this.isPermisoVerFormProcesoRecap));
			
			this.jButtonAbrirOrderByProcesoRecap.setVisible((this.isVisibilidadCeldaOrdenProcesoRecap && this.isPermisoOrdenProcesoRecap));			
			
			this.jButtonNuevoRelacionesProcesoRecap.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoRecap && this.isPermisoNuevoProcesoRecap));			
			this.jButtonNuevoGuardarCambiosProcesoRecap.setVisible((this.isVisibilidadCeldaNuevoProcesoRecap && this.isPermisoNuevoProcesoRecap && this.isPermisoGuardarCambiosProcesoRecap));
			
			if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
			this.jInternalFrameDetalleFormProcesoRecap.jButtonModificarProcesoRecap.setVisible((this.isVisibilidadCeldaModificarProcesoRecap && this.isPermisoActualizarProcesoRecap));	
			this.jInternalFrameDetalleFormProcesoRecap.jButtonActualizarProcesoRecap.setVisible((this.isVisibilidadCeldaActualizarProcesoRecap && this.isPermisoActualizarProcesoRecap));	
			this.jInternalFrameDetalleFormProcesoRecap.jButtonEliminarProcesoRecap.setVisible((this.isVisibilidadCeldaEliminarProcesoRecap && this.isPermisoEliminarProcesoRecap));
			this.jInternalFrameDetalleFormProcesoRecap.jButtonCancelarProcesoRecap.setVisible(this.isVisibilidadCeldaCancelarProcesoRecap);							
			this.jInternalFrameDetalleFormProcesoRecap.jButtonGuardarCambiosProcesoRecap.setVisible((this.isVisibilidadCeldaGuardarProcesoRecap && this.isPermisoGuardarCambiosProcesoRecap));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoRecap.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoRecap && this.isPermisoGuardarCambiosProcesoRecap));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoRecap.setVisible((this.isVisibilidadCeldaNuevoProcesoRecap && this.isPermisoNuevoProcesoRecap));						
			this.jButtonDuplicarToolBarProcesoRecap.setVisible((this.isVisibilidadCeldaDuplicarProcesoRecap && this.isPermisoDuplicarProcesoRecap));						
			this.jButtonCopiarToolBarProcesoRecap.setVisible((this.isVisibilidadCeldaCopiarProcesoRecap && this.isPermisoCopiarProcesoRecap));			
			this.jButtonVerFormToolBarProcesoRecap.setVisible((this.isVisibilidadCeldaVerFormProcesoRecap && this.isPermisoVerFormProcesoRecap));			
			this.jButtonAbrirOrderByToolBarProcesoRecap.setVisible((this.isVisibilidadCeldaOrdenProcesoRecap && this.isPermisoOrdenProcesoRecap));
			this.jButtonNuevoRelacionesToolBarProcesoRecap.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoRecap && this.isPermisoNuevoProcesoRecap));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoRecap.setVisible((this.isVisibilidadCeldaNuevoProcesoRecap && this.isPermisoNuevoProcesoRecap && this.isPermisoGuardarCambiosProcesoRecap));			
			
			if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
			this.jInternalFrameDetalleFormProcesoRecap.jButtonModificarToolBarProcesoRecap.setVisible((this.isVisibilidadCeldaModificarProcesoRecap && this.isPermisoActualizarProcesoRecap));	
			this.jInternalFrameDetalleFormProcesoRecap.jButtonActualizarToolBarProcesoRecap.setVisible((this.isVisibilidadCeldaActualizarProcesoRecap  && this.isPermisoActualizarProcesoRecap));	
			this.jInternalFrameDetalleFormProcesoRecap.jButtonEliminarToolBarProcesoRecap.setVisible((this.isVisibilidadCeldaEliminarProcesoRecap && this.isPermisoEliminarProcesoRecap));
			this.jInternalFrameDetalleFormProcesoRecap.jButtonCancelarToolBarProcesoRecap.setVisible(this.isVisibilidadCeldaCancelarProcesoRecap);				
			this.jInternalFrameDetalleFormProcesoRecap.jButtonGuardarCambiosToolBarProcesoRecap.setVisible((this.isVisibilidadCeldaGuardarProcesoRecap && this.isPermisoGuardarCambiosProcesoRecap));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoRecap.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoRecap && this.isPermisoGuardarCambiosProcesoRecap));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoRecap.setVisible((this.isVisibilidadCeldaNuevoProcesoRecap && this.isPermisoNuevoProcesoRecap));			
			this.jMenuItemDuplicarProcesoRecap.setVisible((this.isVisibilidadCeldaDuplicarProcesoRecap && this.isPermisoDuplicarProcesoRecap));			
			this.jMenuItemCopiarProcesoRecap.setVisible((this.isVisibilidadCeldaCopiarProcesoRecap && this.isPermisoCopiarProcesoRecap));			
			this.jMenuItemVerFormProcesoRecap.setVisible((this.isVisibilidadCeldaVerFormProcesoRecap && this.isPermisoVerFormProcesoRecap));			
			this.jMenuItemAbrirOrderByProcesoRecap.setVisible((this.isVisibilidadCeldaOrdenProcesoRecap && this.isPermisoOrdenProcesoRecap));			
			//this.jMenuItemMostrarOcultarProcesoRecap.setVisible((this.isVisibilidadCeldaOrdenProcesoRecap && this.isPermisoOrdenProcesoRecap));
			this.jMenuItemDetalleAbrirOrderByProcesoRecap.setVisible((this.isVisibilidadCeldaOrdenProcesoRecap && this.isPermisoOrdenProcesoRecap));			
			//this.jMenuItemDetalleMostrarOcultarProcesoRecap.setVisible((this.isVisibilidadCeldaOrdenProcesoRecap && this.isPermisoOrdenProcesoRecap));			
			this.jMenuItemNuevoRelacionesProcesoRecap.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoRecap && this.isPermisoNuevoProcesoRecap));			
			this.jMenuItemNuevoGuardarCambiosProcesoRecap.setVisible((this.isVisibilidadCeldaNuevoProcesoRecap && this.isPermisoNuevoProcesoRecap && this.isPermisoGuardarCambiosProcesoRecap));									
			
			if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
			this.jInternalFrameDetalleFormProcesoRecap.jMenuItemModificarProcesoRecap.setVisible((this.isVisibilidadCeldaModificarProcesoRecap && this.isPermisoActualizarProcesoRecap));	
			this.jInternalFrameDetalleFormProcesoRecap.jMenuItemActualizarProcesoRecap.setVisible((this.isVisibilidadCeldaActualizarProcesoRecap && this.isPermisoActualizarProcesoRecap));	
			this.jInternalFrameDetalleFormProcesoRecap.jMenuItemEliminarProcesoRecap.setVisible((this.isVisibilidadCeldaEliminarProcesoRecap && this.isPermisoEliminarProcesoRecap));
			this.jInternalFrameDetalleFormProcesoRecap.jMenuItemCancelarProcesoRecap.setVisible(this.isVisibilidadCeldaCancelarProcesoRecap);				
			}
			
			this.jMenuItemGuardarCambiosProcesoRecap.setVisible((this.isVisibilidadCeldaGuardarProcesoRecap && this.isPermisoGuardarCambiosProcesoRecap));						
			this.jMenuItemGuardarCambiosTablaProcesoRecap.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoRecap && this.isPermisoGuardarCambiosProcesoRecap));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoRecap=this.jButtonNuevoProcesoRecap.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoRecap=this.jButtonDuplicarProcesoRecap.isVisible();
			this.isVisibilidadCeldaCopiarProcesoRecap=this.jButtonCopiarProcesoRecap.isVisible();
			this.isVisibilidadCeldaVerFormProcesoRecap=this.jButtonVerFormProcesoRecap.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoRecap=this.jButtonAbrirOrderByProcesoRecap.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=this.jButtonNuevoRelacionesProcesoRecap.isVisible();
			this.isVisibilidadCeldaModificarProcesoRecap=this.jButtonModificarProcesoRecap.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
			this.isVisibilidadCeldaActualizarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jButtonActualizarProcesoRecap.isVisible();
			this.isVisibilidadCeldaEliminarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jButtonEliminarProcesoRecap.isVisible();
			this.isVisibilidadCeldaCancelarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jButtonCancelarProcesoRecap.isVisible();
			this.isVisibilidadCeldaGuardarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jButtonGuardarCambiosProcesoRecap.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoRecap=this.jButtonGuardarCambiosTablaProcesoRecap.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoRecap=this.jButtonNuevoToolBarProcesoRecap.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=this.jButtonNuevoRelacionesToolBarProcesoRecap.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
			this.isVisibilidadCeldaModificarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jButtonModificarToolBarProcesoRecap.isVisible();
			this.isVisibilidadCeldaActualizarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jButtonActualizarToolBarProcesoRecap.isVisible();
			this.isVisibilidadCeldaEliminarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jButtonEliminarToolBarProcesoRecap.isVisible();
			this.isVisibilidadCeldaCancelarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jButtonCancelarToolBarProcesoRecap.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoRecap=this.jButtonGuardarCambiosToolBarProcesoRecap.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoRecap=this.jButtonGuardarCambiosTablaToolBarProcesoRecap.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoRecap=this.jMenuItemNuevoProcesoRecap.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=this.jMenuItemNuevoRelacionesProcesoRecap.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
			this.isVisibilidadCeldaModificarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jMenuItemModificarProcesoRecap.isVisible();
			this.isVisibilidadCeldaActualizarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jMenuItemActualizarProcesoRecap.isVisible();
			this.isVisibilidadCeldaEliminarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jMenuItemEliminarProcesoRecap.isVisible();
			this.isVisibilidadCeldaCancelarProcesoRecap=this.jInternalFrameDetalleFormProcesoRecap.jMenuItemCancelarProcesoRecap.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoRecap=this.jMenuItemGuardarCambiosProcesoRecap.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoRecap=this.jMenuItemGuardarCambiosTablaProcesoRecap.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoRecap(Boolean esInicializar) {
		if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesorecapSessionBean.getConGuardarRelaciones()) {
				//if(this.procesorecapSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoRecap();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoRecap(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoRecap() {
		this.jButtonNuevoProcesoRecap.setVisible(this.isPermisoNuevoProcesoRecap);			
		this.jButtonDuplicarProcesoRecap.setVisible(this.isPermisoDuplicarProcesoRecap);			
		this.jButtonCopiarProcesoRecap.setVisible(this.isPermisoCopiarProcesoRecap);			
		this.jButtonVerFormProcesoRecap.setVisible(this.isPermisoVerFormProcesoRecap);			
		
		this.jButtonAbrirOrderByProcesoRecap.setVisible(this.isPermisoOrdenProcesoRecap);					
		
		this.jButtonNuevoRelacionesProcesoRecap.setVisible(this.isPermisoNuevoProcesoRecap);			
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecap.jButtonModificarProcesoRecap.setVisible(this.isPermisoActualizarProcesoRecap);	
			this.jInternalFrameDetalleFormProcesoRecap.jButtonActualizarProcesoRecap.setVisible(this.isPermisoActualizarProcesoRecap);	
			this.jInternalFrameDetalleFormProcesoRecap.jButtonEliminarProcesoRecap.setVisible(this.isPermisoEliminarProcesoRecap);
			this.jInternalFrameDetalleFormProcesoRecap.jButtonCancelarProcesoRecap.setVisible(this.isVisibilidadCeldaCancelarProcesoRecap);						
			this.jInternalFrameDetalleFormProcesoRecap.jButtonGuardarCambiosProcesoRecap.setVisible(this.isPermisoGuardarCambiosProcesoRecap);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoRecap.setVisible(this.isPermisoActualizarProcesoRecap);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoRecap() {
		this.jInternalFrameDetalleFormProcesoRecap.jButtonModificarProcesoRecap.setVisible(this.isPermisoActualizarProcesoRecap);	
		this.jInternalFrameDetalleFormProcesoRecap.jButtonActualizarProcesoRecap.setVisible(this.isPermisoActualizarProcesoRecap);	
		this.jInternalFrameDetalleFormProcesoRecap.jButtonEliminarProcesoRecap.setVisible(this.isPermisoEliminarProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jButtonCancelarProcesoRecap.setVisible(this.isVisibilidadCeldaCancelarProcesoRecap);							
		this.jInternalFrameDetalleFormProcesoRecap.jButtonGuardarCambiosProcesoRecap.setVisible((this.isVisibilidadCeldaGuardarProcesoRecap && this.isPermisoGuardarCambiosProcesoRecap));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoRecap() {
		if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoRecap();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoRecap() {
	}
	
	public void jTableDatosProcesoRecapListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoRecap(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecap(this.getprocesorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecap==null) {
						this.procesorecap = new ProcesoRecap();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
				}

				if(this.procesorecap.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesorecap.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProcesoRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProcesoRecap(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoRecap(this.getprocesorecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.procesorecapLogic.getConnexion());

				if(this.procesorecap.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.procesorecap.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoRecap=(TitledBorder)this.jScrollPanelDatosProcesoRecap.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProcesoRecap.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProcesoRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecap(this.getprocesorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecap==null) {
						this.procesorecap = new ProcesoRecap();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
				}

				if(this.procesorecap.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.procesorecap.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProcesoRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProcesoRecap(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoRecap(this.getprocesorecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.procesorecapLogic.getConnexion());

				if(this.procesorecap.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.procesorecap.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoRecap=(TitledBorder)this.jScrollPanelDatosProcesoRecap.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProcesoRecap.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProcesoRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecap(this.getprocesorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecap==null) {
						this.procesorecap = new ProcesoRecap();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
				}

				if(this.procesorecap.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.procesorecap.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioProcesoRecapUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebProcesoRecap(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoRecap.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoRecap.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoRecap(this.getprocesorecap(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.procesorecapLogic.getConnexion());

				if(this.procesorecap.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.procesorecap.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoRecap=(TitledBorder)this.jScrollPanelDatosProcesoRecap.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderProcesoRecap.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioProcesoRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecap(this.getprocesorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecap==null) {
						this.procesorecap = new ProcesoRecap();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
				}

				if(this.procesorecap.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.procesorecap.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeProcesoRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecap(this.getprocesorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecap==null) {
						this.procesorecap = new ProcesoRecap();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
				}

				if(this.procesorecap.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.procesorecap.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaProcesoRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecap(this.getprocesorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecap==null) {
						this.procesorecap = new ProcesoRecap();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
				}

				if(this.procesorecap.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.procesorecap.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteProcesoRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecap(this.getprocesorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecap==null) {
						this.procesorecap = new ProcesoRecap();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
				}

				if(this.procesorecap.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.procesorecap.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impresoProcesoRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecap(this.getprocesorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecap==null) {
						this.procesorecap = new ProcesoRecap();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
				}

				if(this.procesorecap.getnumero_pre_impreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso like '%"+this.procesorecap.getnumero_pre_impreso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_transaccionProcesoRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecap(this.getprocesorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecap==null) {
						this.procesorecap = new ProcesoRecap();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
				}

				if(this.procesorecap.getnombre_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_transaccion like '%"+this.procesorecap.getnombre_transaccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionProcesoRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecap(this.getprocesorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecap==null) {
						this.procesorecap = new ProcesoRecap();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
				}

				if(this.procesorecap.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.procesorecap.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_mone_localProcesoRecapBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoRecap(this.getprocesorecap(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesorecap==null) {
						this.procesorecap = new ProcesoRecap();
					}

					this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);
				}

				if(this.procesorecap.getmonto_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_mone_local = "+this.procesorecap.getmonto_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoRecap(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoRecapProcesoRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoRecap(false,false);

			this.getProcesoRecapsBusquedaProcesoRecap();

			this.inicializarActualizarBindingProcesoRecap(false);

			//if(ProcesoRecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioProcesoRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoRecap(false,false);

			this.getProcesoRecapsFK_IdEjercicio();

			this.inicializarActualizarBindingProcesoRecap(false);

			//if(ProcesoRecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProcesoRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoRecap(false,false);

			this.getProcesoRecapsFK_IdEmpresa();

			this.inicializarActualizarBindingProcesoRecap(false);

			//if(ProcesoRecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProcesoRecapActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoRecap(false,false);

			this.getProcesoRecapsFK_IdSucursal();

			this.inicializarActualizarBindingProcesoRecap(false);

			//if(ProcesoRecapBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoRecap(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesorecapLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoRecap() {
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
			this.jInternalFrameDetalleFormProcesoRecap.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoRecap.dispose();
			this.jInternalFrameDetalleFormProcesoRecap=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoRecap!=null) {
			this.jInternalFrameReporteDinamicoProcesoRecap.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoRecap.dispose();
			this.jInternalFrameReporteDinamicoProcesoRecap=null;
		}
		
		if(this.jInternalFrameImportacionProcesoRecap!=null) {
			this.jInternalFrameImportacionProcesoRecap.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoRecap.dispose();
			this.jInternalFrameImportacionProcesoRecap=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoRecap();
			
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoRecap")) {
				jButtonNuevoProcesoRecapActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoRecap")) {
				jButtonDuplicarProcesoRecapActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoRecap")) {
				jButtonCopiarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoRecap")) {
				jButtonVerFormProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoRecap")) {
				jButtonNuevoProcesoRecapActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoRecap")) {
				jButtonDuplicarProcesoRecapActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoRecap")) {
				jButtonNuevoProcesoRecapActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoRecap")) {
				jButtonDuplicarProcesoRecapActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoRecap")) {
				jButtonNuevoProcesoRecapActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoRecap")) {
				jButtonNuevoProcesoRecapActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoRecap")) {
				jButtonNuevoProcesoRecapActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoRecap")) {
				jButtonModificarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoRecap")) {
				jButtonModificarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoRecap")) {
				jButtonModificarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoRecap")) {
				jButtonActualizarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoRecap")) {
				jButtonActualizarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoRecap")) {
				jButtonActualizarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoRecap")) {
				jButtonEliminarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoRecap")) {
				jButtonEliminarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoRecap")) {
				jButtonEliminarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoRecap")) {
				jButtonCancelarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoRecap")) {
				jButtonCancelarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoRecap")) {
				jButtonCancelarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoRecap")) {
				jButtonCerrarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoRecap")) {
				jButtonCerrarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoRecap")) {
				jButtonCerrarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoRecap")) {
				jButtonMostrarOcultarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoRecap")) {
				jButtonCancelarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoRecap")) {
				jButtonGuardarCambiosProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoRecap")) {
				jButtonGuardarCambiosProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoRecap")) {
				jButtonCopiarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoRecap")) {
				jButtonVerFormProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoRecap")) {
				jButtonGuardarCambiosProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoRecap")) {
				jButtonCopiarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoRecap")) {
				jButtonVerFormProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoRecap")) {
				jButtonGuardarCambiosProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoRecap")) {
				jButtonGuardarCambiosProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoRecap")) {
				jButtonGuardarCambiosProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoRecap")) {
				jButtonRecargarInformacionProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoRecap")) {
				jButtonRecargarInformacionProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoRecap")) {
				jButtonRecargarInformacionProcesoRecapActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoRecap")) {
				jButtonAnterioresProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoRecap")) {
				jButtonAnterioresProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoRecap")) {
				jButtonAnterioresProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoRecap")) {
				jButtonSiguientesProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoRecap")) {
				jButtonSiguientesProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoRecap")) {
				jButtonSiguientesProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoRecap") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoRecap")) {
				jButtonAbrirOrderByProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoRecap") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoRecap")) {
				jButtonMostrarOcultarProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoRecap")) {
				jButtonNuevoGuardarCambiosProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoRecap")) {
				jButtonNuevoGuardarCambiosProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoRecap")) {
				jButtonNuevoGuardarCambiosProcesoRecapActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionProcesoRecap")) {
				jButtonProcesarInformacionProcesoRecapActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoRecap")) {
				jButtonCerrarReporteDinamicoProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoRecap")) {
				jButtonGenerarReporteDinamicoProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoRecap")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoRecap")) {
				jButtonCerrarImportacionProcesoRecapActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoRecap")) {
				
				jButtonGenerarImportacionProcesoRecapActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoRecap")) {
				
				jButtonAbrirImportacionProcesoRecapActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoRecap")) {
				jComboBoxTiposAccionesProcesoRecapActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoRecap")) {
				jComboBoxTiposRelacionesProcesoRecapActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoRecap")) {
				jComboBoxTiposAccionesProcesoRecapActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoRecap")) {
				
				jComboBoxTiposSeleccionarProcesoRecapActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoRecap")) {
				jTextFieldValorCampoGeneralProcesoRecapActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoRecap")) {
				jButtonAbrirOrderByProcesoRecapActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoRecap")) {
				jButtonAbrirOrderByProcesoRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoRecap")) {
				jButtonCerrarOrderByProcesoRecapActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoRecapBusqueda")) {
				this.jButtonidProcesoRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoRecapUpdate")) {
				this.jButtonid_empresaProcesoRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoRecapBusqueda")) {
				this.jButtonid_empresaProcesoRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoRecapUpdate")) {
				this.jButtonid_sucursalProcesoRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoRecapBusqueda")) {
				this.jButtonid_sucursalProcesoRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioProcesoRecapUpdate")) {
				this.jButtonid_ejercicioProcesoRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioProcesoRecapBusqueda")) {
				this.jButtonid_ejercicioProcesoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeProcesoRecapBusqueda")) {
				this.jButtonfecha_emision_desdeProcesoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaProcesoRecapBusqueda")) {
				this.jButtonfecha_emision_hastaProcesoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteProcesoRecapBusqueda")) {
				this.jButtonnombre_completo_clienteProcesoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoProcesoRecapBusqueda")) {
				this.jButtonnumero_pre_impresoProcesoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionProcesoRecapBusqueda")) {
				this.jButtonnombre_transaccionProcesoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionProcesoRecapBusqueda")) {
				this.jButtonfecha_emisionProcesoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_mone_localProcesoRecapBusqueda")) {
				this.jButtonmonto_mone_localProcesoRecapBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoRecapProcesoRecap")) {
				this.jButtonBusquedaProcesoRecapProcesoRecapActionPerformed(evt);
			}
			
			;
			
			
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoRecap();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoRecapActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
				


				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoRecap procesorecapLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesorecapLocal=this.procesorecap;
			} else {
				procesorecapLocal=this.procesorecapAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
							
				
				


				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapAnterior =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecapAnterior =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
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
			
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			
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
			
			


			
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoRecapActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
								
						
				


				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecap.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
								
				
				


				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapAnterior =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecapAnterior =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapAnterior =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecapAnterior =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecapActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
							
				
				


				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecap.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoRecapActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecapAnterior =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesorecapAnterior =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
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
			
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			
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
			
			


			
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecapActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
								
				
				


				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapAnterior =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecapAnterior =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecapActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoRecapActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoRecap")) {
					jCheckBoxSeleccionarTodosProcesoRecapItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoRecap")) {
					jCheckBoxSeleccionadosProcesoRecapItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoRecap")) {
					
				}
				
				


				
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
												
				
				


				
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecap.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoRecapActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesorecapAnterior =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesorecapAnterior =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoRecapActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
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
			
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
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
			
			


			
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoRecapActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecap.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecap.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesorecap);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesorecap);
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
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
				
				


				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoRecap.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoRecap.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoRecapActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesorecapAnterior =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesorecapAnterior =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoRecap")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoRecapListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoRecap.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesorecap =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesorecap =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesorecap);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoRecap")) {
				
				}
				
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoRecap")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoRecap.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoRecap")) {
			
			}
			
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoRecap();
			
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoRecap")) {
				jButtonNuevoProcesoRecapActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoRecap")) {
				jButtonDuplicarProcesoRecapActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoRecap")) {
				jButtonCopiarProcesoRecapActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoRecap")) {
				jButtonVerFormProcesoRecapActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoRecap")) {
				jButtonNuevoProcesoRecapActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoRecap")) {
				jButtonModificarProcesoRecapActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoRecap")) {
				jButtonActualizarProcesoRecapActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoRecap")) {
				jButtonEliminarProcesoRecapActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoRecap")) {
				jButtonGuardarCambiosProcesoRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoRecap")) {
				jButtonCancelarProcesoRecapActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoRecap")) {
				jButtonCerrarProcesoRecapActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoRecap")) {
				jButtonGuardarCambiosProcesoRecapActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoRecap")) {
				jButtonNuevoGuardarCambiosProcesoRecapActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoRecap")) {
				jButtonAbrirOrderByProcesoRecapActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoRecap")) {
				jButtonRecargarInformacionProcesoRecapActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoRecap")) {
				jButtonAnterioresProcesoRecapActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoRecap")) {
				jButtonSiguientesProcesoRecapActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoRecapBusqueda")) {
				this.jButtonidProcesoRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoRecapUpdate")) {
				this.jButtonid_empresaProcesoRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoRecapBusqueda")) {
				this.jButtonid_empresaProcesoRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoRecapUpdate")) {
				this.jButtonid_sucursalProcesoRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoRecapBusqueda")) {
				this.jButtonid_sucursalProcesoRecapBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioProcesoRecapUpdate")) {
				this.jButtonid_ejercicioProcesoRecapUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioProcesoRecapBusqueda")) {
				this.jButtonid_ejercicioProcesoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeProcesoRecapBusqueda")) {
				this.jButtonfecha_emision_desdeProcesoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaProcesoRecapBusqueda")) {
				this.jButtonfecha_emision_hastaProcesoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteProcesoRecapBusqueda")) {
				this.jButtonnombre_completo_clienteProcesoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoProcesoRecapBusqueda")) {
				this.jButtonnumero_pre_impresoProcesoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionProcesoRecapBusqueda")) {
				this.jButtonnombre_transaccionProcesoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionProcesoRecapBusqueda")) {
				this.jButtonfecha_emisionProcesoRecapBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_mone_localProcesoRecapBusqueda")) {
				this.jButtonmonto_mone_localProcesoRecapBusquedaActionPerformed(evt);
			}
			
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoRecap();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoRecap")) {
				closingInternalFrameProcesoRecap();
				
			} else if(sTipo.equals("jButtonCancelarProcesoRecap")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoRecap = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoRecapBeanSwingJInternalFrame jInternalFrameParent=(ProcesoRecapBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoRecap.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoRecapActionPerformed(null);
			}
			
			ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesorecap,new Object(),this.procesorecapParameterGeneral,this.procesorecapReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoRecap(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoRecap(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoRecap(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesorecap)) {
			if(!esControlTabla) {
				if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);			
				}
				
				if(this.procesorecapSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoRecap(this.procesorecap,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoRecap(this.procesorecapReturnGeneral,this.procesorecapBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesorecapSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoRecap(classes,this.procesorecapReturnGeneral,this.procesorecapBean,false);
					}
						
					if(this.procesorecapReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoRecap(this.procesorecapReturnGeneral.getProcesoRecap());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoRecap(this.procesorecapReturnGeneral.getProcesoRecap());	
					}
						
					if(this.procesorecapReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoRecap(this.procesorecapReturnGeneral.getProcesoRecap(),classes);//this.procesorecapBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoRecap(this.procesorecap,classes);//this.procesorecapBean);									
				}
			
				if(ProcesoRecapJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoRecap(this.procesorecap,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoRecap(this.procesorecap);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesorecapAnterior!=null) {
						this.procesorecap=this.procesorecapAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesorecapSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesorecapSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesorecapReturnGeneral.getProcesoRecap(),procesorecapLogic.getProcesoRecaps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesorecapReturnGeneral.getProcesoRecap(),this.procesorecaps);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoRecap.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoRecap.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoRecap();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoRecap() throws Exception {
		
		ProcesoRecapModel procesorecapModel=(ProcesoRecapModel)this.jTableDatosProcesoRecap.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesorecapModel.procesorecaps=this.procesorecapLogic.getProcesoRecaps();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesorecapModel.procesorecaps=this.procesorecaps;
		}
		
		
		((ProcesoRecapModel) this.jTableDatosProcesoRecap.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoRecap() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesorecapAnterior(),this.procesorecapLogic.getProcesoRecaps());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesorecapAnterior(),this.procesorecaps);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoRecap();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoRecap(ProcesoRecap procesorecap,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
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
										
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesorecap,new Object(),generalEntityParameterGeneral,this.procesorecapReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesorecapSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoRecapConstantesFunciones.getClassesRelationshipsOfProcesoRecap(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoRecapConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoRecap(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoRecap(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoRecapBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesorecap,new Object(),generalEntityParameterGeneral,this.procesorecapReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoRecap(ProcesoRecapBean procesorecapBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoRecap(ArrayList<Classe> classes,ProcesoRecapReturnGeneral procesorecapReturnGeneral,ProcesoRecapBean procesorecapBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoRecap(ProcesoRecap procesorecap,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesorecap)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoRecap = new ProcesoRecapDetalleFormJInternalFrame(jDesktopPane,this.procesorecapSessionBean.getConGuardarRelaciones(),this.procesorecapSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.setVisible(false);
		this.jInternalFrameDetalleFormProcesoRecap.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoRecap.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoRecap.procesorecapLogic=this.procesorecapLogic;
		
		this.cargarCombosFrameForeignKeyProcesoRecap("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoRecap();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoRecap();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoRecap("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoRecap();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoRecap.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoRecap"));
		
		this.jInternalFrameDetalleFormProcesoRecap.jButtonModificarProcesoRecap.addActionListener(new ButtonActionListener(this,"ModificarProcesoRecap"));

		
		this.jInternalFrameDetalleFormProcesoRecap.jButtonModificarToolBarProcesoRecap.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoRecap"));
					
		this.jInternalFrameDetalleFormProcesoRecap.jMenuItemModificarProcesoRecap.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoRecap"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoRecap.jButtonActualizarProcesoRecap.addActionListener (new ButtonActionListener(this,"ActualizarProcesoRecap"));
		
		
		this.jInternalFrameDetalleFormProcesoRecap.jButtonActualizarToolBarProcesoRecap.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoRecap"));
						
		this.jInternalFrameDetalleFormProcesoRecap.jMenuItemActualizarProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoRecap"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoRecap.jButtonEliminarProcesoRecap.addActionListener (new ButtonActionListener(this,"EliminarProcesoRecap"));
		
		
		this.jInternalFrameDetalleFormProcesoRecap.jButtonEliminarToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoRecap"));
								
		this.jInternalFrameDetalleFormProcesoRecap.jMenuItemEliminarProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoRecap"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoRecap.jButtonCancelarProcesoRecap.addActionListener (new ButtonActionListener(this,"CancelarProcesoRecap"));
		
		
		this.jInternalFrameDetalleFormProcesoRecap.jButtonCancelarToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoRecap"));
					
		this.jInternalFrameDetalleFormProcesoRecap.jMenuItemCancelarProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoRecap"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoRecap.jMenuItemDetalleCerrarProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoRecap"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoRecap.jButtonGuardarCambiosToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoRecap"));
		
		
		
		this.jInternalFrameDetalleFormProcesoRecap.jButtonGuardarCambiosToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoRecap"));
		
		
		
		this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoRecap"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonidProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_empresaProcesoRecapUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_empresaProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_sucursalProcesoRecapUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_sucursalProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_ejercicioProcesoRecapUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_ejercicioProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonfecha_emision_desdeProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonfecha_emision_hastaProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonnombre_completo_clienteProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonnumero_pre_impresoProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonnombre_transaccionProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonfecha_emisionProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonmonto_mone_localProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"monto_mone_localProcesoRecapBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoRecap.jTabbedPaneRelacionesProcesoRecap.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoRecap"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoRecap"));
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecap.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoRecap"));
		}
		
		this.jTableDatosProcesoRecap.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoRecap"));
		
		this.jTableDatosProcesoRecap.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoRecap"));
		
		this.jButtonNuevoProcesoRecap.addActionListener(new ButtonActionListener(this,"NuevoProcesoRecap"));
		
		this.jButtonDuplicarProcesoRecap.addActionListener(new ButtonActionListener(this,"DuplicarProcesoRecap"));
		
		this.jButtonCopiarProcesoRecap.addActionListener(new ButtonActionListener(this,"CopiarProcesoRecap"));
		
		this.jButtonVerFormProcesoRecap.addActionListener(new ButtonActionListener(this,"VerFormProcesoRecap"));
		
		
		this.jButtonNuevoToolBarProcesoRecap.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoRecap"));
			
		this.jButtonDuplicarToolBarProcesoRecap.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoRecap"));
			
		this.jMenuItemNuevoProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoRecap"));
			
		this.jMenuItemDuplicarProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoRecap"));		
		
		
		this.jButtonNuevoRelacionesProcesoRecap.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoRecap"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoRecap.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoRecap"));
			
		this.jMenuItemNuevoRelacionesProcesoRecap.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoRecap"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecap.jButtonModificarProcesoRecap.addActionListener(new ButtonActionListener(this,"ModificarProcesoRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecap.jButtonModificarToolBarProcesoRecap.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoRecap"));
			
			this.jInternalFrameDetalleFormProcesoRecap.jMenuItemModificarProcesoRecap.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoRecap.jButtonActualizarProcesoRecap.addActionListener (new ButtonActionListener(this,"ActualizarProcesoRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecap.jButtonActualizarToolBarProcesoRecap.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoRecap"));
				
			this.jInternalFrameDetalleFormProcesoRecap.jMenuItemActualizarProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecap.jButtonEliminarProcesoRecap.addActionListener (new ButtonActionListener(this,"EliminarProcesoRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecap.jButtonEliminarToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoRecap"));
						
			this.jInternalFrameDetalleFormProcesoRecap.jMenuItemEliminarProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecap.jButtonCancelarProcesoRecap.addActionListener (new ButtonActionListener(this,"CancelarProcesoRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecap.jButtonCancelarToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoRecap"));
			
			this.jInternalFrameDetalleFormProcesoRecap.jMenuItemCancelarProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoRecap"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoRecap"));		
		
		
		this.jButtonCerrarProcesoRecap.addActionListener (new ButtonActionListener(this,"CerrarProcesoRecap"));
		
		
		this.jButtonCerrarToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoRecap"));
			
		this.jMenuItemCerrarProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoRecap"));
			
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecap.jMenuItemDetalleCerrarProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoRecap"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecap.jButtonGuardarCambiosProcesoRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoRecap"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecap.jButtonGuardarCambiosToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoRecap"));
		}
		
		this.jButtonCopiarToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoRecap"));
			
		this.jButtonVerFormToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoRecap"));
		
		this.jMenuItemGuardarCambiosProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoRecap"));
			
		this.jMenuItemCopiarProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoRecap"));		
		
		this.jMenuItemVerFormProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoRecap"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoRecap"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoRecap"));
			
		this.jMenuItemGuardarCambiosTablaProcesoRecap.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoRecap"));		
		
		
		
		this.jButtonRecargarInformacionProcesoRecap.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoRecap"));
					
		this.jButtonRecargarInformacionToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoRecap"));
		
		this.jMenuItemRecargarInformacionProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoRecap"));		
		
		
		
		this.jButtonAnterioresProcesoRecap.addActionListener (new ButtonActionListener(this,"AnterioresProcesoRecap"));
		
		
		this.jButtonAnterioresToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoRecap"));
		
		this.jMenuItemAnterioresProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoRecap"));		
		
		
		this.jButtonSiguientesProcesoRecap.addActionListener (new ButtonActionListener(this,"SiguientesProcesoRecap"));
		
		
		this.jButtonSiguientesToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoRecap"));
			
		this.jMenuItemSiguientesProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoRecap"));
			
		this.jMenuItemAbrirOrderByProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoRecap"));
			
		this.jMenuItemMostrarOcultarProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoRecap"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoRecap"));
			
		this.jMenuItemDetalleMostarOcultarProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoRecap"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoRecap.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoRecap"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoRecap"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoRecap.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoRecap"));		
		
		
		this.jButtonProcesarInformacionProcesoRecap.addActionListener (new ButtonActionListener(this,"ProcesarInformacionProcesoRecap"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoRecap.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoRecap"));

		this.jCheckBoxSeleccionadosProcesoRecap.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoRecap"));
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoRecap"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoRecap.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoRecap"));
			
		this.jComboBoxTiposAccionesProcesoRecap.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoRecap"));
					
		this.jComboBoxTiposSeleccionarProcesoRecap.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoRecap"));
			
		this.jTextFieldValorCampoGeneralProcesoRecap.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoRecap"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonidProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_empresaProcesoRecapUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_empresaProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_sucursalProcesoRecapUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_sucursalProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_ejercicioProcesoRecapUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_ejercicioProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonfecha_emision_desdeProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonfecha_emision_hastaProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonnombre_completo_clienteProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonnumero_pre_impresoProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonnombre_transaccionProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonfecha_emisionProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonmonto_mone_localProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"monto_mone_localProcesoRecapBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoRecapProcesoRecap.addActionListener(new ButtonActionListener(this,"BusquedaProcesoRecapProcesoRecap"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoRecap!=null) {
				this.jInternalFrameReporteDinamicoProcesoRecap.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoRecap"));
				this.jInternalFrameReporteDinamicoProcesoRecap.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoRecap"));
				this.jInternalFrameReporteDinamicoProcesoRecap.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoRecap"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoRecap.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoRecap"));				
			//this.jButtonGenerarReporteDinamicoProcesoRecap.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoRecap"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoRecap.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoRecap"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoRecap!=null) {
				this.jInternalFrameImportacionProcesoRecap.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoRecap"));
				this.jInternalFrameImportacionProcesoRecap.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoRecap"));
				this.jInternalFrameImportacionProcesoRecap.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoRecap"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoRecap.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoRecap"));
			
			this.jButtonAbrirOrderByToolBarProcesoRecap.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoRecap"));			
			
			if(this.jInternalFrameOrderByProcesoRecap!=null) {
				this.jInternalFrameOrderByProcesoRecap.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoRecap"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoRecap.jTabbedPaneRelacionesProcesoRecap.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoRecap"));
		
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
            		closingInternalFrameProcesoRecap();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoRecap.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoRecap = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoRecapBeanSwingJInternalFrame jInternalFrameParent=(ProcesoRecapBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoRecap.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoRecapActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoRecap.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoRecapListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoRecap.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoRecap.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoRecapActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoRecapActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoRecapActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoRecap";
		inputMap = this.jButtonNuevoProcesoRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoRecapActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoRecapActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoRecapActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoRecapActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoRecap";
		inputMap = this.jButtonNuevoRelacionesProcesoRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoRecapActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoRecap";
		inputMap = this.jButtonModificarProcesoRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoRecap";
		inputMap = this.jButtonActualizarProcesoRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoRecap";
		inputMap = this.jButtonEliminarProcesoRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoRecap";
		inputMap = this.jButtonCancelarProcesoRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoRecap";
		inputMap = this.jButtonCerrarProcesoRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoRecap.jButtonGuardarCambiosProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoRecap";
		inputMap = this.jInternalFrameDetalleFormProcesoRecap.jButtonGuardarCambiosProcesoRecap.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoRecap.jButtonGuardarCambiosProcesoRecap.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoRecapActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoRecap.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoRecapItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoRecap.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoRecapActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoRecap.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoRecapActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoRecap.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoRecapActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonidProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_empresaProcesoRecapUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_empresaProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_sucursalProcesoRecapUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_sucursalProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoRecapBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_ejercicioProcesoRecapUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoRecapUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonid_ejercicioProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonfecha_emision_desdeProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonfecha_emision_hastaProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonnombre_completo_clienteProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonnumero_pre_impresoProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonnombre_transaccionProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonfecha_emisionProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionProcesoRecapBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoRecap.jButtonmonto_mone_localProcesoRecapBusqueda.addActionListener(new ButtonActionListener(this,"monto_mone_localProcesoRecapBusqueda"));
		
		
		this.jButtonBusquedaProcesoRecapProcesoRecap.addActionListener(new ButtonActionListener(this,"BusquedaProcesoRecapProcesoRecap"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoRecap.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoRecapActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoRecapActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoRecap.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoRecap(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoRecap procesorecapAux:this.procesorecapLogic.getProcesoRecaps()) {
					procesorecapAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoRecap procesorecapAux:procesorecaps) {
					procesorecapAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoRecapItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoRecap(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoRecap procesorecapAux:this.procesorecapLogic.getProcesoRecaps()) {
						procesorecapAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoRecap procesorecapAux:procesorecaps) {
						procesorecapAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoRecap procesorecapAux:this.procesorecapLogic.getProcesoRecaps()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoRecap procesorecapAux:procesorecaps) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoRecap(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoRecap.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoRecap.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecap,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoRecapItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoRecap(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoRecap.getSelectedRows();
			
			ProcesoRecap procesorecapLocal=new ProcesoRecap();
			
			//this.seleccionarTodosProcesoRecap(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesorecapLocal =(ProcesoRecap) this.procesorecapLogic.getProcesoRecaps().toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesorecapLocal =(ProcesoRecap) this.procesorecaps.toArray()[this.jTableDatosProcesoRecap.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesorecapLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoRecap procesorecapAux:this.procesorecapLogic.getProcesoRecaps()) {
						procesorecapAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoRecap procesorecapAux:procesorecaps) {
						procesorecapAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoRecap(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoRecap.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoRecap.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoRecap,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoRecapItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoRecapParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoRecapActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoRecap(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoRecap.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoRecap procesorecapAux:this.procesorecapLogic.getProcesoRecaps()) {
				
						if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							procesorecapAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							procesorecapAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							procesorecapAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							procesorecapAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							procesorecapAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							procesorecapAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL)) {
							existe=true;
							procesorecapAux.setmonto_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoRecap procesorecapAux:procesorecaps) {
					
						if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							procesorecapAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							procesorecapAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							procesorecapAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							procesorecapAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							procesorecapAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							procesorecapAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL)) {
							existe=true;
							procesorecapAux.setmonto_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoRecap(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoRecapActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoRecap(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoRecap=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoRecap.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoRecap) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoRecap(conSplash);
				
					this.generarReporteProcesoRecapsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoRecapsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoRecap.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoRecapsSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoRecap.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoRecapsSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoRecap.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoRecap();
				
				this.exportarProcesoRecapsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoRecaps();
				//this.importarProcesoRecaps();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoRecap();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoRecapsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoRecap.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoRecap();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoRecap)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoRecap(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Recap",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoRecap.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoRecapBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoRecap) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoRecap(conSplash);
					
						//this.actualizarParametrosGeneralProcesoRecap();
						
						this.generarReporteProcesoAccionProcesoRecapsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoRecap.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoRecapBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso RecapES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Recap", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoRecap();
				
						this.actualizarParametrosGeneralProcesoRecap();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesorecapReturnGeneral=procesorecapLogic.procesarAccionProcesoRecapsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesorecapLogic.getProcesoRecaps(),this.procesorecapParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoRecapReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoRecap.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoRecap();
					
					ProcesoRecapBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoRecapReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoRecap.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoRecap.jComboBoxTiposAccionesFormularioProcesoRecap.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoRecap(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoRecapActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoRecap();
			
			if(this.jInternalFrameDetalleFormProcesoRecap==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoRecap> procesorecapsSeleccionados=new ArrayList<ProcesoRecap>();		
			ProcesoRecap procesorecap=new ProcesoRecap();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoRecap(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoRecap.getSelectedItem();
			
			
			
			
			procesorecapsSeleccionados=this.getProcesoRecapsSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesorecapsSeleccionados.size()==1) {
				for(ProcesoRecap procesorecapAux:procesorecapsSeleccionados) {
					procesorecap=procesorecapAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoRecap();
			
      		//this.finishProcessProcesoRecap(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoRecapReturnGeneral() throws Exception {
		if(this.procesorecapReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesorecapReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesorecapReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesorecapReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesorecapReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesorecapReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoRecap(false);
		}
		
		if(this.procesorecapReturnGeneral.getConRetornoLista() || this.procesorecapReturnGeneral.getConRetornoObjeto()) {
			if(this.procesorecapReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.procesorecapLogic.setProcesoRecaps(this.procesorecapReturnGeneral.getProcesoRecaps());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoRecap(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoRecap() throws Exception {
		this.inicializarActualizarBindingTablasParametrosManualProcesoRecap();
		
		
		//this.procesorecapParameterGeneral.setnumero_recapProcesoRecapParam(this.getnumero_recapProcesoRecapParam());
		//this.procesorecapParameterGeneral.setautorizacion_recapProcesoRecapParam(this.getautorizacion_recapProcesoRecapParam());
		//this.procesorecapParameterGeneral.setfecha_recapProcesoRecapParam(this.getfecha_recapProcesoRecapParam());
	}
	
	public ArrayList<ProcesoRecap> getProcesoRecapsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoRecap> procesorecapsSeleccionados=new ArrayList<ProcesoRecap>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoRecap) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoRecap procesorecapAux:procesorecapLogic.getProcesoRecaps()) {
					if(procesorecapAux.getIsSelected()) {
						procesorecapsSeleccionados.add(procesorecapAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoRecap procesorecapAux:this.procesorecaps) {
					if(procesorecapAux.getIsSelected()) {
						procesorecapsSeleccionados.add(procesorecapAux);				
					}
				}
			}
			
			if(procesorecapsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesorecapsSeleccionados.addAll(this.procesorecapLogic.getProcesoRecaps());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesorecapsSeleccionados.addAll(this.procesorecaps);				
					}
				}
			}
		} else {
			procesorecapsSeleccionados.add(this.procesorecap);
		}
		
		return procesorecapsSeleccionados;
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
	
	public void generarReporteProcesoRecapsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoRecapsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoRecapsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoRecapsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoRecapsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Recap",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoRecapsSeleccionados() throws Exception {
		ArrayList<ProcesoRecap> procesorecapsSeleccionados=new ArrayList<ProcesoRecap>();		
		
		procesorecapsSeleccionados=this.getProcesoRecapsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoRecaps("Todos",procesorecapsSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoRecapsSeleccionados() throws Exception {
		ArrayList<ProcesoRecap> procesorecapsSeleccionados=new ArrayList<ProcesoRecap>();		
		
		procesorecapsSeleccionados=this.getProcesoRecapsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoRecaps("Todos",procesorecapsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoRecapsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoRecap> procesorecapsSeleccionados=new ArrayList<ProcesoRecap>();
		
		procesorecapsSeleccionados=this.getProcesoRecapsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoRecaps("Todos",procesorecapsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoRecapsSeleccionados() throws Exception {
		ArrayList<ProcesoRecap> procesorecapsSeleccionados=new ArrayList<ProcesoRecap>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoRecap();
		
		
		procesorecapsSeleccionados=this.getProcesoRecapsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoRecap();
		
		
		//this.generarReporteProcesoRecaps("Todos",procesorecapsSeleccionados ,procesorecapImplementable,procesorecapImplementableHome);
	}
	
	public void mostrarImportacionProcesoRecaps() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoRecap();
		
		this.abrirFrameImportacionProcesoRecap();		
		
			
		//this.generarReporteProcesoRecaps("Todos",procesorecapsSeleccionados ,procesorecapImplementable,procesorecapImplementableHome);
	}
	
	public void importarProcesoRecaps() throws Exception {		
	
	}
	
	public void exportarProcesoRecapsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoRecapsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoRecapsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoRecapsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Recap",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoRecapsSeleccionados() throws Exception {
		ArrayList<ProcesoRecap> procesorecapsSeleccionados=new ArrayList<ProcesoRecap>();		
		
		procesorecapsSeleccionados=this.getProcesoRecapsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesorecap."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoRecap(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoRecap procesorecapAux:procesorecapsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoRecap(procesorecapAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesorecapAux.setsDetalleGeneralEntityReporte(procesorecapAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recap",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoRecap(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoRecapConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecapConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecapConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecapConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecapConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoRecap(ProcesoRecap procesorecap,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesorecap.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecap.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecap.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecap.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecap.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecap.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecap.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecap.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecap.getnumero_pre_impreso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecap.getnombre_transaccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecap.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesorecap.getmonto_mone_local().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoRecapsSeleccionados() throws Exception {
		ArrayList<ProcesoRecap> procesorecapsSeleccionados=new ArrayList<ProcesoRecap>();		
		
		procesorecapsSeleccionados=this.getProcesoRecapsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesorecap.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoRecaps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoRecap(row);				
				iRow++;
			}				
			
			for(ProcesoRecap procesorecapAux:procesorecapsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoRecap(procesorecapAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recap",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoRecapsSeleccionados() throws Exception {
		ArrayList<ProcesoRecap> procesorecapsSeleccionados=new ArrayList<ProcesoRecap>();		
		
		procesorecapsSeleccionados=this.getProcesoRecapsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesorecap.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesorecaps");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesorecap");
			//elementRoot.appendChild(element);
		
			for(ProcesoRecap procesorecapAux:procesorecapsSeleccionados) {
				element = document.createElement("procesorecap");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoRecap(procesorecapAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesorecapSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Recap",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoRecap(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoRecapConstantesFunciones.LABEL_MONTOMONELOCAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoRecap(ProcesoRecap procesorecap,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecap.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecap.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecap.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecap.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecap.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecap.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecap.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecap.getnumero_pre_impreso());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecap.getnombre_transaccion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecap.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(procesorecap.getmonto_mone_local());				
	}
	
	public void setFilaDatosExportarXmlProcesoRecap(ProcesoRecap procesorecap,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoRecapConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesorecap.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoRecapConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesorecap.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProcesoRecapConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(procesorecap.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProcesoRecapConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(procesorecap.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(ProcesoRecapConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(procesorecap.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementfecha_emision_desde = document.createElement(ProcesoRecapConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(procesorecap.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(ProcesoRecapConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(procesorecap.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_completo_cliente = document.createElement(ProcesoRecapConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(procesorecap.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnumero_pre_impreso = document.createElement(ProcesoRecapConstantesFunciones.NUMEROPREIMPRESO);
		elementnumero_pre_impreso.appendChild(document.createTextNode(procesorecap.getnumero_pre_impreso().trim()));
		element.appendChild(elementnumero_pre_impreso);

		Element elementnombre_transaccion = document.createElement(ProcesoRecapConstantesFunciones.NOMBRETRANSACCION);
		elementnombre_transaccion.appendChild(document.createTextNode(procesorecap.getnombre_transaccion().trim()));
		element.appendChild(elementnombre_transaccion);

		Element elementfecha_emision = document.createElement(ProcesoRecapConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(procesorecap.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementmonto_mone_local = document.createElement(ProcesoRecapConstantesFunciones.MONTOMONELOCAL);
		elementmonto_mone_local.appendChild(document.createTextNode(procesorecap.getmonto_mone_local().toString().trim()));
		element.appendChild(elementmonto_mone_local);
	}
	
	public void generarReporteGroupGenericoProcesoRecapsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoRecap> procesorecapsSeleccionados=new ArrayList<ProcesoRecap>();
		
		procesorecapsSeleccionados=this.getProcesoRecapsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoRecap(procesorecapsSeleccionados);
		
		this.generarReporteProcesoRecaps("Todos",procesorecapsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoRecap(ArrayList<ProcesoRecap> procesorecapsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoRecap procesorecapAux:procesorecapsSeleccionados) {
				procesorecapAux.setsDetalleGeneralEntityReporte(procesorecapAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					procesorecapAux.setsDescripcionGeneralEntityReporte1(procesorecapAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					procesorecapAux.setsDescripcionGeneralEntityReporte1(procesorecapAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					procesorecapAux.setsDescripcionGeneralEntityReporte1(procesorecapAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					procesorecapAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesorecapAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					procesorecapAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesorecapAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					procesorecapAux.setsDescripcionGeneralEntityReporte1(procesorecapAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
					existe=true;
					procesorecapAux.setsDescripcionGeneralEntityReporte1(procesorecapAux.getnumero_pre_impreso());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
					existe=true;
					procesorecapAux.setsDescripcionGeneralEntityReporte1(procesorecapAux.getnombre_transaccion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoRecapConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					procesorecapAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(procesorecapAux.getfecha_emision()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoRecapConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoRecap(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoRecap=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoRecap=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoRecap=false;
			this.isVisibilidadCeldaActualizarProcesoRecap=false;
			this.isVisibilidadCeldaEliminarProcesoRecap=false;
			this.isVisibilidadCeldaCancelarProcesoRecap=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoRecap=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecap=false;
			this.isVisibilidadCeldaModificarProcesoRecap=false;
			this.isVisibilidadCeldaActualizarProcesoRecap=true;
			this.isVisibilidadCeldaEliminarProcesoRecap=false;
			this.isVisibilidadCeldaCancelarProcesoRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoRecap=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecap=false;
			this.isVisibilidadCeldaModificarProcesoRecap=false;
			this.isVisibilidadCeldaActualizarProcesoRecap=true;
			this.isVisibilidadCeldaEliminarProcesoRecap=true;
			this.isVisibilidadCeldaCancelarProcesoRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoRecap=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecap=false;
			this.isVisibilidadCeldaModificarProcesoRecap=false;
			this.isVisibilidadCeldaActualizarProcesoRecap=true;
			this.isVisibilidadCeldaEliminarProcesoRecap=false;
			this.isVisibilidadCeldaCancelarProcesoRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoRecap=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoRecap=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoRecap=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecap=true;
			this.isVisibilidadCeldaModificarProcesoRecap=false;
			this.isVisibilidadCeldaActualizarProcesoRecap=false;
			this.isVisibilidadCeldaEliminarProcesoRecap=false;
			this.isVisibilidadCeldaCancelarProcesoRecap=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoRecap=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoRecap=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecap=false;
			this.isVisibilidadCeldaActualizarProcesoRecap=false;
			this.isVisibilidadCeldaEliminarProcesoRecap=false;
			this.isVisibilidadCeldaCancelarProcesoRecap=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoRecap=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoRecap=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoRecap=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecap=false;
			this.isVisibilidadCeldaModificarProcesoRecap=true;
			this.isVisibilidadCeldaActualizarProcesoRecap=false;
			this.isVisibilidadCeldaEliminarProcesoRecap=false;
			this.isVisibilidadCeldaCancelarProcesoRecap=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoRecap=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoRecap=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoRecapJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoRecap=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecap=true;
		} else {
			this.actualizarEstadoPanelsProcesoRecap(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoRecap=false;
			//this.isVisibilidadCeldaVerFormProcesoRecap=false;
			this.isVisibilidadCeldaDuplicarProcesoRecap=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesorecapSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoRecap=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoRecap=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesorecapSessionBean.getEsGuardarRelacionado()) {
			if(!procesorecapSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=false;												
			}
			
			this.jButtonCerrarProcesoRecap.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=false;
		}
		
		if(!this.permiteMantenimiento(this.procesorecap)) {
			this.isVisibilidadCeldaActualizarProcesoRecap=false;
			this.isVisibilidadCeldaEliminarProcesoRecap=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoRecap=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoRecap=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoRecap=false;
		//this.isVisibilidadCeldaModificarProcesoRecap=true;
		this.isVisibilidadCeldaActualizarProcesoRecap=false;
		this.isVisibilidadCeldaEliminarProcesoRecap=false;
		//this.isVisibilidadCeldaCancelarProcesoRecap=true;			
		this.isVisibilidadCeldaGuardarProcesoRecap=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoRecap() {
	}
	
	public void actualizarEstadoPanelsProcesoRecap(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoRecap!=null) {
				this.jScrollPanelDatosEdicionProcesoRecap.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecap!=null) {
				this.jTabbedPaneBusquedasProcesoRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoRecap!=null) {
				this.jScrollPanelDatosProcesoRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoRecap!=null) {
				this.jPanelPaginacionProcesoRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoRecap!=null) {
				this.jPanelParametrosReportesProcesoRecap.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoRecap!=null) {
				this.jScrollPanelDatosEdicionProcesoRecap.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecap!=null) {
				this.jTabbedPaneBusquedasProcesoRecap.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoRecap!=null) {
				this.jScrollPanelDatosProcesoRecap.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoRecap!=null) {
				this.jPanelPaginacionProcesoRecap.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoRecap!=null) {
				this.jPanelParametrosReportesProcesoRecap.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoRecap!=null) {
				this.jScrollPanelDatosEdicionProcesoRecap.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecap!=null) {
				this.jTabbedPaneBusquedasProcesoRecap.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoRecap!=null) {
				this.jScrollPanelDatosProcesoRecap.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoRecap!=null) {
				this.jPanelPaginacionProcesoRecap.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoRecap!=null) {
				this.jPanelParametrosReportesProcesoRecap.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoRecap!=null) {
				this.jScrollPanelDatosEdicionProcesoRecap.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecap!=null) {
				this.jTabbedPaneBusquedasProcesoRecap.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoRecap!=null) {
				this.jScrollPanelDatosProcesoRecap.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoRecap!=null) {
				this.jPanelPaginacionProcesoRecap.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoRecap!=null) {
				this.jPanelParametrosReportesProcesoRecap.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoRecap!=null) {
				this.jScrollPanelDatosEdicionProcesoRecap.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecap!=null) {
				this.jTabbedPaneBusquedasProcesoRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoRecap!=null) {
				this.jScrollPanelDatosProcesoRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoRecap!=null) {
				this.jPanelPaginacionProcesoRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoRecap!=null) {
				this.jPanelParametrosReportesProcesoRecap.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoRecap!=null) {
				this.jScrollPanelDatosEdicionProcesoRecap.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecap!=null) {
				this.jTabbedPaneBusquedasProcesoRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoRecap!=null) {
				this.jScrollPanelDatosProcesoRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoRecap!=null) {
				this.jPanelPaginacionProcesoRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoRecap!=null) {
				this.jPanelParametrosReportesProcesoRecap.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoRecap!=null) {
				this.jScrollPanelDatosEdicionProcesoRecap.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecap!=null) {
				this.jTabbedPaneBusquedasProcesoRecap.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoRecap!=null) {
				this.jScrollPanelDatosProcesoRecap.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoRecap!=null) {
				this.jPanelPaginacionProcesoRecap.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoRecap!=null) {
				this.jPanelParametrosReportesProcesoRecap.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesorecapSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoRecap!=null) {
					this.jTabbedPaneBusquedasProcesoRecap.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoRecap!=null) {
				this.jPanelParametrosReportesProcesoRecap.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesorecapSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoRecap!=null) {
				this.jTabbedPaneBusquedasProcesoRecap.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoRecap!=null) {
				this.jPanelParametrosReportesProcesoRecap.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProcesoRecap=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProcesoRecap) {this.jTabbedPaneBusquedasProcesoRecap.remove(jPanelBusquedaProcesoRecapProcesoRecap);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProcesoRecap=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProcesoRecap) {this.jTabbedPaneBusquedasProcesoRecap.remove(jPanelBusquedaProcesoRecapProcesoRecap);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaProcesoRecap=isParaEjercicio;
			if(!this.isVisibilidadBusquedaProcesoRecap) {this.jTabbedPaneBusquedasProcesoRecap.remove(jPanelBusquedaProcesoRecapProcesoRecap);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProcesoRecap(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoRecap() {
		this.updateBorderResaltarBusquedasFormularioProcesoRecap();
		this.updateVisibilidadBusquedasFormularioProcesoRecap();
		this.updateHabilitarBusquedasFormularioProcesoRecap();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoRecap() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoRecap.getComponents().length>0) {
	

		if(this.procesorecapConstantesFunciones.resaltarBusquedaProcesoRecapProcesoRecap!=null) {
			index= this.jTabbedPaneBusquedasProcesoRecap.indexOfComponent(this.jPanelBusquedaProcesoRecapProcesoRecap);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoRecap.getComponent(index);
				jPanel.setBorder(this.procesorecapConstantesFunciones.resaltarBusquedaProcesoRecapProcesoRecap);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoRecap() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoRecap.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoRecap.indexOfComponent(this.jPanelBusquedaProcesoRecapProcesoRecap);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoRecap.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesorecapConstantesFunciones.mostrarBusquedaProcesoRecapProcesoRecap);
			if(!this.procesorecapConstantesFunciones.mostrarBusquedaProcesoRecapProcesoRecap && index>-1) {
				this.jTabbedPaneBusquedasProcesoRecap.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoRecap() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoRecap.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoRecap.indexOfComponent(this.jPanelBusquedaProcesoRecapProcesoRecap);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoRecap.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesorecapConstantesFunciones.activarBusquedaProcesoRecapProcesoRecap);
				this.jTabbedPaneBusquedasProcesoRecap.setEnabledAt(index,this.procesorecapConstantesFunciones.activarBusquedaProcesoRecapProcesoRecap);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoRecap(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoRecap")) {
			index= this.jTabbedPaneBusquedasProcesoRecap.indexOfComponent(this.jPanelBusquedaProcesoRecapProcesoRecap);

			this.jTabbedPaneBusquedasProcesoRecap.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoRecap.getComponent(index);

			this.procesorecapConstantesFunciones.setResaltarBusquedaProcesoRecapProcesoRecap(resaltar);

			jPanel.setBorder(this.procesorecapConstantesFunciones.resaltarBusquedaProcesoRecapProcesoRecap);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoRecap.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoRecap() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoRecap==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoRecap();
		this.updateVisibilidadResaltarControlesFormularioProcesoRecap();
		this.updateHabilitarResaltarControlesFormularioProcesoRecap();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoRecap() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoRecap==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesorecapConstantesFunciones.resaltaridProcesoRecap!=null && this.jInternalFrameDetalleFormProcesoRecap!=null) {this.jInternalFrameDetalleFormProcesoRecap.jLabelidProcesoRecap.setBorder(this.procesorecapConstantesFunciones.resaltaridProcesoRecap);}
		if(this.procesorecapConstantesFunciones.resaltarid_empresaProcesoRecap!=null && this.jInternalFrameDetalleFormProcesoRecap!=null) {this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap.setBorder(this.procesorecapConstantesFunciones.resaltarid_empresaProcesoRecap);}
		if(this.procesorecapConstantesFunciones.resaltarid_sucursalProcesoRecap!=null && this.jInternalFrameDetalleFormProcesoRecap!=null) {this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap.setBorder(this.procesorecapConstantesFunciones.resaltarid_sucursalProcesoRecap);}
		if(this.procesorecapConstantesFunciones.resaltarid_ejercicioProcesoRecap!=null && this.jInternalFrameDetalleFormProcesoRecap!=null) {this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.setBorder(this.procesorecapConstantesFunciones.resaltarid_ejercicioProcesoRecap);}
		if(this.procesorecapConstantesFunciones.resaltarfecha_emision_desdeProcesoRecap!=null && this.jInternalFrameDetalleFormProcesoRecap!=null) {this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emision_desdeProcesoRecap.setBorder(this.procesorecapConstantesFunciones.resaltarfecha_emision_desdeProcesoRecap);}
		if(this.procesorecapConstantesFunciones.resaltarfecha_emision_hastaProcesoRecap!=null && this.jInternalFrameDetalleFormProcesoRecap!=null) {this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emision_hastaProcesoRecap.setBorder(this.procesorecapConstantesFunciones.resaltarfecha_emision_hastaProcesoRecap);}
		if(this.procesorecapConstantesFunciones.resaltarnombre_completo_clienteProcesoRecap!=null && this.jInternalFrameDetalleFormProcesoRecap!=null) {this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_completo_clienteProcesoRecap.setBorder(this.procesorecapConstantesFunciones.resaltarnombre_completo_clienteProcesoRecap);}
		if(this.procesorecapConstantesFunciones.resaltarnumero_pre_impresoProcesoRecap!=null && this.jInternalFrameDetalleFormProcesoRecap!=null) {this.jInternalFrameDetalleFormProcesoRecap.jTextFieldnumero_pre_impresoProcesoRecap.setBorder(this.procesorecapConstantesFunciones.resaltarnumero_pre_impresoProcesoRecap);}
		if(this.procesorecapConstantesFunciones.resaltarnombre_transaccionProcesoRecap!=null && this.jInternalFrameDetalleFormProcesoRecap!=null) {this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_transaccionProcesoRecap.setBorder(this.procesorecapConstantesFunciones.resaltarnombre_transaccionProcesoRecap);}
		if(this.procesorecapConstantesFunciones.resaltarfecha_emisionProcesoRecap!=null && this.jInternalFrameDetalleFormProcesoRecap!=null) {this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emisionProcesoRecap.setBorder(this.procesorecapConstantesFunciones.resaltarfecha_emisionProcesoRecap);}
		if(this.procesorecapConstantesFunciones.resaltarmonto_mone_localProcesoRecap!=null && this.jInternalFrameDetalleFormProcesoRecap!=null) {this.jInternalFrameDetalleFormProcesoRecap.jTextFieldmonto_mone_localProcesoRecap.setBorder(this.procesorecapConstantesFunciones.resaltarmonto_mone_localProcesoRecap);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoRecap() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoRecap==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
	
		//this.jInternalFrameDetalleFormProcesoRecap.jLabelidProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostraridProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jPanelidProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostraridProcesoRecap);
		//this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarid_empresaProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jPanelid_empresaProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarid_empresaProcesoRecap);
		//this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarid_sucursalProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jPanelid_sucursalProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarid_sucursalProcesoRecap);
		//this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarid_ejercicioProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jPanelid_ejercicioProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarid_ejercicioProcesoRecap);
		//this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emision_desdeProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarfecha_emision_desdeProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jPanelfecha_emision_desdeProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarfecha_emision_desdeProcesoRecap);
		//this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emision_hastaProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarfecha_emision_hastaProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jPanelfecha_emision_hastaProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarfecha_emision_hastaProcesoRecap);
		//this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_completo_clienteProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarnombre_completo_clienteProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jPanelnombre_completo_clienteProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarnombre_completo_clienteProcesoRecap);
		//this.jInternalFrameDetalleFormProcesoRecap.jTextFieldnumero_pre_impresoProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarnumero_pre_impresoProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jPanelnumero_pre_impresoProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarnumero_pre_impresoProcesoRecap);
		//this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_transaccionProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarnombre_transaccionProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jPanelnombre_transaccionProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarnombre_transaccionProcesoRecap);
		//this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emisionProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarfecha_emisionProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jPanelfecha_emisionProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarfecha_emisionProcesoRecap);
		//this.jInternalFrameDetalleFormProcesoRecap.jTextFieldmonto_mone_localProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarmonto_mone_localProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jPanelmonto_mone_localProcesoRecap.setVisible(this.procesorecapConstantesFunciones.mostrarmonto_mone_localProcesoRecap);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoRecap() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoRecap==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoRecap!=null) {
	
		this.jInternalFrameDetalleFormProcesoRecap.jLabelidProcesoRecap.setEnabled(this.procesorecapConstantesFunciones.activaridProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_empresaProcesoRecap.setEnabled(this.procesorecapConstantesFunciones.activarid_empresaProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_sucursalProcesoRecap.setEnabled(this.procesorecapConstantesFunciones.activarid_sucursalProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jComboBoxid_ejercicioProcesoRecap.setEnabled(this.procesorecapConstantesFunciones.activarid_ejercicioProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emision_desdeProcesoRecap.setEnabled(this.procesorecapConstantesFunciones.activarfecha_emision_desdeProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emision_hastaProcesoRecap.setEnabled(this.procesorecapConstantesFunciones.activarfecha_emision_hastaProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_completo_clienteProcesoRecap.setEnabled(this.procesorecapConstantesFunciones.activarnombre_completo_clienteProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jTextFieldnumero_pre_impresoProcesoRecap.setEnabled(this.procesorecapConstantesFunciones.activarnumero_pre_impresoProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jTextAreanombre_transaccionProcesoRecap.setEnabled(this.procesorecapConstantesFunciones.activarnombre_transaccionProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jDateChooserfecha_emisionProcesoRecap.setEnabled(this.procesorecapConstantesFunciones.activarfecha_emisionProcesoRecap);
		this.jInternalFrameDetalleFormProcesoRecap.jTextFieldmonto_mone_localProcesoRecap.setEnabled(this.procesorecapConstantesFunciones.activarmonto_mone_localProcesoRecap);
		}
	}
	
		
}