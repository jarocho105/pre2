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

import com.bydan.erp.seguridad.util.RegionConstantesFunciones;
import com.bydan.erp.seguridad.util.RegionParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.RegionParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.RegionBean;
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

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class RegionBeanSwingJInternalFrame extends RegionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RegionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Region> regionValidator = new ClassValidator<Region>(Region.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Region region;	
	public Region regionAux;
	public Region regionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Region regionTotales;
	public Long idRegionActual;
	public Long iIdNuevoRegion=0L;
	public int rowIndexActual=0;
	
	
	
	
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

		
	
	
	
	
	

	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosProvincia=false;

	public Boolean getIsTienePermisosProvincia() {
		return isTienePermisosProvincia;
	}

	public void setIsTienePermisosProvincia(Boolean isTienePermisosProvincia) {
		this.isTienePermisosProvincia= isTienePermisosProvincia;
	}


	public Boolean isTienePermisosParametroCarteraDefecto=false;

	public Boolean getIsTienePermisosParametroCarteraDefecto() {
		return isTienePermisosParametroCarteraDefecto;
	}

	public void setIsTienePermisosParametroCarteraDefecto(Boolean isTienePermisosParametroCarteraDefecto) {
		this.isTienePermisosParametroCarteraDefecto= isTienePermisosParametroCarteraDefecto;
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
	
	public Boolean isPermisoTodoRegion;
	public Boolean isPermisoNuevoRegion;
	public Boolean isPermisoActualizarRegion;
	public Boolean isPermisoActualizarOriginalRegion;
	public Boolean isPermisoEliminarRegion;
	public Boolean isPermisoGuardarCambiosRegion;
	public Boolean isPermisoConsultaRegion;
	public Boolean isPermisoBusquedaRegion;
	public Boolean isPermisoReporteRegion;
	public Boolean isPermisoPaginacionMedioRegion;
	public Boolean isPermisoPaginacionAltoRegion;
	public Boolean isPermisoPaginacionTodoRegion;
	public Boolean isPermisoCopiarRegion;
	public Boolean isPermisoVerFormRegion;
	public Boolean isPermisoDuplicarRegion;
	public Boolean isPermisoOrdenRegion;
	
	
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
	
	public RegionParameterReturnGeneral regionReturnGeneral;
	public RegionParameterReturnGeneral regionParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public ProvinciaLogic provinciaLogic=null;

	public ProvinciaLogic getProvinciaLogic() {
		return provinciaLogic;
	}

	public void setProvinciaLogic(ProvinciaLogic provinciaLogic) {
		this.provinciaLogic = provinciaLogic;
	}


	public ParametroCarteraDefectoLogic parametrocarteradefectoLogic=null;

	public ParametroCarteraDefectoLogic getParametroCarteraDefectoLogic() {
		return parametrocarteradefectoLogic;
	}

	public void setParametroCarteraDefectoLogic(ParametroCarteraDefectoLogic parametrocarteradefectoLogic) {
		this.parametrocarteradefectoLogic = parametrocarteradefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRegion=false;
	public Boolean esParaAccionDesdeFormularioRegion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RegionSessionBeanAdditional regionSessionBeanAdditional=null;
	
	public RegionSessionBeanAdditional getRegionSessionBeanAdditional() {
		return this.regionSessionBeanAdditional;
	}
	
	public void setRegionSessionBeanAdditional(RegionSessionBeanAdditional regionSessionBeanAdditional) {
		try {
			this.regionSessionBeanAdditional=regionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RegionBeanSwingJInternalFrameAdditional regionBeanSwingJInternalFrameAdditional=null;
	//public class RegionBeanSwingJInternalFrame
	
	public RegionBeanSwingJInternalFrameAdditional getRegionBeanSwingJInternalFrameAdditional() {
		return this.regionBeanSwingJInternalFrameAdditional;
	}
	
	public void setRegionBeanSwingJInternalFrameAdditional(RegionBeanSwingJInternalFrameAdditional regionBeanSwingJInternalFrameAdditional) {
		try {
			this.regionBeanSwingJInternalFrameAdditional=regionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RegionLogic regionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Region regionBean;
	public RegionConstantesFunciones regionConstantesFunciones;
	//public RegionParameterReturnGeneral regionReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<Region> regions;	
	//public List<Region> regionsEliminados;
	//public List<Region> regionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRegion=false;
	public Boolean isVisibilidadCeldaDuplicarRegion=true;
	public Boolean isVisibilidadCeldaCopiarRegion=true;
	public Boolean isVisibilidadCeldaVerFormRegion=true;
	public Boolean isVisibilidadCeldaOrdenRegion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRegion=false;
	public Boolean isVisibilidadCeldaModificarRegion=false;
	public Boolean isVisibilidadCeldaActualizarRegion=false;
	public Boolean isVisibilidadCeldaEliminarRegion=false;
	public Boolean isVisibilidadCeldaCancelarRegion=false;
	public Boolean isVisibilidadCeldaGuardarRegion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRegion=false;	
	
	
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoRegion() {
		return this.iIdNuevoRegion;
	}

	public void setiIdNuevoRegion(Long iIdNuevoRegion) {
		this.iIdNuevoRegion = iIdNuevoRegion;
	}
	
	public Long getidRegionActual() {
		return this.idRegionActual;
	}

	public void setidRegionActual(Long idRegionActual) {
		this.idRegionActual = idRegionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Region getregion() {
		return this.region;
	}

	public void setregion(Region region) {
		this.region = region;
	}
	
	public Region getregionAux() {
		return this.regionAux;
	}

	public void setregionAux(Region regionAux) {
		this.regionAux = regionAux;
	}				
	
	public Region getregionAnterior() {
		return this.regionAnterior;
	}

	public void setregionAnterior(Region regionAnterior) {
		this.regionAnterior = regionAnterior;
	}	
	
	public Region getregionTotales() {
		return this.regionTotales;
	}

	public void setregionTotales(Region regionTotales) {
		this.regionTotales = regionTotales;
	}	
	
	public Region getregionBean() {
		return this.regionBean;
	}

	public void setregionBean(Region regionBean) {
		this.regionBean = regionBean;
	}	
	
	public RegionParameterReturnGeneral getregionReturnGeneral() {
		return this.regionReturnGeneral;
	}

	public void setregionReturnGeneral(RegionParameterReturnGeneral regionReturnGeneral) {
		this.regionReturnGeneral = regionReturnGeneral;
	}	
	
	
	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public RegionLogic getRegionLogic()	{		
		return regionLogic;
	}

	public void setRegionLogic(RegionLogic regionLogic) {
		this.regionLogic = regionLogic;
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
	
	public Boolean getIsEsNuevoRegion() {
		return isEsNuevoRegion;
	}

	public void setIsEsNuevoRegion(Boolean isEsNuevoRegion) {
		this.isEsNuevoRegion = isEsNuevoRegion;
	}

	public Boolean getEsParaAccionDesdeFormularioRegion() {
		return esParaAccionDesdeFormularioRegion;
	}
	
	public void setEsParaAccionDesdeFormularioRegion(Boolean esParaAccionDesdeFormularioRegion) {
		this.esParaAccionDesdeFormularioRegion = esParaAccionDesdeFormularioRegion;
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

			if(this.regionSessionBean==null) {
				this.regionSessionBean=new RegionSessionBean();
			}

			if(!this.regionSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
					paisLogic.getEntityWithConnection(regionSessionBean.getlidPaisActual());
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

					if(this.region!=null) {
						this.region.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormRegion!=null) {
						this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisRegion.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormRegion!=null) {
						if(this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion.getItemCount()>0) {
							this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisRegion!=null) {
						jComboBoxid_paisFK_IdPaisRegion.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisRegion!=null) {
							//jComboBoxid_paisFK_IdPaisRegion.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisRegion.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisRegion.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisRegionGenerico)throws Exception
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
				jComboBoxid_paisRegionGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisRegionGenerico!=null && jComboBoxid_paisRegionGenerico.getItemCount()>0) {
					jComboBoxid_paisRegionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(Region region,JComboBox jComboBoxid_paisRegionGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisRegionGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisRegionGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				region.setid_pais(paisAux.getId());
				region.setpais_descripcion(RegionConstantesFunciones.getPaisDescripcion(paisAux));
				region.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RegionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRegion!=null) { 
							this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRegion!=null) { 
					}

					if(!RegionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RegionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisRegion.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisRegion.addItem(pais);
							}
						}

						if(!RegionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRegion!=null) {
							this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormRegion!=null) {
							this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisRegion.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisRegion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRegion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RegionConstantesFunciones.refrescarForeignKeysDescripcionesRegion(this.regionLogic.getRegions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RegionConstantesFunciones.refrescarForeignKeysDescripcionesRegion(this.regions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//regionLogic.setRegions(this.regions);
			regionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RegionParameterReturnGeneral getRegionParameterGeneral() {
		return this.regionParameterGeneral;
	}
	
	public void setRegionParameterGeneral(RegionParameterReturnGeneral regionParameterGeneral) {
		this.regionParameterGeneral = regionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRegion() {
		return isPermisoTodoRegion;
	}

	public void setIsPermisoTodoRegion(Boolean isPermisoTodoRegion) {
		this.isPermisoTodoRegion = isPermisoTodoRegion;
	}

	public Boolean getIsPermisoNuevoRegion() {
		return isPermisoNuevoRegion;
	}

	public void setIsPermisoNuevoRegion(Boolean isPermisoNuevoRegion) {
		this.isPermisoNuevoRegion = isPermisoNuevoRegion;
	}

	public Boolean getIsPermisoActualizarRegion() {
		return isPermisoActualizarRegion;
	}

	public void setIsPermisoActualizarRegion(Boolean isPermisoActualizarRegion) {
		this.isPermisoActualizarRegion = isPermisoActualizarRegion;
	}

	public Boolean getIsPermisoEliminarRegion() {
		return isPermisoEliminarRegion;
	}

	public void setIsPermisoEliminarRegion(Boolean isPermisoEliminarRegion) {
		this.isPermisoEliminarRegion = isPermisoEliminarRegion;
	}

	public Boolean getIsPermisoGuardarCambiosRegion() {
		return isPermisoGuardarCambiosRegion;
	}

	public void setIsPermisoGuardarCambiosRegion(Boolean isPermisoGuardarCambiosRegion) {
		this.isPermisoGuardarCambiosRegion = isPermisoGuardarCambiosRegion;
	}
	
	public Boolean getIsPermisoConsultaRegion() {
		return isPermisoConsultaRegion;
	}

	public void setIsPermisoConsultaRegion(Boolean isPermisoConsultaRegion) {
		this.isPermisoConsultaRegion = isPermisoConsultaRegion;
	}

	public Boolean getIsPermisoBusquedaRegion() {
		return isPermisoBusquedaRegion;
	}

	public void setIsPermisoBusquedaRegion(Boolean isPermisoBusquedaRegion) {
		this.isPermisoBusquedaRegion = isPermisoBusquedaRegion;
	}

	public Boolean getIsPermisoReporteRegion() {
		return isPermisoReporteRegion;
	}

	public void setIsPermisoReporteRegion(Boolean isPermisoReporteRegion) {
		this.isPermisoReporteRegion = isPermisoReporteRegion;
	}
	
	public Boolean getIsPermisoPaginacionMedioRegion() {
		return isPermisoPaginacionMedioRegion;
	}

	public void setIsPermisoPaginacionMedioRegion(Boolean isPermisoPaginacionMedioRegion) {
		this.isPermisoPaginacionMedioRegion = isPermisoPaginacionMedioRegion;
	}
	
	public Boolean getIsPermisoPaginacionTodoRegion() {
		return isPermisoPaginacionTodoRegion;
	}

	public void setIsPermisoPaginacionTodoRegion(Boolean isPermisoPaginacionTodoRegion) {
		this.isPermisoPaginacionTodoRegion = isPermisoPaginacionTodoRegion;
	}
	
	public Boolean getIsPermisoPaginacionAltoRegion() {
		return isPermisoPaginacionAltoRegion;
	}

	public void setIsPermisoPaginacionAltoRegion(Boolean isPermisoPaginacionAltoRegion) {
		this.isPermisoPaginacionAltoRegion = isPermisoPaginacionAltoRegion;
	}
	
	public Boolean getIsPermisoCopiarRegion() {
		return isPermisoCopiarRegion;
	}

	public void setIsPermisoCopiarRegion(Boolean isPermisoCopiarRegion) {
		this.isPermisoCopiarRegion = isPermisoCopiarRegion;
	}
	
	public Boolean getIsPermisoVerFormRegion() {
		return isPermisoVerFormRegion;
	}

	public void setIsPermisoVerFormRegion(Boolean isPermisoVerFormRegion) {
		this.isPermisoVerFormRegion = isPermisoVerFormRegion;
	}
	
	public Boolean getIsPermisoDuplicarRegion() {
		return isPermisoDuplicarRegion;
	}

	public void setIsPermisoDuplicarRegion(Boolean isPermisoDuplicarRegion) {
		this.isPermisoDuplicarRegion = isPermisoDuplicarRegion;
	}
	
	public Boolean getIsPermisoOrdenRegion() {
		return isPermisoOrdenRegion;
	}

	public void setIsPermisoOrdenRegion(Boolean isPermisoOrdenRegion) {
		this.isPermisoOrdenRegion = isPermisoOrdenRegion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRegion() {
		return isVisibilidadCeldaNuevoRegion;
	}

	public void setIsVisibilidadCeldaNuevoRegion(Boolean isVisibilidadCeldaNuevoRegion) {
		this.isVisibilidadCeldaNuevoRegion = isVisibilidadCeldaNuevoRegion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRegion() {
		return isVisibilidadCeldaDuplicarRegion;
	}

	public void setIsVisibilidadCeldaDuplicarRegion(Boolean isVisibilidadCeldaDuplicarRegion) {
		this.isVisibilidadCeldaDuplicarRegion = isVisibilidadCeldaDuplicarRegion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRegion() {
		return isVisibilidadCeldaCopiarRegion;
	}

	public void setIsVisibilidadCeldaCopiarRegion(Boolean isVisibilidadCeldaCopiarRegion) {
		this.isVisibilidadCeldaCopiarRegion = isVisibilidadCeldaCopiarRegion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRegion() {
		return isVisibilidadCeldaVerFormRegion;
	}

	public void setIsVisibilidadCeldaVerFormRegion(Boolean isVisibilidadCeldaVerFormRegion) {
		this.isVisibilidadCeldaVerFormRegion = isVisibilidadCeldaVerFormRegion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRegion() {
		return isVisibilidadCeldaOrdenRegion;
	}

	public void setIsVisibilidadCeldaOrdenRegion(Boolean isVisibilidadCeldaOrdenRegion) {
		this.isVisibilidadCeldaOrdenRegion = isVisibilidadCeldaOrdenRegion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRegion() {
		return isVisibilidadCeldaNuevoRelacionesRegion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRegion(Boolean isVisibilidadCeldaNuevoRelacionesRegion) {
		this.isVisibilidadCeldaNuevoRelacionesRegion = isVisibilidadCeldaNuevoRelacionesRegion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRegion() {
		return isVisibilidadCeldaModificarRegion;
	}

	public void setIsVisibilidadCeldaModificarRegion(Boolean isVisibilidadCeldaModificarRegion) {
		this.isVisibilidadCeldaModificarRegion = isVisibilidadCeldaModificarRegion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRegion() {
		return isVisibilidadCeldaActualizarRegion;
	}

	public void setIsVisibilidadCeldaActualizarRegion(Boolean isVisibilidadCeldaActualizarRegion) {
		this.isVisibilidadCeldaActualizarRegion = isVisibilidadCeldaActualizarRegion;
	}

	public Boolean getIsVisibilidadCeldaEliminarRegion() {
		return isVisibilidadCeldaEliminarRegion;
	}

	public void setIsVisibilidadCeldaEliminarRegion(Boolean isVisibilidadCeldaEliminarRegion) {
		this.isVisibilidadCeldaEliminarRegion = isVisibilidadCeldaEliminarRegion;
	}

	public Boolean getIsVisibilidadCeldaCancelarRegion() {
		return isVisibilidadCeldaCancelarRegion;
	}

	public void setIsVisibilidadCeldaCancelarRegion(Boolean isVisibilidadCeldaCancelarRegion) {
		this.isVisibilidadCeldaCancelarRegion = isVisibilidadCeldaCancelarRegion;
	}

	public Boolean getIsVisibilidadCeldaGuardarRegion() {
		return isVisibilidadCeldaGuardarRegion;
	}

	public void setIsVisibilidadCeldaGuardarRegion(Boolean isVisibilidadCeldaGuardarRegion) {
		this.isVisibilidadCeldaGuardarRegion = isVisibilidadCeldaGuardarRegion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRegion() {
		return isVisibilidadCeldaGuardarCambiosRegion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRegion(Boolean isVisibilidadCeldaGuardarCambiosRegion) {
		this.isVisibilidadCeldaGuardarCambiosRegion = isVisibilidadCeldaGuardarCambiosRegion;
	}
		
	public RegionSessionBean getregionSessionBean() {
		return this.regionSessionBean;
	}
	
	public void setregionSessionBean(RegionSessionBean regionSessionBean) {
		this.regionSessionBean=regionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRegion(Region region)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(region,null);
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
	
	public void bugActualizarReferenciaActual(Region region,Region regionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRegion(region);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		regionAux.setId(region.getId());
		regionAux.setVersionRow(region.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRegion();
		
			int intSelectedRow = this.jTableDatosRegion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRegion(this.region,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = regionValidator.getInvalidValues(this.region);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			regionLogic.setDatosCliente(datosCliente);
			regionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				regionAux=new  Region();
				
				regionAux.setIsNew(true);
				regionAux.setIsChanged(true);
				
				regionAux.setRegionOriginal(this.region);
				
				regionAux.setId(this.region.getId());	
				regionAux.setVersionRow(this.region.getVersionRow());	
				regionAux.setid_pais(this.region.getid_pais());	
				regionAux.setcodigo(this.region.getcodigo());	
				regionAux.setnombre(this.region.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.regionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.regionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(regionAux,regionLogic.getRegions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(regionAux,regions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.regionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.regionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						regionLogic.saveRegions();//WithConnection
						//regionLogic.getSetVersionRowRegions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.region,regionAux);
					
					this.refrescarForeignKeysDescripcionesRegion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.regionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias().addAll(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciasEliminados);
							this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provincias.addAll(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciasEliminados);
							this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.regionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								regionLogic.saveRegionRelaciones(regionAux,this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias(),this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//regionLogic.getSetVersionRowRegions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.region,regionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.setProvincias(new ArrayList<Provincia>());
							this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provincias= new ArrayList<Provincia>();
							this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							regionAux.setClientes(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();}
							regionAux.setProvincias(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias());

							if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							regionAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.regionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.regionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(regionAux,regionLogic.getRegions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(regionAux,regions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.region,regionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				regionAux=new  Region();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.regionSessionBean.getEsGuardarRelacionado() 
					|| (this.regionSessionBean.getEsGuardarRelacionado() && this.region.getId()>=0)) {
						
					regionAux.setIsNew(false);
				}
				
				regionAux.setIsDeleted(false);
			
				regionAux.setId(this.region.getId());	
				regionAux.setVersionRow(this.region.getVersionRow());	
				regionAux.setid_pais(this.region.getid_pais());	
				regionAux.setcodigo(this.region.getcodigo());	
				regionAux.setnombre(this.region.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(regionAux,regionLogic.getRegions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(regionAux,regions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.regionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.regionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						regionLogic.saveRegions();//WithConnection
						//regionLogic.getSetVersionRowRegions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.region,regionAux);
					
					this.refrescarForeignKeysDescripcionesRegion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.regionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias().addAll(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciasEliminados);
							this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provincias.addAll(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciasEliminados);
							this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.regionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								regionLogic.saveRegionRelaciones(regionAux,this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias(),this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//regionLogic.getSetVersionRowRegions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.region,regionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.setProvincias(new ArrayList<Provincia>());
							this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provincias= new ArrayList<Provincia>();
							this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							regionAux.setClientes(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();}
							regionAux.setProvincias(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias());

							if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							regionAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.regionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.regionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(regionAux,regionLogic.getRegions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(regionAux,regions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.region,regionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				regionAux=new  Region();
				
				regionAux.setIsNew(false);
				regionAux.setIsChanged(false);
				
				regionAux.setIsDeleted(true);
				
				regionAux.setId(this.region.getId());	
				regionAux.setVersionRow(this.region.getVersionRow());	
				regionAux.setid_pais(this.region.getid_pais());	
				regionAux.setcodigo(this.region.getcodigo());	
				regionAux.setnombre(this.region.getnombre());	
				
				if(this.regionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.regionAux.getId()>=0) {	
						this.regionsEliminados.add(regionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(regionAux,regionLogic.getRegions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(regionAux,regions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.regionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.regionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						regionLogic.saveRegions();//WithConnection
						//regionLogic.getSetVersionRowRegions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.regionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias().addAll(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciasEliminados);
							this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provincias.addAll(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciasEliminados);
							this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.regionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								regionLogic.saveRegionRelaciones(regionAux,this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias(),this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//regionLogic.getSetVersionRowRegions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.setProvincias(new ArrayList<Provincia>());
							this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provincias= new ArrayList<Provincia>();
							this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							regionAux.setClientes(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.quitarFilaTotales();}
							regionAux.setProvincias(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias());

							if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							regionAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.regionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.regionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(regionAux,regionLogic.getRegions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(regionAux,regions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.getRegions().addAll(this.regionsEliminados);
					
					regionLogic.saveRegions();//WithConnection
					//regionLogic.getSetVersionRowRegions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRegion();
				
				this.regionsEliminados= new ArrayList<Region>();		
			}
			
			if(this.regionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.regionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Region GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Region",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.region=regionAux;
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
      		//this.finishProcessRegion();
      	}
		
	}	
	
	public void actualizarRelaciones(Region regionLocal) throws Exception {
		
		if(this.regionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				regionLocal.setClientes(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				regionLocal.setProvincias(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias());
				regionLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
			
			} else {
			
				regionLocal.setClientes(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clientes);
				regionLocal.setProvincias(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provincias);
				regionLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Region regionLocal) throws Exception {	
		if(this.regionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				regionLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRegionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRegion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = regionValidator.getInvalidValues(this.region);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Region region,List<Region> regions) throws Exception {
		try	{		
			RegionConstantesFunciones.actualizarLista(region,regions,this.regionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Region region,List<Region> regions) throws Exception {
		try	{			
			RegionConstantesFunciones.actualizarSelectedLista(region,regions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Region> regionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				regionsLocal=this.regionLogic.getRegions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				regionsLocal=this.regions;
			}
			//ARCHITECTURE
		
			for(Region regionLocal:regionsLocal) {
				if(this.permiteMantenimiento(regionLocal) && regionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RegionConstantesFunciones.getRegionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RegionConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRegion.jLabelid_paisRegion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RegionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRegion.jLabelcodigoRegion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RegionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRegion.jLabelnombreRegion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRegion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRegion.jLabelid_paisRegion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRegion.jLabelcodigoRegion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRegion.jLabelnombreRegion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.region==null) {
				this.region= new Region();
			}

			if(this.regionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoRegion
				this.setVariablesFormularioToObjetoActualRegion(this.region,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);

				this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.getcliente().setRegion(this.region);
			}

			return;
		}
		 else  if(sTipo.equals("Provincia")) {
			if(this.region==null) {
				this.region= new Region();
			}

			if(this.regionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoRegion
				this.setVariablesFormularioToObjetoActualRegion(this.region,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);

				this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.getprovincia().setRegion(this.region);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroCarteraDefecto")) {
			if(this.region==null) {
				this.region= new Region();
			}

			if(this.regionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoRegion
				this.setVariablesFormularioToObjetoActualRegion(this.region,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);

				this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.getparametrocarteradefecto().setRegion(this.region);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoRegion--;	
		
		
		this.regionAux=new Region();
		
		this.regionAux.setId(this.iIdNuevoRegion);
		this.regionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.regionLogic.getRegions().add(this.regionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.regions.add(this.regionAux);
		}
		//ARCHITECTURE
		
		this.region=this.regionAux;
		
		if(RegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRegion(this.region);
			this.setVariablesObjetoActualToFormularioForeignKeyRegion(this.region);
		}
				
		//this.setDefaultControlesRegion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRegion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRegion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRegion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRegion(this.regionBean,this.region,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RegionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.regionSessionBean.getConGuardarRelaciones()) {
			classes=RegionConstantesFunciones.getClassesRelationshipsOfRegion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.regionReturnGeneral=regionLogic.procesarEventosRegionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.regionLogic.getRegions(),this.region,this.regionParameterGeneral,this.isEsNuevoRegion,classes);//this.regionLogic.getRegion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRegion(this.regionReturnGeneral,this.regionBean,false);
		
		if(this.regionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRegion(this.regionReturnGeneral.getRegion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRegion(this.regionReturnGeneral.getRegion());
		}
		
		if(this.regionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRegion(this.regionReturnGeneral.getRegion(),classes);//this.regionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRegion(this.region,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRegion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRegion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RegionBeanSwingJInternalFrameAdditional.RecargarFormRegion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRegion(false);
						
			if(regionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaSessionBean.getEsGuardarRelacionado() && ProvinciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProvinciaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(RegionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRegion();
			}
			
			this.actualizarVisualTableDatosRegion();
			
			this.jTableDatosRegion.setRowSelectionInterval(this.getIndiceNuevoRegion(), this.getIndiceNuevoRegion());
			
			this.seleccionarFilaTablaRegionActual();
						
			this.actualizarEstadoCeldasBotonesRegion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRegion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRegion.jTextFieldcodigoRegion.setEnabled(isHabilitar && this.regionConstantesFunciones.activarcodigoRegion);
		this.jInternalFrameDetalleFormRegion.jTextAreanombreRegion.setEnabled(isHabilitar && this.regionConstantesFunciones.activarnombreRegion);	
		
		this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion.setEnabled(isHabilitar && this.regionConstantesFunciones.activarid_paisRegion);
	};
	
	public void setDefaultControlesRegion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRegion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.regionSessionBean.setConGuardarRelaciones(true);			
			this.regionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRegion.jTabbedPaneRelacionesRegion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.regionSessionBean.setConGuardarRelaciones(false);			
			this.regionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRegion.jTabbedPaneRelacionesRegion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoRegion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Region regionAux:this.regionLogic.getRegions()) {
				if(regionAux.getId().equals(this.iIdNuevoRegion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Region regionAux:this.regions) {
				if(regionAux.getId().equals(this.iIdNuevoRegion)) {
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
	
	public int getIndiceActualRegion(Region region,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Region regionAux:this.regionLogic.getRegions()) {
				if(regionAux.getId().equals(region.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Region regionAux:this.regions) {
				if(regionAux.getId().equals(region.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRegion(Region regionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Region regionAux:this.regionLogic.getRegions()) {
				if(regionAux.getRegionOriginal().getId().equals(regionOriginal.getId())) {
					existe=true;
					regionOriginal.setId(regionAux.getId());
					regionOriginal.setVersionRow(regionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Region regionAux:this.regions) {
				if(regionAux.getRegionOriginal().getId().equals(regionOriginal.getId())) {
					existe=true;
					regionOriginal.setId(regionAux.getId());
					regionOriginal.setVersionRow(regionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRegion(Boolean esParaCancelar) throws Exception {
		regionsAux=new ArrayList<Region>();
		regionAux=new Region();
		
		if(!this.regionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Region regionAux:this.regionLogic.getRegions()) {
					if(regionAux.getId()<0) {
						regionsAux.add(regionAux);
					}		
				}
				this.iIdNuevoRegion=0L;
				this.regionLogic.getRegions().removeAll(regionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Region regionAux:this.regions) {
					if(regionAux.getId()<0) {
						regionsAux.add(regionAux);
					}		
				}
				this.iIdNuevoRegion=0L;
				this.regions.removeAll(regionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRegion 
					&& this.regionLogic.getRegions().size()>0
					) {
					regionAux=this.regionLogic.getRegions().get(this.regionLogic.getRegions().size() - 1);
				
					if(regionAux.getId()<0) {
						this.regionLogic.getRegions().remove(regionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRegion && this.regions.size()>0) {
					regionAux=this.regions.get(this.regions.size() - 1);
				
					if(regionAux.getId()<0) {
						this.regions.remove(regionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRegion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(region.getId()<0) {
				this.regionLogic.getRegions().remove(this.region);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(region.getId()<0) {
				this.regions.remove(this.region);
			}
		}			
	}
	
	public void setEstadosInicialesRegion(List<Region> regionsAux) throws Exception {
		RegionConstantesFunciones.setEstadosInicialesRegion(regionsAux);
	}
	
	public void setEstadosInicialesRegion(Region regionAux) throws Exception {
		RegionConstantesFunciones.setEstadosInicialesRegion(regionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRegionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRegion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRegionActual()) {
				if(!this.isEsNuevoRegion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRegion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRegion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRegionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Region ?", "MANTENIMIENTO DE Region", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRegion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Region region) throws Exception {
		RegionConstantesFunciones.seleccionarAsignar(this.region,region);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRegion=this.isPermisoActualizarOriginalRegion;
			
			
			this.seleccionarAsignar(region);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RegionConstantesFunciones.quitarEspaciosRegion(this.region,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRegion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.regionSessionBean.setsFuncionBusquedaRapida(this.regionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRegion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRegion(esParaCancelar);				
				this.cancelarNuevoRegion(esParaCancelar);								
			}
			
			this.region=new Region();
			
			this.inicializarRegion();
			
			this.actualizarEstadoCeldasBotonesRegion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRegion() throws Exception {
		try {
			RegionConstantesFunciones.inicializarRegion(this.region);
			
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
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.regionLogic.getRegions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRegions(String sAccionBusqueda,List<Region> regionsParaReportes) throws Exception {
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
					sPathReporteFinal="Region"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RegionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RegionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Region"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Regiones");		
		parameters.put("busquedapor", RegionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(Provincia.class));
			classes.add(new Classe(ParametroCarteraDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					RegionLogic regionLogicAuxiliar=new RegionLogic();
					regionLogicAuxiliar.setDatosCliente(regionLogic.getDatosCliente());				
					regionLogicAuxiliar.setRegions(regionsParaReportes);
					
					regionLogicAuxiliar.cargarRelacionesLoteForeignKeyRegionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					regionsParaReportes=regionLogicAuxiliar.getRegions();
					
					//regionLogic.getNewConnexionToDeep();
					
					//for (Region region:regionsParaReportes) {
					//	regionLogic.deepLoad(region, false, DeepLoadType.INCLUDE, classes);
					//}						
					//regionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//regionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileProvincia = AuxiliarReportes.class.getResourceAsStream("ProvinciaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_provincia", reportFileProvincia);

			InputStream reportFileParametroCarteraDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroCarteraDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocarteradefecto", reportFileParametroCarteraDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRegion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RegionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RegionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRegion=new JRBeanArrayDataSource(RegionJInternalFrame.TraerRegionBeans(regionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRegion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RegionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RegionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RegionBean.TraerRegionBeans(regionsParaReportes).toArray()));
							
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
				this.generarExcelReporteRegions(sAccionBusqueda,sTipoArchivoReporte,regionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRegions(sAccionBusqueda,sTipoArchivoReporte,regionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRegionActionPerformed(null);
					//this.generarExcelReporteRegions(sAccionBusqueda,sTipoArchivoReporte,regionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRegions(sAccionBusqueda,sTipoArchivoReporte,regionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRegions(sAccionBusqueda,sTipoArchivoReporte,regionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRegions(sAccionBusqueda,sTipoArchivoReporte,regionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRegions(String sAccionBusqueda,String sTipoArchivoReporte,List<Region> regionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"region";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Regions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRegion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Region region : regionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RegionConstantesFunciones.generarExcelReporteDataRegion("NORMAL",row,workbook,region,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.regionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Region",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRegion(String sTipo,Row row,Workbook workbook) {
		
		RegionConstantesFunciones.generarExcelReporteHeaderRegion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRegions(String sAccionBusqueda,String sTipoArchivoReporte,List<Region> regionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"region_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Regions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Region region : regionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RegionConstantesFunciones.getRegionDescripcion(region));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RegionConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RegionConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(region.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RegionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RegionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(region.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RegionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RegionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(region.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.regionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Region",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRegions(String sAccionBusqueda,String sTipoArchivoReporte,List<Region> regionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Region> regionsRespaldo=null;
		
		classes=RegionConstantesFunciones.getClassesRelationshipsOfRegion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.regionLogic.setDatosCliente(this.datosCliente);
		this.regionLogic.setDatosDeep(this.datosDeep);
		this.regionLogic.setIsConDeep(true);
		
		regionsRespaldo=this.regionLogic.getRegions();
		
		this.regionLogic.setRegions(regionsParaReportes);	
		this.regionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		regionsParaReportes=this.regionLogic.getRegions();
		this.regionLogic.setRegions(regionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"region_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Regions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRegion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Region region : regionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRegion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RegionConstantesFunciones.generarExcelReporteDataRegion("NORMAL",row,workbook,region,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(region.getClientes()!=null && region.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(region.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : region.getClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClienteConstantesFunciones.generarExcelReporteDataCliente("RELACIONADO",row,workbook,cliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Provincia
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProvinciaConstantesFunciones.SCLASSWEBTITULO))) {

				if(region.getProvincias()!=null && region.getProvincias().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProvinciaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProvinciaConstantesFunciones.generarExcelReporteHeaderProvincia("RELACIONADO",row,workbook);
				}

				if(region.getProvincias()!=null) {
					i2=0;
					for(Provincia provincia : region.getProvincias()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProvinciaConstantesFunciones.generarExcelReporteDataProvincia("RELACIONADO",row,workbook,provincia,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ParametroCarteraDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(region.getParametroCarteraDefectos()!=null && region.getParametroCarteraDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroCarteraDefectoConstantesFunciones.generarExcelReporteHeaderParametroCarteraDefecto("RELACIONADO",row,workbook);
				}

				if(region.getParametroCarteraDefectos()!=null) {
					i2=0;
					for(ParametroCarteraDefecto parametrocarteradefecto : region.getParametroCarteraDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroCarteraDefectoConstantesFunciones.generarExcelReporteDataParametroCarteraDefecto("RELACIONADO",row,workbook,parametrocarteradefecto,cellStyleDataAuxHijo);
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
		cell.setCellValue(RegionConstantesFunciones.getRegionDescripcion(region));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.regionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Region",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRegion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRegion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRegion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRegion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRegion() throws Exception {		
		this.startProcessRegion(true);
	}
	
	public void startProcessRegion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRegion ,this.jPanelParametrosReportesRegion, this.jScrollPanelDatosRegion,this.jPanelPaginacionRegion, this.jScrollPanelDatosEdicionRegion, this.jPanelAccionesRegion,this.jPanelAccionesFormularioRegion,this.jmenuBarRegion,this.jmenuBarDetalleRegion,this.jTtoolBarRegion,this.jTtoolBarDetalleRegion);		
		
		final JTabbedPane jTabbedPaneBusquedasRegion=this.jTabbedPaneBusquedasRegion; 
		
		final JPanel jPanelParametrosReportesRegion=this.jPanelParametrosReportesRegion;
		//final JScrollPane jScrollPanelDatosRegion=this.jScrollPanelDatosRegion;
		final JTable jTableDatosRegion=this.jTableDatosRegion;		
		final JPanel jPanelPaginacionRegion=this.jPanelPaginacionRegion;
		//final JScrollPane jScrollPanelDatosEdicionRegion=this.jScrollPanelDatosEdicionRegion;
		final JPanel jPanelAccionesRegion=this.jPanelAccionesRegion;
		
		JPanel jPanelCamposAuxiliarRegion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRegion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRegion!=null) {
			jPanelCamposAuxiliarRegion=this.jInternalFrameDetalleFormRegion.jPanelCamposRegion;
			jPanelAccionesFormularioAuxiliarRegion=this.jInternalFrameDetalleFormRegion.jPanelAccionesFormularioRegion;
		}
		
		final JPanel jPanelCamposRegion=jPanelCamposAuxiliarRegion;
		final JPanel jPanelAccionesFormularioRegion=jPanelAccionesFormularioAuxiliarRegion;
		
		
		final JMenuBar jmenuBarRegion=this.jmenuBarRegion;
		final JToolBar jTtoolBarRegion=this.jTtoolBarRegion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRegion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRegion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRegion!=null) {
			jmenuBarDetalleAuxiliarRegion=this.jInternalFrameDetalleFormRegion.jmenuBarDetalleRegion;
			jTtoolBarDetalleAuxiliarRegion=this.jInternalFrameDetalleFormRegion.jTtoolBarDetalleRegion;
		}
		
		final JMenuBar jmenuBarDetalleRegion=jmenuBarDetalleAuxiliarRegion;
		final JToolBar jTtoolBarDetalleRegion=jTtoolBarDetalleAuxiliarRegion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRegion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRegion;
			processRunnable.jTableDatos=jTableDatosRegion;
			processRunnable.jPanelCampos=jPanelCamposRegion;
			processRunnable.jPanelPaginacion=jPanelPaginacionRegion;
			processRunnable.jPanelAcciones=jPanelAccionesRegion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRegion;
			
			
			processRunnable.jmenuBar=jmenuBarRegion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRegion;
			processRunnable.jTtoolBar=jTtoolBarRegion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRegion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRegion ,jPanelParametrosReportesRegion,jTableDatosRegion, /*jScrollPanelDatosRegion,*/jPanelCamposRegion,jPanelPaginacionRegion, /*jScrollPanelDatosEdicionRegion,*/ jPanelAccionesRegion,jPanelAccionesFormularioRegion,jmenuBarRegion,jmenuBarDetalleRegion,jTtoolBarRegion,jTtoolBarDetalleRegion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRegion ,jPanelParametrosReportesRegion, jScrollPanelDatosRegion,jPanelPaginacionRegion, jScrollPanelDatosEdicionRegion, jPanelAccionesRegion,jPanelAccionesFormularioRegion,jmenuBarRegion,jmenuBarDetalleRegion,jTtoolBarRegion,jTtoolBarDetalleRegion);
						
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
	
	public void finishProcessRegion() {// throws Exception 
		this.finishProcessRegion(true);
	}
	
	public void finishProcessRegion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRegion ,this.jPanelParametrosReportesRegion, this.jScrollPanelDatosRegion,this.jPanelPaginacionRegion, this.jScrollPanelDatosEdicionRegion, this.jPanelAccionesRegion,this.jPanelAccionesFormularioRegion,this.jmenuBarRegion,this.jmenuBarDetalleRegion,this.jTtoolBarRegion,this.jTtoolBarDetalleRegion);		
		
		final JTabbedPane jTabbedPaneBusquedasRegion=this.jTabbedPaneBusquedasRegion; 
		
		final JPanel jPanelParametrosReportesRegion=this.jPanelParametrosReportesRegion;
		//final JScrollPane jScrollPanelDatosRegion=this.jScrollPanelDatosRegion;
		final JTable jTableDatosRegion=this.jTableDatosRegion;		
		final JPanel jPanelPaginacionRegion=this.jPanelPaginacionRegion;
		//final JScrollPane jScrollPanelDatosEdicionRegion=this.jScrollPanelDatosEdicionRegion;
		final JPanel jPanelAccionesRegion=this.jPanelAccionesRegion;
		
		JPanel jPanelCamposAuxiliarRegion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRegion=new JPanel();
		
		if(this.jInternalFrameDetalleFormRegion!=null) {
			jPanelCamposAuxiliarRegion=this.jInternalFrameDetalleFormRegion.jPanelCamposRegion;
			jPanelAccionesFormularioAuxiliarRegion=this.jInternalFrameDetalleFormRegion.jPanelAccionesFormularioRegion;
		}
		
		final JPanel jPanelCamposRegion=jPanelCamposAuxiliarRegion;
		final JPanel jPanelAccionesFormularioRegion=jPanelAccionesFormularioAuxiliarRegion;
		
		
		final JMenuBar jmenuBarRegion=this.jmenuBarRegion;		
		final JToolBar jTtoolBarRegion=this.jTtoolBarRegion;
				
		JMenuBar jmenuBarDetalleAuxiliarRegion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRegion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRegion!=null) {
			jmenuBarDetalleAuxiliarRegion=this.jInternalFrameDetalleFormRegion.jmenuBarDetalleRegion;
			jTtoolBarDetalleAuxiliarRegion=this.jInternalFrameDetalleFormRegion.jTtoolBarDetalleRegion;		
		}
		
		final JMenuBar jmenuBarDetalleRegion=jmenuBarDetalleAuxiliarRegion;
		final JToolBar jTtoolBarDetalleRegion=jTtoolBarDetalleAuxiliarRegion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRegion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRegion;
			processRunnable.jTableDatos=jTableDatosRegion;
			processRunnable.jPanelCampos=jPanelCamposRegion;
			processRunnable.jPanelPaginacion=jPanelPaginacionRegion;
			processRunnable.jPanelAcciones=jPanelAccionesRegion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRegion;
			
			
			processRunnable.jmenuBar=jmenuBarRegion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRegion;
			processRunnable.jTtoolBar=jTtoolBarRegion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRegion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRegion ,jPanelParametrosReportesRegion, jTableDatosRegion,/*jScrollPanelDatosRegion,*/jPanelCamposRegion,jPanelPaginacionRegion, /*jScrollPanelDatosEdicionRegion,*/ jPanelAccionesRegion,jPanelAccionesFormularioRegion,jmenuBarRegion,jmenuBarDetalleRegion,jTtoolBarRegion,jTtoolBarDetalleRegion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRegion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRegion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRegion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRegion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRegion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRegion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRegion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRegion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRegion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.regionConstantesFunciones.getsFinalQueryRegion();
		String  finalQueryPaginacionTodos=this.regionConstantesFunciones.getsFinalQueryRegion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RegionConstantesFunciones.getArrayColumnasGlobalesNoRegion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RegionConstantesFunciones.getArrayColumnasGlobalesRegion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RegionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.regionsEliminados= new ArrayList<Region>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRegion();
		
				///*RegionSessionBean*/this.regionSessionBean=new RegionSessionBean();
			
			if(this.regionSessionBean==null) {
				this.regionSessionBean=new RegionSessionBean();
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
					this.iNumeroPaginacion=RegionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RegionConstantesFunciones.getClassesForeignKeysOfRegion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/region."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			regionsAux= new ArrayList<Region>();
			
				
			regionLogic.setDatosCliente(this.datosCliente);
			regionLogic.setDatosDeep(this.datosDeep);
			regionLogic.setIsConDeep(true);
			
			
			regionLogic.getRegionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					regionLogic.getTodosRegions(finalQueryGlobal,pagination);
					
					//regionLogic.getTodosRegionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(regionLogic.getRegions()==null|| regionLogic.getRegions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							regionsAux= new ArrayList<Region>();
							regionsAux.addAll(regionLogic.getRegions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							regionsAux= new ArrayList<Region>();
							regionsAux.addAll(regions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							regionLogic.getTodosRegions(finalQueryGlobal+"",this.pagination);												
							
							//regionLogic.getTodosRegionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRegions("Todos",regionLogic.getRegions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							regionLogic.setRegions(new ArrayList<Region>());					
							regionLogic.getRegions().addAll(regionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							regions=new ArrayList<Region>();
							regions.addAll(regionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRegion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRegion=this.idActual;
				
				} else if(this.idRegionActual!=null && this.idRegionActual!=0L) {
					idRegion=idRegionActual;
				}
				
					
				this.sDetalleReporte=RegionConstantesFunciones.getDetalleIndicePorId(idRegion);
				
				this.regions=new ArrayList<Region>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					regionLogic.getEntity(idRegion);
					
					//regionLogic.getEntityWithConnection(idRegion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					regionLogic.setRegions(new ArrayList<Region>());
					regionLogic.getRegions().add(regionLogic.getRegion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.regions=new ArrayList<Region>();
					this.regions.add(region);
				}
				
				if(regionLogic.getRegion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=RegionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					regionLogic.getRegionsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RegionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RegionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=regionLogic.getRegions()==null||regionLogic.getRegions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=regions==null|| regions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						regionsAux=new ArrayList<Region>();
						regionsAux.addAll(regionLogic.getRegions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							regionsAux=new ArrayList<Region>();
							regionsAux.addAll(regions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							regionLogic.getRegionsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RegionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RegionConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRegions("FK_IdPais",regionLogic.getRegions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRegions("FK_IdPais",regions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						regionLogic.setRegions(new ArrayList<Region>());
						regionLogic.getRegions().addAll(regionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							regions=new ArrayList<Region>();
							regions.addAll(regionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRegion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRegion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=regionLogic.getRegions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=regions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=regionLogic.getRegions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=regions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Region region) {
		Boolean permite=true;
		
		if(this.region.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RegionConstantesFunciones.getOrderByListaRegion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RegionConstantesFunciones.getOrderByListaRegion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Region region:regionLogic.getRegions()) {
				if(region.getsType().equals(Constantes2.S_TOTALES)) {
					regionTotales=region;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Region region:this.regions) {
				if(region.getsType().equals(Constantes2.S_TOTALES)) {
					regionTotales=region;
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
			this.regionAux=new Region();
			this.regionAux.setsType(Constantes2.S_TOTALES);
			this.regionAux.setIsNew(false);
			this.regionAux.setIsChanged(false);
			this.regionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RegionConstantesFunciones.TotalizarValoresFilaRegion(this.regionLogic.getRegions(),this.regionAux);
				
				this.regionLogic.getRegions().add(this.regionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RegionConstantesFunciones.TotalizarValoresFilaRegion(this.regions,this.regionAux);
				
				this.regions.add(this.regionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		regionTotales=new Region();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.regionLogic.getRegions().remove(regionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.regions.remove(regionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		regionTotales=new Region();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Region region:regionLogic.getRegions()) {
				if(region.getsType().equals(Constantes2.S_TOTALES)) {
					regionTotales=region;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RegionConstantesFunciones.TotalizarValoresFilaRegion(this.regionLogic.getRegions(),regionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Region region:this.regions) {
				if(region.getsType().equals(Constantes2.S_TOTALES)) {
					regionTotales=region;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RegionConstantesFunciones.TotalizarValoresFilaRegion(this.regions,regionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRegionsFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRegionPorIdPaisPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorIdPaisPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	public void getRegionPorIdPorIdPais()throws Exception {
		try {
			sAccionBusqueda="PorIdPorIdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getRegionsFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					regionLogic.getRegionsFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRegionPorIdPaisPorNombre(Long id_pais,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					regionLogic.getRegionPorIdPaisPorNombre(id_pais,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRegionPorIdPorIdPais(Long id,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					regionLogic.getRegionPorIdPorIdPais(id,id_pais);
				
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
	
	public void inicializarPermisosRegion() {
		this.isPermisoTodoRegion=false;
		this.isPermisoNuevoRegion=false;
		this.isPermisoActualizarRegion=false;
		this.isPermisoActualizarOriginalRegion=false;
		this.isPermisoEliminarRegion=false;
		this.isPermisoGuardarCambiosRegion=false;
		this.isPermisoConsultaRegion=false;
		this.isPermisoBusquedaRegion=false;
		this.isPermisoReporteRegion=false;		
		this.isPermisoOrdenRegion=false;		
		this.isPermisoPaginacionMedioRegion=false;		
		this.isPermisoPaginacionAltoRegion=false;
		this.isPermisoPaginacionTodoRegion=false;
		this.isPermisoCopiarRegion=false;		
		this.isPermisoVerFormRegion=false;		
		this.isPermisoDuplicarRegion=false;		
		this.isPermisoOrdenRegion=false;		
	}
	
	public void setPermisosUsuarioRegion(Boolean isPermiso) {
		this.isPermisoTodoRegion=isPermiso;
		this.isPermisoNuevoRegion=isPermiso;
		this.isPermisoActualizarRegion=isPermiso;
		this.isPermisoActualizarOriginalRegion=isPermiso;
		this.isPermisoEliminarRegion=isPermiso;
		this.isPermisoGuardarCambiosRegion=isPermiso;
		this.isPermisoConsultaRegion=isPermiso;
		this.isPermisoBusquedaRegion=isPermiso;
		this.isPermisoReporteRegion=isPermiso;
		this.isPermisoOrdenRegion=isPermiso;		
		this.isPermisoPaginacionMedioRegion=isPermiso;		
		this.isPermisoPaginacionAltoRegion=isPermiso;		
		this.isPermisoPaginacionTodoRegion=isPermiso;		
		this.isPermisoCopiarRegion=isPermiso;		
		this.isPermisoVerFormRegion=isPermiso;		
		this.isPermisoDuplicarRegion=isPermiso;
		this.isPermisoOrdenRegion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRegion(Boolean isPermiso) {
		//this.isPermisoTodoRegion=isPermiso;
		this.isPermisoNuevoRegion=isPermiso;
		this.isPermisoActualizarRegion=isPermiso;
		this.isPermisoActualizarOriginalRegion=isPermiso;
		this.isPermisoEliminarRegion=isPermiso;
		this.isPermisoGuardarCambiosRegion=isPermiso;
		//this.isPermisoConsultaRegion=isPermiso;
		//this.isPermisoBusquedaRegion=isPermiso;
		//this.isPermisoReporteRegion=isPermiso;
		//this.isPermisoOrdenRegion=isPermiso;		
		//this.isPermisoPaginacionMedioRegion=isPermiso;		
		//this.isPermisoPaginacionAltoRegion=isPermiso;		
		//this.isPermisoPaginacionTodoRegion=isPermiso;		
		//this.isPermisoCopiarRegion=isPermiso;		
		//this.isPermisoDuplicarRegion=isPermiso;
		//this.isPermisoOrdenRegion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRegionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProvinciaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(RegionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionRegionClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProvincia=false;
		this.isTienePermisosProvincia=this.verificarGetPermisosUsuarioOpcionRegionClaseRelacionada(this.opcionsRelacionadas,ProvinciaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroCarteraDefecto=false;
		this.isTienePermisosParametroCarteraDefecto=this.verificarGetPermisosUsuarioOpcionRegionClaseRelacionada(this.opcionsRelacionadas,ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebRegion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRegionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosProvincia=conPermiso;
		this.isTienePermisosParametroCarteraDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioRegionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRegionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRegionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormRegion!=null && this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRegion.jTabbedPaneRelacionesRegion.remove(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProvincia && this.jInternalFrameDetalleFormRegion!=null && this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRegion.jTabbedPaneRelacionesRegion.remove(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroCarteraDefecto && this.jInternalFrameDetalleFormRegion!=null && this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRegion.jTabbedPaneRelacionesRegion.remove(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioRegion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RegionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.regionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RegionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRegion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRegion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRegion=this.isPermisoActualizarRegion;
			this.isPermisoEliminarRegion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRegion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRegion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRegion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRegion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRegion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRegion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRegion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRegion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRegion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRegion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRegion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRegion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRegion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.regionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRegion.setToolTipText(this.jTableDatosRegion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRegion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRegion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RegionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RegionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRegion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.regionConstantesFunciones.mostrarClienteRegion && !RegionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProvincia && this.regionConstantesFunciones.mostrarProvinciaRegion && !RegionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Provincia");
			reporte.setsDescripcion("Provincia");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroCarteraDefecto && this.regionConstantesFunciones.mostrarParametroCarteraDefectoRegion && !RegionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Cartera Defecto");
			reporte.setsDescripcion("Parametro Cartera Defecto");
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
	public void inicializarCombosForeignKeyRegionListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRegionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RegionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRegionListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyRegionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RegionParameterReturnGeneral regionReturnGeneral=new RegionParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.regionConstantesFunciones.cargarid_paisRegion)
					 || (this.esRecargarFks && this.regionConstantesFunciones.cargarid_paisRegion)) {

					if(!this.regionSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+regionSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				regionReturnGeneral=regionLogic.cargarCombosLoteForeignKeyRegion(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=regionReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRegion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.regionSessionBean==null) {
				this.regionSessionBean=new RegionSessionBean();
			}

			if(!this.regionSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
	
	public void initActionsCombosTodosForeignKeyRegion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRegion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRegion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRegion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRegion(Region region)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(region.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRegion(Region region,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRegion()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.regionConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRegion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRegion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRegion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRegion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRegion()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRegion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRegion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion!=null && this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion.getItemCount()>0) {
				this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public RegionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RegionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RegionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.regionSessionBean=new RegionSessionBean(); 
		this.regionConstantesFunciones=new RegionConstantesFunciones(); 
		this.regionBean=new Region();//(this.regionConstantesFunciones); 		
		this.regionReturnGeneral=new RegionParameterReturnGeneral(); 
		
		this.regionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.regionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RegionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RegionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RegionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRegion(true);
			
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
			
			this.regionConstantesFunciones=new RegionConstantesFunciones(); 
			this.regionBean=new Region();//this.regionConstantesFunciones); 			
			this.regionReturnGeneral=new RegionParameterReturnGeneral(); 
		
			RegionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Region Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.region=new Region();
			this.regions = new ArrayList<Region>();
			this.regionsAux = new ArrayList<Region>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic=new RegionLogic();
				this.regionLogic.getNewConnexionToDeep("");
			}
			
			//this.regionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.regionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRegion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRegion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRegion);	
					}
					
					if(this.jInternalFrameImportacionRegion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRegion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRegion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRegion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRegion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRegion);
				this.jInternalFrameDetalleFormRegion.setVisible(false);
				this.jInternalFrameDetalleFormRegion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRegion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRegion);
					this.jInternalFrameReporteDinamicoRegion.setVisible(false);
					this.jInternalFrameReporteDinamicoRegion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRegion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRegion);
					this.jInternalFrameImportacionRegion.setVisible(false);
					this.jInternalFrameImportacionRegion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRegion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRegion);
					this.jInternalFrameOrderByRegion.setVisible(false);
					this.jInternalFrameOrderByRegion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRegionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RegionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.regionReturnGeneral=new RegionParameterReturnGeneral();
			
			this.regionParameterGeneral=new RegionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.regionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.regionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RegionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.regionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProvinciaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RegionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.regionSessionBean.getEsGuardarRelacionado(),this.regionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RegionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.regionSessionBean.getEsGuardarRelacionado(),this.regionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRegion=false;
			this.isVisibilidadCeldaDuplicarRegion=true;
			this.isVisibilidadCeldaCopiarRegion=true;
			this.isVisibilidadCeldaVerFormRegion=true;
			this.isVisibilidadCeldaOrdenRegion=true;
			this.isVisibilidadCeldaNuevoRelacionesRegion=false;
			this.isVisibilidadCeldaModificarRegion=false;
			this.isVisibilidadCeldaActualizarRegion=false;
			this.isVisibilidadCeldaEliminarRegion=false;
			this.isVisibilidadCeldaCancelarRegion=false;
			this.isVisibilidadCeldaGuardarRegion=false;
			this.isVisibilidadCeldaGuardarCambiosRegion=false;
			
			
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRegion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRegion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRegion(false);
			
			this.setPermisosUsuarioRegion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.regionSessionBean.getEsGuardarRelacionado() 
				|| (this.regionSessionBean.getEsGuardarRelacionado() && this.regionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRegionClasesRelacionadas();
			}
			
			if(this.regionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRegionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RegionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRegion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRegion();
			}
			
			if(!this.isPermisoBusquedaRegion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRegion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.regionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRegion,this.isPermisoPaginacionMedioRegion,this.isPermisoPaginacionTodoRegion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RegionConstantesFunciones.getTiposSeleccionarRegion());
				
				this.tiposColumnasSelect=RegionConstantesFunciones.getTiposSeleccionarRegion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectRegion();				
				//this.tiposRelacionesSelect=RegionConstantesFunciones.getTiposRelacionesRegion(true);
				
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
			//if(!this.regionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRegion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioRegion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioRegion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRegion() ;
			
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
			
			
			this.clienteLogic=new ClienteLogic();
			this.provinciaLogic=new ProvinciaLogic();
			this.parametrocarteradefectoLogic=new ParametroCarteraDefectoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.paisLogic=new PaisLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				regionImplementable= (RegionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RegionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				regionImplementableHome= (RegionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RegionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.regions= new ArrayList<Region>();
			this.regionsEliminados= new ArrayList<Region>();
						
			this.isEsNuevoRegion=false;
			this.esParaAccionDesdeFormularioRegion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRegion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRegion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.regionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RegionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RegionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRegion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRegion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRegion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRegion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRegion();
			}
			
			RegionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRegion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRegion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRegion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRegion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Region: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRegion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ProvinciaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProvinciaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRegion")) {
				iIndex=this.jInternalFrameDetalleFormRegion.jTabbedPaneRelacionesRegion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRegion.jTabbedPaneRelacionesRegion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRegion.getSelectedRow();	
				
				

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessRegion();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Cartera Defectos")) {
					if(!ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessRegion();

						this.cargarParteTabPanelRelacionadaParametroCarteraDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Provinciaes")) {
					if(!ProvinciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessRegion();

						this.cargarParteTabPanelRelacionadaProvincia(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRegion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormRegion.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesRegion.updateUI();
		//this.jTabbedPaneRelacionesRegion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesRegion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroCarteraDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormRegion.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(false,true,iIndex);
		this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();

		//this.jTabbedPaneRelacionesRegion.updateUI();
		//this.jTabbedPaneRelacionesRegion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesRegion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProvincia(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormRegion.cargarSessionConBeanSwingJInternalFrameProvincia(false,true,iIndex);
		this.jButtonProvinciaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProvincia();

		//this.jTabbedPaneRelacionesRegion.updateUI();
		//this.jTabbedPaneRelacionesRegion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesRegion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosRegion.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Provincia")) {
				int row=this.jTableDatosRegion.getSelectedRow();
				jButtonProvinciaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroCarteraDefecto")) {
				int row=this.jTableDatosRegion.getSelectedRow();
				jButtonParametroCarteraDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.regionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.regionConstantesFunciones.mostrarClienteRegion && !RegionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(regionConstantesFunciones.resaltarClienteRegion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(regionConstantesFunciones.resaltarClienteRegion);
						}

						jmenuItem.setEnabled(this.regionConstantesFunciones.activarClienteRegion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormRegion.jmenuDetalleRegion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Provincia")) {

					if(this.isTienePermisosProvincia && this.regionConstantesFunciones.mostrarProvinciaRegion && !RegionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Provinciaes"+"("+ProvinciaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Provinciaes");

						if(regionConstantesFunciones.resaltarProvinciaRegion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(regionConstantesFunciones.resaltarProvinciaRegion);
						}

						jmenuItem.setEnabled(this.regionConstantesFunciones.activarProvinciaRegion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Provincia"));

						

						this.jInternalFrameDetalleFormRegion.jmenuDetalleRegion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Cartera Defecto")) {

					if(this.isTienePermisosParametroCarteraDefecto && this.regionConstantesFunciones.mostrarParametroCarteraDefectoRegion && !RegionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Cartera Defectos"+"("+ParametroCarteraDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Cartera Defectos");

						if(regionConstantesFunciones.resaltarParametroCarteraDefectoRegion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(regionConstantesFunciones.resaltarParametroCarteraDefectoRegion);
						}

						jmenuItem.setEnabled(this.regionConstantesFunciones.activarParametroCarteraDefectoRegion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroCarteraDefecto"));

						

						this.jInternalFrameDetalleFormRegion.jmenuDetalleRegion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyRegion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRegion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRegion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRegionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRegion();
		
		this.cargarCombosFrameForeignKeyRegion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRegion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRegion();
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
	
	public void jButtonNuevoRegionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.regionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRegion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			
			
			if(jTableDatosRegion.getRowCount()>=1) {
				jTableDatosRegion.removeRowSelectionInterval(0, jTableDatosRegion.getRowCount()-1);						
			}
			
			this.isEsNuevoRegion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRegion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRegion(true);			
			//this.region=new Region();
			//this.region.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRegion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRegion() ;
			
			if(RegionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRegion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.region);	
			this.actualizarInformacion("INFO_PADRE",false,this.region);				
			
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			
			if(this.regionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Region: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRegionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Region> regionsSeleccionados=new ArrayList<Region>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRegion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRegion.getSelectedRows().length;			
			}
			
			regionsSeleccionados=this.getRegionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRegion--;			
				//Region regionAux= new Region();			
				//regionAux.setId(this.iIdNuevoRegion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Region regionOrigen=new Region();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Region regionOrigen : regionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRegion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							regionOrigen =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							regionOrigen =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRegion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.region.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRegion(regionOrigen,this.region,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.regionLogic.getRegions().add(this.regionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.regions.add(this.regionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRegion(false);
				
				this.jTableDatosRegion.setRowSelectionInterval(this.getIndiceNuevoRegion(), this.getIndiceNuevoRegion());
				
				int iLastRow =  this.jTableDatosRegion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRegion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRegion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRegion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Region> regionsSeleccionados=new ArrayList<Region>();									
		
			Region regionOrigen=new Region();
			Region regionDestino=new Region();
				
			regionsSeleccionados=this.getRegionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRegion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || regionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRegion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						regionOrigen =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						regionOrigen =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						regionDestino =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						regionDestino =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				regionOrigen =regionsSeleccionados.get(0);
				regionDestino =regionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRegion(regionOrigen,regionDestino,true,false);
				
				regionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(regionDestino,regionLogic.getRegions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(regionDestino,regions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRegion(false);
				
				//this.jTableDatosRegion.setRowSelectionInterval(this.getIndiceNuevoRegion(), this.getIndiceNuevoRegion());
				
				int iLastRow =  this.jTableDatosRegion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRegion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRegion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRegion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRegion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRegion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRegion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRegion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRegion.setVisible(!isVisible);
			this.jPanelPaginacionRegion.setVisible(!isVisible);
			this.jPanelAccionesRegion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRegion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRegion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRegion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRegion();
			
			this.abrirFrameOrderByRegion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRegion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRegion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRegion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRegion.isMaximum()) {
					this.jInternalFrameDetalleFormRegion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRegion.setSize(this.jInternalFrameDetalleFormRegion.iWidthFormulario,this.jInternalFrameDetalleFormRegion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRegion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRegion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRegion.isMaximum()) {
						this.jInternalFrameDetalleFormRegion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRegion.jContentPaneDetalleRegion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRegion.jTabbedPaneRelacionesRegion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRegion.jContentPaneDetalleRegion.getWidth(),RegionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRegion.jTabbedPaneRelacionesRegion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRegion.jContentPaneDetalleRegion.getWidth(),RegionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRegion.jTabbedPaneRelacionesRegion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRegion.jContentPaneDetalleRegion.getWidth(),RegionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();
					}

					if(ProvinciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProvincia();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRegion.setVisible(true);
	        this.jInternalFrameDetalleFormRegion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRegion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRegion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRegion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRegion,false,this);
				} else {
					this.jInternalFrameOrderByRegion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRegion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRegion);
				this.jInternalFrameOrderByRegion.setVisible(false);
				this.jInternalFrameOrderByRegion.setSelected(false);
				
				this.jInternalFrameOrderByRegion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRegion"));
				
				this.inicializarActualizarBindingTablaOrderByRegion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRegion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRegion==null) {
				
				this.jInternalFrameImportacionRegion=new ImportacionJInternalFrame(RegionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRegion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRegion);
				this.jInternalFrameImportacionRegion.setVisible(false);
				this.jInternalFrameImportacionRegion.setSelected(false);


				this.jInternalFrameImportacionRegion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRegion"));
				this.jInternalFrameImportacionRegion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRegion"));
				this.jInternalFrameImportacionRegion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRegion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRegion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRegion==null) {
				this.jInternalFrameReporteDinamicoRegion=new ReporteDinamicoJInternalFrame(RegionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRegion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRegion);
				this.jInternalFrameReporteDinamicoRegion.setVisible(false);
				this.jInternalFrameReporteDinamicoRegion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRegion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRegion"));
				this.jInternalFrameReporteDinamicoRegion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRegion"));
				this.jInternalFrameReporteDinamicoRegion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRegion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRegion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormRegion.jContentPaneDetalleRegion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroCarteraDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormRegion.jContentPaneDetalleRegion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProvincia() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormRegion.jContentPaneDetalleRegion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleRegion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRegion);
			
	       	this.jInternalFrameDetalleFormRegion.setVisible(false);
	        this.jInternalFrameDetalleFormRegion.setSelected(false);
			
			//this.jInternalFrameDetalleFormRegion.dispose();
			//this.jInternalFrameDetalleFormRegion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRegion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRegion.setVisible(true);
	        this.jInternalFrameReporteDinamicoRegion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRegion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRegion.setVisible(true);
	        this.jInternalFrameImportacionRegion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRegion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRegion.setVisible(true);
	        this.jInternalFrameOrderByRegion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRegion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRegion.setVisible(false);
	        this.jInternalFrameOrderByRegion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRegion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRegion.setVisible(false);
	        this.jInternalFrameReporteDinamicoRegion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRegion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRegion.setVisible(false);
	        this.jInternalFrameImportacionRegion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRegionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRegion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRegion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRegion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRegion(true);
			//this.isEsNuevoRegion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRegion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRegion(false) ;
			
			if(regionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaSessionBean.getEsGuardarRelacionado() && ProvinciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProvinciaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(RegionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRegion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRegion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRegionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRegion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRegion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRegion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRegion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRegion(true);
			//this.isEsNuevoRegion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.region.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRegion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRegion(false) ;
			
			if(RegionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRegion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRegion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRegion,RegionConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRegion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarRegionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRegion(false);
			
			//if(!this.isEsNuevoRegion) {								
				int intSelectedRow = this.jTableDatosRegion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRegion(this.region,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);
				
			}
			
			if(this.permiteMantenimiento(this.region)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.regionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRegion=true;
					this.inicializarActualizarBindingTablaRegion(false);
					this.isEsNuevoRegion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRegion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRegion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRegion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRegion(false);
				
				this.habilitarDeshabilitarControlesRegion(false);
			
												
				
				if(RegionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRegion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRegionActionPerformed(evt,regionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRegion(this.region,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRegion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,regionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.region.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Region.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Region.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRegionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRegion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				this.region.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				this.region.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.region)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.regionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RegionModel) this.jTableDatosRegion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRegion=true;
				this.inicializarActualizarBindingTablaRegion(false);
				this.isEsNuevoRegion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRegion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRegion(false);
				
				this.habilitarDeshabilitarControlesRegion(false);
				
				
				
				if(RegionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRegion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRegionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRegion.getRowCount()>=1) {
				jTableDatosRegion.removeRowSelectionInterval(0, jTableDatosRegion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRegion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRegion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRegion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRegion(false) ;
			
			this.isEsNuevoRegion=false;
			
			if(RegionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRegion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRegionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRegion(false);
				
				//SI ES MANUAL
				if(RegionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRegion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRegionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRegion--;			
			//Region regionAux= new Region();			
			//regionAux.setId(this.iIdNuevoRegion);
			
			if(this.jInternalFrameDetalleFormRegion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRegion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);
			
			this.region.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.regionLogic.getRegions().add(this.regionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.regions.add(this.regionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRegion(false);
			
			this.jTableDatosRegion.setRowSelectionInterval(this.getIndiceNuevoRegion(), this.getIndiceNuevoRegion());
			
			int iLastRow =  this.jTableDatosRegion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRegion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRegion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRegion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRegionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRegion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRegion(false);
			
			//SI ES MANUAL
			if(RegionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRegion();
			}
			
			//this.abrirFrameTreeRegion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRegionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE RegionES ?", "MANTENIMIENTO DE Region", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRegion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRegion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.regionReturnGeneral=regionLogic.procesarImportacionRegionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.regionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRegionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRegionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRegion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRegion.setFileImportacion(this.jInternalFrameImportacionRegion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRegion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRegion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRegion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRegion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRegionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Region> regionsSeleccionados=new ArrayList<Region>();		

		regionsSeleccionados=this.getRegionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRegion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRegion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RegionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RegionBaseDesign.jrxml";
			
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
			
			this.generarReporteRegions("Todos",regionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.regionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Region",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRegion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRegion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RegionConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RegionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RegionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoRegion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRegion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRegion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RegionConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case RegionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case RegionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRegion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RegionConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case RegionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case RegionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRegion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRegion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RegionConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case RegionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case RegionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoRegionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Region> regionsSeleccionados=new ArrayList<Region>();		
		
		regionsSeleccionados=this.getRegionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"region";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Regions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRegion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRegion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RegionConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RegionConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(Region region:regionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(region.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RegionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RegionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Region region:regionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(region.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RegionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RegionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Region region:regionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(region.getnombre());
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
			//	this.getFilaCabeceraExportarExcelRegion(row);				
			//	iRow++;
			//}				
			
			//for(Region regionAux:regionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRegion(regionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.regionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Region",JOptionPane.INFORMATION_MESSAGE);
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
				this.regionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRegion(false);
			
			//SI ES MANUAL
			if(RegionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRegion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRegionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRegion(false);
			
			//SI ES MANUAL
			if(RegionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRegion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRegionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRegion(false);
			
			//SI ES MANUAL
			if(RegionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRegion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRegion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRegion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRegion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRegion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRegion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRegion.setMinimumSize(dimensionMinimum);
		this.jTableDatosRegion.setMaximumSize(dimensionMaximum);
		this.jTableDatosRegion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRegion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRegion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRegion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRegion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRegion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.regionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRegion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRegion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRegion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RegionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RegionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRegion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRegion();
		
		this.inicializarActualizarBindingBotonesManualRegion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.regionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRegion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRegion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRegion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRegion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRegion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRegion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRegion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRegion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRegion.jCheckBoxPostAccionNuevoRegion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRegion.jCheckBoxPostAccionSinCerrarRegion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRegion.jCheckBoxPostAccionSinMensajeRegion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRegion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRegion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRegion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRegion!=null) {
				this.jInternalFrameDetalleFormRegion.jCheckBoxPostAccionNuevoRegion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRegion.jCheckBoxPostAccionSinCerrarRegion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRegion.jCheckBoxPostAccionSinMensajeRegion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRegion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRegion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRegion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRegion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRegion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRegion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRegion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRegion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRegion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRegion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRegion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRegion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRegion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRegion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRegion(Boolean esInicializar) throws Exception {
		try	{	
			if(RegionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRegion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRegion() throws Exception {
		try	{
			if(RegionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRegion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRegion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRegion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRegion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRegion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRegion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRegion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRegion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRegion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRegion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRegion.addItem(reporte);
			}
			
			
			if(!this.regionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRegion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRegion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRegion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRegion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRegion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRegion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRegion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRegion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRegion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRegion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRegion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRegion!=null) {
				this.jInternalFrameReporteDinamicoRegion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRegion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRegion!=null) {
				this.jInternalFrameReporteDinamicoRegion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRegion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRegion!=null) {
				
				if(this.jInternalFrameReporteDinamicoRegion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRegion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRegion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRegion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRegion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRegion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRegion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisFK_IdPaisRegion.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisRegion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRegion(Boolean esInicializar) throws Exception {				
		if(RegionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRegion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRegion() throws Exception {
		this.inicializarActualizarBindingTablaRegion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRegion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRegion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRegion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRegion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RegionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRegion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRegion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RegionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRegionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRegionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RegionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRegion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRegion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RegionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRegion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRegion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=regionLogic.getRegions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=regions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRegion.setModel(new RegionModel(this.regionLogic.getRegions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRegion.setModel(new RegionModel(this.regions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRegion!=null && this.jInternalFrameOrderByRegion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRegion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRegion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RegionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RegionConstantesFunciones.SCLASSWEBTITULO,regionConstantesFunciones.resaltarSeleccionarRegion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RegionConstantesFunciones.SCLASSWEBTITULO,regionConstantesFunciones.resaltarSeleccionarRegion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRegion,RegionConstantesFunciones.LABEL_ID));

		if(this.regionConstantesFunciones.mostraridRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RegionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.regionConstantesFunciones.resaltaridRegion,this.regionConstantesFunciones.activaridRegion,this,true,"idRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.regionConstantesFunciones.resaltaridRegion,this.regionConstantesFunciones.activaridRegion,this,true,"idRegion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRegion,RegionConstantesFunciones.LABEL_IDPAIS));

		if(this.regionConstantesFunciones.mostrarid_paisRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RegionConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.regionConstantesFunciones.resaltarid_paisRegion,this,this.regionConstantesFunciones.activarid_paisRegion));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.regionConstantesFunciones.resaltarid_paisRegion,this,this.regionConstantesFunciones.activarid_paisRegion,true,"id_paisRegion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RegionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRegion,RegionConstantesFunciones.LABEL_CODIGO));

		if(this.regionConstantesFunciones.mostrarcodigoRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RegionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.regionConstantesFunciones.resaltarcodigoRegion,this.regionConstantesFunciones.activarcodigoRegion,this,true,"codigoRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.regionConstantesFunciones.resaltarcodigoRegion,this.regionConstantesFunciones.activarcodigoRegion,this,true,"codigoRegion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RegionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRegion,RegionConstantesFunciones.LABEL_NOMBRE));

		if(this.regionConstantesFunciones.mostrarnombreRegion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RegionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.regionConstantesFunciones.resaltarnombreRegion,this.regionConstantesFunciones.activarnombreRegion,this,true,"nombreRegion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.regionConstantesFunciones.resaltarnombreRegion,this.regionConstantesFunciones.activarnombreRegion,this,true,"nombreRegion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RegionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.regionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.regionConstantesFunciones.mostrarClienteRegion && !RegionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(regionConstantesFunciones.resaltarClienteRegion,this,this.regionConstantesFunciones.activarClienteRegion));
				tableColumn.setCellEditor(new ClienteTableCell(regionConstantesFunciones.resaltarClienteRegion,this,this.regionConstantesFunciones.activarClienteRegion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosRegion.addColumn(tableColumn);
			}

			if(this.isTienePermisosProvincia && this.regionConstantesFunciones.mostrarProvinciaRegion && !RegionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Provinciaes");
				tableColumn.setHeaderValue("Provinciaes");
				tableColumn.setCellRenderer(new ProvinciaTableCell(regionConstantesFunciones.resaltarProvinciaRegion,this,this.regionConstantesFunciones.activarProvinciaRegion));
				tableColumn.setCellEditor(new ProvinciaTableCell(regionConstantesFunciones.resaltarProvinciaRegion,this,this.regionConstantesFunciones.activarProvinciaRegion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosRegion.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroCarteraDefecto && this.regionConstantesFunciones.mostrarParametroCarteraDefectoRegion && !RegionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Cartera Defectos");
				tableColumn.setHeaderValue("Parametro Cartera Defectos");
				tableColumn.setCellRenderer(new ParametroCarteraDefectoTableCell(regionConstantesFunciones.resaltarParametroCarteraDefectoRegion,this,this.regionConstantesFunciones.activarParametroCarteraDefectoRegion));
				tableColumn.setCellEditor(new ParametroCarteraDefectoTableCell(regionConstantesFunciones.resaltarParametroCarteraDefectoRegion,this,this.regionConstantesFunciones.activarParametroCarteraDefectoRegion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosRegion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.regionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.regionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRegion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.regionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.regionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRegion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRegion && this.isPermisoGuardarCambiosRegion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.regionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.regionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRegion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.regionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosRegion.addColumn(tableColumn);
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
			
			this.jTableDatosRegion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRegion && this.isPermisoGuardarCambiosRegion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.regionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRegion && this.isPermisoGuardarCambiosRegion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRegion.moveColumn(this.jTableDatosRegion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRegion.moveColumn(this.jTableDatosRegion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.regionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosRegion.moveColumn(this.jTableDatosRegion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRegion.moveColumn(this.jTableDatosRegion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRegion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRegion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRegion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRegion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRegion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRegion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRegion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRegion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=regionLogic.getRegions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=regions.size()-1;
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
		//this.jTableDatosRegion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRegion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRegion();
			
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
				
				//this.isEsNuevoRegion=false;
					
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			
				if(this.regionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRegion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRegion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRegion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.region.getsType().equals("DUPLICADO")
				   || this.region.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRegion=true;
				
				} else {
					this.isEsNuevoRegion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.regionSessionBean.getEsGuardarRelacionado()) {
					if(this.region.getId()>=0 && !this.region.getIsNew()) {						
						this.isEsNuevoRegion=false;
						
					} else {
						this.isEsNuevoRegion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRegion(esRelaciones);						
				
				this.seleccionarRegion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.region.getId()<0) {
					this.isEsNuevoRegion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRegion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRegion(evt,rowIndex);
				}	
				
				if(this.regionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Region: " + this.dDif); 
					}
				}								
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRegion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.region)) {
					if(this.region.getId()>0) {
						this.region.setIsDeleted(true);
						
						this.regionsEliminados.add(this.region);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.regionLogic.getRegions().remove(this.region);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.regions.remove(this.region);				
					}
					
					
					((RegionModel) this.jTableDatosRegion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRegion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRegion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRegion) {
			
			if(this.jInternalFrameDetalleFormRegion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRegion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRegion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRegion(this.region);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.regionConstantesFunciones.cargarid_paisRegion || this.regionConstantesFunciones.event_dependid_paisRegion) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.region.getid_pais());
									//this.inicializarActualizarBindingRegion(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(region.getPais()!=null) {
							this.paissForeignKey.add(region.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.region.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRegion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRegion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRegion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRegion(Region region) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRegion(region,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRegion(Region region,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRegion(region);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRegion(region,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRegion(region);
	}
	
	public void setVariablesObjetoActualToFormularioRegion(Region region) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRegion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRegion.jLabelidRegion.setText(region.getId().toString());
			this.jInternalFrameDetalleFormRegion.jTextFieldcodigoRegion.setText(region.getcodigo());
			this.jInternalFrameDetalleFormRegion.jTextAreanombreRegion.setText(region.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Region regionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,regionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Region regionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				regionLocal=this.region;
			} else {
				regionLocal=this.regionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(regionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRegion(regionLocal,true);
					
					if(regionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(regionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.regionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(regionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRegion(Region region,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRegion(region,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRegion(region);
	}
	
	public void setVariablesFormularioToObjetoActualRegion(Region region,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRegion(region,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRegion(Region region,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRegion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRegion.jLabelidRegion.getText()==null || this.jInternalFrameDetalleFormRegion.jLabelidRegion.getText()=="" || this.jInternalFrameDetalleFormRegion.jLabelidRegion.getText()=="Id") {
				this.jInternalFrameDetalleFormRegion.jLabelidRegion.setText("0");
			}

			if(conColumnasBase) {region.setId(Long.parseLong(this.jInternalFrameDetalleFormRegion.jLabelidRegion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RegionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRegion.jLabelIdRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			region.setcodigo(this.jInternalFrameDetalleFormRegion.jTextFieldcodigoRegion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RegionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRegion.jLabelcodigoRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			region.setnombre(this.jInternalFrameDetalleFormRegion.jTextAreanombreRegion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RegionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRegion.jLabelnombreRegion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRegion(Region regionBean,Region region,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && regionBean.getid_pais()!=null && !regionBean.getid_pais().equals(-1L))) {region.setid_pais(regionBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRegion(Region regionOrigen,Region region,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && regionOrigen.getId()!=null && !regionOrigen.getId().equals(0L))) {region.setId(regionOrigen.getId());}}
			if(conDefault || (!conDefault && regionOrigen.getid_pais()!=null && !regionOrigen.getid_pais().equals(-1L))) {region.setid_pais(regionOrigen.getid_pais());}
			if(conDefault || (!conDefault && regionOrigen.getcodigo()!=null && !regionOrigen.getcodigo().equals(""))) {region.setcodigo(regionOrigen.getcodigo());}
			if(conDefault || (!conDefault && regionOrigen.getnombre()!=null && !regionOrigen.getnombre().equals(""))) {region.setnombre(regionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRegion(Region region) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRegion.jLabelidRegion.setText(region.getId().toString());
			this.jInternalFrameDetalleFormRegion.jTextFieldcodigoRegion.setText(region.getcodigo());
			this.jInternalFrameDetalleFormRegion.jTextAreanombreRegion.setText(region.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRegion(RegionBean regionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRegion.jLabelidRegion.setText(regionBean.getId().toString());
			this.jInternalFrameDetalleFormRegion.jTextFieldcodigoRegion.setText(regionBean.getcodigo());
			this.jInternalFrameDetalleFormRegion.jTextAreanombreRegion.setText(regionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRegion(RegionParameterReturnGeneral regionReturnGeneral,RegionBean regionBean,Boolean conDefault) throws Exception { 
		try {
			Region regionLocal=new Region();
			
			regionLocal=regionReturnGeneral.getRegion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && regionLocal.getId()!=null && !regionLocal.getId().equals(0L))) {regionBean.setId(regionLocal.getId());}}
			if(conDefault || (!conDefault && regionLocal.getid_pais()!=null && !regionLocal.getid_pais().equals(-1L))) {regionBean.setid_pais(regionLocal.getid_pais());}
			if(conDefault || (!conDefault && regionLocal.getcodigo()!=null && !regionLocal.getcodigo().equals(""))) {regionBean.setcodigo(regionLocal.getcodigo());}
			if(conDefault || (!conDefault && regionLocal.getnombre()!=null && !regionLocal.getnombre().equals(""))) {regionBean.setnombre(regionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRegionGenerico(Long idRegionSeleccionado,JComboBox jComboBoxRegion,List<Region> regionsLocal)throws Exception {
		try {
			Region  regionTemp=null;

			for(Region regionAux:regionsLocal) {
				if(regionAux.getId()!=null && regionAux.getId().equals(idRegionSeleccionado)) {
					regionTemp=regionAux;
					break;
				}
			}

			jComboBoxRegion.setSelectedItem(regionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRegionGenerico(JComboBox jComboBoxRegion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRegion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRegion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRegion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRegion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Provincia")) {
			jButtonProvinciaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParametroCarteraDefecto")) {
			jButtonParametroCarteraDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			region=(Region) regionLogic.getRegions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			region =(Region) regions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!region.getIsNew() && !region.getIsChanged() && !region.getIsDeleted()) {
				sDescripcion=region.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=region.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Region regionRow=new Region();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			regionRow=(Region) regionLogic.getRegions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			regionRow=(Region) regions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Region region) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormRegion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.region = (Region)this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.region = (Region)this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(region!=null) {
						this.region = region;
					} else {
						this.region = new Region();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.region)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame;
					}

					List<Region> regions=new ArrayList<Region>();
					regions.add(this.region);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormRegion.cargarClienteBeanSwingJInternalFrame(regions,this.region,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderRegion=(TitledBorder)this.jScrollPanelDatosRegion.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderRegion.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.regionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProvinciaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Region region) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormRegion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.region = (Region)this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.region = (Region)this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(region!=null) {
						this.region = region;
					} else {
						this.region = new Region();
					}
				}

				if(this.isTienePermisosProvincia && this.permiteMantenimiento(this.region)) {
					ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFramePopup=new ProvinciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						provinciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFramePopup;
					} else {
						provinciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame;
					}

					List<Region> regions=new ArrayList<Region>();
					regions.add(this.region);
					if(!esRelacionado) {
						//provinciaBeanSwingJInternalFrame.provinciaSessionBean.setConGuardarRelaciones(false);
						//provinciaBeanSwingJInternalFrame.provinciaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					provinciaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormRegion.cargarProvinciaBeanSwingJInternalFrame(regions,this.region,provinciaBeanSwingJInternalFrame,/*conInicializar,*/provinciaBeanSwingJInternalFrame.provinciaSessionBean.getConGuardarRelaciones(),provinciaBeanSwingJInternalFrame.provinciaSessionBean.getEsGuardarRelacionado());
					provinciaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						provinciaBeanSwingJInternalFrame.actualizarEstadoPanelsProvincia("no_relacionado");

						provinciaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProvinciaConstantesFunciones.ITAMANIOFILATABLA + (ProvinciaConstantesFunciones.ITAMANIOFILATABLA/2));

						provinciaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderRegion=(TitledBorder)this.jScrollPanelDatosRegion.getBorder();
						TitledBorder titledBorderProvincia=(TitledBorder)provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.getBorder();

						titledBorderProvincia.setTitle(titledBorderRegion.getTitle() + " -> Provincia");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,provinciaBeanSwingJInternalFrame);
						}

						provinciaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(provinciaBeanSwingJInternalFrame);

						provinciaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.regionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Provincia",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroCarteraDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Region region) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormRegion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.region = (Region)this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.region = (Region)this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(region!=null) {
						this.region = region;
					} else {
						this.region = new Region();
					}
				}

				if(this.isTienePermisosParametroCarteraDefecto && this.permiteMantenimiento(this.region)) {
					ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFramePopup;
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame;
					}

					List<Region> regions=new ArrayList<Region>();
					regions.add(this.region);
					if(!esRelacionado) {
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormRegion.cargarParametroCarteraDefectoBeanSwingJInternalFrame(regions,this.region,parametrocarteradefectoBeanSwingJInternalFrame,/*conInicializar,*/parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getConGuardarRelaciones(),parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");

						parametrocarteradefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocarteradefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderRegion=(TitledBorder)this.jScrollPanelDatosRegion.getBorder();
						TitledBorder titledBorderParametroCarteraDefecto=(TitledBorder)parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getBorder();

						titledBorderParametroCarteraDefecto.setTitle(titledBorderRegion.getTitle() + " -> Parametro Cartera Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocarteradefectoBeanSwingJInternalFrame);
						}

						parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocarteradefectoBeanSwingJInternalFrame);

						parametrocarteradefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.regionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Cartera Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRegion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRegion.setVisible((this.isVisibilidadCeldaNuevoRegion && this.isPermisoNuevoRegion));			
			this.jButtonDuplicarRegion.setVisible((this.isVisibilidadCeldaDuplicarRegion && this.isPermisoDuplicarRegion));			
			this.jButtonCopiarRegion.setVisible((this.isVisibilidadCeldaCopiarRegion && this.isPermisoCopiarRegion));
			this.jButtonVerFormRegion.setVisible((this.isVisibilidadCeldaVerFormRegion && this.isPermisoVerFormRegion));
			
			this.jButtonAbrirOrderByRegion.setVisible((this.isVisibilidadCeldaOrdenRegion && this.isPermisoOrdenRegion));			
			
			this.jButtonNuevoRelacionesRegion.setVisible((this.isVisibilidadCeldaNuevoRelacionesRegion && this.isPermisoNuevoRegion));			
			this.jButtonNuevoGuardarCambiosRegion.setVisible((this.isVisibilidadCeldaNuevoRegion && this.isPermisoNuevoRegion && this.isPermisoGuardarCambiosRegion));
			
			if(this.jInternalFrameDetalleFormRegion!=null) {
			this.jInternalFrameDetalleFormRegion.jButtonModificarRegion.setVisible((this.isVisibilidadCeldaModificarRegion && this.isPermisoActualizarRegion));	
			this.jInternalFrameDetalleFormRegion.jButtonActualizarRegion.setVisible((this.isVisibilidadCeldaActualizarRegion && this.isPermisoActualizarRegion));	
			this.jInternalFrameDetalleFormRegion.jButtonEliminarRegion.setVisible((this.isVisibilidadCeldaEliminarRegion && this.isPermisoEliminarRegion));
			this.jInternalFrameDetalleFormRegion.jButtonCancelarRegion.setVisible(this.isVisibilidadCeldaCancelarRegion);							
			this.jInternalFrameDetalleFormRegion.jButtonGuardarCambiosRegion.setVisible((this.isVisibilidadCeldaGuardarRegion && this.isPermisoGuardarCambiosRegion));			
			
			}
						
			this.jButtonGuardarCambiosTablaRegion.setVisible((this.isVisibilidadCeldaGuardarCambiosRegion && this.isPermisoGuardarCambiosRegion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRegion.setVisible((this.isVisibilidadCeldaNuevoRegion && this.isPermisoNuevoRegion));						
			this.jButtonDuplicarToolBarRegion.setVisible((this.isVisibilidadCeldaDuplicarRegion && this.isPermisoDuplicarRegion));						
			this.jButtonCopiarToolBarRegion.setVisible((this.isVisibilidadCeldaCopiarRegion && this.isPermisoCopiarRegion));			
			this.jButtonVerFormToolBarRegion.setVisible((this.isVisibilidadCeldaVerFormRegion && this.isPermisoVerFormRegion));			
			this.jButtonAbrirOrderByToolBarRegion.setVisible((this.isVisibilidadCeldaOrdenRegion && this.isPermisoOrdenRegion));
			this.jButtonNuevoRelacionesToolBarRegion.setVisible((this.isVisibilidadCeldaNuevoRelacionesRegion && this.isPermisoNuevoRegion));			
			this.jButtonNuevoGuardarCambiosToolBarRegion.setVisible((this.isVisibilidadCeldaNuevoRegion && this.isPermisoNuevoRegion && this.isPermisoGuardarCambiosRegion));			
			
			if(this.jInternalFrameDetalleFormRegion!=null) {
			this.jInternalFrameDetalleFormRegion.jButtonModificarToolBarRegion.setVisible((this.isVisibilidadCeldaModificarRegion && this.isPermisoActualizarRegion));	
			this.jInternalFrameDetalleFormRegion.jButtonActualizarToolBarRegion.setVisible((this.isVisibilidadCeldaActualizarRegion  && this.isPermisoActualizarRegion));	
			this.jInternalFrameDetalleFormRegion.jButtonEliminarToolBarRegion.setVisible((this.isVisibilidadCeldaEliminarRegion && this.isPermisoEliminarRegion));
			this.jInternalFrameDetalleFormRegion.jButtonCancelarToolBarRegion.setVisible(this.isVisibilidadCeldaCancelarRegion);				
			this.jInternalFrameDetalleFormRegion.jButtonGuardarCambiosToolBarRegion.setVisible((this.isVisibilidadCeldaGuardarRegion && this.isPermisoGuardarCambiosRegion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRegion.setVisible((this.isVisibilidadCeldaGuardarCambiosRegion && this.isPermisoGuardarCambiosRegion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRegion.setVisible((this.isVisibilidadCeldaNuevoRegion && this.isPermisoNuevoRegion));			
			this.jMenuItemDuplicarRegion.setVisible((this.isVisibilidadCeldaDuplicarRegion && this.isPermisoDuplicarRegion));			
			this.jMenuItemCopiarRegion.setVisible((this.isVisibilidadCeldaCopiarRegion && this.isPermisoCopiarRegion));			
			this.jMenuItemVerFormRegion.setVisible((this.isVisibilidadCeldaVerFormRegion && this.isPermisoVerFormRegion));			
			this.jMenuItemAbrirOrderByRegion.setVisible((this.isVisibilidadCeldaOrdenRegion && this.isPermisoOrdenRegion));			
			//this.jMenuItemMostrarOcultarRegion.setVisible((this.isVisibilidadCeldaOrdenRegion && this.isPermisoOrdenRegion));
			this.jMenuItemDetalleAbrirOrderByRegion.setVisible((this.isVisibilidadCeldaOrdenRegion && this.isPermisoOrdenRegion));			
			//this.jMenuItemDetalleMostrarOcultarRegion.setVisible((this.isVisibilidadCeldaOrdenRegion && this.isPermisoOrdenRegion));			
			this.jMenuItemNuevoRelacionesRegion.setVisible((this.isVisibilidadCeldaNuevoRelacionesRegion && this.isPermisoNuevoRegion));			
			this.jMenuItemNuevoGuardarCambiosRegion.setVisible((this.isVisibilidadCeldaNuevoRegion && this.isPermisoNuevoRegion && this.isPermisoGuardarCambiosRegion));									
			
			if(this.jInternalFrameDetalleFormRegion!=null) {
			this.jInternalFrameDetalleFormRegion.jMenuItemModificarRegion.setVisible((this.isVisibilidadCeldaModificarRegion && this.isPermisoActualizarRegion));	
			this.jInternalFrameDetalleFormRegion.jMenuItemActualizarRegion.setVisible((this.isVisibilidadCeldaActualizarRegion && this.isPermisoActualizarRegion));	
			this.jInternalFrameDetalleFormRegion.jMenuItemEliminarRegion.setVisible((this.isVisibilidadCeldaEliminarRegion && this.isPermisoEliminarRegion));
			this.jInternalFrameDetalleFormRegion.jMenuItemCancelarRegion.setVisible(this.isVisibilidadCeldaCancelarRegion);				
			}
			
			this.jMenuItemGuardarCambiosRegion.setVisible((this.isVisibilidadCeldaGuardarRegion && this.isPermisoGuardarCambiosRegion));						
			this.jMenuItemGuardarCambiosTablaRegion.setVisible((this.isVisibilidadCeldaGuardarCambiosRegion && this.isPermisoGuardarCambiosRegion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRegion=this.jButtonNuevoRegion.isVisible();
			this.isVisibilidadCeldaDuplicarRegion=this.jButtonDuplicarRegion.isVisible();
			this.isVisibilidadCeldaCopiarRegion=this.jButtonCopiarRegion.isVisible();
			this.isVisibilidadCeldaVerFormRegion=this.jButtonVerFormRegion.isVisible();
			
			this.isVisibilidadCeldaOrdenRegion=this.jButtonAbrirOrderByRegion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRegion=this.jButtonNuevoRelacionesRegion.isVisible();
			this.isVisibilidadCeldaModificarRegion=this.jButtonModificarRegion.isVisible();
			
			if(this.jInternalFrameDetalleFormRegion!=null) {
			this.isVisibilidadCeldaActualizarRegion=this.jInternalFrameDetalleFormRegion.jButtonActualizarRegion.isVisible();
			this.isVisibilidadCeldaEliminarRegion=this.jInternalFrameDetalleFormRegion.jButtonEliminarRegion.isVisible();
			this.isVisibilidadCeldaCancelarRegion=this.jInternalFrameDetalleFormRegion.jButtonCancelarRegion.isVisible();
			this.isVisibilidadCeldaGuardarRegion=this.jInternalFrameDetalleFormRegion.jButtonGuardarCambiosRegion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRegion=this.jButtonGuardarCambiosTablaRegion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRegion=this.jButtonNuevoToolBarRegion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRegion=this.jButtonNuevoRelacionesToolBarRegion.isVisible();
			
			if(this.jInternalFrameDetalleFormRegion!=null) {
			this.isVisibilidadCeldaModificarRegion=this.jInternalFrameDetalleFormRegion.jButtonModificarToolBarRegion.isVisible();
			this.isVisibilidadCeldaActualizarRegion=this.jInternalFrameDetalleFormRegion.jButtonActualizarToolBarRegion.isVisible();
			this.isVisibilidadCeldaEliminarRegion=this.jInternalFrameDetalleFormRegion.jButtonEliminarToolBarRegion.isVisible();
			this.isVisibilidadCeldaCancelarRegion=this.jInternalFrameDetalleFormRegion.jButtonCancelarToolBarRegion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRegion=this.jButtonGuardarCambiosToolBarRegion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRegion=this.jButtonGuardarCambiosTablaToolBarRegion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRegion=this.jMenuItemNuevoRegion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRegion=this.jMenuItemNuevoRelacionesRegion.isVisible();
			
			if(this.jInternalFrameDetalleFormRegion!=null) {
			this.isVisibilidadCeldaModificarRegion=this.jInternalFrameDetalleFormRegion.jMenuItemModificarRegion.isVisible();
			this.isVisibilidadCeldaActualizarRegion=this.jInternalFrameDetalleFormRegion.jMenuItemActualizarRegion.isVisible();
			this.isVisibilidadCeldaEliminarRegion=this.jInternalFrameDetalleFormRegion.jMenuItemEliminarRegion.isVisible();
			this.isVisibilidadCeldaCancelarRegion=this.jInternalFrameDetalleFormRegion.jMenuItemCancelarRegion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRegion=this.jMenuItemGuardarCambiosRegion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRegion=this.jMenuItemGuardarCambiosTablaRegion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRegion(Boolean esInicializar) {
		if(RegionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.regionSessionBean.getConGuardarRelaciones()) {
				//if(this.regionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRegion();
			}
			
			this.inicializarActualizarBindingBotonesManualRegion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRegion() {
		this.jButtonNuevoRegion.setVisible(this.isPermisoNuevoRegion);			
		this.jButtonDuplicarRegion.setVisible(this.isPermisoDuplicarRegion);			
		this.jButtonCopiarRegion.setVisible(this.isPermisoCopiarRegion);			
		this.jButtonVerFormRegion.setVisible(this.isPermisoVerFormRegion);			
		
		this.jButtonAbrirOrderByRegion.setVisible(this.isPermisoOrdenRegion);					
		
		this.jButtonNuevoRelacionesRegion.setVisible(this.isPermisoNuevoRegion);			
		
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRegion.jButtonModificarRegion.setVisible(this.isPermisoActualizarRegion);	
			this.jInternalFrameDetalleFormRegion.jButtonActualizarRegion.setVisible(this.isPermisoActualizarRegion);	
			this.jInternalFrameDetalleFormRegion.jButtonEliminarRegion.setVisible(this.isPermisoEliminarRegion);
			this.jInternalFrameDetalleFormRegion.jButtonCancelarRegion.setVisible(this.isVisibilidadCeldaCancelarRegion);						
			this.jInternalFrameDetalleFormRegion.jButtonGuardarCambiosRegion.setVisible(this.isPermisoGuardarCambiosRegion);							
		}
		
		this.jButtonGuardarCambiosTablaRegion.setVisible(this.isPermisoActualizarRegion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRegion() {
		this.jInternalFrameDetalleFormRegion.jButtonModificarRegion.setVisible(this.isPermisoActualizarRegion);	
		this.jInternalFrameDetalleFormRegion.jButtonActualizarRegion.setVisible(this.isPermisoActualizarRegion);	
		this.jInternalFrameDetalleFormRegion.jButtonEliminarRegion.setVisible(this.isPermisoEliminarRegion);
		this.jInternalFrameDetalleFormRegion.jButtonCancelarRegion.setVisible(this.isVisibilidadCeldaCancelarRegion);							
		this.jInternalFrameDetalleFormRegion.jButtonGuardarCambiosRegion.setVisible((this.isVisibilidadCeldaGuardarRegion && this.isPermisoGuardarCambiosRegion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRegion() {
		if(RegionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRegion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRegion() {
	}
	
	public void jTableDatosRegionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRegion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRegion(this.getregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.region==null) {
						this.region = new Region();
					}

					this.setVariablesFormularioToObjetoActualRegion(this.region,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);
				}

				if(this.region.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.region.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisRegionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebRegion(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRegion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRegion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRegion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRegion(this.getregion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.regionLogic.getConnexion());

				if(this.region.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.region.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRegion=(TitledBorder)this.jScrollPanelDatosRegion.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderRegion.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRegion(this.getregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.region==null) {
						this.region = new Region();
					}

					this.setVariablesFormularioToObjetoActualRegion(this.region,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);
				}

				if(this.region.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.region.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRegion(this.getregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.region==null) {
						this.region = new Region();
					}

					this.setVariablesFormularioToObjetoActualRegion(this.region,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);
				}

				if(this.region.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.region.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreRegionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRegion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRegion(this.getregion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.region==null) {
						this.region = new Region();
					}

					this.setVariablesFormularioToObjetoActualRegion(this.region,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);
				}

				if(this.region.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.region.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRegion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdPaisRegionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRegion(false,false);

			this.getRegionsFK_IdPais();

			this.inicializarActualizarBindingRegion(false);

			//if(RegionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRegion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.regionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRegion() {
		if(this.jInternalFrameDetalleFormRegion!=null) {
		

		if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormRegion!=null) {
			this.jInternalFrameDetalleFormRegion.setVisible(false);	    			
			this.jInternalFrameDetalleFormRegion.dispose();
			this.jInternalFrameDetalleFormRegion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRegion!=null) {
			this.jInternalFrameReporteDinamicoRegion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRegion.dispose();
			this.jInternalFrameReporteDinamicoRegion=null;
		}
		
		if(this.jInternalFrameImportacionRegion!=null) {
			this.jInternalFrameImportacionRegion.setVisible(false);	    			
			this.jInternalFrameImportacionRegion.dispose();
			this.jInternalFrameImportacionRegion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRegion();
			
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			
			
			if(sTipo.equals("NuevoRegion")) {
				jButtonNuevoRegionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRegion")) {
				jButtonDuplicarRegionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRegion")) {
				jButtonCopiarRegionActionPerformed(evt);
			} else if(sTipo.equals("VerFormRegion")) {
				jButtonVerFormRegionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRegion")) {
				jButtonNuevoRegionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRegion")) {
				jButtonDuplicarRegionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRegion")) {
				jButtonNuevoRegionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRegion")) {
				jButtonDuplicarRegionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRegion")) {
				jButtonNuevoRegionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRegion")) {
				jButtonNuevoRegionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRegion")) {
				jButtonNuevoRegionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRegion")) {
				jButtonModificarRegionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRegion")) {
				jButtonModificarRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRegion")) {
				jButtonModificarRegionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRegion")) {
				jButtonActualizarRegionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRegion")) {
				jButtonActualizarRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRegion")) {
				jButtonActualizarRegionActionPerformed(evt);
			} else if(sTipo.equals("EliminarRegion")) {
				jButtonEliminarRegionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRegion")) {
				jButtonEliminarRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRegion")) {
				jButtonEliminarRegionActionPerformed(evt);
			} else if(sTipo.equals("CancelarRegion")) {
				jButtonCancelarRegionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRegion")) {
				jButtonCancelarRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRegion")) {
				jButtonCancelarRegionActionPerformed(evt);
			} else if(sTipo.equals("CerrarRegion")) {
				jButtonCerrarRegionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRegion")) {
				jButtonCerrarRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRegion")) {
				jButtonCerrarRegionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRegion")) {
				jButtonMostrarOcultarRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRegion")) {
				jButtonCancelarRegionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRegion")) {
				jButtonGuardarCambiosRegionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRegion")) {
				jButtonGuardarCambiosRegionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRegion")) {
				jButtonCopiarRegionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRegion")) {
				jButtonVerFormRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRegion")) {
				jButtonGuardarCambiosRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRegion")) {
				jButtonCopiarRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRegion")) {
				jButtonVerFormRegionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRegion")) {
				jButtonGuardarCambiosRegionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRegion")) {
				jButtonGuardarCambiosRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRegion")) {
				jButtonGuardarCambiosRegionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRegion")) {
				jButtonRecargarInformacionRegionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRegion")) {
				jButtonRecargarInformacionRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRegion")) {
				jButtonRecargarInformacionRegionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRegion")) {
				jButtonAnterioresRegionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRegion")) {
				jButtonAnterioresRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRegion")) {
				jButtonAnterioresRegionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRegion")) {
				jButtonSiguientesRegionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRegion")) {
				jButtonSiguientesRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRegion")) {
				jButtonSiguientesRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRegion") || sTipo.equals("MenuItemDetalleAbrirOrderByRegion")) {
				jButtonAbrirOrderByRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRegion") || sTipo.equals("MenuItemDetalleMostrarOcultarRegion")) {
				jButtonMostrarOcultarRegionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRegion")) {
				jButtonNuevoGuardarCambiosRegionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRegion")) {
				jButtonNuevoGuardarCambiosRegionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRegion")) {
				jButtonNuevoGuardarCambiosRegionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRegion")) {
				jButtonCerrarReporteDinamicoRegionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRegion")) {
				jButtonGenerarReporteDinamicoRegionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRegion")) {
				
				jButtonGenerarExcelReporteDinamicoRegionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRegion")) {
				jButtonCerrarImportacionRegionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRegion")) {
				
				jButtonGenerarImportacionRegionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRegion")) {
				
				jButtonAbrirImportacionRegionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRegion")) {
				jComboBoxTiposAccionesRegionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRegion")) {
				jComboBoxTiposRelacionesRegionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRegion")) {
				jComboBoxTiposAccionesRegionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRegion")) {
				
				jComboBoxTiposSeleccionarRegionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRegion")) {
				jTextFieldValorCampoGeneralRegionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRegion")) {
				jButtonAbrirOrderByRegionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRegion")) {
				jButtonAbrirOrderByRegionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRegion")) {
				jButtonCerrarOrderByRegionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRegionBusqueda")) {
				this.jButtonidRegionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisRegionUpdate")) {
				this.jButtonid_paisRegionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisRegionBusqueda")) {
				this.jButtonid_paisRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoRegionBusqueda")) {
				this.jButtoncodigoRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreRegionBusqueda")) {
				this.jButtonnombreRegionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPaisRegion")) {
				this.jButtonFK_IdPaisRegionActionPerformed(evt);
			}
			
			;
			
			
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRegion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRegionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
				
				this.actualizarInformacion("INFO_PADRE",false,this.region);
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
				


				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Region.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Region.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Region regionLocal=null;
			
			if(!this.getEsControlTabla()) {
				regionLocal=this.region;
			} else {
				regionLocal=this.regionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
				
				this.actualizarInformacion("INFO_PADRE",false,this.region);
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
							
				
				


				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Region.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Region.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRegionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRegion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionAnterior =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.regionAnterior =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
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
			
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			
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
			
			


			
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRegionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
				
				this.actualizarInformacion("INFO_PADRE",false,this.region);
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
								
						
				


				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Region.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Region.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
				
				this.actualizarInformacion("INFO_PADRE",false,this.region);
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
								
				
				


				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Region.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Region.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRegionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRegion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionAnterior =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.regionAnterior =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
				
				this.actualizarInformacion("INFO_PADRE",false,this.region);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRegionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRegion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionAnterior =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.regionAnterior =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRegionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
			
			this.actualizarInformacion("INFO_PADRE",false,this.region);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
				
				this.actualizarInformacion("INFO_PADRE",false,this.region);
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
							
				
				


				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Region.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Region.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRegionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRegion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.regionAnterior =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.regionAnterior =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
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
			
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			
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
			
			


			
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRegionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
			
			this.actualizarInformacion("INFO_PADRE",false,this.region);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
				
				this.actualizarInformacion("INFO_PADRE",false,this.region);
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
								
				
				


				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Region.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Region.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRegionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRegion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionAnterior =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.regionAnterior =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRegionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
			
			this.actualizarInformacion("INFO_PADRE",false,this.region);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRegionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
				
				this.actualizarInformacion("INFO_PADRE",false,this.region);
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRegion")) {
					jCheckBoxSeleccionarTodosRegionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRegion")) {
					jCheckBoxSeleccionadosRegionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRegion")) {
					
				}
				
				


				
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Region.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Region.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.region);
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
												
				
				


				
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Region.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Region.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRegionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRegion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.regionAnterior =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.regionAnterior =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRegionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
				
				this.actualizarInformacion("INFO_PADRE",false,this.region);
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
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
			
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
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
			
			


			
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRegionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
				
				this.actualizarInformacion("INFO_PADRE",false,this.region);
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Region.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Region.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.region);
				
				this.actualizarInformacion("INFO_PADRE",false,this.region);
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
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
				
				


				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Region.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Region.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRegionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRegion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.regionAnterior =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.regionAnterior =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRegion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRegionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRegion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.region =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.region =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.region);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRegion")) {
				
				}
				
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRegion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRegion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRegion")) {
			
			}
			
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRegion();
			
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			
			if(sTipo.equals("NuevoRegion")) {
				jButtonNuevoRegionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRegion")) {
				jButtonDuplicarRegionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRegion")) {
				jButtonCopiarRegionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRegion")) {
				jButtonVerFormRegionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRegion")) {
				jButtonNuevoRegionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRegion")) {
				jButtonModificarRegionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRegion")) {
				jButtonActualizarRegionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRegion")) {
				jButtonEliminarRegionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRegion")) {
				jButtonGuardarCambiosRegionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRegion")) {
				jButtonCancelarRegionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRegion")) {
				jButtonCerrarRegionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRegion")) {
				jButtonGuardarCambiosRegionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRegion")) {
				jButtonNuevoGuardarCambiosRegionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRegion")) {
				jButtonAbrirOrderByRegionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRegion")) {
				jButtonRecargarInformacionRegionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRegion")) {
				jButtonAnterioresRegionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRegion")) {
				jButtonSiguientesRegionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRegionBusqueda")) {
				this.jButtonidRegionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisRegionUpdate")) {
				this.jButtonid_paisRegionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisRegionBusqueda")) {
				this.jButtonid_paisRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoRegionBusqueda")) {
				this.jButtoncodigoRegionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreRegionBusqueda")) {
				this.jButtonnombreRegionBusquedaActionPerformed(evt);
			}
			
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRegion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRegion")) {
				closingInternalFrameRegion();
				
			} else if(sTipo.equals("jButtonCancelarRegion")) {
				JInternalFrameBase jInternalFrameDetalleFormRegion = (JInternalFrameBase)evt.getSource();
	            	
	            RegionBeanSwingJInternalFrame jInternalFrameParent=(RegionBeanSwingJInternalFrame)jInternalFrameDetalleFormRegion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRegionActionPerformed(null);
			}
			
			RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.region,new Object(),this.regionParameterGeneral,this.regionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRegion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRegion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRegion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.region)) {
			if(!esControlTabla) {
				if(RegionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRegion(this.region,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);			
				}
				
				if(this.regionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRegion(this.region,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.regionReturnGeneral=regionLogic.procesarEventosRegionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.regionLogic.getRegions(),this.region,this.regionParameterGeneral,this.isEsNuevoRegion,classes);//this.regionLogic.getRegion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRegion(this.regionReturnGeneral,this.regionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.regionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRegion(classes,this.regionReturnGeneral,this.regionBean,false);
					}
						
					if(this.regionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRegion(this.regionReturnGeneral.getRegion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRegion(this.regionReturnGeneral.getRegion());	
					}
						
					if(this.regionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRegion(this.regionReturnGeneral.getRegion(),classes);//this.regionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRegion(this.region,classes);//this.regionBean);									
				}
			
				if(RegionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRegion(this.region,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRegion(this.region);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.regionAnterior!=null) {
						this.region=this.regionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.regionReturnGeneral=regionLogic.procesarEventosRegionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.regionLogic.getRegions(),this.region,this.regionParameterGeneral,this.isEsNuevoRegion,classes);//this.regionLogic.getRegion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.regionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.regionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.regionReturnGeneral.getRegion(),regionLogic.getRegions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.regionReturnGeneral.getRegion(),this.regions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRegion.repaint();
				
				//((AbstractTableModel) this.jTableDatosRegion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRegion();
			}
		}
	}
	
	public void actualizarVisualTableDatosRegion() throws Exception {
		
		RegionModel regionModel=(RegionModel)this.jTableDatosRegion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			regionModel.regions=this.regionLogic.getRegions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			regionModel.regions=this.regions;
		}
		
		
		((RegionModel) this.jTableDatosRegion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRegion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getregionAnterior(),this.regionLogic.getRegions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getregionAnterior(),this.regions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRegion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRegion(Region region,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(region.getClientes());
					this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Provincia.class)) {
					this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.setProvincias(region.getProvincias());
					this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvincia(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(region.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
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
										
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.region,new Object(),generalEntityParameterGeneral,this.regionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.regionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RegionConstantesFunciones.getClassesRelationshipsOfRegion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RegionConstantesFunciones.getClassesRelationshipsFromStringsOfRegion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRegion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RegionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.region,new Object(),generalEntityParameterGeneral,this.regionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RegionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRegion(RegionBean regionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(region.getClientes());
					this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Provincia.class)) {
					this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.setProvincias(region.getProvincias());
					this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvincia(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(region.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRegion(ArrayList<Classe> classes,RegionReturnGeneral regionReturnGeneral,RegionBean regionBean,Boolean conDefault) throws Exception {
		
			this.regionBean.setClientes(regionReturnGeneral.getRegion().getClientes());
			this.regionBean.setProvincias(regionReturnGeneral.getRegion().getProvincias());
			this.regionBean.setParametroCarteraDefectos(regionReturnGeneral.getRegion().getParametroCarteraDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRegion(Region region,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					region.setClientes(this.jInternalFrameDetalleFormRegion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Provincia.class)) {
					region.setProvincias(this.jInternalFrameDetalleFormRegion.provinciaBeanSwingJInternalFrame.provinciaLogic.getProvincias());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					region.setParametroCarteraDefectos(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.region)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRegion = new RegionDetalleFormJInternalFrame(jDesktopPane,this.regionSessionBean.getConGuardarRelaciones(),this.regionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRegion);
		this.jInternalFrameDetalleFormRegion.setVisible(false);
		this.jInternalFrameDetalleFormRegion.setSelected(false);						
		
		this.jInternalFrameDetalleFormRegion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRegion.regionLogic=this.regionLogic;
		
		this.cargarCombosFrameForeignKeyRegion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRegion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRegion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRegion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRegion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRegion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRegion"));
		
		this.jInternalFrameDetalleFormRegion.jButtonModificarRegion.addActionListener(new ButtonActionListener(this,"ModificarRegion"));

		
		this.jInternalFrameDetalleFormRegion.jButtonModificarToolBarRegion.addActionListener(new ButtonActionListener(this,"ModificarToolBarRegion"));
					
		this.jInternalFrameDetalleFormRegion.jMenuItemModificarRegion.addActionListener(new ButtonActionListener(this,"MenuItemModificarRegion"));		
		
		
		
		this.jInternalFrameDetalleFormRegion.jButtonActualizarRegion.addActionListener (new ButtonActionListener(this,"ActualizarRegion"));
		
		
		this.jInternalFrameDetalleFormRegion.jButtonActualizarToolBarRegion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRegion"));
						
		this.jInternalFrameDetalleFormRegion.jMenuItemActualizarRegion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRegion"));		
		
		
		
		this.jInternalFrameDetalleFormRegion.jButtonEliminarRegion.addActionListener (new ButtonActionListener(this,"EliminarRegion"));
		
		
		this.jInternalFrameDetalleFormRegion.jButtonEliminarToolBarRegion.addActionListener (new ButtonActionListener(this,"EliminarToolBarRegion"));
								
		this.jInternalFrameDetalleFormRegion.jMenuItemEliminarRegion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRegion"));		
		
		
		
		this.jInternalFrameDetalleFormRegion.jButtonCancelarRegion.addActionListener (new ButtonActionListener(this,"CancelarRegion"));
		
		
		this.jInternalFrameDetalleFormRegion.jButtonCancelarToolBarRegion.addActionListener (new ButtonActionListener(this,"CancelarToolBarRegion"));
					
		this.jInternalFrameDetalleFormRegion.jMenuItemCancelarRegion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRegion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRegion.jMenuItemDetalleCerrarRegion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRegion"));		
		
		
		
		this.jInternalFrameDetalleFormRegion.jButtonGuardarCambiosToolBarRegion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRegion"));
		
		
		
		this.jInternalFrameDetalleFormRegion.jButtonGuardarCambiosToolBarRegion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRegion"));
		
		
		
		this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRegion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRegion.jButtonidRegionBusqueda.addActionListener(new ButtonActionListener(this,"idRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRegion.jButtonid_paisRegionUpdate.addActionListener(new ButtonActionListener(this,"id_paisRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRegion.jButtonid_paisRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_paisRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRegion.jButtoncodigoRegionBusqueda.addActionListener(new ButtonActionListener(this,"codigoRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRegion.jButtonnombreRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombreRegionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRegion.jTabbedPaneRelacionesRegion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRegion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRegion"));
		
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRegion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRegion"));
		}
		
		this.jTableDatosRegion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRegion"));
		
		this.jTableDatosRegion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRegion"));
		
		this.jButtonNuevoRegion.addActionListener(new ButtonActionListener(this,"NuevoRegion"));
		
		this.jButtonDuplicarRegion.addActionListener(new ButtonActionListener(this,"DuplicarRegion"));
		
		this.jButtonCopiarRegion.addActionListener(new ButtonActionListener(this,"CopiarRegion"));
		
		this.jButtonVerFormRegion.addActionListener(new ButtonActionListener(this,"VerFormRegion"));
		
		
		this.jButtonNuevoToolBarRegion.addActionListener(new ButtonActionListener(this,"NuevoToolBarRegion"));
			
		this.jButtonDuplicarToolBarRegion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRegion"));
			
		this.jMenuItemNuevoRegion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRegion"));
			
		this.jMenuItemDuplicarRegion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRegion"));		
		
		
		this.jButtonNuevoRelacionesRegion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRegion"));
		
		
		this.jButtonNuevoRelacionesToolBarRegion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRegion"));
			
		this.jMenuItemNuevoRelacionesRegion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRegion"));		
		
		
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRegion.jButtonModificarRegion.addActionListener(new ButtonActionListener(this,"ModificarRegion"));
		}
		
		
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRegion.jButtonModificarToolBarRegion.addActionListener(new ButtonActionListener(this,"ModificarToolBarRegion"));
			
			this.jInternalFrameDetalleFormRegion.jMenuItemModificarRegion.addActionListener(new ButtonActionListener(this,"MenuItemModificarRegion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRegion.jButtonActualizarRegion.addActionListener (new ButtonActionListener(this,"ActualizarRegion"));
		}
		
		
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRegion.jButtonActualizarToolBarRegion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRegion"));
				
			this.jInternalFrameDetalleFormRegion.jMenuItemActualizarRegion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRegion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRegion.jButtonEliminarRegion.addActionListener (new ButtonActionListener(this,"EliminarRegion"));
		}
		
		
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRegion.jButtonEliminarToolBarRegion.addActionListener (new ButtonActionListener(this,"EliminarToolBarRegion"));
						
			this.jInternalFrameDetalleFormRegion.jMenuItemEliminarRegion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRegion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRegion.jButtonCancelarRegion.addActionListener (new ButtonActionListener(this,"CancelarRegion"));
		}
		
		
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRegion.jButtonCancelarToolBarRegion.addActionListener (new ButtonActionListener(this,"CancelarToolBarRegion"));
			
			this.jInternalFrameDetalleFormRegion.jMenuItemCancelarRegion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRegion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRegion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRegion"));		
		
		
		this.jButtonCerrarRegion.addActionListener (new ButtonActionListener(this,"CerrarRegion"));
		
		
		this.jButtonCerrarToolBarRegion.addActionListener (new ButtonActionListener(this,"CerrarToolBarRegion"));
			
		this.jMenuItemCerrarRegion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRegion"));
			
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRegion.jMenuItemDetalleCerrarRegion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRegion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRegion.jButtonGuardarCambiosRegion.addActionListener (new ButtonActionListener(this,"GuardarCambiosRegion"));
		}
		
		
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRegion.jButtonGuardarCambiosToolBarRegion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRegion"));
		}
		
		this.jButtonCopiarToolBarRegion.addActionListener (new ButtonActionListener(this,"CopiarToolBarRegion"));
			
		this.jButtonVerFormToolBarRegion.addActionListener (new ButtonActionListener(this,"VerFormToolBarRegion"));
		
		this.jMenuItemGuardarCambiosRegion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRegion"));
			
		this.jMenuItemCopiarRegion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRegion"));		
		
		this.jMenuItemVerFormRegion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRegion"));		
		
		
		this.jButtonGuardarCambiosTablaRegion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRegion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRegion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRegion"));
			
		this.jMenuItemGuardarCambiosTablaRegion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRegion"));		
		
		
		
		this.jButtonRecargarInformacionRegion.addActionListener (new ButtonActionListener(this,"RecargarInformacionRegion"));
					
		this.jButtonRecargarInformacionToolBarRegion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRegion"));
		
		this.jMenuItemRecargarInformacionRegion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRegion"));		
		
		
		
		this.jButtonAnterioresRegion.addActionListener (new ButtonActionListener(this,"AnterioresRegion"));
		
		
		this.jButtonAnterioresToolBarRegion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRegion"));
		
		this.jMenuItemAnterioresRegion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRegion"));		
		
		
		this.jButtonSiguientesRegion.addActionListener (new ButtonActionListener(this,"SiguientesRegion"));
		
		
		this.jButtonSiguientesToolBarRegion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRegion"));
			
		this.jMenuItemSiguientesRegion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRegion"));
			
		this.jMenuItemAbrirOrderByRegion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRegion"));
			
		this.jMenuItemMostrarOcultarRegion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRegion"));
			
		this.jMenuItemDetalleAbrirOrderByRegion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRegion"));
			
		this.jMenuItemDetalleMostarOcultarRegion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRegion"));		
		
		
		this.jButtonNuevoGuardarCambiosRegion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRegion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRegion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRegion"));
			
		this.jMenuItemNuevoGuardarCambiosRegion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRegion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRegion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRegion"));

		this.jCheckBoxSeleccionadosRegion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRegion"));
		
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRegion"));
		}
		
		
		this.jComboBoxTiposRelacionesRegion.addActionListener (new ButtonActionListener(this,"TiposRelacionesRegion"));
			
		this.jComboBoxTiposAccionesRegion.addActionListener (new ButtonActionListener(this,"TiposAccionesRegion"));
					
		this.jComboBoxTiposSeleccionarRegion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRegion"));
			
		this.jTextFieldValorCampoGeneralRegion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRegion"));		
		
		
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRegion.jButtonidRegionBusqueda.addActionListener(new ButtonActionListener(this,"idRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRegion.jButtonid_paisRegionUpdate.addActionListener(new ButtonActionListener(this,"id_paisRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRegion.jButtonid_paisRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_paisRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRegion.jButtoncodigoRegionBusqueda.addActionListener(new ButtonActionListener(this,"codigoRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRegion.jButtonnombreRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombreRegionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPaisRegion.addActionListener(new ButtonActionListener(this,"FK_IdPaisRegion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRegion!=null) {
				this.jInternalFrameReporteDinamicoRegion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRegion"));
				this.jInternalFrameReporteDinamicoRegion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRegion"));
				this.jInternalFrameReporteDinamicoRegion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRegion"));
			}
			
			//this.jButtonCerrarReporteDinamicoRegion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRegion"));				
			//this.jButtonGenerarReporteDinamicoRegion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRegion"));
			//this.jButtonGenerarExcelReporteDinamicoRegion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRegion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRegion!=null) {
				this.jInternalFrameImportacionRegion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRegion"));
				this.jInternalFrameImportacionRegion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRegion"));
				this.jInternalFrameImportacionRegion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRegion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRegion.addActionListener (new ButtonActionListener(this,"AbrirOrderByRegion"));
			
			this.jButtonAbrirOrderByToolBarRegion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRegion"));			
			
			if(this.jInternalFrameOrderByRegion!=null) {
				this.jInternalFrameOrderByRegion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRegion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRegion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRegion.jTabbedPaneRelacionesRegion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRegion"));
		
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
            		closingInternalFrameRegion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRegion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRegion = (JInternalFrameBase)event.getSource();
	            	
	            RegionBeanSwingJInternalFrame jInternalFrameParent=(RegionBeanSwingJInternalFrame)jInternalFrameDetalleFormRegion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRegionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRegion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRegionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRegion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRegion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRegionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRegionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRegionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRegion";
		inputMap = this.jButtonNuevoRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRegionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRegionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRegionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRegionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRegion";
		inputMap = this.jButtonNuevoRelacionesRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRegionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRegion";
		inputMap = this.jButtonModificarRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRegionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRegion";
		inputMap = this.jButtonActualizarRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRegionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRegion";
		inputMap = this.jButtonEliminarRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRegionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRegion";
		inputMap = this.jButtonCancelarRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRegionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRegion";
		inputMap = this.jButtonCerrarRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRegionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRegion.jButtonGuardarCambiosRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRegion";
		inputMap = this.jInternalFrameDetalleFormRegion.jButtonGuardarCambiosRegion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRegion.jButtonGuardarCambiosRegion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRegionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRegion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRegionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRegion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRegionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRegion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRegionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRegion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRegionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRegion.jButtonidRegionBusqueda.addActionListener(new ButtonActionListener(this,"idRegionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRegion.jButtonid_paisRegionUpdate.addActionListener(new ButtonActionListener(this,"id_paisRegionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRegion.jButtonid_paisRegionBusqueda.addActionListener(new ButtonActionListener(this,"id_paisRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRegion.jButtoncodigoRegionBusqueda.addActionListener(new ButtonActionListener(this,"codigoRegionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRegion.jButtonnombreRegionBusqueda.addActionListener(new ButtonActionListener(this,"nombreRegionBusqueda"));
		
		
		this.jButtonFK_IdPaisRegion.addActionListener(new ButtonActionListener(this,"FK_IdPaisRegion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRegion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRegionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRegionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRegion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRegion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Region regionAux:this.regionLogic.getRegions()) {
					regionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Region regionAux:regions) {
					regionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRegionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRegion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Region regionAux:this.regionLogic.getRegions()) {
						regionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Region regionAux:regions) {
						regionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Region regionAux:this.regionLogic.getRegions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Region regionAux:regions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRegion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRegion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRegion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRegion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRegionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRegion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRegion.getSelectedRows();
			
			Region regionLocal=new Region();
			
			//this.seleccionarTodosRegion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					regionLocal =(Region) this.regionLogic.getRegions().toArray()[this.jTableDatosRegion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					regionLocal =(Region) this.regions.toArray()[this.jTableDatosRegion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				regionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Region regionAux:this.regionLogic.getRegions()) {
						regionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Region regionAux:regions) {
						regionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRegion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRegion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRegion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRegion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRegionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRegionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRegionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRegion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRegion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Region regionAux:this.regionLogic.getRegions()) {
				
						if(sTipoSeleccionar.equals(RegionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							regionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RegionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							regionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Region regionAux:regions) {
					
						if(sTipoSeleccionar.equals(RegionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							regionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RegionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							regionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRegion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRegionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRegion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRegion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRegion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRegion) {				
					conSplash=true;//false;										
					
					//this.startProcessRegion(conSplash);
				
					this.generarReporteRegionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRegion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRegionsSeleccionados();
				//this.jComboBoxTiposAccionesRegion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRegionsSeleccionados(false);
				//this.jComboBoxTiposAccionesRegion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRegionsSeleccionados(true);
				//this.jComboBoxTiposAccionesRegion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRegion();
				
				this.exportarRegionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRegion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRegions();
				//this.importarRegions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRegion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRegion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRegionsSeleccionados();
				//this.jComboBoxTiposAccionesRegion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Region", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRegion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRegion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRegion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Region",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRegion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.setSelectedIndex(0);					
				}	
			} 			
			else if(RegionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRegion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRegion(conSplash);
					
						//this.actualizarParametrosGeneralRegion();
						
						this.generarReporteProcesoAccionRegionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRegion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RegionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO RegionES SELECCIONADOS?", "MANTENIMIENTO DE Region", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRegion();
				
						this.actualizarParametrosGeneralRegion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.regionReturnGeneral=regionLogic.procesarAccionRegionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.regionLogic.getRegions(),this.regionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRegionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRegion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRegion();
					
					RegionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRegionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRegion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRegion.jComboBoxTiposAccionesFormularioRegion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRegion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRegionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRegion();
			
			if(this.jInternalFrameDetalleFormRegion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Region> regionsSeleccionados=new ArrayList<Region>();		
			Region region=new Region();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRegion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRegion.getSelectedItem();
			
			
			
			
			regionsSeleccionados=this.getRegionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(regionsSeleccionados.size()==1) {
				for(Region regionAux:regionsSeleccionados) {
					region=regionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,region);
				}
				else if(this.sTipoRelacion.equals("Provincia")) {
					jButtonProvinciaActionPerformed(null,rowIndex,true,false,region);
				}
				else if(this.sTipoRelacion.equals("Parametro Cartera Defecto")) {
					jButtonParametroCarteraDefectoActionPerformed(null,rowIndex,true,false,region);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRegion();
			
      		//this.finishProcessRegion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRegionReturnGeneral() throws Exception {
		if(this.regionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.regionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.regionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.regionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.regionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.regionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRegion(false);
		}
		
		if(this.regionReturnGeneral.getConRetornoLista() || this.regionReturnGeneral.getConRetornoObjeto()) {
			if(this.regionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.regionLogic.setRegions(this.regionReturnGeneral.getRegions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.regionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.regionLogic.setRegion(this.regionReturnGeneral.getRegion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRegion(false);
		}
	}
	
	public void actualizarParametrosGeneralRegion() throws Exception {
		
		
	}
	
	public ArrayList<Region> getRegionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Region> regionsSeleccionados=new ArrayList<Region>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRegion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Region regionAux:regionLogic.getRegions()) {
					if(regionAux.getIsSelected()) {
						regionsSeleccionados.add(regionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Region regionAux:this.regions) {
					if(regionAux.getIsSelected()) {
						regionsSeleccionados.add(regionAux);				
					}
				}
			}
			
			if(regionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						regionsSeleccionados.addAll(this.regionLogic.getRegions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						regionsSeleccionados.addAll(this.regions);				
					}
				}
			}
		} else {
			regionsSeleccionados.add(this.region);
		}
		
		return regionsSeleccionados;
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
	
	public void generarReporteRegionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRegionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRegionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRegionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRegionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesRegionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Region",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRegionsSeleccionados() throws Exception {
		ArrayList<Region> regionsSeleccionados=new ArrayList<Region>();		
		
		regionsSeleccionados=this.getRegionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRegions("Todos",regionsSeleccionados);
		
	}	
	
	public void generarReporteNormalRegionsSeleccionados() throws Exception {
		ArrayList<Region> regionsSeleccionados=new ArrayList<Region>();		
		
		regionsSeleccionados=this.getRegionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRegions("Todos",regionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRegionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Region> regionsSeleccionados=new ArrayList<Region>();
		
		regionsSeleccionados=this.getRegionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRegions("Todos",regionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRegionsSeleccionados() throws Exception {
		ArrayList<Region> regionsSeleccionados=new ArrayList<Region>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRegion();
		
		
		regionsSeleccionados=this.getRegionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRegion();
		
		
		//this.generarReporteRegions("Todos",regionsSeleccionados ,regionImplementable,regionImplementableHome);
	}
	
	public void mostrarImportacionRegions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRegion();
		
		this.abrirFrameImportacionRegion();		
		
			
		//this.generarReporteRegions("Todos",regionsSeleccionados ,regionImplementable,regionImplementableHome);
	}
	
	public void importarRegions() throws Exception {		
	
	}
	
	public void exportarRegionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRegionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRegionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRegionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Region",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRegionsSeleccionados() throws Exception {
		ArrayList<Region> regionsSeleccionados=new ArrayList<Region>();		
		
		regionsSeleccionados=this.getRegionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"region."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRegion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Region regionAux:regionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRegion(regionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//regionAux.setsDetalleGeneralEntityReporte(regionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.regionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Region",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRegion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RegionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RegionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RegionConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RegionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RegionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRegion(Region region,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=region.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=region.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=region.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=region.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=region.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRegionsSeleccionados() throws Exception {
		ArrayList<Region> regionsSeleccionados=new ArrayList<Region>();		
		
		regionsSeleccionados=this.getRegionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"region.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Regions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRegion(row);				
				iRow++;
			}				
			
			for(Region regionAux:regionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRegion(regionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.regionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Region",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRegionsSeleccionados() throws Exception {
		ArrayList<Region> regionsSeleccionados=new ArrayList<Region>();		
		
		regionsSeleccionados=this.getRegionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"region.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("regions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("region");
			//elementRoot.appendChild(element);
		
			for(Region regionAux:regionsSeleccionados) {
				element = document.createElement("region");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRegion(regionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.regionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Region",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRegion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RegionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RegionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RegionConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(RegionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(RegionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRegion(Region region,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(region.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(region.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(region.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(region.getnombre());				
	}
	
	public void setFilaDatosExportarXmlRegion(Region region,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RegionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(region.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RegionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(region.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(RegionConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(region.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementcodigo = document.createElement(RegionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(region.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(RegionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(region.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoRegionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Region> regionsSeleccionados=new ArrayList<Region>();
		
		regionsSeleccionados=this.getRegionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRegion(regionsSeleccionados);
		
		this.generarReporteRegions("Todos",regionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRegion(ArrayList<Region> regionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Region regionAux:regionsSeleccionados) {
				regionAux.setsDetalleGeneralEntityReporte(regionAux.toString());
			
				if(sTipoSeleccionar.equals(RegionConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					regionAux.setsDescripcionGeneralEntityReporte1(regionAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RegionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					regionAux.setsDescripcionGeneralEntityReporte1(regionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(RegionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					regionAux.setsDescripcionGeneralEntityReporte1(regionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RegionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRegion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRegion=true;
				this.isVisibilidadCeldaNuevoRelacionesRegion=true;
				this.isVisibilidadCeldaGuardarCambiosRegion=true;
			}
			
			this.isVisibilidadCeldaModificarRegion=false;
			this.isVisibilidadCeldaActualizarRegion=false;
			this.isVisibilidadCeldaEliminarRegion=false;
			this.isVisibilidadCeldaCancelarRegion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRegion=true;
				} else {
					this.isVisibilidadCeldaGuardarRegion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRegion=false;
			this.isVisibilidadCeldaNuevoRelacionesRegion=false;
			this.isVisibilidadCeldaGuardarCambiosRegion=false;
			this.isVisibilidadCeldaModificarRegion=false;
			this.isVisibilidadCeldaActualizarRegion=true;
			this.isVisibilidadCeldaEliminarRegion=false;
			this.isVisibilidadCeldaCancelarRegion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRegion=true;
				} else {
					this.isVisibilidadCeldaGuardarRegion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRegion=false;
			this.isVisibilidadCeldaNuevoRelacionesRegion=false;
			this.isVisibilidadCeldaGuardarCambiosRegion=false;
			this.isVisibilidadCeldaModificarRegion=false;
			this.isVisibilidadCeldaActualizarRegion=true;
			this.isVisibilidadCeldaEliminarRegion=true;
			this.isVisibilidadCeldaCancelarRegion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRegion=true;
				} else {
					this.isVisibilidadCeldaGuardarRegion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRegion=false;
			this.isVisibilidadCeldaNuevoRelacionesRegion=false;
			this.isVisibilidadCeldaGuardarCambiosRegion=false;
			this.isVisibilidadCeldaModificarRegion=false;
			this.isVisibilidadCeldaActualizarRegion=true;
			this.isVisibilidadCeldaEliminarRegion=false;
			this.isVisibilidadCeldaCancelarRegion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRegion=false;
				} else {
					this.isVisibilidadCeldaGuardarRegion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRegion=true;
			this.isVisibilidadCeldaNuevoRelacionesRegion=true;
			this.isVisibilidadCeldaGuardarCambiosRegion=true;
			this.isVisibilidadCeldaModificarRegion=false;
			this.isVisibilidadCeldaActualizarRegion=false;
			this.isVisibilidadCeldaEliminarRegion=false;
			this.isVisibilidadCeldaCancelarRegion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRegion=true;
				} else {
					this.isVisibilidadCeldaGuardarRegion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRegion=false;
			this.isVisibilidadCeldaNuevoRelacionesRegion=false;
			this.isVisibilidadCeldaGuardarCambiosRegion=false;
			this.isVisibilidadCeldaActualizarRegion=false;
			this.isVisibilidadCeldaEliminarRegion=false;
			this.isVisibilidadCeldaCancelarRegion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRegion=false;
				} else {
					this.isVisibilidadCeldaGuardarRegion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRegion=false;
			this.isVisibilidadCeldaNuevoRelacionesRegion=false;
			this.isVisibilidadCeldaGuardarCambiosRegion=false;
			this.isVisibilidadCeldaModificarRegion=true;
			this.isVisibilidadCeldaActualizarRegion=false;
			this.isVisibilidadCeldaEliminarRegion=false;
			this.isVisibilidadCeldaCancelarRegion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRegion=false;
				} else {
					this.isVisibilidadCeldaGuardarRegion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RegionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRegion=true;
			this.isVisibilidadCeldaNuevoRelacionesRegion=true;
			this.isVisibilidadCeldaGuardarCambiosRegion=true;
		} else {
			this.actualizarEstadoPanelsRegion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRegion=false;
			//this.isVisibilidadCeldaVerFormRegion=false;
			this.isVisibilidadCeldaDuplicarRegion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!regionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRegion=false;
		} else {
			this.isVisibilidadCeldaNuevoRegion=false;
			this.isVisibilidadCeldaGuardarCambiosRegion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(regionSessionBean.getEsGuardarRelacionado()) {
			if(!regionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRegion=false;												
			}
			
			this.jButtonCerrarRegion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRegion=false;
		}
		
		if(!this.permiteMantenimiento(this.region)) {
			this.isVisibilidadCeldaActualizarRegion=false;
			this.isVisibilidadCeldaEliminarRegion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRegion() {
		this.isVisibilidadCeldaNuevoRegion=false;
		this.isVisibilidadCeldaGuardarCambiosRegion=false;
	}
	
	public void actualizarEstadoPanelsRegion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRegion!=null) {
				this.jScrollPanelDatosEdicionRegion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRegion!=null) {
				this.jTabbedPaneBusquedasRegion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRegion!=null) {
				this.jScrollPanelDatosRegion.setVisible(true);
			}
			
			if(this.jPanelPaginacionRegion!=null) {
				this.jPanelPaginacionRegion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRegion!=null) {
				this.jPanelParametrosReportesRegion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRegion!=null) {
				this.jScrollPanelDatosEdicionRegion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRegion!=null) {
				this.jTabbedPaneBusquedasRegion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRegion!=null) {
				this.jScrollPanelDatosRegion.setVisible(false);
			}
			
			if(this.jPanelPaginacionRegion!=null) {
				this.jPanelPaginacionRegion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRegion!=null) {
				this.jPanelParametrosReportesRegion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRegion!=null) {
				this.jScrollPanelDatosEdicionRegion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRegion!=null) {
				this.jTabbedPaneBusquedasRegion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRegion!=null) {
				this.jScrollPanelDatosRegion.setVisible(false);
			}
			
			if(this.jPanelPaginacionRegion!=null) {
				this.jPanelPaginacionRegion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRegion!=null) {
				this.jPanelParametrosReportesRegion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRegion!=null) {
				this.jScrollPanelDatosEdicionRegion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRegion!=null) {
				this.jTabbedPaneBusquedasRegion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRegion!=null) {
				this.jScrollPanelDatosRegion.setVisible(false);
			}
			
			if(this.jPanelPaginacionRegion!=null) {
				this.jPanelPaginacionRegion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRegion!=null) {
				this.jPanelParametrosReportesRegion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRegion!=null) {
				this.jScrollPanelDatosEdicionRegion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRegion!=null) {
				this.jTabbedPaneBusquedasRegion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRegion!=null) {
				this.jScrollPanelDatosRegion.setVisible(true);
			}
			
			if(this.jPanelPaginacionRegion!=null) {
				this.jPanelPaginacionRegion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRegion!=null) {
				this.jPanelParametrosReportesRegion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRegion!=null) {
				this.jScrollPanelDatosEdicionRegion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRegion!=null) {
				this.jTabbedPaneBusquedasRegion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRegion!=null) {
				this.jScrollPanelDatosRegion.setVisible(true);
			}
			
			if(this.jPanelPaginacionRegion!=null) {
				this.jPanelPaginacionRegion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRegion!=null) {
				this.jPanelParametrosReportesRegion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRegion!=null) {
				this.jScrollPanelDatosEdicionRegion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRegion!=null) {
				this.jTabbedPaneBusquedasRegion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRegion!=null) {
				this.jScrollPanelDatosRegion.setVisible(true);
			}
			
			if(this.jPanelPaginacionRegion!=null) {
				this.jPanelPaginacionRegion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRegion!=null) {
				this.jPanelParametrosReportesRegion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.regionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRegion!=null) {
					this.jTabbedPaneBusquedasRegion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRegion!=null) {
				this.jPanelParametrosReportesRegion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.regionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRegion!=null) {
				this.jTabbedPaneBusquedasRegion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRegion!=null) {
				this.jPanelParametrosReportesRegion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasRegion.remove(jPanelFK_IdPaisRegion);}
		}
		
	}
	
	

	public String registrarSesionRegionParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.regionSessionBean==null) {
				this.regionSessionBean=new RegionSessionBean();
			}

			if(this.jInternalFrameDetalleFormRegion.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormRegion.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormRegion.clienteSessionBean.setsPathNavegacionActual(regionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormRegion.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormRegion.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormRegion.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormRegion.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(RegionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormRegion.clienteSessionBean.setisBusquedaDesdeForeignKeySesionRegion(true);
			this.jInternalFrameDetalleFormRegion.clienteSessionBean.setlidRegionActual(this.idRegionActual);

			regionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRegion(true);
			regionSessionBean.setlIdRegionActualForeignKey(this.idRegionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionRegionParaProvinciaes() throws Exception {
		Boolean isPaginaPopupProvincia=false;

		try {

			if(this.regionSessionBean==null) {
				this.regionSessionBean=new RegionSessionBean();
			}

			if(this.jInternalFrameDetalleFormRegion.provinciaSessionBean==null) {
				this.jInternalFrameDetalleFormRegion.provinciaSessionBean=new ProvinciaSessionBean();
			}

			this.jInternalFrameDetalleFormRegion.provinciaSessionBean.setsPathNavegacionActual(regionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProvinciaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormRegion.provinciaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProvincia=this.jInternalFrameDetalleFormRegion.provinciaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormRegion.provinciaSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormRegion.provinciaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProvincia(false);
			this.jInternalFrameDetalleFormRegion.provinciaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProvincia(RegionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormRegion.provinciaSessionBean.setisBusquedaDesdeForeignKeySesionRegion(true);
			this.jInternalFrameDetalleFormRegion.provinciaSessionBean.setlidRegionActual(this.idRegionActual);

			regionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRegion(true);
			regionSessionBean.setlIdRegionActualForeignKey(this.idRegionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionRegionParaParametroCarteraDefectos() throws Exception {
		Boolean isPaginaPopupParametroCarteraDefecto=false;

		try {

			if(this.regionSessionBean==null) {
				this.regionSessionBean=new RegionSessionBean();
			}

			if(this.jInternalFrameDetalleFormRegion.parametrocarteradefectoSessionBean==null) {
				this.jInternalFrameDetalleFormRegion.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormRegion.parametrocarteradefectoSessionBean.setsPathNavegacionActual(regionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormRegion.parametrocarteradefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroCarteraDefecto=this.jInternalFrameDetalleFormRegion.parametrocarteradefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormRegion.parametrocarteradefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(true);
			this.jInternalFrameDetalleFormRegion.parametrocarteradefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(RegionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormRegion.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionRegion(true);
			this.jInternalFrameDetalleFormRegion.parametrocarteradefectoSessionBean.setlidRegionActual(this.idRegionActual);

			regionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRegion(true);
			regionSessionBean.setlIdRegionActualForeignKey(this.idRegionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RegionSessionBean regionSessionBean=new RegionSessionBean();
		
		if(this.regionSessionBean==null) {
			this.regionSessionBean=new RegionSessionBean();
		}
		
		this.regionSessionBean.setsUltimaBusquedaRegion(this.getsAccionBusqueda());
		this.regionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.regionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			regionSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RegionSessionBean regionSessionBean=new RegionSessionBean();
		
		if(this.regionSessionBean==null) {
			this.regionSessionBean=new RegionSessionBean();
		}
		
		if(this.regionSessionBean.getsUltimaBusquedaRegion()!=null&&!this.regionSessionBean.getsUltimaBusquedaRegion().equals("")) {
			this.setsAccionBusqueda(regionSessionBean.getsUltimaBusquedaRegion());
			this.setiNumeroPaginacion(regionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(regionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(regionSessionBean.getid_pais());
				regionSessionBean.setid_pais(-1L);
			}
		}
		
		this.regionSessionBean.setsUltimaBusquedaRegion("");
		this.regionSessionBean.setiNumeroPaginacion(RegionConstantesFunciones.INUMEROPAGINACION);
		this.regionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRegion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRegion() {
		this.updateBorderResaltarBusquedasFormularioRegion();
		this.updateVisibilidadBusquedasFormularioRegion();
		this.updateHabilitarBusquedasFormularioRegion();
	}
	
	public void updateBorderResaltarBusquedasFormularioRegion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRegion.getComponents().length>0) {
	

		if(this.regionConstantesFunciones.resaltarFK_IdPaisRegion!=null) {
			index= this.jTabbedPaneBusquedasRegion.indexOfComponent(this.jPanelFK_IdPaisRegion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRegion.getComponent(index);
				jPanel.setBorder(this.regionConstantesFunciones.resaltarFK_IdPaisRegion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRegion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRegion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRegion.indexOfComponent(this.jPanelFK_IdPaisRegion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRegion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.regionConstantesFunciones.mostrarFK_IdPaisRegion);
			if(!this.regionConstantesFunciones.mostrarFK_IdPaisRegion && index>-1) {
				this.jTabbedPaneBusquedasRegion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRegion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRegion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRegion.indexOfComponent(this.jPanelFK_IdPaisRegion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRegion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.regionConstantesFunciones.activarFK_IdPaisRegion);
				this.jTabbedPaneBusquedasRegion.setEnabledAt(index,this.regionConstantesFunciones.activarFK_IdPaisRegion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRegion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasRegion.indexOfComponent(this.jPanelFK_IdPaisRegion);

			this.jTabbedPaneBusquedasRegion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRegion.getComponent(index);

			this.regionConstantesFunciones.setResaltarFK_IdPaisRegion(resaltar);

			jPanel.setBorder(this.regionConstantesFunciones.resaltarFK_IdPaisRegion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRegion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRegion() throws Exception {

		if(this.jInternalFrameDetalleFormRegion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRegion();
		this.updateVisibilidadResaltarControlesFormularioRegion();
		this.updateHabilitarResaltarControlesFormularioRegion();
		
	}
	
	public void updateBorderResaltarControlesFormularioRegion() throws Exception {
		if(this.jInternalFrameDetalleFormRegion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.regionConstantesFunciones.resaltaridRegion!=null && this.jInternalFrameDetalleFormRegion!=null) {this.jInternalFrameDetalleFormRegion.jLabelidRegion.setBorder(this.regionConstantesFunciones.resaltaridRegion);}
		if(this.regionConstantesFunciones.resaltarid_paisRegion!=null && this.jInternalFrameDetalleFormRegion!=null) {this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion.setBorder(this.regionConstantesFunciones.resaltarid_paisRegion);}
		if(this.regionConstantesFunciones.resaltarcodigoRegion!=null && this.jInternalFrameDetalleFormRegion!=null) {this.jInternalFrameDetalleFormRegion.jTextFieldcodigoRegion.setBorder(this.regionConstantesFunciones.resaltarcodigoRegion);}
		if(this.regionConstantesFunciones.resaltarnombreRegion!=null && this.jInternalFrameDetalleFormRegion!=null) {this.jInternalFrameDetalleFormRegion.jTextAreanombreRegion.setBorder(this.regionConstantesFunciones.resaltarnombreRegion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRegion() throws Exception {		
		if(this.jInternalFrameDetalleFormRegion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRegion!=null) {
	
		//this.jInternalFrameDetalleFormRegion.jLabelidRegion.setVisible(this.regionConstantesFunciones.mostraridRegion);
		this.jInternalFrameDetalleFormRegion.jPanelidRegion.setVisible(this.regionConstantesFunciones.mostraridRegion);
		//this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion.setVisible(this.regionConstantesFunciones.mostrarid_paisRegion);
		this.jInternalFrameDetalleFormRegion.jPanelid_paisRegion.setVisible(this.regionConstantesFunciones.mostrarid_paisRegion);
		//this.jInternalFrameDetalleFormRegion.jTextFieldcodigoRegion.setVisible(this.regionConstantesFunciones.mostrarcodigoRegion);
		this.jInternalFrameDetalleFormRegion.jPanelcodigoRegion.setVisible(this.regionConstantesFunciones.mostrarcodigoRegion);
		//this.jInternalFrameDetalleFormRegion.jTextAreanombreRegion.setVisible(this.regionConstantesFunciones.mostrarnombreRegion);
		this.jInternalFrameDetalleFormRegion.jPanelnombreRegion.setVisible(this.regionConstantesFunciones.mostrarnombreRegion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRegion() throws Exception {
		if(this.jInternalFrameDetalleFormRegion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRegion!=null) {
	
		this.jInternalFrameDetalleFormRegion.jLabelidRegion.setEnabled(this.regionConstantesFunciones.activaridRegion);
		this.jInternalFrameDetalleFormRegion.jComboBoxid_paisRegion.setEnabled(this.regionConstantesFunciones.activarid_paisRegion);
		this.jInternalFrameDetalleFormRegion.jTextFieldcodigoRegion.setEnabled(this.regionConstantesFunciones.activarcodigoRegion);
		this.jInternalFrameDetalleFormRegion.jTextAreanombreRegion.setEnabled(this.regionConstantesFunciones.activarnombreRegion);
		}
	}
	
		
}