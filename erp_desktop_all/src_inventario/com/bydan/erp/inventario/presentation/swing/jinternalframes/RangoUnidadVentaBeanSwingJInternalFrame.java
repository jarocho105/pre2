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

import com.bydan.erp.inventario.util.RangoUnidadVentaConstantesFunciones;
import com.bydan.erp.inventario.util.RangoUnidadVentaParameterReturnGeneral;
//import com.bydan.erp.inventario.util.RangoUnidadVentaParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.RangoUnidadVentaBean;
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
public class RangoUnidadVentaBeanSwingJInternalFrame extends RangoUnidadVentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RangoUnidadVentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RangoUnidadVenta> rangounidadventaValidator = new ClassValidator<RangoUnidadVenta>(RangoUnidadVenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RangoUnidadVenta rangounidadventa;	
	public RangoUnidadVenta rangounidadventaAux;
	public RangoUnidadVenta rangounidadventaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RangoUnidadVenta rangounidadventaTotales;
	public Long idRangoUnidadVentaActual;
	public Long iIdNuevoRangoUnidadVenta=0L;
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

	public String sFinalQueryComboUnidad="";

	public List<Unidad> unidadsForeignKey;

	public List<Unidad> getunidadsForeignKey() {
		return unidadsForeignKey;
	}

	public void setunidadsForeignKey(List<Unidad> unidadsForeignKey) {
		this.unidadsForeignKey = unidadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Unidad unidadForeignKey;

	public Unidad getunidadForeignKey() {
		return unidadForeignKey;
	}

	public void setunidadForeignKey(Unidad unidadForeignKey) {
		this.unidadForeignKey = unidadForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosPrecio=false;

	public Boolean getIsTienePermisosPrecio() {
		return isTienePermisosPrecio;
	}

	public void setIsTienePermisosPrecio(Boolean isTienePermisosPrecio) {
		this.isTienePermisosPrecio= isTienePermisosPrecio;
	}


	public Boolean isTienePermisosParametroInventarioDefecto=false;

	public Boolean getIsTienePermisosParametroInventarioDefecto() {
		return isTienePermisosParametroInventarioDefecto;
	}

	public void setIsTienePermisosParametroInventarioDefecto(Boolean isTienePermisosParametroInventarioDefecto) {
		this.isTienePermisosParametroInventarioDefecto= isTienePermisosParametroInventarioDefecto;
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
	
	public Boolean isPermisoTodoRangoUnidadVenta;
	public Boolean isPermisoNuevoRangoUnidadVenta;
	public Boolean isPermisoActualizarRangoUnidadVenta;
	public Boolean isPermisoActualizarOriginalRangoUnidadVenta;
	public Boolean isPermisoEliminarRangoUnidadVenta;
	public Boolean isPermisoGuardarCambiosRangoUnidadVenta;
	public Boolean isPermisoConsultaRangoUnidadVenta;
	public Boolean isPermisoBusquedaRangoUnidadVenta;
	public Boolean isPermisoReporteRangoUnidadVenta;
	public Boolean isPermisoPaginacionMedioRangoUnidadVenta;
	public Boolean isPermisoPaginacionAltoRangoUnidadVenta;
	public Boolean isPermisoPaginacionTodoRangoUnidadVenta;
	public Boolean isPermisoCopiarRangoUnidadVenta;
	public Boolean isPermisoVerFormRangoUnidadVenta;
	public Boolean isPermisoDuplicarRangoUnidadVenta;
	public Boolean isPermisoOrdenRangoUnidadVenta;
	
	
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
	
	public RangoUnidadVentaParameterReturnGeneral rangounidadventaReturnGeneral;
	public RangoUnidadVentaParameterReturnGeneral rangounidadventaParameterGeneral;
	
	

	public PrecioLogic precioLogic=null;

	public PrecioLogic getPrecioLogic() {
		return precioLogic;
	}

	public void setPrecioLogic(PrecioLogic precioLogic) {
		this.precioLogic = precioLogic;
	}


	public ParametroInventarioDefectoLogic parametroinventariodefectoLogic=null;

	public ParametroInventarioDefectoLogic getParametroInventarioDefectoLogic() {
		return parametroinventariodefectoLogic;
	}

	public void setParametroInventarioDefectoLogic(ParametroInventarioDefectoLogic parametroinventariodefectoLogic) {
		this.parametroinventariodefectoLogic = parametroinventariodefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRangoUnidadVenta=false;
	public Boolean esParaAccionDesdeFormularioRangoUnidadVenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RangoUnidadVentaSessionBeanAdditional rangounidadventaSessionBeanAdditional=null;
	
	public RangoUnidadVentaSessionBeanAdditional getRangoUnidadVentaSessionBeanAdditional() {
		return this.rangounidadventaSessionBeanAdditional;
	}
	
	public void setRangoUnidadVentaSessionBeanAdditional(RangoUnidadVentaSessionBeanAdditional rangounidadventaSessionBeanAdditional) {
		try {
			this.rangounidadventaSessionBeanAdditional=rangounidadventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RangoUnidadVentaBeanSwingJInternalFrameAdditional rangounidadventaBeanSwingJInternalFrameAdditional=null;
	//public class RangoUnidadVentaBeanSwingJInternalFrame
	
	public RangoUnidadVentaBeanSwingJInternalFrameAdditional getRangoUnidadVentaBeanSwingJInternalFrameAdditional() {
		return this.rangounidadventaBeanSwingJInternalFrameAdditional;
	}
	
	public void setRangoUnidadVentaBeanSwingJInternalFrameAdditional(RangoUnidadVentaBeanSwingJInternalFrameAdditional rangounidadventaBeanSwingJInternalFrameAdditional) {
		try {
			this.rangounidadventaBeanSwingJInternalFrameAdditional=rangounidadventaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RangoUnidadVentaLogic rangounidadventaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RangoUnidadVenta rangounidadventaBean;
	public RangoUnidadVentaConstantesFunciones rangounidadventaConstantesFunciones;
	//public RangoUnidadVentaParameterReturnGeneral rangounidadventaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<RangoUnidadVenta> rangounidadventas;	
	//public List<RangoUnidadVenta> rangounidadventasEliminados;
	//public List<RangoUnidadVenta> rangounidadventasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRangoUnidadVenta=false;
	public Boolean isVisibilidadCeldaDuplicarRangoUnidadVenta=true;
	public Boolean isVisibilidadCeldaCopiarRangoUnidadVenta=true;
	public Boolean isVisibilidadCeldaVerFormRangoUnidadVenta=true;
	public Boolean isVisibilidadCeldaOrdenRangoUnidadVenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=false;
	public Boolean isVisibilidadCeldaModificarRangoUnidadVenta=false;
	public Boolean isVisibilidadCeldaActualizarRangoUnidadVenta=false;
	public Boolean isVisibilidadCeldaEliminarRangoUnidadVenta=false;
	public Boolean isVisibilidadCeldaCancelarRangoUnidadVenta=false;
	public Boolean isVisibilidadCeldaGuardarRangoUnidadVenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoRangoUnidadVenta() {
		return this.iIdNuevoRangoUnidadVenta;
	}

	public void setiIdNuevoRangoUnidadVenta(Long iIdNuevoRangoUnidadVenta) {
		this.iIdNuevoRangoUnidadVenta = iIdNuevoRangoUnidadVenta;
	}
	
	public Long getidRangoUnidadVentaActual() {
		return this.idRangoUnidadVentaActual;
	}

	public void setidRangoUnidadVentaActual(Long idRangoUnidadVentaActual) {
		this.idRangoUnidadVentaActual = idRangoUnidadVentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RangoUnidadVenta getrangounidadventa() {
		return this.rangounidadventa;
	}

	public void setrangounidadventa(RangoUnidadVenta rangounidadventa) {
		this.rangounidadventa = rangounidadventa;
	}
	
	public RangoUnidadVenta getrangounidadventaAux() {
		return this.rangounidadventaAux;
	}

	public void setrangounidadventaAux(RangoUnidadVenta rangounidadventaAux) {
		this.rangounidadventaAux = rangounidadventaAux;
	}				
	
	public RangoUnidadVenta getrangounidadventaAnterior() {
		return this.rangounidadventaAnterior;
	}

	public void setrangounidadventaAnterior(RangoUnidadVenta rangounidadventaAnterior) {
		this.rangounidadventaAnterior = rangounidadventaAnterior;
	}	
	
	public RangoUnidadVenta getrangounidadventaTotales() {
		return this.rangounidadventaTotales;
	}

	public void setrangounidadventaTotales(RangoUnidadVenta rangounidadventaTotales) {
		this.rangounidadventaTotales = rangounidadventaTotales;
	}	
	
	public RangoUnidadVenta getrangounidadventaBean() {
		return this.rangounidadventaBean;
	}

	public void setrangounidadventaBean(RangoUnidadVenta rangounidadventaBean) {
		this.rangounidadventaBean = rangounidadventaBean;
	}	
	
	public RangoUnidadVentaParameterReturnGeneral getrangounidadventaReturnGeneral() {
		return this.rangounidadventaReturnGeneral;
	}

	public void setrangounidadventaReturnGeneral(RangoUnidadVentaParameterReturnGeneral rangounidadventaReturnGeneral) {
		this.rangounidadventaReturnGeneral = rangounidadventaReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_unidadFK_IdUnidad=-1L;

	public Long getid_unidadFK_IdUnidad() {
		return this.id_unidadFK_IdUnidad;
	}

	public void setid_unidadFK_IdUnidad(Long id_unidadFK_IdUnidad) {
		this.id_unidadFK_IdUnidad = id_unidadFK_IdUnidad;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public RangoUnidadVentaLogic getRangoUnidadVentaLogic()	{		
		return rangounidadventaLogic;
	}

	public void setRangoUnidadVentaLogic(RangoUnidadVentaLogic rangounidadventaLogic) {
		this.rangounidadventaLogic = rangounidadventaLogic;
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
	
	public Boolean getIsEsNuevoRangoUnidadVenta() {
		return isEsNuevoRangoUnidadVenta;
	}

	public void setIsEsNuevoRangoUnidadVenta(Boolean isEsNuevoRangoUnidadVenta) {
		this.isEsNuevoRangoUnidadVenta = isEsNuevoRangoUnidadVenta;
	}

	public Boolean getEsParaAccionDesdeFormularioRangoUnidadVenta() {
		return esParaAccionDesdeFormularioRangoUnidadVenta;
	}
	
	public void setEsParaAccionDesdeFormularioRangoUnidadVenta(Boolean esParaAccionDesdeFormularioRangoUnidadVenta) {
		this.esParaAccionDesdeFormularioRangoUnidadVenta = esParaAccionDesdeFormularioRangoUnidadVenta;
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

			if(this.rangounidadventaSessionBean==null) {
				this.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
			}

			if(!this.rangounidadventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(rangounidadventaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosUnidadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.unidadsForeignKey=new ArrayList<Unidad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UnidadLogic unidadLogic=new UnidadLogic();

			//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.rangounidadventaSessionBean==null) {
				this.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
			}

			if(!this.rangounidadventaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

					unidadLogic.getTodosUnidadsWithConnection(sFinalQuery,new Pagination());

					this.unidadsForeignKey=unidadLogic.getUnidads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUnidad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getEntityWithConnection(rangounidadventaSessionBean.getlidUnidadActual());
					this.unidadsForeignKey.add(unidadLogic.getUnidad());
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

					if(this.rangounidadventa!=null) {
						this.rangounidadventa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
						this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRangoUnidadVenta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
						if(this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRangoUnidadVentaGenerico)throws Exception
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
				jComboBoxid_empresaRangoUnidadVentaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRangoUnidadVentaGenerico!=null && jComboBoxid_empresaRangoUnidadVentaGenerico.getItemCount()>0) {
					jComboBoxid_empresaRangoUnidadVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUnidadForeignKey(Long idUnidadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(unidadTemp!=null) {

					if(this.rangounidadventa!=null) {
						this.rangounidadventa.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
						this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadRangoUnidadVenta.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
						if(this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta!=null) {
						jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta!=null) {
							//jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta.setSelectedIndex(0);
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

	public String getActualUnidadForeignKeyDescripcion(Long idUnidadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}


			sDescripcion=UnidadConstantesFunciones.getUnidadDescripcion(unidadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadRangoUnidadVentaGenerico)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(unidadTemp!=null) {
				jComboBoxid_unidadRangoUnidadVentaGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadRangoUnidadVentaGenerico!=null && jComboBoxid_unidadRangoUnidadVentaGenerico.getItemCount()>0) {
					jComboBoxid_unidadRangoUnidadVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RangoUnidadVenta rangounidadventa,JComboBox jComboBoxid_empresaRangoUnidadVentaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRangoUnidadVentaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRangoUnidadVentaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				rangounidadventa.setid_empresa(empresaAux.getId());
				rangounidadventa.setempresa_descripcion(RangoUnidadVentaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				rangounidadventa.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(RangoUnidadVenta rangounidadventa,JComboBox jComboBoxid_unidadRangoUnidadVentaGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadRangoUnidadVentaGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadRangoUnidadVentaGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				rangounidadventa.setid_unidad(unidadAux.getId());
				rangounidadventa.setunidad_descripcion(RangoUnidadVentaConstantesFunciones.getUnidadDescripcion(unidadAux));
				rangounidadventa.setUnidad(unidadAux);			}
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

					if(!RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { 
							this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { 
					}

					if(!RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUnidadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUnidad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { 
							this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { 
					}

					if(!RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta.addItem(unidad);
							}
						}

						if(!RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
							this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
							this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameUnidadForeignKey(Unidad unidad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
							this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
							this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRangoUnidadVenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RangoUnidadVentaConstantesFunciones.refrescarForeignKeysDescripcionesRangoUnidadVenta(this.rangounidadventaLogic.getRangoUnidadVentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RangoUnidadVentaConstantesFunciones.refrescarForeignKeysDescripcionesRangoUnidadVenta(this.rangounidadventas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//rangounidadventaLogic.setRangoUnidadVentas(this.rangounidadventas);
			rangounidadventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RangoUnidadVentaParameterReturnGeneral getRangoUnidadVentaParameterGeneral() {
		return this.rangounidadventaParameterGeneral;
	}
	
	public void setRangoUnidadVentaParameterGeneral(RangoUnidadVentaParameterReturnGeneral rangounidadventaParameterGeneral) {
		this.rangounidadventaParameterGeneral = rangounidadventaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRangoUnidadVenta() {
		return isPermisoTodoRangoUnidadVenta;
	}

	public void setIsPermisoTodoRangoUnidadVenta(Boolean isPermisoTodoRangoUnidadVenta) {
		this.isPermisoTodoRangoUnidadVenta = isPermisoTodoRangoUnidadVenta;
	}

	public Boolean getIsPermisoNuevoRangoUnidadVenta() {
		return isPermisoNuevoRangoUnidadVenta;
	}

	public void setIsPermisoNuevoRangoUnidadVenta(Boolean isPermisoNuevoRangoUnidadVenta) {
		this.isPermisoNuevoRangoUnidadVenta = isPermisoNuevoRangoUnidadVenta;
	}

	public Boolean getIsPermisoActualizarRangoUnidadVenta() {
		return isPermisoActualizarRangoUnidadVenta;
	}

	public void setIsPermisoActualizarRangoUnidadVenta(Boolean isPermisoActualizarRangoUnidadVenta) {
		this.isPermisoActualizarRangoUnidadVenta = isPermisoActualizarRangoUnidadVenta;
	}

	public Boolean getIsPermisoEliminarRangoUnidadVenta() {
		return isPermisoEliminarRangoUnidadVenta;
	}

	public void setIsPermisoEliminarRangoUnidadVenta(Boolean isPermisoEliminarRangoUnidadVenta) {
		this.isPermisoEliminarRangoUnidadVenta = isPermisoEliminarRangoUnidadVenta;
	}

	public Boolean getIsPermisoGuardarCambiosRangoUnidadVenta() {
		return isPermisoGuardarCambiosRangoUnidadVenta;
	}

	public void setIsPermisoGuardarCambiosRangoUnidadVenta(Boolean isPermisoGuardarCambiosRangoUnidadVenta) {
		this.isPermisoGuardarCambiosRangoUnidadVenta = isPermisoGuardarCambiosRangoUnidadVenta;
	}
	
	public Boolean getIsPermisoConsultaRangoUnidadVenta() {
		return isPermisoConsultaRangoUnidadVenta;
	}

	public void setIsPermisoConsultaRangoUnidadVenta(Boolean isPermisoConsultaRangoUnidadVenta) {
		this.isPermisoConsultaRangoUnidadVenta = isPermisoConsultaRangoUnidadVenta;
	}

	public Boolean getIsPermisoBusquedaRangoUnidadVenta() {
		return isPermisoBusquedaRangoUnidadVenta;
	}

	public void setIsPermisoBusquedaRangoUnidadVenta(Boolean isPermisoBusquedaRangoUnidadVenta) {
		this.isPermisoBusquedaRangoUnidadVenta = isPermisoBusquedaRangoUnidadVenta;
	}

	public Boolean getIsPermisoReporteRangoUnidadVenta() {
		return isPermisoReporteRangoUnidadVenta;
	}

	public void setIsPermisoReporteRangoUnidadVenta(Boolean isPermisoReporteRangoUnidadVenta) {
		this.isPermisoReporteRangoUnidadVenta = isPermisoReporteRangoUnidadVenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioRangoUnidadVenta() {
		return isPermisoPaginacionMedioRangoUnidadVenta;
	}

	public void setIsPermisoPaginacionMedioRangoUnidadVenta(Boolean isPermisoPaginacionMedioRangoUnidadVenta) {
		this.isPermisoPaginacionMedioRangoUnidadVenta = isPermisoPaginacionMedioRangoUnidadVenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoRangoUnidadVenta() {
		return isPermisoPaginacionTodoRangoUnidadVenta;
	}

	public void setIsPermisoPaginacionTodoRangoUnidadVenta(Boolean isPermisoPaginacionTodoRangoUnidadVenta) {
		this.isPermisoPaginacionTodoRangoUnidadVenta = isPermisoPaginacionTodoRangoUnidadVenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoRangoUnidadVenta() {
		return isPermisoPaginacionAltoRangoUnidadVenta;
	}

	public void setIsPermisoPaginacionAltoRangoUnidadVenta(Boolean isPermisoPaginacionAltoRangoUnidadVenta) {
		this.isPermisoPaginacionAltoRangoUnidadVenta = isPermisoPaginacionAltoRangoUnidadVenta;
	}
	
	public Boolean getIsPermisoCopiarRangoUnidadVenta() {
		return isPermisoCopiarRangoUnidadVenta;
	}

	public void setIsPermisoCopiarRangoUnidadVenta(Boolean isPermisoCopiarRangoUnidadVenta) {
		this.isPermisoCopiarRangoUnidadVenta = isPermisoCopiarRangoUnidadVenta;
	}
	
	public Boolean getIsPermisoVerFormRangoUnidadVenta() {
		return isPermisoVerFormRangoUnidadVenta;
	}

	public void setIsPermisoVerFormRangoUnidadVenta(Boolean isPermisoVerFormRangoUnidadVenta) {
		this.isPermisoVerFormRangoUnidadVenta = isPermisoVerFormRangoUnidadVenta;
	}
	
	public Boolean getIsPermisoDuplicarRangoUnidadVenta() {
		return isPermisoDuplicarRangoUnidadVenta;
	}

	public void setIsPermisoDuplicarRangoUnidadVenta(Boolean isPermisoDuplicarRangoUnidadVenta) {
		this.isPermisoDuplicarRangoUnidadVenta = isPermisoDuplicarRangoUnidadVenta;
	}
	
	public Boolean getIsPermisoOrdenRangoUnidadVenta() {
		return isPermisoOrdenRangoUnidadVenta;
	}

	public void setIsPermisoOrdenRangoUnidadVenta(Boolean isPermisoOrdenRangoUnidadVenta) {
		this.isPermisoOrdenRangoUnidadVenta = isPermisoOrdenRangoUnidadVenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRangoUnidadVenta() {
		return isVisibilidadCeldaNuevoRangoUnidadVenta;
	}

	public void setIsVisibilidadCeldaNuevoRangoUnidadVenta(Boolean isVisibilidadCeldaNuevoRangoUnidadVenta) {
		this.isVisibilidadCeldaNuevoRangoUnidadVenta = isVisibilidadCeldaNuevoRangoUnidadVenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRangoUnidadVenta() {
		return isVisibilidadCeldaDuplicarRangoUnidadVenta;
	}

	public void setIsVisibilidadCeldaDuplicarRangoUnidadVenta(Boolean isVisibilidadCeldaDuplicarRangoUnidadVenta) {
		this.isVisibilidadCeldaDuplicarRangoUnidadVenta = isVisibilidadCeldaDuplicarRangoUnidadVenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRangoUnidadVenta() {
		return isVisibilidadCeldaCopiarRangoUnidadVenta;
	}

	public void setIsVisibilidadCeldaCopiarRangoUnidadVenta(Boolean isVisibilidadCeldaCopiarRangoUnidadVenta) {
		this.isVisibilidadCeldaCopiarRangoUnidadVenta = isVisibilidadCeldaCopiarRangoUnidadVenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRangoUnidadVenta() {
		return isVisibilidadCeldaVerFormRangoUnidadVenta;
	}

	public void setIsVisibilidadCeldaVerFormRangoUnidadVenta(Boolean isVisibilidadCeldaVerFormRangoUnidadVenta) {
		this.isVisibilidadCeldaVerFormRangoUnidadVenta = isVisibilidadCeldaVerFormRangoUnidadVenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRangoUnidadVenta() {
		return isVisibilidadCeldaOrdenRangoUnidadVenta;
	}

	public void setIsVisibilidadCeldaOrdenRangoUnidadVenta(Boolean isVisibilidadCeldaOrdenRangoUnidadVenta) {
		this.isVisibilidadCeldaOrdenRangoUnidadVenta = isVisibilidadCeldaOrdenRangoUnidadVenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRangoUnidadVenta() {
		return isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRangoUnidadVenta(Boolean isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta) {
		this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta = isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRangoUnidadVenta() {
		return isVisibilidadCeldaModificarRangoUnidadVenta;
	}

	public void setIsVisibilidadCeldaModificarRangoUnidadVenta(Boolean isVisibilidadCeldaModificarRangoUnidadVenta) {
		this.isVisibilidadCeldaModificarRangoUnidadVenta = isVisibilidadCeldaModificarRangoUnidadVenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRangoUnidadVenta() {
		return isVisibilidadCeldaActualizarRangoUnidadVenta;
	}

	public void setIsVisibilidadCeldaActualizarRangoUnidadVenta(Boolean isVisibilidadCeldaActualizarRangoUnidadVenta) {
		this.isVisibilidadCeldaActualizarRangoUnidadVenta = isVisibilidadCeldaActualizarRangoUnidadVenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarRangoUnidadVenta() {
		return isVisibilidadCeldaEliminarRangoUnidadVenta;
	}

	public void setIsVisibilidadCeldaEliminarRangoUnidadVenta(Boolean isVisibilidadCeldaEliminarRangoUnidadVenta) {
		this.isVisibilidadCeldaEliminarRangoUnidadVenta = isVisibilidadCeldaEliminarRangoUnidadVenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarRangoUnidadVenta() {
		return isVisibilidadCeldaCancelarRangoUnidadVenta;
	}

	public void setIsVisibilidadCeldaCancelarRangoUnidadVenta(Boolean isVisibilidadCeldaCancelarRangoUnidadVenta) {
		this.isVisibilidadCeldaCancelarRangoUnidadVenta = isVisibilidadCeldaCancelarRangoUnidadVenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarRangoUnidadVenta() {
		return isVisibilidadCeldaGuardarRangoUnidadVenta;
	}

	public void setIsVisibilidadCeldaGuardarRangoUnidadVenta(Boolean isVisibilidadCeldaGuardarRangoUnidadVenta) {
		this.isVisibilidadCeldaGuardarRangoUnidadVenta = isVisibilidadCeldaGuardarRangoUnidadVenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRangoUnidadVenta() {
		return isVisibilidadCeldaGuardarCambiosRangoUnidadVenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRangoUnidadVenta(Boolean isVisibilidadCeldaGuardarCambiosRangoUnidadVenta) {
		this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta = isVisibilidadCeldaGuardarCambiosRangoUnidadVenta;
	}
		
	public RangoUnidadVentaSessionBean getrangounidadventaSessionBean() {
		return this.rangounidadventaSessionBean;
	}
	
	public void setrangounidadventaSessionBean(RangoUnidadVentaSessionBean rangounidadventaSessionBean) {
		this.rangounidadventaSessionBean=rangounidadventaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdUnidad() {
		return this.isVisibilidadFK_IdUnidad;
	}

	public void setisVisibilidadFK_IdUnidad(Boolean isVisibilidadFK_IdUnidad) {
		this.isVisibilidadFK_IdUnidad=isVisibilidadFK_IdUnidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(RangoUnidadVenta rangounidadventa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(rangounidadventa,null);
				this.setActualParaGuardarUnidadForeignKey(rangounidadventa,null);
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
	
	public void bugActualizarReferenciaActual(RangoUnidadVenta rangounidadventa,RangoUnidadVenta rangounidadventaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRangoUnidadVenta(rangounidadventa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		rangounidadventaAux.setId(rangounidadventa.getId());
		rangounidadventaAux.setVersionRow(rangounidadventa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRangoUnidadVenta();
		
			int intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.rangounidadventa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = rangounidadventaValidator.getInvalidValues(this.rangounidadventa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			rangounidadventaLogic.setDatosCliente(datosCliente);
			rangounidadventaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				rangounidadventaAux=new  RangoUnidadVenta();
				
				rangounidadventaAux.setIsNew(true);
				rangounidadventaAux.setIsChanged(true);
				
				rangounidadventaAux.setRangoUnidadVentaOriginal(this.rangounidadventa);
				
				rangounidadventaAux.setId(this.rangounidadventa.getId());	
				rangounidadventaAux.setVersionRow(this.rangounidadventa.getVersionRow());	
				rangounidadventaAux.setid_empresa(this.rangounidadventa.getid_empresa());	
				rangounidadventaAux.setid_unidad(this.rangounidadventa.getid_unidad());	
				rangounidadventaAux.setrango_inicial(this.rangounidadventa.getrango_inicial());	
				rangounidadventaAux.setrango_final(this.rangounidadventa.getrango_final());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rangounidadventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(rangounidadventaAux,rangounidadventaLogic.getRangoUnidadVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rangounidadventaAux,rangounidadventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rangounidadventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rangounidadventaLogic.saveRangoUnidadVentas();//WithConnection
						//rangounidadventaLogic.getSetVersionRowRangoUnidadVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.rangounidadventa,rangounidadventaAux);
					
					this.refrescarForeignKeysDescripcionesRangoUnidadVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.getPrecios().addAll(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.preciosEliminados);
							this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precios.addAll(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.preciosEliminados);
							this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rangounidadventaLogic.saveRangoUnidadVentaRelaciones(rangounidadventaAux,this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.getPrecios(),this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//rangounidadventaLogic.getSetVersionRowRangoUnidadVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.rangounidadventa,rangounidadventaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.setPrecios(new ArrayList<Precio>());
							this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precios= new ArrayList<Precio>();
							this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();}
							rangounidadventaAux.setPrecios(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.getPrecios());

							if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							rangounidadventaAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rangounidadventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rangounidadventaAux,rangounidadventaLogic.getRangoUnidadVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rangounidadventaAux,rangounidadventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.rangounidadventa,rangounidadventaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				rangounidadventaAux=new  RangoUnidadVenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado() 
					|| (this.rangounidadventaSessionBean.getEsGuardarRelacionado() && this.rangounidadventa.getId()>=0)) {
						
					rangounidadventaAux.setIsNew(false);
				}
				
				rangounidadventaAux.setIsDeleted(false);
			
				rangounidadventaAux.setId(this.rangounidadventa.getId());	
				rangounidadventaAux.setVersionRow(this.rangounidadventa.getVersionRow());	
				rangounidadventaAux.setid_empresa(this.rangounidadventa.getid_empresa());	
				rangounidadventaAux.setid_unidad(this.rangounidadventa.getid_unidad());	
				rangounidadventaAux.setrango_inicial(this.rangounidadventa.getrango_inicial());	
				rangounidadventaAux.setrango_final(this.rangounidadventa.getrango_final());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rangounidadventaAux,rangounidadventaLogic.getRangoUnidadVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rangounidadventaAux,rangounidadventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rangounidadventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rangounidadventaLogic.saveRangoUnidadVentas();//WithConnection
						//rangounidadventaLogic.getSetVersionRowRangoUnidadVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.rangounidadventa,rangounidadventaAux);
					
					this.refrescarForeignKeysDescripcionesRangoUnidadVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.getPrecios().addAll(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.preciosEliminados);
							this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precios.addAll(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.preciosEliminados);
							this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rangounidadventaLogic.saveRangoUnidadVentaRelaciones(rangounidadventaAux,this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.getPrecios(),this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//rangounidadventaLogic.getSetVersionRowRangoUnidadVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.rangounidadventa,rangounidadventaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.setPrecios(new ArrayList<Precio>());
							this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precios= new ArrayList<Precio>();
							this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();}
							rangounidadventaAux.setPrecios(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.getPrecios());

							if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							rangounidadventaAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rangounidadventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rangounidadventaAux,rangounidadventaLogic.getRangoUnidadVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rangounidadventaAux,rangounidadventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.rangounidadventa,rangounidadventaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				rangounidadventaAux=new  RangoUnidadVenta();
				
				rangounidadventaAux.setIsNew(false);
				rangounidadventaAux.setIsChanged(false);
				
				rangounidadventaAux.setIsDeleted(true);
				
				rangounidadventaAux.setId(this.rangounidadventa.getId());	
				rangounidadventaAux.setVersionRow(this.rangounidadventa.getVersionRow());	
				rangounidadventaAux.setid_empresa(this.rangounidadventa.getid_empresa());	
				rangounidadventaAux.setid_unidad(this.rangounidadventa.getid_unidad());	
				rangounidadventaAux.setrango_inicial(this.rangounidadventa.getrango_inicial());	
				rangounidadventaAux.setrango_final(this.rangounidadventa.getrango_final());	
				
				if(this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.rangounidadventaAux.getId()>=0) {	
						this.rangounidadventasEliminados.add(rangounidadventaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(rangounidadventaAux,rangounidadventaLogic.getRangoUnidadVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rangounidadventaAux,rangounidadventas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rangounidadventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rangounidadventaLogic.saveRangoUnidadVentas();//WithConnection
						//rangounidadventaLogic.getSetVersionRowRangoUnidadVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.getPrecios().addAll(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.preciosEliminados);
							this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precios.addAll(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.preciosEliminados);
							this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rangounidadventaLogic.saveRangoUnidadVentaRelaciones(rangounidadventaAux,this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.getPrecios(),this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//rangounidadventaLogic.getSetVersionRowRangoUnidadVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.setPrecios(new ArrayList<Precio>());
							this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precios= new ArrayList<Precio>();
							this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();}
							rangounidadventaAux.setPrecios(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.getPrecios());

							if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							rangounidadventaAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.rangounidadventaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(rangounidadventaAux,rangounidadventaLogic.getRangoUnidadVentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(rangounidadventaAux,rangounidadventas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.getRangoUnidadVentas().addAll(this.rangounidadventasEliminados);
					
					rangounidadventaLogic.saveRangoUnidadVentas();//WithConnection
					//rangounidadventaLogic.getSetVersionRowRangoUnidadVentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRangoUnidadVenta();
				
				this.rangounidadventasEliminados= new ArrayList<RangoUnidadVenta>();		
			}
			
			if(this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Rango Unidad Venta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Rango Unidad Venta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.rangounidadventa=rangounidadventaAux;
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
      		//this.finishProcessRangoUnidadVenta();
      	}
		
	}	
	
	public void actualizarRelaciones(RangoUnidadVenta rangounidadventaLocal) throws Exception {
		
		if(this.rangounidadventaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				rangounidadventaLocal.setPrecios(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.getPrecios());
				rangounidadventaLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
			
			} else {
			
				rangounidadventaLocal.setPrecios(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precios);
				rangounidadventaLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RangoUnidadVenta rangounidadventaLocal) throws Exception {	
		if(this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				rangounidadventaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				rangounidadventaLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRangoUnidadVentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = rangounidadventaValidator.getInvalidValues(this.rangounidadventa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RangoUnidadVenta rangounidadventa,List<RangoUnidadVenta> rangounidadventas) throws Exception {
		try	{		
			RangoUnidadVentaConstantesFunciones.actualizarLista(rangounidadventa,rangounidadventas,this.rangounidadventaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(RangoUnidadVenta rangounidadventa,List<RangoUnidadVenta> rangounidadventas) throws Exception {
		try	{			
			RangoUnidadVentaConstantesFunciones.actualizarSelectedLista(rangounidadventa,rangounidadventas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RangoUnidadVenta> rangounidadventasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				rangounidadventasLocal=this.rangounidadventaLogic.getRangoUnidadVentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				rangounidadventasLocal=this.rangounidadventas;
			}
			//ARCHITECTURE
		
			for(RangoUnidadVenta rangounidadventaLocal:rangounidadventasLocal) {
				if(this.permiteMantenimiento(rangounidadventaLocal) && rangounidadventaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RangoUnidadVentaConstantesFunciones.getRangoUnidadVentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RangoUnidadVentaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelid_empresaRangoUnidadVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RangoUnidadVentaConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelid_unidadRangoUnidadVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RangoUnidadVentaConstantesFunciones.RANGOINICIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelrango_inicialRangoUnidadVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RangoUnidadVentaConstantesFunciones.RANGOFINAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelrango_finalRangoUnidadVenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelid_empresaRangoUnidadVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelid_unidadRangoUnidadVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelrango_inicialRangoUnidadVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelrango_finalRangoUnidadVenta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Precio")) {
			if(this.rangounidadventa==null) {
				this.rangounidadventa= new RangoUnidadVenta();
			}

			if(this.rangounidadventaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoRangoUnidadVenta
				this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.rangounidadventa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);

				this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.getprecio().setRangoUnidadVenta(this.rangounidadventa);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.rangounidadventa==null) {
				this.rangounidadventa= new RangoUnidadVenta();
			}

			if(this.rangounidadventaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoRangoUnidadVenta
				this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.rangounidadventa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);

				this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setRangoUnidadVenta(this.rangounidadventa);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoRangoUnidadVenta--;	
		
		
		this.rangounidadventaAux=new RangoUnidadVenta();
		
		this.rangounidadventaAux.setId(this.iIdNuevoRangoUnidadVenta);
		this.rangounidadventaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rangounidadventaLogic.getRangoUnidadVentas().add(this.rangounidadventaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.rangounidadventas.add(this.rangounidadventaAux);
		}
		//ARCHITECTURE
		
		this.rangounidadventa=this.rangounidadventaAux;
		
		if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRangoUnidadVenta(this.rangounidadventa);
			this.setVariablesObjetoActualToFormularioForeignKeyRangoUnidadVenta(this.rangounidadventa);
		}
				
		//this.setDefaultControlesRangoUnidadVenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRangoUnidadVenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRangoUnidadVenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRangoUnidadVenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRangoUnidadVenta(this.rangounidadventaBean,this.rangounidadventa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.rangounidadventaSessionBean.getConGuardarRelaciones()) {
			classes=RangoUnidadVentaConstantesFunciones.getClassesRelationshipsOfRangoUnidadVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.rangounidadventaReturnGeneral=rangounidadventaLogic.procesarEventosRangoUnidadVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rangounidadventaLogic.getRangoUnidadVentas(),this.rangounidadventa,this.rangounidadventaParameterGeneral,this.isEsNuevoRangoUnidadVenta,classes);//this.rangounidadventaLogic.getRangoUnidadVenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRangoUnidadVenta(this.rangounidadventaReturnGeneral,this.rangounidadventaBean,false);
		
		if(this.rangounidadventaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRangoUnidadVenta(this.rangounidadventaReturnGeneral.getRangoUnidadVenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRangoUnidadVenta(this.rangounidadventaReturnGeneral.getRangoUnidadVenta());
		}
		
		if(this.rangounidadventaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRangoUnidadVenta(this.rangounidadventaReturnGeneral.getRangoUnidadVenta(),classes);//this.rangounidadventaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.rangounidadventa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRangoUnidadVenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRangoUnidadVenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.RecargarFormRangoUnidadVenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRangoUnidadVenta(false);
						
			if(rangounidadventaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioSessionBean.getEsGuardarRelacionado() && PrecioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPrecioActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRangoUnidadVenta();
			}
			
			this.actualizarVisualTableDatosRangoUnidadVenta();
			
			this.jTableDatosRangoUnidadVenta.setRowSelectionInterval(this.getIndiceNuevoRangoUnidadVenta(), this.getIndiceNuevoRangoUnidadVenta());
			
			this.seleccionarFilaTablaRangoUnidadVentaActual();
						
			this.actualizarEstadoCeldasBotonesRangoUnidadVenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRangoUnidadVenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_inicialRangoUnidadVenta.setEnabled(isHabilitar && this.rangounidadventaConstantesFunciones.activarrango_inicialRangoUnidadVenta);
		this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_finalRangoUnidadVenta.setEnabled(isHabilitar && this.rangounidadventaConstantesFunciones.activarrango_finalRangoUnidadVenta);	
		//
		this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta.setEnabled(isHabilitar && this.rangounidadventaConstantesFunciones.activarid_empresaRangoUnidadVenta);
		this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta.setEnabled(isHabilitar && this.rangounidadventaConstantesFunciones.activarid_unidadRangoUnidadVenta);
	};
	
	public void setDefaultControlesRangoUnidadVenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRangoUnidadVenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.rangounidadventaSessionBean.setConGuardarRelaciones(true);			
			this.rangounidadventaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRangoUnidadVenta.jTabbedPaneRelacionesRangoUnidadVenta.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.rangounidadventaSessionBean.setConGuardarRelaciones(false);			
			this.rangounidadventaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRangoUnidadVenta.jTabbedPaneRelacionesRangoUnidadVenta.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoRangoUnidadVenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RangoUnidadVenta rangounidadventaAux:this.rangounidadventaLogic.getRangoUnidadVentas()) {
				if(rangounidadventaAux.getId().equals(this.iIdNuevoRangoUnidadVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RangoUnidadVenta rangounidadventaAux:this.rangounidadventas) {
				if(rangounidadventaAux.getId().equals(this.iIdNuevoRangoUnidadVenta)) {
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
	
	public int getIndiceActualRangoUnidadVenta(RangoUnidadVenta rangounidadventa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RangoUnidadVenta rangounidadventaAux:this.rangounidadventaLogic.getRangoUnidadVentas()) {
				if(rangounidadventaAux.getId().equals(rangounidadventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RangoUnidadVenta rangounidadventaAux:this.rangounidadventas) {
				if(rangounidadventaAux.getId().equals(rangounidadventa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRangoUnidadVenta(RangoUnidadVenta rangounidadventaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RangoUnidadVenta rangounidadventaAux:this.rangounidadventaLogic.getRangoUnidadVentas()) {
				if(rangounidadventaAux.getRangoUnidadVentaOriginal().getId().equals(rangounidadventaOriginal.getId())) {
					existe=true;
					rangounidadventaOriginal.setId(rangounidadventaAux.getId());
					rangounidadventaOriginal.setVersionRow(rangounidadventaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RangoUnidadVenta rangounidadventaAux:this.rangounidadventas) {
				if(rangounidadventaAux.getRangoUnidadVentaOriginal().getId().equals(rangounidadventaOriginal.getId())) {
					existe=true;
					rangounidadventaOriginal.setId(rangounidadventaAux.getId());
					rangounidadventaOriginal.setVersionRow(rangounidadventaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRangoUnidadVenta(Boolean esParaCancelar) throws Exception {
		rangounidadventasAux=new ArrayList<RangoUnidadVenta>();
		rangounidadventaAux=new RangoUnidadVenta();
		
		if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RangoUnidadVenta rangounidadventaAux:this.rangounidadventaLogic.getRangoUnidadVentas()) {
					if(rangounidadventaAux.getId()<0) {
						rangounidadventasAux.add(rangounidadventaAux);
					}		
				}
				this.iIdNuevoRangoUnidadVenta=0L;
				this.rangounidadventaLogic.getRangoUnidadVentas().removeAll(rangounidadventasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RangoUnidadVenta rangounidadventaAux:this.rangounidadventas) {
					if(rangounidadventaAux.getId()<0) {
						rangounidadventasAux.add(rangounidadventaAux);
					}		
				}
				this.iIdNuevoRangoUnidadVenta=0L;
				this.rangounidadventas.removeAll(rangounidadventasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRangoUnidadVenta 
					&& this.rangounidadventaLogic.getRangoUnidadVentas().size()>0
					) {
					rangounidadventaAux=this.rangounidadventaLogic.getRangoUnidadVentas().get(this.rangounidadventaLogic.getRangoUnidadVentas().size() - 1);
				
					if(rangounidadventaAux.getId()<0) {
						this.rangounidadventaLogic.getRangoUnidadVentas().remove(rangounidadventaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRangoUnidadVenta && this.rangounidadventas.size()>0) {
					rangounidadventaAux=this.rangounidadventas.get(this.rangounidadventas.size() - 1);
				
					if(rangounidadventaAux.getId()<0) {
						this.rangounidadventas.remove(rangounidadventaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRangoUnidadVenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(rangounidadventa.getId()<0) {
				this.rangounidadventaLogic.getRangoUnidadVentas().remove(this.rangounidadventa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(rangounidadventa.getId()<0) {
				this.rangounidadventas.remove(this.rangounidadventa);
			}
		}			
	}
	
	public void setEstadosInicialesRangoUnidadVenta(List<RangoUnidadVenta> rangounidadventasAux) throws Exception {
		RangoUnidadVentaConstantesFunciones.setEstadosInicialesRangoUnidadVenta(rangounidadventasAux);
	}
	
	public void setEstadosInicialesRangoUnidadVenta(RangoUnidadVenta rangounidadventaAux) throws Exception {
		RangoUnidadVentaConstantesFunciones.setEstadosInicialesRangoUnidadVenta(rangounidadventaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRangoUnidadVentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRangoUnidadVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRangoUnidadVentaActual()) {
				if(!this.isEsNuevoRangoUnidadVenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRangoUnidadVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRangoUnidadVenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRangoUnidadVentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Rango Unidad Venta ?", "MANTENIMIENTO DE Rango Unidad Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRangoUnidadVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RangoUnidadVenta rangounidadventa) throws Exception {
		RangoUnidadVentaConstantesFunciones.seleccionarAsignar(this.rangounidadventa,rangounidadventa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRangoUnidadVenta=this.isPermisoActualizarOriginalRangoUnidadVenta;
			
			
			this.seleccionarAsignar(rangounidadventa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RangoUnidadVentaConstantesFunciones.quitarEspaciosRangoUnidadVenta(this.rangounidadventa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRangoUnidadVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.rangounidadventaSessionBean.setsFuncionBusquedaRapida(this.rangounidadventaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRangoUnidadVenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRangoUnidadVenta(esParaCancelar);				
				this.cancelarNuevoRangoUnidadVenta(esParaCancelar);								
			}
			
			this.rangounidadventa=new RangoUnidadVenta();
			
			this.inicializarRangoUnidadVenta();
			
			this.actualizarEstadoCeldasBotonesRangoUnidadVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRangoUnidadVenta() throws Exception {
		try {
			RangoUnidadVentaConstantesFunciones.inicializarRangoUnidadVenta(this.rangounidadventa);
			
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
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.rangounidadventaLogic.getRangoUnidadVentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRangoUnidadVentas(String sAccionBusqueda,List<RangoUnidadVenta> rangounidadventasParaReportes) throws Exception {
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
					sPathReporteFinal="RangoUnidadVenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RangoUnidadVentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RangoUnidadVentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RangoUnidadVenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Rango Unidad Ventas");		
		parameters.put("busquedapor", RangoUnidadVentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Precio.class));
			classes.add(new Classe(ParametroInventarioDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					RangoUnidadVentaLogic rangounidadventaLogicAuxiliar=new RangoUnidadVentaLogic();
					rangounidadventaLogicAuxiliar.setDatosCliente(rangounidadventaLogic.getDatosCliente());				
					rangounidadventaLogicAuxiliar.setRangoUnidadVentas(rangounidadventasParaReportes);
					
					rangounidadventaLogicAuxiliar.cargarRelacionesLoteForeignKeyRangoUnidadVentaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					rangounidadventasParaReportes=rangounidadventaLogicAuxiliar.getRangoUnidadVentas();
					
					//rangounidadventaLogic.getNewConnexionToDeep();
					
					//for (RangoUnidadVenta rangounidadventa:rangounidadventasParaReportes) {
					//	rangounidadventaLogic.deepLoad(rangounidadventa, false, DeepLoadType.INCLUDE, classes);
					//}						
					//rangounidadventaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//rangounidadventaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePrecio = AuxiliarReportes.class.getResourceAsStream("PrecioDetalleRelacionesDesign.jasper");
			parameters.put("subreport_precio", reportFilePrecio);

			InputStream reportFileParametroInventarioDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroInventarioDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametroinventariodefecto", reportFileParametroInventarioDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRangoUnidadVenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RangoUnidadVentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RangoUnidadVentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRangoUnidadVenta=new JRBeanArrayDataSource(RangoUnidadVentaJInternalFrame.TraerRangoUnidadVentaBeans(rangounidadventasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRangoUnidadVenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RangoUnidadVentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RangoUnidadVentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RangoUnidadVentaBean.TraerRangoUnidadVentaBeans(rangounidadventasParaReportes).toArray()));
							
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
				this.generarExcelReporteRangoUnidadVentas(sAccionBusqueda,sTipoArchivoReporte,rangounidadventasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRangoUnidadVentas(sAccionBusqueda,sTipoArchivoReporte,rangounidadventasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRangoUnidadVentaActionPerformed(null);
					//this.generarExcelReporteRangoUnidadVentas(sAccionBusqueda,sTipoArchivoReporte,rangounidadventasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRangoUnidadVentas(sAccionBusqueda,sTipoArchivoReporte,rangounidadventasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRangoUnidadVentas(sAccionBusqueda,sTipoArchivoReporte,rangounidadventasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRangoUnidadVentas(sAccionBusqueda,sTipoArchivoReporte,rangounidadventasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRangoUnidadVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<RangoUnidadVenta> rangounidadventasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rangounidadventa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RangoUnidadVentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRangoUnidadVenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RangoUnidadVenta rangounidadventa : rangounidadventasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RangoUnidadVentaConstantesFunciones.generarExcelReporteDataRangoUnidadVenta("NORMAL",row,workbook,rangounidadventa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Unidad Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRangoUnidadVenta(String sTipo,Row row,Workbook workbook) {
		
		RangoUnidadVentaConstantesFunciones.generarExcelReporteHeaderRangoUnidadVenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRangoUnidadVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<RangoUnidadVenta> rangounidadventasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rangounidadventa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RangoUnidadVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RangoUnidadVenta rangounidadventa : rangounidadventasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RangoUnidadVentaConstantesFunciones.getRangoUnidadVentaDescripcion(rangounidadventa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rangounidadventa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rangounidadventa.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rangounidadventa.getrango_inicial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rangounidadventa.getrango_final());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Unidad Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRangoUnidadVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<RangoUnidadVenta> rangounidadventasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RangoUnidadVenta> rangounidadventasRespaldo=null;
		
		classes=RangoUnidadVentaConstantesFunciones.getClassesRelationshipsOfRangoUnidadVenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.rangounidadventaLogic.setDatosCliente(this.datosCliente);
		this.rangounidadventaLogic.setDatosDeep(this.datosDeep);
		this.rangounidadventaLogic.setIsConDeep(true);
		
		rangounidadventasRespaldo=this.rangounidadventaLogic.getRangoUnidadVentas();
		
		this.rangounidadventaLogic.setRangoUnidadVentas(rangounidadventasParaReportes);	
		this.rangounidadventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		rangounidadventasParaReportes=this.rangounidadventaLogic.getRangoUnidadVentas();
		this.rangounidadventaLogic.setRangoUnidadVentas(rangounidadventasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rangounidadventa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RangoUnidadVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRangoUnidadVenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RangoUnidadVenta rangounidadventa : rangounidadventasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRangoUnidadVenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RangoUnidadVentaConstantesFunciones.generarExcelReporteDataRangoUnidadVenta("NORMAL",row,workbook,rangounidadventa,cellStyleDataAux);
		
			
			


				//Precio
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PrecioConstantesFunciones.SCLASSWEBTITULO))) {

				if(rangounidadventa.getPrecios()!=null && rangounidadventa.getPrecios().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PrecioConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PrecioConstantesFunciones.generarExcelReporteHeaderPrecio("RELACIONADO",row,workbook);
				}

				if(rangounidadventa.getPrecios()!=null) {
					i2=0;
					for(Precio precio : rangounidadventa.getPrecios()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PrecioConstantesFunciones.generarExcelReporteDataPrecio("RELACIONADO",row,workbook,precio,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ParametroInventarioDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(rangounidadventa.getParametroInventarioDefectos()!=null && rangounidadventa.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(rangounidadventa.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : rangounidadventa.getParametroInventarioDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroInventarioDefectoConstantesFunciones.generarExcelReporteDataParametroInventarioDefecto("RELACIONADO",row,workbook,parametroinventariodefecto,cellStyleDataAuxHijo);
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
		cell.setCellValue(RangoUnidadVentaConstantesFunciones.getRangoUnidadVentaDescripcion(rangounidadventa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Unidad Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRangoUnidadVenta() throws Exception {		
		this.startProcessRangoUnidadVenta(true);
	}
	
	public void startProcessRangoUnidadVenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRangoUnidadVenta ,this.jPanelParametrosReportesRangoUnidadVenta, this.jScrollPanelDatosRangoUnidadVenta,this.jPanelPaginacionRangoUnidadVenta, this.jScrollPanelDatosEdicionRangoUnidadVenta, this.jPanelAccionesRangoUnidadVenta,this.jPanelAccionesFormularioRangoUnidadVenta,this.jmenuBarRangoUnidadVenta,this.jmenuBarDetalleRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,this.jTtoolBarDetalleRangoUnidadVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasRangoUnidadVenta=this.jTabbedPaneBusquedasRangoUnidadVenta; 
		
		final JPanel jPanelParametrosReportesRangoUnidadVenta=this.jPanelParametrosReportesRangoUnidadVenta;
		//final JScrollPane jScrollPanelDatosRangoUnidadVenta=this.jScrollPanelDatosRangoUnidadVenta;
		final JTable jTableDatosRangoUnidadVenta=this.jTableDatosRangoUnidadVenta;		
		final JPanel jPanelPaginacionRangoUnidadVenta=this.jPanelPaginacionRangoUnidadVenta;
		//final JScrollPane jScrollPanelDatosEdicionRangoUnidadVenta=this.jScrollPanelDatosEdicionRangoUnidadVenta;
		final JPanel jPanelAccionesRangoUnidadVenta=this.jPanelAccionesRangoUnidadVenta;
		
		JPanel jPanelCamposAuxiliarRangoUnidadVenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRangoUnidadVenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
			jPanelCamposAuxiliarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jPanelCamposRangoUnidadVenta;
			jPanelAccionesFormularioAuxiliarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jPanelAccionesFormularioRangoUnidadVenta;
		}
		
		final JPanel jPanelCamposRangoUnidadVenta=jPanelCamposAuxiliarRangoUnidadVenta;
		final JPanel jPanelAccionesFormularioRangoUnidadVenta=jPanelAccionesFormularioAuxiliarRangoUnidadVenta;
		
		
		final JMenuBar jmenuBarRangoUnidadVenta=this.jmenuBarRangoUnidadVenta;
		final JToolBar jTtoolBarRangoUnidadVenta=this.jTtoolBarRangoUnidadVenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRangoUnidadVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRangoUnidadVenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
			jmenuBarDetalleAuxiliarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jmenuBarDetalleRangoUnidadVenta;
			jTtoolBarDetalleAuxiliarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jTtoolBarDetalleRangoUnidadVenta;
		}
		
		final JMenuBar jmenuBarDetalleRangoUnidadVenta=jmenuBarDetalleAuxiliarRangoUnidadVenta;
		final JToolBar jTtoolBarDetalleRangoUnidadVenta=jTtoolBarDetalleAuxiliarRangoUnidadVenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRangoUnidadVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRangoUnidadVenta;
			processRunnable.jTableDatos=jTableDatosRangoUnidadVenta;
			processRunnable.jPanelCampos=jPanelCamposRangoUnidadVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionRangoUnidadVenta;
			processRunnable.jPanelAcciones=jPanelAccionesRangoUnidadVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRangoUnidadVenta;
			
			
			processRunnable.jmenuBar=jmenuBarRangoUnidadVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRangoUnidadVenta;
			processRunnable.jTtoolBar=jTtoolBarRangoUnidadVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRangoUnidadVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRangoUnidadVenta ,jPanelParametrosReportesRangoUnidadVenta,jTableDatosRangoUnidadVenta, /*jScrollPanelDatosRangoUnidadVenta,*/jPanelCamposRangoUnidadVenta,jPanelPaginacionRangoUnidadVenta, /*jScrollPanelDatosEdicionRangoUnidadVenta,*/ jPanelAccionesRangoUnidadVenta,jPanelAccionesFormularioRangoUnidadVenta,jmenuBarRangoUnidadVenta,jmenuBarDetalleRangoUnidadVenta,jTtoolBarRangoUnidadVenta,jTtoolBarDetalleRangoUnidadVenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRangoUnidadVenta ,jPanelParametrosReportesRangoUnidadVenta, jScrollPanelDatosRangoUnidadVenta,jPanelPaginacionRangoUnidadVenta, jScrollPanelDatosEdicionRangoUnidadVenta, jPanelAccionesRangoUnidadVenta,jPanelAccionesFormularioRangoUnidadVenta,jmenuBarRangoUnidadVenta,jmenuBarDetalleRangoUnidadVenta,jTtoolBarRangoUnidadVenta,jTtoolBarDetalleRangoUnidadVenta);
						
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
	
	public void finishProcessRangoUnidadVenta() {// throws Exception 
		this.finishProcessRangoUnidadVenta(true);
	}
	
	public void finishProcessRangoUnidadVenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRangoUnidadVenta ,this.jPanelParametrosReportesRangoUnidadVenta, this.jScrollPanelDatosRangoUnidadVenta,this.jPanelPaginacionRangoUnidadVenta, this.jScrollPanelDatosEdicionRangoUnidadVenta, this.jPanelAccionesRangoUnidadVenta,this.jPanelAccionesFormularioRangoUnidadVenta,this.jmenuBarRangoUnidadVenta,this.jmenuBarDetalleRangoUnidadVenta,this.jTtoolBarRangoUnidadVenta,this.jTtoolBarDetalleRangoUnidadVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasRangoUnidadVenta=this.jTabbedPaneBusquedasRangoUnidadVenta; 
		
		final JPanel jPanelParametrosReportesRangoUnidadVenta=this.jPanelParametrosReportesRangoUnidadVenta;
		//final JScrollPane jScrollPanelDatosRangoUnidadVenta=this.jScrollPanelDatosRangoUnidadVenta;
		final JTable jTableDatosRangoUnidadVenta=this.jTableDatosRangoUnidadVenta;		
		final JPanel jPanelPaginacionRangoUnidadVenta=this.jPanelPaginacionRangoUnidadVenta;
		//final JScrollPane jScrollPanelDatosEdicionRangoUnidadVenta=this.jScrollPanelDatosEdicionRangoUnidadVenta;
		final JPanel jPanelAccionesRangoUnidadVenta=this.jPanelAccionesRangoUnidadVenta;
		
		JPanel jPanelCamposAuxiliarRangoUnidadVenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRangoUnidadVenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
			jPanelCamposAuxiliarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jPanelCamposRangoUnidadVenta;
			jPanelAccionesFormularioAuxiliarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jPanelAccionesFormularioRangoUnidadVenta;
		}
		
		final JPanel jPanelCamposRangoUnidadVenta=jPanelCamposAuxiliarRangoUnidadVenta;
		final JPanel jPanelAccionesFormularioRangoUnidadVenta=jPanelAccionesFormularioAuxiliarRangoUnidadVenta;
		
		
		final JMenuBar jmenuBarRangoUnidadVenta=this.jmenuBarRangoUnidadVenta;		
		final JToolBar jTtoolBarRangoUnidadVenta=this.jTtoolBarRangoUnidadVenta;
				
		JMenuBar jmenuBarDetalleAuxiliarRangoUnidadVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRangoUnidadVenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
			jmenuBarDetalleAuxiliarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jmenuBarDetalleRangoUnidadVenta;
			jTtoolBarDetalleAuxiliarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jTtoolBarDetalleRangoUnidadVenta;		
		}
		
		final JMenuBar jmenuBarDetalleRangoUnidadVenta=jmenuBarDetalleAuxiliarRangoUnidadVenta;
		final JToolBar jTtoolBarDetalleRangoUnidadVenta=jTtoolBarDetalleAuxiliarRangoUnidadVenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRangoUnidadVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRangoUnidadVenta;
			processRunnable.jTableDatos=jTableDatosRangoUnidadVenta;
			processRunnable.jPanelCampos=jPanelCamposRangoUnidadVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionRangoUnidadVenta;
			processRunnable.jPanelAcciones=jPanelAccionesRangoUnidadVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRangoUnidadVenta;
			
			
			processRunnable.jmenuBar=jmenuBarRangoUnidadVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRangoUnidadVenta;
			processRunnable.jTtoolBar=jTtoolBarRangoUnidadVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRangoUnidadVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRangoUnidadVenta ,jPanelParametrosReportesRangoUnidadVenta, jTableDatosRangoUnidadVenta,/*jScrollPanelDatosRangoUnidadVenta,*/jPanelCamposRangoUnidadVenta,jPanelPaginacionRangoUnidadVenta, /*jScrollPanelDatosEdicionRangoUnidadVenta,*/ jPanelAccionesRangoUnidadVenta,jPanelAccionesFormularioRangoUnidadVenta,jmenuBarRangoUnidadVenta,jmenuBarDetalleRangoUnidadVenta,jTtoolBarRangoUnidadVenta,jTtoolBarDetalleRangoUnidadVenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRangoUnidadVenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRangoUnidadVenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRangoUnidadVenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRangoUnidadVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRangoUnidadVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRangoUnidadVenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRangoUnidadVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRangoUnidadVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRangoUnidadVenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.rangounidadventaConstantesFunciones.getsFinalQueryRangoUnidadVenta();
		String  finalQueryPaginacionTodos=this.rangounidadventaConstantesFunciones.getsFinalQueryRangoUnidadVenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RangoUnidadVentaConstantesFunciones.getArrayColumnasGlobalesNoRangoUnidadVenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RangoUnidadVentaConstantesFunciones.getArrayColumnasGlobalesRangoUnidadVenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RangoUnidadVentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.rangounidadventasEliminados= new ArrayList<RangoUnidadVenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRangoUnidadVenta();
		
				///*RangoUnidadVentaSessionBean*/this.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
			
			if(this.rangounidadventaSessionBean==null) {
				this.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
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
					this.iNumeroPaginacion=RangoUnidadVentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RangoUnidadVentaConstantesFunciones.getClassesForeignKeysOfRangoUnidadVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/rangounidadventa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			rangounidadventasAux= new ArrayList<RangoUnidadVenta>();
			
				
			rangounidadventaLogic.setDatosCliente(this.datosCliente);
			rangounidadventaLogic.setDatosDeep(this.datosDeep);
			rangounidadventaLogic.setIsConDeep(true);
			
			
			rangounidadventaLogic.getRangoUnidadVentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					rangounidadventaLogic.getTodosRangoUnidadVentas(finalQueryGlobal,pagination);
					
					//rangounidadventaLogic.getTodosRangoUnidadVentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(rangounidadventaLogic.getRangoUnidadVentas()==null|| rangounidadventaLogic.getRangoUnidadVentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rangounidadventasAux= new ArrayList<RangoUnidadVenta>();
							rangounidadventasAux.addAll(rangounidadventaLogic.getRangoUnidadVentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rangounidadventasAux= new ArrayList<RangoUnidadVenta>();
							rangounidadventasAux.addAll(rangounidadventas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rangounidadventaLogic.getTodosRangoUnidadVentas(finalQueryGlobal+"",this.pagination);												
							
							//rangounidadventaLogic.getTodosRangoUnidadVentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRangoUnidadVentas("Todos",rangounidadventaLogic.getRangoUnidadVentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rangounidadventaLogic.setRangoUnidadVentas(new ArrayList<RangoUnidadVenta>());					
							rangounidadventaLogic.getRangoUnidadVentas().addAll(rangounidadventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rangounidadventas=new ArrayList<RangoUnidadVenta>();
							rangounidadventas.addAll(rangounidadventasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRangoUnidadVenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRangoUnidadVenta=this.idActual;
				
				} else if(this.idRangoUnidadVentaActual!=null && this.idRangoUnidadVentaActual!=0L) {
					idRangoUnidadVenta=idRangoUnidadVentaActual;
				}
				
					
				this.sDetalleReporte=RangoUnidadVentaConstantesFunciones.getDetalleIndicePorId(idRangoUnidadVenta);
				
				this.rangounidadventas=new ArrayList<RangoUnidadVenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					rangounidadventaLogic.getEntity(idRangoUnidadVenta);
					
					//rangounidadventaLogic.getEntityWithConnection(idRangoUnidadVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rangounidadventaLogic.setRangoUnidadVentas(new ArrayList<RangoUnidadVenta>());
					rangounidadventaLogic.getRangoUnidadVentas().add(rangounidadventaLogic.getRangoUnidadVenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rangounidadventas=new ArrayList<RangoUnidadVenta>();
					this.rangounidadventas.add(rangounidadventa);
				}
				
				if(rangounidadventaLogic.getRangoUnidadVenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RangoUnidadVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rangounidadventaLogic.getRangoUnidadVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RangoUnidadVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RangoUnidadVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rangounidadventaLogic.getRangoUnidadVentas()==null||rangounidadventaLogic.getRangoUnidadVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rangounidadventas==null|| rangounidadventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rangounidadventasAux=new ArrayList<RangoUnidadVenta>();
						rangounidadventasAux.addAll(rangounidadventaLogic.getRangoUnidadVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rangounidadventasAux=new ArrayList<RangoUnidadVenta>();
							rangounidadventasAux.addAll(rangounidadventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rangounidadventaLogic.getRangoUnidadVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RangoUnidadVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RangoUnidadVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRangoUnidadVentas("FK_IdEmpresa",rangounidadventaLogic.getRangoUnidadVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRangoUnidadVentas("FK_IdEmpresa",rangounidadventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rangounidadventaLogic.setRangoUnidadVentas(new ArrayList<RangoUnidadVenta>());
						rangounidadventaLogic.getRangoUnidadVentas().addAll(rangounidadventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rangounidadventas=new ArrayList<RangoUnidadVenta>();
							rangounidadventas.addAll(rangounidadventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=RangoUnidadVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rangounidadventaLogic.getRangoUnidadVentasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RangoUnidadVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RangoUnidadVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rangounidadventaLogic.getRangoUnidadVentas()==null||rangounidadventaLogic.getRangoUnidadVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rangounidadventas==null|| rangounidadventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rangounidadventasAux=new ArrayList<RangoUnidadVenta>();
						rangounidadventasAux.addAll(rangounidadventaLogic.getRangoUnidadVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rangounidadventasAux=new ArrayList<RangoUnidadVenta>();
							rangounidadventasAux.addAll(rangounidadventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rangounidadventaLogic.getRangoUnidadVentasFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RangoUnidadVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RangoUnidadVentaConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRangoUnidadVentas("FK_IdUnidad",rangounidadventaLogic.getRangoUnidadVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRangoUnidadVentas("FK_IdUnidad",rangounidadventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rangounidadventaLogic.setRangoUnidadVentas(new ArrayList<RangoUnidadVenta>());
						rangounidadventaLogic.getRangoUnidadVentas().addAll(rangounidadventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rangounidadventas=new ArrayList<RangoUnidadVenta>();
							rangounidadventas.addAll(rangounidadventasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRangoUnidadVenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRangoUnidadVenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rangounidadventaLogic.getRangoUnidadVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rangounidadventas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rangounidadventaLogic.getRangoUnidadVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rangounidadventas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RangoUnidadVenta rangounidadventa) {
		Boolean permite=true;
		
		if(this.rangounidadventa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RangoUnidadVentaConstantesFunciones.getOrderByListaRangoUnidadVenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RangoUnidadVentaConstantesFunciones.getOrderByListaRangoUnidadVenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RangoUnidadVenta rangounidadventa:rangounidadventaLogic.getRangoUnidadVentas()) {
				if(rangounidadventa.getsType().equals(Constantes2.S_TOTALES)) {
					rangounidadventaTotales=rangounidadventa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RangoUnidadVenta rangounidadventa:this.rangounidadventas) {
				if(rangounidadventa.getsType().equals(Constantes2.S_TOTALES)) {
					rangounidadventaTotales=rangounidadventa;
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
			this.rangounidadventaAux=new RangoUnidadVenta();
			this.rangounidadventaAux.setsType(Constantes2.S_TOTALES);
			this.rangounidadventaAux.setIsNew(false);
			this.rangounidadventaAux.setIsChanged(false);
			this.rangounidadventaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RangoUnidadVentaConstantesFunciones.TotalizarValoresFilaRangoUnidadVenta(this.rangounidadventaLogic.getRangoUnidadVentas(),this.rangounidadventaAux);
				
				this.rangounidadventaLogic.getRangoUnidadVentas().add(this.rangounidadventaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RangoUnidadVentaConstantesFunciones.TotalizarValoresFilaRangoUnidadVenta(this.rangounidadventas,this.rangounidadventaAux);
				
				this.rangounidadventas.add(this.rangounidadventaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		rangounidadventaTotales=new RangoUnidadVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rangounidadventaLogic.getRangoUnidadVentas().remove(rangounidadventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rangounidadventas.remove(rangounidadventaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		rangounidadventaTotales=new RangoUnidadVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RangoUnidadVenta rangounidadventa:rangounidadventaLogic.getRangoUnidadVentas()) {
				if(rangounidadventa.getsType().equals(Constantes2.S_TOTALES)) {
					rangounidadventaTotales=rangounidadventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RangoUnidadVentaConstantesFunciones.TotalizarValoresFilaRangoUnidadVenta(this.rangounidadventaLogic.getRangoUnidadVentas(),rangounidadventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RangoUnidadVenta rangounidadventa:this.rangounidadventas) {
				if(rangounidadventa.getsType().equals(Constantes2.S_TOTALES)) {
					rangounidadventaTotales=rangounidadventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RangoUnidadVentaConstantesFunciones.TotalizarValoresFilaRangoUnidadVenta(this.rangounidadventas,rangounidadventaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRangoUnidadVentasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRangoUnidadVentasFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRangoUnidadVentasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rangounidadventaLogic.getRangoUnidadVentasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRangoUnidadVentasFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rangounidadventaLogic.getRangoUnidadVentasFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosRangoUnidadVenta() {
		this.isPermisoTodoRangoUnidadVenta=false;
		this.isPermisoNuevoRangoUnidadVenta=false;
		this.isPermisoActualizarRangoUnidadVenta=false;
		this.isPermisoActualizarOriginalRangoUnidadVenta=false;
		this.isPermisoEliminarRangoUnidadVenta=false;
		this.isPermisoGuardarCambiosRangoUnidadVenta=false;
		this.isPermisoConsultaRangoUnidadVenta=false;
		this.isPermisoBusquedaRangoUnidadVenta=false;
		this.isPermisoReporteRangoUnidadVenta=false;		
		this.isPermisoOrdenRangoUnidadVenta=false;		
		this.isPermisoPaginacionMedioRangoUnidadVenta=false;		
		this.isPermisoPaginacionAltoRangoUnidadVenta=false;
		this.isPermisoPaginacionTodoRangoUnidadVenta=false;
		this.isPermisoCopiarRangoUnidadVenta=false;		
		this.isPermisoVerFormRangoUnidadVenta=false;		
		this.isPermisoDuplicarRangoUnidadVenta=false;		
		this.isPermisoOrdenRangoUnidadVenta=false;		
	}
	
	public void setPermisosUsuarioRangoUnidadVenta(Boolean isPermiso) {
		this.isPermisoTodoRangoUnidadVenta=isPermiso;
		this.isPermisoNuevoRangoUnidadVenta=isPermiso;
		this.isPermisoActualizarRangoUnidadVenta=isPermiso;
		this.isPermisoActualizarOriginalRangoUnidadVenta=isPermiso;
		this.isPermisoEliminarRangoUnidadVenta=isPermiso;
		this.isPermisoGuardarCambiosRangoUnidadVenta=isPermiso;
		this.isPermisoConsultaRangoUnidadVenta=isPermiso;
		this.isPermisoBusquedaRangoUnidadVenta=isPermiso;
		this.isPermisoReporteRangoUnidadVenta=isPermiso;
		this.isPermisoOrdenRangoUnidadVenta=isPermiso;		
		this.isPermisoPaginacionMedioRangoUnidadVenta=isPermiso;		
		this.isPermisoPaginacionAltoRangoUnidadVenta=isPermiso;		
		this.isPermisoPaginacionTodoRangoUnidadVenta=isPermiso;		
		this.isPermisoCopiarRangoUnidadVenta=isPermiso;		
		this.isPermisoVerFormRangoUnidadVenta=isPermiso;		
		this.isPermisoDuplicarRangoUnidadVenta=isPermiso;
		this.isPermisoOrdenRangoUnidadVenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRangoUnidadVenta(Boolean isPermiso) {
		//this.isPermisoTodoRangoUnidadVenta=isPermiso;
		this.isPermisoNuevoRangoUnidadVenta=isPermiso;
		this.isPermisoActualizarRangoUnidadVenta=isPermiso;
		this.isPermisoActualizarOriginalRangoUnidadVenta=isPermiso;
		this.isPermisoEliminarRangoUnidadVenta=isPermiso;
		this.isPermisoGuardarCambiosRangoUnidadVenta=isPermiso;
		//this.isPermisoConsultaRangoUnidadVenta=isPermiso;
		//this.isPermisoBusquedaRangoUnidadVenta=isPermiso;
		//this.isPermisoReporteRangoUnidadVenta=isPermiso;
		//this.isPermisoOrdenRangoUnidadVenta=isPermiso;		
		//this.isPermisoPaginacionMedioRangoUnidadVenta=isPermiso;		
		//this.isPermisoPaginacionAltoRangoUnidadVenta=isPermiso;		
		//this.isPermisoPaginacionTodoRangoUnidadVenta=isPermiso;		
		//this.isPermisoCopiarRangoUnidadVenta=isPermiso;		
		//this.isPermisoDuplicarRangoUnidadVenta=isPermiso;
		//this.isPermisoOrdenRangoUnidadVenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRangoUnidadVentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PrecioConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(RangoUnidadVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPrecio=false;
		this.isTienePermisosPrecio=this.verificarGetPermisosUsuarioOpcionRangoUnidadVentaClaseRelacionada(this.opcionsRelacionadas,PrecioConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroInventarioDefecto=false;
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionRangoUnidadVentaClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebRangoUnidadVenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRangoUnidadVentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPrecio=conPermiso;
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioRangoUnidadVentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRangoUnidadVentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRangoUnidadVentaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPrecio && this.jInternalFrameDetalleFormRangoUnidadVenta!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jTabbedPaneRelacionesRangoUnidadVenta.remove(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormRangoUnidadVenta!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jTabbedPaneRelacionesRangoUnidadVenta.remove(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioRangoUnidadVenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RangoUnidadVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RangoUnidadVentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRangoUnidadVenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRangoUnidadVenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRangoUnidadVenta=this.isPermisoActualizarRangoUnidadVenta;
			this.isPermisoEliminarRangoUnidadVenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRangoUnidadVenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRangoUnidadVenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRangoUnidadVenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRangoUnidadVenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRangoUnidadVenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRangoUnidadVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRangoUnidadVenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRangoUnidadVenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRangoUnidadVenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRangoUnidadVenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRangoUnidadVenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRangoUnidadVenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRangoUnidadVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRangoUnidadVenta.setToolTipText(this.jTableDatosRangoUnidadVenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRangoUnidadVenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRangoUnidadVenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RangoUnidadVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RangoUnidadVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRangoUnidadVenta() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPrecio && this.rangounidadventaConstantesFunciones.mostrarPrecioRangoUnidadVenta && !RangoUnidadVentaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Precio");
			reporte.setsDescripcion("Precio");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroInventarioDefecto && this.rangounidadventaConstantesFunciones.mostrarParametroInventarioDefectoRangoUnidadVenta && !RangoUnidadVentaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Inventario Defecto");
			reporte.setsDescripcion("Parametro Inventario Defecto");
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
	public void inicializarCombosForeignKeyRangoUnidadVentaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRangoUnidadVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RangoUnidadVentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRangoUnidadVentaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyUnidadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UnidadConstantesFunciones.SFINALQUERY;

				this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyRangoUnidadVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RangoUnidadVentaParameterReturnGeneral rangounidadventaReturnGeneral=new RangoUnidadVentaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.rangounidadventaConstantesFunciones.cargarid_empresaRangoUnidadVenta)
					 || (this.esRecargarFks && this.rangounidadventaConstantesFunciones.cargarid_empresaRangoUnidadVenta)) {

					if(!this.rangounidadventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+rangounidadventaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.rangounidadventaConstantesFunciones.cargarid_unidadRangoUnidadVenta)
					 || (this.esRecargarFks && this.rangounidadventaConstantesFunciones.cargarid_unidadRangoUnidadVenta)) {

					if(!this.rangounidadventaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+rangounidadventaSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				rangounidadventaReturnGeneral=rangounidadventaLogic.cargarCombosLoteForeignKeyRangoUnidadVenta(finalQueryGlobalEmpresa,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=rangounidadventaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=rangounidadventaReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRangoUnidadVenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.rangounidadventaSessionBean==null) {
				this.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
			}

			if(!this.rangounidadventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.rangounidadventaSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				Unidad unidad=new Unidad();
				UnidadConstantesFunciones.setUnidadDescripcion(unidad,Constantes.SMENSAJE_ESCOJA_OPCION);
				unidad.setId(null);

				if(!UnidadConstantesFunciones.ExisteEnLista(this.unidadsForeignKey,unidad,true)) {

					this.unidadsForeignKey.add(0,unidad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyRangoUnidadVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRangoUnidadVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRangoUnidadVenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRangoUnidadVenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRangoUnidadVenta(RangoUnidadVenta rangounidadventa)throws Exception {	
		try {
			
			this.setActualUnidadForeignKey(rangounidadventa.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRangoUnidadVenta(RangoUnidadVenta rangounidadventa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRangoUnidadVenta()throws Exception {	
		try {
			
			this.setActualUnidadForeignKey(this.rangounidadventaConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRangoUnidadVenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRangoUnidadVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRangoUnidadVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRangoUnidadVenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRangoUnidadVenta()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRangoUnidadVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRangoUnidadVenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public RangoUnidadVentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RangoUnidadVentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RangoUnidadVentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean(); 
		this.rangounidadventaConstantesFunciones=new RangoUnidadVentaConstantesFunciones(); 
		this.rangounidadventaBean=new RangoUnidadVenta();//(this.rangounidadventaConstantesFunciones); 		
		this.rangounidadventaReturnGeneral=new RangoUnidadVentaParameterReturnGeneral(); 
		
		this.rangounidadventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rangounidadventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RangoUnidadVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RangoUnidadVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RangoUnidadVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRangoUnidadVenta(true);
			
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
			
			this.rangounidadventaConstantesFunciones=new RangoUnidadVentaConstantesFunciones(); 
			this.rangounidadventaBean=new RangoUnidadVenta();//this.rangounidadventaConstantesFunciones); 			
			this.rangounidadventaReturnGeneral=new RangoUnidadVentaParameterReturnGeneral(); 
		
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rango Unidad Venta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.rangounidadventa=new RangoUnidadVenta();
			this.rangounidadventas = new ArrayList<RangoUnidadVenta>();
			this.rangounidadventasAux = new ArrayList<RangoUnidadVenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic=new RangoUnidadVentaLogic();
				this.rangounidadventaLogic.getNewConnexionToDeep("");
			}
			
			//this.rangounidadventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.rangounidadventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRangoUnidadVenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRangoUnidadVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRangoUnidadVenta);	
					}
					
					if(this.jInternalFrameImportacionRangoUnidadVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRangoUnidadVenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRangoUnidadVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRangoUnidadVenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRangoUnidadVenta);
				this.jInternalFrameDetalleFormRangoUnidadVenta.setVisible(false);
				this.jInternalFrameDetalleFormRangoUnidadVenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRangoUnidadVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRangoUnidadVenta);
					this.jInternalFrameReporteDinamicoRangoUnidadVenta.setVisible(false);
					this.jInternalFrameReporteDinamicoRangoUnidadVenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRangoUnidadVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRangoUnidadVenta);
					this.jInternalFrameImportacionRangoUnidadVenta.setVisible(false);
					this.jInternalFrameImportacionRangoUnidadVenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRangoUnidadVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRangoUnidadVenta);
					this.jInternalFrameOrderByRangoUnidadVenta.setVisible(false);
					this.jInternalFrameOrderByRangoUnidadVenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRangoUnidadVentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RangoUnidadVentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.rangounidadventaReturnGeneral=new RangoUnidadVentaParameterReturnGeneral();
			
			this.rangounidadventaParameterGeneral=new RangoUnidadVentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.rangounidadventaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RangoUnidadVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PrecioConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RangoUnidadVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rangounidadventaSessionBean.getEsGuardarRelacionado(),this.rangounidadventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RangoUnidadVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rangounidadventaSessionBean.getEsGuardarRelacionado(),this.rangounidadventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRangoUnidadVenta=false;
			this.isVisibilidadCeldaDuplicarRangoUnidadVenta=true;
			this.isVisibilidadCeldaCopiarRangoUnidadVenta=true;
			this.isVisibilidadCeldaVerFormRangoUnidadVenta=true;
			this.isVisibilidadCeldaOrdenRangoUnidadVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=false;
			this.isVisibilidadCeldaModificarRangoUnidadVenta=false;
			this.isVisibilidadCeldaActualizarRangoUnidadVenta=false;
			this.isVisibilidadCeldaEliminarRangoUnidadVenta=false;
			this.isVisibilidadCeldaCancelarRangoUnidadVenta=false;
			this.isVisibilidadCeldaGuardarRangoUnidadVenta=false;
			this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRangoUnidadVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRangoUnidadVenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRangoUnidadVenta(false);
			
			this.setPermisosUsuarioRangoUnidadVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado() 
				|| (this.rangounidadventaSessionBean.getEsGuardarRelacionado() && this.rangounidadventaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRangoUnidadVentaClasesRelacionadas();
			}
			
			if(this.rangounidadventaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRangoUnidadVentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRangoUnidadVenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRangoUnidadVenta();
			}
			
			if(!this.isPermisoBusquedaRangoUnidadVenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRangoUnidadVenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRangoUnidadVenta,this.isPermisoPaginacionMedioRangoUnidadVenta,this.isPermisoPaginacionTodoRangoUnidadVenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RangoUnidadVentaConstantesFunciones.getTiposSeleccionarRangoUnidadVenta());
				
				this.tiposColumnasSelect=RangoUnidadVentaConstantesFunciones.getTiposSeleccionarRangoUnidadVenta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectRangoUnidadVenta();				
				//this.tiposRelacionesSelect=RangoUnidadVentaConstantesFunciones.getTiposRelacionesRangoUnidadVenta(true);
				
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
			//if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRangoUnidadVenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioRangoUnidadVenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioRangoUnidadVenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRangoUnidadVenta() ;
			
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
			
			
			this.precioLogic=new PrecioLogic();
			this.parametroinventariodefectoLogic=new ParametroInventarioDefectoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.unidadLogic=new UnidadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				rangounidadventaImplementable= (RangoUnidadVentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RangoUnidadVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				rangounidadventaImplementableHome= (RangoUnidadVentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RangoUnidadVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.rangounidadventas= new ArrayList<RangoUnidadVenta>();
			this.rangounidadventasEliminados= new ArrayList<RangoUnidadVenta>();
						
			this.isEsNuevoRangoUnidadVenta=false;
			this.esParaAccionDesdeFormularioRangoUnidadVenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRangoUnidadVenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRangoUnidadVenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RangoUnidadVentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRangoUnidadVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRangoUnidadVenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRangoUnidadVenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRangoUnidadVenta();
			}
			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRangoUnidadVenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRangoUnidadVenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRangoUnidadVenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRangoUnidadVenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RangoUnidadVenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRangoUnidadVenta() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PrecioConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PrecioConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRangoUnidadVenta")) {
				iIndex=this.jInternalFrameDetalleFormRangoUnidadVenta.jTabbedPaneRelacionesRangoUnidadVenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRangoUnidadVenta.jTabbedPaneRelacionesRangoUnidadVenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();	
				
				

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessRangoUnidadVenta();

						this.cargarParteTabPanelRelacionadaParametroInventarioDefecto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Precios")) {
					if(!PrecioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessRangoUnidadVenta();

						this.cargarParteTabPanelRelacionadaPrecio(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRangoUnidadVenta();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormRangoUnidadVenta.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesRangoUnidadVenta.updateUI();
		//this.jTabbedPaneRelacionesRangoUnidadVenta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesRangoUnidadVenta.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaPrecio(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormRangoUnidadVenta.cargarSessionConBeanSwingJInternalFramePrecio(false,true,iIndex);
		this.jButtonPrecioActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPrecio();

		//this.jTabbedPaneRelacionesRangoUnidadVenta.updateUI();
		//this.jTabbedPaneRelacionesRangoUnidadVenta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesRangoUnidadVenta.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Precio")) {
				int row=this.jTableDatosRangoUnidadVenta.getSelectedRow();
				jButtonPrecioActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosRangoUnidadVenta.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Precio")) {

					if(this.isTienePermisosPrecio && this.rangounidadventaConstantesFunciones.mostrarPrecioRangoUnidadVenta && !RangoUnidadVentaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Precios"+"("+PrecioConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Precios");

						if(rangounidadventaConstantesFunciones.resaltarPrecioRangoUnidadVenta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(rangounidadventaConstantesFunciones.resaltarPrecioRangoUnidadVenta);
						}

						jmenuItem.setEnabled(this.rangounidadventaConstantesFunciones.activarPrecioRangoUnidadVenta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Precio"));

						

						this.jInternalFrameDetalleFormRangoUnidadVenta.jmenuDetalleRangoUnidadVenta.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.rangounidadventaConstantesFunciones.mostrarParametroInventarioDefectoRangoUnidadVenta && !RangoUnidadVentaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(rangounidadventaConstantesFunciones.resaltarParametroInventarioDefectoRangoUnidadVenta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(rangounidadventaConstantesFunciones.resaltarParametroInventarioDefectoRangoUnidadVenta);
						}

						jmenuItem.setEnabled(this.rangounidadventaConstantesFunciones.activarParametroInventarioDefectoRangoUnidadVenta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormRangoUnidadVenta.jmenuDetalleRangoUnidadVenta.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyRangoUnidadVenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRangoUnidadVenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRangoUnidadVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRangoUnidadVentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRangoUnidadVenta();
		
		this.cargarCombosFrameForeignKeyRangoUnidadVenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRangoUnidadVenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRangoUnidadVenta();
		}
	}
	
	

	public void cargarCombosForeignKeyUnidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaUnidad(this.unidadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoRangoUnidadVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.rangounidadventaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			
			
			if(jTableDatosRangoUnidadVenta.getRowCount()>=1) {
				jTableDatosRangoUnidadVenta.removeRowSelectionInterval(0, jTableDatosRangoUnidadVenta.getRowCount()-1);						
			}
			
			this.isEsNuevoRangoUnidadVenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRangoUnidadVenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRangoUnidadVenta(true);			
			//this.rangounidadventa=new RangoUnidadVenta();
			//this.rangounidadventa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRangoUnidadVenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRangoUnidadVenta() ;
			
			if(RangoUnidadVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRangoUnidadVenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.rangounidadventa);	
			this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);				
			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			
			if(this.rangounidadventaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RangoUnidadVenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRangoUnidadVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados=new ArrayList<RangoUnidadVenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRangoUnidadVenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRangoUnidadVenta.getSelectedRows().length;			
			}
			
			rangounidadventasSeleccionados=this.getRangoUnidadVentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRangoUnidadVenta--;			
				//RangoUnidadVenta rangounidadventaAux= new RangoUnidadVenta();			
				//rangounidadventaAux.setId(this.iIdNuevoRangoUnidadVenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RangoUnidadVenta rangounidadventaOrigen=new RangoUnidadVenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RangoUnidadVenta rangounidadventaOrigen : rangounidadventasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							rangounidadventaOrigen =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rangounidadventaOrigen =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRangoUnidadVenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.rangounidadventa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRangoUnidadVenta(rangounidadventaOrigen,this.rangounidadventa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rangounidadventaLogic.getRangoUnidadVentas().add(this.rangounidadventaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rangounidadventas.add(this.rangounidadventaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRangoUnidadVenta(false);
				
				this.jTableDatosRangoUnidadVenta.setRowSelectionInterval(this.getIndiceNuevoRangoUnidadVenta(), this.getIndiceNuevoRangoUnidadVenta());
				
				int iLastRow =  this.jTableDatosRangoUnidadVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRangoUnidadVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRangoUnidadVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRangoUnidadVenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados=new ArrayList<RangoUnidadVenta>();									
		
			RangoUnidadVenta rangounidadventaOrigen=new RangoUnidadVenta();
			RangoUnidadVenta rangounidadventaDestino=new RangoUnidadVenta();
				
			rangounidadventasSeleccionados=this.getRangoUnidadVentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRangoUnidadVenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || rangounidadventasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRangoUnidadVenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rangounidadventaOrigen =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rangounidadventaOrigen =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rangounidadventaDestino =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rangounidadventaDestino =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				rangounidadventaOrigen =rangounidadventasSeleccionados.get(0);
				rangounidadventaDestino =rangounidadventasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRangoUnidadVenta(rangounidadventaOrigen,rangounidadventaDestino,true,false);
				
				rangounidadventaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rangounidadventaDestino,rangounidadventaLogic.getRangoUnidadVentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rangounidadventaDestino,rangounidadventas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRangoUnidadVenta(false);
				
				//this.jTableDatosRangoUnidadVenta.setRowSelectionInterval(this.getIndiceNuevoRangoUnidadVenta(), this.getIndiceNuevoRangoUnidadVenta());
				
				int iLastRow =  this.jTableDatosRangoUnidadVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRangoUnidadVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRangoUnidadVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRangoUnidadVenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRangoUnidadVenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRangoUnidadVenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRangoUnidadVenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRangoUnidadVenta.setVisible(!isVisible);
			this.jPanelPaginacionRangoUnidadVenta.setVisible(!isVisible);
			this.jPanelAccionesRangoUnidadVenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRangoUnidadVenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRangoUnidadVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRangoUnidadVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRangoUnidadVenta();
			
			this.abrirFrameOrderByRangoUnidadVenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRangoUnidadVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRangoUnidadVenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRangoUnidadVenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRangoUnidadVenta.isMaximum()) {
					this.jInternalFrameDetalleFormRangoUnidadVenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRangoUnidadVenta.setSize(this.jInternalFrameDetalleFormRangoUnidadVenta.iWidthFormulario,this.jInternalFrameDetalleFormRangoUnidadVenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRangoUnidadVenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRangoUnidadVenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRangoUnidadVenta.isMaximum()) {
						this.jInternalFrameDetalleFormRangoUnidadVenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRangoUnidadVenta.jContentPaneDetalleRangoUnidadVenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRangoUnidadVenta.jTabbedPaneRelacionesRangoUnidadVenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRangoUnidadVenta.jContentPaneDetalleRangoUnidadVenta.getWidth(),RangoUnidadVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRangoUnidadVenta.jTabbedPaneRelacionesRangoUnidadVenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRangoUnidadVenta.jContentPaneDetalleRangoUnidadVenta.getWidth(),RangoUnidadVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRangoUnidadVenta.jTabbedPaneRelacionesRangoUnidadVenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRangoUnidadVenta.jContentPaneDetalleRangoUnidadVenta.getWidth(),RangoUnidadVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}

					if(PrecioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPrecio();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRangoUnidadVenta.setVisible(true);
	        this.jInternalFrameDetalleFormRangoUnidadVenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRangoUnidadVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRangoUnidadVenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRangoUnidadVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRangoUnidadVenta,false,this);
				} else {
					this.jInternalFrameOrderByRangoUnidadVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRangoUnidadVenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRangoUnidadVenta);
				this.jInternalFrameOrderByRangoUnidadVenta.setVisible(false);
				this.jInternalFrameOrderByRangoUnidadVenta.setSelected(false);
				
				this.jInternalFrameOrderByRangoUnidadVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRangoUnidadVenta"));
				
				this.inicializarActualizarBindingTablaOrderByRangoUnidadVenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRangoUnidadVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRangoUnidadVenta==null) {
				
				this.jInternalFrameImportacionRangoUnidadVenta=new ImportacionJInternalFrame(RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRangoUnidadVenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRangoUnidadVenta);
				this.jInternalFrameImportacionRangoUnidadVenta.setVisible(false);
				this.jInternalFrameImportacionRangoUnidadVenta.setSelected(false);


				this.jInternalFrameImportacionRangoUnidadVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRangoUnidadVenta"));
				this.jInternalFrameImportacionRangoUnidadVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRangoUnidadVenta"));
				this.jInternalFrameImportacionRangoUnidadVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRangoUnidadVenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRangoUnidadVenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRangoUnidadVenta==null) {
				this.jInternalFrameReporteDinamicoRangoUnidadVenta=new ReporteDinamicoJInternalFrame(RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRangoUnidadVenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRangoUnidadVenta);
				this.jInternalFrameReporteDinamicoRangoUnidadVenta.setVisible(false);
				this.jInternalFrameReporteDinamicoRangoUnidadVenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRangoUnidadVenta"));
				this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRangoUnidadVenta"));
				this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRangoUnidadVenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRangoUnidadVenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormRangoUnidadVenta.jContentPaneDetalleRangoUnidadVenta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaPrecio() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormRangoUnidadVenta.jContentPaneDetalleRangoUnidadVenta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleRangoUnidadVenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRangoUnidadVenta);
			
	       	this.jInternalFrameDetalleFormRangoUnidadVenta.setVisible(false);
	        this.jInternalFrameDetalleFormRangoUnidadVenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormRangoUnidadVenta.dispose();
			//this.jInternalFrameDetalleFormRangoUnidadVenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRangoUnidadVenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRangoUnidadVenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoRangoUnidadVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRangoUnidadVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRangoUnidadVenta.setVisible(true);
	        this.jInternalFrameImportacionRangoUnidadVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRangoUnidadVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRangoUnidadVenta.setVisible(true);
	        this.jInternalFrameOrderByRangoUnidadVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRangoUnidadVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRangoUnidadVenta.setVisible(false);
	        this.jInternalFrameOrderByRangoUnidadVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRangoUnidadVenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRangoUnidadVenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoRangoUnidadVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRangoUnidadVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRangoUnidadVenta.setVisible(false);
	        this.jInternalFrameImportacionRangoUnidadVenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRangoUnidadVenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRangoUnidadVenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRangoUnidadVenta(true);
			//this.isEsNuevoRangoUnidadVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRangoUnidadVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRangoUnidadVenta(false) ;
			
			if(rangounidadventaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioSessionBean.getEsGuardarRelacionado() && PrecioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPrecioActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(RangoUnidadVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRangoUnidadVenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRangoUnidadVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRangoUnidadVentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRangoUnidadVenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRangoUnidadVenta(true);
			//this.isEsNuevoRangoUnidadVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.rangounidadventa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRangoUnidadVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRangoUnidadVenta(false) ;
			
			if(RangoUnidadVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRangoUnidadVenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRangoUnidadVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosRangoUnidadVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoUnidadVenta,RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRangoUnidadVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRangoUnidadVenta(false);
			
			//if(!this.isEsNuevoRangoUnidadVenta) {								
				int intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.rangounidadventa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
				
			}
			
			if(this.permiteMantenimiento(this.rangounidadventa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRangoUnidadVenta=true;
					this.inicializarActualizarBindingTablaRangoUnidadVenta(false);
					this.isEsNuevoRangoUnidadVenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRangoUnidadVenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRangoUnidadVenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRangoUnidadVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRangoUnidadVenta(false);
				
				this.habilitarDeshabilitarControlesRangoUnidadVenta(false);
			
												
				
				if(RangoUnidadVentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRangoUnidadVenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRangoUnidadVentaActionPerformed(evt,rangounidadventaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRangoUnidadVenta(this.rangounidadventa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRangoUnidadVenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,rangounidadventaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.rangounidadventa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RangoUnidadVenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoUnidadVenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				this.rangounidadventa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				this.rangounidadventa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.rangounidadventa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RangoUnidadVentaModel) this.jTableDatosRangoUnidadVenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRangoUnidadVenta=true;
				this.inicializarActualizarBindingTablaRangoUnidadVenta(false);
				this.isEsNuevoRangoUnidadVenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRangoUnidadVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRangoUnidadVenta(false);
				
				this.habilitarDeshabilitarControlesRangoUnidadVenta(false);
				
				
				
				if(RangoUnidadVentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRangoUnidadVenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRangoUnidadVenta.getRowCount()>=1) {
				jTableDatosRangoUnidadVenta.removeRowSelectionInterval(0, jTableDatosRangoUnidadVenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRangoUnidadVenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRangoUnidadVenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRangoUnidadVenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRangoUnidadVenta(false) ;
			
			this.isEsNuevoRangoUnidadVenta=false;
			
			if(RangoUnidadVentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRangoUnidadVenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRangoUnidadVenta(false);
				
				//SI ES MANUAL
				if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRangoUnidadVenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRangoUnidadVenta--;			
			//RangoUnidadVenta rangounidadventaAux= new RangoUnidadVenta();			
			//rangounidadventaAux.setId(this.iIdNuevoRangoUnidadVenta);
			
			if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRangoUnidadVenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
			
			this.rangounidadventa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.rangounidadventaLogic.getRangoUnidadVentas().add(this.rangounidadventaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.rangounidadventas.add(this.rangounidadventaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRangoUnidadVenta(false);
			
			this.jTableDatosRangoUnidadVenta.setRowSelectionInterval(this.getIndiceNuevoRangoUnidadVenta(), this.getIndiceNuevoRangoUnidadVenta());
			
			int iLastRow =  this.jTableDatosRangoUnidadVenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRangoUnidadVenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRangoUnidadVenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRangoUnidadVenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRangoUnidadVenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRangoUnidadVenta(false);
			
			//SI ES MANUAL
			if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRangoUnidadVenta();
			}
			
			//this.abrirFrameTreeRangoUnidadVenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Rango Unidad VentaS ?", "MANTENIMIENTO DE Rango Unidad Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRangoUnidadVenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRangoUnidadVenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.rangounidadventaReturnGeneral=rangounidadventaLogic.procesarImportacionRangoUnidadVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.rangounidadventaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRangoUnidadVentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRangoUnidadVenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRangoUnidadVenta.setFileImportacion(this.jInternalFrameImportacionRangoUnidadVenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRangoUnidadVenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRangoUnidadVenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRangoUnidadVenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRangoUnidadVenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados=new ArrayList<RangoUnidadVenta>();		

		rangounidadventasSeleccionados=this.getRangoUnidadVentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RangoUnidadVentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RangoUnidadVentaBaseDesign.jrxml";
			
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
			
			this.generarReporteRangoUnidadVentas("Todos",rangounidadventasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Unidad Venta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ngoInicial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ngoInicial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ngoInicial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ngoInicial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ngoFinal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ngoFinal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ngoFinal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ngoFinal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL:
					sNombreCampoCategoria="rango_inicial";
					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL:
					sNombreCampoCategoria="rango_final";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL:
					sNombreCampoCategoriaValor="rango_inicial";
					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL:
					sNombreCampoCategoriaValor="rango_final";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Rango Inicial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"rango_inicial");
					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Rango Final",sNombreCampoCategoria,sNombreCampoCategoriaValor,"rango_final");
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
	
	public void jButtonGenerarExcelReporteDinamicoRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados=new ArrayList<RangoUnidadVenta>();		
		
		rangounidadventasSeleccionados=this.getRangoUnidadVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rangounidadventa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RangoUnidadVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RangoUnidadVenta rangounidadventa:rangounidadventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rangounidadventa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(RangoUnidadVenta rangounidadventa:rangounidadventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rangounidadventa.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL);
					iRow++;

					for(RangoUnidadVenta rangounidadventa:rangounidadventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rangounidadventa.getrango_inicial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL);
					iRow++;

					for(RangoUnidadVenta rangounidadventa:rangounidadventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rangounidadventa.getrango_final());
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
			//	this.getFilaCabeceraExportarExcelRangoUnidadVenta(row);				
			//	iRow++;
			//}				
			
			//for(RangoUnidadVenta rangounidadventaAux:rangounidadventasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRangoUnidadVenta(rangounidadventaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Unidad Venta",JOptionPane.INFORMATION_MESSAGE);
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
				this.rangounidadventaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRangoUnidadVenta(false);
			
			//SI ES MANUAL
			if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRangoUnidadVenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRangoUnidadVenta(false);
			
			//SI ES MANUAL
			if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRangoUnidadVenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRangoUnidadVenta(false);
			
			//SI ES MANUAL
			if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRangoUnidadVenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRangoUnidadVenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRangoUnidadVenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRangoUnidadVenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRangoUnidadVenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRangoUnidadVenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRangoUnidadVenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosRangoUnidadVenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosRangoUnidadVenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRangoUnidadVenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRangoUnidadVenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRangoUnidadVenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRangoUnidadVenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRangoUnidadVenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRangoUnidadVenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRangoUnidadVenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRangoUnidadVenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRangoUnidadVenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRangoUnidadVenta();
		
		this.inicializarActualizarBindingBotonesManualRangoUnidadVenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRangoUnidadVenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRangoUnidadVenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRangoUnidadVenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRangoUnidadVenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRangoUnidadVenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRangoUnidadVenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRangoUnidadVenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRangoUnidadVenta.jCheckBoxPostAccionNuevoRangoUnidadVenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRangoUnidadVenta.jCheckBoxPostAccionSinCerrarRangoUnidadVenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRangoUnidadVenta.jCheckBoxPostAccionSinMensajeRangoUnidadVenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRangoUnidadVenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRangoUnidadVenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRangoUnidadVenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
				this.jInternalFrameDetalleFormRangoUnidadVenta.jCheckBoxPostAccionNuevoRangoUnidadVenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRangoUnidadVenta.jCheckBoxPostAccionSinCerrarRangoUnidadVenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRangoUnidadVenta.jCheckBoxPostAccionSinMensajeRangoUnidadVenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRangoUnidadVenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRangoUnidadVenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRangoUnidadVenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRangoUnidadVenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRangoUnidadVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRangoUnidadVenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRangoUnidadVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRangoUnidadVenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRangoUnidadVenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRangoUnidadVenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRangoUnidadVenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRangoUnidadVenta(Boolean esInicializar) throws Exception {
		try	{	
			if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRangoUnidadVenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRangoUnidadVenta() throws Exception {
		try	{
			if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRangoUnidadVenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRangoUnidadVenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRangoUnidadVenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRangoUnidadVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRangoUnidadVenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRangoUnidadVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRangoUnidadVenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRangoUnidadVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRangoUnidadVenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRangoUnidadVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRangoUnidadVenta.addItem(reporte);
			}
			
			
			if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRangoUnidadVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRangoUnidadVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRangoUnidadVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRangoUnidadVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRangoUnidadVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRangoUnidadVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRangoUnidadVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRangoUnidadVenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRangoUnidadVenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRangoUnidadVenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRangoUnidadVenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRangoUnidadVenta!=null) {
				this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRangoUnidadVenta!=null) {
				this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRangoUnidadVenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=RangoUnidadVentaConstantesFunciones.getTiposSeleccionarRangoUnidadVenta(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=RangoUnidadVentaConstantesFunciones.getTiposSeleccionarRangoUnidadVenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=RangoUnidadVentaConstantesFunciones.getTiposSeleccionarRangoUnidadVenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRangoUnidadVenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadRangoUnidadVenta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRangoUnidadVenta(Boolean esInicializar) throws Exception {				
		if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRangoUnidadVenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRangoUnidadVenta() throws Exception {
		this.inicializarActualizarBindingTablaRangoUnidadVenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRangoUnidadVenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRangoUnidadVenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRangoUnidadVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRangoUnidadVenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RangoUnidadVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRangoUnidadVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRangoUnidadVenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RangoUnidadVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRangoUnidadVentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoUnidadVentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RangoUnidadVentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRangoUnidadVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRangoUnidadVenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RangoUnidadVentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRangoUnidadVenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRangoUnidadVenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=rangounidadventaLogic.getRangoUnidadVentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=rangounidadventas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRangoUnidadVenta.setModel(new RangoUnidadVentaModel(this.rangounidadventaLogic.getRangoUnidadVentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRangoUnidadVenta.setModel(new RangoUnidadVentaModel(this.rangounidadventas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRangoUnidadVenta!=null && this.jInternalFrameOrderByRangoUnidadVenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRangoUnidadVenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRangoUnidadVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoUnidadVenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RangoUnidadVentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO,rangounidadventaConstantesFunciones.resaltarSeleccionarRangoUnidadVenta,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO,rangounidadventaConstantesFunciones.resaltarSeleccionarRangoUnidadVenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRangoUnidadVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoUnidadVenta,RangoUnidadVentaConstantesFunciones.LABEL_ID));

		if(this.rangounidadventaConstantesFunciones.mostraridRangoUnidadVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RangoUnidadVentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rangounidadventaConstantesFunciones.resaltaridRangoUnidadVenta,this.rangounidadventaConstantesFunciones.activaridRangoUnidadVenta,iSizeTabla,this,true,"idRangoUnidadVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rangounidadventaConstantesFunciones.resaltaridRangoUnidadVenta,this.rangounidadventaConstantesFunciones.activaridRangoUnidadVenta,this,true,"idRangoUnidadVenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRangoUnidadVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoUnidadVenta,RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.rangounidadventaConstantesFunciones.mostrarid_empresaRangoUnidadVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.rangounidadventaConstantesFunciones.resaltarid_empresaRangoUnidadVenta,this,this.rangounidadventaConstantesFunciones.activarid_empresaRangoUnidadVenta,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.rangounidadventaConstantesFunciones.resaltarid_empresaRangoUnidadVenta,this,this.rangounidadventaConstantesFunciones.activarid_empresaRangoUnidadVenta,false,"id_empresaRangoUnidadVenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RangoUnidadVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRangoUnidadVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoUnidadVenta,RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD));

		if(this.rangounidadventaConstantesFunciones.mostrarid_unidadRangoUnidadVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.rangounidadventaConstantesFunciones.resaltarid_unidadRangoUnidadVenta,this,this.rangounidadventaConstantesFunciones.activarid_unidadRangoUnidadVenta,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.rangounidadventaConstantesFunciones.resaltarid_unidadRangoUnidadVenta,this,this.rangounidadventaConstantesFunciones.activarid_unidadRangoUnidadVenta,true,"id_unidadRangoUnidadVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RangoUnidadVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRangoUnidadVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoUnidadVenta,RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL));

		if(this.rangounidadventaConstantesFunciones.mostrarrango_inicialRangoUnidadVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rangounidadventaConstantesFunciones.resaltarrango_inicialRangoUnidadVenta,this.rangounidadventaConstantesFunciones.activarrango_inicialRangoUnidadVenta,iSizeTabla,this,true,"rango_inicialRangoUnidadVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rangounidadventaConstantesFunciones.resaltarrango_inicialRangoUnidadVenta,this.rangounidadventaConstantesFunciones.activarrango_inicialRangoUnidadVenta,this,true,"rango_inicialRangoUnidadVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RangoUnidadVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRangoUnidadVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRangoUnidadVenta,RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL));

		if(this.rangounidadventaConstantesFunciones.mostrarrango_finalRangoUnidadVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rangounidadventaConstantesFunciones.resaltarrango_finalRangoUnidadVenta,this.rangounidadventaConstantesFunciones.activarrango_finalRangoUnidadVenta,iSizeTabla,this,true,"rango_finalRangoUnidadVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rangounidadventaConstantesFunciones.resaltarrango_finalRangoUnidadVenta,this.rangounidadventaConstantesFunciones.activarrango_finalRangoUnidadVenta,this,true,"rango_finalRangoUnidadVenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RangoUnidadVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPrecio && this.rangounidadventaConstantesFunciones.mostrarPrecioRangoUnidadVenta && !RangoUnidadVentaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Precios");
				tableColumn.setHeaderValue("Precios");
				tableColumn.setCellRenderer(new PrecioTableCell(rangounidadventaConstantesFunciones.resaltarPrecioRangoUnidadVenta,this,this.rangounidadventaConstantesFunciones.activarPrecioRangoUnidadVenta));
				tableColumn.setCellEditor(new PrecioTableCell(rangounidadventaConstantesFunciones.resaltarPrecioRangoUnidadVenta,this,this.rangounidadventaConstantesFunciones.activarPrecioRangoUnidadVenta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosRangoUnidadVenta.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroInventarioDefecto && this.rangounidadventaConstantesFunciones.mostrarParametroInventarioDefectoRangoUnidadVenta && !RangoUnidadVentaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(rangounidadventaConstantesFunciones.resaltarParametroInventarioDefectoRangoUnidadVenta,this,this.rangounidadventaConstantesFunciones.activarParametroInventarioDefectoRangoUnidadVenta));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(rangounidadventaConstantesFunciones.resaltarParametroInventarioDefectoRangoUnidadVenta,this,this.rangounidadventaConstantesFunciones.activarParametroInventarioDefectoRangoUnidadVenta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosRangoUnidadVenta.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rangounidadventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rangounidadventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRangoUnidadVenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rangounidadventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rangounidadventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRangoUnidadVenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRangoUnidadVenta && this.isPermisoGuardarCambiosRangoUnidadVenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.rangounidadventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.rangounidadventaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRangoUnidadVenta.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.rangounidadventaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosRangoUnidadVenta.addColumn(tableColumn);
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
			
			this.jTableDatosRangoUnidadVenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRangoUnidadVenta && this.isPermisoGuardarCambiosRangoUnidadVenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.rangounidadventaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRangoUnidadVenta && this.isPermisoGuardarCambiosRangoUnidadVenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRangoUnidadVenta.moveColumn(this.jTableDatosRangoUnidadVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRangoUnidadVenta.moveColumn(this.jTableDatosRangoUnidadVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.rangounidadventaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosRangoUnidadVenta.moveColumn(this.jTableDatosRangoUnidadVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRangoUnidadVenta.moveColumn(this.jTableDatosRangoUnidadVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRangoUnidadVenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRangoUnidadVenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRangoUnidadVenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRangoUnidadVenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRangoUnidadVenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRangoUnidadVenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRangoUnidadVenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRangoUnidadVenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=rangounidadventaLogic.getRangoUnidadVentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=rangounidadventas.size()-1;
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
		//this.jTableDatosRangoUnidadVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRangoUnidadVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRangoUnidadVenta();
			
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
				
				//this.isEsNuevoRangoUnidadVenta=false;
					
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			
				if(this.rangounidadventaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRangoUnidadVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRangoUnidadVenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.rangounidadventa.getsType().equals("DUPLICADO")
				   || this.rangounidadventa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRangoUnidadVenta=true;
				
				} else {
					this.isEsNuevoRangoUnidadVenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
					if(this.rangounidadventa.getId()>=0 && !this.rangounidadventa.getIsNew()) {						
						this.isEsNuevoRangoUnidadVenta=false;
						
					} else {
						this.isEsNuevoRangoUnidadVenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRangoUnidadVenta(esRelaciones);						
				
				this.seleccionarRangoUnidadVenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.rangounidadventa.getId()<0) {
					this.isEsNuevoRangoUnidadVenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRangoUnidadVenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRangoUnidadVenta(evt,rowIndex);
				}	
				
				if(this.rangounidadventaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RangoUnidadVenta: " + this.dDif); 
					}
				}								
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRangoUnidadVenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.rangounidadventa)) {
					if(this.rangounidadventa.getId()>0) {
						this.rangounidadventa.setIsDeleted(true);
						
						this.rangounidadventasEliminados.add(this.rangounidadventa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rangounidadventaLogic.getRangoUnidadVentas().remove(this.rangounidadventa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rangounidadventas.remove(this.rangounidadventa);				
					}
					
					
					((RangoUnidadVentaModel) this.jTableDatosRangoUnidadVenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRangoUnidadVenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRangoUnidadVenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRangoUnidadVenta) {
			
			if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRangoUnidadVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRangoUnidadVenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRangoUnidadVenta(this.rangounidadventa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.rangounidadventaConstantesFunciones.cargarid_empresaRangoUnidadVenta || this.rangounidadventaConstantesFunciones.event_dependid_empresaRangoUnidadVenta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.rangounidadventa.getid_empresa());
									//this.inicializarActualizarBindingRangoUnidadVenta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(rangounidadventa.getEmpresa()!=null) {
							this.empresasForeignKey.add(rangounidadventa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.rangounidadventa.getid_empresa(),false,"Formulario");

					//Unidad
					if(!this.rangounidadventaConstantesFunciones.cargarid_unidadRangoUnidadVenta || this.rangounidadventaConstantesFunciones.event_dependid_unidadRangoUnidadVenta) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.rangounidadventa.getid_unidad());
									//this.inicializarActualizarBindingRangoUnidadVenta(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(rangounidadventa.getUnidad()!=null) {
							this.unidadsForeignKey.add(rangounidadventa.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.rangounidadventa.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRangoUnidadVenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRangoUnidadVenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRangoUnidadVenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRangoUnidadVenta(RangoUnidadVenta rangounidadventa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRangoUnidadVenta(rangounidadventa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRangoUnidadVenta(RangoUnidadVenta rangounidadventa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRangoUnidadVenta(rangounidadventa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRangoUnidadVenta(rangounidadventa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRangoUnidadVenta(rangounidadventa);
	}
	
	public void setVariablesObjetoActualToFormularioRangoUnidadVenta(RangoUnidadVenta rangounidadventa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelidRangoUnidadVenta.setText(rangounidadventa.getId().toString());
			this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_inicialRangoUnidadVenta.setText(rangounidadventa.getrango_inicial().toString());
			this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_finalRangoUnidadVenta.setText(rangounidadventa.getrango_final().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RangoUnidadVenta rangounidadventaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,rangounidadventaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RangoUnidadVenta rangounidadventaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				rangounidadventaLocal=this.rangounidadventa;
			} else {
				rangounidadventaLocal=this.rangounidadventaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(rangounidadventaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRangoUnidadVenta(rangounidadventaLocal,true);
					
					if(rangounidadventaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(rangounidadventaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(rangounidadventaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRangoUnidadVenta(RangoUnidadVenta rangounidadventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRangoUnidadVenta(rangounidadventa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(rangounidadventa);
	}
	
	public void setVariablesFormularioToObjetoActualRangoUnidadVenta(RangoUnidadVenta rangounidadventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRangoUnidadVenta(rangounidadventa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRangoUnidadVenta(RangoUnidadVenta rangounidadventa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelidRangoUnidadVenta.getText()==null || this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelidRangoUnidadVenta.getText()=="" || this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelidRangoUnidadVenta.getText()=="Id") {
				this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelidRangoUnidadVenta.setText("0");
			}

			if(conColumnasBase) {rangounidadventa.setId(Long.parseLong(this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelidRangoUnidadVenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RangoUnidadVentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelIdRangoUnidadVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rangounidadventa.setrango_inicial(Double.parseDouble(this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_inicialRangoUnidadVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelrango_inicialRangoUnidadVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rangounidadventa.setrango_final(Double.parseDouble(this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_finalRangoUnidadVenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelrango_finalRangoUnidadVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRangoUnidadVenta(RangoUnidadVenta rangounidadventaBean,RangoUnidadVenta rangounidadventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && rangounidadventaBean.getid_unidad()!=null && !rangounidadventaBean.getid_unidad().equals(-1L))) {rangounidadventa.setid_unidad(rangounidadventaBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRangoUnidadVenta(RangoUnidadVenta rangounidadventaOrigen,RangoUnidadVenta rangounidadventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rangounidadventaOrigen.getId()!=null && !rangounidadventaOrigen.getId().equals(0L))) {rangounidadventa.setId(rangounidadventaOrigen.getId());}}
			if(conDefault || (!conDefault && rangounidadventaOrigen.getid_unidad()!=null && !rangounidadventaOrigen.getid_unidad().equals(-1L))) {rangounidadventa.setid_unidad(rangounidadventaOrigen.getid_unidad());}
			if(conDefault || (!conDefault && rangounidadventaOrigen.getrango_inicial()!=null && !rangounidadventaOrigen.getrango_inicial().equals(0.0))) {rangounidadventa.setrango_inicial(rangounidadventaOrigen.getrango_inicial());}
			if(conDefault || (!conDefault && rangounidadventaOrigen.getrango_final()!=null && !rangounidadventaOrigen.getrango_final().equals(0.0))) {rangounidadventa.setrango_final(rangounidadventaOrigen.getrango_final());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRangoUnidadVenta(RangoUnidadVenta rangounidadventa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelidRangoUnidadVenta.setText(rangounidadventa.getId().toString());
			this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_inicialRangoUnidadVenta.setText(rangounidadventa.getrango_inicial().toString());
			this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_finalRangoUnidadVenta.setText(rangounidadventa.getrango_final().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRangoUnidadVenta(RangoUnidadVentaBean rangounidadventaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelidRangoUnidadVenta.setText(rangounidadventaBean.getId().toString());
			this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_inicialRangoUnidadVenta.setText(rangounidadventaBean.getrango_inicial().toString());
			this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_finalRangoUnidadVenta.setText(rangounidadventaBean.getrango_final().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRangoUnidadVenta(RangoUnidadVentaParameterReturnGeneral rangounidadventaReturnGeneral,RangoUnidadVentaBean rangounidadventaBean,Boolean conDefault) throws Exception { 
		try {
			RangoUnidadVenta rangounidadventaLocal=new RangoUnidadVenta();
			
			rangounidadventaLocal=rangounidadventaReturnGeneral.getRangoUnidadVenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rangounidadventaLocal.getId()!=null && !rangounidadventaLocal.getId().equals(0L))) {rangounidadventaBean.setId(rangounidadventaLocal.getId());}}
			if(conDefault || (!conDefault && rangounidadventaLocal.getid_unidad()!=null && !rangounidadventaLocal.getid_unidad().equals(-1L))) {rangounidadventaBean.setid_unidad(rangounidadventaLocal.getid_unidad());}
			if(conDefault || (!conDefault && rangounidadventaLocal.getrango_inicial()!=null && !rangounidadventaLocal.getrango_inicial().equals(0.0))) {rangounidadventaBean.setrango_inicial(rangounidadventaLocal.getrango_inicial());}
			if(conDefault || (!conDefault && rangounidadventaLocal.getrango_final()!=null && !rangounidadventaLocal.getrango_final().equals(0.0))) {rangounidadventaBean.setrango_final(rangounidadventaLocal.getrango_final());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRangoUnidadVentaGenerico(Long idRangoUnidadVentaSeleccionado,JComboBox jComboBoxRangoUnidadVenta,List<RangoUnidadVenta> rangounidadventasLocal)throws Exception {
		try {
			RangoUnidadVenta  rangounidadventaTemp=null;

			for(RangoUnidadVenta rangounidadventaAux:rangounidadventasLocal) {
				if(rangounidadventaAux.getId()!=null && rangounidadventaAux.getId().equals(idRangoUnidadVentaSeleccionado)) {
					rangounidadventaTemp=rangounidadventaAux;
					break;
				}
			}

			jComboBoxRangoUnidadVenta.setSelectedItem(rangounidadventaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRangoUnidadVentaGenerico(JComboBox jComboBoxRangoUnidadVenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRangoUnidadVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRangoUnidadVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRangoUnidadVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRangoUnidadVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRangoUnidadVenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRangoUnidadVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRangoUnidadVenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRangoUnidadVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRangoUnidadVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRangoUnidadVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Precio")) {
			jButtonPrecioActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParametroInventarioDefecto")) {
			jButtonParametroInventarioDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rangounidadventa=(RangoUnidadVenta) rangounidadventaLogic.getRangoUnidadVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rangounidadventa =(RangoUnidadVenta) rangounidadventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!rangounidadventa.getIsNew() && !rangounidadventa.getIsChanged() && !rangounidadventa.getIsDeleted()) {
				sDescripcion=rangounidadventa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=rangounidadventa.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!rangounidadventa.getIsNew() && !rangounidadventa.getIsChanged() && !rangounidadventa.getIsDeleted()) {
				sDescripcion=rangounidadventa.getunidad_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=rangounidadventa.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RangoUnidadVenta rangounidadventaRow=new RangoUnidadVenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rangounidadventaRow=(RangoUnidadVenta) rangounidadventaLogic.getRangoUnidadVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rangounidadventaRow=(RangoUnidadVenta) rangounidadventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPrecioActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,RangoUnidadVenta rangounidadventa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangounidadventa = (RangoUnidadVenta)this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.rangounidadventa = (RangoUnidadVenta)this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(rangounidadventa!=null) {
						this.rangounidadventa = rangounidadventa;
					} else {
						this.rangounidadventa = new RangoUnidadVenta();
					}
				}

				if(this.isTienePermisosPrecio && this.permiteMantenimiento(this.rangounidadventa)) {
					PrecioBeanSwingJInternalFrame precioBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFramePopup=new PrecioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						precioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFramePopup;
					} else {
						precioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame;
					}

					List<RangoUnidadVenta> rangounidadventas=new ArrayList<RangoUnidadVenta>();
					rangounidadventas.add(this.rangounidadventa);
					if(!esRelacionado) {
						//precioBeanSwingJInternalFrame.precioSessionBean.setConGuardarRelaciones(false);
						//precioBeanSwingJInternalFrame.precioSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					precioBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormRangoUnidadVenta.cargarPrecioBeanSwingJInternalFrame(rangounidadventas,this.rangounidadventa,precioBeanSwingJInternalFrame,/*conInicializar,*/precioBeanSwingJInternalFrame.precioSessionBean.getConGuardarRelaciones(),precioBeanSwingJInternalFrame.precioSessionBean.getEsGuardarRelacionado());
					precioBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						precioBeanSwingJInternalFrame.actualizarEstadoPanelsPrecio("no_relacionado");

						precioBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PrecioConstantesFunciones.ITAMANIOFILATABLA + (PrecioConstantesFunciones.ITAMANIOFILATABLA/2));

						precioBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderRangoUnidadVenta=(TitledBorder)this.jScrollPanelDatosRangoUnidadVenta.getBorder();
						TitledBorder titledBorderPrecio=(TitledBorder)precioBeanSwingJInternalFrame.jScrollPanelDatosPrecio.getBorder();

						titledBorderPrecio.setTitle(titledBorderRangoUnidadVenta.getTitle() + " -> Precio");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,precioBeanSwingJInternalFrame);
						}

						precioBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(precioBeanSwingJInternalFrame);

						precioBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.rangounidadventaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Precio",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,RangoUnidadVenta rangounidadventa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangounidadventa = (RangoUnidadVenta)this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.rangounidadventa = (RangoUnidadVenta)this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(rangounidadventa!=null) {
						this.rangounidadventa = rangounidadventa;
					} else {
						this.rangounidadventa = new RangoUnidadVenta();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.rangounidadventa)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<RangoUnidadVenta> rangounidadventas=new ArrayList<RangoUnidadVenta>();
					rangounidadventas.add(this.rangounidadventa);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormRangoUnidadVenta.cargarParametroInventarioDefectoBeanSwingJInternalFrame(rangounidadventas,this.rangounidadventa,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderRangoUnidadVenta=(TitledBorder)this.jScrollPanelDatosRangoUnidadVenta.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderRangoUnidadVenta.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.rangounidadventaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRangoUnidadVenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRangoUnidadVenta.setVisible((this.isVisibilidadCeldaNuevoRangoUnidadVenta && this.isPermisoNuevoRangoUnidadVenta));			
			this.jButtonDuplicarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaDuplicarRangoUnidadVenta && this.isPermisoDuplicarRangoUnidadVenta));			
			this.jButtonCopiarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaCopiarRangoUnidadVenta && this.isPermisoCopiarRangoUnidadVenta));
			this.jButtonVerFormRangoUnidadVenta.setVisible((this.isVisibilidadCeldaVerFormRangoUnidadVenta && this.isPermisoVerFormRangoUnidadVenta));
			
			this.jButtonAbrirOrderByRangoUnidadVenta.setVisible((this.isVisibilidadCeldaOrdenRangoUnidadVenta && this.isPermisoOrdenRangoUnidadVenta));			
			
			this.jButtonNuevoRelacionesRangoUnidadVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta && this.isPermisoNuevoRangoUnidadVenta));			
			this.jButtonNuevoGuardarCambiosRangoUnidadVenta.setVisible((this.isVisibilidadCeldaNuevoRangoUnidadVenta && this.isPermisoNuevoRangoUnidadVenta && this.isPermisoGuardarCambiosRangoUnidadVenta));
			
			if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonModificarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaModificarRangoUnidadVenta && this.isPermisoActualizarRangoUnidadVenta));	
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonActualizarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaActualizarRangoUnidadVenta && this.isPermisoActualizarRangoUnidadVenta));	
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonEliminarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaEliminarRangoUnidadVenta && this.isPermisoEliminarRangoUnidadVenta));
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonCancelarRangoUnidadVenta.setVisible(this.isVisibilidadCeldaCancelarRangoUnidadVenta);							
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonGuardarCambiosRangoUnidadVenta.setVisible((this.isVisibilidadCeldaGuardarRangoUnidadVenta && this.isPermisoGuardarCambiosRangoUnidadVenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaRangoUnidadVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta && this.isPermisoGuardarCambiosRangoUnidadVenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaNuevoRangoUnidadVenta && this.isPermisoNuevoRangoUnidadVenta));						
			this.jButtonDuplicarToolBarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaDuplicarRangoUnidadVenta && this.isPermisoDuplicarRangoUnidadVenta));						
			this.jButtonCopiarToolBarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaCopiarRangoUnidadVenta && this.isPermisoCopiarRangoUnidadVenta));			
			this.jButtonVerFormToolBarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaVerFormRangoUnidadVenta && this.isPermisoVerFormRangoUnidadVenta));			
			this.jButtonAbrirOrderByToolBarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaOrdenRangoUnidadVenta && this.isPermisoOrdenRangoUnidadVenta));
			this.jButtonNuevoRelacionesToolBarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta && this.isPermisoNuevoRangoUnidadVenta));			
			this.jButtonNuevoGuardarCambiosToolBarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaNuevoRangoUnidadVenta && this.isPermisoNuevoRangoUnidadVenta && this.isPermisoGuardarCambiosRangoUnidadVenta));			
			
			if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonModificarToolBarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaModificarRangoUnidadVenta && this.isPermisoActualizarRangoUnidadVenta));	
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonActualizarToolBarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaActualizarRangoUnidadVenta  && this.isPermisoActualizarRangoUnidadVenta));	
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonEliminarToolBarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaEliminarRangoUnidadVenta && this.isPermisoEliminarRangoUnidadVenta));
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonCancelarToolBarRangoUnidadVenta.setVisible(this.isVisibilidadCeldaCancelarRangoUnidadVenta);				
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonGuardarCambiosToolBarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaGuardarRangoUnidadVenta && this.isPermisoGuardarCambiosRangoUnidadVenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta && this.isPermisoGuardarCambiosRangoUnidadVenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRangoUnidadVenta.setVisible((this.isVisibilidadCeldaNuevoRangoUnidadVenta && this.isPermisoNuevoRangoUnidadVenta));			
			this.jMenuItemDuplicarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaDuplicarRangoUnidadVenta && this.isPermisoDuplicarRangoUnidadVenta));			
			this.jMenuItemCopiarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaCopiarRangoUnidadVenta && this.isPermisoCopiarRangoUnidadVenta));			
			this.jMenuItemVerFormRangoUnidadVenta.setVisible((this.isVisibilidadCeldaVerFormRangoUnidadVenta && this.isPermisoVerFormRangoUnidadVenta));			
			this.jMenuItemAbrirOrderByRangoUnidadVenta.setVisible((this.isVisibilidadCeldaOrdenRangoUnidadVenta && this.isPermisoOrdenRangoUnidadVenta));			
			//this.jMenuItemMostrarOcultarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaOrdenRangoUnidadVenta && this.isPermisoOrdenRangoUnidadVenta));
			this.jMenuItemDetalleAbrirOrderByRangoUnidadVenta.setVisible((this.isVisibilidadCeldaOrdenRangoUnidadVenta && this.isPermisoOrdenRangoUnidadVenta));			
			//this.jMenuItemDetalleMostrarOcultarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaOrdenRangoUnidadVenta && this.isPermisoOrdenRangoUnidadVenta));			
			this.jMenuItemNuevoRelacionesRangoUnidadVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta && this.isPermisoNuevoRangoUnidadVenta));			
			this.jMenuItemNuevoGuardarCambiosRangoUnidadVenta.setVisible((this.isVisibilidadCeldaNuevoRangoUnidadVenta && this.isPermisoNuevoRangoUnidadVenta && this.isPermisoGuardarCambiosRangoUnidadVenta));									
			
			if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemModificarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaModificarRangoUnidadVenta && this.isPermisoActualizarRangoUnidadVenta));	
			this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemActualizarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaActualizarRangoUnidadVenta && this.isPermisoActualizarRangoUnidadVenta));	
			this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemEliminarRangoUnidadVenta.setVisible((this.isVisibilidadCeldaEliminarRangoUnidadVenta && this.isPermisoEliminarRangoUnidadVenta));
			this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemCancelarRangoUnidadVenta.setVisible(this.isVisibilidadCeldaCancelarRangoUnidadVenta);				
			}
			
			this.jMenuItemGuardarCambiosRangoUnidadVenta.setVisible((this.isVisibilidadCeldaGuardarRangoUnidadVenta && this.isPermisoGuardarCambiosRangoUnidadVenta));						
			this.jMenuItemGuardarCambiosTablaRangoUnidadVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta && this.isPermisoGuardarCambiosRangoUnidadVenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRangoUnidadVenta=this.jButtonNuevoRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaDuplicarRangoUnidadVenta=this.jButtonDuplicarRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaCopiarRangoUnidadVenta=this.jButtonCopiarRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaVerFormRangoUnidadVenta=this.jButtonVerFormRangoUnidadVenta.isVisible();
			
			this.isVisibilidadCeldaOrdenRangoUnidadVenta=this.jButtonAbrirOrderByRangoUnidadVenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=this.jButtonNuevoRelacionesRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaModificarRangoUnidadVenta=this.jButtonModificarRangoUnidadVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
			this.isVisibilidadCeldaActualizarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonActualizarRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaEliminarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonEliminarRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaCancelarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonCancelarRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaGuardarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonGuardarCambiosRangoUnidadVenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=this.jButtonGuardarCambiosTablaRangoUnidadVenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRangoUnidadVenta=this.jButtonNuevoToolBarRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=this.jButtonNuevoRelacionesToolBarRangoUnidadVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
			this.isVisibilidadCeldaModificarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonModificarToolBarRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaActualizarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonActualizarToolBarRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaEliminarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonEliminarToolBarRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaCancelarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonCancelarToolBarRangoUnidadVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRangoUnidadVenta=this.jButtonGuardarCambiosToolBarRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=this.jButtonGuardarCambiosTablaToolBarRangoUnidadVenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRangoUnidadVenta=this.jMenuItemNuevoRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=this.jMenuItemNuevoRelacionesRangoUnidadVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
			this.isVisibilidadCeldaModificarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemModificarRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaActualizarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemActualizarRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaEliminarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemEliminarRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaCancelarRangoUnidadVenta=this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemCancelarRangoUnidadVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRangoUnidadVenta=this.jMenuItemGuardarCambiosRangoUnidadVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=this.jMenuItemGuardarCambiosTablaRangoUnidadVenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRangoUnidadVenta(Boolean esInicializar) {
		if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.rangounidadventaSessionBean.getConGuardarRelaciones()) {
				//if(this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRangoUnidadVenta();
			}
			
			this.inicializarActualizarBindingBotonesManualRangoUnidadVenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRangoUnidadVenta() {
		this.jButtonNuevoRangoUnidadVenta.setVisible(this.isPermisoNuevoRangoUnidadVenta);			
		this.jButtonDuplicarRangoUnidadVenta.setVisible(this.isPermisoDuplicarRangoUnidadVenta);			
		this.jButtonCopiarRangoUnidadVenta.setVisible(this.isPermisoCopiarRangoUnidadVenta);			
		this.jButtonVerFormRangoUnidadVenta.setVisible(this.isPermisoVerFormRangoUnidadVenta);			
		
		this.jButtonAbrirOrderByRangoUnidadVenta.setVisible(this.isPermisoOrdenRangoUnidadVenta);					
		
		this.jButtonNuevoRelacionesRangoUnidadVenta.setVisible(this.isPermisoNuevoRangoUnidadVenta);			
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonModificarRangoUnidadVenta.setVisible(this.isPermisoActualizarRangoUnidadVenta);	
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonActualizarRangoUnidadVenta.setVisible(this.isPermisoActualizarRangoUnidadVenta);	
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonEliminarRangoUnidadVenta.setVisible(this.isPermisoEliminarRangoUnidadVenta);
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonCancelarRangoUnidadVenta.setVisible(this.isVisibilidadCeldaCancelarRangoUnidadVenta);						
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonGuardarCambiosRangoUnidadVenta.setVisible(this.isPermisoGuardarCambiosRangoUnidadVenta);							
		}
		
		this.jButtonGuardarCambiosTablaRangoUnidadVenta.setVisible(this.isPermisoActualizarRangoUnidadVenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRangoUnidadVenta() {
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonModificarRangoUnidadVenta.setVisible(this.isPermisoActualizarRangoUnidadVenta);	
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonActualizarRangoUnidadVenta.setVisible(this.isPermisoActualizarRangoUnidadVenta);	
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonEliminarRangoUnidadVenta.setVisible(this.isPermisoEliminarRangoUnidadVenta);
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonCancelarRangoUnidadVenta.setVisible(this.isVisibilidadCeldaCancelarRangoUnidadVenta);							
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonGuardarCambiosRangoUnidadVenta.setVisible((this.isVisibilidadCeldaGuardarRangoUnidadVenta && this.isPermisoGuardarCambiosRangoUnidadVenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRangoUnidadVenta() {
		if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRangoUnidadVenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRangoUnidadVenta() {
	}
	
	public void jTableDatosRangoUnidadVentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRangoUnidadVenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRangoUnidadVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.getrangounidadventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rangounidadventa==null) {
						this.rangounidadventa = new RangoUnidadVenta();
					}

					this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.rangounidadventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
				}

				if(this.rangounidadventa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.rangounidadventa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRangoUnidadVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRangoUnidadVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRangoUnidadVenta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRangoUnidadVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRangoUnidadVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.getrangounidadventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.rangounidadventaLogic.getConnexion());

				if(this.rangounidadventa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.rangounidadventa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRangoUnidadVenta=(TitledBorder)this.jScrollPanelDatosRangoUnidadVenta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRangoUnidadVenta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRangoUnidadVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.getrangounidadventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rangounidadventa==null) {
						this.rangounidadventa = new RangoUnidadVenta();
					}

					this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.rangounidadventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
				}

				if(this.rangounidadventa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.rangounidadventa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRangoUnidadVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadRangoUnidadVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebRangoUnidadVenta(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRangoUnidadVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRangoUnidadVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.getrangounidadventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.rangounidadventaLogic.getConnexion());

				if(this.rangounidadventa.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.rangounidadventa.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRangoUnidadVenta=(TitledBorder)this.jScrollPanelDatosRangoUnidadVenta.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderRangoUnidadVenta.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadRangoUnidadVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.getrangounidadventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rangounidadventa==null) {
						this.rangounidadventa = new RangoUnidadVenta();
					}

					this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.rangounidadventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
				}

				if(this.rangounidadventa.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.rangounidadventa.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRangoUnidadVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrango_inicialRangoUnidadVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.getrangounidadventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rangounidadventa==null) {
						this.rangounidadventa = new RangoUnidadVenta();
					}

					this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.rangounidadventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
				}

				if(this.rangounidadventa.getrango_inicial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where rango_inicial = "+this.rangounidadventa.getrango_inicial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRangoUnidadVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrango_finalRangoUnidadVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.getrangounidadventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rangounidadventa==null) {
						this.rangounidadventa = new RangoUnidadVenta();
					}

					this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.rangounidadventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);
				}

				if(this.rangounidadventa.getrango_final()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where rango_final = "+this.rangounidadventa.getrango_final().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRangoUnidadVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRangoUnidadVenta(false,false);

			this.getRangoUnidadVentasFK_IdEmpresa();

			this.inicializarActualizarBindingRangoUnidadVenta(false);

			//if(RangoUnidadVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRangoUnidadVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadRangoUnidadVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRangoUnidadVenta(false,false);

			this.getRangoUnidadVentasFK_IdUnidad();

			this.inicializarActualizarBindingRangoUnidadVenta(false);

			//if(RangoUnidadVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRangoUnidadVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rangounidadventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRangoUnidadVenta() {
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
		

		if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormRangoUnidadVenta.dispose();
			this.jInternalFrameDetalleFormRangoUnidadVenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRangoUnidadVenta!=null) {
			this.jInternalFrameReporteDinamicoRangoUnidadVenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRangoUnidadVenta.dispose();
			this.jInternalFrameReporteDinamicoRangoUnidadVenta=null;
		}
		
		if(this.jInternalFrameImportacionRangoUnidadVenta!=null) {
			this.jInternalFrameImportacionRangoUnidadVenta.setVisible(false);	    			
			this.jInternalFrameImportacionRangoUnidadVenta.dispose();
			this.jInternalFrameImportacionRangoUnidadVenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRangoUnidadVenta();
			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			
			
			if(sTipo.equals("NuevoRangoUnidadVenta")) {
				jButtonNuevoRangoUnidadVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRangoUnidadVenta")) {
				jButtonDuplicarRangoUnidadVentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRangoUnidadVenta")) {
				jButtonCopiarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormRangoUnidadVenta")) {
				jButtonVerFormRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRangoUnidadVenta")) {
				jButtonNuevoRangoUnidadVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRangoUnidadVenta")) {
				jButtonDuplicarRangoUnidadVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRangoUnidadVenta")) {
				jButtonNuevoRangoUnidadVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRangoUnidadVenta")) {
				jButtonDuplicarRangoUnidadVentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRangoUnidadVenta")) {
				jButtonNuevoRangoUnidadVentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRangoUnidadVenta")) {
				jButtonNuevoRangoUnidadVentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRangoUnidadVenta")) {
				jButtonNuevoRangoUnidadVentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRangoUnidadVenta")) {
				jButtonModificarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRangoUnidadVenta")) {
				jButtonModificarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRangoUnidadVenta")) {
				jButtonModificarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRangoUnidadVenta")) {
				jButtonActualizarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRangoUnidadVenta")) {
				jButtonActualizarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRangoUnidadVenta")) {
				jButtonActualizarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarRangoUnidadVenta")) {
				jButtonEliminarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRangoUnidadVenta")) {
				jButtonEliminarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRangoUnidadVenta")) {
				jButtonEliminarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarRangoUnidadVenta")) {
				jButtonCancelarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRangoUnidadVenta")) {
				jButtonCancelarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRangoUnidadVenta")) {
				jButtonCancelarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarRangoUnidadVenta")) {
				jButtonCerrarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRangoUnidadVenta")) {
				jButtonCerrarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRangoUnidadVenta")) {
				jButtonCerrarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRangoUnidadVenta")) {
				jButtonMostrarOcultarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRangoUnidadVenta")) {
				jButtonCancelarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRangoUnidadVenta")) {
				jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRangoUnidadVenta")) {
				jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRangoUnidadVenta")) {
				jButtonCopiarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRangoUnidadVenta")) {
				jButtonVerFormRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRangoUnidadVenta")) {
				jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRangoUnidadVenta")) {
				jButtonCopiarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRangoUnidadVenta")) {
				jButtonVerFormRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRangoUnidadVenta")) {
				jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRangoUnidadVenta")) {
				jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRangoUnidadVenta")) {
				jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRangoUnidadVenta")) {
				jButtonRecargarInformacionRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRangoUnidadVenta")) {
				jButtonRecargarInformacionRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRangoUnidadVenta")) {
				jButtonRecargarInformacionRangoUnidadVentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRangoUnidadVenta")) {
				jButtonAnterioresRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRangoUnidadVenta")) {
				jButtonAnterioresRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRangoUnidadVenta")) {
				jButtonAnterioresRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRangoUnidadVenta")) {
				jButtonSiguientesRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRangoUnidadVenta")) {
				jButtonSiguientesRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRangoUnidadVenta")) {
				jButtonSiguientesRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRangoUnidadVenta") || sTipo.equals("MenuItemDetalleAbrirOrderByRangoUnidadVenta")) {
				jButtonAbrirOrderByRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRangoUnidadVenta") || sTipo.equals("MenuItemDetalleMostrarOcultarRangoUnidadVenta")) {
				jButtonMostrarOcultarRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRangoUnidadVenta")) {
				jButtonNuevoGuardarCambiosRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRangoUnidadVenta")) {
				jButtonNuevoGuardarCambiosRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRangoUnidadVenta")) {
				jButtonNuevoGuardarCambiosRangoUnidadVentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRangoUnidadVenta")) {
				jButtonCerrarReporteDinamicoRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRangoUnidadVenta")) {
				jButtonGenerarReporteDinamicoRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRangoUnidadVenta")) {
				
				jButtonGenerarExcelReporteDinamicoRangoUnidadVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRangoUnidadVenta")) {
				jButtonCerrarImportacionRangoUnidadVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRangoUnidadVenta")) {
				
				jButtonGenerarImportacionRangoUnidadVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRangoUnidadVenta")) {
				
				jButtonAbrirImportacionRangoUnidadVentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRangoUnidadVenta")) {
				jComboBoxTiposAccionesRangoUnidadVentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRangoUnidadVenta")) {
				jComboBoxTiposRelacionesRangoUnidadVentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRangoUnidadVenta")) {
				jComboBoxTiposAccionesRangoUnidadVentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRangoUnidadVenta")) {
				
				jComboBoxTiposSeleccionarRangoUnidadVentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRangoUnidadVenta")) {
				jTextFieldValorCampoGeneralRangoUnidadVentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRangoUnidadVenta")) {
				jButtonAbrirOrderByRangoUnidadVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRangoUnidadVenta")) {
				jButtonAbrirOrderByRangoUnidadVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRangoUnidadVenta")) {
				jButtonCerrarOrderByRangoUnidadVentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRangoUnidadVentaBusqueda")) {
				this.jButtonidRangoUnidadVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRangoUnidadVentaUpdate")) {
				this.jButtonid_empresaRangoUnidadVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRangoUnidadVentaBusqueda")) {
				this.jButtonid_empresaRangoUnidadVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadRangoUnidadVentaUpdate")) {
				this.jButtonid_unidadRangoUnidadVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadRangoUnidadVentaBusqueda")) {
				this.jButtonid_unidadRangoUnidadVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rango_inicialRangoUnidadVentaBusqueda")) {
				this.jButtonrango_inicialRangoUnidadVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rango_finalRangoUnidadVentaBusqueda")) {
				this.jButtonrango_finalRangoUnidadVentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdUnidadRangoUnidadVenta")) {
				this.jButtonFK_IdUnidadRangoUnidadVentaActionPerformed(evt);
			}
			
			;
			
			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRangoUnidadVenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRangoUnidadVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
				


				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoUnidadVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoUnidadVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RangoUnidadVenta rangounidadventaLocal=null;
			
			if(!this.getEsControlTabla()) {
				rangounidadventaLocal=this.rangounidadventa;
			} else {
				rangounidadventaLocal=this.rangounidadventaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
							
				
				


				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoUnidadVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoUnidadVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoUnidadVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaAnterior =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangounidadventaAnterior =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
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
			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			
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
			
			


			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRangoUnidadVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
								
						
				


				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoUnidadVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoUnidadVenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
								
				
				


				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoUnidadVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoUnidadVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoUnidadVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaAnterior =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangounidadventaAnterior =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoUnidadVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaAnterior =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangounidadventaAnterior =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoUnidadVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
							
				
				


				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoUnidadVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoUnidadVenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRangoUnidadVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangounidadventaAnterior =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rangounidadventaAnterior =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
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
			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			
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
			
			


			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoUnidadVentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
								
				
				


				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoUnidadVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoUnidadVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoUnidadVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaAnterior =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangounidadventaAnterior =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoUnidadVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRangoUnidadVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRangoUnidadVenta")) {
					jCheckBoxSeleccionarTodosRangoUnidadVentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRangoUnidadVenta")) {
					jCheckBoxSeleccionadosRangoUnidadVentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRangoUnidadVenta")) {
					
				}
				
				


				
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoUnidadVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoUnidadVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
												
				
				


				
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoUnidadVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoUnidadVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRangoUnidadVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rangounidadventaAnterior =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rangounidadventaAnterior =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRangoUnidadVentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
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
			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
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
			
			


			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRangoUnidadVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoUnidadVenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoUnidadVenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rangounidadventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rangounidadventa);
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
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
				
				


				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RangoUnidadVenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RangoUnidadVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRangoUnidadVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rangounidadventaAnterior =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rangounidadventaAnterior =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRangoUnidadVenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRangoUnidadVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRangoUnidadVenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.rangounidadventa =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.rangounidadventa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRangoUnidadVenta")) {
				
				}
				
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRangoUnidadVenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRangoUnidadVenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRangoUnidadVenta")) {
			
			}
			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRangoUnidadVenta();
			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			
			if(sTipo.equals("NuevoRangoUnidadVenta")) {
				jButtonNuevoRangoUnidadVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRangoUnidadVenta")) {
				jButtonDuplicarRangoUnidadVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRangoUnidadVenta")) {
				jButtonCopiarRangoUnidadVentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRangoUnidadVenta")) {
				jButtonVerFormRangoUnidadVentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRangoUnidadVenta")) {
				jButtonNuevoRangoUnidadVentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRangoUnidadVenta")) {
				jButtonModificarRangoUnidadVentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRangoUnidadVenta")) {
				jButtonActualizarRangoUnidadVentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRangoUnidadVenta")) {
				jButtonEliminarRangoUnidadVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRangoUnidadVenta")) {
				jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRangoUnidadVenta")) {
				jButtonCancelarRangoUnidadVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRangoUnidadVenta")) {
				jButtonCerrarRangoUnidadVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRangoUnidadVenta")) {
				jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRangoUnidadVenta")) {
				jButtonNuevoGuardarCambiosRangoUnidadVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRangoUnidadVenta")) {
				jButtonAbrirOrderByRangoUnidadVentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRangoUnidadVenta")) {
				jButtonRecargarInformacionRangoUnidadVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRangoUnidadVenta")) {
				jButtonAnterioresRangoUnidadVentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRangoUnidadVenta")) {
				jButtonSiguientesRangoUnidadVentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRangoUnidadVentaBusqueda")) {
				this.jButtonidRangoUnidadVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRangoUnidadVentaUpdate")) {
				this.jButtonid_empresaRangoUnidadVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRangoUnidadVentaBusqueda")) {
				this.jButtonid_empresaRangoUnidadVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadRangoUnidadVentaUpdate")) {
				this.jButtonid_unidadRangoUnidadVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadRangoUnidadVentaBusqueda")) {
				this.jButtonid_unidadRangoUnidadVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rango_inicialRangoUnidadVentaBusqueda")) {
				this.jButtonrango_inicialRangoUnidadVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rango_finalRangoUnidadVentaBusqueda")) {
				this.jButtonrango_finalRangoUnidadVentaBusquedaActionPerformed(evt);
			}
			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRangoUnidadVenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRangoUnidadVenta")) {
				closingInternalFrameRangoUnidadVenta();
				
			} else if(sTipo.equals("jButtonCancelarRangoUnidadVenta")) {
				JInternalFrameBase jInternalFrameDetalleFormRangoUnidadVenta = (JInternalFrameBase)evt.getSource();
	            	
	            RangoUnidadVentaBeanSwingJInternalFrame jInternalFrameParent=(RangoUnidadVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormRangoUnidadVenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRangoUnidadVentaActionPerformed(null);
			}
			
			RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rangounidadventa,new Object(),this.rangounidadventaParameterGeneral,this.rangounidadventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRangoUnidadVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRangoUnidadVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRangoUnidadVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.rangounidadventa)) {
			if(!esControlTabla) {
				if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.rangounidadventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);			
				}
				
				if(this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRangoUnidadVenta(this.rangounidadventa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rangounidadventaReturnGeneral=rangounidadventaLogic.procesarEventosRangoUnidadVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rangounidadventaLogic.getRangoUnidadVentas(),this.rangounidadventa,this.rangounidadventaParameterGeneral,this.isEsNuevoRangoUnidadVenta,classes);//this.rangounidadventaLogic.getRangoUnidadVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRangoUnidadVenta(this.rangounidadventaReturnGeneral,this.rangounidadventaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRangoUnidadVenta(classes,this.rangounidadventaReturnGeneral,this.rangounidadventaBean,false);
					}
						
					if(this.rangounidadventaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRangoUnidadVenta(this.rangounidadventaReturnGeneral.getRangoUnidadVenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRangoUnidadVenta(this.rangounidadventaReturnGeneral.getRangoUnidadVenta());	
					}
						
					if(this.rangounidadventaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRangoUnidadVenta(this.rangounidadventaReturnGeneral.getRangoUnidadVenta(),classes);//this.rangounidadventaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRangoUnidadVenta(this.rangounidadventa,classes);//this.rangounidadventaBean);									
				}
			
				if(RangoUnidadVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRangoUnidadVenta(this.rangounidadventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRangoUnidadVenta(this.rangounidadventa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.rangounidadventaAnterior!=null) {
						this.rangounidadventa=this.rangounidadventaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rangounidadventaReturnGeneral=rangounidadventaLogic.procesarEventosRangoUnidadVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rangounidadventaLogic.getRangoUnidadVentas(),this.rangounidadventa,this.rangounidadventaParameterGeneral,this.isEsNuevoRangoUnidadVenta,classes);//this.rangounidadventaLogic.getRangoUnidadVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rangounidadventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rangounidadventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.rangounidadventaReturnGeneral.getRangoUnidadVenta(),rangounidadventaLogic.getRangoUnidadVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.rangounidadventaReturnGeneral.getRangoUnidadVenta(),this.rangounidadventas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRangoUnidadVenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosRangoUnidadVenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRangoUnidadVenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosRangoUnidadVenta() throws Exception {
		
		RangoUnidadVentaModel rangounidadventaModel=(RangoUnidadVentaModel)this.jTableDatosRangoUnidadVenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rangounidadventaModel.rangounidadventas=this.rangounidadventaLogic.getRangoUnidadVentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			rangounidadventaModel.rangounidadventas=this.rangounidadventas;
		}
		
		
		((RangoUnidadVentaModel) this.jTableDatosRangoUnidadVenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRangoUnidadVenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getrangounidadventaAnterior(),this.rangounidadventaLogic.getRangoUnidadVentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getrangounidadventaAnterior(),this.rangounidadventas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRangoUnidadVenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRangoUnidadVenta(RangoUnidadVenta rangounidadventa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Precio.class)) {
					this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.setPrecios(rangounidadventa.getPrecios());
					this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrecio(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(rangounidadventa.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
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
										
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rangounidadventa,new Object(),generalEntityParameterGeneral,this.rangounidadventaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.rangounidadventaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RangoUnidadVentaConstantesFunciones.getClassesRelationshipsOfRangoUnidadVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RangoUnidadVentaConstantesFunciones.getClassesRelationshipsFromStringsOfRangoUnidadVenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRangoUnidadVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RangoUnidadVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rangounidadventa,new Object(),generalEntityParameterGeneral,this.rangounidadventaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRangoUnidadVenta(RangoUnidadVentaBean rangounidadventaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Precio.class)) {
					this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.setPrecios(rangounidadventa.getPrecios());
					this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrecio(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(rangounidadventa.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRangoUnidadVenta(ArrayList<Classe> classes,RangoUnidadVentaReturnGeneral rangounidadventaReturnGeneral,RangoUnidadVentaBean rangounidadventaBean,Boolean conDefault) throws Exception {
		
			this.rangounidadventaBean.setPrecios(rangounidadventaReturnGeneral.getRangoUnidadVenta().getPrecios());
			this.rangounidadventaBean.setParametroInventarioDefectos(rangounidadventaReturnGeneral.getRangoUnidadVenta().getParametroInventarioDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRangoUnidadVenta(RangoUnidadVenta rangounidadventa,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Precio.class)) {
					rangounidadventa.setPrecios(this.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.precioLogic.getPrecios());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					rangounidadventa.setParametroInventarioDefectos(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.rangounidadventa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRangoUnidadVenta = new RangoUnidadVentaDetalleFormJInternalFrame(jDesktopPane,this.rangounidadventaSessionBean.getConGuardarRelaciones(),this.rangounidadventaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRangoUnidadVenta);
		this.jInternalFrameDetalleFormRangoUnidadVenta.setVisible(false);
		this.jInternalFrameDetalleFormRangoUnidadVenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.rangounidadventaLogic=this.rangounidadventaLogic;
		
		this.cargarCombosFrameForeignKeyRangoUnidadVenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRangoUnidadVenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRangoUnidadVenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRangoUnidadVenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRangoUnidadVenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRangoUnidadVenta"));
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonModificarRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"ModificarRangoUnidadVenta"));

		
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonModificarToolBarRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarRangoUnidadVenta"));
					
		this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemModificarRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarRangoUnidadVenta"));		
		
		
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonActualizarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"ActualizarRangoUnidadVenta"));
		
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonActualizarToolBarRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRangoUnidadVenta"));
						
		this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemActualizarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRangoUnidadVenta"));		
		
		
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonEliminarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"EliminarRangoUnidadVenta"));
		
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonEliminarToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarRangoUnidadVenta"));
								
		this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemEliminarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRangoUnidadVenta"));		
		
		
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonCancelarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"CancelarRangoUnidadVenta"));
		
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonCancelarToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarRangoUnidadVenta"));
					
		this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemCancelarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRangoUnidadVenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemDetalleCerrarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRangoUnidadVenta"));		
		
		
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonGuardarCambiosToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRangoUnidadVenta"));
		
		
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonGuardarCambiosToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRangoUnidadVenta"));
		
		
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRangoUnidadVenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonidRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"idRangoUnidadVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonid_empresaRangoUnidadVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRangoUnidadVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonid_empresaRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRangoUnidadVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonid_unidadRangoUnidadVentaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadRangoUnidadVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonid_unidadRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadRangoUnidadVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonrango_inicialRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"rango_inicialRangoUnidadVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonrango_finalRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"rango_finalRangoUnidadVentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRangoUnidadVenta.jTabbedPaneRelacionesRangoUnidadVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRangoUnidadVenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRangoUnidadVenta"));
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRangoUnidadVenta"));
		}
		
		this.jTableDatosRangoUnidadVenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRangoUnidadVenta"));
		
		this.jTableDatosRangoUnidadVenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRangoUnidadVenta"));
		
		this.jButtonNuevoRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"NuevoRangoUnidadVenta"));
		
		this.jButtonDuplicarRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"DuplicarRangoUnidadVenta"));
		
		this.jButtonCopiarRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"CopiarRangoUnidadVenta"));
		
		this.jButtonVerFormRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"VerFormRangoUnidadVenta"));
		
		
		this.jButtonNuevoToolBarRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarRangoUnidadVenta"));
			
		this.jButtonDuplicarToolBarRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRangoUnidadVenta"));
			
		this.jMenuItemNuevoRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRangoUnidadVenta"));
			
		this.jMenuItemDuplicarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRangoUnidadVenta"));		
		
		
		this.jButtonNuevoRelacionesRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRangoUnidadVenta"));
		
		
		this.jButtonNuevoRelacionesToolBarRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRangoUnidadVenta"));
			
		this.jMenuItemNuevoRelacionesRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRangoUnidadVenta"));		
		
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonModificarRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"ModificarRangoUnidadVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonModificarToolBarRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarRangoUnidadVenta"));
			
			this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemModificarRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarRangoUnidadVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonActualizarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"ActualizarRangoUnidadVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonActualizarToolBarRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRangoUnidadVenta"));
				
			this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemActualizarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRangoUnidadVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonEliminarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"EliminarRangoUnidadVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonEliminarToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarRangoUnidadVenta"));
						
			this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemEliminarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRangoUnidadVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonCancelarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"CancelarRangoUnidadVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonCancelarToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarRangoUnidadVenta"));
			
			this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemCancelarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRangoUnidadVenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRangoUnidadVenta"));		
		
		
		this.jButtonCerrarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"CerrarRangoUnidadVenta"));
		
		
		this.jButtonCerrarToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarRangoUnidadVenta"));
			
		this.jMenuItemCerrarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRangoUnidadVenta"));
			
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jMenuItemDetalleCerrarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRangoUnidadVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonGuardarCambiosRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosRangoUnidadVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonGuardarCambiosToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRangoUnidadVenta"));
		}
		
		this.jButtonCopiarToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarRangoUnidadVenta"));
			
		this.jButtonVerFormToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarRangoUnidadVenta"));
		
		this.jMenuItemGuardarCambiosRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRangoUnidadVenta"));
			
		this.jMenuItemCopiarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRangoUnidadVenta"));		
		
		this.jMenuItemVerFormRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRangoUnidadVenta"));		
		
		
		this.jButtonGuardarCambiosTablaRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRangoUnidadVenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRangoUnidadVenta"));
			
		this.jMenuItemGuardarCambiosTablaRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRangoUnidadVenta"));		
		
		
		
		this.jButtonRecargarInformacionRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionRangoUnidadVenta"));
					
		this.jButtonRecargarInformacionToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRangoUnidadVenta"));
		
		this.jMenuItemRecargarInformacionRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRangoUnidadVenta"));		
		
		
		
		this.jButtonAnterioresRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"AnterioresRangoUnidadVenta"));
		
		
		this.jButtonAnterioresToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRangoUnidadVenta"));
		
		this.jMenuItemAnterioresRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRangoUnidadVenta"));		
		
		
		this.jButtonSiguientesRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"SiguientesRangoUnidadVenta"));
		
		
		this.jButtonSiguientesToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRangoUnidadVenta"));
			
		this.jMenuItemSiguientesRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRangoUnidadVenta"));
			
		this.jMenuItemAbrirOrderByRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRangoUnidadVenta"));
			
		this.jMenuItemMostrarOcultarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRangoUnidadVenta"));
			
		this.jMenuItemDetalleAbrirOrderByRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRangoUnidadVenta"));
			
		this.jMenuItemDetalleMostarOcultarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRangoUnidadVenta"));		
		
		
		this.jButtonNuevoGuardarCambiosRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRangoUnidadVenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRangoUnidadVenta"));
			
		this.jMenuItemNuevoGuardarCambiosRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRangoUnidadVenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRangoUnidadVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRangoUnidadVenta"));

		this.jCheckBoxSeleccionadosRangoUnidadVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRangoUnidadVenta"));
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRangoUnidadVenta"));
		}
		
		
		this.jComboBoxTiposRelacionesRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesRangoUnidadVenta"));
			
		this.jComboBoxTiposAccionesRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesRangoUnidadVenta"));
					
		this.jComboBoxTiposSeleccionarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRangoUnidadVenta"));
			
		this.jTextFieldValorCampoGeneralRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRangoUnidadVenta"));		
		
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonidRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"idRangoUnidadVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonid_empresaRangoUnidadVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRangoUnidadVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonid_empresaRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRangoUnidadVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonid_unidadRangoUnidadVentaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadRangoUnidadVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonid_unidadRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadRangoUnidadVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonrango_inicialRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"rango_inicialRangoUnidadVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonrango_finalRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"rango_finalRangoUnidadVentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdUnidadRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"FK_IdUnidadRangoUnidadVenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRangoUnidadVenta!=null) {
				this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRangoUnidadVenta"));
				this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRangoUnidadVenta"));
				this.jInternalFrameReporteDinamicoRangoUnidadVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRangoUnidadVenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRangoUnidadVenta"));				
			//this.jButtonGenerarReporteDinamicoRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRangoUnidadVenta"));
			//this.jButtonGenerarExcelReporteDinamicoRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRangoUnidadVenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRangoUnidadVenta!=null) {
				this.jInternalFrameImportacionRangoUnidadVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRangoUnidadVenta"));
				this.jInternalFrameImportacionRangoUnidadVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRangoUnidadVenta"));
				this.jInternalFrameImportacionRangoUnidadVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRangoUnidadVenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByRangoUnidadVenta"));
			
			this.jButtonAbrirOrderByToolBarRangoUnidadVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRangoUnidadVenta"));			
			
			if(this.jInternalFrameOrderByRangoUnidadVenta!=null) {
				this.jInternalFrameOrderByRangoUnidadVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRangoUnidadVenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRangoUnidadVenta.jTabbedPaneRelacionesRangoUnidadVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRangoUnidadVenta"));
		
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
            		closingInternalFrameRangoUnidadVenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRangoUnidadVenta = (JInternalFrameBase)event.getSource();
	            	
	            RangoUnidadVentaBeanSwingJInternalFrame jInternalFrameParent=(RangoUnidadVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormRangoUnidadVenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRangoUnidadVentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRangoUnidadVenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRangoUnidadVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRangoUnidadVenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRangoUnidadVenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRangoUnidadVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRangoUnidadVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRangoUnidadVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRangoUnidadVenta";
		inputMap = this.jButtonNuevoRangoUnidadVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRangoUnidadVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRangoUnidadVentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRangoUnidadVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRangoUnidadVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRangoUnidadVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRangoUnidadVenta";
		inputMap = this.jButtonNuevoRelacionesRangoUnidadVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRangoUnidadVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRangoUnidadVentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRangoUnidadVenta";
		inputMap = this.jButtonModificarRangoUnidadVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRangoUnidadVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRangoUnidadVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRangoUnidadVenta";
		inputMap = this.jButtonActualizarRangoUnidadVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRangoUnidadVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRangoUnidadVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRangoUnidadVenta";
		inputMap = this.jButtonEliminarRangoUnidadVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRangoUnidadVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRangoUnidadVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRangoUnidadVenta";
		inputMap = this.jButtonCancelarRangoUnidadVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRangoUnidadVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRangoUnidadVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRangoUnidadVenta";
		inputMap = this.jButtonCerrarRangoUnidadVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRangoUnidadVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRangoUnidadVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonGuardarCambiosRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRangoUnidadVenta";
		inputMap = this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonGuardarCambiosRangoUnidadVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonGuardarCambiosRangoUnidadVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRangoUnidadVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRangoUnidadVenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRangoUnidadVentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRangoUnidadVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRangoUnidadVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRangoUnidadVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRangoUnidadVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRangoUnidadVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRangoUnidadVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonidRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"idRangoUnidadVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonid_empresaRangoUnidadVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRangoUnidadVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonid_empresaRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRangoUnidadVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonid_unidadRangoUnidadVentaUpdate.addActionListener(new ButtonActionListener(this,"id_unidadRangoUnidadVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonid_unidadRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadRangoUnidadVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonrango_inicialRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"rango_inicialRangoUnidadVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRangoUnidadVenta.jButtonrango_finalRangoUnidadVentaBusqueda.addActionListener(new ButtonActionListener(this,"rango_finalRangoUnidadVentaBusqueda"));
		
		
		this.jButtonFK_IdUnidadRangoUnidadVenta.addActionListener(new ButtonActionListener(this,"FK_IdUnidadRangoUnidadVenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRangoUnidadVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRangoUnidadVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRangoUnidadVentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRangoUnidadVenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRangoUnidadVenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RangoUnidadVenta rangounidadventaAux:this.rangounidadventaLogic.getRangoUnidadVentas()) {
					rangounidadventaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RangoUnidadVenta rangounidadventaAux:rangounidadventas) {
					rangounidadventaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRangoUnidadVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRangoUnidadVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RangoUnidadVenta rangounidadventaAux:this.rangounidadventaLogic.getRangoUnidadVentas()) {
						rangounidadventaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RangoUnidadVenta rangounidadventaAux:rangounidadventas) {
						rangounidadventaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RangoUnidadVenta rangounidadventaAux:this.rangounidadventaLogic.getRangoUnidadVentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RangoUnidadVenta rangounidadventaAux:rangounidadventas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRangoUnidadVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRangoUnidadVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRangoUnidadVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRangoUnidadVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRangoUnidadVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRangoUnidadVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRangoUnidadVenta.getSelectedRows();
			
			RangoUnidadVenta rangounidadventaLocal=new RangoUnidadVenta();
			
			//this.seleccionarTodosRangoUnidadVenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rangounidadventaLocal =(RangoUnidadVenta) this.rangounidadventaLogic.getRangoUnidadVentas().toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					rangounidadventaLocal =(RangoUnidadVenta) this.rangounidadventas.toArray()[this.jTableDatosRangoUnidadVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				rangounidadventaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RangoUnidadVenta rangounidadventaAux:this.rangounidadventaLogic.getRangoUnidadVentas()) {
						rangounidadventaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RangoUnidadVenta rangounidadventaAux:rangounidadventas) {
						rangounidadventaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRangoUnidadVenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRangoUnidadVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRangoUnidadVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRangoUnidadVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRangoUnidadVentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRangoUnidadVentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRangoUnidadVentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRangoUnidadVenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRangoUnidadVenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RangoUnidadVenta rangounidadventaAux:this.rangounidadventaLogic.getRangoUnidadVentas()) {
				
						if(sTipoSeleccionar.equals(RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL)) {
							existe=true;
							rangounidadventaAux.setrango_inicial(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL)) {
							existe=true;
							rangounidadventaAux.setrango_final(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RangoUnidadVenta rangounidadventaAux:rangounidadventas) {
					
						if(sTipoSeleccionar.equals(RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL)) {
							existe=true;
							rangounidadventaAux.setrango_inicial(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL)) {
							existe=true;
							rangounidadventaAux.setrango_final(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRangoUnidadVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRangoUnidadVentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRangoUnidadVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRangoUnidadVenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRangoUnidadVenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRangoUnidadVenta) {				
					conSplash=true;//false;										
					
					//this.startProcessRangoUnidadVenta(conSplash);
				
					this.generarReporteRangoUnidadVentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRangoUnidadVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRangoUnidadVentasSeleccionados();
				//this.jComboBoxTiposAccionesRangoUnidadVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRangoUnidadVentasSeleccionados(false);
				//this.jComboBoxTiposAccionesRangoUnidadVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRangoUnidadVentasSeleccionados(true);
				//this.jComboBoxTiposAccionesRangoUnidadVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRangoUnidadVenta();
				
				this.exportarRangoUnidadVentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRangoUnidadVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRangoUnidadVentas();
				//this.importarRangoUnidadVentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRangoUnidadVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRangoUnidadVenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRangoUnidadVentasSeleccionados();
				//this.jComboBoxTiposAccionesRangoUnidadVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Rango Unidad Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRangoUnidadVenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRangoUnidadVenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRangoUnidadVenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Rango Unidad Venta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRangoUnidadVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.setSelectedIndex(0);					
				}	
			} 			
			else if(RangoUnidadVentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRangoUnidadVenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRangoUnidadVenta(conSplash);
					
						//this.actualizarParametrosGeneralRangoUnidadVenta();
						
						this.generarReporteProcesoAccionRangoUnidadVentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRangoUnidadVenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RangoUnidadVentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Rango Unidad VentaS SELECCIONADOS?", "MANTENIMIENTO DE Rango Unidad Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRangoUnidadVenta();
				
						this.actualizarParametrosGeneralRangoUnidadVenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.rangounidadventaReturnGeneral=rangounidadventaLogic.procesarAccionRangoUnidadVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.rangounidadventaLogic.getRangoUnidadVentas(),this.rangounidadventaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRangoUnidadVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRangoUnidadVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRangoUnidadVenta();
					
					RangoUnidadVentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRangoUnidadVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRangoUnidadVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxTiposAccionesFormularioRangoUnidadVenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRangoUnidadVenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRangoUnidadVentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRangoUnidadVenta();
			
			if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados=new ArrayList<RangoUnidadVenta>();		
			RangoUnidadVenta rangounidadventa=new RangoUnidadVenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRangoUnidadVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRangoUnidadVenta.getSelectedItem();
			
			
			
			
			rangounidadventasSeleccionados=this.getRangoUnidadVentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(rangounidadventasSeleccionados.size()==1) {
				for(RangoUnidadVenta rangounidadventaAux:rangounidadventasSeleccionados) {
					rangounidadventa=rangounidadventaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Precio")) {
					jButtonPrecioActionPerformed(null,rowIndex,true,false,rangounidadventa);
				}
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,rangounidadventa);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRangoUnidadVenta();
			
      		//this.finishProcessRangoUnidadVenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRangoUnidadVentaReturnGeneral() throws Exception {
		if(this.rangounidadventaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.rangounidadventaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.rangounidadventaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.rangounidadventaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.rangounidadventaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.rangounidadventaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRangoUnidadVenta(false);
		}
		
		if(this.rangounidadventaReturnGeneral.getConRetornoLista() || this.rangounidadventaReturnGeneral.getConRetornoObjeto()) {
			if(this.rangounidadventaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rangounidadventaLogic.setRangoUnidadVentas(this.rangounidadventaReturnGeneral.getRangoUnidadVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.rangounidadventaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rangounidadventaLogic.setRangoUnidadVenta(this.rangounidadventaReturnGeneral.getRangoUnidadVenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRangoUnidadVenta(false);
		}
	}
	
	public void actualizarParametrosGeneralRangoUnidadVenta() throws Exception {
		
		
	}
	
	public ArrayList<RangoUnidadVenta> getRangoUnidadVentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados=new ArrayList<RangoUnidadVenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRangoUnidadVenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RangoUnidadVenta rangounidadventaAux:rangounidadventaLogic.getRangoUnidadVentas()) {
					if(rangounidadventaAux.getIsSelected()) {
						rangounidadventasSeleccionados.add(rangounidadventaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RangoUnidadVenta rangounidadventaAux:this.rangounidadventas) {
					if(rangounidadventaAux.getIsSelected()) {
						rangounidadventasSeleccionados.add(rangounidadventaAux);				
					}
				}
			}
			
			if(rangounidadventasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						rangounidadventasSeleccionados.addAll(this.rangounidadventaLogic.getRangoUnidadVentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						rangounidadventasSeleccionados.addAll(this.rangounidadventas);				
					}
				}
			}
		} else {
			rangounidadventasSeleccionados.add(this.rangounidadventa);
		}
		
		return rangounidadventasSeleccionados;
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
	
	public void generarReporteRangoUnidadVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRangoUnidadVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRangoUnidadVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRangoUnidadVentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRangoUnidadVentasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesRangoUnidadVentasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Rango Unidad Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRangoUnidadVentasSeleccionados() throws Exception {
		ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados=new ArrayList<RangoUnidadVenta>();		
		
		rangounidadventasSeleccionados=this.getRangoUnidadVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRangoUnidadVentas("Todos",rangounidadventasSeleccionados);
		
	}	
	
	public void generarReporteNormalRangoUnidadVentasSeleccionados() throws Exception {
		ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados=new ArrayList<RangoUnidadVenta>();		
		
		rangounidadventasSeleccionados=this.getRangoUnidadVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRangoUnidadVentas("Todos",rangounidadventasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRangoUnidadVentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados=new ArrayList<RangoUnidadVenta>();
		
		rangounidadventasSeleccionados=this.getRangoUnidadVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRangoUnidadVentas("Todos",rangounidadventasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRangoUnidadVentasSeleccionados() throws Exception {
		ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados=new ArrayList<RangoUnidadVenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRangoUnidadVenta();
		
		
		rangounidadventasSeleccionados=this.getRangoUnidadVentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRangoUnidadVenta();
		
		
		//this.generarReporteRangoUnidadVentas("Todos",rangounidadventasSeleccionados ,rangounidadventaImplementable,rangounidadventaImplementableHome);
	}
	
	public void mostrarImportacionRangoUnidadVentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRangoUnidadVenta();
		
		this.abrirFrameImportacionRangoUnidadVenta();		
		
			
		//this.generarReporteRangoUnidadVentas("Todos",rangounidadventasSeleccionados ,rangounidadventaImplementable,rangounidadventaImplementableHome);
	}
	
	public void importarRangoUnidadVentas() throws Exception {		
	
	}
	
	public void exportarRangoUnidadVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRangoUnidadVentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRangoUnidadVentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRangoUnidadVentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Rango Unidad Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRangoUnidadVentasSeleccionados() throws Exception {
		ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados=new ArrayList<RangoUnidadVenta>();		
		
		rangounidadventasSeleccionados=this.getRangoUnidadVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rangounidadventa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRangoUnidadVenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RangoUnidadVenta rangounidadventaAux:rangounidadventasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRangoUnidadVenta(rangounidadventaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//rangounidadventaAux.setsDetalleGeneralEntityReporte(rangounidadventaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Unidad Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRangoUnidadVenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RangoUnidadVentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RangoUnidadVentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRangoUnidadVenta(RangoUnidadVenta rangounidadventa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=rangounidadventa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=rangounidadventa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=rangounidadventa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rangounidadventa.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rangounidadventa.getrango_inicial().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rangounidadventa.getrango_final().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRangoUnidadVentasSeleccionados() throws Exception {
		ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados=new ArrayList<RangoUnidadVenta>();		
		
		rangounidadventasSeleccionados=this.getRangoUnidadVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rangounidadventa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RangoUnidadVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRangoUnidadVenta(row);				
				iRow++;
			}				
			
			for(RangoUnidadVenta rangounidadventaAux:rangounidadventasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRangoUnidadVenta(rangounidadventaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Unidad Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRangoUnidadVentasSeleccionados() throws Exception {
		ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados=new ArrayList<RangoUnidadVenta>();		
		
		rangounidadventasSeleccionados=this.getRangoUnidadVentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rangounidadventa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("rangounidadventas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("rangounidadventa");
			//elementRoot.appendChild(element);
		
			for(RangoUnidadVenta rangounidadventaAux:rangounidadventasSeleccionados) {
				element = document.createElement("rangounidadventa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRangoUnidadVenta(rangounidadventaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Rango Unidad Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRangoUnidadVenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RangoUnidadVentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RangoUnidadVentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(RangoUnidadVentaConstantesFunciones.LABEL_RANGOINICIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(RangoUnidadVentaConstantesFunciones.LABEL_RANGOFINAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRangoUnidadVenta(RangoUnidadVenta rangounidadventa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(rangounidadventa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(rangounidadventa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rangounidadventa.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rangounidadventa.getrango_inicial());
		cell = row.createCell(iColumn++);cell.setCellValue(rangounidadventa.getrango_final());				
	}
	
	public void setFilaDatosExportarXmlRangoUnidadVenta(RangoUnidadVenta rangounidadventa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RangoUnidadVentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(rangounidadventa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RangoUnidadVentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(rangounidadventa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RangoUnidadVentaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(rangounidadventa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementunidad_descripcion = document.createElement(RangoUnidadVentaConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(rangounidadventa.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementrango_inicial = document.createElement(RangoUnidadVentaConstantesFunciones.RANGOINICIAL);
		elementrango_inicial.appendChild(document.createTextNode(rangounidadventa.getrango_inicial().toString().trim()));
		element.appendChild(elementrango_inicial);

		Element elementrango_final = document.createElement(RangoUnidadVentaConstantesFunciones.RANGOFINAL);
		elementrango_final.appendChild(document.createTextNode(rangounidadventa.getrango_final().toString().trim()));
		element.appendChild(elementrango_final);
	}
	
	public void generarReporteGroupGenericoRangoUnidadVentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados=new ArrayList<RangoUnidadVenta>();
		
		rangounidadventasSeleccionados=this.getRangoUnidadVentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRangoUnidadVenta(rangounidadventasSeleccionados);
		
		this.generarReporteRangoUnidadVentas("Todos",rangounidadventasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRangoUnidadVenta(ArrayList<RangoUnidadVenta> rangounidadventasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RangoUnidadVenta rangounidadventaAux:rangounidadventasSeleccionados) {
				rangounidadventaAux.setsDetalleGeneralEntityReporte(rangounidadventaAux.toString());
			
				if(sTipoSeleccionar.equals(RangoUnidadVentaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					rangounidadventaAux.setsDescripcionGeneralEntityReporte1(rangounidadventaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RangoUnidadVentaConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					rangounidadventaAux.setsDescripcionGeneralEntityReporte1(rangounidadventaAux.getunidad_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RangoUnidadVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRangoUnidadVenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRangoUnidadVenta=true;
				this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=true;
				this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=true;
			}
			
			this.isVisibilidadCeldaModificarRangoUnidadVenta=false;
			this.isVisibilidadCeldaActualizarRangoUnidadVenta=false;
			this.isVisibilidadCeldaEliminarRangoUnidadVenta=false;
			this.isVisibilidadCeldaCancelarRangoUnidadVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRangoUnidadVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarRangoUnidadVenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRangoUnidadVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=false;
			this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=false;
			this.isVisibilidadCeldaModificarRangoUnidadVenta=false;
			this.isVisibilidadCeldaActualizarRangoUnidadVenta=true;
			this.isVisibilidadCeldaEliminarRangoUnidadVenta=false;
			this.isVisibilidadCeldaCancelarRangoUnidadVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRangoUnidadVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarRangoUnidadVenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRangoUnidadVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=false;
			this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=false;
			this.isVisibilidadCeldaModificarRangoUnidadVenta=false;
			this.isVisibilidadCeldaActualizarRangoUnidadVenta=true;
			this.isVisibilidadCeldaEliminarRangoUnidadVenta=true;
			this.isVisibilidadCeldaCancelarRangoUnidadVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRangoUnidadVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarRangoUnidadVenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRangoUnidadVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=false;
			this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=false;
			this.isVisibilidadCeldaModificarRangoUnidadVenta=false;
			this.isVisibilidadCeldaActualizarRangoUnidadVenta=true;
			this.isVisibilidadCeldaEliminarRangoUnidadVenta=false;
			this.isVisibilidadCeldaCancelarRangoUnidadVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRangoUnidadVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarRangoUnidadVenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRangoUnidadVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=true;
			this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=true;
			this.isVisibilidadCeldaModificarRangoUnidadVenta=false;
			this.isVisibilidadCeldaActualizarRangoUnidadVenta=false;
			this.isVisibilidadCeldaEliminarRangoUnidadVenta=false;
			this.isVisibilidadCeldaCancelarRangoUnidadVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRangoUnidadVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarRangoUnidadVenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRangoUnidadVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=false;
			this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=false;
			this.isVisibilidadCeldaActualizarRangoUnidadVenta=false;
			this.isVisibilidadCeldaEliminarRangoUnidadVenta=false;
			this.isVisibilidadCeldaCancelarRangoUnidadVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRangoUnidadVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarRangoUnidadVenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRangoUnidadVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=false;
			this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=false;
			this.isVisibilidadCeldaModificarRangoUnidadVenta=true;
			this.isVisibilidadCeldaActualizarRangoUnidadVenta=false;
			this.isVisibilidadCeldaEliminarRangoUnidadVenta=false;
			this.isVisibilidadCeldaCancelarRangoUnidadVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRangoUnidadVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarRangoUnidadVenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RangoUnidadVentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRangoUnidadVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=true;
			this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=true;
		} else {
			this.actualizarEstadoPanelsRangoUnidadVenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRangoUnidadVenta=false;
			//this.isVisibilidadCeldaVerFormRangoUnidadVenta=false;
			this.isVisibilidadCeldaDuplicarRangoUnidadVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!rangounidadventaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=false;
		} else {
			this.isVisibilidadCeldaNuevoRangoUnidadVenta=false;
			this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(rangounidadventaSessionBean.getEsGuardarRelacionado()) {
			if(!rangounidadventaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=false;												
			}
			
			this.jButtonCerrarRangoUnidadVenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRangoUnidadVenta=false;
		}
		
		if(!this.permiteMantenimiento(this.rangounidadventa)) {
			this.isVisibilidadCeldaActualizarRangoUnidadVenta=false;
			this.isVisibilidadCeldaEliminarRangoUnidadVenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRangoUnidadVenta() {
		this.isVisibilidadCeldaNuevoRangoUnidadVenta=false;
		this.isVisibilidadCeldaGuardarCambiosRangoUnidadVenta=false;
	}
	
	public void actualizarEstadoPanelsRangoUnidadVenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRangoUnidadVenta!=null) {
				this.jScrollPanelDatosEdicionRangoUnidadVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoUnidadVenta!=null) {
				this.jTabbedPaneBusquedasRangoUnidadVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRangoUnidadVenta!=null) {
				this.jScrollPanelDatosRangoUnidadVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionRangoUnidadVenta!=null) {
				this.jPanelPaginacionRangoUnidadVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRangoUnidadVenta!=null) {
				this.jPanelParametrosReportesRangoUnidadVenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRangoUnidadVenta!=null) {
				this.jScrollPanelDatosEdicionRangoUnidadVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoUnidadVenta!=null) {
				this.jTabbedPaneBusquedasRangoUnidadVenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRangoUnidadVenta!=null) {
				this.jScrollPanelDatosRangoUnidadVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionRangoUnidadVenta!=null) {
				this.jPanelPaginacionRangoUnidadVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRangoUnidadVenta!=null) {
				this.jPanelParametrosReportesRangoUnidadVenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRangoUnidadVenta!=null) {
				this.jScrollPanelDatosEdicionRangoUnidadVenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoUnidadVenta!=null) {
				this.jTabbedPaneBusquedasRangoUnidadVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRangoUnidadVenta!=null) {
				this.jScrollPanelDatosRangoUnidadVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionRangoUnidadVenta!=null) {
				this.jPanelPaginacionRangoUnidadVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRangoUnidadVenta!=null) {
				this.jPanelParametrosReportesRangoUnidadVenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRangoUnidadVenta!=null) {
				this.jScrollPanelDatosEdicionRangoUnidadVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoUnidadVenta!=null) {
				this.jTabbedPaneBusquedasRangoUnidadVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRangoUnidadVenta!=null) {
				this.jScrollPanelDatosRangoUnidadVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionRangoUnidadVenta!=null) {
				this.jPanelPaginacionRangoUnidadVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRangoUnidadVenta!=null) {
				this.jPanelParametrosReportesRangoUnidadVenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRangoUnidadVenta!=null) {
				this.jScrollPanelDatosEdicionRangoUnidadVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoUnidadVenta!=null) {
				this.jTabbedPaneBusquedasRangoUnidadVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRangoUnidadVenta!=null) {
				this.jScrollPanelDatosRangoUnidadVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionRangoUnidadVenta!=null) {
				this.jPanelPaginacionRangoUnidadVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRangoUnidadVenta!=null) {
				this.jPanelParametrosReportesRangoUnidadVenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRangoUnidadVenta!=null) {
				this.jScrollPanelDatosEdicionRangoUnidadVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoUnidadVenta!=null) {
				this.jTabbedPaneBusquedasRangoUnidadVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRangoUnidadVenta!=null) {
				this.jScrollPanelDatosRangoUnidadVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionRangoUnidadVenta!=null) {
				this.jPanelPaginacionRangoUnidadVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRangoUnidadVenta!=null) {
				this.jPanelParametrosReportesRangoUnidadVenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRangoUnidadVenta!=null) {
				this.jScrollPanelDatosEdicionRangoUnidadVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoUnidadVenta!=null) {
				this.jTabbedPaneBusquedasRangoUnidadVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRangoUnidadVenta!=null) {
				this.jScrollPanelDatosRangoUnidadVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionRangoUnidadVenta!=null) {
				this.jPanelPaginacionRangoUnidadVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRangoUnidadVenta!=null) {
				this.jPanelParametrosReportesRangoUnidadVenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRangoUnidadVenta!=null) {
					this.jTabbedPaneBusquedasRangoUnidadVenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRangoUnidadVenta!=null) {
				this.jPanelParametrosReportesRangoUnidadVenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.rangounidadventaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRangoUnidadVenta!=null) {
				this.jTabbedPaneBusquedasRangoUnidadVenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRangoUnidadVenta!=null) {
				this.jPanelParametrosReportesRangoUnidadVenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdUnidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasRangoUnidadVenta.remove(jPanelFK_IdUnidadRangoUnidadVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasRangoUnidadVenta.remove(jPanelFK_IdUnidadRangoUnidadVenta);}
		}
		
	}
	
	

	public String registrarSesionRangoUnidadVentaParaPrecios() throws Exception {
		Boolean isPaginaPopupPrecio=false;

		try {

			if(this.rangounidadventaSessionBean==null) {
				this.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
			}

			if(this.jInternalFrameDetalleFormRangoUnidadVenta.precioSessionBean==null) {
				this.jInternalFrameDetalleFormRangoUnidadVenta.precioSessionBean=new PrecioSessionBean();
			}

			this.jInternalFrameDetalleFormRangoUnidadVenta.precioSessionBean.setsPathNavegacionActual(rangounidadventaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PrecioConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormRangoUnidadVenta.precioSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPrecio=this.jInternalFrameDetalleFormRangoUnidadVenta.precioSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormRangoUnidadVenta.precioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePrecio(true);
			this.jInternalFrameDetalleFormRangoUnidadVenta.precioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePrecio(RangoUnidadVentaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormRangoUnidadVenta.precioSessionBean.setisBusquedaDesdeForeignKeySesionRangoUnidadVenta(true);
			this.jInternalFrameDetalleFormRangoUnidadVenta.precioSessionBean.setlidRangoUnidadVentaActual(this.idRangoUnidadVentaActual);

			rangounidadventaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVenta(true);
			rangounidadventaSessionBean.setlIdRangoUnidadVentaActualForeignKey(this.idRangoUnidadVentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionRangoUnidadVentaParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.rangounidadventaSessionBean==null) {
				this.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
			}

			if(this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoSessionBean.setsPathNavegacionActual(rangounidadventaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(RangoUnidadVentaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionRangoUnidadVenta(true);
			this.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoSessionBean.setlidRangoUnidadVentaActual(this.idRangoUnidadVentaActual);

			rangounidadventaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRangoUnidadVenta(true);
			rangounidadventaSessionBean.setlIdRangoUnidadVentaActualForeignKey(this.idRangoUnidadVentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RangoUnidadVentaSessionBean rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
		
		if(this.rangounidadventaSessionBean==null) {
			this.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
		}
		
		this.rangounidadventaSessionBean.setsUltimaBusquedaRangoUnidadVenta(this.getsAccionBusqueda());
		this.rangounidadventaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.rangounidadventaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			rangounidadventaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			rangounidadventaSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RangoUnidadVentaSessionBean rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
		
		if(this.rangounidadventaSessionBean==null) {
			this.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
		}
		
		if(this.rangounidadventaSessionBean.getsUltimaBusquedaRangoUnidadVenta()!=null&&!this.rangounidadventaSessionBean.getsUltimaBusquedaRangoUnidadVenta().equals("")) {
			this.setsAccionBusqueda(rangounidadventaSessionBean.getsUltimaBusquedaRangoUnidadVenta());
			this.setiNumeroPaginacion(rangounidadventaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(rangounidadventaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(rangounidadventaSessionBean.getid_empresa());
				rangounidadventaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(rangounidadventaSessionBean.getid_unidad());
				rangounidadventaSessionBean.setid_unidad(-1L);
			}
		}
		
		this.rangounidadventaSessionBean.setsUltimaBusquedaRangoUnidadVenta("");
		this.rangounidadventaSessionBean.setiNumeroPaginacion(RangoUnidadVentaConstantesFunciones.INUMEROPAGINACION);
		this.rangounidadventaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRangoUnidadVenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRangoUnidadVenta() {
		this.updateBorderResaltarBusquedasFormularioRangoUnidadVenta();
		this.updateVisibilidadBusquedasFormularioRangoUnidadVenta();
		this.updateHabilitarBusquedasFormularioRangoUnidadVenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioRangoUnidadVenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRangoUnidadVenta.getComponents().length>0) {
	

		if(this.rangounidadventaConstantesFunciones.resaltarFK_IdUnidadRangoUnidadVenta!=null) {
			index= this.jTabbedPaneBusquedasRangoUnidadVenta.indexOfComponent(this.jPanelFK_IdUnidadRangoUnidadVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRangoUnidadVenta.getComponent(index);
				jPanel.setBorder(this.rangounidadventaConstantesFunciones.resaltarFK_IdUnidadRangoUnidadVenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRangoUnidadVenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRangoUnidadVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRangoUnidadVenta.indexOfComponent(this.jPanelFK_IdUnidadRangoUnidadVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRangoUnidadVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rangounidadventaConstantesFunciones.mostrarFK_IdUnidadRangoUnidadVenta);
			if(!this.rangounidadventaConstantesFunciones.mostrarFK_IdUnidadRangoUnidadVenta && index>-1) {
				this.jTabbedPaneBusquedasRangoUnidadVenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRangoUnidadVenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRangoUnidadVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRangoUnidadVenta.indexOfComponent(this.jPanelFK_IdUnidadRangoUnidadVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRangoUnidadVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rangounidadventaConstantesFunciones.activarFK_IdUnidadRangoUnidadVenta);
				this.jTabbedPaneBusquedasRangoUnidadVenta.setEnabledAt(index,this.rangounidadventaConstantesFunciones.activarFK_IdUnidadRangoUnidadVenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRangoUnidadVenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasRangoUnidadVenta.indexOfComponent(this.jPanelFK_IdUnidadRangoUnidadVenta);

			this.jTabbedPaneBusquedasRangoUnidadVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRangoUnidadVenta.getComponent(index);

			this.rangounidadventaConstantesFunciones.setResaltarFK_IdUnidadRangoUnidadVenta(resaltar);

			jPanel.setBorder(this.rangounidadventaConstantesFunciones.resaltarFK_IdUnidadRangoUnidadVenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRangoUnidadVenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRangoUnidadVenta() throws Exception {

		if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRangoUnidadVenta();
		this.updateVisibilidadResaltarControlesFormularioRangoUnidadVenta();
		this.updateHabilitarResaltarControlesFormularioRangoUnidadVenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioRangoUnidadVenta() throws Exception {
		if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.rangounidadventaConstantesFunciones.resaltaridRangoUnidadVenta!=null && this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelidRangoUnidadVenta.setBorder(this.rangounidadventaConstantesFunciones.resaltaridRangoUnidadVenta);}
		if(this.rangounidadventaConstantesFunciones.resaltarid_empresaRangoUnidadVenta!=null && this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta.setBorder(this.rangounidadventaConstantesFunciones.resaltarid_empresaRangoUnidadVenta);}
		if(this.rangounidadventaConstantesFunciones.resaltarid_unidadRangoUnidadVenta!=null && this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta.setBorder(this.rangounidadventaConstantesFunciones.resaltarid_unidadRangoUnidadVenta);}
		if(this.rangounidadventaConstantesFunciones.resaltarrango_inicialRangoUnidadVenta!=null && this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_inicialRangoUnidadVenta.setBorder(this.rangounidadventaConstantesFunciones.resaltarrango_inicialRangoUnidadVenta);}
		if(this.rangounidadventaConstantesFunciones.resaltarrango_finalRangoUnidadVenta!=null && this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_finalRangoUnidadVenta.setBorder(this.rangounidadventaConstantesFunciones.resaltarrango_finalRangoUnidadVenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRangoUnidadVenta() throws Exception {		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
	
		//this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelidRangoUnidadVenta.setVisible(this.rangounidadventaConstantesFunciones.mostraridRangoUnidadVenta);
		this.jInternalFrameDetalleFormRangoUnidadVenta.jPanelidRangoUnidadVenta.setVisible(this.rangounidadventaConstantesFunciones.mostraridRangoUnidadVenta);
		//this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta.setVisible(this.rangounidadventaConstantesFunciones.mostrarid_empresaRangoUnidadVenta);
		this.jInternalFrameDetalleFormRangoUnidadVenta.jPanelid_empresaRangoUnidadVenta.setVisible(this.rangounidadventaConstantesFunciones.mostrarid_empresaRangoUnidadVenta);
		//this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta.setVisible(this.rangounidadventaConstantesFunciones.mostrarid_unidadRangoUnidadVenta);
		this.jInternalFrameDetalleFormRangoUnidadVenta.jPanelid_unidadRangoUnidadVenta.setVisible(this.rangounidadventaConstantesFunciones.mostrarid_unidadRangoUnidadVenta);
		//this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_inicialRangoUnidadVenta.setVisible(this.rangounidadventaConstantesFunciones.mostrarrango_inicialRangoUnidadVenta);
		this.jInternalFrameDetalleFormRangoUnidadVenta.jPanelrango_inicialRangoUnidadVenta.setVisible(this.rangounidadventaConstantesFunciones.mostrarrango_inicialRangoUnidadVenta);
		//this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_finalRangoUnidadVenta.setVisible(this.rangounidadventaConstantesFunciones.mostrarrango_finalRangoUnidadVenta);
		this.jInternalFrameDetalleFormRangoUnidadVenta.jPanelrango_finalRangoUnidadVenta.setVisible(this.rangounidadventaConstantesFunciones.mostrarrango_finalRangoUnidadVenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRangoUnidadVenta() throws Exception {
		if(this.jInternalFrameDetalleFormRangoUnidadVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRangoUnidadVenta!=null) {
	
		this.jInternalFrameDetalleFormRangoUnidadVenta.jLabelidRangoUnidadVenta.setEnabled(this.rangounidadventaConstantesFunciones.activaridRangoUnidadVenta);
		this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_empresaRangoUnidadVenta.setEnabled(this.rangounidadventaConstantesFunciones.activarid_empresaRangoUnidadVenta);
		this.jInternalFrameDetalleFormRangoUnidadVenta.jComboBoxid_unidadRangoUnidadVenta.setEnabled(this.rangounidadventaConstantesFunciones.activarid_unidadRangoUnidadVenta);
		this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_inicialRangoUnidadVenta.setEnabled(this.rangounidadventaConstantesFunciones.activarrango_inicialRangoUnidadVenta);
		this.jInternalFrameDetalleFormRangoUnidadVenta.jTextFieldrango_finalRangoUnidadVenta.setEnabled(this.rangounidadventaConstantesFunciones.activarrango_finalRangoUnidadVenta);
		}
	}
	
		
}