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

import com.bydan.erp.inventario.util.CalidadProductoConstantesFunciones;
import com.bydan.erp.inventario.util.CalidadProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.CalidadProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.CalidadProductoBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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




@SuppressWarnings("unused")
public class CalidadProductoBeanSwingJInternalFrame extends CalidadProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CalidadProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CalidadProducto> calidadproductoValidator = new ClassValidator<CalidadProducto>(CalidadProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CalidadProducto calidadproducto;	
	public CalidadProducto calidadproductoAux;
	public CalidadProducto calidadproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CalidadProducto calidadproductoTotales;
	public Long idCalidadProductoActual;
	public Long iIdNuevoCalidadProducto=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosBodega=false;

	public Boolean getIsTienePermisosBodega() {
		return isTienePermisosBodega;
	}

	public void setIsTienePermisosBodega(Boolean isTienePermisosBodega) {
		this.isTienePermisosBodega= isTienePermisosBodega;
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
	
	public Boolean isPermisoTodoCalidadProducto;
	public Boolean isPermisoNuevoCalidadProducto;
	public Boolean isPermisoActualizarCalidadProducto;
	public Boolean isPermisoActualizarOriginalCalidadProducto;
	public Boolean isPermisoEliminarCalidadProducto;
	public Boolean isPermisoGuardarCambiosCalidadProducto;
	public Boolean isPermisoConsultaCalidadProducto;
	public Boolean isPermisoBusquedaCalidadProducto;
	public Boolean isPermisoReporteCalidadProducto;
	public Boolean isPermisoPaginacionMedioCalidadProducto;
	public Boolean isPermisoPaginacionAltoCalidadProducto;
	public Boolean isPermisoPaginacionTodoCalidadProducto;
	public Boolean isPermisoCopiarCalidadProducto;
	public Boolean isPermisoVerFormCalidadProducto;
	public Boolean isPermisoDuplicarCalidadProducto;
	public Boolean isPermisoOrdenCalidadProducto;
	
	
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
	
	public CalidadProductoParameterReturnGeneral calidadproductoReturnGeneral;
	public CalidadProductoParameterReturnGeneral calidadproductoParameterGeneral;
	
	

	public BodegaLogic bodegaLogic=null;

	public BodegaLogic getBodegaLogic() {
		return bodegaLogic;
	}

	public void setBodegaLogic(BodegaLogic bodegaLogic) {
		this.bodegaLogic = bodegaLogic;
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
	
	public Boolean isEsNuevoCalidadProducto=false;
	public Boolean esParaAccionDesdeFormularioCalidadProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CalidadProductoSessionBeanAdditional calidadproductoSessionBeanAdditional=null;
	
	public CalidadProductoSessionBeanAdditional getCalidadProductoSessionBeanAdditional() {
		return this.calidadproductoSessionBeanAdditional;
	}
	
	public void setCalidadProductoSessionBeanAdditional(CalidadProductoSessionBeanAdditional calidadproductoSessionBeanAdditional) {
		try {
			this.calidadproductoSessionBeanAdditional=calidadproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CalidadProductoBeanSwingJInternalFrameAdditional calidadproductoBeanSwingJInternalFrameAdditional=null;
	//public class CalidadProductoBeanSwingJInternalFrame
	
	public CalidadProductoBeanSwingJInternalFrameAdditional getCalidadProductoBeanSwingJInternalFrameAdditional() {
		return this.calidadproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setCalidadProductoBeanSwingJInternalFrameAdditional(CalidadProductoBeanSwingJInternalFrameAdditional calidadproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.calidadproductoBeanSwingJInternalFrameAdditional=calidadproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CalidadProductoLogic calidadproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CalidadProducto calidadproductoBean;
	public CalidadProductoConstantesFunciones calidadproductoConstantesFunciones;
	//public CalidadProductoParameterReturnGeneral calidadproductoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<CalidadProducto> calidadproductos;	
	//public List<CalidadProducto> calidadproductosEliminados;
	//public List<CalidadProducto> calidadproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCalidadProducto=false;
	public Boolean isVisibilidadCeldaDuplicarCalidadProducto=true;
	public Boolean isVisibilidadCeldaCopiarCalidadProducto=true;
	public Boolean isVisibilidadCeldaVerFormCalidadProducto=true;
	public Boolean isVisibilidadCeldaOrdenCalidadProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCalidadProducto=false;
	public Boolean isVisibilidadCeldaModificarCalidadProducto=false;
	public Boolean isVisibilidadCeldaActualizarCalidadProducto=false;
	public Boolean isVisibilidadCeldaEliminarCalidadProducto=false;
	public Boolean isVisibilidadCeldaCancelarCalidadProducto=false;
	public Boolean isVisibilidadCeldaGuardarCalidadProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCalidadProducto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoCalidadProducto() {
		return this.iIdNuevoCalidadProducto;
	}

	public void setiIdNuevoCalidadProducto(Long iIdNuevoCalidadProducto) {
		this.iIdNuevoCalidadProducto = iIdNuevoCalidadProducto;
	}
	
	public Long getidCalidadProductoActual() {
		return this.idCalidadProductoActual;
	}

	public void setidCalidadProductoActual(Long idCalidadProductoActual) {
		this.idCalidadProductoActual = idCalidadProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CalidadProducto getcalidadproducto() {
		return this.calidadproducto;
	}

	public void setcalidadproducto(CalidadProducto calidadproducto) {
		this.calidadproducto = calidadproducto;
	}
	
	public CalidadProducto getcalidadproductoAux() {
		return this.calidadproductoAux;
	}

	public void setcalidadproductoAux(CalidadProducto calidadproductoAux) {
		this.calidadproductoAux = calidadproductoAux;
	}				
	
	public CalidadProducto getcalidadproductoAnterior() {
		return this.calidadproductoAnterior;
	}

	public void setcalidadproductoAnterior(CalidadProducto calidadproductoAnterior) {
		this.calidadproductoAnterior = calidadproductoAnterior;
	}	
	
	public CalidadProducto getcalidadproductoTotales() {
		return this.calidadproductoTotales;
	}

	public void setcalidadproductoTotales(CalidadProducto calidadproductoTotales) {
		this.calidadproductoTotales = calidadproductoTotales;
	}	
	
	public CalidadProducto getcalidadproductoBean() {
		return this.calidadproductoBean;
	}

	public void setcalidadproductoBean(CalidadProducto calidadproductoBean) {
		this.calidadproductoBean = calidadproductoBean;
	}	
	
	public CalidadProductoParameterReturnGeneral getcalidadproductoReturnGeneral() {
		return this.calidadproductoReturnGeneral;
	}

	public void setcalidadproductoReturnGeneral(CalidadProductoParameterReturnGeneral calidadproductoReturnGeneral) {
		this.calidadproductoReturnGeneral = calidadproductoReturnGeneral;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CalidadProductoLogic getCalidadProductoLogic()	{		
		return calidadproductoLogic;
	}

	public void setCalidadProductoLogic(CalidadProductoLogic calidadproductoLogic) {
		this.calidadproductoLogic = calidadproductoLogic;
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
	
	public Boolean getIsEsNuevoCalidadProducto() {
		return isEsNuevoCalidadProducto;
	}

	public void setIsEsNuevoCalidadProducto(Boolean isEsNuevoCalidadProducto) {
		this.isEsNuevoCalidadProducto = isEsNuevoCalidadProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioCalidadProducto() {
		return esParaAccionDesdeFormularioCalidadProducto;
	}
	
	public void setEsParaAccionDesdeFormularioCalidadProducto(Boolean esParaAccionDesdeFormularioCalidadProducto) {
		this.esParaAccionDesdeFormularioCalidadProducto = esParaAccionDesdeFormularioCalidadProducto;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesCalidadProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CalidadProductoConstantesFunciones.refrescarForeignKeysDescripcionesCalidadProducto(this.calidadproductoLogic.getCalidadProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CalidadProductoConstantesFunciones.refrescarForeignKeysDescripcionesCalidadProducto(this.calidadproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//calidadproductoLogic.setCalidadProductos(this.calidadproductos);
			calidadproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CalidadProductoParameterReturnGeneral getCalidadProductoParameterGeneral() {
		return this.calidadproductoParameterGeneral;
	}
	
	public void setCalidadProductoParameterGeneral(CalidadProductoParameterReturnGeneral calidadproductoParameterGeneral) {
		this.calidadproductoParameterGeneral = calidadproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCalidadProducto() {
		return isPermisoTodoCalidadProducto;
	}

	public void setIsPermisoTodoCalidadProducto(Boolean isPermisoTodoCalidadProducto) {
		this.isPermisoTodoCalidadProducto = isPermisoTodoCalidadProducto;
	}

	public Boolean getIsPermisoNuevoCalidadProducto() {
		return isPermisoNuevoCalidadProducto;
	}

	public void setIsPermisoNuevoCalidadProducto(Boolean isPermisoNuevoCalidadProducto) {
		this.isPermisoNuevoCalidadProducto = isPermisoNuevoCalidadProducto;
	}

	public Boolean getIsPermisoActualizarCalidadProducto() {
		return isPermisoActualizarCalidadProducto;
	}

	public void setIsPermisoActualizarCalidadProducto(Boolean isPermisoActualizarCalidadProducto) {
		this.isPermisoActualizarCalidadProducto = isPermisoActualizarCalidadProducto;
	}

	public Boolean getIsPermisoEliminarCalidadProducto() {
		return isPermisoEliminarCalidadProducto;
	}

	public void setIsPermisoEliminarCalidadProducto(Boolean isPermisoEliminarCalidadProducto) {
		this.isPermisoEliminarCalidadProducto = isPermisoEliminarCalidadProducto;
	}

	public Boolean getIsPermisoGuardarCambiosCalidadProducto() {
		return isPermisoGuardarCambiosCalidadProducto;
	}

	public void setIsPermisoGuardarCambiosCalidadProducto(Boolean isPermisoGuardarCambiosCalidadProducto) {
		this.isPermisoGuardarCambiosCalidadProducto = isPermisoGuardarCambiosCalidadProducto;
	}
	
	public Boolean getIsPermisoConsultaCalidadProducto() {
		return isPermisoConsultaCalidadProducto;
	}

	public void setIsPermisoConsultaCalidadProducto(Boolean isPermisoConsultaCalidadProducto) {
		this.isPermisoConsultaCalidadProducto = isPermisoConsultaCalidadProducto;
	}

	public Boolean getIsPermisoBusquedaCalidadProducto() {
		return isPermisoBusquedaCalidadProducto;
	}

	public void setIsPermisoBusquedaCalidadProducto(Boolean isPermisoBusquedaCalidadProducto) {
		this.isPermisoBusquedaCalidadProducto = isPermisoBusquedaCalidadProducto;
	}

	public Boolean getIsPermisoReporteCalidadProducto() {
		return isPermisoReporteCalidadProducto;
	}

	public void setIsPermisoReporteCalidadProducto(Boolean isPermisoReporteCalidadProducto) {
		this.isPermisoReporteCalidadProducto = isPermisoReporteCalidadProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioCalidadProducto() {
		return isPermisoPaginacionMedioCalidadProducto;
	}

	public void setIsPermisoPaginacionMedioCalidadProducto(Boolean isPermisoPaginacionMedioCalidadProducto) {
		this.isPermisoPaginacionMedioCalidadProducto = isPermisoPaginacionMedioCalidadProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoCalidadProducto() {
		return isPermisoPaginacionTodoCalidadProducto;
	}

	public void setIsPermisoPaginacionTodoCalidadProducto(Boolean isPermisoPaginacionTodoCalidadProducto) {
		this.isPermisoPaginacionTodoCalidadProducto = isPermisoPaginacionTodoCalidadProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoCalidadProducto() {
		return isPermisoPaginacionAltoCalidadProducto;
	}

	public void setIsPermisoPaginacionAltoCalidadProducto(Boolean isPermisoPaginacionAltoCalidadProducto) {
		this.isPermisoPaginacionAltoCalidadProducto = isPermisoPaginacionAltoCalidadProducto;
	}
	
	public Boolean getIsPermisoCopiarCalidadProducto() {
		return isPermisoCopiarCalidadProducto;
	}

	public void setIsPermisoCopiarCalidadProducto(Boolean isPermisoCopiarCalidadProducto) {
		this.isPermisoCopiarCalidadProducto = isPermisoCopiarCalidadProducto;
	}
	
	public Boolean getIsPermisoVerFormCalidadProducto() {
		return isPermisoVerFormCalidadProducto;
	}

	public void setIsPermisoVerFormCalidadProducto(Boolean isPermisoVerFormCalidadProducto) {
		this.isPermisoVerFormCalidadProducto = isPermisoVerFormCalidadProducto;
	}
	
	public Boolean getIsPermisoDuplicarCalidadProducto() {
		return isPermisoDuplicarCalidadProducto;
	}

	public void setIsPermisoDuplicarCalidadProducto(Boolean isPermisoDuplicarCalidadProducto) {
		this.isPermisoDuplicarCalidadProducto = isPermisoDuplicarCalidadProducto;
	}
	
	public Boolean getIsPermisoOrdenCalidadProducto() {
		return isPermisoOrdenCalidadProducto;
	}

	public void setIsPermisoOrdenCalidadProducto(Boolean isPermisoOrdenCalidadProducto) {
		this.isPermisoOrdenCalidadProducto = isPermisoOrdenCalidadProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCalidadProducto() {
		return isVisibilidadCeldaNuevoCalidadProducto;
	}

	public void setIsVisibilidadCeldaNuevoCalidadProducto(Boolean isVisibilidadCeldaNuevoCalidadProducto) {
		this.isVisibilidadCeldaNuevoCalidadProducto = isVisibilidadCeldaNuevoCalidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCalidadProducto() {
		return isVisibilidadCeldaDuplicarCalidadProducto;
	}

	public void setIsVisibilidadCeldaDuplicarCalidadProducto(Boolean isVisibilidadCeldaDuplicarCalidadProducto) {
		this.isVisibilidadCeldaDuplicarCalidadProducto = isVisibilidadCeldaDuplicarCalidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCalidadProducto() {
		return isVisibilidadCeldaCopiarCalidadProducto;
	}

	public void setIsVisibilidadCeldaCopiarCalidadProducto(Boolean isVisibilidadCeldaCopiarCalidadProducto) {
		this.isVisibilidadCeldaCopiarCalidadProducto = isVisibilidadCeldaCopiarCalidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCalidadProducto() {
		return isVisibilidadCeldaVerFormCalidadProducto;
	}

	public void setIsVisibilidadCeldaVerFormCalidadProducto(Boolean isVisibilidadCeldaVerFormCalidadProducto) {
		this.isVisibilidadCeldaVerFormCalidadProducto = isVisibilidadCeldaVerFormCalidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCalidadProducto() {
		return isVisibilidadCeldaOrdenCalidadProducto;
	}

	public void setIsVisibilidadCeldaOrdenCalidadProducto(Boolean isVisibilidadCeldaOrdenCalidadProducto) {
		this.isVisibilidadCeldaOrdenCalidadProducto = isVisibilidadCeldaOrdenCalidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCalidadProducto() {
		return isVisibilidadCeldaNuevoRelacionesCalidadProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCalidadProducto(Boolean isVisibilidadCeldaNuevoRelacionesCalidadProducto) {
		this.isVisibilidadCeldaNuevoRelacionesCalidadProducto = isVisibilidadCeldaNuevoRelacionesCalidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCalidadProducto() {
		return isVisibilidadCeldaModificarCalidadProducto;
	}

	public void setIsVisibilidadCeldaModificarCalidadProducto(Boolean isVisibilidadCeldaModificarCalidadProducto) {
		this.isVisibilidadCeldaModificarCalidadProducto = isVisibilidadCeldaModificarCalidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCalidadProducto() {
		return isVisibilidadCeldaActualizarCalidadProducto;
	}

	public void setIsVisibilidadCeldaActualizarCalidadProducto(Boolean isVisibilidadCeldaActualizarCalidadProducto) {
		this.isVisibilidadCeldaActualizarCalidadProducto = isVisibilidadCeldaActualizarCalidadProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarCalidadProducto() {
		return isVisibilidadCeldaEliminarCalidadProducto;
	}

	public void setIsVisibilidadCeldaEliminarCalidadProducto(Boolean isVisibilidadCeldaEliminarCalidadProducto) {
		this.isVisibilidadCeldaEliminarCalidadProducto = isVisibilidadCeldaEliminarCalidadProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarCalidadProducto() {
		return isVisibilidadCeldaCancelarCalidadProducto;
	}

	public void setIsVisibilidadCeldaCancelarCalidadProducto(Boolean isVisibilidadCeldaCancelarCalidadProducto) {
		this.isVisibilidadCeldaCancelarCalidadProducto = isVisibilidadCeldaCancelarCalidadProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarCalidadProducto() {
		return isVisibilidadCeldaGuardarCalidadProducto;
	}

	public void setIsVisibilidadCeldaGuardarCalidadProducto(Boolean isVisibilidadCeldaGuardarCalidadProducto) {
		this.isVisibilidadCeldaGuardarCalidadProducto = isVisibilidadCeldaGuardarCalidadProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCalidadProducto() {
		return isVisibilidadCeldaGuardarCambiosCalidadProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCalidadProducto(Boolean isVisibilidadCeldaGuardarCambiosCalidadProducto) {
		this.isVisibilidadCeldaGuardarCambiosCalidadProducto = isVisibilidadCeldaGuardarCambiosCalidadProducto;
	}
		
	public CalidadProductoSessionBean getcalidadproductoSessionBean() {
		return this.calidadproductoSessionBean;
	}
	
	public void setcalidadproductoSessionBean(CalidadProductoSessionBean calidadproductoSessionBean) {
		this.calidadproductoSessionBean=calidadproductoSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(CalidadProducto calidadproducto)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(CalidadProducto calidadproducto,CalidadProducto calidadproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCalidadProducto(calidadproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		calidadproductoAux.setId(calidadproducto.getId());
		calidadproductoAux.setVersionRow(calidadproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCalidadProducto();
		
			int intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproducto =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.calidadproducto =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CalidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCalidadProducto(this.calidadproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = calidadproductoValidator.getInvalidValues(this.calidadproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			calidadproductoLogic.setDatosCliente(datosCliente);
			calidadproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				calidadproductoAux=new  CalidadProducto();
				
				calidadproductoAux.setIsNew(true);
				calidadproductoAux.setIsChanged(true);
				
				calidadproductoAux.setCalidadProductoOriginal(this.calidadproducto);
				
				calidadproductoAux.setId(this.calidadproducto.getId());	
				calidadproductoAux.setVersionRow(this.calidadproducto.getVersionRow());	
				calidadproductoAux.setcodigo(this.calidadproducto.getcodigo());	
				calidadproductoAux.setnombre(this.calidadproducto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.calidadproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.calidadproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(calidadproductoAux,calidadproductoLogic.getCalidadProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(calidadproductoAux,calidadproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.calidadproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.calidadproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						calidadproductoLogic.saveCalidadProductos();//WithConnection
						//calidadproductoLogic.getSetVersionRowCalidadProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.calidadproducto,calidadproductoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.calidadproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.getBodegas().addAll(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegasEliminados);
							this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegas.addAll(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegasEliminados);
							this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								calidadproductoLogic.saveCalidadProductoRelaciones(calidadproductoAux,this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.getBodegas(),this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//calidadproductoLogic.getSetVersionRowCalidadProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.calidadproducto,calidadproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.setBodegas(new ArrayList<Bodega>());
							this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegas= new ArrayList<Bodega>();
							this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.quitarFilaTotales();}
							calidadproductoAux.setBodegas(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.getBodegas());

							if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							calidadproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.calidadproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.calidadproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(calidadproductoAux,calidadproductoLogic.getCalidadProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(calidadproductoAux,calidadproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.calidadproducto,calidadproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				calidadproductoAux=new  CalidadProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.calidadproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.calidadproductoSessionBean.getEsGuardarRelacionado() && this.calidadproducto.getId()>=0)) {
						
					calidadproductoAux.setIsNew(false);
				}
				
				calidadproductoAux.setIsDeleted(false);
			
				calidadproductoAux.setId(this.calidadproducto.getId());	
				calidadproductoAux.setVersionRow(this.calidadproducto.getVersionRow());	
				calidadproductoAux.setcodigo(this.calidadproducto.getcodigo());	
				calidadproductoAux.setnombre(this.calidadproducto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(calidadproductoAux,calidadproductoLogic.getCalidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(calidadproductoAux,calidadproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.calidadproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.calidadproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						calidadproductoLogic.saveCalidadProductos();//WithConnection
						//calidadproductoLogic.getSetVersionRowCalidadProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.calidadproducto,calidadproductoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.calidadproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.getBodegas().addAll(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegasEliminados);
							this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegas.addAll(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegasEliminados);
							this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								calidadproductoLogic.saveCalidadProductoRelaciones(calidadproductoAux,this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.getBodegas(),this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//calidadproductoLogic.getSetVersionRowCalidadProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.calidadproducto,calidadproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.setBodegas(new ArrayList<Bodega>());
							this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegas= new ArrayList<Bodega>();
							this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.quitarFilaTotales();}
							calidadproductoAux.setBodegas(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.getBodegas());

							if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							calidadproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.calidadproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.calidadproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(calidadproductoAux,calidadproductoLogic.getCalidadProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(calidadproductoAux,calidadproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.calidadproducto,calidadproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				calidadproductoAux=new  CalidadProducto();
				
				calidadproductoAux.setIsNew(false);
				calidadproductoAux.setIsChanged(false);
				
				calidadproductoAux.setIsDeleted(true);
				
				calidadproductoAux.setId(this.calidadproducto.getId());	
				calidadproductoAux.setVersionRow(this.calidadproducto.getVersionRow());	
				calidadproductoAux.setcodigo(this.calidadproducto.getcodigo());	
				calidadproductoAux.setnombre(this.calidadproducto.getnombre());	
				
				if(this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.calidadproductoAux.getId()>=0) {	
						this.calidadproductosEliminados.add(calidadproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(calidadproductoAux,calidadproductoLogic.getCalidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(calidadproductoAux,calidadproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.calidadproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.calidadproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						calidadproductoLogic.saveCalidadProductos();//WithConnection
						//calidadproductoLogic.getSetVersionRowCalidadProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.calidadproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.getBodegas().addAll(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegasEliminados);
							this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos().addAll(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegas.addAll(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegasEliminados);
							this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos.addAll(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								calidadproductoLogic.saveCalidadProductoRelaciones(calidadproductoAux,this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.getBodegas(),this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());//WithConnection
								//calidadproductoLogic.getSetVersionRowCalidadProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.setBodegas(new ArrayList<Bodega>());
							this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(new ArrayList<ParametroInventarioDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegas= new ArrayList<Bodega>();
							this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos= new ArrayList<ParametroInventarioDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.quitarFilaTotales();}
							calidadproductoAux.setBodegas(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.getBodegas());

							if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							calidadproductoAux.setParametroInventarioDefectos(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.calidadproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.calidadproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(calidadproductoAux,calidadproductoLogic.getCalidadProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(calidadproductoAux,calidadproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.getCalidadProductos().addAll(this.calidadproductosEliminados);
					
					calidadproductoLogic.saveCalidadProductos();//WithConnection
					//calidadproductoLogic.getSetVersionRowCalidadProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.calidadproductosEliminados= new ArrayList<CalidadProducto>();		
			}
			
			if(this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Calidad Producto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Calidad Producto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.calidadproducto=calidadproductoAux;
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
      		//this.finishProcessCalidadProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(CalidadProducto calidadproductoLocal) throws Exception {
		
		if(this.calidadproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				calidadproductoLocal.setBodegas(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.getBodegas());
				calidadproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
			
			} else {
			
				calidadproductoLocal.setBodegas(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegas);
				calidadproductoLocal.setParametroInventarioDefectos(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CalidadProducto calidadproductoLocal) throws Exception {	
		if(this.calidadproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarCalidadProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.calidadproducto =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.calidadproducto =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = calidadproductoValidator.getInvalidValues(this.calidadproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CalidadProducto calidadproducto,List<CalidadProducto> calidadproductos) throws Exception {
		try	{		
			CalidadProductoConstantesFunciones.actualizarLista(calidadproducto,calidadproductos,this.calidadproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CalidadProducto calidadproducto,List<CalidadProducto> calidadproductos) throws Exception {
		try	{			
			CalidadProductoConstantesFunciones.actualizarSelectedLista(calidadproducto,calidadproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CalidadProducto> calidadproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				calidadproductosLocal=this.calidadproductoLogic.getCalidadProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				calidadproductosLocal=this.calidadproductos;
			}
			//ARCHITECTURE
		
			for(CalidadProducto calidadproductoLocal:calidadproductosLocal) {
				if(this.permiteMantenimiento(calidadproductoLocal) && calidadproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CalidadProductoConstantesFunciones.getCalidadProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CalidadProductoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalidadProducto.jLabelcodigoCalidadProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CalidadProductoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalidadProducto.jLabelnombreCalidadProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalidadProducto.jLabelcodigoCalidadProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCalidadProducto.jLabelnombreCalidadProducto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Bodega")) {
			if(this.calidadproducto==null) {
				this.calidadproducto= new CalidadProducto();
			}

			if(this.calidadproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCalidadProducto
				this.setVariablesFormularioToObjetoActualCalidadProducto(this.calidadproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);

				this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.getbodega().setCalidadProducto(this.calidadproducto);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroInventarioDefecto")) {
			if(this.calidadproducto==null) {
				this.calidadproducto= new CalidadProducto();
			}

			if(this.calidadproductoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCalidadProducto
				this.setVariablesFormularioToObjetoActualCalidadProducto(this.calidadproducto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);

				this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.getparametroinventariodefecto().setCalidadProducto(this.calidadproducto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCalidadProducto--;	
		
		
		this.calidadproductoAux=new CalidadProducto();
		
		this.calidadproductoAux.setId(this.iIdNuevoCalidadProducto);
		this.calidadproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.calidadproductoLogic.getCalidadProductos().add(this.calidadproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.calidadproductos.add(this.calidadproductoAux);
		}
		//ARCHITECTURE
		
		this.calidadproducto=this.calidadproductoAux;
		
		if(CalidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCalidadProducto(this.calidadproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyCalidadProducto(this.calidadproducto);
		}
				
		//this.setDefaultControlesCalidadProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCalidadProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCalidadProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCalidadProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCalidadProducto(this.calidadproductoBean,this.calidadproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CalidadProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.calidadproductoSessionBean.getConGuardarRelaciones()) {
			classes=CalidadProductoConstantesFunciones.getClassesRelationshipsOfCalidadProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.calidadproductoReturnGeneral=calidadproductoLogic.procesarEventosCalidadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.calidadproductoLogic.getCalidadProductos(),this.calidadproducto,this.calidadproductoParameterGeneral,this.isEsNuevoCalidadProducto,classes);//this.calidadproductoLogic.getCalidadProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCalidadProducto(this.calidadproductoReturnGeneral,this.calidadproductoBean,false);
		
		if(this.calidadproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCalidadProducto(this.calidadproductoReturnGeneral.getCalidadProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCalidadProducto(this.calidadproductoReturnGeneral.getCalidadProducto());
		}
		
		if(this.calidadproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCalidadProducto(this.calidadproductoReturnGeneral.getCalidadProducto(),classes);//this.calidadproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCalidadProducto(this.calidadproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCalidadProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCalidadProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CalidadProductoBeanSwingJInternalFrameAdditional.RecargarFormCalidadProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCalidadProducto(false);
						
			if(calidadproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaSessionBean.getEsGuardarRelacionado() && BodegaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonBodegaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(CalidadProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCalidadProducto();
			}
			
			this.actualizarVisualTableDatosCalidadProducto();
			
			this.jTableDatosCalidadProducto.setRowSelectionInterval(this.getIndiceNuevoCalidadProducto(), this.getIndiceNuevoCalidadProducto());
			
			this.seleccionarFilaTablaCalidadProductoActual();
						
			this.actualizarEstadoCeldasBotonesCalidadProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCalidadProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCalidadProducto.jTextFieldcodigoCalidadProducto.setEnabled(isHabilitar && this.calidadproductoConstantesFunciones.activarcodigoCalidadProducto);
		this.jInternalFrameDetalleFormCalidadProducto.jTextAreanombreCalidadProducto.setEnabled(isHabilitar && this.calidadproductoConstantesFunciones.activarnombreCalidadProducto);	
		
	};
	
	public void setDefaultControlesCalidadProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCalidadProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.calidadproductoSessionBean.setConGuardarRelaciones(true);			
			this.calidadproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCalidadProducto.jTabbedPaneRelacionesCalidadProducto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.calidadproductoSessionBean.setConGuardarRelaciones(false);			
			this.calidadproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCalidadProducto.jTabbedPaneRelacionesCalidadProducto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoCalidadProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CalidadProducto calidadproductoAux:this.calidadproductoLogic.getCalidadProductos()) {
				if(calidadproductoAux.getId().equals(this.iIdNuevoCalidadProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CalidadProducto calidadproductoAux:this.calidadproductos) {
				if(calidadproductoAux.getId().equals(this.iIdNuevoCalidadProducto)) {
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
	
	public int getIndiceActualCalidadProducto(CalidadProducto calidadproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CalidadProducto calidadproductoAux:this.calidadproductoLogic.getCalidadProductos()) {
				if(calidadproductoAux.getId().equals(calidadproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CalidadProducto calidadproductoAux:this.calidadproductos) {
				if(calidadproductoAux.getId().equals(calidadproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCalidadProducto(CalidadProducto calidadproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CalidadProducto calidadproductoAux:this.calidadproductoLogic.getCalidadProductos()) {
				if(calidadproductoAux.getCalidadProductoOriginal().getId().equals(calidadproductoOriginal.getId())) {
					existe=true;
					calidadproductoOriginal.setId(calidadproductoAux.getId());
					calidadproductoOriginal.setVersionRow(calidadproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CalidadProducto calidadproductoAux:this.calidadproductos) {
				if(calidadproductoAux.getCalidadProductoOriginal().getId().equals(calidadproductoOriginal.getId())) {
					existe=true;
					calidadproductoOriginal.setId(calidadproductoAux.getId());
					calidadproductoOriginal.setVersionRow(calidadproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCalidadProducto(Boolean esParaCancelar) throws Exception {
		calidadproductosAux=new ArrayList<CalidadProducto>();
		calidadproductoAux=new CalidadProducto();
		
		if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CalidadProducto calidadproductoAux:this.calidadproductoLogic.getCalidadProductos()) {
					if(calidadproductoAux.getId()<0) {
						calidadproductosAux.add(calidadproductoAux);
					}		
				}
				this.iIdNuevoCalidadProducto=0L;
				this.calidadproductoLogic.getCalidadProductos().removeAll(calidadproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CalidadProducto calidadproductoAux:this.calidadproductos) {
					if(calidadproductoAux.getId()<0) {
						calidadproductosAux.add(calidadproductoAux);
					}		
				}
				this.iIdNuevoCalidadProducto=0L;
				this.calidadproductos.removeAll(calidadproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCalidadProducto 
					&& this.calidadproductoLogic.getCalidadProductos().size()>0
					) {
					calidadproductoAux=this.calidadproductoLogic.getCalidadProductos().get(this.calidadproductoLogic.getCalidadProductos().size() - 1);
				
					if(calidadproductoAux.getId()<0) {
						this.calidadproductoLogic.getCalidadProductos().remove(calidadproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCalidadProducto && this.calidadproductos.size()>0) {
					calidadproductoAux=this.calidadproductos.get(this.calidadproductos.size() - 1);
				
					if(calidadproductoAux.getId()<0) {
						this.calidadproductos.remove(calidadproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCalidadProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(calidadproducto.getId()<0) {
				this.calidadproductoLogic.getCalidadProductos().remove(this.calidadproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(calidadproducto.getId()<0) {
				this.calidadproductos.remove(this.calidadproducto);
			}
		}			
	}
	
	public void setEstadosInicialesCalidadProducto(List<CalidadProducto> calidadproductosAux) throws Exception {
		CalidadProductoConstantesFunciones.setEstadosInicialesCalidadProducto(calidadproductosAux);
	}
	
	public void setEstadosInicialesCalidadProducto(CalidadProducto calidadproductoAux) throws Exception {
		CalidadProductoConstantesFunciones.setEstadosInicialesCalidadProducto(calidadproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCalidadProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCalidadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCalidadProductoActual()) {
				if(!this.isEsNuevoCalidadProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCalidadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCalidadProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCalidadProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Calidad Producto ?", "MANTENIMIENTO DE Calidad Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCalidadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CalidadProducto calidadproducto) throws Exception {
		CalidadProductoConstantesFunciones.seleccionarAsignar(this.calidadproducto,calidadproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCalidadProducto=this.isPermisoActualizarOriginalCalidadProducto;
			
			
			this.seleccionarAsignar(calidadproducto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CalidadProductoConstantesFunciones.quitarEspaciosCalidadProducto(this.calidadproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCalidadProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.calidadproductoSessionBean.setsFuncionBusquedaRapida(this.calidadproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCalidadProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCalidadProducto(esParaCancelar);				
				this.cancelarNuevoCalidadProducto(esParaCancelar);								
			}
			
			this.calidadproducto=new CalidadProducto();
			
			this.inicializarCalidadProducto();
			
			this.actualizarEstadoCeldasBotonesCalidadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCalidadProducto() throws Exception {
		try {
			CalidadProductoConstantesFunciones.inicializarCalidadProducto(this.calidadproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.calidadproductoLogic.getCalidadProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCalidadProductos(String sAccionBusqueda,List<CalidadProducto> calidadproductosParaReportes) throws Exception {
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
					sPathReporteFinal="CalidadProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CalidadProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CalidadProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CalidadProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Calidad Productos");		
		parameters.put("busquedapor", CalidadProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Bodega.class));
			classes.add(new Classe(ParametroInventarioDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					CalidadProductoLogic calidadproductoLogicAuxiliar=new CalidadProductoLogic();
					calidadproductoLogicAuxiliar.setDatosCliente(calidadproductoLogic.getDatosCliente());				
					calidadproductoLogicAuxiliar.setCalidadProductos(calidadproductosParaReportes);
					
					calidadproductoLogicAuxiliar.cargarRelacionesLoteForeignKeyCalidadProductoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					calidadproductosParaReportes=calidadproductoLogicAuxiliar.getCalidadProductos();
					
					//calidadproductoLogic.getNewConnexionToDeep();
					
					//for (CalidadProducto calidadproducto:calidadproductosParaReportes) {
					//	calidadproductoLogic.deepLoad(calidadproducto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//calidadproductoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//calidadproductoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileBodega = AuxiliarReportes.class.getResourceAsStream("BodegaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_bodega", reportFileBodega);

			InputStream reportFileParametroInventarioDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroInventarioDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametroinventariodefecto", reportFileParametroInventarioDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCalidadProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CalidadProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CalidadProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCalidadProducto=new JRBeanArrayDataSource(CalidadProductoJInternalFrame.TraerCalidadProductoBeans(calidadproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCalidadProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CalidadProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CalidadProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CalidadProductoBean.TraerCalidadProductoBeans(calidadproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteCalidadProductos(sAccionBusqueda,sTipoArchivoReporte,calidadproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCalidadProductos(sAccionBusqueda,sTipoArchivoReporte,calidadproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCalidadProductoActionPerformed(null);
					//this.generarExcelReporteCalidadProductos(sAccionBusqueda,sTipoArchivoReporte,calidadproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCalidadProductos(sAccionBusqueda,sTipoArchivoReporte,calidadproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCalidadProductos(sAccionBusqueda,sTipoArchivoReporte,calidadproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCalidadProductos(sAccionBusqueda,sTipoArchivoReporte,calidadproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCalidadProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<CalidadProducto> calidadproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"calidadproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CalidadProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCalidadProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CalidadProducto calidadproducto : calidadproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CalidadProductoConstantesFunciones.generarExcelReporteDataCalidadProducto("NORMAL",row,workbook,calidadproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calidad Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCalidadProducto(String sTipo,Row row,Workbook workbook) {
		
		CalidadProductoConstantesFunciones.generarExcelReporteHeaderCalidadProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCalidadProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<CalidadProducto> calidadproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"calidadproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CalidadProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CalidadProducto calidadproducto : calidadproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CalidadProductoConstantesFunciones.getCalidadProductoDescripcion(calidadproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalidadProductoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalidadProductoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calidadproducto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CalidadProductoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CalidadProductoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(calidadproducto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calidad Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCalidadProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<CalidadProducto> calidadproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CalidadProducto> calidadproductosRespaldo=null;
		
		classes=CalidadProductoConstantesFunciones.getClassesRelationshipsOfCalidadProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.calidadproductoLogic.setDatosCliente(this.datosCliente);
		this.calidadproductoLogic.setDatosDeep(this.datosDeep);
		this.calidadproductoLogic.setIsConDeep(true);
		
		calidadproductosRespaldo=this.calidadproductoLogic.getCalidadProductos();
		
		this.calidadproductoLogic.setCalidadProductos(calidadproductosParaReportes);	
		this.calidadproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		calidadproductosParaReportes=this.calidadproductoLogic.getCalidadProductos();
		this.calidadproductoLogic.setCalidadProductos(calidadproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"calidadproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CalidadProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCalidadProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CalidadProducto calidadproducto : calidadproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCalidadProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CalidadProductoConstantesFunciones.generarExcelReporteDataCalidadProducto("NORMAL",row,workbook,calidadproducto,cellStyleDataAux);
		
			
			


				//Bodega
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(BodegaConstantesFunciones.SCLASSWEBTITULO))) {

				if(calidadproducto.getBodegas()!=null && calidadproducto.getBodegas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(BodegaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					BodegaConstantesFunciones.generarExcelReporteHeaderBodega("RELACIONADO",row,workbook);
				}

				if(calidadproducto.getBodegas()!=null) {
					i2=0;
					for(Bodega bodega : calidadproducto.getBodegas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						BodegaConstantesFunciones.generarExcelReporteDataBodega("RELACIONADO",row,workbook,bodega,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ParametroInventarioDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(calidadproducto.getParametroInventarioDefectos()!=null && calidadproducto.getParametroInventarioDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroInventarioDefectoConstantesFunciones.generarExcelReporteHeaderParametroInventarioDefecto("RELACIONADO",row,workbook);
				}

				if(calidadproducto.getParametroInventarioDefectos()!=null) {
					i2=0;
					for(ParametroInventarioDefecto parametroinventariodefecto : calidadproducto.getParametroInventarioDefectos()) {
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
		cell.setCellValue(CalidadProductoConstantesFunciones.getCalidadProductoDescripcion(calidadproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calidad Producto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCalidadProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCalidadProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCalidadProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCalidadProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCalidadProducto() throws Exception {		
		this.startProcessCalidadProducto(true);
	}
	
	public void startProcessCalidadProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCalidadProducto ,this.jPanelParametrosReportesCalidadProducto, this.jScrollPanelDatosCalidadProducto,this.jPanelPaginacionCalidadProducto, this.jScrollPanelDatosEdicionCalidadProducto, this.jPanelAccionesCalidadProducto,this.jPanelAccionesFormularioCalidadProducto,this.jmenuBarCalidadProducto,this.jmenuBarDetalleCalidadProducto,this.jTtoolBarCalidadProducto,this.jTtoolBarDetalleCalidadProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasCalidadProducto=this.jTabbedPaneBusquedasCalidadProducto; 
		
		final JPanel jPanelParametrosReportesCalidadProducto=this.jPanelParametrosReportesCalidadProducto;
		//final JScrollPane jScrollPanelDatosCalidadProducto=this.jScrollPanelDatosCalidadProducto;
		final JTable jTableDatosCalidadProducto=this.jTableDatosCalidadProducto;		
		final JPanel jPanelPaginacionCalidadProducto=this.jPanelPaginacionCalidadProducto;
		//final JScrollPane jScrollPanelDatosEdicionCalidadProducto=this.jScrollPanelDatosEdicionCalidadProducto;
		final JPanel jPanelAccionesCalidadProducto=this.jPanelAccionesCalidadProducto;
		
		JPanel jPanelCamposAuxiliarCalidadProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCalidadProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
			jPanelCamposAuxiliarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jPanelCamposCalidadProducto;
			jPanelAccionesFormularioAuxiliarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jPanelAccionesFormularioCalidadProducto;
		}
		
		final JPanel jPanelCamposCalidadProducto=jPanelCamposAuxiliarCalidadProducto;
		final JPanel jPanelAccionesFormularioCalidadProducto=jPanelAccionesFormularioAuxiliarCalidadProducto;
		
		
		final JMenuBar jmenuBarCalidadProducto=this.jmenuBarCalidadProducto;
		final JToolBar jTtoolBarCalidadProducto=this.jTtoolBarCalidadProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCalidadProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCalidadProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
			jmenuBarDetalleAuxiliarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jmenuBarDetalleCalidadProducto;
			jTtoolBarDetalleAuxiliarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jTtoolBarDetalleCalidadProducto;
		}
		
		final JMenuBar jmenuBarDetalleCalidadProducto=jmenuBarDetalleAuxiliarCalidadProducto;
		final JToolBar jTtoolBarDetalleCalidadProducto=jTtoolBarDetalleAuxiliarCalidadProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCalidadProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCalidadProducto;
			processRunnable.jTableDatos=jTableDatosCalidadProducto;
			processRunnable.jPanelCampos=jPanelCamposCalidadProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionCalidadProducto;
			processRunnable.jPanelAcciones=jPanelAccionesCalidadProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCalidadProducto;
			
			
			processRunnable.jmenuBar=jmenuBarCalidadProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCalidadProducto;
			processRunnable.jTtoolBar=jTtoolBarCalidadProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCalidadProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCalidadProducto ,jPanelParametrosReportesCalidadProducto,jTableDatosCalidadProducto, /*jScrollPanelDatosCalidadProducto,*/jPanelCamposCalidadProducto,jPanelPaginacionCalidadProducto, /*jScrollPanelDatosEdicionCalidadProducto,*/ jPanelAccionesCalidadProducto,jPanelAccionesFormularioCalidadProducto,jmenuBarCalidadProducto,jmenuBarDetalleCalidadProducto,jTtoolBarCalidadProducto,jTtoolBarDetalleCalidadProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCalidadProducto ,jPanelParametrosReportesCalidadProducto, jScrollPanelDatosCalidadProducto,jPanelPaginacionCalidadProducto, jScrollPanelDatosEdicionCalidadProducto, jPanelAccionesCalidadProducto,jPanelAccionesFormularioCalidadProducto,jmenuBarCalidadProducto,jmenuBarDetalleCalidadProducto,jTtoolBarCalidadProducto,jTtoolBarDetalleCalidadProducto);
						
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
	
	public void finishProcessCalidadProducto() {// throws Exception 
		this.finishProcessCalidadProducto(true);
	}
	
	public void finishProcessCalidadProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCalidadProducto ,this.jPanelParametrosReportesCalidadProducto, this.jScrollPanelDatosCalidadProducto,this.jPanelPaginacionCalidadProducto, this.jScrollPanelDatosEdicionCalidadProducto, this.jPanelAccionesCalidadProducto,this.jPanelAccionesFormularioCalidadProducto,this.jmenuBarCalidadProducto,this.jmenuBarDetalleCalidadProducto,this.jTtoolBarCalidadProducto,this.jTtoolBarDetalleCalidadProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasCalidadProducto=this.jTabbedPaneBusquedasCalidadProducto; 
		
		final JPanel jPanelParametrosReportesCalidadProducto=this.jPanelParametrosReportesCalidadProducto;
		//final JScrollPane jScrollPanelDatosCalidadProducto=this.jScrollPanelDatosCalidadProducto;
		final JTable jTableDatosCalidadProducto=this.jTableDatosCalidadProducto;		
		final JPanel jPanelPaginacionCalidadProducto=this.jPanelPaginacionCalidadProducto;
		//final JScrollPane jScrollPanelDatosEdicionCalidadProducto=this.jScrollPanelDatosEdicionCalidadProducto;
		final JPanel jPanelAccionesCalidadProducto=this.jPanelAccionesCalidadProducto;
		
		JPanel jPanelCamposAuxiliarCalidadProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCalidadProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
			jPanelCamposAuxiliarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jPanelCamposCalidadProducto;
			jPanelAccionesFormularioAuxiliarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jPanelAccionesFormularioCalidadProducto;
		}
		
		final JPanel jPanelCamposCalidadProducto=jPanelCamposAuxiliarCalidadProducto;
		final JPanel jPanelAccionesFormularioCalidadProducto=jPanelAccionesFormularioAuxiliarCalidadProducto;
		
		
		final JMenuBar jmenuBarCalidadProducto=this.jmenuBarCalidadProducto;		
		final JToolBar jTtoolBarCalidadProducto=this.jTtoolBarCalidadProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarCalidadProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCalidadProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
			jmenuBarDetalleAuxiliarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jmenuBarDetalleCalidadProducto;
			jTtoolBarDetalleAuxiliarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jTtoolBarDetalleCalidadProducto;		
		}
		
		final JMenuBar jmenuBarDetalleCalidadProducto=jmenuBarDetalleAuxiliarCalidadProducto;
		final JToolBar jTtoolBarDetalleCalidadProducto=jTtoolBarDetalleAuxiliarCalidadProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCalidadProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCalidadProducto;
			processRunnable.jTableDatos=jTableDatosCalidadProducto;
			processRunnable.jPanelCampos=jPanelCamposCalidadProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionCalidadProducto;
			processRunnable.jPanelAcciones=jPanelAccionesCalidadProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCalidadProducto;
			
			
			processRunnable.jmenuBar=jmenuBarCalidadProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCalidadProducto;
			processRunnable.jTtoolBar=jTtoolBarCalidadProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCalidadProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCalidadProducto ,jPanelParametrosReportesCalidadProducto, jTableDatosCalidadProducto,/*jScrollPanelDatosCalidadProducto,*/jPanelCamposCalidadProducto,jPanelPaginacionCalidadProducto, /*jScrollPanelDatosEdicionCalidadProducto,*/ jPanelAccionesCalidadProducto,jPanelAccionesFormularioCalidadProducto,jmenuBarCalidadProducto,jmenuBarDetalleCalidadProducto,jTtoolBarCalidadProducto,jTtoolBarDetalleCalidadProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCalidadProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCalidadProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCalidadProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCalidadProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCalidadProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCalidadProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCalidadProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCalidadProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCalidadProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.calidadproductoConstantesFunciones.getsFinalQueryCalidadProducto();
		String  finalQueryPaginacionTodos=this.calidadproductoConstantesFunciones.getsFinalQueryCalidadProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CalidadProductoConstantesFunciones.getArrayColumnasGlobalesNoCalidadProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CalidadProductoConstantesFunciones.getArrayColumnasGlobalesCalidadProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CalidadProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.calidadproductosEliminados= new ArrayList<CalidadProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCalidadProducto();
		
				///*CalidadProductoSessionBean*/this.calidadproductoSessionBean=new CalidadProductoSessionBean();
			
			if(this.calidadproductoSessionBean==null) {
				this.calidadproductoSessionBean=new CalidadProductoSessionBean();
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
					this.iNumeroPaginacion=CalidadProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CalidadProductoConstantesFunciones.getClassesForeignKeysOfCalidadProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/calidadproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			calidadproductosAux= new ArrayList<CalidadProducto>();
			
				
			calidadproductoLogic.setDatosCliente(this.datosCliente);
			calidadproductoLogic.setDatosDeep(this.datosDeep);
			calidadproductoLogic.setIsConDeep(true);
			
			
			calidadproductoLogic.getCalidadProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					calidadproductoLogic.getTodosCalidadProductos(finalQueryGlobal,pagination);
					
					//calidadproductoLogic.getTodosCalidadProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(calidadproductoLogic.getCalidadProductos()==null|| calidadproductoLogic.getCalidadProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							calidadproductosAux= new ArrayList<CalidadProducto>();
							calidadproductosAux.addAll(calidadproductoLogic.getCalidadProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calidadproductosAux= new ArrayList<CalidadProducto>();
							calidadproductosAux.addAll(calidadproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							calidadproductoLogic.getTodosCalidadProductos(finalQueryGlobal+"",this.pagination);												
							
							//calidadproductoLogic.getTodosCalidadProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCalidadProductos("Todos",calidadproductoLogic.getCalidadProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							calidadproductoLogic.setCalidadProductos(new ArrayList<CalidadProducto>());					
							calidadproductoLogic.getCalidadProductos().addAll(calidadproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calidadproductos=new ArrayList<CalidadProducto>();
							calidadproductos.addAll(calidadproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCalidadProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCalidadProducto=this.idActual;
				
				} else if(this.idCalidadProductoActual!=null && this.idCalidadProductoActual!=0L) {
					idCalidadProducto=idCalidadProductoActual;
				}
				
					
				this.sDetalleReporte=CalidadProductoConstantesFunciones.getDetalleIndicePorId(idCalidadProducto);
				
				this.calidadproductos=new ArrayList<CalidadProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					calidadproductoLogic.getEntity(idCalidadProducto);
					
					//calidadproductoLogic.getEntityWithConnection(idCalidadProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calidadproductoLogic.setCalidadProductos(new ArrayList<CalidadProducto>());
					calidadproductoLogic.getCalidadProductos().add(calidadproductoLogic.getCalidadProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.calidadproductos=new ArrayList<CalidadProducto>();
					this.calidadproductos.add(calidadproducto);
				}
				
				if(calidadproductoLogic.getCalidadProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=CalidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					calidadproductoLogic.getCalidadProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=calidadproductoLogic.getCalidadProductos()==null||calidadproductoLogic.getCalidadProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=calidadproductos==null|| calidadproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						calidadproductosAux=new ArrayList<CalidadProducto>();
						calidadproductosAux.addAll(calidadproductoLogic.getCalidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calidadproductosAux=new ArrayList<CalidadProducto>();
							calidadproductosAux.addAll(calidadproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							calidadproductoLogic.getCalidadProductosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCalidadProductos("BusquedaPorCodigo",calidadproductoLogic.getCalidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCalidadProductos("BusquedaPorCodigo",calidadproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						calidadproductoLogic.setCalidadProductos(new ArrayList<CalidadProducto>());
						calidadproductoLogic.getCalidadProductos().addAll(calidadproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calidadproductos=new ArrayList<CalidadProducto>();
							calidadproductos.addAll(calidadproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=CalidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					calidadproductoLogic.getCalidadProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=calidadproductoLogic.getCalidadProductos()==null||calidadproductoLogic.getCalidadProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=calidadproductos==null|| calidadproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						calidadproductosAux=new ArrayList<CalidadProducto>();
						calidadproductosAux.addAll(calidadproductoLogic.getCalidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calidadproductosAux=new ArrayList<CalidadProducto>();
							calidadproductosAux.addAll(calidadproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							calidadproductoLogic.getCalidadProductosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CalidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CalidadProductoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCalidadProductos("BusquedaPorNombre",calidadproductoLogic.getCalidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCalidadProductos("BusquedaPorNombre",calidadproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						calidadproductoLogic.setCalidadProductos(new ArrayList<CalidadProducto>());
						calidadproductoLogic.getCalidadProductos().addAll(calidadproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calidadproductos=new ArrayList<CalidadProducto>();
							calidadproductos.addAll(calidadproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCalidadProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCalidadProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=calidadproductoLogic.getCalidadProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=calidadproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=calidadproductoLogic.getCalidadProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=calidadproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CalidadProducto calidadproducto) {
		Boolean permite=true;
		
		if(this.calidadproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CalidadProductoConstantesFunciones.getOrderByListaCalidadProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CalidadProductoConstantesFunciones.getOrderByListaCalidadProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CalidadProducto calidadproducto:calidadproductoLogic.getCalidadProductos()) {
				if(calidadproducto.getsType().equals(Constantes2.S_TOTALES)) {
					calidadproductoTotales=calidadproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CalidadProducto calidadproducto:this.calidadproductos) {
				if(calidadproducto.getsType().equals(Constantes2.S_TOTALES)) {
					calidadproductoTotales=calidadproducto;
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
			this.calidadproductoAux=new CalidadProducto();
			this.calidadproductoAux.setsType(Constantes2.S_TOTALES);
			this.calidadproductoAux.setIsNew(false);
			this.calidadproductoAux.setIsChanged(false);
			this.calidadproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CalidadProductoConstantesFunciones.TotalizarValoresFilaCalidadProducto(this.calidadproductoLogic.getCalidadProductos(),this.calidadproductoAux);
				
				this.calidadproductoLogic.getCalidadProductos().add(this.calidadproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CalidadProductoConstantesFunciones.TotalizarValoresFilaCalidadProducto(this.calidadproductos,this.calidadproductoAux);
				
				this.calidadproductos.add(this.calidadproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		calidadproductoTotales=new CalidadProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.calidadproductoLogic.getCalidadProductos().remove(calidadproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.calidadproductos.remove(calidadproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		calidadproductoTotales=new CalidadProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CalidadProducto calidadproducto:calidadproductoLogic.getCalidadProductos()) {
				if(calidadproducto.getsType().equals(Constantes2.S_TOTALES)) {
					calidadproductoTotales=calidadproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CalidadProductoConstantesFunciones.TotalizarValoresFilaCalidadProducto(this.calidadproductoLogic.getCalidadProductos(),calidadproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CalidadProducto calidadproducto:this.calidadproductos) {
				if(calidadproducto.getsType().equals(Constantes2.S_TOTALES)) {
					calidadproductoTotales=calidadproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CalidadProductoConstantesFunciones.TotalizarValoresFilaCalidadProducto(this.calidadproductos,calidadproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCalidadProductosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCalidadProductosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCalidadProductosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calidadproductoLogic.getCalidadProductosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCalidadProductosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calidadproductoLogic.getCalidadProductosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
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
	
	public void inicializarPermisosCalidadProducto() {
		this.isPermisoTodoCalidadProducto=false;
		this.isPermisoNuevoCalidadProducto=false;
		this.isPermisoActualizarCalidadProducto=false;
		this.isPermisoActualizarOriginalCalidadProducto=false;
		this.isPermisoEliminarCalidadProducto=false;
		this.isPermisoGuardarCambiosCalidadProducto=false;
		this.isPermisoConsultaCalidadProducto=false;
		this.isPermisoBusquedaCalidadProducto=false;
		this.isPermisoReporteCalidadProducto=false;		
		this.isPermisoOrdenCalidadProducto=false;		
		this.isPermisoPaginacionMedioCalidadProducto=false;		
		this.isPermisoPaginacionAltoCalidadProducto=false;
		this.isPermisoPaginacionTodoCalidadProducto=false;
		this.isPermisoCopiarCalidadProducto=false;		
		this.isPermisoVerFormCalidadProducto=false;		
		this.isPermisoDuplicarCalidadProducto=false;		
		this.isPermisoOrdenCalidadProducto=false;		
	}
	
	public void setPermisosUsuarioCalidadProducto(Boolean isPermiso) {
		this.isPermisoTodoCalidadProducto=isPermiso;
		this.isPermisoNuevoCalidadProducto=isPermiso;
		this.isPermisoActualizarCalidadProducto=isPermiso;
		this.isPermisoActualizarOriginalCalidadProducto=isPermiso;
		this.isPermisoEliminarCalidadProducto=isPermiso;
		this.isPermisoGuardarCambiosCalidadProducto=isPermiso;
		this.isPermisoConsultaCalidadProducto=isPermiso;
		this.isPermisoBusquedaCalidadProducto=isPermiso;
		this.isPermisoReporteCalidadProducto=isPermiso;
		this.isPermisoOrdenCalidadProducto=isPermiso;		
		this.isPermisoPaginacionMedioCalidadProducto=isPermiso;		
		this.isPermisoPaginacionAltoCalidadProducto=isPermiso;		
		this.isPermisoPaginacionTodoCalidadProducto=isPermiso;		
		this.isPermisoCopiarCalidadProducto=isPermiso;		
		this.isPermisoVerFormCalidadProducto=isPermiso;		
		this.isPermisoDuplicarCalidadProducto=isPermiso;
		this.isPermisoOrdenCalidadProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCalidadProducto(Boolean isPermiso) {
		//this.isPermisoTodoCalidadProducto=isPermiso;
		this.isPermisoNuevoCalidadProducto=isPermiso;
		this.isPermisoActualizarCalidadProducto=isPermiso;
		this.isPermisoActualizarOriginalCalidadProducto=isPermiso;
		this.isPermisoEliminarCalidadProducto=isPermiso;
		this.isPermisoGuardarCambiosCalidadProducto=isPermiso;
		//this.isPermisoConsultaCalidadProducto=isPermiso;
		//this.isPermisoBusquedaCalidadProducto=isPermiso;
		//this.isPermisoReporteCalidadProducto=isPermiso;
		//this.isPermisoOrdenCalidadProducto=isPermiso;		
		//this.isPermisoPaginacionMedioCalidadProducto=isPermiso;		
		//this.isPermisoPaginacionAltoCalidadProducto=isPermiso;		
		//this.isPermisoPaginacionTodoCalidadProducto=isPermiso;		
		//this.isPermisoCopiarCalidadProducto=isPermiso;		
		//this.isPermisoDuplicarCalidadProducto=isPermiso;
		//this.isPermisoOrdenCalidadProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCalidadProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(BodegaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(CalidadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosBodega=false;
		this.isTienePermisosBodega=this.verificarGetPermisosUsuarioOpcionCalidadProductoClaseRelacionada(this.opcionsRelacionadas,BodegaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroInventarioDefecto=false;
		this.isTienePermisosParametroInventarioDefecto=this.verificarGetPermisosUsuarioOpcionCalidadProductoClaseRelacionada(this.opcionsRelacionadas,ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCalidadProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCalidadProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosBodega=conPermiso;
		this.isTienePermisosParametroInventarioDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioCalidadProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCalidadProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCalidadProductoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosBodega && this.jInternalFrameDetalleFormCalidadProducto!=null && this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCalidadProducto.jTabbedPaneRelacionesCalidadProducto.remove(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroInventarioDefecto && this.jInternalFrameDetalleFormCalidadProducto!=null && this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCalidadProducto.jTabbedPaneRelacionesCalidadProducto.remove(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioCalidadProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CalidadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CalidadProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCalidadProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCalidadProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCalidadProducto=this.isPermisoActualizarCalidadProducto;
			this.isPermisoEliminarCalidadProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCalidadProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCalidadProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCalidadProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCalidadProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCalidadProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCalidadProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCalidadProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCalidadProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCalidadProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCalidadProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCalidadProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCalidadProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCalidadProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCalidadProducto.setToolTipText(this.jTableDatosCalidadProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCalidadProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCalidadProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CalidadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CalidadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCalidadProducto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosBodega && this.calidadproductoConstantesFunciones.mostrarBodegaCalidadProducto && !CalidadProductoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Bodega");
			reporte.setsDescripcion("Bodega");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroInventarioDefecto && this.calidadproductoConstantesFunciones.mostrarParametroInventarioDefectoCalidadProducto && !CalidadProductoConstantesFunciones.ISGUARDARREL) {

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
	
		
	public void inicializarCombosForeignKeyCalidadProductoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCalidadProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CalidadProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCalidadProductoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyCalidadProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCalidadProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyCalidadProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCalidadProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCalidadProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCalidadProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCalidadProducto(CalidadProducto calidadproducto)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCalidadProducto(CalidadProducto calidadproducto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCalidadProducto()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCalidadProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCalidadProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCalidadProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCalidadProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCalidadProducto()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCalidadProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCalidadProducto()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public CalidadProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CalidadProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CalidadProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.calidadproductoSessionBean=new CalidadProductoSessionBean(); 
		this.calidadproductoConstantesFunciones=new CalidadProductoConstantesFunciones(); 
		this.calidadproductoBean=new CalidadProducto();//(this.calidadproductoConstantesFunciones); 		
		this.calidadproductoReturnGeneral=new CalidadProductoParameterReturnGeneral(); 
		
		this.calidadproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.calidadproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CalidadProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CalidadProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CalidadProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCalidadProducto(true);
			
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
			
			this.calidadproductoConstantesFunciones=new CalidadProductoConstantesFunciones(); 
			this.calidadproductoBean=new CalidadProducto();//this.calidadproductoConstantesFunciones); 			
			this.calidadproductoReturnGeneral=new CalidadProductoParameterReturnGeneral(); 
		
			CalidadProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Calidad Producto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.calidadproducto=new CalidadProducto();
			this.calidadproductos = new ArrayList<CalidadProducto>();
			this.calidadproductosAux = new ArrayList<CalidadProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic=new CalidadProductoLogic();
				this.calidadproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.calidadproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.calidadproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCalidadProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCalidadProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCalidadProducto);	
					}
					
					if(this.jInternalFrameImportacionCalidadProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCalidadProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCalidadProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCalidadProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCalidadProducto);
				this.jInternalFrameDetalleFormCalidadProducto.setVisible(false);
				this.jInternalFrameDetalleFormCalidadProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCalidadProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCalidadProducto);
					this.jInternalFrameReporteDinamicoCalidadProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoCalidadProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCalidadProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCalidadProducto);
					this.jInternalFrameImportacionCalidadProducto.setVisible(false);
					this.jInternalFrameImportacionCalidadProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCalidadProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCalidadProducto);
					this.jInternalFrameOrderByCalidadProducto.setVisible(false);
					this.jInternalFrameOrderByCalidadProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCalidadProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CalidadProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.calidadproductoReturnGeneral=new CalidadProductoParameterReturnGeneral();
			
			this.calidadproductoParameterGeneral=new CalidadProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.calidadproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CalidadProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(BodegaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroInventarioDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CalidadProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.calidadproductoSessionBean.getEsGuardarRelacionado(),this.calidadproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CalidadProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.calidadproductoSessionBean.getEsGuardarRelacionado(),this.calidadproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCalidadProducto=false;
			this.isVisibilidadCeldaDuplicarCalidadProducto=true;
			this.isVisibilidadCeldaCopiarCalidadProducto=true;
			this.isVisibilidadCeldaVerFormCalidadProducto=true;
			this.isVisibilidadCeldaOrdenCalidadProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=false;
			this.isVisibilidadCeldaModificarCalidadProducto=false;
			this.isVisibilidadCeldaActualizarCalidadProducto=false;
			this.isVisibilidadCeldaEliminarCalidadProducto=false;
			this.isVisibilidadCeldaCancelarCalidadProducto=false;
			this.isVisibilidadCeldaGuardarCalidadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosCalidadProducto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCalidadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCalidadProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCalidadProducto(false);
			
			this.setPermisosUsuarioCalidadProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.calidadproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.calidadproductoSessionBean.getEsGuardarRelacionado() && this.calidadproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCalidadProductoClasesRelacionadas();
			}
			
			if(this.calidadproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCalidadProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CalidadProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCalidadProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCalidadProducto();
			}
			
			if(!this.isPermisoBusquedaCalidadProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCalidadProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCalidadProducto,this.isPermisoPaginacionMedioCalidadProducto,this.isPermisoPaginacionTodoCalidadProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CalidadProductoConstantesFunciones.getTiposSeleccionarCalidadProducto());
				
				this.tiposColumnasSelect=CalidadProductoConstantesFunciones.getTiposSeleccionarCalidadProducto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectCalidadProducto();				
				//this.tiposRelacionesSelect=CalidadProductoConstantesFunciones.getTiposRelacionesCalidadProducto(true);
				
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
			//if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCalidadProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioCalidadProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioCalidadProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCalidadProducto() ;
			
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
			
			
			this.bodegaLogic=new BodegaLogic();
			this.parametroinventariodefectoLogic=new ParametroInventarioDefectoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				calidadproductoImplementable= (CalidadProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CalidadProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				calidadproductoImplementableHome= (CalidadProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CalidadProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.calidadproductos= new ArrayList<CalidadProducto>();
			this.calidadproductosEliminados= new ArrayList<CalidadProducto>();
						
			this.isEsNuevoCalidadProducto=false;
			this.esParaAccionDesdeFormularioCalidadProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCalidadProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCalidadProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CalidadProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CalidadProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCalidadProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCalidadProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCalidadProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCalidadProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCalidadProducto();
			}
			
			CalidadProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCalidadProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCalidadProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCalidadProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCalidadProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CalidadProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCalidadProducto() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(BodegaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(BodegaConstantesFunciones.SCLASSWEBTITULO);
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
			if(sTipo.equals("RelacionesCalidadProducto")) {
				iIndex=this.jInternalFrameDetalleFormCalidadProducto.jTabbedPaneRelacionesCalidadProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCalidadProducto.jTabbedPaneRelacionesCalidadProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();	
				
				

				if(sTitle.equals("Bodegas")) {
					if(!BodegaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCalidadProducto();

						this.cargarParteTabPanelRelacionadaBodega(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Inventario Defectos")) {
					if(!ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCalidadProducto();

						this.cargarParteTabPanelRelacionadaParametroInventarioDefecto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCalidadProducto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaBodega(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCalidadProducto.cargarSessionConBeanSwingJInternalFrameBodega(false,true,iIndex);
		this.jButtonBodegaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaBodega();

		//this.jTabbedPaneRelacionesCalidadProducto.updateUI();
		//this.jTabbedPaneRelacionesCalidadProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCalidadProducto.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroInventarioDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCalidadProducto.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(false,true,iIndex);
		this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();

		//this.jTabbedPaneRelacionesCalidadProducto.updateUI();
		//this.jTabbedPaneRelacionesCalidadProducto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCalidadProducto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Bodega")) {
				int row=this.jTableDatosCalidadProducto.getSelectedRow();
				jButtonBodegaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroInventarioDefecto")) {
				int row=this.jTableDatosCalidadProducto.getSelectedRow();
				jButtonParametroInventarioDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Bodega")) {

					if(this.isTienePermisosBodega && this.calidadproductoConstantesFunciones.mostrarBodegaCalidadProducto && !CalidadProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Bodegas"+"("+BodegaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Bodegas");

						if(calidadproductoConstantesFunciones.resaltarBodegaCalidadProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(calidadproductoConstantesFunciones.resaltarBodegaCalidadProducto);
						}

						jmenuItem.setEnabled(this.calidadproductoConstantesFunciones.activarBodegaCalidadProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Bodega"));

						

						this.jInternalFrameDetalleFormCalidadProducto.jmenuDetalleCalidadProducto.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Inventario Defecto")) {

					if(this.isTienePermisosParametroInventarioDefecto && this.calidadproductoConstantesFunciones.mostrarParametroInventarioDefectoCalidadProducto && !CalidadProductoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Inventario Defectos"+"("+ParametroInventarioDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Inventario Defectos");

						if(calidadproductoConstantesFunciones.resaltarParametroInventarioDefectoCalidadProducto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(calidadproductoConstantesFunciones.resaltarParametroInventarioDefectoCalidadProducto);
						}

						jmenuItem.setEnabled(this.calidadproductoConstantesFunciones.activarParametroInventarioDefectoCalidadProducto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroInventarioDefecto"));

						

						this.jInternalFrameDetalleFormCalidadProducto.jmenuDetalleCalidadProducto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyCalidadProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCalidadProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCalidadProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCalidadProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCalidadProducto();
		
		this.cargarCombosFrameForeignKeyCalidadProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCalidadProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCalidadProducto();
		}
	}
	
	
	
	public void jButtonNuevoCalidadProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.calidadproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCalidadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			
			
			if(jTableDatosCalidadProducto.getRowCount()>=1) {
				jTableDatosCalidadProducto.removeRowSelectionInterval(0, jTableDatosCalidadProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoCalidadProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCalidadProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCalidadProducto(true);			
			//this.calidadproducto=new CalidadProducto();
			//this.calidadproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCalidadProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCalidadProducto() ;
			
			if(CalidadProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCalidadProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.calidadproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);				
			
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			
			if(this.calidadproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CalidadProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCalidadProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CalidadProducto> calidadproductosSeleccionados=new ArrayList<CalidadProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCalidadProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCalidadProducto.getSelectedRows().length;			
			}
			
			calidadproductosSeleccionados=this.getCalidadProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCalidadProducto--;			
				//CalidadProducto calidadproductoAux= new CalidadProducto();			
				//calidadproductoAux.setId(this.iIdNuevoCalidadProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CalidadProducto calidadproductoOrigen=new CalidadProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CalidadProducto calidadproductoOrigen : calidadproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							calidadproductoOrigen =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							calidadproductoOrigen =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCalidadProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.calidadproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCalidadProducto(calidadproductoOrigen,this.calidadproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.calidadproductoLogic.getCalidadProductos().add(this.calidadproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.calidadproductos.add(this.calidadproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCalidadProducto(false);
				
				this.jTableDatosCalidadProducto.setRowSelectionInterval(this.getIndiceNuevoCalidadProducto(), this.getIndiceNuevoCalidadProducto());
				
				int iLastRow =  this.jTableDatosCalidadProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCalidadProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCalidadProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCalidadProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCalidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CalidadProducto> calidadproductosSeleccionados=new ArrayList<CalidadProducto>();									
		
			CalidadProducto calidadproductoOrigen=new CalidadProducto();
			CalidadProducto calidadproductoDestino=new CalidadProducto();
				
			calidadproductosSeleccionados=this.getCalidadProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCalidadProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || calidadproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCalidadProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						calidadproductoOrigen =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						calidadproductoOrigen =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						calidadproductoDestino =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						calidadproductoDestino =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				calidadproductoOrigen =calidadproductosSeleccionados.get(0);
				calidadproductoDestino =calidadproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCalidadProducto(calidadproductoOrigen,calidadproductoDestino,true,false);
				
				calidadproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(calidadproductoDestino,calidadproductoLogic.getCalidadProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(calidadproductoDestino,calidadproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCalidadProducto(false);
				
				//this.jTableDatosCalidadProducto.setRowSelectionInterval(this.getIndiceNuevoCalidadProducto(), this.getIndiceNuevoCalidadProducto());
				
				int iLastRow =  this.jTableDatosCalidadProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCalidadProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCalidadProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCalidadProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCalidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCalidadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCalidadProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCalidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCalidadProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCalidadProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCalidadProducto.setVisible(!isVisible);
			this.jPanelPaginacionCalidadProducto.setVisible(!isVisible);
			this.jPanelAccionesCalidadProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCalidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCalidadProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCalidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCalidadProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCalidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCalidadProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCalidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCalidadProducto();
			
			this.abrirFrameOrderByCalidadProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCalidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCalidadProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCalidadProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCalidadProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCalidadProducto.isMaximum()) {
					this.jInternalFrameDetalleFormCalidadProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCalidadProducto.setSize(this.jInternalFrameDetalleFormCalidadProducto.iWidthFormulario,this.jInternalFrameDetalleFormCalidadProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCalidadProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCalidadProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCalidadProducto.isMaximum()) {
						this.jInternalFrameDetalleFormCalidadProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCalidadProducto.jContentPaneDetalleCalidadProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCalidadProducto.jTabbedPaneRelacionesCalidadProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCalidadProducto.jContentPaneDetalleCalidadProducto.getWidth(),CalidadProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCalidadProducto.jTabbedPaneRelacionesCalidadProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCalidadProducto.jContentPaneDetalleCalidadProducto.getWidth(),CalidadProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCalidadProducto.jTabbedPaneRelacionesCalidadProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCalidadProducto.jContentPaneDetalleCalidadProducto.getWidth(),CalidadProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(BodegaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaBodega();
					}

					if(ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroInventarioDefecto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCalidadProducto.setVisible(true);
	        this.jInternalFrameDetalleFormCalidadProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCalidadProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCalidadProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCalidadProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCalidadProducto,false,this);
				} else {
					this.jInternalFrameOrderByCalidadProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCalidadProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCalidadProducto);
				this.jInternalFrameOrderByCalidadProducto.setVisible(false);
				this.jInternalFrameOrderByCalidadProducto.setSelected(false);
				
				this.jInternalFrameOrderByCalidadProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCalidadProducto"));
				
				this.inicializarActualizarBindingTablaOrderByCalidadProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCalidadProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCalidadProducto==null) {
				
				this.jInternalFrameImportacionCalidadProducto=new ImportacionJInternalFrame(CalidadProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCalidadProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCalidadProducto);
				this.jInternalFrameImportacionCalidadProducto.setVisible(false);
				this.jInternalFrameImportacionCalidadProducto.setSelected(false);


				this.jInternalFrameImportacionCalidadProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCalidadProducto"));
				this.jInternalFrameImportacionCalidadProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCalidadProducto"));
				this.jInternalFrameImportacionCalidadProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCalidadProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCalidadProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCalidadProducto==null) {
				this.jInternalFrameReporteDinamicoCalidadProducto=new ReporteDinamicoJInternalFrame(CalidadProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCalidadProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCalidadProducto);
				this.jInternalFrameReporteDinamicoCalidadProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoCalidadProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCalidadProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCalidadProducto"));
				this.jInternalFrameReporteDinamicoCalidadProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCalidadProducto"));
				this.jInternalFrameReporteDinamicoCalidadProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCalidadProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCalidadProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaBodega() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCalidadProducto.jContentPaneDetalleCalidadProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroInventarioDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCalidadProducto.jContentPaneDetalleCalidadProducto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleCalidadProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCalidadProducto);
			
	       	this.jInternalFrameDetalleFormCalidadProducto.setVisible(false);
	        this.jInternalFrameDetalleFormCalidadProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormCalidadProducto.dispose();
			//this.jInternalFrameDetalleFormCalidadProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCalidadProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCalidadProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoCalidadProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCalidadProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCalidadProducto.setVisible(true);
	        this.jInternalFrameImportacionCalidadProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCalidadProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCalidadProducto.setVisible(true);
	        this.jInternalFrameOrderByCalidadProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCalidadProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCalidadProducto.setVisible(false);
	        this.jInternalFrameOrderByCalidadProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCalidadProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCalidadProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoCalidadProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCalidadProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCalidadProducto.setVisible(false);
	        this.jInternalFrameImportacionCalidadProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCalidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCalidadProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCalidadProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCalidadProducto(true);
			//this.isEsNuevoCalidadProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproducto =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.calidadproducto =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCalidadProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCalidadProducto(false) ;
			
			if(calidadproductoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaSessionBean.getEsGuardarRelacionado() && BodegaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonBodegaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado() && ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroInventarioDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(CalidadProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCalidadProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCalidadProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCalidadProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproducto =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calidadproducto =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCalidadProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCalidadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCalidadProducto(true);
			//this.isEsNuevoCalidadProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproducto =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.calidadproducto =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.calidadproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCalidadProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCalidadProducto(false) ;
			
			if(CalidadProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCalidadProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCalidadProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarCalidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCalidadProducto(false);
			
			//if(!this.isEsNuevoCalidadProducto) {								
				int intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproducto =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.calidadproducto =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CalidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCalidadProducto(this.calidadproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);
				
			}
			
			if(this.permiteMantenimiento(this.calidadproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCalidadProducto=true;
					this.inicializarActualizarBindingTablaCalidadProducto(false);
					this.isEsNuevoCalidadProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCalidadProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCalidadProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCalidadProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCalidadProducto(false);
				
				this.habilitarDeshabilitarControlesCalidadProducto(false);
			
												
				
				if(CalidadProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCalidadProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCalidadProductoActionPerformed(evt,calidadproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCalidadProducto(this.calidadproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCalidadProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,calidadproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.calidadproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CalidadProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalidadProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCalidadProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproducto =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				this.calidadproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.calidadproducto =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				this.calidadproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.calidadproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CalidadProductoModel) this.jTableDatosCalidadProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCalidadProducto=true;
				this.inicializarActualizarBindingTablaCalidadProducto(false);
				this.isEsNuevoCalidadProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCalidadProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCalidadProducto(false);
				
				this.habilitarDeshabilitarControlesCalidadProducto(false);
				
				
				
				if(CalidadProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCalidadProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCalidadProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCalidadProducto.getRowCount()>=1) {
				jTableDatosCalidadProducto.removeRowSelectionInterval(0, jTableDatosCalidadProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCalidadProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCalidadProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCalidadProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCalidadProducto(false) ;
			
			this.isEsNuevoCalidadProducto=false;
			
			if(CalidadProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCalidadProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCalidadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCalidadProducto(false);
				
				//SI ES MANUAL
				if(CalidadProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCalidadProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCalidadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCalidadProducto--;			
			//CalidadProducto calidadproductoAux= new CalidadProducto();			
			//calidadproductoAux.setId(this.iIdNuevoCalidadProducto);
			
			if(this.jInternalFrameDetalleFormCalidadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCalidadProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);
			
			this.calidadproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.calidadproductoLogic.getCalidadProductos().add(this.calidadproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.calidadproductos.add(this.calidadproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCalidadProducto(false);
			
			this.jTableDatosCalidadProducto.setRowSelectionInterval(this.getIndiceNuevoCalidadProducto(), this.getIndiceNuevoCalidadProducto());
			
			int iLastRow =  this.jTableDatosCalidadProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCalidadProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCalidadProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCalidadProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCalidadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCalidadProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCalidadProducto(false);
			
			//SI ES MANUAL
			if(CalidadProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCalidadProducto();
			}
			
			//this.abrirFrameTreeCalidadProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCalidadProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Calidad ProductoS ?", "MANTENIMIENTO DE Calidad Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCalidadProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCalidadProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.calidadproductoReturnGeneral=calidadproductoLogic.procesarImportacionCalidadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.calidadproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCalidadProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCalidadProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCalidadProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCalidadProducto.setFileImportacion(this.jInternalFrameImportacionCalidadProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCalidadProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCalidadProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCalidadProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCalidadProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCalidadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CalidadProducto> calidadproductosSeleccionados=new ArrayList<CalidadProducto>();		

		calidadproductosSeleccionados=this.getCalidadProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCalidadProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCalidadProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CalidadProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CalidadProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteCalidadProductos("Todos",calidadproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calidad Producto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCalidadProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCalidadProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CalidadProductoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CalidadProductoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoCalidadProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCalidadProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCalidadProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CalidadProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CalidadProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCalidadProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CalidadProductoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CalidadProductoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCalidadProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCalidadProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CalidadProductoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CalidadProductoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoCalidadProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CalidadProducto> calidadproductosSeleccionados=new ArrayList<CalidadProducto>();		
		
		calidadproductosSeleccionados=this.getCalidadProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"calidadproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CalidadProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCalidadProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCalidadProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CalidadProductoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalidadProductoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CalidadProducto calidadproducto:calidadproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calidadproducto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CalidadProductoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CalidadProductoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CalidadProducto calidadproducto:calidadproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(calidadproducto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelCalidadProducto(row);				
			//	iRow++;
			//}				
			
			//for(CalidadProducto calidadproductoAux:calidadproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCalidadProducto(calidadproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calidad Producto",JOptionPane.INFORMATION_MESSAGE);
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
				this.calidadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCalidadProducto(false);
			
			//SI ES MANUAL
			if(CalidadProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCalidadProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCalidadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCalidadProducto(false);
			
			//SI ES MANUAL
			if(CalidadProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCalidadProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCalidadProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCalidadProducto(false);
			
			//SI ES MANUAL
			if(CalidadProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCalidadProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCalidadProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCalidadProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCalidadProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCalidadProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCalidadProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCalidadProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosCalidadProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosCalidadProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCalidadProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCalidadProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCalidadProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCalidadProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCalidadProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCalidadProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCalidadProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCalidadProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CalidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CalidadProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCalidadProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCalidadProducto();
		
		this.inicializarActualizarBindingBotonesManualCalidadProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCalidadProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCalidadProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCalidadProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCalidadProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCalidadProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCalidadProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCalidadProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCalidadProducto.jCheckBoxPostAccionNuevoCalidadProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCalidadProducto.jCheckBoxPostAccionSinCerrarCalidadProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCalidadProducto.jCheckBoxPostAccionSinMensajeCalidadProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCalidadProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCalidadProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCalidadProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
				this.jInternalFrameDetalleFormCalidadProducto.jCheckBoxPostAccionNuevoCalidadProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCalidadProducto.jCheckBoxPostAccionSinCerrarCalidadProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCalidadProducto.jCheckBoxPostAccionSinMensajeCalidadProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCalidadProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCalidadProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCalidadProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCalidadProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCalidadProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCalidadProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCalidadProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCalidadProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCalidadProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCalidadProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCalidadProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCalidadProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCalidadProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCalidadProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(CalidadProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCalidadProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCalidadProducto() throws Exception {
		try	{
			if(CalidadProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCalidadProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCalidadProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCalidadProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCalidadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCalidadProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCalidadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCalidadProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCalidadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCalidadProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCalidadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCalidadProducto.addItem(reporte);
			}
			
			
			if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCalidadProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCalidadProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCalidadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCalidadProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCalidadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCalidadProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCalidadProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCalidadProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCalidadProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCalidadProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCalidadProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCalidadProducto!=null) {
				this.jInternalFrameReporteDinamicoCalidadProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCalidadProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCalidadProducto!=null) {
				this.jInternalFrameReporteDinamicoCalidadProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCalidadProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCalidadProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoCalidadProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCalidadProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCalidadProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCalidadProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCalidadProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCalidadProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCalidadProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoCalidadProducto.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreCalidadProducto.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCalidadProducto(Boolean esInicializar) throws Exception {				
		if(CalidadProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCalidadProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCalidadProducto() throws Exception {
		this.inicializarActualizarBindingTablaCalidadProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCalidadProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCalidadProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCalidadProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCalidadProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CalidadProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCalidadProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCalidadProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CalidadProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCalidadProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalidadProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CalidadProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCalidadProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCalidadProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CalidadProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCalidadProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCalidadProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=calidadproductoLogic.getCalidadProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=calidadproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CalidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCalidadProducto.setModel(new CalidadProductoModel(this.calidadproductoLogic.getCalidadProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCalidadProducto.setModel(new CalidadProductoModel(this.calidadproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCalidadProducto!=null && this.jInternalFrameOrderByCalidadProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCalidadProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCalidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalidadProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CalidadProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO,calidadproductoConstantesFunciones.resaltarSeleccionarCalidadProducto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO,calidadproductoConstantesFunciones.resaltarSeleccionarCalidadProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCalidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalidadProducto,CalidadProductoConstantesFunciones.LABEL_ID));

		if(this.calidadproductoConstantesFunciones.mostraridCalidadProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalidadProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.calidadproductoConstantesFunciones.resaltaridCalidadProducto,this.calidadproductoConstantesFunciones.activaridCalidadProducto,this,true,"idCalidadProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.calidadproductoConstantesFunciones.resaltaridCalidadProducto,this.calidadproductoConstantesFunciones.activaridCalidadProducto,this,true,"idCalidadProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalidadProducto,CalidadProductoConstantesFunciones.LABEL_CODIGO));

		if(this.calidadproductoConstantesFunciones.mostrarcodigoCalidadProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalidadProductoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.calidadproductoConstantesFunciones.resaltarcodigoCalidadProducto,this.calidadproductoConstantesFunciones.activarcodigoCalidadProducto,this,true,"codigoCalidadProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.calidadproductoConstantesFunciones.resaltarcodigoCalidadProducto,this.calidadproductoConstantesFunciones.activarcodigoCalidadProducto,this,true,"codigoCalidadProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CalidadProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCalidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCalidadProducto,CalidadProductoConstantesFunciones.LABEL_NOMBRE));

		if(this.calidadproductoConstantesFunciones.mostrarnombreCalidadProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CalidadProductoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.calidadproductoConstantesFunciones.resaltarnombreCalidadProducto,this.calidadproductoConstantesFunciones.activarnombreCalidadProducto,this,true,"nombreCalidadProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.calidadproductoConstantesFunciones.resaltarnombreCalidadProducto,this.calidadproductoConstantesFunciones.activarnombreCalidadProducto,this,true,"nombreCalidadProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CalidadProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosBodega && this.calidadproductoConstantesFunciones.mostrarBodegaCalidadProducto && !CalidadProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Bodegas");
				tableColumn.setHeaderValue("Bodegas");
				tableColumn.setCellRenderer(new BodegaTableCell(calidadproductoConstantesFunciones.resaltarBodegaCalidadProducto,this,this.calidadproductoConstantesFunciones.activarBodegaCalidadProducto));
				tableColumn.setCellEditor(new BodegaTableCell(calidadproductoConstantesFunciones.resaltarBodegaCalidadProducto,this,this.calidadproductoConstantesFunciones.activarBodegaCalidadProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCalidadProducto.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroInventarioDefecto && this.calidadproductoConstantesFunciones.mostrarParametroInventarioDefectoCalidadProducto && !CalidadProductoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Inventario Defectos");
				tableColumn.setHeaderValue("Parametro Inventario Defectos");
				tableColumn.setCellRenderer(new ParametroInventarioDefectoTableCell(calidadproductoConstantesFunciones.resaltarParametroInventarioDefectoCalidadProducto,this,this.calidadproductoConstantesFunciones.activarParametroInventarioDefectoCalidadProducto));
				tableColumn.setCellEditor(new ParametroInventarioDefectoTableCell(calidadproductoConstantesFunciones.resaltarParametroInventarioDefectoCalidadProducto,this,this.calidadproductoConstantesFunciones.activarParametroInventarioDefectoCalidadProducto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCalidadProducto.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.calidadproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.calidadproductoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCalidadProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.calidadproductoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.calidadproductoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCalidadProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCalidadProducto && this.isPermisoGuardarCambiosCalidadProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.calidadproductoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.calidadproductoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCalidadProducto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.calidadproductoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosCalidadProducto.addColumn(tableColumn);
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
			
			this.jTableDatosCalidadProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCalidadProducto && this.isPermisoGuardarCambiosCalidadProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.calidadproductoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCalidadProducto && this.isPermisoGuardarCambiosCalidadProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCalidadProducto.moveColumn(this.jTableDatosCalidadProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCalidadProducto.moveColumn(this.jTableDatosCalidadProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.calidadproductoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosCalidadProducto.moveColumn(this.jTableDatosCalidadProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCalidadProducto.moveColumn(this.jTableDatosCalidadProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCalidadProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCalidadProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCalidadProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CalidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCalidadProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCalidadProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CalidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CalidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCalidadProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCalidadProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCalidadProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=calidadproductoLogic.getCalidadProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=calidadproductos.size()-1;
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
		//this.jTableDatosCalidadProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCalidadProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCalidadProducto();
			
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
				
				//this.isEsNuevoCalidadProducto=false;
					
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			
				if(this.calidadproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCalidadProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCalidadProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCalidadProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproducto =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calidadproducto =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.calidadproducto.getsType().equals("DUPLICADO")
				   || this.calidadproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCalidadProducto=true;
				
				} else {
					this.isEsNuevoCalidadProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.calidadproducto.getId()>=0 && !this.calidadproducto.getIsNew()) {						
						this.isEsNuevoCalidadProducto=false;
						
					} else {
						this.isEsNuevoCalidadProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCalidadProducto(esRelaciones);						
				
				this.seleccionarCalidadProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.calidadproducto.getId()<0) {
					this.isEsNuevoCalidadProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCalidadProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCalidadProducto(evt,rowIndex);
				}	
				
				if(this.calidadproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CalidadProducto: " + this.dDif); 
					}
				}								
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCalidadProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.calidadproducto)) {
					if(this.calidadproducto.getId()>0) {
						this.calidadproducto.setIsDeleted(true);
						
						this.calidadproductosEliminados.add(this.calidadproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.calidadproductoLogic.getCalidadProductos().remove(this.calidadproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.calidadproductos.remove(this.calidadproducto);				
					}
					
					
					((CalidadProductoModel) this.jTableDatosCalidadProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCalidadProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCalidadProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCalidadProducto) {
			
			if(this.jInternalFrameDetalleFormCalidadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCalidadProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCalidadProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproducto =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calidadproducto =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CalidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCalidadProducto(this.calidadproducto);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCalidadProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCalidadProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCalidadProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCalidadProducto(CalidadProducto calidadproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCalidadProducto(calidadproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCalidadProducto(CalidadProducto calidadproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCalidadProducto(calidadproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCalidadProducto(calidadproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCalidadProducto(calidadproducto);
	}
	
	public void setVariablesObjetoActualToFormularioCalidadProducto(CalidadProducto calidadproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCalidadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCalidadProducto.jTextFieldidCalidadProducto.setText(calidadproducto.getId().toString());
			this.jInternalFrameDetalleFormCalidadProducto.jTextFieldcodigoCalidadProducto.setText(calidadproducto.getcodigo());
			this.jInternalFrameDetalleFormCalidadProducto.jTextAreanombreCalidadProducto.setText(calidadproducto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CalidadProducto calidadproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,calidadproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CalidadProducto calidadproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				calidadproductoLocal=this.calidadproducto;
			} else {
				calidadproductoLocal=this.calidadproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(calidadproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCalidadProducto(calidadproductoLocal,true);
					
					if(calidadproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(calidadproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(calidadproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCalidadProducto(CalidadProducto calidadproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCalidadProducto(calidadproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(calidadproducto);
	}
	
	public void setVariablesFormularioToObjetoActualCalidadProducto(CalidadProducto calidadproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCalidadProducto(calidadproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCalidadProducto(CalidadProducto calidadproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCalidadProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCalidadProducto.jTextFieldidCalidadProducto.getText()==null || this.jInternalFrameDetalleFormCalidadProducto.jTextFieldidCalidadProducto.getText()=="" || this.jInternalFrameDetalleFormCalidadProducto.jTextFieldidCalidadProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormCalidadProducto.jTextFieldidCalidadProducto.setText("0");
			}

			if(conColumnasBase) {calidadproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormCalidadProducto.jTextFieldidCalidadProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CalidadProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalidadProducto.jLabelIdCalidadProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			calidadproducto.setcodigo(this.jInternalFrameDetalleFormCalidadProducto.jTextFieldcodigoCalidadProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CalidadProductoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalidadProducto.jLabelcodigoCalidadProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			calidadproducto.setnombre(this.jInternalFrameDetalleFormCalidadProducto.jTextAreanombreCalidadProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CalidadProductoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCalidadProducto.jLabelnombreCalidadProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCalidadProducto(CalidadProducto calidadproductoBean,CalidadProducto calidadproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCalidadProducto(CalidadProducto calidadproductoOrigen,CalidadProducto calidadproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && calidadproductoOrigen.getId()!=null && !calidadproductoOrigen.getId().equals(0L))) {calidadproducto.setId(calidadproductoOrigen.getId());}}
			if(conDefault || (!conDefault && calidadproductoOrigen.getcodigo()!=null && !calidadproductoOrigen.getcodigo().equals(""))) {calidadproducto.setcodigo(calidadproductoOrigen.getcodigo());}
			if(conDefault || (!conDefault && calidadproductoOrigen.getnombre()!=null && !calidadproductoOrigen.getnombre().equals(""))) {calidadproducto.setnombre(calidadproductoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCalidadProducto(CalidadProducto calidadproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCalidadProducto.jTextFieldidCalidadProducto.setText(calidadproducto.getId().toString());
			this.jInternalFrameDetalleFormCalidadProducto.jTextFieldcodigoCalidadProducto.setText(calidadproducto.getcodigo());
			this.jInternalFrameDetalleFormCalidadProducto.jTextAreanombreCalidadProducto.setText(calidadproducto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCalidadProducto(CalidadProductoBean calidadproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCalidadProducto.jTextFieldidCalidadProducto.setText(calidadproductoBean.getId().toString());
			this.jInternalFrameDetalleFormCalidadProducto.jTextFieldcodigoCalidadProducto.setText(calidadproductoBean.getcodigo());
			this.jInternalFrameDetalleFormCalidadProducto.jTextAreanombreCalidadProducto.setText(calidadproductoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCalidadProducto(CalidadProductoParameterReturnGeneral calidadproductoReturnGeneral,CalidadProductoBean calidadproductoBean,Boolean conDefault) throws Exception { 
		try {
			CalidadProducto calidadproductoLocal=new CalidadProducto();
			
			calidadproductoLocal=calidadproductoReturnGeneral.getCalidadProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && calidadproductoLocal.getId()!=null && !calidadproductoLocal.getId().equals(0L))) {calidadproductoBean.setId(calidadproductoLocal.getId());}}
			if(conDefault || (!conDefault && calidadproductoLocal.getcodigo()!=null && !calidadproductoLocal.getcodigo().equals(""))) {calidadproductoBean.setcodigo(calidadproductoLocal.getcodigo());}
			if(conDefault || (!conDefault && calidadproductoLocal.getnombre()!=null && !calidadproductoLocal.getnombre().equals(""))) {calidadproductoBean.setnombre(calidadproductoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCalidadProductoGenerico(Long idCalidadProductoSeleccionado,JComboBox jComboBoxCalidadProducto,List<CalidadProducto> calidadproductosLocal)throws Exception {
		try {
			CalidadProducto  calidadproductoTemp=null;

			for(CalidadProducto calidadproductoAux:calidadproductosLocal) {
				if(calidadproductoAux.getId()!=null && calidadproductoAux.getId().equals(idCalidadProductoSeleccionado)) {
					calidadproductoTemp=calidadproductoAux;
					break;
				}
			}

			jComboBoxCalidadProducto.setSelectedItem(calidadproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCalidadProductoGenerico(JComboBox jComboBoxCalidadProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCalidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCalidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCalidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCalidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCalidadProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCalidadProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCalidadProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCalidadProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCalidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCalidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Bodega")) {
			jButtonBodegaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ParametroInventarioDefecto")) {
			jButtonParametroInventarioDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			calidadproducto=(CalidadProducto) calidadproductoLogic.getCalidadProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			calidadproducto =(CalidadProducto) calidadproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CalidadProducto calidadproductoRow=new CalidadProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			calidadproductoRow=(CalidadProducto) calidadproductoLogic.getCalidadProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			calidadproductoRow=(CalidadProducto) calidadproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonBodegaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,CalidadProducto calidadproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCalidadProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calidadproducto = (CalidadProducto)this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.calidadproducto = (CalidadProducto)this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(calidadproducto!=null) {
						this.calidadproducto = calidadproducto;
					} else {
						this.calidadproducto = new CalidadProducto();
					}
				}

				if(this.isTienePermisosBodega && this.permiteMantenimiento(this.calidadproducto)) {
					BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFramePopup=new BodegaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						bodegaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFramePopup;
					} else {
						bodegaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame;
					}

					List<CalidadProducto> calidadproductos=new ArrayList<CalidadProducto>();
					calidadproductos.add(this.calidadproducto);
					if(!esRelacionado) {
						//bodegaBeanSwingJInternalFrame.bodegaSessionBean.setConGuardarRelaciones(false);
						//bodegaBeanSwingJInternalFrame.bodegaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					bodegaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCalidadProducto.cargarBodegaBeanSwingJInternalFrame(calidadproductos,this.calidadproducto,bodegaBeanSwingJInternalFrame,/*conInicializar,*/bodegaBeanSwingJInternalFrame.bodegaSessionBean.getConGuardarRelaciones(),bodegaBeanSwingJInternalFrame.bodegaSessionBean.getEsGuardarRelacionado());
					bodegaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						bodegaBeanSwingJInternalFrame.actualizarEstadoPanelsBodega("no_relacionado");

						bodegaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(BodegaConstantesFunciones.ITAMANIOFILATABLA + (BodegaConstantesFunciones.ITAMANIOFILATABLA/2));

						bodegaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCalidadProducto=(TitledBorder)this.jScrollPanelDatosCalidadProducto.getBorder();
						TitledBorder titledBorderBodega=(TitledBorder)bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

						titledBorderBodega.setTitle(titledBorderCalidadProducto.getTitle() + " -> Bodega");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,bodegaBeanSwingJInternalFrame);
						}

						bodegaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(bodegaBeanSwingJInternalFrame);

						bodegaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.calidadproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Bodega",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroInventarioDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,CalidadProducto calidadproducto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCalidadProducto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calidadproducto = (CalidadProducto)this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.calidadproducto = (CalidadProducto)this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(calidadproducto!=null) {
						this.calidadproducto = calidadproducto;
					} else {
						this.calidadproducto = new CalidadProducto();
					}
				}

				if(this.isTienePermisosParametroInventarioDefecto && this.permiteMantenimiento(this.calidadproducto)) {
					ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFramePopup;
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame;
					}

					List<CalidadProducto> calidadproductos=new ArrayList<CalidadProducto>();
					calidadproductos.add(this.calidadproducto);
					if(!esRelacionado) {
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
						//parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCalidadProducto.cargarParametroInventarioDefectoBeanSwingJInternalFrame(calidadproductos,this.calidadproducto,parametroinventariodefectoBeanSwingJInternalFrame,/*conInicializar,*/parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getConGuardarRelaciones(),parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.getEsGuardarRelacionado());
					parametroinventariodefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");

						parametroinventariodefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroInventarioDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametroinventariodefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCalidadProducto=(TitledBorder)this.jScrollPanelDatosCalidadProducto.getBorder();
						TitledBorder titledBorderParametroInventarioDefecto=(TitledBorder)parametroinventariodefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroInventarioDefecto.getBorder();

						titledBorderParametroInventarioDefecto.setTitle(titledBorderCalidadProducto.getTitle() + " -> Parametro Inventario Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametroinventariodefectoBeanSwingJInternalFrame);
						}

						parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametroinventariodefectoBeanSwingJInternalFrame);

						parametroinventariodefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.calidadproductoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Inventario Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCalidadProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCalidadProducto.setVisible((this.isVisibilidadCeldaNuevoCalidadProducto && this.isPermisoNuevoCalidadProducto));			
			this.jButtonDuplicarCalidadProducto.setVisible((this.isVisibilidadCeldaDuplicarCalidadProducto && this.isPermisoDuplicarCalidadProducto));			
			this.jButtonCopiarCalidadProducto.setVisible((this.isVisibilidadCeldaCopiarCalidadProducto && this.isPermisoCopiarCalidadProducto));
			this.jButtonVerFormCalidadProducto.setVisible((this.isVisibilidadCeldaVerFormCalidadProducto && this.isPermisoVerFormCalidadProducto));
			
			this.jButtonAbrirOrderByCalidadProducto.setVisible((this.isVisibilidadCeldaOrdenCalidadProducto && this.isPermisoOrdenCalidadProducto));			
			
			this.jButtonNuevoRelacionesCalidadProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesCalidadProducto && this.isPermisoNuevoCalidadProducto));			
			this.jButtonNuevoGuardarCambiosCalidadProducto.setVisible((this.isVisibilidadCeldaNuevoCalidadProducto && this.isPermisoNuevoCalidadProducto && this.isPermisoGuardarCambiosCalidadProducto));
			
			if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
			this.jInternalFrameDetalleFormCalidadProducto.jButtonModificarCalidadProducto.setVisible((this.isVisibilidadCeldaModificarCalidadProducto && this.isPermisoActualizarCalidadProducto));	
			this.jInternalFrameDetalleFormCalidadProducto.jButtonActualizarCalidadProducto.setVisible((this.isVisibilidadCeldaActualizarCalidadProducto && this.isPermisoActualizarCalidadProducto));	
			this.jInternalFrameDetalleFormCalidadProducto.jButtonEliminarCalidadProducto.setVisible((this.isVisibilidadCeldaEliminarCalidadProducto && this.isPermisoEliminarCalidadProducto));
			this.jInternalFrameDetalleFormCalidadProducto.jButtonCancelarCalidadProducto.setVisible(this.isVisibilidadCeldaCancelarCalidadProducto);							
			this.jInternalFrameDetalleFormCalidadProducto.jButtonGuardarCambiosCalidadProducto.setVisible((this.isVisibilidadCeldaGuardarCalidadProducto && this.isPermisoGuardarCambiosCalidadProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaCalidadProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosCalidadProducto && this.isPermisoGuardarCambiosCalidadProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCalidadProducto.setVisible((this.isVisibilidadCeldaNuevoCalidadProducto && this.isPermisoNuevoCalidadProducto));						
			this.jButtonDuplicarToolBarCalidadProducto.setVisible((this.isVisibilidadCeldaDuplicarCalidadProducto && this.isPermisoDuplicarCalidadProducto));						
			this.jButtonCopiarToolBarCalidadProducto.setVisible((this.isVisibilidadCeldaCopiarCalidadProducto && this.isPermisoCopiarCalidadProducto));			
			this.jButtonVerFormToolBarCalidadProducto.setVisible((this.isVisibilidadCeldaVerFormCalidadProducto && this.isPermisoVerFormCalidadProducto));			
			this.jButtonAbrirOrderByToolBarCalidadProducto.setVisible((this.isVisibilidadCeldaOrdenCalidadProducto && this.isPermisoOrdenCalidadProducto));
			this.jButtonNuevoRelacionesToolBarCalidadProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesCalidadProducto && this.isPermisoNuevoCalidadProducto));			
			this.jButtonNuevoGuardarCambiosToolBarCalidadProducto.setVisible((this.isVisibilidadCeldaNuevoCalidadProducto && this.isPermisoNuevoCalidadProducto && this.isPermisoGuardarCambiosCalidadProducto));			
			
			if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
			this.jInternalFrameDetalleFormCalidadProducto.jButtonModificarToolBarCalidadProducto.setVisible((this.isVisibilidadCeldaModificarCalidadProducto && this.isPermisoActualizarCalidadProducto));	
			this.jInternalFrameDetalleFormCalidadProducto.jButtonActualizarToolBarCalidadProducto.setVisible((this.isVisibilidadCeldaActualizarCalidadProducto  && this.isPermisoActualizarCalidadProducto));	
			this.jInternalFrameDetalleFormCalidadProducto.jButtonEliminarToolBarCalidadProducto.setVisible((this.isVisibilidadCeldaEliminarCalidadProducto && this.isPermisoEliminarCalidadProducto));
			this.jInternalFrameDetalleFormCalidadProducto.jButtonCancelarToolBarCalidadProducto.setVisible(this.isVisibilidadCeldaCancelarCalidadProducto);				
			this.jInternalFrameDetalleFormCalidadProducto.jButtonGuardarCambiosToolBarCalidadProducto.setVisible((this.isVisibilidadCeldaGuardarCalidadProducto && this.isPermisoGuardarCambiosCalidadProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCalidadProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosCalidadProducto && this.isPermisoGuardarCambiosCalidadProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCalidadProducto.setVisible((this.isVisibilidadCeldaNuevoCalidadProducto && this.isPermisoNuevoCalidadProducto));			
			this.jMenuItemDuplicarCalidadProducto.setVisible((this.isVisibilidadCeldaDuplicarCalidadProducto && this.isPermisoDuplicarCalidadProducto));			
			this.jMenuItemCopiarCalidadProducto.setVisible((this.isVisibilidadCeldaCopiarCalidadProducto && this.isPermisoCopiarCalidadProducto));			
			this.jMenuItemVerFormCalidadProducto.setVisible((this.isVisibilidadCeldaVerFormCalidadProducto && this.isPermisoVerFormCalidadProducto));			
			this.jMenuItemAbrirOrderByCalidadProducto.setVisible((this.isVisibilidadCeldaOrdenCalidadProducto && this.isPermisoOrdenCalidadProducto));			
			//this.jMenuItemMostrarOcultarCalidadProducto.setVisible((this.isVisibilidadCeldaOrdenCalidadProducto && this.isPermisoOrdenCalidadProducto));
			this.jMenuItemDetalleAbrirOrderByCalidadProducto.setVisible((this.isVisibilidadCeldaOrdenCalidadProducto && this.isPermisoOrdenCalidadProducto));			
			//this.jMenuItemDetalleMostrarOcultarCalidadProducto.setVisible((this.isVisibilidadCeldaOrdenCalidadProducto && this.isPermisoOrdenCalidadProducto));			
			this.jMenuItemNuevoRelacionesCalidadProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesCalidadProducto && this.isPermisoNuevoCalidadProducto));			
			this.jMenuItemNuevoGuardarCambiosCalidadProducto.setVisible((this.isVisibilidadCeldaNuevoCalidadProducto && this.isPermisoNuevoCalidadProducto && this.isPermisoGuardarCambiosCalidadProducto));									
			
			if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
			this.jInternalFrameDetalleFormCalidadProducto.jMenuItemModificarCalidadProducto.setVisible((this.isVisibilidadCeldaModificarCalidadProducto && this.isPermisoActualizarCalidadProducto));	
			this.jInternalFrameDetalleFormCalidadProducto.jMenuItemActualizarCalidadProducto.setVisible((this.isVisibilidadCeldaActualizarCalidadProducto && this.isPermisoActualizarCalidadProducto));	
			this.jInternalFrameDetalleFormCalidadProducto.jMenuItemEliminarCalidadProducto.setVisible((this.isVisibilidadCeldaEliminarCalidadProducto && this.isPermisoEliminarCalidadProducto));
			this.jInternalFrameDetalleFormCalidadProducto.jMenuItemCancelarCalidadProducto.setVisible(this.isVisibilidadCeldaCancelarCalidadProducto);				
			}
			
			this.jMenuItemGuardarCambiosCalidadProducto.setVisible((this.isVisibilidadCeldaGuardarCalidadProducto && this.isPermisoGuardarCambiosCalidadProducto));						
			this.jMenuItemGuardarCambiosTablaCalidadProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosCalidadProducto && this.isPermisoGuardarCambiosCalidadProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCalidadProducto=this.jButtonNuevoCalidadProducto.isVisible();
			this.isVisibilidadCeldaDuplicarCalidadProducto=this.jButtonDuplicarCalidadProducto.isVisible();
			this.isVisibilidadCeldaCopiarCalidadProducto=this.jButtonCopiarCalidadProducto.isVisible();
			this.isVisibilidadCeldaVerFormCalidadProducto=this.jButtonVerFormCalidadProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenCalidadProducto=this.jButtonAbrirOrderByCalidadProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=this.jButtonNuevoRelacionesCalidadProducto.isVisible();
			this.isVisibilidadCeldaModificarCalidadProducto=this.jButtonModificarCalidadProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
			this.isVisibilidadCeldaActualizarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jButtonActualizarCalidadProducto.isVisible();
			this.isVisibilidadCeldaEliminarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jButtonEliminarCalidadProducto.isVisible();
			this.isVisibilidadCeldaCancelarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jButtonCancelarCalidadProducto.isVisible();
			this.isVisibilidadCeldaGuardarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jButtonGuardarCambiosCalidadProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCalidadProducto=this.jButtonGuardarCambiosTablaCalidadProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCalidadProducto=this.jButtonNuevoToolBarCalidadProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=this.jButtonNuevoRelacionesToolBarCalidadProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
			this.isVisibilidadCeldaModificarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jButtonModificarToolBarCalidadProducto.isVisible();
			this.isVisibilidadCeldaActualizarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jButtonActualizarToolBarCalidadProducto.isVisible();
			this.isVisibilidadCeldaEliminarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jButtonEliminarToolBarCalidadProducto.isVisible();
			this.isVisibilidadCeldaCancelarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jButtonCancelarToolBarCalidadProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCalidadProducto=this.jButtonGuardarCambiosToolBarCalidadProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCalidadProducto=this.jButtonGuardarCambiosTablaToolBarCalidadProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCalidadProducto=this.jMenuItemNuevoCalidadProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=this.jMenuItemNuevoRelacionesCalidadProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
			this.isVisibilidadCeldaModificarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jMenuItemModificarCalidadProducto.isVisible();
			this.isVisibilidadCeldaActualizarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jMenuItemActualizarCalidadProducto.isVisible();
			this.isVisibilidadCeldaEliminarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jMenuItemEliminarCalidadProducto.isVisible();
			this.isVisibilidadCeldaCancelarCalidadProducto=this.jInternalFrameDetalleFormCalidadProducto.jMenuItemCancelarCalidadProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCalidadProducto=this.jMenuItemGuardarCambiosCalidadProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCalidadProducto=this.jMenuItemGuardarCambiosTablaCalidadProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCalidadProducto(Boolean esInicializar) {
		if(CalidadProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.calidadproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCalidadProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualCalidadProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCalidadProducto() {
		this.jButtonNuevoCalidadProducto.setVisible(this.isPermisoNuevoCalidadProducto);			
		this.jButtonDuplicarCalidadProducto.setVisible(this.isPermisoDuplicarCalidadProducto);			
		this.jButtonCopiarCalidadProducto.setVisible(this.isPermisoCopiarCalidadProducto);			
		this.jButtonVerFormCalidadProducto.setVisible(this.isPermisoVerFormCalidadProducto);			
		
		this.jButtonAbrirOrderByCalidadProducto.setVisible(this.isPermisoOrdenCalidadProducto);					
		
		this.jButtonNuevoRelacionesCalidadProducto.setVisible(this.isPermisoNuevoCalidadProducto);			
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalidadProducto.jButtonModificarCalidadProducto.setVisible(this.isPermisoActualizarCalidadProducto);	
			this.jInternalFrameDetalleFormCalidadProducto.jButtonActualizarCalidadProducto.setVisible(this.isPermisoActualizarCalidadProducto);	
			this.jInternalFrameDetalleFormCalidadProducto.jButtonEliminarCalidadProducto.setVisible(this.isPermisoEliminarCalidadProducto);
			this.jInternalFrameDetalleFormCalidadProducto.jButtonCancelarCalidadProducto.setVisible(this.isVisibilidadCeldaCancelarCalidadProducto);						
			this.jInternalFrameDetalleFormCalidadProducto.jButtonGuardarCambiosCalidadProducto.setVisible(this.isPermisoGuardarCambiosCalidadProducto);							
		}
		
		this.jButtonGuardarCambiosTablaCalidadProducto.setVisible(this.isPermisoActualizarCalidadProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCalidadProducto() {
		this.jInternalFrameDetalleFormCalidadProducto.jButtonModificarCalidadProducto.setVisible(this.isPermisoActualizarCalidadProducto);	
		this.jInternalFrameDetalleFormCalidadProducto.jButtonActualizarCalidadProducto.setVisible(this.isPermisoActualizarCalidadProducto);	
		this.jInternalFrameDetalleFormCalidadProducto.jButtonEliminarCalidadProducto.setVisible(this.isPermisoEliminarCalidadProducto);
		this.jInternalFrameDetalleFormCalidadProducto.jButtonCancelarCalidadProducto.setVisible(this.isVisibilidadCeldaCancelarCalidadProducto);							
		this.jInternalFrameDetalleFormCalidadProducto.jButtonGuardarCambiosCalidadProducto.setVisible((this.isVisibilidadCeldaGuardarCalidadProducto && this.isPermisoGuardarCambiosCalidadProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCalidadProducto() {
		if(CalidadProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCalidadProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCalidadProducto() {
	}
	
	public void jTableDatosCalidadProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCalidadProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCalidadProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalidadProducto(this.getcalidadproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calidadproducto =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calidadproducto =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calidadproducto==null) {
						this.calidadproducto = new CalidadProducto();
					}

					this.setVariablesFormularioToObjetoActualCalidadProducto(this.calidadproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);
				}

				if(this.calidadproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.calidadproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalidadProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCalidadProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalidadProducto(this.getcalidadproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calidadproducto =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calidadproducto =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calidadproducto==null) {
						this.calidadproducto = new CalidadProducto();
					}

					this.setVariablesFormularioToObjetoActualCalidadProducto(this.calidadproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);
				}

				if(this.calidadproducto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.calidadproducto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalidadProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCalidadProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCalidadProducto(this.getcalidadproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calidadproducto =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.calidadproducto =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.calidadproducto==null) {
						this.calidadproducto = new CalidadProducto();
					}

					this.setVariablesFormularioToObjetoActualCalidadProducto(this.calidadproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);
				}

				if(this.calidadproducto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.calidadproducto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCalidadProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoCalidadProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCalidadProducto(false,false);

			this.getCalidadProductosBusquedaPorCodigo();

			this.inicializarActualizarBindingCalidadProducto(false);

			//if(CalidadProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCalidadProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreCalidadProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCalidadProducto(false,false);

			this.getCalidadProductosBusquedaPorNombre();

			this.inicializarActualizarBindingCalidadProducto(false);

			//if(CalidadProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCalidadProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.calidadproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCalidadProducto() {
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
		

		if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
			this.jInternalFrameDetalleFormCalidadProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormCalidadProducto.dispose();
			this.jInternalFrameDetalleFormCalidadProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCalidadProducto!=null) {
			this.jInternalFrameReporteDinamicoCalidadProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCalidadProducto.dispose();
			this.jInternalFrameReporteDinamicoCalidadProducto=null;
		}
		
		if(this.jInternalFrameImportacionCalidadProducto!=null) {
			this.jInternalFrameImportacionCalidadProducto.setVisible(false);	    			
			this.jInternalFrameImportacionCalidadProducto.dispose();
			this.jInternalFrameImportacionCalidadProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCalidadProducto();
			
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoCalidadProducto")) {
				jButtonNuevoCalidadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCalidadProducto")) {
				jButtonDuplicarCalidadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCalidadProducto")) {
				jButtonCopiarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormCalidadProducto")) {
				jButtonVerFormCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCalidadProducto")) {
				jButtonNuevoCalidadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCalidadProducto")) {
				jButtonDuplicarCalidadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCalidadProducto")) {
				jButtonNuevoCalidadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCalidadProducto")) {
				jButtonDuplicarCalidadProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCalidadProducto")) {
				jButtonNuevoCalidadProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCalidadProducto")) {
				jButtonNuevoCalidadProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCalidadProducto")) {
				jButtonNuevoCalidadProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCalidadProducto")) {
				jButtonModificarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCalidadProducto")) {
				jButtonModificarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCalidadProducto")) {
				jButtonModificarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCalidadProducto")) {
				jButtonActualizarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCalidadProducto")) {
				jButtonActualizarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCalidadProducto")) {
				jButtonActualizarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarCalidadProducto")) {
				jButtonEliminarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCalidadProducto")) {
				jButtonEliminarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCalidadProducto")) {
				jButtonEliminarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarCalidadProducto")) {
				jButtonCancelarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCalidadProducto")) {
				jButtonCancelarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCalidadProducto")) {
				jButtonCancelarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarCalidadProducto")) {
				jButtonCerrarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCalidadProducto")) {
				jButtonCerrarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCalidadProducto")) {
				jButtonCerrarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCalidadProducto")) {
				jButtonMostrarOcultarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCalidadProducto")) {
				jButtonCancelarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCalidadProducto")) {
				jButtonGuardarCambiosCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCalidadProducto")) {
				jButtonGuardarCambiosCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCalidadProducto")) {
				jButtonCopiarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCalidadProducto")) {
				jButtonVerFormCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCalidadProducto")) {
				jButtonGuardarCambiosCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCalidadProducto")) {
				jButtonCopiarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCalidadProducto")) {
				jButtonVerFormCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCalidadProducto")) {
				jButtonGuardarCambiosCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCalidadProducto")) {
				jButtonGuardarCambiosCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCalidadProducto")) {
				jButtonGuardarCambiosCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCalidadProducto")) {
				jButtonRecargarInformacionCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCalidadProducto")) {
				jButtonRecargarInformacionCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCalidadProducto")) {
				jButtonRecargarInformacionCalidadProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCalidadProducto")) {
				jButtonAnterioresCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCalidadProducto")) {
				jButtonAnterioresCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCalidadProducto")) {
				jButtonAnterioresCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCalidadProducto")) {
				jButtonSiguientesCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCalidadProducto")) {
				jButtonSiguientesCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCalidadProducto")) {
				jButtonSiguientesCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCalidadProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByCalidadProducto")) {
				jButtonAbrirOrderByCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCalidadProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarCalidadProducto")) {
				jButtonMostrarOcultarCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCalidadProducto")) {
				jButtonNuevoGuardarCambiosCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCalidadProducto")) {
				jButtonNuevoGuardarCambiosCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCalidadProducto")) {
				jButtonNuevoGuardarCambiosCalidadProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCalidadProducto")) {
				jButtonCerrarReporteDinamicoCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCalidadProducto")) {
				jButtonGenerarReporteDinamicoCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCalidadProducto")) {
				
				jButtonGenerarExcelReporteDinamicoCalidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCalidadProducto")) {
				jButtonCerrarImportacionCalidadProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCalidadProducto")) {
				
				jButtonGenerarImportacionCalidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCalidadProducto")) {
				
				jButtonAbrirImportacionCalidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCalidadProducto")) {
				jComboBoxTiposAccionesCalidadProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCalidadProducto")) {
				jComboBoxTiposRelacionesCalidadProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCalidadProducto")) {
				jComboBoxTiposAccionesCalidadProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCalidadProducto")) {
				
				jComboBoxTiposSeleccionarCalidadProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCalidadProducto")) {
				jTextFieldValorCampoGeneralCalidadProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCalidadProducto")) {
				jButtonAbrirOrderByCalidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCalidadProducto")) {
				jButtonAbrirOrderByCalidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCalidadProducto")) {
				jButtonCerrarOrderByCalidadProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCalidadProductoBusqueda")) {
				this.jButtonidCalidadProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCalidadProductoBusqueda")) {
				this.jButtoncodigoCalidadProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCalidadProductoBusqueda")) {
				this.jButtonnombreCalidadProductoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoCalidadProducto")) {
				this.jButtonBusquedaPorCodigoCalidadProductoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreCalidadProducto")) {
				this.jButtonBusquedaPorNombreCalidadProductoActionPerformed(evt);
			}
			
			;
			
			
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCalidadProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCalidadProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
				


				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalidadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CalidadProducto calidadproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				calidadproductoLocal=this.calidadproducto;
			} else {
				calidadproductoLocal=this.calidadproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
							
				
				


				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalidadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalidadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoAnterior =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calidadproductoAnterior =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
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
			
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			
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
			
			


			
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCalidadProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
								
						
				


				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalidadProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
								
				
				


				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalidadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalidadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoAnterior =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calidadproductoAnterior =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalidadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoAnterior =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calidadproductoAnterior =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalidadProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
							
				
				


				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalidadProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCalidadProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calidadproductoAnterior =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.calidadproductoAnterior =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
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
			
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			
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
			
			


			
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalidadProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
								
				
				


				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalidadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalidadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoAnterior =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calidadproductoAnterior =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalidadProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCalidadProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCalidadProducto")) {
					jCheckBoxSeleccionarTodosCalidadProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCalidadProducto")) {
					jCheckBoxSeleccionadosCalidadProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCalidadProducto")) {
					
				}
				
				


				
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalidadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
												
				
				


				
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalidadProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalidadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCalidadProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.calidadproductoAnterior =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.calidadproductoAnterior =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCalidadProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
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
			
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
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
			
			


			
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCalidadProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalidadProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalidadProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.calidadproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.calidadproducto);
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
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
				
				


				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CalidadProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CalidadProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCalidadProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.calidadproductoAnterior =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.calidadproductoAnterior =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCalidadProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCalidadProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCalidadProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.calidadproducto =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.calidadproducto =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.calidadproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCalidadProducto")) {
				
				}
				
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCalidadProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCalidadProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCalidadProducto")) {
			
			}
			
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCalidadProducto();
			
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			
			if(sTipo.equals("NuevoCalidadProducto")) {
				jButtonNuevoCalidadProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCalidadProducto")) {
				jButtonDuplicarCalidadProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCalidadProducto")) {
				jButtonCopiarCalidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCalidadProducto")) {
				jButtonVerFormCalidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCalidadProducto")) {
				jButtonNuevoCalidadProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCalidadProducto")) {
				jButtonModificarCalidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCalidadProducto")) {
				jButtonActualizarCalidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCalidadProducto")) {
				jButtonEliminarCalidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCalidadProducto")) {
				jButtonGuardarCambiosCalidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCalidadProducto")) {
				jButtonCancelarCalidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCalidadProducto")) {
				jButtonCerrarCalidadProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCalidadProducto")) {
				jButtonGuardarCambiosCalidadProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCalidadProducto")) {
				jButtonNuevoGuardarCambiosCalidadProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCalidadProducto")) {
				jButtonAbrirOrderByCalidadProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCalidadProducto")) {
				jButtonRecargarInformacionCalidadProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCalidadProducto")) {
				jButtonAnterioresCalidadProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCalidadProducto")) {
				jButtonSiguientesCalidadProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCalidadProductoBusqueda")) {
				this.jButtonidCalidadProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCalidadProductoBusqueda")) {
				this.jButtoncodigoCalidadProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCalidadProductoBusqueda")) {
				this.jButtonnombreCalidadProductoBusquedaActionPerformed(evt);
			}
			
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCalidadProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCalidadProducto")) {
				closingInternalFrameCalidadProducto();
				
			} else if(sTipo.equals("jButtonCancelarCalidadProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormCalidadProducto = (JInternalFrameBase)evt.getSource();
	            	
	            CalidadProductoBeanSwingJInternalFrame jInternalFrameParent=(CalidadProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormCalidadProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCalidadProductoActionPerformed(null);
			}
			
			CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.calidadproducto,new Object(),this.calidadproductoParameterGeneral,this.calidadproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCalidadProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCalidadProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCalidadProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.calidadproducto)) {
			if(!esControlTabla) {
				if(CalidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCalidadProducto(this.calidadproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);			
				}
				
				if(this.calidadproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCalidadProducto(this.calidadproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.calidadproductoReturnGeneral=calidadproductoLogic.procesarEventosCalidadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.calidadproductoLogic.getCalidadProductos(),this.calidadproducto,this.calidadproductoParameterGeneral,this.isEsNuevoCalidadProducto,classes);//this.calidadproductoLogic.getCalidadProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCalidadProducto(this.calidadproductoReturnGeneral,this.calidadproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.calidadproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCalidadProducto(classes,this.calidadproductoReturnGeneral,this.calidadproductoBean,false);
					}
						
					if(this.calidadproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCalidadProducto(this.calidadproductoReturnGeneral.getCalidadProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCalidadProducto(this.calidadproductoReturnGeneral.getCalidadProducto());	
					}
						
					if(this.calidadproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCalidadProducto(this.calidadproductoReturnGeneral.getCalidadProducto(),classes);//this.calidadproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCalidadProducto(this.calidadproducto,classes);//this.calidadproductoBean);									
				}
			
				if(CalidadProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCalidadProducto(this.calidadproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCalidadProducto(this.calidadproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.calidadproductoAnterior!=null) {
						this.calidadproducto=this.calidadproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.calidadproductoReturnGeneral=calidadproductoLogic.procesarEventosCalidadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.calidadproductoLogic.getCalidadProductos(),this.calidadproducto,this.calidadproductoParameterGeneral,this.isEsNuevoCalidadProducto,classes);//this.calidadproductoLogic.getCalidadProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.calidadproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.calidadproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.calidadproductoReturnGeneral.getCalidadProducto(),calidadproductoLogic.getCalidadProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.calidadproductoReturnGeneral.getCalidadProducto(),this.calidadproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCalidadProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosCalidadProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCalidadProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosCalidadProducto() throws Exception {
		
		CalidadProductoModel calidadproductoModel=(CalidadProductoModel)this.jTableDatosCalidadProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			calidadproductoModel.calidadproductos=this.calidadproductoLogic.getCalidadProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			calidadproductoModel.calidadproductos=this.calidadproductos;
		}
		
		
		((CalidadProductoModel) this.jTableDatosCalidadProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCalidadProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcalidadproductoAnterior(),this.calidadproductoLogic.getCalidadProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcalidadproductoAnterior(),this.calidadproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCalidadProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCalidadProducto(CalidadProducto calidadproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Bodega.class)) {
					this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.setBodegas(calidadproducto.getBodegas());
					this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(calidadproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
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
										
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.calidadproducto,new Object(),generalEntityParameterGeneral,this.calidadproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.calidadproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CalidadProductoConstantesFunciones.getClassesRelationshipsOfCalidadProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CalidadProductoConstantesFunciones.getClassesRelationshipsFromStringsOfCalidadProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCalidadProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CalidadProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.calidadproducto,new Object(),generalEntityParameterGeneral,this.calidadproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCalidadProducto(CalidadProductoBean calidadproductoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Bodega.class)) {
					this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.setBodegas(calidadproducto.getBodegas());
					this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.setParametroInventarioDefectos(calidadproducto.getParametroInventarioDefectos());
					this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCalidadProducto(ArrayList<Classe> classes,CalidadProductoReturnGeneral calidadproductoReturnGeneral,CalidadProductoBean calidadproductoBean,Boolean conDefault) throws Exception {
		
			this.calidadproductoBean.setBodegas(calidadproductoReturnGeneral.getCalidadProducto().getBodegas());
			this.calidadproductoBean.setParametroInventarioDefectos(calidadproductoReturnGeneral.getCalidadProducto().getParametroInventarioDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCalidadProducto(CalidadProducto calidadproducto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Bodega.class)) {
					calidadproducto.setBodegas(this.jInternalFrameDetalleFormCalidadProducto.bodegaBeanSwingJInternalFrame.bodegaLogic.getBodegas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroInventarioDefecto.class)) {
					calidadproducto.setParametroInventarioDefectos(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoLogic.getParametroInventarioDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.calidadproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCalidadProducto = new CalidadProductoDetalleFormJInternalFrame(jDesktopPane,this.calidadproductoSessionBean.getConGuardarRelaciones(),this.calidadproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCalidadProducto);
		this.jInternalFrameDetalleFormCalidadProducto.setVisible(false);
		this.jInternalFrameDetalleFormCalidadProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormCalidadProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCalidadProducto.calidadproductoLogic=this.calidadproductoLogic;
		
		this.cargarCombosFrameForeignKeyCalidadProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCalidadProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCalidadProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCalidadProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCalidadProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCalidadProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCalidadProducto"));
		
		this.jInternalFrameDetalleFormCalidadProducto.jButtonModificarCalidadProducto.addActionListener(new ButtonActionListener(this,"ModificarCalidadProducto"));

		
		this.jInternalFrameDetalleFormCalidadProducto.jButtonModificarToolBarCalidadProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarCalidadProducto"));
					
		this.jInternalFrameDetalleFormCalidadProducto.jMenuItemModificarCalidadProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarCalidadProducto"));		
		
		
		
		this.jInternalFrameDetalleFormCalidadProducto.jButtonActualizarCalidadProducto.addActionListener (new ButtonActionListener(this,"ActualizarCalidadProducto"));
		
		
		this.jInternalFrameDetalleFormCalidadProducto.jButtonActualizarToolBarCalidadProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCalidadProducto"));
						
		this.jInternalFrameDetalleFormCalidadProducto.jMenuItemActualizarCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCalidadProducto"));		
		
		
		
		this.jInternalFrameDetalleFormCalidadProducto.jButtonEliminarCalidadProducto.addActionListener (new ButtonActionListener(this,"EliminarCalidadProducto"));
		
		
		this.jInternalFrameDetalleFormCalidadProducto.jButtonEliminarToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarCalidadProducto"));
								
		this.jInternalFrameDetalleFormCalidadProducto.jMenuItemEliminarCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCalidadProducto"));		
		
		
		
		this.jInternalFrameDetalleFormCalidadProducto.jButtonCancelarCalidadProducto.addActionListener (new ButtonActionListener(this,"CancelarCalidadProducto"));
		
		
		this.jInternalFrameDetalleFormCalidadProducto.jButtonCancelarToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarCalidadProducto"));
					
		this.jInternalFrameDetalleFormCalidadProducto.jMenuItemCancelarCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCalidadProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCalidadProducto.jMenuItemDetalleCerrarCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCalidadProducto"));		
		
		
		
		this.jInternalFrameDetalleFormCalidadProducto.jButtonGuardarCambiosToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCalidadProducto"));
		
		
		
		this.jInternalFrameDetalleFormCalidadProducto.jButtonGuardarCambiosToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCalidadProducto"));
		
		
		
		this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCalidadProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalidadProducto.jButtonidCalidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"idCalidadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalidadProducto.jButtoncodigoCalidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCalidadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalidadProducto.jButtonnombreCalidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCalidadProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCalidadProducto.jTabbedPaneRelacionesCalidadProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCalidadProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCalidadProducto"));
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalidadProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCalidadProducto"));
		}
		
		this.jTableDatosCalidadProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCalidadProducto"));
		
		this.jTableDatosCalidadProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCalidadProducto"));
		
		this.jButtonNuevoCalidadProducto.addActionListener(new ButtonActionListener(this,"NuevoCalidadProducto"));
		
		this.jButtonDuplicarCalidadProducto.addActionListener(new ButtonActionListener(this,"DuplicarCalidadProducto"));
		
		this.jButtonCopiarCalidadProducto.addActionListener(new ButtonActionListener(this,"CopiarCalidadProducto"));
		
		this.jButtonVerFormCalidadProducto.addActionListener(new ButtonActionListener(this,"VerFormCalidadProducto"));
		
		
		this.jButtonNuevoToolBarCalidadProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarCalidadProducto"));
			
		this.jButtonDuplicarToolBarCalidadProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCalidadProducto"));
			
		this.jMenuItemNuevoCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCalidadProducto"));
			
		this.jMenuItemDuplicarCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCalidadProducto"));		
		
		
		this.jButtonNuevoRelacionesCalidadProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCalidadProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarCalidadProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCalidadProducto"));
			
		this.jMenuItemNuevoRelacionesCalidadProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCalidadProducto"));		
		
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalidadProducto.jButtonModificarCalidadProducto.addActionListener(new ButtonActionListener(this,"ModificarCalidadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalidadProducto.jButtonModificarToolBarCalidadProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarCalidadProducto"));
			
			this.jInternalFrameDetalleFormCalidadProducto.jMenuItemModificarCalidadProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarCalidadProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCalidadProducto.jButtonActualizarCalidadProducto.addActionListener (new ButtonActionListener(this,"ActualizarCalidadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalidadProducto.jButtonActualizarToolBarCalidadProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCalidadProducto"));
				
			this.jInternalFrameDetalleFormCalidadProducto.jMenuItemActualizarCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCalidadProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalidadProducto.jButtonEliminarCalidadProducto.addActionListener (new ButtonActionListener(this,"EliminarCalidadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalidadProducto.jButtonEliminarToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarCalidadProducto"));
						
			this.jInternalFrameDetalleFormCalidadProducto.jMenuItemEliminarCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCalidadProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalidadProducto.jButtonCancelarCalidadProducto.addActionListener (new ButtonActionListener(this,"CancelarCalidadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalidadProducto.jButtonCancelarToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarCalidadProducto"));
			
			this.jInternalFrameDetalleFormCalidadProducto.jMenuItemCancelarCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCalidadProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCalidadProducto"));		
		
		
		this.jButtonCerrarCalidadProducto.addActionListener (new ButtonActionListener(this,"CerrarCalidadProducto"));
		
		
		this.jButtonCerrarToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarCalidadProducto"));
			
		this.jMenuItemCerrarCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCalidadProducto"));
			
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalidadProducto.jMenuItemDetalleCerrarCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCalidadProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalidadProducto.jButtonGuardarCambiosCalidadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosCalidadProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalidadProducto.jButtonGuardarCambiosToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCalidadProducto"));
		}
		
		this.jButtonCopiarToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarCalidadProducto"));
			
		this.jButtonVerFormToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarCalidadProducto"));
		
		this.jMenuItemGuardarCambiosCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCalidadProducto"));
			
		this.jMenuItemCopiarCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCalidadProducto"));		
		
		this.jMenuItemVerFormCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCalidadProducto"));		
		
		
		this.jButtonGuardarCambiosTablaCalidadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCalidadProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCalidadProducto"));
			
		this.jMenuItemGuardarCambiosTablaCalidadProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCalidadProducto"));		
		
		
		
		this.jButtonRecargarInformacionCalidadProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionCalidadProducto"));
					
		this.jButtonRecargarInformacionToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCalidadProducto"));
		
		this.jMenuItemRecargarInformacionCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCalidadProducto"));		
		
		
		
		this.jButtonAnterioresCalidadProducto.addActionListener (new ButtonActionListener(this,"AnterioresCalidadProducto"));
		
		
		this.jButtonAnterioresToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCalidadProducto"));
		
		this.jMenuItemAnterioresCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCalidadProducto"));		
		
		
		this.jButtonSiguientesCalidadProducto.addActionListener (new ButtonActionListener(this,"SiguientesCalidadProducto"));
		
		
		this.jButtonSiguientesToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCalidadProducto"));
			
		this.jMenuItemSiguientesCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCalidadProducto"));
			
		this.jMenuItemAbrirOrderByCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCalidadProducto"));
			
		this.jMenuItemMostrarOcultarCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCalidadProducto"));
			
		this.jMenuItemDetalleAbrirOrderByCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCalidadProducto"));
			
		this.jMenuItemDetalleMostarOcultarCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCalidadProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosCalidadProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCalidadProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCalidadProducto"));
			
		this.jMenuItemNuevoGuardarCambiosCalidadProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCalidadProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCalidadProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCalidadProducto"));

		this.jCheckBoxSeleccionadosCalidadProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCalidadProducto"));
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCalidadProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesCalidadProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesCalidadProducto"));
			
		this.jComboBoxTiposAccionesCalidadProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesCalidadProducto"));
					
		this.jComboBoxTiposSeleccionarCalidadProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCalidadProducto"));
			
		this.jTextFieldValorCampoGeneralCalidadProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCalidadProducto"));		
		
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalidadProducto.jButtonidCalidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"idCalidadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalidadProducto.jButtoncodigoCalidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCalidadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalidadProducto.jButtonnombreCalidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCalidadProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoCalidadProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoCalidadProducto"));

			this.jButtonBusquedaPorNombreCalidadProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCalidadProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCalidadProducto!=null) {
				this.jInternalFrameReporteDinamicoCalidadProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCalidadProducto"));
				this.jInternalFrameReporteDinamicoCalidadProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCalidadProducto"));
				this.jInternalFrameReporteDinamicoCalidadProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCalidadProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoCalidadProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCalidadProducto"));				
			//this.jButtonGenerarReporteDinamicoCalidadProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCalidadProducto"));
			//this.jButtonGenerarExcelReporteDinamicoCalidadProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCalidadProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCalidadProducto!=null) {
				this.jInternalFrameImportacionCalidadProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCalidadProducto"));
				this.jInternalFrameImportacionCalidadProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCalidadProducto"));
				this.jInternalFrameImportacionCalidadProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCalidadProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCalidadProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByCalidadProducto"));
			
			this.jButtonAbrirOrderByToolBarCalidadProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCalidadProducto"));			
			
			if(this.jInternalFrameOrderByCalidadProducto!=null) {
				this.jInternalFrameOrderByCalidadProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCalidadProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCalidadProducto.jTabbedPaneRelacionesCalidadProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCalidadProducto"));
		
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
            		closingInternalFrameCalidadProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCalidadProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCalidadProducto = (JInternalFrameBase)event.getSource();
	            	
	            CalidadProductoBeanSwingJInternalFrame jInternalFrameParent=(CalidadProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormCalidadProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCalidadProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCalidadProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCalidadProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCalidadProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCalidadProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCalidadProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCalidadProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCalidadProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCalidadProducto";
		inputMap = this.jButtonNuevoCalidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCalidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCalidadProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCalidadProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCalidadProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCalidadProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCalidadProducto";
		inputMap = this.jButtonNuevoRelacionesCalidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCalidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCalidadProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCalidadProducto";
		inputMap = this.jButtonModificarCalidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCalidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCalidadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCalidadProducto";
		inputMap = this.jButtonActualizarCalidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCalidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCalidadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCalidadProducto";
		inputMap = this.jButtonEliminarCalidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCalidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCalidadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCalidadProducto";
		inputMap = this.jButtonCancelarCalidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCalidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCalidadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCalidadProducto";
		inputMap = this.jButtonCerrarCalidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCalidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCalidadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCalidadProducto.jButtonGuardarCambiosCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCalidadProducto";
		inputMap = this.jInternalFrameDetalleFormCalidadProducto.jButtonGuardarCambiosCalidadProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCalidadProducto.jButtonGuardarCambiosCalidadProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCalidadProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCalidadProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCalidadProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCalidadProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCalidadProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCalidadProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCalidadProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCalidadProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCalidadProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalidadProducto.jButtonidCalidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"idCalidadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalidadProducto.jButtoncodigoCalidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCalidadProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCalidadProducto.jButtonnombreCalidadProductoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCalidadProductoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoCalidadProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoCalidadProducto"));

		this.jButtonBusquedaPorNombreCalidadProducto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCalidadProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCalidadProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCalidadProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCalidadProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCalidadProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCalidadProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CalidadProducto calidadproductoAux:this.calidadproductoLogic.getCalidadProductos()) {
					calidadproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CalidadProducto calidadproductoAux:calidadproductos) {
					calidadproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCalidadProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCalidadProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CalidadProducto calidadproductoAux:this.calidadproductoLogic.getCalidadProductos()) {
						calidadproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CalidadProducto calidadproductoAux:calidadproductos) {
						calidadproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CalidadProducto calidadproductoAux:this.calidadproductoLogic.getCalidadProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CalidadProducto calidadproductoAux:calidadproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCalidadProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCalidadProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCalidadProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCalidadProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCalidadProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCalidadProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCalidadProducto.getSelectedRows();
			
			CalidadProducto calidadproductoLocal=new CalidadProducto();
			
			//this.seleccionarTodosCalidadProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					calidadproductoLocal =(CalidadProducto) this.calidadproductoLogic.getCalidadProductos().toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					calidadproductoLocal =(CalidadProducto) this.calidadproductos.toArray()[this.jTableDatosCalidadProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				calidadproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CalidadProducto calidadproductoAux:this.calidadproductoLogic.getCalidadProductos()) {
						calidadproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CalidadProducto calidadproductoAux:calidadproductos) {
						calidadproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCalidadProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCalidadProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCalidadProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCalidadProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCalidadProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCalidadProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCalidadProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCalidadProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCalidadProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CalidadProducto calidadproductoAux:this.calidadproductoLogic.getCalidadProductos()) {
				
						if(sTipoSeleccionar.equals(CalidadProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							calidadproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CalidadProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							calidadproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CalidadProducto calidadproductoAux:calidadproductos) {
					
						if(sTipoSeleccionar.equals(CalidadProductoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							calidadproductoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CalidadProductoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							calidadproductoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCalidadProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCalidadProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCalidadProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCalidadProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCalidadProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCalidadProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessCalidadProducto(conSplash);
				
					this.generarReporteCalidadProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCalidadProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCalidadProductosSeleccionados();
				//this.jComboBoxTiposAccionesCalidadProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCalidadProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesCalidadProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCalidadProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesCalidadProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCalidadProducto();
				
				this.exportarCalidadProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCalidadProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCalidadProductos();
				//this.importarCalidadProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCalidadProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCalidadProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCalidadProductosSeleccionados();
				//this.jComboBoxTiposAccionesCalidadProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Calidad Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCalidadProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCalidadProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCalidadProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Calidad Producto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCalidadProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(CalidadProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCalidadProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCalidadProducto(conSplash);
					
						//this.actualizarParametrosGeneralCalidadProducto();
						
						this.generarReporteProcesoAccionCalidadProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCalidadProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CalidadProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Calidad ProductoS SELECCIONADOS?", "MANTENIMIENTO DE Calidad Producto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCalidadProducto();
				
						this.actualizarParametrosGeneralCalidadProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.calidadproductoReturnGeneral=calidadproductoLogic.procesarAccionCalidadProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.calidadproductoLogic.getCalidadProductos(),this.calidadproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCalidadProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCalidadProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCalidadProducto();
					
					CalidadProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCalidadProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCalidadProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCalidadProducto.jComboBoxTiposAccionesFormularioCalidadProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCalidadProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCalidadProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCalidadProducto();
			
			if(this.jInternalFrameDetalleFormCalidadProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CalidadProducto> calidadproductosSeleccionados=new ArrayList<CalidadProducto>();		
			CalidadProducto calidadproducto=new CalidadProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCalidadProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCalidadProducto.getSelectedItem();
			
			
			
			
			calidadproductosSeleccionados=this.getCalidadProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(calidadproductosSeleccionados.size()==1) {
				for(CalidadProducto calidadproductoAux:calidadproductosSeleccionados) {
					calidadproducto=calidadproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Bodega")) {
					jButtonBodegaActionPerformed(null,rowIndex,true,false,calidadproducto);
				}
				else if(this.sTipoRelacion.equals("Parametro Inventario Defecto")) {
					jButtonParametroInventarioDefectoActionPerformed(null,rowIndex,true,false,calidadproducto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCalidadProducto();
			
      		//this.finishProcessCalidadProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCalidadProductoReturnGeneral() throws Exception {
		if(this.calidadproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.calidadproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.calidadproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.calidadproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.calidadproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.calidadproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCalidadProducto(false);
		}
		
		if(this.calidadproductoReturnGeneral.getConRetornoLista() || this.calidadproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.calidadproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.calidadproductoLogic.setCalidadProductos(this.calidadproductoReturnGeneral.getCalidadProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.calidadproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.calidadproductoLogic.setCalidadProducto(this.calidadproductoReturnGeneral.getCalidadProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCalidadProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralCalidadProducto() throws Exception {
		
		
	}
	
	public ArrayList<CalidadProducto> getCalidadProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CalidadProducto> calidadproductosSeleccionados=new ArrayList<CalidadProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCalidadProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CalidadProducto calidadproductoAux:calidadproductoLogic.getCalidadProductos()) {
					if(calidadproductoAux.getIsSelected()) {
						calidadproductosSeleccionados.add(calidadproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CalidadProducto calidadproductoAux:this.calidadproductos) {
					if(calidadproductoAux.getIsSelected()) {
						calidadproductosSeleccionados.add(calidadproductoAux);				
					}
				}
			}
			
			if(calidadproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						calidadproductosSeleccionados.addAll(this.calidadproductoLogic.getCalidadProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						calidadproductosSeleccionados.addAll(this.calidadproductos);				
					}
				}
			}
		} else {
			calidadproductosSeleccionados.add(this.calidadproducto);
		}
		
		return calidadproductosSeleccionados;
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
	
	public void generarReporteCalidadProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCalidadProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCalidadProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCalidadProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCalidadProductosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesCalidadProductosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Calidad Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCalidadProductosSeleccionados() throws Exception {
		ArrayList<CalidadProducto> calidadproductosSeleccionados=new ArrayList<CalidadProducto>();		
		
		calidadproductosSeleccionados=this.getCalidadProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCalidadProductos("Todos",calidadproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalCalidadProductosSeleccionados() throws Exception {
		ArrayList<CalidadProducto> calidadproductosSeleccionados=new ArrayList<CalidadProducto>();		
		
		calidadproductosSeleccionados=this.getCalidadProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCalidadProductos("Todos",calidadproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCalidadProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CalidadProducto> calidadproductosSeleccionados=new ArrayList<CalidadProducto>();
		
		calidadproductosSeleccionados=this.getCalidadProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCalidadProductos("Todos",calidadproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCalidadProductosSeleccionados() throws Exception {
		ArrayList<CalidadProducto> calidadproductosSeleccionados=new ArrayList<CalidadProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCalidadProducto();
		
		
		calidadproductosSeleccionados=this.getCalidadProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCalidadProducto();
		
		
		//this.generarReporteCalidadProductos("Todos",calidadproductosSeleccionados ,calidadproductoImplementable,calidadproductoImplementableHome);
	}
	
	public void mostrarImportacionCalidadProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCalidadProducto();
		
		this.abrirFrameImportacionCalidadProducto();		
		
			
		//this.generarReporteCalidadProductos("Todos",calidadproductosSeleccionados ,calidadproductoImplementable,calidadproductoImplementableHome);
	}
	
	public void importarCalidadProductos() throws Exception {		
	
	}
	
	public void exportarCalidadProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCalidadProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCalidadProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCalidadProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Calidad Producto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCalidadProductosSeleccionados() throws Exception {
		ArrayList<CalidadProducto> calidadproductosSeleccionados=new ArrayList<CalidadProducto>();		
		
		calidadproductosSeleccionados=this.getCalidadProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"calidadproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCalidadProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CalidadProducto calidadproductoAux:calidadproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCalidadProducto(calidadproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//calidadproductoAux.setsDetalleGeneralEntityReporte(calidadproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calidad Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCalidadProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CalidadProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalidadProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalidadProductoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CalidadProductoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCalidadProducto(CalidadProducto calidadproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=calidadproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=calidadproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=calidadproducto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=calidadproducto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCalidadProductosSeleccionados() throws Exception {
		ArrayList<CalidadProducto> calidadproductosSeleccionados=new ArrayList<CalidadProducto>();		
		
		calidadproductosSeleccionados=this.getCalidadProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"calidadproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CalidadProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCalidadProducto(row);				
				iRow++;
			}				
			
			for(CalidadProducto calidadproductoAux:calidadproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCalidadProducto(calidadproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calidad Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCalidadProductosSeleccionados() throws Exception {
		ArrayList<CalidadProducto> calidadproductosSeleccionados=new ArrayList<CalidadProducto>();		
		
		calidadproductosSeleccionados=this.getCalidadProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"calidadproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("calidadproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("calidadproducto");
			//elementRoot.appendChild(element);
		
			for(CalidadProducto calidadproductoAux:calidadproductosSeleccionados) {
				element = document.createElement("calidadproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCalidadProducto(calidadproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.calidadproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Calidad Producto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCalidadProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CalidadProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CalidadProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CalidadProductoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CalidadProductoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCalidadProducto(CalidadProducto calidadproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(calidadproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(calidadproducto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(calidadproducto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlCalidadProducto(CalidadProducto calidadproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CalidadProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(calidadproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CalidadProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(calidadproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(CalidadProductoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(calidadproducto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CalidadProductoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(calidadproducto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoCalidadProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CalidadProducto> calidadproductosSeleccionados=new ArrayList<CalidadProducto>();
		
		calidadproductosSeleccionados=this.getCalidadProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCalidadProducto(calidadproductosSeleccionados);
		
		this.generarReporteCalidadProductos("Todos",calidadproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCalidadProducto(ArrayList<CalidadProducto> calidadproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CalidadProducto calidadproductoAux:calidadproductosSeleccionados) {
				calidadproductoAux.setsDetalleGeneralEntityReporte(calidadproductoAux.toString());
			
				if(sTipoSeleccionar.equals(CalidadProductoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					calidadproductoAux.setsDescripcionGeneralEntityReporte1(calidadproductoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CalidadProductoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					calidadproductoAux.setsDescripcionGeneralEntityReporte1(calidadproductoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CalidadProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCalidadProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCalidadProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=true;
				this.isVisibilidadCeldaGuardarCambiosCalidadProducto=true;
			}
			
			this.isVisibilidadCeldaModificarCalidadProducto=false;
			this.isVisibilidadCeldaActualizarCalidadProducto=false;
			this.isVisibilidadCeldaEliminarCalidadProducto=false;
			this.isVisibilidadCeldaCancelarCalidadProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCalidadProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarCalidadProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCalidadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosCalidadProducto=false;
			this.isVisibilidadCeldaModificarCalidadProducto=false;
			this.isVisibilidadCeldaActualizarCalidadProducto=true;
			this.isVisibilidadCeldaEliminarCalidadProducto=false;
			this.isVisibilidadCeldaCancelarCalidadProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCalidadProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarCalidadProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCalidadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosCalidadProducto=false;
			this.isVisibilidadCeldaModificarCalidadProducto=false;
			this.isVisibilidadCeldaActualizarCalidadProducto=true;
			this.isVisibilidadCeldaEliminarCalidadProducto=true;
			this.isVisibilidadCeldaCancelarCalidadProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCalidadProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarCalidadProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCalidadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosCalidadProducto=false;
			this.isVisibilidadCeldaModificarCalidadProducto=false;
			this.isVisibilidadCeldaActualizarCalidadProducto=true;
			this.isVisibilidadCeldaEliminarCalidadProducto=false;
			this.isVisibilidadCeldaCancelarCalidadProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCalidadProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarCalidadProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCalidadProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=true;
			this.isVisibilidadCeldaGuardarCambiosCalidadProducto=true;
			this.isVisibilidadCeldaModificarCalidadProducto=false;
			this.isVisibilidadCeldaActualizarCalidadProducto=false;
			this.isVisibilidadCeldaEliminarCalidadProducto=false;
			this.isVisibilidadCeldaCancelarCalidadProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCalidadProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarCalidadProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCalidadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosCalidadProducto=false;
			this.isVisibilidadCeldaActualizarCalidadProducto=false;
			this.isVisibilidadCeldaEliminarCalidadProducto=false;
			this.isVisibilidadCeldaCancelarCalidadProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCalidadProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarCalidadProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCalidadProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosCalidadProducto=false;
			this.isVisibilidadCeldaModificarCalidadProducto=true;
			this.isVisibilidadCeldaActualizarCalidadProducto=false;
			this.isVisibilidadCeldaEliminarCalidadProducto=false;
			this.isVisibilidadCeldaCancelarCalidadProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCalidadProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarCalidadProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CalidadProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCalidadProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=true;
			this.isVisibilidadCeldaGuardarCambiosCalidadProducto=true;
		} else {
			this.actualizarEstadoPanelsCalidadProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCalidadProducto=false;
			//this.isVisibilidadCeldaVerFormCalidadProducto=false;
			this.isVisibilidadCeldaDuplicarCalidadProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!calidadproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoCalidadProducto=false;
			this.isVisibilidadCeldaGuardarCambiosCalidadProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(calidadproductoSessionBean.getEsGuardarRelacionado()) {
			if(!calidadproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=false;												
			}
			
			this.jButtonCerrarCalidadProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCalidadProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.calidadproducto)) {
			this.isVisibilidadCeldaActualizarCalidadProducto=false;
			this.isVisibilidadCeldaEliminarCalidadProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCalidadProducto() {
		this.isVisibilidadCeldaNuevoCalidadProducto=false;
		this.isVisibilidadCeldaGuardarCambiosCalidadProducto=false;
	}
	
	public void actualizarEstadoPanelsCalidadProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCalidadProducto!=null) {
				this.jScrollPanelDatosEdicionCalidadProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalidadProducto!=null) {
				this.jTabbedPaneBusquedasCalidadProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCalidadProducto!=null) {
				this.jScrollPanelDatosCalidadProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCalidadProducto!=null) {
				this.jPanelPaginacionCalidadProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCalidadProducto!=null) {
				this.jPanelParametrosReportesCalidadProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCalidadProducto!=null) {
				this.jScrollPanelDatosEdicionCalidadProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalidadProducto!=null) {
				this.jTabbedPaneBusquedasCalidadProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCalidadProducto!=null) {
				this.jScrollPanelDatosCalidadProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionCalidadProducto!=null) {
				this.jPanelPaginacionCalidadProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCalidadProducto!=null) {
				this.jPanelParametrosReportesCalidadProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCalidadProducto!=null) {
				this.jScrollPanelDatosEdicionCalidadProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalidadProducto!=null) {
				this.jTabbedPaneBusquedasCalidadProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCalidadProducto!=null) {
				this.jScrollPanelDatosCalidadProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionCalidadProducto!=null) {
				this.jPanelPaginacionCalidadProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCalidadProducto!=null) {
				this.jPanelParametrosReportesCalidadProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCalidadProducto!=null) {
				this.jScrollPanelDatosEdicionCalidadProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalidadProducto!=null) {
				this.jTabbedPaneBusquedasCalidadProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCalidadProducto!=null) {
				this.jScrollPanelDatosCalidadProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionCalidadProducto!=null) {
				this.jPanelPaginacionCalidadProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCalidadProducto!=null) {
				this.jPanelParametrosReportesCalidadProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCalidadProducto!=null) {
				this.jScrollPanelDatosEdicionCalidadProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalidadProducto!=null) {
				this.jTabbedPaneBusquedasCalidadProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCalidadProducto!=null) {
				this.jScrollPanelDatosCalidadProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCalidadProducto!=null) {
				this.jPanelPaginacionCalidadProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCalidadProducto!=null) {
				this.jPanelParametrosReportesCalidadProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCalidadProducto!=null) {
				this.jScrollPanelDatosEdicionCalidadProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalidadProducto!=null) {
				this.jTabbedPaneBusquedasCalidadProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCalidadProducto!=null) {
				this.jScrollPanelDatosCalidadProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCalidadProducto!=null) {
				this.jPanelPaginacionCalidadProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCalidadProducto!=null) {
				this.jPanelParametrosReportesCalidadProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCalidadProducto!=null) {
				this.jScrollPanelDatosEdicionCalidadProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalidadProducto!=null) {
				this.jTabbedPaneBusquedasCalidadProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCalidadProducto!=null) {
				this.jScrollPanelDatosCalidadProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionCalidadProducto!=null) {
				this.jPanelPaginacionCalidadProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCalidadProducto!=null) {
				this.jPanelParametrosReportesCalidadProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCalidadProducto!=null) {
					this.jTabbedPaneBusquedasCalidadProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCalidadProducto!=null) {
				this.jPanelParametrosReportesCalidadProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCalidadProducto!=null) {
				this.jTabbedPaneBusquedasCalidadProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCalidadProducto!=null) {
				this.jPanelParametrosReportesCalidadProducto.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionCalidadProductoParaBodegas() throws Exception {
		Boolean isPaginaPopupBodega=false;

		try {

			if(this.calidadproductoSessionBean==null) {
				this.calidadproductoSessionBean=new CalidadProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormCalidadProducto.bodegaSessionBean==null) {
				this.jInternalFrameDetalleFormCalidadProducto.bodegaSessionBean=new BodegaSessionBean();
			}

			this.jInternalFrameDetalleFormCalidadProducto.bodegaSessionBean.setsPathNavegacionActual(calidadproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+BodegaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCalidadProducto.bodegaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupBodega=this.jInternalFrameDetalleFormCalidadProducto.bodegaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCalidadProducto.bodegaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeBodega(true);
			this.jInternalFrameDetalleFormCalidadProducto.bodegaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeBodega(CalidadProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCalidadProducto.bodegaSessionBean.setisBusquedaDesdeForeignKeySesionCalidadProducto(true);
			this.jInternalFrameDetalleFormCalidadProducto.bodegaSessionBean.setlidCalidadProductoActual(this.idCalidadProductoActual);

			calidadproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCalidadProducto(true);
			calidadproductoSessionBean.setlIdCalidadProductoActualForeignKey(this.idCalidadProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionCalidadProductoParaParametroInventarioDefectos() throws Exception {
		Boolean isPaginaPopupParametroInventarioDefecto=false;

		try {

			if(this.calidadproductoSessionBean==null) {
				this.calidadproductoSessionBean=new CalidadProductoSessionBean();
			}

			if(this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoSessionBean==null) {
				this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoSessionBean.setsPathNavegacionActual(calidadproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroInventarioDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroInventarioDefecto=this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(true);
			this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroInventarioDefecto(CalidadProductoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionCalidadProducto(true);
			this.jInternalFrameDetalleFormCalidadProducto.parametroinventariodefectoSessionBean.setlidCalidadProductoActual(this.idCalidadProductoActual);

			calidadproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCalidadProducto(true);
			calidadproductoSessionBean.setlIdCalidadProductoActualForeignKey(this.idCalidadProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CalidadProductoSessionBean calidadproductoSessionBean=new CalidadProductoSessionBean();
		
		if(this.calidadproductoSessionBean==null) {
			this.calidadproductoSessionBean=new CalidadProductoSessionBean();
		}
		
		this.calidadproductoSessionBean.setsUltimaBusquedaCalidadProducto(this.getsAccionBusqueda());
		this.calidadproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.calidadproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			calidadproductoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			calidadproductoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CalidadProductoSessionBean calidadproductoSessionBean=new CalidadProductoSessionBean();
		
		if(this.calidadproductoSessionBean==null) {
			this.calidadproductoSessionBean=new CalidadProductoSessionBean();
		}
		
		if(this.calidadproductoSessionBean.getsUltimaBusquedaCalidadProducto()!=null&&!this.calidadproductoSessionBean.getsUltimaBusquedaCalidadProducto().equals("")) {
			this.setsAccionBusqueda(calidadproductoSessionBean.getsUltimaBusquedaCalidadProducto());
			this.setiNumeroPaginacion(calidadproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(calidadproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(calidadproductoSessionBean.getcodigo());
				calidadproductoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(calidadproductoSessionBean.getnombre());
				calidadproductoSessionBean.setnombre("");
			}
		}
		
		this.calidadproductoSessionBean.setsUltimaBusquedaCalidadProducto("");
		this.calidadproductoSessionBean.setiNumeroPaginacion(CalidadProductoConstantesFunciones.INUMEROPAGINACION);
		this.calidadproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCalidadProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCalidadProducto() {
		this.updateBorderResaltarBusquedasFormularioCalidadProducto();
		this.updateVisibilidadBusquedasFormularioCalidadProducto();
		this.updateHabilitarBusquedasFormularioCalidadProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioCalidadProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCalidadProducto.getComponents().length>0) {
	

		if(this.calidadproductoConstantesFunciones.resaltarBusquedaPorCodigoCalidadProducto!=null) {
			index= this.jTabbedPaneBusquedasCalidadProducto.indexOfComponent(this.jPanelBusquedaPorCodigoCalidadProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCalidadProducto.getComponent(index);
				jPanel.setBorder(this.calidadproductoConstantesFunciones.resaltarBusquedaPorCodigoCalidadProducto);
			}
		}

		if(this.calidadproductoConstantesFunciones.resaltarBusquedaPorNombreCalidadProducto!=null) {
			index= this.jTabbedPaneBusquedasCalidadProducto.indexOfComponent(this.jPanelBusquedaPorNombreCalidadProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCalidadProducto.getComponent(index);
				jPanel.setBorder(this.calidadproductoConstantesFunciones.resaltarBusquedaPorNombreCalidadProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCalidadProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCalidadProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCalidadProducto.indexOfComponent(this.jPanelBusquedaPorCodigoCalidadProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCalidadProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.calidadproductoConstantesFunciones.mostrarBusquedaPorCodigoCalidadProducto);
			if(!this.calidadproductoConstantesFunciones.mostrarBusquedaPorCodigoCalidadProducto && index>-1) {
				this.jTabbedPaneBusquedasCalidadProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasCalidadProducto.indexOfComponent(this.jPanelBusquedaPorNombreCalidadProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCalidadProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.calidadproductoConstantesFunciones.mostrarBusquedaPorNombreCalidadProducto);
			if(!this.calidadproductoConstantesFunciones.mostrarBusquedaPorNombreCalidadProducto && index>-1) {
				this.jTabbedPaneBusquedasCalidadProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCalidadProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCalidadProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCalidadProducto.indexOfComponent(this.jPanelBusquedaPorCodigoCalidadProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCalidadProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.calidadproductoConstantesFunciones.activarBusquedaPorCodigoCalidadProducto);
				this.jTabbedPaneBusquedasCalidadProducto.setEnabledAt(index,this.calidadproductoConstantesFunciones.activarBusquedaPorCodigoCalidadProducto);
			}

			index= this.jTabbedPaneBusquedasCalidadProducto.indexOfComponent(this.jPanelBusquedaPorNombreCalidadProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCalidadProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.calidadproductoConstantesFunciones.activarBusquedaPorNombreCalidadProducto);
				this.jTabbedPaneBusquedasCalidadProducto.setEnabledAt(index,this.calidadproductoConstantesFunciones.activarBusquedaPorNombreCalidadProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCalidadProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasCalidadProducto.indexOfComponent(this.jPanelBusquedaPorCodigoCalidadProducto);

			this.jTabbedPaneBusquedasCalidadProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCalidadProducto.getComponent(index);

			this.calidadproductoConstantesFunciones.setResaltarBusquedaPorCodigoCalidadProducto(resaltar);

			jPanel.setBorder(this.calidadproductoConstantesFunciones.resaltarBusquedaPorCodigoCalidadProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasCalidadProducto.indexOfComponent(this.jPanelBusquedaPorNombreCalidadProducto);

			this.jTabbedPaneBusquedasCalidadProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCalidadProducto.getComponent(index);

			this.calidadproductoConstantesFunciones.setResaltarBusquedaPorNombreCalidadProducto(resaltar);

			jPanel.setBorder(this.calidadproductoConstantesFunciones.resaltarBusquedaPorNombreCalidadProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCalidadProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCalidadProducto() throws Exception {

		if(this.jInternalFrameDetalleFormCalidadProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCalidadProducto();
		this.updateVisibilidadResaltarControlesFormularioCalidadProducto();
		this.updateHabilitarResaltarControlesFormularioCalidadProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioCalidadProducto() throws Exception {
		if(this.jInternalFrameDetalleFormCalidadProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.calidadproductoConstantesFunciones.resaltaridCalidadProducto!=null && this.jInternalFrameDetalleFormCalidadProducto!=null) {this.jInternalFrameDetalleFormCalidadProducto.jTextFieldidCalidadProducto.setBorder(this.calidadproductoConstantesFunciones.resaltaridCalidadProducto);}
		if(this.calidadproductoConstantesFunciones.resaltarcodigoCalidadProducto!=null && this.jInternalFrameDetalleFormCalidadProducto!=null) {this.jInternalFrameDetalleFormCalidadProducto.jTextFieldcodigoCalidadProducto.setBorder(this.calidadproductoConstantesFunciones.resaltarcodigoCalidadProducto);}
		if(this.calidadproductoConstantesFunciones.resaltarnombreCalidadProducto!=null && this.jInternalFrameDetalleFormCalidadProducto!=null) {this.jInternalFrameDetalleFormCalidadProducto.jTextAreanombreCalidadProducto.setBorder(this.calidadproductoConstantesFunciones.resaltarnombreCalidadProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCalidadProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormCalidadProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
	
		//this.jInternalFrameDetalleFormCalidadProducto.jTextFieldidCalidadProducto.setVisible(this.calidadproductoConstantesFunciones.mostraridCalidadProducto);
		this.jInternalFrameDetalleFormCalidadProducto.jPanelidCalidadProducto.setVisible(this.calidadproductoConstantesFunciones.mostraridCalidadProducto);
		//this.jInternalFrameDetalleFormCalidadProducto.jTextFieldcodigoCalidadProducto.setVisible(this.calidadproductoConstantesFunciones.mostrarcodigoCalidadProducto);
		this.jInternalFrameDetalleFormCalidadProducto.jPanelcodigoCalidadProducto.setVisible(this.calidadproductoConstantesFunciones.mostrarcodigoCalidadProducto);
		//this.jInternalFrameDetalleFormCalidadProducto.jTextAreanombreCalidadProducto.setVisible(this.calidadproductoConstantesFunciones.mostrarnombreCalidadProducto);
		this.jInternalFrameDetalleFormCalidadProducto.jPanelnombreCalidadProducto.setVisible(this.calidadproductoConstantesFunciones.mostrarnombreCalidadProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCalidadProducto() throws Exception {
		if(this.jInternalFrameDetalleFormCalidadProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCalidadProducto!=null) {
	
		this.jInternalFrameDetalleFormCalidadProducto.jTextFieldidCalidadProducto.setEnabled(this.calidadproductoConstantesFunciones.activaridCalidadProducto);
		this.jInternalFrameDetalleFormCalidadProducto.jTextFieldcodigoCalidadProducto.setEnabled(this.calidadproductoConstantesFunciones.activarcodigoCalidadProducto);
		this.jInternalFrameDetalleFormCalidadProducto.jTextAreanombreCalidadProducto.setEnabled(this.calidadproductoConstantesFunciones.activarnombreCalidadProducto);
		}
	}
	
		
}