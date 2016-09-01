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

//import com.bydan.erp.cartera.util.CobrarClientesPorRegionConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarClientesPorRegionParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarClientesPorRegionParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarClientesPorRegionBean;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CobrarClientesPorRegionBeanSwingJInternalFrame extends CobrarClientesPorRegionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarClientesPorRegionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarClientesPorRegion> cobrarclientesporregionValidator = new ClassValidator<CobrarClientesPorRegion>(CobrarClientesPorRegion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarClientesPorRegion cobrarclientesporregion;	
	public CobrarClientesPorRegion cobrarclientesporregionAux;
	public CobrarClientesPorRegion cobrarclientesporregionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarClientesPorRegion cobrarclientesporregionTotales;
	public Long idCobrarClientesPorRegionActual;
	public Long iIdNuevoCobrarClientesPorRegion=0L;
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

	public String sFinalQueryComboRegion="";

	public List<Region> regionsForeignKey;

	public List<Region> getregionsForeignKey() {
		return regionsForeignKey;
	}

	public void setregionsForeignKey(List<Region> regionsForeignKey) {
		this.regionsForeignKey = regionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Region regionForeignKey;

	public Region getregionForeignKey() {
		return regionForeignKey;
	}

	public void setregionForeignKey(Region regionForeignKey) {
		this.regionForeignKey = regionForeignKey;
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
	
	public Boolean isPermisoTodoCobrarClientesPorRegion;
	public Boolean isPermisoNuevoCobrarClientesPorRegion;
	public Boolean isPermisoActualizarCobrarClientesPorRegion;
	public Boolean isPermisoActualizarOriginalCobrarClientesPorRegion;
	public Boolean isPermisoEliminarCobrarClientesPorRegion;
	public Boolean isPermisoGuardarCambiosCobrarClientesPorRegion;
	public Boolean isPermisoConsultaCobrarClientesPorRegion;
	public Boolean isPermisoBusquedaCobrarClientesPorRegion;
	public Boolean isPermisoReporteCobrarClientesPorRegion;
	public Boolean isPermisoPaginacionMedioCobrarClientesPorRegion;
	public Boolean isPermisoPaginacionAltoCobrarClientesPorRegion;
	public Boolean isPermisoPaginacionTodoCobrarClientesPorRegion;
	public Boolean isPermisoCopiarCobrarClientesPorRegion;
	public Boolean isPermisoVerFormCobrarClientesPorRegion;
	public Boolean isPermisoDuplicarCobrarClientesPorRegion;
	public Boolean isPermisoOrdenCobrarClientesPorRegion;
	
	
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
	
	public CobrarClientesPorRegionParameterReturnGeneral cobrarclientesporregionReturnGeneral;
	public CobrarClientesPorRegionParameterReturnGeneral cobrarclientesporregionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarClientesPorRegion=false;
	public Boolean esParaAccionDesdeFormularioCobrarClientesPorRegion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarClientesPorRegionSessionBeanAdditional cobrarclientesporregionSessionBeanAdditional=null;
	
	public CobrarClientesPorRegionSessionBeanAdditional getCobrarClientesPorRegionSessionBeanAdditional() {
		return this.cobrarclientesporregionSessionBeanAdditional;
	}
	
	public void setCobrarClientesPorRegionSessionBeanAdditional(CobrarClientesPorRegionSessionBeanAdditional cobrarclientesporregionSessionBeanAdditional) {
		try {
			this.cobrarclientesporregionSessionBeanAdditional=cobrarclientesporregionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarClientesPorRegionBeanSwingJInternalFrameAdditional cobrarclientesporregionBeanSwingJInternalFrameAdditional=null;
	//public class CobrarClientesPorRegionBeanSwingJInternalFrame
	
	public CobrarClientesPorRegionBeanSwingJInternalFrameAdditional getCobrarClientesPorRegionBeanSwingJInternalFrameAdditional() {
		return this.cobrarclientesporregionBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarClientesPorRegionBeanSwingJInternalFrameAdditional(CobrarClientesPorRegionBeanSwingJInternalFrameAdditional cobrarclientesporregionBeanSwingJInternalFrameAdditional) {
		try {
			this.cobrarclientesporregionBeanSwingJInternalFrameAdditional=cobrarclientesporregionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarClientesPorRegionLogic cobrarclientesporregionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarClientesPorRegion cobrarclientesporregionBean;
	public CobrarClientesPorRegionConstantesFunciones cobrarclientesporregionConstantesFunciones;
	//public CobrarClientesPorRegionParameterReturnGeneral cobrarclientesporregionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public PaisLogic paisLogic;
	public RegionLogic regionLogic;
	public ProvinciaLogic provinciaLogic;
	public CiudadLogic ciudadLogic;
	
	//PARAMETROS
	
	
	//public List<CobrarClientesPorRegion> cobrarclientesporregions;	
	//public List<CobrarClientesPorRegion> cobrarclientesporregionsEliminados;
	//public List<CobrarClientesPorRegion> cobrarclientesporregionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarClientesPorRegion=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarClientesPorRegion=true;
	public Boolean isVisibilidadCeldaCopiarCobrarClientesPorRegion=true;
	public Boolean isVisibilidadCeldaVerFormCobrarClientesPorRegion=true;
	public Boolean isVisibilidadCeldaOrdenCobrarClientesPorRegion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=false;
	public Boolean isVisibilidadCeldaModificarCobrarClientesPorRegion=false;
	public Boolean isVisibilidadCeldaActualizarCobrarClientesPorRegion=false;
	public Boolean isVisibilidadCeldaEliminarCobrarClientesPorRegion=false;
	public Boolean isVisibilidadCeldaCancelarCobrarClientesPorRegion=false;
	public Boolean isVisibilidadCeldaGuardarCobrarClientesPorRegion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarClientesPorRegion=false;
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdProvincia=false;
	public Boolean isVisibilidadFK_IdRegion=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoCobrarClientesPorRegion() {
		return this.iIdNuevoCobrarClientesPorRegion;
	}

	public void setiIdNuevoCobrarClientesPorRegion(Long iIdNuevoCobrarClientesPorRegion) {
		this.iIdNuevoCobrarClientesPorRegion = iIdNuevoCobrarClientesPorRegion;
	}
	
	public Long getidCobrarClientesPorRegionActual() {
		return this.idCobrarClientesPorRegionActual;
	}

	public void setidCobrarClientesPorRegionActual(Long idCobrarClientesPorRegionActual) {
		this.idCobrarClientesPorRegionActual = idCobrarClientesPorRegionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarClientesPorRegion getcobrarclientesporregion() {
		return this.cobrarclientesporregion;
	}

	public void setcobrarclientesporregion(CobrarClientesPorRegion cobrarclientesporregion) {
		this.cobrarclientesporregion = cobrarclientesporregion;
	}
	
	public CobrarClientesPorRegion getcobrarclientesporregionAux() {
		return this.cobrarclientesporregionAux;
	}

	public void setcobrarclientesporregionAux(CobrarClientesPorRegion cobrarclientesporregionAux) {
		this.cobrarclientesporregionAux = cobrarclientesporregionAux;
	}				
	
	public CobrarClientesPorRegion getcobrarclientesporregionAnterior() {
		return this.cobrarclientesporregionAnterior;
	}

	public void setcobrarclientesporregionAnterior(CobrarClientesPorRegion cobrarclientesporregionAnterior) {
		this.cobrarclientesporregionAnterior = cobrarclientesporregionAnterior;
	}	
	
	public CobrarClientesPorRegion getcobrarclientesporregionTotales() {
		return this.cobrarclientesporregionTotales;
	}

	public void setcobrarclientesporregionTotales(CobrarClientesPorRegion cobrarclientesporregionTotales) {
		this.cobrarclientesporregionTotales = cobrarclientesporregionTotales;
	}	
	
	public CobrarClientesPorRegion getcobrarclientesporregionBean() {
		return this.cobrarclientesporregionBean;
	}

	public void setcobrarclientesporregionBean(CobrarClientesPorRegion cobrarclientesporregionBean) {
		this.cobrarclientesporregionBean = cobrarclientesporregionBean;
	}	
	
	public CobrarClientesPorRegionParameterReturnGeneral getcobrarclientesporregionReturnGeneral() {
		return this.cobrarclientesporregionReturnGeneral;
	}

	public void setcobrarclientesporregionReturnGeneral(CobrarClientesPorRegionParameterReturnGeneral cobrarclientesporregionReturnGeneral) {
		this.cobrarclientesporregionReturnGeneral = cobrarclientesporregionReturnGeneral;
	}	
	
	
	public Long id_paisBusquedaCobrarClientesPorRegion=-1L;

	public Long getid_paisBusquedaCobrarClientesPorRegion() {
		return this.id_paisBusquedaCobrarClientesPorRegion;
	}

	public void setid_paisBusquedaCobrarClientesPorRegion(Long id_paisBusquedaCobrarClientesPorRegion) {
		this.id_paisBusquedaCobrarClientesPorRegion = id_paisBusquedaCobrarClientesPorRegion;
	}

;
	public Long id_regionBusquedaCobrarClientesPorRegion=-1L;

	public Long getid_regionBusquedaCobrarClientesPorRegion() {
		return this.id_regionBusquedaCobrarClientesPorRegion;
	}

	public void setid_regionBusquedaCobrarClientesPorRegion(Long id_regionBusquedaCobrarClientesPorRegion) {
		this.id_regionBusquedaCobrarClientesPorRegion = id_regionBusquedaCobrarClientesPorRegion;
	}

;
	public Long id_provinciaBusquedaCobrarClientesPorRegion=-1L;

	public Long getid_provinciaBusquedaCobrarClientesPorRegion() {
		return this.id_provinciaBusquedaCobrarClientesPorRegion;
	}

	public void setid_provinciaBusquedaCobrarClientesPorRegion(Long id_provinciaBusquedaCobrarClientesPorRegion) {
		this.id_provinciaBusquedaCobrarClientesPorRegion = id_provinciaBusquedaCobrarClientesPorRegion;
	}

;
	public Long id_ciudadBusquedaCobrarClientesPorRegion=-1L;

	public Long getid_ciudadBusquedaCobrarClientesPorRegion() {
		return this.id_ciudadBusquedaCobrarClientesPorRegion;
	}

	public void setid_ciudadBusquedaCobrarClientesPorRegion(Long id_ciudadBusquedaCobrarClientesPorRegion) {
		this.id_ciudadBusquedaCobrarClientesPorRegion = id_ciudadBusquedaCobrarClientesPorRegion;
	}

	public Long id_ciudadFK_IdCiudad=-1L;

	public Long getid_ciudadFK_IdCiudad() {
		return this.id_ciudadFK_IdCiudad;
	}

	public void setid_ciudadFK_IdCiudad(Long id_ciudadFK_IdCiudad) {
		this.id_ciudadFK_IdCiudad = id_ciudadFK_IdCiudad;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
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

	public Long id_regionFK_IdRegion=-1L;

	public Long getid_regionFK_IdRegion() {
		return this.id_regionFK_IdRegion;
	}

	public void setid_regionFK_IdRegion(Long id_regionFK_IdRegion) {
		this.id_regionFK_IdRegion = id_regionFK_IdRegion;
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
	
	
	public CobrarClientesPorRegionLogic getCobrarClientesPorRegionLogic()	{		
		return cobrarclientesporregionLogic;
	}

	public void setCobrarClientesPorRegionLogic(CobrarClientesPorRegionLogic cobrarclientesporregionLogic) {
		this.cobrarclientesporregionLogic = cobrarclientesporregionLogic;
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
	
	public Boolean getIsEsNuevoCobrarClientesPorRegion() {
		return isEsNuevoCobrarClientesPorRegion;
	}

	public void setIsEsNuevoCobrarClientesPorRegion(Boolean isEsNuevoCobrarClientesPorRegion) {
		this.isEsNuevoCobrarClientesPorRegion = isEsNuevoCobrarClientesPorRegion;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarClientesPorRegion() {
		return esParaAccionDesdeFormularioCobrarClientesPorRegion;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarClientesPorRegion(Boolean esParaAccionDesdeFormularioCobrarClientesPorRegion) {
		this.esParaAccionDesdeFormularioCobrarClientesPorRegion = esParaAccionDesdeFormularioCobrarClientesPorRegion;
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

			if(this.cobrarclientesporregionSessionBean==null) {
				this.cobrarclientesporregionSessionBean=new CobrarClientesPorRegionSessionBean();
			}

			if(!this.cobrarclientesporregionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cobrarclientesporregionSessionBean.getlidEmpresaActual());
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

			if(this.cobrarclientesporregionSessionBean==null) {
				this.cobrarclientesporregionSessionBean=new CobrarClientesPorRegionSessionBean();
			}

			if(!this.cobrarclientesporregionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(cobrarclientesporregionSessionBean.getlidSucursalActual());
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

			//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.cobrarclientesporregionSessionBean==null) {
				this.cobrarclientesporregionSessionBean=new CobrarClientesPorRegionSessionBean();
			}

			if(!this.cobrarclientesporregionSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

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
					paisLogic.getEntityWithConnection(cobrarclientesporregionSessionBean.getlidPaisActual());
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

	public void cargarCombosRegionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.regionsForeignKey=new ArrayList<Region>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			RegionLogic regionLogic=new RegionLogic();

			//regionLogic.getRegionDataAccess().setIsForForeingKeyData(true);

			if(this.cobrarclientesporregionSessionBean==null) {
				this.cobrarclientesporregionSessionBean=new CobrarClientesPorRegionSessionBean();
			}

			if(!this.cobrarclientesporregionSessionBean.getisBusquedaDesdeForeignKeySesionRegion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//regionLogic.getRegionDataAccess().setIsForForeingKeyData(true);

					regionLogic.getTodosRegionsWithConnection(sFinalQuery,new Pagination());

					this.regionsForeignKey=regionLogic.getRegions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaRegion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					regionLogic.getEntityWithConnection(cobrarclientesporregionSessionBean.getlidRegionActual());
					this.regionsForeignKey.add(regionLogic.getRegion());
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

			//provinciaLogic.getProvinciaDataAccess().setIsForForeingKeyData(true);

			if(this.cobrarclientesporregionSessionBean==null) {
				this.cobrarclientesporregionSessionBean=new CobrarClientesPorRegionSessionBean();
			}

			if(!this.cobrarclientesporregionSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//provinciaLogic.getProvinciaDataAccess().setIsForForeingKeyData(true);

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
					provinciaLogic.getEntityWithConnection(cobrarclientesporregionSessionBean.getlidProvinciaActual());
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

			//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.cobrarclientesporregionSessionBean==null) {
				this.cobrarclientesporregionSessionBean=new CobrarClientesPorRegionSessionBean();
			}

			if(!this.cobrarclientesporregionSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

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
					ciudadLogic.getEntityWithConnection(cobrarclientesporregionSessionBean.getlidCiudadActual());
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

					if(this.cobrarclientesporregion!=null) {
						this.cobrarclientesporregion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
						this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCobrarClientesPorRegion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCobrarClientesPorRegionGenerico)throws Exception
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
				jComboBoxid_empresaCobrarClientesPorRegionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCobrarClientesPorRegionGenerico!=null && jComboBoxid_empresaCobrarClientesPorRegionGenerico.getItemCount()>0) {
					jComboBoxid_empresaCobrarClientesPorRegionGenerico.setSelectedIndex(0);
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

					if(this.cobrarclientesporregion!=null) {
						this.cobrarclientesporregion.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
						this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCobrarClientesPorRegion.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCobrarClientesPorRegionGenerico)throws Exception
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
				jComboBoxid_sucursalCobrarClientesPorRegionGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCobrarClientesPorRegionGenerico!=null && jComboBoxid_sucursalCobrarClientesPorRegionGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCobrarClientesPorRegionGenerico.setSelectedIndex(0);
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

					if(this.cobrarclientesporregion!=null) {
						this.cobrarclientesporregion.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
						this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisCobrarClientesPorRegion.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesPorRegion") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion!=null) {
						jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion!=null) {
							//jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedItem(paisTemp);
							if(jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.getItemCount()>0) {
								jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisCobrarClientesPorRegionGenerico)throws Exception
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
				jComboBoxid_paisCobrarClientesPorRegionGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisCobrarClientesPorRegionGenerico!=null && jComboBoxid_paisCobrarClientesPorRegionGenerico.getItemCount()>0) {
					jComboBoxid_paisCobrarClientesPorRegionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualRegionForeignKey(Long idRegionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Region  regionTemp=null;

			for(Region regionAux:regionsForeignKey) {
				if(regionAux.getId()!=null && regionAux.getId().equals(idRegionSeleccionado)) {
					regionTemp=regionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(regionTemp!=null) {

					if(this.cobrarclientesporregion!=null) {
						this.cobrarclientesporregion.setRegion(regionTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
						this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion.setSelectedItem(regionTemp);
					}
				} else {
					//jComboBoxid_regionCobrarClientesPorRegion.setSelectedItem(regionTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesPorRegion") || sFormularioTipoBusqueda.equals("Todos")){
					if(regionTemp!=null && jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion!=null) {
						jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedItem(regionTemp);
					} else {
						if(jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion!=null) {
							//jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedItem(regionTemp);
							if(jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.getItemCount()>0) {
								jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedIndex(0);
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

	public String getActualRegionForeignKeyDescripcion(Long idRegionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Region  regionTemp=null;

			for(Region regionAux:regionsForeignKey) {
				if(regionAux.getId()!=null && regionAux.getId().equals(idRegionSeleccionado)) {
					regionTemp=regionAux;
					break;
				}
			}


			sDescripcion=RegionConstantesFunciones.getRegionDescripcion(regionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualRegionForeignKeyGenerico(Long idRegionSeleccionado,JComboBox jComboBoxid_regionCobrarClientesPorRegionGenerico)throws Exception
	{
		try
		{
			Region  regionTemp=null;

			for(Region regionAux:regionsForeignKey) {
				if(regionAux.getId()!=null && regionAux.getId().equals(idRegionSeleccionado)) {
					regionTemp=regionAux;
					break;
				}
			}

			if(regionTemp!=null) {
				jComboBoxid_regionCobrarClientesPorRegionGenerico.setSelectedItem(regionTemp);
			} else {
				if(jComboBoxid_regionCobrarClientesPorRegionGenerico!=null && jComboBoxid_regionCobrarClientesPorRegionGenerico.getItemCount()>0) {
					jComboBoxid_regionCobrarClientesPorRegionGenerico.setSelectedIndex(0);
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

					if(this.cobrarclientesporregion!=null) {
						this.cobrarclientesporregion.setProvincia(provinciaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
						this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion.setSelectedItem(provinciaTemp);
					}
				} else {
					//jComboBoxid_provinciaCobrarClientesPorRegion.setSelectedItem(provinciaTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesPorRegion") || sFormularioTipoBusqueda.equals("Todos")){
					if(provinciaTemp!=null && jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion!=null) {
						jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedItem(provinciaTemp);
					} else {
						if(jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion!=null) {
							//jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedItem(provinciaTemp);
							if(jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.getItemCount()>0) {
								jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedIndex(0);
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
	public void setActualProvinciaForeignKeyGenerico(Long idProvinciaSeleccionado,JComboBox jComboBoxid_provinciaCobrarClientesPorRegionGenerico)throws Exception
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
				jComboBoxid_provinciaCobrarClientesPorRegionGenerico.setSelectedItem(provinciaTemp);
			} else {
				if(jComboBoxid_provinciaCobrarClientesPorRegionGenerico!=null && jComboBoxid_provinciaCobrarClientesPorRegionGenerico.getItemCount()>0) {
					jComboBoxid_provinciaCobrarClientesPorRegionGenerico.setSelectedIndex(0);
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

					if(this.cobrarclientesporregion!=null) {
						this.cobrarclientesporregion.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
						this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadCobrarClientesPorRegion.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesPorRegion") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion!=null) {
						jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion!=null) {
							//jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedItem(ciudadTemp);
							if(jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.getItemCount()>0) {
								jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedIndex(0);
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
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadCobrarClientesPorRegionGenerico)throws Exception
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
				jComboBoxid_ciudadCobrarClientesPorRegionGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadCobrarClientesPorRegionGenerico!=null && jComboBoxid_ciudadCobrarClientesPorRegionGenerico.getItemCount()>0) {
					jComboBoxid_ciudadCobrarClientesPorRegionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CobrarClientesPorRegion cobrarclientesporregion,JComboBox jComboBoxid_empresaCobrarClientesPorRegionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCobrarClientesPorRegionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCobrarClientesPorRegionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cobrarclientesporregion.setid_empresa(empresaAux.getId());
				cobrarclientesporregion.setempresa_descripcion(CobrarClientesPorRegionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cobrarclientesporregion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CobrarClientesPorRegion cobrarclientesporregion,JComboBox jComboBoxid_sucursalCobrarClientesPorRegionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCobrarClientesPorRegionGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCobrarClientesPorRegionGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cobrarclientesporregion.setid_sucursal(sucursalAux.getId());
				cobrarclientesporregion.setsucursal_descripcion(CobrarClientesPorRegionConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cobrarclientesporregion.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(CobrarClientesPorRegion cobrarclientesporregion,JComboBox jComboBoxid_paisCobrarClientesPorRegionGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisCobrarClientesPorRegionGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisCobrarClientesPorRegionGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				cobrarclientesporregion.setid_pais(paisAux.getId());
				cobrarclientesporregion.setpais_descripcion(CobrarClientesPorRegionConstantesFunciones.getPaisDescripcion(paisAux));
				cobrarclientesporregion.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRegionForeignKey(CobrarClientesPorRegion cobrarclientesporregion,JComboBox jComboBoxid_regionCobrarClientesPorRegionGenerico)throws Exception
	{
		try
		{
			Region  regionAux=new Region();

			if(jComboBoxid_regionCobrarClientesPorRegionGenerico==null) {
				regionAux=(Region)this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion.getSelectedItem();
			} else {
				regionAux=(Region)jComboBoxid_regionCobrarClientesPorRegionGenerico.getSelectedItem();
			}

			if(regionAux!=null && regionAux.getId()!=null) {
				cobrarclientesporregion.setid_region(regionAux.getId());
				cobrarclientesporregion.setregion_descripcion(CobrarClientesPorRegionConstantesFunciones.getRegionDescripcion(regionAux));
				cobrarclientesporregion.setRegion(regionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProvinciaForeignKey(CobrarClientesPorRegion cobrarclientesporregion,JComboBox jComboBoxid_provinciaCobrarClientesPorRegionGenerico)throws Exception
	{
		try
		{
			Provincia  provinciaAux=new Provincia();

			if(jComboBoxid_provinciaCobrarClientesPorRegionGenerico==null) {
				provinciaAux=(Provincia)this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion.getSelectedItem();
			} else {
				provinciaAux=(Provincia)jComboBoxid_provinciaCobrarClientesPorRegionGenerico.getSelectedItem();
			}

			if(provinciaAux!=null && provinciaAux.getId()!=null) {
				cobrarclientesporregion.setid_provincia(provinciaAux.getId());
				cobrarclientesporregion.setprovincia_descripcion(CobrarClientesPorRegionConstantesFunciones.getProvinciaDescripcion(provinciaAux));
				cobrarclientesporregion.setProvincia(provinciaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(CobrarClientesPorRegion cobrarclientesporregion,JComboBox jComboBoxid_ciudadCobrarClientesPorRegionGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadCobrarClientesPorRegionGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadCobrarClientesPorRegionGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				cobrarclientesporregion.setid_ciudad(ciudadAux.getId());
				cobrarclientesporregion.setciudad_descripcion(CobrarClientesPorRegionConstantesFunciones.getCiudadDescripcion(ciudadAux));
				cobrarclientesporregion.setCiudad(ciudadAux);			}
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

					if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { 
					}

					if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { 
					}

					if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { 
					}

					if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesPorRegion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.addItem(pais);
							}
						}

						if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameRegionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingRegion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion.removeAllItems();

							for(Region region:this.regionsForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion.addItem(region);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { 
					}

					if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesPorRegion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.removeAllItems();

							for(Region region:this.regionsForeignKey) {
								this.jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.addItem(region);
							}
						}

						if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion.addItem(provincia);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { 
					}

					if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesPorRegion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.addItem(provincia);
							}
						}

						if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { 
					}

					if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarClientesPorRegion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.addItem(ciudad);
							}
						}

						if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameRegionForeignKey(Region region,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion.setSelectedItem(region);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedItem(region);
						} else {
							this.jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion.setSelectedItem(provincia);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedItem(provincia);
						} else {
							this.jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedItem(ciudad);
						} else {
							this.jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCobrarClientesPorRegion() throws Exception {
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
		
	public CobrarClientesPorRegionParameterReturnGeneral getCobrarClientesPorRegionParameterGeneral() {
		return this.cobrarclientesporregionParameterGeneral;
	}
	
	public void setCobrarClientesPorRegionParameterGeneral(CobrarClientesPorRegionParameterReturnGeneral cobrarclientesporregionParameterGeneral) {
		this.cobrarclientesporregionParameterGeneral = cobrarclientesporregionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarClientesPorRegion() {
		return isPermisoTodoCobrarClientesPorRegion;
	}

	public void setIsPermisoTodoCobrarClientesPorRegion(Boolean isPermisoTodoCobrarClientesPorRegion) {
		this.isPermisoTodoCobrarClientesPorRegion = isPermisoTodoCobrarClientesPorRegion;
	}

	public Boolean getIsPermisoNuevoCobrarClientesPorRegion() {
		return isPermisoNuevoCobrarClientesPorRegion;
	}

	public void setIsPermisoNuevoCobrarClientesPorRegion(Boolean isPermisoNuevoCobrarClientesPorRegion) {
		this.isPermisoNuevoCobrarClientesPorRegion = isPermisoNuevoCobrarClientesPorRegion;
	}

	public Boolean getIsPermisoActualizarCobrarClientesPorRegion() {
		return isPermisoActualizarCobrarClientesPorRegion;
	}

	public void setIsPermisoActualizarCobrarClientesPorRegion(Boolean isPermisoActualizarCobrarClientesPorRegion) {
		this.isPermisoActualizarCobrarClientesPorRegion = isPermisoActualizarCobrarClientesPorRegion;
	}

	public Boolean getIsPermisoEliminarCobrarClientesPorRegion() {
		return isPermisoEliminarCobrarClientesPorRegion;
	}

	public void setIsPermisoEliminarCobrarClientesPorRegion(Boolean isPermisoEliminarCobrarClientesPorRegion) {
		this.isPermisoEliminarCobrarClientesPorRegion = isPermisoEliminarCobrarClientesPorRegion;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarClientesPorRegion() {
		return isPermisoGuardarCambiosCobrarClientesPorRegion;
	}

	public void setIsPermisoGuardarCambiosCobrarClientesPorRegion(Boolean isPermisoGuardarCambiosCobrarClientesPorRegion) {
		this.isPermisoGuardarCambiosCobrarClientesPorRegion = isPermisoGuardarCambiosCobrarClientesPorRegion;
	}
	
	public Boolean getIsPermisoConsultaCobrarClientesPorRegion() {
		return isPermisoConsultaCobrarClientesPorRegion;
	}

	public void setIsPermisoConsultaCobrarClientesPorRegion(Boolean isPermisoConsultaCobrarClientesPorRegion) {
		this.isPermisoConsultaCobrarClientesPorRegion = isPermisoConsultaCobrarClientesPorRegion;
	}

	public Boolean getIsPermisoBusquedaCobrarClientesPorRegion() {
		return isPermisoBusquedaCobrarClientesPorRegion;
	}

	public void setIsPermisoBusquedaCobrarClientesPorRegion(Boolean isPermisoBusquedaCobrarClientesPorRegion) {
		this.isPermisoBusquedaCobrarClientesPorRegion = isPermisoBusquedaCobrarClientesPorRegion;
	}

	public Boolean getIsPermisoReporteCobrarClientesPorRegion() {
		return isPermisoReporteCobrarClientesPorRegion;
	}

	public void setIsPermisoReporteCobrarClientesPorRegion(Boolean isPermisoReporteCobrarClientesPorRegion) {
		this.isPermisoReporteCobrarClientesPorRegion = isPermisoReporteCobrarClientesPorRegion;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarClientesPorRegion() {
		return isPermisoPaginacionMedioCobrarClientesPorRegion;
	}

	public void setIsPermisoPaginacionMedioCobrarClientesPorRegion(Boolean isPermisoPaginacionMedioCobrarClientesPorRegion) {
		this.isPermisoPaginacionMedioCobrarClientesPorRegion = isPermisoPaginacionMedioCobrarClientesPorRegion;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarClientesPorRegion() {
		return isPermisoPaginacionTodoCobrarClientesPorRegion;
	}

	public void setIsPermisoPaginacionTodoCobrarClientesPorRegion(Boolean isPermisoPaginacionTodoCobrarClientesPorRegion) {
		this.isPermisoPaginacionTodoCobrarClientesPorRegion = isPermisoPaginacionTodoCobrarClientesPorRegion;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarClientesPorRegion() {
		return isPermisoPaginacionAltoCobrarClientesPorRegion;
	}

	public void setIsPermisoPaginacionAltoCobrarClientesPorRegion(Boolean isPermisoPaginacionAltoCobrarClientesPorRegion) {
		this.isPermisoPaginacionAltoCobrarClientesPorRegion = isPermisoPaginacionAltoCobrarClientesPorRegion;
	}
	
	public Boolean getIsPermisoCopiarCobrarClientesPorRegion() {
		return isPermisoCopiarCobrarClientesPorRegion;
	}

	public void setIsPermisoCopiarCobrarClientesPorRegion(Boolean isPermisoCopiarCobrarClientesPorRegion) {
		this.isPermisoCopiarCobrarClientesPorRegion = isPermisoCopiarCobrarClientesPorRegion;
	}
	
	public Boolean getIsPermisoVerFormCobrarClientesPorRegion() {
		return isPermisoVerFormCobrarClientesPorRegion;
	}

	public void setIsPermisoVerFormCobrarClientesPorRegion(Boolean isPermisoVerFormCobrarClientesPorRegion) {
		this.isPermisoVerFormCobrarClientesPorRegion = isPermisoVerFormCobrarClientesPorRegion;
	}
	
	public Boolean getIsPermisoDuplicarCobrarClientesPorRegion() {
		return isPermisoDuplicarCobrarClientesPorRegion;
	}

	public void setIsPermisoDuplicarCobrarClientesPorRegion(Boolean isPermisoDuplicarCobrarClientesPorRegion) {
		this.isPermisoDuplicarCobrarClientesPorRegion = isPermisoDuplicarCobrarClientesPorRegion;
	}
	
	public Boolean getIsPermisoOrdenCobrarClientesPorRegion() {
		return isPermisoOrdenCobrarClientesPorRegion;
	}

	public void setIsPermisoOrdenCobrarClientesPorRegion(Boolean isPermisoOrdenCobrarClientesPorRegion) {
		this.isPermisoOrdenCobrarClientesPorRegion = isPermisoOrdenCobrarClientesPorRegion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarClientesPorRegion() {
		return isVisibilidadCeldaNuevoCobrarClientesPorRegion;
	}

	public void setIsVisibilidadCeldaNuevoCobrarClientesPorRegion(Boolean isVisibilidadCeldaNuevoCobrarClientesPorRegion) {
		this.isVisibilidadCeldaNuevoCobrarClientesPorRegion = isVisibilidadCeldaNuevoCobrarClientesPorRegion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarClientesPorRegion() {
		return isVisibilidadCeldaDuplicarCobrarClientesPorRegion;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarClientesPorRegion(Boolean isVisibilidadCeldaDuplicarCobrarClientesPorRegion) {
		this.isVisibilidadCeldaDuplicarCobrarClientesPorRegion = isVisibilidadCeldaDuplicarCobrarClientesPorRegion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarClientesPorRegion() {
		return isVisibilidadCeldaCopiarCobrarClientesPorRegion;
	}

	public void setIsVisibilidadCeldaCopiarCobrarClientesPorRegion(Boolean isVisibilidadCeldaCopiarCobrarClientesPorRegion) {
		this.isVisibilidadCeldaCopiarCobrarClientesPorRegion = isVisibilidadCeldaCopiarCobrarClientesPorRegion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarClientesPorRegion() {
		return isVisibilidadCeldaVerFormCobrarClientesPorRegion;
	}

	public void setIsVisibilidadCeldaVerFormCobrarClientesPorRegion(Boolean isVisibilidadCeldaVerFormCobrarClientesPorRegion) {
		this.isVisibilidadCeldaVerFormCobrarClientesPorRegion = isVisibilidadCeldaVerFormCobrarClientesPorRegion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarClientesPorRegion() {
		return isVisibilidadCeldaOrdenCobrarClientesPorRegion;
	}

	public void setIsVisibilidadCeldaOrdenCobrarClientesPorRegion(Boolean isVisibilidadCeldaOrdenCobrarClientesPorRegion) {
		this.isVisibilidadCeldaOrdenCobrarClientesPorRegion = isVisibilidadCeldaOrdenCobrarClientesPorRegion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion() {
		return isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion(Boolean isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion = isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarClientesPorRegion() {
		return isVisibilidadCeldaModificarCobrarClientesPorRegion;
	}

	public void setIsVisibilidadCeldaModificarCobrarClientesPorRegion(Boolean isVisibilidadCeldaModificarCobrarClientesPorRegion) {
		this.isVisibilidadCeldaModificarCobrarClientesPorRegion = isVisibilidadCeldaModificarCobrarClientesPorRegion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarClientesPorRegion() {
		return isVisibilidadCeldaActualizarCobrarClientesPorRegion;
	}

	public void setIsVisibilidadCeldaActualizarCobrarClientesPorRegion(Boolean isVisibilidadCeldaActualizarCobrarClientesPorRegion) {
		this.isVisibilidadCeldaActualizarCobrarClientesPorRegion = isVisibilidadCeldaActualizarCobrarClientesPorRegion;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarClientesPorRegion() {
		return isVisibilidadCeldaEliminarCobrarClientesPorRegion;
	}

	public void setIsVisibilidadCeldaEliminarCobrarClientesPorRegion(Boolean isVisibilidadCeldaEliminarCobrarClientesPorRegion) {
		this.isVisibilidadCeldaEliminarCobrarClientesPorRegion = isVisibilidadCeldaEliminarCobrarClientesPorRegion;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarClientesPorRegion() {
		return isVisibilidadCeldaCancelarCobrarClientesPorRegion;
	}

	public void setIsVisibilidadCeldaCancelarCobrarClientesPorRegion(Boolean isVisibilidadCeldaCancelarCobrarClientesPorRegion) {
		this.isVisibilidadCeldaCancelarCobrarClientesPorRegion = isVisibilidadCeldaCancelarCobrarClientesPorRegion;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarClientesPorRegion() {
		return isVisibilidadCeldaGuardarCobrarClientesPorRegion;
	}

	public void setIsVisibilidadCeldaGuardarCobrarClientesPorRegion(Boolean isVisibilidadCeldaGuardarCobrarClientesPorRegion) {
		this.isVisibilidadCeldaGuardarCobrarClientesPorRegion = isVisibilidadCeldaGuardarCobrarClientesPorRegion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion() {
		return isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion(Boolean isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion) {
		this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion = isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion;
	}
		
	public CobrarClientesPorRegionSessionBean getcobrarclientesporregionSessionBean() {
		return this.cobrarclientesporregionSessionBean;
	}
	
	public void setcobrarclientesporregionSessionBean(CobrarClientesPorRegionSessionBean cobrarclientesporregionSessionBean) {
		this.cobrarclientesporregionSessionBean=cobrarclientesporregionSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarClientesPorRegion() {
		return this.isVisibilidadBusquedaCobrarClientesPorRegion;
	}

	public void setisVisibilidadBusquedaCobrarClientesPorRegion(Boolean isVisibilidadBusquedaCobrarClientesPorRegion) {
		this.isVisibilidadBusquedaCobrarClientesPorRegion=isVisibilidadBusquedaCobrarClientesPorRegion;
	}

	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
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

	public Boolean getisVisibilidadFK_IdRegion() {
		return this.isVisibilidadFK_IdRegion;
	}

	public void setisVisibilidadFK_IdRegion(Boolean isVisibilidadFK_IdRegion) {
		this.isVisibilidadFK_IdRegion=isVisibilidadFK_IdRegion;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cobrarclientesporregion,null);
				this.setActualParaGuardarSucursalForeignKey(cobrarclientesporregion,null);
				this.setActualParaGuardarPaisForeignKey(cobrarclientesporregion,null);
				this.setActualParaGuardarRegionForeignKey(cobrarclientesporregion,null);
				this.setActualParaGuardarProvinciaForeignKey(cobrarclientesporregion,null);
				this.setActualParaGuardarCiudadForeignKey(cobrarclientesporregion,null);
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
	
	public void bugActualizarReferenciaActual(CobrarClientesPorRegion cobrarclientesporregion,CobrarClientesPorRegion cobrarclientesporregionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarClientesPorRegion(cobrarclientesporregion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobrarclientesporregionAux.setId(cobrarclientesporregion.getId());
		cobrarclientesporregionAux.setVersionRow(cobrarclientesporregion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarClientesPorRegion cobrarclientesporregionLocal) throws Exception {
		
		if(this.cobrarclientesporregionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarClientesPorRegion cobrarclientesporregionLocal) throws Exception {	
		if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cobrarclientesporregionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cobrarclientesporregionLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				cobrarclientesporregionLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(RegionDetalleFormJInternalFrame.class)) {
				RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrameLocal=(RegionBeanSwingJInternalFrame) ((RegionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				regionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRegion(regionBeanSwingJInternalFrameLocal.getregion(),true);
				regionBeanSwingJInternalFrameLocal.actualizarLista(regionBeanSwingJInternalFrameLocal.region,this.regionsForeignKey);

				regionBeanSwingJInternalFrameLocal.actualizarRelaciones(regionBeanSwingJInternalFrameLocal.region);

				cobrarclientesporregionLocal.setRegion(regionBeanSwingJInternalFrameLocal.region);

				this.addItemDefectoCombosForeignKeyRegion();
				this.cargarCombosFrameRegionsForeignKey("Formulario");
				this.setActualRegionForeignKey(regionBeanSwingJInternalFrameLocal.region.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProvinciaDetalleFormJInternalFrame.class)) {
				ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrameLocal=(ProvinciaBeanSwingJInternalFrame) ((ProvinciaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				provinciaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProvincia(provinciaBeanSwingJInternalFrameLocal.getprovincia(),true);
				provinciaBeanSwingJInternalFrameLocal.actualizarLista(provinciaBeanSwingJInternalFrameLocal.provincia,this.provinciasForeignKey);

				provinciaBeanSwingJInternalFrameLocal.actualizarRelaciones(provinciaBeanSwingJInternalFrameLocal.provincia);

				cobrarclientesporregionLocal.setProvincia(provinciaBeanSwingJInternalFrameLocal.provincia);

				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey("Formulario");
				this.setActualProvinciaForeignKey(provinciaBeanSwingJInternalFrameLocal.provincia.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				cobrarclientesporregionLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCobrarClientesPorRegionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobrarclientesporregionValidator.getInvalidValues(this.cobrarclientesporregion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarClientesPorRegion cobrarclientesporregion,List<CobrarClientesPorRegion> cobrarclientesporregions) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarClientesPorRegion cobrarclientesporregion,List<CobrarClientesPorRegion> cobrarclientesporregions) throws Exception {
		try	{			
			CobrarClientesPorRegionConstantesFunciones.actualizarSelectedLista(cobrarclientesporregion,cobrarclientesporregions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarClientesPorRegion> cobrarclientesporregionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobrarclientesporregionsLocal=this.cobrarclientesporregionLogic.getCobrarClientesPorRegions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobrarclientesporregionsLocal=this.cobrarclientesporregions;
			}
			//ARCHITECTURE
		
			for(CobrarClientesPorRegion cobrarclientesporregionLocal:cobrarclientesporregionsLocal) {
				if(this.permiteMantenimiento(cobrarclientesporregionLocal) && cobrarclientesporregionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarClientesPorRegionConstantesFunciones.getCobrarClientesPorRegionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarClientesPorRegionConstantesFunciones.NOMBREREGION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_regionCobrarClientesPorRegion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesPorRegionConstantesFunciones.NOMBREPROVINCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_provinciaCobrarClientesPorRegion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesPorRegionConstantesFunciones.NOMBRECIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_ciudadCobrarClientesPorRegion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesPorRegionConstantesFunciones.NOMBREZONA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_zonaCobrarClientesPorRegion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesPorRegionConstantesFunciones.NOMBRERUTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_rutaCobrarClientesPorRegion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesPorRegionConstantesFunciones.NOMBREVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_vendedorCobrarClientesPorRegion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesPorRegionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelcodigoCobrarClientesPorRegion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesPorRegionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombreCobrarClientesPorRegion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesPorRegionConstantesFunciones.APELLIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelapellidoCobrarClientesPorRegion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesPorRegionConstantesFunciones.DIRECCIONDIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabeldireccion_direccionCobrarClientesPorRegion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesPorRegionConstantesFunciones.TELEFONOTELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabeltelefono_telefonoCobrarClientesPorRegion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_regionCobrarClientesPorRegion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_provinciaCobrarClientesPorRegion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_ciudadCobrarClientesPorRegion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_zonaCobrarClientesPorRegion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_rutaCobrarClientesPorRegion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_vendedorCobrarClientesPorRegion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelcodigoCobrarClientesPorRegion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombreCobrarClientesPorRegion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelapellidoCobrarClientesPorRegion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabeldireccion_direccionCobrarClientesPorRegion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabeltelefono_telefonoCobrarClientesPorRegion,"");
		
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
		this.iIdNuevoCobrarClientesPorRegion--;	
		
		
		this.cobrarclientesporregionAux=new CobrarClientesPorRegion();
		
		this.cobrarclientesporregionAux.setId(this.iIdNuevoCobrarClientesPorRegion);
		this.cobrarclientesporregionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().add(this.cobrarclientesporregionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobrarclientesporregions.add(this.cobrarclientesporregionAux);
		}
		//ARCHITECTURE
		
		this.cobrarclientesporregion=this.cobrarclientesporregionAux;
		
		if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarClientesPorRegion(this.cobrarclientesporregion);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesPorRegion(this.cobrarclientesporregion);
		}
				
		//this.setDefaultControlesCobrarClientesPorRegion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarClientesPorRegion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarClientesPorRegion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesPorRegion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregionBean,this.cobrarclientesporregion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarClientesPorRegion(this.cobrarclientesporregionReturnGeneral,this.cobrarclientesporregionBean,false);
		
		if(this.cobrarclientesporregionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesPorRegion(this.cobrarclientesporregionReturnGeneral.getCobrarClientesPorRegion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarClientesPorRegion(this.cobrarclientesporregionReturnGeneral.getCobrarClientesPorRegion());
		}
		
		if(this.cobrarclientesporregionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesPorRegion(this.cobrarclientesporregionReturnGeneral.getCobrarClientesPorRegion(),classes);//this.cobrarclientesporregionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarClientesPorRegion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarClientesPorRegion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.RecargarFormCobrarClientesPorRegion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarClientesPorRegion(false);
						
			if(cobrarclientesporregionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesPorRegion();
			}
			
			this.actualizarVisualTableDatosCobrarClientesPorRegion();
			
			this.jTableDatosCobrarClientesPorRegion.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesPorRegion(), this.getIndiceNuevoCobrarClientesPorRegion());
			
			this.seleccionarFilaTablaCobrarClientesPorRegionActual();
						
			this.actualizarEstadoCeldasBotonesCobrarClientesPorRegion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarClientesPorRegion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_regionCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarnombre_regionCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_provinciaCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarnombre_provinciaCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_ciudadCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarnombre_ciudadCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldnombre_zonaCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarnombre_zonaCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_rutaCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarnombre_rutaCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_vendedorCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarnombre_vendedorCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldcodigoCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarcodigoCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombreCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarnombreCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreaapellidoCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarapellidoCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreadireccion_direccionCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activardireccion_direccionCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreatelefono_telefonoCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activartelefono_telefonoCobrarClientesPorRegion);	
		//
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarid_empresaCobrarClientesPorRegion);//
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarid_sucursalCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarid_paisCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarid_regionCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarid_provinciaCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion.setEnabled(isHabilitar && this.cobrarclientesporregionConstantesFunciones.activarid_ciudadCobrarClientesPorRegion);
	};
	
	public void setDefaultControlesCobrarClientesPorRegion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarClientesPorRegion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobrarclientesporregionSessionBean.setConGuardarRelaciones(true);			
			this.cobrarclientesporregionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTabbedPaneRelacionesCobrarClientesPorRegion.setVisible(true);
			
					
		} else {
			//this.cobrarclientesporregionSessionBean.setConGuardarRelaciones(false);			
			this.cobrarclientesporregionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTabbedPaneRelacionesCobrarClientesPorRegion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarClientesPorRegion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesPorRegion cobrarclientesporregionAux:this.cobrarclientesporregionLogic.getCobrarClientesPorRegions()) {
				if(cobrarclientesporregionAux.getId().equals(this.iIdNuevoCobrarClientesPorRegion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesPorRegion cobrarclientesporregionAux:this.cobrarclientesporregions) {
				if(cobrarclientesporregionAux.getId().equals(this.iIdNuevoCobrarClientesPorRegion)) {
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
	
	public int getIndiceActualCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesPorRegion cobrarclientesporregionAux:this.cobrarclientesporregionLogic.getCobrarClientesPorRegions()) {
				if(cobrarclientesporregionAux.getId().equals(cobrarclientesporregion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesPorRegion cobrarclientesporregionAux:this.cobrarclientesporregions) {
				if(cobrarclientesporregionAux.getId().equals(cobrarclientesporregion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesPorRegion cobrarclientesporregionAux:this.cobrarclientesporregionLogic.getCobrarClientesPorRegions()) {
				if(cobrarclientesporregionAux.getCobrarClientesPorRegionOriginal().getId().equals(cobrarclientesporregionOriginal.getId())) {
					existe=true;
					cobrarclientesporregionOriginal.setId(cobrarclientesporregionAux.getId());
					cobrarclientesporregionOriginal.setVersionRow(cobrarclientesporregionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesPorRegion cobrarclientesporregionAux:this.cobrarclientesporregions) {
				if(cobrarclientesporregionAux.getCobrarClientesPorRegionOriginal().getId().equals(cobrarclientesporregionOriginal.getId())) {
					existe=true;
					cobrarclientesporregionOriginal.setId(cobrarclientesporregionAux.getId());
					cobrarclientesporregionOriginal.setVersionRow(cobrarclientesporregionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarClientesPorRegion(Boolean esParaCancelar) throws Exception {
		cobrarclientesporregionsAux=new ArrayList<CobrarClientesPorRegion>();
		cobrarclientesporregionAux=new CobrarClientesPorRegion();
		
		if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarClientesPorRegion cobrarclientesporregionAux:this.cobrarclientesporregionLogic.getCobrarClientesPorRegions()) {
					if(cobrarclientesporregionAux.getId()<0) {
						cobrarclientesporregionsAux.add(cobrarclientesporregionAux);
					}		
				}
				this.iIdNuevoCobrarClientesPorRegion=0L;
				this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().removeAll(cobrarclientesporregionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesPorRegion cobrarclientesporregionAux:this.cobrarclientesporregions) {
					if(cobrarclientesporregionAux.getId()<0) {
						cobrarclientesporregionsAux.add(cobrarclientesporregionAux);
					}		
				}
				this.iIdNuevoCobrarClientesPorRegion=0L;
				this.cobrarclientesporregions.removeAll(cobrarclientesporregionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarClientesPorRegion 
					&& this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().size()>0
					) {
					cobrarclientesporregionAux=this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().get(this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().size() - 1);
				
					if(cobrarclientesporregionAux.getId()<0) {
						this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().remove(cobrarclientesporregionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarClientesPorRegion && this.cobrarclientesporregions.size()>0) {
					cobrarclientesporregionAux=this.cobrarclientesporregions.get(this.cobrarclientesporregions.size() - 1);
				
					if(cobrarclientesporregionAux.getId()<0) {
						this.cobrarclientesporregions.remove(cobrarclientesporregionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarClientesPorRegion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrarclientesporregion.getId()<0) {
				this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().remove(this.cobrarclientesporregion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrarclientesporregion.getId()<0) {
				this.cobrarclientesporregions.remove(this.cobrarclientesporregion);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarClientesPorRegion(List<CobrarClientesPorRegion> cobrarclientesporregionsAux) throws Exception {
		CobrarClientesPorRegionConstantesFunciones.setEstadosInicialesCobrarClientesPorRegion(cobrarclientesporregionsAux);
	}
	
	public void setEstadosInicialesCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregionAux) throws Exception {
		CobrarClientesPorRegionConstantesFunciones.setEstadosInicialesCobrarClientesPorRegion(cobrarclientesporregionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarClientesPorRegionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarClientesPorRegion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarClientesPorRegionActual()) {
				if(!this.isEsNuevoCobrarClientesPorRegion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarClientesPorRegion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarClientesPorRegion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarClientesPorRegionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Clientes Por Region ?", "MANTENIMIENTO DE Cobrar Clientes Por Region", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarClientesPorRegion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarClientesPorRegion cobrarclientesporregion) throws Exception {
		CobrarClientesPorRegionConstantesFunciones.seleccionarAsignar(this.cobrarclientesporregion,cobrarclientesporregion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarClientesPorRegion=this.isPermisoActualizarOriginalCobrarClientesPorRegion;
			
			
			this.seleccionarAsignar(cobrarclientesporregion);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarClientesPorRegion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobrarclientesporregionSessionBean.setsFuncionBusquedaRapida(this.cobrarclientesporregionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarClientesPorRegion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarClientesPorRegion(esParaCancelar);				
				this.cancelarNuevoCobrarClientesPorRegion(esParaCancelar);								
			}
			
			this.cobrarclientesporregion=new CobrarClientesPorRegion();
			
			this.inicializarCobrarClientesPorRegion();
			
			this.actualizarEstadoCeldasBotonesCobrarClientesPorRegion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarClientesPorRegion() throws Exception {
		try {
			CobrarClientesPorRegionConstantesFunciones.inicializarCobrarClientesPorRegion(this.cobrarclientesporregion);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarClientesPorRegions(String sAccionBusqueda,List<CobrarClientesPorRegion> cobrarclientesporregionsParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarClientesPorRegion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarClientesPorRegionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarClientesPorRegionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarClientesPorRegion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Clientes Por Regiones");		
		parameters.put("busquedapor", CobrarClientesPorRegionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarClientesPorRegion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarClientesPorRegionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarClientesPorRegionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarClientesPorRegion=new JRBeanArrayDataSource(CobrarClientesPorRegionJInternalFrame.TraerCobrarClientesPorRegionBeans(cobrarclientesporregionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarClientesPorRegion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarClientesPorRegionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarClientesPorRegionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarClientesPorRegionBean.TraerCobrarClientesPorRegionBeans(cobrarclientesporregionsParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarClientesPorRegions(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesporregionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarClientesPorRegions(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesporregionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarClientesPorRegionActionPerformed(null);
					//this.generarExcelReporteCobrarClientesPorRegions(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesporregionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarClientesPorRegions(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesporregionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarClientesPorRegions(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesporregionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarClientesPorRegions(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesporregionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarClientesPorRegions(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesPorRegion> cobrarclientesporregionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesporregion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesPorRegions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarClientesPorRegion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarClientesPorRegion cobrarclientesporregion : cobrarclientesporregionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarClientesPorRegionConstantesFunciones.generarExcelReporteDataCobrarClientesPorRegion("NORMAL",row,workbook,cobrarclientesporregion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Por Region",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarClientesPorRegion(String sTipo,Row row,Workbook workbook) {
		
		CobrarClientesPorRegionConstantesFunciones.generarExcelReporteHeaderCobrarClientesPorRegion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarClientesPorRegions(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesPorRegion> cobrarclientesporregionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesporregion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesPorRegions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarClientesPorRegion cobrarclientesporregion : cobrarclientesporregionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.getCobrarClientesPorRegionDescripcion(cobrarclientesporregion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_IDREGION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDREGION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getregion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_IDPROVINCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDPROVINCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getprovincia_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getnombre_region());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getnombre_provincia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getnombre_ciudad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getnombre_zona());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getnombre_ruta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getnombre_vendedor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getapellido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.getdireccion_direccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesporregion.gettelefono_telefono());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Por Region",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarClientesPorRegions(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesPorRegion> cobrarclientesporregionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarClientesPorRegion> cobrarclientesporregionsRespaldo=null;
		
		classes=CobrarClientesPorRegionConstantesFunciones.getClassesRelationshipsOfCobrarClientesPorRegion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobrarclientesporregionLogic.setDatosCliente(this.datosCliente);
		this.cobrarclientesporregionLogic.setDatosDeep(this.datosDeep);
		this.cobrarclientesporregionLogic.setIsConDeep(true);
		
		cobrarclientesporregionsRespaldo=this.cobrarclientesporregionLogic.getCobrarClientesPorRegions();
		
		this.cobrarclientesporregionLogic.setCobrarClientesPorRegions(cobrarclientesporregionsParaReportes);	
		this.cobrarclientesporregionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobrarclientesporregionsParaReportes=this.cobrarclientesporregionLogic.getCobrarClientesPorRegions();
		this.cobrarclientesporregionLogic.setCobrarClientesPorRegions(cobrarclientesporregionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesporregion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesPorRegions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarClientesPorRegion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarClientesPorRegion cobrarclientesporregion : cobrarclientesporregionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarClientesPorRegion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarClientesPorRegionConstantesFunciones.generarExcelReporteDataCobrarClientesPorRegion("NORMAL",row,workbook,cobrarclientesporregion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.getCobrarClientesPorRegionDescripcion(cobrarclientesporregion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Por Region",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarClientesPorRegion() throws Exception {		
		this.startProcessCobrarClientesPorRegion(true);
	}
	
	public void startProcessCobrarClientesPorRegion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarClientesPorRegion ,this.jPanelParametrosReportesCobrarClientesPorRegion, this.jScrollPanelDatosCobrarClientesPorRegion,this.jPanelPaginacionCobrarClientesPorRegion, this.jScrollPanelDatosEdicionCobrarClientesPorRegion, this.jPanelAccionesCobrarClientesPorRegion,this.jPanelAccionesFormularioCobrarClientesPorRegion,this.jmenuBarCobrarClientesPorRegion,this.jmenuBarDetalleCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,this.jTtoolBarDetalleCobrarClientesPorRegion);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarClientesPorRegion=this.jTabbedPaneBusquedasCobrarClientesPorRegion; 
		
		final JPanel jPanelParametrosReportesCobrarClientesPorRegion=this.jPanelParametrosReportesCobrarClientesPorRegion;
		//final JScrollPane jScrollPanelDatosCobrarClientesPorRegion=this.jScrollPanelDatosCobrarClientesPorRegion;
		final JTable jTableDatosCobrarClientesPorRegion=this.jTableDatosCobrarClientesPorRegion;		
		final JPanel jPanelPaginacionCobrarClientesPorRegion=this.jPanelPaginacionCobrarClientesPorRegion;
		//final JScrollPane jScrollPanelDatosEdicionCobrarClientesPorRegion=this.jScrollPanelDatosEdicionCobrarClientesPorRegion;
		final JPanel jPanelAccionesCobrarClientesPorRegion=this.jPanelAccionesCobrarClientesPorRegion;
		
		JPanel jPanelCamposAuxiliarCobrarClientesPorRegion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarClientesPorRegion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
			jPanelCamposAuxiliarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelCamposCobrarClientesPorRegion;
			jPanelAccionesFormularioAuxiliarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelAccionesFormularioCobrarClientesPorRegion;
		}
		
		final JPanel jPanelCamposCobrarClientesPorRegion=jPanelCamposAuxiliarCobrarClientesPorRegion;
		final JPanel jPanelAccionesFormularioCobrarClientesPorRegion=jPanelAccionesFormularioAuxiliarCobrarClientesPorRegion;
		
		
		final JMenuBar jmenuBarCobrarClientesPorRegion=this.jmenuBarCobrarClientesPorRegion;
		final JToolBar jTtoolBarCobrarClientesPorRegion=this.jTtoolBarCobrarClientesPorRegion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarClientesPorRegion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarClientesPorRegion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
			jmenuBarDetalleAuxiliarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jmenuBarDetalleCobrarClientesPorRegion;
			jTtoolBarDetalleAuxiliarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTtoolBarDetalleCobrarClientesPorRegion;
		}
		
		final JMenuBar jmenuBarDetalleCobrarClientesPorRegion=jmenuBarDetalleAuxiliarCobrarClientesPorRegion;
		final JToolBar jTtoolBarDetalleCobrarClientesPorRegion=jTtoolBarDetalleAuxiliarCobrarClientesPorRegion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarClientesPorRegion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarClientesPorRegion;
			processRunnable.jTableDatos=jTableDatosCobrarClientesPorRegion;
			processRunnable.jPanelCampos=jPanelCamposCobrarClientesPorRegion;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarClientesPorRegion;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarClientesPorRegion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarClientesPorRegion;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarClientesPorRegion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarClientesPorRegion;
			processRunnable.jTtoolBar=jTtoolBarCobrarClientesPorRegion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarClientesPorRegion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarClientesPorRegion ,jPanelParametrosReportesCobrarClientesPorRegion,jTableDatosCobrarClientesPorRegion, /*jScrollPanelDatosCobrarClientesPorRegion,*/jPanelCamposCobrarClientesPorRegion,jPanelPaginacionCobrarClientesPorRegion, /*jScrollPanelDatosEdicionCobrarClientesPorRegion,*/ jPanelAccionesCobrarClientesPorRegion,jPanelAccionesFormularioCobrarClientesPorRegion,jmenuBarCobrarClientesPorRegion,jmenuBarDetalleCobrarClientesPorRegion,jTtoolBarCobrarClientesPorRegion,jTtoolBarDetalleCobrarClientesPorRegion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarClientesPorRegion ,jPanelParametrosReportesCobrarClientesPorRegion, jScrollPanelDatosCobrarClientesPorRegion,jPanelPaginacionCobrarClientesPorRegion, jScrollPanelDatosEdicionCobrarClientesPorRegion, jPanelAccionesCobrarClientesPorRegion,jPanelAccionesFormularioCobrarClientesPorRegion,jmenuBarCobrarClientesPorRegion,jmenuBarDetalleCobrarClientesPorRegion,jTtoolBarCobrarClientesPorRegion,jTtoolBarDetalleCobrarClientesPorRegion);
						
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
	
	public void finishProcessCobrarClientesPorRegion() {// throws Exception 
		this.finishProcessCobrarClientesPorRegion(true);
	}
	
	public void finishProcessCobrarClientesPorRegion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarClientesPorRegion ,this.jPanelParametrosReportesCobrarClientesPorRegion, this.jScrollPanelDatosCobrarClientesPorRegion,this.jPanelPaginacionCobrarClientesPorRegion, this.jScrollPanelDatosEdicionCobrarClientesPorRegion, this.jPanelAccionesCobrarClientesPorRegion,this.jPanelAccionesFormularioCobrarClientesPorRegion,this.jmenuBarCobrarClientesPorRegion,this.jmenuBarDetalleCobrarClientesPorRegion,this.jTtoolBarCobrarClientesPorRegion,this.jTtoolBarDetalleCobrarClientesPorRegion);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarClientesPorRegion=this.jTabbedPaneBusquedasCobrarClientesPorRegion; 
		
		final JPanel jPanelParametrosReportesCobrarClientesPorRegion=this.jPanelParametrosReportesCobrarClientesPorRegion;
		//final JScrollPane jScrollPanelDatosCobrarClientesPorRegion=this.jScrollPanelDatosCobrarClientesPorRegion;
		final JTable jTableDatosCobrarClientesPorRegion=this.jTableDatosCobrarClientesPorRegion;		
		final JPanel jPanelPaginacionCobrarClientesPorRegion=this.jPanelPaginacionCobrarClientesPorRegion;
		//final JScrollPane jScrollPanelDatosEdicionCobrarClientesPorRegion=this.jScrollPanelDatosEdicionCobrarClientesPorRegion;
		final JPanel jPanelAccionesCobrarClientesPorRegion=this.jPanelAccionesCobrarClientesPorRegion;
		
		JPanel jPanelCamposAuxiliarCobrarClientesPorRegion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarClientesPorRegion=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
			jPanelCamposAuxiliarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelCamposCobrarClientesPorRegion;
			jPanelAccionesFormularioAuxiliarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelAccionesFormularioCobrarClientesPorRegion;
		}
		
		final JPanel jPanelCamposCobrarClientesPorRegion=jPanelCamposAuxiliarCobrarClientesPorRegion;
		final JPanel jPanelAccionesFormularioCobrarClientesPorRegion=jPanelAccionesFormularioAuxiliarCobrarClientesPorRegion;
		
		
		final JMenuBar jmenuBarCobrarClientesPorRegion=this.jmenuBarCobrarClientesPorRegion;		
		final JToolBar jTtoolBarCobrarClientesPorRegion=this.jTtoolBarCobrarClientesPorRegion;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarClientesPorRegion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarClientesPorRegion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
			jmenuBarDetalleAuxiliarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jmenuBarDetalleCobrarClientesPorRegion;
			jTtoolBarDetalleAuxiliarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTtoolBarDetalleCobrarClientesPorRegion;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarClientesPorRegion=jmenuBarDetalleAuxiliarCobrarClientesPorRegion;
		final JToolBar jTtoolBarDetalleCobrarClientesPorRegion=jTtoolBarDetalleAuxiliarCobrarClientesPorRegion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarClientesPorRegion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarClientesPorRegion;
			processRunnable.jTableDatos=jTableDatosCobrarClientesPorRegion;
			processRunnable.jPanelCampos=jPanelCamposCobrarClientesPorRegion;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarClientesPorRegion;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarClientesPorRegion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarClientesPorRegion;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarClientesPorRegion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarClientesPorRegion;
			processRunnable.jTtoolBar=jTtoolBarCobrarClientesPorRegion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarClientesPorRegion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarClientesPorRegion ,jPanelParametrosReportesCobrarClientesPorRegion, jTableDatosCobrarClientesPorRegion,/*jScrollPanelDatosCobrarClientesPorRegion,*/jPanelCamposCobrarClientesPorRegion,jPanelPaginacionCobrarClientesPorRegion, /*jScrollPanelDatosEdicionCobrarClientesPorRegion,*/ jPanelAccionesCobrarClientesPorRegion,jPanelAccionesFormularioCobrarClientesPorRegion,jmenuBarCobrarClientesPorRegion,jmenuBarDetalleCobrarClientesPorRegion,jTtoolBarCobrarClientesPorRegion,jTtoolBarDetalleCobrarClientesPorRegion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarClientesPorRegion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarClientesPorRegion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarClientesPorRegion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarClientesPorRegion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarClientesPorRegion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarClientesPorRegion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarClientesPorRegion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarClientesPorRegion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarClientesPorRegion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobrarclientesporregionConstantesFunciones.getsFinalQueryCobrarClientesPorRegion();
		String  finalQueryPaginacionTodos=this.cobrarclientesporregionConstantesFunciones.getsFinalQueryCobrarClientesPorRegion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarClientesPorRegionConstantesFunciones.getArrayColumnasGlobalesNoCobrarClientesPorRegion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarClientesPorRegionConstantesFunciones.getArrayColumnasGlobalesCobrarClientesPorRegion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarClientesPorRegionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobrarclientesporregionsEliminados= new ArrayList<CobrarClientesPorRegion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarClientesPorRegion();
		
				///*CobrarClientesPorRegionSessionBean*/this.cobrarclientesporregionSessionBean=new CobrarClientesPorRegionSessionBean();
			
			if(this.cobrarclientesporregionSessionBean==null) {
				this.cobrarclientesporregionSessionBean=new CobrarClientesPorRegionSessionBean();
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
					this.iNumeroPaginacion=CobrarClientesPorRegionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarClientesPorRegionConstantesFunciones.getClassesForeignKeysOfCobrarClientesPorRegion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrarclientesporregion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobrarclientesporregionsAux= new ArrayList<CobrarClientesPorRegion>();
			
				
			cobrarclientesporregionLogic.setDatosCliente(this.datosCliente);
			cobrarclientesporregionLogic.setDatosDeep(this.datosDeep);
			cobrarclientesporregionLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarClientesPorRegion")) {
				this.sDetalleReporte=CobrarClientesPorRegionConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesPorRegion(id_paisBusquedaCobrarClientesPorRegion,id_regionBusquedaCobrarClientesPorRegion,id_provinciaBusquedaCobrarClientesPorRegion,id_ciudadBusquedaCobrarClientesPorRegion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrarclientesporregionLogic.getCobrarClientesPorRegionsBusquedaCobrarClientesPorRegion(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_paisBusquedaCobrarClientesPorRegion,id_regionBusquedaCobrarClientesPorRegion,id_provinciaBusquedaCobrarClientesPorRegion,id_ciudadBusquedaCobrarClientesPorRegion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarClientesPorRegionConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesPorRegion(id_paisBusquedaCobrarClientesPorRegion,id_regionBusquedaCobrarClientesPorRegion,id_provinciaBusquedaCobrarClientesPorRegion,id_ciudadBusquedaCobrarClientesPorRegion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarClientesPorRegionConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesPorRegion(id_paisBusquedaCobrarClientesPorRegion,id_regionBusquedaCobrarClientesPorRegion,id_provinciaBusquedaCobrarClientesPorRegion,id_ciudadBusquedaCobrarClientesPorRegion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrarclientesporregionLogic.getCobrarClientesPorRegions()==null||cobrarclientesporregionLogic.getCobrarClientesPorRegions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrarclientesporregions==null|| cobrarclientesporregions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientesporregionsAux=new ArrayList<CobrarClientesPorRegion>();
						cobrarclientesporregionsAux.addAll(cobrarclientesporregionLogic.getCobrarClientesPorRegions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientesporregionsAux=new ArrayList<CobrarClientesPorRegion>();
							cobrarclientesporregionsAux.addAll(cobrarclientesporregions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrarclientesporregionLogic.getCobrarClientesPorRegionsBusquedaCobrarClientesPorRegion(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_paisBusquedaCobrarClientesPorRegion,id_regionBusquedaCobrarClientesPorRegion,id_provinciaBusquedaCobrarClientesPorRegion,id_ciudadBusquedaCobrarClientesPorRegion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarClientesPorRegionConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesPorRegion(id_paisBusquedaCobrarClientesPorRegion,id_regionBusquedaCobrarClientesPorRegion,id_provinciaBusquedaCobrarClientesPorRegion,id_ciudadBusquedaCobrarClientesPorRegion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarClientesPorRegionConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesPorRegion(id_paisBusquedaCobrarClientesPorRegion,id_regionBusquedaCobrarClientesPorRegion,id_provinciaBusquedaCobrarClientesPorRegion,id_ciudadBusquedaCobrarClientesPorRegion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarClientesPorRegions("BusquedaCobrarClientesPorRegion",cobrarclientesporregionLogic.getCobrarClientesPorRegions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarClientesPorRegions("BusquedaCobrarClientesPorRegion",cobrarclientesporregions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientesporregionLogic.setCobrarClientesPorRegions(new ArrayList<CobrarClientesPorRegion>());
						cobrarclientesporregionLogic.getCobrarClientesPorRegions().addAll(cobrarclientesporregionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientesporregions=new ArrayList<CobrarClientesPorRegion>();
							cobrarclientesporregions.addAll(cobrarclientesporregionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarClientesPorRegion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarClientesPorRegion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarclientesporregionLogic.getCobrarClientesPorRegions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientesporregions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarclientesporregionLogic.getCobrarClientesPorRegions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientesporregions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarClientesPorRegion cobrarclientesporregion) {
		Boolean permite=true;
		
		if(this.cobrarclientesporregion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarClientesPorRegionConstantesFunciones.getOrderByListaCobrarClientesPorRegion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarClientesPorRegionConstantesFunciones.getOrderByListaCobrarClientesPorRegion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionLogic.getCobrarClientesPorRegions()) {
				if(cobrarclientesporregion.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientesporregionTotales=cobrarclientesporregion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesPorRegion cobrarclientesporregion:this.cobrarclientesporregions) {
				if(cobrarclientesporregion.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientesporregionTotales=cobrarclientesporregion;
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
			this.cobrarclientesporregionAux=new CobrarClientesPorRegion();
			this.cobrarclientesporregionAux.setsType(Constantes2.S_TOTALES);
			this.cobrarclientesporregionAux.setIsNew(false);
			this.cobrarclientesporregionAux.setIsChanged(false);
			this.cobrarclientesporregionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarClientesPorRegionConstantesFunciones.TotalizarValoresFilaCobrarClientesPorRegion(this.cobrarclientesporregionLogic.getCobrarClientesPorRegions(),this.cobrarclientesporregionAux);
				
				//this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().add(this.cobrarclientesporregionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarClientesPorRegionConstantesFunciones.TotalizarValoresFilaCobrarClientesPorRegion(this.cobrarclientesporregions,this.cobrarclientesporregionAux);
				
				this.cobrarclientesporregions.add(this.cobrarclientesporregionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobrarclientesporregionTotales=new CobrarClientesPorRegion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().remove(cobrarclientesporregionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarclientesporregions.remove(cobrarclientesporregionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobrarclientesporregionTotales=new CobrarClientesPorRegion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionLogic.getCobrarClientesPorRegions()) {
				if(cobrarclientesporregion.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientesporregionTotales=cobrarclientesporregion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarClientesPorRegionConstantesFunciones.TotalizarValoresFilaCobrarClientesPorRegion(this.cobrarclientesporregionLogic.getCobrarClientesPorRegions(),cobrarclientesporregionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesPorRegion cobrarclientesporregion:this.cobrarclientesporregions) {
				if(cobrarclientesporregion.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientesporregionTotales=cobrarclientesporregion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarClientesPorRegionConstantesFunciones.TotalizarValoresFilaCobrarClientesPorRegion(this.cobrarclientesporregions,cobrarclientesporregionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarClientesPorRegionsBusquedaCobrarClientesPorRegion()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarClientesPorRegion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesPorRegionsFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesPorRegionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesPorRegionsFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesPorRegionsFK_IdProvincia()throws Exception {
		try {
			sAccionBusqueda="FK_IdProvincia";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesPorRegionsFK_IdRegion()throws Exception {
		try {
			sAccionBusqueda="FK_IdRegion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesPorRegionsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarClientesPorRegionsBusquedaCobrarClientesPorRegion(String sFinalQuery,Long id_pais,Long id_region,Long id_provincia,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientesporregionLogic.getCobrarClientesPorRegionsBusquedaCobrarClientesPorRegion(sFinalQuery,this.pagination,id_pais,id_region,id_provincia,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesPorRegionsFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientesporregionLogic.getCobrarClientesPorRegionsFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesPorRegionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientesporregionLogic.getCobrarClientesPorRegionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesPorRegionsFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientesporregionLogic.getCobrarClientesPorRegionsFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesPorRegionsFK_IdProvincia(String sFinalQuery,Long id_provincia)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientesporregionLogic.getCobrarClientesPorRegionsFK_IdProvincia(sFinalQuery,this.pagination,id_provincia);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesPorRegionsFK_IdRegion(String sFinalQuery,Long id_region)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientesporregionLogic.getCobrarClientesPorRegionsFK_IdRegion(sFinalQuery,this.pagination,id_region);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesPorRegionsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientesporregionLogic.getCobrarClientesPorRegionsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosCobrarClientesPorRegion() {
		this.isPermisoTodoCobrarClientesPorRegion=false;
		this.isPermisoNuevoCobrarClientesPorRegion=false;
		this.isPermisoActualizarCobrarClientesPorRegion=false;
		this.isPermisoActualizarOriginalCobrarClientesPorRegion=false;
		this.isPermisoEliminarCobrarClientesPorRegion=false;
		this.isPermisoGuardarCambiosCobrarClientesPorRegion=false;
		this.isPermisoConsultaCobrarClientesPorRegion=true;
		this.isPermisoBusquedaCobrarClientesPorRegion=true;
		this.isPermisoReporteCobrarClientesPorRegion=true;
		this.isPermisoOrdenCobrarClientesPorRegion=false;		
		this.isPermisoPaginacionMedioCobrarClientesPorRegion=false;		
		this.isPermisoPaginacionAltoCobrarClientesPorRegion=false;		
		this.isPermisoPaginacionTodoCobrarClientesPorRegion=false;		
		this.isPermisoCopiarCobrarClientesPorRegion=false;		
		this.isPermisoVerFormCobrarClientesPorRegion=false;		
		this.isPermisoDuplicarCobrarClientesPorRegion=false;
		this.isPermisoOrdenCobrarClientesPorRegion=false;
	}
	
	public void setPermisosUsuarioCobrarClientesPorRegion(Boolean isPermiso) {
		this.isPermisoTodoCobrarClientesPorRegion=isPermiso;
		this.isPermisoNuevoCobrarClientesPorRegion=isPermiso;
		this.isPermisoActualizarCobrarClientesPorRegion=isPermiso;
		this.isPermisoActualizarOriginalCobrarClientesPorRegion=isPermiso;
		this.isPermisoEliminarCobrarClientesPorRegion=isPermiso;
		this.isPermisoGuardarCambiosCobrarClientesPorRegion=isPermiso;
		this.isPermisoConsultaCobrarClientesPorRegion=isPermiso;
		this.isPermisoBusquedaCobrarClientesPorRegion=isPermiso;
		this.isPermisoReporteCobrarClientesPorRegion=isPermiso;
		this.isPermisoOrdenCobrarClientesPorRegion=isPermiso;		
		this.isPermisoPaginacionMedioCobrarClientesPorRegion=isPermiso;		
		this.isPermisoPaginacionAltoCobrarClientesPorRegion=isPermiso;		
		this.isPermisoPaginacionTodoCobrarClientesPorRegion=isPermiso;		
		this.isPermisoCopiarCobrarClientesPorRegion=isPermiso;		
		this.isPermisoVerFormCobrarClientesPorRegion=isPermiso;		
		this.isPermisoDuplicarCobrarClientesPorRegion=isPermiso;
		this.isPermisoOrdenCobrarClientesPorRegion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarClientesPorRegion(Boolean isPermiso) {
		//this.isPermisoTodoCobrarClientesPorRegion=isPermiso;
		this.isPermisoNuevoCobrarClientesPorRegion=isPermiso;
		this.isPermisoActualizarCobrarClientesPorRegion=isPermiso;
		this.isPermisoActualizarOriginalCobrarClientesPorRegion=isPermiso;
		this.isPermisoEliminarCobrarClientesPorRegion=isPermiso;
		this.isPermisoGuardarCambiosCobrarClientesPorRegion=isPermiso;
		//this.isPermisoConsultaCobrarClientesPorRegion=isPermiso;
		//this.isPermisoBusquedaCobrarClientesPorRegion=isPermiso;
		//this.isPermisoReporteCobrarClientesPorRegion=isPermiso;
		//this.isPermisoOrdenCobrarClientesPorRegion=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarClientesPorRegion=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarClientesPorRegion=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarClientesPorRegion=isPermiso;		
		//this.isPermisoCopiarCobrarClientesPorRegion=isPermiso;		
		//this.isPermisoDuplicarCobrarClientesPorRegion=isPermiso;
		//this.isPermisoOrdenCobrarClientesPorRegion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarClientesPorRegionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarClientesPorRegionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarClientesPorRegion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarClientesPorRegionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarClientesPorRegionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarClientesPorRegionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarClientesPorRegionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarClientesPorRegion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarClientesPorRegionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarClientesPorRegionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarClientesPorRegion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarClientesPorRegion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarClientesPorRegion=this.isPermisoActualizarCobrarClientesPorRegion;
			this.isPermisoEliminarCobrarClientesPorRegion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarClientesPorRegion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarClientesPorRegion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarClientesPorRegion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarClientesPorRegion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarClientesPorRegion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarClientesPorRegion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarClientesPorRegion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarClientesPorRegion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarClientesPorRegion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarClientesPorRegion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarClientesPorRegion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarClientesPorRegion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarClientesPorRegion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarClientesPorRegion.setToolTipText(this.jTableDatosCobrarClientesPorRegion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarClientesPorRegion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarClientesPorRegion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarClientesPorRegionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarClientesPorRegionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarClientesPorRegion() throws Exception {
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
	public void inicializarCombosForeignKeyCobrarClientesPorRegionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.regionsForeignKey=new ArrayList();
				this.provinciasForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarClientesPorRegionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarClientesPorRegionJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyRegionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyRegionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.regionsForeignKey==null||this.regionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=RegionConstantesFunciones.getArrayColumnasGlobalesRegion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RegionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=RegionConstantesFunciones.SFINALQUERY;

				this.cargarCombosRegionsForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarClientesPorRegion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyRegion();
			this.addItemDefectoCombosForeignKeyProvincia();
			this.addItemDefectoCombosForeignKeyCiudad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cobrarclientesporregionSessionBean==null) {
				this.cobrarclientesporregionSessionBean=new CobrarClientesPorRegionSessionBean();
			}

			if(!this.cobrarclientesporregionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cobrarclientesporregionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.cobrarclientesporregionSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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

	public void addItemDefectoCombosForeignKeyRegion()throws Exception {
		try {

			if(!this.cobrarclientesporregionSessionBean.getisBusquedaDesdeForeignKeySesionRegion()) {
				Region region=new Region();
				RegionConstantesFunciones.setRegionDescripcion(region,Constantes.SMENSAJE_ESCOJA_OPCION);
				region.setId(null);

				if(!RegionConstantesFunciones.ExisteEnLista(this.regionsForeignKey,region,true)) {

					this.regionsForeignKey.add(0,region);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProvincia()throws Exception {
		try {

			if(!this.cobrarclientesporregionSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
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

			if(!this.cobrarclientesporregionSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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
	
	public void initActionsCombosTodosForeignKeyCobrarClientesPorRegion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarClientesPorRegion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarClientesPorRegion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesPorRegion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarClientesPorRegion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesPorRegion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarClientesPorRegion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarClientesPorRegion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarClientesPorRegion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarClientesPorRegion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameRegionsForeignKey("Todos");
			this.cargarCombosFrameProvinciasForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarClientesPorRegion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameRegionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarClientesPorRegion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public CobrarClientesPorRegionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarClientesPorRegionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarClientesPorRegionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobrarclientesporregionSessionBean=new CobrarClientesPorRegionSessionBean(); 
		this.cobrarclientesporregionConstantesFunciones=new CobrarClientesPorRegionConstantesFunciones(); 
		this.cobrarclientesporregionBean=new CobrarClientesPorRegion();//(this.cobrarclientesporregionConstantesFunciones); 		
		this.cobrarclientesporregionReturnGeneral=new CobrarClientesPorRegionParameterReturnGeneral(); 
		
		this.cobrarclientesporregionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientesporregionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarClientesPorRegionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarClientesPorRegionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarClientesPorRegionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarClientesPorRegion(true);
			
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
			
			this.cobrarclientesporregionConstantesFunciones=new CobrarClientesPorRegionConstantesFunciones(); 
			this.cobrarclientesporregionBean=new CobrarClientesPorRegion();//this.cobrarclientesporregionConstantesFunciones); 			
			this.cobrarclientesporregionReturnGeneral=new CobrarClientesPorRegionParameterReturnGeneral(); 
		
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Clientes Por Region Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cobrarclientesporregion=new CobrarClientesPorRegion();
			this.cobrarclientesporregions = new ArrayList<CobrarClientesPorRegion>();
			this.cobrarclientesporregionsAux = new ArrayList<CobrarClientesPorRegion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic=new CobrarClientesPorRegionLogic();
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}
			
			//this.cobrarclientesporregionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobrarclientesporregionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarClientesPorRegion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarClientesPorRegion);	
					}
					
					if(this.jInternalFrameImportacionCobrarClientesPorRegion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarClientesPorRegion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarClientesPorRegion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarClientesPorRegion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarClientesPorRegion);
				this.jInternalFrameDetalleFormCobrarClientesPorRegion.setVisible(false);
				this.jInternalFrameDetalleFormCobrarClientesPorRegion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion);
					this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarClientesPorRegion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarClientesPorRegion);
					this.jInternalFrameImportacionCobrarClientesPorRegion.setVisible(false);
					this.jInternalFrameImportacionCobrarClientesPorRegion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarClientesPorRegion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarClientesPorRegion);
					this.jInternalFrameOrderByCobrarClientesPorRegion.setVisible(false);
					this.jInternalFrameOrderByCobrarClientesPorRegion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarClientesPorRegionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarClientesPorRegionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobrarclientesporregionReturnGeneral=new CobrarClientesPorRegionParameterReturnGeneral();
			
			this.cobrarclientesporregionParameterGeneral=new CobrarClientesPorRegionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobrarclientesporregionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarClientesPorRegionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarClientesPorRegionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado(),this.cobrarclientesporregionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarClientesPorRegionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado(),this.cobrarclientesporregionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaDuplicarCobrarClientesPorRegion=true;
			this.isVisibilidadCeldaCopiarCobrarClientesPorRegion=true;
			this.isVisibilidadCeldaVerFormCobrarClientesPorRegion=true;
			this.isVisibilidadCeldaOrdenCobrarClientesPorRegion=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaModificarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaActualizarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaEliminarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaCancelarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=false;
			
			
			this.isVisibilidadBusquedaCobrarClientesPorRegion=true;
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdProvincia=true;
			this.isVisibilidadFK_IdRegion=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarClientesPorRegion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarClientesPorRegion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarClientesPorRegion(false);
			
			this.setPermisosUsuarioCobrarClientesPorRegion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() 
				|| (this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado() && this.cobrarclientesporregionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarClientesPorRegionClasesRelacionadas();
			}
			
			if(this.cobrarclientesporregionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarClientesPorRegionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarClientesPorRegion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarClientesPorRegion();
			}
			
			if(!this.isPermisoBusquedaCobrarClientesPorRegion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarClientesPorRegion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarClientesPorRegionConstantesFunciones.getTiposSeleccionarCobrarClientesPorRegion());
				
				this.tiposColumnasSelect=CobrarClientesPorRegionConstantesFunciones.getTiposSeleccionarCobrarClientesPorRegion(true);
				
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
			//if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarClientesPorRegion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioCobrarClientesPorRegion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioCobrarClientesPorRegion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesPorRegion() ;
			
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
			this.paisLogic=new PaisLogic();
			this.regionLogic=new RegionLogic();
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
				cobrarclientesporregionImplementable= (CobrarClientesPorRegionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarClientesPorRegionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobrarclientesporregionImplementableHome= (CobrarClientesPorRegionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarClientesPorRegionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobrarclientesporregions= new ArrayList<CobrarClientesPorRegion>();
			this.cobrarclientesporregionsEliminados= new ArrayList<CobrarClientesPorRegion>();
						
			this.isEsNuevoCobrarClientesPorRegion=false;
			this.esParaAccionDesdeFormularioCobrarClientesPorRegion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.regionsForeignKey=new ArrayList<Region>() ;
			this.provinciasForeignKey=new ArrayList<Provincia>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarClientesPorRegion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarClientesPorRegion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarClientesPorRegionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarClientesPorRegion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarClientesPorRegion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarClientesPorRegion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarClientesPorRegion();
			}
			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarClientesPorRegion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarClientesPorRegion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarClientesPorRegion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarClientesPorRegion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarClientesPorRegion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarClientesPorRegion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarClientesPorRegion")) {
				iIndex=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTabbedPaneRelacionesCobrarClientesPorRegion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTabbedPaneRelacionesCobrarClientesPorRegion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarClientesPorRegion();	
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
	
	public void cargarCombosForeignKeyCobrarClientesPorRegion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarClientesPorRegion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarClientesPorRegion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarClientesPorRegionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarClientesPorRegion();
		
		this.cargarCombosFrameForeignKeyCobrarClientesPorRegion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarClientesPorRegion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarClientesPorRegion();
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

	public void cargarCombosForeignKeyRegion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyRegionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyRegion();
				this.cargarCombosFrameRegionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaRegion(this.regionsForeignKey);

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
	
	public void jButtonNuevoCobrarClientesPorRegionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobrarclientesporregionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			
			
			if(jTableDatosCobrarClientesPorRegion.getRowCount()>=1) {
				jTableDatosCobrarClientesPorRegion.removeRowSelectionInterval(0, jTableDatosCobrarClientesPorRegion.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarClientesPorRegion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarClientesPorRegion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarClientesPorRegion(true);			
			//this.cobrarclientesporregion=new CobrarClientesPorRegion();
			//this.cobrarclientesporregion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesPorRegion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesPorRegion() ;
			
			if(CobrarClientesPorRegionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesPorRegion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrarclientesporregion);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);				
			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			
			if(this.cobrarclientesporregionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarClientesPorRegion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarClientesPorRegionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados=new ArrayList<CobrarClientesPorRegion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarClientesPorRegion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarClientesPorRegion.getSelectedRows().length;			
			}
			
			cobrarclientesporregionsSeleccionados=this.getCobrarClientesPorRegionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarClientesPorRegion--;			
				//CobrarClientesPorRegion cobrarclientesporregionAux= new CobrarClientesPorRegion();			
				//cobrarclientesporregionAux.setId(this.iIdNuevoCobrarClientesPorRegion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarClientesPorRegion cobrarclientesporregionOrigen=new CobrarClientesPorRegion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarClientesPorRegion cobrarclientesporregionOrigen : cobrarclientesporregionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobrarclientesporregionOrigen =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientesporregionOrigen =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarClientesPorRegion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrarclientesporregion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarClientesPorRegion(cobrarclientesporregionOrigen,this.cobrarclientesporregion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().add(this.cobrarclientesporregionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregions.add(this.cobrarclientesporregionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);
				
				this.jTableDatosCobrarClientesPorRegion.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesPorRegion(), this.getIndiceNuevoCobrarClientesPorRegion());
				
				int iLastRow =  this.jTableDatosCobrarClientesPorRegion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarClientesPorRegion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarClientesPorRegion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados=new ArrayList<CobrarClientesPorRegion>();									
		
			CobrarClientesPorRegion cobrarclientesporregionOrigen=new CobrarClientesPorRegion();
			CobrarClientesPorRegion cobrarclientesporregionDestino=new CobrarClientesPorRegion();
				
			cobrarclientesporregionsSeleccionados=this.getCobrarClientesPorRegionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarClientesPorRegion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobrarclientesporregionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarClientesPorRegion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientesporregionOrigen =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarclientesporregionOrigen =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientesporregionDestino =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarclientesporregionDestino =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobrarclientesporregionOrigen =cobrarclientesporregionsSeleccionados.get(0);
				cobrarclientesporregionDestino =cobrarclientesporregionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarClientesPorRegion(cobrarclientesporregionOrigen,cobrarclientesporregionDestino,true,false);
				
				cobrarclientesporregionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobrarclientesporregionDestino,cobrarclientesporregionLogic.getCobrarClientesPorRegions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobrarclientesporregionDestino,cobrarclientesporregions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);
				
				//this.jTableDatosCobrarClientesPorRegion.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesPorRegion(), this.getIndiceNuevoCobrarClientesPorRegion());
				
				int iLastRow =  this.jTableDatosCobrarClientesPorRegion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarClientesPorRegion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarClientesPorRegion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarClientesPorRegion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarClientesPorRegion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarClientesPorRegion.setVisible(!isVisible);
			this.jPanelPaginacionCobrarClientesPorRegion.setVisible(!isVisible);
			this.jPanelAccionesCobrarClientesPorRegion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarClientesPorRegion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarClientesPorRegion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarClientesPorRegion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarClientesPorRegion();
			
			this.abrirFrameOrderByCobrarClientesPorRegion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarClientesPorRegion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarClientesPorRegion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarClientesPorRegion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarClientesPorRegion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarClientesPorRegion.setSize(this.jInternalFrameDetalleFormCobrarClientesPorRegion.iWidthFormulario,this.jInternalFrameDetalleFormCobrarClientesPorRegion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarClientesPorRegion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarClientesPorRegion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarClientesPorRegion.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarClientesPorRegion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jContentPaneDetalleCobrarClientesPorRegion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTabbedPaneRelacionesCobrarClientesPorRegion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jContentPaneDetalleCobrarClientesPorRegion.getWidth(),CobrarClientesPorRegionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTabbedPaneRelacionesCobrarClientesPorRegion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jContentPaneDetalleCobrarClientesPorRegion.getWidth(),CobrarClientesPorRegionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTabbedPaneRelacionesCobrarClientesPorRegion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jContentPaneDetalleCobrarClientesPorRegion.getWidth(),CobrarClientesPorRegionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarClientesPorRegion.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarClientesPorRegion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarClientesPorRegion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarClientesPorRegion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarClientesPorRegion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesPorRegion,false,this);
				} else {
					this.jInternalFrameOrderByCobrarClientesPorRegion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesPorRegion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarClientesPorRegion);
				this.jInternalFrameOrderByCobrarClientesPorRegion.setVisible(false);
				this.jInternalFrameOrderByCobrarClientesPorRegion.setSelected(false);
				
				this.jInternalFrameOrderByCobrarClientesPorRegion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarClientesPorRegion"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarClientesPorRegion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarClientesPorRegion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarClientesPorRegion==null) {
				
				this.jInternalFrameImportacionCobrarClientesPorRegion=new ImportacionJInternalFrame(CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarClientesPorRegion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarClientesPorRegion);
				this.jInternalFrameImportacionCobrarClientesPorRegion.setVisible(false);
				this.jInternalFrameImportacionCobrarClientesPorRegion.setSelected(false);


				this.jInternalFrameImportacionCobrarClientesPorRegion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarClientesPorRegion"));
				this.jInternalFrameImportacionCobrarClientesPorRegion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarClientesPorRegion"));
				this.jInternalFrameImportacionCobrarClientesPorRegion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarClientesPorRegion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarClientesPorRegion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion==null) {
				this.jInternalFrameReporteDinamicoCobrarClientesPorRegion=new ReporteDinamicoJInternalFrame(CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarClientesPorRegion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion);
				this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesPorRegion"));
				this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesPorRegion"));
				this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesPorRegion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesPorRegion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarClientesPorRegion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarClientesPorRegion);
			
	       	this.jInternalFrameDetalleFormCobrarClientesPorRegion.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarClientesPorRegion.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarClientesPorRegion.dispose();
			//this.jInternalFrameDetalleFormCobrarClientesPorRegion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarClientesPorRegion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarClientesPorRegion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarClientesPorRegion.setVisible(true);
	        this.jInternalFrameImportacionCobrarClientesPorRegion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarClientesPorRegion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarClientesPorRegion.setVisible(true);
	        this.jInternalFrameOrderByCobrarClientesPorRegion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarClientesPorRegion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarClientesPorRegion.setVisible(false);
	        this.jInternalFrameOrderByCobrarClientesPorRegion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarClientesPorRegion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarClientesPorRegion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarClientesPorRegion.setVisible(false);
	        this.jInternalFrameImportacionCobrarClientesPorRegion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarClientesPorRegion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarClientesPorRegion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarClientesPorRegion(true);
			//this.isEsNuevoCobrarClientesPorRegion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarClientesPorRegion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesPorRegion(false) ;
			
			if(cobrarclientesporregionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarClientesPorRegionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesPorRegion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesPorRegion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarClientesPorRegionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarClientesPorRegion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarClientesPorRegion(true);
			//this.isEsNuevoCobrarClientesPorRegion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrarclientesporregion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarClientesPorRegion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarClientesPorRegion(false) ;
			
			if(CobrarClientesPorRegionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesPorRegion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesPorRegion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaRegion(List<Region> regionsForeignKey)throws Exception{
		TableColumn tableColumnRegion=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_IDREGION));
		TableCellEditor tableCellEditorRegion =tableColumnRegion.getCellEditor();

		RegionTableCell regionTableCellFk=(RegionTableCell)tableCellEditorRegion;

		if(regionTableCellFk!=null) {
			regionTableCellFk.setregionsForeignKey(regionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//regionTableCellFk.setRowActual(intSelectedRow);
			//regionTableCellFk.setregionsForeignKeyActual(regionsForeignKey);
		//}


		if(regionTableCellFk!=null) {
			regionTableCellFk.RecargarRegionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProvincia(List<Provincia> provinciasForeignKey)throws Exception{
		TableColumn tableColumnProvincia=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_IDPROVINCIA));
		TableCellEditor tableCellEditorProvincia =tableColumnProvincia.getCellEditor();

		ProvinciaTableCell provinciaTableCellFk=(ProvinciaTableCell)tableCellEditorProvincia;

		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.setprovinciasForeignKey(provinciasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

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
		TableColumn tableColumnCiudad=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarClientesPorRegion(false);
			
			//if(!this.isEsNuevoCobrarClientesPorRegion) {								
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				
			}
			
			if(this.permiteMantenimiento(this.cobrarclientesporregion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarClientesPorRegion=true;
					this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);
					this.isEsNuevoCobrarClientesPorRegion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarClientesPorRegion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarClientesPorRegion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarClientesPorRegion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesPorRegion(false);
				
				this.habilitarDeshabilitarControlesCobrarClientesPorRegion(false);
			
												
				
				if(CobrarClientesPorRegionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarClientesPorRegion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,cobrarclientesporregionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarClientesPorRegion(this.cobrarclientesporregion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarClientesPorRegion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobrarclientesporregionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrarclientesporregion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarClientesPorRegion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesPorRegion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				this.cobrarclientesporregion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				this.cobrarclientesporregion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrarclientesporregion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarClientesPorRegionModel) this.jTableDatosCobrarClientesPorRegion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarClientesPorRegion=true;
				this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);
				this.isEsNuevoCobrarClientesPorRegion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarClientesPorRegion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesPorRegion(false);
				
				this.habilitarDeshabilitarControlesCobrarClientesPorRegion(false);
				
				
				
				if(CobrarClientesPorRegionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarClientesPorRegion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarClientesPorRegion.getRowCount()>=1) {
				jTableDatosCobrarClientesPorRegion.removeRowSelectionInterval(0, jTableDatosCobrarClientesPorRegion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarClientesPorRegion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesPorRegion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesPorRegion(false) ;
			
			this.isEsNuevoCobrarClientesPorRegion=false;
			
			if(CobrarClientesPorRegionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarClientesPorRegion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				
				//SI ES MANUAL
				if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarClientesPorRegion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarClientesPorRegion--;			
			//CobrarClientesPorRegion cobrarclientesporregionAux= new CobrarClientesPorRegion();			
			//cobrarclientesporregionAux.setId(this.iIdNuevoCobrarClientesPorRegion);
			
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarClientesPorRegion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
			
			this.cobrarclientesporregion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().add(this.cobrarclientesporregionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobrarclientesporregions.add(this.cobrarclientesporregionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);
			
			this.jTableDatosCobrarClientesPorRegion.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesPorRegion(), this.getIndiceNuevoCobrarClientesPorRegion());
			
			int iLastRow =  this.jTableDatosCobrarClientesPorRegion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarClientesPorRegion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarClientesPorRegion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesPorRegion(false);
			
			//SI ES MANUAL
			if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesPorRegion();
			}
			
			//this.abrirFrameTreeCobrarClientesPorRegion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarClientesPorRegion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarClientesPorRegion.setFileImportacion(this.jInternalFrameImportacionCobrarClientesPorRegion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarClientesPorRegion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarClientesPorRegion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarClientesPorRegion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarClientesPorRegion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados=new ArrayList<CobrarClientesPorRegion>();		

		cobrarclientesporregionsSeleccionados=this.getCobrarClientesPorRegionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarClientesPorRegionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarClientesPorRegionBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarClientesPorRegions("Todos",cobrarclientesporregionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Por Region",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreRegion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreRegion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreRegion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreRegion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProvincia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProvincia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProvincia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProvincia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCiudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCiudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCiudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCiudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreZona_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreZona_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreZona_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreZona_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreRuta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreRuta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreRuta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreRuta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreVendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreVendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreVendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreVendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccionDireccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccionDireccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccionDireccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccionDireccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoTelefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoTelefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoTelefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoTelefono_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION:
					sNombreCampoCategoria="nombre_region";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA:
					sNombreCampoCategoria="nombre_provincia";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoria="nombre_ciudad";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoria="nombre_zona";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA:
					sNombreCampoCategoria="nombre_ruta";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoria="nombre_vendedor";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoria="apellido";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					sNombreCampoCategoria="direccion_direccion";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO:
					sNombreCampoCategoria="telefono_telefono";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION:
					sNombreCampoCategoriaValor="nombre_region";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA:
					sNombreCampoCategoriaValor="nombre_provincia";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD:
					sNombreCampoCategoriaValor="nombre_ciudad";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA:
					sNombreCampoCategoriaValor="nombre_zona";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA:
					sNombreCampoCategoriaValor="nombre_ruta";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoriaValor="nombre_vendedor";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoriaValor="apellido";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					sNombreCampoCategoriaValor="direccion_direccion";
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO:
					sNombreCampoCategoriaValor="telefono_telefono";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Region",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_region");
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Provincia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_provincia");
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_ciudad");
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Zona",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_zona");
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Ruta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_ruta");
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_vendedor");
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apello",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido");
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion_direccion");
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono_telefono");
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados=new ArrayList<CobrarClientesPorRegion>();		
		
		cobrarclientesporregionsSeleccionados=this.getCobrarClientesPorRegionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesporregion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarClientesPorRegions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarClientesPorRegionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_IDREGION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDREGION);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getregion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_IDPROVINCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDPROVINCIA);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getprovincia_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getnombre_region());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getnombre_provincia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getnombre_ciudad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getnombre_zona());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getnombre_ruta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getnombre_vendedor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getapellido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.getdireccion_direccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO);
					iRow++;

					for(CobrarClientesPorRegion cobrarclientesporregion:cobrarclientesporregionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesporregion.gettelefono_telefono());
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
			//	this.getFilaCabeceraExportarExcelCobrarClientesPorRegion(row);				
			//	iRow++;
			//}				
			
			//for(CobrarClientesPorRegion cobrarclientesporregionAux:cobrarclientesporregionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarClientesPorRegion(cobrarclientesporregionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Por Region",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesPorRegion(false);
			
			//SI ES MANUAL
			if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesPorRegion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesPorRegion(false);
			
			//SI ES MANUAL
			if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarClientesPorRegion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesPorRegion(false);
			
			//SI ES MANUAL
			if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarClientesPorRegion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarClientesPorRegion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarClientesPorRegion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarClientesPorRegion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarClientesPorRegion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarClientesPorRegion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarClientesPorRegion.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarClientesPorRegion.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarClientesPorRegion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarClientesPorRegion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarClientesPorRegion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarClientesPorRegion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarClientesPorRegion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarClientesPorRegion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarClientesPorRegion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesPorRegion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarClientesPorRegion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarClientesPorRegion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarClientesPorRegion();
		
		this.inicializarActualizarBindingBotonesManualCobrarClientesPorRegion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarClientesPorRegion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesPorRegion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesPorRegion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesPorRegion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarClientesPorRegion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarClientesPorRegion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jCheckBoxPostAccionNuevoCobrarClientesPorRegion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jCheckBoxPostAccionSinCerrarCobrarClientesPorRegion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jCheckBoxPostAccionSinMensajeCobrarClientesPorRegion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarClientesPorRegion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarClientesPorRegion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
				this.jInternalFrameDetalleFormCobrarClientesPorRegion.jCheckBoxPostAccionNuevoCobrarClientesPorRegion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarClientesPorRegion.jCheckBoxPostAccionSinCerrarCobrarClientesPorRegion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarClientesPorRegion.jCheckBoxPostAccionSinMensajeCobrarClientesPorRegion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarClientesPorRegion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarClientesPorRegion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarClientesPorRegion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarClientesPorRegion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarClientesPorRegion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarClientesPorRegion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarClientesPorRegion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarClientesPorRegion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarClientesPorRegion(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesPorRegion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesPorRegion() throws Exception {
		try	{
			if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarClientesPorRegion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarClientesPorRegion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarClientesPorRegion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarClientesPorRegion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarClientesPorRegion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarClientesPorRegion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarClientesPorRegion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarClientesPorRegion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarClientesPorRegion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarClientesPorRegion.addItem(reporte);
			}
			
			
			if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarClientesPorRegion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarClientesPorRegion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarClientesPorRegion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarClientesPorRegion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarClientesPorRegion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarClientesPorRegion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarClientesPorRegion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarClientesPorRegion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarClientesPorRegion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesPorRegion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesPorRegion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarClientesPorRegion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.getSelectedItem()!=null){this.id_paisBusquedaCobrarClientesPorRegion=((Pais)this.jComboBoxid_paisBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.getSelectedItem()).getId();}
		if(this.jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.getSelectedItem()!=null){this.id_regionBusquedaCobrarClientesPorRegion=((Region)this.jComboBoxid_regionBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.getSelectedItem()).getId();}
		if(this.jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.getSelectedItem()!=null){this.id_provinciaBusquedaCobrarClientesPorRegion=((Provincia)this.jComboBoxid_provinciaBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.getSelectedItem()).getId();}
		if(this.jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.getSelectedItem()!=null){this.id_ciudadBusquedaCobrarClientesPorRegion=((Ciudad)this.jComboBoxid_ciudadBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarClientesPorRegion(Boolean esInicializar) throws Exception {				
		if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarClientesPorRegion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarClientesPorRegion() throws Exception {
		this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarClientesPorRegion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarClientesPorRegion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarClientesPorRegion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesPorRegion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarClientesPorRegion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesPorRegion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarClientesPorRegionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarClientesPorRegion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesPorRegion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarClientesPorRegion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarClientesPorRegion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobrarclientesporregionLogic.getCobrarClientesPorRegions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobrarclientesporregions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarClientesPorRegion.setModel(new CobrarClientesPorRegionModel(this.cobrarclientesporregionLogic.getCobrarClientesPorRegions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarClientesPorRegion.setModel(new CobrarClientesPorRegionModel(this.cobrarclientesporregions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarClientesPorRegion!=null && this.jInternalFrameOrderByCobrarClientesPorRegion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarClientesPorRegion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO,cobrarclientesporregionConstantesFunciones.resaltarSeleccionarCobrarClientesPorRegion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarClientesPorRegionConstantesFunciones.SCLASSWEBTITULO,cobrarclientesporregionConstantesFunciones.resaltarSeleccionarCobrarClientesPorRegion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_ID));

		if(this.cobrarclientesporregionConstantesFunciones.mostraridCobrarClientesPorRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesPorRegionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarclientesporregionConstantesFunciones.resaltaridCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activaridCobrarClientesPorRegion,this,true,"idCobrarClientesPorRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesporregionConstantesFunciones.resaltaridCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activaridCobrarClientesPorRegion,this,true,"idCobrarClientesPorRegion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION));

		if(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_regionCobrarClientesPorRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_regionCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarnombre_regionCobrarClientesPorRegion,this,true,"nombre_regionCobrarClientesPorRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_regionCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarnombre_regionCobrarClientesPorRegion,this,true,"nombre_regionCobrarClientesPorRegion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA));

		if(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_provinciaCobrarClientesPorRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_provinciaCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarnombre_provinciaCobrarClientesPorRegion,this,true,"nombre_provinciaCobrarClientesPorRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_provinciaCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarnombre_provinciaCobrarClientesPorRegion,this,true,"nombre_provinciaCobrarClientesPorRegion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD));

		if(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_ciudadCobrarClientesPorRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_ciudadCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarnombre_ciudadCobrarClientesPorRegion,this,true,"nombre_ciudadCobrarClientesPorRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_ciudadCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarnombre_ciudadCobrarClientesPorRegion,this,true,"nombre_ciudadCobrarClientesPorRegion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA));

		if(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_zonaCobrarClientesPorRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_zonaCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarnombre_zonaCobrarClientesPorRegion,this,true,"nombre_zonaCobrarClientesPorRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_zonaCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarnombre_zonaCobrarClientesPorRegion,this,true,"nombre_zonaCobrarClientesPorRegion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA));

		if(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_rutaCobrarClientesPorRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_rutaCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarnombre_rutaCobrarClientesPorRegion,this,true,"nombre_rutaCobrarClientesPorRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_rutaCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarnombre_rutaCobrarClientesPorRegion,this,true,"nombre_rutaCobrarClientesPorRegion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR));

		if(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_vendedorCobrarClientesPorRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_vendedorCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarnombre_vendedorCobrarClientesPorRegion,this,true,"nombre_vendedorCobrarClientesPorRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_vendedorCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarnombre_vendedorCobrarClientesPorRegion,this,true,"nombre_vendedorCobrarClientesPorRegion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO));

		if(this.cobrarclientesporregionConstantesFunciones.mostrarcodigoCobrarClientesPorRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarcodigoCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarcodigoCobrarClientesPorRegion,this,true,"codigoCobrarClientesPorRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarcodigoCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarcodigoCobrarClientesPorRegion,this,true,"codigoCobrarClientesPorRegion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE));

		if(this.cobrarclientesporregionConstantesFunciones.mostrarnombreCobrarClientesPorRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarnombreCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarnombreCobrarClientesPorRegion,this,true,"nombreCobrarClientesPorRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarnombreCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarnombreCobrarClientesPorRegion,this,true,"nombreCobrarClientesPorRegion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO));

		if(this.cobrarclientesporregionConstantesFunciones.mostrarapellidoCobrarClientesPorRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarapellidoCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarapellidoCobrarClientesPorRegion,this,true,"apellidoCobrarClientesPorRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesporregionConstantesFunciones.resaltarapellidoCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activarapellidoCobrarClientesPorRegion,this,true,"apellidoCobrarClientesPorRegion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION));

		if(this.cobrarclientesporregionConstantesFunciones.mostrardireccion_direccionCobrarClientesPorRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesporregionConstantesFunciones.resaltardireccion_direccionCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activardireccion_direccionCobrarClientesPorRegion,this,true,"direccion_direccionCobrarClientesPorRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesporregionConstantesFunciones.resaltardireccion_direccionCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activardireccion_direccionCobrarClientesPorRegion,this,true,"direccion_direccionCobrarClientesPorRegion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO));

		if(this.cobrarclientesporregionConstantesFunciones.mostrartelefono_telefonoCobrarClientesPorRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesporregionConstantesFunciones.resaltartelefono_telefonoCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activartelefono_telefonoCobrarClientesPorRegion,this,true,"telefono_telefonoCobrarClientesPorRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesporregionConstantesFunciones.resaltartelefono_telefonoCobrarClientesPorRegion,this.cobrarclientesporregionConstantesFunciones.activartelefono_telefonoCobrarClientesPorRegion,this,true,"telefono_telefonoCobrarClientesPorRegion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesPorRegionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarClientesPorRegion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarClientesPorRegion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarClientesPorRegion && this.isPermisoGuardarCambiosCobrarClientesPorRegion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarClientesPorRegion.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarClientesPorRegion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarClientesPorRegion && this.isPermisoGuardarCambiosCobrarClientesPorRegion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarClientesPorRegion && this.isPermisoGuardarCambiosCobrarClientesPorRegion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarClientesPorRegion.moveColumn(this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarClientesPorRegion.moveColumn(this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarClientesPorRegion.moveColumn(this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarClientesPorRegion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarClientesPorRegion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarClientesPorRegion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarClientesPorRegion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarClientesPorRegion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarClientesPorRegion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobrarclientesporregionLogic.getCobrarClientesPorRegions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobrarclientesporregions.size()-1;
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
		//this.jTableDatosCobrarClientesPorRegion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarClientesPorRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarClientesPorRegion();
			
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
				
				//this.isEsNuevoCobrarClientesPorRegion=false;
					
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			
				if(this.cobrarclientesporregionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarClientesPorRegion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarClientesPorRegion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarClientesPorRegion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrarclientesporregion.getsType().equals("DUPLICADO")
				   || this.cobrarclientesporregion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarClientesPorRegion=true;
				
				} else {
					this.isEsNuevoCobrarClientesPorRegion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrarclientesporregion.getId()>=0 && !this.cobrarclientesporregion.getIsNew()) {						
						this.isEsNuevoCobrarClientesPorRegion=false;
						
					} else {
						this.isEsNuevoCobrarClientesPorRegion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarClientesPorRegion(esRelaciones);						
				
				this.seleccionarCobrarClientesPorRegion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrarclientesporregion.getId()<0) {
					this.isEsNuevoCobrarClientesPorRegion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarClientesPorRegion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarClientesPorRegion(evt,rowIndex);
				}	
				
				if(this.cobrarclientesporregionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarClientesPorRegion: " + this.dDif); 
					}
				}								
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarClientesPorRegion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrarclientesporregion)) {
					if(this.cobrarclientesporregion.getId()>0) {
						this.cobrarclientesporregion.setIsDeleted(true);
						
						this.cobrarclientesporregionsEliminados.add(this.cobrarclientesporregion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().remove(this.cobrarclientesporregion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregions.remove(this.cobrarclientesporregion);				
					}
					
					
					((CobrarClientesPorRegionModel) this.jTableDatosCobrarClientesPorRegion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarClientesPorRegion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarClientesPorRegion) {
			
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarClientesPorRegion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarClientesPorRegion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarClientesPorRegion(this.cobrarclientesporregion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarClientesPorRegion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarClientesPorRegion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesPorRegion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarClientesPorRegion(cobrarclientesporregion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarClientesPorRegion(cobrarclientesporregion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarClientesPorRegion(cobrarclientesporregion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesPorRegion(cobrarclientesporregion);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelidCobrarClientesPorRegion.setText(cobrarclientesporregion.getId().toString());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_regionCobrarClientesPorRegion.setText(cobrarclientesporregion.getnombre_region());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_provinciaCobrarClientesPorRegion.setText(cobrarclientesporregion.getnombre_provincia());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_ciudadCobrarClientesPorRegion.setText(cobrarclientesporregion.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldnombre_zonaCobrarClientesPorRegion.setText(cobrarclientesporregion.getnombre_zona());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_rutaCobrarClientesPorRegion.setText(cobrarclientesporregion.getnombre_ruta());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_vendedorCobrarClientesPorRegion.setText(cobrarclientesporregion.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldcodigoCobrarClientesPorRegion.setText(cobrarclientesporregion.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombreCobrarClientesPorRegion.setText(cobrarclientesporregion.getnombre());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreaapellidoCobrarClientesPorRegion.setText(cobrarclientesporregion.getapellido());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreadireccion_direccionCobrarClientesPorRegion.setText(cobrarclientesporregion.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreatelefono_telefonoCobrarClientesPorRegion.setText(cobrarclientesporregion.gettelefono_telefono());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarClientesPorRegion cobrarclientesporregionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobrarclientesporregionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarClientesPorRegion cobrarclientesporregionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobrarclientesporregionLocal=this.cobrarclientesporregion;
			} else {
				cobrarclientesporregionLocal=this.cobrarclientesporregionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobrarclientesporregionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarClientesPorRegion(cobrarclientesporregionLocal,true);
					
					if(cobrarclientesporregionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobrarclientesporregionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobrarclientesporregionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(cobrarclientesporregion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(cobrarclientesporregion);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(cobrarclientesporregion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelidCobrarClientesPorRegion.getText()==null || this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelidCobrarClientesPorRegion.getText()=="" || this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelidCobrarClientesPorRegion.getText()=="Id") {
				this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelidCobrarClientesPorRegion.setText("0");
			}

			if(conColumnasBase) {cobrarclientesporregion.setId(Long.parseLong(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelidCobrarClientesPorRegion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesPorRegionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelIdCobrarClientesPorRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesporregion.setnombre_region(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_regionCobrarClientesPorRegion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_regionCobrarClientesPorRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesporregion.setnombre_provincia(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_provinciaCobrarClientesPorRegion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_provinciaCobrarClientesPorRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesporregion.setnombre_ciudad(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_ciudadCobrarClientesPorRegion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_ciudadCobrarClientesPorRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesporregion.setnombre_zona(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldnombre_zonaCobrarClientesPorRegion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_zonaCobrarClientesPorRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesporregion.setnombre_ruta(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_rutaCobrarClientesPorRegion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_rutaCobrarClientesPorRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesporregion.setnombre_vendedor(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_vendedorCobrarClientesPorRegion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombre_vendedorCobrarClientesPorRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesporregion.setcodigo(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldcodigoCobrarClientesPorRegion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelcodigoCobrarClientesPorRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesporregion.setnombre(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombreCobrarClientesPorRegion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelnombreCobrarClientesPorRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesporregion.setapellido(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreaapellidoCobrarClientesPorRegion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelapellidoCobrarClientesPorRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesporregion.setdireccion_direccion(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreadireccion_direccionCobrarClientesPorRegion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabeldireccion_direccionCobrarClientesPorRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesporregion.settelefono_telefono(this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreatelefono_telefonoCobrarClientesPorRegion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabeltelefono_telefonoCobrarClientesPorRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregionBean,CobrarClientesPorRegion cobrarclientesporregion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregionOrigen,CobrarClientesPorRegion cobrarclientesporregion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarclientesporregionOrigen.getId()!=null && !cobrarclientesporregionOrigen.getId().equals(0L))) {cobrarclientesporregion.setId(cobrarclientesporregionOrigen.getId());}}
			if(conDefault || (!conDefault && cobrarclientesporregionOrigen.getnombre_region()!=null && !cobrarclientesporregionOrigen.getnombre_region().equals(""))) {cobrarclientesporregion.setnombre_region(cobrarclientesporregionOrigen.getnombre_region());}
			if(conDefault || (!conDefault && cobrarclientesporregionOrigen.getnombre_provincia()!=null && !cobrarclientesporregionOrigen.getnombre_provincia().equals(""))) {cobrarclientesporregion.setnombre_provincia(cobrarclientesporregionOrigen.getnombre_provincia());}
			if(conDefault || (!conDefault && cobrarclientesporregionOrigen.getnombre_ciudad()!=null && !cobrarclientesporregionOrigen.getnombre_ciudad().equals(""))) {cobrarclientesporregion.setnombre_ciudad(cobrarclientesporregionOrigen.getnombre_ciudad());}
			if(conDefault || (!conDefault && cobrarclientesporregionOrigen.getnombre_zona()!=null && !cobrarclientesporregionOrigen.getnombre_zona().equals(""))) {cobrarclientesporregion.setnombre_zona(cobrarclientesporregionOrigen.getnombre_zona());}
			if(conDefault || (!conDefault && cobrarclientesporregionOrigen.getnombre_ruta()!=null && !cobrarclientesporregionOrigen.getnombre_ruta().equals(""))) {cobrarclientesporregion.setnombre_ruta(cobrarclientesporregionOrigen.getnombre_ruta());}
			if(conDefault || (!conDefault && cobrarclientesporregionOrigen.getnombre_vendedor()!=null && !cobrarclientesporregionOrigen.getnombre_vendedor().equals(""))) {cobrarclientesporregion.setnombre_vendedor(cobrarclientesporregionOrigen.getnombre_vendedor());}
			if(conDefault || (!conDefault && cobrarclientesporregionOrigen.getcodigo()!=null && !cobrarclientesporregionOrigen.getcodigo().equals(""))) {cobrarclientesporregion.setcodigo(cobrarclientesporregionOrigen.getcodigo());}
			if(conDefault || (!conDefault && cobrarclientesporregionOrigen.getnombre()!=null && !cobrarclientesporregionOrigen.getnombre().equals(""))) {cobrarclientesporregion.setnombre(cobrarclientesporregionOrigen.getnombre());}
			if(conDefault || (!conDefault && cobrarclientesporregionOrigen.getapellido()!=null && !cobrarclientesporregionOrigen.getapellido().equals(""))) {cobrarclientesporregion.setapellido(cobrarclientesporregionOrigen.getapellido());}
			if(conDefault || (!conDefault && cobrarclientesporregionOrigen.getdireccion_direccion()!=null && !cobrarclientesporregionOrigen.getdireccion_direccion().equals(""))) {cobrarclientesporregion.setdireccion_direccion(cobrarclientesporregionOrigen.getdireccion_direccion());}
			if(conDefault || (!conDefault && cobrarclientesporregionOrigen.gettelefono_telefono()!=null && !cobrarclientesporregionOrigen.gettelefono_telefono().equals(""))) {cobrarclientesporregion.settelefono_telefono(cobrarclientesporregionOrigen.gettelefono_telefono());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelidCobrarClientesPorRegion.setText(cobrarclientesporregion.getId().toString());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_regionCobrarClientesPorRegion.setText(cobrarclientesporregion.getnombre_region());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_provinciaCobrarClientesPorRegion.setText(cobrarclientesporregion.getnombre_provincia());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_ciudadCobrarClientesPorRegion.setText(cobrarclientesporregion.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldnombre_zonaCobrarClientesPorRegion.setText(cobrarclientesporregion.getnombre_zona());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_rutaCobrarClientesPorRegion.setText(cobrarclientesporregion.getnombre_ruta());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_vendedorCobrarClientesPorRegion.setText(cobrarclientesporregion.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldcodigoCobrarClientesPorRegion.setText(cobrarclientesporregion.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombreCobrarClientesPorRegion.setText(cobrarclientesporregion.getnombre());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreaapellidoCobrarClientesPorRegion.setText(cobrarclientesporregion.getapellido());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreadireccion_direccionCobrarClientesPorRegion.setText(cobrarclientesporregion.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreatelefono_telefonoCobrarClientesPorRegion.setText(cobrarclientesporregion.gettelefono_telefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarClientesPorRegion(CobrarClientesPorRegionBean cobrarclientesporregionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelidCobrarClientesPorRegion.setText(cobrarclientesporregionBean.getId().toString());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_regionCobrarClientesPorRegion.setText(cobrarclientesporregionBean.getnombre_region());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_provinciaCobrarClientesPorRegion.setText(cobrarclientesporregionBean.getnombre_provincia());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_ciudadCobrarClientesPorRegion.setText(cobrarclientesporregionBean.getnombre_ciudad());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldnombre_zonaCobrarClientesPorRegion.setText(cobrarclientesporregionBean.getnombre_zona());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_rutaCobrarClientesPorRegion.setText(cobrarclientesporregionBean.getnombre_ruta());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_vendedorCobrarClientesPorRegion.setText(cobrarclientesporregionBean.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldcodigoCobrarClientesPorRegion.setText(cobrarclientesporregionBean.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombreCobrarClientesPorRegion.setText(cobrarclientesporregionBean.getnombre());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreaapellidoCobrarClientesPorRegion.setText(cobrarclientesporregionBean.getapellido());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreadireccion_direccionCobrarClientesPorRegion.setText(cobrarclientesporregionBean.getdireccion_direccion());
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreatelefono_telefonoCobrarClientesPorRegion.setText(cobrarclientesporregionBean.gettelefono_telefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarClientesPorRegion(CobrarClientesPorRegionParameterReturnGeneral cobrarclientesporregionReturnGeneral,CobrarClientesPorRegionBean cobrarclientesporregionBean,Boolean conDefault) throws Exception { 
		try {
			CobrarClientesPorRegion cobrarclientesporregionLocal=new CobrarClientesPorRegion();
			
			cobrarclientesporregionLocal=cobrarclientesporregionReturnGeneral.getCobrarClientesPorRegion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarclientesporregionLocal.getId()!=null && !cobrarclientesporregionLocal.getId().equals(0L))) {cobrarclientesporregionBean.setId(cobrarclientesporregionLocal.getId());}}
			if(conDefault || (!conDefault && cobrarclientesporregionLocal.getnombre_region()!=null && !cobrarclientesporregionLocal.getnombre_region().equals(""))) {cobrarclientesporregionBean.setnombre_region(cobrarclientesporregionLocal.getnombre_region());}
			if(conDefault || (!conDefault && cobrarclientesporregionLocal.getnombre_provincia()!=null && !cobrarclientesporregionLocal.getnombre_provincia().equals(""))) {cobrarclientesporregionBean.setnombre_provincia(cobrarclientesporregionLocal.getnombre_provincia());}
			if(conDefault || (!conDefault && cobrarclientesporregionLocal.getnombre_ciudad()!=null && !cobrarclientesporregionLocal.getnombre_ciudad().equals(""))) {cobrarclientesporregionBean.setnombre_ciudad(cobrarclientesporregionLocal.getnombre_ciudad());}
			if(conDefault || (!conDefault && cobrarclientesporregionLocal.getnombre_zona()!=null && !cobrarclientesporregionLocal.getnombre_zona().equals(""))) {cobrarclientesporregionBean.setnombre_zona(cobrarclientesporregionLocal.getnombre_zona());}
			if(conDefault || (!conDefault && cobrarclientesporregionLocal.getnombre_ruta()!=null && !cobrarclientesporregionLocal.getnombre_ruta().equals(""))) {cobrarclientesporregionBean.setnombre_ruta(cobrarclientesporregionLocal.getnombre_ruta());}
			if(conDefault || (!conDefault && cobrarclientesporregionLocal.getnombre_vendedor()!=null && !cobrarclientesporregionLocal.getnombre_vendedor().equals(""))) {cobrarclientesporregionBean.setnombre_vendedor(cobrarclientesporregionLocal.getnombre_vendedor());}
			if(conDefault || (!conDefault && cobrarclientesporregionLocal.getcodigo()!=null && !cobrarclientesporregionLocal.getcodigo().equals(""))) {cobrarclientesporregionBean.setcodigo(cobrarclientesporregionLocal.getcodigo());}
			if(conDefault || (!conDefault && cobrarclientesporregionLocal.getnombre()!=null && !cobrarclientesporregionLocal.getnombre().equals(""))) {cobrarclientesporregionBean.setnombre(cobrarclientesporregionLocal.getnombre());}
			if(conDefault || (!conDefault && cobrarclientesporregionLocal.getapellido()!=null && !cobrarclientesporregionLocal.getapellido().equals(""))) {cobrarclientesporregionBean.setapellido(cobrarclientesporregionLocal.getapellido());}
			if(conDefault || (!conDefault && cobrarclientesporregionLocal.getdireccion_direccion()!=null && !cobrarclientesporregionLocal.getdireccion_direccion().equals(""))) {cobrarclientesporregionBean.setdireccion_direccion(cobrarclientesporregionLocal.getdireccion_direccion());}
			if(conDefault || (!conDefault && cobrarclientesporregionLocal.gettelefono_telefono()!=null && !cobrarclientesporregionLocal.gettelefono_telefono().equals(""))) {cobrarclientesporregionBean.settelefono_telefono(cobrarclientesporregionLocal.gettelefono_telefono());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarClientesPorRegionGenerico(Long idCobrarClientesPorRegionSeleccionado,JComboBox jComboBoxCobrarClientesPorRegion,List<CobrarClientesPorRegion> cobrarclientesporregionsLocal)throws Exception {
		try {
			CobrarClientesPorRegion  cobrarclientesporregionTemp=null;

			for(CobrarClientesPorRegion cobrarclientesporregionAux:cobrarclientesporregionsLocal) {
				if(cobrarclientesporregionAux.getId()!=null && cobrarclientesporregionAux.getId().equals(idCobrarClientesPorRegionSeleccionado)) {
					cobrarclientesporregionTemp=cobrarclientesporregionAux;
					break;
				}
			}

			jComboBoxCobrarClientesPorRegion.setSelectedItem(cobrarclientesporregionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarClientesPorRegionGenerico(JComboBox jComboBoxCobrarClientesPorRegion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarClientesPorRegion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarClientesPorRegion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarClientesPorRegion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarClientesPorRegion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarClientesPorRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarClientesPorRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientesporregion=(CobrarClientesPorRegion) cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarclientesporregion =(CobrarClientesPorRegion) cobrarclientesporregions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cobrarclientesporregion.getIsNew() && !cobrarclientesporregion.getIsChanged() && !cobrarclientesporregion.getIsDeleted()) {
				sDescripcion=cobrarclientesporregion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclientesporregion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cobrarclientesporregion.getIsNew() && !cobrarclientesporregion.getIsChanged() && !cobrarclientesporregion.getIsDeleted()) {
				sDescripcion=cobrarclientesporregion.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclientesporregion.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!cobrarclientesporregion.getIsNew() && !cobrarclientesporregion.getIsChanged() && !cobrarclientesporregion.getIsDeleted()) {
				sDescripcion=cobrarclientesporregion.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclientesporregion.getpais_descripcion();
			}
		}

		if(sTipo.equals("Region")) {
			//sDescripcion=this.getActualRegionForeignKeyDescripcion((Long)value);
			if(!cobrarclientesporregion.getIsNew() && !cobrarclientesporregion.getIsChanged() && !cobrarclientesporregion.getIsDeleted()) {
				sDescripcion=cobrarclientesporregion.getregion_descripcion();
			} else {
				//sDescripcion=this.getActualRegionForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclientesporregion.getregion_descripcion();
			}
		}

		if(sTipo.equals("Provincia")) {
			//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
			if(!cobrarclientesporregion.getIsNew() && !cobrarclientesporregion.getIsChanged() && !cobrarclientesporregion.getIsDeleted()) {
				sDescripcion=cobrarclientesporregion.getprovincia_descripcion();
			} else {
				//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclientesporregion.getprovincia_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!cobrarclientesporregion.getIsNew() && !cobrarclientesporregion.getIsChanged() && !cobrarclientesporregion.getIsDeleted()) {
				sDescripcion=cobrarclientesporregion.getciudad_descripcion();
			} else {
				//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclientesporregion.getciudad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarClientesPorRegion cobrarclientesporregionRow=new CobrarClientesPorRegion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientesporregionRow=(CobrarClientesPorRegion) cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarclientesporregionRow=(CobrarClientesPorRegion) cobrarclientesporregions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarClientesPorRegion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesPorRegion && this.isPermisoNuevoCobrarClientesPorRegion));			
			this.jButtonDuplicarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesPorRegion && this.isPermisoDuplicarCobrarClientesPorRegion));			
			this.jButtonCopiarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesPorRegion && this.isPermisoCopiarCobrarClientesPorRegion));
			this.jButtonVerFormCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesPorRegion && this.isPermisoVerFormCobrarClientesPorRegion));
			
			this.jButtonAbrirOrderByCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesPorRegion && this.isPermisoOrdenCobrarClientesPorRegion));			
			
			this.jButtonNuevoRelacionesCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion && this.isPermisoNuevoCobrarClientesPorRegion));			
			this.jButtonNuevoGuardarCambiosCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesPorRegion && this.isPermisoNuevoCobrarClientesPorRegion && this.isPermisoGuardarCambiosCobrarClientesPorRegion));
			
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonModificarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaModificarCobrarClientesPorRegion && this.isPermisoActualizarCobrarClientesPorRegion));	
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonActualizarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesPorRegion && this.isPermisoActualizarCobrarClientesPorRegion));	
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonEliminarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesPorRegion && this.isPermisoEliminarCobrarClientesPorRegion));
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonCancelarCobrarClientesPorRegion.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesPorRegion);							
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonGuardarCambiosCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesPorRegion && this.isPermisoGuardarCambiosCobrarClientesPorRegion));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion && this.isPermisoGuardarCambiosCobrarClientesPorRegion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesPorRegion && this.isPermisoNuevoCobrarClientesPorRegion));						
			this.jButtonDuplicarToolBarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesPorRegion && this.isPermisoDuplicarCobrarClientesPorRegion));						
			this.jButtonCopiarToolBarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesPorRegion && this.isPermisoCopiarCobrarClientesPorRegion));			
			this.jButtonVerFormToolBarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesPorRegion && this.isPermisoVerFormCobrarClientesPorRegion));			
			this.jButtonAbrirOrderByToolBarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesPorRegion && this.isPermisoOrdenCobrarClientesPorRegion));
			this.jButtonNuevoRelacionesToolBarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion && this.isPermisoNuevoCobrarClientesPorRegion));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesPorRegion && this.isPermisoNuevoCobrarClientesPorRegion && this.isPermisoGuardarCambiosCobrarClientesPorRegion));			
			
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonModificarToolBarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaModificarCobrarClientesPorRegion && this.isPermisoActualizarCobrarClientesPorRegion));	
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonActualizarToolBarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesPorRegion  && this.isPermisoActualizarCobrarClientesPorRegion));	
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonEliminarToolBarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesPorRegion && this.isPermisoEliminarCobrarClientesPorRegion));
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonCancelarToolBarCobrarClientesPorRegion.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesPorRegion);				
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonGuardarCambiosToolBarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesPorRegion && this.isPermisoGuardarCambiosCobrarClientesPorRegion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion && this.isPermisoGuardarCambiosCobrarClientesPorRegion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesPorRegion && this.isPermisoNuevoCobrarClientesPorRegion));			
			this.jMenuItemDuplicarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesPorRegion && this.isPermisoDuplicarCobrarClientesPorRegion));			
			this.jMenuItemCopiarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesPorRegion && this.isPermisoCopiarCobrarClientesPorRegion));			
			this.jMenuItemVerFormCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesPorRegion && this.isPermisoVerFormCobrarClientesPorRegion));			
			this.jMenuItemAbrirOrderByCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesPorRegion && this.isPermisoOrdenCobrarClientesPorRegion));			
			//this.jMenuItemMostrarOcultarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesPorRegion && this.isPermisoOrdenCobrarClientesPorRegion));
			this.jMenuItemDetalleAbrirOrderByCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesPorRegion && this.isPermisoOrdenCobrarClientesPorRegion));			
			//this.jMenuItemDetalleMostrarOcultarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesPorRegion && this.isPermisoOrdenCobrarClientesPorRegion));			
			this.jMenuItemNuevoRelacionesCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion && this.isPermisoNuevoCobrarClientesPorRegion));			
			this.jMenuItemNuevoGuardarCambiosCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesPorRegion && this.isPermisoNuevoCobrarClientesPorRegion && this.isPermisoGuardarCambiosCobrarClientesPorRegion));									
			
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemModificarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaModificarCobrarClientesPorRegion && this.isPermisoActualizarCobrarClientesPorRegion));	
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemActualizarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesPorRegion && this.isPermisoActualizarCobrarClientesPorRegion));	
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemEliminarCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesPorRegion && this.isPermisoEliminarCobrarClientesPorRegion));
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemCancelarCobrarClientesPorRegion.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesPorRegion);				
			}
			
			this.jMenuItemGuardarCambiosCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesPorRegion && this.isPermisoGuardarCambiosCobrarClientesPorRegion));						
			this.jMenuItemGuardarCambiosTablaCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion && this.isPermisoGuardarCambiosCobrarClientesPorRegion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarClientesPorRegion=this.jButtonNuevoCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarClientesPorRegion=this.jButtonDuplicarCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaCopiarCobrarClientesPorRegion=this.jButtonCopiarCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaVerFormCobrarClientesPorRegion=this.jButtonVerFormCobrarClientesPorRegion.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarClientesPorRegion=this.jButtonAbrirOrderByCobrarClientesPorRegion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=this.jButtonNuevoRelacionesCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaModificarCobrarClientesPorRegion=this.jButtonModificarCobrarClientesPorRegion.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
			this.isVisibilidadCeldaActualizarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonActualizarCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonEliminarCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonCancelarCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonGuardarCambiosCobrarClientesPorRegion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=this.jButtonGuardarCambiosTablaCobrarClientesPorRegion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarClientesPorRegion=this.jButtonNuevoToolBarCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=this.jButtonNuevoRelacionesToolBarCobrarClientesPorRegion.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
			this.isVisibilidadCeldaModificarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonModificarToolBarCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaActualizarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonActualizarToolBarCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonEliminarToolBarCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonCancelarToolBarCobrarClientesPorRegion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=this.jButtonGuardarCambiosToolBarCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=this.jButtonGuardarCambiosTablaToolBarCobrarClientesPorRegion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarClientesPorRegion=this.jMenuItemNuevoCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=this.jMenuItemNuevoRelacionesCobrarClientesPorRegion.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
			this.isVisibilidadCeldaModificarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemModificarCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaActualizarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemActualizarCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemEliminarCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesPorRegion=this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemCancelarCobrarClientesPorRegion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=this.jMenuItemGuardarCambiosCobrarClientesPorRegion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=this.jMenuItemGuardarCambiosTablaCobrarClientesPorRegion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarClientesPorRegion(Boolean esInicializar) {
		if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobrarclientesporregionSessionBean.getConGuardarRelaciones()) {
				//if(this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarClientesPorRegion();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarClientesPorRegion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarClientesPorRegion() {
		this.jButtonNuevoCobrarClientesPorRegion.setVisible(this.isPermisoNuevoCobrarClientesPorRegion);			
		this.jButtonDuplicarCobrarClientesPorRegion.setVisible(this.isPermisoDuplicarCobrarClientesPorRegion);			
		this.jButtonCopiarCobrarClientesPorRegion.setVisible(this.isPermisoCopiarCobrarClientesPorRegion);			
		this.jButtonVerFormCobrarClientesPorRegion.setVisible(this.isPermisoVerFormCobrarClientesPorRegion);			
		
		this.jButtonAbrirOrderByCobrarClientesPorRegion.setVisible(this.isPermisoOrdenCobrarClientesPorRegion);					
		
		this.jButtonNuevoRelacionesCobrarClientesPorRegion.setVisible(this.isPermisoNuevoCobrarClientesPorRegion);			
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonModificarCobrarClientesPorRegion.setVisible(this.isPermisoActualizarCobrarClientesPorRegion);	
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonActualizarCobrarClientesPorRegion.setVisible(this.isPermisoActualizarCobrarClientesPorRegion);	
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonEliminarCobrarClientesPorRegion.setVisible(this.isPermisoEliminarCobrarClientesPorRegion);
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonCancelarCobrarClientesPorRegion.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesPorRegion);						
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonGuardarCambiosCobrarClientesPorRegion.setVisible(this.isPermisoGuardarCambiosCobrarClientesPorRegion);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarClientesPorRegion.setVisible(this.isPermisoActualizarCobrarClientesPorRegion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarClientesPorRegion() {
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonModificarCobrarClientesPorRegion.setVisible(this.isPermisoActualizarCobrarClientesPorRegion);	
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonActualizarCobrarClientesPorRegion.setVisible(this.isPermisoActualizarCobrarClientesPorRegion);	
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonEliminarCobrarClientesPorRegion.setVisible(this.isPermisoEliminarCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonCancelarCobrarClientesPorRegion.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesPorRegion);							
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonGuardarCambiosCobrarClientesPorRegion.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesPorRegion && this.isPermisoGuardarCambiosCobrarClientesPorRegion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarClientesPorRegion() {
		if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarClientesPorRegion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarClientesPorRegion() {
	}
	
	public void jTableDatosCobrarClientesPorRegionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarClientesPorRegion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrarclientesporregion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarClientesPorRegionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCobrarClientesPorRegion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesPorRegion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesPorRegion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cobrarclientesporregionLogic.getConnexion());

				if(this.cobrarclientesporregion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cobrarclientesporregion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesPorRegion=(TitledBorder)this.jScrollPanelDatosCobrarClientesPorRegion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCobrarClientesPorRegion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobrarclientesporregion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCobrarClientesPorRegionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCobrarClientesPorRegion(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesPorRegion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesPorRegion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cobrarclientesporregionLogic.getConnexion());

				if(this.cobrarclientesporregion.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cobrarclientesporregion.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesPorRegion=(TitledBorder)this.jScrollPanelDatosCobrarClientesPorRegion.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCobrarClientesPorRegion.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cobrarclientesporregion.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisCobrarClientesPorRegionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebCobrarClientesPorRegion(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesPorRegion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesPorRegion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.cobrarclientesporregionLogic.getConnexion());

				if(this.cobrarclientesporregion.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.cobrarclientesporregion.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesPorRegion=(TitledBorder)this.jScrollPanelDatosCobrarClientesPorRegion.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderCobrarClientesPorRegion.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.cobrarclientesporregion.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_regionCobrarClientesPorRegionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoregion=true;

			idTienePermisoregion=this.tienePermisosUsuarioEnPaginaWebCobrarClientesPorRegion(RegionConstantesFunciones.CLASSNAME);

			if(idTienePermisoregion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesPorRegion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesPorRegion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);

				this.regionBeanSwingJInternalFrame=new RegionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.regionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.regionBeanSwingJInternalFrame.getRegionLogic().setConnexion(this.cobrarclientesporregionLogic.getConnexion());

				if(this.cobrarclientesporregion.getid_region()!=null) {
					this.regionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.regionBeanSwingJInternalFrame.setIdActual(this.cobrarclientesporregion.getid_region());
					this.regionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.regionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.regionBeanSwingJInternalFrame.inicializarActualizarBindingTablaRegion();
				}

				JInternalFrameBase jinternalFrame =this.regionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesPorRegion=(TitledBorder)this.jScrollPanelDatosCobrarClientesPorRegion.getBorder();
				TitledBorder titledBorderregion=(TitledBorder)this.regionBeanSwingJInternalFrame.jScrollPanelDatosRegion.getBorder();

				titledBorderregion.setTitle(titledBorderCobrarClientesPorRegion.getTitle() + " -> Region");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_regionCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getid_region()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_region = "+this.cobrarclientesporregion.getid_region().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_provinciaCobrarClientesPorRegionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoprovincia=true;

			idTienePermisoprovincia=this.tienePermisosUsuarioEnPaginaWebCobrarClientesPorRegion(ProvinciaConstantesFunciones.CLASSNAME);

			if(idTienePermisoprovincia) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesPorRegion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesPorRegion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);

				this.provinciaBeanSwingJInternalFrame=new ProvinciaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.provinciaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.provinciaBeanSwingJInternalFrame.getProvinciaLogic().setConnexion(this.cobrarclientesporregionLogic.getConnexion());

				if(this.cobrarclientesporregion.getid_provincia()!=null) {
					this.provinciaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.provinciaBeanSwingJInternalFrame.setIdActual(this.cobrarclientesporregion.getid_provincia());
					this.provinciaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvincia();
				}

				JInternalFrameBase jinternalFrame =this.provinciaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesPorRegion=(TitledBorder)this.jScrollPanelDatosCobrarClientesPorRegion.getBorder();
				TitledBorder titledBorderprovincia=(TitledBorder)this.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.getBorder();

				titledBorderprovincia.setTitle(titledBorderCobrarClientesPorRegion.getTitle() + " -> Provincia");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_provinciaCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getid_provincia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_provincia = "+this.cobrarclientesporregion.getid_provincia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadCobrarClientesPorRegionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebCobrarClientesPorRegion(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesPorRegion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesPorRegion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.cobrarclientesporregionLogic.getConnexion());

				if(this.cobrarclientesporregion.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.cobrarclientesporregion.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesPorRegion=(TitledBorder)this.jScrollPanelDatosCobrarClientesPorRegion.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderCobrarClientesPorRegion.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.cobrarclientesporregion.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_regionCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getnombre_region()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_region like '%"+this.cobrarclientesporregion.getnombre_region()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_provinciaCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getnombre_provincia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_provincia like '%"+this.cobrarclientesporregion.getnombre_provincia()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_ciudadCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getnombre_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_ciudad like '%"+this.cobrarclientesporregion.getnombre_ciudad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_zonaCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getnombre_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_zona like '%"+this.cobrarclientesporregion.getnombre_zona()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_rutaCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getnombre_ruta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_ruta like '%"+this.cobrarclientesporregion.getnombre_ruta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_vendedorCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getnombre_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_vendedor like '%"+this.cobrarclientesporregion.getnombre_vendedor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cobrarclientesporregion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cobrarclientesporregion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidoCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getapellido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido like '%"+this.cobrarclientesporregion.getapellido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccion_direccionCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.getdireccion_direccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion_direccion like '%"+this.cobrarclientesporregion.getdireccion_direccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefono_telefonoCobrarClientesPorRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.getcobrarclientesporregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesporregion==null) {
						this.cobrarclientesporregion = new CobrarClientesPorRegion();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);
				}

				if(this.cobrarclientesporregion.gettelefono_telefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono_telefono like '%"+this.cobrarclientesporregion.gettelefono_telefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesPorRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarClientesPorRegionCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);

			this.getCobrarClientesPorRegionsBusquedaCobrarClientesPorRegion();

			this.inicializarActualizarBindingCobrarClientesPorRegion(false);

			//if(CobrarClientesPorRegionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCiudadCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);

			this.getCobrarClientesPorRegionsFK_IdCiudad();

			this.inicializarActualizarBindingCobrarClientesPorRegion(false);

			//if(CobrarClientesPorRegionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);

			this.getCobrarClientesPorRegionsFK_IdEmpresa();

			this.inicializarActualizarBindingCobrarClientesPorRegion(false);

			//if(CobrarClientesPorRegionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);

			this.getCobrarClientesPorRegionsFK_IdPais();

			this.inicializarActualizarBindingCobrarClientesPorRegion(false);

			//if(CobrarClientesPorRegionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProvinciaCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);

			this.getCobrarClientesPorRegionsFK_IdProvincia();

			this.inicializarActualizarBindingCobrarClientesPorRegion(false);

			//if(CobrarClientesPorRegionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRegionCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);

			this.getCobrarClientesPorRegionsFK_IdRegion();

			this.inicializarActualizarBindingCobrarClientesPorRegion(false);

			//if(CobrarClientesPorRegionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCobrarClientesPorRegionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);

			this.getCobrarClientesPorRegionsFK_IdSucursal();

			this.inicializarActualizarBindingCobrarClientesPorRegion(false);

			//if(CobrarClientesPorRegionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesporregionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarClientesPorRegion() {
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.dispose();
			this.jInternalFrameDetalleFormCobrarClientesPorRegion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion!=null) {
			this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.dispose();
			this.jInternalFrameReporteDinamicoCobrarClientesPorRegion=null;
		}
		
		if(this.jInternalFrameImportacionCobrarClientesPorRegion!=null) {
			this.jInternalFrameImportacionCobrarClientesPorRegion.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarClientesPorRegion.dispose();
			this.jInternalFrameImportacionCobrarClientesPorRegion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarClientesPorRegion();
			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarClientesPorRegion")) {
				jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarClientesPorRegion")) {
				jButtonDuplicarCobrarClientesPorRegionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarClientesPorRegion")) {
				jButtonCopiarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarClientesPorRegion")) {
				jButtonVerFormCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarClientesPorRegion")) {
				jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarClientesPorRegion")) {
				jButtonDuplicarCobrarClientesPorRegionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarClientesPorRegion")) {
				jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarClientesPorRegion")) {
				jButtonDuplicarCobrarClientesPorRegionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarClientesPorRegion")) {
				jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarClientesPorRegion")) {
				jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarClientesPorRegion")) {
				jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarClientesPorRegion")) {
				jButtonModificarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarClientesPorRegion")) {
				jButtonModificarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarClientesPorRegion")) {
				jButtonModificarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarClientesPorRegion")) {
				jButtonActualizarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarClientesPorRegion")) {
				jButtonActualizarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarClientesPorRegion")) {
				jButtonActualizarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarClientesPorRegion")) {
				jButtonEliminarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarClientesPorRegion")) {
				jButtonEliminarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarClientesPorRegion")) {
				jButtonEliminarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarClientesPorRegion")) {
				jButtonCancelarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarClientesPorRegion")) {
				jButtonCancelarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarClientesPorRegion")) {
				jButtonCancelarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarClientesPorRegion")) {
				jButtonCerrarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarClientesPorRegion")) {
				jButtonCerrarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarClientesPorRegion")) {
				jButtonCerrarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarClientesPorRegion")) {
				jButtonMostrarOcultarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarClientesPorRegion")) {
				jButtonCancelarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarClientesPorRegion")) {
				jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarClientesPorRegion")) {
				jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarClientesPorRegion")) {
				jButtonCopiarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarClientesPorRegion")) {
				jButtonVerFormCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarClientesPorRegion")) {
				jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarClientesPorRegion")) {
				jButtonCopiarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarClientesPorRegion")) {
				jButtonVerFormCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarClientesPorRegion")) {
				jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarClientesPorRegion")) {
				jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarClientesPorRegion")) {
				jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarClientesPorRegion")) {
				jButtonRecargarInformacionCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarClientesPorRegion")) {
				jButtonRecargarInformacionCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarClientesPorRegion")) {
				jButtonRecargarInformacionCobrarClientesPorRegionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarClientesPorRegion")) {
				jButtonAnterioresCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarClientesPorRegion")) {
				jButtonAnterioresCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarClientesPorRegion")) {
				jButtonAnterioresCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarClientesPorRegion")) {
				jButtonSiguientesCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarClientesPorRegion")) {
				jButtonSiguientesCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarClientesPorRegion")) {
				jButtonSiguientesCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarClientesPorRegion") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarClientesPorRegion")) {
				jButtonAbrirOrderByCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarClientesPorRegion") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarClientesPorRegion")) {
				jButtonMostrarOcultarCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarClientesPorRegion")) {
				jButtonNuevoGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarClientesPorRegion")) {
				jButtonNuevoGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarClientesPorRegion")) {
				jButtonNuevoGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarClientesPorRegion")) {
				jButtonCerrarReporteDinamicoCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarClientesPorRegion")) {
				jButtonGenerarReporteDinamicoCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarClientesPorRegion")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarClientesPorRegionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarClientesPorRegion")) {
				jButtonCerrarImportacionCobrarClientesPorRegionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarClientesPorRegion")) {
				
				jButtonGenerarImportacionCobrarClientesPorRegionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarClientesPorRegion")) {
				
				jButtonAbrirImportacionCobrarClientesPorRegionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarClientesPorRegion")) {
				jComboBoxTiposAccionesCobrarClientesPorRegionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarClientesPorRegion")) {
				jComboBoxTiposRelacionesCobrarClientesPorRegionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarClientesPorRegion")) {
				jComboBoxTiposAccionesCobrarClientesPorRegionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarClientesPorRegion")) {
				
				jComboBoxTiposSeleccionarCobrarClientesPorRegionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarClientesPorRegion")) {
				jTextFieldValorCampoGeneralCobrarClientesPorRegionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarClientesPorRegion")) {
				jButtonAbrirOrderByCobrarClientesPorRegionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarClientesPorRegion")) {
				jButtonAbrirOrderByCobrarClientesPorRegionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarClientesPorRegion")) {
				jButtonCerrarOrderByCobrarClientesPorRegionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarClientesPorRegionBusqueda")) {
				this.jButtonidCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesPorRegionUpdate")) {
				this.jButtonid_empresaCobrarClientesPorRegionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesPorRegionBusqueda")) {
				this.jButtonid_empresaCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesPorRegionUpdate")) {
				this.jButtonid_sucursalCobrarClientesPorRegionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesPorRegionBusqueda")) {
				this.jButtonid_sucursalCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisCobrarClientesPorRegionUpdate")) {
				this.jButtonid_paisCobrarClientesPorRegionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisCobrarClientesPorRegionBusqueda")) {
				this.jButtonid_paisCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_regionCobrarClientesPorRegionUpdate")) {
				this.jButtonid_regionCobrarClientesPorRegionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_regionCobrarClientesPorRegionBusqueda")) {
				this.jButtonid_regionCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaCobrarClientesPorRegionUpdate")) {
				this.jButtonid_provinciaCobrarClientesPorRegionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaCobrarClientesPorRegionBusqueda")) {
				this.jButtonid_provinciaCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadCobrarClientesPorRegionUpdate")) {
				this.jButtonid_ciudadCobrarClientesPorRegionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadCobrarClientesPorRegionBusqueda")) {
				this.jButtonid_ciudadCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_regionCobrarClientesPorRegionBusqueda")) {
				this.jButtonnombre_regionCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_provinciaCobrarClientesPorRegionBusqueda")) {
				this.jButtonnombre_provinciaCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadCobrarClientesPorRegionBusqueda")) {
				this.jButtonnombre_ciudadCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaCobrarClientesPorRegionBusqueda")) {
				this.jButtonnombre_zonaCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_rutaCobrarClientesPorRegionBusqueda")) {
				this.jButtonnombre_rutaCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorCobrarClientesPorRegionBusqueda")) {
				this.jButtonnombre_vendedorCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarClientesPorRegionBusqueda")) {
				this.jButtoncodigoCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCobrarClientesPorRegionBusqueda")) {
				this.jButtonnombreCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoCobrarClientesPorRegionBusqueda")) {
				this.jButtonapellidoCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_direccionCobrarClientesPorRegionBusqueda")) {
				this.jButtondireccion_direccionCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_telefonoCobrarClientesPorRegionBusqueda")) {
				this.jButtontelefono_telefonoCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarClientesPorRegionCobrarClientesPorRegion")) {
				this.jButtonBusquedaCobrarClientesPorRegionCobrarClientesPorRegionActionPerformed(evt);
			}
			
			;
			
			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarClientesPorRegion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesPorRegionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				


				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesPorRegion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesPorRegion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarClientesPorRegion cobrarclientesporregionLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobrarclientesporregionLocal=this.cobrarclientesporregion;
			} else {
				cobrarclientesporregionLocal=this.cobrarclientesporregionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
							
				
				


				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesPorRegion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesPorRegion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesPorRegionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionAnterior =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesporregionAnterior =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			
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
			
			


			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesPorRegionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
								
						
				


				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesPorRegion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesPorRegion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
								
				
				


				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesPorRegion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesPorRegion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesPorRegionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionAnterior =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesporregionAnterior =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesPorRegionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionAnterior =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesporregionAnterior =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesPorRegionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
							
				
				


				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesPorRegion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesPorRegion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesPorRegionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregionAnterior =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarclientesporregionAnterior =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			
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
			
			


			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesPorRegionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
								
				
				


				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesPorRegion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesPorRegion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesPorRegionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionAnterior =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesporregionAnterior =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesPorRegionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesPorRegionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarClientesPorRegion")) {
					jCheckBoxSeleccionarTodosCobrarClientesPorRegionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarClientesPorRegion")) {
					jCheckBoxSeleccionadosCobrarClientesPorRegionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarClientesPorRegion")) {
					
				}
				
				


				
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesPorRegion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesPorRegion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
												
				
				


				
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesPorRegion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesPorRegion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesPorRegionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesporregionAnterior =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarclientesporregionAnterior =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesPorRegionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
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
			
			


			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesPorRegionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesPorRegion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesPorRegion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesporregion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesporregion);
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
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
				
				


				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesPorRegion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesPorRegion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesPorRegionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesporregionAnterior =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesporregionAnterior =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarClientesPorRegion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarClientesPorRegionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarClientesPorRegion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrarclientesporregion =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrarclientesporregion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarClientesPorRegion")) {
				
				}
				
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarClientesPorRegion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarClientesPorRegion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarClientesPorRegion")) {
			
			}
			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarClientesPorRegion();
			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarClientesPorRegion")) {
				jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarClientesPorRegion")) {
				jButtonDuplicarCobrarClientesPorRegionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarClientesPorRegion")) {
				jButtonCopiarCobrarClientesPorRegionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarClientesPorRegion")) {
				jButtonVerFormCobrarClientesPorRegionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarClientesPorRegion")) {
				jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarClientesPorRegion")) {
				jButtonModificarCobrarClientesPorRegionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarClientesPorRegion")) {
				jButtonActualizarCobrarClientesPorRegionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarClientesPorRegion")) {
				jButtonEliminarCobrarClientesPorRegionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarClientesPorRegion")) {
				jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarClientesPorRegion")) {
				jButtonCancelarCobrarClientesPorRegionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarClientesPorRegion")) {
				jButtonCerrarCobrarClientesPorRegionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarClientesPorRegion")) {
				jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarClientesPorRegion")) {
				jButtonNuevoGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarClientesPorRegion")) {
				jButtonAbrirOrderByCobrarClientesPorRegionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarClientesPorRegion")) {
				jButtonRecargarInformacionCobrarClientesPorRegionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarClientesPorRegion")) {
				jButtonAnterioresCobrarClientesPorRegionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarClientesPorRegion")) {
				jButtonSiguientesCobrarClientesPorRegionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarClientesPorRegionBusqueda")) {
				this.jButtonidCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesPorRegionUpdate")) {
				this.jButtonid_empresaCobrarClientesPorRegionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesPorRegionBusqueda")) {
				this.jButtonid_empresaCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesPorRegionUpdate")) {
				this.jButtonid_sucursalCobrarClientesPorRegionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesPorRegionBusqueda")) {
				this.jButtonid_sucursalCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisCobrarClientesPorRegionUpdate")) {
				this.jButtonid_paisCobrarClientesPorRegionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisCobrarClientesPorRegionBusqueda")) {
				this.jButtonid_paisCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_regionCobrarClientesPorRegionUpdate")) {
				this.jButtonid_regionCobrarClientesPorRegionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_regionCobrarClientesPorRegionBusqueda")) {
				this.jButtonid_regionCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaCobrarClientesPorRegionUpdate")) {
				this.jButtonid_provinciaCobrarClientesPorRegionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaCobrarClientesPorRegionBusqueda")) {
				this.jButtonid_provinciaCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadCobrarClientesPorRegionUpdate")) {
				this.jButtonid_ciudadCobrarClientesPorRegionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadCobrarClientesPorRegionBusqueda")) {
				this.jButtonid_ciudadCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_regionCobrarClientesPorRegionBusqueda")) {
				this.jButtonnombre_regionCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_provinciaCobrarClientesPorRegionBusqueda")) {
				this.jButtonnombre_provinciaCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_ciudadCobrarClientesPorRegionBusqueda")) {
				this.jButtonnombre_ciudadCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_zonaCobrarClientesPorRegionBusqueda")) {
				this.jButtonnombre_zonaCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_rutaCobrarClientesPorRegionBusqueda")) {
				this.jButtonnombre_rutaCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorCobrarClientesPorRegionBusqueda")) {
				this.jButtonnombre_vendedorCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarClientesPorRegionBusqueda")) {
				this.jButtoncodigoCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCobrarClientesPorRegionBusqueda")) {
				this.jButtonnombreCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoCobrarClientesPorRegionBusqueda")) {
				this.jButtonapellidoCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_direccionCobrarClientesPorRegionBusqueda")) {
				this.jButtondireccion_direccionCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_telefonoCobrarClientesPorRegionBusqueda")) {
				this.jButtontelefono_telefonoCobrarClientesPorRegionBusquedaActionPerformed(evt);
			}
			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarClientesPorRegion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarClientesPorRegion")) {
				closingInternalFrameCobrarClientesPorRegion();
				
			} else if(sTipo.equals("jButtonCancelarCobrarClientesPorRegion")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarClientesPorRegion = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarClientesPorRegionBeanSwingJInternalFrame jInternalFrameParent=(CobrarClientesPorRegionBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarClientesPorRegion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarClientesPorRegionActionPerformed(null);
			}
			
			CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarclientesporregion,new Object(),this.cobrarclientesporregionParameterGeneral,this.cobrarclientesporregionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarClientesPorRegion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarClientesPorRegion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarClientesPorRegion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrarclientesporregion)) {
			if(!esControlTabla) {
				if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);			
				}
				
				if(this.cobrarclientesporregionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarClientesPorRegion(this.cobrarclientesporregionReturnGeneral,this.cobrarclientesporregionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobrarclientesporregionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarClientesPorRegion(classes,this.cobrarclientesporregionReturnGeneral,this.cobrarclientesporregionBean,false);
					}
						
					if(this.cobrarclientesporregionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesPorRegion(this.cobrarclientesporregionReturnGeneral.getCobrarClientesPorRegion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarClientesPorRegion(this.cobrarclientesporregionReturnGeneral.getCobrarClientesPorRegion());	
					}
						
					if(this.cobrarclientesporregionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesPorRegion(this.cobrarclientesporregionReturnGeneral.getCobrarClientesPorRegion(),classes);//this.cobrarclientesporregionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesPorRegion(this.cobrarclientesporregion,classes);//this.cobrarclientesporregionBean);									
				}
			
				if(CobrarClientesPorRegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarClientesPorRegion(this.cobrarclientesporregion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesPorRegion(this.cobrarclientesporregion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobrarclientesporregionAnterior!=null) {
						this.cobrarclientesporregion=this.cobrarclientesporregionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobrarclientesporregionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobrarclientesporregionReturnGeneral.getCobrarClientesPorRegion(),cobrarclientesporregionLogic.getCobrarClientesPorRegions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobrarclientesporregionReturnGeneral.getCobrarClientesPorRegion(),this.cobrarclientesporregions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarClientesPorRegion.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarClientesPorRegion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarClientesPorRegion();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarClientesPorRegion() throws Exception {
		
		CobrarClientesPorRegionModel cobrarclientesporregionModel=(CobrarClientesPorRegionModel)this.jTableDatosCobrarClientesPorRegion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientesporregionModel.cobrarclientesporregions=this.cobrarclientesporregionLogic.getCobrarClientesPorRegions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobrarclientesporregionModel.cobrarclientesporregions=this.cobrarclientesporregions;
		}
		
		
		((CobrarClientesPorRegionModel) this.jTableDatosCobrarClientesPorRegion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarClientesPorRegion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobrarclientesporregionAnterior(),this.cobrarclientesporregionLogic.getCobrarClientesPorRegions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobrarclientesporregionAnterior(),this.cobrarclientesporregions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarClientesPorRegion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
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
										
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarclientesporregion,new Object(),generalEntityParameterGeneral,this.cobrarclientesporregionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobrarclientesporregionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarClientesPorRegionConstantesFunciones.getClassesRelationshipsOfCobrarClientesPorRegion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarClientesPorRegionConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarClientesPorRegion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarClientesPorRegion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarclientesporregion,new Object(),generalEntityParameterGeneral,this.cobrarclientesporregionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarClientesPorRegion(CobrarClientesPorRegionBean cobrarclientesporregionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarClientesPorRegion(ArrayList<Classe> classes,CobrarClientesPorRegionReturnGeneral cobrarclientesporregionReturnGeneral,CobrarClientesPorRegionBean cobrarclientesporregionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrarclientesporregion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion = new CobrarClientesPorRegionDetalleFormJInternalFrame(jDesktopPane,this.cobrarclientesporregionSessionBean.getConGuardarRelaciones(),this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.setVisible(false);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.cobrarclientesporregionLogic=this.cobrarclientesporregionLogic;
		
		this.cargarCombosFrameForeignKeyCobrarClientesPorRegion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarClientesPorRegion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarClientesPorRegion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarClientesPorRegion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarClientesPorRegion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarClientesPorRegion"));
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonModificarCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"ModificarCobrarClientesPorRegion"));

		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonModificarToolBarCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarClientesPorRegion"));
					
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemModificarCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarClientesPorRegion"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonActualizarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"ActualizarCobrarClientesPorRegion"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonActualizarToolBarCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarClientesPorRegion"));
						
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemActualizarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarClientesPorRegion"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonEliminarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"EliminarCobrarClientesPorRegion"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonEliminarToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarClientesPorRegion"));
								
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemEliminarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarClientesPorRegion"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonCancelarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"CancelarCobrarClientesPorRegion"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonCancelarToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarClientesPorRegion"));
					
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemCancelarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarClientesPorRegion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemDetalleCerrarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarClientesPorRegion"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonGuardarCambiosToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesPorRegion"));
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonGuardarCambiosToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesPorRegion"));
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarClientesPorRegion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonidCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_empresaCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_empresaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_sucursalCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_sucursalCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_paisCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_paisCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_paisCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_paisCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_regionCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_regionCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_regionCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_regionCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_provinciaCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_provinciaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_ciudadCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_ciudadCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_regionCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_regionCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_provinciaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_provinciaCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_ciudadCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_zonaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_rutaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_rutaCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_vendedorCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtoncodigoCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombreCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonapellidoCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtondireccion_direccionCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtontelefono_telefonoCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarClientesPorRegionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTabbedPaneRelacionesCobrarClientesPorRegion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarClientesPorRegion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarClientesPorRegion"));
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarClientesPorRegion"));
		}
		
		this.jTableDatosCobrarClientesPorRegion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarClientesPorRegion"));
		
		this.jTableDatosCobrarClientesPorRegion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarClientesPorRegion"));
		
		this.jButtonNuevoCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"NuevoCobrarClientesPorRegion"));
		
		this.jButtonDuplicarCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"DuplicarCobrarClientesPorRegion"));
		
		this.jButtonCopiarCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"CopiarCobrarClientesPorRegion"));
		
		this.jButtonVerFormCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"VerFormCobrarClientesPorRegion"));
		
		
		this.jButtonNuevoToolBarCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarClientesPorRegion"));
			
		this.jButtonDuplicarToolBarCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarClientesPorRegion"));
			
		this.jMenuItemNuevoCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarClientesPorRegion"));
			
		this.jMenuItemDuplicarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarClientesPorRegion"));		
		
		
		this.jButtonNuevoRelacionesCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarClientesPorRegion"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarClientesPorRegion"));
			
		this.jMenuItemNuevoRelacionesCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarClientesPorRegion"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonModificarCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"ModificarCobrarClientesPorRegion"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonModificarToolBarCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarClientesPorRegion"));
			
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemModificarCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarClientesPorRegion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonActualizarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"ActualizarCobrarClientesPorRegion"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonActualizarToolBarCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarClientesPorRegion"));
				
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemActualizarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarClientesPorRegion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonEliminarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"EliminarCobrarClientesPorRegion"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonEliminarToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarClientesPorRegion"));
						
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemEliminarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarClientesPorRegion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonCancelarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"CancelarCobrarClientesPorRegion"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonCancelarToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarClientesPorRegion"));
			
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemCancelarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarClientesPorRegion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarClientesPorRegion"));		
		
		
		this.jButtonCerrarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"CerrarCobrarClientesPorRegion"));
		
		
		this.jButtonCerrarToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarClientesPorRegion"));
			
		this.jMenuItemCerrarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarClientesPorRegion"));
			
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jMenuItemDetalleCerrarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarClientesPorRegion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonGuardarCambiosCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarClientesPorRegion"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonGuardarCambiosToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesPorRegion"));
		}
		
		this.jButtonCopiarToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarClientesPorRegion"));
			
		this.jButtonVerFormToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarClientesPorRegion"));
		
		this.jMenuItemGuardarCambiosCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarClientesPorRegion"));
			
		this.jMenuItemCopiarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarClientesPorRegion"));		
		
		this.jMenuItemVerFormCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarClientesPorRegion"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarClientesPorRegion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarClientesPorRegion"));
			
		this.jMenuItemGuardarCambiosTablaCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarClientesPorRegion"));		
		
		
		
		this.jButtonRecargarInformacionCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarClientesPorRegion"));
					
		this.jButtonRecargarInformacionToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarClientesPorRegion"));
		
		this.jMenuItemRecargarInformacionCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarClientesPorRegion"));		
		
		
		
		this.jButtonAnterioresCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"AnterioresCobrarClientesPorRegion"));
		
		
		this.jButtonAnterioresToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarClientesPorRegion"));
		
		this.jMenuItemAnterioresCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarClientesPorRegion"));		
		
		
		this.jButtonSiguientesCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"SiguientesCobrarClientesPorRegion"));
		
		
		this.jButtonSiguientesToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarClientesPorRegion"));
			
		this.jMenuItemSiguientesCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarClientesPorRegion"));
			
		this.jMenuItemAbrirOrderByCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarClientesPorRegion"));
			
		this.jMenuItemMostrarOcultarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarClientesPorRegion"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarClientesPorRegion"));
			
		this.jMenuItemDetalleMostarOcultarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarClientesPorRegion"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarClientesPorRegion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarClientesPorRegion"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarClientesPorRegion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarClientesPorRegion"));

		this.jCheckBoxSeleccionadosCobrarClientesPorRegion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarClientesPorRegion"));
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarClientesPorRegion"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarClientesPorRegion"));
			
		this.jComboBoxTiposAccionesCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarClientesPorRegion"));
					
		this.jComboBoxTiposSeleccionarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarClientesPorRegion"));
			
		this.jTextFieldValorCampoGeneralCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarClientesPorRegion"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonidCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_empresaCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_empresaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_sucursalCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_sucursalCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_paisCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_paisCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_paisCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_paisCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_regionCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_regionCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_regionCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_regionCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_provinciaCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_provinciaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_ciudadCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_ciudadCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_regionCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_regionCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_provinciaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_provinciaCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_ciudadCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_zonaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_rutaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_rutaCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_vendedorCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtoncodigoCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombreCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonapellidoCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtondireccion_direccionCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtontelefono_telefonoCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarClientesPorRegionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"BusquedaCobrarClientesPorRegionCobrarClientesPorRegion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesPorRegion!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesPorRegion"));
				this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesPorRegion"));
				this.jInternalFrameReporteDinamicoCobrarClientesPorRegion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesPorRegion"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesPorRegion"));				
			//this.jButtonGenerarReporteDinamicoCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesPorRegion"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesPorRegion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarClientesPorRegion!=null) {
				this.jInternalFrameImportacionCobrarClientesPorRegion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarClientesPorRegion"));
				this.jInternalFrameImportacionCobrarClientesPorRegion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarClientesPorRegion"));
				this.jInternalFrameImportacionCobrarClientesPorRegion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarClientesPorRegion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarClientesPorRegion"));
			
			this.jButtonAbrirOrderByToolBarCobrarClientesPorRegion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarClientesPorRegion"));			
			
			if(this.jInternalFrameOrderByCobrarClientesPorRegion!=null) {
				this.jInternalFrameOrderByCobrarClientesPorRegion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarClientesPorRegion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTabbedPaneRelacionesCobrarClientesPorRegion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarClientesPorRegion"));
		
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
            		closingInternalFrameCobrarClientesPorRegion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarClientesPorRegion = (JInternalFrameBase)event.getSource();
	            	
	            CobrarClientesPorRegionBeanSwingJInternalFrame jInternalFrameParent=(CobrarClientesPorRegionBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarClientesPorRegion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarClientesPorRegionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarClientesPorRegion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarClientesPorRegionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarClientesPorRegion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarClientesPorRegion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarClientesPorRegion";
		inputMap = this.jButtonNuevoCobrarClientesPorRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarClientesPorRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarClientesPorRegion";
		inputMap = this.jButtonNuevoRelacionesCobrarClientesPorRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarClientesPorRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarClientesPorRegionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarClientesPorRegion";
		inputMap = this.jButtonModificarCobrarClientesPorRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarClientesPorRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarClientesPorRegionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarClientesPorRegion";
		inputMap = this.jButtonActualizarCobrarClientesPorRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarClientesPorRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarClientesPorRegionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarClientesPorRegion";
		inputMap = this.jButtonEliminarCobrarClientesPorRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarClientesPorRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarClientesPorRegionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarClientesPorRegion";
		inputMap = this.jButtonCancelarCobrarClientesPorRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarClientesPorRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarClientesPorRegionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarClientesPorRegion";
		inputMap = this.jButtonCerrarCobrarClientesPorRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarClientesPorRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarClientesPorRegionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonGuardarCambiosCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarClientesPorRegion";
		inputMap = this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonGuardarCambiosCobrarClientesPorRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonGuardarCambiosCobrarClientesPorRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarClientesPorRegion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarClientesPorRegionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarClientesPorRegion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarClientesPorRegionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarClientesPorRegion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarClientesPorRegionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarClientesPorRegion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarClientesPorRegionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonidCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_empresaCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_empresaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_sucursalCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_sucursalCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_paisCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_paisCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_paisCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_paisCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_regionCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_regionCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_regionCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_regionCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_provinciaCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_provinciaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaCobrarClientesPorRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_ciudadCobrarClientesPorRegionUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarClientesPorRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonid_ciudadCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_regionCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_regionCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_provinciaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_provinciaCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_ciudadCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_ciudadCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_zonaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_zonaCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_rutaCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_rutaCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombre_vendedorCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtoncodigoCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonnombreCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtonapellidoCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtondireccion_direccionCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"direccion_direccionCobrarClientesPorRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jButtontelefono_telefonoCobrarClientesPorRegionBusqueda.addActionListener(new ButtonActionListener(this,"telefono_telefonoCobrarClientesPorRegionBusqueda"));
		
		
		this.jButtonBusquedaCobrarClientesPorRegionCobrarClientesPorRegion.addActionListener(new ButtonActionListener(this,"BusquedaCobrarClientesPorRegionCobrarClientesPorRegion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarClientesPorRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarClientesPorRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarClientesPorRegionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarClientesPorRegion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarClientesPorRegion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarClientesPorRegion cobrarclientesporregionAux:this.cobrarclientesporregionLogic.getCobrarClientesPorRegions()) {
					cobrarclientesporregionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesPorRegion cobrarclientesporregionAux:cobrarclientesporregions) {
					cobrarclientesporregionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarClientesPorRegionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarClientesPorRegion cobrarclientesporregionAux:this.cobrarclientesporregionLogic.getCobrarClientesPorRegions()) {
						cobrarclientesporregionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesPorRegion cobrarclientesporregionAux:cobrarclientesporregions) {
						cobrarclientesporregionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarClientesPorRegion cobrarclientesporregionAux:this.cobrarclientesporregionLogic.getCobrarClientesPorRegions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesPorRegion cobrarclientesporregionAux:cobrarclientesporregions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarClientesPorRegion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarClientesPorRegion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarClientesPorRegionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarClientesPorRegion.getSelectedRows();
			
			CobrarClientesPorRegion cobrarclientesporregionLocal=new CobrarClientesPorRegion();
			
			//this.seleccionarTodosCobrarClientesPorRegion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobrarclientesporregionLocal =(CobrarClientesPorRegion) this.cobrarclientesporregionLogic.getCobrarClientesPorRegions().toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobrarclientesporregionLocal =(CobrarClientesPorRegion) this.cobrarclientesporregions.toArray()[this.jTableDatosCobrarClientesPorRegion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobrarclientesporregionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarClientesPorRegion cobrarclientesporregionAux:this.cobrarclientesporregionLogic.getCobrarClientesPorRegions()) {
						cobrarclientesporregionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesPorRegion cobrarclientesporregionAux:cobrarclientesporregions) {
						cobrarclientesporregionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarClientesPorRegion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarClientesPorRegion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesPorRegion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarClientesPorRegionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarClientesPorRegionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarClientesPorRegionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarClientesPorRegion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarClientesPorRegion cobrarclientesporregionAux:this.cobrarclientesporregionLogic.getCobrarClientesPorRegions()) {
				
						if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION)) {
							existe=true;
							cobrarclientesporregionAux.setnombre_region(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA)) {
							existe=true;
							cobrarclientesporregionAux.setnombre_provincia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							cobrarclientesporregionAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							cobrarclientesporregionAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA)) {
							existe=true;
							cobrarclientesporregionAux.setnombre_ruta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							cobrarclientesporregionAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarclientesporregionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cobrarclientesporregionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							cobrarclientesporregionAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
							existe=true;
							cobrarclientesporregionAux.setdireccion_direccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
							existe=true;
							cobrarclientesporregionAux.settelefono_telefono(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesPorRegion cobrarclientesporregionAux:cobrarclientesporregions) {
					
						if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION)) {
							existe=true;
							cobrarclientesporregionAux.setnombre_region(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA)) {
							existe=true;
							cobrarclientesporregionAux.setnombre_provincia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD)) {
							existe=true;
							cobrarclientesporregionAux.setnombre_ciudad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA)) {
							existe=true;
							cobrarclientesporregionAux.setnombre_zona(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA)) {
							existe=true;
							cobrarclientesporregionAux.setnombre_ruta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							cobrarclientesporregionAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarclientesporregionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cobrarclientesporregionAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							cobrarclientesporregionAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
							existe=true;
							cobrarclientesporregionAux.setdireccion_direccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
							existe=true;
							cobrarclientesporregionAux.settelefono_telefono(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarClientesPorRegionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarClientesPorRegion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarClientesPorRegion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarClientesPorRegion) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarClientesPorRegion(conSplash);
				
					this.generarReporteCobrarClientesPorRegionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesPorRegion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarClientesPorRegionsSeleccionados();
				//this.jComboBoxTiposAccionesCobrarClientesPorRegion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarClientesPorRegionsSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarClientesPorRegion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarClientesPorRegionsSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarClientesPorRegion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarClientesPorRegion();
				
				this.exportarCobrarClientesPorRegionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesPorRegion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarClientesPorRegions();
				//this.importarCobrarClientesPorRegions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesPorRegion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarClientesPorRegion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarClientesPorRegionsSeleccionados();
				//this.jComboBoxTiposAccionesCobrarClientesPorRegion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Clientes Por Region", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarClientesPorRegion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarClientesPorRegion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarClientesPorRegion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Clientes Por Region",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesPorRegion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarClientesPorRegionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarClientesPorRegion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarClientesPorRegion(conSplash);
					
						//this.actualizarParametrosGeneralCobrarClientesPorRegion();
						
						this.generarReporteProcesoAccionCobrarClientesPorRegionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarClientesPorRegion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Clientes Por RegionES SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Clientes Por Region", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarClientesPorRegion();
				
						this.actualizarParametrosGeneralCobrarClientesPorRegion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobrarclientesporregionReturnGeneral=cobrarclientesporregionLogic.procesarAccionCobrarClientesPorRegionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobrarclientesporregionLogic.getCobrarClientesPorRegions(),this.cobrarclientesporregionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarClientesPorRegionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarClientesPorRegion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarClientesPorRegion();
					
					CobrarClientesPorRegionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarClientesPorRegionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarClientesPorRegion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxTiposAccionesFormularioCobrarClientesPorRegion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarClientesPorRegion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarClientesPorRegionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarClientesPorRegion();
			
			if(this.jInternalFrameDetalleFormCobrarClientesPorRegion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados=new ArrayList<CobrarClientesPorRegion>();		
			CobrarClientesPorRegion cobrarclientesporregion=new CobrarClientesPorRegion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarClientesPorRegion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarClientesPorRegion.getSelectedItem();
			
			
			
			
			cobrarclientesporregionsSeleccionados=this.getCobrarClientesPorRegionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobrarclientesporregionsSeleccionados.size()==1) {
				for(CobrarClientesPorRegion cobrarclientesporregionAux:cobrarclientesporregionsSeleccionados) {
					cobrarclientesporregion=cobrarclientesporregionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarClientesPorRegion();
			
      		//this.finishProcessCobrarClientesPorRegion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarClientesPorRegionReturnGeneral() throws Exception {
		if(this.cobrarclientesporregionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobrarclientesporregionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobrarclientesporregionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobrarclientesporregionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobrarclientesporregionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobrarclientesporregionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarClientesPorRegion(false);
		}
		
		if(this.cobrarclientesporregionReturnGeneral.getConRetornoLista() || this.cobrarclientesporregionReturnGeneral.getConRetornoObjeto()) {
			if(this.cobrarclientesporregionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobrarclientesporregionLogic.setCobrarClientesPorRegions(this.cobrarclientesporregionReturnGeneral.getCobrarClientesPorRegions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarClientesPorRegion(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarClientesPorRegion() throws Exception {
		
		
	}
	
	public ArrayList<CobrarClientesPorRegion> getCobrarClientesPorRegionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados=new ArrayList<CobrarClientesPorRegion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarClientesPorRegion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarClientesPorRegion cobrarclientesporregionAux:cobrarclientesporregionLogic.getCobrarClientesPorRegions()) {
					if(cobrarclientesporregionAux.getIsSelected()) {
						cobrarclientesporregionsSeleccionados.add(cobrarclientesporregionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesPorRegion cobrarclientesporregionAux:this.cobrarclientesporregions) {
					if(cobrarclientesporregionAux.getIsSelected()) {
						cobrarclientesporregionsSeleccionados.add(cobrarclientesporregionAux);				
					}
				}
			}
			
			if(cobrarclientesporregionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobrarclientesporregionsSeleccionados.addAll(this.cobrarclientesporregionLogic.getCobrarClientesPorRegions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobrarclientesporregionsSeleccionados.addAll(this.cobrarclientesporregions);				
					}
				}
			}
		} else {
			cobrarclientesporregionsSeleccionados.add(this.cobrarclientesporregion);
		}
		
		return cobrarclientesporregionsSeleccionados;
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
	
	public void generarReporteCobrarClientesPorRegionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCobrarClientesPorRegionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarClientesPorRegionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarClientesPorRegionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarClientesPorRegionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Clientes Por Region",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarClientesPorRegionsSeleccionados() throws Exception {
		ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados=new ArrayList<CobrarClientesPorRegion>();		
		
		cobrarclientesporregionsSeleccionados=this.getCobrarClientesPorRegionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarClientesPorRegions("Todos",cobrarclientesporregionsSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarClientesPorRegionsSeleccionados() throws Exception {
		ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados=new ArrayList<CobrarClientesPorRegion>();		
		
		cobrarclientesporregionsSeleccionados=this.getCobrarClientesPorRegionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarClientesPorRegions("Todos",cobrarclientesporregionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarClientesPorRegionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados=new ArrayList<CobrarClientesPorRegion>();
		
		cobrarclientesporregionsSeleccionados=this.getCobrarClientesPorRegionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarClientesPorRegions("Todos",cobrarclientesporregionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCobrarClientesPorRegionsSeleccionados() throws Exception {
		ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados=new ArrayList<CobrarClientesPorRegion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarClientesPorRegion();
		
		
		cobrarclientesporregionsSeleccionados=this.getCobrarClientesPorRegionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarClientesPorRegion();
		
		
		//this.generarReporteCobrarClientesPorRegions("Todos",cobrarclientesporregionsSeleccionados ,cobrarclientesporregionImplementable,cobrarclientesporregionImplementableHome);
	}
	
	public void mostrarImportacionCobrarClientesPorRegions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarClientesPorRegion();
		
		this.abrirFrameImportacionCobrarClientesPorRegion();		
		
			
		//this.generarReporteCobrarClientesPorRegions("Todos",cobrarclientesporregionsSeleccionados ,cobrarclientesporregionImplementable,cobrarclientesporregionImplementableHome);
	}
	
	public void importarCobrarClientesPorRegions() throws Exception {		
	
	}
	
	public void exportarCobrarClientesPorRegionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarClientesPorRegionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarClientesPorRegionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarClientesPorRegionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Clientes Por Region",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarClientesPorRegionsSeleccionados() throws Exception {
		ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados=new ArrayList<CobrarClientesPorRegion>();		
		
		cobrarclientesporregionsSeleccionados=this.getCobrarClientesPorRegionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesporregion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarClientesPorRegion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarClientesPorRegion cobrarclientesporregionAux:cobrarclientesporregionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarClientesPorRegion(cobrarclientesporregionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobrarclientesporregionAux.setsDetalleGeneralEntityReporte(cobrarclientesporregionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Por Region",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarClientesPorRegion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_IDREGION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_IDPROVINCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrarclientesporregion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getregion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getprovincia_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getnombre_region();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getnombre_provincia();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getnombre_ciudad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getnombre_zona();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getnombre_ruta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getnombre_vendedor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getapellido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.getdireccion_direccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesporregion.gettelefono_telefono();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarClientesPorRegionsSeleccionados() throws Exception {
		ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados=new ArrayList<CobrarClientesPorRegion>();		
		
		cobrarclientesporregionsSeleccionados=this.getCobrarClientesPorRegionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesporregion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarClientesPorRegions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarClientesPorRegion(row);				
				iRow++;
			}				
			
			for(CobrarClientesPorRegion cobrarclientesporregionAux:cobrarclientesporregionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarClientesPorRegion(cobrarclientesporregionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Por Region",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarClientesPorRegionsSeleccionados() throws Exception {
		ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados=new ArrayList<CobrarClientesPorRegion>();		
		
		cobrarclientesporregionsSeleccionados=this.getCobrarClientesPorRegionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesporregion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobrarclientesporregions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrarclientesporregion");
			//elementRoot.appendChild(element);
		
			for(CobrarClientesPorRegion cobrarclientesporregionAux:cobrarclientesporregionsSeleccionados) {
				element = document.createElement("cobrarclientesporregion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarClientesPorRegion(cobrarclientesporregionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Por Region",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarClientesPorRegion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDREGION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDPROVINCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getregion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getprovincia_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getnombre_region());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getnombre_provincia());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getnombre_ciudad());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getnombre_zona());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getnombre_ruta());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getnombre_vendedor());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getapellido());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.getdireccion_direccion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesporregion.gettelefono_telefono());				
	}
	
	public void setFilaDatosExportarXmlCobrarClientesPorRegion(CobrarClientesPorRegion cobrarclientesporregion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarClientesPorRegionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrarclientesporregion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarClientesPorRegionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrarclientesporregion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CobrarClientesPorRegionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cobrarclientesporregion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CobrarClientesPorRegionConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cobrarclientesporregion.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementpais_descripcion = document.createElement(CobrarClientesPorRegionConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(cobrarclientesporregion.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementregion_descripcion = document.createElement(CobrarClientesPorRegionConstantesFunciones.IDREGION);
		elementregion_descripcion.appendChild(document.createTextNode(cobrarclientesporregion.getregion_descripcion()));
		element.appendChild(elementregion_descripcion);

		Element elementprovincia_descripcion = document.createElement(CobrarClientesPorRegionConstantesFunciones.IDPROVINCIA);
		elementprovincia_descripcion.appendChild(document.createTextNode(cobrarclientesporregion.getprovincia_descripcion()));
		element.appendChild(elementprovincia_descripcion);

		Element elementciudad_descripcion = document.createElement(CobrarClientesPorRegionConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(cobrarclientesporregion.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementnombre_region = document.createElement(CobrarClientesPorRegionConstantesFunciones.NOMBREREGION);
		elementnombre_region.appendChild(document.createTextNode(cobrarclientesporregion.getnombre_region().trim()));
		element.appendChild(elementnombre_region);

		Element elementnombre_provincia = document.createElement(CobrarClientesPorRegionConstantesFunciones.NOMBREPROVINCIA);
		elementnombre_provincia.appendChild(document.createTextNode(cobrarclientesporregion.getnombre_provincia().trim()));
		element.appendChild(elementnombre_provincia);

		Element elementnombre_ciudad = document.createElement(CobrarClientesPorRegionConstantesFunciones.NOMBRECIUDAD);
		elementnombre_ciudad.appendChild(document.createTextNode(cobrarclientesporregion.getnombre_ciudad().trim()));
		element.appendChild(elementnombre_ciudad);

		Element elementnombre_zona = document.createElement(CobrarClientesPorRegionConstantesFunciones.NOMBREZONA);
		elementnombre_zona.appendChild(document.createTextNode(cobrarclientesporregion.getnombre_zona().trim()));
		element.appendChild(elementnombre_zona);

		Element elementnombre_ruta = document.createElement(CobrarClientesPorRegionConstantesFunciones.NOMBRERUTA);
		elementnombre_ruta.appendChild(document.createTextNode(cobrarclientesporregion.getnombre_ruta().trim()));
		element.appendChild(elementnombre_ruta);

		Element elementnombre_vendedor = document.createElement(CobrarClientesPorRegionConstantesFunciones.NOMBREVENDEDOR);
		elementnombre_vendedor.appendChild(document.createTextNode(cobrarclientesporregion.getnombre_vendedor().trim()));
		element.appendChild(elementnombre_vendedor);

		Element elementcodigo = document.createElement(CobrarClientesPorRegionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cobrarclientesporregion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CobrarClientesPorRegionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cobrarclientesporregion.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementapellido = document.createElement(CobrarClientesPorRegionConstantesFunciones.APELLIDO);
		elementapellido.appendChild(document.createTextNode(cobrarclientesporregion.getapellido().trim()));
		element.appendChild(elementapellido);

		Element elementdireccion_direccion = document.createElement(CobrarClientesPorRegionConstantesFunciones.DIRECCIONDIRECCION);
		elementdireccion_direccion.appendChild(document.createTextNode(cobrarclientesporregion.getdireccion_direccion().trim()));
		element.appendChild(elementdireccion_direccion);

		Element elementtelefono_telefono = document.createElement(CobrarClientesPorRegionConstantesFunciones.TELEFONOTELEFONO);
		elementtelefono_telefono.appendChild(document.createTextNode(cobrarclientesporregion.gettelefono_telefono().trim()));
		element.appendChild(elementtelefono_telefono);
	}
	
	public void generarReporteGroupGenericoCobrarClientesPorRegionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados=new ArrayList<CobrarClientesPorRegion>();
		
		cobrarclientesporregionsSeleccionados=this.getCobrarClientesPorRegionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarClientesPorRegion(cobrarclientesporregionsSeleccionados);
		
		this.generarReporteCobrarClientesPorRegions("Todos",cobrarclientesporregionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarClientesPorRegion(ArrayList<CobrarClientesPorRegion> cobrarclientesporregionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarClientesPorRegion cobrarclientesporregionAux:cobrarclientesporregionsSeleccionados) {
				cobrarclientesporregionAux.setsDetalleGeneralEntityReporte(cobrarclientesporregionAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_IDREGION)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getregion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_IDPROVINCIA)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getprovincia_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREREGION)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getnombre_region());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREPROVINCIA)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getnombre_provincia());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRECIUDAD)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getnombre_ciudad());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREZONA)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getnombre_zona());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRERUTA)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getnombre_ruta());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getnombre_vendedor());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_APELLIDO)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getapellido());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_DIRECCIONDIRECCION)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.getdireccion_direccion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesPorRegionConstantesFunciones.LABEL_TELEFONOTELEFONO)) {
					existe=true;
					cobrarclientesporregionAux.setsDescripcionGeneralEntityReporte1(cobrarclientesporregionAux.gettelefono_telefono());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesPorRegionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarClientesPorRegion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarClientesPorRegion=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaActualizarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaEliminarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaCancelarCobrarClientesPorRegion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaModificarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaActualizarCobrarClientesPorRegion=true;
			this.isVisibilidadCeldaEliminarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaCancelarCobrarClientesPorRegion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaModificarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaActualizarCobrarClientesPorRegion=true;
			this.isVisibilidadCeldaEliminarCobrarClientesPorRegion=true;
			this.isVisibilidadCeldaCancelarCobrarClientesPorRegion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaModificarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaActualizarCobrarClientesPorRegion=true;
			this.isVisibilidadCeldaEliminarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaCancelarCobrarClientesPorRegion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarClientesPorRegion=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=true;
			this.isVisibilidadCeldaModificarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaActualizarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaEliminarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaCancelarCobrarClientesPorRegion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaActualizarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaEliminarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaCancelarCobrarClientesPorRegion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaModificarCobrarClientesPorRegion=true;
			this.isVisibilidadCeldaActualizarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaEliminarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaCancelarCobrarClientesPorRegion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarClientesPorRegionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarClientesPorRegion=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=true;
		} else {
			this.actualizarEstadoPanelsCobrarClientesPorRegion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarClientesPorRegion=false;
			//this.isVisibilidadCeldaVerFormCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaDuplicarCobrarClientesPorRegion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobrarclientesporregionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
			if(!cobrarclientesporregionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=false;												
			}
			
			this.jButtonCerrarCobrarClientesPorRegion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrarclientesporregion)) {
			this.isVisibilidadCeldaActualizarCobrarClientesPorRegion=false;
			this.isVisibilidadCeldaEliminarCobrarClientesPorRegion=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarClientesPorRegion=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarClientesPorRegion=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarClientesPorRegion=false;
		//this.isVisibilidadCeldaModificarCobrarClientesPorRegion=true;
		this.isVisibilidadCeldaActualizarCobrarClientesPorRegion=false;
		this.isVisibilidadCeldaEliminarCobrarClientesPorRegion=false;
		//this.isVisibilidadCeldaCancelarCobrarClientesPorRegion=true;			
		this.isVisibilidadCeldaGuardarCobrarClientesPorRegion=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarClientesPorRegion() {
	}
	
	public void actualizarEstadoPanelsCobrarClientesPorRegion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarClientesPorRegion!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesPorRegion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesPorRegion!=null) {
				this.jTabbedPaneBusquedasCobrarClientesPorRegion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesPorRegion!=null) {
				this.jScrollPanelDatosCobrarClientesPorRegion.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesPorRegion!=null) {
				this.jPanelPaginacionCobrarClientesPorRegion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesPorRegion!=null) {
				this.jPanelParametrosReportesCobrarClientesPorRegion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarClientesPorRegion!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesPorRegion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesPorRegion!=null) {
				this.jTabbedPaneBusquedasCobrarClientesPorRegion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarClientesPorRegion!=null) {
				this.jScrollPanelDatosCobrarClientesPorRegion.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesPorRegion!=null) {
				this.jPanelPaginacionCobrarClientesPorRegion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesPorRegion!=null) {
				this.jPanelParametrosReportesCobrarClientesPorRegion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarClientesPorRegion!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesPorRegion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesPorRegion!=null) {
				this.jTabbedPaneBusquedasCobrarClientesPorRegion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesPorRegion!=null) {
				this.jScrollPanelDatosCobrarClientesPorRegion.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesPorRegion!=null) {
				this.jPanelPaginacionCobrarClientesPorRegion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesPorRegion!=null) {
				this.jPanelParametrosReportesCobrarClientesPorRegion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarClientesPorRegion!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesPorRegion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesPorRegion!=null) {
				this.jTabbedPaneBusquedasCobrarClientesPorRegion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesPorRegion!=null) {
				this.jScrollPanelDatosCobrarClientesPorRegion.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesPorRegion!=null) {
				this.jPanelPaginacionCobrarClientesPorRegion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesPorRegion!=null) {
				this.jPanelParametrosReportesCobrarClientesPorRegion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarClientesPorRegion!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesPorRegion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesPorRegion!=null) {
				this.jTabbedPaneBusquedasCobrarClientesPorRegion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesPorRegion!=null) {
				this.jScrollPanelDatosCobrarClientesPorRegion.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesPorRegion!=null) {
				this.jPanelPaginacionCobrarClientesPorRegion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesPorRegion!=null) {
				this.jPanelParametrosReportesCobrarClientesPorRegion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarClientesPorRegion!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesPorRegion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesPorRegion!=null) {
				this.jTabbedPaneBusquedasCobrarClientesPorRegion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesPorRegion!=null) {
				this.jScrollPanelDatosCobrarClientesPorRegion.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesPorRegion!=null) {
				this.jPanelPaginacionCobrarClientesPorRegion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesPorRegion!=null) {
				this.jPanelParametrosReportesCobrarClientesPorRegion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarClientesPorRegion!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesPorRegion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesPorRegion!=null) {
				this.jTabbedPaneBusquedasCobrarClientesPorRegion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesPorRegion!=null) {
				this.jScrollPanelDatosCobrarClientesPorRegion.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesPorRegion!=null) {
				this.jPanelPaginacionCobrarClientesPorRegion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesPorRegion!=null) {
				this.jPanelParametrosReportesCobrarClientesPorRegion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarClientesPorRegion!=null) {
					this.jTabbedPaneBusquedasCobrarClientesPorRegion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarClientesPorRegion!=null) {
				this.jPanelParametrosReportesCobrarClientesPorRegion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobrarclientesporregionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesPorRegion!=null) {
				this.jTabbedPaneBusquedasCobrarClientesPorRegion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarClientesPorRegion!=null) {
				this.jPanelParametrosReportesCobrarClientesPorRegion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCobrarClientesPorRegion=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCobrarClientesPorRegion) {this.jTabbedPaneBusquedasCobrarClientesPorRegion.remove(jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaCobrarClientesPorRegion=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaCobrarClientesPorRegion) {this.jTabbedPaneBusquedasCobrarClientesPorRegion.remove(jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaCobrarClientesPorRegion=isParaPais;
			if(!this.isVisibilidadBusquedaCobrarClientesPorRegion) {this.jTabbedPaneBusquedasCobrarClientesPorRegion.remove(jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);}
		}
		
	}

	public void setVisibilidadBusquedasParaRegion(Boolean isParaRegion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRegionNegation=!isParaRegion;

			this.isVisibilidadBusquedaCobrarClientesPorRegion=isParaRegion;
			if(!this.isVisibilidadBusquedaCobrarClientesPorRegion) {this.jTabbedPaneBusquedasCobrarClientesPorRegion.remove(jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);}
		}
		
	}

	public void setVisibilidadBusquedasParaProvincia(Boolean isParaProvincia){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProvinciaNegation=!isParaProvincia;

			this.isVisibilidadBusquedaCobrarClientesPorRegion=isParaProvincia;
			if(!this.isVisibilidadBusquedaCobrarClientesPorRegion) {this.jTabbedPaneBusquedasCobrarClientesPorRegion.remove(jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadBusquedaCobrarClientesPorRegion=isParaCiudad;
			if(!this.isVisibilidadBusquedaCobrarClientesPorRegion) {this.jTabbedPaneBusquedasCobrarClientesPorRegion.remove(jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);}
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
			
			this.inicializarActualizarBindingTablaCobrarClientesPorRegion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarClientesPorRegion() {
		this.updateBorderResaltarBusquedasFormularioCobrarClientesPorRegion();
		this.updateVisibilidadBusquedasFormularioCobrarClientesPorRegion();
		this.updateHabilitarBusquedasFormularioCobrarClientesPorRegion();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarClientesPorRegion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarClientesPorRegion.getComponents().length>0) {
	

		if(this.cobrarclientesporregionConstantesFunciones.resaltarBusquedaCobrarClientesPorRegionCobrarClientesPorRegion!=null) {
			index= this.jTabbedPaneBusquedasCobrarClientesPorRegion.indexOfComponent(this.jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesPorRegion.getComponent(index);
				jPanel.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarClientesPorRegion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarClientesPorRegion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarClientesPorRegion.indexOfComponent(this.jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesPorRegion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);
			if(!this.cobrarclientesporregionConstantesFunciones.mostrarBusquedaCobrarClientesPorRegionCobrarClientesPorRegion && index>-1) {
				this.jTabbedPaneBusquedasCobrarClientesPorRegion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarClientesPorRegion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarClientesPorRegion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarClientesPorRegion.indexOfComponent(this.jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesPorRegion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);
				this.jTabbedPaneBusquedasCobrarClientesPorRegion.setEnabledAt(index,this.cobrarclientesporregionConstantesFunciones.activarBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarClientesPorRegion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarClientesPorRegion")) {
			index= this.jTabbedPaneBusquedasCobrarClientesPorRegion.indexOfComponent(this.jPanelBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);

			this.jTabbedPaneBusquedasCobrarClientesPorRegion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesPorRegion.getComponent(index);

			this.cobrarclientesporregionConstantesFunciones.setResaltarBusquedaCobrarClientesPorRegionCobrarClientesPorRegion(resaltar);

			jPanel.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarBusquedaCobrarClientesPorRegionCobrarClientesPorRegion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarClientesPorRegion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarClientesPorRegion() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarClientesPorRegion();
		this.updateVisibilidadResaltarControlesFormularioCobrarClientesPorRegion();
		this.updateHabilitarResaltarControlesFormularioCobrarClientesPorRegion();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarClientesPorRegion() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobrarclientesporregionConstantesFunciones.resaltaridCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelidCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltaridCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarid_empresaCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarid_empresaCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarid_sucursalCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarid_sucursalCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarid_paisCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarid_paisCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarid_regionCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarid_regionCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarid_provinciaCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarid_provinciaCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarid_ciudadCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarid_ciudadCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_regionCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_regionCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_regionCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_provinciaCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_provinciaCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_provinciaCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_ciudadCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_ciudadCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_ciudadCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_zonaCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldnombre_zonaCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_zonaCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_rutaCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_rutaCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_rutaCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_vendedorCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_vendedorCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarnombre_vendedorCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarcodigoCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldcodigoCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarcodigoCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarnombreCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombreCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarnombreCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltarapellidoCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreaapellidoCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltarapellidoCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltardireccion_direccionCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreadireccion_direccionCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltardireccion_direccionCobrarClientesPorRegion);}
		if(this.cobrarclientesporregionConstantesFunciones.resaltartelefono_telefonoCobrarClientesPorRegion!=null && this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreatelefono_telefonoCobrarClientesPorRegion.setBorder(this.cobrarclientesporregionConstantesFunciones.resaltartelefono_telefonoCobrarClientesPorRegion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarClientesPorRegion() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
	
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelidCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostraridCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelidCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostraridCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarid_empresaCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelid_empresaCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarid_empresaCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarid_sucursalCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelid_sucursalCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarid_sucursalCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarid_paisCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelid_paisCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarid_paisCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarid_regionCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelid_regionCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarid_regionCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarid_provinciaCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelid_provinciaCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarid_provinciaCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarid_ciudadCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelid_ciudadCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarid_ciudadCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_regionCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_regionCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelnombre_regionCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_regionCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_provinciaCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_provinciaCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelnombre_provinciaCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_provinciaCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_ciudadCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_ciudadCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelnombre_ciudadCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_ciudadCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldnombre_zonaCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_zonaCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelnombre_zonaCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_zonaCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_rutaCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_rutaCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelnombre_rutaCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_rutaCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_vendedorCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_vendedorCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelnombre_vendedorCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarnombre_vendedorCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldcodigoCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarcodigoCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelcodigoCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarcodigoCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombreCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarnombreCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelnombreCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarnombreCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreaapellidoCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarapellidoCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPanelapellidoCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrarapellidoCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreadireccion_direccionCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrardireccion_direccionCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPaneldireccion_direccionCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrardireccion_direccionCobrarClientesPorRegion);
		//this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreatelefono_telefonoCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrartelefono_telefonoCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jPaneltelefono_telefonoCobrarClientesPorRegion.setVisible(this.cobrarclientesporregionConstantesFunciones.mostrartelefono_telefonoCobrarClientesPorRegion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarClientesPorRegion() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesPorRegion!=null) {
	
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jLabelidCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activaridCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_empresaCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarid_empresaCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_sucursalCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarid_sucursalCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_paisCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarid_paisCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_regionCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarid_regionCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_provinciaCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarid_provinciaCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jComboBoxid_ciudadCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarid_ciudadCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_regionCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarnombre_regionCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_provinciaCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarnombre_provinciaCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_ciudadCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarnombre_ciudadCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldnombre_zonaCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarnombre_zonaCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_rutaCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarnombre_rutaCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombre_vendedorCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarnombre_vendedorCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextFieldcodigoCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarcodigoCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreanombreCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarnombreCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreaapellidoCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activarapellidoCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreadireccion_direccionCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activardireccion_direccionCobrarClientesPorRegion);
		this.jInternalFrameDetalleFormCobrarClientesPorRegion.jTextAreatelefono_telefonoCobrarClientesPorRegion.setEnabled(this.cobrarclientesporregionConstantesFunciones.activartelefono_telefonoCobrarClientesPorRegion);
		}
	}
	
		
}