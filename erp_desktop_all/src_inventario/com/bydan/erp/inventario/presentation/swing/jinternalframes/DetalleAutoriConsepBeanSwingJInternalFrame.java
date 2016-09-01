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

import com.bydan.erp.inventario.util.DetalleAutoriConsepConstantesFunciones;
import com.bydan.erp.inventario.util.DetalleAutoriConsepParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DetalleAutoriConsepParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.DetalleAutoriConsepBean;
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
public class DetalleAutoriConsepBeanSwingJInternalFrame extends DetalleAutoriConsepJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleAutoriConsepBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleAutoriConsep> detalleautoriconsepValidator = new ClassValidator<DetalleAutoriConsep>(DetalleAutoriConsep.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleAutoriConsep detalleautoriconsep;	
	public DetalleAutoriConsep detalleautoriconsepAux;
	public DetalleAutoriConsep detalleautoriconsepAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleAutoriConsep detalleautoriconsepTotales;
	public Long idDetalleAutoriConsepActual;
	public Long iIdNuevoDetalleAutoriConsep=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboAutoriConsep="";

	public List<AutoriConsep> autoriconsepsForeignKey;

	public List<AutoriConsep> getautoriconsepsForeignKey() {
		return autoriconsepsForeignKey;
	}

	public void setautoriconsepsForeignKey(List<AutoriConsep> autoriconsepsForeignKey) {
		this.autoriconsepsForeignKey = autoriconsepsForeignKey;
	}

	//OBJETO FK ACTUAL
	public AutoriConsep autoriconsepForeignKey;

	public AutoriConsep getautoriconsepForeignKey() {
		return autoriconsepForeignKey;
	}

	public void setautoriconsepForeignKey(AutoriConsep autoriconsepForeignKey) {
		this.autoriconsepForeignKey = autoriconsepForeignKey;
	}

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

	public String sFinalQueryComboProducto="";

	public List<Producto> productosForeignKey;

	public List<Producto> getproductosForeignKey() {
		return productosForeignKey;
	}

	public void setproductosForeignKey(List<Producto> productosForeignKey) {
		this.productosForeignKey = productosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Producto productoForeignKey;

	public Producto getproductoForeignKey() {
		return productoForeignKey;
	}

	public void setproductoForeignKey(Producto productoForeignKey) {
		this.productoForeignKey = productoForeignKey;
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

	public String sFinalQueryComboEstadoDetalleAutoriConsep="";

	public List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsForeignKey;

	public List<EstadoDetalleAutoriConsep> getestadodetalleautoriconsepsForeignKey() {
		return estadodetalleautoriconsepsForeignKey;
	}

	public void setestadodetalleautoriconsepsForeignKey(List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsForeignKey) {
		this.estadodetalleautoriconsepsForeignKey = estadodetalleautoriconsepsForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoDetalleAutoriConsep estadodetalleautoriconsepForeignKey;

	public EstadoDetalleAutoriConsep getestadodetalleautoriconsepForeignKey() {
		return estadodetalleautoriconsepForeignKey;
	}

	public void setestadodetalleautoriconsepForeignKey(EstadoDetalleAutoriConsep estadodetalleautoriconsepForeignKey) {
		this.estadodetalleautoriconsepForeignKey = estadodetalleautoriconsepForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idProductoActual=0L;

	public Long getidProductoActual() {
		return idProductoActual;
	}

	public void setidProductoActual(Long idProductoActual) {
		this.idProductoActual= idProductoActual;
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
	
	public Boolean isPermisoTodoDetalleAutoriConsep;
	public Boolean isPermisoNuevoDetalleAutoriConsep;
	public Boolean isPermisoActualizarDetalleAutoriConsep;
	public Boolean isPermisoActualizarOriginalDetalleAutoriConsep;
	public Boolean isPermisoEliminarDetalleAutoriConsep;
	public Boolean isPermisoGuardarCambiosDetalleAutoriConsep;
	public Boolean isPermisoConsultaDetalleAutoriConsep;
	public Boolean isPermisoBusquedaDetalleAutoriConsep;
	public Boolean isPermisoReporteDetalleAutoriConsep;
	public Boolean isPermisoPaginacionMedioDetalleAutoriConsep;
	public Boolean isPermisoPaginacionAltoDetalleAutoriConsep;
	public Boolean isPermisoPaginacionTodoDetalleAutoriConsep;
	public Boolean isPermisoCopiarDetalleAutoriConsep;
	public Boolean isPermisoVerFormDetalleAutoriConsep;
	public Boolean isPermisoDuplicarDetalleAutoriConsep;
	public Boolean isPermisoOrdenDetalleAutoriConsep;
	
	
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
	
	public DetalleAutoriConsepParameterReturnGeneral detalleautoriconsepReturnGeneral;
	public DetalleAutoriConsepParameterReturnGeneral detalleautoriconsepParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleAutoriConsep=false;
	public Boolean esParaAccionDesdeFormularioDetalleAutoriConsep=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleAutoriConsepSessionBeanAdditional detalleautoriconsepSessionBeanAdditional=null;
	
	public DetalleAutoriConsepSessionBeanAdditional getDetalleAutoriConsepSessionBeanAdditional() {
		return this.detalleautoriconsepSessionBeanAdditional;
	}
	
	public void setDetalleAutoriConsepSessionBeanAdditional(DetalleAutoriConsepSessionBeanAdditional detalleautoriconsepSessionBeanAdditional) {
		try {
			this.detalleautoriconsepSessionBeanAdditional=detalleautoriconsepSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleAutoriConsepBeanSwingJInternalFrameAdditional detalleautoriconsepBeanSwingJInternalFrameAdditional=null;
	//public class DetalleAutoriConsepBeanSwingJInternalFrame
	
	public DetalleAutoriConsepBeanSwingJInternalFrameAdditional getDetalleAutoriConsepBeanSwingJInternalFrameAdditional() {
		return this.detalleautoriconsepBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleAutoriConsepBeanSwingJInternalFrameAdditional(DetalleAutoriConsepBeanSwingJInternalFrameAdditional detalleautoriconsepBeanSwingJInternalFrameAdditional) {
		try {
			this.detalleautoriconsepBeanSwingJInternalFrameAdditional=detalleautoriconsepBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleAutoriConsepLogic detalleautoriconsepLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleAutoriConsep detalleautoriconsepBean;
	public DetalleAutoriConsepConstantesFunciones detalleautoriconsepConstantesFunciones;
	//public DetalleAutoriConsepParameterReturnGeneral detalleautoriconsepReturnGeneral;
	
	//FK
	
	public AutoriConsepLogic autoriconsepLogic;
	public EmpresaLogic empresaLogic;
	public ProductoLogic productoLogic;
	public UnidadLogic unidadLogic;
	public EstadoDetalleAutoriConsepLogic estadodetalleautoriconsepLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleAutoriConsep> detalleautoriconseps;	
	//public List<DetalleAutoriConsep> detalleautoriconsepsEliminados;
	//public List<DetalleAutoriConsep> detalleautoriconsepsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleAutoriConsep=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleAutoriConsep=true;
	public Boolean isVisibilidadCeldaCopiarDetalleAutoriConsep=true;
	public Boolean isVisibilidadCeldaVerFormDetalleAutoriConsep=true;
	public Boolean isVisibilidadCeldaOrdenDetalleAutoriConsep=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=false;
	public Boolean isVisibilidadCeldaModificarDetalleAutoriConsep=false;
	public Boolean isVisibilidadCeldaActualizarDetalleAutoriConsep=false;
	public Boolean isVisibilidadCeldaEliminarDetalleAutoriConsep=false;
	public Boolean isVisibilidadCeldaCancelarDetalleAutoriConsep=false;
	public Boolean isVisibilidadCeldaGuardarDetalleAutoriConsep=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep=false;	
	
	
	public Boolean isVisibilidadFK_IdAutoriConsep=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoDetalleAutoriConsep=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoDetalleAutoriConsep() {
		return this.iIdNuevoDetalleAutoriConsep;
	}

	public void setiIdNuevoDetalleAutoriConsep(Long iIdNuevoDetalleAutoriConsep) {
		this.iIdNuevoDetalleAutoriConsep = iIdNuevoDetalleAutoriConsep;
	}
	
	public Long getidDetalleAutoriConsepActual() {
		return this.idDetalleAutoriConsepActual;
	}

	public void setidDetalleAutoriConsepActual(Long idDetalleAutoriConsepActual) {
		this.idDetalleAutoriConsepActual = idDetalleAutoriConsepActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleAutoriConsep getdetalleautoriconsep() {
		return this.detalleautoriconsep;
	}

	public void setdetalleautoriconsep(DetalleAutoriConsep detalleautoriconsep) {
		this.detalleautoriconsep = detalleautoriconsep;
	}
	
	public DetalleAutoriConsep getdetalleautoriconsepAux() {
		return this.detalleautoriconsepAux;
	}

	public void setdetalleautoriconsepAux(DetalleAutoriConsep detalleautoriconsepAux) {
		this.detalleautoriconsepAux = detalleautoriconsepAux;
	}				
	
	public DetalleAutoriConsep getdetalleautoriconsepAnterior() {
		return this.detalleautoriconsepAnterior;
	}

	public void setdetalleautoriconsepAnterior(DetalleAutoriConsep detalleautoriconsepAnterior) {
		this.detalleautoriconsepAnterior = detalleautoriconsepAnterior;
	}	
	
	public DetalleAutoriConsep getdetalleautoriconsepTotales() {
		return this.detalleautoriconsepTotales;
	}

	public void setdetalleautoriconsepTotales(DetalleAutoriConsep detalleautoriconsepTotales) {
		this.detalleautoriconsepTotales = detalleautoriconsepTotales;
	}	
	
	public DetalleAutoriConsep getdetalleautoriconsepBean() {
		return this.detalleautoriconsepBean;
	}

	public void setdetalleautoriconsepBean(DetalleAutoriConsep detalleautoriconsepBean) {
		this.detalleautoriconsepBean = detalleautoriconsepBean;
	}	
	
	public DetalleAutoriConsepParameterReturnGeneral getdetalleautoriconsepReturnGeneral() {
		return this.detalleautoriconsepReturnGeneral;
	}

	public void setdetalleautoriconsepReturnGeneral(DetalleAutoriConsepParameterReturnGeneral detalleautoriconsepReturnGeneral) {
		this.detalleautoriconsepReturnGeneral = detalleautoriconsepReturnGeneral;
	}	
	
	
	public Long id_autori_consepFK_IdAutoriConsep=-1L;

	public Long getid_autori_consepFK_IdAutoriConsep() {
		return this.id_autori_consepFK_IdAutoriConsep;
	}

	public void setid_autori_consepFK_IdAutoriConsep(Long id_autori_consepFK_IdAutoriConsep) {
		this.id_autori_consepFK_IdAutoriConsep = id_autori_consepFK_IdAutoriConsep;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep=-1L;

	public Long getid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep() {
		return this.id_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep;
	}

	public void setid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep(Long id_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep) {
		this.id_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep = id_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep;
	}

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
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
	
	
	public DetalleAutoriConsepLogic getDetalleAutoriConsepLogic()	{		
		return detalleautoriconsepLogic;
	}

	public void setDetalleAutoriConsepLogic(DetalleAutoriConsepLogic detalleautoriconsepLogic) {
		this.detalleautoriconsepLogic = detalleautoriconsepLogic;
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
	
	public Boolean getIsEsNuevoDetalleAutoriConsep() {
		return isEsNuevoDetalleAutoriConsep;
	}

	public void setIsEsNuevoDetalleAutoriConsep(Boolean isEsNuevoDetalleAutoriConsep) {
		this.isEsNuevoDetalleAutoriConsep = isEsNuevoDetalleAutoriConsep;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleAutoriConsep() {
		return esParaAccionDesdeFormularioDetalleAutoriConsep;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleAutoriConsep(Boolean esParaAccionDesdeFormularioDetalleAutoriConsep) {
		this.esParaAccionDesdeFormularioDetalleAutoriConsep = esParaAccionDesdeFormularioDetalleAutoriConsep;
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
	
	
	public void cargarCombosAutoriConsepsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.autoriconsepsForeignKey=new ArrayList<AutoriConsep>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AutoriConsepLogic autoriconsepLogic=new AutoriConsepLogic();

			autoriconsepLogic.getAutoriConsepDataAccess().setIsForForeingKeyData(true);

			if(this.detalleautoriconsepSessionBean==null) {
				this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
			}

			if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionAutoriConsep()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriconsepLogic.getAutoriConsepDataAccess().setIsForForeingKeyData(true);

					autoriconsepLogic.getTodosAutoriConsepsWithConnection(sFinalQuery,new Pagination());

					this.autoriconsepsForeignKey=autoriconsepLogic.getAutoriConseps();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAutoriConsep(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					autoriconsepLogic.getEntityWithConnection(detalleautoriconsepSessionBean.getlidAutoriConsepActual());
					this.autoriconsepsForeignKey.add(autoriconsepLogic.getAutoriConsep());
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

			if(this.detalleautoriconsepSessionBean==null) {
				this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
			}

			if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detalleautoriconsepSessionBean.getlidEmpresaActual());
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

	public void cargarCombosProductosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.productosForeignKey=new ArrayList<Producto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProductoLogic productoLogic=new ProductoLogic();

			//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.detalleautoriconsepSessionBean==null) {
				this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
			}

			if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

					productoLogic.getTodosProductosWithConnection(sFinalQuery,new Pagination());

					this.productosForeignKey=productoLogic.getProductos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProducto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(detalleautoriconsepSessionBean.getlidProductoActual());
					this.productosForeignKey.add(productoLogic.getProducto());
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

			if(this.detalleautoriconsepSessionBean==null) {
				this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
			}

			if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
					unidadLogic.getEntityWithConnection(detalleautoriconsepSessionBean.getlidUnidadActual());
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

	public void cargarCombosEstadoDetalleAutoriConsepsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadodetalleautoriconsepsForeignKey=new ArrayList<EstadoDetalleAutoriConsep>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoDetalleAutoriConsepLogic estadodetalleautoriconsepLogic=new EstadoDetalleAutoriConsepLogic();

			//estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConsepDataAccess().setIsForForeingKeyData(true);

			if(this.detalleautoriconsepSessionBean==null) {
				this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
			}

			if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionEstadoDetalleAutoriConsep()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConsepDataAccess().setIsForForeingKeyData(true);

					estadodetalleautoriconsepLogic.getTodosEstadoDetalleAutoriConsepsWithConnection(sFinalQuery,new Pagination());

					this.estadodetalleautoriconsepsForeignKey=estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoDetalleAutoriConsep(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetalleautoriconsepLogic.getEntityWithConnection(detalleautoriconsepSessionBean.getlidEstadoDetalleAutoriConsepActual());
					this.estadodetalleautoriconsepsForeignKey.add(estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConsep());
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

	
	
	public void setActualAutoriConsepForeignKey(Long idAutoriConsepSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			AutoriConsep  autoriconsepTemp=null;

			for(AutoriConsep autoriconsepAux:autoriconsepsForeignKey) {
				if(autoriconsepAux.getId()!=null && autoriconsepAux.getId().equals(idAutoriConsepSeleccionado)) {
					autoriconsepTemp=autoriconsepAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(autoriconsepTemp!=null) {

					if(this.detalleautoriconsep!=null) {
						this.detalleautoriconsep.setAutoriConsep(autoriconsepTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
						this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep.setSelectedItem(autoriconsepTemp);
					}
				} else {
					//jComboBoxid_autori_consepDetalleAutoriConsep.setSelectedItem(autoriconsepTemp);
					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAutoriConsep") || sFormularioTipoBusqueda.equals("Todos")){
					if(autoriconsepTemp!=null && jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep!=null) {
						jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.setSelectedItem(autoriconsepTemp);
					} else {
						if(jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep!=null) {
							//jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.setSelectedItem(autoriconsepTemp);
							if(jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.getItemCount()>0) {
								jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.setSelectedIndex(0);
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

	public String getActualAutoriConsepForeignKeyDescripcion(Long idAutoriConsepSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			AutoriConsep  autoriconsepTemp=null;

			for(AutoriConsep autoriconsepAux:autoriconsepsForeignKey) {
				if(autoriconsepAux.getId()!=null && autoriconsepAux.getId().equals(idAutoriConsepSeleccionado)) {
					autoriconsepTemp=autoriconsepAux;
					break;
				}
			}


			sDescripcion=AutoriConsepConstantesFunciones.getAutoriConsepDescripcion(autoriconsepTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAutoriConsepForeignKeyGenerico(Long idAutoriConsepSeleccionado,JComboBox jComboBoxid_autori_consepDetalleAutoriConsepGenerico)throws Exception
	{
		try
		{
			AutoriConsep  autoriconsepTemp=null;

			for(AutoriConsep autoriconsepAux:autoriconsepsForeignKey) {
				if(autoriconsepAux.getId()!=null && autoriconsepAux.getId().equals(idAutoriConsepSeleccionado)) {
					autoriconsepTemp=autoriconsepAux;
					break;
				}
			}

			if(autoriconsepTemp!=null) {
				jComboBoxid_autori_consepDetalleAutoriConsepGenerico.setSelectedItem(autoriconsepTemp);
			} else {
				if(jComboBoxid_autori_consepDetalleAutoriConsepGenerico!=null && jComboBoxid_autori_consepDetalleAutoriConsepGenerico.getItemCount()>0) {
					jComboBoxid_autori_consepDetalleAutoriConsepGenerico.setSelectedIndex(0);
				}
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

					if(this.detalleautoriconsep!=null) {
						this.detalleautoriconsep.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
						this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleAutoriConsep.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleAutoriConsepGenerico)throws Exception
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
				jComboBoxid_empresaDetalleAutoriConsepGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleAutoriConsepGenerico!=null && jComboBoxid_empresaDetalleAutoriConsepGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleAutoriConsepGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProductoForeignKey(Long idProductoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(productoTemp!=null) {

					if(this.detalleautoriconsep!=null) {
						this.detalleautoriconsep.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
						this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoDetalleAutoriConsep.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoDetalleAutoriConsep!=null) {
						jComboBoxid_productoFK_IdProductoDetalleAutoriConsep.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoDetalleAutoriConsep!=null) {
							//jComboBoxid_productoFK_IdProductoDetalleAutoriConsep.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoDetalleAutoriConsep.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoDetalleAutoriConsep.setSelectedIndex(0);
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

	public String getActualProductoForeignKeyDescripcion(Long idProductoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}


			sDescripcion=ProductoConstantesFunciones.getProductoDescripcion(productoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoDetalleAutoriConsepGenerico)throws Exception
	{
		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}

			if(productoTemp!=null) {
				jComboBoxid_productoDetalleAutoriConsepGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoDetalleAutoriConsepGenerico!=null && jComboBoxid_productoDetalleAutoriConsepGenerico.getItemCount()>0) {
					jComboBoxid_productoDetalleAutoriConsepGenerico.setSelectedIndex(0);
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

					if(this.detalleautoriconsep!=null) {
						this.detalleautoriconsep.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
						this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadDetalleAutoriConsep.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep!=null) {
						jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep!=null) {
							//jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadDetalleAutoriConsepGenerico)throws Exception
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
				jComboBoxid_unidadDetalleAutoriConsepGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadDetalleAutoriConsepGenerico!=null && jComboBoxid_unidadDetalleAutoriConsepGenerico.getItemCount()>0) {
					jComboBoxid_unidadDetalleAutoriConsepGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoDetalleAutoriConsepForeignKey(Long idEstadoDetalleAutoriConsepSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoDetalleAutoriConsep  estadodetalleautoriconsepTemp=null;

			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconsepsForeignKey) {
				if(estadodetalleautoriconsepAux.getId()!=null && estadodetalleautoriconsepAux.getId().equals(idEstadoDetalleAutoriConsepSeleccionado)) {
					estadodetalleautoriconsepTemp=estadodetalleautoriconsepAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadodetalleautoriconsepTemp!=null) {

					if(this.detalleautoriconsep!=null) {
						this.detalleautoriconsep.setEstadoDetalleAutoriConsep(estadodetalleautoriconsepTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
						this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.setSelectedItem(estadodetalleautoriconsepTemp);
					}
				} else {
					//jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.setSelectedItem(estadodetalleautoriconsepTemp);
					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoDetalleAutoriConsep") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadodetalleautoriconsepTemp!=null && jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep!=null) {
						jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setSelectedItem(estadodetalleautoriconsepTemp);
					} else {
						if(jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep!=null) {
							//jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setSelectedItem(estadodetalleautoriconsepTemp);
							if(jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.getItemCount()>0) {
								jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setSelectedIndex(0);
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

	public String getActualEstadoDetalleAutoriConsepForeignKeyDescripcion(Long idEstadoDetalleAutoriConsepSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoDetalleAutoriConsep  estadodetalleautoriconsepTemp=null;

			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconsepsForeignKey) {
				if(estadodetalleautoriconsepAux.getId()!=null && estadodetalleautoriconsepAux.getId().equals(idEstadoDetalleAutoriConsepSeleccionado)) {
					estadodetalleautoriconsepTemp=estadodetalleautoriconsepAux;
					break;
				}
			}


			sDescripcion=EstadoDetalleAutoriConsepConstantesFunciones.getEstadoDetalleAutoriConsepDescripcion(estadodetalleautoriconsepTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoDetalleAutoriConsepForeignKeyGenerico(Long idEstadoDetalleAutoriConsepSeleccionado,JComboBox jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsepGenerico)throws Exception
	{
		try
		{
			EstadoDetalleAutoriConsep  estadodetalleautoriconsepTemp=null;

			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconsepsForeignKey) {
				if(estadodetalleautoriconsepAux.getId()!=null && estadodetalleautoriconsepAux.getId().equals(idEstadoDetalleAutoriConsepSeleccionado)) {
					estadodetalleautoriconsepTemp=estadodetalleautoriconsepAux;
					break;
				}
			}

			if(estadodetalleautoriconsepTemp!=null) {
				jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsepGenerico.setSelectedItem(estadodetalleautoriconsepTemp);
			} else {
				if(jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsepGenerico!=null && jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsepGenerico.getItemCount()>0) {
					jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsepGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAutoriConsepForeignKey(DetalleAutoriConsep detalleautoriconsep,JComboBox jComboBoxid_autori_consepDetalleAutoriConsepGenerico)throws Exception
	{
		try
		{
			AutoriConsep  autoriconsepAux=new AutoriConsep();

			if(jComboBoxid_autori_consepDetalleAutoriConsepGenerico==null) {
				autoriconsepAux=(AutoriConsep)this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep.getSelectedItem();
			} else {
				autoriconsepAux=(AutoriConsep)jComboBoxid_autori_consepDetalleAutoriConsepGenerico.getSelectedItem();
			}

			if(autoriconsepAux!=null && autoriconsepAux.getId()!=null) {
				detalleautoriconsep.setid_autori_consep(autoriconsepAux.getId());
				detalleautoriconsep.setautoriconsep_descripcion(DetalleAutoriConsepConstantesFunciones.getAutoriConsepDescripcion(autoriconsepAux));
				detalleautoriconsep.setAutoriConsep(autoriconsepAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleAutoriConsep detalleautoriconsep,JComboBox jComboBoxid_empresaDetalleAutoriConsepGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleAutoriConsepGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleAutoriConsepGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detalleautoriconsep.setid_empresa(empresaAux.getId());
				detalleautoriconsep.setempresa_descripcion(DetalleAutoriConsepConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detalleautoriconsep.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(DetalleAutoriConsep detalleautoriconsep,JComboBox jComboBoxid_productoDetalleAutoriConsepGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoDetalleAutoriConsepGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoDetalleAutoriConsepGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				detalleautoriconsep.setid_producto(productoAux.getId());
				detalleautoriconsep.setproducto_descripcion(DetalleAutoriConsepConstantesFunciones.getProductoDescripcion(productoAux));
				detalleautoriconsep.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(DetalleAutoriConsep detalleautoriconsep,JComboBox jComboBoxid_unidadDetalleAutoriConsepGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadDetalleAutoriConsepGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadDetalleAutoriConsepGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				detalleautoriconsep.setid_unidad(unidadAux.getId());
				detalleautoriconsep.setunidad_descripcion(DetalleAutoriConsepConstantesFunciones.getUnidadDescripcion(unidadAux));
				detalleautoriconsep.setUnidad(unidadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoDetalleAutoriConsepForeignKey(DetalleAutoriConsep detalleautoriconsep,JComboBox jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsepGenerico)throws Exception
	{
		try
		{
			EstadoDetalleAutoriConsep  estadodetalleautoriconsepAux=new EstadoDetalleAutoriConsep();

			if(jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsepGenerico==null) {
				estadodetalleautoriconsepAux=(EstadoDetalleAutoriConsep)this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.getSelectedItem();
			} else {
				estadodetalleautoriconsepAux=(EstadoDetalleAutoriConsep)jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsepGenerico.getSelectedItem();
			}

			if(estadodetalleautoriconsepAux!=null && estadodetalleautoriconsepAux.getId()!=null) {
				detalleautoriconsep.setid_estado_detalle_autori_consep(estadodetalleautoriconsepAux.getId());
				detalleautoriconsep.setestadodetalleautoriconsep_descripcion(DetalleAutoriConsepConstantesFunciones.getEstadoDetalleAutoriConsepDescripcion(estadodetalleautoriconsepAux));
				detalleautoriconsep.setEstadoDetalleAutoriConsep(estadodetalleautoriconsepAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAutoriConsepsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAutoriConsep=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { 
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep.removeAllItems();

							for(AutoriConsep autoriconsep:this.autoriconsepsForeignKey) {
								this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep.addItem(autoriconsep);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { 
					}

					if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAutoriConsep") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.removeAllItems();

							for(AutoriConsep autoriconsep:this.autoriconsepsForeignKey) {
								this.jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.addItem(autoriconsep);
							}
						}

						if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { 
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { 
					}

					if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { 
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { 
					}

					if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoDetalleAutoriConsep.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoDetalleAutoriConsep.addItem(producto);
							}
						}

						if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { 
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { 
					}

					if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep.addItem(unidad);
							}
						}

						if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoDetalleAutoriConsepsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoDetalleAutoriConsep=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { 
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.removeAllItems();

							for(EstadoDetalleAutoriConsep estadodetalleautoriconsep:this.estadodetalleautoriconsepsForeignKey) {
								this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.addItem(estadodetalleautoriconsep);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { 
					}

					if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoDetalleAutoriConsep") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.removeAllItems();

							for(EstadoDetalleAutoriConsep estadodetalleautoriconsep:this.estadodetalleautoriconsepsForeignKey) {
								this.jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.addItem(estadodetalleautoriconsep);
							}
						}

						if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameAutoriConsepForeignKey(AutoriConsep autoriconsep,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep.setSelectedItem(autoriconsep);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.setSelectedItem(autoriconsep);
						} else {
							this.jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameProductoForeignKey(Producto producto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoDetalleAutoriConsep.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoDetalleAutoriConsep.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoDetalleAutoriConsepForeignKey(EstadoDetalleAutoriConsep estadodetalleautoriconsep,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.setSelectedItem(estadodetalleautoriconsep);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setSelectedItem(estadodetalleautoriconsep);
						} else {
							this.jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleAutoriConsep() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleAutoriConsepConstantesFunciones.refrescarForeignKeysDescripcionesDetalleAutoriConsep(this.detalleautoriconsepLogic.getDetalleAutoriConseps());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleAutoriConsepConstantesFunciones.refrescarForeignKeysDescripcionesDetalleAutoriConsep(this.detalleautoriconseps);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(AutoriConsep.class));
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Unidad.class));
		classes.add(new Classe(EstadoDetalleAutoriConsep.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detalleautoriconsepLogic.setDetalleAutoriConseps(this.detalleautoriconseps);
			detalleautoriconsepLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleAutoriConsepParameterReturnGeneral getDetalleAutoriConsepParameterGeneral() {
		return this.detalleautoriconsepParameterGeneral;
	}
	
	public void setDetalleAutoriConsepParameterGeneral(DetalleAutoriConsepParameterReturnGeneral detalleautoriconsepParameterGeneral) {
		this.detalleautoriconsepParameterGeneral = detalleautoriconsepParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleAutoriConsep() {
		return isPermisoTodoDetalleAutoriConsep;
	}

	public void setIsPermisoTodoDetalleAutoriConsep(Boolean isPermisoTodoDetalleAutoriConsep) {
		this.isPermisoTodoDetalleAutoriConsep = isPermisoTodoDetalleAutoriConsep;
	}

	public Boolean getIsPermisoNuevoDetalleAutoriConsep() {
		return isPermisoNuevoDetalleAutoriConsep;
	}

	public void setIsPermisoNuevoDetalleAutoriConsep(Boolean isPermisoNuevoDetalleAutoriConsep) {
		this.isPermisoNuevoDetalleAutoriConsep = isPermisoNuevoDetalleAutoriConsep;
	}

	public Boolean getIsPermisoActualizarDetalleAutoriConsep() {
		return isPermisoActualizarDetalleAutoriConsep;
	}

	public void setIsPermisoActualizarDetalleAutoriConsep(Boolean isPermisoActualizarDetalleAutoriConsep) {
		this.isPermisoActualizarDetalleAutoriConsep = isPermisoActualizarDetalleAutoriConsep;
	}

	public Boolean getIsPermisoEliminarDetalleAutoriConsep() {
		return isPermisoEliminarDetalleAutoriConsep;
	}

	public void setIsPermisoEliminarDetalleAutoriConsep(Boolean isPermisoEliminarDetalleAutoriConsep) {
		this.isPermisoEliminarDetalleAutoriConsep = isPermisoEliminarDetalleAutoriConsep;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleAutoriConsep() {
		return isPermisoGuardarCambiosDetalleAutoriConsep;
	}

	public void setIsPermisoGuardarCambiosDetalleAutoriConsep(Boolean isPermisoGuardarCambiosDetalleAutoriConsep) {
		this.isPermisoGuardarCambiosDetalleAutoriConsep = isPermisoGuardarCambiosDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoConsultaDetalleAutoriConsep() {
		return isPermisoConsultaDetalleAutoriConsep;
	}

	public void setIsPermisoConsultaDetalleAutoriConsep(Boolean isPermisoConsultaDetalleAutoriConsep) {
		this.isPermisoConsultaDetalleAutoriConsep = isPermisoConsultaDetalleAutoriConsep;
	}

	public Boolean getIsPermisoBusquedaDetalleAutoriConsep() {
		return isPermisoBusquedaDetalleAutoriConsep;
	}

	public void setIsPermisoBusquedaDetalleAutoriConsep(Boolean isPermisoBusquedaDetalleAutoriConsep) {
		this.isPermisoBusquedaDetalleAutoriConsep = isPermisoBusquedaDetalleAutoriConsep;
	}

	public Boolean getIsPermisoReporteDetalleAutoriConsep() {
		return isPermisoReporteDetalleAutoriConsep;
	}

	public void setIsPermisoReporteDetalleAutoriConsep(Boolean isPermisoReporteDetalleAutoriConsep) {
		this.isPermisoReporteDetalleAutoriConsep = isPermisoReporteDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleAutoriConsep() {
		return isPermisoPaginacionMedioDetalleAutoriConsep;
	}

	public void setIsPermisoPaginacionMedioDetalleAutoriConsep(Boolean isPermisoPaginacionMedioDetalleAutoriConsep) {
		this.isPermisoPaginacionMedioDetalleAutoriConsep = isPermisoPaginacionMedioDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleAutoriConsep() {
		return isPermisoPaginacionTodoDetalleAutoriConsep;
	}

	public void setIsPermisoPaginacionTodoDetalleAutoriConsep(Boolean isPermisoPaginacionTodoDetalleAutoriConsep) {
		this.isPermisoPaginacionTodoDetalleAutoriConsep = isPermisoPaginacionTodoDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleAutoriConsep() {
		return isPermisoPaginacionAltoDetalleAutoriConsep;
	}

	public void setIsPermisoPaginacionAltoDetalleAutoriConsep(Boolean isPermisoPaginacionAltoDetalleAutoriConsep) {
		this.isPermisoPaginacionAltoDetalleAutoriConsep = isPermisoPaginacionAltoDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoCopiarDetalleAutoriConsep() {
		return isPermisoCopiarDetalleAutoriConsep;
	}

	public void setIsPermisoCopiarDetalleAutoriConsep(Boolean isPermisoCopiarDetalleAutoriConsep) {
		this.isPermisoCopiarDetalleAutoriConsep = isPermisoCopiarDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoVerFormDetalleAutoriConsep() {
		return isPermisoVerFormDetalleAutoriConsep;
	}

	public void setIsPermisoVerFormDetalleAutoriConsep(Boolean isPermisoVerFormDetalleAutoriConsep) {
		this.isPermisoVerFormDetalleAutoriConsep = isPermisoVerFormDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoDuplicarDetalleAutoriConsep() {
		return isPermisoDuplicarDetalleAutoriConsep;
	}

	public void setIsPermisoDuplicarDetalleAutoriConsep(Boolean isPermisoDuplicarDetalleAutoriConsep) {
		this.isPermisoDuplicarDetalleAutoriConsep = isPermisoDuplicarDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoOrdenDetalleAutoriConsep() {
		return isPermisoOrdenDetalleAutoriConsep;
	}

	public void setIsPermisoOrdenDetalleAutoriConsep(Boolean isPermisoOrdenDetalleAutoriConsep) {
		this.isPermisoOrdenDetalleAutoriConsep = isPermisoOrdenDetalleAutoriConsep;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleAutoriConsep() {
		return isVisibilidadCeldaNuevoDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaNuevoDetalleAutoriConsep(Boolean isVisibilidadCeldaNuevoDetalleAutoriConsep) {
		this.isVisibilidadCeldaNuevoDetalleAutoriConsep = isVisibilidadCeldaNuevoDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleAutoriConsep() {
		return isVisibilidadCeldaDuplicarDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleAutoriConsep(Boolean isVisibilidadCeldaDuplicarDetalleAutoriConsep) {
		this.isVisibilidadCeldaDuplicarDetalleAutoriConsep = isVisibilidadCeldaDuplicarDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleAutoriConsep() {
		return isVisibilidadCeldaCopiarDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaCopiarDetalleAutoriConsep(Boolean isVisibilidadCeldaCopiarDetalleAutoriConsep) {
		this.isVisibilidadCeldaCopiarDetalleAutoriConsep = isVisibilidadCeldaCopiarDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleAutoriConsep() {
		return isVisibilidadCeldaVerFormDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaVerFormDetalleAutoriConsep(Boolean isVisibilidadCeldaVerFormDetalleAutoriConsep) {
		this.isVisibilidadCeldaVerFormDetalleAutoriConsep = isVisibilidadCeldaVerFormDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleAutoriConsep() {
		return isVisibilidadCeldaOrdenDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaOrdenDetalleAutoriConsep(Boolean isVisibilidadCeldaOrdenDetalleAutoriConsep) {
		this.isVisibilidadCeldaOrdenDetalleAutoriConsep = isVisibilidadCeldaOrdenDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep() {
		return isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep(Boolean isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep = isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleAutoriConsep() {
		return isVisibilidadCeldaModificarDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaModificarDetalleAutoriConsep(Boolean isVisibilidadCeldaModificarDetalleAutoriConsep) {
		this.isVisibilidadCeldaModificarDetalleAutoriConsep = isVisibilidadCeldaModificarDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleAutoriConsep() {
		return isVisibilidadCeldaActualizarDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaActualizarDetalleAutoriConsep(Boolean isVisibilidadCeldaActualizarDetalleAutoriConsep) {
		this.isVisibilidadCeldaActualizarDetalleAutoriConsep = isVisibilidadCeldaActualizarDetalleAutoriConsep;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleAutoriConsep() {
		return isVisibilidadCeldaEliminarDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaEliminarDetalleAutoriConsep(Boolean isVisibilidadCeldaEliminarDetalleAutoriConsep) {
		this.isVisibilidadCeldaEliminarDetalleAutoriConsep = isVisibilidadCeldaEliminarDetalleAutoriConsep;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleAutoriConsep() {
		return isVisibilidadCeldaCancelarDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaCancelarDetalleAutoriConsep(Boolean isVisibilidadCeldaCancelarDetalleAutoriConsep) {
		this.isVisibilidadCeldaCancelarDetalleAutoriConsep = isVisibilidadCeldaCancelarDetalleAutoriConsep;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleAutoriConsep() {
		return isVisibilidadCeldaGuardarDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaGuardarDetalleAutoriConsep(Boolean isVisibilidadCeldaGuardarDetalleAutoriConsep) {
		this.isVisibilidadCeldaGuardarDetalleAutoriConsep = isVisibilidadCeldaGuardarDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleAutoriConsep() {
		return isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleAutoriConsep(Boolean isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep) {
		this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep = isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep;
	}
		
	public DetalleAutoriConsepSessionBean getdetalleautoriconsepSessionBean() {
		return this.detalleautoriconsepSessionBean;
	}
	
	public void setdetalleautoriconsepSessionBean(DetalleAutoriConsepSessionBean detalleautoriconsepSessionBean) {
		this.detalleautoriconsepSessionBean=detalleautoriconsepSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAutoriConsep() {
		return this.isVisibilidadFK_IdAutoriConsep;
	}

	public void setisVisibilidadFK_IdAutoriConsep(Boolean isVisibilidadFK_IdAutoriConsep) {
		this.isVisibilidadFK_IdAutoriConsep=isVisibilidadFK_IdAutoriConsep;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoDetalleAutoriConsep() {
		return this.isVisibilidadFK_IdEstadoDetalleAutoriConsep;
	}

	public void setisVisibilidadFK_IdEstadoDetalleAutoriConsep(Boolean isVisibilidadFK_IdEstadoDetalleAutoriConsep) {
		this.isVisibilidadFK_IdEstadoDetalleAutoriConsep=isVisibilidadFK_IdEstadoDetalleAutoriConsep;
	}

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	public Boolean getisVisibilidadFK_IdUnidad() {
		return this.isVisibilidadFK_IdUnidad;
	}

	public void setisVisibilidadFK_IdUnidad(Boolean isVisibilidadFK_IdUnidad) {
		this.isVisibilidadFK_IdUnidad=isVisibilidadFK_IdUnidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep)throws Exception {
		try {
			
				this.setActualParaGuardarAutoriConsepForeignKey(detalleautoriconsep,null);
				this.setActualParaGuardarEmpresaForeignKey(detalleautoriconsep,null);
				this.setActualParaGuardarProductoForeignKey(detalleautoriconsep,null);
				this.setActualParaGuardarUnidadForeignKey(detalleautoriconsep,null);
				this.setActualParaGuardarEstadoDetalleAutoriConsepForeignKey(detalleautoriconsep,null);
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
	
	public void bugActualizarReferenciaActual(DetalleAutoriConsep detalleautoriconsep,DetalleAutoriConsep detalleautoriconsepAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleAutoriConsep(detalleautoriconsep);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detalleautoriconsepAux.setId(detalleautoriconsep.getId());
		detalleautoriconsepAux.setVersionRow(detalleautoriconsep.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleAutoriConsep();
		
			int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detalleautoriconsepValidator.getInvalidValues(this.detalleautoriconsep);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detalleautoriconsepLogic.setDatosCliente(datosCliente);
			detalleautoriconsepLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detalleautoriconsepAux=new  DetalleAutoriConsep();
				
				detalleautoriconsepAux.setIsNew(true);
				detalleautoriconsepAux.setIsChanged(true);
				
				detalleautoriconsepAux.setDetalleAutoriConsepOriginal(this.detalleautoriconsep);
				
				detalleautoriconsepAux.setId(this.detalleautoriconsep.getId());	
				detalleautoriconsepAux.setVersionRow(this.detalleautoriconsep.getVersionRow());	
				detalleautoriconsepAux.setid_autori_consep(this.detalleautoriconsep.getid_autori_consep());	
				detalleautoriconsepAux.setid_empresa(this.detalleautoriconsep.getid_empresa());	
				detalleautoriconsepAux.setid_producto(this.detalleautoriconsep.getid_producto());	
				detalleautoriconsepAux.setid_unidad(this.detalleautoriconsep.getid_unidad());	
				detalleautoriconsepAux.setcantidad_anio(this.detalleautoriconsep.getcantidad_anio());	
				detalleautoriconsepAux.setcantidad_saldo(this.detalleautoriconsep.getcantidad_saldo());	
				detalleautoriconsepAux.setid_estado_detalle_autori_consep(this.detalleautoriconsep.getid_estado_detalle_autori_consep());	
				detalleautoriconsepAux.setnombre(this.detalleautoriconsep.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleautoriconsepSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detalleautoriconsepAux,detalleautoriconsepLogic.getDetalleAutoriConseps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleautoriconsepAux,detalleautoriconseps);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepLogic.saveDetalleAutoriConseps();//WithConnection
						//detalleautoriconsepLogic.getSetVersionRowDetalleAutoriConseps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleautoriconsep,detalleautoriconsepAux);
					
					this.refrescarForeignKeysDescripcionesDetalleAutoriConsep();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleautoriconsepLogic.saveDetalleAutoriConsepRelaciones(detalleautoriconsepAux);//WithConnection
								//detalleautoriconsepLogic.getSetVersionRowDetalleAutoriConseps();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleautoriconsep,detalleautoriconsepAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleautoriconsepSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleautoriconsepAux,detalleautoriconsepLogic.getDetalleAutoriConseps());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleautoriconsepAux,detalleautoriconseps);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleautoriconsep,detalleautoriconsepAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detalleautoriconsepAux=new  DetalleAutoriConsep();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado() 
					|| (this.detalleautoriconsepSessionBean.getEsGuardarRelacionado() && this.detalleautoriconsep.getId()>=0)) {
						
					detalleautoriconsepAux.setIsNew(false);
				}
				
				detalleautoriconsepAux.setIsDeleted(false);
			
				detalleautoriconsepAux.setId(this.detalleautoriconsep.getId());	
				detalleautoriconsepAux.setVersionRow(this.detalleautoriconsep.getVersionRow());	
				detalleautoriconsepAux.setid_autori_consep(this.detalleautoriconsep.getid_autori_consep());	
				detalleautoriconsepAux.setid_empresa(this.detalleautoriconsep.getid_empresa());	
				detalleautoriconsepAux.setid_producto(this.detalleautoriconsep.getid_producto());	
				detalleautoriconsepAux.setid_unidad(this.detalleautoriconsep.getid_unidad());	
				detalleautoriconsepAux.setcantidad_anio(this.detalleautoriconsep.getcantidad_anio());	
				detalleautoriconsepAux.setcantidad_saldo(this.detalleautoriconsep.getcantidad_saldo());	
				detalleautoriconsepAux.setid_estado_detalle_autori_consep(this.detalleautoriconsep.getid_estado_detalle_autori_consep());	
				detalleautoriconsepAux.setnombre(this.detalleautoriconsep.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleautoriconsepAux,detalleautoriconsepLogic.getDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleautoriconsepAux,detalleautoriconseps);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepLogic.saveDetalleAutoriConseps();//WithConnection
						//detalleautoriconsepLogic.getSetVersionRowDetalleAutoriConseps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleautoriconsep,detalleautoriconsepAux);
					
					this.refrescarForeignKeysDescripcionesDetalleAutoriConsep();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleautoriconsepLogic.saveDetalleAutoriConsepRelaciones(detalleautoriconsepAux);//WithConnection
								//detalleautoriconsepLogic.getSetVersionRowDetalleAutoriConseps();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleautoriconsep,detalleautoriconsepAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleautoriconsepSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleautoriconsepAux,detalleautoriconsepLogic.getDetalleAutoriConseps());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleautoriconsepAux,detalleautoriconseps);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleautoriconsep,detalleautoriconsepAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detalleautoriconsepAux=new  DetalleAutoriConsep();
				
				detalleautoriconsepAux.setIsNew(false);
				detalleautoriconsepAux.setIsChanged(false);
				
				detalleautoriconsepAux.setIsDeleted(true);
				
				detalleautoriconsepAux.setId(this.detalleautoriconsep.getId());	
				detalleautoriconsepAux.setVersionRow(this.detalleautoriconsep.getVersionRow());	
				detalleautoriconsepAux.setid_autori_consep(this.detalleautoriconsep.getid_autori_consep());	
				detalleautoriconsepAux.setid_empresa(this.detalleautoriconsep.getid_empresa());	
				detalleautoriconsepAux.setid_producto(this.detalleautoriconsep.getid_producto());	
				detalleautoriconsepAux.setid_unidad(this.detalleautoriconsep.getid_unidad());	
				detalleautoriconsepAux.setcantidad_anio(this.detalleautoriconsep.getcantidad_anio());	
				detalleautoriconsepAux.setcantidad_saldo(this.detalleautoriconsep.getcantidad_saldo());	
				detalleautoriconsepAux.setid_estado_detalle_autori_consep(this.detalleautoriconsep.getid_estado_detalle_autori_consep());	
				detalleautoriconsepAux.setnombre(this.detalleautoriconsep.getnombre());	
				
				if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detalleautoriconsepAux.getId()>=0) {	
						this.detalleautoriconsepsEliminados.add(detalleautoriconsepAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detalleautoriconsepAux,detalleautoriconsepLogic.getDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleautoriconsepAux,detalleautoriconseps);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepLogic.saveDetalleAutoriConseps();//WithConnection
						//detalleautoriconsepLogic.getSetVersionRowDetalleAutoriConseps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleautoriconsepLogic.saveDetalleAutoriConsepRelaciones(detalleautoriconsepAux);//WithConnection
								//detalleautoriconsepLogic.getSetVersionRowDetalleAutoriConseps();//WithConnection
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
							if(this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detalleautoriconsepSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detalleautoriconsepAux,detalleautoriconsepLogic.getDetalleAutoriConseps());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detalleautoriconsepAux,detalleautoriconseps);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.getDetalleAutoriConseps().addAll(this.detalleautoriconsepsEliminados);
					
					detalleautoriconsepLogic.saveDetalleAutoriConseps();//WithConnection
					//detalleautoriconsepLogic.getSetVersionRowDetalleAutoriConseps();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleAutoriConsep();
				
				this.detalleautoriconsepsEliminados= new ArrayList<DetalleAutoriConsep>();		
			}
			
			if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Autorizacion Consep GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detalleautoriconsep=detalleautoriconsepAux;
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
      		//this.finishProcessDetalleAutoriConsep();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleAutoriConsep detalleautoriconsepLocal) throws Exception {
		
		if(this.detalleautoriconsepSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleAutoriConsep detalleautoriconsepLocal) throws Exception {	
		if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(AutoriConsepDetalleFormJInternalFrame.class)) {
				AutoriConsepBeanSwingJInternalFrame autoriconsepBeanSwingJInternalFrameLocal=(AutoriConsepBeanSwingJInternalFrame) ((AutoriConsepDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				autoriconsepBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAutoriConsep(autoriconsepBeanSwingJInternalFrameLocal.getautoriconsep(),true);
				autoriconsepBeanSwingJInternalFrameLocal.actualizarLista(autoriconsepBeanSwingJInternalFrameLocal.autoriconsep,this.autoriconsepsForeignKey);

				autoriconsepBeanSwingJInternalFrameLocal.actualizarRelaciones(autoriconsepBeanSwingJInternalFrameLocal.autoriconsep);

				detalleautoriconsepLocal.setAutoriConsep(autoriconsepBeanSwingJInternalFrameLocal.autoriconsep);

				this.addItemDefectoCombosForeignKeyAutoriConsep();
				this.cargarCombosFrameAutoriConsepsForeignKey("Formulario");
				this.setActualAutoriConsepForeignKey(autoriconsepBeanSwingJInternalFrameLocal.autoriconsep.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detalleautoriconsepLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				detalleautoriconsepLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				detalleautoriconsepLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoDetalleAutoriConsepDetalleFormJInternalFrame.class)) {
				EstadoDetalleAutoriConsepBeanSwingJInternalFrame estadodetalleautoriconsepBeanSwingJInternalFrameLocal=(EstadoDetalleAutoriConsepBeanSwingJInternalFrame) ((EstadoDetalleAutoriConsepDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadodetalleautoriconsepBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoDetalleAutoriConsep(estadodetalleautoriconsepBeanSwingJInternalFrameLocal.getestadodetalleautoriconsep(),true);
				estadodetalleautoriconsepBeanSwingJInternalFrameLocal.actualizarLista(estadodetalleautoriconsepBeanSwingJInternalFrameLocal.estadodetalleautoriconsep,this.estadodetalleautoriconsepsForeignKey);

				estadodetalleautoriconsepBeanSwingJInternalFrameLocal.actualizarRelaciones(estadodetalleautoriconsepBeanSwingJInternalFrameLocal.estadodetalleautoriconsep);

				detalleautoriconsepLocal.setEstadoDetalleAutoriConsep(estadodetalleautoriconsepBeanSwingJInternalFrameLocal.estadodetalleautoriconsep);

				this.addItemDefectoCombosForeignKeyEstadoDetalleAutoriConsep();
				this.cargarCombosFrameEstadoDetalleAutoriConsepsForeignKey("Formulario");
				this.setActualEstadoDetalleAutoriConsepForeignKey(estadodetalleautoriconsepBeanSwingJInternalFrameLocal.estadodetalleautoriconsep.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleAutoriConsepActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detalleautoriconsepValidator.getInvalidValues(this.detalleautoriconsep);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleAutoriConsep detalleautoriconsep,List<DetalleAutoriConsep> detalleautoriconseps) throws Exception {
		try	{		
			DetalleAutoriConsepConstantesFunciones.actualizarLista(detalleautoriconsep,detalleautoriconseps,this.detalleautoriconsepSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleAutoriConsep detalleautoriconsep,List<DetalleAutoriConsep> detalleautoriconseps) throws Exception {
		try	{			
			DetalleAutoriConsepConstantesFunciones.actualizarSelectedLista(detalleautoriconsep,detalleautoriconseps);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleAutoriConsep> detalleautoriconsepsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detalleautoriconsepsLocal=this.detalleautoriconsepLogic.getDetalleAutoriConseps();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detalleautoriconsepsLocal=this.detalleautoriconseps;
			}
			//ARCHITECTURE
		
			for(DetalleAutoriConsep detalleautoriconsepLocal:detalleautoriconsepsLocal) {
				if(this.permiteMantenimiento(detalleautoriconsepLocal) && detalleautoriconsepLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleAutoriConsepConstantesFunciones.getDetalleAutoriConsepLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleAutoriConsepConstantesFunciones.IDAUTORICONSEP)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelid_autori_consepDetalleAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleAutoriConsepConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelid_empresaDetalleAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleAutoriConsepConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelid_productoDetalleAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleAutoriConsepConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelid_unidadDetalleAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleAutoriConsepConstantesFunciones.CANTIDADANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelcantidad_anioDetalleAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleAutoriConsepConstantesFunciones.CANTIDADSALDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelcantidad_saldoDetalleAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleAutoriConsepConstantesFunciones.IDESTADODETALLEAUTORICONSEP)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelid_estado_detalle_autori_consepDetalleAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleAutoriConsepConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelnombreDetalleAutoriConsep,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelid_autori_consepDetalleAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelid_empresaDetalleAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelid_productoDetalleAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelid_unidadDetalleAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelcantidad_anioDetalleAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelcantidad_saldoDetalleAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelid_estado_detalle_autori_consepDetalleAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelnombreDetalleAutoriConsep,"");
		
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
		this.iIdNuevoDetalleAutoriConsep--;	
		
		
		this.detalleautoriconsepAux=new DetalleAutoriConsep();
		
		this.detalleautoriconsepAux.setId(this.iIdNuevoDetalleAutoriConsep);
		this.detalleautoriconsepAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleautoriconsepLogic.getDetalleAutoriConseps().add(this.detalleautoriconsepAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detalleautoriconseps.add(this.detalleautoriconsepAux);
		}
		//ARCHITECTURE
		
		this.detalleautoriconsep=this.detalleautoriconsepAux;
		
		if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleAutoriConsep(this.detalleautoriconsep);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleAutoriConsep(this.detalleautoriconsep);
		}
				
		//this.setDefaultControlesDetalleAutoriConsep();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleAutoriConsep();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleAutoriConsep();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleAutoriConsep();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleAutoriConsep(this.detalleautoriconsepBean,this.detalleautoriconsep,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detalleautoriconsepSessionBean.getConGuardarRelaciones()) {
			classes=DetalleAutoriConsepConstantesFunciones.getClassesRelationshipsOfDetalleAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detalleautoriconsepReturnGeneral=detalleautoriconsepLogic.procesarEventosDetalleAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleautoriconsepLogic.getDetalleAutoriConseps(),this.detalleautoriconsep,this.detalleautoriconsepParameterGeneral,this.isEsNuevoDetalleAutoriConsep,classes);//this.detalleautoriconsepLogic.getDetalleAutoriConsep()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleAutoriConsep(this.detalleautoriconsepReturnGeneral,this.detalleautoriconsepBean,false);
		
		if(this.detalleautoriconsepReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleAutoriConsep(this.detalleautoriconsepReturnGeneral.getDetalleAutoriConsep());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleAutoriConsep(this.detalleautoriconsepReturnGeneral.getDetalleAutoriConsep());
		}
		
		if(this.detalleautoriconsepReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleAutoriConsep(this.detalleautoriconsepReturnGeneral.getDetalleAutoriConsep(),classes);//this.detalleautoriconsepBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleAutoriConsep();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleAutoriConsep();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.RecargarFormDetalleAutoriConsep(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleAutoriConsep(false);
						
			if(detalleautoriconsepSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleAutoriConsep();
			}
			
			this.actualizarVisualTableDatosDetalleAutoriConsep();
			
			this.jTableDatosDetalleAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoDetalleAutoriConsep(), this.getIndiceNuevoDetalleAutoriConsep());
			
			this.seleccionarFilaTablaDetalleAutoriConsepActual();
						
			this.actualizarEstadoCeldasBotonesDetalleAutoriConsep("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleAutoriConsep(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_anioDetalleAutoriConsep.setEnabled(isHabilitar && this.detalleautoriconsepConstantesFunciones.activarcantidad_anioDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_saldoDetalleAutoriConsep.setEnabled(isHabilitar && this.detalleautoriconsepConstantesFunciones.activarcantidad_saldoDetalleAutoriConsep);//
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldnombreDetalleAutoriConsep.setEnabled(isHabilitar && this.detalleautoriconsepConstantesFunciones.activarnombreDetalleAutoriConsep);	
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep.setEnabled(isHabilitar && this.detalleautoriconsepConstantesFunciones.activarid_autori_consepDetalleAutoriConsep);//
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep.setEnabled(isHabilitar && this.detalleautoriconsepConstantesFunciones.activarid_empresaDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep.setEnabled(isHabilitar && this.detalleautoriconsepConstantesFunciones.activarid_productoDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep.setEnabled(isHabilitar && this.detalleautoriconsepConstantesFunciones.activarid_unidadDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.setEnabled(isHabilitar && this.detalleautoriconsepConstantesFunciones.activarid_estado_detalle_autori_consepDetalleAutoriConsep);
	};
	
	public void setDefaultControlesDetalleAutoriConsep() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleAutoriConsep(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detalleautoriconsepSessionBean.setConGuardarRelaciones(true);			
			this.detalleautoriconsepSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jTabbedPaneRelacionesDetalleAutoriConsep.setVisible(true);
			
					
		} else {
			//this.detalleautoriconsepSessionBean.setConGuardarRelaciones(false);			
			this.detalleautoriconsepSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jTabbedPaneRelacionesDetalleAutoriConsep.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleAutoriConsep() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleAutoriConsep detalleautoriconsepAux:this.detalleautoriconsepLogic.getDetalleAutoriConseps()) {
				if(detalleautoriconsepAux.getId().equals(this.iIdNuevoDetalleAutoriConsep)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleAutoriConsep detalleautoriconsepAux:this.detalleautoriconseps) {
				if(detalleautoriconsepAux.getId().equals(this.iIdNuevoDetalleAutoriConsep)) {
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
	
	public int getIndiceActualDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleAutoriConsep detalleautoriconsepAux:this.detalleautoriconsepLogic.getDetalleAutoriConseps()) {
				if(detalleautoriconsepAux.getId().equals(detalleautoriconsep.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleAutoriConsep detalleautoriconsepAux:this.detalleautoriconseps) {
				if(detalleautoriconsepAux.getId().equals(detalleautoriconsep.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsepOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleAutoriConsep detalleautoriconsepAux:this.detalleautoriconsepLogic.getDetalleAutoriConseps()) {
				if(detalleautoriconsepAux.getDetalleAutoriConsepOriginal().getId().equals(detalleautoriconsepOriginal.getId())) {
					existe=true;
					detalleautoriconsepOriginal.setId(detalleautoriconsepAux.getId());
					detalleautoriconsepOriginal.setVersionRow(detalleautoriconsepAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleAutoriConsep detalleautoriconsepAux:this.detalleautoriconseps) {
				if(detalleautoriconsepAux.getDetalleAutoriConsepOriginal().getId().equals(detalleautoriconsepOriginal.getId())) {
					existe=true;
					detalleautoriconsepOriginal.setId(detalleautoriconsepAux.getId());
					detalleautoriconsepOriginal.setVersionRow(detalleautoriconsepAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleAutoriConsep(Boolean esParaCancelar) throws Exception {
		detalleautoriconsepsAux=new ArrayList<DetalleAutoriConsep>();
		detalleautoriconsepAux=new DetalleAutoriConsep();
		
		if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleAutoriConsep detalleautoriconsepAux:this.detalleautoriconsepLogic.getDetalleAutoriConseps()) {
					if(detalleautoriconsepAux.getId()<0) {
						detalleautoriconsepsAux.add(detalleautoriconsepAux);
					}		
				}
				this.iIdNuevoDetalleAutoriConsep=0L;
				this.detalleautoriconsepLogic.getDetalleAutoriConseps().removeAll(detalleautoriconsepsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleAutoriConsep detalleautoriconsepAux:this.detalleautoriconseps) {
					if(detalleautoriconsepAux.getId()<0) {
						detalleautoriconsepsAux.add(detalleautoriconsepAux);
					}		
				}
				this.iIdNuevoDetalleAutoriConsep=0L;
				this.detalleautoriconseps.removeAll(detalleautoriconsepsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleAutoriConsep 
					&& this.detalleautoriconsepLogic.getDetalleAutoriConseps().size()>0
					) {
					detalleautoriconsepAux=this.detalleautoriconsepLogic.getDetalleAutoriConseps().get(this.detalleautoriconsepLogic.getDetalleAutoriConseps().size() - 1);
				
					if(detalleautoriconsepAux.getId()<0) {
						this.detalleautoriconsepLogic.getDetalleAutoriConseps().remove(detalleautoriconsepAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleAutoriConsep && this.detalleautoriconseps.size()>0) {
					detalleautoriconsepAux=this.detalleautoriconseps.get(this.detalleautoriconseps.size() - 1);
				
					if(detalleautoriconsepAux.getId()<0) {
						this.detalleautoriconseps.remove(detalleautoriconsepAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleAutoriConsep(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detalleautoriconsep.getId()<0) {
				this.detalleautoriconsepLogic.getDetalleAutoriConseps().remove(this.detalleautoriconsep);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detalleautoriconsep.getId()<0) {
				this.detalleautoriconseps.remove(this.detalleautoriconsep);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleAutoriConsep(List<DetalleAutoriConsep> detalleautoriconsepsAux) throws Exception {
		DetalleAutoriConsepConstantesFunciones.setEstadosInicialesDetalleAutoriConsep(detalleautoriconsepsAux);
	}
	
	public void setEstadosInicialesDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsepAux) throws Exception {
		DetalleAutoriConsepConstantesFunciones.setEstadosInicialesDetalleAutoriConsep(detalleautoriconsepAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleAutoriConsepActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleAutoriConsepActual()) {
				if(!this.isEsNuevoDetalleAutoriConsep) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleAutoriConsep=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleAutoriConsepActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Autorizacion Consep ?", "MANTENIMIENTO DE Detalle Autorizacion Consep", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleAutoriConsep detalleautoriconsep) throws Exception {
		DetalleAutoriConsepConstantesFunciones.seleccionarAsignar(this.detalleautoriconsep,detalleautoriconsep);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleAutoriConsep=this.isPermisoActualizarOriginalDetalleAutoriConsep;
			
			
			this.seleccionarAsignar(detalleautoriconsep);
			
			

			idProductoActual=detalleautoriconsep.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleAutoriConsepConstantesFunciones.quitarEspaciosDetalleAutoriConsep(this.detalleautoriconsep,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleAutoriConsep("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detalleautoriconsepSessionBean.setsFuncionBusquedaRapida(this.detalleautoriconsepSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarProductoActual() throws Exception {
		try	{
			Producto productoAux=new Producto();

			if(this.idProductoActual != null && this.idProductoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(this.idProductoActual);
					productoAux= productoLogic.getProducto();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				productosForeignKey=new ArrayList<Producto>();
				productosForeignKey.add(productoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetalleAutoriConsep) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleAutoriConsep(esParaCancelar);				
				this.cancelarNuevoDetalleAutoriConsep(esParaCancelar);								
			}
			
			this.detalleautoriconsep=new DetalleAutoriConsep();
			
			this.inicializarDetalleAutoriConsep();
			
			this.actualizarEstadoCeldasBotonesDetalleAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleAutoriConsep() throws Exception {
		try {
			DetalleAutoriConsepConstantesFunciones.inicializarDetalleAutoriConsep(this.detalleautoriconsep);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detalleautoriconsepLogic.getDetalleAutoriConseps().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleAutoriConseps(String sAccionBusqueda,List<DetalleAutoriConsep> detalleautoriconsepsParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleAutoriConsep"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleAutoriConsepMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleAutoriConsepMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleAutoriConsep"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Autorizacion Consepes");		
		parameters.put("busquedapor", DetalleAutoriConsepConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleAutoriConsep=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleAutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleAutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleAutoriConsep=new JRBeanArrayDataSource(DetalleAutoriConsepJInternalFrame.TraerDetalleAutoriConsepBeans(detalleautoriconsepsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleAutoriConsep);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleAutoriConsepConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleAutoriConsepConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleAutoriConsepBean.TraerDetalleAutoriConsepBeans(detalleautoriconsepsParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,detalleautoriconsepsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,detalleautoriconsepsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleAutoriConsepActionPerformed(null);
					//this.generarExcelReporteDetalleAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,detalleautoriconsepsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,detalleautoriconsepsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,detalleautoriconsepsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,detalleautoriconsepsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleAutoriConseps(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleAutoriConsep> detalleautoriconsepsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleautoriconsep";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleAutoriConseps");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleAutoriConsep("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleAutoriConsep detalleautoriconsep : detalleautoriconsepsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleAutoriConsepConstantesFunciones.generarExcelReporteDataDetalleAutoriConsep("NORMAL",row,workbook,detalleautoriconsep,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleAutoriConsep(String sTipo,Row row,Workbook workbook) {
		
		DetalleAutoriConsepConstantesFunciones.generarExcelReporteHeaderDetalleAutoriConsep(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleAutoriConseps(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleAutoriConsep> detalleautoriconsepsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleautoriconsep_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleAutoriConseps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleAutoriConsep detalleautoriconsep : detalleautoriconsepsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleAutoriConsepConstantesFunciones.getDetalleAutoriConsepDescripcion(detalleautoriconsep));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleautoriconsep.getautoriconsep_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleautoriconsep.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleautoriconsep.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleautoriconsep.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleautoriconsep.getcantidad_anio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleautoriconsep.getcantidad_saldo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleautoriconsep.getestadodetalleautoriconsep_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleautoriconsep.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleAutoriConseps(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleAutoriConsep> detalleautoriconsepsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleAutoriConsep> detalleautoriconsepsRespaldo=null;
		
		classes=DetalleAutoriConsepConstantesFunciones.getClassesRelationshipsOfDetalleAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detalleautoriconsepLogic.setDatosCliente(this.datosCliente);
		this.detalleautoriconsepLogic.setDatosDeep(this.datosDeep);
		this.detalleautoriconsepLogic.setIsConDeep(true);
		
		detalleautoriconsepsRespaldo=this.detalleautoriconsepLogic.getDetalleAutoriConseps();
		
		this.detalleautoriconsepLogic.setDetalleAutoriConseps(detalleautoriconsepsParaReportes);	
		this.detalleautoriconsepLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detalleautoriconsepsParaReportes=this.detalleautoriconsepLogic.getDetalleAutoriConseps();
		this.detalleautoriconsepLogic.setDetalleAutoriConseps(detalleautoriconsepsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleautoriconsep_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleAutoriConseps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleAutoriConsep("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleAutoriConsep detalleautoriconsep : detalleautoriconsepsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleAutoriConsep("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleAutoriConsepConstantesFunciones.generarExcelReporteDataDetalleAutoriConsep("NORMAL",row,workbook,detalleautoriconsep,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleAutoriConsepConstantesFunciones.getDetalleAutoriConsepDescripcion(detalleautoriconsep));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleAutoriConsep() throws Exception {		
		this.startProcessDetalleAutoriConsep(true);
	}
	
	public void startProcessDetalleAutoriConsep(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleAutoriConsep ,this.jPanelParametrosReportesDetalleAutoriConsep, this.jScrollPanelDatosDetalleAutoriConsep,this.jPanelPaginacionDetalleAutoriConsep, this.jScrollPanelDatosEdicionDetalleAutoriConsep, this.jPanelAccionesDetalleAutoriConsep,this.jPanelAccionesFormularioDetalleAutoriConsep,this.jmenuBarDetalleAutoriConsep,this.jmenuBarDetalleDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,this.jTtoolBarDetalleDetalleAutoriConsep);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleAutoriConsep=this.jTabbedPaneBusquedasDetalleAutoriConsep; 
		
		final JPanel jPanelParametrosReportesDetalleAutoriConsep=this.jPanelParametrosReportesDetalleAutoriConsep;
		//final JScrollPane jScrollPanelDatosDetalleAutoriConsep=this.jScrollPanelDatosDetalleAutoriConsep;
		final JTable jTableDatosDetalleAutoriConsep=this.jTableDatosDetalleAutoriConsep;		
		final JPanel jPanelPaginacionDetalleAutoriConsep=this.jPanelPaginacionDetalleAutoriConsep;
		//final JScrollPane jScrollPanelDatosEdicionDetalleAutoriConsep=this.jScrollPanelDatosEdicionDetalleAutoriConsep;
		final JPanel jPanelAccionesDetalleAutoriConsep=this.jPanelAccionesDetalleAutoriConsep;
		
		JPanel jPanelCamposAuxiliarDetalleAutoriConsep=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleAutoriConsep=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
			jPanelCamposAuxiliarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jPanelCamposDetalleAutoriConsep;
			jPanelAccionesFormularioAuxiliarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jPanelAccionesFormularioDetalleAutoriConsep;
		}
		
		final JPanel jPanelCamposDetalleAutoriConsep=jPanelCamposAuxiliarDetalleAutoriConsep;
		final JPanel jPanelAccionesFormularioDetalleAutoriConsep=jPanelAccionesFormularioAuxiliarDetalleAutoriConsep;
		
		
		final JMenuBar jmenuBarDetalleAutoriConsep=this.jmenuBarDetalleAutoriConsep;
		final JToolBar jTtoolBarDetalleAutoriConsep=this.jTtoolBarDetalleAutoriConsep;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleAutoriConsep=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleAutoriConsep=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
			jmenuBarDetalleAuxiliarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jmenuBarDetalleDetalleAutoriConsep;
			jTtoolBarDetalleAuxiliarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jTtoolBarDetalleDetalleAutoriConsep;
		}
		
		final JMenuBar jmenuBarDetalleDetalleAutoriConsep=jmenuBarDetalleAuxiliarDetalleAutoriConsep;
		final JToolBar jTtoolBarDetalleDetalleAutoriConsep=jTtoolBarDetalleAuxiliarDetalleAutoriConsep;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleAutoriConsep;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleAutoriConsep;
			processRunnable.jTableDatos=jTableDatosDetalleAutoriConsep;
			processRunnable.jPanelCampos=jPanelCamposDetalleAutoriConsep;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleAutoriConsep;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleAutoriConsep;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleAutoriConsep;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleAutoriConsep;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleAutoriConsep;
			processRunnable.jTtoolBar=jTtoolBarDetalleAutoriConsep;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleAutoriConsep;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleAutoriConsep ,jPanelParametrosReportesDetalleAutoriConsep,jTableDatosDetalleAutoriConsep, /*jScrollPanelDatosDetalleAutoriConsep,*/jPanelCamposDetalleAutoriConsep,jPanelPaginacionDetalleAutoriConsep, /*jScrollPanelDatosEdicionDetalleAutoriConsep,*/ jPanelAccionesDetalleAutoriConsep,jPanelAccionesFormularioDetalleAutoriConsep,jmenuBarDetalleAutoriConsep,jmenuBarDetalleDetalleAutoriConsep,jTtoolBarDetalleAutoriConsep,jTtoolBarDetalleDetalleAutoriConsep);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleAutoriConsep ,jPanelParametrosReportesDetalleAutoriConsep, jScrollPanelDatosDetalleAutoriConsep,jPanelPaginacionDetalleAutoriConsep, jScrollPanelDatosEdicionDetalleAutoriConsep, jPanelAccionesDetalleAutoriConsep,jPanelAccionesFormularioDetalleAutoriConsep,jmenuBarDetalleAutoriConsep,jmenuBarDetalleDetalleAutoriConsep,jTtoolBarDetalleAutoriConsep,jTtoolBarDetalleDetalleAutoriConsep);
						
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
	
	public void finishProcessDetalleAutoriConsep() {// throws Exception 
		this.finishProcessDetalleAutoriConsep(true);
	}
	
	public void finishProcessDetalleAutoriConsep(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleAutoriConsep ,this.jPanelParametrosReportesDetalleAutoriConsep, this.jScrollPanelDatosDetalleAutoriConsep,this.jPanelPaginacionDetalleAutoriConsep, this.jScrollPanelDatosEdicionDetalleAutoriConsep, this.jPanelAccionesDetalleAutoriConsep,this.jPanelAccionesFormularioDetalleAutoriConsep,this.jmenuBarDetalleAutoriConsep,this.jmenuBarDetalleDetalleAutoriConsep,this.jTtoolBarDetalleAutoriConsep,this.jTtoolBarDetalleDetalleAutoriConsep);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleAutoriConsep=this.jTabbedPaneBusquedasDetalleAutoriConsep; 
		
		final JPanel jPanelParametrosReportesDetalleAutoriConsep=this.jPanelParametrosReportesDetalleAutoriConsep;
		//final JScrollPane jScrollPanelDatosDetalleAutoriConsep=this.jScrollPanelDatosDetalleAutoriConsep;
		final JTable jTableDatosDetalleAutoriConsep=this.jTableDatosDetalleAutoriConsep;		
		final JPanel jPanelPaginacionDetalleAutoriConsep=this.jPanelPaginacionDetalleAutoriConsep;
		//final JScrollPane jScrollPanelDatosEdicionDetalleAutoriConsep=this.jScrollPanelDatosEdicionDetalleAutoriConsep;
		final JPanel jPanelAccionesDetalleAutoriConsep=this.jPanelAccionesDetalleAutoriConsep;
		
		JPanel jPanelCamposAuxiliarDetalleAutoriConsep=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleAutoriConsep=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
			jPanelCamposAuxiliarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jPanelCamposDetalleAutoriConsep;
			jPanelAccionesFormularioAuxiliarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jPanelAccionesFormularioDetalleAutoriConsep;
		}
		
		final JPanel jPanelCamposDetalleAutoriConsep=jPanelCamposAuxiliarDetalleAutoriConsep;
		final JPanel jPanelAccionesFormularioDetalleAutoriConsep=jPanelAccionesFormularioAuxiliarDetalleAutoriConsep;
		
		
		final JMenuBar jmenuBarDetalleAutoriConsep=this.jmenuBarDetalleAutoriConsep;		
		final JToolBar jTtoolBarDetalleAutoriConsep=this.jTtoolBarDetalleAutoriConsep;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleAutoriConsep=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleAutoriConsep=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
			jmenuBarDetalleAuxiliarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jmenuBarDetalleDetalleAutoriConsep;
			jTtoolBarDetalleAuxiliarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jTtoolBarDetalleDetalleAutoriConsep;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleAutoriConsep=jmenuBarDetalleAuxiliarDetalleAutoriConsep;
		final JToolBar jTtoolBarDetalleDetalleAutoriConsep=jTtoolBarDetalleAuxiliarDetalleAutoriConsep;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleAutoriConsep;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleAutoriConsep;
			processRunnable.jTableDatos=jTableDatosDetalleAutoriConsep;
			processRunnable.jPanelCampos=jPanelCamposDetalleAutoriConsep;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleAutoriConsep;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleAutoriConsep;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleAutoriConsep;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleAutoriConsep;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleAutoriConsep;
			processRunnable.jTtoolBar=jTtoolBarDetalleAutoriConsep;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleAutoriConsep;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleAutoriConsep ,jPanelParametrosReportesDetalleAutoriConsep, jTableDatosDetalleAutoriConsep,/*jScrollPanelDatosDetalleAutoriConsep,*/jPanelCamposDetalleAutoriConsep,jPanelPaginacionDetalleAutoriConsep, /*jScrollPanelDatosEdicionDetalleAutoriConsep,*/ jPanelAccionesDetalleAutoriConsep,jPanelAccionesFormularioDetalleAutoriConsep,jmenuBarDetalleAutoriConsep,jmenuBarDetalleDetalleAutoriConsep,jTtoolBarDetalleAutoriConsep,jTtoolBarDetalleDetalleAutoriConsep));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleAutoriConsep(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleAutoriConsep(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleAutoriConsep(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleAutoriConsep(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAutoriConsep,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleAutoriConsep,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleAutoriConsep(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAutoriConsep,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleAutoriConsep,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detalleautoriconsepConstantesFunciones.getsFinalQueryDetalleAutoriConsep();
		String  finalQueryPaginacionTodos=this.detalleautoriconsepConstantesFunciones.getsFinalQueryDetalleAutoriConsep();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleAutoriConsepConstantesFunciones.getArrayColumnasGlobalesNoDetalleAutoriConsep(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleAutoriConsepConstantesFunciones.getArrayColumnasGlobalesDetalleAutoriConsep(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleAutoriConsepConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detalleautoriconsepsEliminados= new ArrayList<DetalleAutoriConsep>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleAutoriConsep();
		
				///*DetalleAutoriConsepSessionBean*/this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
			
			if(this.detalleautoriconsepSessionBean==null) {
				this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
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
					this.iNumeroPaginacion=DetalleAutoriConsepConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleAutoriConsepConstantesFunciones.getClassesForeignKeysOfDetalleAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detalleautoriconsep."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detalleautoriconsepsAux= new ArrayList<DetalleAutoriConsep>();
			
				
			detalleautoriconsepLogic.setDatosCliente(this.datosCliente);
			detalleautoriconsepLogic.setDatosDeep(this.datosDeep);
			detalleautoriconsepLogic.setIsConDeep(true);
			
			
			detalleautoriconsepLogic.getDetalleAutoriConsepDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detalleautoriconsepLogic.getTodosDetalleAutoriConseps(finalQueryGlobal,pagination);
					
					//detalleautoriconsepLogic.getTodosDetalleAutoriConsepsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detalleautoriconsepLogic.getDetalleAutoriConseps()==null|| detalleautoriconsepLogic.getDetalleAutoriConseps().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleautoriconsepsAux= new ArrayList<DetalleAutoriConsep>();
							detalleautoriconsepsAux.addAll(detalleautoriconsepLogic.getDetalleAutoriConseps());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleautoriconsepsAux= new ArrayList<DetalleAutoriConsep>();
							detalleautoriconsepsAux.addAll(detalleautoriconseps);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleautoriconsepLogic.getTodosDetalleAutoriConseps(finalQueryGlobal+"",this.pagination);												
							
							//detalleautoriconsepLogic.getTodosDetalleAutoriConsepsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleAutoriConseps("Todos",detalleautoriconsepLogic.getDetalleAutoriConseps() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleautoriconsepLogic.setDetalleAutoriConseps(new ArrayList<DetalleAutoriConsep>());					
							detalleautoriconsepLogic.getDetalleAutoriConseps().addAll(detalleautoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleautoriconseps=new ArrayList<DetalleAutoriConsep>();
							detalleautoriconseps.addAll(detalleautoriconsepsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleAutoriConsep=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleAutoriConsep=this.idActual;
				
				} else if(this.idDetalleAutoriConsepActual!=null && this.idDetalleAutoriConsepActual!=0L) {
					idDetalleAutoriConsep=idDetalleAutoriConsepActual;
				}
				
					
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndicePorId(idDetalleAutoriConsep);
				
				this.detalleautoriconseps=new ArrayList<DetalleAutoriConsep>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detalleautoriconsepLogic.getEntity(idDetalleAutoriConsep);
					
					//detalleautoriconsepLogic.getEntityWithConnection(idDetalleAutoriConsep);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleautoriconsepLogic.setDetalleAutoriConseps(new ArrayList<DetalleAutoriConsep>());
					detalleautoriconsepLogic.getDetalleAutoriConseps().add(detalleautoriconsepLogic.getDetalleAutoriConsep());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleautoriconseps=new ArrayList<DetalleAutoriConsep>();
					this.detalleautoriconseps.add(detalleautoriconsep);
				}
				
				if(detalleautoriconsepLogic.getDetalleAutoriConsep()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAutoriConsep")) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdAutoriConsep(id_autori_consepFK_IdAutoriConsep);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdAutoriConsep(finalQueryGlobal,pagination,id_autori_consepFK_IdAutoriConsep);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdAutoriConsep(id_autori_consepFK_IdAutoriConsep);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdAutoriConsep(id_autori_consepFK_IdAutoriConsep);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleautoriconsepLogic.getDetalleAutoriConseps()==null||detalleautoriconsepLogic.getDetalleAutoriConseps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleautoriconseps==null|| detalleautoriconseps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepsAux=new ArrayList<DetalleAutoriConsep>();
						detalleautoriconsepsAux.addAll(detalleautoriconsepLogic.getDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleautoriconsepsAux=new ArrayList<DetalleAutoriConsep>();
							detalleautoriconsepsAux.addAll(detalleautoriconseps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdAutoriConsep(finalQueryGlobal,pagination,id_autori_consepFK_IdAutoriConsep);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdAutoriConsep(id_autori_consepFK_IdAutoriConsep);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdAutoriConsep(id_autori_consepFK_IdAutoriConsep);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleAutoriConseps("FK_IdAutoriConsep",detalleautoriconsepLogic.getDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleAutoriConseps("FK_IdAutoriConsep",detalleautoriconseps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepLogic.setDetalleAutoriConseps(new ArrayList<DetalleAutoriConsep>());
						detalleautoriconsepLogic.getDetalleAutoriConseps().addAll(detalleautoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleautoriconseps=new ArrayList<DetalleAutoriConsep>();
							detalleautoriconseps.addAll(detalleautoriconsepsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleautoriconsepLogic.getDetalleAutoriConseps()==null||detalleautoriconsepLogic.getDetalleAutoriConseps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleautoriconseps==null|| detalleautoriconseps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepsAux=new ArrayList<DetalleAutoriConsep>();
						detalleautoriconsepsAux.addAll(detalleautoriconsepLogic.getDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleautoriconsepsAux=new ArrayList<DetalleAutoriConsep>();
							detalleautoriconsepsAux.addAll(detalleautoriconseps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleAutoriConseps("FK_IdEmpresa",detalleautoriconsepLogic.getDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleAutoriConseps("FK_IdEmpresa",detalleautoriconseps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepLogic.setDetalleAutoriConseps(new ArrayList<DetalleAutoriConsep>());
						detalleautoriconsepLogic.getDetalleAutoriConseps().addAll(detalleautoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleautoriconseps=new ArrayList<DetalleAutoriConsep>();
							detalleautoriconseps.addAll(detalleautoriconsepsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoDetalleAutoriConsep")) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEstadoDetalleAutoriConsep(id_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdEstadoDetalleAutoriConsep(finalQueryGlobal,pagination,id_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEstadoDetalleAutoriConsep(id_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEstadoDetalleAutoriConsep(id_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleautoriconsepLogic.getDetalleAutoriConseps()==null||detalleautoriconsepLogic.getDetalleAutoriConseps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleautoriconseps==null|| detalleautoriconseps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepsAux=new ArrayList<DetalleAutoriConsep>();
						detalleautoriconsepsAux.addAll(detalleautoriconsepLogic.getDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleautoriconsepsAux=new ArrayList<DetalleAutoriConsep>();
							detalleautoriconsepsAux.addAll(detalleautoriconseps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdEstadoDetalleAutoriConsep(finalQueryGlobal,pagination,id_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEstadoDetalleAutoriConsep(id_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdEstadoDetalleAutoriConsep(id_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleAutoriConseps("FK_IdEstadoDetalleAutoriConsep",detalleautoriconsepLogic.getDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleAutoriConseps("FK_IdEstadoDetalleAutoriConsep",detalleautoriconseps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepLogic.setDetalleAutoriConseps(new ArrayList<DetalleAutoriConsep>());
						detalleautoriconsepLogic.getDetalleAutoriConseps().addAll(detalleautoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleautoriconseps=new ArrayList<DetalleAutoriConsep>();
							detalleautoriconseps.addAll(detalleautoriconsepsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleautoriconsepLogic.getDetalleAutoriConseps()==null||detalleautoriconsepLogic.getDetalleAutoriConseps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleautoriconseps==null|| detalleautoriconseps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepsAux=new ArrayList<DetalleAutoriConsep>();
						detalleautoriconsepsAux.addAll(detalleautoriconsepLogic.getDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleautoriconsepsAux=new ArrayList<DetalleAutoriConsep>();
							detalleautoriconsepsAux.addAll(detalleautoriconseps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleAutoriConseps("FK_IdProducto",detalleautoriconsepLogic.getDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleAutoriConseps("FK_IdProducto",detalleautoriconseps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepLogic.setDetalleAutoriConseps(new ArrayList<DetalleAutoriConsep>());
						detalleautoriconsepLogic.getDetalleAutoriConseps().addAll(detalleautoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleautoriconseps=new ArrayList<DetalleAutoriConsep>();
							detalleautoriconseps.addAll(detalleautoriconsepsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleautoriconsepLogic.getDetalleAutoriConseps()==null||detalleautoriconsepLogic.getDetalleAutoriConseps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleautoriconseps==null|| detalleautoriconseps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepsAux=new ArrayList<DetalleAutoriConsep>();
						detalleautoriconsepsAux.addAll(detalleautoriconsepLogic.getDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleautoriconsepsAux=new ArrayList<DetalleAutoriConsep>();
							detalleautoriconsepsAux.addAll(detalleautoriconseps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleAutoriConsepConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleAutoriConseps("FK_IdUnidad",detalleautoriconsepLogic.getDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleAutoriConseps("FK_IdUnidad",detalleautoriconseps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepLogic.setDetalleAutoriConseps(new ArrayList<DetalleAutoriConsep>());
						detalleautoriconsepLogic.getDetalleAutoriConseps().addAll(detalleautoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleautoriconseps=new ArrayList<DetalleAutoriConsep>();
							detalleautoriconseps.addAll(detalleautoriconsepsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleAutoriConsep();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleAutoriConsep();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleautoriconsepLogic.getDetalleAutoriConseps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleautoriconseps.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleautoriconsepLogic.getDetalleAutoriConseps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleautoriconseps.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleAutoriConsep detalleautoriconsep) {
		Boolean permite=true;
		
		if(this.detalleautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleAutoriConsepConstantesFunciones.getOrderByListaDetalleAutoriConsep();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleAutoriConsepConstantesFunciones.getOrderByListaDetalleAutoriConsep();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleAutoriConsep detalleautoriconsep:detalleautoriconsepLogic.getDetalleAutoriConseps()) {
				if(detalleautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					detalleautoriconsepTotales=detalleautoriconsep;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleAutoriConsep detalleautoriconsep:this.detalleautoriconseps) {
				if(detalleautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					detalleautoriconsepTotales=detalleautoriconsep;
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
			this.detalleautoriconsepAux=new DetalleAutoriConsep();
			this.detalleautoriconsepAux.setsType(Constantes2.S_TOTALES);
			this.detalleautoriconsepAux.setIsNew(false);
			this.detalleautoriconsepAux.setIsChanged(false);
			this.detalleautoriconsepAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleAutoriConsepConstantesFunciones.TotalizarValoresFilaDetalleAutoriConsep(this.detalleautoriconsepLogic.getDetalleAutoriConseps(),this.detalleautoriconsepAux);
				
				this.detalleautoriconsepLogic.getDetalleAutoriConseps().add(this.detalleautoriconsepAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleAutoriConsepConstantesFunciones.TotalizarValoresFilaDetalleAutoriConsep(this.detalleautoriconseps,this.detalleautoriconsepAux);
				
				this.detalleautoriconseps.add(this.detalleautoriconsepAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detalleautoriconsepTotales=new DetalleAutoriConsep();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleautoriconsepLogic.getDetalleAutoriConseps().remove(detalleautoriconsepTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleautoriconseps.remove(detalleautoriconsepTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detalleautoriconsepTotales=new DetalleAutoriConsep();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleAutoriConsep detalleautoriconsep:detalleautoriconsepLogic.getDetalleAutoriConseps()) {
				if(detalleautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					detalleautoriconsepTotales=detalleautoriconsep;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleAutoriConsepConstantesFunciones.TotalizarValoresFilaDetalleAutoriConsep(this.detalleautoriconsepLogic.getDetalleAutoriConseps(),detalleautoriconsepTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleAutoriConsep detalleautoriconsep:this.detalleautoriconseps) {
				if(detalleautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					detalleautoriconsepTotales=detalleautoriconsep;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleAutoriConsepConstantesFunciones.TotalizarValoresFilaDetalleAutoriConsep(this.detalleautoriconseps,detalleautoriconsepTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleAutoriConsepsFK_IdAutoriConsep()throws Exception {
		try {
			sAccionBusqueda="FK_IdAutoriConsep";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleAutoriConsepsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleAutoriConsepsFK_IdEstadoDetalleAutoriConsep()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoDetalleAutoriConsep";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleAutoriConsepsFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleAutoriConsepsFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleAutoriConsepsFK_IdAutoriConsep(String sFinalQuery,Long id_autori_consep)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdAutoriConsep(sFinalQuery,this.pagination,id_autori_consep);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleAutoriConsepsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleAutoriConsepsFK_IdEstadoDetalleAutoriConsep(String sFinalQuery,Long id_estado_detalle_autori_consep)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdEstadoDetalleAutoriConsep(sFinalQuery,this.pagination,id_estado_detalle_autori_consep);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleAutoriConsepsFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleAutoriConsepsFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleautoriconsepLogic.getDetalleAutoriConsepsFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosDetalleAutoriConsep() {
		this.isPermisoTodoDetalleAutoriConsep=false;
		this.isPermisoNuevoDetalleAutoriConsep=false;
		this.isPermisoActualizarDetalleAutoriConsep=false;
		this.isPermisoActualizarOriginalDetalleAutoriConsep=false;
		this.isPermisoEliminarDetalleAutoriConsep=false;
		this.isPermisoGuardarCambiosDetalleAutoriConsep=false;
		this.isPermisoConsultaDetalleAutoriConsep=false;
		this.isPermisoBusquedaDetalleAutoriConsep=false;
		this.isPermisoReporteDetalleAutoriConsep=false;		
		this.isPermisoOrdenDetalleAutoriConsep=false;		
		this.isPermisoPaginacionMedioDetalleAutoriConsep=false;		
		this.isPermisoPaginacionAltoDetalleAutoriConsep=false;
		this.isPermisoPaginacionTodoDetalleAutoriConsep=false;
		this.isPermisoCopiarDetalleAutoriConsep=false;		
		this.isPermisoVerFormDetalleAutoriConsep=false;		
		this.isPermisoDuplicarDetalleAutoriConsep=false;		
		this.isPermisoOrdenDetalleAutoriConsep=false;		
	}
	
	public void setPermisosUsuarioDetalleAutoriConsep(Boolean isPermiso) {
		this.isPermisoTodoDetalleAutoriConsep=isPermiso;
		this.isPermisoNuevoDetalleAutoriConsep=isPermiso;
		this.isPermisoActualizarDetalleAutoriConsep=isPermiso;
		this.isPermisoActualizarOriginalDetalleAutoriConsep=isPermiso;
		this.isPermisoEliminarDetalleAutoriConsep=isPermiso;
		this.isPermisoGuardarCambiosDetalleAutoriConsep=isPermiso;
		this.isPermisoConsultaDetalleAutoriConsep=isPermiso;
		this.isPermisoBusquedaDetalleAutoriConsep=isPermiso;
		this.isPermisoReporteDetalleAutoriConsep=isPermiso;
		this.isPermisoOrdenDetalleAutoriConsep=isPermiso;		
		this.isPermisoPaginacionMedioDetalleAutoriConsep=isPermiso;		
		this.isPermisoPaginacionAltoDetalleAutoriConsep=isPermiso;		
		this.isPermisoPaginacionTodoDetalleAutoriConsep=isPermiso;		
		this.isPermisoCopiarDetalleAutoriConsep=isPermiso;		
		this.isPermisoVerFormDetalleAutoriConsep=isPermiso;		
		this.isPermisoDuplicarDetalleAutoriConsep=isPermiso;
		this.isPermisoOrdenDetalleAutoriConsep=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleAutoriConsep(Boolean isPermiso) {
		//this.isPermisoTodoDetalleAutoriConsep=isPermiso;
		this.isPermisoNuevoDetalleAutoriConsep=isPermiso;
		this.isPermisoActualizarDetalleAutoriConsep=isPermiso;
		this.isPermisoActualizarOriginalDetalleAutoriConsep=isPermiso;
		this.isPermisoEliminarDetalleAutoriConsep=isPermiso;
		this.isPermisoGuardarCambiosDetalleAutoriConsep=isPermiso;
		//this.isPermisoConsultaDetalleAutoriConsep=isPermiso;
		//this.isPermisoBusquedaDetalleAutoriConsep=isPermiso;
		//this.isPermisoReporteDetalleAutoriConsep=isPermiso;
		//this.isPermisoOrdenDetalleAutoriConsep=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleAutoriConsep=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleAutoriConsep=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleAutoriConsep=isPermiso;		
		//this.isPermisoCopiarDetalleAutoriConsep=isPermiso;		
		//this.isPermisoDuplicarDetalleAutoriConsep=isPermiso;
		//this.isPermisoOrdenDetalleAutoriConsep=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleAutoriConsepClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleAutoriConsep(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleAutoriConsepClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleAutoriConsepClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleAutoriConsepClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleAutoriConsepClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleAutoriConsep() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleAutoriConsepConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleAutoriConsep=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleAutoriConsep=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleAutoriConsep=this.isPermisoActualizarDetalleAutoriConsep;
			this.isPermisoEliminarDetalleAutoriConsep=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleAutoriConsep=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleAutoriConsep=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleAutoriConsep=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleAutoriConsep=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleAutoriConsep=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleAutoriConsep=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleAutoriConsep=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleAutoriConsep=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleAutoriConsep=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleAutoriConsep=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleAutoriConsep=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleAutoriConsep=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleAutoriConsep=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleAutoriConsep.setToolTipText(this.jTableDatosDetalleAutoriConsep.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleAutoriConsep(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleAutoriConsep(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleAutoriConsep() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleAutoriConsepListas()throws Exception {
		try	{						
			
				this.autoriconsepsForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
				this.estadodetalleautoriconsepsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleAutoriConsepListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleAutoriConsepJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleAutoriConsepListas(false);
			} else {
			
				this.cargarCombosForeignKeyAutoriConsepListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoDetalleAutoriConsepListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyAutoriConsepListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.autoriconsepsForeignKey==null||this.autoriconsepsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AutoriConsepConstantesFunciones.getArrayColumnasGlobalesAutoriConsep(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AutoriConsepConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AutoriConsepConstantesFunciones.SFINALQUERY;

				this.cargarCombosAutoriConsepsForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyProductoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.productosForeignKey==null||this.productosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProductoConstantesFunciones.SFINALQUERY;

				this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyEstadoDetalleAutoriConsepListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadodetalleautoriconsepsForeignKey==null||this.estadodetalleautoriconsepsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoDetalleAutoriConsepConstantesFunciones.getArrayColumnasGlobalesEstadoDetalleAutoriConsep(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoDetalleAutoriConsepConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoDetalleAutoriConsepConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoDetalleAutoriConsepsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDetalleAutoriConsepListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleAutoriConsepParameterReturnGeneral detalleautoriconsepReturnGeneral=new DetalleAutoriConsepParameterReturnGeneral();
						
			


				String finalQueryGlobalAutoriConsep="";

				if(((this.autoriconsepsForeignKey==null||this.autoriconsepsForeignKey.size()<=0) && this.detalleautoriconsepConstantesFunciones.cargarid_autori_consepDetalleAutoriConsep)
					 || (this.esRecargarFks && this.detalleautoriconsepConstantesFunciones.cargarid_autori_consepDetalleAutoriConsep)) {

					if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionAutoriConsep()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AutoriConsepConstantesFunciones.getArrayColumnasGlobalesAutoriConsep(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAutoriConsep=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AutoriConsepConstantesFunciones.TABLENAME);

						finalQueryGlobalAutoriConsep=Funciones.GetFinalQueryAppend(finalQueryGlobalAutoriConsep, "");
						finalQueryGlobalAutoriConsep+=AutoriConsepConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAutoriConsepsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAutoriConsep=" WHERE " + ConstantesSql.ID + "="+detalleautoriconsepSessionBean.getlidAutoriConsepActual();
					}
				} else {
					finalQueryGlobalAutoriConsep="NONE";
				}


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detalleautoriconsepConstantesFunciones.cargarid_empresaDetalleAutoriConsep)
					 || (this.esRecargarFks && this.detalleautoriconsepConstantesFunciones.cargarid_empresaDetalleAutoriConsep)) {

					if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detalleautoriconsepSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.detalleautoriconsepConstantesFunciones.cargarid_productoDetalleAutoriConsep)
					 || (this.esRecargarFks && this.detalleautoriconsepConstantesFunciones.cargarid_productoDetalleAutoriConsep)) {

					if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+detalleautoriconsepSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.detalleautoriconsepConstantesFunciones.cargarid_unidadDetalleAutoriConsep)
					 || (this.esRecargarFks && this.detalleautoriconsepConstantesFunciones.cargarid_unidadDetalleAutoriConsep)) {

					if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+detalleautoriconsepSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}


				String finalQueryGlobalEstadoDetalleAutoriConsep="";

				if(((this.estadodetalleautoriconsepsForeignKey==null||this.estadodetalleautoriconsepsForeignKey.size()<=0) && this.detalleautoriconsepConstantesFunciones.cargarid_estado_detalle_autori_consepDetalleAutoriConsep)
					 || (this.esRecargarFks && this.detalleautoriconsepConstantesFunciones.cargarid_estado_detalle_autori_consepDetalleAutoriConsep)) {

					if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionEstadoDetalleAutoriConsep()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoDetalleAutoriConsepConstantesFunciones.getArrayColumnasGlobalesEstadoDetalleAutoriConsep(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoDetalleAutoriConsep=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoDetalleAutoriConsepConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoDetalleAutoriConsep=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoDetalleAutoriConsep, "");
						finalQueryGlobalEstadoDetalleAutoriConsep+=EstadoDetalleAutoriConsepConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoDetalleAutoriConsepsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoDetalleAutoriConsep=" WHERE " + ConstantesSql.ID + "="+detalleautoriconsepSessionBean.getlidEstadoDetalleAutoriConsepActual();
					}
				} else {
					finalQueryGlobalEstadoDetalleAutoriConsep="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detalleautoriconsepReturnGeneral=detalleautoriconsepLogic.cargarCombosLoteForeignKeyDetalleAutoriConsep(finalQueryGlobalAutoriConsep,finalQueryGlobalEmpresa,finalQueryGlobalProducto,finalQueryGlobalUnidad,finalQueryGlobalEstadoDetalleAutoriConsep);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalAutoriConsep.equals("NONE")) {
				this.autoriconsepsForeignKey=detalleautoriconsepReturnGeneral.getautoriconsepsForeignKey();
			}

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detalleautoriconsepReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=detalleautoriconsepReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=detalleautoriconsepReturnGeneral.getunidadsForeignKey();
			}

			if(!finalQueryGlobalEstadoDetalleAutoriConsep.equals("NONE")) {
				this.estadodetalleautoriconsepsForeignKey=detalleautoriconsepReturnGeneral.getestadodetalleautoriconsepsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleAutoriConsep()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyAutoriConsep();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyUnidad();
			this.addItemDefectoCombosForeignKeyEstadoDetalleAutoriConsep();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyAutoriConsep()throws Exception {
		try {
			if(this.detalleautoriconsepSessionBean==null) {
				this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
			}

			if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionAutoriConsep()) {
				AutoriConsep autoriconsep=new AutoriConsep();
				AutoriConsepConstantesFunciones.setAutoriConsepDescripcion(autoriconsep,Constantes.SMENSAJE_ESCOJA_OPCION);
				autoriconsep.setId(null);

				if(!AutoriConsepConstantesFunciones.ExisteEnLista(this.autoriconsepsForeignKey,autoriconsep,true)) {

					this.autoriconsepsForeignKey.add(0,autoriconsep);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				Producto producto=new Producto();
				ProductoConstantesFunciones.setProductoDescripcion(producto,Constantes.SMENSAJE_ESCOJA_OPCION);
				producto.setId(null);

				if(!ProductoConstantesFunciones.ExisteEnLista(this.productosForeignKey,producto,true)) {

					this.productosForeignKey.add(0,producto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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

	public void addItemDefectoCombosForeignKeyEstadoDetalleAutoriConsep()throws Exception {
		try {

			if(!this.detalleautoriconsepSessionBean.getisBusquedaDesdeForeignKeySesionEstadoDetalleAutoriConsep()) {
				EstadoDetalleAutoriConsep estadodetalleautoriconsep=new EstadoDetalleAutoriConsep();
				EstadoDetalleAutoriConsepConstantesFunciones.setEstadoDetalleAutoriConsepDescripcion(estadodetalleautoriconsep,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadodetalleautoriconsep.setId(null);

				if(!EstadoDetalleAutoriConsepConstantesFunciones.ExisteEnLista(this.estadodetalleautoriconsepsForeignKey,estadodetalleautoriconsep,true)) {

					this.estadodetalleautoriconsepsForeignKey.add(0,estadodetalleautoriconsep);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetalleAutoriConsep()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleAutoriConsep(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleAutoriConsep()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleAutoriConsep();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep)throws Exception {	
		try {
			
			this.setActualAutoriConsepForeignKey(detalleautoriconsep.getid_autori_consep(),false,"Formulario");
			this.setActualProductoForeignKey(detalleautoriconsep.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(detalleautoriconsep.getid_unidad(),false,"Formulario");
			this.setActualEstadoDetalleAutoriConsepForeignKey(detalleautoriconsep.getid_estado_detalle_autori_consep(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep,String sTipoEvento)throws Exception {	
		try {
			
			

				if(detalleautoriconsep.getProducto()!=null && !sTipoEvento.equals("id_productoDetalleAutoriConsep")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(detalleautoriconsep.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleAutoriConsep()throws Exception {	
		try {
			
			this.setActualAutoriConsepForeignKey(this.detalleautoriconsepConstantesFunciones.getid_autori_consep(),false,"Formulario");
			this.setActualProductoForeignKey(this.detalleautoriconsepConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(this.detalleautoriconsepConstantesFunciones.getid_unidad(),false,"Formulario");
			this.setActualEstadoDetalleAutoriConsepForeignKey(this.detalleautoriconsepConstantesFunciones.getid_estado_detalle_autori_consep(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleAutoriConsep()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleAutoriConsep()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleAutoriConsep()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleAutoriConsep()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleAutoriConsep()throws Exception {
		try {
			

			this.cargarCombosFrameAutoriConsepsForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");
			this.cargarCombosFrameEstadoDetalleAutoriConsepsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleAutoriConsep(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameAutoriConsepsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoDetalleAutoriConsepsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleAutoriConsep()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public DetalleAutoriConsepBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleAutoriConsepBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleAutoriConsepBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean(); 
		this.detalleautoriconsepConstantesFunciones=new DetalleAutoriConsepConstantesFunciones(); 
		this.detalleautoriconsepBean=new DetalleAutoriConsep();//(this.detalleautoriconsepConstantesFunciones); 		
		this.detalleautoriconsepReturnGeneral=new DetalleAutoriConsepParameterReturnGeneral(); 
		
		this.detalleautoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleautoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleAutoriConsepBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleAutoriConsepBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleAutoriConsepBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleAutoriConsep(true);
			
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
			
			this.detalleautoriconsepConstantesFunciones=new DetalleAutoriConsepConstantesFunciones(); 
			this.detalleautoriconsepBean=new DetalleAutoriConsep();//this.detalleautoriconsepConstantesFunciones); 			
			this.detalleautoriconsepReturnGeneral=new DetalleAutoriConsepParameterReturnGeneral(); 
		
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Autorizacion Consep Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detalleautoriconsep=new DetalleAutoriConsep();
			this.detalleautoriconseps = new ArrayList<DetalleAutoriConsep>();
			this.detalleautoriconsepsAux = new ArrayList<DetalleAutoriConsep>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic=new DetalleAutoriConsepLogic();
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			//this.detalleautoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detalleautoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleAutoriConsep);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleAutoriConsep);	
					}
					
					if(this.jInternalFrameImportacionDetalleAutoriConsep!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleAutoriConsep);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleAutoriConsep!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleAutoriConsep);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleAutoriConsep);
				this.jInternalFrameDetalleFormDetalleAutoriConsep.setVisible(false);
				this.jInternalFrameDetalleFormDetalleAutoriConsep.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleAutoriConsep);
					this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleAutoriConsep!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleAutoriConsep);
					this.jInternalFrameImportacionDetalleAutoriConsep.setVisible(false);
					this.jInternalFrameImportacionDetalleAutoriConsep.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleAutoriConsep!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleAutoriConsep);
					this.jInternalFrameOrderByDetalleAutoriConsep.setVisible(false);
					this.jInternalFrameOrderByDetalleAutoriConsep.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleAutoriConsepActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleAutoriConsepConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detalleautoriconsepReturnGeneral=new DetalleAutoriConsepParameterReturnGeneral();
			
			this.detalleautoriconsepParameterGeneral=new DetalleAutoriConsepParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detalleautoriconsepLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleAutoriConsepConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleautoriconsepSessionBean.getEsGuardarRelacionado(),this.detalleautoriconsepSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleAutoriConsepConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleautoriconsepSessionBean.getEsGuardarRelacionado(),this.detalleautoriconsepSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaDuplicarDetalleAutoriConsep=true;
			this.isVisibilidadCeldaCopiarDetalleAutoriConsep=true;
			this.isVisibilidadCeldaVerFormDetalleAutoriConsep=true;
			this.isVisibilidadCeldaOrdenDetalleAutoriConsep=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=false;
			this.isVisibilidadCeldaModificarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaActualizarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaEliminarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaCancelarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep=false;
			
			
			this.isVisibilidadFK_IdAutoriConsep=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoDetalleAutoriConsep=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleAutoriConsep();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleAutoriConsep(false);
			
			this.setPermisosUsuarioDetalleAutoriConsep();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado() 
				|| (this.detalleautoriconsepSessionBean.getEsGuardarRelacionado() && this.detalleautoriconsepSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleAutoriConsepClasesRelacionadas();
			}
			
			if(this.detalleautoriconsepSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleAutoriConsepClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleAutoriConsep();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleAutoriConsep();
			}
			
			if(!this.isPermisoBusquedaDetalleAutoriConsep) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleAutoriConsep.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleAutoriConsep,this.isPermisoPaginacionMedioDetalleAutoriConsep,this.isPermisoPaginacionTodoDetalleAutoriConsep);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleAutoriConsepConstantesFunciones.getTiposSeleccionarDetalleAutoriConsep());
				
				this.tiposColumnasSelect=DetalleAutoriConsepConstantesFunciones.getTiposSeleccionarDetalleAutoriConsep(true);
				
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
			//if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleAutoriConsep();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetalleAutoriConsep(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetalleAutoriConsep(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleAutoriConsep() ;
			
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
			
			this.autoriconsepLogic=new AutoriConsepLogic();
			this.empresaLogic=new EmpresaLogic();
			this.productoLogic=new ProductoLogic();
			this.unidadLogic=new UnidadLogic();
			this.estadodetalleautoriconsepLogic=new EstadoDetalleAutoriConsepLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detalleautoriconsepImplementable= (DetalleAutoriConsepImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleAutoriConsepConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detalleautoriconsepImplementableHome= (DetalleAutoriConsepImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleAutoriConsepConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detalleautoriconseps= new ArrayList<DetalleAutoriConsep>();
			this.detalleautoriconsepsEliminados= new ArrayList<DetalleAutoriConsep>();
						
			this.isEsNuevoDetalleAutoriConsep=false;
			this.esParaAccionDesdeFormularioDetalleAutoriConsep=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.autoriconsepsForeignKey=new ArrayList<AutoriConsep>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			this.estadodetalleautoriconsepsForeignKey=new ArrayList<EstadoDetalleAutoriConsep>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleAutoriConsep(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleAutoriConsep();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleAutoriConsepConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleAutoriConsep(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleAutoriConsep();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleAutoriConsep();
			}
			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleAutoriConsep.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleAutoriConsep.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleAutoriConsep.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleAutoriConsep(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleAutoriConsep: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleAutoriConsep() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleAutoriConsep")) {
				iIndex=this.jInternalFrameDetalleFormDetalleAutoriConsep.jTabbedPaneRelacionesDetalleAutoriConsep.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleAutoriConsep.jTabbedPaneRelacionesDetalleAutoriConsep.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleAutoriConsep();	
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
	
	public void cargarCombosForeignKeyDetalleAutoriConsep(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleAutoriConsep(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleAutoriConsep(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleAutoriConsepListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleAutoriConsep();
		
		this.cargarCombosFrameForeignKeyDetalleAutoriConsep();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleAutoriConsep();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleAutoriConsep();
		}
	}
	
	

	public void cargarCombosForeignKeyAutoriConsep(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAutoriConsepListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAutoriConsep();
				this.cargarCombosFrameAutoriConsepsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAutoriConsep(this.autoriconsepsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProducto(this.productosForeignKey);

		} catch(Exception e) {
			throw e;
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

	public void cargarCombosForeignKeyEstadoDetalleAutoriConsep(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoDetalleAutoriConsepListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoDetalleAutoriConsep();
				this.cargarCombosFrameEstadoDetalleAutoriConsepsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoDetalleAutoriConsep(this.estadodetalleautoriconsepsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetalleAutoriConsepActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detalleautoriconsepSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			
			
			if(jTableDatosDetalleAutoriConsep.getRowCount()>=1) {
				jTableDatosDetalleAutoriConsep.removeRowSelectionInterval(0, jTableDatosDetalleAutoriConsep.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleAutoriConsep=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleAutoriConsep(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleAutoriConsep(true);			
			//this.detalleautoriconsep=new DetalleAutoriConsep();
			//this.detalleautoriconsep.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleAutoriConsep(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleAutoriConsep() ;
			
			if(DetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleAutoriConsep(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detalleautoriconsep);	
			this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);				
			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			
			if(this.detalleautoriconsepSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleAutoriConsep: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleAutoriConsepActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados=new ArrayList<DetalleAutoriConsep>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleAutoriConsep.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleAutoriConsep.getSelectedRows().length;			
			}
			
			detalleautoriconsepsSeleccionados=this.getDetalleAutoriConsepsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleAutoriConsep--;			
				//DetalleAutoriConsep detalleautoriconsepAux= new DetalleAutoriConsep();			
				//detalleautoriconsepAux.setId(this.iIdNuevoDetalleAutoriConsep);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleAutoriConsep detalleautoriconsepOrigen=new DetalleAutoriConsep();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleAutoriConsep detalleautoriconsepOrigen : detalleautoriconsepsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detalleautoriconsepOrigen =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleautoriconsepOrigen =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleAutoriConsep();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detalleautoriconsep.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleAutoriConsep(detalleautoriconsepOrigen,this.detalleautoriconsep,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleautoriconsepLogic.getDetalleAutoriConseps().add(this.detalleautoriconsepAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleautoriconseps.add(this.detalleautoriconsepAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
				
				this.jTableDatosDetalleAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoDetalleAutoriConsep(), this.getIndiceNuevoDetalleAutoriConsep());
				
				int iLastRow =  this.jTableDatosDetalleAutoriConsep.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleAutoriConsep.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleAutoriConsep.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados=new ArrayList<DetalleAutoriConsep>();									
		
			DetalleAutoriConsep detalleautoriconsepOrigen=new DetalleAutoriConsep();
			DetalleAutoriConsep detalleautoriconsepDestino=new DetalleAutoriConsep();
				
			detalleautoriconsepsSeleccionados=this.getDetalleAutoriConsepsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleAutoriConsep.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detalleautoriconsepsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleAutoriConsep.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepOrigen =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleautoriconsepOrigen =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleautoriconsepDestino =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleautoriconsepDestino =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detalleautoriconsepOrigen =detalleautoriconsepsSeleccionados.get(0);
				detalleautoriconsepDestino =detalleautoriconsepsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleAutoriConsep(detalleautoriconsepOrigen,detalleautoriconsepDestino,true,false);
				
				detalleautoriconsepDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleautoriconsepDestino,detalleautoriconsepLogic.getDetalleAutoriConseps());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleautoriconsepDestino,detalleautoriconseps);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
				
				//this.jTableDatosDetalleAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoDetalleAutoriConsep(), this.getIndiceNuevoDetalleAutoriConsep());
				
				int iLastRow =  this.jTableDatosDetalleAutoriConsep.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleAutoriConsep.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleAutoriConsep.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleAutoriConsep.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleAutoriConsep.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleAutoriConsep.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleAutoriConsep.setVisible(!isVisible);
			this.jPanelPaginacionDetalleAutoriConsep.setVisible(!isVisible);
			this.jPanelAccionesDetalleAutoriConsep.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleAutoriConsep();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleAutoriConsep();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleAutoriConsep();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleAutoriConsep();
			
			this.abrirFrameOrderByDetalleAutoriConsep();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleAutoriConsep();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleAutoriConsep(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleAutoriConsep);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleAutoriConsep.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleAutoriConsep.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleAutoriConsep.setSize(this.jInternalFrameDetalleFormDetalleAutoriConsep.iWidthFormulario,this.jInternalFrameDetalleFormDetalleAutoriConsep.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleAutoriConsep.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleAutoriConsep.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleAutoriConsep.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleAutoriConsep.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleAutoriConsep.jContentPaneDetalleDetalleAutoriConsep.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleAutoriConsep.jTabbedPaneRelacionesDetalleAutoriConsep.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleAutoriConsep.jContentPaneDetalleDetalleAutoriConsep.getWidth(),DetalleAutoriConsepConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleAutoriConsep.jTabbedPaneRelacionesDetalleAutoriConsep.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleAutoriConsep.jContentPaneDetalleDetalleAutoriConsep.getWidth(),DetalleAutoriConsepConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleAutoriConsep.jTabbedPaneRelacionesDetalleAutoriConsep.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleAutoriConsep.jContentPaneDetalleDetalleAutoriConsep.getWidth(),DetalleAutoriConsepConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleAutoriConsep.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleAutoriConsep.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleAutoriConsep() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleAutoriConsep==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleAutoriConsep,false,this);
				} else {
					this.jInternalFrameOrderByDetalleAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleAutoriConsep,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleAutoriConsep);
				this.jInternalFrameOrderByDetalleAutoriConsep.setVisible(false);
				this.jInternalFrameOrderByDetalleAutoriConsep.setSelected(false);
				
				this.jInternalFrameOrderByDetalleAutoriConsep.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleAutoriConsep"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleAutoriConsep();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleAutoriConsep() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleAutoriConsep==null) {
				
				this.jInternalFrameImportacionDetalleAutoriConsep=new ImportacionJInternalFrame(DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleAutoriConsep);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleAutoriConsep);
				this.jInternalFrameImportacionDetalleAutoriConsep.setVisible(false);
				this.jInternalFrameImportacionDetalleAutoriConsep.setSelected(false);


				this.jInternalFrameImportacionDetalleAutoriConsep.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleAutoriConsep"));
				this.jInternalFrameImportacionDetalleAutoriConsep.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleAutoriConsep"));
				this.jInternalFrameImportacionDetalleAutoriConsep.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleAutoriConsep"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleAutoriConsep() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep==null) {
				this.jInternalFrameReporteDinamicoDetalleAutoriConsep=new ReporteDinamicoJInternalFrame(DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleAutoriConsep);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleAutoriConsep);
				this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleAutoriConsep"));
				this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleAutoriConsep"));
				this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleAutoriConsep"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleAutoriConsep();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleAutoriConsep() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleAutoriConsep);
			
	       	this.jInternalFrameDetalleFormDetalleAutoriConsep.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleAutoriConsep.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleAutoriConsep.dispose();
			//this.jInternalFrameDetalleFormDetalleAutoriConsep=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleAutoriConsep() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleAutoriConsep() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleAutoriConsep.setVisible(true);
	        this.jInternalFrameImportacionDetalleAutoriConsep.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleAutoriConsep() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleAutoriConsep.setVisible(true);
	        this.jInternalFrameOrderByDetalleAutoriConsep.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleAutoriConsep() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleAutoriConsep.setVisible(false);
	        this.jInternalFrameOrderByDetalleAutoriConsep.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleAutoriConsep() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleAutoriConsep() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleAutoriConsep.setVisible(false);
	        this.jInternalFrameImportacionDetalleAutoriConsep.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleAutoriConsep(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleAutoriConsep(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleAutoriConsep(true);
			//this.isEsNuevoDetalleAutoriConsep=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleAutoriConsep("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleAutoriConsep(false) ;
			
			if(detalleautoriconsepSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleAutoriConsep(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleAutoriConsep(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleAutoriConsepActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleAutoriConsep(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleAutoriConsep(true);
			//this.isEsNuevoDetalleAutoriConsep=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detalleautoriconsep.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleAutoriConsep("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleAutoriConsep(false) ;
			
			if(DetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleAutoriConsep(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleAutoriConsep(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.detalleautoriconsepConstantesFunciones.cargarid_productoDetalleAutoriConsep) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaAutoriConsep(List<AutoriConsep> autoriconsepsForeignKey)throws Exception{
		TableColumn tableColumnAutoriConsep=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP));
		TableCellEditor tableCellEditorAutoriConsep =tableColumnAutoriConsep.getCellEditor();

		AutoriConsepTableCell autoriconsepTableCellFk=(AutoriConsepTableCell)tableCellEditorAutoriConsep;

		if(autoriconsepTableCellFk!=null) {
			autoriconsepTableCellFk.setautoriconsepsForeignKey(autoriconsepsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleAutoriConsep.getSelectedRow();

		//if(intSelectedRow<=0) {
			//autoriconsepTableCellFk.setRowActual(intSelectedRow);
			//autoriconsepTableCellFk.setautoriconsepsForeignKeyActual(autoriconsepsForeignKey);
		//}


		if(autoriconsepTableCellFk!=null) {
			autoriconsepTableCellFk.RecargarAutoriConsepsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
		
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleAutoriConsep.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleAutoriConsep.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoDetalleAutoriConsep(List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsForeignKey)throws Exception{
		TableColumn tableColumnEstadoDetalleAutoriConsep=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP));
		TableCellEditor tableCellEditorEstadoDetalleAutoriConsep =tableColumnEstadoDetalleAutoriConsep.getCellEditor();

		EstadoDetalleAutoriConsepTableCell estadodetalleautoriconsepTableCellFk=(EstadoDetalleAutoriConsepTableCell)tableCellEditorEstadoDetalleAutoriConsep;

		if(estadodetalleautoriconsepTableCellFk!=null) {
			estadodetalleautoriconsepTableCellFk.setestadodetalleautoriconsepsForeignKey(estadodetalleautoriconsepsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleAutoriConsep.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadodetalleautoriconsepTableCellFk.setRowActual(intSelectedRow);
			//estadodetalleautoriconsepTableCellFk.setestadodetalleautoriconsepsForeignKeyActual(estadodetalleautoriconsepsForeignKey);
		//}


		if(estadodetalleautoriconsepTableCellFk!=null) {
			estadodetalleautoriconsepTableCellFk.RecargarEstadoDetalleAutoriConsepsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleAutoriConsep(false);
			
			//if(!this.isEsNuevoDetalleAutoriConsep) {								
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
				
			}
			
			if(this.permiteMantenimiento(this.detalleautoriconsep)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleAutoriConsep=true;
					this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
					this.isEsNuevoDetalleAutoriConsep=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleAutoriConsep=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleAutoriConsep=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleAutoriConsep(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleAutoriConsep(false);
				
				this.habilitarDeshabilitarControlesDetalleAutoriConsep(false);
			
												
				
				if(DetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleAutoriConsep();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleAutoriConsepActionPerformed(evt,detalleautoriconsepSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleAutoriConsep(this.detalleautoriconsep,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleAutoriConsep.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detalleautoriconsepSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detalleautoriconsep.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleAutoriConsep.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleAutoriConsep.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				this.detalleautoriconsep.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				this.detalleautoriconsep.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detalleautoriconsep)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleAutoriConsepModel) this.jTableDatosDetalleAutoriConsep.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleAutoriConsep=true;
				this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
				this.isEsNuevoDetalleAutoriConsep=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleAutoriConsep(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleAutoriConsep(false);
				
				this.habilitarDeshabilitarControlesDetalleAutoriConsep(false);
				
				
				
				if(DetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleAutoriConsep();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleAutoriConsep.getRowCount()>=1) {
				jTableDatosDetalleAutoriConsep.removeRowSelectionInterval(0, jTableDatosDetalleAutoriConsep.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleAutoriConsep(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleAutoriConsep(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleAutoriConsep(false) ;
			
			this.isEsNuevoDetalleAutoriConsep=false;
			
			if(DetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleAutoriConsep();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleAutoriConsep(false);
				
				//SI ES MANUAL
				if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleAutoriConsep();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleAutoriConsep--;			
			//DetalleAutoriConsep detalleautoriconsepAux= new DetalleAutoriConsep();			
			//detalleautoriconsepAux.setId(this.iIdNuevoDetalleAutoriConsep);
			
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleAutoriConsep();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
			
			this.detalleautoriconsep.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detalleautoriconsepLogic.getDetalleAutoriConseps().add(this.detalleautoriconsepAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detalleautoriconseps.add(this.detalleautoriconsepAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
			
			this.jTableDatosDetalleAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoDetalleAutoriConsep(), this.getIndiceNuevoDetalleAutoriConsep());
			
			int iLastRow =  this.jTableDatosDetalleAutoriConsep.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleAutoriConsep.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleAutoriConsep.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleAutoriConsep(false);
			
			//SI ES MANUAL
			if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleAutoriConsep();
			}
			
			//this.abrirFrameTreeDetalleAutoriConsep();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Autorizacion ConsepES ?", "MANTENIMIENTO DE Detalle Autorizacion Consep", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleAutoriConsep.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleAutoriConsep();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detalleautoriconsepReturnGeneral=detalleautoriconsepLogic.procesarImportacionDetalleAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detalleautoriconsepParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleAutoriConsepReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleAutoriConsep.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleAutoriConsep.setFileImportacion(this.jInternalFrameImportacionDetalleAutoriConsep.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleAutoriConsep.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleAutoriConsep.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleAutoriConsep.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleAutoriConsep.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados=new ArrayList<DetalleAutoriConsep>();		

		detalleautoriconsepsSeleccionados=this.getDetalleAutoriConsepsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleAutoriConsepBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleAutoriConsepBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleAutoriConseps("Todos",detalleautoriconsepsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_AutoriConsep_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_AutoriConsep_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_AutoriConsep_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_AutoriConsep_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadAnio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadAnio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadAnio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadAnio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadSaldo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadSaldo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadSaldo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadSaldo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoDetalleAutoriConsep_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoDetalleAutoriConsep_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoDetalleAutoriConsep_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoDetalleAutoriConsep_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP:
					sNombreCampoCategoria="id_autori_consep";
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO:
					sNombreCampoCategoria="cantidad_anio";
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO:
					sNombreCampoCategoria="cantidad_saldo";
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP:
					sNombreCampoCategoria="id_estado_detalle_autori_consep";
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP:
					sNombreCampoCategoriaValor="id_autori_consep";
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO:
					sNombreCampoCategoriaValor="cantidad_anio";
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO:
					sNombreCampoCategoriaValor="cantidad_saldo";
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP:
					sNombreCampoCategoriaValor="id_estado_detalle_autori_consep";
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Autorizacion Consep",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_autori_consep");
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_anio");
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_saldo");
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_detalle_autori_consep");
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados=new ArrayList<DetalleAutoriConsep>();		
		
		detalleautoriconsepsSeleccionados=this.getDetalleAutoriConsepsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleautoriconsep";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleAutoriConseps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP);
					iRow++;

					for(DetalleAutoriConsep detalleautoriconsep:detalleautoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleautoriconsep.getautoriconsep_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleAutoriConsep detalleautoriconsep:detalleautoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleautoriconsep.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(DetalleAutoriConsep detalleautoriconsep:detalleautoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleautoriconsep.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(DetalleAutoriConsep detalleautoriconsep:detalleautoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleautoriconsep.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO);
					iRow++;

					for(DetalleAutoriConsep detalleautoriconsep:detalleautoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleautoriconsep.getcantidad_anio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO);
					iRow++;

					for(DetalleAutoriConsep detalleautoriconsep:detalleautoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleautoriconsep.getcantidad_saldo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP);
					iRow++;

					for(DetalleAutoriConsep detalleautoriconsep:detalleautoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleautoriconsep.getestadodetalleautoriconsep_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(DetalleAutoriConsep detalleautoriconsep:detalleautoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleautoriconsep.getnombre());
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
			//	this.getFilaCabeceraExportarExcelDetalleAutoriConsep(row);				
			//	iRow++;
			//}				
			
			//for(DetalleAutoriConsep detalleautoriconsepAux:detalleautoriconsepsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleAutoriConsep(detalleautoriconsepAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
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
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleAutoriConsep(false);
			
			//SI ES MANUAL
			if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleAutoriConsep();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleAutoriConsep(false);
			
			//SI ES MANUAL
			if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleAutoriConsep();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleAutoriConsep(false);
			
			//SI ES MANUAL
			if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleAutoriConsep();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleAutoriConsep() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleAutoriConsep.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleAutoriConsep.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleAutoriConsep.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleAutoriConsep.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleAutoriConsep.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleAutoriConsep.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleAutoriConsep.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleAutoriConsep(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleAutoriConsep(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleAutoriConsep(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleAutoriConsep(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleAutoriConsep(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleAutoriConsep(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleAutoriConsep(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleAutoriConsep(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleAutoriConsep() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleAutoriConsep();
		
		this.inicializarActualizarBindingBotonesManualDetalleAutoriConsep(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleAutoriConsep();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleAutoriConsep() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleAutoriConsep(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleAutoriConsep(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleAutoriConsep.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleAutoriConsep.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleAutoriConsep.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleAutoriConsep.jCheckBoxPostAccionNuevoDetalleAutoriConsep.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleAutoriConsep.jCheckBoxPostAccionSinCerrarDetalleAutoriConsep.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleAutoriConsep.jCheckBoxPostAccionSinMensajeDetalleAutoriConsep.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleAutoriConsep.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleAutoriConsep.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleAutoriConsep.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
				this.jInternalFrameDetalleFormDetalleAutoriConsep.jCheckBoxPostAccionNuevoDetalleAutoriConsep.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleAutoriConsep.jCheckBoxPostAccionSinCerrarDetalleAutoriConsep.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleAutoriConsep.jCheckBoxPostAccionSinMensajeDetalleAutoriConsep.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleAutoriConsep.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleAutoriConsep.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleAutoriConsep.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleAutoriConsep.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleAutoriConsep.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleAutoriConsep.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleAutoriConsep.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleAutoriConsep.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleAutoriConsep.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleAutoriConsep(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleAutoriConsep(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleAutoriConsep() throws Exception {
		try	{
			if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleAutoriConsep();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleAutoriConsep() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleAutoriConsep() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleAutoriConsep.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleAutoriConsep.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleAutoriConsep.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleAutoriConsep.addItem(reporte);
			}
			
			
			if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleAutoriConsep.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleAutoriConsep.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleAutoriConsep.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleAutoriConsep.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleAutoriConsep.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleAutoriConsep.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleAutoriConsep();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleAutoriConsep() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep!=null) {
				this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep!=null) {
				this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetalleAutoriConsepConstantesFunciones.getTiposSeleccionarDetalleAutoriConsep(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetalleAutoriConsepConstantesFunciones.getTiposSeleccionarDetalleAutoriConsep(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetalleAutoriConsepConstantesFunciones.getTiposSeleccionarDetalleAutoriConsep(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleAutoriConsep()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.getSelectedItem()!=null){this.id_autori_consepFK_IdAutoriConsep=((AutoriConsep)this.jComboBoxid_autori_consepFK_IdAutoriConsepDetalleAutoriConsep.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.getSelectedItem()!=null){this.id_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep=((EstadoDetalleAutoriConsep)this.jComboBoxid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoDetalleAutoriConsep.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoDetalleAutoriConsep.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadDetalleAutoriConsep.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleAutoriConsep(Boolean esInicializar) throws Exception {				
		if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleAutoriConsep();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleAutoriConsep() throws Exception {
		this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleAutoriConsep() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleAutoriConsep.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleAutoriConsep.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleAutoriConsep.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleAutoriConsepPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleAutoriConsep.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleAutoriConsep.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleAutoriConsepPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleAutoriConsepOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsepOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleAutoriConsepPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleAutoriConsep.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleAutoriConsep.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleAutoriConsepPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleAutoriConsep.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleAutoriConsep(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detalleautoriconsepLogic.getDetalleAutoriConseps().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detalleautoriconseps.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleAutoriConsep.setModel(new DetalleAutoriConsepModel(this.detalleautoriconsepLogic.getDetalleAutoriConseps(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleAutoriConsep.setModel(new DetalleAutoriConsepModel(this.detalleautoriconseps,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleAutoriConsep!=null && this.jInternalFrameOrderByDetalleAutoriConsep.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleAutoriConsep();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleAutoriConsepPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO,detalleautoriconsepConstantesFunciones.resaltarSeleccionarDetalleAutoriConsep,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO,detalleautoriconsepConstantesFunciones.resaltarSeleccionarDetalleAutoriConsep,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,DetalleAutoriConsepConstantesFunciones.LABEL_ID));

		if(this.detalleautoriconsepConstantesFunciones.mostraridDetalleAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleAutoriConsepConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleautoriconsepConstantesFunciones.resaltaridDetalleAutoriConsep,this.detalleautoriconsepConstantesFunciones.activaridDetalleAutoriConsep,iSizeTabla,this,true,"idDetalleAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleautoriconsepConstantesFunciones.resaltaridDetalleAutoriConsep,this.detalleautoriconsepConstantesFunciones.activaridDetalleAutoriConsep,this,true,"idDetalleAutoriConsep","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP));

		if(this.detalleautoriconsepConstantesFunciones.mostrarid_autori_consepDetalleAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AutoriConsepTableCell(this.autoriconsepsForeignKey,this.detalleautoriconsepConstantesFunciones.resaltarid_autori_consepDetalleAutoriConsep,this,this.detalleautoriconsepConstantesFunciones.activarid_autori_consepDetalleAutoriConsep,iSizeTabla));
			tableColumn.setCellEditor(new AutoriConsepTableCell(this.autoriconsepsForeignKey,this.detalleautoriconsepConstantesFunciones.resaltarid_autori_consepDetalleAutoriConsep,this,this.detalleautoriconsepConstantesFunciones.activarid_autori_consepDetalleAutoriConsep,true,"id_autori_consepDetalleAutoriConsep","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleAutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detalleautoriconsepConstantesFunciones.mostrarid_empresaDetalleAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detalleautoriconsepConstantesFunciones.resaltarid_empresaDetalleAutoriConsep,this,this.detalleautoriconsepConstantesFunciones.activarid_empresaDetalleAutoriConsep,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detalleautoriconsepConstantesFunciones.resaltarid_empresaDetalleAutoriConsep,this,this.detalleautoriconsepConstantesFunciones.activarid_empresaDetalleAutoriConsep,false,"id_empresaDetalleAutoriConsep","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleAutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.detalleautoriconsepConstantesFunciones.mostrarid_productoDetalleAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.detalleautoriconsepConstantesFunciones.resaltarid_productoDetalleAutoriConsep,this,this.detalleautoriconsepConstantesFunciones.activarid_productoDetalleAutoriConsep,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.detalleautoriconsepConstantesFunciones.resaltarid_productoDetalleAutoriConsep,this,this.detalleautoriconsepConstantesFunciones.activarid_productoDetalleAutoriConsep,true,"id_productoDetalleAutoriConsep","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new DetalleAutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD));

		if(this.detalleautoriconsepConstantesFunciones.mostrarid_unidadDetalleAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.detalleautoriconsepConstantesFunciones.resaltarid_unidadDetalleAutoriConsep,this,this.detalleautoriconsepConstantesFunciones.activarid_unidadDetalleAutoriConsep,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.detalleautoriconsepConstantesFunciones.resaltarid_unidadDetalleAutoriConsep,this,this.detalleautoriconsepConstantesFunciones.activarid_unidadDetalleAutoriConsep,true,"id_unidadDetalleAutoriConsep","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleAutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO));

		if(this.detalleautoriconsepConstantesFunciones.mostrarcantidad_anioDetalleAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleautoriconsepConstantesFunciones.resaltarcantidad_anioDetalleAutoriConsep,this.detalleautoriconsepConstantesFunciones.activarcantidad_anioDetalleAutoriConsep,iSizeTabla,this,true,"cantidad_anioDetalleAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleautoriconsepConstantesFunciones.resaltarcantidad_anioDetalleAutoriConsep,this.detalleautoriconsepConstantesFunciones.activarcantidad_anioDetalleAutoriConsep,this,true,"cantidad_anioDetalleAutoriConsep","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleAutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO));

		if(this.detalleautoriconsepConstantesFunciones.mostrarcantidad_saldoDetalleAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleautoriconsepConstantesFunciones.resaltarcantidad_saldoDetalleAutoriConsep,this.detalleautoriconsepConstantesFunciones.activarcantidad_saldoDetalleAutoriConsep,iSizeTabla,this,true,"cantidad_saldoDetalleAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleautoriconsepConstantesFunciones.resaltarcantidad_saldoDetalleAutoriConsep,this.detalleautoriconsepConstantesFunciones.activarcantidad_saldoDetalleAutoriConsep,this,true,"cantidad_saldoDetalleAutoriConsep","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleAutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP));

		if(this.detalleautoriconsepConstantesFunciones.mostrarid_estado_detalle_autori_consepDetalleAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoDetalleAutoriConsepTableCell(this.estadodetalleautoriconsepsForeignKey,this.detalleautoriconsepConstantesFunciones.resaltarid_estado_detalle_autori_consepDetalleAutoriConsep,this,this.detalleautoriconsepConstantesFunciones.activarid_estado_detalle_autori_consepDetalleAutoriConsep,iSizeTabla));
			tableColumn.setCellEditor(new EstadoDetalleAutoriConsepTableCell(this.estadodetalleautoriconsepsForeignKey,this.detalleautoriconsepConstantesFunciones.resaltarid_estado_detalle_autori_consepDetalleAutoriConsep,this,this.detalleautoriconsepConstantesFunciones.activarid_estado_detalle_autori_consepDetalleAutoriConsep,true,"id_estado_detalle_autori_consepDetalleAutoriConsep","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleAutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleautoriconsepSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleautoriconsepSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleAutoriConsep.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleautoriconsepSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleautoriconsepSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleAutoriConsep.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleAutoriConsep && this.isPermisoGuardarCambiosDetalleAutoriConsep) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detalleautoriconsepSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detalleautoriconsepSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleAutoriConsep.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleAutoriConsep.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleAutoriConsep && this.isPermisoGuardarCambiosDetalleAutoriConsep) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleAutoriConsep && this.isPermisoGuardarCambiosDetalleAutoriConsep) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleAutoriConsep.moveColumn(this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleAutoriConsep.moveColumn(this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleAutoriConsep.moveColumn(this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleAutoriConsep.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleAutoriConsep.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleAutoriConsep,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleAutoriConsep.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleAutoriConsep.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleAutoriConsep.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detalleautoriconsepLogic.getDetalleAutoriConseps().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detalleautoriconseps.size()-1;
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
		//this.jTableDatosDetalleAutoriConsep.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleAutoriConsep();
			
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
				
				//this.isEsNuevoDetalleAutoriConsep=false;
					
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			
				if(this.detalleautoriconsepSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleAutoriConsep==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleAutoriConsep.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleAutoriConsep.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detalleautoriconsep.getsType().equals("DUPLICADO")
				   || this.detalleautoriconsep.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleAutoriConsep=true;
				
				} else {
					this.isEsNuevoDetalleAutoriConsep=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
					if(this.detalleautoriconsep.getId()>=0 && !this.detalleautoriconsep.getIsNew()) {						
						this.isEsNuevoDetalleAutoriConsep=false;
						
					} else {
						this.isEsNuevoDetalleAutoriConsep=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleAutoriConsep(esRelaciones);						
				
				this.seleccionarDetalleAutoriConsep(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detalleautoriconsep.getId()<0) {
					this.isEsNuevoDetalleAutoriConsep=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleAutoriConsep(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleAutoriConsep(evt,rowIndex);
				}	
				
				if(this.detalleautoriconsepSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleAutoriConsep: " + this.dDif); 
					}
				}								
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleAutoriConsep(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detalleautoriconsep)) {
					if(this.detalleautoriconsep.getId()>0) {
						this.detalleautoriconsep.setIsDeleted(true);
						
						this.detalleautoriconsepsEliminados.add(this.detalleautoriconsep);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleautoriconsepLogic.getDetalleAutoriConseps().remove(this.detalleautoriconsep);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleautoriconseps.remove(this.detalleautoriconsep);				
					}
					
					
					((DetalleAutoriConsepModel) this.jTableDatosDetalleAutoriConsep.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleAutoriConsep(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleAutoriConsep) {
			
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleAutoriConsep.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleAutoriConsep.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleAutoriConsep(this.detalleautoriconsep);
				}
				
				//ARCHITECTURE
				try {
					

					//AutoriConsep
					if(!this.detalleautoriconsepConstantesFunciones.cargarid_autori_consepDetalleAutoriConsep || this.detalleautoriconsepConstantesFunciones.event_dependid_autori_consepDetalleAutoriConsep) {
						//this.cargarCombosAutoriConsepsForeignKeyLista(" where id="+this.detalleautoriconsep.getid_autori_consep());
									//this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
						this.autoriconsepsForeignKey=new ArrayList<AutoriConsep>();

						if(detalleautoriconsep.getAutoriConsep()!=null) {
							this.autoriconsepsForeignKey.add(detalleautoriconsep.getAutoriConsep());
						}

						this.addItemDefectoCombosForeignKeyAutoriConsep();
						this.cargarCombosFrameAutoriConsepsForeignKey("Todos");
					}
					this.setActualAutoriConsepForeignKey(this.detalleautoriconsep.getid_autori_consep(),false,"Formulario");

					//Empresa
					if(!this.detalleautoriconsepConstantesFunciones.cargarid_empresaDetalleAutoriConsep || this.detalleautoriconsepConstantesFunciones.event_dependid_empresaDetalleAutoriConsep) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detalleautoriconsep.getid_empresa());
									//this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detalleautoriconsep.getEmpresa()!=null) {
							this.empresasForeignKey.add(detalleautoriconsep.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detalleautoriconsep.getid_empresa(),false,"Formulario");

					//Producto
					if(!this.detalleautoriconsepConstantesFunciones.cargarid_productoDetalleAutoriConsep || this.detalleautoriconsepConstantesFunciones.event_dependid_productoDetalleAutoriConsep) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.detalleautoriconsep.getid_producto());
									//this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(detalleautoriconsep.getProducto()!=null) {
							this.productosForeignKey.add(detalleautoriconsep.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.detalleautoriconsep.getid_producto(),false,"Formulario");

					//Unidad
					if(!this.detalleautoriconsepConstantesFunciones.cargarid_unidadDetalleAutoriConsep || this.detalleautoriconsepConstantesFunciones.event_dependid_unidadDetalleAutoriConsep) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.detalleautoriconsep.getid_unidad());
									//this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(detalleautoriconsep.getUnidad()!=null) {
							this.unidadsForeignKey.add(detalleautoriconsep.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.detalleautoriconsep.getid_unidad(),false,"Formulario");

					//EstadoDetalleAutoriConsep
					if(!this.detalleautoriconsepConstantesFunciones.cargarid_estado_detalle_autori_consepDetalleAutoriConsep || this.detalleautoriconsepConstantesFunciones.event_dependid_estado_detalle_autori_consepDetalleAutoriConsep) {
						//this.cargarCombosEstadoDetalleAutoriConsepsForeignKeyLista(" where id="+this.detalleautoriconsep.getid_estado_detalle_autori_consep());
									//this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
						this.estadodetalleautoriconsepsForeignKey=new ArrayList<EstadoDetalleAutoriConsep>();

						if(detalleautoriconsep.getEstadoDetalleAutoriConsep()!=null) {
							this.estadodetalleautoriconsepsForeignKey.add(detalleautoriconsep.getEstadoDetalleAutoriConsep());
						}

						this.addItemDefectoCombosForeignKeyEstadoDetalleAutoriConsep();
						this.cargarCombosFrameEstadoDetalleAutoriConsepsForeignKey("Todos");
					}
					this.setActualEstadoDetalleAutoriConsepForeignKey(this.detalleautoriconsep.getid_estado_detalle_autori_consep(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleAutoriConsep("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleAutoriConsep(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleAutoriConsep() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleAutoriConsep(detalleautoriconsep,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleAutoriConsep(detalleautoriconsep);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleAutoriConsep(detalleautoriconsep,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleAutoriConsep(detalleautoriconsep);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelidDetalleAutoriConsep.setText(detalleautoriconsep.getId().toString());
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_anioDetalleAutoriConsep.setText(detalleautoriconsep.getcantidad_anio().toString());
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_saldoDetalleAutoriConsep.setText(detalleautoriconsep.getcantidad_saldo().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleAutoriConsep detalleautoriconsepLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detalleautoriconsepLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleAutoriConsep detalleautoriconsepLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detalleautoriconsepLocal=this.detalleautoriconsep;
			} else {
				detalleautoriconsepLocal=this.detalleautoriconsepAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detalleautoriconsepLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleAutoriConsep(detalleautoriconsepLocal,true);
					
					if(detalleautoriconsepSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detalleautoriconsepLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detalleautoriconsepLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(detalleautoriconsep,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(detalleautoriconsep);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(detalleautoriconsep,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelidDetalleAutoriConsep.getText()==null || this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelidDetalleAutoriConsep.getText()=="" || this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelidDetalleAutoriConsep.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelidDetalleAutoriConsep.setText("0");
			}

			if(conColumnasBase) {detalleautoriconsep.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelidDetalleAutoriConsep.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleAutoriConsepConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelIdDetalleAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleautoriconsep.setcantidad_anio(Double.parseDouble(this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_anioDetalleAutoriConsep.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelcantidad_anioDetalleAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleautoriconsep.setcantidad_saldo(Double.parseDouble(this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_saldoDetalleAutoriConsep.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelcantidad_saldoDetalleAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsepBean,DetalleAutoriConsep detalleautoriconsep,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detalleautoriconsepBean.getid_autori_consep()!=null && !detalleautoriconsepBean.getid_autori_consep().equals(-1L))) {detalleautoriconsep.setid_autori_consep(detalleautoriconsepBean.getid_autori_consep());}
			if(conDefault || (!conDefault && detalleautoriconsepBean.getid_producto()!=null && !detalleautoriconsepBean.getid_producto().equals(-1L))) {detalleautoriconsep.setid_producto(detalleautoriconsepBean.getid_producto());}
			if(conDefault || (!conDefault && detalleautoriconsepBean.getid_unidad()!=null && !detalleautoriconsepBean.getid_unidad().equals(-1L))) {detalleautoriconsep.setid_unidad(detalleautoriconsepBean.getid_unidad());}
			if(conDefault || (!conDefault && detalleautoriconsepBean.getid_estado_detalle_autori_consep()!=null && !detalleautoriconsepBean.getid_estado_detalle_autori_consep().equals(-1L))) {detalleautoriconsep.setid_estado_detalle_autori_consep(detalleautoriconsepBean.getid_estado_detalle_autori_consep());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsepOrigen,DetalleAutoriConsep detalleautoriconsep,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleautoriconsepOrigen.getId()!=null && !detalleautoriconsepOrigen.getId().equals(0L))) {detalleautoriconsep.setId(detalleautoriconsepOrigen.getId());}}
			if(conDefault || (!conDefault && detalleautoriconsepOrigen.getid_autori_consep()!=null && !detalleautoriconsepOrigen.getid_autori_consep().equals(-1L))) {detalleautoriconsep.setid_autori_consep(detalleautoriconsepOrigen.getid_autori_consep());}
			if(conDefault || (!conDefault && detalleautoriconsepOrigen.getid_producto()!=null && !detalleautoriconsepOrigen.getid_producto().equals(-1L))) {detalleautoriconsep.setid_producto(detalleautoriconsepOrigen.getid_producto());}
			if(conDefault || (!conDefault && detalleautoriconsepOrigen.getid_unidad()!=null && !detalleautoriconsepOrigen.getid_unidad().equals(-1L))) {detalleautoriconsep.setid_unidad(detalleautoriconsepOrigen.getid_unidad());}
			if(conDefault || (!conDefault && detalleautoriconsepOrigen.getcantidad_anio()!=null && !detalleautoriconsepOrigen.getcantidad_anio().equals(0.0))) {detalleautoriconsep.setcantidad_anio(detalleautoriconsepOrigen.getcantidad_anio());}
			if(conDefault || (!conDefault && detalleautoriconsepOrigen.getcantidad_saldo()!=null && !detalleautoriconsepOrigen.getcantidad_saldo().equals(0.0))) {detalleautoriconsep.setcantidad_saldo(detalleautoriconsepOrigen.getcantidad_saldo());}
			if(conDefault || (!conDefault && detalleautoriconsepOrigen.getid_estado_detalle_autori_consep()!=null && !detalleautoriconsepOrigen.getid_estado_detalle_autori_consep().equals(-1L))) {detalleautoriconsep.setid_estado_detalle_autori_consep(detalleautoriconsepOrigen.getid_estado_detalle_autori_consep());}
			if(conDefault || (!conDefault && detalleautoriconsepOrigen.getnombre()!=null && !detalleautoriconsepOrigen.getnombre().equals(""))) {detalleautoriconsep.setnombre(detalleautoriconsepOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelidDetalleAutoriConsep.setText(detalleautoriconsep.getId().toString());
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_anioDetalleAutoriConsep.setText(detalleautoriconsep.getcantidad_anio().toString());
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_saldoDetalleAutoriConsep.setText(detalleautoriconsep.getcantidad_saldo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleAutoriConsep(DetalleAutoriConsepBean detalleautoriconsepBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelidDetalleAutoriConsep.setText(detalleautoriconsepBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_anioDetalleAutoriConsep.setText(detalleautoriconsepBean.getcantidad_anio().toString());
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_saldoDetalleAutoriConsep.setText(detalleautoriconsepBean.getcantidad_saldo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleAutoriConsep(DetalleAutoriConsepParameterReturnGeneral detalleautoriconsepReturnGeneral,DetalleAutoriConsepBean detalleautoriconsepBean,Boolean conDefault) throws Exception { 
		try {
			DetalleAutoriConsep detalleautoriconsepLocal=new DetalleAutoriConsep();
			
			detalleautoriconsepLocal=detalleautoriconsepReturnGeneral.getDetalleAutoriConsep();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleautoriconsepLocal.getId()!=null && !detalleautoriconsepLocal.getId().equals(0L))) {detalleautoriconsepBean.setId(detalleautoriconsepLocal.getId());}}
			if(conDefault || (!conDefault && detalleautoriconsepLocal.getid_autori_consep()!=null && !detalleautoriconsepLocal.getid_autori_consep().equals(-1L))) {detalleautoriconsepBean.setid_autori_consep(detalleautoriconsepLocal.getid_autori_consep());}
			if(conDefault || (!conDefault && detalleautoriconsepLocal.getid_producto()!=null && !detalleautoriconsepLocal.getid_producto().equals(-1L))) {detalleautoriconsepBean.setid_producto(detalleautoriconsepLocal.getid_producto());}
			if(conDefault || (!conDefault && detalleautoriconsepLocal.getid_unidad()!=null && !detalleautoriconsepLocal.getid_unidad().equals(-1L))) {detalleautoriconsepBean.setid_unidad(detalleautoriconsepLocal.getid_unidad());}
			if(conDefault || (!conDefault && detalleautoriconsepLocal.getcantidad_anio()!=null && !detalleautoriconsepLocal.getcantidad_anio().equals(0.0))) {detalleautoriconsepBean.setcantidad_anio(detalleautoriconsepLocal.getcantidad_anio());}
			if(conDefault || (!conDefault && detalleautoriconsepLocal.getcantidad_saldo()!=null && !detalleautoriconsepLocal.getcantidad_saldo().equals(0.0))) {detalleautoriconsepBean.setcantidad_saldo(detalleautoriconsepLocal.getcantidad_saldo());}
			if(conDefault || (!conDefault && detalleautoriconsepLocal.getid_estado_detalle_autori_consep()!=null && !detalleautoriconsepLocal.getid_estado_detalle_autori_consep().equals(-1L))) {detalleautoriconsepBean.setid_estado_detalle_autori_consep(detalleautoriconsepLocal.getid_estado_detalle_autori_consep());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleAutoriConsepGenerico(Long idDetalleAutoriConsepSeleccionado,JComboBox jComboBoxDetalleAutoriConsep,List<DetalleAutoriConsep> detalleautoriconsepsLocal)throws Exception {
		try {
			DetalleAutoriConsep  detalleautoriconsepTemp=null;

			for(DetalleAutoriConsep detalleautoriconsepAux:detalleautoriconsepsLocal) {
				if(detalleautoriconsepAux.getId()!=null && detalleautoriconsepAux.getId().equals(idDetalleAutoriConsepSeleccionado)) {
					detalleautoriconsepTemp=detalleautoriconsepAux;
					break;
				}
			}

			jComboBoxDetalleAutoriConsep.setSelectedItem(detalleautoriconsepTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleAutoriConsepGenerico(JComboBox jComboBoxDetalleAutoriConsep,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleAutoriConsep.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleAutoriConsep.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleAutoriConsep.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleAutoriConsep.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleautoriconsep=(DetalleAutoriConsep) detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleautoriconsep =(DetalleAutoriConsep) detalleautoriconseps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("AutoriConsep")) {
			//sDescripcion=this.getActualAutoriConsepForeignKeyDescripcion((Long)value);
			if(!detalleautoriconsep.getIsNew() && !detalleautoriconsep.getIsChanged() && !detalleautoriconsep.getIsDeleted()) {
				sDescripcion=detalleautoriconsep.getautoriconsep_descripcion();
			} else {
				//sDescripcion=this.getActualAutoriConsepForeignKeyDescripcion((Long)value);
				sDescripcion=detalleautoriconsep.getautoriconsep_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detalleautoriconsep.getIsNew() && !detalleautoriconsep.getIsChanged() && !detalleautoriconsep.getIsDeleted()) {
				sDescripcion=detalleautoriconsep.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detalleautoriconsep.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!detalleautoriconsep.getIsNew() && !detalleautoriconsep.getIsChanged() && !detalleautoriconsep.getIsDeleted()) {
				sDescripcion=detalleautoriconsep.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=detalleautoriconsep.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!detalleautoriconsep.getIsNew() && !detalleautoriconsep.getIsChanged() && !detalleautoriconsep.getIsDeleted()) {
				sDescripcion=detalleautoriconsep.getunidad_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=detalleautoriconsep.getunidad_descripcion();
			}
		}

		if(sTipo.equals("EstadoDetalleAutoriConsep")) {
			//sDescripcion=this.getActualEstadoDetalleAutoriConsepForeignKeyDescripcion((Long)value);
			if(!detalleautoriconsep.getIsNew() && !detalleautoriconsep.getIsChanged() && !detalleautoriconsep.getIsDeleted()) {
				sDescripcion=detalleautoriconsep.getestadodetalleautoriconsep_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoDetalleAutoriConsepForeignKeyDescripcion((Long)value);
				sDescripcion=detalleautoriconsep.getestadodetalleautoriconsep_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleAutoriConsep detalleautoriconsepRow=new DetalleAutoriConsep();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleautoriconsepRow=(DetalleAutoriConsep) detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleautoriconsepRow=(DetalleAutoriConsep) detalleautoriconseps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleAutoriConsep(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoDetalleAutoriConsep && this.isPermisoNuevoDetalleAutoriConsep));			
			this.jButtonDuplicarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaDuplicarDetalleAutoriConsep && this.isPermisoDuplicarDetalleAutoriConsep));			
			this.jButtonCopiarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaCopiarDetalleAutoriConsep && this.isPermisoCopiarDetalleAutoriConsep));
			this.jButtonVerFormDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaVerFormDetalleAutoriConsep && this.isPermisoVerFormDetalleAutoriConsep));
			
			this.jButtonAbrirOrderByDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenDetalleAutoriConsep && this.isPermisoOrdenDetalleAutoriConsep));			
			
			this.jButtonNuevoRelacionesDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep && this.isPermisoNuevoDetalleAutoriConsep));			
			this.jButtonNuevoGuardarCambiosDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoDetalleAutoriConsep && this.isPermisoNuevoDetalleAutoriConsep && this.isPermisoGuardarCambiosDetalleAutoriConsep));
			
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonModificarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaModificarDetalleAutoriConsep && this.isPermisoActualizarDetalleAutoriConsep));	
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonActualizarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaActualizarDetalleAutoriConsep && this.isPermisoActualizarDetalleAutoriConsep));	
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonEliminarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaEliminarDetalleAutoriConsep && this.isPermisoEliminarDetalleAutoriConsep));
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonCancelarDetalleAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarDetalleAutoriConsep);							
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonGuardarCambiosDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarDetalleAutoriConsep && this.isPermisoGuardarCambiosDetalleAutoriConsep));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep && this.isPermisoGuardarCambiosDetalleAutoriConsep));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoDetalleAutoriConsep && this.isPermisoNuevoDetalleAutoriConsep));						
			this.jButtonDuplicarToolBarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaDuplicarDetalleAutoriConsep && this.isPermisoDuplicarDetalleAutoriConsep));						
			this.jButtonCopiarToolBarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaCopiarDetalleAutoriConsep && this.isPermisoCopiarDetalleAutoriConsep));			
			this.jButtonVerFormToolBarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaVerFormDetalleAutoriConsep && this.isPermisoVerFormDetalleAutoriConsep));			
			this.jButtonAbrirOrderByToolBarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenDetalleAutoriConsep && this.isPermisoOrdenDetalleAutoriConsep));
			this.jButtonNuevoRelacionesToolBarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep && this.isPermisoNuevoDetalleAutoriConsep));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoDetalleAutoriConsep && this.isPermisoNuevoDetalleAutoriConsep && this.isPermisoGuardarCambiosDetalleAutoriConsep));			
			
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonModificarToolBarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaModificarDetalleAutoriConsep && this.isPermisoActualizarDetalleAutoriConsep));	
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonActualizarToolBarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaActualizarDetalleAutoriConsep  && this.isPermisoActualizarDetalleAutoriConsep));	
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonEliminarToolBarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaEliminarDetalleAutoriConsep && this.isPermisoEliminarDetalleAutoriConsep));
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonCancelarToolBarDetalleAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarDetalleAutoriConsep);				
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonGuardarCambiosToolBarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarDetalleAutoriConsep && this.isPermisoGuardarCambiosDetalleAutoriConsep));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep && this.isPermisoGuardarCambiosDetalleAutoriConsep));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoDetalleAutoriConsep && this.isPermisoNuevoDetalleAutoriConsep));			
			this.jMenuItemDuplicarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaDuplicarDetalleAutoriConsep && this.isPermisoDuplicarDetalleAutoriConsep));			
			this.jMenuItemCopiarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaCopiarDetalleAutoriConsep && this.isPermisoCopiarDetalleAutoriConsep));			
			this.jMenuItemVerFormDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaVerFormDetalleAutoriConsep && this.isPermisoVerFormDetalleAutoriConsep));			
			this.jMenuItemAbrirOrderByDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenDetalleAutoriConsep && this.isPermisoOrdenDetalleAutoriConsep));			
			//this.jMenuItemMostrarOcultarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenDetalleAutoriConsep && this.isPermisoOrdenDetalleAutoriConsep));
			this.jMenuItemDetalleAbrirOrderByDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenDetalleAutoriConsep && this.isPermisoOrdenDetalleAutoriConsep));			
			//this.jMenuItemDetalleMostrarOcultarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenDetalleAutoriConsep && this.isPermisoOrdenDetalleAutoriConsep));			
			this.jMenuItemNuevoRelacionesDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep && this.isPermisoNuevoDetalleAutoriConsep));			
			this.jMenuItemNuevoGuardarCambiosDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoDetalleAutoriConsep && this.isPermisoNuevoDetalleAutoriConsep && this.isPermisoGuardarCambiosDetalleAutoriConsep));									
			
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemModificarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaModificarDetalleAutoriConsep && this.isPermisoActualizarDetalleAutoriConsep));	
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemActualizarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaActualizarDetalleAutoriConsep && this.isPermisoActualizarDetalleAutoriConsep));	
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemEliminarDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaEliminarDetalleAutoriConsep && this.isPermisoEliminarDetalleAutoriConsep));
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemCancelarDetalleAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarDetalleAutoriConsep);				
			}
			
			this.jMenuItemGuardarCambiosDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarDetalleAutoriConsep && this.isPermisoGuardarCambiosDetalleAutoriConsep));						
			this.jMenuItemGuardarCambiosTablaDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep && this.isPermisoGuardarCambiosDetalleAutoriConsep));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleAutoriConsep=this.jButtonNuevoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleAutoriConsep=this.jButtonDuplicarDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaCopiarDetalleAutoriConsep=this.jButtonCopiarDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaVerFormDetalleAutoriConsep=this.jButtonVerFormDetalleAutoriConsep.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleAutoriConsep=this.jButtonAbrirOrderByDetalleAutoriConsep.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=this.jButtonNuevoRelacionesDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaModificarDetalleAutoriConsep=this.jButtonModificarDetalleAutoriConsep.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
			this.isVisibilidadCeldaActualizarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonActualizarDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaEliminarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonEliminarDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaCancelarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonCancelarDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaGuardarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonGuardarCambiosDetalleAutoriConsep.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep=this.jButtonGuardarCambiosTablaDetalleAutoriConsep.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleAutoriConsep=this.jButtonNuevoToolBarDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=this.jButtonNuevoRelacionesToolBarDetalleAutoriConsep.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
			this.isVisibilidadCeldaModificarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonModificarToolBarDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaActualizarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonActualizarToolBarDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaEliminarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonEliminarToolBarDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaCancelarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonCancelarToolBarDetalleAutoriConsep.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleAutoriConsep=this.jButtonGuardarCambiosToolBarDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep=this.jButtonGuardarCambiosTablaToolBarDetalleAutoriConsep.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleAutoriConsep=this.jMenuItemNuevoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=this.jMenuItemNuevoRelacionesDetalleAutoriConsep.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
			this.isVisibilidadCeldaModificarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemModificarDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaActualizarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemActualizarDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaEliminarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemEliminarDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaCancelarDetalleAutoriConsep=this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemCancelarDetalleAutoriConsep.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleAutoriConsep=this.jMenuItemGuardarCambiosDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep=this.jMenuItemGuardarCambiosTablaDetalleAutoriConsep.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleAutoriConsep(Boolean esInicializar) {
		if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detalleautoriconsepSessionBean.getConGuardarRelaciones()) {
				//if(this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleAutoriConsep();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleAutoriConsep(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleAutoriConsep() {
		this.jButtonNuevoDetalleAutoriConsep.setVisible(this.isPermisoNuevoDetalleAutoriConsep);			
		this.jButtonDuplicarDetalleAutoriConsep.setVisible(this.isPermisoDuplicarDetalleAutoriConsep);			
		this.jButtonCopiarDetalleAutoriConsep.setVisible(this.isPermisoCopiarDetalleAutoriConsep);			
		this.jButtonVerFormDetalleAutoriConsep.setVisible(this.isPermisoVerFormDetalleAutoriConsep);			
		
		this.jButtonAbrirOrderByDetalleAutoriConsep.setVisible(this.isPermisoOrdenDetalleAutoriConsep);					
		
		this.jButtonNuevoRelacionesDetalleAutoriConsep.setVisible(this.isPermisoNuevoDetalleAutoriConsep);			
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonModificarDetalleAutoriConsep.setVisible(this.isPermisoActualizarDetalleAutoriConsep);	
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonActualizarDetalleAutoriConsep.setVisible(this.isPermisoActualizarDetalleAutoriConsep);	
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonEliminarDetalleAutoriConsep.setVisible(this.isPermisoEliminarDetalleAutoriConsep);
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonCancelarDetalleAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarDetalleAutoriConsep);						
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonGuardarCambiosDetalleAutoriConsep.setVisible(this.isPermisoGuardarCambiosDetalleAutoriConsep);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleAutoriConsep.setVisible(this.isPermisoActualizarDetalleAutoriConsep);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleAutoriConsep() {
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonModificarDetalleAutoriConsep.setVisible(this.isPermisoActualizarDetalleAutoriConsep);	
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonActualizarDetalleAutoriConsep.setVisible(this.isPermisoActualizarDetalleAutoriConsep);	
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonEliminarDetalleAutoriConsep.setVisible(this.isPermisoEliminarDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonCancelarDetalleAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarDetalleAutoriConsep);							
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonGuardarCambiosDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarDetalleAutoriConsep && this.isPermisoGuardarCambiosDetalleAutoriConsep));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleAutoriConsep() {
		if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleAutoriConsep();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleAutoriConsep() {
	}
	
	public void jTableDatosDetalleAutoriConsepListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleAutoriConsep(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.getdetalleautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleautoriconsep==null) {
						this.detalleautoriconsep = new DetalleAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
				}

				if(this.detalleautoriconsep.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detalleautoriconsep.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_autori_consepDetalleAutoriConsepUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoautoriconsep=true;

			idTienePermisoautoriconsep=this.tienePermisosUsuarioEnPaginaWebDetalleAutoriConsep(AutoriConsepConstantesFunciones.CLASSNAME);

			if(idTienePermisoautoriconsep) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleAutoriConsep.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleAutoriConsep.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.getdetalleautoriconsep(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);

				this.autoriconsepBeanSwingJInternalFrame=new AutoriConsepBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.autoriconsepBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.autoriconsepBeanSwingJInternalFrame.getAutoriConsepLogic().setConnexion(this.detalleautoriconsepLogic.getConnexion());

				if(this.detalleautoriconsep.getid_autori_consep()!=null) {
					this.autoriconsepBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.autoriconsepBeanSwingJInternalFrame.setIdActual(this.detalleautoriconsep.getid_autori_consep());
					this.autoriconsepBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.autoriconsepBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.autoriconsepBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriConsep();
				}

				JInternalFrameBase jinternalFrame =this.autoriconsepBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleAutoriConsep=(TitledBorder)this.jScrollPanelDatosDetalleAutoriConsep.getBorder();
				TitledBorder titledBorderautoriconsep=(TitledBorder)this.autoriconsepBeanSwingJInternalFrame.jScrollPanelDatosAutoriConsep.getBorder();

				titledBorderautoriconsep.setTitle(titledBorderDetalleAutoriConsep.getTitle() + " -> Autorizaciones Consep");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_autori_consepDetalleAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.getdetalleautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleautoriconsep==null) {
						this.detalleautoriconsep = new DetalleAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
				}

				if(this.detalleautoriconsep.getid_autori_consep()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_autori_consep = "+this.detalleautoriconsep.getid_autori_consep().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleAutoriConsepUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleAutoriConsep(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleAutoriConsep.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleAutoriConsep.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.getdetalleautoriconsep(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detalleautoriconsepLogic.getConnexion());

				if(this.detalleautoriconsep.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detalleautoriconsep.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleAutoriConsep=(TitledBorder)this.jScrollPanelDatosDetalleAutoriConsep.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleAutoriConsep.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.getdetalleautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleautoriconsep==null) {
						this.detalleautoriconsep = new DetalleAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
				}

				if(this.detalleautoriconsep.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detalleautoriconsep.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoDetalleAutoriConsepActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.productoBeanSwingJInternalFrame.sTipoBusqueda="Producto";

			if(!this.sFinalQueryGeneral_producto.equals("")) {
				this.productoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_producto);
				this.productoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.productoBeanSwingJInternalFrame.procesarBusqueda(this.productoBeanSwingJInternalFrame.sAccionBusqueda);
				this.productoBeanSwingJInternalFrame.inicializarActualizarBindingProducto(false);
			}

			if(!this.sFinalQueryComboProducto.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderDetalleAutoriConsep=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosDetalleAutoriConsep.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetalleAutoriConsep=(TitledBorder)this.jScrollPanelDatosDetalleAutoriConsep.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDetalleAutoriConsep.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoDetalleAutoriConsepUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebDetalleAutoriConsep(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleAutoriConsep.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleAutoriConsep.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.getdetalleautoriconsep(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.detalleautoriconsepLogic.getConnexion());

				if(this.detalleautoriconsep.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.detalleautoriconsep.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleAutoriConsep=(TitledBorder)this.jScrollPanelDatosDetalleAutoriConsep.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDetalleAutoriConsep.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoDetalleAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.getdetalleautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleautoriconsep==null) {
						this.detalleautoriconsep = new DetalleAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
				}

				if(this.detalleautoriconsep.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.detalleautoriconsep.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadDetalleAutoriConsepUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebDetalleAutoriConsep(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleAutoriConsep.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleAutoriConsep.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.getdetalleautoriconsep(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.detalleautoriconsepLogic.getConnexion());

				if(this.detalleautoriconsep.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.detalleautoriconsep.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleAutoriConsep=(TitledBorder)this.jScrollPanelDatosDetalleAutoriConsep.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderDetalleAutoriConsep.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadDetalleAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.getdetalleautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleautoriconsep==null) {
						this.detalleautoriconsep = new DetalleAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
				}

				if(this.detalleautoriconsep.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.detalleautoriconsep.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_anioDetalleAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.getdetalleautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleautoriconsep==null) {
						this.detalleautoriconsep = new DetalleAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
				}

				if(this.detalleautoriconsep.getcantidad_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_anio = "+this.detalleautoriconsep.getcantidad_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_saldoDetalleAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.getdetalleautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleautoriconsep==null) {
						this.detalleautoriconsep = new DetalleAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
				}

				if(this.detalleautoriconsep.getcantidad_saldo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_saldo = "+this.detalleautoriconsep.getcantidad_saldo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadodetalleautoriconsep=true;

			idTienePermisoestadodetalleautoriconsep=this.tienePermisosUsuarioEnPaginaWebDetalleAutoriConsep(EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadodetalleautoriconsep) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleAutoriConsep.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleAutoriConsep.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.getdetalleautoriconsep(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);

				this.estadodetalleautoriconsepBeanSwingJInternalFrame=new EstadoDetalleAutoriConsepBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadodetalleautoriconsepBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadodetalleautoriconsepBeanSwingJInternalFrame.getEstadoDetalleAutoriConsepLogic().setConnexion(this.detalleautoriconsepLogic.getConnexion());

				if(this.detalleautoriconsep.getid_estado_detalle_autori_consep()!=null) {
					this.estadodetalleautoriconsepBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadodetalleautoriconsepBeanSwingJInternalFrame.setIdActual(this.detalleautoriconsep.getid_estado_detalle_autori_consep());
					this.estadodetalleautoriconsepBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadodetalleautoriconsepBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadodetalleautoriconsepBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep();
				}

				JInternalFrameBase jinternalFrame =this.estadodetalleautoriconsepBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleAutoriConsep=(TitledBorder)this.jScrollPanelDatosDetalleAutoriConsep.getBorder();
				TitledBorder titledBorderestadodetalleautoriconsep=(TitledBorder)this.estadodetalleautoriconsepBeanSwingJInternalFrame.jScrollPanelDatosEstadoDetalleAutoriConsep.getBorder();

				titledBorderestadodetalleautoriconsep.setTitle(titledBorderDetalleAutoriConsep.getTitle() + " -> Estado Detalle Autorizacion Consep");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.getdetalleautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleautoriconsep==null) {
						this.detalleautoriconsep = new DetalleAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
				}

				if(this.detalleautoriconsep.getid_estado_detalle_autori_consep()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_detalle_autori_consep = "+this.detalleautoriconsep.getid_estado_detalle_autori_consep().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreDetalleAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.getdetalleautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleautoriconsep==null) {
						this.detalleautoriconsep = new DetalleAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);
				}

				if(this.detalleautoriconsep.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.detalleautoriconsep.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAutoriConsepDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleAutoriConsep(false,false);

			this.getDetalleAutoriConsepsFK_IdAutoriConsep();

			this.inicializarActualizarBindingDetalleAutoriConsep(false);

			//if(DetalleAutoriConsepBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleAutoriConsep(false,false);

			this.getDetalleAutoriConsepsFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleAutoriConsep(false);

			//if(DetalleAutoriConsepBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleAutoriConsep(false,false);

			this.getDetalleAutoriConsepsFK_IdEstadoDetalleAutoriConsep();

			this.inicializarActualizarBindingDetalleAutoriConsep(false);

			//if(DetalleAutoriConsepBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleAutoriConsep(false,false);

			this.getDetalleAutoriConsepsFK_IdProducto();

			this.inicializarActualizarBindingDetalleAutoriConsep(false);

			//if(DetalleAutoriConsepBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleAutoriConsep(false,false);

			this.getDetalleAutoriConsepsFK_IdUnidad();

			this.inicializarActualizarBindingDetalleAutoriConsep(false);

			//if(DetalleAutoriConsepBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleAutoriConsep() {
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleAutoriConsep.dispose();
			this.jInternalFrameDetalleFormDetalleAutoriConsep=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep!=null) {
			this.jInternalFrameReporteDinamicoDetalleAutoriConsep.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleAutoriConsep.dispose();
			this.jInternalFrameReporteDinamicoDetalleAutoriConsep=null;
		}
		
		if(this.jInternalFrameImportacionDetalleAutoriConsep!=null) {
			this.jInternalFrameImportacionDetalleAutoriConsep.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleAutoriConsep.dispose();
			this.jInternalFrameImportacionDetalleAutoriConsep=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleAutoriConsep();
			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleAutoriConsep")) {
				jButtonNuevoDetalleAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleAutoriConsep")) {
				jButtonDuplicarDetalleAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleAutoriConsep")) {
				jButtonCopiarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleAutoriConsep")) {
				jButtonVerFormDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleAutoriConsep")) {
				jButtonNuevoDetalleAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleAutoriConsep")) {
				jButtonDuplicarDetalleAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleAutoriConsep")) {
				jButtonNuevoDetalleAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleAutoriConsep")) {
				jButtonDuplicarDetalleAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleAutoriConsep")) {
				jButtonNuevoDetalleAutoriConsepActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleAutoriConsep")) {
				jButtonNuevoDetalleAutoriConsepActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleAutoriConsep")) {
				jButtonNuevoDetalleAutoriConsepActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleAutoriConsep")) {
				jButtonModificarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleAutoriConsep")) {
				jButtonModificarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleAutoriConsep")) {
				jButtonModificarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleAutoriConsep")) {
				jButtonActualizarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleAutoriConsep")) {
				jButtonActualizarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleAutoriConsep")) {
				jButtonActualizarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleAutoriConsep")) {
				jButtonEliminarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleAutoriConsep")) {
				jButtonEliminarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleAutoriConsep")) {
				jButtonEliminarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleAutoriConsep")) {
				jButtonCancelarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleAutoriConsep")) {
				jButtonCancelarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleAutoriConsep")) {
				jButtonCancelarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleAutoriConsep")) {
				jButtonCerrarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleAutoriConsep")) {
				jButtonCerrarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleAutoriConsep")) {
				jButtonCerrarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleAutoriConsep")) {
				jButtonMostrarOcultarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleAutoriConsep")) {
				jButtonCancelarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleAutoriConsep")) {
				jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleAutoriConsep")) {
				jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleAutoriConsep")) {
				jButtonCopiarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleAutoriConsep")) {
				jButtonVerFormDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleAutoriConsep")) {
				jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleAutoriConsep")) {
				jButtonCopiarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleAutoriConsep")) {
				jButtonVerFormDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleAutoriConsep")) {
				jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleAutoriConsep")) {
				jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleAutoriConsep")) {
				jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleAutoriConsep")) {
				jButtonRecargarInformacionDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleAutoriConsep")) {
				jButtonRecargarInformacionDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleAutoriConsep")) {
				jButtonRecargarInformacionDetalleAutoriConsepActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleAutoriConsep")) {
				jButtonAnterioresDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleAutoriConsep")) {
				jButtonAnterioresDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleAutoriConsep")) {
				jButtonAnterioresDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleAutoriConsep")) {
				jButtonSiguientesDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleAutoriConsep")) {
				jButtonSiguientesDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleAutoriConsep")) {
				jButtonSiguientesDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleAutoriConsep") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleAutoriConsep")) {
				jButtonAbrirOrderByDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleAutoriConsep") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleAutoriConsep")) {
				jButtonMostrarOcultarDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleAutoriConsep")) {
				jButtonNuevoGuardarCambiosDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleAutoriConsep")) {
				jButtonNuevoGuardarCambiosDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleAutoriConsep")) {
				jButtonNuevoGuardarCambiosDetalleAutoriConsepActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleAutoriConsep")) {
				jButtonCerrarReporteDinamicoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleAutoriConsep")) {
				jButtonGenerarReporteDinamicoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleAutoriConsep")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleAutoriConsep")) {
				jButtonCerrarImportacionDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleAutoriConsep")) {
				
				jButtonGenerarImportacionDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleAutoriConsep")) {
				
				jButtonAbrirImportacionDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleAutoriConsep")) {
				jComboBoxTiposAccionesDetalleAutoriConsepActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleAutoriConsep")) {
				jComboBoxTiposRelacionesDetalleAutoriConsepActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleAutoriConsep")) {
				jComboBoxTiposAccionesDetalleAutoriConsepActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleAutoriConsep")) {
				
				jComboBoxTiposSeleccionarDetalleAutoriConsepActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleAutoriConsep")) {
				jTextFieldValorCampoGeneralDetalleAutoriConsepActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleAutoriConsep")) {
				jButtonAbrirOrderByDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleAutoriConsep")) {
				jButtonAbrirOrderByDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleAutoriConsep")) {
				jButtonCerrarOrderByDetalleAutoriConsepActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleAutoriConsepBusqueda")) {
				this.jButtonidDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_autori_consepDetalleAutoriConsepUpdate")) {
				this.jButtonid_autori_consepDetalleAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_autori_consepDetalleAutoriConsepBusqueda")) {
				this.jButtonid_autori_consepDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleAutoriConsepUpdate")) {
				this.jButtonid_empresaDetalleAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleAutoriConsepBusqueda")) {
				this.jButtonid_empresaDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoDetalleAutoriConsep")) {
				this.jButtonid_productoDetalleAutoriConsepActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDetalleAutoriConsepUpdate")) {
				this.jButtonid_productoDetalleAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDetalleAutoriConsepBusqueda")) {
				this.jButtonid_productoDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadDetalleAutoriConsepUpdate")) {
				this.jButtonid_unidadDetalleAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadDetalleAutoriConsepBusqueda")) {
				this.jButtonid_unidadDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_anioDetalleAutoriConsepBusqueda")) {
				this.jButtoncantidad_anioDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_saldoDetalleAutoriConsepBusqueda")) {
				this.jButtoncantidad_saldoDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_detalle_autori_consepDetalleAutoriConsepUpdate")) {
				this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_detalle_autori_consepDetalleAutoriConsepBusqueda")) {
				this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDetalleAutoriConsepBusqueda")) {
				this.jButtonnombreDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoDetalleAutoriConsep")) {
				this.jButtonid_productoDetalleAutoriConsepActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdAutoriConsepDetalleAutoriConsep")) {
				this.jButtonFK_IdAutoriConsepDetalleAutoriConsepActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep")) {
				this.jButtonFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsepActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoDetalleAutoriConsep")) {
				this.jButtonFK_IdProductoDetalleAutoriConsepActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadDetalleAutoriConsep")) {
				this.jButtonFK_IdUnidadDetalleAutoriConsepActionPerformed(evt);
			}
			
			;
			
			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleAutoriConsep();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleAutoriConsepActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				


				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleAutoriConsep detalleautoriconsepLocal=null;
			
			if(!this.getEsControlTabla()) {
				detalleautoriconsepLocal=this.detalleautoriconsep;
			} else {
				detalleautoriconsepLocal=this.detalleautoriconsepAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
							
				
				


				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepAnterior =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleautoriconsepAnterior =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			
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
			
			


			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleAutoriConsepActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
								
						
				


				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleAutoriConsep.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
								
				
				


				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepAnterior =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleautoriconsepAnterior =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepAnterior =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleautoriconsepAnterior =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleAutoriConsepActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
							
				
				


				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleAutoriConsep.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleAutoriConsepActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleautoriconsepAnterior =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleautoriconsepAnterior =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			
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
			
			


			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleAutoriConsepActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
								
				
				


				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepAnterior =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleautoriconsepAnterior =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleAutoriConsepActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleAutoriConsepActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleAutoriConsep")) {
					jCheckBoxSeleccionarTodosDetalleAutoriConsepItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleAutoriConsep")) {
					jCheckBoxSeleccionadosDetalleAutoriConsepItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleAutoriConsep")) {
					
				}
				
				


				
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
												
				
				


				
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleAutoriConsepActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleautoriconsepAnterior =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleautoriconsepAnterior =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleAutoriConsepActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
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
			
			


			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleAutoriConsepActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleAutoriConsep.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleAutoriConsep.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleautoriconsep);
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
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
				
				


				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleAutoriConsep.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleautoriconsepAnterior =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleautoriconsepAnterior =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleAutoriConsep")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleAutoriConsepListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleAutoriConsep.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detalleautoriconsep =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detalleautoriconsep);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleAutoriConsep")) {
				
				}
				
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleAutoriConsep")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleAutoriConsep.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleAutoriConsep")) {
			
			}
			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleAutoriConsep();
			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleAutoriConsep")) {
				jButtonNuevoDetalleAutoriConsepActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleAutoriConsep")) {
				jButtonDuplicarDetalleAutoriConsepActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleAutoriConsep")) {
				jButtonCopiarDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleAutoriConsep")) {
				jButtonVerFormDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleAutoriConsep")) {
				jButtonNuevoDetalleAutoriConsepActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleAutoriConsep")) {
				jButtonModificarDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleAutoriConsep")) {
				jButtonActualizarDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleAutoriConsep")) {
				jButtonEliminarDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleAutoriConsep")) {
				jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleAutoriConsep")) {
				jButtonCancelarDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleAutoriConsep")) {
				jButtonCerrarDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleAutoriConsep")) {
				jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleAutoriConsep")) {
				jButtonNuevoGuardarCambiosDetalleAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleAutoriConsep")) {
				jButtonAbrirOrderByDetalleAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleAutoriConsep")) {
				jButtonRecargarInformacionDetalleAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleAutoriConsep")) {
				jButtonAnterioresDetalleAutoriConsepActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleAutoriConsep")) {
				jButtonSiguientesDetalleAutoriConsepActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleAutoriConsepBusqueda")) {
				this.jButtonidDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_autori_consepDetalleAutoriConsepUpdate")) {
				this.jButtonid_autori_consepDetalleAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_autori_consepDetalleAutoriConsepBusqueda")) {
				this.jButtonid_autori_consepDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleAutoriConsepUpdate")) {
				this.jButtonid_empresaDetalleAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleAutoriConsepBusqueda")) {
				this.jButtonid_empresaDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoDetalleAutoriConsep")) {
				this.jButtonid_productoDetalleAutoriConsepActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDetalleAutoriConsepUpdate")) {
				this.jButtonid_productoDetalleAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDetalleAutoriConsepBusqueda")) {
				this.jButtonid_productoDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadDetalleAutoriConsepUpdate")) {
				this.jButtonid_unidadDetalleAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadDetalleAutoriConsepBusqueda")) {
				this.jButtonid_unidadDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_anioDetalleAutoriConsepBusqueda")) {
				this.jButtoncantidad_anioDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_saldoDetalleAutoriConsepBusqueda")) {
				this.jButtoncantidad_saldoDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_detalle_autori_consepDetalleAutoriConsepUpdate")) {
				this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_detalle_autori_consepDetalleAutoriConsepBusqueda")) {
				this.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDetalleAutoriConsepBusqueda")) {
				this.jButtonnombreDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleAutoriConsep();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleAutoriConsep")) {
				closingInternalFrameDetalleAutoriConsep();
				
			} else if(sTipo.equals("jButtonCancelarDetalleAutoriConsep")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleAutoriConsep = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleAutoriConsepBeanSwingJInternalFrame jInternalFrameParent=(DetalleAutoriConsepBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleAutoriConsep.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleAutoriConsepActionPerformed(null);
			}
			
			DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleautoriconsep,new Object(),this.detalleautoriconsepParameterGeneral,this.detalleautoriconsepReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleAutoriConsep(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleAutoriConsep(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleAutoriConsep(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detalleautoriconsep)) {
			if(!esControlTabla) {
				if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);			
				}
				
				if(this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleautoriconsepReturnGeneral=detalleautoriconsepLogic.procesarEventosDetalleAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleautoriconsepLogic.getDetalleAutoriConseps(),this.detalleautoriconsep,this.detalleautoriconsepParameterGeneral,this.isEsNuevoDetalleAutoriConsep,classes);//this.detalleautoriconsepLogic.getDetalleAutoriConsep()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleAutoriConsep(this.detalleautoriconsepReturnGeneral,this.detalleautoriconsepBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleAutoriConsep(classes,this.detalleautoriconsepReturnGeneral,this.detalleautoriconsepBean,false);
					}
						
					if(this.detalleautoriconsepReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleAutoriConsep(this.detalleautoriconsepReturnGeneral.getDetalleAutoriConsep());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleAutoriConsep(this.detalleautoriconsepReturnGeneral.getDetalleAutoriConsep());	
					}
						
					if(this.detalleautoriconsepReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleAutoriConsep(this.detalleautoriconsepReturnGeneral.getDetalleAutoriConsep(),classes);//this.detalleautoriconsepBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleAutoriConsep(this.detalleautoriconsep,classes);//this.detalleautoriconsepBean);									
				}
			
				if(DetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleAutoriConsep(this.detalleautoriconsep,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleAutoriConsep(this.detalleautoriconsep);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detalleautoriconsepAnterior!=null) {
						this.detalleautoriconsep=this.detalleautoriconsepAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleautoriconsepReturnGeneral=detalleautoriconsepLogic.procesarEventosDetalleAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleautoriconsepLogic.getDetalleAutoriConseps(),this.detalleautoriconsep,this.detalleautoriconsepParameterGeneral,this.isEsNuevoDetalleAutoriConsep,classes);//this.detalleautoriconsepLogic.getDetalleAutoriConsep()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleautoriconsepSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detalleautoriconsepReturnGeneral.getDetalleAutoriConsep(),detalleautoriconsepLogic.getDetalleAutoriConseps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detalleautoriconsepReturnGeneral.getDetalleAutoriConsep(),this.detalleautoriconseps);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleAutoriConsep.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleAutoriConsep.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleAutoriConsep();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleAutoriConsep() throws Exception {
		
		DetalleAutoriConsepModel detalleautoriconsepModel=(DetalleAutoriConsepModel)this.jTableDatosDetalleAutoriConsep.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleautoriconsepModel.detalleautoriconseps=this.detalleautoriconsepLogic.getDetalleAutoriConseps();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detalleautoriconsepModel.detalleautoriconseps=this.detalleautoriconseps;
		}
		
		
		((DetalleAutoriConsepModel) this.jTableDatosDetalleAutoriConsep.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleAutoriConsep() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetalleautoriconsepAnterior(),this.detalleautoriconsepLogic.getDetalleAutoriConseps());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetalleautoriconsepAnterior(),this.detalleautoriconseps);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleAutoriConsep();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
										
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleautoriconsep,new Object(),generalEntityParameterGeneral,this.detalleautoriconsepReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detalleautoriconsepSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleAutoriConsepConstantesFunciones.getClassesRelationshipsOfDetalleAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleAutoriConsepConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleAutoriConsep(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleAutoriConsep(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleautoriconsep,new Object(),generalEntityParameterGeneral,this.detalleautoriconsepReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleAutoriConsep(DetalleAutoriConsepBean detalleautoriconsepBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleAutoriConsep(ArrayList<Classe> classes,DetalleAutoriConsepReturnGeneral detalleautoriconsepReturnGeneral,DetalleAutoriConsepBean detalleautoriconsepBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detalleautoriconsep)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep = new DetalleAutoriConsepDetalleFormJInternalFrame(jDesktopPane,this.detalleautoriconsepSessionBean.getConGuardarRelaciones(),this.detalleautoriconsepSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.setVisible(false);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.detalleautoriconsepLogic=this.detalleautoriconsepLogic;
		
		this.cargarCombosFrameForeignKeyDetalleAutoriConsep("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleAutoriConsep();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleAutoriConsep();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleAutoriConsep("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleAutoriConsep();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleAutoriConsep"));
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonModificarDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarDetalleAutoriConsep"));

		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonModificarToolBarDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleAutoriConsep"));
					
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemModificarDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonActualizarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"ActualizarDetalleAutoriConsep"));
		
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonActualizarToolBarDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleAutoriConsep"));
						
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemActualizarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonEliminarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarDetalleAutoriConsep"));
		
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonEliminarToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleAutoriConsep"));
								
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemEliminarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonCancelarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarDetalleAutoriConsep"));
		
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonCancelarToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleAutoriConsep"));
					
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemCancelarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleAutoriConsep"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemDetalleCerrarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonGuardarCambiosToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleAutoriConsep"));
		
		
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonGuardarCambiosToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleAutoriConsep"));
		
		
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleAutoriConsep"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonidDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_autori_consepDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_autori_consepDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_autori_consepDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_autori_consepDetalleAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_empresaDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_empresaDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleAutoriConsepBusqueda"));
		//jButtonid_productoDetalleAutoriConsep.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleAutoriConsepActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_productoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"id_productoDetalleAutoriConsep"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_productoDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_productoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_unidadDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_unidadDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtoncantidad_anioDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_anioDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtoncantidad_saldoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_saldoDetalleAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_estado_detalle_autori_consepDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_detalle_autori_consepDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonnombreDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleAutoriConsepBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jTabbedPaneRelacionesDetalleAutoriConsep.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleAutoriConsep"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleAutoriConsep"));
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleAutoriConsep"));
		}
		
		this.jTableDatosDetalleAutoriConsep.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleAutoriConsep"));
		
		this.jTableDatosDetalleAutoriConsep.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleAutoriConsep"));
		
		this.jButtonNuevoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"NuevoDetalleAutoriConsep"));
		
		this.jButtonDuplicarDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"DuplicarDetalleAutoriConsep"));
		
		this.jButtonCopiarDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"CopiarDetalleAutoriConsep"));
		
		this.jButtonVerFormDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"VerFormDetalleAutoriConsep"));
		
		
		this.jButtonNuevoToolBarDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleAutoriConsep"));
			
		this.jButtonDuplicarToolBarDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleAutoriConsep"));
			
		this.jMenuItemNuevoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleAutoriConsep"));
			
		this.jMenuItemDuplicarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleAutoriConsep"));		
		
		
		this.jButtonNuevoRelacionesDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleAutoriConsep"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleAutoriConsep"));
			
		this.jMenuItemNuevoRelacionesDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleAutoriConsep"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonModificarDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarDetalleAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonModificarToolBarDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleAutoriConsep"));
			
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemModificarDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonActualizarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"ActualizarDetalleAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonActualizarToolBarDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleAutoriConsep"));
				
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemActualizarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonEliminarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarDetalleAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonEliminarToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleAutoriConsep"));
						
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemEliminarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonCancelarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarDetalleAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonCancelarToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleAutoriConsep"));
			
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemCancelarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleAutoriConsep"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleAutoriConsep"));		
		
		
		this.jButtonCerrarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CerrarDetalleAutoriConsep"));
		
		
		this.jButtonCerrarToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleAutoriConsep"));
			
		this.jMenuItemCerrarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleAutoriConsep"));
			
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jMenuItemDetalleCerrarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonGuardarCambiosDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonGuardarCambiosToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleAutoriConsep"));
		}
		
		this.jButtonCopiarToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleAutoriConsep"));
			
		this.jButtonVerFormToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleAutoriConsep"));
		
		this.jMenuItemGuardarCambiosDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleAutoriConsep"));
			
		this.jMenuItemCopiarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleAutoriConsep"));		
		
		this.jMenuItemVerFormDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleAutoriConsep"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleAutoriConsep"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleAutoriConsep"));
			
		this.jMenuItemGuardarCambiosTablaDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleAutoriConsep"));		
		
		
		
		this.jButtonRecargarInformacionDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleAutoriConsep"));
					
		this.jButtonRecargarInformacionToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleAutoriConsep"));
		
		this.jMenuItemRecargarInformacionDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleAutoriConsep"));		
		
		
		
		this.jButtonAnterioresDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"AnterioresDetalleAutoriConsep"));
		
		
		this.jButtonAnterioresToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleAutoriConsep"));
		
		this.jMenuItemAnterioresDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleAutoriConsep"));		
		
		
		this.jButtonSiguientesDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"SiguientesDetalleAutoriConsep"));
		
		
		this.jButtonSiguientesToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleAutoriConsep"));
			
		this.jMenuItemSiguientesDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleAutoriConsep"));
			
		this.jMenuItemAbrirOrderByDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleAutoriConsep"));
			
		this.jMenuItemMostrarOcultarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleAutoriConsep"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleAutoriConsep"));
			
		this.jMenuItemDetalleMostarOcultarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleAutoriConsep"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleAutoriConsep"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleAutoriConsep"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleAutoriConsep"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleAutoriConsep.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleAutoriConsep"));

		this.jCheckBoxSeleccionadosDetalleAutoriConsep.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleAutoriConsep"));
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleAutoriConsep"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleAutoriConsep"));
			
		this.jComboBoxTiposAccionesDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleAutoriConsep"));
					
		this.jComboBoxTiposSeleccionarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleAutoriConsep"));
			
		this.jTextFieldValorCampoGeneralDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleAutoriConsep"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonidDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_autori_consepDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_autori_consepDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_autori_consepDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_autori_consepDetalleAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_empresaDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_empresaDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleAutoriConsepBusqueda"));
		//jButtonid_productoDetalleAutoriConsep.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleAutoriConsepActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_productoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"id_productoDetalleAutoriConsep"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_productoDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_productoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_unidadDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_unidadDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtoncantidad_anioDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_anioDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtoncantidad_saldoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_saldoDetalleAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_estado_detalle_autori_consepDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_detalle_autori_consepDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonnombreDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleAutoriConsepBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAutoriConsepDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"FK_IdAutoriConsepDetalleAutoriConsep"));

			this.jButtonFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"FK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep"));

			this.jButtonFK_IdProductoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"FK_IdProductoDetalleAutoriConsep"));

			this.jButtonBuscarFK_IdProductoid_productoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"id_productoDetalleAutoriConsep"));

			this.jButtonFK_IdUnidadDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"FK_IdUnidadDetalleAutoriConsep"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleAutoriConsep!=null) {
				this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleAutoriConsep"));
				this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleAutoriConsep"));
				this.jInternalFrameReporteDinamicoDetalleAutoriConsep.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleAutoriConsep"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleAutoriConsep"));				
			//this.jButtonGenerarReporteDinamicoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleAutoriConsep"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleAutoriConsep"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleAutoriConsep!=null) {
				this.jInternalFrameImportacionDetalleAutoriConsep.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleAutoriConsep"));
				this.jInternalFrameImportacionDetalleAutoriConsep.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleAutoriConsep"));
				this.jInternalFrameImportacionDetalleAutoriConsep.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleAutoriConsep"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleAutoriConsep"));
			
			this.jButtonAbrirOrderByToolBarDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleAutoriConsep"));			
			
			if(this.jInternalFrameOrderByDetalleAutoriConsep!=null) {
				this.jInternalFrameOrderByDetalleAutoriConsep.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleAutoriConsep"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jTabbedPaneRelacionesDetalleAutoriConsep.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleAutoriConsep"));
		
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
            		closingInternalFrameDetalleAutoriConsep();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleAutoriConsep = (JInternalFrameBase)event.getSource();
	            	
	            DetalleAutoriConsepBeanSwingJInternalFrame jInternalFrameParent=(DetalleAutoriConsepBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleAutoriConsep.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleAutoriConsepActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleAutoriConsep.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleAutoriConsepListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleAutoriConsep.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleAutoriConsep.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleAutoriConsepActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleAutoriConsepActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleAutoriConsepActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleAutoriConsep";
		inputMap = this.jButtonNuevoDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleAutoriConsepActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleAutoriConsepActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleAutoriConsepActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleAutoriConsepActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleAutoriConsep";
		inputMap = this.jButtonNuevoRelacionesDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleAutoriConsepActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleAutoriConsep";
		inputMap = this.jButtonModificarDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleAutoriConsep";
		inputMap = this.jButtonActualizarDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleAutoriConsep";
		inputMap = this.jButtonEliminarDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleAutoriConsep";
		inputMap = this.jButtonCancelarDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleAutoriConsep";
		inputMap = this.jButtonCerrarDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonGuardarCambiosDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleAutoriConsep";
		inputMap = this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonGuardarCambiosDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonGuardarCambiosDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleAutoriConsep.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleAutoriConsepItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleAutoriConsep.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleAutoriConsepActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleAutoriConsep.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleAutoriConsepActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleAutoriConsep.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleAutoriConsepActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonidDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_autori_consepDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_autori_consepDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_autori_consepDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_autori_consepDetalleAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_empresaDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_empresaDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleAutoriConsepBusqueda"));
		//jButtonid_productoDetalleAutoriConsep.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleAutoriConsepActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_productoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"id_productoDetalleAutoriConsep"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_productoDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_productoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_unidadDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_unidadDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_unidadDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtoncantidad_anioDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_anioDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtoncantidad_saldoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_saldoDetalleAutoriConsepBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepUpdate.addActionListener(new ButtonActionListener(this,"id_estado_detalle_autori_consepDetalleAutoriConsepUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_estado_detalle_autori_consepDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_detalle_autori_consepDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonnombreDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"nombreDetalleAutoriConsepBusqueda"));
		
		
		this.jButtonFK_IdAutoriConsepDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"FK_IdAutoriConsepDetalleAutoriConsep"));

		this.jButtonFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"FK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep"));

		this.jButtonFK_IdProductoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"FK_IdProductoDetalleAutoriConsep"));

		this.jButtonBuscarFK_IdProductoid_productoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"id_productoDetalleAutoriConsep"));

		this.jButtonFK_IdUnidadDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"FK_IdUnidadDetalleAutoriConsep"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleAutoriConsepActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleAutoriConsep.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleAutoriConsep(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleAutoriConsep detalleautoriconsepAux:this.detalleautoriconsepLogic.getDetalleAutoriConseps()) {
					detalleautoriconsepAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleAutoriConsep detalleautoriconsepAux:detalleautoriconseps) {
					detalleautoriconsepAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleAutoriConsepItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleAutoriConsep detalleautoriconsepAux:this.detalleautoriconsepLogic.getDetalleAutoriConseps()) {
						detalleautoriconsepAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleAutoriConsep detalleautoriconsepAux:detalleautoriconseps) {
						detalleautoriconsepAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleAutoriConsep detalleautoriconsepAux:this.detalleautoriconsepLogic.getDetalleAutoriConseps()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleAutoriConsep detalleautoriconsepAux:detalleautoriconseps) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleAutoriConsep.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleAutoriConsep.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleAutoriConsepItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleAutoriConsep.getSelectedRows();
			
			DetalleAutoriConsep detalleautoriconsepLocal=new DetalleAutoriConsep();
			
			//this.seleccionarTodosDetalleAutoriConsep(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleautoriconsepLocal =(DetalleAutoriConsep) this.detalleautoriconsepLogic.getDetalleAutoriConseps().toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detalleautoriconsepLocal =(DetalleAutoriConsep) this.detalleautoriconseps.toArray()[this.jTableDatosDetalleAutoriConsep.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detalleautoriconsepLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleAutoriConsep detalleautoriconsepAux:this.detalleautoriconsepLogic.getDetalleAutoriConseps()) {
						detalleautoriconsepAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleAutoriConsep detalleautoriconsepAux:detalleautoriconseps) {
						detalleautoriconsepAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleAutoriConsep.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleAutoriConsep.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleAutoriConsep,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleAutoriConsepItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleAutoriConsepParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleAutoriConsepActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleAutoriConsep.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleAutoriConsep detalleautoriconsepAux:this.detalleautoriconsepLogic.getDetalleAutoriConseps()) {
				
						if(sTipoSeleccionar.equals(DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO)) {
							existe=true;
							detalleautoriconsepAux.setcantidad_anio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO)) {
							existe=true;
							detalleautoriconsepAux.setcantidad_saldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							detalleautoriconsepAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleAutoriConsep detalleautoriconsepAux:detalleautoriconseps) {
					
						if(sTipoSeleccionar.equals(DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO)) {
							existe=true;
							detalleautoriconsepAux.setcantidad_anio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO)) {
							existe=true;
							detalleautoriconsepAux.setcantidad_saldo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							detalleautoriconsepAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleAutoriConsepActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleAutoriConsep=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleAutoriConsep.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleAutoriConsep) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleAutoriConsep(conSplash);
				
					this.generarReporteDetalleAutoriConsepsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleAutoriConsepsSeleccionados();
				//this.jComboBoxTiposAccionesDetalleAutoriConsep.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleAutoriConsepsSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleAutoriConsep.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleAutoriConsepsSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleAutoriConsep.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleAutoriConsep();
				
				this.exportarDetalleAutoriConsepsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleAutoriConseps();
				//this.importarDetalleAutoriConseps();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleAutoriConsep();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleAutoriConsepsSeleccionados();
				//this.jComboBoxTiposAccionesDetalleAutoriConsep.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Autorizacion Consep", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleAutoriConsep();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleAutoriConsep)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleAutoriConsep(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleAutoriConsepBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleAutoriConsep) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleAutoriConsep(conSplash);
					
						//this.actualizarParametrosGeneralDetalleAutoriConsep();
						
						this.generarReporteProcesoAccionDetalleAutoriConsepsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleAutoriConsep.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleAutoriConsepBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Autorizacion ConsepES SELECCIONADOS?", "MANTENIMIENTO DE Detalle Autorizacion Consep", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleAutoriConsep();
				
						this.actualizarParametrosGeneralDetalleAutoriConsep();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detalleautoriconsepReturnGeneral=detalleautoriconsepLogic.procesarAccionDetalleAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detalleautoriconsepLogic.getDetalleAutoriConseps(),this.detalleautoriconsepParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleAutoriConsepReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleAutoriConsep.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleAutoriConsep();
					
					DetalleAutoriConsepBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleAutoriConsepReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleAutoriConsep.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxTiposAccionesFormularioDetalleAutoriConsep.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleAutoriConsep(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleAutoriConsepActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleAutoriConsep();
			
			if(this.jInternalFrameDetalleFormDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados=new ArrayList<DetalleAutoriConsep>();		
			DetalleAutoriConsep detalleautoriconsep=new DetalleAutoriConsep();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleAutoriConsep(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleAutoriConsep.getSelectedItem();
			
			
			
			
			detalleautoriconsepsSeleccionados=this.getDetalleAutoriConsepsSeleccionados(true);
			//this.sTipoAccion;
			
			if(detalleautoriconsepsSeleccionados.size()==1) {
				for(DetalleAutoriConsep detalleautoriconsepAux:detalleautoriconsepsSeleccionados) {
					detalleautoriconsep=detalleautoriconsepAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleAutoriConsep();
			
      		//this.finishProcessDetalleAutoriConsep(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleAutoriConsepReturnGeneral() throws Exception {
		if(this.detalleautoriconsepReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detalleautoriconsepReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detalleautoriconsepReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detalleautoriconsepReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detalleautoriconsepReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detalleautoriconsepReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleAutoriConsep(false);
		}
		
		if(this.detalleautoriconsepReturnGeneral.getConRetornoLista() || this.detalleautoriconsepReturnGeneral.getConRetornoObjeto()) {
			if(this.detalleautoriconsepReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleautoriconsepLogic.setDetalleAutoriConseps(this.detalleautoriconsepReturnGeneral.getDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detalleautoriconsepReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleautoriconsepLogic.setDetalleAutoriConsep(this.detalleautoriconsepReturnGeneral.getDetalleAutoriConsep());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleAutoriConsep(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleAutoriConsep() throws Exception {
		
		
	}
	
	public ArrayList<DetalleAutoriConsep> getDetalleAutoriConsepsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados=new ArrayList<DetalleAutoriConsep>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleAutoriConsep) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleAutoriConsep detalleautoriconsepAux:detalleautoriconsepLogic.getDetalleAutoriConseps()) {
					if(detalleautoriconsepAux.getIsSelected()) {
						detalleautoriconsepsSeleccionados.add(detalleautoriconsepAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleAutoriConsep detalleautoriconsepAux:this.detalleautoriconseps) {
					if(detalleautoriconsepAux.getIsSelected()) {
						detalleautoriconsepsSeleccionados.add(detalleautoriconsepAux);				
					}
				}
			}
			
			if(detalleautoriconsepsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detalleautoriconsepsSeleccionados.addAll(this.detalleautoriconsepLogic.getDetalleAutoriConseps());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detalleautoriconsepsSeleccionados.addAll(this.detalleautoriconseps);				
					}
				}
			}
		} else {
			detalleautoriconsepsSeleccionados.add(this.detalleautoriconsep);
		}
		
		return detalleautoriconsepsSeleccionados;
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
	
	public void generarReporteDetalleAutoriConsepsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleAutoriConsepsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleAutoriConsepsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleAutoriConsepsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleAutoriConsepsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Autorizacion Consep",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleAutoriConsepsSeleccionados() throws Exception {
		ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados=new ArrayList<DetalleAutoriConsep>();		
		
		detalleautoriconsepsSeleccionados=this.getDetalleAutoriConsepsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleAutoriConseps("Todos",detalleautoriconsepsSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleAutoriConsepsSeleccionados() throws Exception {
		ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados=new ArrayList<DetalleAutoriConsep>();		
		
		detalleautoriconsepsSeleccionados=this.getDetalleAutoriConsepsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleAutoriConseps("Todos",detalleautoriconsepsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleAutoriConsepsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados=new ArrayList<DetalleAutoriConsep>();
		
		detalleautoriconsepsSeleccionados=this.getDetalleAutoriConsepsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleAutoriConseps("Todos",detalleautoriconsepsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleAutoriConsepsSeleccionados() throws Exception {
		ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados=new ArrayList<DetalleAutoriConsep>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleAutoriConsep();
		
		
		detalleautoriconsepsSeleccionados=this.getDetalleAutoriConsepsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleAutoriConsep();
		
		
		//this.generarReporteDetalleAutoriConseps("Todos",detalleautoriconsepsSeleccionados ,detalleautoriconsepImplementable,detalleautoriconsepImplementableHome);
	}
	
	public void mostrarImportacionDetalleAutoriConseps() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleAutoriConsep();
		
		this.abrirFrameImportacionDetalleAutoriConsep();		
		
			
		//this.generarReporteDetalleAutoriConseps("Todos",detalleautoriconsepsSeleccionados ,detalleautoriconsepImplementable,detalleautoriconsepImplementableHome);
	}
	
	public void importarDetalleAutoriConseps() throws Exception {		
	
	}
	
	public void exportarDetalleAutoriConsepsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleAutoriConsepsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleAutoriConsepsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleAutoriConsepsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Autorizacion Consep",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleAutoriConsepsSeleccionados() throws Exception {
		ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados=new ArrayList<DetalleAutoriConsep>();		
		
		detalleautoriconsepsSeleccionados=this.getDetalleAutoriConsepsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleautoriconsep."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleAutoriConsep(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleAutoriConsep detalleautoriconsepAux:detalleautoriconsepsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleAutoriConsep(detalleautoriconsepAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detalleautoriconsepAux.setsDetalleGeneralEntityReporte(detalleautoriconsepAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleAutoriConsep(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleAutoriConsepConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleAutoriConsepConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detalleautoriconsep.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleautoriconsep.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleautoriconsep.getautoriconsep_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleautoriconsep.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleautoriconsep.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleautoriconsep.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleautoriconsep.getcantidad_anio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleautoriconsep.getcantidad_saldo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleautoriconsep.getestadodetalleautoriconsep_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleautoriconsep.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleAutoriConsepsSeleccionados() throws Exception {
		ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados=new ArrayList<DetalleAutoriConsep>();		
		
		detalleautoriconsepsSeleccionados=this.getDetalleAutoriConsepsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleautoriconsep.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleAutoriConseps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleAutoriConsep(row);				
				iRow++;
			}				
			
			for(DetalleAutoriConsep detalleautoriconsepAux:detalleautoriconsepsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleAutoriConsep(detalleautoriconsepAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleAutoriConsepsSeleccionados() throws Exception {
		ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados=new ArrayList<DetalleAutoriConsep>();		
		
		detalleautoriconsepsSeleccionados=this.getDetalleAutoriConsepsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleautoriconsep.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detalleautoriconseps");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detalleautoriconsep");
			//elementRoot.appendChild(element);
		
			for(DetalleAutoriConsep detalleautoriconsepAux:detalleautoriconsepsSeleccionados) {
				element = document.createElement("detalleautoriconsep");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleAutoriConsep(detalleautoriconsepAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleAutoriConsep(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_CANTIDADSALDO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detalleautoriconsep.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleautoriconsep.getautoriconsep_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleautoriconsep.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleautoriconsep.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleautoriconsep.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleautoriconsep.getcantidad_anio());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleautoriconsep.getcantidad_saldo());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleautoriconsep.getestadodetalleautoriconsep_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleautoriconsep.getnombre());				
	}
	
	public void setFilaDatosExportarXmlDetalleAutoriConsep(DetalleAutoriConsep detalleautoriconsep,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleAutoriConsepConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detalleautoriconsep.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleAutoriConsepConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detalleautoriconsep.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementautoriconsep_descripcion = document.createElement(DetalleAutoriConsepConstantesFunciones.IDAUTORICONSEP);
		elementautoriconsep_descripcion.appendChild(document.createTextNode(detalleautoriconsep.getautoriconsep_descripcion()));
		element.appendChild(elementautoriconsep_descripcion);

		Element elementempresa_descripcion = document.createElement(DetalleAutoriConsepConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detalleautoriconsep.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementproducto_descripcion = document.createElement(DetalleAutoriConsepConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(detalleautoriconsep.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementunidad_descripcion = document.createElement(DetalleAutoriConsepConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(detalleautoriconsep.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementcantidad_anio = document.createElement(DetalleAutoriConsepConstantesFunciones.CANTIDADANIO);
		elementcantidad_anio.appendChild(document.createTextNode(detalleautoriconsep.getcantidad_anio().toString().trim()));
		element.appendChild(elementcantidad_anio);

		Element elementcantidad_saldo = document.createElement(DetalleAutoriConsepConstantesFunciones.CANTIDADSALDO);
		elementcantidad_saldo.appendChild(document.createTextNode(detalleautoriconsep.getcantidad_saldo().toString().trim()));
		element.appendChild(elementcantidad_saldo);

		Element elementestadodetalleautoriconsep_descripcion = document.createElement(DetalleAutoriConsepConstantesFunciones.IDESTADODETALLEAUTORICONSEP);
		elementestadodetalleautoriconsep_descripcion.appendChild(document.createTextNode(detalleautoriconsep.getestadodetalleautoriconsep_descripcion()));
		element.appendChild(elementestadodetalleautoriconsep_descripcion);

		Element elementnombre = document.createElement(DetalleAutoriConsepConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(detalleautoriconsep.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoDetalleAutoriConsepsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados=new ArrayList<DetalleAutoriConsep>();
		
		detalleautoriconsepsSeleccionados=this.getDetalleAutoriConsepsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleAutoriConsep(detalleautoriconsepsSeleccionados);
		
		this.generarReporteDetalleAutoriConseps("Todos",detalleautoriconsepsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleAutoriConsep(ArrayList<DetalleAutoriConsep> detalleautoriconsepsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleAutoriConsep detalleautoriconsepAux:detalleautoriconsepsSeleccionados) {
				detalleautoriconsepAux.setsDetalleGeneralEntityReporte(detalleautoriconsepAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleAutoriConsepConstantesFunciones.LABEL_IDAUTORICONSEP)) {
					existe=true;
					detalleautoriconsepAux.setsDescripcionGeneralEntityReporte1(detalleautoriconsepAux.getautoriconsep_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleAutoriConsepConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detalleautoriconsepAux.setsDescripcionGeneralEntityReporte1(detalleautoriconsepAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleAutoriConsepConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					detalleautoriconsepAux.setsDescripcionGeneralEntityReporte1(detalleautoriconsepAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleAutoriConsepConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					detalleautoriconsepAux.setsDescripcionGeneralEntityReporte1(detalleautoriconsepAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleAutoriConsepConstantesFunciones.LABEL_IDESTADODETALLEAUTORICONSEP)) {
					existe=true;
					detalleautoriconsepAux.setsDescripcionGeneralEntityReporte1(detalleautoriconsepAux.getestadodetalleautoriconsep_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					detalleautoriconsepAux.setsDescripcionGeneralEntityReporte1(detalleautoriconsepAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleAutoriConsep(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleAutoriConsep=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaActualizarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaEliminarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaCancelarDetalleAutoriConsep=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleAutoriConsep=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep=false;
			this.isVisibilidadCeldaModificarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaActualizarDetalleAutoriConsep=true;
			this.isVisibilidadCeldaEliminarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaCancelarDetalleAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleAutoriConsep=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep=false;
			this.isVisibilidadCeldaModificarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaActualizarDetalleAutoriConsep=true;
			this.isVisibilidadCeldaEliminarDetalleAutoriConsep=true;
			this.isVisibilidadCeldaCancelarDetalleAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleAutoriConsep=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep=false;
			this.isVisibilidadCeldaModificarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaActualizarDetalleAutoriConsep=true;
			this.isVisibilidadCeldaEliminarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaCancelarDetalleAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleAutoriConsep=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleAutoriConsep=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep=true;
			this.isVisibilidadCeldaModificarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaActualizarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaEliminarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaCancelarDetalleAutoriConsep=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleAutoriConsep=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep=false;
			this.isVisibilidadCeldaActualizarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaEliminarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaCancelarDetalleAutoriConsep=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleAutoriConsep=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleAutoriConsep=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep=false;
			this.isVisibilidadCeldaModificarDetalleAutoriConsep=true;
			this.isVisibilidadCeldaActualizarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaEliminarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaCancelarDetalleAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleAutoriConsep=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleAutoriConsep=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep=true;
		} else {
			this.actualizarEstadoPanelsDetalleAutoriConsep(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleAutoriConsep=false;
			//this.isVisibilidadCeldaVerFormDetalleAutoriConsep=false;
			this.isVisibilidadCeldaDuplicarDetalleAutoriConsep=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detalleautoriconsepSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleAutoriConsep=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			if(!detalleautoriconsepSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=false;												
			}
			
			this.jButtonCerrarDetalleAutoriConsep.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleAutoriConsep=false;
		}
		
		if(!this.permiteMantenimiento(this.detalleautoriconsep)) {
			this.isVisibilidadCeldaActualizarDetalleAutoriConsep=false;
			this.isVisibilidadCeldaEliminarDetalleAutoriConsep=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleAutoriConsep() {
	}
	
	public void actualizarEstadoPanelsDetalleAutoriConsep(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionDetalleAutoriConsep.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleAutoriConsep!=null) {
				this.jTabbedPaneBusquedasDetalleAutoriConsep.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleAutoriConsep!=null) {
				this.jPanelPaginacionDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesDetalleAutoriConsep.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionDetalleAutoriConsep.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleAutoriConsep!=null) {
				this.jTabbedPaneBusquedasDetalleAutoriConsep.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosDetalleAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleAutoriConsep!=null) {
				this.jPanelPaginacionDetalleAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesDetalleAutoriConsep.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionDetalleAutoriConsep.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleAutoriConsep!=null) {
				this.jTabbedPaneBusquedasDetalleAutoriConsep.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosDetalleAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleAutoriConsep!=null) {
				this.jPanelPaginacionDetalleAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesDetalleAutoriConsep.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionDetalleAutoriConsep.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleAutoriConsep!=null) {
				this.jTabbedPaneBusquedasDetalleAutoriConsep.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosDetalleAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleAutoriConsep!=null) {
				this.jPanelPaginacionDetalleAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesDetalleAutoriConsep.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionDetalleAutoriConsep.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleAutoriConsep!=null) {
				this.jTabbedPaneBusquedasDetalleAutoriConsep.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleAutoriConsep!=null) {
				this.jPanelPaginacionDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesDetalleAutoriConsep.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionDetalleAutoriConsep.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleAutoriConsep!=null) {
				this.jTabbedPaneBusquedasDetalleAutoriConsep.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleAutoriConsep!=null) {
				this.jPanelPaginacionDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesDetalleAutoriConsep.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionDetalleAutoriConsep.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleAutoriConsep!=null) {
				this.jTabbedPaneBusquedasDetalleAutoriConsep.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleAutoriConsep!=null) {
				this.jPanelPaginacionDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesDetalleAutoriConsep.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleAutoriConsep!=null) {
					this.jTabbedPaneBusquedasDetalleAutoriConsep.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesDetalleAutoriConsep.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleAutoriConsep!=null) {
				this.jTabbedPaneBusquedasDetalleAutoriConsep.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesDetalleAutoriConsep.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaAutoriConsep(Boolean isParaAutoriConsep){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAutoriConsepNegation=!isParaAutoriConsep;

			this.isVisibilidadFK_IdAutoriConsep=isParaAutoriConsep;
			if(!this.isVisibilidadFK_IdAutoriConsep) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdAutoriConsepDetalleAutoriConsep);}

			this.isVisibilidadFK_IdEstadoDetalleAutoriConsep=isParaAutoriConsepNegation;
			if(!this.isVisibilidadFK_IdEstadoDetalleAutoriConsep) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);}

			this.isVisibilidadFK_IdProducto=isParaAutoriConsepNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdProductoDetalleAutoriConsep);}

			this.isVisibilidadFK_IdUnidad=isParaAutoriConsepNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdUnidadDetalleAutoriConsep);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAutoriConsep=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAutoriConsep) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdAutoriConsepDetalleAutoriConsep);}

			this.isVisibilidadFK_IdEstadoDetalleAutoriConsep=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoDetalleAutoriConsep) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdProductoDetalleAutoriConsep);}

			this.isVisibilidadFK_IdUnidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdUnidadDetalleAutoriConsep);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdAutoriConsep=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdAutoriConsep) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdAutoriConsepDetalleAutoriConsep);}

			this.isVisibilidadFK_IdEstadoDetalleAutoriConsep=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdEstadoDetalleAutoriConsep) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdProductoDetalleAutoriConsep);}

			this.isVisibilidadFK_IdUnidad=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdUnidadDetalleAutoriConsep);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdAutoriConsep=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdAutoriConsep) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdAutoriConsepDetalleAutoriConsep);}

			this.isVisibilidadFK_IdEstadoDetalleAutoriConsep=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdEstadoDetalleAutoriConsep) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);}

			this.isVisibilidadFK_IdProducto=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdProductoDetalleAutoriConsep);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdUnidadDetalleAutoriConsep);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoDetalleAutoriConsep(Boolean isParaEstadoDetalleAutoriConsep){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoDetalleAutoriConsepNegation=!isParaEstadoDetalleAutoriConsep;

			this.isVisibilidadFK_IdAutoriConsep=isParaEstadoDetalleAutoriConsepNegation;
			if(!this.isVisibilidadFK_IdAutoriConsep) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdAutoriConsepDetalleAutoriConsep);}

			this.isVisibilidadFK_IdEstadoDetalleAutoriConsep=isParaEstadoDetalleAutoriConsep;
			if(!this.isVisibilidadFK_IdEstadoDetalleAutoriConsep) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);}

			this.isVisibilidadFK_IdProducto=isParaEstadoDetalleAutoriConsepNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdProductoDetalleAutoriConsep);}

			this.isVisibilidadFK_IdUnidad=isParaEstadoDetalleAutoriConsepNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(jPanelFK_IdUnidadDetalleAutoriConsep);}
		}
		
	}
	
	
	
	

	public String registrarSesionDetalleAutoriConsepParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(detalleautoriconsepSessionBean==null) {
				detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(detalleautoriconsepSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.detalleautoriconsepFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(DetalleAutoriConsepConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleAutoriConsep(true);
			//productoSessionBean.setlidDetalleAutoriConsepActual(this.idDetalleAutoriConsepActual);

			detalleautoriconsepSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleAutoriConsep(true);
			detalleautoriconsepSessionBean.setlIdDetalleAutoriConsepActualForeignKey(this.idDetalleAutoriConsepActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleAutoriConsepSessionBean detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
		
		if(this.detalleautoriconsepSessionBean==null) {
			this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
		}
		
		this.detalleautoriconsepSessionBean.setsUltimaBusquedaDetalleAutoriConsep(this.getsAccionBusqueda());
		this.detalleautoriconsepSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detalleautoriconsepSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAutoriConsep")) {
			detalleautoriconsepSessionBean.setid_autori_consep(this.getid_autori_consepFK_IdAutoriConsep());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detalleautoriconsepSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoDetalleAutoriConsep")) {
			detalleautoriconsepSessionBean.setid_estado_detalle_autori_consep(this.getid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			detalleautoriconsepSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			detalleautoriconsepSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleAutoriConsepSessionBean detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
		
		if(this.detalleautoriconsepSessionBean==null) {
			this.detalleautoriconsepSessionBean=new DetalleAutoriConsepSessionBean();
		}
		
		if(this.detalleautoriconsepSessionBean.getsUltimaBusquedaDetalleAutoriConsep()!=null&&!this.detalleautoriconsepSessionBean.getsUltimaBusquedaDetalleAutoriConsep().equals("")) {
			this.setsAccionBusqueda(detalleautoriconsepSessionBean.getsUltimaBusquedaDetalleAutoriConsep());
			this.setiNumeroPaginacion(detalleautoriconsepSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detalleautoriconsepSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAutoriConsep")) {
				this.setid_autori_consepFK_IdAutoriConsep(detalleautoriconsepSessionBean.getid_autori_consep());
				detalleautoriconsepSessionBean.setid_autori_consep(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detalleautoriconsepSessionBean.getid_empresa());
				detalleautoriconsepSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoDetalleAutoriConsep")) {
				this.setid_estado_detalle_autori_consepFK_IdEstadoDetalleAutoriConsep(detalleautoriconsepSessionBean.getid_estado_detalle_autori_consep());
				detalleautoriconsepSessionBean.setid_estado_detalle_autori_consep(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(detalleautoriconsepSessionBean.getid_producto());
				detalleautoriconsepSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(detalleautoriconsepSessionBean.getid_unidad());
				detalleautoriconsepSessionBean.setid_unidad(-1L);
			}
		}
		
		this.detalleautoriconsepSessionBean.setsUltimaBusquedaDetalleAutoriConsep("");
		this.detalleautoriconsepSessionBean.setiNumeroPaginacion(DetalleAutoriConsepConstantesFunciones.INUMEROPAGINACION);
		this.detalleautoriconsepSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleAutoriConsep(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleAutoriConsep() {
		this.updateBorderResaltarBusquedasFormularioDetalleAutoriConsep();
		this.updateVisibilidadBusquedasFormularioDetalleAutoriConsep();
		this.updateHabilitarBusquedasFormularioDetalleAutoriConsep();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleAutoriConsep() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponents().length>0) {
	

		if(this.detalleautoriconsepConstantesFunciones.resaltarFK_IdAutoriConsepDetalleAutoriConsep!=null) {
			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdAutoriConsepDetalleAutoriConsep);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);
				jPanel.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarFK_IdAutoriConsepDetalleAutoriConsep);
			}
		}

		if(this.detalleautoriconsepConstantesFunciones.resaltarFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep!=null) {
			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);
				jPanel.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);
			}
		}

		if(this.detalleautoriconsepConstantesFunciones.resaltarFK_IdProductoDetalleAutoriConsep!=null) {
			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdProductoDetalleAutoriConsep);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);
				jPanel.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarFK_IdProductoDetalleAutoriConsep);
			}
		}

		if(this.detalleautoriconsepConstantesFunciones.resaltarFK_IdUnidadDetalleAutoriConsep!=null) {
			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdUnidadDetalleAutoriConsep);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);
				jPanel.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarFK_IdUnidadDetalleAutoriConsep);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleAutoriConsep() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdAutoriConsepDetalleAutoriConsep);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarFK_IdAutoriConsepDetalleAutoriConsep);
			if(!this.detalleautoriconsepConstantesFunciones.mostrarFK_IdAutoriConsepDetalleAutoriConsep && index>-1) {
				this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);
			if(!this.detalleautoriconsepConstantesFunciones.mostrarFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep && index>-1) {
				this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdProductoDetalleAutoriConsep);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarFK_IdProductoDetalleAutoriConsep);
			if(!this.detalleautoriconsepConstantesFunciones.mostrarFK_IdProductoDetalleAutoriConsep && index>-1) {
				this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdUnidadDetalleAutoriConsep);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarFK_IdUnidadDetalleAutoriConsep);
			if(!this.detalleautoriconsepConstantesFunciones.mostrarFK_IdUnidadDetalleAutoriConsep && index>-1) {
				this.jTabbedPaneBusquedasDetalleAutoriConsep.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleAutoriConsep() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdAutoriConsepDetalleAutoriConsep);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleautoriconsepConstantesFunciones.activarFK_IdAutoriConsepDetalleAutoriConsep);
				this.jTabbedPaneBusquedasDetalleAutoriConsep.setEnabledAt(index,this.detalleautoriconsepConstantesFunciones.activarFK_IdAutoriConsepDetalleAutoriConsep);
			}

			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleautoriconsepConstantesFunciones.activarFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);
				this.jTabbedPaneBusquedasDetalleAutoriConsep.setEnabledAt(index,this.detalleautoriconsepConstantesFunciones.activarFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);
			}

			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdProductoDetalleAutoriConsep);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleautoriconsepConstantesFunciones.activarFK_IdProductoDetalleAutoriConsep);
				this.jTabbedPaneBusquedasDetalleAutoriConsep.setEnabledAt(index,this.detalleautoriconsepConstantesFunciones.activarFK_IdProductoDetalleAutoriConsep);
			}

			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdUnidadDetalleAutoriConsep);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleautoriconsepConstantesFunciones.activarFK_IdUnidadDetalleAutoriConsep);
				this.jTabbedPaneBusquedasDetalleAutoriConsep.setEnabledAt(index,this.detalleautoriconsepConstantesFunciones.activarFK_IdUnidadDetalleAutoriConsep);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleAutoriConsep(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAutoriConsep")) {
			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdAutoriConsepDetalleAutoriConsep);

			this.jTabbedPaneBusquedasDetalleAutoriConsep.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);

			this.detalleautoriconsepConstantesFunciones.setResaltarFK_IdAutoriConsepDetalleAutoriConsep(resaltar);

			jPanel.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarFK_IdAutoriConsepDetalleAutoriConsep);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoDetalleAutoriConsep")) {
			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);

			this.jTabbedPaneBusquedasDetalleAutoriConsep.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);

			this.detalleautoriconsepConstantesFunciones.setResaltarFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep(resaltar);

			jPanel.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarFK_IdEstadoDetalleAutoriConsepDetalleAutoriConsep);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdProductoDetalleAutoriConsep);

			this.jTabbedPaneBusquedasDetalleAutoriConsep.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);

			this.detalleautoriconsepConstantesFunciones.setResaltarFK_IdProductoDetalleAutoriConsep(resaltar);

			jPanel.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarFK_IdProductoDetalleAutoriConsep);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasDetalleAutoriConsep.indexOfComponent(this.jPanelFK_IdUnidadDetalleAutoriConsep);

			this.jTabbedPaneBusquedasDetalleAutoriConsep.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleAutoriConsep.getComponent(index);

			this.detalleautoriconsepConstantesFunciones.setResaltarFK_IdUnidadDetalleAutoriConsep(resaltar);

			jPanel.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarFK_IdUnidadDetalleAutoriConsep);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleAutoriConsep.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleAutoriConsep() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleAutoriConsep();
		this.updateVisibilidadResaltarControlesFormularioDetalleAutoriConsep();
		this.updateHabilitarResaltarControlesFormularioDetalleAutoriConsep();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleAutoriConsep() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detalleautoriconsepConstantesFunciones.resaltaridDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelidDetalleAutoriConsep.setBorder(this.detalleautoriconsepConstantesFunciones.resaltaridDetalleAutoriConsep);}
		if(this.detalleautoriconsepConstantesFunciones.resaltarid_autori_consepDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarid_autori_consepDetalleAutoriConsep);}
		if(this.detalleautoriconsepConstantesFunciones.resaltarid_empresaDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarid_empresaDetalleAutoriConsep);}
		if(this.detalleautoriconsepConstantesFunciones.resaltarid_productoDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarid_productoDetalleAutoriConsep);}
		if(this.detalleautoriconsepConstantesFunciones.resaltarid_unidadDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarid_unidadDetalleAutoriConsep);}
		if(this.detalleautoriconsepConstantesFunciones.resaltarcantidad_anioDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_anioDetalleAutoriConsep.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarcantidad_anioDetalleAutoriConsep);}
		if(this.detalleautoriconsepConstantesFunciones.resaltarcantidad_saldoDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_saldoDetalleAutoriConsep.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarcantidad_saldoDetalleAutoriConsep);}
		if(this.detalleautoriconsepConstantesFunciones.resaltarid_estado_detalle_autori_consepDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarid_estado_detalle_autori_consepDetalleAutoriConsep);}
		if(this.detalleautoriconsepConstantesFunciones.resaltarnombreDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldnombreDetalleAutoriConsep.setBorder(this.detalleautoriconsepConstantesFunciones.resaltarnombreDetalleAutoriConsep);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleAutoriConsep() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
	
		//this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelidDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostraridDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jPanelidDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostraridDetalleAutoriConsep);
		//this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarid_autori_consepDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jPanelid_autori_consepDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarid_autori_consepDetalleAutoriConsep);
		//this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarid_empresaDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jPanelid_empresaDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarid_empresaDetalleAutoriConsep);
		//this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarid_productoDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jPanelid_productoDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarid_productoDetalleAutoriConsep);
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_productoDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarid_productoDetalleAutoriConsep);
		//this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarid_unidadDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jPanelid_unidadDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarid_unidadDetalleAutoriConsep);
		//this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_anioDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarcantidad_anioDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jPanelcantidad_anioDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarcantidad_anioDetalleAutoriConsep);
		//this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_saldoDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarcantidad_saldoDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jPanelcantidad_saldoDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarcantidad_saldoDetalleAutoriConsep);
		//this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarid_estado_detalle_autori_consepDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jPanelid_estado_detalle_autori_consepDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarid_estado_detalle_autori_consepDetalleAutoriConsep);
		//this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldnombreDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarnombreDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jPanelnombreDetalleAutoriConsep.setVisible(this.detalleautoriconsepConstantesFunciones.mostrarnombreDetalleAutoriConsep);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleAutoriConsep() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleAutoriConsep!=null) {
	
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jLabelidDetalleAutoriConsep.setEnabled(this.detalleautoriconsepConstantesFunciones.activaridDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_autori_consepDetalleAutoriConsep.setEnabled(this.detalleautoriconsepConstantesFunciones.activarid_autori_consepDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_empresaDetalleAutoriConsep.setEnabled(this.detalleautoriconsepConstantesFunciones.activarid_empresaDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_productoDetalleAutoriConsep.setEnabled(this.detalleautoriconsepConstantesFunciones.activarid_productoDetalleAutoriConsep);
			this.jInternalFrameDetalleFormDetalleAutoriConsep.jButtonid_productoDetalleAutoriConsep.setEnabled(this.detalleautoriconsepConstantesFunciones.activarid_productoDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_unidadDetalleAutoriConsep.setEnabled(this.detalleautoriconsepConstantesFunciones.activarid_unidadDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_anioDetalleAutoriConsep.setEnabled(this.detalleautoriconsepConstantesFunciones.activarcantidad_anioDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldcantidad_saldoDetalleAutoriConsep.setEnabled(this.detalleautoriconsepConstantesFunciones.activarcantidad_saldoDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jComboBoxid_estado_detalle_autori_consepDetalleAutoriConsep.setEnabled(this.detalleautoriconsepConstantesFunciones.activarid_estado_detalle_autori_consepDetalleAutoriConsep);
		this.jInternalFrameDetalleFormDetalleAutoriConsep.jTextFieldnombreDetalleAutoriConsep.setEnabled(this.detalleautoriconsepConstantesFunciones.activarnombreDetalleAutoriConsep);
		}
	}
	
		
}