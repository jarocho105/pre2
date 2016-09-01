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

import com.bydan.erp.inventario.util.UnidadConstantesFunciones;
import com.bydan.erp.inventario.util.UnidadParameterReturnGeneral;
//import com.bydan.erp.inventario.util.UnidadParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.UnidadBean;
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
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class UnidadBeanSwingJInternalFrame extends UnidadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(UnidadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Unidad> unidadValidator = new ClassValidator<Unidad>(Unidad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Unidad unidad;	
	public Unidad unidadAux;
	public Unidad unidadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Unidad unidadTotales;
	public Long idUnidadActual;
	public Long iIdNuevoUnidad=0L;
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

	public String sFinalQueryComboTipoUnidad="";

	public List<TipoUnidad> tipounidadsForeignKey;

	public List<TipoUnidad> gettipounidadsForeignKey() {
		return tipounidadsForeignKey;
	}

	public void settipounidadsForeignKey(List<TipoUnidad> tipounidadsForeignKey) {
		this.tipounidadsForeignKey = tipounidadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoUnidad tipounidadForeignKey;

	public TipoUnidad gettipounidadForeignKey() {
		return tipounidadForeignKey;
	}

	public void settipounidadForeignKey(TipoUnidad tipounidadForeignKey) {
		this.tipounidadForeignKey = tipounidadForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosProducto=false;

	public Boolean getIsTienePermisosProducto() {
		return isTienePermisosProducto;
	}

	public void setIsTienePermisosProducto(Boolean isTienePermisosProducto) {
		this.isTienePermisosProducto= isTienePermisosProducto;
	}


	public Boolean isTienePermisosConversionInven=false;

	public Boolean getIsTienePermisosConversionInven() {
		return isTienePermisosConversionInven;
	}

	public void setIsTienePermisosConversionInven(Boolean isTienePermisosConversionInven) {
		this.isTienePermisosConversionInven= isTienePermisosConversionInven;
	}


	public Boolean isTienePermisosRangoUnidadVenta=false;

	public Boolean getIsTienePermisosRangoUnidadVenta() {
		return isTienePermisosRangoUnidadVenta;
	}

	public void setIsTienePermisosRangoUnidadVenta(Boolean isTienePermisosRangoUnidadVenta) {
		this.isTienePermisosRangoUnidadVenta= isTienePermisosRangoUnidadVenta;
	}


	public Boolean isTienePermisosValorPorUnidad=false;

	public Boolean getIsTienePermisosValorPorUnidad() {
		return isTienePermisosValorPorUnidad;
	}

	public void setIsTienePermisosValorPorUnidad(Boolean isTienePermisosValorPorUnidad) {
		this.isTienePermisosValorPorUnidad= isTienePermisosValorPorUnidad;
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
	
	public Boolean isPermisoTodoUnidad;
	public Boolean isPermisoNuevoUnidad;
	public Boolean isPermisoActualizarUnidad;
	public Boolean isPermisoActualizarOriginalUnidad;
	public Boolean isPermisoEliminarUnidad;
	public Boolean isPermisoGuardarCambiosUnidad;
	public Boolean isPermisoConsultaUnidad;
	public Boolean isPermisoBusquedaUnidad;
	public Boolean isPermisoReporteUnidad;
	public Boolean isPermisoPaginacionMedioUnidad;
	public Boolean isPermisoPaginacionAltoUnidad;
	public Boolean isPermisoPaginacionTodoUnidad;
	public Boolean isPermisoCopiarUnidad;
	public Boolean isPermisoVerFormUnidad;
	public Boolean isPermisoDuplicarUnidad;
	public Boolean isPermisoOrdenUnidad;
	
	
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
	
	public UnidadParameterReturnGeneral unidadReturnGeneral;
	public UnidadParameterReturnGeneral unidadParameterGeneral;
	
	

	public ProductoLogic productoLogic=null;

	public ProductoLogic getProductoLogic() {
		return productoLogic;
	}

	public void setProductoLogic(ProductoLogic productoLogic) {
		this.productoLogic = productoLogic;
	}


	public ConversionInvenLogic conversioninvenConversionLogic=null;

	public ConversionInvenLogic getConversionInvenConversionLogic() {
		return conversioninvenConversionLogic;
	}

	public void setConversionInvenConversionLogic(ConversionInvenLogic conversioninvenConversionLogic) {
		this.conversioninvenConversionLogic = conversioninvenConversionLogic;
	}


	public RangoUnidadVentaLogic rangounidadventaLogic=null;

	public RangoUnidadVentaLogic getRangoUnidadVentaLogic() {
		return rangounidadventaLogic;
	}

	public void setRangoUnidadVentaLogic(RangoUnidadVentaLogic rangounidadventaLogic) {
		this.rangounidadventaLogic = rangounidadventaLogic;
	}


	public ValorPorUnidadLogic valorporunidadLogic=null;

	public ValorPorUnidadLogic getValorPorUnidadLogic() {
		return valorporunidadLogic;
	}

	public void setValorPorUnidadLogic(ValorPorUnidadLogic valorporunidadLogic) {
		this.valorporunidadLogic = valorporunidadLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoUnidad=false;
	public Boolean esParaAccionDesdeFormularioUnidad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected UnidadSessionBeanAdditional unidadSessionBeanAdditional=null;
	
	public UnidadSessionBeanAdditional getUnidadSessionBeanAdditional() {
		return this.unidadSessionBeanAdditional;
	}
	
	public void setUnidadSessionBeanAdditional(UnidadSessionBeanAdditional unidadSessionBeanAdditional) {
		try {
			this.unidadSessionBeanAdditional=unidadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected UnidadBeanSwingJInternalFrameAdditional unidadBeanSwingJInternalFrameAdditional=null;
	//public class UnidadBeanSwingJInternalFrame
	
	public UnidadBeanSwingJInternalFrameAdditional getUnidadBeanSwingJInternalFrameAdditional() {
		return this.unidadBeanSwingJInternalFrameAdditional;
	}
	
	public void setUnidadBeanSwingJInternalFrameAdditional(UnidadBeanSwingJInternalFrameAdditional unidadBeanSwingJInternalFrameAdditional) {
		try {
			this.unidadBeanSwingJInternalFrameAdditional=unidadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public UnidadLogic unidadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Unidad unidadBean;
	public UnidadConstantesFunciones unidadConstantesFunciones;
	//public UnidadParameterReturnGeneral unidadReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoUnidadLogic tipounidadLogic;
	
	//PARAMETROS
	
	
	//public List<Unidad> unidads;	
	//public List<Unidad> unidadsEliminados;
	//public List<Unidad> unidadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoUnidad=false;
	public Boolean isVisibilidadCeldaDuplicarUnidad=true;
	public Boolean isVisibilidadCeldaCopiarUnidad=true;
	public Boolean isVisibilidadCeldaVerFormUnidad=true;
	public Boolean isVisibilidadCeldaOrdenUnidad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesUnidad=false;
	public Boolean isVisibilidadCeldaModificarUnidad=false;
	public Boolean isVisibilidadCeldaActualizarUnidad=false;
	public Boolean isVisibilidadCeldaEliminarUnidad=false;
	public Boolean isVisibilidadCeldaCancelarUnidad=false;
	public Boolean isVisibilidadCeldaGuardarUnidad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosUnidad=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadBusquedaPorSiglas=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoUnidad=false;
	
	public Long getiIdNuevoUnidad() {
		return this.iIdNuevoUnidad;
	}

	public void setiIdNuevoUnidad(Long iIdNuevoUnidad) {
		this.iIdNuevoUnidad = iIdNuevoUnidad;
	}
	
	public Long getidUnidadActual() {
		return this.idUnidadActual;
	}

	public void setidUnidadActual(Long idUnidadActual) {
		this.idUnidadActual = idUnidadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Unidad getunidad() {
		return this.unidad;
	}

	public void setunidad(Unidad unidad) {
		this.unidad = unidad;
	}
	
	public Unidad getunidadAux() {
		return this.unidadAux;
	}

	public void setunidadAux(Unidad unidadAux) {
		this.unidadAux = unidadAux;
	}				
	
	public Unidad getunidadAnterior() {
		return this.unidadAnterior;
	}

	public void setunidadAnterior(Unidad unidadAnterior) {
		this.unidadAnterior = unidadAnterior;
	}	
	
	public Unidad getunidadTotales() {
		return this.unidadTotales;
	}

	public void setunidadTotales(Unidad unidadTotales) {
		this.unidadTotales = unidadTotales;
	}	
	
	public Unidad getunidadBean() {
		return this.unidadBean;
	}

	public void setunidadBean(Unidad unidadBean) {
		this.unidadBean = unidadBean;
	}	
	
	public UnidadParameterReturnGeneral getunidadReturnGeneral() {
		return this.unidadReturnGeneral;
	}

	public void setunidadReturnGeneral(UnidadParameterReturnGeneral unidadReturnGeneral) {
		this.unidadReturnGeneral = unidadReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public String siglasBusquedaPorSiglas="";

	public String getsiglasBusquedaPorSiglas() {
		return this.siglasBusquedaPorSiglas;
	}

	public void setsiglasBusquedaPorSiglas(String siglasBusquedaPorSiglas) {
		this.siglasBusquedaPorSiglas = siglasBusquedaPorSiglas;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_unidadFK_IdTipoUnidad=-1L;

	public Long getid_tipo_unidadFK_IdTipoUnidad() {
		return this.id_tipo_unidadFK_IdTipoUnidad;
	}

	public void setid_tipo_unidadFK_IdTipoUnidad(Long id_tipo_unidadFK_IdTipoUnidad) {
		this.id_tipo_unidadFK_IdTipoUnidad = id_tipo_unidadFK_IdTipoUnidad;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public UnidadLogic getUnidadLogic()	{		
		return unidadLogic;
	}

	public void setUnidadLogic(UnidadLogic unidadLogic) {
		this.unidadLogic = unidadLogic;
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
	
	public Boolean getIsEsNuevoUnidad() {
		return isEsNuevoUnidad;
	}

	public void setIsEsNuevoUnidad(Boolean isEsNuevoUnidad) {
		this.isEsNuevoUnidad = isEsNuevoUnidad;
	}

	public Boolean getEsParaAccionDesdeFormularioUnidad() {
		return esParaAccionDesdeFormularioUnidad;
	}
	
	public void setEsParaAccionDesdeFormularioUnidad(Boolean esParaAccionDesdeFormularioUnidad) {
		this.esParaAccionDesdeFormularioUnidad = esParaAccionDesdeFormularioUnidad;
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

			if(this.unidadSessionBean==null) {
				this.unidadSessionBean=new UnidadSessionBean();
			}

			if(!this.unidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(unidadSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoUnidadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipounidadsForeignKey=new ArrayList<TipoUnidad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoUnidadLogic tipounidadLogic=new TipoUnidadLogic();

			//tipounidadLogic.getTipoUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.unidadSessionBean==null) {
				this.unidadSessionBean=new UnidadSessionBean();
			}

			if(!this.unidadSessionBean.getisBusquedaDesdeForeignKeySesionTipoUnidad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipounidadLogic.getTipoUnidadDataAccess().setIsForForeingKeyData(true);

					tipounidadLogic.getTodosTipoUnidadsWithConnection(sFinalQuery,new Pagination());

					this.tipounidadsForeignKey=tipounidadLogic.getTipoUnidads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoUnidad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipounidadLogic.getEntityWithConnection(unidadSessionBean.getlidTipoUnidadActual());
					this.tipounidadsForeignKey.add(tipounidadLogic.getTipoUnidad());
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

					if(this.unidad!=null) {
						this.unidad.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormUnidad!=null) {
						this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaUnidad.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormUnidad!=null) {
						if(this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaUnidadGenerico)throws Exception
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
				jComboBoxid_empresaUnidadGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaUnidadGenerico!=null && jComboBoxid_empresaUnidadGenerico.getItemCount()>0) {
					jComboBoxid_empresaUnidadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoUnidadForeignKey(Long idTipoUnidadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoUnidad  tipounidadTemp=null;

			for(TipoUnidad tipounidadAux:tipounidadsForeignKey) {
				if(tipounidadAux.getId()!=null && tipounidadAux.getId().equals(idTipoUnidadSeleccionado)) {
					tipounidadTemp=tipounidadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipounidadTemp!=null) {

					if(this.unidad!=null) {
						this.unidad.setTipoUnidad(tipounidadTemp);
					}

					if(this.jInternalFrameDetalleFormUnidad!=null) {
						this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad.setSelectedItem(tipounidadTemp);
					}
				} else {
					//jComboBoxid_tipo_unidadUnidad.setSelectedItem(tipounidadTemp);
					if(this.jInternalFrameDetalleFormUnidad!=null) {
						if(this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipounidadTemp!=null && jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad!=null) {
						jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad.setSelectedItem(tipounidadTemp);
					} else {
						if(jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad!=null) {
							//jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad.setSelectedItem(tipounidadTemp);
							if(jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad.getItemCount()>0) {
								jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad.setSelectedIndex(0);
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

	public String getActualTipoUnidadForeignKeyDescripcion(Long idTipoUnidadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoUnidad  tipounidadTemp=null;

			for(TipoUnidad tipounidadAux:tipounidadsForeignKey) {
				if(tipounidadAux.getId()!=null && tipounidadAux.getId().equals(idTipoUnidadSeleccionado)) {
					tipounidadTemp=tipounidadAux;
					break;
				}
			}


			sDescripcion=TipoUnidadConstantesFunciones.getTipoUnidadDescripcion(tipounidadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoUnidadForeignKeyGenerico(Long idTipoUnidadSeleccionado,JComboBox jComboBoxid_tipo_unidadUnidadGenerico)throws Exception
	{
		try
		{
			TipoUnidad  tipounidadTemp=null;

			for(TipoUnidad tipounidadAux:tipounidadsForeignKey) {
				if(tipounidadAux.getId()!=null && tipounidadAux.getId().equals(idTipoUnidadSeleccionado)) {
					tipounidadTemp=tipounidadAux;
					break;
				}
			}

			if(tipounidadTemp!=null) {
				jComboBoxid_tipo_unidadUnidadGenerico.setSelectedItem(tipounidadTemp);
			} else {
				if(jComboBoxid_tipo_unidadUnidadGenerico!=null && jComboBoxid_tipo_unidadUnidadGenerico.getItemCount()>0) {
					jComboBoxid_tipo_unidadUnidadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Unidad unidad,JComboBox jComboBoxid_empresaUnidadGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaUnidadGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaUnidadGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				unidad.setid_empresa(empresaAux.getId());
				unidad.setempresa_descripcion(UnidadConstantesFunciones.getEmpresaDescripcion(empresaAux));
				unidad.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoUnidadForeignKey(Unidad unidad,JComboBox jComboBoxid_tipo_unidadUnidadGenerico)throws Exception
	{
		try
		{
			TipoUnidad  tipounidadAux=new TipoUnidad();

			if(jComboBoxid_tipo_unidadUnidadGenerico==null) {
				tipounidadAux=(TipoUnidad)this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad.getSelectedItem();
			} else {
				tipounidadAux=(TipoUnidad)jComboBoxid_tipo_unidadUnidadGenerico.getSelectedItem();
			}

			if(tipounidadAux!=null && tipounidadAux.getId()!=null) {
				unidad.setid_tipo_unidad(tipounidadAux.getId());
				unidad.settipounidad_descripcion(UnidadConstantesFunciones.getTipoUnidadDescripcion(tipounidadAux));
				unidad.setTipoUnidad(tipounidadAux);			}
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

					if(!UnidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUnidad!=null) { 
							this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUnidad!=null) { 
					}

					if(!UnidadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoUnidadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoUnidad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UnidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUnidad!=null) { 
							this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad.removeAllItems();

							for(TipoUnidad tipounidad:this.tipounidadsForeignKey) {
								this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad.addItem(tipounidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUnidad!=null) { 
					}

					if(!UnidadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UnidadJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad.removeAllItems();

							for(TipoUnidad tipounidad:this.tipounidadsForeignKey) {
								this.jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad.addItem(tipounidad);
							}
						}

						if(!UnidadJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormUnidad!=null) {
							this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormUnidad!=null) {
							this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoUnidadForeignKey(TipoUnidad tipounidad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUnidad!=null) {
							this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad.setSelectedItem(tipounidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormUnidad!=null) {
							this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad.setSelectedItem(tipounidad);
						} else {
							this.jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesUnidad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			UnidadConstantesFunciones.refrescarForeignKeysDescripcionesUnidad(this.unidadLogic.getUnidads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			UnidadConstantesFunciones.refrescarForeignKeysDescripcionesUnidad(this.unidads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoUnidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//unidadLogic.setUnidads(this.unidads);
			unidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public UnidadParameterReturnGeneral getUnidadParameterGeneral() {
		return this.unidadParameterGeneral;
	}
	
	public void setUnidadParameterGeneral(UnidadParameterReturnGeneral unidadParameterGeneral) {
		this.unidadParameterGeneral = unidadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoUnidad() {
		return isPermisoTodoUnidad;
	}

	public void setIsPermisoTodoUnidad(Boolean isPermisoTodoUnidad) {
		this.isPermisoTodoUnidad = isPermisoTodoUnidad;
	}

	public Boolean getIsPermisoNuevoUnidad() {
		return isPermisoNuevoUnidad;
	}

	public void setIsPermisoNuevoUnidad(Boolean isPermisoNuevoUnidad) {
		this.isPermisoNuevoUnidad = isPermisoNuevoUnidad;
	}

	public Boolean getIsPermisoActualizarUnidad() {
		return isPermisoActualizarUnidad;
	}

	public void setIsPermisoActualizarUnidad(Boolean isPermisoActualizarUnidad) {
		this.isPermisoActualizarUnidad = isPermisoActualizarUnidad;
	}

	public Boolean getIsPermisoEliminarUnidad() {
		return isPermisoEliminarUnidad;
	}

	public void setIsPermisoEliminarUnidad(Boolean isPermisoEliminarUnidad) {
		this.isPermisoEliminarUnidad = isPermisoEliminarUnidad;
	}

	public Boolean getIsPermisoGuardarCambiosUnidad() {
		return isPermisoGuardarCambiosUnidad;
	}

	public void setIsPermisoGuardarCambiosUnidad(Boolean isPermisoGuardarCambiosUnidad) {
		this.isPermisoGuardarCambiosUnidad = isPermisoGuardarCambiosUnidad;
	}
	
	public Boolean getIsPermisoConsultaUnidad() {
		return isPermisoConsultaUnidad;
	}

	public void setIsPermisoConsultaUnidad(Boolean isPermisoConsultaUnidad) {
		this.isPermisoConsultaUnidad = isPermisoConsultaUnidad;
	}

	public Boolean getIsPermisoBusquedaUnidad() {
		return isPermisoBusquedaUnidad;
	}

	public void setIsPermisoBusquedaUnidad(Boolean isPermisoBusquedaUnidad) {
		this.isPermisoBusquedaUnidad = isPermisoBusquedaUnidad;
	}

	public Boolean getIsPermisoReporteUnidad() {
		return isPermisoReporteUnidad;
	}

	public void setIsPermisoReporteUnidad(Boolean isPermisoReporteUnidad) {
		this.isPermisoReporteUnidad = isPermisoReporteUnidad;
	}
	
	public Boolean getIsPermisoPaginacionMedioUnidad() {
		return isPermisoPaginacionMedioUnidad;
	}

	public void setIsPermisoPaginacionMedioUnidad(Boolean isPermisoPaginacionMedioUnidad) {
		this.isPermisoPaginacionMedioUnidad = isPermisoPaginacionMedioUnidad;
	}
	
	public Boolean getIsPermisoPaginacionTodoUnidad() {
		return isPermisoPaginacionTodoUnidad;
	}

	public void setIsPermisoPaginacionTodoUnidad(Boolean isPermisoPaginacionTodoUnidad) {
		this.isPermisoPaginacionTodoUnidad = isPermisoPaginacionTodoUnidad;
	}
	
	public Boolean getIsPermisoPaginacionAltoUnidad() {
		return isPermisoPaginacionAltoUnidad;
	}

	public void setIsPermisoPaginacionAltoUnidad(Boolean isPermisoPaginacionAltoUnidad) {
		this.isPermisoPaginacionAltoUnidad = isPermisoPaginacionAltoUnidad;
	}
	
	public Boolean getIsPermisoCopiarUnidad() {
		return isPermisoCopiarUnidad;
	}

	public void setIsPermisoCopiarUnidad(Boolean isPermisoCopiarUnidad) {
		this.isPermisoCopiarUnidad = isPermisoCopiarUnidad;
	}
	
	public Boolean getIsPermisoVerFormUnidad() {
		return isPermisoVerFormUnidad;
	}

	public void setIsPermisoVerFormUnidad(Boolean isPermisoVerFormUnidad) {
		this.isPermisoVerFormUnidad = isPermisoVerFormUnidad;
	}
	
	public Boolean getIsPermisoDuplicarUnidad() {
		return isPermisoDuplicarUnidad;
	}

	public void setIsPermisoDuplicarUnidad(Boolean isPermisoDuplicarUnidad) {
		this.isPermisoDuplicarUnidad = isPermisoDuplicarUnidad;
	}
	
	public Boolean getIsPermisoOrdenUnidad() {
		return isPermisoOrdenUnidad;
	}

	public void setIsPermisoOrdenUnidad(Boolean isPermisoOrdenUnidad) {
		this.isPermisoOrdenUnidad = isPermisoOrdenUnidad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoUnidad() {
		return isVisibilidadCeldaNuevoUnidad;
	}

	public void setIsVisibilidadCeldaNuevoUnidad(Boolean isVisibilidadCeldaNuevoUnidad) {
		this.isVisibilidadCeldaNuevoUnidad = isVisibilidadCeldaNuevoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarUnidad() {
		return isVisibilidadCeldaDuplicarUnidad;
	}

	public void setIsVisibilidadCeldaDuplicarUnidad(Boolean isVisibilidadCeldaDuplicarUnidad) {
		this.isVisibilidadCeldaDuplicarUnidad = isVisibilidadCeldaDuplicarUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarUnidad() {
		return isVisibilidadCeldaCopiarUnidad;
	}

	public void setIsVisibilidadCeldaCopiarUnidad(Boolean isVisibilidadCeldaCopiarUnidad) {
		this.isVisibilidadCeldaCopiarUnidad = isVisibilidadCeldaCopiarUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormUnidad() {
		return isVisibilidadCeldaVerFormUnidad;
	}

	public void setIsVisibilidadCeldaVerFormUnidad(Boolean isVisibilidadCeldaVerFormUnidad) {
		this.isVisibilidadCeldaVerFormUnidad = isVisibilidadCeldaVerFormUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenUnidad() {
		return isVisibilidadCeldaOrdenUnidad;
	}

	public void setIsVisibilidadCeldaOrdenUnidad(Boolean isVisibilidadCeldaOrdenUnidad) {
		this.isVisibilidadCeldaOrdenUnidad = isVisibilidadCeldaOrdenUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesUnidad() {
		return isVisibilidadCeldaNuevoRelacionesUnidad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesUnidad(Boolean isVisibilidadCeldaNuevoRelacionesUnidad) {
		this.isVisibilidadCeldaNuevoRelacionesUnidad = isVisibilidadCeldaNuevoRelacionesUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarUnidad() {
		return isVisibilidadCeldaModificarUnidad;
	}

	public void setIsVisibilidadCeldaModificarUnidad(Boolean isVisibilidadCeldaModificarUnidad) {
		this.isVisibilidadCeldaModificarUnidad = isVisibilidadCeldaModificarUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarUnidad() {
		return isVisibilidadCeldaActualizarUnidad;
	}

	public void setIsVisibilidadCeldaActualizarUnidad(Boolean isVisibilidadCeldaActualizarUnidad) {
		this.isVisibilidadCeldaActualizarUnidad = isVisibilidadCeldaActualizarUnidad;
	}

	public Boolean getIsVisibilidadCeldaEliminarUnidad() {
		return isVisibilidadCeldaEliminarUnidad;
	}

	public void setIsVisibilidadCeldaEliminarUnidad(Boolean isVisibilidadCeldaEliminarUnidad) {
		this.isVisibilidadCeldaEliminarUnidad = isVisibilidadCeldaEliminarUnidad;
	}

	public Boolean getIsVisibilidadCeldaCancelarUnidad() {
		return isVisibilidadCeldaCancelarUnidad;
	}

	public void setIsVisibilidadCeldaCancelarUnidad(Boolean isVisibilidadCeldaCancelarUnidad) {
		this.isVisibilidadCeldaCancelarUnidad = isVisibilidadCeldaCancelarUnidad;
	}

	public Boolean getIsVisibilidadCeldaGuardarUnidad() {
		return isVisibilidadCeldaGuardarUnidad;
	}

	public void setIsVisibilidadCeldaGuardarUnidad(Boolean isVisibilidadCeldaGuardarUnidad) {
		this.isVisibilidadCeldaGuardarUnidad = isVisibilidadCeldaGuardarUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosUnidad() {
		return isVisibilidadCeldaGuardarCambiosUnidad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosUnidad(Boolean isVisibilidadCeldaGuardarCambiosUnidad) {
		this.isVisibilidadCeldaGuardarCambiosUnidad = isVisibilidadCeldaGuardarCambiosUnidad;
	}
		
	public UnidadSessionBean getunidadSessionBean() {
		return this.unidadSessionBean;
	}
	
	public void setunidadSessionBean(UnidadSessionBean unidadSessionBean) {
		this.unidadSessionBean=unidadSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadBusquedaPorSiglas() {
		return this.isVisibilidadBusquedaPorSiglas;
	}

	public void setisVisibilidadBusquedaPorSiglas(Boolean isVisibilidadBusquedaPorSiglas) {
		this.isVisibilidadBusquedaPorSiglas=isVisibilidadBusquedaPorSiglas;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoUnidad() {
		return this.isVisibilidadFK_IdTipoUnidad;
	}

	public void setisVisibilidadFK_IdTipoUnidad(Boolean isVisibilidadFK_IdTipoUnidad) {
		this.isVisibilidadFK_IdTipoUnidad=isVisibilidadFK_IdTipoUnidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysUnidad(Unidad unidad)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(unidad,null);
				this.setActualParaGuardarTipoUnidadForeignKey(unidad,null);
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
	
	public void bugActualizarReferenciaActual(Unidad unidad,Unidad unidadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalUnidad(unidad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		unidadAux.setId(unidad.getId());
		unidadAux.setVersionRow(unidad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessUnidad();
		
			int intSelectedRow = this.jTableDatosUnidad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(UnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualUnidad(this.unidad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = unidadValidator.getInvalidValues(this.unidad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			unidadLogic.setDatosCliente(datosCliente);
			unidadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				unidadAux=new  Unidad();
				
				unidadAux.setIsNew(true);
				unidadAux.setIsChanged(true);
				
				unidadAux.setUnidadOriginal(this.unidad);
				
				unidadAux.setId(this.unidad.getId());	
				unidadAux.setVersionRow(this.unidad.getVersionRow());	
				unidadAux.setid_empresa(this.unidad.getid_empresa());	
				unidadAux.setid_tipo_unidad(this.unidad.getid_tipo_unidad());	
				unidadAux.setnombre(this.unidad.getnombre());	
				unidadAux.setsiglas(this.unidad.getsiglas());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.unidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.unidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(unidadAux,unidadLogic.getUnidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(unidadAux,unidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.unidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.unidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						unidadLogic.saveUnidads();//WithConnection
						//unidadLogic.getSetVersionRowUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.unidad,unidadAux);
					
					this.refrescarForeignKeysDescripcionesUnidad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.unidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens().addAll(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvensEliminados);
							this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.getRangoUnidadVentas().addAll(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventasEliminados);
							this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.getValorPorUnidads().addAll(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvens.addAll(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvensEliminados);
							this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventas.addAll(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventasEliminados);
							this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidads.addAll(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								unidadLogic.saveUnidadRelaciones(unidadAux,this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens(),this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.getRangoUnidadVentas(),this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.getValorPorUnidads());//WithConnection
								//unidadLogic.getSetVersionRowUnidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.unidad,unidadAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.setConversionInvens(new ArrayList<ConversionInven>());
							this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.setRangoUnidadVentas(new ArrayList<RangoUnidadVenta>());
							this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.setValorPorUnidads(new ArrayList<ValorPorUnidad>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvens= new ArrayList<ConversionInven>();
							this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventas= new ArrayList<RangoUnidadVenta>();
							this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidads= new ArrayList<ValorPorUnidad>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							unidadAux.setProductos(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();}
							unidadAux.setConversionInvenConversions(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens());

							if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();}
							unidadAux.setRangoUnidadVentas(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.getRangoUnidadVentas());

							if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();}
							unidadAux.setValorPorUnidads(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.getValorPorUnidads());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.unidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.unidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(unidadAux,unidadLogic.getUnidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(unidadAux,unidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.unidad,unidadAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				unidadAux=new  Unidad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.unidadSessionBean.getEsGuardarRelacionado() 
					|| (this.unidadSessionBean.getEsGuardarRelacionado() && this.unidad.getId()>=0)) {
						
					unidadAux.setIsNew(false);
				}
				
				unidadAux.setIsDeleted(false);
			
				unidadAux.setId(this.unidad.getId());	
				unidadAux.setVersionRow(this.unidad.getVersionRow());	
				unidadAux.setid_empresa(this.unidad.getid_empresa());	
				unidadAux.setid_tipo_unidad(this.unidad.getid_tipo_unidad());	
				unidadAux.setnombre(this.unidad.getnombre());	
				unidadAux.setsiglas(this.unidad.getsiglas());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(unidadAux,unidadLogic.getUnidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(unidadAux,unidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.unidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.unidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						unidadLogic.saveUnidads();//WithConnection
						//unidadLogic.getSetVersionRowUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.unidad,unidadAux);
					
					this.refrescarForeignKeysDescripcionesUnidad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.unidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens().addAll(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvensEliminados);
							this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.getRangoUnidadVentas().addAll(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventasEliminados);
							this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.getValorPorUnidads().addAll(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvens.addAll(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvensEliminados);
							this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventas.addAll(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventasEliminados);
							this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidads.addAll(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								unidadLogic.saveUnidadRelaciones(unidadAux,this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens(),this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.getRangoUnidadVentas(),this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.getValorPorUnidads());//WithConnection
								//unidadLogic.getSetVersionRowUnidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.unidad,unidadAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.setConversionInvens(new ArrayList<ConversionInven>());
							this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.setRangoUnidadVentas(new ArrayList<RangoUnidadVenta>());
							this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.setValorPorUnidads(new ArrayList<ValorPorUnidad>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvens= new ArrayList<ConversionInven>();
							this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventas= new ArrayList<RangoUnidadVenta>();
							this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidads= new ArrayList<ValorPorUnidad>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							unidadAux.setProductos(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();}
							unidadAux.setConversionInvenConversions(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens());

							if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();}
							unidadAux.setRangoUnidadVentas(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.getRangoUnidadVentas());

							if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();}
							unidadAux.setValorPorUnidads(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.getValorPorUnidads());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.unidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.unidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(unidadAux,unidadLogic.getUnidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(unidadAux,unidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.unidad,unidadAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				unidadAux=new  Unidad();
				
				unidadAux.setIsNew(false);
				unidadAux.setIsChanged(false);
				
				unidadAux.setIsDeleted(true);
				
				unidadAux.setId(this.unidad.getId());	
				unidadAux.setVersionRow(this.unidad.getVersionRow());	
				unidadAux.setid_empresa(this.unidad.getid_empresa());	
				unidadAux.setid_tipo_unidad(this.unidad.getid_tipo_unidad());	
				unidadAux.setnombre(this.unidad.getnombre());	
				unidadAux.setsiglas(this.unidad.getsiglas());	
				
				if(this.unidadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.unidadAux.getId()>=0) {	
						this.unidadsEliminados.add(unidadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(unidadAux,unidadLogic.getUnidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(unidadAux,unidads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.unidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.unidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						unidadLogic.saveUnidads();//WithConnection
						//unidadLogic.getSetVersionRowUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.unidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.getProductos().addAll(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens().addAll(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvensEliminados);
							this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.getRangoUnidadVentas().addAll(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventasEliminados);
							this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.getValorPorUnidads().addAll(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productos.addAll(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productosEliminados);
							this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvens.addAll(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvensEliminados);
							this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventas.addAll(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventasEliminados);
							this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidads.addAll(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.precioBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jInternalFrameDetalleFormRangoUnidadVenta.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								unidadLogic.saveUnidadRelaciones(unidadAux,this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.getProductos(),this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens(),this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.getRangoUnidadVentas(),this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.getValorPorUnidads());//WithConnection
								//unidadLogic.getSetVersionRowUnidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.setProductos(new ArrayList<Producto>());
							this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.setConversionInvens(new ArrayList<ConversionInven>());
							this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.setRangoUnidadVentas(new ArrayList<RangoUnidadVenta>());
							this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.setValorPorUnidads(new ArrayList<ValorPorUnidad>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productos= new ArrayList<Producto>();
							this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvens= new ArrayList<ConversionInven>();
							this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventas= new ArrayList<RangoUnidadVenta>();
							this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidads= new ArrayList<ValorPorUnidad>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.quitarFilaTotales();}
							unidadAux.setProductos(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.getProductos());

							if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();}
							unidadAux.setConversionInvenConversions(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens());

							if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.quitarFilaTotales();}
							unidadAux.setRangoUnidadVentas(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.getRangoUnidadVentas());

							if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.quitarFilaTotales();}
							unidadAux.setValorPorUnidads(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.getValorPorUnidads());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.unidadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.unidadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(unidadAux,unidadLogic.getUnidads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(unidadAux,unidads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.getUnidads().addAll(this.unidadsEliminados);
					
					unidadLogic.saveUnidads();//WithConnection
					//unidadLogic.getSetVersionRowUnidads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesUnidad();
				
				this.unidadsEliminados= new ArrayList<Unidad>();		
			}
			
			if(this.unidadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.unidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Unidad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Unidad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.unidad=unidadAux;
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
      		//this.finishProcessUnidad();
      	}
		
	}	
	
	public void actualizarRelaciones(Unidad unidadLocal) throws Exception {
		
		if(this.unidadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				unidadLocal.setProductos(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.getProductos());
				unidadLocal.setConversionInvenConversions(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens());
				unidadLocal.setRangoUnidadVentas(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.getRangoUnidadVentas());
				unidadLocal.setValorPorUnidads(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.getValorPorUnidads());
			
			} else {
			
				unidadLocal.setProductos(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productos);
				unidadLocal.setConversionInvenConversions(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvens);
				unidadLocal.setRangoUnidadVentas(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventas);
				unidadLocal.setValorPorUnidads(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidads);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Unidad unidadLocal) throws Exception {	
		if(this.unidadSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				unidadLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoUnidadDetalleFormJInternalFrame.class)) {
				TipoUnidadBeanSwingJInternalFrame tipounidadBeanSwingJInternalFrameLocal=(TipoUnidadBeanSwingJInternalFrame) ((TipoUnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipounidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoUnidad(tipounidadBeanSwingJInternalFrameLocal.gettipounidad(),true);
				tipounidadBeanSwingJInternalFrameLocal.actualizarLista(tipounidadBeanSwingJInternalFrameLocal.tipounidad,this.tipounidadsForeignKey);

				tipounidadBeanSwingJInternalFrameLocal.actualizarRelaciones(tipounidadBeanSwingJInternalFrameLocal.tipounidad);

				unidadLocal.setTipoUnidad(tipounidadBeanSwingJInternalFrameLocal.tipounidad);

				this.addItemDefectoCombosForeignKeyTipoUnidad();
				this.cargarCombosFrameTipoUnidadsForeignKey("Formulario");
				this.setActualTipoUnidadForeignKey(tipounidadBeanSwingJInternalFrameLocal.tipounidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarUnidadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosUnidad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = unidadValidator.getInvalidValues(this.unidad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Unidad unidad,List<Unidad> unidads) throws Exception {
		try	{		
			UnidadConstantesFunciones.actualizarLista(unidad,unidads,this.unidadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Unidad unidad,List<Unidad> unidads) throws Exception {
		try	{			
			UnidadConstantesFunciones.actualizarSelectedLista(unidad,unidads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Unidad> unidadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				unidadsLocal=this.unidadLogic.getUnidads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				unidadsLocal=this.unidads;
			}
			//ARCHITECTURE
		
			for(Unidad unidadLocal:unidadsLocal) {
				if(this.permiteMantenimiento(unidadLocal) && unidadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+UnidadConstantesFunciones.getUnidadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(UnidadConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUnidad.jLabelid_empresaUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UnidadConstantesFunciones.IDTIPOUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUnidad.jLabelid_tipo_unidadUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UnidadConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUnidad.jLabelnombreUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UnidadConstantesFunciones.SIGLAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUnidad.jLabelsiglasUnidad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormUnidad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUnidad.jLabelid_empresaUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUnidad.jLabelid_tipo_unidadUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUnidad.jLabelnombreUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUnidad.jLabelsiglasUnidad,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Producto")) {
			if(this.unidad==null) {
				this.unidad= new Unidad();
			}

			if(this.unidadSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoUnidad
				this.setVariablesFormularioToObjetoActualUnidad(this.unidad,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);

				this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.getproducto().setUnidad(this.unidad);
			}

			return;
		}
		 else  if(sTipo.equals("ConversionInven")) {
			if(this.unidad==null) {
				this.unidad= new Unidad();
			}

			if(this.unidadSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoUnidad
				this.setVariablesFormularioToObjetoActualUnidad(this.unidad,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);

				this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.getconversioninven().setUnidadConversion(this.unidad);
			}

			return;
		}
		 else  if(sTipo.equals("RangoUnidadVenta")) {
			if(this.unidad==null) {
				this.unidad= new Unidad();
			}

			if(this.unidadSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoUnidad
				this.setVariablesFormularioToObjetoActualUnidad(this.unidad,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);

				this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.getrangounidadventa().setUnidad(this.unidad);
			}

			return;
		}
		 else  if(sTipo.equals("ValorPorUnidad")) {
			if(this.unidad==null) {
				this.unidad= new Unidad();
			}

			if(this.unidadSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoUnidad
				this.setVariablesFormularioToObjetoActualUnidad(this.unidad,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);

				this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.getvalorporunidad().setUnidad(this.unidad);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoUnidad--;	
		
		
		this.unidadAux=new Unidad();
		
		this.unidadAux.setId(this.iIdNuevoUnidad);
		this.unidadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.unidadLogic.getUnidads().add(this.unidadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.unidads.add(this.unidadAux);
		}
		//ARCHITECTURE
		
		this.unidad=this.unidadAux;
		
		if(UnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioUnidad(this.unidad);
			this.setVariablesObjetoActualToFormularioForeignKeyUnidad(this.unidad);
		}
				
		//this.setDefaultControlesUnidad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyUnidad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyUnidad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyUnidad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUnidad(this.unidadBean,this.unidad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(UnidadConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.unidadSessionBean.getConGuardarRelaciones()) {
			classes=UnidadConstantesFunciones.getClassesRelationshipsOfUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.unidadReturnGeneral=unidadLogic.procesarEventosUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.unidadLogic.getUnidads(),this.unidad,this.unidadParameterGeneral,this.isEsNuevoUnidad,classes);//this.unidadLogic.getUnidad()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanUnidad(this.unidadReturnGeneral,this.unidadBean,false);
		
		if(this.unidadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyUnidad(this.unidadReturnGeneral.getUnidad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioUnidad(this.unidadReturnGeneral.getUnidad());
		}
		
		if(this.unidadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioUnidad(this.unidadReturnGeneral.getUnidad(),classes);//this.unidadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualUnidad(this.unidad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyUnidad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyUnidad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UnidadBeanSwingJInternalFrameAdditional.RecargarFormUnidad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingUnidad(false);
						
			if(unidadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.getEsGuardarRelacionado() && ConversionInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConversionInvenActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaSessionBean.getEsGuardarRelacionado() && RangoUnidadVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRangoUnidadVentaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadSessionBean.getEsGuardarRelacionado() && ValorPorUnidadJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonValorPorUnidadActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(UnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUnidad();
			}
			
			this.actualizarVisualTableDatosUnidad();
			
			this.jTableDatosUnidad.setRowSelectionInterval(this.getIndiceNuevoUnidad(), this.getIndiceNuevoUnidad());
			
			this.seleccionarFilaTablaUnidadActual();
						
			this.actualizarEstadoCeldasBotonesUnidad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesUnidad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormUnidad.jTextFieldnombreUnidad.setEnabled(isHabilitar && this.unidadConstantesFunciones.activarnombreUnidad);
		this.jInternalFrameDetalleFormUnidad.jTextFieldsiglasUnidad.setEnabled(isHabilitar && this.unidadConstantesFunciones.activarsiglasUnidad);	
		//
		this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad.setEnabled(isHabilitar && this.unidadConstantesFunciones.activarid_empresaUnidad);
		this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad.setEnabled(isHabilitar && this.unidadConstantesFunciones.activarid_tipo_unidadUnidad);
	};
	
	public void setDefaultControlesUnidad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoUnidad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.unidadSessionBean.setConGuardarRelaciones(true);			
			this.unidadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormUnidad.jTabbedPaneRelacionesUnidad.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.unidadSessionBean.setConGuardarRelaciones(false);			
			this.unidadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormUnidad.jTabbedPaneRelacionesUnidad.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoUnidad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Unidad unidadAux:this.unidadLogic.getUnidads()) {
				if(unidadAux.getId().equals(this.iIdNuevoUnidad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Unidad unidadAux:this.unidads) {
				if(unidadAux.getId().equals(this.iIdNuevoUnidad)) {
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
	
	public int getIndiceActualUnidad(Unidad unidad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Unidad unidadAux:this.unidadLogic.getUnidads()) {
				if(unidadAux.getId().equals(unidad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Unidad unidadAux:this.unidads) {
				if(unidadAux.getId().equals(unidad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalUnidad(Unidad unidadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Unidad unidadAux:this.unidadLogic.getUnidads()) {
				if(unidadAux.getUnidadOriginal().getId().equals(unidadOriginal.getId())) {
					existe=true;
					unidadOriginal.setId(unidadAux.getId());
					unidadOriginal.setVersionRow(unidadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Unidad unidadAux:this.unidads) {
				if(unidadAux.getUnidadOriginal().getId().equals(unidadOriginal.getId())) {
					existe=true;
					unidadOriginal.setId(unidadAux.getId());
					unidadOriginal.setVersionRow(unidadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosUnidad(Boolean esParaCancelar) throws Exception {
		unidadsAux=new ArrayList<Unidad>();
		unidadAux=new Unidad();
		
		if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Unidad unidadAux:this.unidadLogic.getUnidads()) {
					if(unidadAux.getId()<0) {
						unidadsAux.add(unidadAux);
					}		
				}
				this.iIdNuevoUnidad=0L;
				this.unidadLogic.getUnidads().removeAll(unidadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Unidad unidadAux:this.unidads) {
					if(unidadAux.getId()<0) {
						unidadsAux.add(unidadAux);
					}		
				}
				this.iIdNuevoUnidad=0L;
				this.unidads.removeAll(unidadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoUnidad 
					&& this.unidadLogic.getUnidads().size()>0
					) {
					unidadAux=this.unidadLogic.getUnidads().get(this.unidadLogic.getUnidads().size() - 1);
				
					if(unidadAux.getId()<0) {
						this.unidadLogic.getUnidads().remove(unidadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoUnidad && this.unidads.size()>0) {
					unidadAux=this.unidads.get(this.unidads.size() - 1);
				
					if(unidadAux.getId()<0) {
						this.unidads.remove(unidadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoUnidad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(unidad.getId()<0) {
				this.unidadLogic.getUnidads().remove(this.unidad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(unidad.getId()<0) {
				this.unidads.remove(this.unidad);
			}
		}			
	}
	
	public void setEstadosInicialesUnidad(List<Unidad> unidadsAux) throws Exception {
		UnidadConstantesFunciones.setEstadosInicialesUnidad(unidadsAux);
	}
	
	public void setEstadosInicialesUnidad(Unidad unidadAux) throws Exception {
		UnidadConstantesFunciones.setEstadosInicialesUnidad(unidadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarUnidadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarUnidadActual()) {
				if(!this.isEsNuevoUnidad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoUnidad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarUnidadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Unidad ?", "MANTENIMIENTO DE Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Unidad unidad) throws Exception {
		UnidadConstantesFunciones.seleccionarAsignar(this.unidad,unidad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarUnidad=this.isPermisoActualizarOriginalUnidad;
			
			
			this.seleccionarAsignar(unidad);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UnidadConstantesFunciones.quitarEspaciosUnidad(this.unidad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.unidadSessionBean.setsFuncionBusquedaRapida(this.unidadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoUnidad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosUnidad(esParaCancelar);				
				this.cancelarNuevoUnidad(esParaCancelar);								
			}
			
			this.unidad=new Unidad();
			
			this.inicializarUnidad();
			
			this.actualizarEstadoCeldasBotonesUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarUnidad() throws Exception {
		try {
			UnidadConstantesFunciones.inicializarUnidad(this.unidad);
			
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
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.unidadLogic.getUnidads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteUnidads(String sAccionBusqueda,List<Unidad> unidadsParaReportes) throws Exception {
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
					sPathReporteFinal="Unidad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="UnidadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("UnidadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Unidad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Unidades");		
		parameters.put("busquedapor", UnidadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Producto.class));
			classes.add(new Classe(ConversionInven.class));
			classes.add(new Classe(RangoUnidadVenta.class));
			classes.add(new Classe(ValorPorUnidad.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					UnidadLogic unidadLogicAuxiliar=new UnidadLogic();
					unidadLogicAuxiliar.setDatosCliente(unidadLogic.getDatosCliente());				
					unidadLogicAuxiliar.setUnidads(unidadsParaReportes);
					
					unidadLogicAuxiliar.cargarRelacionesLoteForeignKeyUnidadWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					unidadsParaReportes=unidadLogicAuxiliar.getUnidads();
					
					//unidadLogic.getNewConnexionToDeep();
					
					//for (Unidad unidad:unidadsParaReportes) {
					//	unidadLogic.deepLoad(unidad, false, DeepLoadType.INCLUDE, classes);
					//}						
					//unidadLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//unidadLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileProducto = AuxiliarReportes.class.getResourceAsStream("ProductoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_producto", reportFileProducto);

			InputStream reportFileConversionInven = AuxiliarReportes.class.getResourceAsStream("ConversionInvenDetalleRelacionesDesign.jasper");
			parameters.put("subreport_conversioninven", reportFileConversionInven);

			InputStream reportFileRangoUnidadVenta = AuxiliarReportes.class.getResourceAsStream("RangoUnidadVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_rangounidadventa", reportFileRangoUnidadVenta);

			InputStream reportFileValorPorUnidad = AuxiliarReportes.class.getResourceAsStream("ValorPorUnidadDetalleRelacionesDesign.jasper");
			parameters.put("subreport_valorporunidad", reportFileValorPorUnidad);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceUnidad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			UnidadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			UnidadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceUnidad=new JRBeanArrayDataSource(UnidadJInternalFrame.TraerUnidadBeans(unidadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceUnidad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+UnidadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+UnidadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(UnidadBean.TraerUnidadBeans(unidadsParaReportes).toArray()));
							
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
				this.generarExcelReporteUnidads(sAccionBusqueda,sTipoArchivoReporte,unidadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalUnidads(sAccionBusqueda,sTipoArchivoReporte,unidadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoUnidadActionPerformed(null);
					//this.generarExcelReporteUnidads(sAccionBusqueda,sTipoArchivoReporte,unidadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalUnidads(sAccionBusqueda,sTipoArchivoReporte,unidadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesUnidads(sAccionBusqueda,sTipoArchivoReporte,unidadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesUnidads(sAccionBusqueda,sTipoArchivoReporte,unidadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<Unidad> unidadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"unidad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Unidads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUnidad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Unidad unidad : unidadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			UnidadConstantesFunciones.generarExcelReporteDataUnidad("NORMAL",row,workbook,unidad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.unidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderUnidad(String sTipo,Row row,Workbook workbook) {
		
		UnidadConstantesFunciones.generarExcelReporteHeaderUnidad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<Unidad> unidadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"unidad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Unidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Unidad unidad : unidadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(UnidadConstantesFunciones.getUnidadDescripcion(unidad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UnidadConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UnidadConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(unidad.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(unidad.gettipounidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UnidadConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UnidadConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(unidad.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UnidadConstantesFunciones.LABEL_SIGLAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UnidadConstantesFunciones.LABEL_SIGLAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(unidad.getsiglas());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.unidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<Unidad> unidadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Unidad> unidadsRespaldo=null;
		
		classes=UnidadConstantesFunciones.getClassesRelationshipsOfUnidad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.unidadLogic.setDatosCliente(this.datosCliente);
		this.unidadLogic.setDatosDeep(this.datosDeep);
		this.unidadLogic.setIsConDeep(true);
		
		unidadsRespaldo=this.unidadLogic.getUnidads();
		
		this.unidadLogic.setUnidads(unidadsParaReportes);	
		this.unidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		unidadsParaReportes=this.unidadLogic.getUnidads();
		this.unidadLogic.setUnidads(unidadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"unidad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Unidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUnidad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Unidad unidad : unidadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderUnidad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			UnidadConstantesFunciones.generarExcelReporteDataUnidad("NORMAL",row,workbook,unidad,cellStyleDataAux);
		
			
			


				//Producto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoConstantesFunciones.SCLASSWEBTITULO))) {

				if(unidad.getProductos()!=null && unidad.getProductos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoConstantesFunciones.generarExcelReporteHeaderProducto("RELACIONADO",row,workbook);
				}

				if(unidad.getProductos()!=null) {
					i2=0;
					for(Producto producto : unidad.getProductos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoConstantesFunciones.generarExcelReporteDataProducto("RELACIONADO",row,workbook,producto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ConversionInven
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ConversionInvenConstantesFunciones.SCLASSWEBTITULO))) {

				if(unidad.getConversionInvenConversions()!=null && unidad.getConversionInvenConversions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ConversionInvenConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ConversionInvenConstantesFunciones.generarExcelReporteHeaderConversionInven("RELACIONADO",row,workbook);
				}

				if(unidad.getConversionInvenConversions()!=null) {
					i2=0;
					for(ConversionInven conversioninven : unidad.getConversionInvenConversions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ConversionInvenConstantesFunciones.generarExcelReporteDataConversionInven("RELACIONADO",row,workbook,conversioninven,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//RangoUnidadVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(unidad.getRangoUnidadVentas()!=null && unidad.getRangoUnidadVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					RangoUnidadVentaConstantesFunciones.generarExcelReporteHeaderRangoUnidadVenta("RELACIONADO",row,workbook);
				}

				if(unidad.getRangoUnidadVentas()!=null) {
					i2=0;
					for(RangoUnidadVenta rangounidadventa : unidad.getRangoUnidadVentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						RangoUnidadVentaConstantesFunciones.generarExcelReporteDataRangoUnidadVenta("RELACIONADO",row,workbook,rangounidadventa,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ValorPorUnidad
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO))) {

				if(unidad.getValorPorUnidads()!=null && unidad.getValorPorUnidads().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ValorPorUnidadConstantesFunciones.generarExcelReporteHeaderValorPorUnidad("RELACIONADO",row,workbook);
				}

				if(unidad.getValorPorUnidads()!=null) {
					i2=0;
					for(ValorPorUnidad valorporunidad : unidad.getValorPorUnidads()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ValorPorUnidadConstantesFunciones.generarExcelReporteDataValorPorUnidad("RELACIONADO",row,workbook,valorporunidad,cellStyleDataAuxHijo);
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
		cell.setCellValue(UnidadConstantesFunciones.getUnidadDescripcion(unidad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.unidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoUnidad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUnidad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessUnidad() throws Exception {		
		this.startProcessUnidad(true);
	}
	
	public void startProcessUnidad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasUnidad ,this.jPanelParametrosReportesUnidad, this.jScrollPanelDatosUnidad,this.jPanelPaginacionUnidad, this.jScrollPanelDatosEdicionUnidad, this.jPanelAccionesUnidad,this.jPanelAccionesFormularioUnidad,this.jmenuBarUnidad,this.jmenuBarDetalleUnidad,this.jTtoolBarUnidad,this.jTtoolBarDetalleUnidad);		
		
		final JTabbedPane jTabbedPaneBusquedasUnidad=this.jTabbedPaneBusquedasUnidad; 
		
		final JPanel jPanelParametrosReportesUnidad=this.jPanelParametrosReportesUnidad;
		//final JScrollPane jScrollPanelDatosUnidad=this.jScrollPanelDatosUnidad;
		final JTable jTableDatosUnidad=this.jTableDatosUnidad;		
		final JPanel jPanelPaginacionUnidad=this.jPanelPaginacionUnidad;
		//final JScrollPane jScrollPanelDatosEdicionUnidad=this.jScrollPanelDatosEdicionUnidad;
		final JPanel jPanelAccionesUnidad=this.jPanelAccionesUnidad;
		
		JPanel jPanelCamposAuxiliarUnidad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarUnidad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormUnidad!=null) {
			jPanelCamposAuxiliarUnidad=this.jInternalFrameDetalleFormUnidad.jPanelCamposUnidad;
			jPanelAccionesFormularioAuxiliarUnidad=this.jInternalFrameDetalleFormUnidad.jPanelAccionesFormularioUnidad;
		}
		
		final JPanel jPanelCamposUnidad=jPanelCamposAuxiliarUnidad;
		final JPanel jPanelAccionesFormularioUnidad=jPanelAccionesFormularioAuxiliarUnidad;
		
		
		final JMenuBar jmenuBarUnidad=this.jmenuBarUnidad;
		final JToolBar jTtoolBarUnidad=this.jTtoolBarUnidad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarUnidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUnidad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormUnidad!=null) {
			jmenuBarDetalleAuxiliarUnidad=this.jInternalFrameDetalleFormUnidad.jmenuBarDetalleUnidad;
			jTtoolBarDetalleAuxiliarUnidad=this.jInternalFrameDetalleFormUnidad.jTtoolBarDetalleUnidad;
		}
		
		final JMenuBar jmenuBarDetalleUnidad=jmenuBarDetalleAuxiliarUnidad;
		final JToolBar jTtoolBarDetalleUnidad=jTtoolBarDetalleAuxiliarUnidad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUnidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUnidad;
			processRunnable.jTableDatos=jTableDatosUnidad;
			processRunnable.jPanelCampos=jPanelCamposUnidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionUnidad;
			processRunnable.jPanelAcciones=jPanelAccionesUnidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUnidad;
			
			
			processRunnable.jmenuBar=jmenuBarUnidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUnidad;
			processRunnable.jTtoolBar=jTtoolBarUnidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUnidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUnidad ,jPanelParametrosReportesUnidad,jTableDatosUnidad, /*jScrollPanelDatosUnidad,*/jPanelCamposUnidad,jPanelPaginacionUnidad, /*jScrollPanelDatosEdicionUnidad,*/ jPanelAccionesUnidad,jPanelAccionesFormularioUnidad,jmenuBarUnidad,jmenuBarDetalleUnidad,jTtoolBarUnidad,jTtoolBarDetalleUnidad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUnidad ,jPanelParametrosReportesUnidad, jScrollPanelDatosUnidad,jPanelPaginacionUnidad, jScrollPanelDatosEdicionUnidad, jPanelAccionesUnidad,jPanelAccionesFormularioUnidad,jmenuBarUnidad,jmenuBarDetalleUnidad,jTtoolBarUnidad,jTtoolBarDetalleUnidad);
						
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
	
	public void finishProcessUnidad() {// throws Exception 
		this.finishProcessUnidad(true);
	}
	
	public void finishProcessUnidad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasUnidad ,this.jPanelParametrosReportesUnidad, this.jScrollPanelDatosUnidad,this.jPanelPaginacionUnidad, this.jScrollPanelDatosEdicionUnidad, this.jPanelAccionesUnidad,this.jPanelAccionesFormularioUnidad,this.jmenuBarUnidad,this.jmenuBarDetalleUnidad,this.jTtoolBarUnidad,this.jTtoolBarDetalleUnidad);		
		
		final JTabbedPane jTabbedPaneBusquedasUnidad=this.jTabbedPaneBusquedasUnidad; 
		
		final JPanel jPanelParametrosReportesUnidad=this.jPanelParametrosReportesUnidad;
		//final JScrollPane jScrollPanelDatosUnidad=this.jScrollPanelDatosUnidad;
		final JTable jTableDatosUnidad=this.jTableDatosUnidad;		
		final JPanel jPanelPaginacionUnidad=this.jPanelPaginacionUnidad;
		//final JScrollPane jScrollPanelDatosEdicionUnidad=this.jScrollPanelDatosEdicionUnidad;
		final JPanel jPanelAccionesUnidad=this.jPanelAccionesUnidad;
		
		JPanel jPanelCamposAuxiliarUnidad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarUnidad=new JPanel();
		
		if(this.jInternalFrameDetalleFormUnidad!=null) {
			jPanelCamposAuxiliarUnidad=this.jInternalFrameDetalleFormUnidad.jPanelCamposUnidad;
			jPanelAccionesFormularioAuxiliarUnidad=this.jInternalFrameDetalleFormUnidad.jPanelAccionesFormularioUnidad;
		}
		
		final JPanel jPanelCamposUnidad=jPanelCamposAuxiliarUnidad;
		final JPanel jPanelAccionesFormularioUnidad=jPanelAccionesFormularioAuxiliarUnidad;
		
		
		final JMenuBar jmenuBarUnidad=this.jmenuBarUnidad;		
		final JToolBar jTtoolBarUnidad=this.jTtoolBarUnidad;
				
		JMenuBar jmenuBarDetalleAuxiliarUnidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUnidad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormUnidad!=null) {
			jmenuBarDetalleAuxiliarUnidad=this.jInternalFrameDetalleFormUnidad.jmenuBarDetalleUnidad;
			jTtoolBarDetalleAuxiliarUnidad=this.jInternalFrameDetalleFormUnidad.jTtoolBarDetalleUnidad;		
		}
		
		final JMenuBar jmenuBarDetalleUnidad=jmenuBarDetalleAuxiliarUnidad;
		final JToolBar jTtoolBarDetalleUnidad=jTtoolBarDetalleAuxiliarUnidad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUnidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUnidad;
			processRunnable.jTableDatos=jTableDatosUnidad;
			processRunnable.jPanelCampos=jPanelCamposUnidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionUnidad;
			processRunnable.jPanelAcciones=jPanelAccionesUnidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUnidad;
			
			
			processRunnable.jmenuBar=jmenuBarUnidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUnidad;
			processRunnable.jTtoolBar=jTtoolBarUnidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUnidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasUnidad ,jPanelParametrosReportesUnidad, jTableDatosUnidad,/*jScrollPanelDatosUnidad,*/jPanelCamposUnidad,jPanelPaginacionUnidad, /*jScrollPanelDatosEdicionUnidad,*/ jPanelAccionesUnidad,jPanelAccionesFormularioUnidad,jmenuBarUnidad,jmenuBarDetalleUnidad,jTtoolBarUnidad,jTtoolBarDetalleUnidad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesUnidad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarUnidad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuUnidad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarUnidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarUnidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleUnidad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuUnidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarUnidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleUnidad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.unidadConstantesFunciones.getsFinalQueryUnidad();
		String  finalQueryPaginacionTodos=this.unidadConstantesFunciones.getsFinalQueryUnidad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=UnidadConstantesFunciones.getArrayColumnasGlobalesNoUnidad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.unidadsEliminados= new ArrayList<Unidad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessUnidad();
		
				///*UnidadSessionBean*/this.unidadSessionBean=new UnidadSessionBean();
			
			if(this.unidadSessionBean==null) {
				this.unidadSessionBean=new UnidadSessionBean();
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
					this.iNumeroPaginacion=UnidadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=UnidadConstantesFunciones.getClassesForeignKeysOfUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/unidad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			unidadsAux= new ArrayList<Unidad>();
			
				
			unidadLogic.setDatosCliente(this.datosCliente);
			unidadLogic.setDatosDeep(this.datosDeep);
			unidadLogic.setIsConDeep(true);
			
			
			unidadLogic.getUnidadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					unidadLogic.getTodosUnidads(finalQueryGlobal,pagination);
					
					//unidadLogic.getTodosUnidadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(unidadLogic.getUnidads()==null|| unidadLogic.getUnidads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							unidadsAux= new ArrayList<Unidad>();
							unidadsAux.addAll(unidadLogic.getUnidads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							unidadsAux= new ArrayList<Unidad>();
							unidadsAux.addAll(unidads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							unidadLogic.getTodosUnidads(finalQueryGlobal+"",this.pagination);												
							
							//unidadLogic.getTodosUnidadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteUnidads("Todos",unidadLogic.getUnidads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							unidadLogic.setUnidads(new ArrayList<Unidad>());					
							unidadLogic.getUnidads().addAll(unidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							unidads=new ArrayList<Unidad>();
							unidads.addAll(unidadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idUnidad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idUnidad=this.idActual;
				
				} else if(this.idUnidadActual!=null && this.idUnidadActual!=0L) {
					idUnidad=idUnidadActual;
				}
				
					
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndicePorId(idUnidad);
				
				this.unidads=new ArrayList<Unidad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					unidadLogic.getEntity(idUnidad);
					
					//unidadLogic.getEntityWithConnection(idUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.setUnidads(new ArrayList<Unidad>());
					unidadLogic.getUnidads().add(unidadLogic.getUnidad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.unidads=new ArrayList<Unidad>();
					this.unidads.add(unidad);
				}
				
				if(unidadLogic.getUnidad()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					unidadLogic.getUnidadsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=unidadLogic.getUnidads()==null||unidadLogic.getUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=unidads==null|| unidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						unidadsAux=new ArrayList<Unidad>();
						unidadsAux.addAll(unidadLogic.getUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							unidadsAux=new ArrayList<Unidad>();
							unidadsAux.addAll(unidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							unidadLogic.getUnidadsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUnidads("BusquedaPorNombre",unidadLogic.getUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUnidads("BusquedaPorNombre",unidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						unidadLogic.setUnidads(new ArrayList<Unidad>());
						unidadLogic.getUnidads().addAll(unidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							unidads=new ArrayList<Unidad>();
							unidads.addAll(unidadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorSiglas")) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					unidadLogic.getUnidadsBusquedaPorSiglas(finalQueryGlobal,pagination,siglasBusquedaPorSiglas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=unidadLogic.getUnidads()==null||unidadLogic.getUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=unidads==null|| unidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						unidadsAux=new ArrayList<Unidad>();
						unidadsAux.addAll(unidadLogic.getUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							unidadsAux=new ArrayList<Unidad>();
							unidadsAux.addAll(unidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							unidadLogic.getUnidadsBusquedaPorSiglas(finalQueryGlobal,pagination,siglasBusquedaPorSiglas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUnidads("BusquedaPorSiglas",unidadLogic.getUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUnidads("BusquedaPorSiglas",unidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						unidadLogic.setUnidads(new ArrayList<Unidad>());
						unidadLogic.getUnidads().addAll(unidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							unidads=new ArrayList<Unidad>();
							unidads.addAll(unidadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					unidadLogic.getUnidadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=unidadLogic.getUnidads()==null||unidadLogic.getUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=unidads==null|| unidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						unidadsAux=new ArrayList<Unidad>();
						unidadsAux.addAll(unidadLogic.getUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							unidadsAux=new ArrayList<Unidad>();
							unidadsAux.addAll(unidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							unidadLogic.getUnidadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUnidads("FK_IdEmpresa",unidadLogic.getUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUnidads("FK_IdEmpresa",unidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						unidadLogic.setUnidads(new ArrayList<Unidad>());
						unidadLogic.getUnidads().addAll(unidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							unidads=new ArrayList<Unidad>();
							unidads.addAll(unidadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoUnidad")) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceFK_IdTipoUnidad(id_tipo_unidadFK_IdTipoUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					unidadLogic.getUnidadsFK_IdTipoUnidad(finalQueryGlobal,pagination,id_tipo_unidadFK_IdTipoUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceFK_IdTipoUnidad(id_tipo_unidadFK_IdTipoUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceFK_IdTipoUnidad(id_tipo_unidadFK_IdTipoUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=unidadLogic.getUnidads()==null||unidadLogic.getUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=unidads==null|| unidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						unidadsAux=new ArrayList<Unidad>();
						unidadsAux.addAll(unidadLogic.getUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							unidadsAux=new ArrayList<Unidad>();
							unidadsAux.addAll(unidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							unidadLogic.getUnidadsFK_IdTipoUnidad(finalQueryGlobal,pagination,id_tipo_unidadFK_IdTipoUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceFK_IdTipoUnidad(id_tipo_unidadFK_IdTipoUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UnidadConstantesFunciones.getDetalleIndiceFK_IdTipoUnidad(id_tipo_unidadFK_IdTipoUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUnidads("FK_IdTipoUnidad",unidadLogic.getUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUnidads("FK_IdTipoUnidad",unidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						unidadLogic.setUnidads(new ArrayList<Unidad>());
						unidadLogic.getUnidads().addAll(unidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							unidads=new ArrayList<Unidad>();
							unidads.addAll(unidadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesUnidad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessUnidad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=unidadLogic.getUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=unidads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=unidadLogic.getUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=unidads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Unidad unidad) {
		Boolean permite=true;
		
		if(this.unidad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=UnidadConstantesFunciones.getOrderByListaUnidad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=UnidadConstantesFunciones.getOrderByListaUnidad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Unidad unidad:unidadLogic.getUnidads()) {
				if(unidad.getsType().equals(Constantes2.S_TOTALES)) {
					unidadTotales=unidad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Unidad unidad:this.unidads) {
				if(unidad.getsType().equals(Constantes2.S_TOTALES)) {
					unidadTotales=unidad;
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
			this.unidadAux=new Unidad();
			this.unidadAux.setsType(Constantes2.S_TOTALES);
			this.unidadAux.setIsNew(false);
			this.unidadAux.setIsChanged(false);
			this.unidadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				UnidadConstantesFunciones.TotalizarValoresFilaUnidad(this.unidadLogic.getUnidads(),this.unidadAux);
				
				this.unidadLogic.getUnidads().add(this.unidadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				UnidadConstantesFunciones.TotalizarValoresFilaUnidad(this.unidads,this.unidadAux);
				
				this.unidads.add(this.unidadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		unidadTotales=new Unidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.unidadLogic.getUnidads().remove(unidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.unidads.remove(unidadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		unidadTotales=new Unidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Unidad unidad:unidadLogic.getUnidads()) {
				if(unidad.getsType().equals(Constantes2.S_TOTALES)) {
					unidadTotales=unidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UnidadConstantesFunciones.TotalizarValoresFilaUnidad(this.unidadLogic.getUnidads(),unidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Unidad unidad:this.unidads) {
				if(unidad.getsType().equals(Constantes2.S_TOTALES)) {
					unidadTotales=unidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UnidadConstantesFunciones.TotalizarValoresFilaUnidad(this.unidads,unidadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getUnidadsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUnidadsBusquedaPorSiglas()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorSiglas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUnidadsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUnidadsFK_IdTipoUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUnidadPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getUnidadsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getUnidadsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUnidadsBusquedaPorSiglas(String sFinalQuery,String siglas)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getUnidadsBusquedaPorSiglas(sFinalQuery,this.pagination,siglas);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUnidadsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getUnidadsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUnidadsFK_IdTipoUnidad(String sFinalQuery,Long id_tipo_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getUnidadsFK_IdTipoUnidad(sFinalQuery,this.pagination,id_tipo_unidad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUnidadPorNombre(Long id_empresa,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getUnidadPorNombre(id_empresa,nombre);
				
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
	
	public void inicializarPermisosUnidad() {
		this.isPermisoTodoUnidad=false;
		this.isPermisoNuevoUnidad=false;
		this.isPermisoActualizarUnidad=false;
		this.isPermisoActualizarOriginalUnidad=false;
		this.isPermisoEliminarUnidad=false;
		this.isPermisoGuardarCambiosUnidad=false;
		this.isPermisoConsultaUnidad=false;
		this.isPermisoBusquedaUnidad=false;
		this.isPermisoReporteUnidad=false;		
		this.isPermisoOrdenUnidad=false;		
		this.isPermisoPaginacionMedioUnidad=false;		
		this.isPermisoPaginacionAltoUnidad=false;
		this.isPermisoPaginacionTodoUnidad=false;
		this.isPermisoCopiarUnidad=false;		
		this.isPermisoVerFormUnidad=false;		
		this.isPermisoDuplicarUnidad=false;		
		this.isPermisoOrdenUnidad=false;		
	}
	
	public void setPermisosUsuarioUnidad(Boolean isPermiso) {
		this.isPermisoTodoUnidad=isPermiso;
		this.isPermisoNuevoUnidad=isPermiso;
		this.isPermisoActualizarUnidad=isPermiso;
		this.isPermisoActualizarOriginalUnidad=isPermiso;
		this.isPermisoEliminarUnidad=isPermiso;
		this.isPermisoGuardarCambiosUnidad=isPermiso;
		this.isPermisoConsultaUnidad=isPermiso;
		this.isPermisoBusquedaUnidad=isPermiso;
		this.isPermisoReporteUnidad=isPermiso;
		this.isPermisoOrdenUnidad=isPermiso;		
		this.isPermisoPaginacionMedioUnidad=isPermiso;		
		this.isPermisoPaginacionAltoUnidad=isPermiso;		
		this.isPermisoPaginacionTodoUnidad=isPermiso;		
		this.isPermisoCopiarUnidad=isPermiso;		
		this.isPermisoVerFormUnidad=isPermiso;		
		this.isPermisoDuplicarUnidad=isPermiso;
		this.isPermisoOrdenUnidad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioUnidad(Boolean isPermiso) {
		//this.isPermisoTodoUnidad=isPermiso;
		this.isPermisoNuevoUnidad=isPermiso;
		this.isPermisoActualizarUnidad=isPermiso;
		this.isPermisoActualizarOriginalUnidad=isPermiso;
		this.isPermisoEliminarUnidad=isPermiso;
		this.isPermisoGuardarCambiosUnidad=isPermiso;
		//this.isPermisoConsultaUnidad=isPermiso;
		//this.isPermisoBusquedaUnidad=isPermiso;
		//this.isPermisoReporteUnidad=isPermiso;
		//this.isPermisoOrdenUnidad=isPermiso;		
		//this.isPermisoPaginacionMedioUnidad=isPermiso;		
		//this.isPermisoPaginacionAltoUnidad=isPermiso;		
		//this.isPermisoPaginacionTodoUnidad=isPermiso;		
		//this.isPermisoCopiarUnidad=isPermiso;		
		//this.isPermisoDuplicarUnidad=isPermiso;
		//this.isPermisoOrdenUnidad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioUnidadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ConversionInvenConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(RangoUnidadVentaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ValorPorUnidadConstantesFunciones.SNOMBREOPCION);
		
		if(UnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosProducto=false;
		this.isTienePermisosProducto=this.verificarGetPermisosUsuarioOpcionUnidadClaseRelacionada(this.opcionsRelacionadas,ProductoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosConversionInven=false;
		this.isTienePermisosConversionInven=this.verificarGetPermisosUsuarioOpcionUnidadClaseRelacionada(this.opcionsRelacionadas,ConversionInvenConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosRangoUnidadVenta=false;
		this.isTienePermisosRangoUnidadVenta=this.verificarGetPermisosUsuarioOpcionUnidadClaseRelacionada(this.opcionsRelacionadas,RangoUnidadVentaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosValorPorUnidad=false;
		this.isTienePermisosValorPorUnidad=this.verificarGetPermisosUsuarioOpcionUnidadClaseRelacionada(this.opcionsRelacionadas,ValorPorUnidadConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebUnidad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioUnidadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProducto=conPermiso;
		this.isTienePermisosConversionInven=conPermiso;
		this.isTienePermisosRangoUnidadVenta=conPermiso;
		this.isTienePermisosValorPorUnidad=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioUnidadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionUnidadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioUnidadClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProducto && this.jInternalFrameDetalleFormUnidad!=null && this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormUnidad.jTabbedPaneRelacionesUnidad.remove(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosConversionInven && this.jInternalFrameDetalleFormUnidad!=null && this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormUnidad.jTabbedPaneRelacionesUnidad.remove(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosRangoUnidadVenta && this.jInternalFrameDetalleFormUnidad!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormUnidad.jTabbedPaneRelacionesUnidad.remove(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosValorPorUnidad && this.jInternalFrameDetalleFormUnidad!=null && this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormUnidad.jTabbedPaneRelacionesUnidad.remove(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioUnidad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(UnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.unidadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, UnidadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoUnidad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarUnidad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalUnidad=this.isPermisoActualizarUnidad;
			this.isPermisoEliminarUnidad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosUnidad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaUnidad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaUnidad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoUnidad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteUnidad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUnidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioUnidad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoUnidad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoUnidad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarUnidad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormUnidad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarUnidad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUnidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.unidadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosUnidad.setToolTipText(this.jTableDatosUnidad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioUnidad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioUnidad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(UnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(UnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioUnidad() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProducto && this.unidadConstantesFunciones.mostrarProductoUnidad && !UnidadConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Producto");
			reporte.setsDescripcion("Producto");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosConversionInven && this.unidadConstantesFunciones.mostrarConversionInvenUnidad && !UnidadConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Conversion Inven");
			reporte.setsDescripcion("Conversion Inven");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosRangoUnidadVenta && this.unidadConstantesFunciones.mostrarRangoUnidadVentaUnidad && !UnidadConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Rango Unidad Venta");
			reporte.setsDescripcion("Rango Unidad Venta");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosValorPorUnidad && this.unidadConstantesFunciones.mostrarValorPorUnidadUnidad && !UnidadConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Valor Por Unidad");
			reporte.setsDescripcion("Valor Por Unidad");
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
	public void inicializarCombosForeignKeyUnidadListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipounidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyUnidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(UnidadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyUnidadListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoUnidadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipounidadsForeignKey==null||this.tipounidadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoUnidadConstantesFunciones.getArrayColumnasGlobalesTipoUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoUnidadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoUnidadConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoUnidadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyUnidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			UnidadParameterReturnGeneral unidadReturnGeneral=new UnidadParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.unidadConstantesFunciones.cargarid_empresaUnidad)
					 || (this.esRecargarFks && this.unidadConstantesFunciones.cargarid_empresaUnidad)) {

					if(!this.unidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+unidadSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoUnidad="";

				if(((this.tipounidadsForeignKey==null||this.tipounidadsForeignKey.size()<=0) && this.unidadConstantesFunciones.cargarid_tipo_unidadUnidad)
					 || (this.esRecargarFks && this.unidadConstantesFunciones.cargarid_tipo_unidadUnidad)) {

					if(!this.unidadSessionBean.getisBusquedaDesdeForeignKeySesionTipoUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoUnidadConstantesFunciones.getArrayColumnasGlobalesTipoUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoUnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoUnidad, "");
						finalQueryGlobalTipoUnidad+=TipoUnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoUnidad=" WHERE " + ConstantesSql.ID + "="+unidadSessionBean.getlidTipoUnidadActual();
					}
				} else {
					finalQueryGlobalTipoUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				unidadReturnGeneral=unidadLogic.cargarCombosLoteForeignKeyUnidad(finalQueryGlobalEmpresa,finalQueryGlobalTipoUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=unidadReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoUnidad.equals("NONE")) {
				this.tipounidadsForeignKey=unidadReturnGeneral.gettipounidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyUnidad()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.unidadSessionBean==null) {
				this.unidadSessionBean=new UnidadSessionBean();
			}

			if(!this.unidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoUnidad()throws Exception {
		try {

			if(!this.unidadSessionBean.getisBusquedaDesdeForeignKeySesionTipoUnidad()) {
				TipoUnidad tipounidad=new TipoUnidad();
				TipoUnidadConstantesFunciones.setTipoUnidadDescripcion(tipounidad,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipounidad.setId(null);

				if(!TipoUnidadConstantesFunciones.ExisteEnLista(this.tipounidadsForeignKey,tipounidad,true)) {

					this.tipounidadsForeignKey.add(0,tipounidad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyUnidad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyUnidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyUnidad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyUnidad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyUnidad(Unidad unidad)throws Exception {	
		try {
			
			this.setActualTipoUnidadForeignKey(unidad.getid_tipo_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyUnidad(Unidad unidad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyUnidad()throws Exception {	
		try {
			
			this.setActualTipoUnidadForeignKey(this.unidadConstantesFunciones.getid_tipo_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyUnidad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyUnidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyUnidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroUnidad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyUnidad()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyUnidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad!=null && this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad!=null && this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public UnidadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public UnidadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public UnidadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.unidadSessionBean=new UnidadSessionBean(); 
		this.unidadConstantesFunciones=new UnidadConstantesFunciones(); 
		this.unidadBean=new Unidad();//(this.unidadConstantesFunciones); 		
		this.unidadReturnGeneral=new UnidadParameterReturnGeneral(); 
		
		this.unidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.unidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public UnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public UnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public UnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessUnidad(true);
			
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
			
			this.unidadConstantesFunciones=new UnidadConstantesFunciones(); 
			this.unidadBean=new Unidad();//this.unidadConstantesFunciones); 			
			this.unidadReturnGeneral=new UnidadParameterReturnGeneral(); 
		
			UnidadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Unidad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.unidad=new Unidad();
			this.unidads = new ArrayList<Unidad>();
			this.unidadsAux = new ArrayList<Unidad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic=new UnidadLogic();
				this.unidadLogic.getNewConnexionToDeep("");
			}
			
			//this.unidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.unidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormUnidad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUnidad);	
					}
					
					if(this.jInternalFrameImportacionUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUnidad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByUnidad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormUnidad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormUnidad);
				this.jInternalFrameDetalleFormUnidad.setVisible(false);
				this.jInternalFrameDetalleFormUnidad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUnidad);
					this.jInternalFrameReporteDinamicoUnidad.setVisible(false);
					this.jInternalFrameReporteDinamicoUnidad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionUnidad);
					this.jInternalFrameImportacionUnidad.setVisible(false);
					this.jInternalFrameImportacionUnidad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByUnidad);
					this.jInternalFrameOrderByUnidad.setVisible(false);
					this.jInternalFrameOrderByUnidad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idUnidadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=UnidadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.unidadReturnGeneral=new UnidadParameterReturnGeneral();
			
			this.unidadParameterGeneral=new UnidadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.unidadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(UnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.unidadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ConversionInvenConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(RangoUnidadVentaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ValorPorUnidadConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UnidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.unidadSessionBean.getEsGuardarRelacionado(),this.unidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UnidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.unidadSessionBean.getEsGuardarRelacionado(),this.unidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoUnidad=false;
			this.isVisibilidadCeldaDuplicarUnidad=true;
			this.isVisibilidadCeldaCopiarUnidad=true;
			this.isVisibilidadCeldaVerFormUnidad=true;
			this.isVisibilidadCeldaOrdenUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesUnidad=false;
			this.isVisibilidadCeldaModificarUnidad=false;
			this.isVisibilidadCeldaActualizarUnidad=false;
			this.isVisibilidadCeldaEliminarUnidad=false;
			this.isVisibilidadCeldaCancelarUnidad=false;
			this.isVisibilidadCeldaGuardarUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosUnidad=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadBusquedaPorSiglas=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosUnidad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioUnidad(false);
			
			this.setPermisosUsuarioUnidad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.unidadSessionBean.getEsGuardarRelacionado() 
				|| (this.unidadSessionBean.getEsGuardarRelacionado() && this.unidadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioUnidadClasesRelacionadas();
			}
			
			if(this.unidadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioUnidadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!UnidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosUnidad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualUnidad();
			}
			
			if(!this.isPermisoBusquedaUnidad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasUnidad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.unidadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioUnidad,this.isPermisoPaginacionMedioUnidad,this.isPermisoPaginacionTodoUnidad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(UnidadConstantesFunciones.getTiposSeleccionarUnidad());
				
				this.tiposColumnasSelect=UnidadConstantesFunciones.getTiposSeleccionarUnidad(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectUnidad();				
				//this.tiposRelacionesSelect=UnidadConstantesFunciones.getTiposRelacionesUnidad(true);
				
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
			//if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioUnidad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioUnidad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioUnidad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesUnidad() ;
			
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
			
			
			this.productoLogic=new ProductoLogic();
			this.conversioninvenConversionLogic=new ConversionInvenLogic();
			this.rangounidadventaLogic=new RangoUnidadVentaLogic();
			this.valorporunidadLogic=new ValorPorUnidadLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.tipounidadLogic=new TipoUnidadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				unidadImplementable= (UnidadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UnidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				unidadImplementableHome= (UnidadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UnidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.unidads= new ArrayList<Unidad>();
			this.unidadsEliminados= new ArrayList<Unidad>();
						
			this.isEsNuevoUnidad=false;
			this.esParaAccionDesdeFormularioUnidad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipounidadsForeignKey=new ArrayList<TipoUnidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyUnidad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroUnidad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			UnidadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=UnidadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingUnidad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormUnidad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioUnidad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioUnidad();
			}
			
			UnidadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasUnidad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasUnidad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasUnidad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessUnidad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Unidad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectUnidad() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ProductoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesUnidad")) {
				iIndex=this.jInternalFrameDetalleFormUnidad.jTabbedPaneRelacionesUnidad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormUnidad.jTabbedPaneRelacionesUnidad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosUnidad.getSelectedRow();	
				
				

				if(sTitle.equals("Conversion Invenes")) {
					if(!ConversionInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessUnidad();

						this.cargarParteTabPanelRelacionadaConversionInven(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Productos")) {
					if(!ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessUnidad();

						this.cargarParteTabPanelRelacionadaProducto(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Rango Unidad Ventas")) {
					if(!RangoUnidadVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessUnidad();

						this.cargarParteTabPanelRelacionadaRangoUnidadVenta(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Valor Por Unidades")) {
					if(!ValorPorUnidadJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessUnidad();

						this.cargarParteTabPanelRelacionadaValorPorUnidad(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessUnidad();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaConversionInven(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormUnidad.cargarSessionConBeanSwingJInternalFrameConversionInven(false,true,iIndex);
		this.jButtonConversionInvenActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaConversionInven();

		//this.jTabbedPaneRelacionesUnidad.updateUI();
		//this.jTabbedPaneRelacionesUnidad.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesUnidad.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProducto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormUnidad.cargarSessionConBeanSwingJInternalFrameProducto(false,true,iIndex);
		this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProducto();

		//this.jTabbedPaneRelacionesUnidad.updateUI();
		//this.jTabbedPaneRelacionesUnidad.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesUnidad.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaRangoUnidadVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormUnidad.cargarSessionConBeanSwingJInternalFrameRangoUnidadVenta(false,true,iIndex);
		this.jButtonRangoUnidadVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaRangoUnidadVenta();

		//this.jTabbedPaneRelacionesUnidad.updateUI();
		//this.jTabbedPaneRelacionesUnidad.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesUnidad.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaValorPorUnidad(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormUnidad.cargarSessionConBeanSwingJInternalFrameValorPorUnidad(false,true,iIndex);
		this.jButtonValorPorUnidadActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaValorPorUnidad();

		//this.jTabbedPaneRelacionesUnidad.updateUI();
		//this.jTabbedPaneRelacionesUnidad.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesUnidad.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Producto")) {
				int row=this.jTableDatosUnidad.getSelectedRow();
				jButtonProductoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ConversionInven")) {
				int row=this.jTableDatosUnidad.getSelectedRow();
				jButtonConversionInvenActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("RangoUnidadVenta")) {
				int row=this.jTableDatosUnidad.getSelectedRow();
				jButtonRangoUnidadVentaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ValorPorUnidad")) {
				int row=this.jTableDatosUnidad.getSelectedRow();
				jButtonValorPorUnidadActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Producto")) {

					if(this.isTienePermisosProducto && this.unidadConstantesFunciones.mostrarProductoUnidad && !UnidadConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Productos"+"("+ProductoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Productos");

						if(unidadConstantesFunciones.resaltarProductoUnidad!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(unidadConstantesFunciones.resaltarProductoUnidad);
						}

						jmenuItem.setEnabled(this.unidadConstantesFunciones.activarProductoUnidad);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Producto"));

						

						this.jInternalFrameDetalleFormUnidad.jmenuDetalleUnidad.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Conversion Inven")) {

					if(this.isTienePermisosConversionInven && this.unidadConstantesFunciones.mostrarConversionInvenUnidad && !UnidadConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Conversion Invenes"+"("+ConversionInvenConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Conversion Invenes");

						if(unidadConstantesFunciones.resaltarConversionInvenUnidad!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(unidadConstantesFunciones.resaltarConversionInvenUnidad);
						}

						jmenuItem.setEnabled(this.unidadConstantesFunciones.activarConversionInvenUnidad);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ConversionInven"));

						

						this.jInternalFrameDetalleFormUnidad.jmenuDetalleUnidad.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Rango Unidad Venta")) {

					if(this.isTienePermisosRangoUnidadVenta && this.unidadConstantesFunciones.mostrarRangoUnidadVentaUnidad && !UnidadConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Rango Unidad Ventas"+"("+RangoUnidadVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Rango Unidad Ventas");

						if(unidadConstantesFunciones.resaltarRangoUnidadVentaUnidad!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(unidadConstantesFunciones.resaltarRangoUnidadVentaUnidad);
						}

						jmenuItem.setEnabled(this.unidadConstantesFunciones.activarRangoUnidadVentaUnidad);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"RangoUnidadVenta"));

						

						this.jInternalFrameDetalleFormUnidad.jmenuDetalleUnidad.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Valor Por Unidad")) {

					if(this.isTienePermisosValorPorUnidad && this.unidadConstantesFunciones.mostrarValorPorUnidadUnidad && !UnidadConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Valor Por Unidades"+"("+ValorPorUnidadConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Valor Por Unidades");

						if(unidadConstantesFunciones.resaltarValorPorUnidadUnidad!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(unidadConstantesFunciones.resaltarValorPorUnidadUnidad);
						}

						jmenuItem.setEnabled(this.unidadConstantesFunciones.activarValorPorUnidadUnidad);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ValorPorUnidad"));

						

						this.jInternalFrameDetalleFormUnidad.jmenuDetalleUnidad.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyUnidad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyUnidad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyUnidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyUnidadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyUnidad();
		
		this.cargarCombosFrameForeignKeyUnidad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyUnidad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyUnidad();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoUnidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoUnidad();
				this.cargarCombosFrameTipoUnidadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoUnidad(this.tipounidadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoUnidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.unidadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			
			
			if(jTableDatosUnidad.getRowCount()>=1) {
				jTableDatosUnidad.removeRowSelectionInterval(0, jTableDatosUnidad.getRowCount()-1);						
			}
			
			this.isEsNuevoUnidad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoUnidad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesUnidad(true);			
			//this.unidad=new Unidad();
			//this.unidad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUnidad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUnidad() ;
			
			if(UnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUnidad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.unidad);	
			this.actualizarInformacion("INFO_PADRE",false,this.unidad);				
			
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			
			if(this.unidadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Unidad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarUnidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Unidad> unidadsSeleccionados=new ArrayList<Unidad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosUnidad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosUnidad.getSelectedRows().length;			
			}
			
			unidadsSeleccionados=this.getUnidadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoUnidad--;			
				//Unidad unidadAux= new Unidad();			
				//unidadAux.setId(this.iIdNuevoUnidad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Unidad unidadOrigen=new Unidad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Unidad unidadOrigen : unidadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosUnidad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							unidadOrigen =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							unidadOrigen =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaUnidad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.unidad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosUnidad(unidadOrigen,this.unidad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.unidadLogic.getUnidads().add(this.unidadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.unidads.add(this.unidadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaUnidad(false);
				
				this.jTableDatosUnidad.setRowSelectionInterval(this.getIndiceNuevoUnidad(), this.getIndiceNuevoUnidad());
				
				int iLastRow =  this.jTableDatosUnidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUnidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUnidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUnidad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Unidad> unidadsSeleccionados=new ArrayList<Unidad>();									
		
			Unidad unidadOrigen=new Unidad();
			Unidad unidadDestino=new Unidad();
				
			unidadsSeleccionados=this.getUnidadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosUnidad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || unidadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosUnidad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						unidadOrigen =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						unidadOrigen =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						unidadDestino =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						unidadDestino =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				unidadOrigen =unidadsSeleccionados.get(0);
				unidadDestino =unidadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosUnidad(unidadOrigen,unidadDestino,true,false);
				
				unidadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(unidadDestino,unidadLogic.getUnidads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(unidadDestino,unidads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaUnidad(false);
				
				//this.jTableDatosUnidad.setRowSelectionInterval(this.getIndiceNuevoUnidad(), this.getIndiceNuevoUnidad());
				
				int iLastRow =  this.jTableDatosUnidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUnidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUnidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUnidad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormUnidad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesUnidad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasUnidad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesUnidad.setVisible(!isVisible);
			this.jPanelPaginacionUnidad.setVisible(!isVisible);
			this.jPanelAccionesUnidad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameUnidad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByUnidad();
			
			this.abrirFrameOrderByUnidad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleUnidad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormUnidad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormUnidad.isMaximum()) {
					this.jInternalFrameDetalleFormUnidad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormUnidad.setSize(this.jInternalFrameDetalleFormUnidad.iWidthFormulario,this.jInternalFrameDetalleFormUnidad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormUnidad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormUnidad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormUnidad.isMaximum()) {
						this.jInternalFrameDetalleFormUnidad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormUnidad.jContentPaneDetalleUnidad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormUnidad.jTabbedPaneRelacionesUnidad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormUnidad.jContentPaneDetalleUnidad.getWidth(),UnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUnidad.jTabbedPaneRelacionesUnidad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormUnidad.jContentPaneDetalleUnidad.getWidth(),UnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUnidad.jTabbedPaneRelacionesUnidad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormUnidad.jContentPaneDetalleUnidad.getWidth(),UnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ConversionInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaConversionInven();
					}

					if(ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProducto();
					}

					if(RangoUnidadVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaRangoUnidadVenta();
					}

					if(ValorPorUnidadJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaValorPorUnidad();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormUnidad.setVisible(true);
	        this.jInternalFrameDetalleFormUnidad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByUnidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByUnidad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUnidad,false,this);
				} else {
					this.jInternalFrameOrderByUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUnidad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByUnidad);
				this.jInternalFrameOrderByUnidad.setVisible(false);
				this.jInternalFrameOrderByUnidad.setSelected(false);
				
				this.jInternalFrameOrderByUnidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUnidad"));
				
				this.inicializarActualizarBindingTablaOrderByUnidad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionUnidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionUnidad==null) {
				
				this.jInternalFrameImportacionUnidad=new ImportacionJInternalFrame(UnidadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUnidad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionUnidad);
				this.jInternalFrameImportacionUnidad.setVisible(false);
				this.jInternalFrameImportacionUnidad.setSelected(false);


				this.jInternalFrameImportacionUnidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUnidad"));
				this.jInternalFrameImportacionUnidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUnidad"));
				this.jInternalFrameImportacionUnidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUnidad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoUnidad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoUnidad==null) {
				this.jInternalFrameReporteDinamicoUnidad=new ReporteDinamicoJInternalFrame(UnidadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUnidad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUnidad);
				this.jInternalFrameReporteDinamicoUnidad.setVisible(false);
				this.jInternalFrameReporteDinamicoUnidad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoUnidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUnidad"));
				this.jInternalFrameReporteDinamicoUnidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUnidad"));
				this.jInternalFrameReporteDinamicoUnidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUnidad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUnidad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaConversionInven() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.jScrollPanelDatosConversionInven.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormUnidad.jContentPaneDetalleUnidad.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.jScrollPanelDatosConversionInven.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.jScrollPanelDatosConversionInven.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.jScrollPanelDatosConversionInven.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProducto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormUnidad.jContentPaneDetalleUnidad.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaRangoUnidadVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jScrollPanelDatosRangoUnidadVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormUnidad.jContentPaneDetalleUnidad.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jScrollPanelDatosRangoUnidadVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jScrollPanelDatosRangoUnidadVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.jScrollPanelDatosRangoUnidadVenta.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaValorPorUnidad() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.jScrollPanelDatosValorPorUnidad.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormUnidad.jContentPaneDetalleUnidad.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.jScrollPanelDatosValorPorUnidad.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.jScrollPanelDatosValorPorUnidad.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.jScrollPanelDatosValorPorUnidad.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleUnidad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormUnidad);
			
	       	this.jInternalFrameDetalleFormUnidad.setVisible(false);
	        this.jInternalFrameDetalleFormUnidad.setSelected(false);
			
			//this.jInternalFrameDetalleFormUnidad.dispose();
			//this.jInternalFrameDetalleFormUnidad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoUnidad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoUnidad.setVisible(true);
	        this.jInternalFrameReporteDinamicoUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionUnidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionUnidad.setVisible(true);
	        this.jInternalFrameImportacionUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByUnidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByUnidad.setVisible(true);
	        this.jInternalFrameOrderByUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByUnidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByUnidad.setVisible(false);
	        this.jInternalFrameOrderByUnidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoUnidad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoUnidad.setVisible(false);
	        this.jInternalFrameReporteDinamicoUnidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionUnidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionUnidad.setVisible(false);
	        this.jInternalFrameImportacionUnidad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarUnidad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarUnidad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUnidad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesUnidad(true);
			//this.isEsNuevoUnidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUnidad(false) ;
			
			if(unidadSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado() && ProductoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.getEsGuardarRelacionado() && ConversionInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConversionInvenActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaSessionBean.getEsGuardarRelacionado() && RangoUnidadVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRangoUnidadVentaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadSessionBean.getEsGuardarRelacionado() && ValorPorUnidadJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonValorPorUnidadActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(UnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUnidad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUnidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaUnidadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarUnidad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUnidad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesUnidad(true);
			//this.isEsNuevoUnidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.unidad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesUnidad(false) ;
			
			if(UnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUnidad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUnidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoUnidad(List<TipoUnidad> tipounidadsForeignKey)throws Exception{
		TableColumn tableColumnTipoUnidad=this.jTableDatosUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUnidad,UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD));
		TableCellEditor tableCellEditorTipoUnidad =tableColumnTipoUnidad.getCellEditor();

		TipoUnidadTableCell tipounidadTableCellFk=(TipoUnidadTableCell)tableCellEditorTipoUnidad;

		if(tipounidadTableCellFk!=null) {
			tipounidadTableCellFk.settipounidadsForeignKey(tipounidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUnidad.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipounidadTableCellFk.setRowActual(intSelectedRow);
			//tipounidadTableCellFk.settipounidadsForeignKeyActual(tipounidadsForeignKey);
		//}


		if(tipounidadTableCellFk!=null) {
			tipounidadTableCellFk.RecargarTipoUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesUnidad(false);
			
			//if(!this.isEsNuevoUnidad) {								
				int intSelectedRow = this.jTableDatosUnidad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(UnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualUnidad(this.unidad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
				
			}
			
			if(this.permiteMantenimiento(this.unidad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.unidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoUnidad=true;
					this.inicializarActualizarBindingTablaUnidad(false);
					this.isEsNuevoUnidad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoUnidad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoUnidad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUnidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUnidad(false);
				
				this.habilitarDeshabilitarControlesUnidad(false);
			
												
				
				if(UnidadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleUnidad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoUnidadActionPerformed(evt,unidadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualUnidad(this.unidad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosUnidad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,unidadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.unidad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Unidad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Unidad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosUnidad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				this.unidad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				this.unidad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.unidad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.unidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((UnidadModel) this.jTableDatosUnidad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoUnidad=true;
				this.inicializarActualizarBindingTablaUnidad(false);
				this.isEsNuevoUnidad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUnidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUnidad(false);
				
				this.habilitarDeshabilitarControlesUnidad(false);
				
				
				
				if(UnidadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleUnidad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarUnidadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosUnidad.getRowCount()>=1) {
				jTableDatosUnidad.removeRowSelectionInterval(0, jTableDatosUnidad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesUnidad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaUnidad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUnidad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUnidad(false) ;
			
			this.isEsNuevoUnidad=false;
			
			if(UnidadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleUnidad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingUnidad(false);
				
				//SI ES MANUAL
				if(UnidadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualUnidad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoUnidad--;			
			//Unidad unidadAux= new Unidad();			
			//unidadAux.setId(this.iIdNuevoUnidad);
			
			if(this.jInternalFrameDetalleFormUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaUnidad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
			
			this.unidad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.unidadLogic.getUnidads().add(this.unidadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.unidads.add(this.unidadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaUnidad(false);
			
			this.jTableDatosUnidad.setRowSelectionInterval(this.getIndiceNuevoUnidad(), this.getIndiceNuevoUnidad());
			
			int iLastRow =  this.jTableDatosUnidad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosUnidad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosUnidad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaUnidad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingUnidad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUnidad(false);
			
			//SI ES MANUAL
			if(UnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUnidad();
			}
			
			//this.abrirFrameTreeUnidad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionUnidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE UnidadES ?", "MANTENIMIENTO DE Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionUnidad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralUnidad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.unidadReturnGeneral=unidadLogic.procesarImportacionUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.unidadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarUnidadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionUnidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionUnidad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionUnidad.setFileImportacion(this.jInternalFrameImportacionUnidad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionUnidad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionUnidad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionUnidad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionUnidad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Unidad> unidadsSeleccionados=new ArrayList<Unidad>();		

		unidadsSeleccionados=this.getUnidadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUnidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUnidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("UnidadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"UnidadBaseDesign.jrxml";
			
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
			
			this.generarReporteUnidads("Todos",unidadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.unidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UnidadConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UnidadConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UnidadConstantesFunciones.LABEL_SIGLAS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_glas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_glas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_glas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_glas_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoUnidad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoUnidad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoUnidad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case UnidadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD:
					sNombreCampoCategoria="id_tipo_unidad";
					break;

				case UnidadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case UnidadConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoria="siglas";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoUnidad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case UnidadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD:
					sNombreCampoCategoriaValor="id_tipo_unidad";
					break;

				case UnidadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case UnidadConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoriaValor="siglas";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoUnidad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUnidad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UnidadConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_unidad");
					break;

				case UnidadConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case UnidadConstantesFunciones.LABEL_SIGLAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Siglas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"siglas");
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
	
	public void jButtonGenerarExcelReporteDinamicoUnidadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Unidad> unidadsSeleccionados=new ArrayList<Unidad>();		
		
		unidadsSeleccionados=this.getUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"unidad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Unidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case UnidadConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UnidadConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Unidad unidad:unidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(unidad.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD);
					iRow++;

					for(Unidad unidad:unidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(unidad.gettipounidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UnidadConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UnidadConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Unidad unidad:unidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(unidad.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UnidadConstantesFunciones.LABEL_SIGLAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UnidadConstantesFunciones.LABEL_SIGLAS);
					iRow++;

					for(Unidad unidad:unidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(unidad.getsiglas());
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
			//	this.getFilaCabeceraExportarExcelUnidad(row);				
			//	iRow++;
			//}				
			
			//for(Unidad unidadAux:unidadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelUnidad(unidadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.unidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Unidad",JOptionPane.INFORMATION_MESSAGE);
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
				this.unidadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUnidad(false);
			
			//SI ES MANUAL
			if(UnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUnidad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUnidad(false);
			
			//SI ES MANUAL
			if(UnidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUnidad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUnidad(false);
			
			//SI ES MANUAL
			if(UnidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUnidad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaUnidad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosUnidad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosUnidad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosUnidad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosUnidad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosUnidad.setMinimumSize(dimensionMinimum);
		this.jTableDatosUnidad.setMaximumSize(dimensionMaximum);
		this.jTableDatosUnidad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingUnidad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingUnidad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingUnidad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaUnidad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesUnidad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasUnidad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUnidad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesUnidad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !UnidadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!UnidadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualUnidad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaUnidad();
		
		this.inicializarActualizarBindingBotonesManualUnidad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualUnidad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUnidad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualUnidad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualUnidad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosUnidad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosUnidad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteUnidad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormUnidad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormUnidad.jCheckBoxPostAccionNuevoUnidad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormUnidad.jCheckBoxPostAccionSinCerrarUnidad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormUnidad.jCheckBoxPostAccionSinMensajeUnidad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosUnidad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosUnidad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteUnidad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormUnidad!=null) {
				this.jInternalFrameDetalleFormUnidad.jCheckBoxPostAccionNuevoUnidad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormUnidad.jCheckBoxPostAccionSinCerrarUnidad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormUnidad.jCheckBoxPostAccionSinMensajeUnidad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionUnidad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionUnidad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormUnidad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesUnidad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoUnidad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUnidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesUnidad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesUnidad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarUnidad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesUnidad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoUnidad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUnidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesUnidad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralUnidad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesUnidad(Boolean esInicializar) throws Exception {
		try	{	
			if(UnidadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualUnidad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesUnidad() throws Exception {
		try	{
			if(UnidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualUnidad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUnidad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualUnidad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesUnidad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesUnidad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesUnidad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionUnidad.addItem(reporte);
			}
			
			
			if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionUnidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionUnidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesUnidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesUnidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarUnidad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarUnidad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUnidad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUnidad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUnidad!=null) {
				this.jInternalFrameReporteDinamicoUnidad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoUnidad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUnidad!=null) {
				this.jInternalFrameReporteDinamicoUnidad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoUnidad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoUnidad!=null) {
				
				if(this.jInternalFrameReporteDinamicoUnidad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUnidad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUnidad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoUnidad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUnidad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUnidad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualUnidad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreUnidad.getText();
		this.siglasBusquedaPorSiglas=this.jTextFieldsiglasBusquedaPorSiglasUnidad.getText();
		if(this.jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad.getSelectedItem()!=null){this.id_tipo_unidadFK_IdTipoUnidad=((TipoUnidad)this.jComboBoxid_tipo_unidadFK_IdTipoUnidadUnidad.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasUnidad(Boolean esInicializar) throws Exception {				
		if(UnidadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualUnidad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaUnidad() throws Exception {
		this.inicializarActualizarBindingTablaUnidad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByUnidad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByUnidad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUnidad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new UnidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUnidad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new UnidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosUnidadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUnidadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new UnidadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUnidad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new UnidadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByUnidad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaUnidad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=unidadLogic.getUnidads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=unidads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(UnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosUnidad.setModel(new UnidadModel(this.unidadLogic.getUnidads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosUnidad.setModel(new UnidadModel(this.unidads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByUnidad!=null && this.jInternalFrameOrderByUnidad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByUnidad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUnidad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new UnidadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+UnidadConstantesFunciones.SCLASSWEBTITULO,unidadConstantesFunciones.resaltarSeleccionarUnidad,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+UnidadConstantesFunciones.SCLASSWEBTITULO,unidadConstantesFunciones.resaltarSeleccionarUnidad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUnidad,UnidadConstantesFunciones.LABEL_ID));

		if(this.unidadConstantesFunciones.mostraridUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UnidadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.unidadConstantesFunciones.resaltaridUnidad,this.unidadConstantesFunciones.activaridUnidad,this,true,"idUnidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.unidadConstantesFunciones.resaltaridUnidad,this.unidadConstantesFunciones.activaridUnidad,this,true,"idUnidad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUnidad,UnidadConstantesFunciones.LABEL_IDEMPRESA));

		if(this.unidadConstantesFunciones.mostrarid_empresaUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UnidadConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.unidadConstantesFunciones.resaltarid_empresaUnidad,this,this.unidadConstantesFunciones.activarid_empresaUnidad));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.unidadConstantesFunciones.resaltarid_empresaUnidad,this,this.unidadConstantesFunciones.activarid_empresaUnidad,false,"id_empresaUnidad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUnidad,UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD));

		if(this.unidadConstantesFunciones.mostrarid_tipo_unidadUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoUnidadTableCell(this.tipounidadsForeignKey,this.unidadConstantesFunciones.resaltarid_tipo_unidadUnidad,this,this.unidadConstantesFunciones.activarid_tipo_unidadUnidad));
			tableColumn.setCellEditor(new TipoUnidadTableCell(this.tipounidadsForeignKey,this.unidadConstantesFunciones.resaltarid_tipo_unidadUnidad,this,this.unidadConstantesFunciones.activarid_tipo_unidadUnidad,true,"id_tipo_unidadUnidad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUnidad,UnidadConstantesFunciones.LABEL_NOMBRE));

		if(this.unidadConstantesFunciones.mostrarnombreUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UnidadConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.unidadConstantesFunciones.resaltarnombreUnidad,this.unidadConstantesFunciones.activarnombreUnidad,this,true,"nombreUnidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.unidadConstantesFunciones.resaltarnombreUnidad,this.unidadConstantesFunciones.activarnombreUnidad,this,true,"nombreUnidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUnidad,UnidadConstantesFunciones.LABEL_SIGLAS));

		if(this.unidadConstantesFunciones.mostrarsiglasUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UnidadConstantesFunciones.LABEL_SIGLAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.unidadConstantesFunciones.resaltarsiglasUnidad,this.unidadConstantesFunciones.activarsiglasUnidad,this,true,"siglasUnidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.unidadConstantesFunciones.resaltarsiglasUnidad,this.unidadConstantesFunciones.activarsiglasUnidad,this,true,"siglasUnidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.unidadSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProducto && this.unidadConstantesFunciones.mostrarProductoUnidad && !UnidadConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Productos");
				tableColumn.setHeaderValue("Productos");
				tableColumn.setCellRenderer(new ProductoTableCell(unidadConstantesFunciones.resaltarProductoUnidad,this,this.unidadConstantesFunciones.activarProductoUnidad));
				tableColumn.setCellEditor(new ProductoTableCell(unidadConstantesFunciones.resaltarProductoUnidad,this,this.unidadConstantesFunciones.activarProductoUnidad));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosUnidad.addColumn(tableColumn);
			}

			if(this.isTienePermisosConversionInven && this.unidadConstantesFunciones.mostrarConversionInvenUnidad && !UnidadConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Conversion Invenes");
				tableColumn.setHeaderValue("Conversion Invenes");
				tableColumn.setCellRenderer(new ConversionInvenTableCell(unidadConstantesFunciones.resaltarConversionInvenUnidad,this,this.unidadConstantesFunciones.activarConversionInvenUnidad));
				tableColumn.setCellEditor(new ConversionInvenTableCell(unidadConstantesFunciones.resaltarConversionInvenUnidad,this,this.unidadConstantesFunciones.activarConversionInvenUnidad));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosUnidad.addColumn(tableColumn);
			}

			if(this.isTienePermisosRangoUnidadVenta && this.unidadConstantesFunciones.mostrarRangoUnidadVentaUnidad && !UnidadConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Rango Unidad Ventas");
				tableColumn.setHeaderValue("Rango Unidad Ventas");
				tableColumn.setCellRenderer(new RangoUnidadVentaTableCell(unidadConstantesFunciones.resaltarRangoUnidadVentaUnidad,this,this.unidadConstantesFunciones.activarRangoUnidadVentaUnidad));
				tableColumn.setCellEditor(new RangoUnidadVentaTableCell(unidadConstantesFunciones.resaltarRangoUnidadVentaUnidad,this,this.unidadConstantesFunciones.activarRangoUnidadVentaUnidad));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosUnidad.addColumn(tableColumn);
			}

			if(this.isTienePermisosValorPorUnidad && this.unidadConstantesFunciones.mostrarValorPorUnidadUnidad && !UnidadConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Valor Por Unidades");
				tableColumn.setHeaderValue("Valor Por Unidades");
				tableColumn.setCellRenderer(new ValorPorUnidadTableCell(unidadConstantesFunciones.resaltarValorPorUnidadUnidad,this,this.unidadConstantesFunciones.activarValorPorUnidadUnidad));
				tableColumn.setCellEditor(new ValorPorUnidadTableCell(unidadConstantesFunciones.resaltarValorPorUnidadUnidad,this,this.unidadConstantesFunciones.activarValorPorUnidadUnidad));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosUnidad.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.unidadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.unidadSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUnidad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.unidadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.unidadSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUnidad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarUnidad && this.isPermisoGuardarCambiosUnidad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.unidadSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.unidadSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosUnidad.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.unidadSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosUnidad.addColumn(tableColumn);
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
			
			this.jTableDatosUnidad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUnidad && this.isPermisoGuardarCambiosUnidad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.unidadSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUnidad && this.isPermisoGuardarCambiosUnidad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosUnidad.moveColumn(this.jTableDatosUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosUnidad.moveColumn(this.jTableDatosUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.unidadSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosUnidad.moveColumn(this.jTableDatosUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosUnidad.moveColumn(this.jTableDatosUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosUnidad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosUnidad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosUnidad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!UnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosUnidad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosUnidad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!UnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!UnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosUnidad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosUnidad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosUnidad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=unidadLogic.getUnidads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=unidads.size()-1;
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
		//this.jTableDatosUnidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosUnidad();
			
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
				
				//this.isEsNuevoUnidad=false;
					
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			
				if(this.unidadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormUnidad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUnidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUnidad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.unidad.getsType().equals("DUPLICADO")
				   || this.unidad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoUnidad=true;
				
				} else {
					this.isEsNuevoUnidad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.unidadSessionBean.getEsGuardarRelacionado()) {
					if(this.unidad.getId()>=0 && !this.unidad.getIsNew()) {						
						this.isEsNuevoUnidad=false;
						
					} else {
						this.isEsNuevoUnidad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoUnidad(esRelaciones);						
				
				this.seleccionarUnidad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.unidad.getId()<0) {
					this.isEsNuevoUnidad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarUnidad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarUnidad(evt,rowIndex);
				}	
				
				if(this.unidadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Unidad: " + this.dDif); 
					}
				}								
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarUnidad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.unidad)) {
					if(this.unidad.getId()>0) {
						this.unidad.setIsDeleted(true);
						
						this.unidadsEliminados.add(this.unidad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.unidadLogic.getUnidads().remove(this.unidad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.unidads.remove(this.unidad);				
					}
					
					
					((UnidadModel) this.jTableDatosUnidad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaUnidad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarUnidad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoUnidad) {
			
			if(this.jInternalFrameDetalleFormUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUnidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUnidad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(UnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioUnidad(this.unidad);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.unidadConstantesFunciones.cargarid_empresaUnidad || this.unidadConstantesFunciones.event_dependid_empresaUnidad) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.unidad.getid_empresa());
									//this.inicializarActualizarBindingUnidad(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(unidad.getEmpresa()!=null) {
							this.empresasForeignKey.add(unidad.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.unidad.getid_empresa(),false,"Formulario");

					//TipoUnidad
					if(!this.unidadConstantesFunciones.cargarid_tipo_unidadUnidad || this.unidadConstantesFunciones.event_dependid_tipo_unidadUnidad) {
						//this.cargarCombosTipoUnidadsForeignKeyLista(" where id="+this.unidad.getid_tipo_unidad());
									//this.inicializarActualizarBindingUnidad(false,false);
						this.tipounidadsForeignKey=new ArrayList<TipoUnidad>();

						if(unidad.getTipoUnidad()!=null) {
							this.tipounidadsForeignKey.add(unidad.getTipoUnidad());
						}

						this.addItemDefectoCombosForeignKeyTipoUnidad();
						this.cargarCombosFrameTipoUnidadsForeignKey("Todos");
					}
					this.setActualTipoUnidadForeignKey(this.unidad.getid_tipo_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesUnidad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesUnidad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUnidad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoUnidad(Unidad unidad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoUnidad(unidad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoUnidad(Unidad unidad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioUnidad(unidad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyUnidad(unidad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyUnidad(unidad);
	}
	
	public void setVariablesObjetoActualToFormularioUnidad(Unidad unidad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormUnidad.jLabelidUnidad.setText(unidad.getId().toString());
			this.jInternalFrameDetalleFormUnidad.jTextFieldnombreUnidad.setText(unidad.getnombre());
			this.jInternalFrameDetalleFormUnidad.jTextFieldsiglasUnidad.setText(unidad.getsiglas());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Unidad unidadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,unidadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Unidad unidadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				unidadLocal=this.unidad;
			} else {
				unidadLocal=this.unidadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(unidadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoUnidad(unidadLocal,true);
					
					if(unidadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(unidadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.unidadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(unidadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoUnidad(Unidad unidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUnidad(unidad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysUnidad(unidad);
	}
	
	public void setVariablesFormularioToObjetoActualUnidad(Unidad unidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUnidad(unidad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualUnidad(Unidad unidad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormUnidad.jLabelidUnidad.getText()==null || this.jInternalFrameDetalleFormUnidad.jLabelidUnidad.getText()=="" || this.jInternalFrameDetalleFormUnidad.jLabelidUnidad.getText()=="Id") {
				this.jInternalFrameDetalleFormUnidad.jLabelidUnidad.setText("0");
			}

			if(conColumnasBase) {unidad.setId(Long.parseLong(this.jInternalFrameDetalleFormUnidad.jLabelidUnidad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UnidadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUnidad.jLabelIdUnidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			unidad.setnombre(this.jInternalFrameDetalleFormUnidad.jTextFieldnombreUnidad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UnidadConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUnidad.jLabelnombreUnidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			unidad.setsiglas(this.jInternalFrameDetalleFormUnidad.jTextFieldsiglasUnidad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UnidadConstantesFunciones.LABEL_SIGLAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUnidad.jLabelsiglasUnidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUnidad(Unidad unidadBean,Unidad unidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && unidadBean.getid_tipo_unidad()!=null && !unidadBean.getid_tipo_unidad().equals(-1L))) {unidad.setid_tipo_unidad(unidadBean.getid_tipo_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosUnidad(Unidad unidadOrigen,Unidad unidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && unidadOrigen.getId()!=null && !unidadOrigen.getId().equals(0L))) {unidad.setId(unidadOrigen.getId());}}
			if(conDefault || (!conDefault && unidadOrigen.getid_tipo_unidad()!=null && !unidadOrigen.getid_tipo_unidad().equals(-1L))) {unidad.setid_tipo_unidad(unidadOrigen.getid_tipo_unidad());}
			if(conDefault || (!conDefault && unidadOrigen.getnombre()!=null && !unidadOrigen.getnombre().equals(""))) {unidad.setnombre(unidadOrigen.getnombre());}
			if(conDefault || (!conDefault && unidadOrigen.getsiglas()!=null && !unidadOrigen.getsiglas().equals(""))) {unidad.setsiglas(unidadOrigen.getsiglas());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUnidad(Unidad unidad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUnidad.jLabelidUnidad.setText(unidad.getId().toString());
			this.jInternalFrameDetalleFormUnidad.jTextFieldnombreUnidad.setText(unidad.getnombre());
			this.jInternalFrameDetalleFormUnidad.jTextFieldsiglasUnidad.setText(unidad.getsiglas());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUnidad(UnidadBean unidadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUnidad.jLabelidUnidad.setText(unidadBean.getId().toString());
			this.jInternalFrameDetalleFormUnidad.jTextFieldnombreUnidad.setText(unidadBean.getnombre());
			this.jInternalFrameDetalleFormUnidad.jTextFieldsiglasUnidad.setText(unidadBean.getsiglas());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanUnidad(UnidadParameterReturnGeneral unidadReturnGeneral,UnidadBean unidadBean,Boolean conDefault) throws Exception { 
		try {
			Unidad unidadLocal=new Unidad();
			
			unidadLocal=unidadReturnGeneral.getUnidad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && unidadLocal.getId()!=null && !unidadLocal.getId().equals(0L))) {unidadBean.setId(unidadLocal.getId());}}
			if(conDefault || (!conDefault && unidadLocal.getid_tipo_unidad()!=null && !unidadLocal.getid_tipo_unidad().equals(-1L))) {unidadBean.setid_tipo_unidad(unidadLocal.getid_tipo_unidad());}
			if(conDefault || (!conDefault && unidadLocal.getnombre()!=null && !unidadLocal.getnombre().equals(""))) {unidadBean.setnombre(unidadLocal.getnombre());}
			if(conDefault || (!conDefault && unidadLocal.getsiglas()!=null && !unidadLocal.getsiglas().equals(""))) {unidadBean.setsiglas(unidadLocal.getsiglas());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxUnidadGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxUnidad,List<Unidad> unidadsLocal)throws Exception {
		try {
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsLocal) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			jComboBoxUnidad.setSelectedItem(unidadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxUnidadGenerico(JComboBox jComboBoxUnidad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUnidad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxUnidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUnidad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxUnidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Producto")) {
			jButtonProductoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ConversionInven")) {
			jButtonConversionInvenActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("RangoUnidadVenta")) {
			jButtonRangoUnidadVentaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ValorPorUnidad")) {
			jButtonValorPorUnidadActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			unidad=(Unidad) unidadLogic.getUnidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			unidad =(Unidad) unidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!unidad.getIsNew() && !unidad.getIsChanged() && !unidad.getIsDeleted()) {
				sDescripcion=unidad.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=unidad.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoUnidad")) {
			//sDescripcion=this.getActualTipoUnidadForeignKeyDescripcion((Long)value);
			if(!unidad.getIsNew() && !unidad.getIsChanged() && !unidad.getIsDeleted()) {
				sDescripcion=unidad.gettipounidad_descripcion();
			} else {
				//sDescripcion=this.getActualTipoUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=unidad.gettipounidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Unidad unidadRow=new Unidad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			unidadRow=(Unidad) unidadLogic.getUnidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			unidadRow=(Unidad) unidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Unidad unidad) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormUnidad==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.unidad = (Unidad)this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.unidad = (Unidad)this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(unidad!=null) {
						this.unidad = unidad;
					} else {
						this.unidad = new Unidad();
					}
				}

				if(this.isTienePermisosProducto && this.permiteMantenimiento(this.unidad)) {
					ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFramePopup;
					} else {
						productoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame;
					}

					List<Unidad> unidads=new ArrayList<Unidad>();
					unidads.add(this.unidad);
					if(!esRelacionado) {
						//productoBeanSwingJInternalFrame.productoSessionBean.setConGuardarRelaciones(false);
						//productoBeanSwingJInternalFrame.productoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormUnidad.cargarProductoBeanSwingJInternalFrame(unidads,this.unidad,productoBeanSwingJInternalFrame,/*conInicializar,*/productoBeanSwingJInternalFrame.productoSessionBean.getConGuardarRelaciones(),productoBeanSwingJInternalFrame.productoSessionBean.getEsGuardarRelacionado());
					productoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");

						productoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoConstantesFunciones.ITAMANIOFILATABLA + (ProductoConstantesFunciones.ITAMANIOFILATABLA/2));

						productoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderUnidad=(TitledBorder)this.jScrollPanelDatosUnidad.getBorder();
						TitledBorder titledBorderProducto=(TitledBorder)productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

						titledBorderProducto.setTitle(titledBorderUnidad.getTitle() + " -> Producto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoBeanSwingJInternalFrame);
						}

						productoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoBeanSwingJInternalFrame);

						productoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.unidadSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Producto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonConversionInvenActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Unidad unidad) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormUnidad==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.unidad = (Unidad)this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.unidad = (Unidad)this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(unidad!=null) {
						this.unidad = unidad;
					} else {
						this.unidad = new Unidad();
					}
				}

				if(this.isTienePermisosConversionInven && this.permiteMantenimiento(this.unidad)) {
					ConversionInvenBeanSwingJInternalFrame conversioninvenBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFramePopup=new ConversionInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						conversioninvenBeanSwingJInternalFrame=this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFramePopup;
					} else {
						conversioninvenBeanSwingJInternalFrame=this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame;
					}

					List<Unidad> unidads=new ArrayList<Unidad>();
					unidads.add(this.unidad);
					if(!esRelacionado) {
						//conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.setConGuardarRelaciones(false);
						//conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					conversioninvenBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormUnidad.cargarConversionInvenBeanSwingJInternalFrame(unidads,this.unidad,conversioninvenBeanSwingJInternalFrame,/*conInicializar,*/conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.getConGuardarRelaciones(),conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.getEsGuardarRelacionado());
					conversioninvenBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						conversioninvenBeanSwingJInternalFrame.actualizarEstadoPanelsConversionInven("no_relacionado");

						conversioninvenBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ConversionInvenConstantesFunciones.ITAMANIOFILATABLA + (ConversionInvenConstantesFunciones.ITAMANIOFILATABLA/2));

						conversioninvenBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderUnidad=(TitledBorder)this.jScrollPanelDatosUnidad.getBorder();
						TitledBorder titledBorderConversionInven=(TitledBorder)conversioninvenBeanSwingJInternalFrame.jScrollPanelDatosConversionInven.getBorder();

						titledBorderConversionInven.setTitle(titledBorderUnidad.getTitle() + " -> Conversion Inven");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,conversioninvenBeanSwingJInternalFrame);
						}

						conversioninvenBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(conversioninvenBeanSwingJInternalFrame);

						conversioninvenBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.unidadSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Conversion Inven",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonRangoUnidadVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Unidad unidad) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormUnidad==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.unidad = (Unidad)this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.unidad = (Unidad)this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(unidad!=null) {
						this.unidad = unidad;
					} else {
						this.unidad = new Unidad();
					}
				}

				if(this.isTienePermisosRangoUnidadVenta && this.permiteMantenimiento(this.unidad)) {
					RangoUnidadVentaBeanSwingJInternalFrame rangounidadventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFramePopup=new RangoUnidadVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						rangounidadventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFramePopup;
					} else {
						rangounidadventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame;
					}

					List<Unidad> unidads=new ArrayList<Unidad>();
					unidads.add(this.unidad);
					if(!esRelacionado) {
						//rangounidadventaBeanSwingJInternalFrame.rangounidadventaSessionBean.setConGuardarRelaciones(false);
						//rangounidadventaBeanSwingJInternalFrame.rangounidadventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					rangounidadventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormUnidad.cargarRangoUnidadVentaBeanSwingJInternalFrame(unidads,this.unidad,rangounidadventaBeanSwingJInternalFrame,/*conInicializar,*/rangounidadventaBeanSwingJInternalFrame.rangounidadventaSessionBean.getConGuardarRelaciones(),rangounidadventaBeanSwingJInternalFrame.rangounidadventaSessionBean.getEsGuardarRelacionado());
					rangounidadventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						rangounidadventaBeanSwingJInternalFrame.actualizarEstadoPanelsRangoUnidadVenta("no_relacionado");

						rangounidadventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(RangoUnidadVentaConstantesFunciones.ITAMANIOFILATABLA + (RangoUnidadVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						rangounidadventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderUnidad=(TitledBorder)this.jScrollPanelDatosUnidad.getBorder();
						TitledBorder titledBorderRangoUnidadVenta=(TitledBorder)rangounidadventaBeanSwingJInternalFrame.jScrollPanelDatosRangoUnidadVenta.getBorder();

						titledBorderRangoUnidadVenta.setTitle(titledBorderUnidad.getTitle() + " -> Rango Unidad Venta");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,rangounidadventaBeanSwingJInternalFrame);
						}

						rangounidadventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(rangounidadventaBeanSwingJInternalFrame);

						rangounidadventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.unidadSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Rango Unidad Venta",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonValorPorUnidadActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Unidad unidad) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormUnidad==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.unidad = (Unidad)this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.unidad = (Unidad)this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(unidad!=null) {
						this.unidad = unidad;
					} else {
						this.unidad = new Unidad();
					}
				}

				if(this.isTienePermisosValorPorUnidad && this.permiteMantenimiento(this.unidad)) {
					ValorPorUnidadBeanSwingJInternalFrame valorporunidadBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFramePopup=new ValorPorUnidadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						valorporunidadBeanSwingJInternalFrame=this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFramePopup;
					} else {
						valorporunidadBeanSwingJInternalFrame=this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame;
					}

					List<Unidad> unidads=new ArrayList<Unidad>();
					unidads.add(this.unidad);
					if(!esRelacionado) {
						//valorporunidadBeanSwingJInternalFrame.valorporunidadSessionBean.setConGuardarRelaciones(false);
						//valorporunidadBeanSwingJInternalFrame.valorporunidadSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					valorporunidadBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormUnidad.cargarValorPorUnidadBeanSwingJInternalFrame(unidads,this.unidad,valorporunidadBeanSwingJInternalFrame,/*conInicializar,*/valorporunidadBeanSwingJInternalFrame.valorporunidadSessionBean.getConGuardarRelaciones(),valorporunidadBeanSwingJInternalFrame.valorporunidadSessionBean.getEsGuardarRelacionado());
					valorporunidadBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						valorporunidadBeanSwingJInternalFrame.actualizarEstadoPanelsValorPorUnidad("no_relacionado");

						valorporunidadBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ValorPorUnidadConstantesFunciones.ITAMANIOFILATABLA + (ValorPorUnidadConstantesFunciones.ITAMANIOFILATABLA/2));

						valorporunidadBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderUnidad=(TitledBorder)this.jScrollPanelDatosUnidad.getBorder();
						TitledBorder titledBorderValorPorUnidad=(TitledBorder)valorporunidadBeanSwingJInternalFrame.jScrollPanelDatosValorPorUnidad.getBorder();

						titledBorderValorPorUnidad.setTitle(titledBorderUnidad.getTitle() + " -> Valor Por Unidad");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,valorporunidadBeanSwingJInternalFrame);
						}

						valorporunidadBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(valorporunidadBeanSwingJInternalFrame);

						valorporunidadBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.unidadSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Valor Por Unidad",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualUnidad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoUnidad.setVisible((this.isVisibilidadCeldaNuevoUnidad && this.isPermisoNuevoUnidad));			
			this.jButtonDuplicarUnidad.setVisible((this.isVisibilidadCeldaDuplicarUnidad && this.isPermisoDuplicarUnidad));			
			this.jButtonCopiarUnidad.setVisible((this.isVisibilidadCeldaCopiarUnidad && this.isPermisoCopiarUnidad));
			this.jButtonVerFormUnidad.setVisible((this.isVisibilidadCeldaVerFormUnidad && this.isPermisoVerFormUnidad));
			
			this.jButtonAbrirOrderByUnidad.setVisible((this.isVisibilidadCeldaOrdenUnidad && this.isPermisoOrdenUnidad));			
			
			this.jButtonNuevoRelacionesUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesUnidad && this.isPermisoNuevoUnidad));			
			this.jButtonNuevoGuardarCambiosUnidad.setVisible((this.isVisibilidadCeldaNuevoUnidad && this.isPermisoNuevoUnidad && this.isPermisoGuardarCambiosUnidad));
			
			if(this.jInternalFrameDetalleFormUnidad!=null) {
			this.jInternalFrameDetalleFormUnidad.jButtonModificarUnidad.setVisible((this.isVisibilidadCeldaModificarUnidad && this.isPermisoActualizarUnidad));	
			this.jInternalFrameDetalleFormUnidad.jButtonActualizarUnidad.setVisible((this.isVisibilidadCeldaActualizarUnidad && this.isPermisoActualizarUnidad));	
			this.jInternalFrameDetalleFormUnidad.jButtonEliminarUnidad.setVisible((this.isVisibilidadCeldaEliminarUnidad && this.isPermisoEliminarUnidad));
			this.jInternalFrameDetalleFormUnidad.jButtonCancelarUnidad.setVisible(this.isVisibilidadCeldaCancelarUnidad);							
			this.jInternalFrameDetalleFormUnidad.jButtonGuardarCambiosUnidad.setVisible((this.isVisibilidadCeldaGuardarUnidad && this.isPermisoGuardarCambiosUnidad));			
			
			}
						
			this.jButtonGuardarCambiosTablaUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosUnidad && this.isPermisoGuardarCambiosUnidad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarUnidad.setVisible((this.isVisibilidadCeldaNuevoUnidad && this.isPermisoNuevoUnidad));						
			this.jButtonDuplicarToolBarUnidad.setVisible((this.isVisibilidadCeldaDuplicarUnidad && this.isPermisoDuplicarUnidad));						
			this.jButtonCopiarToolBarUnidad.setVisible((this.isVisibilidadCeldaCopiarUnidad && this.isPermisoCopiarUnidad));			
			this.jButtonVerFormToolBarUnidad.setVisible((this.isVisibilidadCeldaVerFormUnidad && this.isPermisoVerFormUnidad));			
			this.jButtonAbrirOrderByToolBarUnidad.setVisible((this.isVisibilidadCeldaOrdenUnidad && this.isPermisoOrdenUnidad));
			this.jButtonNuevoRelacionesToolBarUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesUnidad && this.isPermisoNuevoUnidad));			
			this.jButtonNuevoGuardarCambiosToolBarUnidad.setVisible((this.isVisibilidadCeldaNuevoUnidad && this.isPermisoNuevoUnidad && this.isPermisoGuardarCambiosUnidad));			
			
			if(this.jInternalFrameDetalleFormUnidad!=null) {
			this.jInternalFrameDetalleFormUnidad.jButtonModificarToolBarUnidad.setVisible((this.isVisibilidadCeldaModificarUnidad && this.isPermisoActualizarUnidad));	
			this.jInternalFrameDetalleFormUnidad.jButtonActualizarToolBarUnidad.setVisible((this.isVisibilidadCeldaActualizarUnidad  && this.isPermisoActualizarUnidad));	
			this.jInternalFrameDetalleFormUnidad.jButtonEliminarToolBarUnidad.setVisible((this.isVisibilidadCeldaEliminarUnidad && this.isPermisoEliminarUnidad));
			this.jInternalFrameDetalleFormUnidad.jButtonCancelarToolBarUnidad.setVisible(this.isVisibilidadCeldaCancelarUnidad);				
			this.jInternalFrameDetalleFormUnidad.jButtonGuardarCambiosToolBarUnidad.setVisible((this.isVisibilidadCeldaGuardarUnidad && this.isPermisoGuardarCambiosUnidad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosUnidad && this.isPermisoGuardarCambiosUnidad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoUnidad.setVisible((this.isVisibilidadCeldaNuevoUnidad && this.isPermisoNuevoUnidad));			
			this.jMenuItemDuplicarUnidad.setVisible((this.isVisibilidadCeldaDuplicarUnidad && this.isPermisoDuplicarUnidad));			
			this.jMenuItemCopiarUnidad.setVisible((this.isVisibilidadCeldaCopiarUnidad && this.isPermisoCopiarUnidad));			
			this.jMenuItemVerFormUnidad.setVisible((this.isVisibilidadCeldaVerFormUnidad && this.isPermisoVerFormUnidad));			
			this.jMenuItemAbrirOrderByUnidad.setVisible((this.isVisibilidadCeldaOrdenUnidad && this.isPermisoOrdenUnidad));			
			//this.jMenuItemMostrarOcultarUnidad.setVisible((this.isVisibilidadCeldaOrdenUnidad && this.isPermisoOrdenUnidad));
			this.jMenuItemDetalleAbrirOrderByUnidad.setVisible((this.isVisibilidadCeldaOrdenUnidad && this.isPermisoOrdenUnidad));			
			//this.jMenuItemDetalleMostrarOcultarUnidad.setVisible((this.isVisibilidadCeldaOrdenUnidad && this.isPermisoOrdenUnidad));			
			this.jMenuItemNuevoRelacionesUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesUnidad && this.isPermisoNuevoUnidad));			
			this.jMenuItemNuevoGuardarCambiosUnidad.setVisible((this.isVisibilidadCeldaNuevoUnidad && this.isPermisoNuevoUnidad && this.isPermisoGuardarCambiosUnidad));									
			
			if(this.jInternalFrameDetalleFormUnidad!=null) {
			this.jInternalFrameDetalleFormUnidad.jMenuItemModificarUnidad.setVisible((this.isVisibilidadCeldaModificarUnidad && this.isPermisoActualizarUnidad));	
			this.jInternalFrameDetalleFormUnidad.jMenuItemActualizarUnidad.setVisible((this.isVisibilidadCeldaActualizarUnidad && this.isPermisoActualizarUnidad));	
			this.jInternalFrameDetalleFormUnidad.jMenuItemEliminarUnidad.setVisible((this.isVisibilidadCeldaEliminarUnidad && this.isPermisoEliminarUnidad));
			this.jInternalFrameDetalleFormUnidad.jMenuItemCancelarUnidad.setVisible(this.isVisibilidadCeldaCancelarUnidad);				
			}
			
			this.jMenuItemGuardarCambiosUnidad.setVisible((this.isVisibilidadCeldaGuardarUnidad && this.isPermisoGuardarCambiosUnidad));						
			this.jMenuItemGuardarCambiosTablaUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosUnidad && this.isPermisoGuardarCambiosUnidad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoUnidad=this.jButtonNuevoUnidad.isVisible();
			this.isVisibilidadCeldaDuplicarUnidad=this.jButtonDuplicarUnidad.isVisible();
			this.isVisibilidadCeldaCopiarUnidad=this.jButtonCopiarUnidad.isVisible();
			this.isVisibilidadCeldaVerFormUnidad=this.jButtonVerFormUnidad.isVisible();
			
			this.isVisibilidadCeldaOrdenUnidad=this.jButtonAbrirOrderByUnidad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesUnidad=this.jButtonNuevoRelacionesUnidad.isVisible();
			this.isVisibilidadCeldaModificarUnidad=this.jButtonModificarUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormUnidad!=null) {
			this.isVisibilidadCeldaActualizarUnidad=this.jInternalFrameDetalleFormUnidad.jButtonActualizarUnidad.isVisible();
			this.isVisibilidadCeldaEliminarUnidad=this.jInternalFrameDetalleFormUnidad.jButtonEliminarUnidad.isVisible();
			this.isVisibilidadCeldaCancelarUnidad=this.jInternalFrameDetalleFormUnidad.jButtonCancelarUnidad.isVisible();
			this.isVisibilidadCeldaGuardarUnidad=this.jInternalFrameDetalleFormUnidad.jButtonGuardarCambiosUnidad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosUnidad=this.jButtonGuardarCambiosTablaUnidad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoUnidad=this.jButtonNuevoToolBarUnidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUnidad=this.jButtonNuevoRelacionesToolBarUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormUnidad!=null) {
			this.isVisibilidadCeldaModificarUnidad=this.jInternalFrameDetalleFormUnidad.jButtonModificarToolBarUnidad.isVisible();
			this.isVisibilidadCeldaActualizarUnidad=this.jInternalFrameDetalleFormUnidad.jButtonActualizarToolBarUnidad.isVisible();
			this.isVisibilidadCeldaEliminarUnidad=this.jInternalFrameDetalleFormUnidad.jButtonEliminarToolBarUnidad.isVisible();
			this.isVisibilidadCeldaCancelarUnidad=this.jInternalFrameDetalleFormUnidad.jButtonCancelarToolBarUnidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUnidad=this.jButtonGuardarCambiosToolBarUnidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUnidad=this.jButtonGuardarCambiosTablaToolBarUnidad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoUnidad=this.jMenuItemNuevoUnidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUnidad=this.jMenuItemNuevoRelacionesUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormUnidad!=null) {
			this.isVisibilidadCeldaModificarUnidad=this.jInternalFrameDetalleFormUnidad.jMenuItemModificarUnidad.isVisible();
			this.isVisibilidadCeldaActualizarUnidad=this.jInternalFrameDetalleFormUnidad.jMenuItemActualizarUnidad.isVisible();
			this.isVisibilidadCeldaEliminarUnidad=this.jInternalFrameDetalleFormUnidad.jMenuItemEliminarUnidad.isVisible();
			this.isVisibilidadCeldaCancelarUnidad=this.jInternalFrameDetalleFormUnidad.jMenuItemCancelarUnidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUnidad=this.jMenuItemGuardarCambiosUnidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUnidad=this.jMenuItemGuardarCambiosTablaUnidad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesUnidad(Boolean esInicializar) {
		if(UnidadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.unidadSessionBean.getConGuardarRelaciones()) {
				//if(this.unidadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesUnidad();
			}
			
			this.inicializarActualizarBindingBotonesManualUnidad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualUnidad() {
		this.jButtonNuevoUnidad.setVisible(this.isPermisoNuevoUnidad);			
		this.jButtonDuplicarUnidad.setVisible(this.isPermisoDuplicarUnidad);			
		this.jButtonCopiarUnidad.setVisible(this.isPermisoCopiarUnidad);			
		this.jButtonVerFormUnidad.setVisible(this.isPermisoVerFormUnidad);			
		
		this.jButtonAbrirOrderByUnidad.setVisible(this.isPermisoOrdenUnidad);					
		
		this.jButtonNuevoRelacionesUnidad.setVisible(this.isPermisoNuevoUnidad);			
		
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUnidad.jButtonModificarUnidad.setVisible(this.isPermisoActualizarUnidad);	
			this.jInternalFrameDetalleFormUnidad.jButtonActualizarUnidad.setVisible(this.isPermisoActualizarUnidad);	
			this.jInternalFrameDetalleFormUnidad.jButtonEliminarUnidad.setVisible(this.isPermisoEliminarUnidad);
			this.jInternalFrameDetalleFormUnidad.jButtonCancelarUnidad.setVisible(this.isVisibilidadCeldaCancelarUnidad);						
			this.jInternalFrameDetalleFormUnidad.jButtonGuardarCambiosUnidad.setVisible(this.isPermisoGuardarCambiosUnidad);							
		}
		
		this.jButtonGuardarCambiosTablaUnidad.setVisible(this.isPermisoActualizarUnidad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleUnidad() {
		this.jInternalFrameDetalleFormUnidad.jButtonModificarUnidad.setVisible(this.isPermisoActualizarUnidad);	
		this.jInternalFrameDetalleFormUnidad.jButtonActualizarUnidad.setVisible(this.isPermisoActualizarUnidad);	
		this.jInternalFrameDetalleFormUnidad.jButtonEliminarUnidad.setVisible(this.isPermisoEliminarUnidad);
		this.jInternalFrameDetalleFormUnidad.jButtonCancelarUnidad.setVisible(this.isVisibilidadCeldaCancelarUnidad);							
		this.jInternalFrameDetalleFormUnidad.jButtonGuardarCambiosUnidad.setVisible((this.isVisibilidadCeldaGuardarUnidad && this.isPermisoGuardarCambiosUnidad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosUnidad() {
		if(UnidadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualUnidad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesUnidad() {
	}
	
	public void jTableDatosUnidadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarUnidad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUnidad(this.getunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.unidad==null) {
						this.unidad = new Unidad();
					}

					this.setVariablesFormularioToObjetoActualUnidad(this.unidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
				}

				if(this.unidad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.unidad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaUnidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebUnidad(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUnidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUnidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUnidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUnidad(this.getunidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.unidadLogic.getConnexion());

				if(this.unidad.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.unidad.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUnidad=(TitledBorder)this.jScrollPanelDatosUnidad.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderUnidad.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUnidad(this.getunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.unidad==null) {
						this.unidad = new Unidad();
					}

					this.setVariablesFormularioToObjetoActualUnidad(this.unidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
				}

				if(this.unidad.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.unidad.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_unidadUnidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipounidad=true;

			idTienePermisotipounidad=this.tienePermisosUsuarioEnPaginaWebUnidad(TipoUnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisotipounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUnidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUnidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUnidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUnidad(this.getunidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);

				this.tipounidadBeanSwingJInternalFrame=new TipoUnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipounidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipounidadBeanSwingJInternalFrame.getTipoUnidadLogic().setConnexion(this.unidadLogic.getConnexion());

				if(this.unidad.getid_tipo_unidad()!=null) {
					this.tipounidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipounidadBeanSwingJInternalFrame.setIdActual(this.unidad.getid_tipo_unidad());
					this.tipounidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipounidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipounidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoUnidad();
				}

				JInternalFrameBase jinternalFrame =this.tipounidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUnidad=(TitledBorder)this.jScrollPanelDatosUnidad.getBorder();
				TitledBorder titledBordertipounidad=(TitledBorder)this.tipounidadBeanSwingJInternalFrame.jScrollPanelDatosTipoUnidad.getBorder();

				titledBordertipounidad.setTitle(titledBorderUnidad.getTitle() + " -> Tipo Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_unidadUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUnidad(this.getunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.unidad==null) {
						this.unidad = new Unidad();
					}

					this.setVariablesFormularioToObjetoActualUnidad(this.unidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
				}

				if(this.unidad.getid_tipo_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_unidad = "+this.unidad.getid_tipo_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUnidad(this.getunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.unidad==null) {
						this.unidad = new Unidad();
					}

					this.setVariablesFormularioToObjetoActualUnidad(this.unidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
				}

				if(this.unidad.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.unidad.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsiglasUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUnidad(this.getunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.unidad==null) {
						this.unidad = new Unidad();
					}

					this.setVariablesFormularioToObjetoActualUnidad(this.unidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);
				}

				if(this.unidad.getsiglas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where siglas like '%"+this.unidad.getsiglas()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUnidad(false,false);

			this.getUnidadsBusquedaPorNombre();

			this.inicializarActualizarBindingUnidad(false);

			//if(UnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorSiglasUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUnidad(false,false);

			this.getUnidadsBusquedaPorSiglas();

			this.inicializarActualizarBindingUnidad(false);

			//if(UnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUnidad(false,false);

			this.getUnidadsFK_IdEmpresa();

			this.inicializarActualizarBindingUnidad(false);

			//if(UnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoUnidadUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUnidad(false,false);

			this.getUnidadsFK_IdTipoUnidad();

			this.inicializarActualizarBindingUnidad(false);

			//if(UnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.unidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameUnidad() {
		if(this.jInternalFrameDetalleFormUnidad!=null) {
		

		if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormUnidad!=null) {
			this.jInternalFrameDetalleFormUnidad.setVisible(false);	    			
			this.jInternalFrameDetalleFormUnidad.dispose();
			this.jInternalFrameDetalleFormUnidad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoUnidad!=null) {
			this.jInternalFrameReporteDinamicoUnidad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoUnidad.dispose();
			this.jInternalFrameReporteDinamicoUnidad=null;
		}
		
		if(this.jInternalFrameImportacionUnidad!=null) {
			this.jInternalFrameImportacionUnidad.setVisible(false);	    			
			this.jInternalFrameImportacionUnidad.dispose();
			this.jInternalFrameImportacionUnidad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessUnidad();
			
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			
			
			if(sTipo.equals("NuevoUnidad")) {
				jButtonNuevoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarUnidad")) {
				jButtonDuplicarUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarUnidad")) {
				jButtonCopiarUnidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormUnidad")) {
				jButtonVerFormUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarUnidad")) {
				jButtonNuevoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarUnidad")) {
				jButtonDuplicarUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoUnidad")) {
				jButtonNuevoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarUnidad")) {
				jButtonDuplicarUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesUnidad")) {
				jButtonNuevoUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarUnidad")) {
				jButtonNuevoUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesUnidad")) {
				jButtonNuevoUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarUnidad")) {
				jButtonModificarUnidadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarUnidad")) {
				jButtonModificarUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarUnidad")) {
				jButtonModificarUnidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarUnidad")) {
				jButtonActualizarUnidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarUnidad")) {
				jButtonActualizarUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarUnidad")) {
				jButtonActualizarUnidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarUnidad")) {
				jButtonEliminarUnidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarUnidad")) {
				jButtonEliminarUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarUnidad")) {
				jButtonEliminarUnidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarUnidad")) {
				jButtonCancelarUnidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarUnidad")) {
				jButtonCancelarUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarUnidad")) {
				jButtonCancelarUnidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarUnidad")) {
				jButtonCerrarUnidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarUnidad")) {
				jButtonCerrarUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarUnidad")) {
				jButtonCerrarUnidadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarUnidad")) {
				jButtonMostrarOcultarUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarUnidad")) {
				jButtonCancelarUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosUnidad")) {
				jButtonGuardarCambiosUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarUnidad")) {
				jButtonGuardarCambiosUnidadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarUnidad")) {
				jButtonCopiarUnidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarUnidad")) {
				jButtonVerFormUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosUnidad")) {
				jButtonGuardarCambiosUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarUnidad")) {
				jButtonCopiarUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormUnidad")) {
				jButtonVerFormUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaUnidad")) {
				jButtonGuardarCambiosUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarUnidad")) {
				jButtonGuardarCambiosUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaUnidad")) {
				jButtonGuardarCambiosUnidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionUnidad")) {
				jButtonRecargarInformacionUnidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarUnidad")) {
				jButtonRecargarInformacionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionUnidad")) {
				jButtonRecargarInformacionUnidadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresUnidad")) {
				jButtonAnterioresUnidadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarUnidad")) {
				jButtonAnterioresUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreUnidad")) {
				jButtonAnterioresUnidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesUnidad")) {
				jButtonSiguientesUnidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarUnidad")) {
				jButtonSiguientesUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesUnidad")) {
				jButtonSiguientesUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByUnidad") || sTipo.equals("MenuItemDetalleAbrirOrderByUnidad")) {
				jButtonAbrirOrderByUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarUnidad") || sTipo.equals("MenuItemDetalleMostrarOcultarUnidad")) {
				jButtonMostrarOcultarUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosUnidad")) {
				jButtonNuevoGuardarCambiosUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarUnidad")) {
				jButtonNuevoGuardarCambiosUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosUnidad")) {
				jButtonNuevoGuardarCambiosUnidadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoUnidad")) {
				jButtonCerrarReporteDinamicoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoUnidad")) {
				jButtonGenerarReporteDinamicoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoUnidad")) {
				
				jButtonGenerarExcelReporteDinamicoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionUnidad")) {
				jButtonCerrarImportacionUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionUnidad")) {
				
				jButtonGenerarImportacionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionUnidad")) {
				
				jButtonAbrirImportacionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesUnidad")) {
				jComboBoxTiposAccionesUnidadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesUnidad")) {
				jComboBoxTiposRelacionesUnidadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioUnidad")) {
				jComboBoxTiposAccionesUnidadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarUnidad")) {
				
				jComboBoxTiposSeleccionarUnidadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralUnidad")) {
				jTextFieldValorCampoGeneralUnidadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByUnidad")) {
				jButtonAbrirOrderByUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarUnidad")) {
				jButtonAbrirOrderByUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByUnidad")) {
				jButtonCerrarOrderByUnidadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUnidadBusqueda")) {
				this.jButtonidUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaUnidadUpdate")) {
				this.jButtonid_empresaUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaUnidadBusqueda")) {
				this.jButtonid_empresaUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_unidadUnidadUpdate")) {
				this.jButtonid_tipo_unidadUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_unidadUnidadBusqueda")) {
				this.jButtonid_tipo_unidadUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreUnidadBusqueda")) {
				this.jButtonnombreUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasUnidadBusqueda")) {
				this.jButtonsiglasUnidadBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreUnidad")) {
				this.jButtonBusquedaPorNombreUnidadActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorSiglasUnidad")) {
				this.jButtonBusquedaPorSiglasUnidadActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoUnidadUnidad")) {
				this.jButtonFK_IdTipoUnidadUnidadActionPerformed(evt);
			}
			
			;
			
			
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessUnidad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUnidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.unidad);
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
				


				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Unidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Unidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Unidad unidadLocal=null;
			
			if(!this.getEsControlTabla()) {
				unidadLocal=this.unidad;
			} else {
				unidadLocal=this.unidadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.unidad);
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
							
				
				


				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Unidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Unidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadAnterior =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.unidadAnterior =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
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
			
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			
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
			
			


			
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUnidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.unidad);
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
								
						
				


				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Unidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Unidad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.unidad);
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
								
				
				


				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Unidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Unidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadAnterior =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.unidadAnterior =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.unidad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadAnterior =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.unidadAnterior =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUnidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.unidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.unidad);
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
							
				
				


				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Unidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Unidad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUnidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUnidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.unidadAnterior =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.unidadAnterior =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
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
			
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			
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
			
			


			
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUnidadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.unidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.unidad);
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
								
				
				


				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Unidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Unidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadAnterior =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.unidadAnterior =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUnidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.unidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUnidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.unidad);
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosUnidad")) {
					jCheckBoxSeleccionarTodosUnidadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosUnidad")) {
					jCheckBoxSeleccionadosUnidadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarUnidad")) {
					
				}
				
				


				
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Unidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Unidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.unidad);
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
												
				
				


				
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Unidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Unidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUnidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUnidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.unidadAnterior =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.unidadAnterior =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUnidadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.unidad);
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
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
			
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
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
			
			


			
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUnidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.unidad);
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Unidad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Unidad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.unidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.unidad);
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
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
				
				


				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Unidad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Unidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.unidadAnterior =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.unidadAnterior =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarUnidad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosUnidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosUnidad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.unidad =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.unidad =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.unidad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarUnidad")) {
				
				}
				
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarUnidad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosUnidad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarUnidad")) {
			
			}
			
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessUnidad();
			
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			
			if(sTipo.equals("NuevoUnidad")) {
				jButtonNuevoUnidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarUnidad")) {
				jButtonDuplicarUnidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarUnidad")) {
				jButtonCopiarUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormUnidad")) {
				jButtonVerFormUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesUnidad")) {
				jButtonNuevoUnidadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarUnidad")) {
				jButtonModificarUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarUnidad")) {
				jButtonActualizarUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarUnidad")) {
				jButtonEliminarUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaUnidad")) {
				jButtonGuardarCambiosUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarUnidad")) {
				jButtonCancelarUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarUnidad")) {
				jButtonCerrarUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosUnidad")) {
				jButtonGuardarCambiosUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosUnidad")) {
				jButtonNuevoGuardarCambiosUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByUnidad")) {
				jButtonAbrirOrderByUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionUnidad")) {
				jButtonRecargarInformacionUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresUnidad")) {
				jButtonAnterioresUnidadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesUnidad")) {
				jButtonSiguientesUnidadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUnidadBusqueda")) {
				this.jButtonidUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaUnidadUpdate")) {
				this.jButtonid_empresaUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaUnidadBusqueda")) {
				this.jButtonid_empresaUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_unidadUnidadUpdate")) {
				this.jButtonid_tipo_unidadUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_unidadUnidadBusqueda")) {
				this.jButtonid_tipo_unidadUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreUnidadBusqueda")) {
				this.jButtonnombreUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasUnidadBusqueda")) {
				this.jButtonsiglasUnidadBusquedaActionPerformed(evt);
			}
			
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessUnidad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameUnidad")) {
				closingInternalFrameUnidad();
				
			} else if(sTipo.equals("jButtonCancelarUnidad")) {
				JInternalFrameBase jInternalFrameDetalleFormUnidad = (JInternalFrameBase)evt.getSource();
	            	
	            UnidadBeanSwingJInternalFrame jInternalFrameParent=(UnidadBeanSwingJInternalFrame)jInternalFrameDetalleFormUnidad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarUnidadActionPerformed(null);
			}
			
			UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.unidad,new Object(),this.unidadParameterGeneral,this.unidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormUnidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormUnidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormUnidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.unidad)) {
			if(!esControlTabla) {
				if(UnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualUnidad(this.unidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);			
				}
				
				if(this.unidadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualUnidad(this.unidad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.unidadReturnGeneral=unidadLogic.procesarEventosUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.unidadLogic.getUnidads(),this.unidad,this.unidadParameterGeneral,this.isEsNuevoUnidad,classes);//this.unidadLogic.getUnidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanUnidad(this.unidadReturnGeneral,this.unidadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.unidadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanUnidad(classes,this.unidadReturnGeneral,this.unidadBean,false);
					}
						
					if(this.unidadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyUnidad(this.unidadReturnGeneral.getUnidad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioUnidad(this.unidadReturnGeneral.getUnidad());	
					}
						
					if(this.unidadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioUnidad(this.unidadReturnGeneral.getUnidad(),classes);//this.unidadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioUnidad(this.unidad,classes);//this.unidadBean);									
				}
			
				if(UnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualUnidad(this.unidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUnidad(this.unidad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.unidadAnterior!=null) {
						this.unidad=this.unidadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.unidadReturnGeneral=unidadLogic.procesarEventosUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.unidadLogic.getUnidads(),this.unidad,this.unidadParameterGeneral,this.isEsNuevoUnidad,classes);//this.unidadLogic.getUnidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.unidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.unidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.unidadReturnGeneral.getUnidad(),unidadLogic.getUnidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.unidadReturnGeneral.getUnidad(),this.unidads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosUnidad.repaint();
				
				//((AbstractTableModel) this.jTableDatosUnidad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosUnidad();
			}
		}
	}
	
	public void actualizarVisualTableDatosUnidad() throws Exception {
		
		UnidadModel unidadModel=(UnidadModel)this.jTableDatosUnidad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			unidadModel.unidads=this.unidadLogic.getUnidads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			unidadModel.unidads=this.unidads;
		}
		
		
		((UnidadModel) this.jTableDatosUnidad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaUnidad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getunidadAnterior(),this.unidadLogic.getUnidads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getunidadAnterior(),this.unidads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosUnidad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioUnidad(Unidad unidad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.setProductos(unidad.getProductos());
					this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ConversionInven.class)) {
					this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.setConversionInvens(unidad.getConversionInvenConversions());
					this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaConversionInven(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(RangoUnidadVenta.class)) {
					this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.setRangoUnidadVentas(unidad.getRangoUnidadVentas());
					this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRangoUnidadVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ValorPorUnidad.class)) {
					this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.setValorPorUnidads(unidad.getValorPorUnidads());
					this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaValorPorUnidad(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
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
										
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.unidad,new Object(),generalEntityParameterGeneral,this.unidadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.unidadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=UnidadConstantesFunciones.getClassesRelationshipsOfUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=UnidadConstantesFunciones.getClassesRelationshipsFromStringsOfUnidad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormUnidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				UnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.unidad,new Object(),generalEntityParameterGeneral,this.unidadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioUnidad(UnidadBean unidadBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.setProductos(unidad.getProductos());
					this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ConversionInven.class)) {
					this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.setConversionInvens(unidad.getConversionInvenConversions());
					this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaConversionInven(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(RangoUnidadVenta.class)) {
					this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.setRangoUnidadVentas(unidad.getRangoUnidadVentas());
					this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRangoUnidadVenta(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ValorPorUnidad.class)) {
					this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.setValorPorUnidads(unidad.getValorPorUnidads());
					this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaValorPorUnidad(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanUnidad(ArrayList<Classe> classes,UnidadReturnGeneral unidadReturnGeneral,UnidadBean unidadBean,Boolean conDefault) throws Exception {
		
			this.unidadBean.setProductos(unidadReturnGeneral.getUnidad().getProductos());
			this.unidadBean.setConversionInvens(unidadReturnGeneral.getUnidad().getConversionInvens());
			this.unidadBean.setRangoUnidadVentas(unidadReturnGeneral.getUnidad().getRangoUnidadVentas());
			this.unidadBean.setValorPorUnidads(unidadReturnGeneral.getUnidad().getValorPorUnidads());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualUnidad(Unidad unidad,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Producto.class)) {
					unidad.setProductos(this.jInternalFrameDetalleFormUnidad.productoBeanSwingJInternalFrame.productoLogic.getProductos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ConversionInven.class)) {
					unidad.setConversionInvenConversions(this.jInternalFrameDetalleFormUnidad.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(RangoUnidadVenta.class)) {
					unidad.setRangoUnidadVentas(this.jInternalFrameDetalleFormUnidad.rangounidadventaBeanSwingJInternalFrame.rangounidadventaLogic.getRangoUnidadVentas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ValorPorUnidad.class)) {
					unidad.setValorPorUnidads(this.jInternalFrameDetalleFormUnidad.valorporunidadBeanSwingJInternalFrame.valorporunidadLogic.getValorPorUnidads());
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
		if(!paraTabla && !this.permiteMantenimiento(this.unidad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormUnidad = new UnidadDetalleFormJInternalFrame(jDesktopPane,this.unidadSessionBean.getConGuardarRelaciones(),this.unidadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormUnidad);
		this.jInternalFrameDetalleFormUnidad.setVisible(false);
		this.jInternalFrameDetalleFormUnidad.setSelected(false);						
		
		this.jInternalFrameDetalleFormUnidad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormUnidad.unidadLogic=this.unidadLogic;
		
		this.cargarCombosFrameForeignKeyUnidad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleUnidad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUnidad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyUnidad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyUnidad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormUnidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUnidad"));
		
		this.jInternalFrameDetalleFormUnidad.jButtonModificarUnidad.addActionListener(new ButtonActionListener(this,"ModificarUnidad"));

		
		this.jInternalFrameDetalleFormUnidad.jButtonModificarToolBarUnidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarUnidad"));
					
		this.jInternalFrameDetalleFormUnidad.jMenuItemModificarUnidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormUnidad.jButtonActualizarUnidad.addActionListener (new ButtonActionListener(this,"ActualizarUnidad"));
		
		
		this.jInternalFrameDetalleFormUnidad.jButtonActualizarToolBarUnidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUnidad"));
						
		this.jInternalFrameDetalleFormUnidad.jMenuItemActualizarUnidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormUnidad.jButtonEliminarUnidad.addActionListener (new ButtonActionListener(this,"EliminarUnidad"));
		
		
		this.jInternalFrameDetalleFormUnidad.jButtonEliminarToolBarUnidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarUnidad"));
								
		this.jInternalFrameDetalleFormUnidad.jMenuItemEliminarUnidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormUnidad.jButtonCancelarUnidad.addActionListener (new ButtonActionListener(this,"CancelarUnidad"));
		
		
		this.jInternalFrameDetalleFormUnidad.jButtonCancelarToolBarUnidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarUnidad"));
					
		this.jInternalFrameDetalleFormUnidad.jMenuItemCancelarUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUnidad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormUnidad.jMenuItemDetalleCerrarUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormUnidad.jButtonGuardarCambiosToolBarUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUnidad"));
		
		
		
		this.jInternalFrameDetalleFormUnidad.jButtonGuardarCambiosToolBarUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUnidad"));
		
		
		
		this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUnidad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonidUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUnidad.jButtonid_empresaUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonid_empresaUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUnidad.jButtonid_tipo_unidadUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_unidadUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonid_tipo_unidadUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_unidadUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonnombreUnidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonsiglasUnidadBusqueda.addActionListener(new ButtonActionListener(this,"siglasUnidadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormUnidad.jTabbedPaneRelacionesUnidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUnidad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameUnidad"));
		
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUnidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUnidad"));
		}
		
		this.jTableDatosUnidad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarUnidad"));
		
		this.jTableDatosUnidad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarUnidad"));
		
		this.jButtonNuevoUnidad.addActionListener(new ButtonActionListener(this,"NuevoUnidad"));
		
		this.jButtonDuplicarUnidad.addActionListener(new ButtonActionListener(this,"DuplicarUnidad"));
		
		this.jButtonCopiarUnidad.addActionListener(new ButtonActionListener(this,"CopiarUnidad"));
		
		this.jButtonVerFormUnidad.addActionListener(new ButtonActionListener(this,"VerFormUnidad"));
		
		
		this.jButtonNuevoToolBarUnidad.addActionListener(new ButtonActionListener(this,"NuevoToolBarUnidad"));
			
		this.jButtonDuplicarToolBarUnidad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarUnidad"));
			
		this.jMenuItemNuevoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoUnidad"));
			
		this.jMenuItemDuplicarUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarUnidad"));		
		
		
		this.jButtonNuevoRelacionesUnidad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesUnidad"));
		
		
		this.jButtonNuevoRelacionesToolBarUnidad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarUnidad"));
			
		this.jMenuItemNuevoRelacionesUnidad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesUnidad"));		
		
		
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUnidad.jButtonModificarUnidad.addActionListener(new ButtonActionListener(this,"ModificarUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUnidad.jButtonModificarToolBarUnidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarUnidad"));
			
			this.jInternalFrameDetalleFormUnidad.jMenuItemModificarUnidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormUnidad.jButtonActualizarUnidad.addActionListener (new ButtonActionListener(this,"ActualizarUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUnidad.jButtonActualizarToolBarUnidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUnidad"));
				
			this.jInternalFrameDetalleFormUnidad.jMenuItemActualizarUnidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUnidad.jButtonEliminarUnidad.addActionListener (new ButtonActionListener(this,"EliminarUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUnidad.jButtonEliminarToolBarUnidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarUnidad"));
						
			this.jInternalFrameDetalleFormUnidad.jMenuItemEliminarUnidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUnidad.jButtonCancelarUnidad.addActionListener (new ButtonActionListener(this,"CancelarUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUnidad.jButtonCancelarToolBarUnidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarUnidad"));
			
			this.jInternalFrameDetalleFormUnidad.jMenuItemCancelarUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUnidad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarUnidad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarUnidad"));		
		
		
		this.jButtonCerrarUnidad.addActionListener (new ButtonActionListener(this,"CerrarUnidad"));
		
		
		this.jButtonCerrarToolBarUnidad.addActionListener (new ButtonActionListener(this,"CerrarToolBarUnidad"));
			
		this.jMenuItemCerrarUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarUnidad"));
			
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUnidad.jMenuItemDetalleCerrarUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUnidad.jButtonGuardarCambiosUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUnidad.jButtonGuardarCambiosToolBarUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUnidad"));
		}
		
		this.jButtonCopiarToolBarUnidad.addActionListener (new ButtonActionListener(this,"CopiarToolBarUnidad"));
			
		this.jButtonVerFormToolBarUnidad.addActionListener (new ButtonActionListener(this,"VerFormToolBarUnidad"));
		
		this.jMenuItemGuardarCambiosUnidad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosUnidad"));
			
		this.jMenuItemCopiarUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarUnidad"));		
		
		this.jMenuItemVerFormUnidad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormUnidad"));		
		
		
		this.jButtonGuardarCambiosTablaUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUnidad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarUnidad"));
			
		this.jMenuItemGuardarCambiosTablaUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUnidad"));		
		
		
		
		this.jButtonRecargarInformacionUnidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionUnidad"));
					
		this.jButtonRecargarInformacionToolBarUnidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarUnidad"));
		
		this.jMenuItemRecargarInformacionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionUnidad"));		
		
		
		
		this.jButtonAnterioresUnidad.addActionListener (new ButtonActionListener(this,"AnterioresUnidad"));
		
		
		this.jButtonAnterioresToolBarUnidad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarUnidad"));
		
		this.jMenuItemAnterioresUnidad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresUnidad"));		
		
		
		this.jButtonSiguientesUnidad.addActionListener (new ButtonActionListener(this,"SiguientesUnidad"));
		
		
		this.jButtonSiguientesToolBarUnidad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarUnidad"));
			
		this.jMenuItemSiguientesUnidad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesUnidad"));
			
		this.jMenuItemAbrirOrderByUnidad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByUnidad"));
			
		this.jMenuItemMostrarOcultarUnidad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarUnidad"));
			
		this.jMenuItemDetalleAbrirOrderByUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByUnidad"));
			
		this.jMenuItemDetalleMostarOcultarUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarUnidad"));		
		
		
		this.jButtonNuevoGuardarCambiosUnidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosUnidad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarUnidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarUnidad"));
			
		this.jMenuItemNuevoGuardarCambiosUnidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosUnidad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosUnidad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosUnidad"));

		this.jCheckBoxSeleccionadosUnidad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosUnidad"));
		
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUnidad"));
		}
		
		
		this.jComboBoxTiposRelacionesUnidad.addActionListener (new ButtonActionListener(this,"TiposRelacionesUnidad"));
			
		this.jComboBoxTiposAccionesUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesUnidad"));
					
		this.jComboBoxTiposSeleccionarUnidad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarUnidad"));
			
		this.jTextFieldValorCampoGeneralUnidad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralUnidad"));		
		
		
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonidUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUnidad.jButtonid_empresaUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonid_empresaUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUnidad.jButtonid_tipo_unidadUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_unidadUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonid_tipo_unidadUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_unidadUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonnombreUnidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonsiglasUnidadBusqueda.addActionListener(new ButtonActionListener(this,"siglasUnidadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreUnidad.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreUnidad"));

			this.jButtonBusquedaPorSiglasUnidad.addActionListener(new ButtonActionListener(this,"BusquedaPorSiglasUnidad"));

			this.jButtonFK_IdTipoUnidadUnidad.addActionListener(new ButtonActionListener(this,"FK_IdTipoUnidadUnidad"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoUnidad!=null) {
				this.jInternalFrameReporteDinamicoUnidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUnidad"));
				this.jInternalFrameReporteDinamicoUnidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUnidad"));
				this.jInternalFrameReporteDinamicoUnidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUnidad"));
			}
			
			//this.jButtonCerrarReporteDinamicoUnidad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUnidad"));				
			//this.jButtonGenerarReporteDinamicoUnidad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUnidad"));
			//this.jButtonGenerarExcelReporteDinamicoUnidad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUnidad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionUnidad!=null) {
				this.jInternalFrameImportacionUnidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUnidad"));
				this.jInternalFrameImportacionUnidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUnidad"));
				this.jInternalFrameImportacionUnidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUnidad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByUnidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByUnidad"));
			
			this.jButtonAbrirOrderByToolBarUnidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarUnidad"));			
			
			if(this.jInternalFrameOrderByUnidad!=null) {
				this.jInternalFrameOrderByUnidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUnidad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUnidad.jTabbedPaneRelacionesUnidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUnidad"));
		
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
            		closingInternalFrameUnidad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormUnidad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormUnidad = (JInternalFrameBase)event.getSource();
	            	
	            UnidadBeanSwingJInternalFrame jInternalFrameParent=(UnidadBeanSwingJInternalFrame)jInternalFrameDetalleFormUnidad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarUnidadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosUnidad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosUnidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosUnidad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosUnidad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoUnidad";
		inputMap = this.jButtonNuevoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUnidadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesUnidad";
		inputMap = this.jButtonNuevoRelacionesUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUnidadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarUnidad";
		inputMap = this.jButtonModificarUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarUnidad";
		inputMap = this.jButtonActualizarUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarUnidad";
		inputMap = this.jButtonEliminarUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarUnidad";
		inputMap = this.jButtonCancelarUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarUnidad";
		inputMap = this.jButtonCerrarUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormUnidad.jButtonGuardarCambiosUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosUnidad";
		inputMap = this.jInternalFrameDetalleFormUnidad.jButtonGuardarCambiosUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormUnidad.jButtonGuardarCambiosUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosUnidad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosUnidadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonidUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUnidad.jButtonid_empresaUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonid_empresaUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUnidad.jButtonid_tipo_unidadUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_unidadUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonid_tipo_unidadUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_unidadUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonnombreUnidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUnidad.jButtonsiglasUnidadBusqueda.addActionListener(new ButtonActionListener(this,"siglasUnidadBusqueda"));
		
		
		this.jButtonBusquedaPorNombreUnidad.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreUnidad"));

		this.jButtonBusquedaPorSiglasUnidad.addActionListener(new ButtonActionListener(this,"BusquedaPorSiglasUnidad"));

		this.jButtonFK_IdTipoUnidadUnidad.addActionListener(new ButtonActionListener(this,"FK_IdTipoUnidadUnidad"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarUnidadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarUnidad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosUnidad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Unidad unidadAux:this.unidadLogic.getUnidads()) {
					unidadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Unidad unidadAux:unidads) {
					unidadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosUnidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUnidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Unidad unidadAux:this.unidadLogic.getUnidads()) {
						unidadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Unidad unidadAux:unidads) {
						unidadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Unidad unidadAux:this.unidadLogic.getUnidads()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Unidad unidadAux:unidads) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaUnidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUnidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUnidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUnidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosUnidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUnidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosUnidad.getSelectedRows();
			
			Unidad unidadLocal=new Unidad();
			
			//this.seleccionarTodosUnidad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLocal =(Unidad) this.unidadLogic.getUnidads().toArray()[this.jTableDatosUnidad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					unidadLocal =(Unidad) this.unidads.toArray()[this.jTableDatosUnidad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				unidadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Unidad unidadAux:this.unidadLogic.getUnidads()) {
						unidadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Unidad unidadAux:unidads) {
						unidadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaUnidad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUnidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUnidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUnidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualUnidadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarUnidadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralUnidadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingUnidad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralUnidad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Unidad unidadAux:this.unidadLogic.getUnidads()) {
				
						if(sTipoSeleccionar.equals(UnidadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							unidadAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UnidadConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							unidadAux.setsiglas(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Unidad unidadAux:unidads) {
					
						if(sTipoSeleccionar.equals(UnidadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							unidadAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UnidadConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							unidadAux.setsiglas(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaUnidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesUnidadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingUnidad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioUnidad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesUnidad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteUnidad) {				
					conSplash=true;//false;										
					
					//this.startProcessUnidad(conSplash);
				
					this.generarReporteUnidadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoUnidadsSeleccionados();
				//this.jComboBoxTiposAccionesUnidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUnidadsSeleccionados(false);
				//this.jComboBoxTiposAccionesUnidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUnidadsSeleccionados(true);
				//this.jComboBoxTiposAccionesUnidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUnidad();
				
				this.exportarUnidadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionUnidads();
				//this.importarUnidads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUnidad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelUnidadsSeleccionados();
				//this.jComboBoxTiposAccionesUnidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessUnidad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoUnidad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyUnidad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Unidad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.setSelectedIndex(0);					
				}	
			} 			
			else if(UnidadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteUnidad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessUnidad(conSplash);
					
						//this.actualizarParametrosGeneralUnidad();
						
						this.generarReporteProcesoAccionUnidadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesUnidad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(UnidadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO UnidadES SELECCIONADOS?", "MANTENIMIENTO DE Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessUnidad();
				
						this.actualizarParametrosGeneralUnidad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.unidadReturnGeneral=unidadLogic.procesarAccionUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.unidadLogic.getUnidads(),this.unidadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarUnidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUnidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralUnidad();
					
					UnidadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarUnidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUnidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUnidad.jComboBoxTiposAccionesFormularioUnidad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessUnidad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesUnidadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessUnidad();
			
			if(this.jInternalFrameDetalleFormUnidad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Unidad> unidadsSeleccionados=new ArrayList<Unidad>();		
			Unidad unidad=new Unidad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingUnidad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesUnidad.getSelectedItem();
			
			
			
			
			unidadsSeleccionados=this.getUnidadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(unidadsSeleccionados.size()==1) {
				for(Unidad unidadAux:unidadsSeleccionados) {
					unidad=unidadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Producto")) {
					jButtonProductoActionPerformed(null,rowIndex,true,false,unidad);
				}
				else if(this.sTipoRelacion.equals("Conversion Inven")) {
					jButtonConversionInvenActionPerformed(null,rowIndex,true,false,unidad);
				}
				else if(this.sTipoRelacion.equals("Rango Unidad Venta")) {
					jButtonRangoUnidadVentaActionPerformed(null,rowIndex,true,false,unidad);
				}
				else if(this.sTipoRelacion.equals("Valor Por Unidad")) {
					jButtonValorPorUnidadActionPerformed(null,rowIndex,true,false,unidad);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessUnidad();
			
      		//this.finishProcessUnidad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarUnidadReturnGeneral() throws Exception {
		if(this.unidadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.unidadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.unidadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.unidadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.unidadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.unidadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingUnidad(false);
		}
		
		if(this.unidadReturnGeneral.getConRetornoLista() || this.unidadReturnGeneral.getConRetornoObjeto()) {
			if(this.unidadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.unidadLogic.setUnidads(this.unidadReturnGeneral.getUnidads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.unidadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.unidadLogic.setUnidad(this.unidadReturnGeneral.getUnidad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingUnidad(false);
		}
	}
	
	public void actualizarParametrosGeneralUnidad() throws Exception {
		
		
	}
	
	public ArrayList<Unidad> getUnidadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Unidad> unidadsSeleccionados=new ArrayList<Unidad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioUnidad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Unidad unidadAux:unidadLogic.getUnidads()) {
					if(unidadAux.getIsSelected()) {
						unidadsSeleccionados.add(unidadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Unidad unidadAux:this.unidads) {
					if(unidadAux.getIsSelected()) {
						unidadsSeleccionados.add(unidadAux);				
					}
				}
			}
			
			if(unidadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						unidadsSeleccionados.addAll(this.unidadLogic.getUnidads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						unidadsSeleccionados.addAll(this.unidads);				
					}
				}
			}
		} else {
			unidadsSeleccionados.add(this.unidad);
		}
		
		return unidadsSeleccionados;
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
	
	public void generarReporteUnidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalUnidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoUnidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUnidadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUnidadsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesUnidadsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Unidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesUnidadsSeleccionados() throws Exception {
		ArrayList<Unidad> unidadsSeleccionados=new ArrayList<Unidad>();		
		
		unidadsSeleccionados=this.getUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteUnidads("Todos",unidadsSeleccionados);
		
	}	
	
	public void generarReporteNormalUnidadsSeleccionados() throws Exception {
		ArrayList<Unidad> unidadsSeleccionados=new ArrayList<Unidad>();		
		
		unidadsSeleccionados=this.getUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteUnidads("Todos",unidadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionUnidadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Unidad> unidadsSeleccionados=new ArrayList<Unidad>();
		
		unidadsSeleccionados=this.getUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteUnidads("Todos",unidadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoUnidadsSeleccionados() throws Exception {
		ArrayList<Unidad> unidadsSeleccionados=new ArrayList<Unidad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoUnidad();
		
		
		unidadsSeleccionados=this.getUnidadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoUnidad();
		
		
		//this.generarReporteUnidads("Todos",unidadsSeleccionados ,unidadImplementable,unidadImplementableHome);
	}
	
	public void mostrarImportacionUnidads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionUnidad();
		
		this.abrirFrameImportacionUnidad();		
		
			
		//this.generarReporteUnidads("Todos",unidadsSeleccionados ,unidadImplementable,unidadImplementableHome);
	}
	
	public void importarUnidads() throws Exception {		
	
	}
	
	public void exportarUnidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelUnidadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoUnidadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlUnidadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Unidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoUnidadsSeleccionados() throws Exception {
		ArrayList<Unidad> unidadsSeleccionados=new ArrayList<Unidad>();		
		
		unidadsSeleccionados=this.getUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"unidad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarUnidad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Unidad unidadAux:unidadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarUnidad(unidadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//unidadAux.setsDetalleGeneralEntityReporte(unidadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.unidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarUnidad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=UnidadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UnidadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UnidadConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UnidadConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UnidadConstantesFunciones.LABEL_SIGLAS;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarUnidad(Unidad unidad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=unidad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=unidad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=unidad.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=unidad.gettipounidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=unidad.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=unidad.getsiglas();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelUnidadsSeleccionados() throws Exception {
		ArrayList<Unidad> unidadsSeleccionados=new ArrayList<Unidad>();		
		
		unidadsSeleccionados=this.getUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"unidad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Unidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelUnidad(row);				
				iRow++;
			}				
			
			for(Unidad unidadAux:unidadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelUnidad(unidadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.unidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlUnidadsSeleccionados() throws Exception {
		ArrayList<Unidad> unidadsSeleccionados=new ArrayList<Unidad>();		
		
		unidadsSeleccionados=this.getUnidadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"unidad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("unidads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("unidad");
			//elementRoot.appendChild(element);
		
			for(Unidad unidadAux:unidadsSeleccionados) {
				element = document.createElement("unidad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlUnidad(unidadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.unidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelUnidad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(UnidadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(UnidadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(UnidadConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(UnidadConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(UnidadConstantesFunciones.LABEL_SIGLAS);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelUnidad(Unidad unidad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(unidad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(unidad.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(unidad.gettipounidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(unidad.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(unidad.getsiglas());				
	}
	
	public void setFilaDatosExportarXmlUnidad(Unidad unidad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(UnidadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(unidad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(UnidadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(unidad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(UnidadConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(unidad.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipounidad_descripcion = document.createElement(UnidadConstantesFunciones.IDTIPOUNIDAD);
		elementtipounidad_descripcion.appendChild(document.createTextNode(unidad.gettipounidad_descripcion()));
		element.appendChild(elementtipounidad_descripcion);

		Element elementnombre = document.createElement(UnidadConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(unidad.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementsiglas = document.createElement(UnidadConstantesFunciones.SIGLAS);
		elementsiglas.appendChild(document.createTextNode(unidad.getsiglas().trim()));
		element.appendChild(elementsiglas);
	}
	
	public void generarReporteGroupGenericoUnidadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Unidad> unidadsSeleccionados=new ArrayList<Unidad>();
		
		unidadsSeleccionados=this.getUnidadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoUnidad(unidadsSeleccionados);
		
		this.generarReporteUnidads("Todos",unidadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoUnidad(ArrayList<Unidad> unidadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Unidad unidadAux:unidadsSeleccionados) {
				unidadAux.setsDetalleGeneralEntityReporte(unidadAux.toString());
			
				if(sTipoSeleccionar.equals(UnidadConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					unidadAux.setsDescripcionGeneralEntityReporte1(unidadAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UnidadConstantesFunciones.LABEL_IDTIPOUNIDAD)) {
					existe=true;
					unidadAux.setsDescripcionGeneralEntityReporte1(unidadAux.gettipounidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UnidadConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					unidadAux.setsDescripcionGeneralEntityReporte1(unidadAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(UnidadConstantesFunciones.LABEL_SIGLAS)) {
					existe=true;
					unidadAux.setsDescripcionGeneralEntityReporte1(unidadAux.getsiglas());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesUnidad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoUnidad=true;
				this.isVisibilidadCeldaNuevoRelacionesUnidad=true;
				this.isVisibilidadCeldaGuardarCambiosUnidad=true;
			}
			
			this.isVisibilidadCeldaModificarUnidad=false;
			this.isVisibilidadCeldaActualizarUnidad=false;
			this.isVisibilidadCeldaEliminarUnidad=false;
			this.isVisibilidadCeldaCancelarUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarUnidad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosUnidad=false;
			this.isVisibilidadCeldaModificarUnidad=false;
			this.isVisibilidadCeldaActualizarUnidad=true;
			this.isVisibilidadCeldaEliminarUnidad=false;
			this.isVisibilidadCeldaCancelarUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarUnidad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosUnidad=false;
			this.isVisibilidadCeldaModificarUnidad=false;
			this.isVisibilidadCeldaActualizarUnidad=true;
			this.isVisibilidadCeldaEliminarUnidad=true;
			this.isVisibilidadCeldaCancelarUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarUnidad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosUnidad=false;
			this.isVisibilidadCeldaModificarUnidad=false;
			this.isVisibilidadCeldaActualizarUnidad=true;
			this.isVisibilidadCeldaEliminarUnidad=false;
			this.isVisibilidadCeldaCancelarUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarUnidad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesUnidad=true;
			this.isVisibilidadCeldaGuardarCambiosUnidad=true;
			this.isVisibilidadCeldaModificarUnidad=false;
			this.isVisibilidadCeldaActualizarUnidad=false;
			this.isVisibilidadCeldaEliminarUnidad=false;
			this.isVisibilidadCeldaCancelarUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarUnidad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosUnidad=false;
			this.isVisibilidadCeldaActualizarUnidad=false;
			this.isVisibilidadCeldaEliminarUnidad=false;
			this.isVisibilidadCeldaCancelarUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarUnidad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosUnidad=false;
			this.isVisibilidadCeldaModificarUnidad=true;
			this.isVisibilidadCeldaActualizarUnidad=false;
			this.isVisibilidadCeldaEliminarUnidad=false;
			this.isVisibilidadCeldaCancelarUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarUnidad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(UnidadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesUnidad=true;
			this.isVisibilidadCeldaGuardarCambiosUnidad=true;
		} else {
			this.actualizarEstadoPanelsUnidad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarUnidad=false;
			//this.isVisibilidadCeldaVerFormUnidad=false;
			this.isVisibilidadCeldaDuplicarUnidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!unidadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesUnidad=false;
		} else {
			this.isVisibilidadCeldaNuevoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosUnidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(unidadSessionBean.getEsGuardarRelacionado()) {
			if(!unidadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesUnidad=false;												
			}
			
			this.jButtonCerrarUnidad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesUnidad=false;
		}
		
		if(!this.permiteMantenimiento(this.unidad)) {
			this.isVisibilidadCeldaActualizarUnidad=false;
			this.isVisibilidadCeldaEliminarUnidad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesUnidad() {
		this.isVisibilidadCeldaNuevoUnidad=false;
		this.isVisibilidadCeldaGuardarCambiosUnidad=false;
	}
	
	public void actualizarEstadoPanelsUnidad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionUnidad!=null) {
				this.jScrollPanelDatosEdicionUnidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUnidad!=null) {
				this.jTabbedPaneBusquedasUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUnidad!=null) {
				this.jScrollPanelDatosUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionUnidad!=null) {
				this.jPanelPaginacionUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUnidad!=null) {
				this.jPanelParametrosReportesUnidad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionUnidad!=null) {
				this.jScrollPanelDatosEdicionUnidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUnidad!=null) {
				this.jTabbedPaneBusquedasUnidad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosUnidad!=null) {
				this.jScrollPanelDatosUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionUnidad!=null) {
				this.jPanelPaginacionUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUnidad!=null) {
				this.jPanelParametrosReportesUnidad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionUnidad!=null) {
				this.jScrollPanelDatosEdicionUnidad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUnidad!=null) {
				this.jTabbedPaneBusquedasUnidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUnidad!=null) {
				this.jScrollPanelDatosUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionUnidad!=null) {
				this.jPanelPaginacionUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUnidad!=null) {
				this.jPanelParametrosReportesUnidad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionUnidad!=null) {
				this.jScrollPanelDatosEdicionUnidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUnidad!=null) {
				this.jTabbedPaneBusquedasUnidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUnidad!=null) {
				this.jScrollPanelDatosUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionUnidad!=null) {
				this.jPanelPaginacionUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUnidad!=null) {
				this.jPanelParametrosReportesUnidad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionUnidad!=null) {
				this.jScrollPanelDatosEdicionUnidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUnidad!=null) {
				this.jTabbedPaneBusquedasUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUnidad!=null) {
				this.jScrollPanelDatosUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionUnidad!=null) {
				this.jPanelPaginacionUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUnidad!=null) {
				this.jPanelParametrosReportesUnidad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionUnidad!=null) {
				this.jScrollPanelDatosEdicionUnidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUnidad!=null) {
				this.jTabbedPaneBusquedasUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUnidad!=null) {
				this.jScrollPanelDatosUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionUnidad!=null) {
				this.jPanelPaginacionUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUnidad!=null) {
				this.jPanelParametrosReportesUnidad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionUnidad!=null) {
				this.jScrollPanelDatosEdicionUnidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUnidad!=null) {
				this.jTabbedPaneBusquedasUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUnidad!=null) {
				this.jScrollPanelDatosUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionUnidad!=null) {
				this.jPanelPaginacionUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUnidad!=null) {
				this.jPanelParametrosReportesUnidad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.unidadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasUnidad!=null) {
					this.jTabbedPaneBusquedasUnidad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesUnidad!=null) {
				this.jPanelParametrosReportesUnidad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.unidadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUnidad!=null) {
				this.jTabbedPaneBusquedasUnidad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesUnidad!=null) {
				this.jPanelParametrosReportesUnidad.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasUnidad.remove(jPanelBusquedaPorNombreUnidad);}

			this.isVisibilidadBusquedaPorSiglas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorSiglas) {this.jTabbedPaneBusquedasUnidad.remove(jPanelBusquedaPorSiglasUnidad);}

			this.isVisibilidadFK_IdTipoUnidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoUnidad) {this.jTabbedPaneBusquedasUnidad.remove(jPanelFK_IdTipoUnidadUnidad);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoUnidad(Boolean isParaTipoUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoUnidadNegation=!isParaTipoUnidad;

			this.isVisibilidadBusquedaPorNombre=isParaTipoUnidadNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasUnidad.remove(jPanelBusquedaPorNombreUnidad);}

			this.isVisibilidadBusquedaPorSiglas=isParaTipoUnidadNegation;
			if(!this.isVisibilidadBusquedaPorSiglas) {this.jTabbedPaneBusquedasUnidad.remove(jPanelBusquedaPorSiglasUnidad);}

			this.isVisibilidadFK_IdTipoUnidad=isParaTipoUnidad;
			if(!this.isVisibilidadFK_IdTipoUnidad) {this.jTabbedPaneBusquedasUnidad.remove(jPanelFK_IdTipoUnidadUnidad);}
		}
		
	}
	
	

	public String registrarSesionUnidadParaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(this.unidadSessionBean==null) {
				this.unidadSessionBean=new UnidadSessionBean();
			}

			if(this.jInternalFrameDetalleFormUnidad.productoSessionBean==null) {
				this.jInternalFrameDetalleFormUnidad.productoSessionBean=new ProductoSessionBean();
			}

			this.jInternalFrameDetalleFormUnidad.productoSessionBean.setsPathNavegacionActual(unidadSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormUnidad.productoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProducto=this.jInternalFrameDetalleFormUnidad.productoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormUnidad.productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			this.jInternalFrameDetalleFormUnidad.productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(UnidadConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormUnidad.productoSessionBean.setisBusquedaDesdeForeignKeySesionUnidad(true);
			this.jInternalFrameDetalleFormUnidad.productoSessionBean.setlidUnidadActual(this.idUnidadActual);

			unidadSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyUnidad(true);
			unidadSessionBean.setlIdUnidadActualForeignKey(this.idUnidadActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionUnidadConversionParaConversionInvenes() throws Exception {
		Boolean isPaginaPopupConversionInven=false;

		try {

			if(this.unidadSessionBean==null) {
				this.unidadSessionBean=new UnidadSessionBean();
			}

			if(this.jInternalFrameDetalleFormUnidad.conversioninvenSessionBean==null) {
				this.jInternalFrameDetalleFormUnidad.conversioninvenSessionBean=new ConversionInvenSessionBean();
			}

			this.jInternalFrameDetalleFormUnidad.conversioninvenSessionBean.setsPathNavegacionActual(unidadSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormUnidad.conversioninvenSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupConversionInven=this.jInternalFrameDetalleFormUnidad.conversioninvenSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormUnidad.conversioninvenSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeConversionInven(true);
			this.jInternalFrameDetalleFormUnidad.conversioninvenSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeConversionInven(UnidadConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormUnidad.conversioninvenSessionBean.setisBusquedaDesdeForeignKeySesionUnidadConversion(true);
			this.jInternalFrameDetalleFormUnidad.conversioninvenSessionBean.setlidUnidadConversionActual(this.idUnidadActual);

			unidadSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyUnidad(true);
			unidadSessionBean.setlIdUnidadActualForeignKey(this.idUnidadActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionUnidadParaRangoUnidadVentas() throws Exception {
		Boolean isPaginaPopupRangoUnidadVenta=false;

		try {

			if(this.unidadSessionBean==null) {
				this.unidadSessionBean=new UnidadSessionBean();
			}

			if(this.jInternalFrameDetalleFormUnidad.rangounidadventaSessionBean==null) {
				this.jInternalFrameDetalleFormUnidad.rangounidadventaSessionBean=new RangoUnidadVentaSessionBean();
			}

			this.jInternalFrameDetalleFormUnidad.rangounidadventaSessionBean.setsPathNavegacionActual(unidadSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+RangoUnidadVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormUnidad.rangounidadventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupRangoUnidadVenta=this.jInternalFrameDetalleFormUnidad.rangounidadventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormUnidad.rangounidadventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeRangoUnidadVenta(true);
			this.jInternalFrameDetalleFormUnidad.rangounidadventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeRangoUnidadVenta(UnidadConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormUnidad.rangounidadventaSessionBean.setisBusquedaDesdeForeignKeySesionUnidad(true);
			this.jInternalFrameDetalleFormUnidad.rangounidadventaSessionBean.setlidUnidadActual(this.idUnidadActual);

			unidadSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyUnidad(true);
			unidadSessionBean.setlIdUnidadActualForeignKey(this.idUnidadActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionUnidadParaValorPorUnidades() throws Exception {
		Boolean isPaginaPopupValorPorUnidad=false;

		try {

			if(this.unidadSessionBean==null) {
				this.unidadSessionBean=new UnidadSessionBean();
			}

			if(this.jInternalFrameDetalleFormUnidad.valorporunidadSessionBean==null) {
				this.jInternalFrameDetalleFormUnidad.valorporunidadSessionBean=new ValorPorUnidadSessionBean();
			}

			this.jInternalFrameDetalleFormUnidad.valorporunidadSessionBean.setsPathNavegacionActual(unidadSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormUnidad.valorporunidadSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupValorPorUnidad=this.jInternalFrameDetalleFormUnidad.valorporunidadSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormUnidad.valorporunidadSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeValorPorUnidad(true);
			this.jInternalFrameDetalleFormUnidad.valorporunidadSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeValorPorUnidad(UnidadConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormUnidad.valorporunidadSessionBean.setisBusquedaDesdeForeignKeySesionUnidad(true);
			this.jInternalFrameDetalleFormUnidad.valorporunidadSessionBean.setlidUnidadActual(this.idUnidadActual);

			unidadSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyUnidad(true);
			unidadSessionBean.setlIdUnidadActualForeignKey(this.idUnidadActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//UnidadSessionBean unidadSessionBean=new UnidadSessionBean();
		
		if(this.unidadSessionBean==null) {
			this.unidadSessionBean=new UnidadSessionBean();
		}
		
		this.unidadSessionBean.setsUltimaBusquedaUnidad(this.getsAccionBusqueda());
		this.unidadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.unidadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			unidadSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorSiglas")) {
			unidadSessionBean.setsiglas(this.getsiglasBusquedaPorSiglas());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			unidadSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoUnidad")) {
			unidadSessionBean.setid_tipo_unidad(this.getid_tipo_unidadFK_IdTipoUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//UnidadSessionBean unidadSessionBean=new UnidadSessionBean();
		
		if(this.unidadSessionBean==null) {
			this.unidadSessionBean=new UnidadSessionBean();
		}
		
		if(this.unidadSessionBean.getsUltimaBusquedaUnidad()!=null&&!this.unidadSessionBean.getsUltimaBusquedaUnidad().equals("")) {
			this.setsAccionBusqueda(unidadSessionBean.getsUltimaBusquedaUnidad());
			this.setiNumeroPaginacion(unidadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(unidadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(unidadSessionBean.getnombre());
				unidadSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorSiglas")) {
				this.setsiglasBusquedaPorSiglas(unidadSessionBean.getsiglas());
				unidadSessionBean.setsiglas("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(unidadSessionBean.getid_empresa());
				unidadSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoUnidad")) {
				this.setid_tipo_unidadFK_IdTipoUnidad(unidadSessionBean.getid_tipo_unidad());
				unidadSessionBean.setid_tipo_unidad(-1L);
			}
		}
		
		this.unidadSessionBean.setsUltimaBusquedaUnidad("");
		this.unidadSessionBean.setiNumeroPaginacion(UnidadConstantesFunciones.INUMEROPAGINACION);
		this.unidadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaUnidad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioUnidad() {
		this.updateBorderResaltarBusquedasFormularioUnidad();
		this.updateVisibilidadBusquedasFormularioUnidad();
		this.updateHabilitarBusquedasFormularioUnidad();
	}
	
	public void updateBorderResaltarBusquedasFormularioUnidad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasUnidad.getComponents().length>0) {
	

		if(this.unidadConstantesFunciones.resaltarBusquedaPorNombreUnidad!=null) {
			index= this.jTabbedPaneBusquedasUnidad.indexOfComponent(this.jPanelBusquedaPorNombreUnidad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUnidad.getComponent(index);
				jPanel.setBorder(this.unidadConstantesFunciones.resaltarBusquedaPorNombreUnidad);
			}
		}

		if(this.unidadConstantesFunciones.resaltarBusquedaPorSiglasUnidad!=null) {
			index= this.jTabbedPaneBusquedasUnidad.indexOfComponent(this.jPanelBusquedaPorSiglasUnidad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUnidad.getComponent(index);
				jPanel.setBorder(this.unidadConstantesFunciones.resaltarBusquedaPorSiglasUnidad);
			}
		}

		if(this.unidadConstantesFunciones.resaltarFK_IdTipoUnidadUnidad!=null) {
			index= this.jTabbedPaneBusquedasUnidad.indexOfComponent(this.jPanelFK_IdTipoUnidadUnidad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUnidad.getComponent(index);
				jPanel.setBorder(this.unidadConstantesFunciones.resaltarFK_IdTipoUnidadUnidad);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioUnidad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasUnidad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUnidad.indexOfComponent(this.jPanelBusquedaPorNombreUnidad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUnidad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.unidadConstantesFunciones.mostrarBusquedaPorNombreUnidad);
			if(!this.unidadConstantesFunciones.mostrarBusquedaPorNombreUnidad && index>-1) {
				this.jTabbedPaneBusquedasUnidad.remove(index);
			}

			index= this.jTabbedPaneBusquedasUnidad.indexOfComponent(this.jPanelBusquedaPorSiglasUnidad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUnidad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.unidadConstantesFunciones.mostrarBusquedaPorSiglasUnidad);
			if(!this.unidadConstantesFunciones.mostrarBusquedaPorSiglasUnidad && index>-1) {
				this.jTabbedPaneBusquedasUnidad.remove(index);
			}

			index= this.jTabbedPaneBusquedasUnidad.indexOfComponent(this.jPanelFK_IdTipoUnidadUnidad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUnidad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.unidadConstantesFunciones.mostrarFK_IdTipoUnidadUnidad);
			if(!this.unidadConstantesFunciones.mostrarFK_IdTipoUnidadUnidad && index>-1) {
				this.jTabbedPaneBusquedasUnidad.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioUnidad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasUnidad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUnidad.indexOfComponent(this.jPanelBusquedaPorNombreUnidad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUnidad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.unidadConstantesFunciones.activarBusquedaPorNombreUnidad);
				this.jTabbedPaneBusquedasUnidad.setEnabledAt(index,this.unidadConstantesFunciones.activarBusquedaPorNombreUnidad);
			}

			index= this.jTabbedPaneBusquedasUnidad.indexOfComponent(this.jPanelBusquedaPorSiglasUnidad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUnidad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.unidadConstantesFunciones.activarBusquedaPorSiglasUnidad);
				this.jTabbedPaneBusquedasUnidad.setEnabledAt(index,this.unidadConstantesFunciones.activarBusquedaPorSiglasUnidad);
			}

			index= this.jTabbedPaneBusquedasUnidad.indexOfComponent(this.jPanelFK_IdTipoUnidadUnidad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUnidad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.unidadConstantesFunciones.activarFK_IdTipoUnidadUnidad);
				this.jTabbedPaneBusquedasUnidad.setEnabledAt(index,this.unidadConstantesFunciones.activarFK_IdTipoUnidadUnidad);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaUnidad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasUnidad.indexOfComponent(this.jPanelBusquedaPorNombreUnidad);

			this.jTabbedPaneBusquedasUnidad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUnidad.getComponent(index);

			this.unidadConstantesFunciones.setResaltarBusquedaPorNombreUnidad(resaltar);

			jPanel.setBorder(this.unidadConstantesFunciones.resaltarBusquedaPorNombreUnidad);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorSiglas")) {
			index= this.jTabbedPaneBusquedasUnidad.indexOfComponent(this.jPanelBusquedaPorSiglasUnidad);

			this.jTabbedPaneBusquedasUnidad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUnidad.getComponent(index);

			this.unidadConstantesFunciones.setResaltarBusquedaPorSiglasUnidad(resaltar);

			jPanel.setBorder(this.unidadConstantesFunciones.resaltarBusquedaPorSiglasUnidad);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoUnidad")) {
			index= this.jTabbedPaneBusquedasUnidad.indexOfComponent(this.jPanelFK_IdTipoUnidadUnidad);

			this.jTabbedPaneBusquedasUnidad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUnidad.getComponent(index);

			this.unidadConstantesFunciones.setResaltarFK_IdTipoUnidadUnidad(resaltar);

			jPanel.setBorder(this.unidadConstantesFunciones.resaltarFK_IdTipoUnidadUnidad);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarUnidad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioUnidad() throws Exception {

		if(this.jInternalFrameDetalleFormUnidad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioUnidad();
		this.updateVisibilidadResaltarControlesFormularioUnidad();
		this.updateHabilitarResaltarControlesFormularioUnidad();
		
	}
	
	public void updateBorderResaltarControlesFormularioUnidad() throws Exception {
		if(this.jInternalFrameDetalleFormUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.unidadConstantesFunciones.resaltaridUnidad!=null && this.jInternalFrameDetalleFormUnidad!=null) {this.jInternalFrameDetalleFormUnidad.jLabelidUnidad.setBorder(this.unidadConstantesFunciones.resaltaridUnidad);}
		if(this.unidadConstantesFunciones.resaltarid_empresaUnidad!=null && this.jInternalFrameDetalleFormUnidad!=null) {this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad.setBorder(this.unidadConstantesFunciones.resaltarid_empresaUnidad);}
		if(this.unidadConstantesFunciones.resaltarid_tipo_unidadUnidad!=null && this.jInternalFrameDetalleFormUnidad!=null) {this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad.setBorder(this.unidadConstantesFunciones.resaltarid_tipo_unidadUnidad);}
		if(this.unidadConstantesFunciones.resaltarnombreUnidad!=null && this.jInternalFrameDetalleFormUnidad!=null) {this.jInternalFrameDetalleFormUnidad.jTextFieldnombreUnidad.setBorder(this.unidadConstantesFunciones.resaltarnombreUnidad);}
		if(this.unidadConstantesFunciones.resaltarsiglasUnidad!=null && this.jInternalFrameDetalleFormUnidad!=null) {this.jInternalFrameDetalleFormUnidad.jTextFieldsiglasUnidad.setBorder(this.unidadConstantesFunciones.resaltarsiglasUnidad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioUnidad() throws Exception {		
		if(this.jInternalFrameDetalleFormUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUnidad!=null) {
	
		//this.jInternalFrameDetalleFormUnidad.jLabelidUnidad.setVisible(this.unidadConstantesFunciones.mostraridUnidad);
		this.jInternalFrameDetalleFormUnidad.jPanelidUnidad.setVisible(this.unidadConstantesFunciones.mostraridUnidad);
		//this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad.setVisible(this.unidadConstantesFunciones.mostrarid_empresaUnidad);
		this.jInternalFrameDetalleFormUnidad.jPanelid_empresaUnidad.setVisible(this.unidadConstantesFunciones.mostrarid_empresaUnidad);
		//this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad.setVisible(this.unidadConstantesFunciones.mostrarid_tipo_unidadUnidad);
		this.jInternalFrameDetalleFormUnidad.jPanelid_tipo_unidadUnidad.setVisible(this.unidadConstantesFunciones.mostrarid_tipo_unidadUnidad);
		//this.jInternalFrameDetalleFormUnidad.jTextFieldnombreUnidad.setVisible(this.unidadConstantesFunciones.mostrarnombreUnidad);
		this.jInternalFrameDetalleFormUnidad.jPanelnombreUnidad.setVisible(this.unidadConstantesFunciones.mostrarnombreUnidad);
		//this.jInternalFrameDetalleFormUnidad.jTextFieldsiglasUnidad.setVisible(this.unidadConstantesFunciones.mostrarsiglasUnidad);
		this.jInternalFrameDetalleFormUnidad.jPanelsiglasUnidad.setVisible(this.unidadConstantesFunciones.mostrarsiglasUnidad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioUnidad() throws Exception {
		if(this.jInternalFrameDetalleFormUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUnidad!=null) {
	
		this.jInternalFrameDetalleFormUnidad.jLabelidUnidad.setEnabled(this.unidadConstantesFunciones.activaridUnidad);
		this.jInternalFrameDetalleFormUnidad.jComboBoxid_empresaUnidad.setEnabled(this.unidadConstantesFunciones.activarid_empresaUnidad);
		this.jInternalFrameDetalleFormUnidad.jComboBoxid_tipo_unidadUnidad.setEnabled(this.unidadConstantesFunciones.activarid_tipo_unidadUnidad);
		this.jInternalFrameDetalleFormUnidad.jTextFieldnombreUnidad.setEnabled(this.unidadConstantesFunciones.activarnombreUnidad);
		this.jInternalFrameDetalleFormUnidad.jTextFieldsiglasUnidad.setEnabled(this.unidadConstantesFunciones.activarsiglasUnidad);
		}
	}
	
		
}